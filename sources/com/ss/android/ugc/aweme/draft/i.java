package com.ss.android.ugc.aweme.draft;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import h.f.b.l;
import h.m.p;

public final class i {
    static {
        Covode.recordClassIndex(51842);
    }

    public static final boolean a(DraftSaveResult draftSaveResult) {
        String message;
        String str = "";
        l.d(draftSaveResult, str);
        if (draftSaveResult.isSuc()) {
            return false;
        }
        if (draftSaveResult.getSaveFileResult().getSaveException().getThrowable() instanceof c) {
            return true;
        }
        Throwable throwable = draftSaveResult.getSaveFileResult().getSaveException().getThrowable();
        if (!(throwable == null || (message = throwable.getMessage()) == null)) {
            str = message;
        }
        if (p.a((CharSequence) str, (CharSequence) "disk is full", true) || p.a((CharSequence) str, (CharSequence) "No space left on device", true) || p.a((CharSequence) str, (CharSequence) "database or disk is full", true)) {
            return true;
        }
        return false;
    }
}
