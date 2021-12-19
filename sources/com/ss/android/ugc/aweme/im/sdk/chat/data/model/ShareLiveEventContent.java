package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;

public class ShareLiveEventContent extends BaseContent {
    @c(a = "event_id")
    private String eventId;
    @c(a = "link_url")
    private String linkUrl;
    @c(a = "organizer_avatar")
    private UrlModel organizerAvatar;
    @c(a = "organizer_enterprise")
    private String organizerEnterprise;
    @c(a = "organizer_id")
    private String organizerId;
    @c(a = "organizer_name")
    private String organizerName;
    @c(a = "organizer_verify_reason")
    private String organizerVerifyReason;
    @c(a = "start_time")
    private String startTime;
    @c(a = "title")
    private String title;

    static {
        Covode.recordClassIndex(64067);
    }

    public String getEventId() {
        return this.eventId;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public UrlModel getOrganizerAvatar() {
        return this.organizerAvatar;
    }

    public String getOrganizerEnterprise() {
        return this.organizerEnterprise;
    }

    public String getOrganizerName() {
        return this.organizerName;
    }

    public String getOrganizerVerifyReason() {
        return this.organizerVerifyReason;
    }

    public String getOrganizerd() {
        return this.organizerId;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getTitle() {
        return this.title;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        SharePackage a2 = PureDataSharePackage.a.a("live_event");
        a2.f124595i.putString("live_event_title", getTitle());
        return a2;
    }

    public void setEventId(String str) {
        this.eventId = str;
    }

    public void setLinkUrl(String str) {
        this.linkUrl = str;
    }

    public void setOrganizerAvatar(UrlModel urlModel) {
        this.organizerAvatar = urlModel;
    }

    public void setOrganizerEnterprise(String str) {
        this.organizerEnterprise = str;
    }

    public void setOrganizerId(String str) {
        this.organizerId = str;
    }

    public void setOrganizerName(String str) {
        this.organizerName = str;
    }

    public void setOrganizerVerifyReason(String str) {
        this.organizerVerifyReason = str;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        return context.getResources().getString(R.string.cgt);
    }

    public static ShareLiveEventContent fromSharePackage(SharePackage sharePackage) {
        String string = sharePackage.f124595i.getString("live_event_id");
        String string2 = sharePackage.f124595i.getString("live_event_title");
        String string3 = sharePackage.f124595i.getString("live_event_start_time");
        String string4 = sharePackage.f124595i.getString("live_event_internal_share_url");
        String string5 = sharePackage.f124595i.getString("live_event_author_id");
        String string6 = sharePackage.f124595i.getString("live_event_author_name");
        String string7 = sharePackage.f124595i.getString("live_event_author_verify_info");
        String string8 = sharePackage.f124595i.getString("live_event_author_enterprise");
        ShareLiveEventContent shareLiveEventContent = new ShareLiveEventContent();
        shareLiveEventContent.eventId = string;
        shareLiveEventContent.title = string2;
        shareLiveEventContent.startTime = string3;
        shareLiveEventContent.linkUrl = string4;
        shareLiveEventContent.organizerId = string5;
        shareLiveEventContent.organizerName = string6;
        shareLiveEventContent.organizerVerifyReason = string7;
        shareLiveEventContent.organizerEnterprise = string8;
        shareLiveEventContent.organizerAvatar = (UrlModel) sharePackage.f124595i.getSerializable("live_event_author_avatar");
        return shareLiveEventContent;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str) {
        Context a2 = d.a();
        if (z || z2) {
            return a2.getString(R.string.bqc);
        }
        return a2.getString(R.string.bqb);
    }
}
