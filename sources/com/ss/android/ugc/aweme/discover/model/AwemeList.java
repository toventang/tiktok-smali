package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.discover.model.AwemeList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public class AwemeList<T extends AwemeList<T>> implements IAwemeList<T>, Serializable {
    @c(a = "aweme_list")
    private List<Aweme> awemeList;
    @c(a = "cursor")
    private int cursor;
    @c(a = "has_more")
    private int hasMore;
    @c(a = "status_code")
    private int statusCode;

    static {
        Covode.recordClassIndex(50867);
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final int getHasMore() {
        return this.hasMore;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.IAwemeList
    public List<Aweme> getIAwemeList() {
        return this.awemeList;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.IAwemeList
    public int getICursor() {
        return this.cursor;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.IAwemeList
    public int getIHasMore() {
        return this.hasMore;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.IAwemeList
    public int getIStatusCode() {
        return this.statusCode;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final void setAwemeList(List<Aweme> list) {
        this.awemeList = list;
    }

    public final void setCursor(int i2) {
        this.cursor = i2;
    }

    public final void setHasMore(int i2) {
        this.hasMore = i2;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.IAwemeList
    public void setICursor(int i2) {
        this.cursor = i2;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.IAwemeList
    public void setIHasMore(int i2) {
        this.hasMore = i2;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.IAwemeList
    public void setIStatusCode(int i2) {
        this.statusCode = i2;
    }

    public final void setStatusCode(int i2) {
        this.statusCode = i2;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.IAwemeList
    public void setIAwemeList(List<Aweme> list) {
        l.d(list, "");
        this.awemeList = list;
    }

    public void updateData(T t) {
        l.d(t, "");
        this.hasMore &= t.hasMore;
        this.cursor = t.cursor;
        this.statusCode = t.statusCode;
    }
}
