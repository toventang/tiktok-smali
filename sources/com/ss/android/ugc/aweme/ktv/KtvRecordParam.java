package com.ss.android.ugc.aweme.ktv;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.tools.utils.i;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public final class KtvRecordParam implements Serializable {
    private boolean adjustedStickerPosition;
    private List<Integer> audioDurations;
    private List<String> audioPaths;
    private int auditionDuration;
    private String author;
    private SimpleEffect authorEffect;
    private UrlModel coverLarge;
    private UrlModel coverMedium;
    private int delayByUser;
    private int duration;
    private String enterMethod;
    private SimpleEffect fontEffect;
    private ArrayList<Boolean> globalWiredHeadset;
    private String id;
    private SimpleEffect lyricEffect;
    private TreeMap<Integer, Object> lyricLines;
    private String lyricPath;
    private int lyricStartTime;
    private int lyricType;
    private UrlModel lyricUrl;
    private String musicId;
    private String musicSelectedFrom;
    private ArrayList<Integer> mvFileDurations;
    private ArrayList<String> mvFilePaths;
    private ArrayList<String> mvFileTypes;
    private String mvImageEffectPath;
    private int mvMode;
    private String mvVideoEffectPath;
    private SimpleEffect mvVideoResEffect;
    private boolean needFetchMusic;
    private KtvAudioParam originTrack;
    private String originTrackPath;
    private boolean processTuningSuccess;
    private Integer recordBGMDelay;
    private int recordMode;
    private ReverberationData reverberation;
    private int shootDuration;
    private boolean showAuthor;
    private KtvAudioParam subTrack;
    private String subTrackPath;
    private String title;
    private String tuningAudioOutputPath;
    private KtvAudioParam tuningAudioTrack;
    private String tuningMidiPath;
    private ReverberationData tuningReverberation;
    private boolean useRecommendVolume;
    private int videoDuration;
    private KtvAudioParam voiceTrack;
    private boolean wiredHeadset;

    static {
        Covode.recordClassIndex(68548);
    }

    public KtvRecordParam() {
        this(null, null, false, null, null, null, 0, null, false, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, null, false, null, null, null, null, null, 0, null, null, null, null, 0, null, false, 0, false, null, null, null, false, null, null, null, -1, 131071, null);
    }

    public static /* synthetic */ KtvRecordParam copy$default(KtvRecordParam ktvRecordParam, String str, String str2, boolean z, String str3, String str4, String str5, int i2, KtvAudioParam ktvAudioParam, boolean z2, Integer num, List list, List list2, KtvAudioParam ktvAudioParam2, String str6, KtvAudioParam ktvAudioParam3, String str7, int i3, int i4, int i5, UrlModel urlModel, TreeMap treeMap, String str8, int i6, int i7, UrlModel urlModel2, UrlModel urlModel3, boolean z3, SimpleEffect simpleEffect, SimpleEffect simpleEffect2, SimpleEffect simpleEffect3, String str9, String str10, int i8, SimpleEffect simpleEffect4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i9, ReverberationData reverberationData, boolean z4, int i10, boolean z5, String str11, String str12, ArrayList arrayList4, boolean z6, KtvAudioParam ktvAudioParam4, String str13, ReverberationData reverberationData2, int i11, int i12, Object obj) {
        List<Integer> list3 = list2;
        List<String> list4 = list;
        String str14 = str3;
        boolean z7 = z;
        String str15 = str2;
        String str16 = str;
        String str17 = str4;
        String str18 = str5;
        int i13 = i2;
        KtvAudioParam ktvAudioParam5 = ktvAudioParam;
        boolean z8 = z2;
        Integer num2 = num;
        String str19 = str13;
        KtvAudioParam ktvAudioParam6 = ktvAudioParam4;
        boolean z9 = z6;
        String str20 = str11;
        boolean z10 = z5;
        int i14 = i9;
        ArrayList<Integer> arrayList5 = arrayList3;
        ArrayList<String> arrayList6 = arrayList;
        SimpleEffect simpleEffect5 = simpleEffect4;
        String str21 = str8;
        TreeMap<Integer, Object> treeMap2 = treeMap;
        ReverberationData reverberationData3 = reverberationData2;
        int i15 = i8;
        ArrayList arrayList7 = arrayList4;
        int i16 = i4;
        int i17 = i5;
        ReverberationData reverberationData4 = reverberationData;
        KtvAudioParam ktvAudioParam7 = ktvAudioParam2;
        UrlModel urlModel4 = urlModel2;
        String str22 = str7;
        int i18 = i3;
        int i19 = i10;
        KtvAudioParam ktvAudioParam8 = ktvAudioParam3;
        ArrayList<String> arrayList8 = arrayList2;
        int i20 = i6;
        int i21 = i7;
        boolean z11 = z4;
        String str23 = str6;
        UrlModel urlModel5 = urlModel3;
        UrlModel urlModel6 = urlModel;
        String str24 = str10;
        boolean z12 = z3;
        SimpleEffect simpleEffect6 = simpleEffect;
        String str25 = str12;
        SimpleEffect simpleEffect7 = simpleEffect2;
        SimpleEffect simpleEffect8 = simpleEffect3;
        String str26 = str9;
        if ((i11 & 1) != 0) {
            str16 = ktvRecordParam.id;
        }
        if ((i11 & 2) != 0) {
            str15 = ktvRecordParam.musicId;
        }
        if ((i11 & 4) != 0) {
            z7 = ktvRecordParam.needFetchMusic;
        }
        if ((i11 & 8) != 0) {
            str14 = ktvRecordParam.musicSelectedFrom;
        }
        if ((i11 & 16) != 0) {
            str17 = ktvRecordParam.title;
        }
        if ((i11 & 32) != 0) {
            str18 = ktvRecordParam.author;
        }
        if ((i11 & 64) != 0) {
            i13 = ktvRecordParam.recordMode;
        }
        if ((i11 & 128) != 0) {
            ktvAudioParam5 = ktvRecordParam.voiceTrack;
        }
        if ((i11 & 256) != 0) {
            z8 = ktvRecordParam.wiredHeadset;
        }
        if ((i11 & 512) != 0) {
            num2 = ktvRecordParam.recordBGMDelay;
        }
        if ((i11 & 1024) != 0) {
            list4 = ktvRecordParam.audioPaths;
        }
        if ((i11 & 2048) != 0) {
            list3 = ktvRecordParam.audioDurations;
        }
        if ((i11 & 4096) != 0) {
            ktvAudioParam7 = ktvRecordParam.originTrack;
        }
        if ((i11 & 8192) != 0) {
            str23 = ktvRecordParam.originTrackPath;
        }
        if ((i11 & 16384) != 0) {
            ktvAudioParam8 = ktvRecordParam.subTrack;
        }
        if ((i11 & 32768) != 0) {
            str22 = ktvRecordParam.subTrackPath;
        }
        if ((i11 & 65536) != 0) {
            i18 = ktvRecordParam.duration;
        }
        if ((131072 & i11) != 0) {
            i16 = ktvRecordParam.shootDuration;
        }
        if ((262144 & i11) != 0) {
            i17 = ktvRecordParam.auditionDuration;
        }
        if ((524288 & i11) != 0) {
            urlModel6 = ktvRecordParam.lyricUrl;
        }
        if ((1048576 & i11) != 0) {
            treeMap2 = ktvRecordParam.lyricLines;
        }
        if ((2097152 & i11) != 0) {
            str21 = ktvRecordParam.lyricPath;
        }
        if ((4194304 & i11) != 0) {
            i20 = ktvRecordParam.lyricType;
        }
        if ((8388608 & i11) != 0) {
            i21 = ktvRecordParam.lyricStartTime;
        }
        if ((16777216 & i11) != 0) {
            urlModel4 = ktvRecordParam.coverMedium;
        }
        if ((33554432 & i11) != 0) {
            urlModel5 = ktvRecordParam.coverLarge;
        }
        if ((67108864 & i11) != 0) {
            z12 = ktvRecordParam.showAuthor;
        }
        if ((134217728 & i11) != 0) {
            simpleEffect6 = ktvRecordParam.lyricEffect;
        }
        if ((268435456 & i11) != 0) {
            simpleEffect7 = ktvRecordParam.fontEffect;
        }
        if ((536870912 & i11) != 0) {
            simpleEffect8 = ktvRecordParam.authorEffect;
        }
        if ((1073741824 & i11) != 0) {
            str26 = ktvRecordParam.mvVideoEffectPath;
        }
        if ((i11 & Integer.MIN_VALUE) != 0) {
            str24 = ktvRecordParam.mvImageEffectPath;
        }
        if ((i12 & 1) != 0) {
            i15 = ktvRecordParam.mvMode;
        }
        if ((i12 & 2) != 0) {
            simpleEffect5 = ktvRecordParam.mvVideoResEffect;
        }
        if ((i12 & 4) != 0) {
            arrayList6 = ktvRecordParam.mvFilePaths;
        }
        if ((i12 & 8) != 0) {
            arrayList8 = ktvRecordParam.mvFileTypes;
        }
        if ((i12 & 16) != 0) {
            arrayList5 = ktvRecordParam.mvFileDurations;
        }
        if ((i12 & 32) != 0) {
            i14 = ktvRecordParam.videoDuration;
        }
        if ((i12 & 64) != 0) {
            reverberationData4 = ktvRecordParam.reverberation;
        }
        if ((i12 & 128) != 0) {
            z11 = ktvRecordParam.useRecommendVolume;
        }
        if ((i12 & 256) != 0) {
            i19 = ktvRecordParam.delayByUser;
        }
        if ((i12 & 512) != 0) {
            z10 = ktvRecordParam.adjustedStickerPosition;
        }
        if ((i12 & 1024) != 0) {
            str20 = ktvRecordParam.enterMethod;
        }
        if ((i12 & 2048) != 0) {
            str25 = ktvRecordParam.tuningMidiPath;
        }
        if ((i12 & 4096) != 0) {
            arrayList7 = ktvRecordParam.globalWiredHeadset;
        }
        if ((i12 & 8192) != 0) {
            z9 = ktvRecordParam.processTuningSuccess;
        }
        if ((i12 & 16384) != 0) {
            ktvAudioParam6 = ktvRecordParam.tuningAudioTrack;
        }
        if ((i12 & 32768) != 0) {
            str19 = ktvRecordParam.tuningAudioOutputPath;
        }
        if ((i12 & 65536) != 0) {
            reverberationData3 = ktvRecordParam.tuningReverberation;
        }
        return ktvRecordParam.copy(str16, str15, z7, str14, str17, str18, i13, ktvAudioParam5, z8, num2, list4, list3, ktvAudioParam7, str23, ktvAudioParam8, str22, i18, i16, i17, urlModel6, treeMap2, str21, i20, i21, urlModel4, urlModel5, z12, simpleEffect6, simpleEffect7, simpleEffect8, str26, str24, i15, simpleEffect5, arrayList6, arrayList8, arrayList5, i14, reverberationData4, z11, i19, z10, str20, str25, arrayList7, z9, ktvAudioParam6, str19, reverberationData3);
    }

    public final String component1() {
        return this.id;
    }

    public final Integer component10() {
        return this.recordBGMDelay;
    }

    public final List<String> component11() {
        return this.audioPaths;
    }

    public final List<Integer> component12() {
        return this.audioDurations;
    }

    public final KtvAudioParam component13() {
        return this.originTrack;
    }

    public final String component14() {
        return this.originTrackPath;
    }

    public final KtvAudioParam component15() {
        return this.subTrack;
    }

    public final String component16() {
        return this.subTrackPath;
    }

    public final int component17() {
        return this.duration;
    }

    public final int component18() {
        return this.shootDuration;
    }

    public final int component19() {
        return this.auditionDuration;
    }

    public final String component2() {
        return this.musicId;
    }

    public final UrlModel component20() {
        return this.lyricUrl;
    }

    public final TreeMap<Integer, Object> component21() {
        return this.lyricLines;
    }

    public final String component22() {
        return this.lyricPath;
    }

    public final int component23() {
        return this.lyricType;
    }

    public final int component24() {
        return this.lyricStartTime;
    }

    public final UrlModel component25() {
        return this.coverMedium;
    }

    public final UrlModel component26() {
        return this.coverLarge;
    }

    public final boolean component27() {
        return this.showAuthor;
    }

    public final SimpleEffect component28() {
        return this.lyricEffect;
    }

    public final SimpleEffect component29() {
        return this.fontEffect;
    }

    public final boolean component3() {
        return this.needFetchMusic;
    }

    public final SimpleEffect component30() {
        return this.authorEffect;
    }

    public final String component31() {
        return this.mvVideoEffectPath;
    }

    public final String component32() {
        return this.mvImageEffectPath;
    }

    public final int component33() {
        return this.mvMode;
    }

    public final SimpleEffect component34() {
        return this.mvVideoResEffect;
    }

    public final ArrayList<String> component35() {
        return this.mvFilePaths;
    }

    public final ArrayList<String> component36() {
        return this.mvFileTypes;
    }

    public final ArrayList<Integer> component37() {
        return this.mvFileDurations;
    }

    public final int component38() {
        return this.videoDuration;
    }

    public final ReverberationData component39() {
        return this.reverberation;
    }

    public final String component4() {
        return this.musicSelectedFrom;
    }

    public final boolean component40() {
        return this.useRecommendVolume;
    }

    public final int component41() {
        return this.delayByUser;
    }

    public final boolean component42() {
        return this.adjustedStickerPosition;
    }

    public final String component43() {
        return this.enterMethod;
    }

    public final String component44() {
        return this.tuningMidiPath;
    }

    public final ArrayList<Boolean> component45() {
        return this.globalWiredHeadset;
    }

    public final boolean component46() {
        return this.processTuningSuccess;
    }

    public final KtvAudioParam component47() {
        return this.tuningAudioTrack;
    }

    public final String component48() {
        return this.tuningAudioOutputPath;
    }

    public final ReverberationData component49() {
        return this.tuningReverberation;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.author;
    }

    public final int component7() {
        return this.recordMode;
    }

    public final KtvAudioParam component8() {
        return this.voiceTrack;
    }

    public final boolean component9() {
        return this.wiredHeadset;
    }

    public final KtvRecordParam copy(String str, String str2, boolean z, String str3, String str4, String str5, int i2, KtvAudioParam ktvAudioParam, boolean z2, Integer num, List<String> list, List<Integer> list2, KtvAudioParam ktvAudioParam2, String str6, KtvAudioParam ktvAudioParam3, String str7, int i3, int i4, int i5, UrlModel urlModel, TreeMap<Integer, Object> treeMap, String str8, int i6, int i7, UrlModel urlModel2, UrlModel urlModel3, boolean z3, SimpleEffect simpleEffect, SimpleEffect simpleEffect2, SimpleEffect simpleEffect3, String str9, String str10, int i8, SimpleEffect simpleEffect4, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<Integer> arrayList3, int i9, ReverberationData reverberationData, boolean z4, int i10, boolean z5, String str11, String str12, ArrayList<Boolean> arrayList4, boolean z6, KtvAudioParam ktvAudioParam4, String str13, ReverberationData reverberationData2) {
        l.d(list, "");
        l.d(list2, "");
        l.d(arrayList, "");
        l.d(arrayList2, "");
        l.d(arrayList3, "");
        l.d(arrayList4, "");
        return new KtvRecordParam(str, str2, z, str3, str4, str5, i2, ktvAudioParam, z2, num, list, list2, ktvAudioParam2, str6, ktvAudioParam3, str7, i3, i4, i5, urlModel, treeMap, str8, i6, i7, urlModel2, urlModel3, z3, simpleEffect, simpleEffect2, simpleEffect3, str9, str10, i8, simpleEffect4, arrayList, arrayList2, arrayList3, i9, reverberationData, z4, i10, z5, str11, str12, arrayList4, z6, ktvAudioParam4, str13, reverberationData2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KtvRecordParam)) {
            return false;
        }
        KtvRecordParam ktvRecordParam = (KtvRecordParam) obj;
        return l.a(this.id, ktvRecordParam.id) && l.a(this.musicId, ktvRecordParam.musicId) && this.needFetchMusic == ktvRecordParam.needFetchMusic && l.a(this.musicSelectedFrom, ktvRecordParam.musicSelectedFrom) && l.a(this.title, ktvRecordParam.title) && l.a(this.author, ktvRecordParam.author) && this.recordMode == ktvRecordParam.recordMode && l.a(this.voiceTrack, ktvRecordParam.voiceTrack) && this.wiredHeadset == ktvRecordParam.wiredHeadset && l.a(this.recordBGMDelay, ktvRecordParam.recordBGMDelay) && l.a(this.audioPaths, ktvRecordParam.audioPaths) && l.a(this.audioDurations, ktvRecordParam.audioDurations) && l.a(this.originTrack, ktvRecordParam.originTrack) && l.a(this.originTrackPath, ktvRecordParam.originTrackPath) && l.a(this.subTrack, ktvRecordParam.subTrack) && l.a(this.subTrackPath, ktvRecordParam.subTrackPath) && this.duration == ktvRecordParam.duration && this.shootDuration == ktvRecordParam.shootDuration && this.auditionDuration == ktvRecordParam.auditionDuration && l.a(this.lyricUrl, ktvRecordParam.lyricUrl) && l.a(this.lyricLines, ktvRecordParam.lyricLines) && l.a(this.lyricPath, ktvRecordParam.lyricPath) && this.lyricType == ktvRecordParam.lyricType && this.lyricStartTime == ktvRecordParam.lyricStartTime && l.a(this.coverMedium, ktvRecordParam.coverMedium) && l.a(this.coverLarge, ktvRecordParam.coverLarge) && this.showAuthor == ktvRecordParam.showAuthor && l.a(this.lyricEffect, ktvRecordParam.lyricEffect) && l.a(this.fontEffect, ktvRecordParam.fontEffect) && l.a(this.authorEffect, ktvRecordParam.authorEffect) && l.a(this.mvVideoEffectPath, ktvRecordParam.mvVideoEffectPath) && l.a(this.mvImageEffectPath, ktvRecordParam.mvImageEffectPath) && this.mvMode == ktvRecordParam.mvMode && l.a(this.mvVideoResEffect, ktvRecordParam.mvVideoResEffect) && l.a(this.mvFilePaths, ktvRecordParam.mvFilePaths) && l.a(this.mvFileTypes, ktvRecordParam.mvFileTypes) && l.a(this.mvFileDurations, ktvRecordParam.mvFileDurations) && this.videoDuration == ktvRecordParam.videoDuration && l.a(this.reverberation, ktvRecordParam.reverberation) && this.useRecommendVolume == ktvRecordParam.useRecommendVolume && this.delayByUser == ktvRecordParam.delayByUser && this.adjustedStickerPosition == ktvRecordParam.adjustedStickerPosition && l.a(this.enterMethod, ktvRecordParam.enterMethod) && l.a(this.tuningMidiPath, ktvRecordParam.tuningMidiPath) && l.a(this.globalWiredHeadset, ktvRecordParam.globalWiredHeadset) && this.processTuningSuccess == ktvRecordParam.processTuningSuccess && l.a(this.tuningAudioTrack, ktvRecordParam.tuningAudioTrack) && l.a(this.tuningAudioOutputPath, ktvRecordParam.tuningAudioOutputPath) && l.a(this.tuningReverberation, ktvRecordParam.tuningReverberation);
    }

    public final int hashCode() {
        String str = this.id;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.musicId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.needFetchMusic;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode2 + i4) * 31;
        String str3 = this.musicSelectedFrom;
        int hashCode3 = (i7 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.title;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.author;
        int hashCode5 = (((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.recordMode) * 31;
        KtvAudioParam ktvAudioParam = this.voiceTrack;
        int hashCode6 = (hashCode5 + (ktvAudioParam != null ? ktvAudioParam.hashCode() : 0)) * 31;
        boolean z2 = this.wiredHeadset;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (hashCode6 + i8) * 31;
        Integer num = this.recordBGMDelay;
        int hashCode7 = (i11 + (num != null ? num.hashCode() : 0)) * 31;
        List<String> list = this.audioPaths;
        int hashCode8 = (hashCode7 + (list != null ? list.hashCode() : 0)) * 31;
        List<Integer> list2 = this.audioDurations;
        int hashCode9 = (hashCode8 + (list2 != null ? list2.hashCode() : 0)) * 31;
        KtvAudioParam ktvAudioParam2 = this.originTrack;
        int hashCode10 = (hashCode9 + (ktvAudioParam2 != null ? ktvAudioParam2.hashCode() : 0)) * 31;
        String str6 = this.originTrackPath;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 31;
        KtvAudioParam ktvAudioParam3 = this.subTrack;
        int hashCode12 = (hashCode11 + (ktvAudioParam3 != null ? ktvAudioParam3.hashCode() : 0)) * 31;
        String str7 = this.subTrackPath;
        int hashCode13 = (((((((hashCode12 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.duration) * 31) + this.shootDuration) * 31) + this.auditionDuration) * 31;
        UrlModel urlModel = this.lyricUrl;
        int hashCode14 = (hashCode13 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        TreeMap<Integer, Object> treeMap = this.lyricLines;
        int hashCode15 = (hashCode14 + (treeMap != null ? treeMap.hashCode() : 0)) * 31;
        String str8 = this.lyricPath;
        int hashCode16 = (((((hashCode15 + (str8 != null ? str8.hashCode() : 0)) * 31) + this.lyricType) * 31) + this.lyricStartTime) * 31;
        UrlModel urlModel2 = this.coverMedium;
        int hashCode17 = (hashCode16 + (urlModel2 != null ? urlModel2.hashCode() : 0)) * 31;
        UrlModel urlModel3 = this.coverLarge;
        int hashCode18 = (hashCode17 + (urlModel3 != null ? urlModel3.hashCode() : 0)) * 31;
        boolean z3 = this.showAuthor;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (hashCode18 + i12) * 31;
        SimpleEffect simpleEffect = this.lyricEffect;
        int hashCode19 = (i15 + (simpleEffect != null ? simpleEffect.hashCode() : 0)) * 31;
        SimpleEffect simpleEffect2 = this.fontEffect;
        int hashCode20 = (hashCode19 + (simpleEffect2 != null ? simpleEffect2.hashCode() : 0)) * 31;
        SimpleEffect simpleEffect3 = this.authorEffect;
        int hashCode21 = (hashCode20 + (simpleEffect3 != null ? simpleEffect3.hashCode() : 0)) * 31;
        String str9 = this.mvVideoEffectPath;
        int hashCode22 = (hashCode21 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.mvImageEffectPath;
        int hashCode23 = (((hashCode22 + (str10 != null ? str10.hashCode() : 0)) * 31) + this.mvMode) * 31;
        SimpleEffect simpleEffect4 = this.mvVideoResEffect;
        int hashCode24 = (hashCode23 + (simpleEffect4 != null ? simpleEffect4.hashCode() : 0)) * 31;
        ArrayList<String> arrayList = this.mvFilePaths;
        int hashCode25 = (hashCode24 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        ArrayList<String> arrayList2 = this.mvFileTypes;
        int hashCode26 = (hashCode25 + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31;
        ArrayList<Integer> arrayList3 = this.mvFileDurations;
        int hashCode27 = (((hashCode26 + (arrayList3 != null ? arrayList3.hashCode() : 0)) * 31) + this.videoDuration) * 31;
        ReverberationData reverberationData = this.reverberation;
        int hashCode28 = (hashCode27 + (reverberationData != null ? reverberationData.hashCode() : 0)) * 31;
        boolean z4 = this.useRecommendVolume;
        if (z4) {
            z4 = true;
        }
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = (((hashCode28 + i16) * 31) + this.delayByUser) * 31;
        boolean z5 = this.adjustedStickerPosition;
        if (z5) {
            z5 = true;
        }
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = z5 ? 1 : 0;
        int i23 = (i19 + i20) * 31;
        String str11 = this.enterMethod;
        int hashCode29 = (i23 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.tuningMidiPath;
        int hashCode30 = (hashCode29 + (str12 != null ? str12.hashCode() : 0)) * 31;
        ArrayList<Boolean> arrayList4 = this.globalWiredHeadset;
        int hashCode31 = (hashCode30 + (arrayList4 != null ? arrayList4.hashCode() : 0)) * 31;
        if (!this.processTuningSuccess) {
            i3 = 0;
        }
        int i24 = (hashCode31 + i3) * 31;
        KtvAudioParam ktvAudioParam4 = this.tuningAudioTrack;
        int hashCode32 = (i24 + (ktvAudioParam4 != null ? ktvAudioParam4.hashCode() : 0)) * 31;
        String str13 = this.tuningAudioOutputPath;
        int hashCode33 = (hashCode32 + (str13 != null ? str13.hashCode() : 0)) * 31;
        ReverberationData reverberationData2 = this.tuningReverberation;
        if (reverberationData2 != null) {
            i2 = reverberationData2.hashCode();
        }
        return hashCode33 + i2;
    }

    public final String toString() {
        return "KtvRecordParam(id=" + this.id + ", musicId=" + this.musicId + ", needFetchMusic=" + this.needFetchMusic + ", musicSelectedFrom=" + this.musicSelectedFrom + ", title=" + this.title + ", author=" + this.author + ", recordMode=" + this.recordMode + ", voiceTrack=" + this.voiceTrack + ", wiredHeadset=" + this.wiredHeadset + ", recordBGMDelay=" + this.recordBGMDelay + ", audioPaths=" + this.audioPaths + ", audioDurations=" + this.audioDurations + ", originTrack=" + this.originTrack + ", originTrackPath=" + this.originTrackPath + ", subTrack=" + this.subTrack + ", subTrackPath=" + this.subTrackPath + ", duration=" + this.duration + ", shootDuration=" + this.shootDuration + ", auditionDuration=" + this.auditionDuration + ", lyricUrl=" + this.lyricUrl + ", lyricLines=" + this.lyricLines + ", lyricPath=" + this.lyricPath + ", lyricType=" + this.lyricType + ", lyricStartTime=" + this.lyricStartTime + ", coverMedium=" + this.coverMedium + ", coverLarge=" + this.coverLarge + ", showAuthor=" + this.showAuthor + ", lyricEffect=" + this.lyricEffect + ", fontEffect=" + this.fontEffect + ", authorEffect=" + this.authorEffect + ", mvVideoEffectPath=" + this.mvVideoEffectPath + ", mvImageEffectPath=" + this.mvImageEffectPath + ", mvMode=" + this.mvMode + ", mvVideoResEffect=" + this.mvVideoResEffect + ", mvFilePaths=" + this.mvFilePaths + ", mvFileTypes=" + this.mvFileTypes + ", mvFileDurations=" + this.mvFileDurations + ", videoDuration=" + this.videoDuration + ", reverberation=" + this.reverberation + ", useRecommendVolume=" + this.useRecommendVolume + ", delayByUser=" + this.delayByUser + ", adjustedStickerPosition=" + this.adjustedStickerPosition + ", enterMethod=" + this.enterMethod + ", tuningMidiPath=" + this.tuningMidiPath + ", globalWiredHeadset=" + this.globalWiredHeadset + ", processTuningSuccess=" + this.processTuningSuccess + ", tuningAudioTrack=" + this.tuningAudioTrack + ", tuningAudioOutputPath=" + this.tuningAudioOutputPath + ", tuningReverberation=" + this.tuningReverberation + ")";
    }

    public final boolean getAdjustedStickerPosition() {
        return this.adjustedStickerPosition;
    }

    public final List<Integer> getAudioDurations() {
        return this.audioDurations;
    }

    public final List<String> getAudioPaths() {
        return this.audioPaths;
    }

    public final int getAuditionDuration() {
        return this.auditionDuration;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final SimpleEffect getAuthorEffect() {
        return this.authorEffect;
    }

    public final UrlModel getCoverLarge() {
        return this.coverLarge;
    }

    public final UrlModel getCoverMedium() {
        return this.coverMedium;
    }

    public final int getDelayByUser() {
        return this.delayByUser;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final SimpleEffect getFontEffect() {
        return this.fontEffect;
    }

    public final ArrayList<Boolean> getGlobalWiredHeadset() {
        return this.globalWiredHeadset;
    }

    public final String getId() {
        return this.id;
    }

    public final SimpleEffect getLyricEffect() {
        return this.lyricEffect;
    }

    public final TreeMap<Integer, Object> getLyricLines() {
        return this.lyricLines;
    }

    public final String getLyricPath() {
        return this.lyricPath;
    }

    public final int getLyricStartTime() {
        return this.lyricStartTime;
    }

    public final int getLyricType() {
        return this.lyricType;
    }

    public final UrlModel getLyricUrl() {
        return this.lyricUrl;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getMusicSelectedFrom() {
        return this.musicSelectedFrom;
    }

    public final ArrayList<Integer> getMvFileDurations() {
        return this.mvFileDurations;
    }

    public final ArrayList<String> getMvFilePaths() {
        return this.mvFilePaths;
    }

    public final ArrayList<String> getMvFileTypes() {
        return this.mvFileTypes;
    }

    public final String getMvImageEffectPath() {
        return this.mvImageEffectPath;
    }

    public final int getMvMode() {
        return this.mvMode;
    }

    public final String getMvVideoEffectPath() {
        return this.mvVideoEffectPath;
    }

    public final SimpleEffect getMvVideoResEffect() {
        return this.mvVideoResEffect;
    }

    public final boolean getNeedFetchMusic() {
        return this.needFetchMusic;
    }

    public final KtvAudioParam getOriginTrack() {
        return this.originTrack;
    }

    public final String getOriginTrackPath() {
        return this.originTrackPath;
    }

    public final boolean getProcessTuningSuccess() {
        return this.processTuningSuccess;
    }

    public final Integer getRecordBGMDelay() {
        return this.recordBGMDelay;
    }

    public final int getRecordMode() {
        return this.recordMode;
    }

    public final ReverberationData getReverberation() {
        return this.reverberation;
    }

    public final int getShootDuration() {
        return this.shootDuration;
    }

    public final boolean getShowAuthor() {
        return this.showAuthor;
    }

    public final KtvAudioParam getSubTrack() {
        return this.subTrack;
    }

    public final String getSubTrackPath() {
        return this.subTrackPath;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTuningAudioOutputPath() {
        return this.tuningAudioOutputPath;
    }

    public final KtvAudioParam getTuningAudioTrack() {
        return this.tuningAudioTrack;
    }

    public final String getTuningMidiPath() {
        return this.tuningMidiPath;
    }

    public final ReverberationData getTuningReverberation() {
        return this.tuningReverberation;
    }

    public final boolean getUseRecommendVolume() {
        return this.useRecommendVolume;
    }

    public final int getVideoDuration() {
        return this.videoDuration;
    }

    public final KtvAudioParam getVoiceTrack() {
        return this.voiceTrack;
    }

    public final boolean getWiredHeadset() {
        return this.wiredHeadset;
    }

    private final boolean checkTuningMidiFile() {
        if (this.tuningAudioTrack == null || i.a(this.tuningMidiPath)) {
            return true;
        }
        return false;
    }

    public final List<AudioInterval> accompanimentTimeIntervals() {
        KtvAudioParam ktvAudioParam = this.subTrack;
        if (ktvAudioParam != null) {
            return ktvAudioParam.getTimeList();
        }
        return null;
    }

    public final List<AudioInterval> originalTimeIntervals() {
        KtvAudioParam ktvAudioParam = this.originTrack;
        if (ktvAudioParam != null) {
            return ktvAudioParam.getTimeList();
        }
        return null;
    }

    public final boolean checkFiles() {
        if (!i.a(this.originTrackPath) || !i.a(this.subTrackPath) || !i.a(this.lyricPath) || !checkTuningMidiFile()) {
            return false;
        }
        return true;
    }

    public final void setAdjustedStickerPosition(boolean z) {
        this.adjustedStickerPosition = z;
    }

    public final void setAuditionDuration(int i2) {
        this.auditionDuration = i2;
    }

    public final void setAuthor(String str) {
        this.author = str;
    }

    public final void setAuthorEffect(SimpleEffect simpleEffect) {
        this.authorEffect = simpleEffect;
    }

    public final void setCoverLarge(UrlModel urlModel) {
        this.coverLarge = urlModel;
    }

    public final void setCoverMedium(UrlModel urlModel) {
        this.coverMedium = urlModel;
    }

    public final void setDelayByUser(int i2) {
        this.delayByUser = i2;
    }

    public final void setDuration(int i2) {
        this.duration = i2;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setFontEffect(SimpleEffect simpleEffect) {
        this.fontEffect = simpleEffect;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setLyricEffect(SimpleEffect simpleEffect) {
        this.lyricEffect = simpleEffect;
    }

    public final void setLyricLines(TreeMap<Integer, Object> treeMap) {
        this.lyricLines = treeMap;
    }

    public final void setLyricPath(String str) {
        this.lyricPath = str;
    }

    public final void setLyricStartTime(int i2) {
        this.lyricStartTime = i2;
    }

    public final void setLyricType(int i2) {
        this.lyricType = i2;
    }

    public final void setLyricUrl(UrlModel urlModel) {
        this.lyricUrl = urlModel;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setMusicSelectedFrom(String str) {
        this.musicSelectedFrom = str;
    }

    public final void setMvImageEffectPath(String str) {
        this.mvImageEffectPath = str;
    }

    public final void setMvMode(int i2) {
        this.mvMode = i2;
    }

    public final void setMvVideoEffectPath(String str) {
        this.mvVideoEffectPath = str;
    }

    public final void setMvVideoResEffect(SimpleEffect simpleEffect) {
        this.mvVideoResEffect = simpleEffect;
    }

    public final void setNeedFetchMusic(boolean z) {
        this.needFetchMusic = z;
    }

    public final void setOriginTrack(KtvAudioParam ktvAudioParam) {
        this.originTrack = ktvAudioParam;
    }

    public final void setOriginTrackPath(String str) {
        this.originTrackPath = str;
    }

    public final void setProcessTuningSuccess(boolean z) {
        this.processTuningSuccess = z;
    }

    public final void setRecordBGMDelay(Integer num) {
        this.recordBGMDelay = num;
    }

    public final void setRecordMode(int i2) {
        this.recordMode = i2;
    }

    public final void setReverberation(ReverberationData reverberationData) {
        this.reverberation = reverberationData;
    }

    public final void setShootDuration(int i2) {
        this.shootDuration = i2;
    }

    public final void setShowAuthor(boolean z) {
        this.showAuthor = z;
    }

    public final void setSubTrack(KtvAudioParam ktvAudioParam) {
        this.subTrack = ktvAudioParam;
    }

    public final void setSubTrackPath(String str) {
        this.subTrackPath = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTuningAudioOutputPath(String str) {
        this.tuningAudioOutputPath = str;
    }

    public final void setTuningAudioTrack(KtvAudioParam ktvAudioParam) {
        this.tuningAudioTrack = ktvAudioParam;
    }

    public final void setTuningMidiPath(String str) {
        this.tuningMidiPath = str;
    }

    public final void setTuningReverberation(ReverberationData reverberationData) {
        this.tuningReverberation = reverberationData;
    }

    public final void setUseRecommendVolume(boolean z) {
        this.useRecommendVolume = z;
    }

    public final void setVideoDuration(int i2) {
        this.videoDuration = i2;
    }

    public final void setVoiceTrack(KtvAudioParam ktvAudioParam) {
        this.voiceTrack = ktvAudioParam;
    }

    public final void setWiredHeadset(boolean z) {
        this.wiredHeadset = z;
    }

    public final void setAudioDurations(List<Integer> list) {
        l.d(list, "");
        this.audioDurations = list;
    }

    public final void setAudioPaths(List<String> list) {
        l.d(list, "");
        this.audioPaths = list;
    }

    public final void setGlobalWiredHeadset(ArrayList<Boolean> arrayList) {
        l.d(arrayList, "");
        this.globalWiredHeadset = arrayList;
    }

    public final void setMvFileDurations(ArrayList<Integer> arrayList) {
        l.d(arrayList, "");
        this.mvFileDurations = arrayList;
    }

    public final void setMvFilePaths(ArrayList<String> arrayList) {
        l.d(arrayList, "");
        this.mvFilePaths = arrayList;
    }

    public final void setMvFileTypes(ArrayList<String> arrayList) {
        l.d(arrayList, "");
        this.mvFileTypes = arrayList;
    }

    public KtvRecordParam(String str, String str2, boolean z, String str3, String str4, String str5, int i2, KtvAudioParam ktvAudioParam, boolean z2, Integer num, List<String> list, List<Integer> list2, KtvAudioParam ktvAudioParam2, String str6, KtvAudioParam ktvAudioParam3, String str7, int i3, int i4, int i5, UrlModel urlModel, TreeMap<Integer, Object> treeMap, String str8, int i6, int i7, UrlModel urlModel2, UrlModel urlModel3, boolean z3, SimpleEffect simpleEffect, SimpleEffect simpleEffect2, SimpleEffect simpleEffect3, String str9, String str10, int i8, SimpleEffect simpleEffect4, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<Integer> arrayList3, int i9, ReverberationData reverberationData, boolean z4, int i10, boolean z5, String str11, String str12, ArrayList<Boolean> arrayList4, boolean z6, KtvAudioParam ktvAudioParam4, String str13, ReverberationData reverberationData2) {
        l.d(list, "");
        l.d(list2, "");
        l.d(arrayList, "");
        l.d(arrayList2, "");
        l.d(arrayList3, "");
        l.d(arrayList4, "");
        this.id = str;
        this.musicId = str2;
        this.needFetchMusic = z;
        this.musicSelectedFrom = str3;
        this.title = str4;
        this.author = str5;
        this.recordMode = i2;
        this.voiceTrack = ktvAudioParam;
        this.wiredHeadset = z2;
        this.recordBGMDelay = num;
        this.audioPaths = list;
        this.audioDurations = list2;
        this.originTrack = ktvAudioParam2;
        this.originTrackPath = str6;
        this.subTrack = ktvAudioParam3;
        this.subTrackPath = str7;
        this.duration = i3;
        this.shootDuration = i4;
        this.auditionDuration = i5;
        this.lyricUrl = urlModel;
        this.lyricLines = treeMap;
        this.lyricPath = str8;
        this.lyricType = i6;
        this.lyricStartTime = i7;
        this.coverMedium = urlModel2;
        this.coverLarge = urlModel3;
        this.showAuthor = z3;
        this.lyricEffect = simpleEffect;
        this.fontEffect = simpleEffect2;
        this.authorEffect = simpleEffect3;
        this.mvVideoEffectPath = str9;
        this.mvImageEffectPath = str10;
        this.mvMode = i8;
        this.mvVideoResEffect = simpleEffect4;
        this.mvFilePaths = arrayList;
        this.mvFileTypes = arrayList2;
        this.mvFileDurations = arrayList3;
        this.videoDuration = i9;
        this.reverberation = reverberationData;
        this.useRecommendVolume = z4;
        this.delayByUser = i10;
        this.adjustedStickerPosition = z5;
        this.enterMethod = str11;
        this.tuningMidiPath = str12;
        this.globalWiredHeadset = arrayList4;
        this.processTuningSuccess = z6;
        this.tuningAudioTrack = ktvAudioParam4;
        this.tuningAudioOutputPath = str13;
        this.tuningReverberation = reverberationData2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KtvRecordParam(String str, String str2, boolean z, String str3, String str4, String str5, int i2, KtvAudioParam ktvAudioParam, boolean z2, Integer num, List list, List list2, KtvAudioParam ktvAudioParam2, String str6, KtvAudioParam ktvAudioParam3, String str7, int i3, int i4, int i5, UrlModel urlModel, TreeMap treeMap, String str8, int i6, int i7, UrlModel urlModel2, UrlModel urlModel3, boolean z3, SimpleEffect simpleEffect, SimpleEffect simpleEffect2, SimpleEffect simpleEffect3, String str9, String str10, int i8, SimpleEffect simpleEffect4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i9, ReverberationData reverberationData, boolean z4, int i10, boolean z5, String str11, String str12, ArrayList arrayList4, boolean z6, KtvAudioParam ktvAudioParam4, String str13, ReverberationData reverberationData2, int i11, int i12, g gVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? false : z, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? -1 : i2, (i11 & 128) != 0 ? null : ktvAudioParam, (i11 & 256) != 0 ? false : z2, (i11 & 512) != 0 ? null : num, (i11 & 1024) != 0 ? new ArrayList() : list, (i11 & 2048) != 0 ? new ArrayList() : list2, (i11 & 4096) != 0 ? null : ktvAudioParam2, (i11 & 8192) != 0 ? null : str6, (i11 & 16384) != 0 ? null : ktvAudioParam3, (i11 & 32768) != 0 ? null : str7, (i11 & 65536) != 0 ? 0 : i3, (131072 & i11) != 0 ? 0 : i4, (262144 & i11) != 0 ? 0 : i5, (524288 & i11) != 0 ? null : urlModel, (1048576 & i11) != 0 ? null : treeMap, (2097152 & i11) != 0 ? null : str8, (4194304 & i11) != 0 ? 0 : i6, (8388608 & i11) != 0 ? 0 : i7, (16777216 & i11) != 0 ? null : urlModel2, (33554432 & i11) != 0 ? null : urlModel3, (67108864 & i11) != 0 ? false : z3, (134217728 & i11) != 0 ? null : simpleEffect, (268435456 & i11) != 0 ? null : simpleEffect2, (536870912 & i11) != 0 ? null : simpleEffect3, (1073741824 & i11) != 0 ? null : str9, (i11 & Integer.MIN_VALUE) != 0 ? null : str10, (i12 & 1) != 0 ? 0 : i8, (i12 & 2) != 0 ? null : simpleEffect4, (i12 & 4) != 0 ? new ArrayList() : arrayList, (i12 & 8) != 0 ? new ArrayList() : arrayList2, (i12 & 16) != 0 ? new ArrayList() : arrayList3, (i12 & 32) != 0 ? 0 : i9, (i12 & 64) != 0 ? null : reverberationData, (i12 & 128) != 0 ? true : z4, (i12 & 256) != 0 ? 0 : i10, (i12 & 512) != 0 ? false : z5, (i12 & 1024) != 0 ? null : str11, (i12 & 2048) != 0 ? null : str12, (i12 & 4096) != 0 ? new ArrayList() : arrayList4, (i12 & 8192) != 0 ? false : z6, (i12 & 16384) != 0 ? null : ktvAudioParam4, (i12 & 32768) != 0 ? null : str13, (i12 & 65536) != 0 ? null : reverberationData2);
    }
}
