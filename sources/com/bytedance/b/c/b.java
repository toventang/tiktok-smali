package com.bytedance.b.c;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public final class b {
    static {
        Covode.recordClassIndex(15162);
    }

    public enum a {
        TOP_APP,
        FOREGROUND,
        BACKGROUND,
        UNKNOWN;

        static {
            Covode.recordClassIndex(15163);
        }
    }

    public static a a() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cgroup").getPath()), 100);
            String str = "";
            String str2 = str;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (readLine.contains(":cpuset:")) {
                    str = readLine;
                    break;
                } else if (readLine.contains(":cpu:")) {
                    str2 = readLine;
                }
            }
            bufferedReader.close();
            if (str2.isEmpty() && str.isEmpty()) {
                return a.UNKNOWN;
            }
            if (str.isEmpty()) {
                if (!str2.isEmpty()) {
                    if (str2.endsWith("/")) {
                        return a.FOREGROUND;
                    }
                    if (str2.endsWith("/bg_non_interactive") || str2.endsWith("/background")) {
                        return a.BACKGROUND;
                    }
                }
                return a.UNKNOWN;
            } else if (str.endsWith("/top-app")) {
                return a.TOP_APP;
            } else {
                if (str.endsWith("/foreground")) {
                    return a.FOREGROUND;
                }
                if (str.endsWith("/background") || str.endsWith("/")) {
                    return a.BACKGROUND;
                }
                return a.UNKNOWN;
            }
        } catch (Throwable unused) {
        }
    }
}
