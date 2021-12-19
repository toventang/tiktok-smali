package com.ss.android.ugc.aweme.tcm.impl.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f138620a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final d f138621b = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(90684);
    }

    public static final c a() {
        try {
            return (c) SettingsManager.a().a("fe_anchor_ad_conf", c.class, f138620a);
        } catch (Throwable unused) {
            return f138620a;
        }
    }
}
