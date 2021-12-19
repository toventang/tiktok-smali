package com.bytedance.z.a.c;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.z.a.b.c.d;
import com.bytedance.z.a.d.b;
import java.io.BufferedReader;
import java.io.File;
import java.util.LinkedHashMap;

public final class e extends a {
    static {
        Covode.recordClassIndex(28266);
    }

    public e() {
        this("/proc/self/time_in_state");
    }

    private e(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.z.a.c.a
    public final b a(File file) {
        return b(file);
    }

    public e(int i2) {
        super("/proc/self/task/" + i2 + "/time_in_state");
    }

    private static b b(File file) {
        MethodCollector.i(3748);
        BufferedReader a2 = b.a(file);
        LinkedHashMap<Long, Long> linkedHashMap = null;
        if (a2 == null) {
            MethodCollector.o(3748);
            return null;
        }
        d dVar = new d();
        long j2 = 0;
        while (true) {
            try {
                String readLine = a2.readLine();
                if (readLine != null) {
                    if (!readLine.isEmpty() && !readLine.contains("cpu")) {
                        String[] split = readLine.split("\\s+");
                        if (split.length <= 1) {
                            break;
                        }
                        long parseLong = Long.parseLong(split[0]);
                        long parseLong2 = Long.parseLong(split[1]) * 10;
                        if (j2 == 0 || parseLong >= j2) {
                            if (linkedHashMap == null) {
                            }
                            linkedHashMap.put(Long.valueOf(parseLong), Long.valueOf(parseLong2));
                            j2 = parseLong;
                        } else {
                            dVar.a(linkedHashMap);
                        }
                        linkedHashMap = new LinkedHashMap<>();
                        linkedHashMap.put(Long.valueOf(parseLong), Long.valueOf(parseLong2));
                        j2 = parseLong;
                    }
                } else {
                    break;
                }
            } catch (Exception e2) {
                Log.getStackTraceString(e2);
            } catch (Throwable unused) {
            }
        }
        dVar.a(linkedHashMap);
        b.a(a2);
        MethodCollector.o(3748);
        return dVar;
    }
}
