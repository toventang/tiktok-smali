package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class LinkCard {
    private final String desc;
    @c(a = "link_info")
    private final LinkInfo linkInfo;
    private final String name;

    static {
        Covode.recordClassIndex(64050);
    }

    public static /* synthetic */ LinkCard copy$default(LinkCard linkCard, String str, String str2, LinkInfo linkInfo2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = linkCard.name;
        }
        if ((i2 & 2) != 0) {
            str2 = linkCard.desc;
        }
        if ((i2 & 4) != 0) {
            linkInfo2 = linkCard.linkInfo;
        }
        return linkCard.copy(str, str2, linkInfo2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.desc;
    }

    public final LinkInfo component3() {
        return this.linkInfo;
    }

    public final LinkCard copy(String str, String str2, LinkInfo linkInfo2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(linkInfo2, "");
        return new LinkCard(str, str2, linkInfo2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkCard)) {
            return false;
        }
        LinkCard linkCard = (LinkCard) obj;
        return l.a(this.name, linkCard.name) && l.a(this.desc, linkCard.desc) && l.a(this.linkInfo, linkCard.linkInfo);
    }

    public final int hashCode() {
        String str = this.name;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.desc;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        LinkInfo linkInfo2 = this.linkInfo;
        if (linkInfo2 != null) {
            i2 = linkInfo2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "LinkCard(name=" + this.name + ", desc=" + this.desc + ", linkInfo=" + this.linkInfo + ")";
    }

    public final String getDesc() {
        return this.desc;
    }

    public final LinkInfo getLinkInfo() {
        return this.linkInfo;
    }

    public final String getName() {
        return this.name;
    }

    public LinkCard(String str, String str2, LinkInfo linkInfo2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(linkInfo2, "");
        this.name = str;
        this.desc = str2;
        this.linkInfo = linkInfo2;
    }
}
