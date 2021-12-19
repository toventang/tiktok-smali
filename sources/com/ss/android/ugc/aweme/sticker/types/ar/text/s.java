package com.ss.android.ugc.aweme.sticker.types.ar.text;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.types.ar.text.r;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.j;
import h.f.a.a;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray<r> f135892a;

    /* renamed from: b  reason: collision with root package name */
    private k f135893b;

    static {
        Covode.recordClassIndex(88803);
    }

    public final void a() {
        for (int i2 = 0; i2 < this.f135892a.size(); i2++) {
            int keyAt = this.f135892a.keyAt(i2);
            this.f135892a.get(keyAt).c();
            this.f135892a.get(keyAt).f135890k = false;
        }
    }

    public final void b() {
        for (int i2 = 0; i2 < this.f135892a.size(); i2++) {
            r rVar = this.f135892a.get(this.f135892a.keyAt(i2));
            if (rVar != null && rVar.f135890k) {
                rVar.a();
            }
        }
    }

    public final void a(Effect effect) {
        if (!effect.getTags().contains("AR")) {
            effect.getTags().contains("text2d");
        }
        k kVar = this.f135893b;
        if (kVar.f135859b != null) {
            kVar.f135858a = kVar.f135859b;
            kVar.f135859b = null;
            kVar.a(kVar.f135858a);
        }
    }

    public s(e eVar, o oVar, e eVar2, j jVar) {
        SparseArray<r> sparseArray = new SparseArray<>();
        this.f135892a = sparseArray;
        b bVar = new b(eVar, eVar2, jVar);
        bVar.f135887h = 0;
        sparseArray.put(0, bVar);
        SparseArray<r> sparseArray2 = this.f135892a;
        h hVar = new h(eVar, eVar2, jVar);
        hVar.f135887h = 1;
        sparseArray2.put(1, hVar);
        this.f135893b = new k(oVar, this.f135892a, eVar);
    }

    public final void a(r.b bVar, Activity activity, ViewGroup viewGroup, a<Integer> aVar) {
        n aVar2;
        MethodCollector.i(10215);
        for (int i2 = 0; i2 < this.f135892a.size(); i2++) {
            int keyAt = this.f135892a.keyAt(i2);
            if (keyAt == 0) {
                aVar2 = new a((Context) activity, (char) 0);
            } else if (keyAt != 1) {
                aVar2 = new n(activity);
            } else {
                aVar2 = new g((Context) activity, (char) 0);
            }
            aVar2.setTopMarginSupplier(aVar);
            viewGroup.addView(aVar2);
            r rVar = this.f135892a.get(keyAt);
            rVar.a(aVar2);
            rVar.a(bVar);
            rVar.d();
            rVar.f135890k = true;
        }
        MethodCollector.o(10215);
    }
}
