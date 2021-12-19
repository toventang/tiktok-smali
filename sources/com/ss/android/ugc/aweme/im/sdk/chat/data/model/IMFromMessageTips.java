package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class IMFromMessageTips {
    @c(a = "template")
    private List<IMActionTemplate> template;
    @c(a = "tips")
    private String tips;

    static {
        Covode.recordClassIndex(64044);
    }

    public IMFromMessageTips() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMFromMessageTips */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IMFromMessageTips copy$default(IMFromMessageTips iMFromMessageTips, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = iMFromMessageTips.tips;
        }
        if ((i2 & 2) != 0) {
            list = iMFromMessageTips.template;
        }
        return iMFromMessageTips.copy(str, list);
    }

    public final String component1() {
        return this.tips;
    }

    public final List<IMActionTemplate> component2() {
        return this.template;
    }

    public final IMFromMessageTips copy(String str, List<IMActionTemplate> list) {
        return new IMFromMessageTips(str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMFromMessageTips)) {
            return false;
        }
        IMFromMessageTips iMFromMessageTips = (IMFromMessageTips) obj;
        return l.a(this.tips, iMFromMessageTips.tips) && l.a(this.template, iMFromMessageTips.template);
    }

    public final int hashCode() {
        String str = this.tips;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<IMActionTemplate> list = this.template;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "IMFromMessageTips(tips=" + this.tips + ", template=" + this.template + ")";
    }

    public final List<IMActionTemplate> getTemplate() {
        return this.template;
    }

    public final String getTips() {
        return this.tips;
    }

    public final void setTemplate(List<IMActionTemplate> list) {
        this.template = list;
    }

    public final void setTips(String str) {
        this.tips = str;
    }

    public IMFromMessageTips(String str, List<IMActionTemplate> list) {
        this.tips = str;
        this.template = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IMFromMessageTips(String str, List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : list);
    }
}
