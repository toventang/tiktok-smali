package com.bytedance.scene.ktx;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.j;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.w;
import h.h;
import h.k.i;
import h.z;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f42925a = {new w(ab.a(c.class, "scene_ktx_release"), "HANDLER", "getHANDLER()Landroid/os/Handler;")};

    /* renamed from: b  reason: collision with root package name */
    private static final h f42926b = h.i.a((h.f.a.a) a.f42927a);

    public static final Handler a() {
        return (Handler) f42926b.getValue();
    }

    static final class a extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f42927a = new a();

        static {
            Covode.recordClassIndex(26331);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static {
        Covode.recordClassIndex(26330);
    }

    public static final e a(j jVar) {
        l.c(jVar, "");
        return (e) jVar.f42913m;
    }

    public static final e b(j jVar) {
        l.c(jVar, "");
        Activity t = jVar.t();
        if (t != null) {
            return (e) t;
        }
        throw new h.w("null cannot be cast to non-null type");
    }

    static final class b implements com.bytedance.scene.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f42928a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Intent f42929b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f42930c = 1001;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f42931d;

        static {
            Covode.recordClassIndex(26332);
        }

        b(j jVar, Intent intent, h.f.a.m mVar) {
            this.f42928a = jVar;
            this.f42929b = intent;
            this.f42931d = mVar;
        }

        @Override // com.bytedance.scene.c.a
        public final void a(int i2, Intent intent) {
            this.f42931d.invoke(Integer.valueOf(i2), intent);
        }
    }

    public static final void a(j jVar, Runnable runnable) {
        l.c(jVar, "");
        l.c(runnable, "");
        androidx.lifecycle.i lifecycle = jVar.getLifecycle();
        l.a((Object) lifecycle, "");
        if (lifecycle.a() != i.b.DESTROYED) {
            a().post(runnable);
            jVar.getLifecycle().a(new SceneExtensionsKt$post$1(runnable));
        }
    }

    public static final void a(j jVar, Intent intent, h.f.a.m<? super Integer, ? super Intent, z> mVar) {
        l.c(jVar, "");
        l.c(intent, "");
        l.c(mVar, "");
        Activity activity = jVar.f42913m;
        if (activity != null) {
            com.bytedance.scene.a.a(activity, jVar, intent, new b(jVar, intent, mVar));
        }
    }

    public static final void a(j jVar, Runnable runnable, long j2) {
        l.c(jVar, "");
        l.c(runnable, "");
        androidx.lifecycle.i lifecycle = jVar.getLifecycle();
        l.a((Object) lifecycle, "");
        if (lifecycle.a() != i.b.DESTROYED) {
            a().postDelayed(runnable, j2);
            jVar.getLifecycle().a(new SceneExtensionsKt$postDelayed$1(runnable));
        }
    }
}
