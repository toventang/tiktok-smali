package com.lynx.tasm.ui.image;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.e.g;
import com.facebook.drawee.f.a;
import com.facebook.drawee.view.b;
import com.facebook.imagepipeline.j.c;
import com.facebook.imagepipeline.j.d;
import com.lynx.tasm.LynxEnv;

public class l extends b<a> {

    /* renamed from: h  reason: collision with root package name */
    private static Drawable f57016h = new ColorDrawable();

    /* renamed from: d  reason: collision with root package name */
    public com.facebook.common.h.a<c> f57017d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f57018e;

    /* renamed from: f  reason: collision with root package name */
    private Handler f57019f = new Handler(Looper.getMainLooper());

    /* renamed from: g  reason: collision with root package name */
    private g f57020g;

    @Override // com.facebook.drawee.view.b
    public final void b() {
    }

    @Override // com.facebook.drawee.view.b
    public final Drawable f() {
        return this.f57020g;
    }

    static {
        Covode.recordClassIndex(35462);
    }

    @Override // com.facebook.drawee.view.b
    public final void c() {
        this.f57020g.setDrawable(f57016h);
        this.f57019f.post(new Runnable() {
            /* class com.lynx.tasm.ui.image.l.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35463);
            }

            public final void run() {
                com.facebook.common.h.a.c(l.this.f57017d);
            }
        });
    }

    public l(com.facebook.common.h.a<c> aVar) {
        super(null);
        this.f57017d = aVar;
        this.f57018e = new BitmapDrawable(LynxEnv.b().f55531a.getResources(), ((d) aVar.a()).f47984a);
        this.f57020g = new g(this.f57018e);
    }
}
