package com.ss.android.ugc.aweme.draft;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.DraftCheckResult;
import com.ss.android.ugc.aweme.port.in.g;

public final class p implements d {

    /* renamed from: a  reason: collision with root package name */
    private final String f83226a = "NonExecuteDraftCheckHandler";

    static {
        Covode.recordClassIndex(51887);
    }

    @Override // com.ss.android.ugc.aweme.draft.d
    public final DraftCheckResult a() {
        g.a().w();
        f.a(this.f83226a, "Code should not be executed to this branch !!!");
        return new DraftCheckResult(Integer.MAX_VALUE, null, null, 0, 14, null);
    }
}
