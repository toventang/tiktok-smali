package com.bytedance.android.livesdk.service.a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public HashSet<c> f21170a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f21171b;

    static {
        Covode.recordClassIndex(12492);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static d f21172a = new d((byte) 0);

        static {
            Covode.recordClassIndex(12493);
        }
    }

    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private c f21174b;

        static {
            Covode.recordClassIndex(12494);
        }

        public final void run() {
            if (this.f21174b != null) {
                d.this.f21170a.remove(this.f21174b);
            }
        }

        b(c cVar) {
            this.f21174b = cVar;
        }
    }

    private d() {
        this.f21170a = new HashSet<>();
        this.f21171b = new Handler(Looper.getMainLooper());
    }

    public enum c {
        GIFT_DIALOG,
        RECHARGE_DIALOG;

        static {
            Covode.recordClassIndex(12495);
        }
    }

    /* synthetic */ d(byte b2) {
        this();
    }

    public final boolean a(c cVar) {
        if (this.f21170a.contains(cVar)) {
            return false;
        }
        this.f21170a.add(cVar);
        this.f21171b.postDelayed(new b(cVar), 1000);
        return true;
    }
}
