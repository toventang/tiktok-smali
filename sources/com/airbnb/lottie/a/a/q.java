package com.airbnb.lottie.a.a;

import android.graphics.Path;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.e.b.l;
import com.airbnb.lottie.e.b.o;
import com.airbnb.lottie.e.b.q;
import com.airbnb.lottie.g;
import com.airbnb.lottie.g.d;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class q implements m, a.AbstractC0073a {

    /* renamed from: a  reason: collision with root package name */
    private final Path f5240a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final String f5241b;

    /* renamed from: c  reason: collision with root package name */
    private final g f5242c;

    /* renamed from: d  reason: collision with root package name */
    private final a<?, Path> f5243d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5244e;

    /* renamed from: f  reason: collision with root package name */
    private s f5245f;

    /* renamed from: g  reason: collision with root package name */
    private b f5246g;

    static {
        Covode.recordClassIndex(2204);
    }

    @Override // com.airbnb.lottie.a.a.c
    public final String b() {
        return this.f5241b;
    }

    @Override // com.airbnb.lottie.a.b.a.AbstractC0073a
    public final void a() {
        this.f5244e = false;
        this.f5242c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.a.a.m
    public final Path e() {
        b bVar;
        if (this.f5244e) {
            return this.f5240a;
        }
        this.f5240a.reset();
        this.f5240a.set(this.f5243d.f());
        this.f5240a.setFillType(Path.FillType.EVEN_ODD);
        if (!d.a.f5625a || (bVar = this.f5246g) == null) {
            com.airbnb.lottie.i.g.a(this.f5240a, this.f5245f);
        } else {
            bVar.a(this.f5240a);
        }
        this.f5244e = true;
        return this.f5240a;
    }

    @Override // com.airbnb.lottie.a.a.c
    public final void a(List<c> list, List<c> list2) {
        b bVar;
        for (int i2 = 0; i2 < list.size(); i2++) {
            c cVar = list.get(i2);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.f5251a == q.a.Simultaneously) {
                    if (!d.a.f5625a || (bVar = this.f5246g) == null) {
                        this.f5245f = sVar;
                        sVar.a(this);
                    } else {
                        bVar.a(sVar);
                        sVar.a(this);
                    }
                }
            }
        }
    }

    public q(g gVar, com.airbnb.lottie.e.c.a aVar, o oVar) {
        if (d.a.f5625a) {
            this.f5246g = new b();
        }
        this.f5241b = oVar.f5437a;
        this.f5242c = gVar;
        a<l, Path> a2 = oVar.f5438b.a();
        this.f5243d = a2;
        aVar.a(a2);
        a2.a(this);
    }
}
