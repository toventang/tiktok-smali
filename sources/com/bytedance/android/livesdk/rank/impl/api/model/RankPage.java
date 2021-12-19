package com.bytedance.android.livesdk.rank.impl.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class RankPage {
    @c(a = "countdown")
    private final int countdown;
    @c(a = "owner_rank")
    private final OwnerRank ownerRank;
    @c(a = "rank_type")
    private final int rankType;
    @c(a = "ranks")
    private final List<Rank> ranks;
    @c(a = "weekly_region_info")
    private final WeeklyRankRegionInfo regionInfo;
    @c(a = "rule_url")
    private final String ruleUrl;
    @c(a = "sub_pages")
    private List<RankPage> subPages;
    @c(a = "title")
    private final String title;

    static {
        Covode.recordClassIndex(12191);
    }

    public static int com_bytedance_android_livesdk_rank_impl_api_model_RankPage_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.android.livesdk.rank.impl.api.model.RankPage */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RankPage copy$default(RankPage rankPage, String str, String str2, List list, OwnerRank ownerRank2, int i2, int i3, WeeklyRankRegionInfo weeklyRankRegionInfo, List list2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = rankPage.title;
        }
        if ((i4 & 2) != 0) {
            str2 = rankPage.ruleUrl;
        }
        if ((i4 & 4) != 0) {
            list = rankPage.ranks;
        }
        if ((i4 & 8) != 0) {
            ownerRank2 = rankPage.ownerRank;
        }
        if ((i4 & 16) != 0) {
            i2 = rankPage.countdown;
        }
        if ((i4 & 32) != 0) {
            i3 = rankPage.rankType;
        }
        if ((i4 & 64) != 0) {
            weeklyRankRegionInfo = rankPage.regionInfo;
        }
        if ((i4 & 128) != 0) {
            list2 = rankPage.subPages;
        }
        return rankPage.copy(str, str2, list, ownerRank2, i2, i3, weeklyRankRegionInfo, list2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.ruleUrl;
    }

    public final List<Rank> component3() {
        return this.ranks;
    }

    public final OwnerRank component4() {
        return this.ownerRank;
    }

    public final int component5() {
        return this.countdown;
    }

    public final int component6() {
        return this.rankType;
    }

    public final WeeklyRankRegionInfo component7() {
        return this.regionInfo;
    }

    public final List<RankPage> component8() {
        return this.subPages;
    }

    public final RankPage copy(String str, String str2, List<Rank> list, OwnerRank ownerRank2, int i2, int i3, WeeklyRankRegionInfo weeklyRankRegionInfo, List<RankPage> list2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(list, "");
        l.d(ownerRank2, "");
        return new RankPage(str, str2, list, ownerRank2, i2, i3, weeklyRankRegionInfo, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RankPage)) {
            return false;
        }
        RankPage rankPage = (RankPage) obj;
        return l.a(this.title, rankPage.title) && l.a(this.ruleUrl, rankPage.ruleUrl) && l.a(this.ranks, rankPage.ranks) && l.a(this.ownerRank, rankPage.ownerRank) && this.countdown == rankPage.countdown && this.rankType == rankPage.rankType && l.a(this.regionInfo, rankPage.regionInfo) && l.a(this.subPages, rankPage.subPages);
    }

    public final int hashCode() {
        String str = this.title;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.ruleUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<Rank> list = this.ranks;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        OwnerRank ownerRank2 = this.ownerRank;
        int hashCode4 = (((((hashCode3 + (ownerRank2 != null ? ownerRank2.hashCode() : 0)) * 31) + com_bytedance_android_livesdk_rank_impl_api_model_RankPage_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.countdown)) * 31) + com_bytedance_android_livesdk_rank_impl_api_model_RankPage_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.rankType)) * 31;
        WeeklyRankRegionInfo weeklyRankRegionInfo = this.regionInfo;
        int hashCode5 = (hashCode4 + (weeklyRankRegionInfo != null ? weeklyRankRegionInfo.hashCode() : 0)) * 31;
        List<RankPage> list2 = this.subPages;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "RankPage(title=" + this.title + ", ruleUrl=" + this.ruleUrl + ", ranks=" + this.ranks + ", ownerRank=" + this.ownerRank + ", countdown=" + this.countdown + ", rankType=" + this.rankType + ", regionInfo=" + this.regionInfo + ", subPages=" + this.subPages + ")";
    }

    public final int getCountdown() {
        return this.countdown;
    }

    public final OwnerRank getOwnerRank() {
        return this.ownerRank;
    }

    public final int getRankType() {
        return this.rankType;
    }

    public final List<Rank> getRanks() {
        return this.ranks;
    }

    public final WeeklyRankRegionInfo getRegionInfo() {
        return this.regionInfo;
    }

    public final String getRuleUrl() {
        return this.ruleUrl;
    }

    public final List<RankPage> getSubPages() {
        return this.subPages;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setSubPages(List<RankPage> list) {
        this.subPages = list;
    }

    public RankPage(String str, String str2, List<Rank> list, OwnerRank ownerRank2, int i2, int i3, WeeklyRankRegionInfo weeklyRankRegionInfo, List<RankPage> list2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(list, "");
        l.d(ownerRank2, "");
        this.title = str;
        this.ruleUrl = str2;
        this.ranks = list;
        this.ownerRank = ownerRank2;
        this.countdown = i2;
        this.rankType = i3;
        this.regionInfo = weeklyRankRegionInfo;
        this.subPages = list2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RankPage(java.lang.String r21, java.lang.String r22, java.util.List r23, com.bytedance.android.livesdk.rank.impl.api.model.OwnerRank r24, int r25, int r26, com.bytedance.android.livesdk.rank.impl.api.model.WeeklyRankRegionInfo r27, java.util.List r28, int r29, h.f.b.g r30) {
        /*
            r20 = this;
            r12 = r21
            r18 = r27
            r17 = r26
            r14 = r23
            r1 = r24
            r16 = r25
            r0 = r29 & 1
            java.lang.String r13 = ""
            if (r0 == 0) goto L_0x0013
            r12 = r13
        L_0x0013:
            r0 = r29 & 2
            if (r0 == 0) goto L_0x0051
        L_0x0017:
            r0 = r29 & 4
            if (r0 == 0) goto L_0x0020
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x0020:
            r0 = r29 & 8
            if (r0 == 0) goto L_0x0034
            com.bytedance.android.livesdk.rank.impl.api.model.OwnerRank r1 = new com.bytedance.android.livesdk.rank.impl.api.model.OwnerRank
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 63
            r11 = 0
            r1.<init>(r2, r3, r4, r5, r6, r8, r10, r11)
        L_0x0034:
            r0 = r29 & 16
            if (r0 == 0) goto L_0x003b
            r0 = 0
            r16 = 0
        L_0x003b:
            r0 = r29 & 32
            if (r0 == 0) goto L_0x0042
            r0 = 1
            r17 = 1
        L_0x0042:
            r0 = r29 & 64
            if (r0 == 0) goto L_0x0048
            r18 = 0
        L_0x0048:
            r11 = r20
            r19 = r28
            r15 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x0051:
            r13 = r22
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.rank.impl.api.model.RankPage.<init>(java.lang.String, java.lang.String, java.util.List, com.bytedance.android.livesdk.rank.impl.api.model.OwnerRank, int, int, com.bytedance.android.livesdk.rank.impl.api.model.WeeklyRankRegionInfo, java.util.List, int, h.f.b.g):void");
    }
}
