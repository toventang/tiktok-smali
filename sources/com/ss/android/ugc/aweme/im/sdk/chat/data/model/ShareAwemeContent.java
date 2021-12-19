package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;

public class ShareAwemeContent extends BaseContent {
    protected static String awemeMsgHint = "";
    @c(a = "author_username")
    String authorUsername;
    int awemeType;
    @c(a = "content_name")
    String contentName;
    @c(a = "content_thumb")
    UrlModel contentThumb;
    @c(a = "cover_url")
    UrlModel coverUrl;
    @c(a = "diamond_game_id")
    String diamondGameId;
    @c(a = "cover_height")
    float height;
    @c(a = "hot_spot_create_time")
    long hotSpotCreateTime;
    @c(a = "is_ad_fake")
    boolean isAdFake;
    @c(a = "is_hot_spot_video")
    boolean isHotSpotVideo;
    @c(a = "itemId")
    String itemId;
    @c(a = "need_skip_strange")
    int needSkipStrange;
    @c(a = "secUID")
    String secUid;
    @c(a = "send_method")
    String sendMethod = "";
    @c(a = "content_title")
    String title;
    @c(a = "uid")
    String user;
    @c(a = "cover_width")
    float width;

    public boolean showQuoteHint() {
        return false;
    }

    public String getAuthorUsername() {
        return this.authorUsername;
    }

    public int getAwemeType() {
        return this.awemeType;
    }

    public String getContentName() {
        return this.contentName;
    }

    public UrlModel getContentThumb() {
        return this.contentThumb;
    }

    public UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public String getDiamondGameId() {
        return this.diamondGameId;
    }

    public float getHeight() {
        return this.height;
    }

    public long getHotSpotCreateTime() {
        return this.hotSpotCreateTime;
    }

    public String getItemId() {
        return this.itemId;
    }

    public int getNeedSkipStrange() {
        return this.needSkipStrange;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public String getSendMethod() {
        return this.sendMethod;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUser() {
        return this.user;
    }

    public float getWidth() {
        return this.width;
    }

    public boolean isHotSpotVideo() {
        return this.isHotSpotVideo;
    }

    public Boolean getIsAdFake() {
        return Boolean.valueOf(this.isAdFake);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        super.getMsgHint();
        return awemeMsgHint;
    }

    static {
        Covode.recordClassIndex(64062);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.PreloadFetcher, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public List<UrlModel> fetchPreload() {
        UrlModel urlModel = this.coverUrl;
        if (urlModel == null) {
            return null;
        }
        return Collections.singletonList(urlModel);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public void tryInit() {
        Context a2;
        if (TextUtils.isEmpty(awemeMsgHint) && (a2 = d.a()) != null) {
            awemeMsgHint = a2.getString(R.string.ci8);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        SharePackage a2 = PureDataSharePackage.a.a("aweme");
        Bundle bundle = a2.f124595i;
        bundle.putInt("aweme_type", getAwemeType());
        bundle.putString("item_id_string", this.itemId);
        bundle.putString("author_id", this.user);
        bundle.putSerializable("video_cover", getCoverUrl());
        bundle.putString("diamond_game_id", getDiamondGameId());
        bundle.putBoolean("is_hot_spot_video", isHotSpotVideo());
        return a2;
    }

    public void setAuthorUsername(String str) {
        this.authorUsername = str;
    }

    public void setAwemeType(int i2) {
        this.awemeType = i2;
    }

    public void setContentName(String str) {
        this.contentName = str;
    }

    public void setContentThumb(UrlModel urlModel) {
        this.contentThumb = urlModel;
    }

    public void setCoverUrl(UrlModel urlModel) {
        this.coverUrl = urlModel;
    }

    public void setDiamondGameId(String str) {
        this.diamondGameId = str;
    }

    public void setHeight(float f2) {
        this.height = f2;
    }

    public void setHotSpotCreateTime(long j2) {
        this.hotSpotCreateTime = j2;
    }

    public void setHotSpotVideo(boolean z) {
        this.isHotSpotVideo = z;
    }

    public void setItemId(String str) {
        this.itemId = str;
    }

    public void setNeedSkipStrange(int i2) {
        this.needSkipStrange = i2;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setSendMethod(String str) {
        this.sendMethod = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUser(String str) {
        this.user = str;
    }

    public void setWidth(float f2) {
        this.width = f2;
    }

    public void setIsAdFake(Boolean bool) {
        this.isAdFake = bool.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        return context.getResources().getString(R.string.ch4);
    }

    public static ShareAwemeContent fromSharePackage(SharePackage sharePackage) {
        ShareAwemeContent shareAwemeContent = new ShareAwemeContent();
        shareAwemeContent.setUser(sharePackage.f124595i.getString("uid_for_share"));
        shareAwemeContent.setSecUid(sharePackage.f124595i.getString("sec_user_id"));
        shareAwemeContent.setItemId(sharePackage.f124595i.getString("item_id_string"));
        shareAwemeContent.setCoverUrl((UrlModel) sharePackage.f124595i.getSerializable("video_cover"));
        shareAwemeContent.setContentThumb((UrlModel) sharePackage.f124595i.getSerializable("thumb_for_share"));
        shareAwemeContent.setContentName(sharePackage.f124595i.getString("author_name"));
        shareAwemeContent.setAuthorUsername(sharePackage.f124595i.getString("author_username"));
        shareAwemeContent.setIsAdFake(Boolean.valueOf(sharePackage.f124595i.getBoolean("is_ad_fake")));
        shareAwemeContent.setWidth((float) sharePackage.f124595i.getInt("aweme_width"));
        shareAwemeContent.setHeight((float) sharePackage.f124595i.getInt("aweme_height"));
        shareAwemeContent.setHotSpotVideo(sharePackage.f124595i.getBoolean("is_hot_spot_video"));
        shareAwemeContent.setHotSpotCreateTime(System.currentTimeMillis());
        shareAwemeContent.setAwemeType(0);
        shareAwemeContent.setType(800);
        shareAwemeContent.setTitle(sharePackage.f124595i.getString("desc"));
        shareAwemeContent.setDiamondGameId(sharePackage.f124595i.getString("diamond_game_id"));
        shareAwemeContent.setNeedSkipStrange(sharePackage.f124595i.getInt("key_message_source", 0));
        return shareAwemeContent;
    }

    public static ShareAwemeContent fromAweme(Aweme aweme, String str) {
        ShareAwemeContent shareAwemeContent = new ShareAwemeContent();
        shareAwemeContent.setUser(aweme.getAuthor().getUid());
        shareAwemeContent.setSecUid(aweme.getAuthor().getSecUid());
        shareAwemeContent.setItemId(aweme.getAid());
        shareAwemeContent.setCoverUrl(aweme.getVideo().getCover());
        shareAwemeContent.setContentThumb(aweme.getAuthor().getAvatarThumb());
        shareAwemeContent.setContentName(aweme.getAuthor().getUserDisplayName());
        shareAwemeContent.setAuthorUsername(aweme.getAuthor().getUniqueId());
        shareAwemeContent.setIsAdFake(Boolean.valueOf(!aweme.isAd()));
        shareAwemeContent.setWidth((float) aweme.getVideo().getWidth());
        shareAwemeContent.setHeight((float) aweme.getVideo().getHeight());
        shareAwemeContent.setHotSpotVideo(aweme.isHotVideoAweme());
        shareAwemeContent.setAwemeType(0);
        shareAwemeContent.setType(800);
        shareAwemeContent.setTitle(aweme.getDesc());
        shareAwemeContent.setSendMethod(str);
        return shareAwemeContent;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str) {
        Context a2 = d.a();
        if (z || z2) {
            awemeMsgHint = a2.getString(R.string.aa2);
        } else {
            awemeMsgHint = a2.getString(R.string.fks);
        }
        return awemeMsgHint;
    }
}
