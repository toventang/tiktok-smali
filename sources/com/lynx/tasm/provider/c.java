package com.lynx.tasm.provider;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, h> f56810a = new HashMap();

    static {
        Covode.recordClassIndex(35382);
    }

    public final void a(String str, h hVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f56810a.put(str, hVar);
        }
    }
}
