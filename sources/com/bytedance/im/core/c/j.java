package com.bytedance.im.core.c;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.b;
import com.bytedance.im.core.a.d;
import h.f.b.l;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f37649a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public static Runnable f37650b = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final j f37651c = new j();

    public static final class a implements Runnable {
        static {
            Covode.recordClassIndex(22644);
        }

        a() {
        }

        public final void run() {
            i a2 = i.a().a("imsdk_ws_connection_survival").a("is_background", Boolean.valueOf(f.f37629a));
            d a3 = d.a();
            l.a((Object) a3, "");
            b bVar = a3.f37562b;
            l.a((Object) bVar, "");
            i a4 = a2.a("is_connected", Boolean.valueOf(bVar.i()));
            d a5 = d.a();
            l.a((Object) a5, "");
            b bVar2 = a5.f37562b;
            l.a((Object) bVar2, "");
            a4.a("net_connected", Boolean.valueOf(bVar2.e())).b();
            if (com.bytedance.im.core.internal.a.o() > 0) {
                j.f37649a.postDelayed(this, (long) (com.bytedance.im.core.internal.a.o() * 1000));
            }
        }
    }

    private j() {
    }

    static {
        Covode.recordClassIndex(22643);
    }
}
