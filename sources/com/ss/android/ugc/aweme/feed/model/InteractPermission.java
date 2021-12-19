package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class InteractPermission implements Serializable {
    @c(a = "duet")
    public int duet;
    @c(a = "duet_privacy_setting")
    public int duetPrivacySettingControl;
    @c(a = "stitch")
    public int stitch;
    @c(a = "stitch_privacy_setting")
    public int stitchPrivacySettingControl;
    @c(a = "upvote")
    public int upvote;

    static {
        Covode.recordClassIndex(59404);
    }

    public final int getDuet() {
        return this.duet;
    }

    public final int getDuetPrivacySettingControl() {
        return this.duetPrivacySettingControl;
    }

    public final int getStitch() {
        return this.stitch;
    }

    public final int getStitchPrivacySettingControl() {
        return this.stitchPrivacySettingControl;
    }

    public final int getUpvote() {
        return this.upvote;
    }

    public final void setDuet(int i2) {
        this.duet = i2;
    }

    public final void setDuetPrivacySettingControl(int i2) {
        this.duetPrivacySettingControl = i2;
    }

    public final void setStitch(int i2) {
        this.stitch = i2;
    }

    public final void setStitchPrivacySettingControl(int i2) {
        this.stitchPrivacySettingControl = i2;
    }

    public final void setUpvote(int i2) {
        this.upvote = i2;
    }
}
