package com.ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.tools.utils.i;
import java.io.Serializable;

public final class ea implements Serializable {
    public static int BEATES_FILE_BEATS_A0 = 2;
    public static int BEATES_FILE_CUSTOM = 3;
    public static int BEATES_FILE_DEFAULT;
    public static int BEATES_FILE_SERVER_C = 1;
    public static final a Companion = new a((byte) 0);
    @c(a = "alg_type")
    private int algType = BEATES_FILE_DEFAULT;
    @c(a = "defaultlocal_path")
    private String defaultLocalPath;
    @c(a = "defaultlocal_url")
    private String defaultLocalUrl;
    @c(a = "downbeats_path")
    private String downBeatsPath;
    @c(a = "downbeats_url")
    private String downBeatsUrl;
    @c(a = "manmodebeats_path")
    private String manModeBeatsPath;
    @c(a = "manmodebeats_url")
    private String manModeBeatsUrl;
    @c(a = "max_seg")
    private int maxSeg;
    @c(a = "min_seg")
    private int minSeg;
    @c(a = "music_id")
    private String musicId;
    @c(a = "nostrengthbeats_path")
    private String noStrengthBeatsPath;
    @c(a = "nostrengthbeats_url")
    private String noStrengthBeatsUrl;
    @c(a = "vebeats_path")
    private String veBeatsPath;
    @c(a = "vebeats_url")
    private String veBeatsUrl;

    public static final class a {
        static {
            Covode.recordClassIndex(83085);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getAlgType() {
        return this.algType;
    }

    public final String getDefaultLocalPath() {
        return this.defaultLocalPath;
    }

    public final String getDefaultLocalUrl() {
        return this.defaultLocalUrl;
    }

    public final String getDownBeatsPath() {
        return this.downBeatsPath;
    }

    public final String getDownBeatsUrl() {
        return this.downBeatsUrl;
    }

    public final String getManModeBeatsPath() {
        return this.manModeBeatsPath;
    }

    public final String getManModeBeatsUrl() {
        return this.manModeBeatsUrl;
    }

    public final int getMaxSeg() {
        return this.maxSeg;
    }

    public final int getMinSeg() {
        return this.minSeg;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getNoStrengthBeatsPath() {
        return this.noStrengthBeatsPath;
    }

    public final String getNoStrengthBeatsUrl() {
        return this.noStrengthBeatsUrl;
    }

    public final String getVeBeatsPath() {
        return this.veBeatsPath;
    }

    public final String getVeBeatsUrl() {
        return this.veBeatsUrl;
    }

    public final boolean existOnSetAlgFile() {
        return i.a(this.veBeatsPath);
    }

    public final boolean hasOnSetAlgUrl() {
        if (!TextUtils.isEmpty(this.veBeatsUrl)) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(83084);
    }

    public final boolean isSuccessivelyAlgType() {
        int i2 = this.algType;
        if (i2 == BEATES_FILE_SERVER_C || i2 == BEATES_FILE_BEATS_A0 || i2 == BEATES_FILE_CUSTOM) {
            return true;
        }
        return false;
    }

    public final boolean existSuccessivelyAlgFile() {
        int i2 = this.algType;
        if (i2 == BEATES_FILE_BEATS_A0) {
            return i.a(this.veBeatsPath);
        }
        if (i2 == BEATES_FILE_SERVER_C) {
            return i.a(this.downBeatsPath);
        }
        if (i2 == BEATES_FILE_CUSTOM) {
            return i.a(this.manModeBeatsPath);
        }
        return false;
    }

    public final boolean hasSuccessivelyAlgUrl() {
        int i2 = this.algType;
        if (i2 == BEATES_FILE_BEATS_A0) {
            if (!TextUtils.isEmpty(this.veBeatsUrl)) {
                return true;
            }
            return false;
        } else if (i2 == BEATES_FILE_SERVER_C) {
            if (!TextUtils.isEmpty(this.downBeatsUrl)) {
                return true;
            }
            return false;
        } else if (i2 != BEATES_FILE_CUSTOM || TextUtils.isEmpty(this.manModeBeatsUrl)) {
            return false;
        } else {
            return true;
        }
    }

    public final void setAlgType(int i2) {
        this.algType = i2;
    }

    public final void setDefaultLocalPath(String str) {
        this.defaultLocalPath = str;
    }

    public final void setDefaultLocalUrl(String str) {
        this.defaultLocalUrl = str;
    }

    public final void setDownBeatsPath(String str) {
        this.downBeatsPath = str;
    }

    public final void setDownBeatsUrl(String str) {
        this.downBeatsUrl = str;
    }

    public final void setManModeBeatsPath(String str) {
        this.manModeBeatsPath = str;
    }

    public final void setManModeBeatsUrl(String str) {
        this.manModeBeatsUrl = str;
    }

    public final void setMaxSeg(int i2) {
        this.maxSeg = i2;
    }

    public final void setMinSeg(int i2) {
        this.minSeg = i2;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setNoStrengthBeatsPath(String str) {
        this.noStrengthBeatsPath = str;
    }

    public final void setNoStrengthBeatsUrl(String str) {
        this.noStrengthBeatsUrl = str;
    }

    public final void setVeBeatsPath(String str) {
        this.veBeatsPath = str;
    }

    public final void setVeBeatsUrl(String str) {
        this.veBeatsUrl = str;
    }
}
