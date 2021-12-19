package com.ss.android.ugc.aweme.video.simkit;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.simkit.config.c.a;
import com.ss.android.ugc.aweme.speedpredictor.api.c;
import com.ss.android.ugc.aweme.speedpredictor.api.d;
import com.ss.android.ugc.aweme.video.preload.b.b;

public class SpeedConfigImpl extends a {
    private final d.a algorithmType;
    private final int calculatorType;
    private final com.ss.android.ugc.aweme.speedpredictor.api.a intelligentAlgoConfig = new b();

    static {
        Covode.recordClassIndex(94099);
    }

    public static int com_ss_android_ugc_aweme_video_simkit_SpeedConfigImpl_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig, com.ss.android.ugc.aweme.simkit.config.c.a
    public int getCalculatorType() {
        return this.calculatorType;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig, com.ss.android.ugc.aweme.simkit.config.c.a
    public com.ss.android.ugc.aweme.speedpredictor.api.a getIntelligentAlgoConfig() {
        return this.intelligentAlgoConfig;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig, com.ss.android.ugc.aweme.simkit.config.c.a
    public d.a getSpeedAlgorithmType() {
        return this.algorithmType;
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig, com.ss.android.ugc.aweme.simkit.config.c.a
    public int getSpeedQueueSize() {
        return com.bytedance.ies.abmock.b.a().a(true, "video_speed_queue_size", 10);
    }

    public SpeedConfigImpl() {
        d.a aVar;
        int i2;
        if (com.ss.android.ugc.aweme.ml.a.f110295a.f110296b == null) {
            aVar = d.a.DEFAULT;
        } else {
            aVar = d.a.INTELLIGENT;
        }
        this.algorithmType = aVar;
        int i3 = 1;
        if (com.bytedance.ies.abmock.b.a().a(true, "speed_monitor_sink", 0) != 1) {
            com_ss_android_ugc_aweme_video_simkit_SpeedConfigImpl_com_ss_android_ugc_aweme_lancet_LogLancet_d("wbp-test-speed", "Modular planSelect: [sdk], algorithm: [" + aVar + "].");
            i2 = 1;
        } else {
            i2 = 2;
            com_ss_android_ugc_aweme_video_simkit_SpeedConfigImpl_com_ss_android_ugc_aweme_lancet_LogLancet_d("wbp-test-speed", "Modular planSelect: [cloud], algorithm: [" + aVar + "].");
        }
        if (c.a(i2) != null || i2 == 1) {
            i3 = i2;
        } else if (com.ss.android.ugc.playerkit.simapicommon.a.a().isDebug()) {
            throw new RuntimeException("no runtime cloud type speed predict module");
        }
        this.calculatorType = i3;
    }
}
