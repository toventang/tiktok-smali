package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.h;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;

public class ShareLiveContent extends BaseContent {
    @c(a = "push_detail")
    private String pushDetail;
    @c(a = "cover_url")
    private UrlModel roomCover;
    @c(a = "room_description")
    private String roomDesc;
    @c(a = "room_id")
    private String roomId;
    @c(a = "room_owner_avatar")
    private UrlModel roomOwnerAvatar;
    @c(a = "room_owner_id")
    private String roomOwnerId;
    @c(a = "room_owner_name")
    private String roomOwnerName;
    @c(a = "room_owner_sec_id")
    private String roomSecOwnerId;

    static {
        Covode.recordClassIndex(64066);
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public UrlModel getRoomCover() {
        return this.roomCover;
    }

    public String getRoomDesc() {
        return this.roomDesc;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public UrlModel getRoomOwnerAvatar() {
        return this.roomOwnerAvatar;
    }

    public String getRoomOwnerId() {
        return this.roomOwnerId;
    }

    public String getRoomOwnerName() {
        return this.roomOwnerName;
    }

    public String getRoomSecOwnerId() {
        return this.roomSecOwnerId;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        return d.a().getString(R.string.cfp, getRoomOwnerName());
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        SharePackage a2 = new SharePackage.a().a("live").b(getRoomId()).a();
        Bundle bundle = a2.f124595i;
        bundle.putString("live_id", getRoomOwnerId());
        bundle.putSerializable("video_cover", getRoomCover());
        bundle.putString("author_name", getRoomOwnerName());
        bundle.putSerializable("thumb_for_share", getRoomOwnerAvatar());
        if (!TextUtils.isEmpty(getRoomDesc())) {
            bundle.putString("room_title", getRoomDesc());
        }
        return a2;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setRoomCover(UrlModel urlModel) {
        this.roomCover = urlModel;
    }

    public void setRoomDesc(String str) {
        this.roomDesc = str;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public void setRoomOwnerAvatar(UrlModel urlModel) {
        this.roomOwnerAvatar = urlModel;
    }

    public void setRoomOwnerId(String str) {
        this.roomOwnerId = str;
    }

    public void setRoomOwnerName(String str) {
        this.roomOwnerName = str;
    }

    public void setRoomSecOwnerId(String str) {
        this.roomSecOwnerId = str;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        return context.getResources().getString(R.string.cgz);
    }

    public static ShareLiveContent fromSharePackage(SharePackage sharePackage) {
        ShareLiveContent shareLiveContent = new ShareLiveContent();
        shareLiveContent.setRoomId(sharePackage.f124591e);
        shareLiveContent.setRoomOwnerId(sharePackage.f124595i.getString("live_id"));
        shareLiveContent.setRoomSecOwnerId(sharePackage.f124595i.getString("sec_user_id"));
        shareLiveContent.setRoomOwnerName(sharePackage.f124595i.getString("author_name"));
        Serializable serializable = sharePackage.f124595i.getSerializable("thumb_for_share");
        boolean z = serializable instanceof UrlModel;
        if (z) {
            shareLiveContent.setRoomOwnerAvatar((UrlModel) serializable);
        }
        shareLiveContent.setPushDetail(sharePackage.f124595i.getString("author_name"));
        if (sharePackage.f124595i.containsKey("room_title")) {
            shareLiveContent.setRoomDesc(sharePackage.f124595i.getString("room_title"));
        }
        if (sharePackage.f124595i.getLong("room_id", 0) == 0) {
            shareLiveContent.setRoomDesc(h.b(R.string.fsr));
        }
        Serializable serializable2 = sharePackage.f124595i.getSerializable("video_cover");
        if (serializable2 instanceof UrlModel) {
            shareLiveContent.setRoomCover((UrlModel) serializable2);
        } else if (z) {
            shareLiveContent.setRoomCover((UrlModel) serializable);
        } else {
            shareLiveContent.setRoomCover(null);
        }
        return shareLiveContent;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str) {
        Context a2 = d.a();
        if (z || z2) {
            return a2.getString(R.string.a_z);
        }
        return a2.getString(R.string.fkp);
    }
}
