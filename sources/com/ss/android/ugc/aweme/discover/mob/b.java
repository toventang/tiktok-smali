package com.ss.android.ugc.aweme.discover.mob;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.metrics.t;
import java.util.HashMap;

public class b extends t {
    private String bannerId;
    private int clientOrder;
    private String enterFrom = "discovery";
    private String tagId;

    static {
        Covode.recordClassIndex(50841);
    }

    @Override // com.ss.android.ugc.aweme.metrics.t
    public HashMap<String, String> buildParams() {
        appendParam("banner_id", this.bannerId, c.a.f109563b);
        appendParam("enter_from", this.enterFrom, c.a.f109562a);
        appendParam("tag_id", this.tagId, c.a.f109562a);
        appendParam("client_order", String.valueOf(this.clientOrder), c.a.f109562a);
        return this.params;
    }

    public b setBannerId(String str) {
        this.bannerId = str;
        return this;
    }

    public b setClientOrder(int i2) {
        this.clientOrder = i2;
        return this;
    }

    public b setEnterFrom(String str) {
        this.enterFrom = str;
        return this;
    }

    public b setTagId(String str) {
        this.tagId = str;
        return this;
    }
}
