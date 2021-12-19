package com.bytedance.lighten.loader;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.u;
import com.facebook.drawee.f.e;
import com.facebook.drawee.view.b;

final class k {
    static {
        Covode.recordClassIndex(24650);
    }

    static class a implements View.OnAttachStateChangeListener, View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        b<com.facebook.drawee.h.b> f39986a;

        static {
            Covode.recordClassIndex(24651);
        }

        public a(b<com.facebook.drawee.h.b> bVar) {
            this.f39986a = bVar;
        }

        public final void onViewAttachedToWindow(View view) {
            b<com.facebook.drawee.h.b> bVar = this.f39986a;
            if (bVar != null) {
                bVar.b();
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            b<com.facebook.drawee.h.b> bVar = this.f39986a;
            if (bVar != null) {
                bVar.c();
            }
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            b<com.facebook.drawee.h.b> bVar = this.f39986a;
            if (bVar == null || !bVar.a(motionEvent)) {
                return false;
            }
            return true;
        }
    }

    static com.facebook.drawee.f.a a(ImageView imageView, u uVar) {
        if (imageView == null || uVar == null) {
            return null;
        }
        e eVar = new e();
        if (uVar.v != null) {
            eVar = q.a(eVar, uVar.v);
        }
        com.facebook.drawee.f.b bVar = new com.facebook.drawee.f.b(imageView.getResources());
        bVar.q = uVar.s;
        bVar.t = eVar;
        if (uVar.u != null) {
            bVar.a(x.a(uVar.u));
        }
        if (uVar.n > 0) {
            bVar.f47465f = bVar.f47462c.getDrawable(uVar.n);
            if (uVar.p != null) {
                bVar.f47466g = x.a(uVar.p);
            }
        } else if (uVar.o != null) {
            bVar.f47465f = uVar.o;
        }
        if (uVar.q > 0) {
            bVar.f47469j = bVar.f47462c.getDrawable(uVar.q);
            if (uVar.r != null) {
                bVar.f47470k = x.a(uVar.r);
            }
        }
        if (uVar.L > 0) {
            bVar.f47467h = bVar.f47462c.getDrawable(uVar.L);
            if (uVar.M != null) {
                bVar.f47468i = x.a(uVar.M);
            }
        }
        if (uVar.f39904m > 0) {
            bVar.f47463d = uVar.f39904m;
        }
        return bVar.a();
    }
}
