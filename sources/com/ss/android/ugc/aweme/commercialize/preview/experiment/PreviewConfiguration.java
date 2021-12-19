package com.ss.android.ugc.aweme.commercialize.preview.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class PreviewConfiguration {
    @c(a = "delay_time_in_millisecond")
    private final int delayTimeInMillisecond;
    @c(a = "validation_duration_in_minute")
    private final int validationDurationInMinute;

    static {
        Covode.recordClassIndex(46253);
    }

    public static int com_ss_android_ugc_aweme_commercialize_preview_experiment_PreviewConfiguration_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ PreviewConfiguration copy$default(PreviewConfiguration previewConfiguration, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = previewConfiguration.delayTimeInMillisecond;
        }
        if ((i4 & 2) != 0) {
            i3 = previewConfiguration.validationDurationInMinute;
        }
        return previewConfiguration.copy(i2, i3);
    }

    public final int component1() {
        return this.delayTimeInMillisecond;
    }

    public final int component2() {
        return this.validationDurationInMinute;
    }

    public final PreviewConfiguration copy(int i2, int i3) {
        return new PreviewConfiguration(i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewConfiguration)) {
            return false;
        }
        PreviewConfiguration previewConfiguration = (PreviewConfiguration) obj;
        return this.delayTimeInMillisecond == previewConfiguration.delayTimeInMillisecond && this.validationDurationInMinute == previewConfiguration.validationDurationInMinute;
    }

    public final int hashCode() {
        return (com_ss_android_ugc_aweme_commercialize_preview_experiment_PreviewConfiguration_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.delayTimeInMillisecond) * 31) + com_ss_android_ugc_aweme_commercialize_preview_experiment_PreviewConfiguration_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.validationDurationInMinute);
    }

    public final String toString() {
        return "PreviewConfiguration(delayTimeInMillisecond=" + this.delayTimeInMillisecond + ", validationDurationInMinute=" + this.validationDurationInMinute + ")";
    }

    public final int getDelayTimeInMillisecond() {
        return this.delayTimeInMillisecond;
    }

    public final int getValidationDurationInMinute() {
        return this.validationDurationInMinute;
    }

    public PreviewConfiguration(int i2, int i3) {
        this.delayTimeInMillisecond = i2;
        this.validationDurationInMinute = i3;
    }
}
