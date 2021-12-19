package com.ss.android.ugc.asve.recorder.camera.a;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.f.a;
import com.ss.android.ugc.asve.f.f;
import com.ss.android.ugc.asve.recorder.camera.d;
import com.ss.android.ugc.asve.recorder.camera.e;
import com.ss.android.ugc.tools.c;
import com.ss.android.ugc.tools.utils.j;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f62199b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f62200c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f62201a;

    /* renamed from: d  reason: collision with root package name */
    public Context f62202d;

    /* renamed from: e  reason: collision with root package name */
    public int f62203e;

    /* renamed from: f  reason: collision with root package name */
    public d f62204f;

    /* renamed from: g  reason: collision with root package name */
    public e f62205g;

    /* renamed from: h  reason: collision with root package name */
    private int f62206h = -1;

    /* renamed from: i  reason: collision with root package name */
    private boolean f62207i;

    static {
        Covode.recordClassIndex(38233);
    }

    public final boolean a() {
        if (com.ss.android.ugc.asve.recorder.camera.b.f62211b) {
            return this.f62205g.a(this.f62202d, this.f62204f, 0);
        }
        int i2 = this.f62203e;
        if (i2 == 1 || i2 == 2 || i2 == 4) {
            return true;
        }
        return false;
    }

    public final void a(boolean z) {
        b(z);
        c(z);
    }

    public static boolean b(Context context) {
        if (a.C1354a.a(context).b() == 1) {
            return true;
        }
        return false;
    }

    public static boolean a(Context context) {
        if (a.C1354a.a(context).b() != 0) {
            return b(context);
        }
        a.C1354a.a(context).b(2);
        f62199b = false;
        f62200c = false;
        return false;
    }

    public final void b(boolean z) {
        int i2;
        f62200c = z;
        a a2 = a.C1354a.a(this.f62202d);
        if (z) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        a2.b(i2);
    }

    public final void c(final boolean z) {
        f.a("ACTION_NAME_SWITCH_SHAKE_FREE_MODE", "toState: ".concat(String.valueOf(z)));
        if (this.f62201a && a() && Build.VERSION.SDK_INT >= 23) {
            this.f62204f.b(z);
            d dVar = this.f62204f;
            dVar.b(dVar.d(), new com.ss.android.medialib.camera.a() {
                /* class com.ss.android.ugc.asve.recorder.camera.a.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(38234);
                }

                @Override // com.ss.android.medialib.camera.a
                public final void a(int i2) {
                    b.this.f62204f.d();
                    b.f62199b = z;
                }

                @Override // com.ss.android.medialib.camera.a
                public final void a(int i2, int i3, String str) {
                    b.this.f62204f.d();
                }
            }, null);
        }
    }

    public final void d(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (!a() || Build.VERSION.SDK_INT < 23) {
            a.C1354a.a(this.f62202d).b(2);
            f62199b = false;
            f62200c = false;
            return;
        }
        boolean a2 = a(this.f62202d);
        f62199b = a2;
        f62200c = a2;
        d dVar = this.f62204f;
        if (!a2 || !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        dVar.b(z2);
        j jVar = c.f149151f;
        StringBuilder sb = new StringBuilder("CameraAntiShakeV1 -> initShakeFreeMode: setEnableAntiShake(");
        if (a2 && z) {
            z3 = true;
        }
        jVar.a(sb.append(z3).append(")").toString());
    }

    public b(Context context, d dVar, int i2, boolean z, e eVar) {
        this.f62206h = i2;
        this.f62203e = i2 == -1 ? a.a(Build.MODEL) : i2;
        this.f62202d = context;
        this.f62201a = true;
        this.f62204f = dVar;
        this.f62207i = z;
        this.f62205g = eVar;
    }
}
