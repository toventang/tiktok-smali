package com.ss.android.ugc.aweme.sticker.presenter.handler;

import androidx.appcompat.app.d;
import com.bytedance.als.h;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.aweme.sticker.presenter.f;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.b;
import com.ss.android.ugc.aweme.sticker.senor.presenter.DefaultSenorPresenter;
import h.f.a.a;
import h.f.b.l;

public final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f135371a;

    /* renamed from: b  reason: collision with root package name */
    private final d f135372b;

    /* renamed from: c  reason: collision with root package name */
    private final h<Boolean> f135373c;

    /* renamed from: d  reason: collision with root package name */
    private final a<Boolean> f135374d;

    /* renamed from: e  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.sticker.senor.c f135375e;

    /* renamed from: f  reason: collision with root package name */
    private final f f135376f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f135377g;

    static {
        Covode.recordClassIndex(88434);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a() {
        if (this.f135377g) {
            this.f135376f.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final boolean a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        l.d(aVar, "");
        if (!g.k(aVar.f135378a)) {
            return true;
        }
        return false;
    }

    private final void a(boolean z) {
        boolean z2;
        Boolean a2 = this.f135373c.a();
        if (a2 != null) {
            z2 = a2.booleanValue();
        } else {
            z2 = false;
        }
        d dVar = this.f135372b;
        this.f135376f.a(new DefaultSenorPresenter(dVar, dVar, z2, this.f135375e, this.f135374d.invoke().booleanValue(), this.f135376f.c(), this.f135377g), z);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a(b bVar, com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        boolean z;
        l.d(bVar, "");
        l.d(aVar, "");
        if (aVar.f135378a.getTypes().contains("highRotationFreq")) {
            this.f135371a = true;
            int[] iArr = {11, 15};
            Boolean a2 = this.f135373c.a();
            if (a2 != null) {
                z = a2.booleanValue();
            } else {
                z = false;
            }
            d dVar = this.f135372b;
            DefaultSenorPresenter defaultSenorPresenter = new DefaultSenorPresenter(dVar, dVar, z, this.f135375e, this.f135374d.invoke().booleanValue(), this.f135376f.c(), this.f135377g);
            int i2 = 0;
            do {
                int i3 = iArr[i2];
                if (i3 != 0) {
                    defaultSenorPresenter.f135697a.put(i3, 0);
                }
                i2++;
            } while (i2 < 2);
            this.f135376f.a(defaultSenorPresenter, true);
        } else if (this.f135371a) {
            this.f135371a = false;
            a(true);
        } else {
            a(false);
        }
    }

    private c(d dVar, h<Boolean> hVar, a<Boolean> aVar, com.ss.android.ugc.aweme.sticker.senor.c cVar, f fVar) {
        l.d(dVar, "");
        l.d(hVar, "");
        l.d(aVar, "");
        l.d(cVar, "");
        l.d(fVar, "");
        this.f135372b = dVar;
        this.f135373c = hVar;
        this.f135374d = aVar;
        this.f135375e = cVar;
        this.f135376f = fVar;
        this.f135377g = false;
    }

    public /* synthetic */ c(d dVar, h hVar, a aVar, com.ss.android.ugc.aweme.sticker.senor.c cVar, f fVar, byte b2) {
        this(dVar, hVar, aVar, cVar, fVar);
    }
}
