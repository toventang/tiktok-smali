package com.ss.android.ugc.aweme.badge;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.io.Serializable;

public final class h extends e implements Serializable {
    @c(a = "description")
    private final String description;
    @c(a = "id")
    private final Long id;
    @c(a = StringSet.name)
    private final String name;
    @c(a = "should_show")
    private final Boolean shouldShow;
    @c(a = "url")
    private final String url;

    static {
        Covode.recordClassIndex(41816);
    }

    public static /* synthetic */ h copy$default(h hVar, Long l2, String str, String str2, String str3, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l2 = hVar.getId();
        }
        if ((i2 & 2) != 0) {
            str = hVar.getName();
        }
        if ((i2 & 4) != 0) {
            str2 = hVar.getDescription();
        }
        if ((i2 & 8) != 0) {
            str3 = hVar.getUrl();
        }
        if ((i2 & 16) != 0) {
            bool = hVar.getShouldShow();
        }
        return hVar.copy(l2, str, str2, str3, bool);
    }

    public final Long component1() {
        return getId();
    }

    public final String component2() {
        return getName();
    }

    public final String component3() {
        return getDescription();
    }

    public final String component4() {
        return getUrl();
    }

    public final Boolean component5() {
        return getShouldShow();
    }

    public final h copy(Long l2, String str, String str2, String str3, Boolean bool) {
        return new h(l2, str, str2, str3, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(getId(), eVar.getId()) && l.a(getName(), eVar.getName()) && l.a(getDescription(), eVar.getDescription()) && l.a(getUrl(), eVar.getUrl()) && l.a(getShouldShow(), eVar.getShouldShow());
    }

    public final int hashCode() {
        Long id2 = getId();
        int i2 = 0;
        int hashCode = (id2 != null ? id2.hashCode() : 0) * 31;
        String name2 = getName();
        int hashCode2 = (hashCode + (name2 != null ? name2.hashCode() : 0)) * 31;
        String description2 = getDescription();
        int hashCode3 = (hashCode2 + (description2 != null ? description2.hashCode() : 0)) * 31;
        String url2 = getUrl();
        int hashCode4 = (hashCode3 + (url2 != null ? url2.hashCode() : 0)) * 31;
        Boolean shouldShow2 = getShouldShow();
        if (shouldShow2 != null) {
            i2 = shouldShow2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "EditProfileBadgeModel(id=" + getId() + ", name=" + getName() + ", description=" + getDescription() + ", url=" + getUrl() + ", shouldShow=" + getShouldShow() + ")";
    }

    @Override // com.ss.android.ugc.aweme.badge.e
    public final String getDescription() {
        return this.description;
    }

    @Override // com.ss.android.ugc.aweme.badge.e
    public final Long getId() {
        return this.id;
    }

    @Override // com.ss.android.ugc.aweme.badge.e
    public final String getName() {
        return this.name;
    }

    @Override // com.ss.android.ugc.aweme.badge.e
    public final Boolean getShouldShow() {
        return this.shouldShow;
    }

    @Override // com.ss.android.ugc.aweme.badge.e
    public final String getUrl() {
        return this.url;
    }

    public h(Long l2, String str, String str2, String str3, Boolean bool) {
        this.id = l2;
        this.name = str;
        this.description = str2;
        this.url = str3;
        this.shouldShow = bool;
    }
}
