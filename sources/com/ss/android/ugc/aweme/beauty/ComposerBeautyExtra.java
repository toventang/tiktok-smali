package com.ss.android.ugc.aweme.beauty;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class ComposerBeautyExtra {
    public static final a Companion = new a((byte) 0);
    @c(a = "ab_group")
    private final int abGroup;
    @c(a = "beautify")
    private String beautify;
    @c(a = "beautyConfig")
    private String beautyConfig;
    @c(a = "blush_default")
    private final Float blushDefault;
    @c(a = "blush_max")
    private final Float blushMax;
    @c(a = "default")

    /* renamed from: default  reason: not valid java name */
    private final boolean f344default;
    @c(a = "disable_cache")
    private boolean disableCache;
    @c(a = "eye_default")
    private final Float eyeDefault;
    @c(a = "eye_max")
    private final Float eyeMax;
    @c(a = "face_default")
    private final Float faceDefault;
    @c(a = "face_max")
    private final Float faceMax;
    private final String gender;
    @c(a = "is_none")
    private boolean isNone;
    @c(a = "lipstick_default")
    private final Float lipstickDefault;
    @c(a = "lipstick_max")
    private final Float lipstickMax;
    @c(a = "liveeffectid")
    private String liveEffectId;
    @c(a = "MakeupType")
    private int makeupType;
    private String resourceType;
    @c(a = "sharp_default")
    private final Float sharpDefault;
    @c(a = "sharp_max")
    private final Float sharpMax;
    @c(a = "skin_default")
    private final Float skinDefault;
    @c(a = "skin_max")
    private final Float skinMax;
    @c(a = "testliveeffectid")
    private String testLiveEffectId;
    @c(a = "video_tag")
    private String videoTag;

    static {
        Covode.recordClassIndex(42222);
    }

    public ComposerBeautyExtra() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, false, false, 0, null, null, null, 16777215, null);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42223);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getAbGroup() {
        return this.abGroup;
    }

    public final String getBeautify() {
        return this.beautify;
    }

    public final String getBeautyConfig() {
        return this.beautyConfig;
    }

    public final Float getBlushDefault() {
        return this.blushDefault;
    }

    public final Float getBlushMax() {
        return this.blushMax;
    }

    public final boolean getDefault() {
        return this.f344default;
    }

    public final boolean getDisableCache() {
        return this.disableCache;
    }

    public final Float getEyeDefault() {
        return this.eyeDefault;
    }

    public final Float getEyeMax() {
        return this.eyeMax;
    }

    public final Float getFaceDefault() {
        return this.faceDefault;
    }

    public final Float getFaceMax() {
        return this.faceMax;
    }

    public final String getGender() {
        return this.gender;
    }

    public final Float getLipstickDefault() {
        return this.lipstickDefault;
    }

    public final Float getLipstickMax() {
        return this.lipstickMax;
    }

    public final String getLiveEffectId() {
        return this.liveEffectId;
    }

    public final int getMakeupType() {
        return this.makeupType;
    }

    public final String getResourceType() {
        return this.resourceType;
    }

    public final Float getSharpDefault() {
        return this.sharpDefault;
    }

    public final Float getSharpMax() {
        return this.sharpMax;
    }

    public final Float getSkinDefault() {
        return this.skinDefault;
    }

    public final Float getSkinMax() {
        return this.skinMax;
    }

    public final String getTestLiveEffectId() {
        return this.testLiveEffectId;
    }

    public final String getVideoTag() {
        return this.videoTag;
    }

    public final boolean isNone() {
        return this.isNone;
    }

    public final void setBeautify(String str) {
        this.beautify = str;
    }

    public final void setBeautyConfig(String str) {
        this.beautyConfig = str;
    }

    public final void setDisableCache(boolean z) {
        this.disableCache = z;
    }

    public final void setLiveEffectId(String str) {
        this.liveEffectId = str;
    }

    public final void setMakeupType(int i2) {
        this.makeupType = i2;
    }

    public final void setNone(boolean z) {
        this.isNone = z;
    }

    public final void setTestLiveEffectId(String str) {
        this.testLiveEffectId = str;
    }

    public final void setVideoTag(String str) {
        this.videoTag = str;
    }

    public final void setResourceType(String str) {
        l.d(str, "");
        this.resourceType = str;
    }

    public ComposerBeautyExtra(String str, String str2, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, Float f10, Float f11, Float f12, Float f13, int i2, boolean z, String str3, String str4, boolean z2, boolean z3, int i3, String str5, String str6, String str7) {
        l.d(str, "");
        l.d(str2, "");
        this.resourceType = str;
        this.gender = str2;
        this.lipstickDefault = f2;
        this.lipstickMax = f3;
        this.blushDefault = f4;
        this.blushMax = f5;
        this.eyeDefault = f6;
        this.eyeMax = f7;
        this.faceDefault = f8;
        this.faceMax = f9;
        this.skinDefault = f10;
        this.skinMax = f11;
        this.sharpDefault = f12;
        this.sharpMax = f13;
        this.abGroup = i2;
        this.f344default = z;
        this.beautify = str3;
        this.beautyConfig = str4;
        this.isNone = z2;
        this.disableCache = z3;
        this.makeupType = i3;
        this.videoTag = str5;
        this.liveEffectId = str6;
        this.testLiveEffectId = str7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ComposerBeautyExtra(java.lang.String r27, java.lang.String r28, java.lang.Float r29, java.lang.Float r30, java.lang.Float r31, java.lang.Float r32, java.lang.Float r33, java.lang.Float r34, java.lang.Float r35, java.lang.Float r36, java.lang.Float r37, java.lang.Float r38, java.lang.Float r39, java.lang.Float r40, int r41, boolean r42, java.lang.String r43, java.lang.String r44, boolean r45, boolean r46, int r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, int r51, h.f.b.g r52) {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra.<init>(java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, int, boolean, java.lang.String, java.lang.String, boolean, boolean, int, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
