package com.ss.android.ugc.aweme.feed.model;

import androidx.c.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.f;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class AwemeTrendingBar implements Serializable {
    @c(a = "display")
    public String display;
    @c(a = "event_keyword")
    public String eventKeyword;
    @c(a = "event_keyword_id")
    public long eventKeywordId;
    @c(a = "event_tracking_param")
    public String eventTrackingParam;
    @c(a = "icon_url")
    public UrlModel iconUrl;
    @c(a = "schema")
    public String schema;

    static {
        Covode.recordClassIndex(59341);
    }

    public AwemeTrendingBar() {
        this(null, null, null, 0, null, null, 63, null);
    }

    public static int com_ss_android_ugc_aweme_feed_model_AwemeTrendingBar_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ AwemeTrendingBar copy$default(AwemeTrendingBar awemeTrendingBar, UrlModel urlModel, String str, String str2, long j2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            urlModel = awemeTrendingBar.iconUrl;
        }
        if ((i2 & 2) != 0) {
            str = awemeTrendingBar.display;
        }
        if ((i2 & 4) != 0) {
            str2 = awemeTrendingBar.schema;
        }
        if ((i2 & 8) != 0) {
            j2 = awemeTrendingBar.eventKeywordId;
        }
        if ((i2 & 16) != 0) {
            str3 = awemeTrendingBar.eventKeyword;
        }
        if ((i2 & 32) != 0) {
            str4 = awemeTrendingBar.eventTrackingParam;
        }
        return awemeTrendingBar.copy(urlModel, str, str2, j2, str3, str4);
    }

    public final UrlModel component1() {
        return this.iconUrl;
    }

    public final String component2() {
        return this.display;
    }

    public final String component3() {
        return this.schema;
    }

    public final long component4() {
        return this.eventKeywordId;
    }

    public final String component5() {
        return this.eventKeyword;
    }

    public final String component6() {
        return this.eventTrackingParam;
    }

    public final AwemeTrendingBar copy(UrlModel urlModel, String str, String str2, long j2, String str3, String str4) {
        l.d(urlModel, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        return new AwemeTrendingBar(urlModel, str, str2, j2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeTrendingBar)) {
            return false;
        }
        AwemeTrendingBar awemeTrendingBar = (AwemeTrendingBar) obj;
        return l.a(this.iconUrl, awemeTrendingBar.iconUrl) && l.a(this.display, awemeTrendingBar.display) && l.a(this.schema, awemeTrendingBar.schema) && this.eventKeywordId == awemeTrendingBar.eventKeywordId && l.a(this.eventKeyword, awemeTrendingBar.eventKeyword) && l.a(this.eventTrackingParam, awemeTrendingBar.eventTrackingParam);
    }

    public final int hashCode() {
        UrlModel urlModel = this.iconUrl;
        int i2 = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.display;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.schema;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_feed_model_AwemeTrendingBar_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.eventKeywordId)) * 31;
        String str3 = this.eventKeyword;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.eventTrackingParam;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "AwemeTrendingBar(iconUrl=" + this.iconUrl + ", display=" + this.display + ", schema=" + this.schema + ", eventKeywordId=" + this.eventKeywordId + ", eventKeyword=" + this.eventKeyword + ", eventTrackingParam=" + this.eventTrackingParam + ")";
    }

    public final String getDisplay() {
        return this.display;
    }

    public final String getEventKeyword() {
        return this.eventKeyword;
    }

    public final long getEventKeywordId() {
        return this.eventKeywordId;
    }

    public final String getEventTrackingParam() {
        return this.eventTrackingParam;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final Map<String, String> getTrackMap() {
        a aVar = new a();
        try {
            HashMap hashMap = (HashMap) new f().a(this.eventTrackingParam, HashMap.class);
            l.b(hashMap, "");
            for (Map.Entry entry : hashMap.entrySet()) {
                aVar.put(entry.getKey().toString(), entry.getValue().toString());
            }
            return aVar;
        } catch (Exception unused) {
            return new a();
        }
    }

    public final void setEventKeywordId(long j2) {
        this.eventKeywordId = j2;
    }

    public final void setDisplay(String str) {
        l.d(str, "");
        this.display = str;
    }

    public final void setEventKeyword(String str) {
        l.d(str, "");
        this.eventKeyword = str;
    }

    public final void setEventTrackingParam(String str) {
        l.d(str, "");
        this.eventTrackingParam = str;
    }

    public final void setIconUrl(UrlModel urlModel) {
        l.d(urlModel, "");
        this.iconUrl = urlModel;
    }

    public final void setSchema(String str) {
        l.d(str, "");
        this.schema = str;
    }

    public AwemeTrendingBar(UrlModel urlModel, String str, String str2, long j2, String str3, String str4) {
        l.d(urlModel, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.iconUrl = urlModel;
        this.display = str;
        this.schema = str2;
        this.eventKeywordId = j2;
        this.eventKeyword = str3;
        this.eventTrackingParam = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AwemeTrendingBar(com.ss.android.ugc.aweme.base.model.UrlModel r9, java.lang.String r10, java.lang.String r11, long r12, java.lang.String r14, java.lang.String r15, int r16, h.f.b.g r17) {
        /*
            r8 = this;
            r6 = r14
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r0 = r16 & 1
            if (r0 == 0) goto L_0x000e
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r1.<init>()
        L_0x000e:
            r0 = r16 & 2
            java.lang.String r7 = ""
            if (r0 == 0) goto L_0x0015
            r2 = r7
        L_0x0015:
            r0 = r16 & 4
            if (r0 == 0) goto L_0x001a
            r3 = r7
        L_0x001a:
            r0 = r16 & 8
            if (r0 == 0) goto L_0x0020
            r4 = 0
        L_0x0020:
            r0 = r16 & 16
            if (r0 == 0) goto L_0x0025
            r6 = r7
        L_0x0025:
            r0 = r16 & 32
            if (r0 == 0) goto L_0x002e
        L_0x0029:
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r6, r7)
            return
        L_0x002e:
            r7 = r15
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.AwemeTrendingBar.<init>(com.ss.android.ugc.aweme.base.model.UrlModel, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
