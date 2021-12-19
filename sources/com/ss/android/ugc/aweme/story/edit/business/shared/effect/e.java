package com.ss.android.ugc.aweme.story.edit.business.shared.effect;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.e.b;
import com.ss.android.ugc.aweme.effectplatform.c;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import h.f.b.l;

public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f137377a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private f f137378b;

    static {
        Covode.recordClassIndex(89849);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89850);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.effect.e.b
    public final void a() {
        f fVar = this.f137378b;
        if (fVar != null) {
            fVar.destroy();
        }
        this.f137378b = null;
    }

    @Override // com.ss.android.ugc.aweme.effect.e.b
    public final void a(IFetchEffectChannelListener iFetchEffectChannelListener) {
        l.d(iFetchEffectChannelListener, "");
        if (this.f137378b == null) {
            Application application = i.f115645a;
            l.b(application, "");
            this.f137378b = c.a(application, null);
        }
        f fVar = this.f137378b;
        if (fVar != null) {
            fVar.a("story-editeffects", false, iFetchEffectChannelListener);
        }
    }
}
