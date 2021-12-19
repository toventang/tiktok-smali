package com.ss.android.ugc.aweme.effect;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.e.b;
import com.ss.android.ugc.aweme.effectplatform.c;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import h.f.b.l;

public final class n implements b {

    /* renamed from: a  reason: collision with root package name */
    private f f88953a;

    static {
        Covode.recordClassIndex(55946);
    }

    @Override // com.ss.android.ugc.aweme.effect.e.b
    public final void a() {
        f fVar = this.f88953a;
        if (fVar != null) {
            fVar.destroy();
        }
        this.f88953a = null;
    }

    @Override // com.ss.android.ugc.aweme.effect.e.b
    public final void a(IFetchEffectChannelListener iFetchEffectChannelListener) {
        l.d(iFetchEffectChannelListener, "");
        if (this.f88953a == null) {
            Application application = i.f115645a;
            l.b(application, "");
            this.f88953a = c.a(application, null);
        }
        f fVar = this.f88953a;
        if (fVar != null) {
            fVar.a("editingeffect", false, iFetchEffectChannelListener);
        }
    }
}
