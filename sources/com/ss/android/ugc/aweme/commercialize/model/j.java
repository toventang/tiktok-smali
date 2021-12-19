package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class j implements Serializable {
    @c(a = "entry_type")
    private int entryType;
    @c(a = "gecko_channel")
    private List<String> geckoChannel;
    @c(a = "lynx_scheme")
    private String lynxScheme;

    static {
        Covode.recordClassIndex(46174);
    }

    public j() {
        this(0, null, null, 7, null);
    }

    public static int com_ss_android_ugc_aweme_commercialize_model_AdLynxEntryData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commercialize.model.j */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ j copy$default(j jVar, int i2, String str, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = jVar.entryType;
        }
        if ((i3 & 2) != 0) {
            str = jVar.lynxScheme;
        }
        if ((i3 & 4) != 0) {
            list = jVar.geckoChannel;
        }
        return jVar.copy(i2, str, list);
    }

    public final int component1() {
        return this.entryType;
    }

    public final String component2() {
        return this.lynxScheme;
    }

    public final List<String> component3() {
        return this.geckoChannel;
    }

    public final j copy(int i2, String str, List<String> list) {
        return new j(i2, str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.entryType == jVar.entryType && l.a(this.lynxScheme, jVar.lynxScheme) && l.a(this.geckoChannel, jVar.geckoChannel);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_commercialize_model_AdLynxEntryData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_commercialize_model_AdLynxEntryData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.entryType) * 31;
        String str = this.lynxScheme;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_commercialize_model_AdLynxEntryData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list = this.geckoChannel;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AdLynxEntryData(entryType=" + this.entryType + ", lynxScheme=" + this.lynxScheme + ", geckoChannel=" + this.geckoChannel + ")";
    }

    public final int getEntryType() {
        return this.entryType;
    }

    public final List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public final String getLynxScheme() {
        return this.lynxScheme;
    }

    public final void setEntryType(int i2) {
        this.entryType = i2;
    }

    public final void setGeckoChannel(List<String> list) {
        this.geckoChannel = list;
    }

    public final void setLynxScheme(String str) {
        this.lynxScheme = str;
    }

    public j(int i2, String str, List<String> list) {
        this.entryType = i2;
        this.lynxScheme = str;
        this.geckoChannel = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i2, String str, List list, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0 : i2, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : list);
    }
}
