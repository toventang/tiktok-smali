package com.ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.api.b;
import com.ss.android.ugc.aweme.discover.model.Challenge;

public class LiveChallenge {
    @c(a = "cha_name")
    public String challengeName;
    @b
    @c(a = "cid")
    public String cid;
    @c(a = "is_commerce")
    public boolean isCommerce;
    @c(a = "schema")
    public String schema;
    @c(a = "sub_type")
    public int subType;
    @c(a = StringSet.type)
    public int type;

    static {
        Covode.recordClassIndex(59492);
    }

    public Challenge toAwemeChallenge() {
        Challenge challenge = new Challenge();
        challenge.setCid(this.cid);
        challenge.setChallengeName(this.challengeName);
        challenge.setSchema(this.schema);
        challenge.setType(this.type);
        challenge.setSubType(this.subType);
        return challenge;
    }
}
