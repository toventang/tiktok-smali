package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

public class y implements Serializable {
    @c(a = "content")
    public String content;
    @c(a = "content_id")
    public long contentId;
    @c(a = "id")
    public long id;
    @c(a = "redirect_url")
    public String redirectUrl;
    @c(a = StringSet.type)
    public int type;

    static {
        Covode.recordClassIndex(46194);
    }
}
