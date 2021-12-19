package com.bytedance.ttnet.diagnosis;

import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class TTGameDiagnosisService {
    public static final String TAG = TTGameDiagnosisService.class.getSimpleName();
    private static volatile TTGameDiagnosisService sInstance = null;
    private volatile boolean mIsMonitoring;
    private IDiagnosisRequest mRequest;

    private TTGameDiagnosisService() {
    }

    public boolean isMonitoring() {
        return this.mIsMonitoring;
    }

    static {
        Covode.recordClassIndex(27276);
    }

    public static TTGameDiagnosisService inst() {
        MethodCollector.i(6841);
        if (sInstance == null) {
            synchronized (TTGameDiagnosisService.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new TTGameDiagnosisService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6841);
                    throw th;
                }
            }
        }
        TTGameDiagnosisService tTGameDiagnosisService = sInstance;
        MethodCollector.o(6841);
        return tTGameDiagnosisService;
    }

    public void monitorEnd() {
        MethodCollector.i(6847);
        synchronized (this) {
            try {
                if (this.mIsMonitoring) {
                    this.mRequest.doExtraCommand("finish", "");
                    this.mIsMonitoring = false;
                    MethodCollector.o(6847);
                }
            } finally {
                MethodCollector.o(6847);
            }
        }
    }

    public void doDiagnosisDuringGaming(String str) {
        MethodCollector.i(6848);
        synchronized (this) {
            try {
                if (this.mIsMonitoring) {
                    this.mRequest.doExtraCommand("diagnosis", str);
                    MethodCollector.o(6848);
                }
            } finally {
                MethodCollector.o(6848);
            }
        }
    }

    public void monitorBegin(String str, String str2) {
        MethodCollector.i(6843);
        synchronized (this) {
            try {
                if (!this.mIsMonitoring) {
                    IDiagnosisRequest createRequest = TTNetDiagnosisService.createRequest(4, str, 0, Integer.MAX_VALUE);
                    this.mRequest = createRequest;
                    createRequest.start(new IDiagnosisCallback() {
                        /* class com.bytedance.ttnet.diagnosis.TTGameDiagnosisService.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(27277);
                        }

                        @Override // com.bytedance.ttnet.diagnosis.IDiagnosisCallback
                        public final void onDiagnosisComplete(String str) {
                            Logger.debug();
                        }
                    });
                    this.mRequest.doExtraCommand("extra_info", str2);
                    this.mIsMonitoring = true;
                    MethodCollector.o(6843);
                }
            } finally {
                MethodCollector.o(6843);
            }
        }
    }
}
