package com.ss.android.ugc.aweme.draft.model;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

public final class DraftFileSaveResult {
    private final DraftFileSaveException saveException;
    private final int saveType;

    static {
        Covode.recordClassIndex(51856);
    }

    public DraftFileSaveResult() {
        this(0, null, 3, null);
    }

    public static int com_ss_android_ugc_aweme_draft_model_DraftFileSaveResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ DraftFileSaveResult copy$default(DraftFileSaveResult draftFileSaveResult, int i2, DraftFileSaveException draftFileSaveException, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = draftFileSaveResult.saveType;
        }
        if ((i3 & 2) != 0) {
            draftFileSaveException = draftFileSaveResult.saveException;
        }
        return draftFileSaveResult.copy(i2, draftFileSaveException);
    }

    public final int component1() {
        return this.saveType;
    }

    public final DraftFileSaveException component2() {
        return this.saveException;
    }

    public final DraftFileSaveResult copy(int i2, DraftFileSaveException draftFileSaveException) {
        l.d(draftFileSaveException, "");
        return new DraftFileSaveResult(i2, draftFileSaveException);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftFileSaveResult)) {
            return false;
        }
        DraftFileSaveResult draftFileSaveResult = (DraftFileSaveResult) obj;
        return this.saveType == draftFileSaveResult.saveType && l.a(this.saveException, draftFileSaveResult.saveException);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_draft_model_DraftFileSaveResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_draft_model_DraftFileSaveResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.saveType) * 31;
        DraftFileSaveException draftFileSaveException = this.saveException;
        return com_ss_android_ugc_aweme_draft_model_DraftFileSaveResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (draftFileSaveException != null ? draftFileSaveException.hashCode() : 0);
    }

    public final String toString() {
        return "DraftFileSaveResult(saveType=" + this.saveType + ", saveException=" + this.saveException + ")";
    }

    public final DraftFileSaveException getSaveException() {
        return this.saveException;
    }

    public final int getSaveType() {
        return this.saveType;
    }

    public final boolean isSuc() {
        return this.saveException.isSuc();
    }

    public DraftFileSaveResult(int i2, DraftFileSaveException draftFileSaveException) {
        l.d(draftFileSaveException, "");
        this.saveType = i2;
        this.saveException = draftFileSaveException;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DraftFileSaveResult(int i2, DraftFileSaveException draftFileSaveException, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0 : i2, (i3 & 2) != 0 ? new DraftFileSaveException(0, null, 3, null) : draftFileSaveException);
    }
}
