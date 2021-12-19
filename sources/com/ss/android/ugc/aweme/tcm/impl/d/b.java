package com.ss.android.ugc.aweme.tcm.impl.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final BrandedContentToolSchema f138616a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final b f138617b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(90682);
    }

    public static final BrandedContentToolSchema a() {
        try {
            return (BrandedContentToolSchema) SettingsManager.a().a("branded_content_tool_schema", BrandedContentToolSchema.class, f138616a);
        } catch (Exception unused) {
            return null;
        }
    }
}
