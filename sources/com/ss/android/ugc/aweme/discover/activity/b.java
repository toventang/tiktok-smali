package com.ss.android.ugc.aweme.discover.activity;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class b implements Serializable {
    private String enterFrom;
    private String enterMethod;
    private String fromSearchSubtag;
    private String preSearchId;
    private String roomIdList;
    private String searchId;
    private String searchKeyword;
    private String searchType;

    static {
        Covode.recordClassIndex(49961);
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getFromSearchSubtag() {
        return this.fromSearchSubtag;
    }

    public final String getPreSearchId() {
        return this.preSearchId;
    }

    public final String getRoomIdList() {
        return this.roomIdList;
    }

    public final String getSearchId() {
        return this.searchId;
    }

    public final String getSearchKeyword() {
        return this.searchKeyword;
    }

    public final String getSearchType() {
        return this.searchType;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setFromSearchSubtag(String str) {
        this.fromSearchSubtag = str;
    }

    public final void setPreSearchId(String str) {
        this.preSearchId = str;
    }

    public final void setRoomIdList(String str) {
        this.roomIdList = str;
    }

    public final void setSearchId(String str) {
        this.searchId = str;
    }

    public final void setSearchKeyword(String str) {
        this.searchKeyword = str;
    }

    public final void setSearchType(String str) {
        this.searchType = str;
    }
}
