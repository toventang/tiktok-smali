package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import java.util.HashMap;
import java.util.Map;

public final class gg implements AttachUserData {

    /* renamed from: a  reason: collision with root package name */
    public static String f143005a = "";

    /* renamed from: b  reason: collision with root package name */
    public static String f143006b = "";

    static {
        Covode.recordClassIndex(93588);
    }

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        HashMap hashMap = new HashMap();
        hashMap.put("RecylerViewHolder", f143005a + ":" + f143006b);
        return hashMap;
    }
}
