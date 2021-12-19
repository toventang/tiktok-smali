package com.ss.android.ugc.aweme.sticker.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class f implements Serializable {
    @c(a = "height")
    private final int height;
    @c(a = "uri")
    private final String uri;
    @c(a = "url_list")
    private final List<String> urlList;
    @c(a = "width")
    private final int width;

    static {
        Covode.recordClassIndex(88251);
    }

    public static int com_ss_android_ugc_aweme_sticker_model_EffectAnchorIcon_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.sticker.model.f */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f copy$default(f fVar, int i2, int i3, String str, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = fVar.height;
        }
        if ((i4 & 2) != 0) {
            i3 = fVar.width;
        }
        if ((i4 & 4) != 0) {
            str = fVar.uri;
        }
        if ((i4 & 8) != 0) {
            list = fVar.urlList;
        }
        return fVar.copy(i2, i3, str, list);
    }

    public final int component1() {
        return this.height;
    }

    public final int component2() {
        return this.width;
    }

    public final String component3() {
        return this.uri;
    }

    public final List<String> component4() {
        return this.urlList;
    }

    public final f copy(int i2, int i3, String str, List<String> list) {
        l.d(str, "");
        l.d(list, "");
        return new f(i2, i3, str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.height == fVar.height && this.width == fVar.width && l.a(this.uri, fVar.uri) && l.a(this.urlList, fVar.urlList);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_sticker_model_EffectAnchorIcon_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((com_ss_android_ugc_aweme_sticker_model_EffectAnchorIcon_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.height) * 31) + com_ss_android_ugc_aweme_sticker_model_EffectAnchorIcon_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.width)) * 31;
        String str = this.uri;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_sticker_model_EffectAnchorIcon_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list = this.urlList;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "EffectAnchorIcon(height=" + this.height + ", width=" + this.width + ", uri=" + this.uri + ", urlList=" + this.urlList + ")";
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public final int getWidth() {
        return this.width;
    }

    public f(int i2, int i3, String str, List<String> list) {
        l.d(str, "");
        l.d(list, "");
        this.height = i2;
        this.width = i3;
        this.uri = str;
        this.urlList = list;
    }
}
