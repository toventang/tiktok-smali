package com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f118703a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(77118);
    }

    public static ClientUploadRouterModel a() {
        try {
            return (ClientUploadRouterModel) SettingsManager.a().a("creative_client_upload_router_setting", ClientUploadRouterModel.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
