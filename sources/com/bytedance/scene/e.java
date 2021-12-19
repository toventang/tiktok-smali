package com.bytedance.scene;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.d.k;
import com.bytedance.scene.group.b;
import java.util.HashSet;
import java.util.WeakHashMap;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final WeakHashMap<Activity, HashSet<String>> f42775a = new WeakHashMap<>();

    static {
        Covode.recordClassIndex(26271);
    }

    static void b(Activity activity, String str) {
        f42775a.get(activity).remove(str);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f42781a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<? extends b> f42782b;

        /* renamed from: c  reason: collision with root package name */
        public Bundle f42783c;

        /* renamed from: d  reason: collision with root package name */
        public int f42784d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f42785e;

        /* renamed from: f  reason: collision with root package name */
        public l f42786f;

        /* renamed from: g  reason: collision with root package name */
        public String f42787g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f42788h;

        static {
            Covode.recordClassIndex(26273);
        }

        private a(Activity activity, Class<? extends b> cls) {
            this.f42784d = 16908290;
            this.f42787g = "LifeCycleFragment";
            this.f42788h = true;
            this.f42781a = (Activity) k.a(activity, "Activity can't be null");
            this.f42782b = (Class) k.a(cls, "Root Scene class can't be null");
        }

        public /* synthetic */ a(Activity activity, Class cls, byte b2) {
            this(activity, cls);
        }
    }

    public static void a(Activity activity, String str) {
        WeakHashMap<Activity, HashSet<String>> weakHashMap = f42775a;
        if (weakHashMap.get(activity) == null || !weakHashMap.get(activity).contains(str)) {
            HashSet<String> hashSet = weakHashMap.get(activity);
            if (hashSet == null) {
                hashSet = new HashSet<>();
                weakHashMap.put(activity, hashSet);
            }
            hashSet.add(str);
            return;
        }
        throw new IllegalArgumentException("tag duplicate, use another tag when invoke setupWithActivity for the second time in same Activity");
    }
}
