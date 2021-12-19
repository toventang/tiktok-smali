package com.ss.android.ugc.aweme.trending.viewmodel;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.l;
import h.a.n;
import h.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f141205a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final p<l, Integer> f141206b = new p<>(null, -1);

    private e() {
    }

    static {
        Covode.recordClassIndex(92201);
    }

    public static p<l, Integer> a(String str, ArrayList<l> arrayList) {
        if (arrayList != null) {
            int i2 = 0;
            if (!(str == null || str.length() == 0)) {
                for (T t : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        n.a();
                    }
                    T t2 = t;
                    if (h.f.b.l.a((Object) str, (Object) t2.getEventId())) {
                        return new p<>(t2, Integer.valueOf(i2));
                    }
                    i2 = i3;
                }
                return f141206b;
            }
        }
        return f141206b;
    }

    public static l b(String str, ArrayList<l> arrayList) {
        if (!(arrayList == null || str == null || str.length() == 0)) {
            Iterator<l> it = arrayList.iterator();
            while (it.hasNext()) {
                l next = it.next();
                if (h.f.b.l.a((Object) str, (Object) next.getEventId())) {
                    return next;
                }
            }
        }
        return null;
    }

    public static int c(String str, ArrayList<l> arrayList) {
        if (arrayList == null) {
            return -1;
        }
        int i2 = 0;
        for (T t : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            if (h.f.b.l.a((Object) str, (Object) t.getEventId())) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public static boolean a(Aweme aweme, List<? extends Aweme> list) {
        h.f.b.l.d(aweme, "");
        h.f.b.l.d(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (h.f.b.l.a((Object) aweme.getAid(), (Object) it.next().getAid())) {
                aweme.getAid();
                return true;
            }
        }
        return false;
    }

    public static l d(String str, ArrayList<l> arrayList) {
        int i2;
        if (arrayList == null) {
            return null;
        }
        int i3 = 0;
        int i4 = -1;
        for (T t : arrayList) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                n.a();
            }
            if (h.f.b.l.a((Object) str, (Object) t.getEventId())) {
                i4 = i3;
            }
            i3 = i5;
        }
        arrayList.size();
        if (i4 != -1 && (i2 = i4 + 1) >= 0 && i2 < arrayList.size()) {
            return arrayList.get(i2);
        }
        return null;
    }
}
