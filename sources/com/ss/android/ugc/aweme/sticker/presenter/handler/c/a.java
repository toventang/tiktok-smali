package com.ss.android.ugc.aweme.sticker.presenter.handler.c;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final Effect f135378a;

    /* renamed from: b  reason: collision with root package name */
    public final int f135379b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sticker.d.b.a f135380c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f135381d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f135382e;

    static {
        Covode.recordClassIndex(88435);
    }

    /* access modifiers changed from: private */
    public static a a(Effect effect, int i2, com.ss.android.ugc.aweme.sticker.d.b.a aVar, Bundle bundle) {
        l.d(effect, "");
        l.d(aVar, "");
        return new a(effect, i2, aVar, true, bundle);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.c.c
    public final Effect a() {
        return this.f135378a;
    }

    public final int hashCode() {
        int i2;
        int i3;
        Effect effect = this.f135378a;
        int i4 = 0;
        if (effect != null) {
            i2 = effect.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = ((i2 * 31) + this.f135379b) * 31;
        com.ss.android.ugc.aweme.sticker.d.b.a aVar = this.f135380c;
        if (aVar != null) {
            i3 = aVar.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        boolean z = this.f135381d;
        if (z) {
            z = true;
        }
        int i7 = z ? 1 : 0;
        int i8 = z ? 1 : 0;
        int i9 = z ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        Bundle bundle = this.f135382e;
        if (bundle != null) {
            i4 = bundle.hashCode();
        }
        return i10 + i4;
    }

    public final String toString() {
        return "SelectedStickerHandleSession(sticker=" + this.f135378a + ", clickPosition=" + this.f135379b + ", requestSource=" + this.f135380c + ", interceptLoad=" + this.f135381d + ", extraData=" + this.f135382e + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!l.a(this.f135378a, aVar.f135378a) || this.f135379b != aVar.f135379b || !l.a(this.f135380c, aVar.f135380c) || this.f135381d != aVar.f135381d || !l.a(this.f135382e, aVar.f135382e)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ a(Effect effect, int i2, com.ss.android.ugc.aweme.sticker.d.b.a aVar, Bundle bundle) {
        this(effect, i2, aVar, false, bundle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Effect effect, int i2, com.ss.android.ugc.aweme.sticker.d.b.a aVar, boolean z, Bundle bundle) {
        super((byte) 0);
        l.d(effect, "");
        l.d(aVar, "");
        this.f135378a = effect;
        this.f135379b = i2;
        this.f135380c = aVar;
        this.f135381d = z;
        this.f135382e = bundle;
    }
}
