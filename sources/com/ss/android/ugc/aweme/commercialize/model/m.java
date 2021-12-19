package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class m implements Serializable {
    @c(a = "angle")
    private float angle;
    @c(a = "gecko_channel")
    private List<String> geckoChannel;
    @c(a = "height")
    private float height;
    @c(a = "position_x")
    private float positionX;
    @c(a = "position_y")
    private float positionY;
    @c(a = "show_seconds")
    private int showSeconds;
    @c(a = "sticker_data")
    private String stickerData;
    @c(a = "sticker_url")
    private String stickerUrl;
    @c(a = "width")
    private float width;

    static {
        Covode.recordClassIndex(46177);
    }

    public m() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, null, null, null, 511, null);
    }

    public static int com_ss_android_ugc_aweme_commercialize_model_AdStickerData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commercialize.model.m */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ m copy$default(m mVar, float f2, float f3, float f4, float f5, float f6, int i2, String str, List list, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f2 = mVar.positionX;
        }
        if ((i3 & 2) != 0) {
            f3 = mVar.positionY;
        }
        if ((i3 & 4) != 0) {
            f4 = mVar.height;
        }
        if ((i3 & 8) != 0) {
            f5 = mVar.width;
        }
        if ((i3 & 16) != 0) {
            f6 = mVar.angle;
        }
        if ((i3 & 32) != 0) {
            i2 = mVar.showSeconds;
        }
        if ((i3 & 64) != 0) {
            str = mVar.stickerUrl;
        }
        if ((i3 & 128) != 0) {
            list = mVar.geckoChannel;
        }
        if ((i3 & 256) != 0) {
            str2 = mVar.stickerData;
        }
        return mVar.copy(f2, f3, f4, f5, f6, i2, str, list, str2);
    }

    public final float component1() {
        return this.positionX;
    }

    public final float component2() {
        return this.positionY;
    }

    public final float component3() {
        return this.height;
    }

    public final float component4() {
        return this.width;
    }

    public final float component5() {
        return this.angle;
    }

    public final int component6() {
        return this.showSeconds;
    }

    public final String component7() {
        return this.stickerUrl;
    }

    public final List<String> component8() {
        return this.geckoChannel;
    }

    public final String component9() {
        return this.stickerData;
    }

    public final m copy(float f2, float f3, float f4, float f5, float f6, int i2, String str, List<String> list, String str2) {
        return new m(f2, f3, f4, f5, f6, i2, str, list, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.positionX, mVar.positionX) == 0 && Float.compare(this.positionY, mVar.positionY) == 0 && Float.compare(this.height, mVar.height) == 0 && Float.compare(this.width, mVar.width) == 0 && Float.compare(this.angle, mVar.angle) == 0 && this.showSeconds == mVar.showSeconds && l.a(this.stickerUrl, mVar.stickerUrl) && l.a(this.geckoChannel, mVar.geckoChannel) && l.a(this.stickerData, mVar.stickerData);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_commercialize_model_AdStickerData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((((((((com_ss_android_ugc_aweme_commercialize_model_AdStickerData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.positionX) * 31) + com_ss_android_ugc_aweme_commercialize_model_AdStickerData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.positionY)) * 31) + com_ss_android_ugc_aweme_commercialize_model_AdStickerData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.height)) * 31) + com_ss_android_ugc_aweme_commercialize_model_AdStickerData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.width)) * 31) + com_ss_android_ugc_aweme_commercialize_model_AdStickerData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.angle)) * 31) + com_ss_android_ugc_aweme_commercialize_model_AdStickerData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.showSeconds)) * 31;
        String str = this.stickerUrl;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_commercialize_model_AdStickerData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list = this.geckoChannel;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.stickerData;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "AdStickerData(positionX=" + this.positionX + ", positionY=" + this.positionY + ", height=" + this.height + ", width=" + this.width + ", angle=" + this.angle + ", showSeconds=" + this.showSeconds + ", stickerUrl=" + this.stickerUrl + ", geckoChannel=" + this.geckoChannel + ", stickerData=" + this.stickerData + ")";
    }

    public final float getAngle() {
        return this.angle;
    }

    public final List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getPositionX() {
        return this.positionX;
    }

    public final float getPositionY() {
        return this.positionY;
    }

    public final int getShowSeconds() {
        return this.showSeconds;
    }

    public final String getStickerData() {
        return this.stickerData;
    }

    public final String getStickerUrl() {
        return this.stickerUrl;
    }

    public final float getWidth() {
        return this.width;
    }

    public final void setAngle(float f2) {
        this.angle = f2;
    }

    public final void setGeckoChannel(List<String> list) {
        this.geckoChannel = list;
    }

    public final void setHeight(float f2) {
        this.height = f2;
    }

    public final void setPositionX(float f2) {
        this.positionX = f2;
    }

    public final void setPositionY(float f2) {
        this.positionY = f2;
    }

    public final void setShowSeconds(int i2) {
        this.showSeconds = i2;
    }

    public final void setStickerData(String str) {
        this.stickerData = str;
    }

    public final void setStickerUrl(String str) {
        this.stickerUrl = str;
    }

    public final void setWidth(float f2) {
        this.width = f2;
    }

    public static int com_ss_android_ugc_aweme_commercialize_model_AdStickerData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public m(float f2, float f3, float f4, float f5, float f6, int i2, String str, List<String> list, String str2) {
        this.positionX = f2;
        this.positionY = f3;
        this.height = f4;
        this.width = f5;
        this.angle = f6;
        this.showSeconds = i2;
        this.stickerUrl = str;
        this.geckoChannel = list;
        this.stickerData = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(float f2, float f3, float f4, float f5, float f6, int i2, String str, List list, String str2, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0.0f : f2, (i3 & 2) != 0 ? 0.0f : f3, (i3 & 4) != 0 ? 0.0f : f4, (i3 & 8) != 0 ? 0.0f : f5, (i3 & 16) == 0 ? f6 : 0.0f, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? null : str, (i3 & 128) != 0 ? null : list, (i3 & 256) == 0 ? str2 : null);
    }
}
