package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.g;
import h.f.b.l;

public final class Title {
    @c(a = "color_type")
    private final int colorType;
    private final UrlModel icon;
    private final String title;

    static {
        Covode.recordClassIndex(64090);
    }

    public static int com_ss_android_ugc_aweme_im_sdk_chat_data_model_Title_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ Title copy$default(Title title2, UrlModel urlModel, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            urlModel = title2.icon;
        }
        if ((i3 & 2) != 0) {
            str = title2.title;
        }
        if ((i3 & 4) != 0) {
            i2 = title2.colorType;
        }
        return title2.copy(urlModel, str, i2);
    }

    public final UrlModel component1() {
        return this.icon;
    }

    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.colorType;
    }

    public final Title copy(UrlModel urlModel, String str, int i2) {
        l.d(urlModel, "");
        l.d(str, "");
        return new Title(urlModel, str, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Title)) {
            return false;
        }
        Title title2 = (Title) obj;
        return l.a(this.icon, title2.icon) && l.a(this.title, title2.title) && this.colorType == title2.colorType;
    }

    public final int hashCode() {
        UrlModel urlModel = this.icon;
        int i2 = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.title;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((hashCode + i2) * 31) + com_ss_android_ugc_aweme_im_sdk_chat_data_model_Title_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.colorType);
    }

    public final String toString() {
        return "Title(icon=" + this.icon + ", title=" + this.title + ", colorType=" + this.colorType + ")";
    }

    public final int getColorType() {
        return this.colorType;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public Title(UrlModel urlModel, String str, int i2) {
        l.d(urlModel, "");
        l.d(str, "");
        this.icon = urlModel;
        this.title = str;
        this.colorType = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Title(UrlModel urlModel, String str, int i2, int i3, g gVar) {
        this(urlModel, str, (i3 & 4) != 0 ? 0 : i2);
    }
}
