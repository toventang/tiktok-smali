package com.ss.android.ugc.aweme.tools.beauty.impl.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.b.c.c;
import com.ss.android.ugc.aweme.tools.beauty.g.m;
import com.ss.android.ugc.aweme.tools.beauty.service.b;
import com.ss.android.ugc.aweme.tools.beauty.service.f;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public m f139070a;

    /* renamed from: b  reason: collision with root package name */
    public a f139071b;

    /* renamed from: c  reason: collision with root package name */
    public f.b f139072c;

    /* renamed from: d  reason: collision with root package name */
    public c f139073d;

    static {
        Covode.recordClassIndex(90962);
    }

    public final void a(BeautyCategory beautyCategory) {
        l.d(beautyCategory, "");
        a aVar = this.f139071b;
        if (aVar != null) {
            l.d(beautyCategory, "");
            b bVar = aVar.f139043a;
            if (bVar != null) {
                bVar.a(beautyCategory);
            }
        }
        f.b bVar2 = this.f139072c;
        if (bVar2 != null) {
            bVar2.a(beautyCategory);
        }
    }

    public f(m mVar, a aVar, f.b bVar, c cVar) {
        l.d(mVar, "");
        l.d(cVar, "");
        this.f139070a = mVar;
        this.f139071b = aVar;
        this.f139072c = bVar;
        this.f139073d = cVar;
    }
}
