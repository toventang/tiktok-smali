package com.bytedance.scene;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.d.j;
import com.bytedance.scene.d.k;
import com.bytedance.scene.navigation.d;
import com.bytedance.scene.navigation.g;

public final class i {
    static {
        Covode.recordClassIndex(26317);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Bundle f42893a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f42894b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f42895c;

        /* renamed from: d  reason: collision with root package name */
        public int f42896d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f42897e;

        /* renamed from: f  reason: collision with root package name */
        public l f42898f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f42899g;

        /* renamed from: h  reason: collision with root package name */
        private final Activity f42900h;

        /* renamed from: i  reason: collision with root package name */
        private final Class<? extends j> f42901i;

        /* renamed from: j  reason: collision with root package name */
        private int f42902j;

        /* renamed from: k  reason: collision with root package name */
        private String f42903k;

        static {
            Covode.recordClassIndex(26318);
        }

        public final n a() {
            g gVar = new g(this.f42901i, this.f42893a);
            gVar.f43011c = this.f42894b;
            gVar.f43012d = this.f42895c;
            gVar.f43013e = this.f42902j;
            return i.a(this.f42900h, this.f42896d, gVar, this.f42898f, this.f42897e, this.f42903k, this.f42899g);
        }

        public final a a(String str) {
            this.f42903k = (String) k.a((Object) str, "Tag can't be null");
            return this;
        }

        private a(Activity activity, Class<? extends j> cls) {
            this.f42894b = true;
            this.f42895c = true;
            this.f42896d = 16908290;
            this.f42903k = "LifeCycleFragment";
            this.f42899g = true;
            this.f42900h = (Activity) k.a(activity, "Activity can't be null");
            this.f42901i = (Class) k.a(cls, "Root Scene class can't be null");
        }

        /* synthetic */ a(Activity activity, Class cls, byte b2) {
            this(activity, cls);
        }
    }

    public static a a(Activity activity, Class<? extends j> cls) {
        return new a(activity, cls, (byte) 0);
    }

    public static n a(Activity activity, g gVar) {
        return a(activity, 16908290, gVar, null, false, "LifeCycleFragment", true);
    }

    public static n a(Activity activity, int i2, g gVar, l lVar, boolean z, String str, boolean z2) {
        u a2;
        j.a();
        if (str != null) {
            e.a(activity, str);
            d dVar = (d) com.bytedance.scene.d.g.a(d.class, gVar.a());
            if (!k.a(activity)) {
                return new d(dVar);
            }
            dVar.f42953a = lVar;
            FragmentManager fragmentManager = activity.getFragmentManager();
            f fVar = (f) fragmentManager.findFragmentByTag(str);
            if (fVar != null && !z) {
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                beginTransaction.remove(fVar);
                k.a(fragmentManager, beginTransaction, z2);
                fVar = null;
            }
            b bVar = new b(activity);
            if (fVar != null) {
                a2 = u.a(activity, str, false, z2);
                fVar.f42797b = new p(i2, bVar, dVar, a2, z);
            } else {
                fVar = new f();
                FragmentTransaction beginTransaction2 = fragmentManager.beginTransaction();
                beginTransaction2.add(i2, fVar, str);
                dVar = dVar;
                a2 = u.a(activity, str, !z, z2);
                fVar.f42797b = new p(i2, bVar, dVar, a2, z);
                k.a(fragmentManager, beginTransaction2, z2);
            }
            return new g(activity, dVar, fVar, a2, z2);
        }
        throw new IllegalArgumentException("tag cant be null");
    }
}
