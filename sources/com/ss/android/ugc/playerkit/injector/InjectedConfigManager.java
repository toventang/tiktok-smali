package com.ss.android.ugc.playerkit.injector;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InjectedConfigManager {
    private static final Map<String, String> sConfigInterfaceImplementationMap;
    private static final Map<String, Object> sConfigMap = new ConcurrentHashMap();

    public static int com_ss_android_ugc_playerkit_injector_InjectedConfigManager_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private static String getDumpInfo() {
        StringBuffer stringBuffer = new StringBuffer("\n");
        Map<String, String> map = sConfigInterfaceImplementationMap;
        map.entrySet();
        for (String str : map.keySet()) {
            stringBuffer.append(str).append(":").append(sConfigInterfaceImplementationMap.get(str)).append("\n");
        }
        return stringBuffer.toString();
    }

    static {
        Covode.recordClassIndex(97985);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        sConfigInterfaceImplementationMap = concurrentHashMap;
        concurrentHashMap.put("com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig", "com.ss.android.ugc.aweme.video.simpreloader.VideoPreloadManagerConfigImpl");
        concurrentHashMap.put("com.ss.android.ugc.playerkit.simapicommon.reporter.IALog", "com.ss.android.ugc.aweme.video.simcommon.SimALog");
        concurrentHashMap.put("com.ss.android.ugc.aweme.video.config.ISimPlayerConfigInjectWrapper", "com.ss.android.ugc.aweme.simkit.config.SimPlayerConfigInjectWrapper");
        concurrentHashMap.put("com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment", "com.ss.android.ugc.aweme.video.simpreloader.PreloaderExperiment");
        concurrentHashMap.put("com.ss.android.ugc.playerkit.model.PlayerGlobalConfig", "com.ss.android.ugc.aweme.video.simkit.PlayerGlobalConfigImpl");
        concurrentHashMap.put("com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor", "com.ss.android.ugc.aweme.video.simcommon.SimMonitor");
        concurrentHashMap.put("com.ss.android.ugc.playerkit.exp.PlayerSettingService", "com.ss.android.ugc.aweme.video.simplayer.PlayerSettingServiceImpl");
        concurrentHashMap.put("com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig", "com.ss.android.ugc.aweme.video.simkit.SpeedConfigImpl");
        concurrentHashMap.put("com.ss.android.ugc.aweme.simkit.api.ICommonConfig", "com.ss.android.ugc.aweme.video.simkit.SimKitCommonConfig");
        concurrentHashMap.put("com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfigInjectWrapper", "com.ss.android.ugc.aweme.simkit.config.SimPreloadConfigInjectWrapper");
        concurrentHashMap.put("com.ss.android.ugc.aweme.video.config.IPlayerExperiment", "com.ss.android.ugc.aweme.video.simplayer.PlayerExperimentImpl");
        concurrentHashMap.put("com.ss.android.ugc.aweme.simkit.ISimKitConfig", "com.ss.android.ugc.aweme.video.simkit.SimKitConfigImpl");
        concurrentHashMap.put("com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent", "com.ss.android.ugc.aweme.video.simcommon.SimMobEvent");
        concurrentHashMap.put("com.ss.android.ugc.playerkit.simapicommon.IAppConfig", "com.ss.android.ugc.aweme.video.simcommon.SimAppConfig");
        concurrentHashMap.put("com.ss.android.ugc.aweme.video.config.ISimPlayerConfig", "com.ss.android.ugc.aweme.video.simplayer.PlayerConfigImpl");
    }

    public static void onPluginInstall(Collection<String> collection) {
        try {
            Iterator<String> it = collection.iterator();
            while (it.hasNext()) {
                Map<String, String> a2 = ((a) Class.forName(it.next() + ".InjectedConfigInAAB").newInstance()).a();
                if (!(a2 == null || a2.size() == 0)) {
                    sConfigInterfaceImplementationMap.putAll(a2);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static <T> T getConfig(Class<? extends Object> cls) {
        MethodCollector.i(3448);
        Map<String, Object> map = sConfigMap;
        T t = (T) map.get(cls.getName());
        if (t == null) {
            synchronized (InjectedConfigManager.class) {
                try {
                    T t2 = (T) map.get(cls.getName());
                    if (t2 != null) {
                        return t2;
                    }
                    String str = sConfigInterfaceImplementationMap.get(cls.getName());
                    if (str != null) {
                        try {
                            T t3 = (T) Class.forName(str).newInstance();
                            map.put(cls.getName(), t3);
                            MethodCollector.o(3448);
                            return t3;
                        } catch (Exception e2) {
                            com_ss_android_ugc_playerkit_injector_InjectedConfigManager_com_ss_android_ugc_aweme_lancet_LogLancet_e("SimProcessor", "Get service error!!!!", e2);
                            MethodCollector.o(3448);
                            return null;
                        }
                    } else {
                        com_ss_android_ugc_playerkit_injector_InjectedConfigManager_com_ss_android_ugc_aweme_lancet_LogLancet_e("SimProcessor", "", new IllegalArgumentException(cls.getName() + " dosen't have implementation." + getDumpInfo()));
                        MethodCollector.o(3448);
                        return null;
                    }
                } finally {
                    MethodCollector.o(3448);
                }
            }
        } else {
            MethodCollector.o(3448);
            return t;
        }
    }
}
