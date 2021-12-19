package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.t;
import com.ss.android.ugc.aweme.ml.infra.a.c;
import com.ss.android.ugc.aweme.ml.infra.a.d;
import com.ss.android.ugc.aweme.ml.infra.a.f;
import h.f.b.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public f f110633a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f110634b;

    /* renamed from: c  reason: collision with root package name */
    public int f110635c;

    /* renamed from: d  reason: collision with root package name */
    public int f110636d;

    /* renamed from: e  reason: collision with root package name */
    public int f110637e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f110638f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f110639g;

    /* renamed from: h  reason: collision with root package name */
    public int f110640h = -100;

    /* renamed from: i  reason: collision with root package name */
    public k f110641i;

    /* renamed from: j  reason: collision with root package name */
    public String f110642j;

    /* renamed from: k  reason: collision with root package name */
    public SmartSceneConfig f110643k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f110644l;

    /* renamed from: m  reason: collision with root package name */
    private j f110645m;

    static {
        Covode.recordClassIndex(71023);
    }

    public final j a() {
        MlSdkConfig mlSdkConfig;
        String packageUrl;
        PitayaConfig pitayaConfig;
        String businessName;
        if (!this.f110644l) {
            this.f110644l = true;
            if (com.ss.android.ugc.aweme.ml.ab.f.a(this.f110642j)) {
                String str = this.f110642j;
                j jVar = j.q.get(str);
                if (jVar == null) {
                    jVar = new j(str);
                    jVar.f110646a = com.ss.android.ugc.aweme.ml.ab.f.a(str);
                    j.q.put(str, jVar);
                }
                this.f110645m = jVar;
                SmartSceneConfig smartSceneConfig = this.f110643k;
                if (smartSceneConfig != null) {
                    SmartSdkConfig sdkConfig = smartSceneConfig.getSdkConfig();
                    if (!(sdkConfig == null || (pitayaConfig = sdkConfig.getPitayaConfig()) == null || (businessName = pitayaConfig.getBusinessName()) == null)) {
                        jVar.f110648c = businessName;
                    }
                    SmartSdkConfig sdkConfig2 = smartSceneConfig.getSdkConfig();
                    if (!(sdkConfig2 == null || (mlSdkConfig = sdkConfig2.getMlSdkConfig()) == null || (packageUrl = mlSdkConfig.getPackageUrl()) == null)) {
                        String a2 = t.a(packageUrl);
                        l.b(a2, "");
                        jVar.f110648c = a2;
                    }
                }
            }
        }
        return this.f110645m;
    }

    public final String toString() {
        return "(scene='" + this.f110642j + "', isRunning=" + this.f110634b + ", env:" + this.f110638f + ", envNotReadyTimes=" + this.f110636d + ", runFailTimes=" + this.f110637e + ", runCount=" + this.f110635c + ", success=" + this.f110639g + ", errorCode=" + this.f110640h + ", lastSuccessResult=" + this.f110641i + ", config=" + this.f110643k + ", runner=" + this.f110633a + ')';
    }

    public i(String str, SmartSceneConfig smartSceneConfig) {
        SmartSdkConfig sdkConfig;
        l.d(str, "");
        l.d(smartSceneConfig, "");
        this.f110642j = str;
        this.f110643k = smartSceneConfig;
        l.d(smartSceneConfig, "");
        String str2 = smartSceneConfig.outType;
        f fVar = null;
        if (!(smartSceneConfig.getDisable() || smartSceneConfig.getSdkConfig() == null || str2 == null || (sdkConfig = smartSceneConfig.getSdkConfig()) == null || sdkConfig.getMlSdkConfig() == null)) {
            int hashCode = str2.hashCode();
            if (hashCode != 692443780) {
                if (hashCode == 1421312065 && str2.equals("regression")) {
                    fVar = new d(smartSceneConfig);
                }
            } else if (str2.equals("classify")) {
                fVar = new c(smartSceneConfig);
            }
        }
        this.f110633a = fVar;
    }
}
