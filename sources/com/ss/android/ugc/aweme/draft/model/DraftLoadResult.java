package com.ss.android.ugc.aweme.draft.model;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

public final class DraftLoadResult {
    private final DraftCheckResult checkResult;
    private final String creationId;
    private final int draftType;
    private final boolean isStoryDraft;
    private final long saveDraftAppVersion;
    private final String saveDraftTime;

    static {
        Covode.recordClassIndex(51857);
    }

    public static int com_ss_android_ugc_aweme_draft_model_DraftLoadResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_draft_model_DraftLoadResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ DraftLoadResult copy$default(DraftLoadResult draftLoadResult, String str, int i2, String str2, long j2, DraftCheckResult draftCheckResult, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = draftLoadResult.creationId;
        }
        if ((i3 & 2) != 0) {
            i2 = draftLoadResult.draftType;
        }
        if ((i3 & 4) != 0) {
            str2 = draftLoadResult.saveDraftTime;
        }
        if ((i3 & 8) != 0) {
            j2 = draftLoadResult.saveDraftAppVersion;
        }
        if ((i3 & 16) != 0) {
            draftCheckResult = draftLoadResult.checkResult;
        }
        if ((i3 & 32) != 0) {
            z = draftLoadResult.isStoryDraft;
        }
        return draftLoadResult.copy(str, i2, str2, j2, draftCheckResult, z);
    }

    public final String component1() {
        return this.creationId;
    }

    public final int component2() {
        return this.draftType;
    }

    public final String component3() {
        return this.saveDraftTime;
    }

    public final long component4() {
        return this.saveDraftAppVersion;
    }

    public final DraftCheckResult component5() {
        return this.checkResult;
    }

    public final boolean component6() {
        return this.isStoryDraft;
    }

    public final DraftLoadResult copy(String str, int i2, String str2, long j2, DraftCheckResult draftCheckResult, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        l.d(draftCheckResult, "");
        return new DraftLoadResult(str, i2, str2, j2, draftCheckResult, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftLoadResult)) {
            return false;
        }
        DraftLoadResult draftLoadResult = (DraftLoadResult) obj;
        return l.a(this.creationId, draftLoadResult.creationId) && this.draftType == draftLoadResult.draftType && l.a(this.saveDraftTime, draftLoadResult.saveDraftTime) && this.saveDraftAppVersion == draftLoadResult.saveDraftAppVersion && l.a(this.checkResult, draftLoadResult.checkResult) && this.isStoryDraft == draftLoadResult.isStoryDraft;
    }

    public final int hashCode() {
        String str = this.creationId;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_draft_model_DraftLoadResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.draftType)) * 31;
        String str2 = this.saveDraftTime;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_draft_model_DraftLoadResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.saveDraftAppVersion)) * 31;
        DraftCheckResult draftCheckResult = this.checkResult;
        if (draftCheckResult != null) {
            i2 = draftCheckResult.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z = this.isStoryDraft;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "DraftLoadResult(creationId=" + this.creationId + ", draftType=" + this.draftType + ", saveDraftTime=" + this.saveDraftTime + ", saveDraftAppVersion=" + this.saveDraftAppVersion + ", checkResult=" + this.checkResult + ", isStoryDraft=" + this.isStoryDraft + ")";
    }

    public final DraftCheckResult getCheckResult() {
        return this.checkResult;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final int getDraftType() {
        return this.draftType;
    }

    public final long getSaveDraftAppVersion() {
        return this.saveDraftAppVersion;
    }

    public final String getSaveDraftTime() {
        return this.saveDraftTime;
    }

    public final boolean isStoryDraft() {
        return this.isStoryDraft;
    }

    public final int getErrorCode() {
        return this.checkResult.getErrorCode();
    }

    public final boolean isSuc() {
        if (getErrorCode() == 0) {
            return true;
        }
        return false;
    }

    public DraftLoadResult(String str, int i2, String str2, long j2, DraftCheckResult draftCheckResult, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        l.d(draftCheckResult, "");
        this.creationId = str;
        this.draftType = i2;
        this.saveDraftTime = str2;
        this.saveDraftAppVersion = j2;
        this.checkResult = draftCheckResult;
        this.isStoryDraft = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DraftLoadResult(String str, int i2, String str2, long j2, DraftCheckResult draftCheckResult, boolean z, int i3, g gVar) {
        this(str, i2, str2, j2, (i3 & 16) != 0 ? new DraftCheckResult(1, null, null, 0, 14, null) : draftCheckResult, (i3 & 32) != 0 ? false : z);
    }
}
