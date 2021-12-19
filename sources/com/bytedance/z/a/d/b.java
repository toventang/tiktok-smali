package com.bytedance.z.a.d;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public final class b {

    public interface a {
        static {
            Covode.recordClassIndex(28277);
        }

        boolean a(String str);
    }

    static {
        Covode.recordClassIndex(28276);
    }

    public static void a(BufferedReader bufferedReader) {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (Exception e2) {
                Log.getStackTraceString(e2);
            }
        }
    }

    public static BufferedReader a(File file) {
        BufferedReader bufferedReader = null;
        if (file == null || !file.exists() || !file.canRead()) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file), 10000);
            return bufferedReader;
        } catch (Exception e2) {
            Log.getStackTraceString(e2);
            return bufferedReader;
        }
    }

    public static void a(String str, a aVar) {
        if (str != null) {
            a(new File(str), aVar);
        }
    }

    private static void a(File file, a aVar) {
        MethodCollector.i(4809);
        if (aVar == null) {
            MethodCollector.o(4809);
            return;
        }
        BufferedReader a2 = a(file);
        if (a2 == null) {
            MethodCollector.o(4809);
            return;
        }
        while (true) {
            try {
                String readLine = a2.readLine();
                if (readLine == null || !aVar.a(readLine)) {
                    break;
                }
            } catch (IOException e2) {
                Log.getStackTraceString(e2);
            }
        }
        a(a2);
        MethodCollector.o(4809);
    }
}
