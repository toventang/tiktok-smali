package com.ss.android.ad.splash.core.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ad.splash.f.f;
import java.util.List;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public List<b> f58486a;

    /* renamed from: b  reason: collision with root package name */
    public List<b> f58487b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, b> f58488c;

    /* renamed from: d  reason: collision with root package name */
    public List<b> f58489d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f58490e;

    static {
        Covode.recordClassIndex(36291);
    }

    public static boolean a(List<b> list) {
        if (!f.b(list) || TextUtils.isEmpty(list.get(0).E)) {
            return false;
        }
        return true;
    }
}
