package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.utils.dw;
import com.zhiliaoapp.musically.R;
import java.util.List;

public class ShareChallengeContent extends BaseContent {
    @c(a = "challenge_id")
    private String challengeId;
    @c(a = "cover_url")
    private List<UrlModel> coverUrl;
    @c(a = "is_commerce")
    private boolean isCommerce;
    @c(a = "push_detail")
    private String pushDetail;
    @c(a = "title")
    private String title;
    @c(a = "user_count")
    private long userCount;

    static {
        Covode.recordClassIndex(64063);
    }

    public String getChallengeId() {
        return this.challengeId;
    }

    public List<UrlModel> getCoverUrl() {
        return this.coverUrl;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public String getTitle() {
        return this.title;
    }

    public long getUserCount() {
        return this.userCount;
    }

    public boolean isCommerce() {
        return this.isCommerce;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        return PureDataSharePackage.a.a("challenge");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.PreloadFetcher, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public List<UrlModel> fetchPreload() {
        List<UrlModel> list = this.coverUrl;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.coverUrl.subList(0, Math.min(3, this.coverUrl.size()));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        return d.a().getResources().getString(R.string.cdl, this.pushDetail);
    }

    public void setChallengeId(String str) {
        this.challengeId = str;
    }

    public void setCommerce(boolean z) {
        this.isCommerce = z;
    }

    public void setCoverUrl(List<UrlModel> list) {
        this.coverUrl = list;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUserCount(int i2) {
        this.userCount = (long) i2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        return context.getResources().getString(R.string.cgx, this.title);
    }

    public static ShareChallengeContent fromSharePackage(SharePackage sharePackage) {
        String string = sharePackage.f124595i.getString("challenge_id");
        String string2 = sharePackage.f124595i.getString("challenge_name");
        Boolean valueOf = Boolean.valueOf(sharePackage.f124595i.getBoolean("is_commerce"));
        long j2 = sharePackage.f124595i.getLong("view_count");
        String string3 = sharePackage.f124595i.getString("cover_thumb");
        ShareChallengeContent shareChallengeContent = new ShareChallengeContent();
        shareChallengeContent.challengeId = string;
        shareChallengeContent.title = string2;
        shareChallengeContent.isCommerce = valueOf.booleanValue();
        shareChallengeContent.userCount = j2;
        shareChallengeContent.pushDetail = "#" + shareChallengeContent.title;
        if (!TextUtils.isEmpty(string3)) {
            shareChallengeContent.coverUrl = (List) dw.a(string3, List.class);
        }
        return shareChallengeContent;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str) {
        Context a2 = d.a();
        if (z || z2) {
            return a2.getString(R.string.a_x, this.pushDetail);
        }
        return a2.getString(R.string.fkn, this.pushDetail);
    }
}
