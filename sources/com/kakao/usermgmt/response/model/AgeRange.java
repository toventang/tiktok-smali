package com.kakao.usermgmt.response.model;

import com.bytedance.covode.number.Covode;

public enum AgeRange {
    AGE_0_9("0~9"),
    AGE_10_14("10~14"),
    AGE_15_19("15~19"),
    AGE_20_29("20~29"),
    AGE_30_39("30~39"),
    AGE_40_49("40~49"),
    AGE_50_59("50~59"),
    AGE_60_69("60~69"),
    AGE_70_79("70~79"),
    AGE_80_89("80~89"),
    AGE_90_ABOVE("90~"),
    AGE_RANGE_UNKNOWN("N/A");
    
    private String value;

    public final String getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(34453);
    }

    public static AgeRange getRange(String str) {
        AgeRange[] values = values();
        for (AgeRange ageRange : values) {
            if (ageRange.value.equalsIgnoreCase(str)) {
                return ageRange;
            }
        }
        return AGE_RANGE_UNKNOWN;
    }

    private AgeRange(String str) {
        this.value = str;
    }
}
