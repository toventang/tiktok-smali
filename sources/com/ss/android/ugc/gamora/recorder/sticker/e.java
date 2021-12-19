package com.ss.android.ugc.gamora.recorder.sticker;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.d.b;
import com.ss.android.ugc.aweme.sticker.d.c;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private final m f148476a;

    static {
        Covode.recordClassIndex(97875);
    }

    public e(m mVar) {
        l.d(mVar, "");
        this.f148476a = mVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.d.c
    public final boolean a(Effect effect, o oVar) {
        l.d(oVar, "");
        if (g.i(effect)) {
            i lifecycle = this.f148476a.getLifecycle();
            l.b(lifecycle, "");
            if (!lifecycle.a().isAtLeast(i.b.STARTED)) {
                return false;
            }
        }
        return b.f134764a.a(effect, oVar);
    }
}
