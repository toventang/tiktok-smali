package com.ss.android.ugc.aweme.profile.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.a;
import com.bytedance.jedi.arch.af;
import com.bytedance.lighten.a.o;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import h.p;
import java.util.List;

public final class ProfileState implements af {
    private final int avatarClickCount;
    private final int curTabType;
    private final Integer currentCommentSetting;
    private final Integer currentDownloadSetting;
    private final String enterFrom;
    private final List<Aweme> firstRefreshPrivateAwemeList;
    private final List<Aweme> firstRefreshPublishAwemeList;
    private final String from;
    private final String fromSearch;
    private final boolean isAvatarClicked;
    private final boolean isBackgroundCoverClicked;
    private final Boolean isGuideUserCard;
    private final Boolean isPostAwemeEmpty;
    private final Boolean isPostAwemeEmptyWhenPrivateShow;
    private final Boolean isPostGuideShow;
    private final String livePreviousPage;
    private final a<p<UrlModel, o>> loadAvatar;
    private final boolean needShowProfileCollectionGuide;
    private final String needUpdateAvatarUrl;
    private final boolean onHiddenChanged;
    private final Aweme sourceAweme;
    private final String suid;
    private final String uid;
    private final User user;
    private final boolean userVisibleHint;

    static {
        Covode.recordClassIndex(75902);
    }

    public ProfileState() {
        this(null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, false, false, false, null, false, null, null, null, null, 33554431, null);
    }

    public static int com_ss_android_ugc_aweme_profile_viewmodel_ProfileState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ ProfileState copy$default(ProfileState profileState, String str, String str2, User user2, Aweme aweme, a aVar, int i2, int i3, boolean z, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, boolean z2, boolean z3, boolean z4, Integer num, boolean z5, String str7, Integer num2, List list, List list2, int i4, Object obj) {
        String str8 = str2;
        String str9 = str;
        Boolean bool5 = bool2;
        Boolean bool6 = bool;
        int i5 = i2;
        a<p<UrlModel, o>> aVar2 = aVar;
        Aweme aweme2 = aweme;
        User user3 = user2;
        int i6 = i3;
        boolean z6 = z;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        boolean z7 = z3;
        boolean z8 = z2;
        Boolean bool7 = bool4;
        Boolean bool8 = bool3;
        List list3 = list2;
        boolean z9 = z4;
        Integer num3 = num;
        boolean z10 = z5;
        String str14 = str7;
        Integer num4 = num2;
        List list4 = list;
        if ((i4 & 1) != 0) {
            str9 = profileState.uid;
        }
        if ((i4 & 2) != 0) {
            str8 = profileState.suid;
        }
        if ((i4 & 4) != 0) {
            user3 = profileState.user;
        }
        if ((i4 & 8) != 0) {
            aweme2 = profileState.sourceAweme;
        }
        if ((i4 & 16) != 0) {
            aVar2 = profileState.loadAvatar;
        }
        if ((i4 & 32) != 0) {
            i5 = profileState.avatarClickCount;
        }
        if ((i4 & 64) != 0) {
            i6 = profileState.curTabType;
        }
        if ((i4 & 128) != 0) {
            z6 = profileState.userVisibleHint;
        }
        if ((i4 & 256) != 0) {
            str10 = profileState.needUpdateAvatarUrl;
        }
        if ((i4 & 512) != 0) {
            str11 = profileState.livePreviousPage;
        }
        if ((i4 & 1024) != 0) {
            str12 = profileState.from;
        }
        if ((i4 & 2048) != 0) {
            str13 = profileState.enterFrom;
        }
        if ((i4 & 4096) != 0) {
            bool6 = profileState.isPostGuideShow;
        }
        if ((i4 & 8192) != 0) {
            bool5 = profileState.isPostAwemeEmpty;
        }
        if ((i4 & 16384) != 0) {
            bool8 = profileState.isGuideUserCard;
        }
        if ((32768 & i4) != 0) {
            bool7 = profileState.isPostAwemeEmptyWhenPrivateShow;
        }
        if ((65536 & i4) != 0) {
            z8 = profileState.needShowProfileCollectionGuide;
        }
        if ((131072 & i4) != 0) {
            z7 = profileState.isAvatarClicked;
        }
        if ((262144 & i4) != 0) {
            z9 = profileState.isBackgroundCoverClicked;
        }
        if ((524288 & i4) != 0) {
            num3 = profileState.currentDownloadSetting;
        }
        if ((1048576 & i4) != 0) {
            z10 = profileState.onHiddenChanged;
        }
        if ((2097152 & i4) != 0) {
            str14 = profileState.fromSearch;
        }
        if ((4194304 & i4) != 0) {
            num4 = profileState.currentCommentSetting;
        }
        if ((8388608 & i4) != 0) {
            list4 = profileState.firstRefreshPublishAwemeList;
        }
        if ((i4 & 16777216) != 0) {
            list3 = profileState.firstRefreshPrivateAwemeList;
        }
        return profileState.copy(str9, str8, user3, aweme2, aVar2, i5, i6, z6, str10, str11, str12, str13, bool6, bool5, bool8, bool7, z8, z7, z9, num3, z10, str14, num4, list4, list3);
    }

    public final String component1() {
        return this.uid;
    }

    public final String component10() {
        return this.livePreviousPage;
    }

    public final String component11() {
        return this.from;
    }

    public final String component12() {
        return this.enterFrom;
    }

    public final Boolean component13() {
        return this.isPostGuideShow;
    }

    public final Boolean component14() {
        return this.isPostAwemeEmpty;
    }

    public final Boolean component15() {
        return this.isGuideUserCard;
    }

    public final Boolean component16() {
        return this.isPostAwemeEmptyWhenPrivateShow;
    }

    public final boolean component17() {
        return this.needShowProfileCollectionGuide;
    }

    public final boolean component18() {
        return this.isAvatarClicked;
    }

    public final boolean component19() {
        return this.isBackgroundCoverClicked;
    }

    public final String component2() {
        return this.suid;
    }

    public final Integer component20() {
        return this.currentDownloadSetting;
    }

    public final boolean component21() {
        return this.onHiddenChanged;
    }

    public final String component22() {
        return this.fromSearch;
    }

    public final Integer component23() {
        return this.currentCommentSetting;
    }

    public final List<Aweme> component24() {
        return this.firstRefreshPublishAwemeList;
    }

    public final List<Aweme> component25() {
        return this.firstRefreshPrivateAwemeList;
    }

    public final User component3() {
        return this.user;
    }

    public final Aweme component4() {
        return this.sourceAweme;
    }

    public final a<p<UrlModel, o>> component5() {
        return this.loadAvatar;
    }

    public final int component6() {
        return this.avatarClickCount;
    }

    public final int component7() {
        return this.curTabType;
    }

    public final boolean component8() {
        return this.userVisibleHint;
    }

    public final String component9() {
        return this.needUpdateAvatarUrl;
    }

    public final ProfileState copy(String str, String str2, User user2, Aweme aweme, a<? extends p<? extends UrlModel, ? extends o>> aVar, int i2, int i3, boolean z, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, boolean z2, boolean z3, boolean z4, Integer num, boolean z5, String str7, Integer num2, List<? extends Aweme> list, List<? extends Aweme> list2) {
        l.d(aVar, "");
        return new ProfileState(str, str2, user2, aweme, aVar, i2, i3, z, str3, str4, str5, str6, bool, bool2, bool3, bool4, z2, z3, z4, num, z5, str7, num2, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileState)) {
            return false;
        }
        ProfileState profileState = (ProfileState) obj;
        return l.a(this.uid, profileState.uid) && l.a(this.suid, profileState.suid) && l.a(this.user, profileState.user) && l.a(this.sourceAweme, profileState.sourceAweme) && l.a(this.loadAvatar, profileState.loadAvatar) && this.avatarClickCount == profileState.avatarClickCount && this.curTabType == profileState.curTabType && this.userVisibleHint == profileState.userVisibleHint && l.a(this.needUpdateAvatarUrl, profileState.needUpdateAvatarUrl) && l.a(this.livePreviousPage, profileState.livePreviousPage) && l.a(this.from, profileState.from) && l.a(this.enterFrom, profileState.enterFrom) && l.a(this.isPostGuideShow, profileState.isPostGuideShow) && l.a(this.isPostAwemeEmpty, profileState.isPostAwemeEmpty) && l.a(this.isGuideUserCard, profileState.isGuideUserCard) && l.a(this.isPostAwemeEmptyWhenPrivateShow, profileState.isPostAwemeEmptyWhenPrivateShow) && this.needShowProfileCollectionGuide == profileState.needShowProfileCollectionGuide && this.isAvatarClicked == profileState.isAvatarClicked && this.isBackgroundCoverClicked == profileState.isBackgroundCoverClicked && l.a(this.currentDownloadSetting, profileState.currentDownloadSetting) && this.onHiddenChanged == profileState.onHiddenChanged && l.a(this.fromSearch, profileState.fromSearch) && l.a(this.currentCommentSetting, profileState.currentCommentSetting) && l.a(this.firstRefreshPublishAwemeList, profileState.firstRefreshPublishAwemeList) && l.a(this.firstRefreshPrivateAwemeList, profileState.firstRefreshPrivateAwemeList);
    }

    public final int hashCode() {
        String str = this.uid;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.suid;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        User user2 = this.user;
        int hashCode3 = (hashCode2 + (user2 != null ? user2.hashCode() : 0)) * 31;
        Aweme aweme = this.sourceAweme;
        int hashCode4 = (hashCode3 + (aweme != null ? aweme.hashCode() : 0)) * 31;
        a<p<UrlModel, o>> aVar = this.loadAvatar;
        int hashCode5 = (((((hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_profile_viewmodel_ProfileState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.avatarClickCount)) * 31) + com_ss_android_ugc_aweme_profile_viewmodel_ProfileState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.curTabType)) * 31;
        boolean z = this.userVisibleHint;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode5 + i4) * 31;
        String str3 = this.needUpdateAvatarUrl;
        int hashCode6 = (i7 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.livePreviousPage;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.from;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.enterFrom;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Boolean bool = this.isPostGuideShow;
        int hashCode10 = (hashCode9 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.isPostAwemeEmpty;
        int hashCode11 = (hashCode10 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.isGuideUserCard;
        int hashCode12 = (hashCode11 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.isPostAwemeEmptyWhenPrivateShow;
        int hashCode13 = (hashCode12 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        boolean z2 = this.needShowProfileCollectionGuide;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (hashCode13 + i8) * 31;
        boolean z3 = this.isAvatarClicked;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (i11 + i12) * 31;
        boolean z4 = this.isBackgroundCoverClicked;
        if (z4) {
            z4 = true;
        }
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = (i15 + i16) * 31;
        Integer num = this.currentDownloadSetting;
        int hashCode14 = (i19 + (num != null ? num.hashCode() : 0)) * 31;
        if (!this.onHiddenChanged) {
            i3 = 0;
        }
        int i20 = (hashCode14 + i3) * 31;
        String str7 = this.fromSearch;
        int hashCode15 = (i20 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Integer num2 = this.currentCommentSetting;
        int hashCode16 = (hashCode15 + (num2 != null ? num2.hashCode() : 0)) * 31;
        List<Aweme> list = this.firstRefreshPublishAwemeList;
        int hashCode17 = (hashCode16 + (list != null ? list.hashCode() : 0)) * 31;
        List<Aweme> list2 = this.firstRefreshPrivateAwemeList;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode17 + i2;
    }

    public final String toString() {
        return "ProfileState(uid=" + this.uid + ", suid=" + this.suid + ", user=" + this.user + ", sourceAweme=" + this.sourceAweme + ", loadAvatar=" + this.loadAvatar + ", avatarClickCount=" + this.avatarClickCount + ", curTabType=" + this.curTabType + ", userVisibleHint=" + this.userVisibleHint + ", needUpdateAvatarUrl=" + this.needUpdateAvatarUrl + ", livePreviousPage=" + this.livePreviousPage + ", from=" + this.from + ", enterFrom=" + this.enterFrom + ", isPostGuideShow=" + this.isPostGuideShow + ", isPostAwemeEmpty=" + this.isPostAwemeEmpty + ", isGuideUserCard=" + this.isGuideUserCard + ", isPostAwemeEmptyWhenPrivateShow=" + this.isPostAwemeEmptyWhenPrivateShow + ", needShowProfileCollectionGuide=" + this.needShowProfileCollectionGuide + ", isAvatarClicked=" + this.isAvatarClicked + ", isBackgroundCoverClicked=" + this.isBackgroundCoverClicked + ", currentDownloadSetting=" + this.currentDownloadSetting + ", onHiddenChanged=" + this.onHiddenChanged + ", fromSearch=" + this.fromSearch + ", currentCommentSetting=" + this.currentCommentSetting + ", firstRefreshPublishAwemeList=" + this.firstRefreshPublishAwemeList + ", firstRefreshPrivateAwemeList=" + this.firstRefreshPrivateAwemeList + ")";
    }

    public final int getAvatarClickCount() {
        return this.avatarClickCount;
    }

    public final int getCurTabType() {
        return this.curTabType;
    }

    public final Integer getCurrentCommentSetting() {
        return this.currentCommentSetting;
    }

    public final Integer getCurrentDownloadSetting() {
        return this.currentDownloadSetting;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final List<Aweme> getFirstRefreshPrivateAwemeList() {
        return this.firstRefreshPrivateAwemeList;
    }

    public final List<Aweme> getFirstRefreshPublishAwemeList() {
        return this.firstRefreshPublishAwemeList;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getFromSearch() {
        return this.fromSearch;
    }

    public final String getLivePreviousPage() {
        return this.livePreviousPage;
    }

    public final a<p<UrlModel, o>> getLoadAvatar() {
        return this.loadAvatar;
    }

    public final boolean getNeedShowProfileCollectionGuide() {
        return this.needShowProfileCollectionGuide;
    }

    public final String getNeedUpdateAvatarUrl() {
        return this.needUpdateAvatarUrl;
    }

    public final boolean getOnHiddenChanged() {
        return this.onHiddenChanged;
    }

    public final Aweme getSourceAweme() {
        return this.sourceAweme;
    }

    public final String getSuid() {
        return this.suid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final User getUser() {
        return this.user;
    }

    public final boolean getUserVisibleHint() {
        return this.userVisibleHint;
    }

    public final boolean isAvatarClicked() {
        return this.isAvatarClicked;
    }

    public final boolean isBackgroundCoverClicked() {
        return this.isBackgroundCoverClicked;
    }

    public final Boolean isGuideUserCard() {
        return this.isGuideUserCard;
    }

    public final Boolean isPostAwemeEmpty() {
        return this.isPostAwemeEmpty;
    }

    public final Boolean isPostAwemeEmptyWhenPrivateShow() {
        return this.isPostAwemeEmptyWhenPrivateShow;
    }

    public final Boolean isPostGuideShow() {
        return this.isPostGuideShow;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.bytedance.jedi.arch.a<? extends h.p<? extends com.ss.android.ugc.aweme.base.model.UrlModel, ? extends com.bytedance.lighten.a.o>> */
    /* JADX DEBUG: Multi-variable search result rejected for r26v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX DEBUG: Multi-variable search result rejected for r27v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    public ProfileState(String str, String str2, User user2, Aweme aweme, a<? extends p<? extends UrlModel, ? extends o>> aVar, int i2, int i3, boolean z, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, boolean z2, boolean z3, boolean z4, Integer num, boolean z5, String str7, Integer num2, List<? extends Aweme> list, List<? extends Aweme> list2) {
        l.d(aVar, "");
        this.uid = str;
        this.suid = str2;
        this.user = user2;
        this.sourceAweme = aweme;
        this.loadAvatar = aVar;
        this.avatarClickCount = i2;
        this.curTabType = i3;
        this.userVisibleHint = z;
        this.needUpdateAvatarUrl = str3;
        this.livePreviousPage = str4;
        this.from = str5;
        this.enterFrom = str6;
        this.isPostGuideShow = bool;
        this.isPostAwemeEmpty = bool2;
        this.isGuideUserCard = bool3;
        this.isPostAwemeEmptyWhenPrivateShow = bool4;
        this.needShowProfileCollectionGuide = z2;
        this.isAvatarClicked = z3;
        this.isBackgroundCoverClicked = z4;
        this.currentDownloadSetting = num;
        this.onHiddenChanged = z5;
        this.fromSearch = str7;
        this.currentCommentSetting = num2;
        this.firstRefreshPublishAwemeList = list;
        this.firstRefreshPrivateAwemeList = list2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ProfileState(java.lang.String r28, java.lang.String r29, com.ss.android.ugc.aweme.profile.model.User r30, com.ss.android.ugc.aweme.feed.model.Aweme r31, com.bytedance.jedi.arch.a r32, int r33, int r34, boolean r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.Boolean r40, java.lang.Boolean r41, java.lang.Boolean r42, java.lang.Boolean r43, boolean r44, boolean r45, boolean r46, java.lang.Integer r47, boolean r48, java.lang.String r49, java.lang.Integer r50, java.util.List r51, java.util.List r52, int r53, h.f.b.g r54) {
        /*
        // Method dump skipped, instructions count: 210
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.viewmodel.ProfileState.<init>(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.aweme.feed.model.Aweme, com.bytedance.jedi.arch.a, int, int, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, boolean, boolean, boolean, java.lang.Integer, boolean, java.lang.String, java.lang.Integer, java.util.List, java.util.List, int, h.f.b.g):void");
    }
}
