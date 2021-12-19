package com.ss.android.ugc.aweme.sticker.d.b;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class d implements b<Effect> {

    /* renamed from: a  reason: collision with root package name */
    public final Effect f134777a;

    /* renamed from: b  reason: collision with root package name */
    public final int f134778b;

    /* renamed from: c  reason: collision with root package name */
    public final a f134779c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f134780d;

    static {
        Covode.recordClassIndex(88086);
    }

    @Override // com.ss.android.ugc.aweme.sticker.d.b.b
    public final int a() {
        return this.f134778b;
    }

    @Override // com.ss.android.ugc.aweme.sticker.d.b.b
    public final a b() {
        return this.f134779c;
    }

    public /* synthetic */ d(a aVar) {
        this(null, -1, aVar, null);
    }

    public d(Effect effect, int i2, a aVar, Bundle bundle) {
        l.d(aVar, "");
        this.f134777a = effect;
        this.f134778b = i2;
        this.f134779c = aVar;
        this.f134780d = bundle;
    }
}
