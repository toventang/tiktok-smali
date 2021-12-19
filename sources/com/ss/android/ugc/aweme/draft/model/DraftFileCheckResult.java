package com.ss.android.ugc.aweme.draft.model;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

public final class DraftFileCheckResult {
    private final int errorCode;
    private final String path;

    static {
        Covode.recordClassIndex(51854);
    }

    public DraftFileCheckResult() {
        this(0, null, 3, null);
    }

    public static int com_ss_android_ugc_aweme_draft_model_DraftFileCheckResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ DraftFileCheckResult copy$default(DraftFileCheckResult draftFileCheckResult, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = draftFileCheckResult.errorCode;
        }
        if ((i3 & 2) != 0) {
            str = draftFileCheckResult.path;
        }
        return draftFileCheckResult.copy(i2, str);
    }

    public final int component1() {
        return this.errorCode;
    }

    public final String component2() {
        return this.path;
    }

    public final DraftFileCheckResult copy(int i2, String str) {
        return new DraftFileCheckResult(i2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftFileCheckResult)) {
            return false;
        }
        DraftFileCheckResult draftFileCheckResult = (DraftFileCheckResult) obj;
        return this.errorCode == draftFileCheckResult.errorCode && l.a(this.path, draftFileCheckResult.path);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_draft_model_DraftFileCheckResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_draft_model_DraftFileCheckResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.errorCode) * 31;
        String str = this.path;
        return com_ss_android_ugc_aweme_draft_model_DraftFileCheckResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "DraftFileCheckResult(errorCode=" + this.errorCode + ", path=" + this.path + ")";
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean isSuc() {
        if (this.errorCode == 0) {
            return true;
        }
        return false;
    }

    public DraftFileCheckResult(int i2, String str) {
        this.errorCode = i2;
        this.path = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DraftFileCheckResult(int i2, String str, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0 : i2, (i3 & 2) != 0 ? null : str);
    }
}
