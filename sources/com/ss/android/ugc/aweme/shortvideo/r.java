package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.draft.model.b;
import com.ss.android.ugc.aweme.shortvideo.q;
import com.ss.android.ugc.aweme.tools.b.a;
import com.ss.android.ugc.aweme.tools.b.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r implements a {

    /* renamed from: a  reason: collision with root package name */
    private final b f129963a;

    static {
        Covode.recordClassIndex(85291);
    }

    r(b bVar) {
        this.f129963a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.tools.b.a
    public final void a(f fVar, String str) {
        b bVar = this.f129963a;
        switch (q.AnonymousClass3.f129927a[fVar.ordinal()]) {
            case 1:
                bVar.o = str;
                return;
            case 2:
                bVar.p = str;
                return;
            case 3:
                bVar.q = str;
                return;
            case 4:
                bVar.r = str;
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                bVar.s = str;
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                bVar.t = str;
                return;
            default:
                return;
        }
    }
}
