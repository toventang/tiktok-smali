package com.bytedance.lottie.a.a;

import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.b.a;
import com.bytedance.lottie.c.b.l;
import com.bytedance.lottie.c.b.o;
import com.bytedance.lottie.c.b.q;
import com.bytedance.lottie.f.h;
import com.bytedance.lottie.i;
import java.util.List;

public final class p implements l, a.AbstractC0986a {

    /* renamed from: a  reason: collision with root package name */
    private final Path f40400a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final String f40401b;

    /* renamed from: c  reason: collision with root package name */
    private final i f40402c;

    /* renamed from: d  reason: collision with root package name */
    private final a<?, Path> f40403d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f40404e;

    /* renamed from: f  reason: collision with root package name */
    private r f40405f;

    static {
        Covode.recordClassIndex(24848);
    }

    @Override // com.bytedance.lottie.a.a.b
    public final String b() {
        return this.f40401b;
    }

    @Override // com.bytedance.lottie.a.b.a.AbstractC0986a
    public final void a() {
        this.f40404e = false;
        this.f40402c.invalidateSelf();
    }

    @Override // com.bytedance.lottie.a.a.l
    public final Path e() {
        if (this.f40404e) {
            return this.f40400a;
        }
        this.f40400a.reset();
        this.f40400a.set(this.f40403d.d());
        this.f40400a.setFillType(Path.FillType.EVEN_ODD);
        h.a(this.f40400a, this.f40405f);
        this.f40404e = true;
        return this.f40400a;
    }

    @Override // com.bytedance.lottie.a.a.b
    public final void a(List<b> list, List<b> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b bVar = list.get(i2);
            if (bVar instanceof r) {
                r rVar = (r) bVar;
                if (rVar.f40410a == q.a.Simultaneously) {
                    this.f40405f = rVar;
                    rVar.a(this);
                }
            }
        }
    }

    public p(i iVar, com.bytedance.lottie.c.c.a aVar, o oVar) {
        this.f40401b = oVar.f40561a;
        this.f40402c = iVar;
        a<l, Path> a2 = oVar.f40562b.a();
        this.f40403d = a2;
        aVar.a(a2);
        a2.a(this);
    }
}
