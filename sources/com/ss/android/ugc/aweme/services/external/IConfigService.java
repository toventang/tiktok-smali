package com.ss.android.ugc.aweme.services.external;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;

public interface IConfigService {
    public static final Companion Companion = Companion.$$INSTANCE;

    static {
        Covode.recordClassIndex(79629);
    }

    IAVSettingsService avsettingsConfig();

    ICacheService cacheConfig();

    IGeofencingService geoFencingConfig();

    IPrivacyConfig privacyConfig();

    IShortVideoConfig shortVideoConfig();

    void updateServerSettings(IESSettingsProxy iESSettingsProxy);

    void userAction(int i2);

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static {
            Covode.recordClassIndex(79630);
        }
    }
}
