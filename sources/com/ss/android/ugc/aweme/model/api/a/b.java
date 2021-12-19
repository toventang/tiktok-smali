package com.ss.android.ugc.aweme.model.api.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class b implements Serializable {
    @c(a = "animated_gifs")
    private List<a> animationList;
    @c(a = "background_color")
    private String background_color;
    @c(a = "features")
    private List<c> features;
    @c(a = "navi_id")
    private String navi_id;
    @c(a = "staticImage")
    private List<g> staticImage;
    @c(a = "user_id")
    private String user_id;

    static {
        Covode.recordClassIndex(71037);
    }

    public b() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.model.api.a.b */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b copy$default(b bVar, String str, String str2, String str3, List list, List list2, List list3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bVar.navi_id;
        }
        if ((i2 & 2) != 0) {
            str2 = bVar.user_id;
        }
        if ((i2 & 4) != 0) {
            str3 = bVar.background_color;
        }
        if ((i2 & 8) != 0) {
            list = bVar.animationList;
        }
        if ((i2 & 16) != 0) {
            list2 = bVar.features;
        }
        if ((i2 & 32) != 0) {
            list3 = bVar.staticImage;
        }
        return bVar.copy(str, str2, str3, list, list2, list3);
    }

    public final String component1() {
        return this.navi_id;
    }

    public final String component2() {
        return this.user_id;
    }

    public final String component3() {
        return this.background_color;
    }

    public final List<a> component4() {
        return this.animationList;
    }

    public final List<c> component5() {
        return this.features;
    }

    public final List<g> component6() {
        return this.staticImage;
    }

    public final b copy(String str, String str2, String str3, List<a> list, List<c> list2, List<g> list3) {
        l.d(str3, "");
        return new b(str, str2, str3, list, list2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.navi_id, bVar.navi_id) && l.a(this.user_id, bVar.user_id) && l.a(this.background_color, bVar.background_color) && l.a(this.animationList, bVar.animationList) && l.a(this.features, bVar.features) && l.a(this.staticImage, bVar.staticImage);
    }

    public final int hashCode() {
        String str = this.navi_id;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.user_id;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.background_color;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<a> list = this.animationList;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        List<c> list2 = this.features;
        int hashCode5 = (hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<g> list3 = this.staticImage;
        if (list3 != null) {
            i2 = list3.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "ProfileNaviDataModel(navi_id=" + this.navi_id + ", user_id=" + this.user_id + ", background_color=" + this.background_color + ", animationList=" + this.animationList + ", features=" + this.features + ", staticImage=" + this.staticImage + ")";
    }

    public final List<a> getAnimationList() {
        return this.animationList;
    }

    public final String getBackground_color() {
        return this.background_color;
    }

    public final List<c> getFeatures() {
        return this.features;
    }

    public final String getNavi_id() {
        return this.navi_id;
    }

    public final List<g> getStaticImage() {
        return this.staticImage;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final void setAnimationList(List<a> list) {
        this.animationList = list;
    }

    public final void setFeatures(List<c> list) {
        this.features = list;
    }

    public final void setNavi_id(String str) {
        this.navi_id = str;
    }

    public final void setStaticImage(List<g> list) {
        this.staticImage = list;
    }

    public final void setUser_id(String str) {
        this.user_id = str;
    }

    public final void setBackground_color(String str) {
        l.d(str, "");
        this.background_color = str;
    }

    public b(String str, String str2, String str3, List<a> list, List<c> list2, List<g> list3) {
        l.d(str3, "");
        this.navi_id = str;
        this.user_id = str2;
        this.background_color = str3;
        this.animationList = list;
        this.features = list2;
        this.staticImage = list3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, String str2, String str3, List list, List list2, List list3, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? "#A5E6FF" : str3, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : list2, (i2 & 32) == 0 ? list3 : null);
    }
}
