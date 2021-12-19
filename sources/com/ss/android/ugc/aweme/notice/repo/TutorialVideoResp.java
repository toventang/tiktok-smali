package com.ss.android.ugc.aweme.notice.repo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.g;
import h.f.b.l;

public final class TutorialVideoResp extends BaseResponse {
    @c(a = "msg_info")
    private final TutorialVideoInfo info;

    static {
        Covode.recordClassIndex(72500);
    }

    public TutorialVideoResp() {
        this(null, 1, null);
    }

    public static /* synthetic */ TutorialVideoResp copy$default(TutorialVideoResp tutorialVideoResp, TutorialVideoInfo tutorialVideoInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            tutorialVideoInfo = tutorialVideoResp.info;
        }
        return tutorialVideoResp.copy(tutorialVideoInfo);
    }

    public final TutorialVideoInfo component1() {
        return this.info;
    }

    public final TutorialVideoResp copy(TutorialVideoInfo tutorialVideoInfo) {
        return new TutorialVideoResp(tutorialVideoInfo);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TutorialVideoResp) && l.a(this.info, ((TutorialVideoResp) obj).info);
        }
        return true;
    }

    public final int hashCode() {
        TutorialVideoInfo tutorialVideoInfo = this.info;
        if (tutorialVideoInfo != null) {
            return tutorialVideoInfo.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "TutorialVideoResp(info=" + this.info + ")";
    }

    public final TutorialVideoInfo getInfo() {
        return this.info;
    }

    public TutorialVideoResp(TutorialVideoInfo tutorialVideoInfo) {
        this.info = tutorialVideoInfo;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TutorialVideoResp(TutorialVideoInfo tutorialVideoInfo, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : tutorialVideoInfo);
    }
}
