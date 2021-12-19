package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.shortvideo.q;
import com.ss.android.ugc.aweme.tools.b.b;
import com.ss.android.ugc.aweme.tools.b.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class u implements b {

    /* renamed from: a  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.draft.model.b f131086a;

    static {
        Covode.recordClassIndex(85904);
    }

    u(com.ss.android.ugc.aweme.draft.model.b bVar) {
        this.f131086a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.tools.b.b
    public final String a(f fVar) {
        com.ss.android.ugc.aweme.draft.model.b bVar = this.f131086a;
        switch (q.AnonymousClass3.f129927a[fVar.ordinal()]) {
            case 1:
                return bVar.o;
            case 2:
                return bVar.p;
            case 3:
                return bVar.q;
            case 4:
                return bVar.r;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return bVar.s;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return bVar.t;
            default:
                return null;
        }
    }
}
