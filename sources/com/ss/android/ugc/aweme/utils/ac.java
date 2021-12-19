package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import java.util.HashMap;
import java.util.Map;

public final class ac implements AttachUserData {

    /* renamed from: a  reason: collision with root package name */
    public static String f142621a = "";

    static {
        Covode.recordClassIndex(93297);
    }

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        HashMap hashMap = new HashMap();
        hashMap.put("BaseCanvasRecycleCrashDataImpl", f142621a);
        return hashMap;
    }
}
