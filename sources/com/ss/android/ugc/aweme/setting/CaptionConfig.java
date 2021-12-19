package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class CaptionConfig {
    @c(a = "max_lines")
    private final int maxLines;
    @c(a = "words_per_line")
    private final int wordsPerLine;

    static {
        Covode.recordClassIndex(79961);
    }

    public static int com_ss_android_ugc_aweme_setting_CaptionConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ CaptionConfig copy$default(CaptionConfig captionConfig, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = captionConfig.maxLines;
        }
        if ((i4 & 2) != 0) {
            i3 = captionConfig.wordsPerLine;
        }
        return captionConfig.copy(i2, i3);
    }

    public final int component1() {
        return this.maxLines;
    }

    public final int component2() {
        return this.wordsPerLine;
    }

    public final CaptionConfig copy(int i2, int i3) {
        return new CaptionConfig(i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptionConfig)) {
            return false;
        }
        CaptionConfig captionConfig = (CaptionConfig) obj;
        return this.maxLines == captionConfig.maxLines && this.wordsPerLine == captionConfig.wordsPerLine;
    }

    public final int hashCode() {
        return (com_ss_android_ugc_aweme_setting_CaptionConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.maxLines) * 31) + com_ss_android_ugc_aweme_setting_CaptionConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.wordsPerLine);
    }

    public final String toString() {
        return "CaptionConfig(maxLines=" + this.maxLines + ", wordsPerLine=" + this.wordsPerLine + ")";
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getWordsPerLine() {
        return this.wordsPerLine;
    }

    public CaptionConfig(int i2, int i3) {
        this.maxLines = i2;
        this.wordsPerLine = i3;
    }
}
