package vtaras.own.utils.clipboard;

import lombok.extern.slf4j.Slf4j;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;

@Slf4j
public class ClipboardUtils {
    private Transferable transferable;
    private boolean fileExists;

    public ClipboardUtils() {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        transferable = clipboard.getContents(null);
        fileExists = false;
    }

    String getUnixStyleFilePath() {
        String filepath = "";
        if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
            Object object = null;

            try {
                object = transferable.getTransferData(DataFlavor.javaFileListFlavor);
            } catch (UnsupportedFlavorException e) {
                log.info("UnsupportedFlavorException is caused");
                e.printStackTrace();
            } catch (IOException e) {
                log.info("IOException is caused");
                e.printStackTrace();
            }

            if (object != null) {
                filepath = object
                        .toString()
                        .replace('\\', '/')
                        .replace("[", "")
                        .replace("]", "");
            }
        }

        if (!filepath.equals("")) {
            log.info("Clipboard is clear");
            fileExists = false;
        } else {
            log.info("Path was successfully received");
            fileExists = true;
        }

        return filepath;
    }

    File getFileFromClipboard() {
        return fileExists ? new File(getUnixStyleFilePath()) : null;
    }
}
