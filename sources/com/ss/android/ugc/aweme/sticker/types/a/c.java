package com.ss.android.ugc.aweme.sticker.types.a;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    private final a f135750a;

    /* renamed from: b  reason: collision with root package name */
    private final String f135751b;

    /* renamed from: c  reason: collision with root package name */
    private final Effect f135752c;

    static {
        Covode.recordClassIndex(88733);
    }

    c(a aVar, String str, Effect effect) {
        this.f135750a = aVar;
        this.f135751b = str;
        this.f135752c = effect;
    }

    @Override // b.g
    public final Object then(i iVar) {
        return this.f135750a.a(this.f135751b, this.f135752c, iVar);
    }
}
