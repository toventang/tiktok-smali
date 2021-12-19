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

public class ShareMusicContent extends BaseContent {
    @c(a = "cover_url")
    private List<UrlModel> awemeCoverList;
    @c(a = "music_cover")
    private UrlModel coverThumb;
    @c(a = "music_id")
    private String musicId;
    @c(a = "title")
    private String musicName;
    @c(a = "push_detail")
    private String pushDetail;
    @c(a = "user_count")
    private int userCount;

    static {
        Covode.recordClassIndex(64068);
    }

    public List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public UrlModel getCoverThumb() {
        return this.coverThumb;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public String getMusicName() {
        return this.musicName;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public int getUserCount() {
        return this.userCount;
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
        SharePackage a2 = PureDataSharePackage.a.a("music");
        a2.f124595i.putSerializable("video_cover", getCoverThumb());
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        return d.a().getString(R.string.cg8, getMusicName());
    }

    public void setAwemeCoverList(List<UrlModel> list) {
        this.awemeCoverList = list;
    }

    public void setCoverThumb(UrlModel urlModel) {
        this.coverThumb = urlModel;
    }

    public void setMusicId(String str) {
        this.musicId = str;
    }

    public void setMusicName(String str) {
        this.musicName = str;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setUserCount(int i2) {
        this.userCount = i2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        return context.getResources().getString(R.string.ch1, this.musicName);
    }

    public static ShareMusicContent fromSharePackage(SharePackage sharePackage) {
        String string = sharePackage.f124595i.getString("music_id");
        String string2 = sharePackage.f124595i.getString("music_name");
        int i2 = sharePackage.f124595i.getInt("user_count");
        UrlModel urlModel = (UrlModel) sharePackage.f124595i.getSerializable("video_cover");
        UrlModel urlModel2 = (UrlModel) sharePackage.f124595i.getSerializable("cover_thumb");
        String string3 = sharePackage.f124595i.getString("aweme_cover_list");
        ShareMusicContent shareMusicContent = new ShareMusicContent();
        shareMusicContent.musicId = string;
        shareMusicContent.musicName = string2;
        shareMusicContent.pushDetail = string2;
        shareMusicContent.userCount = i2;
        if (urlModel != null) {
            shareMusicContent.coverThumb = urlModel;
        } else if (urlModel2 != null) {
            shareMusicContent.coverThumb = urlModel2;
        }
        if (!TextUtils.isEmpty(string3)) {
            shareMusicContent.awemeCoverList = (List) dw.a(string3, List.class);
        }
        return shareMusicContent;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str) {
        Context a2 = d.a();
        if (z || z2) {
            return a2.getString(R.string.aa1);
        }
        return a2.getString(R.string.fkr);
    }
}
