package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.music.b.b.a;

public class MusicCollectionItem implements a {
    @c(a = "aweme_cover")
    public UrlModel awemeCover;
    @c(a = "cover")
    public UrlModel cover;
    @c(a = "is_hot")
    public boolean isHot;
    @c(a = "level")
    public int level;
    @c(a = "id_str")
    public String mcId;
    @c(a = StringSet.name)
    public String mcName;
    @c(a = "share_info")
    public ShareInfo shareInfo;

    static {
        Covode.recordClassIndex(71671);
    }
}
