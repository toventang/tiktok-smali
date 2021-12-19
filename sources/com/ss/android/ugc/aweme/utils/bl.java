package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.ss.android.ugc.aweme.u.a;
import java.util.HashMap;
import java.util.Map;

public final class bl implements AttachUserData {
    static {
        Covode.recordClassIndex(93343);
    }

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        HashMap hashMap = new HashMap();
        hashMap.put("abtest/settings", a.a());
        return hashMap;
    }
}
