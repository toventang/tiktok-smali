package com.ss.android.ugc.aweme.video.config;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public IPlayerExperiment f143367a;

    /* renamed from: b  reason: collision with root package name */
    public ISimPlayerConfig f143368b;

    static {
        Covode.recordClassIndex(93825);
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.video.config.a$a  reason: collision with other inner class name */
    public static class C3820a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f143369a = new a((byte) 0);

        static {
            Covode.recordClassIndex(93826);
        }
    }

    public final IPlayerExperiment b() {
        IPlayerExperiment iPlayerExperiment = this.f143367a;
        if (iPlayerExperiment == null) {
            return (IPlayerExperiment) InjectedConfigManager.getConfig(IPlayerExperiment.class);
        }
        return iPlayerExperiment;
    }

    public final ISimPlayerConfig a() {
        ISimPlayerConfig iSimPlayerConfig = this.f143368b;
        if (iSimPlayerConfig != null) {
            return iSimPlayerConfig;
        }
        return ((ISimPlayerConfigInjectWrapper) InjectedConfigManager.getConfig(ISimPlayerConfigInjectWrapper.class)).wrap((ISimPlayerConfig) InjectedConfigManager.getConfig(ISimPlayerConfig.class));
    }

    /* synthetic */ a(byte b2) {
        this();
    }
}
