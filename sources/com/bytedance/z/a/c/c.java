package com.bytedance.z.a.c;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.z.a.d.b;
import java.io.BufferedReader;
import java.io.File;

public class c extends a {
    static {
        Covode.recordClassIndex(28264);
    }

    public c() {
        this("proc/self/stat");
    }

    public c(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.z.a.c.a
    public b a(File file) {
        return a(file, null);
    }

    private static b a(File file, com.bytedance.z.a.b.c.c cVar) {
        Exception e2;
        MethodCollector.i(3685);
        BufferedReader a2 = b.a(file);
        com.bytedance.z.a.b.c.c cVar2 = null;
        if (a2 == null) {
            MethodCollector.o(3685);
            return null;
        }
        try {
            String readLine = a2.readLine();
            if (readLine != null) {
                if (!readLine.isEmpty()) {
                    String[] split = readLine.split("\\s+");
                    if (split.length > 16) {
                        cVar2 = new com.bytedance.z.a.b.c.c();
                        try {
                            cVar2.f46286b = Integer.parseInt(split[0]);
                            cVar2.f46285a = split[1].substring(1, split[1].length() - 1);
                            cVar2.f46287c = (long) ((Integer.parseInt(split[13]) + Integer.parseInt(split[14]) + Integer.parseInt(split[15]) + Integer.parseInt(split[16])) * 10);
                        } catch (Exception e3) {
                            e2 = e3;
                            try {
                                Log.getStackTraceString(e2);
                                b.a(a2);
                                MethodCollector.o(3685);
                                return cVar2;
                            } catch (Throwable unused) {
                                cVar = cVar2;
                                b.a(a2);
                                MethodCollector.o(3685);
                                return cVar;
                            }
                        }
                    }
                }
            }
        } catch (Exception e4) {
            e2 = e4;
            cVar2 = cVar;
            Log.getStackTraceString(e2);
            b.a(a2);
            MethodCollector.o(3685);
            return cVar2;
        } catch (Throwable unused2) {
            b.a(a2);
            MethodCollector.o(3685);
            return cVar;
        }
        b.a(a2);
        MethodCollector.o(3685);
        return cVar2;
    }
}
