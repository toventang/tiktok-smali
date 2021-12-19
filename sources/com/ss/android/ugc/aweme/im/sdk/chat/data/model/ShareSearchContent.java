package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.f.b.g;
import h.f.b.l;

public final class ShareSearchContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    @c(a = "desc")
    private String desc;
    @c(a = "image")
    private String image;
    @c(a = "schema")
    private String schema;
    @c(a = "title")
    private String title;
    @c(a = "url")
    private String url;

    static {
        Covode.recordClassIndex(64072);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(64073);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final ShareSearchContent fromSharePackage(SharePackage sharePackage) {
            l.d(sharePackage, "");
            ShareSearchContent shareSearchContent = new ShareSearchContent();
            shareSearchContent.setTitle(sharePackage.f124592f);
            shareSearchContent.setDesc(sharePackage.f124593g);
            shareSearchContent.setImage(sharePackage.f124595i.getString("thumb_url"));
            shareSearchContent.setSchema(sharePackage.f124595i.getString("schema"));
            String string = sharePackage.f124595i.getString("url_for_im_share");
            if (TextUtils.isEmpty(string)) {
                string = sharePackage.f124594h;
            }
            shareSearchContent.setUrl(string);
            return shareSearchContent;
        }
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final SharePackage generateSharePackage() {
        SharePackage a2 = PureDataSharePackage.a.a("search");
        Bundle bundle = a2.f124595i;
        String str = this.image;
        if (str == null) {
            str = "";
        }
        bundle.putSerializable("thumb_url", str);
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final String getMsgHint() {
        Context a2 = d.a();
        Object[] objArr = new Object[1];
        String str = this.title;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        String string = a2.getString(R.string.cjj, objArr);
        l.b(string, "");
        return string;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final String wrapMsgHint(boolean z, boolean z2, String str) {
        String str2;
        Context a2 = d.a();
        if (z || z2) {
            str2 = a2.getString(R.string.a_y);
        } else {
            str2 = a2.getString(R.string.fko);
        }
        l.b(str2, "");
        return str2;
    }
}
