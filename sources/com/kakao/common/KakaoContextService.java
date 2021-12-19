package com.kakao.common;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.common.IConfiguration;

public class KakaoContextService {
    private static KakaoContextService instance;
    private IConfiguration configuration;
    private PhaseInfo phaseInfo;

    static {
        Covode.recordClassIndex(34347);
    }

    private KakaoContextService() {
    }

    public IConfiguration getAppConfiguration() {
        return this.configuration;
    }

    public PhaseInfo phaseInfo() {
        return this.phaseInfo;
    }

    public static synchronized KakaoContextService getInstance() {
        KakaoContextService kakaoContextService;
        synchronized (KakaoContextService.class) {
            MethodCollector.i(11324);
            if (instance == null) {
                instance = new KakaoContextService();
            }
            kakaoContextService = instance;
            MethodCollector.o(11324);
        }
        return kakaoContextService;
    }

    public void setPhaseInfo(PhaseInfo phaseInfo2) {
        if (phaseInfo2 != null) {
            this.phaseInfo = phaseInfo2;
        }
    }

    public synchronized void initialize(Context context) {
        MethodCollector.i(11002);
        if (this.configuration == null) {
            this.configuration = IConfiguration.Factory.createConfiguration(context);
        }
        if (this.phaseInfo == null) {
            this.phaseInfo = new DefaultPhaseInfo(context);
        }
        MethodCollector.o(11002);
    }

    public KakaoContextService(IConfiguration iConfiguration, PhaseInfo phaseInfo2) {
        this.configuration = iConfiguration;
        this.phaseInfo = phaseInfo2;
    }

    public synchronized void initialize(Context context, PhaseInfo phaseInfo2) {
        MethodCollector.i(11168);
        if (this.configuration == null) {
            this.configuration = IConfiguration.Factory.createConfiguration(context);
        }
        this.phaseInfo = phaseInfo2;
        MethodCollector.o(11168);
    }
}
