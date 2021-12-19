package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class StoryBlockInfo implements Serializable {
    @c(a = "life_story_block")
    public boolean isBlock;
    @c(a = "life_story_blocked")
    public boolean isBlocked;

    static {
        Covode.recordClassIndex(75261);
    }

    public boolean isBlock() {
        return this.isBlock;
    }

    public boolean isBlocked() {
        return this.isBlocked;
    }

    public void setBlock(boolean z) {
        this.isBlock = z;
    }

    public void setBlocked(boolean z) {
        this.isBlocked = z;
    }
}
