package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.utils.dw;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.List;

public class ShareUserContent extends BaseContent {
    @c(a = "avatar")
    private UrlModel avatar;
    @c(a = "cover_url")
    private List<UrlModel> awemeCoverList;
    @c(a = "desc")
    private String desc;
    @c(a = StringSet.name)
    private String name;
    @c(a = "push_detail")
    private String pushDetail;
    @c(a = "secUID")
    String secUid;
    @c(a = "uid")
    private String uid;

    static {
        Covode.recordClassIndex(64078);
    }

    public UrlModel getAvatar() {
        return this.avatar;
    }

    public List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getName() {
        return this.name;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public String getUid() {
        return this.uid;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.PreloadFetcher, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public List<UrlModel> fetchPreload() {
        List<UrlModel> list = this.awemeCoverList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.awemeCoverList.subList(0, Math.min(3, this.awemeCoverList.size()));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        SharePackage a2 = PureDataSharePackage.a.a("user");
        a2.f124595i.putSerializable("video_cover", getAvatar());
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        return d.a().getString(R.string.cjf, getName());
    }

    public void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public void setAwemeCoverList(List<UrlModel> list) {
        this.awemeCoverList = list;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        return context.getResources().getString(R.string.ch0);
    }

    public static ShareUserContent fromSharePackage(SharePackage sharePackage) {
        ShareUserContent shareUserContent = new ShareUserContent();
        shareUserContent.uid = sharePackage.f124595i.getString("uid");
        shareUserContent.secUid = sharePackage.f124595i.getString("sec_user_id");
        shareUserContent.name = sharePackage.f124595i.getString(StringSet.name);
        shareUserContent.desc = sharePackage.f124595i.getString("desc");
        Serializable serializable = sharePackage.f124595i.getSerializable("video_cover");
        if (serializable instanceof UrlModel) {
            shareUserContent.avatar = (UrlModel) serializable;
        }
        shareUserContent.pushDetail = sharePackage.f124595i.getString(StringSet.name);
        String string = sharePackage.f124595i.getString("aweme_cover_list");
        if (!TextUtils.isEmpty(string)) {
            shareUserContent.awemeCoverList = (List) dw.a(string, List.class);
        }
        return shareUserContent;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str) {
        Context a2 = d.a();
        if (z || z2) {
            return a2.getString(R.string.aa0, getName());
        }
        return a2.getString(R.string.fkq, getName());
    }
}
