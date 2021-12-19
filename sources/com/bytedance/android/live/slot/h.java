package com.bytedance.android.live.slot;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class h implements ae {

    /* renamed from: b  reason: collision with root package name */
    public static final a f12773b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f12774a;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f12775c;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f12776d;

    /* renamed from: e  reason: collision with root package name */
    private final long f12777e;

    static {
        Covode.recordClassIndex(7102);
    }

    public abstract void a(String str);

    public static final class a {
        static {
            Covode.recordClassIndex(7103);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f12778a;

        static {
            Covode.recordClassIndex(7104);
        }

        b(h hVar) {
            this.f12778a = hVar;
        }

        public final void run() {
            this.f12778a.f12774a = true;
        }
    }

    public h() {
        this.f12777e = 300;
        this.f12774a = true;
        this.f12775c = new Handler(Looper.getMainLooper());
        this.f12776d = new b(this);
    }

    public /* synthetic */ h(byte b2) {
        this();
    }

    @Override // com.bytedance.android.live.slot.ae
    public final void a(View view, String str) {
        l.d(view, "");
        l.d(str, "");
        if (this.f12774a) {
            this.f12774a = false;
            this.f12775c.postDelayed(this.f12776d, this.f12777e);
            a(str);
        }
    }
}
