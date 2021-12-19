package com.ss.android.ugc.gamora.editor.sticker.donation.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class e extends b implements Serializable {
    @c(a = "desc")
    private final String desc;
    @c(a = "desc_highlights")
    private List<g> descHighlightList;
    @c(a = "web_url")
    private final String detailUrl;
    @c(a = "donation_link")
    private final String donateLink;
    @c(a = "icon")
    private final UrlModel icon;
    @c(a = StringSet.name)
    private final String name;
    @c(a = "ngo_id")
    private Integer ngoId;
    @c(a = "name_highlights")
    private List<g> textHighlightList;

    static {
        Covode.recordClassIndex(96448);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.editor.sticker.donation.c.e */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e copy$default(e eVar, Integer num, String str, List list, String str2, List list2, UrlModel urlModel, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = eVar.getNgoId();
        }
        if ((i2 & 2) != 0) {
            str = eVar.getName();
        }
        if ((i2 & 4) != 0) {
            list = eVar.textHighlightList;
        }
        if ((i2 & 8) != 0) {
            str2 = eVar.getDesc();
        }
        if ((i2 & 16) != 0) {
            list2 = eVar.descHighlightList;
        }
        if ((i2 & 32) != 0) {
            urlModel = eVar.getIcon();
        }
        if ((i2 & 64) != 0) {
            str3 = eVar.getDetailUrl();
        }
        if ((i2 & 128) != 0) {
            str4 = eVar.getDonateLink();
        }
        return eVar.copy(num, str, list, str2, list2, urlModel, str3, str4);
    }

    public final Integer component1() {
        return getNgoId();
    }

    public final String component2() {
        return getName();
    }

    public final List<g> component3() {
        return this.textHighlightList;
    }

    public final String component4() {
        return getDesc();
    }

    public final List<g> component5() {
        return this.descHighlightList;
    }

    public final UrlModel component6() {
        return getIcon();
    }

    public final String component7() {
        return getDetailUrl();
    }

    public final String component8() {
        return getDonateLink();
    }

    public final e copy(Integer num, String str, List<g> list, String str2, List<g> list2, UrlModel urlModel, String str3, String str4) {
        return new e(num, str, list, str2, list2, urlModel, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(getNgoId(), eVar.getNgoId()) && l.a(getName(), eVar.getName()) && l.a(this.textHighlightList, eVar.textHighlightList) && l.a(getDesc(), eVar.getDesc()) && l.a(this.descHighlightList, eVar.descHighlightList) && l.a(getIcon(), eVar.getIcon()) && l.a(getDetailUrl(), eVar.getDetailUrl()) && l.a(getDonateLink(), eVar.getDonateLink());
    }

    public final int hashCode() {
        Integer ngoId2 = getNgoId();
        int i2 = 0;
        int hashCode = (ngoId2 != null ? ngoId2.hashCode() : 0) * 31;
        String name2 = getName();
        int hashCode2 = (hashCode + (name2 != null ? name2.hashCode() : 0)) * 31;
        List<g> list = this.textHighlightList;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String desc2 = getDesc();
        int hashCode4 = (hashCode3 + (desc2 != null ? desc2.hashCode() : 0)) * 31;
        List<g> list2 = this.descHighlightList;
        int hashCode5 = (hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        UrlModel icon2 = getIcon();
        int hashCode6 = (hashCode5 + (icon2 != null ? icon2.hashCode() : 0)) * 31;
        String detailUrl2 = getDetailUrl();
        int hashCode7 = (hashCode6 + (detailUrl2 != null ? detailUrl2.hashCode() : 0)) * 31;
        String donateLink2 = getDonateLink();
        if (donateLink2 != null) {
            i2 = donateLink2.hashCode();
        }
        return hashCode7 + i2;
    }

    public final String toString() {
        return "OrganizationSearchResultModel(ngoId=" + getNgoId() + ", name=" + getName() + ", textHighlightList=" + this.textHighlightList + ", desc=" + getDesc() + ", descHighlightList=" + this.descHighlightList + ", icon=" + getIcon() + ", detailUrl=" + getDetailUrl() + ", donateLink=" + getDonateLink() + ")";
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.donation.c.b
    public final String getDesc() {
        return this.desc;
    }

    public final List<g> getDescHighlightList() {
        return this.descHighlightList;
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

    public final List<g> getTextHighlightList() {
        return this.textHighlightList;
    }

    public final void setDescHighlightList(List<g> list) {
        this.descHighlightList = list;
    }

    public final void setNgoId(Integer num) {
        this.ngoId = num;
    }

    public final void setTextHighlightList(List<g> list) {
        this.textHighlightList = list;
    }

    public e(Integer num, String str, List<g> list, String str2, List<g> list2, UrlModel urlModel, String str3, String str4) {
        this.ngoId = num;
        this.name = str;
        this.textHighlightList = list;
        this.desc = str2;
        this.descHighlightList = list2;
        this.icon = urlModel;
        this.detailUrl = str3;
        this.donateLink = str4;
    }
}
