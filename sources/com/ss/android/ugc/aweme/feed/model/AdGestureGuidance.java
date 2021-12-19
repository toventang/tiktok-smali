package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class AdGestureGuidance implements Serializable {
    @c(a = "height")
    private float height;
    @c(a = "image")
    private UrlModel image;
    @c(a = "position_x")
    private float positionX;
    @c(a = "position_y")
    private float positionY;
    @c(a = "show_time")
    private float showTime;
    @c(a = "width")
    private float width;

    static {
        Covode.recordClassIndex(59288);
    }

    public AdGestureGuidance() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 63, null);
    }

    public static /* synthetic */ AdGestureGuidance copy$default(AdGestureGuidance adGestureGuidance, float f2, float f3, float f4, float f5, float f6, UrlModel urlModel, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = adGestureGuidance.showTime;
        }
        if ((i2 & 2) != 0) {
            f3 = adGestureGuidance.positionX;
        }
        if ((i2 & 4) != 0) {
            f4 = adGestureGuidance.positionY;
        }
        if ((i2 & 8) != 0) {
            f5 = adGestureGuidance.width;
        }
        if ((i2 & 16) != 0) {
            f6 = adGestureGuidance.height;
        }
        if ((i2 & 32) != 0) {
            urlModel = adGestureGuidance.image;
        }
        return adGestureGuidance.copy(f2, f3, f4, f5, f6, urlModel);
    }

    public final float component1() {
        return this.showTime;
    }

    public final float component2() {
        return this.positionX;
    }

    public final float component3() {
        return this.positionY;
    }

    public final float component4() {
        return this.width;
    }

    public final float component5() {
        return this.height;
    }

    public final UrlModel component6() {
        return this.image;
    }

    public final AdGestureGuidance copy(float f2, float f3, float f4, float f5, float f6, UrlModel urlModel) {
        return new AdGestureGuidance(f2, f3, f4, f5, f6, urlModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdGestureGuidance)) {
            return false;
        }
        AdGestureGuidance adGestureGuidance = (AdGestureGuidance) obj;
        return Float.compare(this.showTime, adGestureGuidance.showTime) == 0 && Float.compare(this.positionX, adGestureGuidance.positionX) == 0 && Float.compare(this.positionY, adGestureGuidance.positionY) == 0 && Float.compare(this.width, adGestureGuidance.width) == 0 && Float.compare(this.height, adGestureGuidance.height) == 0 && l.a(this.image, adGestureGuidance.image);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_AdGestureGuidance_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((((((com_ss_android_ugc_aweme_feed_model_AdGestureGuidance_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.showTime) * 31) + com_ss_android_ugc_aweme_feed_model_AdGestureGuidance_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.positionX)) * 31) + com_ss_android_ugc_aweme_feed_model_AdGestureGuidance_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.positionY)) * 31) + com_ss_android_ugc_aweme_feed_model_AdGestureGuidance_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.width)) * 31) + com_ss_android_ugc_aweme_feed_model_AdGestureGuidance_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.height)) * 31;
        UrlModel urlModel = this.image;
        return com_ss_android_ugc_aweme_feed_model_AdGestureGuidance_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (urlModel != null ? urlModel.hashCode() : 0);
    }

    public final String toString() {
        return "AdGestureGuidance(showTime=" + this.showTime + ", positionX=" + this.positionX + ", positionY=" + this.positionY + ", width=" + this.width + ", height=" + this.height + ", image=" + this.image + ")";
    }

    public final float getHeight() {
        return this.height;
    }

    public final UrlModel getImage() {
        return this.image;
    }

    public final float getPositionX() {
        return this.positionX;
    }

    public final float getPositionY() {
        return this.positionY;
    }

    public final float getShowTime() {
        return this.showTime;
    }

    public final float getWidth() {
        return this.width;
    }

    public final void setHeight(float f2) {
        this.height = f2;
    }

    public final void setImage(UrlModel urlModel) {
        this.image = urlModel;
    }

    public final void setPositionX(float f2) {
        this.positionX = f2;
    }

    public final void setPositionY(float f2) {
        this.positionY = f2;
    }

    public final void setShowTime(float f2) {
        this.showTime = f2;
    }

    public final void setWidth(float f2) {
        this.width = f2;
    }

    public static int com_ss_android_ugc_aweme_feed_model_AdGestureGuidance_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public AdGestureGuidance(float f2, float f3, float f4, float f5, float f6, UrlModel urlModel) {
        this.showTime = f2;
        this.positionX = f3;
        this.positionY = f4;
        this.width = f5;
        this.height = f6;
        this.image = urlModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AdGestureGuidance(float f2, float f3, float f4, float f5, float f6, UrlModel urlModel, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0.0f : f2, (i2 & 2) != 0 ? 0.0f : f3, (i2 & 4) != 0 ? 0.0f : f4, (i2 & 8) != 0 ? 0.0f : f5, (i2 & 16) == 0 ? f6 : 0.0f, (i2 & 32) != 0 ? null : urlModel);
    }
}
