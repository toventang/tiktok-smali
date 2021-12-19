package com.ss.android.ugc.aweme.tools.music.a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public g f140362a;

    /* renamed from: b  reason: collision with root package name */
    public a f140363b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f140364c;

    /* renamed from: d  reason: collision with root package name */
    public long f140365d = 100;

    /* renamed from: e  reason: collision with root package name */
    public final b f140366e;

    public interface a {
        static {
            Covode.recordClassIndex(91695);
        }
    }

    static {
        Covode.recordClassIndex(91694);
    }

    public final void b() {
        this.f140364c.removeCallbacksAndMessages(null);
    }

    public final void a() {
        this.f140364c.removeCallbacksAndMessages(null);
        this.f140364c.postDelayed(this.f140366e, this.f140365d);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<d> f140367a;

        /* renamed from: b  reason: collision with root package name */
        public final Handler f140368b;

        static {
            Covode.recordClassIndex(91696);
        }

        public final void run() {
            g gVar;
            d dVar = this.f140367a.get();
            if (dVar != null) {
                if (!(dVar.f140363b == null || (gVar = dVar.f140362a) == null)) {
                    gVar.k();
                }
                this.f140368b.postDelayed(this, dVar.f140365d);
            }
        }

        public b(d dVar, Handler handler) {
            l.d(dVar, "");
            l.d(handler, "");
            this.f140368b = handler;
            this.f140367a = new WeakReference<>(dVar);
        }
    }

    public d() {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f140364c = handler;
        this.f140366e = new b(this, handler);
    }
}
