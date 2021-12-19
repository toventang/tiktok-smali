package com.bytedance.helios.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.config.AbstractSettingsModel;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final HeliosSettingsModel f31020a = new HeliosSettingsModel();

    /* renamed from: b  reason: collision with root package name */
    public static final a f31021b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(18015);
    }

    public static final AbstractSettingsModel a() {
        HeliosSettingsModel heliosSettingsModel = (HeliosSettingsModel) SettingsManager.a().a("helios_settings", HeliosSettingsModel.class, f31020a);
        if (heliosSettingsModel == null) {
            try {
                heliosSettingsModel = (HeliosSettingsModel) SettingsManager.a().a("helios_settings", HeliosSettingsModel.class);
            } catch (Exception unused) {
            }
            if (heliosSettingsModel == null) {
                return f31020a;
            }
        }
        return heliosSettingsModel;
    }
}
