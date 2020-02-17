package org.xichaun;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExcelUtil {
    private static int    hour;
    private static String path;
    @Value("${local.logpower}")
    public  void setPath(String path) {
        this.path = path;
    }

    @Value("${cnm}")
//    public void setPath(String path) {
//        ExcelUtil.path=path;
//    }

    public static String getPath() {
        return path;
    }
    public static int getHour() {
        return hour;
    }
    @Value("${local.hour}")
    public  void setHour(int hour) {
        ExcelUtil.hour = hour;
    }
}
