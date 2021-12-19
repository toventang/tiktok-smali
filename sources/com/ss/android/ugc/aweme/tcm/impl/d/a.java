package com.ss.android.ugc.aweme.tcm.impl.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commerce.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final c f138614a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final a f138615b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(90681);
    }

    public static final c a() {
        try {
            return (c) SettingsManager.a().a("biz_account", c.class, f138614a);
        } catch (Exception unused) {
            return null;
        }
    }
}
