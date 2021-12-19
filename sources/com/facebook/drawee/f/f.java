package com.facebook.drawee.f;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.facebook.common.e.a;
import com.facebook.drawee.e.c;
import com.facebook.drawee.e.g;
import com.facebook.drawee.e.j;
import com.facebook.drawee.e.k;
import com.facebook.drawee.e.l;
import com.facebook.drawee.e.m;
import com.facebook.drawee.e.o;
import com.facebook.drawee.e.p;
import com.facebook.drawee.e.q;
import com.facebook.drawee.f.e;
import com.facebook.imagepipeline.p.b;

public class f {

    /* renamed from: a  reason: collision with root package name */
    static final Drawable f47484a = new ColorDrawable(0);

    static {
        Covode.recordClassIndex(28803);
    }

    private static c a(c cVar) {
        while (true) {
            Drawable drawable = cVar.getDrawable();
            if (drawable == cVar || !(drawable instanceof c)) {
                return cVar;
            }
            cVar = (c) drawable;
        }
        return cVar;
    }

    private static void a(j jVar) {
        jVar.a(false);
        jVar.a();
        jVar.a(0, 0.0f);
        jVar.a(0.0f);
        jVar.b(false);
    }

    static Drawable a(Drawable drawable, e eVar) {
        try {
            if (!(drawable == null || eVar == null)) {
                if (eVar.f47475a == e.a.OVERLAY_COLOR) {
                    m mVar = new m(drawable);
                    a((j) mVar, eVar);
                    mVar.a(eVar.f47478d);
                    b.a();
                    return mVar;
                }
            }
            b.a();
            return drawable;
        } finally {
            b.a();
        }
    }

    static void a(c cVar, e eVar) {
        Drawable drawable = cVar.getDrawable();
        if (eVar == null || eVar.f47475a != e.a.OVERLAY_COLOR) {
            if (drawable instanceof m) {
                Drawable drawable2 = f47484a;
                cVar.setDrawable(((g) drawable).setCurrent(drawable2));
                drawable2.setCallback(null);
            }
        } else if (drawable instanceof m) {
            m mVar = (m) drawable;
            a((j) mVar, eVar);
            mVar.a(eVar.f47478d);
        } else {
            cVar.setDrawable(a(cVar.setDrawable(f47484a), eVar));
        }
    }

    private static void a(j jVar, e eVar) {
        jVar.a(eVar.f47476b);
        jVar.a(eVar.f47477c);
        jVar.a(eVar.f47480f, eVar.f47479e);
        jVar.a(eVar.f47481g);
        jVar.b(eVar.f47482h);
    }

    static Drawable a(Drawable drawable, q.b bVar, PointF pointF) {
        b.a();
        if (drawable == null || bVar == null) {
            b.a();
            return drawable;
        }
        p pVar = new p(drawable, bVar);
        if (pointF != null) {
            pVar.a(pointF);
        }
        b.a();
        return pVar;
    }

    static Drawable a(Drawable drawable, e eVar, Resources resources) {
        try {
            if (!(drawable == null || eVar == null)) {
                if (eVar.f47475a == e.a.BITMAP_ONLY) {
                    if (drawable instanceof g) {
                        c a2 = a((g) drawable);
                        a2.setDrawable(b(a2.setDrawable(f47484a), eVar, resources));
                        b.a();
                        return drawable;
                    }
                    Drawable b2 = b(drawable, eVar, resources);
                    b.a();
                    return b2;
                }
            }
            b.a();
            return drawable;
        } finally {
            b.a();
        }
    }

    private static Drawable b(Drawable drawable, e eVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            k kVar = new k(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            a((j) kVar, eVar);
            return kVar;
        } else if (drawable instanceof NinePatchDrawable) {
            o oVar = new o((NinePatchDrawable) drawable);
            a((j) oVar, eVar);
            return oVar;
        } else if (drawable instanceof ColorDrawable) {
            int i2 = Build.VERSION.SDK_INT;
            l a2 = l.a((ColorDrawable) drawable);
            a((j) a2, eVar);
            return a2;
        } else {
            a.b("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
    }

    static void a(c cVar, e eVar, Resources resources) {
        c a2 = a(cVar);
        Drawable drawable = a2.getDrawable();
        if (eVar == null || eVar.f47475a != e.a.BITMAP_ONLY) {
            if (drawable instanceof j) {
                a((j) drawable);
            }
        } else if (drawable instanceof j) {
            a((j) drawable, eVar);
        } else if (drawable != null) {
            a2.setDrawable(f47484a);
            a2.setDrawable(b(drawable, eVar, resources));
        }
    }
}
