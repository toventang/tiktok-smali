package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;

public class HotSearchSprintStruct implements Serializable {
    private static final long serialVersionUID = 1;
    @c(a = "followers")
    public List<User> hitRankPeoples;
    @c(a = "sprint")
    public int sprint;

    static {
        Covode.recordClassIndex(75230);
    }

    public List<User> getHitRankPeoples() {
        return this.hitRankPeoples;
    }

    public int getSprint() {
        return this.sprint;
    }

    public void setHitRankPeoples(List<User> list) {
        this.hitRankPeoples = list;
    }

    public void setSprint(int i2) {
        this.sprint = i2;
    }
}
