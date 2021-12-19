package com.bytedance.ttnet.a;

import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static volatile e f44459a;

    static {
        Covode.recordClassIndex(27235);
    }

    public static e a() {
        MethodCollector.i(9344);
        if (f44459a == null) {
            synchronized (e.class) {
                try {
                    if (f44459a == null) {
                        f44459a = new e();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9344);
                    throw th;
                }
            }
        }
        e eVar = f44459a;
        MethodCollector.o(9344);
        return eVar;
    }

    static List<String> a(String str) {
        ArrayList arrayList = new ArrayList();
        if (m.a(str)) {
            return arrayList;
        }
        String[] split = str.split(",");
        for (String str2 : split) {
            if (!m.a(str2)) {
                arrayList.add(str2.trim());
            }
        }
        return arrayList;
    }

    static List<String> a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            String[] split = str.split(";");
            for (String str2 : split) {
                if (!m.a(str2)) {
                    arrayList.add(str2.trim());
                }
            }
        }
        return arrayList;
    }
}
