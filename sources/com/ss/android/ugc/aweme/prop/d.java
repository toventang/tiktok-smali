package com.ss.android.ugc.aweme.prop;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.prop.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    private final a.AnonymousClass2 f118291a;

    /* renamed from: b  reason: collision with root package name */
    private final Effect f118292b;

    static {
        Covode.recordClassIndex(76816);
    }

    d(a.AnonymousClass2 r1, Effect effect) {
        this.f118291a = r1;
        this.f118292b = effect;
    }

    @Override // b.g
    public final Object then(i iVar) {
        a.AnonymousClass2 r3 = this.f118291a;
        Effect effect = this.f118292b;
        if (r3.a(iVar)) {
            return null;
        }
        a.this.a(effect, a.this.f118175k);
        return null;
    }
}
