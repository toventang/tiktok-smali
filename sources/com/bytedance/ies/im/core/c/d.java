package com.bytedance.ies.im.core.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.o;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final o f34028a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final d f34029b = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(20264);
    }

    public static o a() {
        try {
            return (o) SettingsManager.a().a("im_config", o.class, f34028a);
        } catch (Throwable unused) {
            return f34028a;
        }
    }
}
