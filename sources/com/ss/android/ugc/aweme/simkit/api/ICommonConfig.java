package com.ss.android.ugc.aweme.simkit.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bitrateselector.a.c;
import com.ss.android.ugc.aweme.simkit.model.b.a;
import com.ss.android.ugc.aweme.simkit.model.b.b;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import com.ss.android.ugc.playerkit.videoview.d.n;
import java.util.List;

public interface ICommonConfig {
    static {
        Covode.recordClassIndex(87304);
    }

    boolean checkIsBytevc1InCache(i iVar);

    c getAutoBitrateSetStrategy();

    int getBitrateBusinessType();

    double getBitrateSwitchThreshold();

    List<n> getColdBootVideoUrlHooks();

    c getCommonParamsProcessor();

    int getDefaultCDNTimeoutTime();

    RateSettingsResponse getDefaultRateSettingsResponse();

    a getForceSuperResolutionListener();

    int getLastNetworkSpeed();

    String getLocalVideoPath(i iVar);

    RateSettingsResponse getRateSettingsResponse();

    d getSuperResolutionStrategy();

    a getSuperResolutionStrategyConfig();

    b getSuperResolutionStrategyConfigV2();

    e getVideoUrlHookHook();

    List<n> getVideoUrlHooks();

    boolean isSkipSelectBitrate(i iVar);

    boolean isUseLastNetworkSpeed();

    boolean onPreGetProperBitrate(i iVar);
}
