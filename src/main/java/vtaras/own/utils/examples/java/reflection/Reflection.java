package vtaras.own.utils.examples.java.reflection;

import vtaras.own.utils.examples.java.patterns.singleton.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Reflection {

    public static void hackField() throws Exception {
        try {
            Singleton instance = hackClass();
            Field field = instance.getClass().getDeclaredField("name");
            field.setAccessible(true);
            field.set(instance, "hacked!");
            String name = (String) field.get(instance);
            System.out.println(name);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static Singleton hackClass() throws Exception {
        Singleton instanceOne = null;
        Singleton instanceTwo = null;
        try {
            Constructor[] constructors = Singleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instanceOne = (Singleton) constructor.newInstance();
                instanceTwo = (Singleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instanceOne;
    }
}
