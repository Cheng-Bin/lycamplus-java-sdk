package tv.lycam.utils;

import java.lang.reflect.Field;

/**
 * Created by chapin on 17/1/20.
 */
public class QueryUtil {

    private static StringBuilder builder = new StringBuilder();

    public static String format(Object object) {
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);
            try {
                String key = f.getName();
                Object value = String.valueOf(f.get(object));
                if (!"null".equals(value) && !"0".equals(value)) {
                    addToUri(key, value);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }

        return builder.toString();
    }



    private static void addToUri(String name, Object property) {
        if (builder.length() > 0) {
            builder.append("&");
        }
        builder.append(name).append("=").append(property);
    }

}
