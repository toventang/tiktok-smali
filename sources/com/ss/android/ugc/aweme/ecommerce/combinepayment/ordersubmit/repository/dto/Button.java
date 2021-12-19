package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class Button {
    @c(a = "link")
    private final String link;
    @c(a = StringSet.name)
    private final String name;
    @c(a = "text")
    private final String text;
    @c(a = StringSet.type)
    private final int type;

    static {
        Covode.recordClassIndex(53109);
    }

    public static int com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_repository_dto_Button_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ Button copy$default(Button button, int i2, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = button.type;
        }
        if ((i3 & 2) != 0) {
            str = button.text;
        }
        if ((i3 & 4) != 0) {
            str2 = button.link;
        }
        if ((i3 & 8) != 0) {
            str3 = button.name;
        }
        return button.copy(i2, str, str2, str3);
    }

    public final int component1() {
        return this.type;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.link;
    }

    public final String component4() {
        return this.name;
    }

    public final Button copy(int i2, String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return new Button(i2, str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Button)) {
            return false;
        }
        Button button = (Button) obj;
        return this.type == button.type && l.a(this.text, button.text) && l.a(this.link, button.link) && l.a(this.name, button.name);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_repository_dto_Button_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_repository_dto_Button_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.type) * 31;
        String str = this.text;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_repository_dto_Button_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.link;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.name;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "Button(type=" + this.type + ", text=" + this.text + ", link=" + this.link + ", name=" + this.name + ")";
    }

    public final String getLink() {
        return this.link;
    }

    public final String getName() {
        return this.name;
    }

    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    public Button(int i2, String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.type = i2;
        this.text = str;
        this.link = str2;
        this.name = str3;
    }
}
