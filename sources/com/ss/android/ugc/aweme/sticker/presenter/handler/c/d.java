package com.ss.android.ugc.aweme.sticker.presenter.handler.c;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.d.b.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class d extends c {

    /* renamed from: a  reason: collision with root package name */
    public final Effect f135384a;

    /* renamed from: b  reason: collision with root package name */
    public final int f135385b;

    /* renamed from: c  reason: collision with root package name */
    public final a f135386c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f135387d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f135388e;

    static {
        Covode.recordClassIndex(88438);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.c.c
    public final Effect a() {
        return this.f135384a;
    }

    public final int hashCode() {
        int i2;
        int i3;
        Effect effect = this.f135384a;
        int i4 = 0;
        if (effect != null) {
            i2 = effect.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = ((i2 * 31) + this.f135385b) * 31;
        a aVar = this.f135386c;
        if (aVar != null) {
            i3 = aVar.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        boolean z = this.f135387d;
        if (z) {
            z = true;
        }
        int i7 = z ? 1 : 0;
        int i8 = z ? 1 : 0;
        int i9 = z ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        Bundle bundle = this.f135388e;
        if (bundle != null) {
            i4 = bundle.hashCode();
        }
        return i10 + i4;
    }

    public final String toString() {
        return "UnselectedStickerHandleSession(sticker=" + this.f135384a + ", clickPosition=" + this.f135385b + ", requestSource=" + this.f135386c + ", interceptLoad=" + this.f135387d + ", extraData=" + this.f135388e + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!l.a(this.f135384a, dVar.f135384a) || this.f135385b != dVar.f135385b || !l.a(this.f135386c, dVar.f135386c) || this.f135387d != dVar.f135387d || !l.a(this.f135388e, dVar.f135388e)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(Effect effect, int i2, a aVar, Bundle bundle) {
        super((byte) 0);
        l.d(aVar, "");
        this.f135384a = effect;
        this.f135385b = i2;
        this.f135386c = aVar;
        this.f135387d = false;
        this.f135388e = bundle;
    }

    public /* synthetic */ d(Effect effect, int i2, a aVar, Bundle bundle, byte b2) {
        this(effect, i2, aVar, bundle);
    }
}
