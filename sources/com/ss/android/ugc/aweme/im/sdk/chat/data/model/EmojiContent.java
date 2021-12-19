package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.emoji.g.a;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmojiContent extends BaseContent {
    private static String bigEmojiMessageHint = "";
    @c(a = "display_name")
    private String displayName;
    @c(a = "height")
    int height;
    @c(a = "image_id")
    private long imageId;
    @c(a = "image_type")
    private String imageType;
    @c(a = "package_id")
    private long packageId;
    @c(a = "sticker_id")
    private String stickerId;
    private boolean updateConversationTime = true;
    @c(a = "url")
    UrlModel url;
    @c(a = "version")
    private String version;
    @c(a = "width")
    int width;

    public String getDisplayName() {
        return this.displayName;
    }

    public int getHeight() {
        return this.height;
    }

    public long getImageId() {
        return this.imageId;
    }

    public String getImageType() {
        return this.imageType;
    }

    public long getPackageId() {
        return this.packageId;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public UrlModel getUrl() {
        return this.url;
    }

    public String getVersion() {
        return this.version;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isUpdateConversationTime() {
        return this.updateConversationTime;
    }

    static {
        Covode.recordClassIndex(64032);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.PreloadFetcher, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public List<UrlModel> fetchPreload() {
        UrlModel urlModel = this.url;
        if (urlModel == null) {
            return null;
        }
        return Collections.singletonList(urlModel);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        SharePackage a2 = PureDataSharePackage.a.a("gif");
        Bundle bundle = a2.f124595i;
        bundle.putSerializable("video_cover", getUrl());
        bundle.putInt("aweme_type", getType());
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public void tryInit() {
        Context a2;
        if (TextUtils.isEmpty(bigEmojiMessageHint) && (a2 = d.a()) != null) {
            bigEmojiMessageHint = a2.getString(R.string.cd6);
        }
    }

    public UrlModel getLocalUrl() {
        String a2;
        if (getType() == 502) {
            return null;
        }
        if (getType() == 501) {
            a2 = com.ss.android.ugc.aweme.emoji.utils.c.a(0, "0", this.imageId, this.imageType);
        } else {
            a2 = com.ss.android.ugc.aweme.emoji.utils.c.a(this.packageId, this.version, this.imageId, this.imageType);
        }
        if (!new File(a2).exists()) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        arrayList.add("file://".concat(String.valueOf(a2)));
        urlModel.setUrlList(arrayList);
        urlModel.setUri("file://".concat(String.valueOf(a2)));
        return urlModel;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        if (501 == getType()) {
            return "[" + d.a().getString(R.string.ceg) + "]";
        }
        if (!m.a(getDisplayName())) {
            return "[" + getDisplayName() + "]";
        }
        super.getMsgHint();
        return bigEmojiMessageHint;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setHeight(int i2) {
        this.height = i2;
    }

    public void setImageId(long j2) {
        this.imageId = j2;
    }

    public void setImageType(String str) {
        this.imageType = str;
    }

    public void setPackageId(long j2) {
        this.packageId = j2;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void setUpdateConversationTime(boolean z) {
        this.updateConversationTime = z;
    }

    public void setUrl(UrlModel urlModel) {
        this.url = urlModel;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setWidth(int i2) {
        this.width = i2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        if (this.type == 502) {
            return context.getResources().getString(R.string.cgv);
        }
        return context.getResources().getString(R.string.ch2);
    }

    public static EmojiContent obtain(a aVar) {
        EmojiContent emojiContent = new EmojiContent();
        emojiContent.setUrl(aVar.getAnimateUrl());
        emojiContent.setImageId(aVar.getId());
        emojiContent.setDisplayName(com.ss.android.ugc.aweme.emoji.d.a.a.b(aVar));
        emojiContent.setImageType(aVar.getAnimateType());
        emojiContent.setPackageId(aVar.getResourcesId());
        emojiContent.setVersion(aVar.getVersion());
        emojiContent.setWidth(aVar.getWidth());
        emojiContent.setHeight(aVar.getHeight());
        if (aVar.getStickerType() == 2) {
            emojiContent.setType(501);
        } else if (aVar.getStickerType() == 3) {
            emojiContent.setType(502);
            emojiContent.setStickerId(aVar.getStickerId());
        } else {
            emojiContent.setType(500);
        }
        return emojiContent;
    }

    public static EmojiContent obtain(a aVar, int i2) {
        EmojiContent obtain = obtain(aVar);
        obtain.setType(i2);
        return obtain;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str) {
        Context a2 = d.a();
        if (z2) {
            return a2.getString(R.string.a_v);
        }
        if (z) {
            return a2.getString(R.string.a_v);
        }
        return a2.getString(R.string.fkl);
    }
}
