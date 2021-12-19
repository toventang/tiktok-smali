package com.ss.android.ugc.aweme.comment.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.i.d;
import java.io.Serializable;

public class d<T extends d> implements Serializable {
    private static final long serialVersionUID = 9148864135191458444L;
    protected String aid;
    protected String authorUid;
    protected String cid;

    static {
        Covode.recordClassIndex(44239);
    }

    public String getAid() {
        return this.aid;
    }

    public String getAuthorUid() {
        return this.authorUid;
    }

    public String getCid() {
        return this.cid;
    }

    public d setAid(String str) {
        this.aid = str;
        return this;
    }

    public T setAuthorUid(String str) {
        this.authorUid = str;
        return this;
    }

    public d setCid(String str) {
        this.cid = str;
        return this;
    }

    public d(String str) {
        this.aid = str;
    }
}
