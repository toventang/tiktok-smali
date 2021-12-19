package com.ss.android.ugc.aweme.simreporter;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class InitInfo {
    private String playerName = "tiktok-ttplayer";
    private String playerVersion = "";
    private String uid = "";

    static {
        Covode.recordClassIndex(87396);
    }

    public final String getPlayerName() {
        return this.playerName;
    }

    public final String getPlayerVersion() {
        return this.playerVersion;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String toString() {
        return "InitInfo(uid='" + this.uid + "', playerName='" + this.playerName + "', playerVersion='" + this.playerVersion + "')";
    }

    public final void setPlayerName(String str) {
        l.c(str, "");
        this.playerName = str;
    }

    public final void setPlayerVersion(String str) {
        l.c(str, "");
        this.playerVersion = str;
    }

    public final void setUid(String str) {
        l.c(str, "");
        this.uid = str;
    }
}
