package com.bytedance.common.a.d;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public final class a {
    static {
        Covode.recordClassIndex(15762);
    }

    private static void a(final InputStream inputStream) {
        com.bytedance.common.a.b.a.f26699b.execute(new Runnable() {
            /* class com.bytedance.common.a.d.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15763);
            }

            public final void run() {
                MethodCollector.i(4710);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                do {
                    try {
                    } catch (IOException unused) {
                        bufferedReader.close();
                        MethodCollector.o(4710);
                        return;
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        MethodCollector.o(4710);
                        throw th;
                    }
                } while (bufferedReader.readLine() != null);
                try {
                    bufferedReader.close();
                    MethodCollector.o(4710);
                } catch (IOException e3) {
                    e3.printStackTrace();
                    MethodCollector.o(4710);
                }
            }
        });
    }

    public static boolean a(String[] strArr) {
        if (strArr.length <= 0) {
            return false;
        }
        SystemClock.uptimeMillis();
        try {
            Process exec = Runtime.getRuntime().exec(strArr);
            InputStream errorStream = exec.getErrorStream();
            InputStream inputStream = exec.getInputStream();
            a(errorStream);
            a(inputStream);
            if (exec.waitFor() != 0) {
                Arrays.toString(strArr);
                return false;
            }
            SystemClock.uptimeMillis();
            return true;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        } catch (InterruptedException e3) {
            e3.printStackTrace();
            return false;
        } finally {
            SystemClock.uptimeMillis();
        }
    }
}
