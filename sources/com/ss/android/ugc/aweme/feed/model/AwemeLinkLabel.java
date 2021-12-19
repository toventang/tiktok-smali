package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class AwemeLinkLabel implements Serializable {
    @c(a = b.f37372a)
    private final String color;
    @c(a = "color_icon")
    private final String colorIcon;
    @c(a = "color_text")
    private final String colorText;
    @c(a = "icon")
    private final UrlModel icon;
    @c(a = "show_seconds")
    private final int showSeconds;
    @c(a = "style_type")
    private final int styleType;
    @c(a = "text")
    private final String text;
    @c(a = StringSet.type)
    private final int type;
    @c(a = "white_color_icon")
    private final String whiteColorIcon;
    @c(a = "white_color_text")
    private final String whiteColorText;

    static {
        Covode.recordClassIndex(59324);
    }

    public static int com_ss_android_ugc_aweme_feed_model_AwemeLinkLabel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ AwemeLinkLabel copy$default(AwemeLinkLabel awemeLinkLabel, String str, String str2, String str3, String str4, int i2, String str5, String str6, int i3, int i4, UrlModel urlModel, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = awemeLinkLabel.color;
        }
        if ((i5 & 2) != 0) {
            str2 = awemeLinkLabel.text;
        }
        if ((i5 & 4) != 0) {
            str3 = awemeLinkLabel.colorText;
        }
        if ((i5 & 8) != 0) {
            str4 = awemeLinkLabel.whiteColorText;
        }
        if ((i5 & 16) != 0) {
            i2 = awemeLinkLabel.type;
        }
        if ((i5 & 32) != 0) {
            str5 = awemeLinkLabel.colorIcon;
        }
        if ((i5 & 64) != 0) {
            str6 = awemeLinkLabel.whiteColorIcon;
        }
        if ((i5 & 128) != 0) {
            i3 = awemeLinkLabel.styleType;
        }
        if ((i5 & 256) != 0) {
            i4 = awemeLinkLabel.showSeconds;
        }
        if ((i5 & 512) != 0) {
            urlModel = awemeLinkLabel.icon;
        }
        return awemeLinkLabel.copy(str, str2, str3, str4, i2, str5, str6, i3, i4, urlModel);
    }

    public final String component1() {
        return this.color;
    }

    public final UrlModel component10() {
        return this.icon;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.colorText;
    }

    public final String component4() {
        return this.whiteColorText;
    }

    public final int component5() {
        return this.type;
    }

    public final String component6() {
        return this.colorIcon;
    }

    public final String component7() {
        return this.whiteColorIcon;
    }

    public final int component8() {
        return this.styleType;
    }

    public final int component9() {
        return this.showSeconds;
    }

    public final AwemeLinkLabel copy(String str, String str2, String str3, String str4, int i2, String str5, String str6, int i3, int i4, UrlModel urlModel) {
        return new AwemeLinkLabel(str, str2, str3, str4, i2, str5, str6, i3, i4, urlModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeLinkLabel)) {
            return false;
        }
        AwemeLinkLabel awemeLinkLabel = (AwemeLinkLabel) obj;
        return l.a(this.color, awemeLinkLabel.color) && l.a(this.text, awemeLinkLabel.text) && l.a(this.colorText, awemeLinkLabel.colorText) && l.a(this.whiteColorText, awemeLinkLabel.whiteColorText) && this.type == awemeLinkLabel.type && l.a(this.colorIcon, awemeLinkLabel.colorIcon) && l.a(this.whiteColorIcon, awemeLinkLabel.whiteColorIcon) && this.styleType == awemeLinkLabel.styleType && this.showSeconds == awemeLinkLabel.showSeconds && l.a(this.icon, awemeLinkLabel.icon);
    }

    public final int hashCode() {
        String str = this.color;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.colorText;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.whiteColorText;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_feed_model_AwemeLinkLabel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.type)) * 31;
        String str5 = this.colorIcon;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.whiteColorIcon;
        int hashCode6 = (((((hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_feed_model_AwemeLinkLabel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.styleType)) * 31) + com_ss_android_ugc_aweme_feed_model_AwemeLinkLabel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.showSeconds)) * 31;
        UrlModel urlModel = this.icon;
        if (urlModel != null) {
            i2 = urlModel.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "AwemeLinkLabel(color=" + this.color + ", text=" + this.text + ", colorText=" + this.colorText + ", whiteColorText=" + this.whiteColorText + ", type=" + this.type + ", colorIcon=" + this.colorIcon + ", whiteColorIcon=" + this.whiteColorIcon + ", styleType=" + this.styleType + ", showSeconds=" + this.showSeconds + ", icon=" + this.icon + ")";
    }

    public final String getColor() {
        return this.color;
    }

    public final String getColorIcon() {
        return this.colorIcon;
    }

    public final String getColorText() {
        return this.colorText;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final int getShowSeconds() {
        return this.showSeconds;
    }

    public final int getStyleType() {
        return this.styleType;
    }

    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    public final String getWhiteColorIcon() {
        return this.whiteColorIcon;
    }

    public final String getWhiteColorText() {
        return this.whiteColorText;
    }

    public AwemeLinkLabel(String str, String str2, String str3, String str4, int i2, String str5, String str6, int i3, int i4, UrlModel urlModel) {
        this.color = str;
        this.text = str2;
        this.colorText = str3;
        this.whiteColorText = str4;
        this.type = i2;
        this.colorIcon = str5;
        this.whiteColorIcon = str6;
        this.styleType = i3;
        this.showSeconds = i4;
        this.icon = urlModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AwemeLinkLabel(String str, String str2, String str3, String str4, int i2, String str5, String str6, int i3, int i4, UrlModel urlModel, int i5, g gVar) {
        this(str, str2, str3, str4, (i5 & 16) != 0 ? 4 : i2, str5, str6, (i5 & 128) != 0 ? 0 : i3, (i5 & 256) != 0 ? 0 : i4, urlModel);
    }
}
