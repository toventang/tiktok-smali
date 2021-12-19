package com.ss.android.ugc.aweme.sticker.types.game;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements b.g {

    /* renamed from: a  reason: collision with root package name */
    private final b f136104a;

    /* renamed from: b  reason: collision with root package name */
    private final Effect f136105b;

    /* renamed from: c  reason: collision with root package name */
    private final String f136106c;

    /* renamed from: d  reason: collision with root package name */
    private final o f136107d;

    static {
        Covode.recordClassIndex(88904);
    }

    g(b bVar, Effect effect, String str, o oVar) {
        this.f136104a = bVar;
        this.f136105b = effect;
        this.f136106c = str;
        this.f136107d = oVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        return this.f136104a.a(this.f136105b, this.f136106c, this.f136107d, iVar);
    }
}
