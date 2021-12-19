package com.ss.android.ugc.aweme.statistic;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import java.util.HashMap;
import java.util.Map;

public final class a implements AttachUserData {

    /* renamed from: a  reason: collision with root package name */
    public static String f134683a = "";

    /* renamed from: b  reason: collision with root package name */
    public static int f134684b;

    static {
        Covode.recordClassIndex(88014);
    }

    public final String toString() {
        return f134684b + " bytes| thread name =" + f134683a;
    }

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        HashMap hashMap = new HashMap();
        hashMap.put("fresco-bitmap-alloc", toString());
        return hashMap;
    }
}
