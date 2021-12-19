package com.facebook.drawee.a.a;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.facebook.common.b.i;
import com.facebook.common.d.e;
import com.facebook.common.d.k;
import com.facebook.drawee.c.d;
import com.facebook.imagepipeline.d.p;
import com.facebook.imagepipeline.e.h;
import com.facebook.imagepipeline.h.a;
import com.facebook.imagepipeline.j.c;
import java.util.Set;

public final class f implements k<e> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f47274a;

    /* renamed from: b  reason: collision with root package name */
    private final h f47275b;

    /* renamed from: c  reason: collision with root package name */
    private final g f47276c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<d> f47277d;

    static {
        Covode.recordClassIndex(28738);
    }

    /* renamed from: a */
    public final e b() {
        return new e(this.f47274a, this.f47276c, this.f47275b, this.f47277d);
    }

    public f(Context context, b bVar) {
        this(context, com.facebook.imagepipeline.e.k.a(), bVar);
    }

    private f(Context context, com.facebook.imagepipeline.e.k kVar, b bVar) {
        this(context, kVar, bVar, (byte) 0);
    }

    private f(Context context, com.facebook.imagepipeline.e.k kVar, b bVar, byte b2) {
        a animatedDrawableFactory;
        e<a> eVar;
        k<Boolean> kVar2;
        this.f47274a = context;
        h e2 = kVar.e();
        this.f47275b = e2;
        if (bVar == null || bVar.f47212b == null) {
            this.f47276c = new g();
        } else {
            this.f47276c = bVar.f47212b;
        }
        g gVar = this.f47276c;
        Resources resources = context.getResources();
        com.facebook.drawee.b.a a2 = com.facebook.drawee.b.a.a();
        com.facebook.imagepipeline.a.b.a b3 = kVar.b();
        if (b3 == null) {
            animatedDrawableFactory = null;
        } else {
            animatedDrawableFactory = b3.getAnimatedDrawableFactory(context);
        }
        i b4 = i.b();
        p<com.facebook.c.a.e, c> pVar = e2.f47836a;
        if (bVar != null) {
            eVar = bVar.f47211a;
            kVar2 = bVar.f47213c;
        } else {
            eVar = null;
            kVar2 = null;
        }
        gVar.f47278a = resources;
        gVar.f47279b = a2;
        gVar.f47280c = animatedDrawableFactory;
        gVar.f47281d = b4;
        gVar.f47282e = pVar;
        gVar.f47283f = eVar;
        gVar.f47284g = kVar2;
        this.f47277d = null;
    }
}
