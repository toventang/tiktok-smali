package com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c;

import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.c.d;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.im.sdk.chat.b.b.c;
import com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.g;
import h.f.b.l;
import h.m.p;
import java.util.UUID;

public final class b implements d<f> {

    /* renamed from: a  reason: collision with root package name */
    public final String f102402a;

    /* renamed from: b  reason: collision with root package name */
    private final String f102403b;

    static {
        Covode.recordClassIndex(65551);
    }

    @Override // com.facebook.drawee.c.d
    public final void onFailure(String str, Throwable th) {
    }

    @Override // com.facebook.drawee.c.d
    public final void onIntermediateImageFailed(String str, Throwable th) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
    @Override // com.facebook.drawee.c.d
    public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, f fVar) {
    }

    @Override // com.facebook.drawee.c.d
    public final void onRelease(String str) {
    }

    public b(String str) {
        this.f102402a = str;
        this.f102403b = l.a(str, (Object) UUID.randomUUID());
    }

    @Override // com.facebook.drawee.c.d
    public final void onSubmit(String str, Object obj) {
        String str2 = this.f102402a;
        if (str2 != null && !p.a((CharSequence) str2)) {
            a.f102292a.a((com.ss.android.ugc.aweme.im.service.g.b) new g(this.f102403b), true);
        }
    }

    public final void a(f fVar, Animatable animatable) {
        int i2;
        if (c.a().f100119c) {
            String str = this.f102402a;
            boolean z = true;
            int i3 = 0;
            if (str != null && !p.a((CharSequence) str)) {
                a aVar = a.f102292a;
                g gVar = new g(this.f102403b);
                if (animatable == null) {
                    z = false;
                }
                if (fVar != null) {
                    i2 = fVar.getWidth();
                    i3 = fVar.getHeight();
                } else {
                    i2 = 0;
                }
                aVar.a(gVar, new com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.f(z, i2, i3));
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
    @Override // com.facebook.drawee.c.d
    public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
        a(fVar, animatable);
    }
}
