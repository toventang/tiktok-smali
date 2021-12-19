package com.ss.android.ugc.aweme.sticker.types.ar.text;

import android.text.TextUtils;
import android.util.SparseArray;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    q f135858a;

    /* renamed from: b  reason: collision with root package name */
    q f135859b;

    /* renamed from: c  reason: collision with root package name */
    private SparseArray<r> f135860c;

    /* renamed from: d  reason: collision with root package name */
    private final o f135861d;

    static {
        Covode.recordClassIndex(88792);
    }

    /* access modifiers changed from: package-private */
    public final void a(q qVar) {
        r rVar = this.f135860c.get(qVar.f135878c);
        if (qVar.f135876a == 32) {
            Effect value = this.f135861d.n().b().getValue();
            if ((g.k(value) || g.m(value) || g.o(value)) && rVar != null) {
                rVar.f135883d = this.f135858a;
                rVar.a(qVar.f135877b, qVar.f135879d);
                rVar.b();
                String str = qVar.f135879d;
                int i2 = qVar.f135877b;
                if (!TextUtils.isEmpty(str) && rVar.f135880a != null) {
                    if (i2 == 0) {
                        rVar.f135880a.setText(str);
                    } else {
                        rVar.f135880a.setHintText(str);
                    }
                }
            }
        } else if (qVar.f135876a == 33 && rVar.f135880a != null) {
            rVar.f135880a.e();
        }
    }

    public k(o oVar, SparseArray<r> sparseArray, e eVar) {
        this.f135861d = oVar;
        if (eVar != null) {
            this.f135860c = sparseArray;
            ((ARTextResultModule) ae.a(eVar, (ad.b) null).a(ARTextResultModule.class)).a().observe(eVar, new l(this));
            ((ARTextResultModule) ae.a(eVar, (ad.b) null).a(ARTextResultModule.class)).b().observe(eVar, new m(this));
        }
    }
}
