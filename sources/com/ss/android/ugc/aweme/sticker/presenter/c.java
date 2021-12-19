package com.ss.android.ugc.aweme.sticker.presenter;

import androidx.appcompat.app.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.repository.a;
import com.ss.android.ugc.aweme.sticker.repository.a.k;
import com.ss.android.ugc.aweme.sticker.repository.a.t;
import com.ss.android.ugc.aweme.sticker.repository.a.x;
import com.ss.android.ugc.aweme.sticker.repository.internals.b.f;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import h.f.b.l;
import java.util.List;

public class c implements h {

    /* renamed from: a  reason: collision with root package name */
    private f f135278a;

    /* renamed from: b  reason: collision with root package name */
    private k f135279b;

    /* renamed from: c  reason: collision with root package name */
    private x f135280c;

    /* renamed from: d  reason: collision with root package name */
    private j f135281d;

    /* renamed from: e  reason: collision with root package name */
    private final d f135282e;

    /* renamed from: f  reason: collision with root package name */
    private final q f135283f;

    /* renamed from: g  reason: collision with root package name */
    private final t f135284g;

    /* renamed from: h  reason: collision with root package name */
    private final com.ss.android.ugc.tools.b.a.d f135285h;

    /* renamed from: i  reason: collision with root package name */
    private final List<EffectCategoryModel> f135286i;

    static {
        Covode.recordClassIndex(88400);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.h
    public final o a() {
        x xVar = this.f135280c;
        if (xVar == null) {
            xVar = a(this.f135283f.f135424a, this.f135285h, this.f135284g, this.f135286i);
        }
        return new DefaultStickerDataManager(this.f135282e, this.f135283f, xVar, this.f135281d, this.f135279b);
    }

    public final void a(k kVar) {
        l.d(kVar, "");
        this.f135279b = kVar;
    }

    public final void a(f fVar) {
        l.d(fVar, "");
        this.f135278a = fVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ c(androidx.appcompat.app.d r7, com.ss.android.ugc.aweme.sticker.presenter.q r8, com.ss.android.ugc.aweme.sticker.repository.a.t r9, com.ss.android.ugc.tools.b.a.d r10) {
        /*
            r6 = this;
            r1 = r7
            java.util.List r5 = com.ss.android.ugc.aweme.sticker.p.f.a.a(r1)
            java.lang.String r0 = ""
            h.f.b.l.b(r5, r0)
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.presenter.c.<init>(androidx.appcompat.app.d, com.ss.android.ugc.aweme.sticker.presenter.q, com.ss.android.ugc.aweme.sticker.repository.a.t, com.ss.android.ugc.tools.b.a.d):void");
    }

    public x a(String str, com.ss.android.ugc.tools.b.a.d dVar, t tVar, List<EffectCategoryModel> list) {
        l.d(str, "");
        l.d(dVar, "");
        l.d(tVar, "");
        l.d(list, "");
        a aVar = new a(str, dVar, tVar, list);
        f fVar = this.f135278a;
        if (fVar != null) {
            l.d(fVar, "");
            aVar.f135452c = fVar;
        }
        return aVar;
    }

    public c(d dVar, q qVar, t tVar, com.ss.android.ugc.tools.b.a.d dVar2, List<EffectCategoryModel> list) {
        l.d(dVar, "");
        l.d(qVar, "");
        l.d(tVar, "");
        l.d(dVar2, "");
        l.d(list, "");
        this.f135282e = dVar;
        this.f135283f = qVar;
        this.f135284g = tVar;
        this.f135285h = dVar2;
        this.f135286i = list;
        this.f135281d = new d((byte) 0);
    }
}
