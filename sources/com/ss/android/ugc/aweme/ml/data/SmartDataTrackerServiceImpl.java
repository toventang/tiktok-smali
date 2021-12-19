package com.ss.android.ugc.aweme.ml.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;
import com.ss.android.ugc.aweme.ml.ab.SmartDataTrackConfig;
import com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartDataCenterApiService;
import com.ss.android.ugc.aweme.ml.infra.h;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class SmartDataTrackerServiceImpl extends SmartDataTrackerService implements com.ss.android.ugc.aweme.ml.api.b {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, a> f110433a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private boolean f110434b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f110435c;

    static {
        Covode.recordClassIndex(70907);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f110436a;

        /* renamed from: b  reason: collision with root package name */
        public final LinkedList<b> f110437b = new LinkedList<>();

        /* renamed from: c  reason: collision with root package name */
        public final int f110438c = 16;

        /* renamed from: d  reason: collision with root package name */
        public String f110439d;

        /* renamed from: e  reason: collision with root package name */
        public OneSmartDataTrackConfig f110440e;

        static {
            Covode.recordClassIndex(70908);
        }

        public final String toString() {
            return "(scene='" + this.f110439d + "', runCount:" + this.f110436a + " config:" + this.f110440e + ')';
        }

        public a(String str, OneSmartDataTrackConfig oneSmartDataTrackConfig) {
            l.d(str, "");
            l.d(oneSmartDataTrackConfig, "");
            this.f110439d = str;
            this.f110440e = oneSmartDataTrackConfig;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public String f110441a;

        /* renamed from: b  reason: collision with root package name */
        public JSONObject f110442b;

        /* renamed from: c  reason: collision with root package name */
        public int f110443c;

        static {
            Covode.recordClassIndex(70909);
        }

        public final String toString() {
            return "(key:" + this.f110441a + ", waitNextRealCnt=" + this.f110443c + ", jsonData=" + this.f110442b + ')';
        }

        public b(String str, JSONObject jSONObject, int i2) {
            this.f110441a = str;
            this.f110443c = i2;
            this.f110442b = jSONObject;
        }
    }

    public static ISmartDataTrackerService a() {
        MethodCollector.i(6938);
        Object a2 = com.ss.android.ugc.b.a(ISmartDataTrackerService.class, false);
        if (a2 != null) {
            ISmartDataTrackerService iSmartDataTrackerService = (ISmartDataTrackerService) a2;
            MethodCollector.o(6938);
            return iSmartDataTrackerService;
        }
        if (com.ss.android.ugc.b.cC == null) {
            synchronized (ISmartDataTrackerService.class) {
                try {
                    if (com.ss.android.ugc.b.cC == null) {
                        com.ss.android.ugc.b.cC = new SmartDataTrackerServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6938);
                    throw th;
                }
            }
        }
        SmartDataTrackerService smartDataTrackerService = (SmartDataTrackerService) com.ss.android.ugc.b.cC;
        MethodCollector.o(6938);
        return smartDataTrackerService;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public final void checkAndInit() {
        List<OneSmartDataTrackConfig> configList;
        if (!this.f110434b) {
            this.f110434b = true;
            if (SmartDataTrackerService.debug) {
                System.currentTimeMillis();
            }
            if (!com.ss.android.ugc.aweme.ml.ab.a.f110350b) {
                com.ss.android.ugc.aweme.ml.ab.a.f110351c = (SmartDataTrackConfig) com.bytedance.ies.abmock.b.a().a(true, "smart_data_track_config_v2", SmartDataTrackConfig.class, com.ss.android.ugc.aweme.ml.ab.a.f110349a);
                com.ss.android.ugc.aweme.ml.ab.a.f110350b = true;
            }
            SmartDataTrackConfig smartDataTrackConfig = com.ss.android.ugc.aweme.ml.ab.a.f110351c;
            if (!(smartDataTrackConfig == null || (configList = smartDataTrackConfig.getConfigList()) == null)) {
                for (OneSmartDataTrackConfig oneSmartDataTrackConfig : configList) {
                    configOneNewTrack(oneSmartDataTrackConfig);
                }
            }
            if (SmartDataTrackerService.debug) {
                System.currentTimeMillis();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SmartDataTrackerServiceImpl f110444a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f110445b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InputFeaturesConfig f110446c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ml.infra.b f110447d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f110448e;

        static {
            Covode.recordClassIndex(70910);
        }

        c(SmartDataTrackerServiceImpl smartDataTrackerServiceImpl, h hVar, InputFeaturesConfig inputFeaturesConfig, com.ss.android.ugc.aweme.ml.infra.b bVar, a aVar) {
            this.f110444a = smartDataTrackerServiceImpl;
            this.f110445b = hVar;
            this.f110446c = inputFeaturesConfig;
            this.f110447d = bVar;
            this.f110448e = aVar;
        }

        public final void run() {
            String str;
            Map<String, ? extends Object> map;
            String str2;
            Aweme aweme;
            try {
                h hVar = this.f110445b;
                String str3 = "";
                if (hVar == null || (aweme = hVar.f110631d) == null || (str = aweme.getAid()) == null) {
                    str = str3;
                }
                h hVar2 = this.f110445b;
                if (!(hVar2 == null || (str2 = hVar2.f110632e) == null)) {
                    str3 = str2;
                }
                HashMap hashMap = new HashMap(128);
                SmartDataCenterApiService.b.f110585a.fillInputFeatures(hashMap, this.f110446c, this.f110445b);
                h hVar3 = this.f110445b;
                if (hVar3 != null) {
                    map = hVar3.f110628a;
                } else {
                    map = null;
                }
                SmartDataTrackerServiceImpl.a(hashMap, map);
                if (this.f110447d != null) {
                    SmartDataTrackerServiceImpl.a(hashMap, new HashMap());
                }
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject(hashMap);
                jSONObject.put("scene", this.f110448e.f110439d);
                jSONObject.put("track_type", this.f110448e.f110440e.getTrackType());
                jSONObject.put("enter_type", str3);
                jSONObject.put("run_key", str);
                jSONObject.put("predict", jSONObject2.toString());
                jSONObject.put("run_count", this.f110448e.f110436a);
                if (this.f110448e.f110437b.size() > this.f110448e.f110438c) {
                    this.f110448e.f110437b.removeFirst();
                }
                this.f110448e.f110437b.addLast(new b(str, jSONObject, this.f110448e.f110440e.getNextRealCnt()));
                if (SmartDataTrackerService.debug) {
                    this.f110448e.f110440e.getTrackType();
                    this.f110448e.f110437b.size();
                    hashMap.size();
                }
            } catch (Throwable unused) {
            }
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SmartDataTrackerServiceImpl f110449a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f110450b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InputFeaturesConfig f110451c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h f110452d;

        static {
            Covode.recordClassIndex(70911);
        }

        d(SmartDataTrackerServiceImpl smartDataTrackerServiceImpl, a aVar, InputFeaturesConfig inputFeaturesConfig, h hVar) {
            this.f110449a = smartDataTrackerServiceImpl;
            this.f110450b = aVar;
            this.f110451c = inputFeaturesConfig;
            this.f110452d = hVar;
        }

        public final void run() {
            Map<String, ? extends Object> map;
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<b> it = this.f110450b.f110437b.iterator();
                while (it.hasNext()) {
                    b next = it.next();
                    next.f110443c--;
                    if (next.f110443c <= 0) {
                        arrayList.add(next);
                    }
                }
                if (!arrayList.isEmpty()) {
                    HashMap hashMap = new HashMap(128);
                    SmartDataCenterApiService.b.f110585a.fillInputFeatures(hashMap, this.f110451c, this.f110452d);
                    h hVar = this.f110452d;
                    if (hVar != null) {
                        map = hVar.f110628a;
                    } else {
                        map = null;
                    }
                    SmartDataTrackerServiceImpl.a(hashMap, map);
                    JSONObject jSONObject = new JSONObject(hashMap);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        JSONObject jSONObject2 = ((b) it2.next()).f110442b;
                        if (jSONObject2 != null) {
                            jSONObject2.put("real", jSONObject.toString());
                            r.a("ml_track_data_rpt", jSONObject2);
                        }
                    }
                    this.f110450b.f110437b.removeAll(arrayList);
                    if (SmartDataTrackerService.debug) {
                        this.f110450b.f110440e.getTrackType();
                        this.f110450b.f110437b.size();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public final boolean enable(String str) {
        if (str == null || !this.f110433a.containsKey(str)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public final void configOneNewTrack(OneSmartDataTrackConfig oneSmartDataTrackConfig) {
        String scene;
        if (oneSmartDataTrackConfig != null && (scene = oneSmartDataTrackConfig.getScene()) != null && !this.f110433a.containsKey(scene)) {
            this.f110433a.put(scene, new a(scene, oneSmartDataTrackConfig));
            SmartDataCenterApiService.b.f110585a.addSceneModelConfig(oneSmartDataTrackConfig.getPredict());
            SmartDataCenterApiService.b.f110585a.addSceneModelConfig(oneSmartDataTrackConfig.getReal());
            if (!this.f110435c) {
                this.f110435c = true;
                MLCommonService.b.f110377a.addCommonEventListener("play_prepare", this);
                MLCommonService.b.f110377a.addCommonEventListener("play_first_frame", this);
                MLCommonService.b.f110377a.addCommonEventListener("play_call_playtime", this);
            }
        }
    }

    public static void a(Map<String, Object> map, Map<String, ? extends Object> map2) {
        if (map2 != null) {
            for (Map.Entry<String, ? extends Object> entry : map2.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    if (value instanceof Number) {
                        map.put(entry.getKey(), value);
                    } else if (value instanceof String) {
                        map.put(entry.getKey(), value);
                    } else if ((value instanceof float[]) && ((float[]) value).length < 16) {
                        map.put(entry.getKey(), value);
                    } else if ((value instanceof double[]) && ((double[]) value).length < 16) {
                        map.put(entry.getKey(), value);
                    } else if ((value instanceof int[]) && ((int[]) value).length < 16) {
                        map.put(entry.getKey(), value);
                    } else if ((value instanceof long[]) && ((long[]) value).length < 16) {
                        map.put(entry.getKey(), value);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.b
    public final void a(String str, com.ss.android.ugc.aweme.ml.api.a aVar) {
        User author;
        l.d(str, "");
        if (SmartDataTrackerService.debug) {
            if (aVar != null) {
                Aweme aweme = aVar.f110396d;
                if (aweme != null) {
                    aweme.getAid();
                }
                Aweme aweme2 = aVar.f110396d;
                if (!(aweme2 == null || (author = aweme2.getAuthor()) == null)) {
                    author.getNickname();
                }
            } else {
                return;
            }
        } else if (aVar == null) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1704536429) {
            if (hashCode != 1168529143) {
                if (hashCode == 1274399484 && str.equals("play_prepare")) {
                    for (Map.Entry<String, a> entry : this.f110433a.entrySet()) {
                        OneSmartDataTrackConfig oneSmartDataTrackConfig = entry.getValue().f110440e;
                        String key = entry.getKey();
                        if (oneSmartDataTrackConfig.getTrackType() == 100) {
                            h hVar = new h();
                            hVar.f110631d = aVar.f110396d;
                            hVar.f110632e = aVar.f110397e;
                            onScenePredictCheckOrRun(key, hVar, null);
                        }
                    }
                }
            } else if (str.equals("play_call_playtime")) {
                for (Map.Entry<String, a> entry2 : this.f110433a.entrySet()) {
                    OneSmartDataTrackConfig oneSmartDataTrackConfig2 = entry2.getValue().f110440e;
                    String key2 = entry2.getKey();
                    h hVar2 = new h();
                    hVar2.f110631d = aVar.f110396d;
                    hVar2.f110632e = aVar.f110397e;
                    if (oneSmartDataTrackConfig2.getTrackType() == 101) {
                        onScenePredictCheckOrRun(key2, hVar2, null);
                    }
                    if (key2 != null) {
                        try {
                            a aVar2 = this.f110433a.get(key2);
                            if (aVar2 != null) {
                                OneSmartDataTrackConfig oneSmartDataTrackConfig3 = aVar2.f110440e;
                                InputFeaturesConfig real = oneSmartDataTrackConfig3 != null ? oneSmartDataTrackConfig3.getReal() : null;
                                LinkedList<b> linkedList = aVar2.f110437b;
                                if (linkedList != null) {
                                    if (!linkedList.isEmpty()) {
                                        if (real != null) {
                                            com.ss.android.ugc.aweme.ml.a.d.a(new d(this, aVar2, real, hVar2));
                                        }
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        } else if (str.equals("play_first_frame")) {
            for (Map.Entry<String, a> entry3 : this.f110433a.entrySet()) {
                OneSmartDataTrackConfig oneSmartDataTrackConfig4 = entry3.getValue().f110440e;
                String key3 = entry3.getKey();
                if (oneSmartDataTrackConfig4.getTrackType() == 102) {
                    h hVar3 = new h();
                    hVar3.f110631d = aVar.f110396d;
                    hVar3.f110632e = aVar.f110397e;
                    onScenePredictCheckOrRun(key3, hVar3, null);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public final void onScenePredictCheckOrRun(String str, h hVar, com.ss.android.ugc.aweme.ml.infra.b bVar) {
        if (hVar != null && str != null) {
            try {
                a aVar = this.f110433a.get(str);
                if (aVar != null) {
                    aVar.f110436a++;
                    if (h.i.c.Default.nextFloat() < aVar.f110440e.getReportRate()) {
                        OneSmartDataTrackConfig oneSmartDataTrackConfig = aVar.f110440e;
                        if (oneSmartDataTrackConfig != null) {
                            InputFeaturesConfig predict = oneSmartDataTrackConfig.getPredict();
                            if (predict != null) {
                                com.ss.android.ugc.aweme.ml.a.d.a(new c(this, hVar, predict, bVar, aVar));
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
