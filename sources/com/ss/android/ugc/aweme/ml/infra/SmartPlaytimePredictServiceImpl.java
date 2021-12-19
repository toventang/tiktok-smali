package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig;
import com.ss.android.ugc.aweme.ml.ab.SmartPlaytimePredictConfig;
import com.ss.android.ugc.aweme.ml.ab.SmartPlaytimePredictExperiment;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.ml.api.a;
import com.ss.android.ugc.aweme.ml.api.b;
import com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class SmartPlaytimePredictServiceImpl extends SmartPlaytimePredictService implements b {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, l> f110604a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private boolean f110605b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f110606c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f110607d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f110608e;

    static {
        Covode.recordClassIndex(70998);
    }

    public static ISmartPlaytimePredictService a() {
        MethodCollector.i(7598);
        Object a2 = com.ss.android.ugc.b.a(ISmartPlaytimePredictService.class, false);
        if (a2 != null) {
            ISmartPlaytimePredictService iSmartPlaytimePredictService = (ISmartPlaytimePredictService) a2;
            MethodCollector.o(7598);
            return iSmartPlaytimePredictService;
        }
        if (com.ss.android.ugc.b.cN == null) {
            synchronized (ISmartPlaytimePredictService.class) {
                try {
                    if (com.ss.android.ugc.b.cN == null) {
                        com.ss.android.ugc.b.cN = new SmartPlaytimePredictServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7598);
                    throw th;
                }
            }
        }
        SmartPlaytimePredictService smartPlaytimePredictService = (SmartPlaytimePredictService) com.ss.android.ugc.b.cN;
        MethodCollector.o(7598);
        return smartPlaytimePredictService;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final void checkAndInit() {
        List<OnePlaytimePredictConfig> serviceList;
        if (!this.f110605b) {
            this.f110605b = true;
            SmartPlaytimePredictConfig playtimePredictServiceConfig = SmartPlaytimePredictExperiment.INSTANCE.getPlaytimePredictServiceConfig();
            if (!(playtimePredictServiceConfig == null || (serviceList = playtimePredictServiceConfig.getServiceList()) == null || serviceList.isEmpty())) {
                for (OnePlaytimePredictConfig onePlaytimePredictConfig : serviceList) {
                    configOneNewService(onePlaytimePredictConfig);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final boolean enable(String str) {
        if (str == null || str.length() == 0 || !this.f110604a.containsKey(str)) {
            return false;
        }
        return SmartMLSceneService.b.f110587a.enable(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final void ensureEnvAvailable(String str) {
        if (str != null && str.length() != 0 && this.f110604a.containsKey(str)) {
            SmartMLSceneService.b.f110587a.ensureEnvAvailable(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final void configOneNewService(OnePlaytimePredictConfig onePlaytimePredictConfig) {
        SmartSceneConfig sceneConfig;
        String scene;
        String str;
        if (onePlaytimePredictConfig != null && (sceneConfig = onePlaytimePredictConfig.getSceneConfig()) != null && (scene = sceneConfig.getScene()) != null && !this.f110604a.containsKey(scene)) {
            SmartMLSceneService.b.f110587a.configSceneModel(scene, onePlaytimePredictConfig.getSceneConfig());
            l lVar = new l(scene, onePlaytimePredictConfig);
            this.f110604a.put(scene, lVar);
            if (!this.f110606c && onePlaytimePredictConfig.getTrigger() == 2) {
                this.f110606c = true;
                MLCommonService.b.f110377a.addCommonEventListener("play_call_playtime", this);
            } else if (!this.f110607d && onePlaytimePredictConfig.getTrigger() == 1) {
                this.f110607d = true;
                MLCommonService.b.f110377a.addCommonEventListener("play_first_frame", this);
            }
            if (onePlaytimePredictConfig.getRealConfig() != null) {
                this.f110608e = true;
                if (!this.f110606c) {
                    this.f110606c = true;
                    MLCommonService.b.f110377a.addCommonEventListener("play_call_playtime", this);
                }
                ISmartMLSceneService iSmartMLSceneService = SmartMLSceneService.b.f110587a;
                SmartSceneConfig sceneConfig2 = onePlaytimePredictConfig.getSceneConfig();
                if (sceneConfig2 != null) {
                    str = sceneConfig2.getScene();
                } else {
                    str = null;
                }
                iSmartMLSceneService.setReportRunMonitorInterceptor(str, lVar);
            }
        }
    }

    private void a(String str, Aweme aweme) {
        h hVar = new h();
        hVar.f110631d = aweme;
        predict(str, hVar, null, null);
    }

    private static void a(String str, e eVar) {
        k lastSuccessRunResult = SmartMLSceneService.b.f110587a.lastSuccessRunResult(str);
        if (lastSuccessRunResult == null) {
            SmartMLSceneService.b.f110587a.lastRunErrorCode(str);
            if (eVar != null) {
                eVar.a(false, null);
            }
        } else if (eVar != null) {
            eVar.a(true, lastSuccessRunResult);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.b
    public final void a(String str, a aVar) {
        l.d(str, "");
        int hashCode = str.hashCode();
        if (hashCode != -1704536429) {
            if (hashCode == 1168529143 && str.equals("play_call_playtime")) {
                for (Map.Entry<String, l> entry : this.f110604a.entrySet()) {
                    if (entry.getValue().f110670g.getTrigger() == 2) {
                        a(entry.getKey(), aVar != null ? aVar.f110396d : null);
                    }
                }
                if (this.f110608e && aVar != null) {
                    Aweme aweme = aVar.f110396d;
                    long j2 = aVar.f110393a;
                    if (aweme != null) {
                        l.d(aweme, "");
                        if (!g.f110623c.isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            Iterator<g> it = g.f110623c.iterator();
                            while (it.hasNext()) {
                                g next = it.next();
                                if (next.a(aweme, j2)) {
                                    r.a("ml_scene_run", next.f110625a);
                                    arrayList.add(next);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                g.f110623c.removeAll(arrayList);
                            }
                        }
                    }
                }
            }
        } else if (str.equals("play_first_frame")) {
            for (Map.Entry<String, l> entry2 : this.f110604a.entrySet()) {
                if (entry2.getValue().f110670g.getTrigger() == 1) {
                    a(entry2.getKey(), aVar != null ? aVar.f110396d : null);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final void predict(String str, h hVar, b bVar, e eVar) {
        if (str != null && str.length() != 0 && this.f110604a.containsKey(str)) {
            l lVar = this.f110604a.get(str);
            if (lVar == null) {
                if (eVar != null) {
                    eVar.a(false, null);
                }
            } else if (f.f34637l) {
                a(str, eVar);
            } else if (lVar.f110670g.getSkipCount() <= 0 || lVar.f110664a >= lVar.f110670g.getSkipCount()) {
                if (lVar.f110670g.getRunTimeGap() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - lVar.f110666c < ((long) lVar.f110670g.getRunTimeGap())) {
                        a(str, eVar);
                        return;
                    }
                    lVar.f110666c = currentTimeMillis;
                }
                if (lVar.f110670g.getRunFeedGap() > 0) {
                    if (lVar.f110667d < lVar.f110670g.getRunFeedGap()) {
                        lVar.f110667d++;
                        a(str, eVar);
                        return;
                    }
                    lVar.f110667d = 0;
                }
                lVar.f110668e++;
                SmartMLSceneService.b.f110587a.runDelay(str, (long) lVar.f110670g.getRunDelay(), hVar, bVar, eVar);
            } else {
                lVar.f110664a++;
                a(str, eVar);
            }
        } else if (eVar != null) {
            eVar.a(false, null);
        }
    }
}
