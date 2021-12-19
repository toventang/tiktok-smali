package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class JsonStubWillConvertToString {
    @c(a = "jsonobj_convert_string")
    private String jsonobjConvertString;

    static {
        Covode.recordClassIndex(63052);
    }

    public String getJsonobjConvertString() {
        String str = this.jsonobjConvertString;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
