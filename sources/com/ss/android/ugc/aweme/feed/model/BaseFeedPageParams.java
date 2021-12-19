package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.param.b;

public class BaseFeedPageParams {
    public int awemeFromPage;
    public String challengeId;
    public String cid;
    public String eventType;
    public boolean isFromPostList;
    public boolean isMyProfile;
    public int pageType;
    public b param = new b();
    public boolean showVote;

    static {
        Covode.recordClassIndex(59347);
    }

    public static BaseFeedPageParams newBuilder() {
        return new BaseFeedPageParams();
    }

    public String getFromGroupId() {
        b bVar = this.param;
        if (bVar != null) {
            return bVar.getFromGroupId();
        }
        return null;
    }

    public String getPreviousPage() {
        b bVar = this.param;
        if (bVar != null) {
            return bVar.getPreviousPage();
        }
        return null;
    }

    public String getPreviousPagePosition() {
        b bVar = this.param;
        if (bVar != null) {
            return bVar.getPreviousPagePosition();
        }
        return null;
    }

    public Boolean isPlayListCleanMode() {
        b bVar = this.param;
        if (bVar != null) {
            return Boolean.valueOf(bVar.isPlaylistCleanMode());
        }
        return false;
    }

    public String toString() {
        return "BaseFeedPageParams{awemeFromPage=" + this.awemeFromPage + ", eventType='" + this.eventType + '\'' + ", isMyProfile=" + this.isMyProfile + ", isFromPostList=" + this.isFromPostList + ", pageType=" + this.pageType + '}';
    }

    public BaseFeedPageParams setAwemeFromPage(int i2) {
        this.awemeFromPage = i2;
        return this;
    }

    public BaseFeedPageParams setChallengeId(String str) {
        this.challengeId = str;
        return this;
    }

    public BaseFeedPageParams setCid(String str) {
        this.cid = str;
        return this;
    }

    public BaseFeedPageParams setEventType(String str) {
        this.eventType = str;
        return this;
    }

    public BaseFeedPageParams setFromPostList(boolean z) {
        this.isFromPostList = z;
        return this;
    }

    public BaseFeedPageParams setMyProfile(boolean z) {
        this.isMyProfile = z;
        return this;
    }

    public BaseFeedPageParams setPageType(int i2) {
        this.pageType = i2;
        return this;
    }

    public BaseFeedPageParams setParam(b bVar) {
        this.param = bVar;
        return this;
    }

    public BaseFeedPageParams setShowVote(boolean z) {
        this.showVote = z;
        return this;
    }
}
