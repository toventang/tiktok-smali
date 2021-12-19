package com.ss.android.ugc.aweme.profile.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.cu.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class MyProfileGuideState implements af {
    private final boolean avatarHasLoaded;
    private final Integer currentCommentSetting;
    private final Integer currentDownloadSetting;
    private final List<Aweme> firstRefreshPrivateAwemeList;
    private final List<Aweme> firstRefreshPublishAwemeList;
    private final Integer followerCount;
    private final boolean hasGuideShowed;
    private final boolean hasPermissionPopUp;
    private final boolean hasSurveyDetermined;
    private final boolean needCheckI18nRecommendUserDialog;
    private final Boolean needShowDiskManagerGuide;
    private final boolean postListHasLoaded;
    private final a surveyData;
    private final boolean vcdGuideLoaded;

    static {
        Covode.recordClassIndex(75899);
    }

    public MyProfileGuideState() {
        this(false, false, false, false, null, null, null, false, false, false, null, null, null, null, 16383, null);
    }

    public static /* synthetic */ MyProfileGuideState copy$default(MyProfileGuideState myProfileGuideState, boolean z, boolean z2, boolean z3, boolean z4, a aVar, Boolean bool, Integer num, boolean z5, boolean z6, boolean z7, Integer num2, Integer num3, List list, List list2, int i2, Object obj) {
        boolean z8 = z;
        boolean z9 = z2;
        boolean z10 = z3;
        boolean z11 = z4;
        a aVar2 = aVar;
        Boolean bool2 = bool;
        Integer num4 = num;
        boolean z12 = z5;
        boolean z13 = z6;
        boolean z14 = z7;
        Integer num5 = num2;
        Integer num6 = num3;
        List list3 = list;
        List list4 = list2;
        if ((i2 & 1) != 0) {
            z8 = myProfileGuideState.hasGuideShowed;
        }
        if ((i2 & 2) != 0) {
            z9 = myProfileGuideState.postListHasLoaded;
        }
        if ((i2 & 4) != 0) {
            z10 = myProfileGuideState.avatarHasLoaded;
        }
        if ((i2 & 8) != 0) {
            z11 = myProfileGuideState.hasSurveyDetermined;
        }
        if ((i2 & 16) != 0) {
            aVar2 = myProfileGuideState.surveyData;
        }
        if ((i2 & 32) != 0) {
            bool2 = myProfileGuideState.needShowDiskManagerGuide;
        }
        if ((i2 & 64) != 0) {
            num4 = myProfileGuideState.currentDownloadSetting;
        }
        if ((i2 & 128) != 0) {
            z12 = myProfileGuideState.vcdGuideLoaded;
        }
        if ((i2 & 256) != 0) {
            z13 = myProfileGuideState.hasPermissionPopUp;
        }
        if ((i2 & 512) != 0) {
            z14 = myProfileGuideState.needCheckI18nRecommendUserDialog;
        }
        if ((i2 & 1024) != 0) {
            num5 = myProfileGuideState.followerCount;
        }
        if ((i2 & 2048) != 0) {
            num6 = myProfileGuideState.currentCommentSetting;
        }
        if ((i2 & 4096) != 0) {
            list3 = myProfileGuideState.firstRefreshPublishAwemeList;
        }
        if ((i2 & 8192) != 0) {
            list4 = myProfileGuideState.firstRefreshPrivateAwemeList;
        }
        return myProfileGuideState.copy(z8, z9, z10, z11, aVar2, bool2, num4, z12, z13, z14, num5, num6, list3, list4);
    }

    public final boolean component1() {
        return this.hasGuideShowed;
    }

    public final boolean component10() {
        return this.needCheckI18nRecommendUserDialog;
    }

    public final Integer component11() {
        return this.followerCount;
    }

    public final Integer component12() {
        return this.currentCommentSetting;
    }

    public final List<Aweme> component13() {
        return this.firstRefreshPublishAwemeList;
    }

    public final List<Aweme> component14() {
        return this.firstRefreshPrivateAwemeList;
    }

    public final boolean component2() {
        return this.postListHasLoaded;
    }

    public final boolean component3() {
        return this.avatarHasLoaded;
    }

    public final boolean component4() {
        return this.hasSurveyDetermined;
    }

    public final a component5() {
        return this.surveyData;
    }

    public final Boolean component6() {
        return this.needShowDiskManagerGuide;
    }

    public final Integer component7() {
        return this.currentDownloadSetting;
    }

    public final boolean component8() {
        return this.vcdGuideLoaded;
    }

    public final boolean component9() {
        return this.hasPermissionPopUp;
    }

    public final MyProfileGuideState copy(boolean z, boolean z2, boolean z3, boolean z4, a aVar, Boolean bool, Integer num, boolean z5, boolean z6, boolean z7, Integer num2, Integer num3, List<? extends Aweme> list, List<? extends Aweme> list2) {
        return new MyProfileGuideState(z, z2, z3, z4, aVar, bool, num, z5, z6, z7, num2, num3, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyProfileGuideState)) {
            return false;
        }
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return this.hasGuideShowed == myProfileGuideState.hasGuideShowed && this.postListHasLoaded == myProfileGuideState.postListHasLoaded && this.avatarHasLoaded == myProfileGuideState.avatarHasLoaded && this.hasSurveyDetermined == myProfileGuideState.hasSurveyDetermined && l.a(this.surveyData, myProfileGuideState.surveyData) && l.a(this.needShowDiskManagerGuide, myProfileGuideState.needShowDiskManagerGuide) && l.a(this.currentDownloadSetting, myProfileGuideState.currentDownloadSetting) && this.vcdGuideLoaded == myProfileGuideState.vcdGuideLoaded && this.hasPermissionPopUp == myProfileGuideState.hasPermissionPopUp && this.needCheckI18nRecommendUserDialog == myProfileGuideState.needCheckI18nRecommendUserDialog && l.a(this.followerCount, myProfileGuideState.followerCount) && l.a(this.currentCommentSetting, myProfileGuideState.currentCommentSetting) && l.a(this.firstRefreshPublishAwemeList, myProfileGuideState.firstRefreshPublishAwemeList) && l.a(this.firstRefreshPrivateAwemeList, myProfileGuideState.firstRefreshPrivateAwemeList);
    }

    public final int hashCode() {
        boolean z = this.hasGuideShowed;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.postListHasLoaded;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.avatarHasLoaded;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        boolean z4 = this.hasSurveyDetermined;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        a aVar = this.surveyData;
        int i19 = 0;
        int hashCode = (i18 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Boolean bool = this.needShowDiskManagerGuide;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num = this.currentDownloadSetting;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z5 = this.vcdGuideLoaded;
        if (z5) {
            z5 = true;
        }
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = z5 ? 1 : 0;
        int i23 = (hashCode3 + i20) * 31;
        boolean z6 = this.hasPermissionPopUp;
        if (z6) {
            z6 = true;
        }
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = z6 ? 1 : 0;
        int i27 = (i23 + i24) * 31;
        if (!this.needCheckI18nRecommendUserDialog) {
            i2 = 0;
        }
        int i28 = (i27 + i2) * 31;
        Integer num2 = this.followerCount;
        int hashCode4 = (i28 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.currentCommentSetting;
        int hashCode5 = (hashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31;
        List<Aweme> list = this.firstRefreshPublishAwemeList;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        List<Aweme> list2 = this.firstRefreshPrivateAwemeList;
        if (list2 != null) {
            i19 = list2.hashCode();
        }
        return hashCode6 + i19;
    }

    public final String toString() {
        return "MyProfileGuideState(hasGuideShowed=" + this.hasGuideShowed + ", postListHasLoaded=" + this.postListHasLoaded + ", avatarHasLoaded=" + this.avatarHasLoaded + ", hasSurveyDetermined=" + this.hasSurveyDetermined + ", surveyData=" + this.surveyData + ", needShowDiskManagerGuide=" + this.needShowDiskManagerGuide + ", currentDownloadSetting=" + this.currentDownloadSetting + ", vcdGuideLoaded=" + this.vcdGuideLoaded + ", hasPermissionPopUp=" + this.hasPermissionPopUp + ", needCheckI18nRecommendUserDialog=" + this.needCheckI18nRecommendUserDialog + ", followerCount=" + this.followerCount + ", currentCommentSetting=" + this.currentCommentSetting + ", firstRefreshPublishAwemeList=" + this.firstRefreshPublishAwemeList + ", firstRefreshPrivateAwemeList=" + this.firstRefreshPrivateAwemeList + ")";
    }

    public final boolean getAvatarHasLoaded() {
        return this.avatarHasLoaded;
    }

    public final Integer getCurrentCommentSetting() {
        return this.currentCommentSetting;
    }

    public final Integer getCurrentDownloadSetting() {
        return this.currentDownloadSetting;
    }

    public final List<Aweme> getFirstRefreshPrivateAwemeList() {
        return this.firstRefreshPrivateAwemeList;
    }

    public final List<Aweme> getFirstRefreshPublishAwemeList() {
        return this.firstRefreshPublishAwemeList;
    }

    public final Integer getFollowerCount() {
        return this.followerCount;
    }

    public final boolean getHasGuideShowed() {
        return this.hasGuideShowed;
    }

    public final boolean getHasPermissionPopUp() {
        return this.hasPermissionPopUp;
    }

    public final boolean getHasSurveyDetermined() {
        return this.hasSurveyDetermined;
    }

    public final boolean getNeedCheckI18nRecommendUserDialog() {
        return this.needCheckI18nRecommendUserDialog;
    }

    public final Boolean getNeedShowDiskManagerGuide() {
        return this.needShowDiskManagerGuide;
    }

    public final boolean getPostListHasLoaded() {
        return this.postListHasLoaded;
    }

    public final a getSurveyData() {
        return this.surveyData;
    }

    public final boolean getVcdGuideLoaded() {
        return this.vcdGuideLoaded;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    public MyProfileGuideState(boolean z, boolean z2, boolean z3, boolean z4, a aVar, Boolean bool, Integer num, boolean z5, boolean z6, boolean z7, Integer num2, Integer num3, List<? extends Aweme> list, List<? extends Aweme> list2) {
        this.hasGuideShowed = z;
        this.postListHasLoaded = z2;
        this.avatarHasLoaded = z3;
        this.hasSurveyDetermined = z4;
        this.surveyData = aVar;
        this.needShowDiskManagerGuide = bool;
        this.currentDownloadSetting = num;
        this.vcdGuideLoaded = z5;
        this.hasPermissionPopUp = z6;
        this.needCheckI18nRecommendUserDialog = z7;
        this.followerCount = num2;
        this.currentCommentSetting = num3;
        this.firstRefreshPublishAwemeList = list;
        this.firstRefreshPrivateAwemeList = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MyProfileGuideState(boolean z, boolean z2, boolean z3, boolean z4, a aVar, Boolean bool, Integer num, boolean z5, boolean z6, boolean z7, Integer num2, Integer num3, List list, List list2, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? false : z4, (i2 & 16) != 0 ? null : aVar, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? false : z5, (i2 & 256) == 0 ? z6 : false, (i2 & 512) != 0 ? true : z7, (i2 & 1024) != 0 ? null : num2, (i2 & 2048) != 0 ? null : num3, (i2 & 4096) != 0 ? null : list, (i2 & 8192) == 0 ? list2 : null);
    }
}
