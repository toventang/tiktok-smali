package com.appsflyer.internal.referrer;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.HashMap;

public class MandatoryFields extends HashMap<String, Object> {
    static {
        Covode.recordClassIndex(2760);
    }

    public MandatoryFields() {
        put(StringSet.type, "store");
    }
}
