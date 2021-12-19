package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class ClickJumpModule implements Serializable {
    @c(a = "open_url")
    private final String openUrl;
    @c(a = "text")
    private final String text;
    @c(a = "web_url")
    private final String webUrl;

    static {
        Covode.recordClassIndex(50884);
    }

    public ClickJumpModule() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ClickJumpModule copy$default(ClickJumpModule clickJumpModule, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = clickJumpModule.text;
        }
        if ((i2 & 2) != 0) {
            str2 = clickJumpModule.openUrl;
        }
        if ((i2 & 4) != 0) {
            str3 = clickJumpModule.webUrl;
        }
        return clickJumpModule.copy(str, str2, str3);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.openUrl;
    }

    public final String component3() {
        return this.webUrl;
    }

    public final ClickJumpModule copy(String str, String str2, String str3) {
        return new ClickJumpModule(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickJumpModule)) {
            return false;
        }
        ClickJumpModule clickJumpModule = (ClickJumpModule) obj;
        return l.a(this.text, clickJumpModule.text) && l.a(this.openUrl, clickJumpModule.openUrl) && l.a(this.webUrl, clickJumpModule.webUrl);
    }

    public final int hashCode() {
        String str = this.text;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.openUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.webUrl;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ClickJumpModule(text=" + this.text + ", openUrl=" + this.openUrl + ", webUrl=" + this.webUrl + ")";
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public ClickJumpModule(String str, String str2, String str3) {
        this.text = str;
        this.openUrl = str2;
        this.webUrl = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ClickJumpModule(String str, String str2, String str3, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3);
    }
}
