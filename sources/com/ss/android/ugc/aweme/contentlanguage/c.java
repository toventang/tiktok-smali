package com.ss.android.ugc.aweme.contentlanguage;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f78160a = 5;

    /* renamed from: b  reason: collision with root package name */
    public static final c f78161b = new c();

    private c() {
    }

    public static final int a() {
        try {
            return SettingsManager.a().a("content_lang_limit", 5);
        } catch (Throwable unused) {
            return 5;
        }
    }

    static {
        Covode.recordClassIndex(48464);
    }
}
