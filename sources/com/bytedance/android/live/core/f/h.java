package com.bytedance.android.live.core.f;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.a.a.c;
import com.facebook.drawee.a.a.e;
import com.facebook.imagepipeline.j.f;
import h.f.b.l;

public final class h {

    /* renamed from: i  reason: collision with root package name */
    public static final a f9066i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public i f9067a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9068b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9069c;

    /* renamed from: d  reason: collision with root package name */
    public int f9070d = 1;

    /* renamed from: e  reason: collision with root package name */
    public int f9071e;

    /* renamed from: f  reason: collision with root package name */
    public long f9072f = -1;

    /* renamed from: g  reason: collision with root package name */
    public long f9073g = -1;

    /* renamed from: h  reason: collision with root package name */
    public boolean f9074h;

    /* renamed from: j  reason: collision with root package name */
    private HSImageView f9075j;

    /* renamed from: k  reason: collision with root package name */
    private String f9076k = "";

    /* renamed from: l  reason: collision with root package name */
    private String f9077l = "";

    /* renamed from: m  reason: collision with root package name */
    private String f9078m = "";

    static {
        Covode.recordClassIndex(4641);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4642);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        if (this.f9075j != null) {
            if (!TextUtils.isEmpty(this.f9076k) && !TextUtils.isEmpty(this.f9077l)) {
                this.f9078m = HSAnimImageView.f9268i.a(this.f9076k, this.f9077l, this.f9069c);
            }
            if (!TextUtils.isEmpty(this.f9078m)) {
                e a2 = c.b().b(Uri.parse(this.f9078m));
                a2.f47322j = this.f9068b;
                a2.f47319g = new b(this);
                com.facebook.drawee.c.a c2 = a2.e();
                HSImageView hSImageView = this.f9075j;
                if (hSImageView != null) {
                    hSImageView.setController(c2);
                }
            }
        }
    }

    public static final class b extends com.facebook.drawee.c.c<f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f9079a;

        static {
            Covode.recordClassIndex(4643);
        }

        public static final class a extends com.facebook.fresco.animation.c.c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f9080a;

            static {
                Covode.recordClassIndex(4644);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(b bVar) {
                this.f9080a = bVar;
            }

            @Override // com.facebook.fresco.animation.c.b, com.facebook.fresco.animation.c.c
            public final void b(com.facebook.fresco.animation.c.a aVar) {
                l.d(aVar, "");
                i iVar = this.f9080a.f9079a.f9067a;
                if (iVar != null) {
                    iVar.a(aVar);
                }
            }

            @Override // com.facebook.fresco.animation.c.b, com.facebook.fresco.animation.c.c
            public final void c(com.facebook.fresco.animation.c.a aVar) {
                this.f9080a.f9079a.f9071e++;
                if (this.f9080a.f9079a.f9071e >= this.f9080a.f9079a.f9070d) {
                    aVar.stop();
                }
            }

            @Override // com.facebook.fresco.animation.c.b, com.facebook.fresco.animation.c.c
            public final void a(com.facebook.fresco.animation.c.a aVar) {
                l.d(aVar, "");
                this.f9080a.f9079a.f9071e = 0;
                this.f9080a.f9079a.f9073g = System.currentTimeMillis();
                if (this.f9080a.f9079a.f9067a != null) {
                    l.d(aVar, "");
                }
            }

            @Override // com.facebook.fresco.animation.c.b, com.facebook.fresco.animation.c.c
            public final void a(com.facebook.fresco.animation.c.a aVar, int i2) {
                super.a(aVar, i2);
                if (!(this.f9080a.f9079a.f9067a == null || aVar == null)) {
                    aVar.c();
                }
                if (this.f9080a.f9079a.f9072f > 0 && System.currentTimeMillis() - this.f9080a.f9079a.f9073g >= this.f9080a.f9079a.f9072f && !this.f9080a.f9079a.f9074h && aVar != null) {
                    aVar.stop();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(h hVar) {
            this.f9079a = hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
            l.d(str, "");
            if (animatable instanceof com.facebook.fresco.animation.c.a) {
                if (this.f9079a.f9070d > 1) {
                    com.facebook.fresco.animation.c.a aVar = (com.facebook.fresco.animation.c.a) animatable;
                    aVar.a(new u(aVar.f47564d, this.f9079a.f9070d));
                } else if (this.f9079a.f9072f > 0) {
                    com.facebook.fresco.animation.c.a aVar2 = (com.facebook.fresco.animation.c.a) animatable;
                    long b2 = aVar2.b();
                    h hVar = this.f9079a;
                    hVar.f9070d = (int) (((hVar.f9072f + b2) - 1) / b2);
                    aVar2.a(new u(aVar2.f47564d, this.f9079a.f9070d));
                }
                ((com.facebook.fresco.animation.c.a) animatable).a(new a(this));
            }
        }
    }

    public final h a(i iVar) {
        l.d(iVar, "");
        this.f9067a = iVar;
        return this;
    }

    public final h b(String str) {
        l.d(str, "");
        this.f9077l = str;
        return this;
    }

    public final h a(HSImageView hSImageView) {
        l.d(hSImageView, "");
        this.f9075j = hSImageView;
        return this;
    }

    public final h a(String str) {
        l.d(str, "");
        this.f9076k = str;
        return this;
    }
}
