package com.ss.android.ugc.aweme.tools.draft.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.draft.model.DraftLoadResult;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.draft.model.f;
import com.ss.android.ugc.aweme.port.internal.d;
import h.f.b.l;

public final class b implements d {
    static {
        Covode.recordClassIndex(91383);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.d
    public final void a(DraftLoadResult draftLoadResult) {
        l.d(draftLoadResult, "");
        r.a("draft_load", new com.ss.android.ugc.tools.f.b().a("status", !draftLoadResult.isSuc()).a(f.a(draftLoadResult)).f149193a);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.d
    public final void a(DraftSaveResult draftSaveResult) {
        l.d(draftSaveResult, "");
        r.a("draft_save", new com.ss.android.ugc.tools.f.b().a("status", !draftSaveResult.isSuc()).a(f.a(draftSaveResult)).f149193a);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.d
    public final void a(int i2, String str, String str2) {
        l.d(str, "");
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("status", i2).a("creation_id", str);
        if (i2 == 1) {
            if (str2 == null) {
                str2 = "no reason";
            }
            a2.a("failed_reason", str2);
        }
        r.a("draft_recover", a2.f149193a);
    }
}
