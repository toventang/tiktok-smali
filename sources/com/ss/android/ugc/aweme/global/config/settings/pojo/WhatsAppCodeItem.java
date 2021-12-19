package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class WhatsAppCodeItem {
    @c(a = "calling_code")
    private String callingCode;
    @c(a = "whatsapp_first")
    private Boolean whatsappFirst;

    static {
        Covode.recordClassIndex(63116);
    }

    public String getCallingCode() {
        String str = this.callingCode;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Boolean getWhatsappFirst() {
        Boolean bool = this.whatsappFirst;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }
}
