package com.lynx.tasm.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.image.b.c;

/* access modifiers changed from: package-private */
public final class e extends View {

    /* renamed from: a  reason: collision with root package name */
    d f56739a;

    /* renamed from: b  reason: collision with root package name */
    d f56740b;

    /* renamed from: c  reason: collision with root package name */
    public b f56741c;

    /* renamed from: d  reason: collision with root package name */
    Bitmap f56742d;

    /* renamed from: e  reason: collision with root package name */
    Bitmap f56743e;

    static {
        Covode.recordClassIndex(35350);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f56743e = null;
        this.f56742d = null;
        d dVar = this.f56739a;
        if (dVar != null) {
            dVar.b();
            this.f56739a = null;
        }
        d dVar2 = this.f56740b;
        if (dVar2 != null) {
            dVar2.b();
            this.f56740b = null;
        }
        super.onDetachedFromWindow();
    }

    public e(Context context) {
        super(context);
        MethodCollector.i(13286);
        MethodCollector.o(13286);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        MethodCollector.i(13287);
        super.onDraw(canvas);
        if (this.f56742d != null) {
            if (this.f56739a == null) {
                this.f56739a = c.a();
            }
            this.f56739a.a(canvas, this.f56742d, this.f56741c);
            MethodCollector.o(13287);
            return;
        }
        if (this.f56743e != null) {
            if (this.f56740b == null) {
                this.f56740b = c.b();
            }
            this.f56740b.a(canvas, this.f56743e, this.f56741c);
        }
        MethodCollector.o(13287);
    }
}
