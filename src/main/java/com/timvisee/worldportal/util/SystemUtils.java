package com.timvisee.worldportal.util;

public class SystemUtils {

    /**
     * Get the current used Java version.
     *
     * @return Java version.
     */
    public static String getJavaVersion() {
        return System.getProperty("java.version");
    }

    /**
     * Get the current used Java architect value.
     * 32 or 64.
     *
     * @return Java arch value.
     */
    public static String getJavaArchValue() {
        return System.getProperty("sun.arch.data.model");
    }

    /**
     * Get the full architecture specification of the current OS.
     *
     * @return System architecture specification.
     */
    public static String getSystemArchFull() {
        return System.getProperty("os.arch");
    }

    /**
     * Get the system architecture number, such as 32 or 64.
     *
     * @return System architecture number.
     */
    public static int getSystemArchNumber() {
        return getSystemArchFull().contains("64") ? 64 : 32;
    }
}
