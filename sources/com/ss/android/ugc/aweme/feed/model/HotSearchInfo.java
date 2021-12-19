package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import java.io.Serializable;

public final class HotSearchInfo implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final long serialVersionUID = 4;
    @c(a = "challenge_id")
    public String challengeId;
    @c(a = "group_id")
    public String id;
    @c(a = "label")
    public int label;
    @c(a = "rank")
    public int rank;
    @c(a = "search_word")
    public String searchWord;
    @c(a = "sentence")
    public String sentence;
    @c(a = "value")
    public long value;
    @c(a = "vb_rank")
    public int videoRank;
    @c(a = "vb_rank_value")
    public long videoRankVV;

    static {
        Covode.recordClassIndex(59398);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(59399);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final String getId() {
        return this.id;
    }

    public final int getLabel() {
        return this.label;
    }

    public final int getRank() {
        return this.rank;
    }

    public final String getSearchWord() {
        return this.searchWord;
    }

    public final String getSentence() {
        return this.sentence;
    }

    public final long getValue() {
        return this.value;
    }

    public final int getVideoRank() {
        return this.videoRank;
    }

    public final long getVideoRankVV() {
        return this.videoRankVV;
    }

    public final void setChallengeId(String str) {
        this.challengeId = str;
    }

    public final void setSearchWord(String str) {
        this.searchWord = str;
    }

    public final void setSentence(String str) {
        this.sentence = str;
    }

    public final void setValue(long j2) {
        this.value = j2;
    }

    public final void setVideoRank(int i2) {
        this.videoRank = i2;
    }

    public final void setVideoRankVV(long j2) {
        this.videoRankVV = j2;
    }
}
