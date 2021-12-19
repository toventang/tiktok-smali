package com.ss.android.ugc.aweme.ml.data;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ml.d;
import com.ss.android.ugc.aweme.ml.api.IMLDataCenterService;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import com.ss.android.ugc.aweme.ml.api.b;
import com.ss.android.ugc.aweme.ml.data.b;
import com.ss.android.ugc.aweme.ml.data.c;
import com.ss.android.ugc.aweme.ml.data.d;
import com.ss.android.ugc.aweme.ml.data.e;
import com.ss.android.ugc.aweme.ml.data.f;
import com.ss.android.ugc.aweme.ml.data.g;
import com.ss.android.ugc.aweme.ml.infra.FeatureFeedTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.FeaturePlayTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.FeatureTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.FeatureUserTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import java.util.List;
import org.json.JSONObject;

public final class MLDataCenterServiceImpl extends MLDataCenterService implements b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f110427a;

    /* renamed from: b  reason: collision with root package name */
    private final f f110428b = f.b.f110484a;

    /* renamed from: c  reason: collision with root package name */
    private final d f110429c = d.b.f110469a;

    /* renamed from: d  reason: collision with root package name */
    private final g f110430d = g.b.f110500a;

    /* renamed from: e  reason: collision with root package name */
    private final e f110431e = e.b.f110475a;

    /* renamed from: f  reason: collision with root package name */
    private final c f110432f = c.b.f110465a;

    static {
        Covode.recordClassIndex(70906);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final d.a getFeatureStaticGetter() {
        return this.f110432f;
    }

    public static IMLDataCenterService a() {
        MethodCollector.i(4393);
        Object a2 = com.ss.android.ugc.b.a(IMLDataCenterService.class, false);
        if (a2 != null) {
            IMLDataCenterService iMLDataCenterService = (IMLDataCenterService) a2;
            MethodCollector.o(4393);
            return iMLDataCenterService;
        }
        if (com.ss.android.ugc.b.cB == null) {
            synchronized (IMLDataCenterService.class) {
                try {
                    if (com.ss.android.ugc.b.cB == null) {
                        com.ss.android.ugc.b.cB = new MLDataCenterServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4393);
                    throw th;
                }
            }
        }
        MLDataCenterService mLDataCenterService = (MLDataCenterService) com.ss.android.ugc.b.cB;
        MethodCollector.o(4393);
        return mLDataCenterService;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final void checkAndInit() {
        if (!this.f110427a) {
            this.f110427a = true;
            if (MLDataCenterService.debug) {
                System.currentTimeMillis();
            }
            b.f110458d.addAll(b.f110455a);
            b.f110458d.addAll(e.f110472e);
            MLCommonService.b.f110377a.addCommonEventListener("play_prepare", this);
            MLCommonService.b.f110377a.addCommonEventListener("play_call_playtime", this);
            if (MLDataCenterService.debug) {
                System.currentTimeMillis();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final void addSceneModelConfig(InputFeaturesConfig inputFeaturesConfig) {
        if (inputFeaturesConfig != null) {
            FeaturePlayTypeConfig fTypePlay = inputFeaturesConfig.getFTypePlay();
            if (fTypePlay != null && fTypePlay.getEnable()) {
                this.f110428b.f110454a = true;
                b.f110457c = true;
                f fVar = this.f110428b;
                FeaturePlayTypeConfig fTypePlay2 = inputFeaturesConfig.getFTypePlay();
                if (fTypePlay2 != null && fTypePlay2.getEnable()) {
                    if (!TextUtils.isEmpty(fTypePlay2.getFeedRangeType())) {
                        fVar.f110482f = true;
                    }
                    if (fTypePlay2.containFeedRangeType("current")) {
                        fVar.f110483g = true;
                    }
                }
            }
            FeatureFeedTypeConfig fTypeFeed = inputFeaturesConfig.getFTypeFeed();
            if (fTypeFeed != null && fTypeFeed.getEnable()) {
                this.f110429c.f110454a = true;
            }
            FeatureUserTypeConfig fTypeUser = inputFeaturesConfig.getFTypeUser();
            if (fTypeUser != null && fTypeUser.getEnable()) {
                this.f110430d.f110454a = true;
                b.f110457c = true;
            }
            FeatureTypeConfig fTypeGAction = inputFeaturesConfig.getFTypeGAction();
            if (fTypeGAction != null && fTypeGAction.getEnable()) {
                this.f110431e.f110454a = true;
                b.f110457c = true;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final void traceMobClickEvent(String str, JSONObject jSONObject) {
        if (b.f110457c && str != null && str.length() != 0 && jSONObject != null && b.f110458d.contains(str)) {
            com.ss.android.ugc.aweme.ml.a.d.a(new b.a(str, jSONObject));
            if (b.f110456b) {
                jSONObject.opt("group_id");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00de, code lost:
        if (r3 != null) goto L_0x00bd;
     */
    @Override // com.ss.android.ugc.aweme.ml.api.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r10, com.ss.android.ugc.aweme.ml.api.a r11) {
        /*
        // Method dump skipped, instructions count: 227
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ml.data.MLDataCenterServiceImpl.a(java.lang.String, com.ss.android.ugc.aweme.ml.api.a):void");
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    public final com.ss.android.ugc.aweme.ml.b.c getFeedTrackRangeInfo(String str, int i2, boolean z) {
        List<com.ss.android.ugc.aweme.ml.b.b> a2 = this.f110428b.a(str, i2, z);
        if (a2 == null) {
            return null;
        }
        com.ss.android.ugc.aweme.ml.b.c cVar = new com.ss.android.ugc.aweme.ml.b.c();
        for (com.ss.android.ugc.aweme.ml.b.b bVar : a2) {
            if (bVar != null) {
                cVar.f110412a += bVar.f110399a.get();
                cVar.f110413b += bVar.f110400b.get();
                cVar.f110414c += bVar.f110401c.get();
                cVar.f110415d += bVar.f110402d.get();
                cVar.f110416e.add(0, Long.valueOf(bVar.f110406h.get()));
            }
        }
        return cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x05a6  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x05b5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0322  */
    @Override // com.ss.android.ugc.aweme.ml.api.IMLDataCenterService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean fillInputFeatures(java.util.Map<java.lang.String, java.lang.Object> r28, com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig r29, com.ss.android.ugc.aweme.ml.infra.h r30) {
        /*
        // Method dump skipped, instructions count: 1529
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ml.data.MLDataCenterServiceImpl.fillInputFeatures(java.util.Map, com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig, com.ss.android.ugc.aweme.ml.infra.h):boolean");
    }
}
