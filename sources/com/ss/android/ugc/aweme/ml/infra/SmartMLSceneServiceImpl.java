package com.ss.android.ugc.aweme.ml.infra;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.a.d;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;
import com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService;
import com.ss.android.ugc.aweme.ml.infra.SmartDataCenterApiService;
import com.ss.android.ugc.aweme.ml.infra.a.f;
import com.ss.android.ugc.aweme.ml.infra.a.g;
import h.i.c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class SmartMLSceneServiceImpl extends SmartMLSceneService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f110589a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private Map<String, i> f110590b = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(70990);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(70991);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static ISmartMLSceneService a() {
        MethodCollector.i(6174);
        Object a2 = com.ss.android.ugc.b.a(ISmartMLSceneService.class, false);
        if (a2 != null) {
            ISmartMLSceneService iSmartMLSceneService = (ISmartMLSceneService) a2;
            MethodCollector.o(6174);
            return iSmartMLSceneService;
        }
        if (com.ss.android.ugc.b.cM == null) {
            synchronized (ISmartMLSceneService.class) {
                try {
                    if (com.ss.android.ugc.b.cM == null) {
                        com.ss.android.ugc.b.cM = new SmartMLSceneServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6174);
                    throw th;
                }
            }
        }
        SmartMLSceneService smartMLSceneService = (SmartMLSceneService) com.ss.android.ugc.b.cM;
        MethodCollector.o(6174);
        return smartMLSceneService;
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SmartMLSceneServiceImpl f110591a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f110592b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f110593c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h f110594d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f110595e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ SmartSceneConfig f110596f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f110597g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b f110598h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f110599i;

        static {
            Covode.recordClassIndex(70992);
        }

        b(SmartMLSceneServiceImpl smartMLSceneServiceImpl, i iVar, f fVar, h hVar, e eVar, SmartSceneConfig smartSceneConfig, String str, b bVar, long j2) {
            this.f110591a = smartMLSceneServiceImpl;
            this.f110592b = iVar;
            this.f110593c = fVar;
            this.f110594d = hVar;
            this.f110595e = eVar;
            this.f110596f = smartSceneConfig;
            this.f110597g = str;
            this.f110598h = bVar;
            this.f110599i = j2;
        }

        public final void run() {
            try {
                final j a2 = this.f110592b.a();
                SmartMLSceneServiceImpl.a(this.f110592b);
                if (!this.f110593c.a()) {
                    this.f110592b.f110636d++;
                    this.f110592b.f110634b = false;
                    SmartMLSceneServiceImpl.a(false, -2, null, this.f110595e, this.f110592b);
                    return;
                }
                if (this.f110596f.getTrack() != null && SmartDataTrackerService.b.f110381a.enable(this.f110597g)) {
                    SmartDataTrackerService.b.f110381a.onScenePredictCheckOrRun(this.f110597g, this.f110594d, this.f110598h);
                }
                if (a2 != null) {
                    if (a2.f110646a) {
                        a2.f110652g.f110659a = System.currentTimeMillis();
                        a2.f110647b++;
                    }
                    if (a2.f110646a) {
                        a2.f110653h.f110659a = System.currentTimeMillis();
                    }
                }
                SmartSceneConfig smartSceneConfig = this.f110596f;
                h hVar = this.f110594d;
                b bVar = this.f110598h;
                if (SmartMLSceneService.debug) {
                    System.currentTimeMillis();
                }
                g gVar = new g();
                if (smartSceneConfig.getFeatures() != null) {
                    HashMap hashMap = new HashMap();
                    SmartDataCenterApiService.b.f110585a.fillInputFeatures(hashMap, smartSceneConfig.getFeatures(), hVar);
                    gVar.a().putAll(hashMap);
                }
                if (hVar != null) {
                    Map<String, ? extends Object> map = hVar.f110628a;
                    if (map != null) {
                        gVar.a().putAll(map);
                    }
                    float[] fArr = hVar.f110629b;
                    if (fArr != null) {
                        gVar.f110621b = fArr;
                    }
                    byte[] bArr = hVar.f110630c;
                    if (bArr != null) {
                        gVar.f110622c = bArr;
                    }
                }
                if (bVar != null) {
                    gVar.a();
                }
                if (SmartMLSceneService.debug) {
                    System.currentTimeMillis();
                    smartSceneConfig.getScene();
                }
                if (a2 != null && a2.f110646a) {
                    a2.f110653h.f110660b = System.currentTimeMillis();
                }
                this.f110593c.a(gVar, new com.ss.android.ugc.aweme.ml.infra.a.a(this) {
                    /* class com.ss.android.ugc.aweme.ml.infra.SmartMLSceneServiceImpl.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f110600a;

                    static {
                        Covode.recordClassIndex(70993);
                    }

                    {
                        this.f110600a = r1;
                    }

                    @Override // com.ss.android.ugc.aweme.ml.infra.a.a
                    public final void a(boolean z, int i2, k kVar) {
                        Aweme aweme;
                        j jVar = a2;
                        if (jVar != null) {
                            h hVar = this.f110600a.f110594d;
                            if (hVar == null || (aweme = hVar.f110631d) == null || aweme.getAid() == null) {
                                String.valueOf(this.f110600a.f110592b.f110635c);
                            }
                            f fVar = this.f110600a.f110593c;
                            if (jVar.f110646a) {
                                jVar.f110652g.f110660b = System.currentTimeMillis();
                                jVar.f110654i = i2;
                                if (!jVar.f110649d) {
                                    jVar.f110649d = true;
                                    if (c.Default.nextFloat() < com.ss.android.ugc.aweme.ml.ab.f.f110365b) {
                                        r.a("ml_scene_init", jVar.a(fVar));
                                    }
                                }
                                if (c.Default.nextFloat() < com.ss.android.ugc.aweme.ml.ab.f.f110366c) {
                                    JSONObject a2 = jVar.a(kVar, fVar);
                                    c cVar = jVar.f110650e;
                                    if (cVar == null || !cVar.a(a2)) {
                                        r.a("ml_scene_run", a2);
                                    }
                                }
                            }
                        }
                        SmartMLSceneServiceImpl.a(z, i2, kVar, this.f110600a.f110595e, this.f110600a.f110592b);
                        this.f110600a.f110592b.f110634b = false;
                        if (!z) {
                            this.f110600a.f110592b.f110637e++;
                        }
                        if (SmartMLSceneService.debug) {
                            System.currentTimeMillis();
                        }
                    }
                });
            } catch (Throwable unused) {
                this.f110592b.f110634b = false;
                SmartMLSceneServiceImpl.a(false, -6, null, this.f110595e, this.f110592b);
            }
        }
    }

    public static void a(i iVar) {
        if (!iVar.f110638f) {
            j a2 = iVar.a();
            if (a2 != null) {
                a2.a();
            }
            f fVar = iVar.f110633a;
            if (fVar != null) {
                fVar.c();
            }
            if (a2 != null) {
                a2.b();
            }
            iVar.f110638f = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final boolean enable(String str) {
        i iVar;
        f fVar;
        if (str == null || str.length() == 0 || (iVar = this.f110590b.get(str)) == null || (fVar = iVar.f110633a) == null || !fVar.d()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final void ensureEnvAvailable(String str) {
        i iVar;
        if (str != null && str.length() != 0 && (iVar = this.f110590b.get(str)) != null) {
            a(iVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final int lastRunErrorCode(String str) {
        i iVar;
        if (str == null || str.length() == 0 || (iVar = this.f110590b.get(str)) == null) {
            return -100;
        }
        return iVar.f110640h;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final k lastSuccessRunResult(String str) {
        i iVar;
        if (str == null || str.length() == 0 || (iVar = this.f110590b.get(str)) == null) {
            return null;
        }
        return iVar.f110641i;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final void setReportRunMonitorInterceptor(String str, c cVar) {
        i iVar;
        j a2;
        if (str != null && str.length() != 0 && (iVar = this.f110590b.get(str)) != null && (a2 = iVar.a()) != null) {
            a2.f110650e = cVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final void configSceneModel(String str, SmartSceneConfig smartSceneConfig) {
        if (str == null || str.length() == 0 || smartSceneConfig == null || !TextUtils.equals(str, smartSceneConfig.getScene())) {
            if (SmartMLSceneService.debug) {
                new Throwable("params invalid, scene:".concat(String.valueOf(str)));
            }
        } else if (!this.f110590b.containsKey(str)) {
            this.f110590b.put(str, new i(str, smartSceneConfig));
            SmartDataCenterApiService.b.f110585a.addSceneModelConfig(smartSceneConfig.getFeatures());
            OneSmartDataTrackConfig track = smartSceneConfig.getTrack();
            if (track != null) {
                SmartDataTrackerService.b.f110381a.configOneNewTrack(track);
            }
            i iVar = this.f110590b.get(str);
            if (iVar != null) {
                iVar.a();
            }
        } else if (SmartMLSceneService.debug) {
            new Throwable("scene repeated, scene:".concat(String.valueOf(str)));
        }
    }

    public static void a(boolean z, int i2, k kVar, e eVar, i iVar) {
        if (iVar != null) {
            if (!z || kVar == null) {
                iVar.f110637e++;
            } else {
                iVar.f110641i = kVar;
                iVar.f110637e = 0;
            }
            iVar.f110639g = z;
            iVar.f110640h = i2;
            iVar.f110635c++;
        }
        if (eVar != null) {
            eVar.a(z, kVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final void runDelay(String str, long j2, h hVar, b bVar, e eVar) {
        long j3;
        if (str == null || str.length() == 0) {
            a(false, -1, null, eVar, null);
            return;
        }
        i iVar = this.f110590b.get(str);
        if (iVar != null) {
            f fVar = iVar.f110633a;
            SmartSceneConfig smartSceneConfig = iVar.f110643k;
            if (!(fVar == null || smartSceneConfig == null)) {
                if (!fVar.b()) {
                    iVar.f110636d++;
                    a(false, -2, null, eVar, iVar);
                    return;
                } else if (iVar.f110637e > 16) {
                    iVar.f110635c++;
                    if (iVar.f110639g) {
                        if (eVar != null) {
                            eVar.a(iVar.f110639g, iVar.f110641i);
                            return;
                        }
                        return;
                    } else if (eVar != null) {
                        eVar.a(iVar.f110639g, null);
                        return;
                    } else {
                        return;
                    }
                } else {
                    iVar.f110634b = true;
                    if (SmartMLSceneService.debug) {
                        j3 = System.currentTimeMillis();
                    } else {
                        j3 = 0;
                    }
                    d.a(new b(this, iVar, fVar, hVar, eVar, smartSceneConfig, str, bVar, j3), j2);
                    return;
                }
            }
        }
        a(false, -1, null, eVar, iVar);
    }
}
