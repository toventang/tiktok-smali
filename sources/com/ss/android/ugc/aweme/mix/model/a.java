package com.ss.android.ugc.aweme.mix.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;

public final class a extends BaseResponse implements Serializable {
    @c(a = "cursor")
    private long cursor;
    @c(a = "has_more")
    private boolean hasMore;
    private String keyWord = "";
    @c(a = "mix_list")
    private List<? extends d> mixList;
    private String searchId = "";
    private String searchResultId = "";
    private String searchType = "";

    static {
        Covode.recordClassIndex(70706);
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getKeyWord() {
        return this.keyWord;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.mix.model.d>, java.util.List<com.ss.android.ugc.aweme.mix.model.d> */
    public final List<d> getMixList() {
        return this.mixList;
    }

    public final String getSearchId() {
        return this.searchId;
    }

    public final String getSearchResultId() {
        return this.searchResultId;
    }

    public final String getSearchType() {
        return this.searchType;
    }

    public final void setCursor(long j2) {
        this.cursor = j2;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setKeyWord(String str) {
        this.keyWord = str;
    }

    public final void setMixList(List<? extends d> list) {
        this.mixList = list;
    }

    public final void setSearchId(String str) {
        this.searchId = str;
    }

    public final void setSearchResultId(String str) {
        this.searchResultId = str;
    }

    public final void setSearchType(String str) {
        this.searchType = str;
    }
}
