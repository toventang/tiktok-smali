package com.ss.android.vesdk.clipparam;

import com.bytedance.covode.number.Covode;

public class VEAlgorithmPath {
    public static int BEATES_FILE_BEATS_A0 = 2;
    public static int BEATES_FILE_CUSTOM = 3;
    public static int BEATES_FILE_DEFAULT;
    public static int BEATES_FILE_SERVER_C = 1;
    public static int INTMODE_ONSET;
    public static int MODE_SUCCESSIVELY = 1;
    String downBeatsPath;
    String manMadePath;
    int mode = INTMODE_ONSET;
    String noStrengthBeatsPath;
    String onlineBeatsPath;
    int type;
    String veBeatsPath;

    public String getDownBeatsPath() {
        return this.downBeatsPath;
    }

    public String getManMadePath() {
        return this.manMadePath;
    }

    public int getMode() {
        return this.mode;
    }

    public String getNoStrengthBeatsPath() {
        return this.noStrengthBeatsPath;
    }

    public String getOnlineBeatsPath() {
        return this.onlineBeatsPath;
    }

    public int getType() {
        return this.type;
    }

    public String getVeBeatsPath() {
        return this.veBeatsPath;
    }

    static {
        Covode.recordClassIndex(99370);
    }

    public String toString() {
        String str = "";
        if (this.veBeatsPath != null) {
            str = str + " veBeatsPath: " + this.veBeatsPath;
        }
        if (this.downBeatsPath != null) {
            str = str + " downBeatsPath: " + this.downBeatsPath;
        }
        if (this.noStrengthBeatsPath != null) {
            str = str + " noStrengthBeatsPath: " + this.noStrengthBeatsPath;
        }
        if (this.onlineBeatsPath != null) {
            str = str + " onlineBeatsPath: " + this.onlineBeatsPath;
        }
        if (this.manMadePath != null) {
            str = str + " manMadePath: " + this.manMadePath;
        }
        return (str + " mode: " + this.mode) + " type: " + this.type;
    }

    public void setDownBeatsPath(String str) {
        this.downBeatsPath = str;
    }

    public void setManMadePath(String str) {
        this.manMadePath = str;
    }

    public void setMode(int i2) {
        this.mode = i2;
    }

    public void setNoStrengthBeatsPath(String str) {
        this.noStrengthBeatsPath = str;
    }

    public void setOnlineBeatsPath(String str) {
        this.onlineBeatsPath = str;
    }

    public void setType(int i2) {
        this.type = i2;
    }

    public void setVeBeatsPath(String str) {
        this.veBeatsPath = str;
    }
}
