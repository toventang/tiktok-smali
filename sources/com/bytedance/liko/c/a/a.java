package com.bytedance.liko.c.a;

import android.os.Build;
import android.system.Os;
import com.bytedance.covode.number.Covode;
import com.bytedance.liko.c.b;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f40085a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(24700);
    }

    public static List<String> a(File file) {
        l.c(file, "");
        if (!file.exists() || !file.isDirectory()) {
            return z.INSTANCE;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            ArrayList<File> arrayList = new ArrayList();
            for (File file2 : listFiles) {
                if (file2.exists()) {
                    arrayList.add(file2);
                }
            }
            for (File file3 : arrayList) {
                if (file3.exists()) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        try {
                            l.a((Object) file3, "");
                            String readlink = Os.readlink(file3.getPath());
                            l.a((Object) readlink, "");
                            linkedHashSet.add(readlink);
                        } catch (Throwable unused) {
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("readlink ");
                        l.a((Object) file3, "");
                        linkedHashSet.add(b.a(sb.append(file3.getPath()).toString()).get(0));
                    }
                }
            }
        }
        if (linkedHashSet.isEmpty()) {
            return z.INSTANCE;
        }
        return n.k(linkedHashSet);
    }
}
