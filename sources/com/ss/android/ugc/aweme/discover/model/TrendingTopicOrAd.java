package com.ss.android.ugc.aweme.discover.model;

import com.a;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.Arrays;

public final class TrendingTopicOrAd implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 42;
    private final TrendingTopicsAdInfo ad;
    public final TrendingTopic topic;

    static {
        Covode.recordClassIndex(50982);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(50983);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final TrendingTopicsAdInfo getAd() {
        return this.ad;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean isAd() {
        if (this.ad != null) {
            return true;
        }
        return false;
    }

    public final boolean isTopic() {
        if (this.topic != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        Long l2;
        if (isAd()) {
            Object[] objArr = new Object[1];
            TrendingTopicsAdInfo trendingTopicsAdInfo = this.ad;
            if (trendingTopicsAdInfo != null) {
                l2 = Long.valueOf(trendingTopicsAdInfo.getAdId());
            } else {
                l2 = null;
            }
            objArr[0] = l2;
            String a2 = a.a("TrendingTopicOrAd[Ad %d]", Arrays.copyOf(objArr, 1));
            l.b(a2, "");
            return a2;
        }
        TrendingTopic trendingTopic = this.topic;
        if (trendingTopic == null) {
            l.b();
        }
        if (trendingTopic.getChallenge() != null) {
            Object[] objArr2 = new Object[1];
            Challenge challenge = this.topic.getChallenge();
            if (challenge == null) {
                l.b();
            }
            objArr2[0] = challenge.getDesc();
            String a3 = a.a("TrendingTopicOrAd[Category.challenge %s]", Arrays.copyOf(objArr2, 1));
            l.b(a3, "");
            return a3;
        } else if (this.topic.getMusic() != null) {
            String a4 = a.a("TrendingTopicOrAd[Category.music %s]", Arrays.copyOf(new Object[]{this.topic.getMusic().getAlbum()}, 1));
            l.b(a4, "");
            return a4;
        } else if (this.topic.getItems() == null) {
            return "TrendingTopicOrAd[Category.unknown]";
        } else {
            String a5 = a.a("TrendingTopicOrAd[Category.items %d]", Arrays.copyOf(new Object[]{Integer.valueOf(this.topic.getItems().size())}, 1));
            l.b(a5, "");
            return a5;
        }
    }

    public TrendingTopicOrAd(TrendingTopic trendingTopic) {
        this.topic = trendingTopic;
        this.ad = null;
    }

    public TrendingTopicOrAd(TrendingTopicsAdInfo trendingTopicsAdInfo) {
        this.topic = null;
        this.ad = trendingTopicsAdInfo;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TrendingTopicOrAd)) {
            return false;
        }
        if (isTopic()) {
            TrendingTopicOrAd trendingTopicOrAd = (TrendingTopicOrAd) obj;
            if (trendingTopicOrAd.isTopic()) {
                TrendingTopic trendingTopic = this.topic;
                if (trendingTopic == null) {
                    l.b();
                }
                if (trendingTopic.getChallenge() != null) {
                    TrendingTopic trendingTopic2 = trendingTopicOrAd.topic;
                    if (trendingTopic2 == null) {
                        l.b();
                    }
                    if (trendingTopic2.getChallenge() != null) {
                        Challenge challenge = this.topic.getChallenge();
                        if (challenge == null) {
                            l.b();
                        }
                        String cid = challenge.getCid();
                        Challenge challenge2 = trendingTopicOrAd.topic.getChallenge();
                        if (challenge2 == null) {
                            l.b();
                        }
                        return l.a((Object) cid, (Object) challenge2.getCid());
                    }
                }
                if (this.topic.getMusic() != null) {
                    TrendingTopic trendingTopic3 = trendingTopicOrAd.topic;
                    if (trendingTopic3 == null) {
                        l.b();
                    }
                    if (trendingTopic3.getMusic() != null) {
                        return l.a(this.topic.getMusic(), trendingTopicOrAd.topic.getMusic());
                    }
                }
                return false;
            }
        }
        if (isAd()) {
            TrendingTopicOrAd trendingTopicOrAd2 = (TrendingTopicOrAd) obj;
            if (trendingTopicOrAd2.isAd()) {
                return equals(this.ad, trendingTopicOrAd2.ad);
            }
        }
        return false;
    }

    private final boolean equals(Long l2, Long l3) {
        if (l2 != null) {
            return l.a(l2, l3);
        }
        if (l3 == null) {
            return true;
        }
        return false;
    }

    private final boolean equals(TrendingTopicsAdInfo trendingTopicsAdInfo, TrendingTopicsAdInfo trendingTopicsAdInfo2) {
        if (trendingTopicsAdInfo == trendingTopicsAdInfo2) {
            return true;
        }
        if (trendingTopicsAdInfo == null || trendingTopicsAdInfo2 == null) {
            return false;
        }
        return equals(Long.valueOf(trendingTopicsAdInfo.getAdId()), Long.valueOf(trendingTopicsAdInfo2.getAdId()));
    }
}
