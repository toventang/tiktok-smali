package com.ss.android.ugc.aweme.simkit;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig;
import com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;
import com.ss.android.ugc.aweme.video.config.IPlayerExperiment;
import com.ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.playerkit.exp.PlayerSettingService;
import com.ss.android.ugc.playerkit.model.PlayerGlobalConfig;
import com.ss.android.ugc.playerkit.simapicommon.IAppConfig;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;

public interface ISimKitConfig {
    static {
        Covode.recordClassIndex(87299);
    }

    PlayerSettingService PlayerSettingService();

    IALog getALog();

    IAppConfig getAppConfig();

    ICommonConfig getCommonConfig();

    IDimensionBitrateCurveConfig getDimensionBitrateCurveConfig();

    IDimensionBitrateFilterConfig getDimensionBitrateFilterConfig();

    IEvent getEvent();

    IMonitor getMonitor();

    PlayerGlobalConfig getPlayerGlobalConfig();

    IPreloaderExperiment getPreloaderExperiment();

    ISimPlayerConfig getSimPlayerConfig();

    IPlayerExperiment getSimPlayerExperiment();

    ISimReporterConfig getSimReporterConfig();

    ISpeedCalculatorConfig getSpeedCalculatorConfig();

    IVideoPreloadConfig getVideoPreloaderManagerConfig();
}
