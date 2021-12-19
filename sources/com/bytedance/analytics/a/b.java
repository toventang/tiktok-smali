package com.bytedance.analytics.a;

import android.app.Activity;
import com.bytedance.analytics.page.j;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f6523a = new b();

    /* renamed from: b  reason: collision with root package name */
    static long f6524b;

    /* renamed from: c  reason: collision with root package name */
    public static final Map<Integer, Set<d>> f6525c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final Map<Integer, Map<String, c>> f6526d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private static long f6527e;

    /* renamed from: f  reason: collision with root package name */
    private static final HashSet<c> f6528f = new HashSet<>();

    private b() {
    }

    static {
        Covode.recordClassIndex(3140);
    }

    public static void b() {
        Activity activity;
        Map<String, c> map;
        WeakReference<Activity> weakReference = j.f6593b;
        if (!(weakReference == null || (activity = weakReference.get()) == null || (map = f6526d.get(Integer.valueOf(activity.hashCode()))) == null)) {
            for (c cVar : map.values()) {
                if (cVar.f6536g) {
                    cVar.a();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x015d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a() {
        /*
        // Method dump skipped, instructions count: 474
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.analytics.a.b.a():void");
    }

    private static void a(Map<String, c> map) {
        Collection<c> values = map.values();
        ArrayList<c> arrayList = new ArrayList();
        for (T t : values) {
            T t2 = t;
            if (!f6528f.contains(t2) && t2.f6532c == 1) {
                arrayList.add(t);
            }
        }
        for (c cVar : arrayList) {
            cVar.a();
        }
        f6528f.clear();
    }
}
