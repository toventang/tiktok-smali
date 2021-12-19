package com.ss.android.ugc.aweme.draft.model;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

public final class DraftDBSaveException {
    private final int errorCode;
    private final Throwable throwable;

    static {
        Covode.recordClassIndex(51850);
    }

    public DraftDBSaveException() {
        this(0, null, 3, null);
    }

    public static int com_ss_android_ugc_aweme_draft_model_DraftDBSaveException_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ DraftDBSaveException copy$default(DraftDBSaveException draftDBSaveException, int i2, Throwable th, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = draftDBSaveException.errorCode;
        }
        if ((i3 & 2) != 0) {
            th = draftDBSaveException.throwable;
        }
        return draftDBSaveException.copy(i2, th);
    }

    public final int component1() {
        return this.errorCode;
    }

    public final Throwable component2() {
        return this.throwable;
    }

    public final DraftDBSaveException copy(int i2, Throwable th) {
        return new DraftDBSaveException(i2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftDBSaveException)) {
            return false;
        }
        DraftDBSaveException draftDBSaveException = (DraftDBSaveException) obj;
        return this.errorCode == draftDBSaveException.errorCode && l.a(this.throwable, draftDBSaveException.throwable);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_draft_model_DraftDBSaveException_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_draft_model_DraftDBSaveException_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.errorCode) * 31;
        Throwable th = this.throwable;
        return com_ss_android_ugc_aweme_draft_model_DraftDBSaveException_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "DraftDBSaveException(errorCode=" + this.errorCode + ", throwable=" + this.throwable + ")";
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

    public DraftDBSaveException(int i2, Throwable th) {
        this.errorCode = i2;
        this.throwable = th;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DraftDBSaveException(int i2, Throwable th, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0 : i2, (i3 & 2) != 0 ? null : th);
    }
}
