package com.ss.android.ugc.aweme.player.sdk.b;

import com.bytedance.covode.number.Covode;

public enum b {
    Undefine("", ""),
    Standard("360p", "medium"),
    High("480p", "higher"),
    SuperHigh("720p", "highest"),
    ExtremelyHigh("1080p", "original"),
    FourK("4k", ""),
    HDR("hdr", ""),
    Auto("auto", ""),
    L_Standard("240p", ""),
    H_High("540p", ""),
    TwoK("2k", ""),
    ExtremelyHigh_50F("1080p 50fps", ""),
    TwoK_50F("2k 50fps", ""),
    FourK_50F("4k 50fps", ""),
    ExtremelyHigh_60F("1080p 60fps", ""),
    TwoK_60F("2k 60fps", ""),
    FourK_60F("4k 60fps", ""),
    ExtremelyHigh_120F("1080p 120fps", ""),
    TwoK_120F("2k 120fps", ""),
    FourK_120F("4k 120fps", "");
    
    private final String audioQuality;
    private final String resolution;

    public final String toString() {
        return this.resolution;
    }

    static {
        Covode.recordClassIndex(74081);
    }

    private b(String str, String str2) {
        this.resolution = str;
        this.audioQuality = str2;
    }
}
