package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class GameInfo implements Serializable {
    @c(a = "game_score")
    public int gameScore;
    @c(a = "game_type")
    public int gameType;

    static {
        Covode.recordClassIndex(59391);
    }

    public int getGameScore() {
        return this.gameScore;
    }

    public int getGameType() {
        return this.gameType;
    }

    public void setGameScore(int i2) {
        this.gameScore = i2;
    }

    public void setGameType(int i2) {
        this.gameType = i2;
    }
}
