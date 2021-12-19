package com.ss.android.ugc.aweme.services.performance;

import com.bytedance.covode.number.Covode;

public interface ICrashReportService {
    public static final Companion Companion = Companion.$$INSTANCE;

    static {
        Covode.recordClassIndex(79751);
    }

    void addCrashEffectIdInfoListener(ICrashEffectIdInfoListener iCrashEffectIdInfoListener);

    void report(int i2);

    void setEffectIdInfo(String str, String str2);

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static {
            Covode.recordClassIndex(79752);
        }
    }
}
