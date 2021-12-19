package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

public class MixStruct implements Serializable {
    @c(a = "author")
    public User author;
    @c(a = "auto_mix_author_info")
    public com.ss.android.ugc.aweme.search.c autoMixAuthorInfo;
    @c(a = "cover_url")
    public UrlModel cover;
    @c(a = "create_time")
    public long createTime;
    @c(a = "desc")
    public String desc;
    @c(a = "extra")
    public String extra;
    @c(a = "icon_url")
    public UrlModel icon;
    @c(a = "mix_id")
    public String mixId;
    @c(a = "mix_name")
    public String mixName;
    @c(a = "mix_type")
    public int mixType;
    @c(a = "share_info")
    public ShareInfo shareInfo;
    @c(a = "statis")
    public MixStatisStruct statis;
    @c(a = "status")
    public MixStatusStruct status;
    @c(a = "update_time")
    public long updateTime;

    static {
        Covode.recordClassIndex(59423);
    }
}
