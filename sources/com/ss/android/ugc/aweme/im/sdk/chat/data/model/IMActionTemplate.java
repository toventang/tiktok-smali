package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.g;
import h.f.b.l;

public final class IMActionTemplate {
    @c(a = "action")
    private Integer action;
    @c(a = "key")
    private Integer key;
    @c(a = "link")
    private String link;
    @c(a = StringSet.name)
    private String name;

    static {
        Covode.recordClassIndex(64043);
    }

    public IMActionTemplate() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ IMActionTemplate copy$default(IMActionTemplate iMActionTemplate, Integer num, Integer num2, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = iMActionTemplate.key;
        }
        if ((i2 & 2) != 0) {
            num2 = iMActionTemplate.action;
        }
        if ((i2 & 4) != 0) {
            str = iMActionTemplate.name;
        }
        if ((i2 & 8) != 0) {
            str2 = iMActionTemplate.link;
        }
        return iMActionTemplate.copy(num, num2, str, str2);
    }

    public final Integer component1() {
        return this.key;
    }

    public final Integer component2() {
        return this.action;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.link;
    }

    public final IMActionTemplate copy(Integer num, Integer num2, String str, String str2) {
        return new IMActionTemplate(num, num2, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMActionTemplate)) {
            return false;
        }
        IMActionTemplate iMActionTemplate = (IMActionTemplate) obj;
        return l.a(this.key, iMActionTemplate.key) && l.a(this.action, iMActionTemplate.action) && l.a(this.name, iMActionTemplate.name) && l.a(this.link, iMActionTemplate.link);
    }

    public final int hashCode() {
        Integer num = this.key;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.action;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.link;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "IMActionTemplate(key=" + this.key + ", action=" + this.action + ", name=" + this.name + ", link=" + this.link + ")";
    }

    public final Integer getAction() {
        return this.action;
    }

    public final Integer getKey() {
        return this.key;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getName() {
        return this.name;
    }

    public final void setAction(Integer num) {
        this.action = num;
    }

    public final void setKey(Integer num) {
        this.key = num;
    }

    public final void setLink(String str) {
        this.link = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public IMActionTemplate(Integer num, Integer num2, String str, String str2) {
        this.key = num;
        this.action = num2;
        this.name = str;
        this.link = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IMActionTemplate(Integer num, Integer num2, String str, String str2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : num2, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2);
    }
}
