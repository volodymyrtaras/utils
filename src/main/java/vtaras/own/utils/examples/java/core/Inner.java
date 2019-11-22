package vtaras.own.utils.examples.java.core;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Inner {

    class NestedInner {
        void whoAmI() {
            log.info("I am a nested inner class.");
        }
    }

    static class StaticInner {
        void whoAmI() {
            log.info("I am a static inner class.");
        }
    }

    void method() {
        class LocalInner {
            void whoAmI() {
                log.info("I am a local inner class.");
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.whoAmI();
    }

    static Inner.NestedInner anonymousClass = new Inner().new NestedInner() {
        @Override
        void whoAmI() {
            log.info("I am an anonymous inner class.");
        }
    };
}
