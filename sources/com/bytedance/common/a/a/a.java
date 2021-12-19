package com.bytedance.common.a.a;

import com.bytedance.common.a.d.b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class a {
    static {
        Covode.recordClassIndex(15747);
    }

    public static boolean a() {
        int i2 = 0;
        do {
            long a2 = b.a(com.bytedance.common.a.a.d());
            ArrayList arrayList = new ArrayList();
            arrayList.add("cmd");
            arrayList.add("package");
            arrayList.add("compile");
            arrayList.add("-f");
            arrayList.add("-r");
            arrayList.add("bg-dexopt");
            arrayList.add(com.bytedance.common.a.a.b());
            com.bytedance.common.a.d.a.a((String[]) arrayList.toArray(new String[arrayList.size()]));
            if (b.a(com.bytedance.common.a.a.d()) > a2) {
                com.bytedance.common.a.a.d();
                return true;
            }
            i2++;
        } while (i2 < 2);
        return false;
    }
}
