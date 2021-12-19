package com.ss.android.ugc.aweme.draft.model;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

public final class DraftFileSaveException {
    private final int errorCode;
    private final Throwable throwable;

    static {
        Covode.recordClassIndex(51855);
    }

    public DraftFileSaveException() {
        this(0, null, 3, null);
    }

    public static int com_ss_android_ugc_aweme_draft_model_DraftFileSaveException_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ DraftFileSaveException copy$default(DraftFileSaveException draftFileSaveException, int i2, Throwable th, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = draftFileSaveException.errorCode;
        }
        if ((i3 & 2) != 0) {
            th = draftFileSaveException.throwable;
        }
        return draftFileSaveException.copy(i2, th);
    }

    public final int component1() {
        return this.errorCode;
    }

    public final Throwable component2() {
        return this.throwable;
    }

    public final DraftFileSaveException copy(int i2, Throwable th) {
        return new DraftFileSaveException(i2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftFileSaveException)) {
            return false;
        }
        DraftFileSaveException draftFileSaveException = (DraftFileSaveException) obj;
        return this.errorCode == draftFileSaveException.errorCode && l.a(this.throwable, draftFileSaveException.throwable);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_draft_model_DraftFileSaveException_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_draft_model_DraftFileSaveException_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.errorCode) * 31;
        Throwable th = this.throwable;
        return com_ss_android_ugc_aweme_draft_model_DraftFileSaveException_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "DraftFileSaveException(errorCode=" + this.errorCode + ", throwable=" + this.throwable + ")";
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final boolean isSuc() {
        if (this.errorCode == 0) {
            return true;
        }
        return false;
    }

    public DraftFileSaveException(int i2, Throwable th) {
        this.errorCode = i2;
        this.throwable = th;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DraftFileSaveException(int i2, Throwable th, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0 : i2, (i3 & 2) != 0 ? null : th);
    }
}
