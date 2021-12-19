package com.ss.android.ugc.aweme.sticker.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

public final class b extends BaseResponse implements Serializable {
    @c(a = "challenge_id")
    private final String challengeId = "";
    @c(a = "challenge_name")
    private final String challengeName = "";
    @c(a = "guide_desc")
    private final String guideDesc = "";
    @c(a = "open_url")
    private final String openUrl = "";
    @c(a = "profile_image")
    private final String profileImage = "";

    static {
        Covode.recordClassIndex(88247);
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final String getChallengeName() {
        return this.challengeName;
    }

    public final String getGuideDesc() {
        return this.guideDesc;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getProfileImage() {
        return this.profileImage;
    }
}
