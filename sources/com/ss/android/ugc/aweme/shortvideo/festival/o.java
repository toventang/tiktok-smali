package com.ss.android.ugc.aweme.shortvideo.festival;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.utils.i;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class o {
    static {
        Covode.recordClassIndex(84261);
    }

    public static final List<m> a(String str) {
        int parseInt;
        if (!i.a(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = new File(str).listFiles();
        for (File file : listFiles) {
            l.b(file, "");
            if (!file.isHidden()) {
                String name = file.getName();
                l.b(name, "");
                if (p.b(name, "dynamic_watermark_", false)) {
                    String path = file.getPath();
                    l.b(path, "");
                    if (p.c(path, ".png", false)) {
                        String name2 = file.getName();
                        l.b(name2, "");
                        String h2 = p.h(p.i(name2, "dynamic_watermark_"), ".png");
                        if (p.e(h2) == null) {
                            parseInt = 0;
                        } else {
                            parseInt = Integer.parseInt(h2);
                        }
                        String path2 = file.getPath();
                        l.b(path2, "");
                        arrayList.add(new m(parseInt, path2));
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            n.a((List) arrayList, (Comparator) new a());
        }
        return arrayList;
    }

    public static final class a<T> implements Comparator {
        static {
            Covode.recordClassIndex(84262);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Integer.valueOf(t.f128508a), Integer.valueOf(t2.f128508a));
        }
    }
}
