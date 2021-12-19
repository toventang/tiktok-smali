package com.ss.android.ugc.aweme.draft.model;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class DraftCheckResult {
    private final int checkStage;
    private final int fileCount;
    private final List<DraftFileCheckResult> invalidFileList;
    private final List<DraftVECheckResult> invalidVEFileList;

    static {
        Covode.recordClassIndex(51849);
    }

    public DraftCheckResult(int i2) {
        this(i2, null, null, 0, 14, null);
    }

    public DraftCheckResult(int i2, List<DraftFileCheckResult> list) {
        this(i2, list, null, 0, 12, null);
    }

    public DraftCheckResult(int i2, List<DraftFileCheckResult> list, List<DraftVECheckResult> list2) {
        this(i2, list, list2, 0, 8, null);
    }

    public static int com_ss_android_ugc_aweme_draft_model_DraftCheckResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.draft.model.DraftCheckResult */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DraftCheckResult copy$default(DraftCheckResult draftCheckResult, int i2, List list, List list2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = draftCheckResult.fileCount;
        }
        if ((i4 & 2) != 0) {
            list = draftCheckResult.invalidFileList;
        }
        if ((i4 & 4) != 0) {
            list2 = draftCheckResult.invalidVEFileList;
        }
        if ((i4 & 8) != 0) {
            i3 = draftCheckResult.checkStage;
        }
        return draftCheckResult.copy(i2, list, list2, i3);
    }

    public final int component1() {
        return this.fileCount;
    }

    public final List<DraftFileCheckResult> component2() {
        return this.invalidFileList;
    }

    public final List<DraftVECheckResult> component3() {
        return this.invalidVEFileList;
    }

    public final int component4() {
        return this.checkStage;
    }

    public final DraftCheckResult copy(int i2, List<DraftFileCheckResult> list, List<DraftVECheckResult> list2, int i3) {
        l.d(list, "");
        return new DraftCheckResult(i2, list, list2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftCheckResult)) {
            return false;
        }
        DraftCheckResult draftCheckResult = (DraftCheckResult) obj;
        return this.fileCount == draftCheckResult.fileCount && l.a(this.invalidFileList, draftCheckResult.invalidFileList) && l.a(this.invalidVEFileList, draftCheckResult.invalidVEFileList) && this.checkStage == draftCheckResult.checkStage;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_draft_model_DraftCheckResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_draft_model_DraftCheckResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.fileCount) * 31;
        List<DraftFileCheckResult> list = this.invalidFileList;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_draft_model_DraftCheckResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<DraftVECheckResult> list2 = this.invalidVEFileList;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return ((hashCode + i2) * 31) + com_ss_android_ugc_aweme_draft_model_DraftCheckResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.checkStage);
    }

    public final String toString() {
        return "DraftCheckResult(fileCount=" + this.fileCount + ", invalidFileList=" + this.invalidFileList + ", invalidVEFileList=" + this.invalidVEFileList + ", checkStage=" + this.checkStage + ")";
    }

    public final int getCheckStage() {
        return this.checkStage;
    }

    public final int getFileCount() {
        return this.fileCount;
    }

    public final List<DraftFileCheckResult> getInvalidFileList() {
        return this.invalidFileList;
    }

    public final List<DraftVECheckResult> getInvalidVEFileList() {
        return this.invalidVEFileList;
    }

    public final boolean isSuc() {
        List<DraftVECheckResult> list;
        if (this.fileCount <= 0 || !this.invalidFileList.isEmpty() || ((list = this.invalidVEFileList) != null && !list.isEmpty())) {
            return false;
        }
        return true;
    }

    public final int getErrorCode() {
        if (isSuc()) {
            return 0;
        }
        if (!this.invalidFileList.isEmpty()) {
            return ((DraftFileCheckResult) n.g((List) this.invalidFileList)).getErrorCode();
        }
        List<DraftVECheckResult> list = this.invalidVEFileList;
        if (list == null || list.isEmpty()) {
            return -103;
        }
        return ((DraftVECheckResult) n.g((List) this.invalidVEFileList)).getErrorCode();
    }

    public DraftCheckResult(int i2, List<DraftFileCheckResult> list, List<DraftVECheckResult> list2, int i3) {
        l.d(list, "");
        this.fileCount = i2;
        this.invalidFileList = list;
        this.invalidVEFileList = list2;
        this.checkStage = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DraftCheckResult(int i2, List list, List list2, int i3, int i4, g gVar) {
        this(i2, (i4 & 2) != 0 ? z.INSTANCE : list, (i4 & 4) != 0 ? null : list2, (i4 & 8) != 0 ? 0 : i3);
    }
}
