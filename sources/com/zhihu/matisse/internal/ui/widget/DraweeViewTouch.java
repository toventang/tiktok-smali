package com.zhihu.matisse.internal.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.facebook.d.c;
import com.facebook.drawee.a.a.e;
import com.facebook.drawee.view.b;
import com.facebook.imagepipeline.j.d;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.lancet.k;
import g.a.a.a.b.a;

public class DraweeViewTouch extends a {
    private b A;

    static {
        Covode.recordClassIndex(103915);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A.b();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A.c();
        k.a(this);
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.A.b();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.A.c();
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.A.f() || !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.facebook.imagepipeline.o.b */
    /* JADX WARN: Multi-variable type inference failed */
    public void setImageRequest(com.facebook.imagepipeline.o.b bVar) {
        final c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> a2 = com.facebook.imagepipeline.e.k.a().e().a(bVar, (Object) null);
        e b2 = com.facebook.drawee.a.a.c.b();
        b2.f47325m = this.A.f47495b;
        b2.f47315c = bVar;
        b2.f47319g = new com.facebook.drawee.c.c<f>() {
            /* class com.zhihu.matisse.internal.ui.widget.DraweeViewTouch.AnonymousClass1 */

            static {
                Covode.recordClassIndex(103916);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
                com.facebook.common.h.a aVar;
                Throwable th;
                Bitmap bitmap;
                super.onFinalImageSet(str, fVar, animatable);
                try {
                    aVar = (com.facebook.common.h.a) a2.d();
                    if (aVar != null) {
                        try {
                            com.facebook.imagepipeline.j.c cVar = (com.facebook.imagepipeline.j.c) aVar.a();
                            if ((cVar instanceof d) && (bitmap = ((d) cVar).f47984a) != null) {
                                DraweeViewTouch.this.setImageBitmap(bitmap);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            a2.g();
                            com.facebook.common.h.a.c(aVar);
                            throw th;
                        }
                    }
                    a2.g();
                    com.facebook.common.h.a.c(aVar);
                } catch (Throwable th3) {
                    th = th3;
                    aVar = null;
                    a2.g();
                    com.facebook.common.h.a.c(aVar);
                    throw th;
                }
            }
        };
        this.A.a(b2.e());
    }

    public DraweeViewTouch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (this.A == null) {
            this.A = b.a(new com.facebook.drawee.f.b(getResources()).a());
        }
    }
}
