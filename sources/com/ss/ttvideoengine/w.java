package com.ss.ttvideoengine;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.j.q;

public enum w {
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
    FourK_120F("4k 120fps", ""),
    L_Standard_HDR("240p HDR", ""),
    Standard_HDR("360p HDR", ""),
    High_HDR("480p HDR", ""),
    H_High_HDR("540p HDR", ""),
    SuperHigh_HDR("720p HDR", ""),
    ExtremelyHigh_HDR("1080p HDR", ""),
    TwoK_HDR("2k HDR", ""),
    FourK_HDR("4k HDR", "");
    
    private final String audioquality;
    private final String resolution;

    public final String toString() {
        return this.resolution;
    }

    public final int getIndex() {
        return ordinal();
    }

    public static w[] getAllResolutions() {
        try {
            return new w[]{Undefine, L_Standard, Standard, High, H_High, SuperHigh, ExtremelyHigh, ExtremelyHigh_50F, ExtremelyHigh_60F, ExtremelyHigh_120F, HDR, TwoK, TwoK_50F, TwoK_60F, TwoK_120F, FourK, FourK_50F, FourK_60F, FourK_120F, L_Standard_HDR, Standard_HDR, High_HDR, H_High_HDR, SuperHigh_HDR, ExtremelyHigh_HDR, TwoK_HDR, FourK_HDR};
        } catch (Exception unused) {
            return new w[0];
        }
    }

    static {
        Covode.recordClassIndex(101795);
    }

    public static w valueOf(int i2) {
        w wVar = Undefine;
        if (i2 < wVar.ordinal() || i2 > FourK_HDR.ordinal()) {
            return wVar;
        }
        return values()[i2];
    }

    public final String toString(int i2) {
        if (i2 == q.f152977b) {
            return this.audioquality;
        }
        if (i2 == q.f152976a) {
            return this.resolution;
        }
        return "";
    }

    public static String toString(w wVar) {
        if (wVar == null || wVar == Undefine) {
            return "Undefine";
        }
        if (wVar == Standard) {
            return "Standard";
        }
        if (wVar == High) {
            return "High";
        }
        if (wVar == SuperHigh) {
            return "SuperHigh";
        }
        if (wVar == FourK) {
            return "FourK";
        }
        if (wVar == HDR) {
            return "HDR";
        }
        if (wVar == Auto) {
            return "Auto";
        }
        if (wVar == L_Standard) {
            return "L_Standard";
        }
        if (wVar == H_High) {
            return "H_High";
        }
        if (wVar == TwoK) {
            return "TwoK";
        }
        if (wVar == ExtremelyHigh_50F) {
            return "ExtremelyHigh_50F";
        }
        if (wVar == TwoK_50F) {
            return "TwoK_50F";
        }
        if (wVar == FourK_50F) {
            return "FourK_50F";
        }
        if (wVar == ExtremelyHigh_60F) {
            return "ExtremelyHigh_60F";
        }
        if (wVar == TwoK_60F) {
            return "TwoK_60F";
        }
        if (wVar == FourK_60F) {
            return "FourK_60F";
        }
        if (wVar == ExtremelyHigh_120F) {
            return "ExtremelyHigh_120F";
        }
        if (wVar == TwoK_120F) {
            return "TwoK_120F";
        }
        if (wVar == FourK_120F) {
            return "FourK_120F";
        }
        if (wVar == L_Standard_HDR) {
            return "L_Standard_HDR";
        }
        if (wVar == Standard_HDR) {
            return "Standard_HDR";
        }
        if (wVar == High_HDR) {
            return "High_HDR";
        }
        if (wVar == H_High_HDR) {
            return "H_High_HDR";
        }
        if (wVar == SuperHigh_HDR) {
            return "SuperHigh_HDR";
        }
        if (wVar == ExtremelyHigh_HDR) {
            return "ExtremelyHigh_HDR";
        }
        if (wVar == TwoK_HDR) {
            return "TwoK_HDR";
        }
        if (wVar == FourK_HDR) {
            return "FourK_HDR";
        }
        return "Undefine";
    }

    public static w forString(String str) {
        if (TextUtils.isEmpty(str)) {
            return Undefine;
        }
        if (str.equals("Undefine")) {
            return Undefine;
        }
        if (str.equals("Standard")) {
            return Standard;
        }
        if (str.equals("High")) {
            return High;
        }
        if (str.equals("SuperHigh")) {
            return SuperHigh;
        }
        if (str.equals("FourK")) {
            return FourK;
        }
        if (str.equals("HDR")) {
            return HDR;
        }
        if (str.equals("Auto")) {
            return Auto;
        }
        if (str.equals("L_Standard")) {
            return L_Standard;
        }
        if (str.equals("H_High")) {
            return H_High;
        }
        if (str.equals("TwoK")) {
            return TwoK;
        }
        if (str.equals("ExtremelyHigh_50F")) {
            return ExtremelyHigh_50F;
        }
        if (str.equals("TwoK_50F")) {
            return TwoK_50F;
        }
        if (str.equals("FourK_50F")) {
            return FourK_50F;
        }
        if (str.equals("ExtremelyHigh_60F")) {
            return ExtremelyHigh_60F;
        }
        if (str.equals("TwoK_60F")) {
            return TwoK_60F;
        }
        if (str.equals("FourK_60F")) {
            return FourK_60F;
        }
        if (str.equals("ExtremelyHigh_120F")) {
            return ExtremelyHigh_120F;
        }
        if (str.equals("TwoK_120F")) {
            return TwoK_120F;
        }
        if (str.equals("FourK_120F")) {
            return FourK_120F;
        }
        if (str.equals("L_Standard_HDR")) {
            return L_Standard_HDR;
        }
        if (str.equals("Standard_HDR")) {
            return Standard_HDR;
        }
        if (str.equals("High_HDR")) {
            return High_HDR;
        }
        if (str.equals("H_High_HDR")) {
            return H_High_HDR;
        }
        if (str.equals("SuperHigh_HDR")) {
            return SuperHigh_HDR;
        }
        if (str.equals("ExtremelyHigh_HDR")) {
            return ExtremelyHigh_HDR;
        }
        if (str.equals("TwoK_HDR")) {
            return TwoK_HDR;
        }
        if (str.equals("FourK_HDR")) {
            return FourK_HDR;
        }
        return Undefine;
    }

    private w(String str, String str2) {
        this.resolution = str;
        this.audioquality = str2;
    }
}
