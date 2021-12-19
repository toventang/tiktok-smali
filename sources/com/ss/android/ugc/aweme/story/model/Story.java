package com.ss.android.ugc.aweme.story.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public class Story implements Cloneable {
    List<Aweme> awemes;
    @c(a = "skylight_display_tag")
    public String skyLightDisplayTag;
    @c(a = "status")
    int status;
    @c(a = StringSet.type)
    public int type;
    @c(a = "update_time")
    long updateTime;
    @c(a = "user_info")
    User userInfo;

    static {
        Covode.recordClassIndex(90267);
    }

    public void setRead() {
        this.status = 1;
    }

    public List<Aweme> getAwemes() {
        return this.awemes;
    }

    public int getStatus() {
        return this.status;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public User getUserInfo() {
        return this.userInfo;
    }

    public boolean isRead() {
        if (this.status == 1) {
            return true;
        }
        return false;
    }

    public boolean isStory() {
        if (this.type == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public Story clone() {
        try {
            return (Story) super.clone();
        } catch (CloneNotSupportedException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public String getLiveUid() {
        User user = this.userInfo;
        if (user == null) {
            return "";
        }
        return user.getLiveUid();
    }

    public boolean isFollowing() {
        if (this.type == 2) {
            return true;
        }
        return false;
    }

    public boolean isLive() {
        int i2 = this.type;
        if (i2 == 1 || i2 == 5 || i2 == 6) {
            return true;
        }
        return false;
    }

    public boolean isNewLiveType() {
        int i2 = this.type;
        if (i2 == 5 || i2 == 6) {
            return true;
        }
        return false;
    }

    public String getUid() {
        if (getUserInfo() == null) {
            return null;
        }
        return getUserInfo().getUid();
    }

    public String toString() {
        return "Story{status=" + this.status + ", userInfo=" + this.userInfo + '}';
    }

    public void setAwemes(List<Aweme> list) {
        this.awemes = list;
    }

    public void setStatus(int i2) {
        this.status = i2;
    }

    public void setUpdateTime(long j2) {
        this.updateTime = j2;
    }

    public void setUserInfo(User user) {
        this.userInfo = user;
    }
}
