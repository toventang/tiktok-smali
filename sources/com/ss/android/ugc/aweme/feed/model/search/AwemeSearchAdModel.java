package com.ss.android.ugc.aweme.feed.model.search;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class AwemeSearchAdModel implements Serializable {
    @c(a = "learn_more_bg_color")
    private final String SearchAdTransformButtonColor;
    @c(a = "button_text")
    private final String SearchAdTransformButtonText;
    @c(a = "animation_type")
    private final Integer animationType;
    @c(a = "button_color_show_seconds")
    private final float buttonColorShowSeconds;
    @c(a = "auto_play")
    private final Boolean isAutoPlayEnable;
    @c(a = "show_button_seconds")
    private final float showButtonSeconds;
    @c(a = "show_mask_times")
    private final Integer showMaskTimes;

    static {
        Covode.recordClassIndex(59521);
    }

    public static /* synthetic */ AwemeSearchAdModel copy$default(AwemeSearchAdModel awemeSearchAdModel, Boolean bool, Integer num, float f2, float f3, String str, Integer num2, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = awemeSearchAdModel.isAutoPlayEnable;
        }
        if ((i2 & 2) != 0) {
            num = awemeSearchAdModel.animationType;
        }
        if ((i2 & 4) != 0) {
            f2 = awemeSearchAdModel.showButtonSeconds;
        }
        if ((i2 & 8) != 0) {
            f3 = awemeSearchAdModel.buttonColorShowSeconds;
        }
        if ((i2 & 16) != 0) {
            str = awemeSearchAdModel.SearchAdTransformButtonColor;
        }
        if ((i2 & 32) != 0) {
            num2 = awemeSearchAdModel.showMaskTimes;
        }
        if ((i2 & 64) != 0) {
            str2 = awemeSearchAdModel.SearchAdTransformButtonText;
        }
        return awemeSearchAdModel.copy(bool, num, f2, f3, str, num2, str2);
    }

    public final Boolean component1() {
        return this.isAutoPlayEnable;
    }

    public final Integer component2() {
        return this.animationType;
    }

    public final float component3() {
        return this.showButtonSeconds;
    }

    public final float component4() {
        return this.buttonColorShowSeconds;
    }

    public final String component5() {
        return this.SearchAdTransformButtonColor;
    }

    public final Integer component6() {
        return this.showMaskTimes;
    }

    public final String component7() {
        return this.SearchAdTransformButtonText;
    }

    public final AwemeSearchAdModel copy(Boolean bool, Integer num, float f2, float f3, String str, Integer num2, String str2) {
        return new AwemeSearchAdModel(bool, num, f2, f3, str, num2, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeSearchAdModel)) {
            return false;
        }
        AwemeSearchAdModel awemeSearchAdModel = (AwemeSearchAdModel) obj;
        return l.a(this.isAutoPlayEnable, awemeSearchAdModel.isAutoPlayEnable) && l.a(this.animationType, awemeSearchAdModel.animationType) && Float.compare(this.showButtonSeconds, awemeSearchAdModel.showButtonSeconds) == 0 && Float.compare(this.buttonColorShowSeconds, awemeSearchAdModel.buttonColorShowSeconds) == 0 && l.a(this.SearchAdTransformButtonColor, awemeSearchAdModel.SearchAdTransformButtonColor) && l.a(this.showMaskTimes, awemeSearchAdModel.showMaskTimes) && l.a(this.SearchAdTransformButtonText, awemeSearchAdModel.SearchAdTransformButtonText);
    }

    public final int hashCode() {
        Boolean bool = this.isAutoPlayEnable;
        int i2 = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Integer num = this.animationType;
        int hashCode2 = (((((hashCode + (num != null ? num.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_feed_model_search_AwemeSearchAdModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.showButtonSeconds)) * 31) + com_ss_android_ugc_aweme_feed_model_search_AwemeSearchAdModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.buttonColorShowSeconds)) * 31;
        String str = this.SearchAdTransformButtonColor;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num2 = this.showMaskTimes;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str2 = this.SearchAdTransformButtonText;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "AwemeSearchAdModel(isAutoPlayEnable=" + this.isAutoPlayEnable + ", animationType=" + this.animationType + ", showButtonSeconds=" + this.showButtonSeconds + ", buttonColorShowSeconds=" + this.buttonColorShowSeconds + ", SearchAdTransformButtonColor=" + this.SearchAdTransformButtonColor + ", showMaskTimes=" + this.showMaskTimes + ", SearchAdTransformButtonText=" + this.SearchAdTransformButtonText + ")";
    }

    public final Integer getAnimationType() {
        return this.animationType;
    }

    public final float getButtonColorShowSeconds() {
        return this.buttonColorShowSeconds;
    }

    public final String getSearchAdTransformButtonColor() {
        return this.SearchAdTransformButtonColor;
    }

    public final String getSearchAdTransformButtonText() {
        return this.SearchAdTransformButtonText;
    }

    public final float getShowButtonSeconds() {
        return this.showButtonSeconds;
    }

    public final Integer getShowMaskTimes() {
        return this.showMaskTimes;
    }

    public final Boolean isAutoPlayEnable() {
        return this.isAutoPlayEnable;
    }

    public static int com_ss_android_ugc_aweme_feed_model_search_AwemeSearchAdModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public AwemeSearchAdModel(Boolean bool, Integer num, float f2, float f3, String str, Integer num2, String str2) {
        this.isAutoPlayEnable = bool;
        this.animationType = num;
        this.showButtonSeconds = f2;
        this.buttonColorShowSeconds = f3;
        this.SearchAdTransformButtonColor = str;
        this.showMaskTimes = num2;
        this.SearchAdTransformButtonText = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AwemeSearchAdModel(Boolean bool, Integer num, float f2, float f3, String str, Integer num2, String str2, int i2, g gVar) {
        this(bool, num, (i2 & 4) != 0 ? 0.0f : f2, (i2 & 8) != 0 ? 0.0f : f3, str, num2, str2);
    }
}
