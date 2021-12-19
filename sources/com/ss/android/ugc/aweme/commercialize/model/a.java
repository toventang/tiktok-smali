package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class a implements Serializable {
    @c(a = "pure_text")
    private String pureText;
    @c(a = "spliced_texts")
    private List<v> textList;
    @c(a = StringSet.type)
    private int type;

    static {
        Covode.recordClassIndex(46144);
    }

    public a() {
        this(0, null, null, 7, null);
    }

    public static int com_ss_android_ugc_aweme_commercialize_model_AdDisclaimer_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commercialize.model.a */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a copy$default(a aVar, int i2, String str, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = aVar.type;
        }
        if ((i3 & 2) != 0) {
            str = aVar.pureText;
        }
        if ((i3 & 4) != 0) {
            list = aVar.textList;
        }
        return aVar.copy(i2, str, list);
    }

    public final int component1() {
        return this.type;
    }

    public final String component2() {
        return this.pureText;
    }

    public final List<v> component3() {
        return this.textList;
    }

    public final a copy(int i2, String str, List<v> list) {
        l.d(str, "");
        return new a(i2, str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.type == aVar.type && l.a(this.pureText, aVar.pureText) && l.a(this.textList, aVar.textList);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_commercialize_model_AdDisclaimer_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_commercialize_model_AdDisclaimer_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.type) * 31;
        String str = this.pureText;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_commercialize_model_AdDisclaimer_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<v> list = this.textList;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AdDisclaimer(type=" + this.type + ", pureText=" + this.pureText + ", textList=" + this.textList + ")";
    }

    public final String getPureText() {
        return this.pureText;
    }

    public final List<v> getTextList() {
        return this.textList;
    }

    public final int getType() {
        return this.type;
    }

    public final void setTextList(List<v> list) {
        this.textList = list;
    }

    public final void setType(int i2) {
        this.type = i2;
    }

    public final void setPureText(String str) {
        l.d(str, "");
        this.pureText = str;
    }

    public a(int i2, String str, List<v> list) {
        l.d(str, "");
        this.type = i2;
        this.pureText = str;
        this.textList = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i2, String str, List list, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0 : i2, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? null : list);
    }
}
