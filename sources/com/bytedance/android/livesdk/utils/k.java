package com.bytedance.android.livesdk.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, String> f22332a = new HashMap<>();

    static {
        Covode.recordClassIndex(13189);
    }

    public final k a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f22332a.put(str, str2);
        }
        return this;
    }
}
