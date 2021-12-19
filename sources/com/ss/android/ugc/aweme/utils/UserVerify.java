package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.g;

public final class UserVerify {
    private final UrlModel avatarThumb;
    private final String customVerify;
    private final String enterpriseVerifyReason;
    private final Integer verificationType;

    static {
        Covode.recordClassIndex(93263);
    }

    public UserVerify() {
        this(null, null, null, null, 15, null);
    }

    public final UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public final String getCustomVerify() {
        return this.customVerify;
    }

    public final String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public final Integer getVerificationType() {
        return this.verificationType;
    }

    public UserVerify(UrlModel urlModel, String str, String str2, Integer num) {
        this.avatarThumb = urlModel;
        this.customVerify = str;
        this.enterpriseVerifyReason = str2;
        this.verificationType = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserVerify(UrlModel urlModel, String str, String str2, Integer num, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : urlModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? -1 : num);
    }
}
