package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.b;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.model.g;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class TrendingTopic extends a implements LazyDeserializeItem, Serializable {
    @b(a = StringJsonAdapterFactory.class)
    @c(a = "ad_data")
    private final TrendingTopicsAdInfo adData;
    @c(a = "creator_info")
    private final User author;
    @c(a = "category_type")
    private final int categoryType;
    @c(a = "challenge_info")
    private final Challenge challenge;
    @c(a = "desc")
    private final String desc;
    @c(a = "effect_info")
    private final g effect;
    @c(a = "aweme_list")
    private final List<Aweme> items;
    @c(a = "music_info")
    private final Music music;
    private transient boolean needToBeSupplied;
    @c(a = "word_record")
    private final Word word;

    static {
        Covode.recordClassIndex(50980);
    }

    public TrendingTopic() {
        this(0, null, null, null, null, null, null, null, null, 511, null);
    }

    public static int com_ss_android_ugc_aweme_discover_model_TrendingTopic_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.discover.model.TrendingTopic */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrendingTopic copy$default(TrendingTopic trendingTopic, int i2, List list, Challenge challenge2, Music music2, g gVar, User user, String str, Word word2, TrendingTopicsAdInfo trendingTopicsAdInfo, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = trendingTopic.categoryType;
        }
        if ((i3 & 2) != 0) {
            list = trendingTopic.items;
        }
        if ((i3 & 4) != 0) {
            challenge2 = trendingTopic.challenge;
        }
        if ((i3 & 8) != 0) {
            music2 = trendingTopic.music;
        }
        if ((i3 & 16) != 0) {
            gVar = trendingTopic.effect;
        }
        if ((i3 & 32) != 0) {
            user = trendingTopic.author;
        }
        if ((i3 & 64) != 0) {
            str = trendingTopic.desc;
        }
        if ((i3 & 128) != 0) {
            word2 = trendingTopic.word;
        }
        if ((i3 & 256) != 0) {
            trendingTopicsAdInfo = trendingTopic.adData;
        }
        return trendingTopic.copy(i2, list, challenge2, music2, gVar, user, str, word2, trendingTopicsAdInfo);
    }

    public final int component1() {
        return this.categoryType;
    }

    public final List<Aweme> component2() {
        return this.items;
    }

    public final Challenge component3() {
        return this.challenge;
    }

    public final Music component4() {
        return this.music;
    }

    public final g component5() {
        return this.effect;
    }

    public final User component6() {
        return this.author;
    }

    public final String component7() {
        return this.desc;
    }

    public final Word component8() {
        return this.word;
    }

    public final TrendingTopicsAdInfo component9() {
        return this.adData;
    }

    public final TrendingTopic copy(int i2, List<? extends Aweme> list, Challenge challenge2, Music music2, g gVar, User user, String str, Word word2, TrendingTopicsAdInfo trendingTopicsAdInfo) {
        l.d(str, "");
        return new TrendingTopic(i2, list, challenge2, music2, gVar, user, str, word2, trendingTopicsAdInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendingTopic)) {
            return false;
        }
        TrendingTopic trendingTopic = (TrendingTopic) obj;
        return this.categoryType == trendingTopic.categoryType && l.a(this.items, trendingTopic.items) && l.a(this.challenge, trendingTopic.challenge) && l.a(this.music, trendingTopic.music) && l.a(this.effect, trendingTopic.effect) && l.a(this.author, trendingTopic.author) && l.a(this.desc, trendingTopic.desc) && l.a(this.word, trendingTopic.word) && l.a(this.adData, trendingTopic.adData);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_discover_model_TrendingTopic_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_discover_model_TrendingTopic_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.categoryType) * 31;
        List<Aweme> list = this.items;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_discover_model_TrendingTopic_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Challenge challenge2 = this.challenge;
        int hashCode2 = (hashCode + (challenge2 != null ? challenge2.hashCode() : 0)) * 31;
        Music music2 = this.music;
        int hashCode3 = (hashCode2 + (music2 != null ? music2.hashCode() : 0)) * 31;
        g gVar = this.effect;
        int hashCode4 = (hashCode3 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        User user = this.author;
        int hashCode5 = (hashCode4 + (user != null ? user.hashCode() : 0)) * 31;
        String str = this.desc;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 31;
        Word word2 = this.word;
        int hashCode7 = (hashCode6 + (word2 != null ? word2.hashCode() : 0)) * 31;
        TrendingTopicsAdInfo trendingTopicsAdInfo = this.adData;
        if (trendingTopicsAdInfo != null) {
            i2 = trendingTopicsAdInfo.hashCode();
        }
        return hashCode7 + i2;
    }

    public final String toString() {
        return "TrendingTopic(categoryType=" + this.categoryType + ", items=" + this.items + ", challenge=" + this.challenge + ", music=" + this.music + ", effect=" + this.effect + ", author=" + this.author + ", desc=" + this.desc + ", word=" + this.word + ", adData=" + this.adData + ")";
    }

    public final TrendingTopicsAdInfo getAdData() {
        return this.adData;
    }

    public final User getAuthor() {
        return this.author;
    }

    public final int getCategoryType() {
        return this.categoryType;
    }

    public final Challenge getChallenge() {
        return this.challenge;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final g getEffect() {
        return this.effect;
    }

    public final List<Aweme> getItems() {
        return this.items;
    }

    public final Music getMusic() {
        return this.music;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.LazyDeserializeItem
    public final boolean getNeedToBeSupplied() {
        return this.needToBeSupplied;
    }

    public final Word getWord() {
        return this.word;
    }

    public final boolean isAd() {
        if (this.adData != null) {
            return true;
        }
        return false;
    }

    public final boolean isChallenge() {
        if (this.challenge != null) {
            return true;
        }
        return false;
    }

    public final boolean isMusic() {
        if (this.music != null) {
            return true;
        }
        return false;
    }

    public final UrlModel getClickTrackUrlList() {
        TrendingTopicsAdInfo trendingTopicsAdInfo = this.adData;
        if (trendingTopicsAdInfo != null) {
            return trendingTopicsAdInfo.getClickTrackUrlList();
        }
        return null;
    }

    public final long getCreativeId() {
        TrendingTopicsAdInfo trendingTopicsAdInfo = this.adData;
        if (trendingTopicsAdInfo != null) {
            return trendingTopicsAdInfo.getCreativeId();
        }
        return 0;
    }

    public final String getLogExtra() {
        TrendingTopicsAdInfo trendingTopicsAdInfo = this.adData;
        if (trendingTopicsAdInfo != null) {
            return trendingTopicsAdInfo.getLogExtra();
        }
        return null;
    }

    public final UrlModel getTrackUrlList() {
        TrendingTopicsAdInfo trendingTopicsAdInfo = this.adData;
        if (trendingTopicsAdInfo != null) {
            return trendingTopicsAdInfo.getTrackUrlList();
        }
        return null;
    }

    public final boolean isChallengeAd() {
        if (!isAd() || this.challenge == null) {
            return false;
        }
        return true;
    }

    public final boolean isPicAd() {
        if (!isAd() || this.challenge != null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.LazyDeserializeItem
    public final void setNeedToBeSupplied(boolean z) {
        this.needToBeSupplied = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    public TrendingTopic(int i2, List<? extends Aweme> list, Challenge challenge2, Music music2, g gVar, User user, String str, Word word2, TrendingTopicsAdInfo trendingTopicsAdInfo) {
        l.d(str, "");
        this.categoryType = i2;
        this.items = list;
        this.challenge = challenge2;
        this.music = music2;
        this.effect = gVar;
        this.author = user;
        this.desc = str;
        this.word = word2;
        this.adData = trendingTopicsAdInfo;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TrendingTopic(int i2, List list, Challenge challenge2, Music music2, g gVar, User user, String str, Word word2, TrendingTopicsAdInfo trendingTopicsAdInfo, int i3, h.f.b.g gVar2) {
        this((i3 & 1) != 0 ? 0 : i2, (i3 & 2) != 0 ? null : list, (i3 & 4) != 0 ? null : challenge2, (i3 & 8) != 0 ? null : music2, (i3 & 16) != 0 ? null : gVar, (i3 & 32) != 0 ? null : user, (i3 & 64) != 0 ? "" : str, (i3 & 128) != 0 ? null : word2, (i3 & 256) == 0 ? trendingTopicsAdInfo : null);
    }
}
