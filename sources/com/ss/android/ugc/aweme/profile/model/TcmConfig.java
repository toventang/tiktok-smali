package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;

public final class TcmConfig implements Serializable {
    @c(a = "bc_hashtag")
    private final BCHashtag bcHashtag;
    @c(a = "bc_usage_confirm_threshold")
    private final BcUsageConfirmThreshold bcUsageConfirmThreshold;
    @c(a = "can_use_branded_content_tool")
    private final boolean canUseBrandedContentTool;
    @c(a = "can_use_tcm_console")
    private final boolean canUseTcmConsole;
    @c(a = "check_ba_before_post")
    private final boolean checkBABeforePost;
    @c(a = "bc_hashtag_list")
    private final List<String> hashtagList;
    @c(a = "is_branded_content_creator")
    private final boolean isBrandedContentCreator;
    @c(a = "is_tcm_creator")
    private final boolean isTcmCreator;
    @c(a = "use_new_tcm_toggle")
    private final boolean useNewTcmToggle;

    static {
        Covode.recordClassIndex(75264);
    }

    public final BCHashtag getBcHashtag() {
        return this.bcHashtag;
    }

    public final BcUsageConfirmThreshold getBcUsageConfirmThreshold() {
        return this.bcUsageConfirmThreshold;
    }

    public final boolean getCanUseBrandedContentTool() {
        return this.canUseBrandedContentTool;
    }

    public final boolean getCanUseTcmConsole() {
        return this.canUseTcmConsole;
    }

    public final boolean getCheckBABeforePost() {
        return this.checkBABeforePost;
    }

    public final List<String> getHashtagList() {
        return this.hashtagList;
    }

    public final boolean getUseNewTcmToggle() {
        return this.useNewTcmToggle;
    }

    public final boolean isBrandedContentCreator() {
        return this.isBrandedContentCreator;
    }

    public final boolean isTcmCreator() {
        return this.isTcmCreator;
    }
}
