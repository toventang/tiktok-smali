package com.ss.android.ugc.gamora.editor.sticker.donation.c;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;
import java.io.Serializable;

public final class c extends b implements Serializable {
    @com.google.gson.a.c(a = "add_time")
    private String addTime;
    @com.google.gson.a.c(a = "desc")
    private final String desc;
    @com.google.gson.a.c(a = "web_url")
    private final String detailUrl;
    @com.google.gson.a.c(a = "donation_link")
    private final String donateLink;
    @com.google.gson.a.c(a = "icon")
    private final UrlModel icon;
    @com.google.gson.a.c(a = StringSet.name)
    private final String name;
    @com.google.gson.a.c(a = "ngo_id")
    private Integer ngoId;

    static {
        Covode.recordClassIndex(96446);
    }

    public static /* synthetic */ c copy$default(c cVar, String str, String str2, UrlModel urlModel, String str3, String str4, String str5, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cVar.getName();
        }
        if ((i2 & 2) != 0) {
            str2 = cVar.getDesc();
        }
        if ((i2 & 4) != 0) {
            urlModel = cVar.getIcon();
        }
        if ((i2 & 8) != 0) {
            str3 = cVar.getDetailUrl();
        }
        if ((i2 & 16) != 0) {
            str4 = cVar.getDonateLink();
        }
        if ((i2 & 32) != 0) {
            str5 = cVar.getAddTime();
        }
        if ((i2 & 64) != 0) {
            num = cVar.getNgoId();
        }
        return cVar.copy(str, str2, urlModel, str3, str4, str5, num);
    }

    public final String component1() {
        return getName();
    }

    public final String component2() {
        return getDesc();
    }

    public final UrlModel component3() {
        return getIcon();
    }

    public final String component4() {
        return getDetailUrl();
    }

    public final String component5() {
        return getDonateLink();
    }

    public final String component6() {
        return getAddTime();
    }

    public final Integer component7() {
        return getNgoId();
    }

    public final c copy(String str, String str2, UrlModel urlModel, String str3, String str4, String str5, Integer num) {
        return new c(str, str2, urlModel, str3, str4, str5, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(getName(), bVar.getName()) && l.a(getDesc(), bVar.getDesc()) && l.a(getIcon(), bVar.getIcon()) && l.a(getDetailUrl(), bVar.getDetailUrl()) && l.a(getDonateLink(), bVar.getDonateLink()) && l.a(getAddTime(), bVar.getAddTime()) && l.a(getNgoId(), bVar.getNgoId());
    }

    public final int hashCode() {
        String name2 = getName();
        int i2 = 0;
        int hashCode = (name2 != null ? name2.hashCode() : 0) * 31;
        String desc2 = getDesc();
        int hashCode2 = (hashCode + (desc2 != null ? desc2.hashCode() : 0)) * 31;
        UrlModel icon2 = getIcon();
        int hashCode3 = (hashCode2 + (icon2 != null ? icon2.hashCode() : 0)) * 31;
        String detailUrl2 = getDetailUrl();
        int hashCode4 = (hashCode3 + (detailUrl2 != null ? detailUrl2.hashCode() : 0)) * 31;
        String donateLink2 = getDonateLink();
        int hashCode5 = (hashCode4 + (donateLink2 != null ? donateLink2.hashCode() : 0)) * 31;
        String addTime2 = getAddTime();
        int hashCode6 = (hashCode5 + (addTime2 != null ? addTime2.hashCode() : 0)) * 31;
        Integer ngoId2 = getNgoId();
        if (ngoId2 != null) {
            i2 = ngoId2.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "OrganizationModel(name=" + getName() + ", desc=" + getDesc() + ", icon=" + getIcon() + ", detailUrl=" + getDetailUrl() + ", donateLink=" + getDonateLink() + ", addTime=" + getAddTime() + ", ngoId=" + getNgoId() + ")";
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.c.b
    public final String getAddTime() {
        return this.addTime;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.c.b
    public final String getDesc() {
        return this.desc;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.c.b
    public final String getDetailUrl() {
        return this.detailUrl;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.c.b
    public final String getDonateLink() {
        return this.donateLink;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.c.b
    public final UrlModel getIcon() {
        return this.icon;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.c.b
    public final String getName() {
        return this.name;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.c.b
    public final Integer getNgoId() {
        return this.ngoId;
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.c.b
    public final void setAddTime(String str) {
        this.addTime = str;
    }

    public final void setNgoId(Integer num) {
        this.ngoId = num;
    }

    public c(String str, String str2, UrlModel urlModel, String str3, String str4, String str5, Integer num) {
        this.name = str;
        this.desc = str2;
        this.icon = urlModel;
        this.detailUrl = str3;
        this.donateLink = str4;
        this.addTime = str5;
        this.ngoId = num;
    }
}
