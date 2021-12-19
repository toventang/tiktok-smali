package com.ss.android.ugc.aweme.tools.live.sticker;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.f.d;
import com.ss.android.ugc.aweme.sticker.l.a;
import com.ss.android.ugc.aweme.sticker.m.h;
import com.ss.android.ugc.aweme.sticker.m.j;
import com.ss.android.ugc.aweme.sticker.m.k;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class c implements h {

    /* renamed from: a  reason: collision with root package name */
    public a f140242a;

    static {
        Covode.recordClassIndex(91627);
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.h
    public final void a(long j2, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.h
    public final void a(Effect effect, boolean z, String str) {
        l.d(effect, "");
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.h
    public final void a(String str) {
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.h
    public final void a(String str, long j2) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.h
    public final j a() {
        return k.f134967a;
    }

    private c() {
        this.f140242a = null;
    }

    public /* synthetic */ c(byte b2) {
        this();
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.h
    public final void a(Effect effect, String str, String str2, int i2) {
        l.d(effect, "");
        l.d(str2, "");
        effect.getEffectId();
        if (this.f140242a != null && d.a(effect) == null) {
            l.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.m.h
    public final void a(Effect effect, boolean z, String str, String str2, int i2, boolean z2, Bundle bundle) {
        l.d(effect, "");
        l.d(str2, "");
        effect.getEffectId();
        if (this.f140242a != null && d.a(effect) == null) {
            l.b();
        }
    }
}
