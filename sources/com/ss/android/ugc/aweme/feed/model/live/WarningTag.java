package com.ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class WarningTag implements Serializable {
    @c(a = "duration")
    private long duration;
    @c(a = "tag_source")
    private int tagSource;
    @c(a = "text")
    private Text text;

    static {
        Covode.recordClassIndex(59516);
    }

    public static int com_ss_android_ugc_aweme_feed_model_live_WarningTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_feed_model_live_WarningTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ WarningTag copy$default(WarningTag warningTag, Text text2, long j2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            text2 = warningTag.text;
        }
        if ((i3 & 2) != 0) {
            j2 = warningTag.duration;
        }
        if ((i3 & 4) != 0) {
            i2 = warningTag.tagSource;
        }
        return warningTag.copy(text2, j2, i2);
    }

    public final Text component1() {
        return this.text;
    }

    public final long component2() {
        return this.duration;
    }

    public final int component3() {
        return this.tagSource;
    }

    public final WarningTag copy(Text text2, long j2, int i2) {
        l.d(text2, "");
        return new WarningTag(text2, j2, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WarningTag)) {
            return false;
        }
        WarningTag warningTag = (WarningTag) obj;
        return l.a(this.text, warningTag.text) && this.duration == warningTag.duration && this.tagSource == warningTag.tagSource;
    }

    public final int hashCode() {
        Text text2 = this.text;
        return ((((text2 != null ? text2.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_feed_model_live_WarningTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.duration)) * 31) + com_ss_android_ugc_aweme_feed_model_live_WarningTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.tagSource);
    }

    public final String toString() {
        return "WarningTag(text=" + this.text + ", duration=" + this.duration + ", tagSource=" + this.tagSource + ")";
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getTagSource() {
        return this.tagSource;
    }

    public final Text getText() {
        return this.text;
    }

    public final void setDuration(long j2) {
        this.duration = j2;
    }

    public final void setTagSource(int i2) {
        this.tagSource = i2;
    }

    public final void setText(Text text2) {
        l.d(text2, "");
        this.text = text2;
    }

    public WarningTag(Text text2, long j2, int i2) {
        l.d(text2, "");
        this.text = text2;
        this.duration = j2;
        this.tagSource = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WarningTag(Text text2, long j2, int i2, int i3, g gVar) {
        this(text2, (i3 & 2) != 0 ? -1 : j2, (i3 & 4) != 0 ? 0 : i2);
    }
}
