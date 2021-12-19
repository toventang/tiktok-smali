package com.ss.android.ugc.aweme.ml.infra.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ml.n;
import com.ss.android.ugc.aweme.ml.infra.MlSdkConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSdkConfig;

public final class b implements n {

    /* renamed from: a  reason: collision with root package name */
    public String f110611a;

    /* renamed from: b  reason: collision with root package name */
    public final SmartSceneConfig f110612b;

    static {
        Covode.recordClassIndex(71009);
    }

    @Override // com.ss.android.ml.n
    public final String d() {
        return "bytenn";
    }

    @Override // com.ss.android.ml.n
    public final String b() {
        String scene;
        SmartSceneConfig smartSceneConfig = this.f110612b;
        if (smartSceneConfig == null || (scene = smartSceneConfig.getScene()) == null) {
            return "default";
        }
        return scene;
    }

    @Override // com.ss.android.ml.n
    public final String a() {
        SmartSdkConfig sdkConfig;
        MlSdkConfig mlSdkConfig;
        String packageUrl;
        SmartSceneConfig smartSceneConfig = this.f110612b;
        if (smartSceneConfig == null || (sdkConfig = smartSceneConfig.getSdkConfig()) == null || (mlSdkConfig = sdkConfig.getMlSdkConfig()) == null || (packageUrl = mlSdkConfig.getPackageUrl()) == null) {
            return "";
        }
        return packageUrl;
    }

    @Override // com.ss.android.ml.n
    public final boolean c() {
        SmartSceneConfig smartSceneConfig = this.f110612b;
        if (smartSceneConfig == null || smartSceneConfig.getDisable() || TextUtils.isEmpty(this.f110611a)) {
            return false;
        }
        return true;
    }

    public b(SmartSceneConfig smartSceneConfig) {
        String str;
        SmartSdkConfig sdkConfig;
        MlSdkConfig mlSdkConfig;
        this.f110612b = smartSceneConfig;
        if (smartSceneConfig == null || (sdkConfig = smartSceneConfig.getSdkConfig()) == null || (mlSdkConfig = sdkConfig.getMlSdkConfig()) == null) {
            str = null;
        } else {
            str = mlSdkConfig.getPackageUrl();
        }
        this.f110611a = str;
    }
}
