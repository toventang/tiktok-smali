package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class AwemePlayFunModel implements Serializable {
    @c(a = "angle")
    private final int angle;
    @c(a = "end_duration")
    private final float endDuration;
    @c(a = "image_info")
    private final UrlModel imageInfo;
    @c(a = "position_x")
    private final float positionX;
    @c(a = "position_y")
    private final float positionY;
    @c(a = "show_duration")
    private final float showDuration;
    @c(a = "show_time")
    private final float showTime;
    @c(a = "start_duration")
    private final float startDuration;
    @c(a = "tips")
    private final String tips;

    static {
        Covode.recordClassIndex(59325);
    }

    public static int com_ss_android_ugc_aweme_feed_model_AwemePlayFunModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ AwemePlayFunModel copy$default(AwemePlayFunModel awemePlayFunModel, UrlModel urlModel, String str, float f2, float f3, float f4, float f5, float f6, float f7, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            urlModel = awemePlayFunModel.imageInfo;
        }
        if ((i3 & 2) != 0) {
            str = awemePlayFunModel.tips;
        }
        if ((i3 & 4) != 0) {
            f2 = awemePlayFunModel.startDuration;
        }
        if ((i3 & 8) != 0) {
            f3 = awemePlayFunModel.endDuration;
        }
        if ((i3 & 16) != 0) {
            f4 = awemePlayFunModel.showDuration;
        }
        if ((i3 & 32) != 0) {
            f5 = awemePlayFunModel.showTime;
        }
        if ((i3 & 64) != 0) {
            f6 = awemePlayFunModel.positionX;
        }
        if ((i3 & 128) != 0) {
            f7 = awemePlayFunModel.positionY;
        }
        if ((i3 & 256) != 0) {
            i2 = awemePlayFunModel.angle;
        }
        return awemePlayFunModel.copy(urlModel, str, f2, f3, f4, f5, f6, f7, i2);
    }

    public final UrlModel component1() {
        return this.imageInfo;
    }

    public final String component2() {
        return this.tips;
    }

    public final float component3() {
        return this.startDuration;
    }

    public final float component4() {
        return this.endDuration;
    }

    public final float component5() {
        return this.showDuration;
    }

    public final float component6() {
        return this.showTime;
    }

    public final float component7() {
        return this.positionX;
    }

    public final float component8() {
        return this.positionY;
    }

    public final int component9() {
        return this.angle;
    }

    public final AwemePlayFunModel copy(UrlModel urlModel, String str, float f2, float f3, float f4, float f5, float f6, float f7, int i2) {
        return new AwemePlayFunModel(urlModel, str, f2, f3, f4, f5, f6, f7, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemePlayFunModel)) {
            return false;
        }
        AwemePlayFunModel awemePlayFunModel = (AwemePlayFunModel) obj;
        return l.a(this.imageInfo, awemePlayFunModel.imageInfo) && l.a(this.tips, awemePlayFunModel.tips) && Float.compare(this.startDuration, awemePlayFunModel.startDuration) == 0 && Float.compare(this.endDuration, awemePlayFunModel.endDuration) == 0 && Float.compare(this.showDuration, awemePlayFunModel.showDuration) == 0 && Float.compare(this.showTime, awemePlayFunModel.showTime) == 0 && Float.compare(this.positionX, awemePlayFunModel.positionX) == 0 && Float.compare(this.positionY, awemePlayFunModel.positionY) == 0 && this.angle == awemePlayFunModel.angle;
    }

    public final int hashCode() {
        UrlModel urlModel = this.imageInfo;
        int i2 = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.tips;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((((((((((((((hashCode + i2) * 31) + com_ss_android_ugc_aweme_feed_model_AwemePlayFunModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.startDuration)) * 31) + com_ss_android_ugc_aweme_feed_model_AwemePlayFunModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.endDuration)) * 31) + com_ss_android_ugc_aweme_feed_model_AwemePlayFunModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.showDuration)) * 31) + com_ss_android_ugc_aweme_feed_model_AwemePlayFunModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.showTime)) * 31) + com_ss_android_ugc_aweme_feed_model_AwemePlayFunModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.positionX)) * 31) + com_ss_android_ugc_aweme_feed_model_AwemePlayFunModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.positionY)) * 31) + com_ss_android_ugc_aweme_feed_model_AwemePlayFunModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.angle);
    }

    public final String toString() {
        return "AwemePlayFunModel(imageInfo=" + this.imageInfo + ", tips=" + this.tips + ", startDuration=" + this.startDuration + ", endDuration=" + this.endDuration + ", showDuration=" + this.showDuration + ", showTime=" + this.showTime + ", positionX=" + this.positionX + ", positionY=" + this.positionY + ", angle=" + this.angle + ")";
    }

    public final int getAngle() {
        return this.angle;
    }

    public final float getEndDuration() {
        return this.endDuration;
    }

    public final UrlModel getImageInfo() {
        return this.imageInfo;
    }

    public final float getPositionX() {
        return this.positionX;
    }

    public final float getPositionY() {
        return this.positionY;
    }

    public final float getShowDuration() {
        return this.showDuration;
    }

    public final float getShowTime() {
        return this.showTime;
    }

    public final float getStartDuration() {
        return this.startDuration;
    }

    public final String getTips() {
        return this.tips;
    }

    public static int com_ss_android_ugc_aweme_feed_model_AwemePlayFunModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public AwemePlayFunModel(UrlModel urlModel, String str, float f2, float f3, float f4, float f5, float f6, float f7, int i2) {
        this.imageInfo = urlModel;
        this.tips = str;
        this.startDuration = f2;
        this.endDuration = f3;
        this.showDuration = f4;
        this.showTime = f5;
        this.positionX = f6;
        this.positionY = f7;
        this.angle = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AwemePlayFunModel(UrlModel urlModel, String str, float f2, float f3, float f4, float f5, float f6, float f7, int i2, int i3, g gVar) {
        this(urlModel, str, (i3 & 4) != 0 ? 0.0f : f2, (i3 & 8) != 0 ? 0.0f : f3, (i3 & 16) != 0 ? 0.0f : f4, (i3 & 32) != 0 ? 0.0f : f5, (i3 & 64) != 0 ? 0.0f : f6, (i3 & 128) != 0 ? 0.0f : f7, (i3 & 256) != 0 ? 0 : i2);
    }
}
