package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;

public class ShareWebContent extends AbsShareWebContent {
    static {
        Covode.recordClassIndex(64079);
    }

    public boolean fromThirdShare() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        SharePackage a2 = PureDataSharePackage.a.a("web");
        a2.f124595i.putSerializable("thumb_url", getImage());
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.AbsShareWebContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        return d.a().getString(R.string.cjj, getTitle());
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        return context.getResources().getString(R.string.cgy);
    }

    public static ShareWebContent fromSharePackage(SharePackage sharePackage) {
        ShareWebContent shareWebContent = new ShareWebContent();
        shareWebContent.setTitle(sharePackage.f124592f);
        shareWebContent.setDesc(sharePackage.f124593g);
        shareWebContent.setImage(sharePackage.f124595i.getString("thumb_url"));
        String string = sharePackage.f124595i.getString("url_for_im_share");
        if (TextUtils.isEmpty(string)) {
            string = sharePackage.f124594h;
        }
        shareWebContent.setUrl(string);
        shareWebContent.setPushDetail(sharePackage.f124592f);
        return shareWebContent;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.AbsShareWebContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str) {
        Context a2 = d.a();
        if (z || z2) {
            return a2.getString(R.string.a_y);
        }
        return a2.getString(R.string.fko);
    }
}
