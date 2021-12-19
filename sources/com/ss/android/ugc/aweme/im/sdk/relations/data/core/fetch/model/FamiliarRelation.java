package com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;

public class FamiliarRelation implements Serializable {
    @c(a = "created_time_list")
    private List<Long> createdTimes;
    @c(a = "has_more")
    private int hasMore;
    @c(a = "next_cursor")
    private int nextCursor;
    @c(a = "relation_type")
    private int relationType;
    @c(a = "sec_user_ids")
    private List<String> secUserIds;

    static {
        Covode.recordClassIndex(66129);
    }

    public List<Long> getCreatedTimes() {
        return this.createdTimes;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public int getNextCursor() {
        return this.nextCursor;
    }

    public int getRelationType() {
        return this.relationType;
    }

    public List<String> getSecUserIds() {
        return this.secUserIds;
    }

    public void setCreatedTimes(List<Long> list) {
        this.createdTimes = list;
    }

    public void setHasMore(int i2) {
        this.hasMore = i2;
    }

    public void setNextCursor(int i2) {
        this.nextCursor = i2;
    }

    public void setRelationType(int i2) {
        this.relationType = i2;
    }

    public void setSecUserIds(List<String> list) {
        this.secUserIds = list;
    }
}
