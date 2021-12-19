package com.bytedance.android.livesdk.ai;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f13756a;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f13757b;

    /* renamed from: c  reason: collision with root package name */
    final Runnable f13758c;

    /* renamed from: d  reason: collision with root package name */
    public int f13759d = 5;

    /* renamed from: e  reason: collision with root package name */
    public a f13760e;

    public interface a {
        static {
            Covode.recordClassIndex(7656);
        }

        void a();

        void a(int i2);

        void b(int i2);
    }

    static {
        Covode.recordClassIndex(7655);
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f13762a;

        static {
            Covode.recordClassIndex(7658);
        }

        c(d dVar) {
            this.f13762a = dVar;
        }

        public final void run() {
            this.f13762a.f13756a.postDelayed(this.f13762a.f13757b, 1000);
        }
    }

    public final void a() {
        this.f13760e.a(this.f13759d);
        this.f13756a.postDelayed(this.f13758c, 0);
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f13761a;

        static {
            Covode.recordClassIndex(7657);
        }

        b(d dVar) {
            this.f13761a = dVar;
        }

        public final void run() {
            if (this.f13761a.f13759d == 0) {
                this.f13761a.f13760e.a();
            } else if (this.f13761a.f13759d > 0) {
                d dVar = this.f13761a;
                dVar.f13759d--;
                d dVar2 = this.f13761a;
                dVar2.f13760e.b(dVar2.f13759d);
                dVar2.f13756a.postDelayed(dVar2.f13757b, 1000);
            }
        }
    }

    public d(a aVar) {
        l.d(aVar, "");
        this.f13760e = aVar;
        this.f13756a = new Handler(Looper.getMainLooper());
        this.f13757b = new b(this);
        this.f13758c = new c(this);
    }
}
