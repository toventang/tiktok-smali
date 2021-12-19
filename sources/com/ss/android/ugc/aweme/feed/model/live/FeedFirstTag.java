package com.ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class FeedFirstTag implements Serializable {
    @c(a = "content")
    private String content;
    @c(a = "icon")
    private UrlModel icon;
    @c(a = "id")
    private long id;
    @c(a = "style")
    private int style;

    static {
        Covode.recordClassIndex(59488);
    }

    public FeedFirstTag() {
        this(0, 0, null, null, 15, null);
    }

    public static int com_ss_android_ugc_aweme_feed_model_live_FeedFirstTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_feed_model_live_FeedFirstTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ FeedFirstTag copy$default(FeedFirstTag feedFirstTag, long j2, int i2, String str, UrlModel urlModel, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j2 = feedFirstTag.id;
        }
        if ((i3 & 2) != 0) {
            i2 = feedFirstTag.style;
        }
        if ((i3 & 4) != 0) {
            str = feedFirstTag.content;
        }
        if ((i3 & 8) != 0) {
            urlModel = feedFirstTag.icon;
        }
        return feedFirstTag.copy(j2, i2, str, urlModel);
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

    public final UrlModel component4() {
        return this.icon;
    }

    public final FeedFirstTag copy(long j2, int i2, String str, UrlModel urlModel) {
        l.d(str, "");
        return new FeedFirstTag(j2, i2, str, urlModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedFirstTag)) {
            return false;
        }
        FeedFirstTag feedFirstTag = (FeedFirstTag) obj;
        return this.id == feedFirstTag.id && this.style == feedFirstTag.style && l.a(this.content, feedFirstTag.content) && l.a(this.icon, feedFirstTag.icon);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_live_FeedFirstTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((com_ss_android_ugc_aweme_feed_model_live_FeedFirstTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.id) * 31) + com_ss_android_ugc_aweme_feed_model_live_FeedFirstTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.style)) * 31;
        String str = this.content;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_feed_model_live_FeedFirstTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        UrlModel urlModel = this.icon;
        if (urlModel != null) {
            i2 = urlModel.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FeedFirstTag(id=" + this.id + ", style=" + this.style + ", content=" + this.content + ", icon=" + this.icon + ")";
    }

    public final String getContent() {
        return this.content;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final long getId() {
        return this.id;
    }

    public final int getStyle() {
        return this.style;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
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

    public FeedFirstTag(long j2, int i2, String str, UrlModel urlModel) {
        l.d(str, "");
        this.id = j2;
        this.style = i2;
        this.content = str;
        this.icon = urlModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeedFirstTag(long j2, int i2, String str, UrlModel urlModel, int i3, g gVar) {
        this((i3 & 1) != 0 ? -1 : j2, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? null : urlModel);
    }
}
