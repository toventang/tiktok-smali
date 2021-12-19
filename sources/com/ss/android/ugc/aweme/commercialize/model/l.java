package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import java.io.Serializable;
import java.util.List;

public final class l implements Serializable {
    @c(a = "content")
    private String content;
    @c(a = "gecko_channel")
    private List<String> geckoChannel;
    @c(a = "id")
    private int id;
    @c(a = "schema")
    private String schema;
    @c(a = "show_interval")
    private Integer showInterval;

    static {
        Covode.recordClassIndex(46176);
    }

    public l() {
        this(0, null, null, null, null, 31, null);
    }

    public static int com_ss_android_ugc_aweme_commercialize_model_AdQuestionnaire_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commercialize.model.l */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ l copy$default(l lVar, int i2, String str, Integer num, String str2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = lVar.id;
        }
        if ((i3 & 2) != 0) {
            str = lVar.content;
        }
        if ((i3 & 4) != 0) {
            num = lVar.showInterval;
        }
        if ((i3 & 8) != 0) {
            str2 = lVar.schema;
        }
        if ((i3 & 16) != 0) {
            list = lVar.geckoChannel;
        }
        return lVar.copy(i2, str, num, str2, list);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.content;
    }

    public final Integer component3() {
        return this.showInterval;
    }

    public final String component4() {
        return this.schema;
    }

    public final List<String> component5() {
        return this.geckoChannel;
    }

    public final l copy(int i2, String str, Integer num, String str2, List<String> list) {
        return new l(i2, str, num, str2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.id == lVar.id && h.f.b.l.a(this.content, lVar.content) && h.f.b.l.a(this.showInterval, lVar.showInterval) && h.f.b.l.a(this.schema, lVar.schema) && h.f.b.l.a(this.geckoChannel, lVar.geckoChannel);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_commercialize_model_AdQuestionnaire_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_commercialize_model_AdQuestionnaire_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.id) * 31;
        String str = this.content;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_commercialize_model_AdQuestionnaire_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.showInterval;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.schema;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.geckoChannel;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "AdQuestionnaire(id=" + this.id + ", content=" + this.content + ", showInterval=" + this.showInterval + ", schema=" + this.schema + ", geckoChannel=" + this.geckoChannel + ")";
    }

    public final String getContent() {
        return this.content;
    }

    public final List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public final int getId() {
        return this.id;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final Integer getShowInterval() {
        return this.showInterval;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setGeckoChannel(List<String> list) {
        this.geckoChannel = list;
    }

    public final void setId(int i2) {
        this.id = i2;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setShowInterval(Integer num) {
        this.showInterval = num;
    }

    public l(int i2, String str, Integer num, String str2, List<String> list) {
        this.id = i2;
        this.content = str;
        this.showInterval = num;
        this.schema = str2;
        this.geckoChannel = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i2, String str, Integer num, String str2, List list, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0 : i2, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? null : str2, (i3 & 16) == 0 ? list : null);
    }
}
