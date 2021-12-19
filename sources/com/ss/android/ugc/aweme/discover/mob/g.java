package com.ss.android.ugc.aweme.discover.mob;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.metrics.t;
import java.util.HashMap;

public class g extends t {
    private String enterFrom;
    private String enterMethod;
    private String listItemId;
    private int order;
    private String rid;
    private String searchKeyword;
    private String searchResultId;

    static {
        Covode.recordClassIndex(50849);
    }

    @Override // com.ss.android.ugc.aweme.metrics.t
    public HashMap<String, String> buildParams() {
        appendParam("order", String.valueOf(this.order), c.a.f109562a);
        appendParam("search_keyword", this.searchKeyword, c.a.f109562a);
        appendParam("enter_from", this.enterFrom, c.a.f109562a);
        appendParam("enter_method", this.enterMethod, c.a.f109562a);
        if (!TextUtils.isEmpty(this.searchResultId)) {
            appendParam("search_result_id", this.searchResultId, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.listItemId)) {
            appendParam("list_item_id", this.listItemId, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.rid)) {
            appendParam("request_id", this.rid, c.a.f109562a);
            appendParam("log_pb", ac.a.f91473a.a(this.rid), c.a.f109562a);
        }
        return this.params;
    }

    public g setEnterFrom(String str) {
        this.enterFrom = str;
        return this;
    }

    public g setEnterMethod(String str) {
        this.enterMethod = str;
        return this;
    }

    public g setListItemId(String str) {
        this.listItemId = str;
        return this;
    }

    public g setOrder(int i2) {
        this.order = i2;
        return this;
    }

    public g setRid(String str) {
        this.rid = str;
        return this;
    }

    public g setSearchKeyword(String str) {
        this.searchKeyword = str;
        return this;
    }

    public g setSearchResultId(String str) {
        this.searchResultId = str;
        return this;
    }
}
