package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class LiveAnchorInfo implements Serializable {
    @c(a = "scheduled_master_switch")
    private boolean globalSwitch;
    @c(a = "scheduled_profile_switch")
    private boolean profileSwitch;
    @c(a = "scheduled_time_text")
    private String scheduledTimeText;

    static {
        Covode.recordClassIndex(75237);
    }

    public String getScheduledTimeText() {
        return this.scheduledTimeText;
    }

    public boolean isGlobalSwitch() {
        return this.globalSwitch;
    }

    public boolean isProfileSwitch() {
        return this.profileSwitch;
    }

    public void setGlobalSwitch(boolean z) {
        this.globalSwitch = z;
    }

    public void setProfileSwitch(boolean z) {
        this.profileSwitch = z;
    }

    public void setScheduledTimeText(String str) {
        this.scheduledTimeText = str;
    }
}
