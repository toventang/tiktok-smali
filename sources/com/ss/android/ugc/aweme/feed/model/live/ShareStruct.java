package com.ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class ShareStruct extends BaseResponse implements Serializable {
    @c(a = "bool_persist")
    public int boolPersist;
    @c(a = "share_desc")
    public String shareDesc;
    @c(a = "share_link_desc")
    public String shareLinkDesc;
    @c(a = "share_qrcode_url")
    public UrlModel shareQrcodeUrl;
    @c(a = "share_title")
    public String shareTitle;
    @c(a = "share_url")
    public String shareUrl;
    @c(a = "share_weibo_desc")
    public String shareWeiboDesc;

    static {
        Covode.recordClassIndex(59513);
    }
}
