package com.ss.android.ttve.common;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Integer> f61055a;

    static {
        Covode.recordClassIndex(37605);
        HashMap hashMap = new HashMap();
        f61055a = hashMap;
        hashMap.put("sdm660", 120);
        f61055a.put("msm8994", 120);
        f61055a.put("sdm845", 240);
        f61055a.put("sm8150", 480);
    }

    public static String a() {
        MethodCollector.i(24);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            String str = "";
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                str = readLine;
            }
            if (str.contains("Hardware")) {
                String str2 = str.split(":\\s+", 2)[1];
                MethodCollector.o(24);
                return str2;
            }
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        String str3 = Build.HARDWARE;
        MethodCollector.o(24);
        return str3;
    }

    public static int a(String str) {
        if (f61055a.containsKey(str)) {
            return f61055a.get(str).intValue();
        }
        return 0;
    }
}
