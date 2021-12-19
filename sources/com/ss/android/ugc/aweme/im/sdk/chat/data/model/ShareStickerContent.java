package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.utils.dw;
import com.zhiliaoapp.musically.R;
import h.f.b.ad;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class ShareStickerContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    @c(a = "video_cover_urls")
    private List<UrlModel> awemeCoverList;
    @c(a = "cover_url")
    private UrlModel cover;
    @c(a = "sticker_id")
    private String stickerId = "";
    @c(a = "text")
    private String title = "";
    @c(a = "user_count")
    private Long userCount = 0L;

    static {
        Covode.recordClassIndex(64074);
    }

    public static final ShareStickerContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(64075);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final ShareStickerContent fromSharePackage(SharePackage sharePackage) {
            l.d(sharePackage, "");
            ShareStickerContent shareStickerContent = new ShareStickerContent();
            Bundle bundle = sharePackage.f124595i;
            shareStickerContent.setStickerId(bundle.getString("sticker_id"));
            shareStickerContent.setTitle(bundle.getString("sticker_name"));
            shareStickerContent.setUserCount(Long.valueOf(bundle.getLong("user_count")));
            Serializable serializable = bundle.getSerializable("video_cover");
            Object obj = null;
            if (!(serializable instanceof UrlModel)) {
                serializable = null;
            }
            shareStickerContent.setCover((UrlModel) serializable);
            String string = bundle.getString("aweme_cover_list");
            if (!(string == null || string.length() == 0)) {
                Object a2 = dw.a(string, List.class);
                if (ad.c(a2)) {
                    obj = a2;
                }
                shareStickerContent.setAwemeCoverList((List) obj);
            }
            return shareStickerContent;
        }
    }

    public final List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getUserCount() {
        return this.userCount;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.PreloadFetcher, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final List<UrlModel> fetchPreload() {
        List<UrlModel> list = this.awemeCoverList;
        if (list == null || list.size() < 3) {
            return null;
        }
        return list;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final SharePackage generateSharePackage() {
        SharePackage a2 = PureDataSharePackage.a.a("sticker");
        a2.f124595i.putSerializable("video_cover", this.cover);
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final String getMsgHint() {
        String string = d.a().getResources().getString(R.string.ad4, this.title);
        l.b(string, "");
        return string;
    }

    public final void setAwemeCoverList(List<UrlModel> list) {
        this.awemeCoverList = list;
    }

    public final void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setStickerId(String str) {
        this.stickerId = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUserCount(Long l2) {
        this.userCount = l2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final String getQuoteHint(Context context) {
        l.d(context, "");
        String string = context.getResources().getString(R.string.cgu, this.title);
        l.b(string, "");
        return string;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final String wrapMsgHint(boolean z, boolean z2, String str) {
        Context a2 = d.a();
        if (z || z2) {
            String string = a2.getString(R.string.a_u, this.title);
            l.b(string, "");
            return string;
        }
        String string2 = a2.getString(R.string.fkk, this.title);
        l.b(string2, "");
        return string2;
    }
}
