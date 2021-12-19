package com.ss.android.ugc.aweme.sticker.presenter.handler;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.sticker.presenter.e;
import com.ss.android.ugc.aweme.sticker.presenter.g;
import com.ss.android.ugc.aweme.sticker.presenter.handler.o;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class StickerVideoStatusHandler extends b implements au, e {

    /* renamed from: f  reason: collision with root package name */
    public static final a f135328f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Effect f135329a;

    /* renamed from: b  reason: collision with root package name */
    public int f135330b = 2;

    /* renamed from: c  reason: collision with root package name */
    public boolean f135331c;

    /* renamed from: d  reason: collision with root package name */
    public final o f135332d;

    /* renamed from: e  reason: collision with root package name */
    public final g f135333e;

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f135334g;

    static {
        Covode.recordClassIndex(88417);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroyed();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88418);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a() {
        this.f135329a = null;
        c();
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroyed() {
        if (com.ss.android.ugc.aweme.sticker.p.g.h(this.f135329a)) {
            c();
        }
    }

    public static final class b implements o.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StickerVideoStatusHandler f135335a;

        static {
            Covode.recordClassIndex(88419);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f135336a;

            static {
                Covode.recordClassIndex(88420);
            }

            a(b bVar) {
                this.f135336a = bVar;
            }

            public final void run() {
                g gVar = this.f135336a.f135335a.f135333e;
                if (gVar != null && !gVar.a()) {
                    this.f135336a.f135335a.f135333e.b();
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.o.a
        public final void a() {
            new Handler(Looper.getMainLooper()).postDelayed(new a(this), 100);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(StickerVideoStatusHandler stickerVideoStatusHandler) {
            this.f135335a = stickerVideoStatusHandler;
        }
    }

    private final void c() {
        if (this.f135334g) {
            this.f135332d.a(false);
            this.f135332d.a((o.a) null);
            this.f135334g = false;
        }
    }

    public final void b() {
        if (com.ss.android.ugc.aweme.sticker.p.g.h(this.f135329a)) {
            this.f135331c = false;
            if (this.f135330b == 1) {
                this.f135332d.a();
            } else {
                this.f135332d.b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final boolean a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        l.d(aVar, "");
        return com.ss.android.ugc.aweme.sticker.p.g.h(this.f135329a);
    }

    public final void a(boolean z) {
        if (!z) {
            this.f135332d.b();
        } else if (this.f135330b == 1) {
            this.f135332d.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.b bVar, com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        l.d(bVar, "");
        l.d(aVar, "");
        this.f135329a = aVar.f135378a;
        this.f135334g = true;
        this.f135331c = false;
        this.f135330b = 2;
        this.f135332d.a(true);
        this.f135332d.a(new b(this));
    }

    public StickerVideoStatusHandler(m mVar, o oVar, g gVar) {
        l.d(mVar, "");
        l.d(oVar, "");
        this.f135332d = oVar;
        this.f135333e = gVar;
        mVar.getLifecycle().a(this);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.e
    public final void a(int i2, int i3, int i4, String str) {
        if (com.ss.android.ugc.aweme.sticker.p.g.h(this.f135329a) && i2 == 52) {
            this.f135330b = i3;
            if (i3 != 1) {
                if (i3 == 2) {
                    this.f135332d.b();
                } else if (i3 == 3) {
                    this.f135332d.a();
                }
            } else if (!this.f135331c) {
                g gVar = this.f135333e;
                if (gVar == null || !gVar.a() || !this.f135333e.c()) {
                    this.f135332d.a();
                }
            }
        }
    }
}
