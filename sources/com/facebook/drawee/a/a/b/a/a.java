package com.facebook.drawee.a.a.b.a;

import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;
import com.facebook.common.time.b;
import com.facebook.drawee.a.a.b.g;
import com.facebook.drawee.a.a.b.h;
import com.facebook.drawee.c.c;
import com.facebook.imagepipeline.j.f;

public final class a extends c<f> {

    /* renamed from: a  reason: collision with root package name */
    private final b f47215a;

    /* renamed from: b  reason: collision with root package name */
    private final h f47216b;

    /* renamed from: c  reason: collision with root package name */
    private final g f47217c;

    static {
        Covode.recordClassIndex(28723);
    }

    private void a(long j2) {
        this.f47216b.a(false);
        this.f47216b.t = j2;
        this.f47217c.a(this.f47216b);
    }

    @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
    public final void onRelease(String str) {
        super.onRelease(str);
        long now = this.f47215a.now();
        int i2 = this.f47216b.q;
        if (!(i2 == 3 || i2 == 5)) {
            this.f47216b.f47256j = now;
            this.f47216b.f47247a = str;
            this.f47217c.a(this.f47216b, 4);
        }
        a(now);
    }

    @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
    public final void onFailure(String str, Throwable th) {
        long now = this.f47215a.now();
        this.f47216b.f47255i = now;
        this.f47216b.f47247a = str;
        this.f47217c.a(this.f47216b, 5);
        a(now);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
    @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
    public final /* synthetic */ void onIntermediateImageSet(String str, f fVar) {
        this.f47216b.f47253g = this.f47215a.now();
        this.f47216b.f47247a = str;
        this.f47216b.f47251e = fVar;
        this.f47217c.a(this.f47216b, 2);
    }

    @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
    public final void onSubmit(String str, Object obj) {
        long now = this.f47215a.now();
        this.f47216b.f47252f = now;
        this.f47216b.f47247a = str;
        this.f47216b.f47250d = obj;
        this.f47217c.a(this.f47216b, 0);
        this.f47216b.a(true);
        this.f47216b.s = now;
        this.f47217c.a(this.f47216b);
    }

    public a(b bVar, h hVar, g gVar) {
        this.f47215a = bVar;
        this.f47216b = hVar;
        this.f47217c = gVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
    @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
    public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
        long now = this.f47215a.now();
        this.f47216b.f47254h = now;
        this.f47216b.f47258l = now;
        this.f47216b.f47247a = str;
        this.f47216b.f47251e = fVar;
        this.f47217c.a(this.f47216b, 3);
    }
}
