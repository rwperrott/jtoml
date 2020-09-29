package me.grison.jtoml;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 * Toml getter interface.
 *
 * @author <a href="mailto:a.grison@gmail.com">$Author: Alexandre Grison$</a>
 */
@SuppressWarnings("unused")
public interface Getter {
    /**
     * Get the object.
     * @param key the key where the object is located
     * @return the object located at the given key.
     */
    default Object get(String key) {
        return get(key, null);
    }

    /**
     * Get the object.
     * @param key the key where the object is located
     * @return the object located at the given key.
     */
    Object get(String key, Object defaultValue);

    /**
     * Get the string.
     * @param key the key where the object is located
     * @return the string located at the given key.
     */
    default String getString(String key) {
        return getString(key, null);
    }

    /**
     * Get the string.
     * @param key the key where the object is located
     * @return the string located at the given key.
     */
    String getString(String key, String defaultValue);

    /**
     * Get the Long value.
     * @param key the key where the object is located
     * @return the long located at the given key.
     */
    default Long getLong(String key) {
        return getLong(key, null);
    }

    /**
     * Get the Long value.
     * @param key the key where the object is located
     * @return the long located at the given key.
     */
    Long getLong(String key, Long defaultValue);

    /**
     * Get the double value.
     * @param key the key where the object is located
     * @return the float located at the given key.
     */
    default Double getDouble(String key) {
        return getDouble(key, null);
    }

    /**
     * Get the double value.
     * @param key the key where the object is located
     * @return the float located at the given key.
     */
    Double getDouble(String key, Double defaultValue);

    /**
     * Get the date (as Calendar)
     * @param key the key where the object is located
     * @return the date located at the given key.
     */
    default Calendar getDate(String key) {
        return getDate(key, null);
    }

    /**
     * Get the date (as Calendar)
     * @param key the key where the object is located
     * @return the date located at the given key.
     */
    Calendar getDate(String key, Calendar defaultValue);

    /**
     * Get the list.
     * @param key the key where the object is located
     * @return the list located at the given key.
     */
    default List<Object> getList(String key) {
        return getList(key, null);
    }

    /**
     * Get the list.
     * @param key the key where the object is located
     * @return the list located at the given key.
     */
    List<Object> getList(String key, List<Object> defaultValue);

    /**
     * Get a boolean.
     * @param key the key where the object is located
     * @return the boolean located at the given key.
     */
    default Boolean getBoolean(String key) {
        return getBoolean(key, null);
    }

    /**
     * Get a boolean.
     * @param key the key where the object is located
     * @return the boolean located at the given key.
     */
    Boolean getBoolean(String key, Boolean defaultValue);

    /**
     * Get a Map.
     * @param key the key where the object is located
     * @return the map located at the given key.
     */
    default Map<String, Object> getMap(String key) {
        return getMap(key, null);
    }

    /**
     * Get a Map.
     * @param key the key where the object is located
     * @return the map located at the given key.
     */
    Map<String, Object> getMap(String key, Map<String, Object> defaultValue);

    /**
     * Get an object of a specific class.
     * @param <T> the type
     * @param key the key where the object is located
     * @param clazz the class of the object
     * @return the object located at the given key.
     */
    <T> T getAs(String key, Class<T> clazz);
}
