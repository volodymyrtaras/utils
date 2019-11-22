package vtaras.own.utils.clipboard;

import lombok.extern.slf4j.Slf4j;

import java.io.File;

@Slf4j
public class App {
    public static void main(String[] args) {
        ClipboardUtils helper = new ClipboardUtils();

        String path = helper.getUnixStyleFilePath();
        log.info(path);

        File file = helper.getFileFromClipboard();
        log.info(String.valueOf(file.isFile()));
    }
}
