package com.bytedance.z.a.c;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.z.a.b.c.b;
import com.bytedance.z.a.d.a;
import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public final class f extends a {

    /* renamed from: b  reason: collision with root package name */
    private int f46302b = a.a();

    /* renamed from: c  reason: collision with root package name */
    private List<File> f46303c = new ArrayList();

    static {
        Covode.recordClassIndex(28267);
    }

    public f() {
        super("");
    }

    @Override // com.bytedance.z.a.c.a
    public final b a() {
        if (this.f46303c.isEmpty()) {
            for (int i2 = 0; i2 != this.f46302b; i2++) {
                this.f46303c.add(new File("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/stats/time_in_state"));
            }
        }
        this.f46299a = a(this.f46303c);
        return this.f46299a;
    }

    private static b a(List<File> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        b bVar = new b();
        for (File file : list) {
            LinkedHashMap<Long, Long> b2 = b(file);
            if (b2 != null) {
                bVar.f46281a.add(b2);
            }
        }
        return bVar;
    }

    private static LinkedHashMap<Long, Long> b(File file) {
        MethodCollector.i(957);
        BufferedReader a2 = com.bytedance.z.a.d.b.a(file);
        LinkedHashMap<Long, Long> linkedHashMap = null;
        if (a2 == null) {
            MethodCollector.o(957);
            return null;
        }
        while (true) {
            try {
                String readLine = a2.readLine();
                if (readLine == null || readLine.isEmpty()) {
                    break;
                }
                String[] split = readLine.split("\\s+");
                if (split.length <= 1) {
                    break;
                }
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                }
                linkedHashMap.put(Long.valueOf(Long.parseLong(split[0])), Long.valueOf(Long.parseLong(split[1]) * 10));
            } catch (Exception e2) {
                Log.getStackTraceString(e2);
            } catch (Throwable unused) {
            }
        }
        com.bytedance.z.a.d.b.a(a2);
        MethodCollector.o(957);
        return linkedHashMap;
    }
}
