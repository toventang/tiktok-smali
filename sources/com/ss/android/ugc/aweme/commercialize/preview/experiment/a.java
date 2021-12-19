package com.ss.android.ugc.aweme.commercialize.preview.experiment;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final PreviewConfiguration f75029a = new PreviewConfiguration(LiveNetAdaptiveHurryTimeSetting.DEFAULT, 20);

    /* renamed from: b  reason: collision with root package name */
    public static final a f75030b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(46254);
    }

    public static PreviewConfiguration a() {
        try {
            SettingsManager a2 = SettingsManager.a();
            PreviewConfiguration previewConfiguration = f75029a;
            PreviewConfiguration previewConfiguration2 = (PreviewConfiguration) a2.a("ads_preview_configuration", PreviewConfiguration.class, previewConfiguration);
            return previewConfiguration2 == null ? previewConfiguration : previewConfiguration2;
        } catch (Throwable unused) {
            return f75029a;
        }
    }
}
