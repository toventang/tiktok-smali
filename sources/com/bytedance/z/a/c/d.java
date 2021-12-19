package com.bytedance.z.a.c;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.z.a.b.c.e;
import com.bytedance.z.a.d.b;
import java.io.BufferedReader;
import java.io.File;

public final class d extends c {
    static {
        Covode.recordClassIndex(28265);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.z.a.c.c, com.bytedance.z.a.c.a
    public final b a(File file) {
        return a(file, new e());
    }

    public d(long j2) {
        super("proc/self/task/" + j2 + "/stat");
    }

    private static b a(File file, e eVar) {
        MethodCollector.i(3680);
        BufferedReader a2 = b.a(file);
        if (a2 == null) {
            MethodCollector.o(3680);
            return null;
        }
        try {
            String readLine = a2.readLine();
            if (readLine != null) {
                if (!readLine.isEmpty()) {
                    String[] split = readLine.split("\\s+");
                    if (split.length > 16) {
                        eVar.f46286b = Integer.parseInt(split[0]);
                        eVar.f46285a = split[1].substring(1, split[1].length() - 1);
                        eVar.f46287c = (long) ((Integer.parseInt(split[13]) + Integer.parseInt(split[14])) * 10);
                    }
                }
            }
        } catch (Exception e2) {
            Log.getStackTraceString(e2);
        } catch (Throwable unused) {
        }
        b.a(a2);
        MethodCollector.o(3680);
        return eVar;
    }
}
