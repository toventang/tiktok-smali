package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.im.core.api.e.a;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class SystemCardContent extends BaseContent {
    @c(a = "business_id")
    private String businessId;
    @c(a = "extract")
    private final String extract;
    @c(a = "link_cards")
    private final List<LinkCard> linkCards;
    @c(a = "link_info")
    private LinkInfo linkInfo;
    @c(a = "text_info")
    private TextInfo textInfo;
    @c(a = "title")
    private Title title;
    @c(a = "video_info")
    private VideoInfo videoInfo;

    static {
        Covode.recordClassIndex(64080);
    }

    public final String getBusinessId() {
        return this.businessId;
    }

    public final String getExtract() {
        return this.extract;
    }

    public final List<LinkCard> getLinkCards() {
        return this.linkCards;
    }

    public final LinkInfo getLinkInfo() {
        return this.linkInfo;
    }

    public final TextInfo getTextInfo() {
        return this.textInfo;
    }

    public final Title getTitle() {
        return this.title;
    }

    public final VideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public final void setBusinessId(String str) {
        this.businessId = str;
    }

    public final void setLinkInfo(LinkInfo linkInfo2) {
        this.linkInfo = linkInfo2;
    }

    public final void setTextInfo(TextInfo textInfo2) {
        this.textInfo = textInfo2;
    }

    public final void setTitle(Title title2) {
        this.title = title2;
    }

    public final void setVideoInfo(VideoInfo videoInfo2) {
        this.videoInfo = videoInfo2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final String wrapMsgHint(boolean z, boolean z2, String str) {
        String str2;
        MessageTitle title2;
        if (a.b(this.extract)) {
            String str3 = this.extract;
            if (str3 == null) {
                return "";
            }
            return str3;
        }
        a.C0730a aVar = new a.C0730a();
        TextInfo textInfo2 = this.textInfo;
        if (textInfo2 == null || (title2 = textInfo2.getTitle()) == null || (str2 = title2.getTitle()) == null) {
            str2 = "";
        }
        String aVar2 = aVar.a(str2).f33382a.toString();
        l.b(aVar2, "");
        return aVar2;
    }
}
