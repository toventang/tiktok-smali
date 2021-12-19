package com.bytedance.x.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class a implements Serializable, Cloneable {
    @c(a = "javaScriptResource")
    public String javascriptResource;
    @c(a = "vendorKey")
    public String vender;
    @c(a = "verificationParameters")
    public String verificationParameters;

    static {
        Covode.recordClassIndex(28204);
    }

    public final boolean valid() {
        String str = this.javascriptResource;
        if (str == null || str.isEmpty()) {
            return false;
        }
        return true;
    }
}
