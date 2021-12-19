package com.bytedance.lighten.loader;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.c.k;
import com.bytedance.lighten.a.o;
import com.bytedance.lighten.a.u;
import com.bytedance.lighten.loader.a;
import com.facebook.imagepipeline.j.a;
import com.facebook.imagepipeline.j.f;

public final class c extends com.facebook.drawee.c.c<f> {

    /* renamed from: a  reason: collision with root package name */
    public k f39962a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f39963b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f39964c;

    /* renamed from: d  reason: collision with root package name */
    private SmartImageView f39965d;

    /* renamed from: e  reason: collision with root package name */
    private Uri f39966e;

    /* renamed from: f  reason: collision with root package name */
    private a f39967f;

    /* renamed from: g  reason: collision with root package name */
    private u f39968g;

    static {
        Covode.recordClassIndex(24641);
    }

    c() {
    }

    @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
    public final void onRelease(String str) {
        super.onRelease(str);
        k kVar = this.f39962a;
        if (kVar != null) {
            kVar.a(this.f39966e);
        }
        this.f39963b = false;
        this.f39964c = false;
    }

    /* access modifiers changed from: package-private */
    public final void a(u uVar) {
        this.f39968g = uVar;
        this.f39965d = (SmartImageView) uVar.D;
        this.f39962a = uVar.F;
        if (uVar.N == null || uVar.N.a()) {
            this.f39966e = uVar.f39892a;
        } else {
            this.f39966e = Uri.parse(uVar.N.f39811a.get(0));
        }
    }

    @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
    public final void onFailure(String str, Throwable th) {
        k kVar = this.f39962a;
        if (kVar != null) {
            kVar.a(this.f39966e, this.f39965d, th);
        }
        this.f39963b = false;
    }

    @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
    public final void onSubmit(String str, Object obj) {
        k kVar = this.f39962a;
        if (kVar != null) {
            kVar.a(this.f39966e, this.f39965d);
        }
    }

    @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
    public final void onIntermediateImageFailed(String str, Throwable th) {
        super.onIntermediateImageFailed(str, th);
        k kVar = this.f39962a;
        if (kVar != null) {
            kVar.a(this.f39966e, th);
        }
        this.f39963b = false;
        this.f39964c = false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
    @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
    public final /* synthetic */ void onIntermediateImageSet(String str, f fVar) {
        f fVar2 = fVar;
        super.onIntermediateImageSet(str, fVar2);
        k kVar = this.f39962a;
        if (kVar != null) {
            if (fVar2 != null) {
                this.f39962a.a(this.f39966e, new o(fVar2.getWidth(), fVar2.getHeight()));
            } else {
                kVar.a(this.f39966e, (o) null);
            }
        }
        this.f39963b = false;
        this.f39964c = false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
    @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
    public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
        f fVar2 = fVar;
        boolean z = fVar2 instanceof a;
        if (z) {
            this.f39967f = (a) fVar2;
        }
        boolean z2 = true;
        this.f39964c = true;
        if (animatable == null) {
            z2 = false;
        }
        this.f39963b = z2;
        k kVar = this.f39962a;
        if (kVar != null) {
            if (fVar2 != null) {
                this.f39962a.a(this.f39966e, this.f39965d, new o(fVar2.getWidth(), fVar2.getHeight()), animatable);
            } else {
                kVar.a(this.f39966e, this.f39965d, null, animatable);
            }
        }
        if (this.f39967f != null && this.f39968g.I && !TextUtils.isEmpty(this.f39965d.getAnimPreviewFrameCacheKey()) && a.C0978a.f39959a.a(this.f39965d.getAnimPreviewFrameCacheKey()) == null && z) {
            a.C0978a.f39959a.a(this.f39965d.getAnimPreviewFrameCacheKey(), this.f39967f);
        }
        if (this.f39963b && this.f39968g.f39894c) {
            this.f39965d.b();
        }
    }
}
