package com.ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class FeedSubTag implements Serializable {
    @c(a = "content")
    private String content;
    @c(a = "id")
    private long id;
    @c(a = "style")
    private int style;

    static {
        Covode.recordClassIndex(59490);
    }

    public FeedSubTag() {
        this(0, 0, null, 7, null);
    }

    public static int com_ss_android_ugc_aweme_feed_model_live_FeedSubTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_feed_model_live_FeedSubTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ FeedSubTag copy$default(FeedSubTag feedSubTag, long j2, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j2 = feedSubTag.id;
        }
        if ((i3 & 2) != 0) {
            i2 = feedSubTag.style;
        }
        if ((i3 & 4) != 0) {
            str = feedSubTag.content;
        }
        return feedSubTag.copy(j2, i2, str);
    }

    public final long component1() {
        return this.id;
    }

    public final int component2() {
        return this.style;
    }

    public final String component3() {
        return this.content;
    }

    public final FeedSubTag copy(long j2, int i2, String str) {
        l.d(str, "");
        return new FeedSubTag(j2, i2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedSubTag)) {
            return false;
        }
        FeedSubTag feedSubTag = (FeedSubTag) obj;
        return this.id == feedSubTag.id && this.style == feedSubTag.style && l.a(this.content, feedSubTag.content);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_live_FeedSubTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((com_ss_android_ugc_aweme_feed_model_live_FeedSubTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.id) * 31) + com_ss_android_ugc_aweme_feed_model_live_FeedSubTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.style)) * 31;
        String str = this.content;
        return com_ss_android_ugc_aweme_feed_model_live_FeedSubTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FeedSubTag(id=" + this.id + ", style=" + this.style + ", content=" + this.content + ")";
    }

    public final String getContent() {
        return this.content;
    }

    public final long getId() {
        return this.id;
    }

    public final int getStyle() {
        return this.style;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setStyle(int i2) {
        this.style = i2;
    }

    public final void setContent(String str) {
        l.d(str, "");
        this.content = str;
    }

    public FeedSubTag(long j2, int i2, String str) {
        l.d(str, "");
        this.id = j2;
        this.style = i2;
        this.content = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeedSubTag(long j2, int i2, String str, int i3, g gVar) {
        this((i3 & 1) != 0 ? -1 : j2, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? "" : str);
    }
}
