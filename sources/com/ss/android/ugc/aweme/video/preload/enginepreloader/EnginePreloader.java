package com.ss.android.ugc.aweme.video.preload.enginepreloader;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.player.sdk.a.o;
import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.ss.android.ugc.aweme.video.preload.PreloadSessionManager;
import com.ss.android.ugc.aweme.video.preload.api.k;
import com.ss.android.ugc.aweme.video.preload.f;
import com.ss.android.ugc.aweme.video.preload.g;
import com.ss.android.ugc.aweme.video.preload.i;
import com.ss.android.ugc.aweme.video.preload.k;
import com.ss.android.ugc.aweme.video.preload.l;
import com.ss.android.ugc.aweme.video.preload.m;
import com.ss.android.ugc.aweme.video.preload.n;
import com.ss.android.ugc.playerkit.exp.b;
import com.ss.android.ugc.playerkit.model.u;
import com.ss.android.ugc.playerkit.model.v;
import com.ss.android.ugc.playerkit.model.x;
import com.ss.mediakit.medialoader.AVMDLCopyOperation;
import com.ss.mediakit.medialoader.AVMDLCopyOperationListener;
import com.ss.mediakit.medialoader.LoaderEventInfo;
import com.ss.mediakit.medialoader.LoaderListener;
import com.ss.ttvideoengine.aj;
import com.ss.ttvideoengine.d;
import com.ss.ttvideoengine.j.e;
import com.ss.ttvideoengine.j.p;
import com.ss.ttvideoengine.n.b.h;
import com.ss.ttvideoengine.n.c.c;
import com.ss.ttvideoengine.r;
import com.ss.ttvideoengine.s.j;
import com.ss.ttvideoengine.w;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class EnginePreloader implements g {
    private static int n = -1;
    private static final String o = i.a.MediaLoader.getCacheDirName();
    private Map<String, String> A;
    private c B = new c() {
        /* class com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.AnonymousClass2 */

        static {
            Covode.recordClassIndex(93996);
        }

        @Override // com.ss.ttvideoengine.n.c.c
        public final void a(e eVar, Map<String, String> map, int i2, Object obj) {
            if (eVar != null) {
                String b2 = eVar.b(2);
                if (!TextUtils.isEmpty(b2) && i2 == 2) {
                    com.ss.android.ugc.aweme.player.sdk.b.e a2 = o.a(map, EnginePreloader.this.f143659k.get(b2));
                    new StringBuilder("preload onAfterSelect videoModel ").append(eVar).append(" sourceId ").append(b2).append(" params ").append(map).append(" wrapper ").append(a2).append(" selectType ").append(i2).append(" userData ").append(obj);
                    if (a2 != null) {
                        EnginePreloader.this.f143660l.getBitrateSelectListener().b(2, i2, a2);
                        EnginePreloader.this.f143660l.getBitrateSelectListener().a(2, i2, a2.f115343i);
                        map.put("video_bitrarte_user_selected", String.valueOf(a2.f115343i.f115348a));
                    }
                    PreloadSessionManager.PreloadSession b3 = PreloadSessionManager.f143503a.b(b2);
                    String str = map.get("speed");
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            b3.speed = Integer.parseInt(str);
                        } catch (Throwable unused) {
                        }
                    }
                    int i3 = 0;
                    String str2 = map.get("video_bitrarte");
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            i3 = Integer.parseInt(str2);
                        } catch (Throwable unused2) {
                        }
                    }
                    String str3 = "";
                    List<com.ss.ttvideoengine.j.o> b4 = eVar.b();
                    if (b4 != null && b4.size() > 0) {
                        for (com.ss.ttvideoengine.j.o oVar : b4) {
                            if (oVar != null && i3 == oVar.a(3)) {
                                str3 = oVar.b(15);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(b2)) {
                            EnginePreloader.this.a(str3, b2);
                        }
                        EnginePreloader.g();
                    }
                }
            }
        }
    };
    private String C = null;
    private LoaderListener D = new LoaderListener() {
        /* class com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.AnonymousClass3 */

        static {
            Covode.recordClassIndex(93997);
        }

        @Override // com.ss.mediakit.medialoader.LoaderListener
        public final void onLoaderTaskCancel(final LoaderEventInfo loaderEventInfo) {
            com.ss.android.ugc.playerkit.simapicommon.a.f148868c.post(new Runnable() {
                /* class com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.AnonymousClass3.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(94000);
                }

                public final void run() {
                    for (WeakReference<f> weakReference : EnginePreloader.this.f143649a) {
                        EnginePreloader.a(weakReference.get(), 2, loaderEventInfo);
                    }
                }
            });
        }

        @Override // com.ss.mediakit.medialoader.LoaderListener
        public final void onLoaderTaskCompleted(final LoaderEventInfo loaderEventInfo) {
            com.ss.android.ugc.playerkit.simapicommon.a.f148868c.post(new Runnable() {
                /* class com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.AnonymousClass3.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(93999);
                }

                public final void run() {
                    for (WeakReference<f> weakReference : EnginePreloader.this.f143649a) {
                        EnginePreloader.a(weakReference.get(), 1, loaderEventInfo);
                    }
                }
            });
        }

        @Override // com.ss.mediakit.medialoader.LoaderListener
        public final void onLoaderTaskStart(final LoaderEventInfo loaderEventInfo) {
            com.ss.android.ugc.playerkit.simapicommon.a.f148868c.post(new Runnable() {
                /* class com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.AnonymousClass3.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(93998);
                }

                public final void run() {
                    for (WeakReference<f> weakReference : EnginePreloader.this.f143649a) {
                        EnginePreloader.a(weakReference.get(), 0, loaderEventInfo);
                    }
                }
            });
        }
    };
    private final ConcurrentHashMap<String, com.ss.android.ugc.playerkit.videoview.a.c> E = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final List<WeakReference<f>> f143649a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    l f143650b;

    /* renamed from: c  reason: collision with root package name */
    a f143651c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f143652d = new Handler(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    public Map<String, List<v>> f143653e = Collections.synchronizedMap(new LinkedHashMap<String, List<v>>() {
        /* class com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.AnonymousClass1 */

        static {
            Covode.recordClassIndex(93995);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry] */
        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, List<v>> entry) {
            if (size() > 15) {
                return true;
            }
            return false;
        }
    });

    /* renamed from: f  reason: collision with root package name */
    public ConcurrentHashMap<String, String> f143654f = new ConcurrentHashMap<>();

    /* renamed from: g  reason: collision with root package name */
    final List<k> f143655g = new CopyOnWriteArrayList();

    /* renamed from: h  reason: collision with root package name */
    volatile String f143656h;

    /* renamed from: i  reason: collision with root package name */
    public Map<String, Integer> f143657i = new ConcurrentHashMap();

    /* renamed from: j  reason: collision with root package name */
    public Map<String, com.ss.android.ugc.playerkit.simapicommon.a.i> f143658j = new ConcurrentHashMap();

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, com.ss.android.ugc.aweme.player.sdk.b.e> f143659k = new ConcurrentHashMap();

    /* renamed from: l  reason: collision with root package name */
    public final IVideoPreloadConfig f143660l = com.ss.android.ugc.aweme.video.preload.o.a();

    /* renamed from: m  reason: collision with root package name */
    public f f143661m;
    private volatile boolean p;
    private volatile boolean q;
    private int r;
    private boolean s;
    private Handler t;
    private File u;
    private volatile boolean v;
    private volatile boolean w = false;
    private int x = 819200;
    private volatile boolean y = false;
    private ConcurrentLinkedQueue<String> z = new ConcurrentLinkedQueue<>();

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final String d() {
        return "engine";
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final m e(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final boolean f() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final List<x> h(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final boolean a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        if (iVar == null) {
            return false;
        }
        String bitRatedRatioUri = iVar.getBitRatedRatioUri();
        if (!TextUtils.isEmpty(iVar.getDashVideoId())) {
            p b2 = a.b(iVar.getDashVideoId());
            if (b2 == null || a.a(b2) <= 0) {
                return false;
            }
            return true;
        } else if (b.u()) {
            if (d(bitRatedRatioUri) > 0) {
                return true;
            }
            return false;
        } else if (d.h.f152465a.j(bitRatedRatioUri) != null) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x05f8, code lost:
        if (r7 != null) goto L_0x05ff;
     */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0951  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0964  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0cc0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00de A[Catch:{ all -> 0x0ce5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x02af A[Catch:{ all -> 0x0ce5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x04f1 A[Catch:{ all -> 0x0ce5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x04f8 A[Catch:{ all -> 0x0ce5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x04fe A[Catch:{ all -> 0x0ce5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x053d A[Catch:{ all -> 0x0ce5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x05d7 A[Catch:{ all -> 0x0ce5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x05df A[Catch:{ all -> 0x0ce5 }] */
    @Override // com.ss.android.ugc.aweme.video.preload.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
        // Method dump skipped, instructions count: 3336
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.a():boolean");
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final void a(Map<String, String> map) {
        if (this.p) {
            b(map);
        } else {
            this.A = map;
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final boolean a(List<com.ss.android.ugc.playerkit.simapicommon.a.i> list, int i2, List<com.ss.android.ugc.playerkit.simapicommon.a.i> list2, int i3) {
        if (this.f143660l.isPlayerPreferchCaption() && list != null && !list.isEmpty()) {
            for (com.ss.android.ugc.playerkit.simapicommon.a.i iVar : list) {
                if (iVar != null) {
                    String sourceId = iVar.getSourceId();
                    com.a.a("addTask: key:%s, vid:%s, limit:%s", new Object[]{sourceId, sourceId, Integer.valueOf(i2)});
                    aj.a(sourceId, sourceId, iVar.getUrlList().get(0), (long) i2);
                    a(iVar, i2, sourceId);
                    this.f143661m.a(iVar, i2);
                }
            }
        }
        if (this.f143660l.isPlayerPreferchTtsAudio() && list2 != null && !list2.isEmpty()) {
            if (this.f143660l.playerPreferchTtsAudioSize() > 0) {
                i3 = this.f143660l.playerPreferchTtsAudioSize();
            }
            for (com.ss.android.ugc.playerkit.simapicommon.a.i iVar2 : list2) {
                if (iVar2 != null) {
                    String sourceId2 = iVar2.getSourceId();
                    com.a.a("addTask: key:%s, vid:%s, limit:%s", new Object[]{sourceId2, sourceId2, Integer.valueOf(i3)});
                    aj.a(sourceId2, sourceId2, iVar2.getUrlList().get(0), (long) i3);
                    a(iVar2, i3, sourceId2);
                    this.f143661m.a(iVar2, i3);
                }
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final boolean a(final com.ss.android.ugc.playerkit.simapicommon.a.i iVar, int i2, final n nVar, g.a aVar) {
        final int i3;
        final boolean z2;
        iVar.getSourceId();
        iVar.getBitRatedRatioUri();
        g();
        boolean z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
        int i4 = 0;
        z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
        if (this.p && iVar != null) {
            final String sourceId = iVar.getSourceId();
            if (!(i2 == -1 || i2 == 0) || (i3 = this.r) <= 0) {
                i3 = i2;
            }
            final PreloadSessionManager.PreloadSession b2 = PreloadSessionManager.f143503a.b(iVar.getSourceId());
            if (b2 == null) {
                b2 = PreloadSessionManager.f143503a.a(iVar.getSourceId());
                z2 = true;
            } else {
                z2 = false;
            }
            int h2 = h();
            String str = null;
            if (iVar.isColdBoot()) {
                if (TextUtils.isEmpty(iVar.getDashVideoModelStr())) {
                    u selectedBitrateForColdBoot = this.f143660l.getSelectedBitrateForColdBoot(iVar);
                    if (!(selectedBitrateForColdBoot == null || selectedBitrateForColdBoot.f148824a == null)) {
                        String str2 = selectedBitrateForColdBoot.f148829f;
                        com.ss.android.ugc.playerkit.session.a.f148854a.a(str2, selectedBitrateForColdBoot.f148830g);
                        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(sourceId)) {
                            a(str2, sourceId);
                        }
                        if (selectedBitrateForColdBoot.f148824a instanceof String) {
                            str = (String) selectedBitrateForColdBoot.f148824a;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            aj.a(str2, str2, new String[]{str}, (long) i3, a(nVar.f143758a));
                            a(iVar, i3, str2);
                            this.f143661m.a(iVar, i3);
                            z3 = true;
                        }
                    }
                } else {
                    try {
                        p a2 = a.a(iVar.getDashVideoModelStr());
                        if (!(a2 == null || a2.f152968d == null)) {
                            String str3 = a2.f152968d.f152983h;
                            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(sourceId)) {
                                a(str3, sourceId);
                            }
                            g();
                            iVar.setDashVideoId(str3);
                            a.a(str3, a2);
                            com.ss.android.ugc.playerkit.session.a.f148854a.c(sourceId, a2.f152968d.f152983h);
                            w a3 = j.a(this.f143660l.getProperResolution(sourceId, new com.ss.android.ugc.aweme.player.sdk.a.p(a2)));
                            if (a3 == null || a3 == w.Undefine) {
                                a3 = aj.a(a2, a.f143686a, 1, (h) null);
                            }
                            iVar.getSourceId();
                            d dVar = d.h.f152465a;
                            com.ss.ttvideoengine.v vVar = new com.ss.ttvideoengine.v(a2, a3, (long) i2);
                            vVar.f153304j = null;
                            dVar.a(vVar);
                            a(iVar, i2, iVar.getDashVideoId());
                            this.f143661m.a(iVar, i3);
                        }
                    } catch (Throwable unused) {
                    }
                }
            } else if (TextUtils.isEmpty(iVar.getDashVideoModelStr())) {
                if (!this.s) {
                    com.ss.android.ugc.playerkit.videoview.a.c a4 = this.f143660l.createVideoUrlProcessor().a(iVar, com.ss.android.ugc.playerkit.model.c.f148702a.getPlayerType());
                    if (a4 == null || a4.f148908a == null || a4.f148908a.length <= 0) {
                        g();
                    } else {
                        g();
                        com.ss.android.ugc.playerkit.session.a.f148854a.a(a4.f148910c, a4.f148912e);
                        if (this.f143660l.getExperiment().PlayerAbMedialoaderEnablePreconneExp() == 1) {
                            for (String str4 : a4.f148908a) {
                                e(str4);
                            }
                        }
                        int PlayerAbPreloadSizeOffsetThresholdExp = this.f143660l.getExperiment().PlayerAbPreloadSizeOffsetThresholdExp();
                        long j2 = (long) i3;
                        if (iVar.getSize() > j2 && iVar.getSize() - j2 <= ((long) PlayerAbPreloadSizeOffsetThresholdExp)) {
                            i3 = (int) iVar.getSize();
                        }
                        iVar.getSourceId();
                        String str5 = a4.f148910c;
                        if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(sourceId)) {
                            a(str5, sourceId);
                        }
                        aj.a(a4.f148910c, a4.f148910c, a4.f148908a, (long) i3, a(nVar.f143758a));
                        a(iVar, i3, a4.f148910c);
                        this.f143661m.a(iVar, i3);
                    }
                } else {
                    String uri = iVar.getUri();
                    g();
                    if (this.f143660l.getExperiment().PlayerAbMedialoaderEnablePreconneExp() == 1) {
                        List<String> urlList = iVar.getUrlList();
                        if (iVar.getBitRate() != null && iVar.getBitRate().size() > 0) {
                            urlList = iVar.getBitRate().get(0).urlList();
                        }
                        if (urlList != null) {
                            for (String str6 : urlList) {
                                e(str6);
                            }
                        }
                    }
                    AnonymousClass8 r16 = !k() ? new com.ss.ttvideoengine.f() {
                        /* class com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.AnonymousClass8 */

                        /* renamed from: a  reason: collision with root package name */
                        com.ss.android.ugc.playerkit.videoview.a.c f143678a;

                        static {
                            Covode.recordClassIndex(94006);
                        }

                        @Override // com.ss.ttvideoengine.f
                        public final String d() {
                            return EnginePreloader.this.a(nVar.f143758a);
                        }

                        @Override // com.ss.ttvideoengine.f
                        public final String[] a() {
                            if (this.f143678a == null) {
                                int h2 = EnginePreloader.this.h();
                                this.f143678a = EnginePreloader.this.f143660l.createVideoUrlProcessor().a(iVar, com.ss.android.ugc.playerkit.model.c.f148702a.getPlayerType());
                                if (b2 != null && (EnginePreloader.this.c(iVar) <= 0 || z2)) {
                                    b2.speed = h2;
                                }
                            }
                            com.ss.android.ugc.playerkit.videoview.a.c cVar = this.f143678a;
                            if (cVar != null) {
                                return cVar.f148908a;
                            }
                            return null;
                        }

                        @Override // com.ss.ttvideoengine.f
                        public final String c() {
                            String str;
                            if (this.f143678a == null) {
                                a();
                            }
                            EnginePreloader.this.a(iVar, i3, this.f143678a.f148910c);
                            com.ss.android.ugc.playerkit.videoview.a.c cVar = this.f143678a;
                            if (cVar != null) {
                                str = cVar.f148910c;
                            } else {
                                str = null;
                            }
                            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(sourceId)) {
                                EnginePreloader.this.a(str, sourceId);
                            }
                            EnginePreloader.g();
                            return str;
                        }

                        @Override // com.ss.ttvideoengine.f
                        public final long b() {
                            if (this.f143678a == null) {
                                a();
                            }
                            int i2 = i3;
                            if (this.f143678a != null) {
                                int PlayerAbPreloadSizeOffsetThresholdExp = EnginePreloader.this.f143660l.getExperiment().PlayerAbPreloadSizeOffsetThresholdExp();
                                if (this.f143678a.f148911d != null) {
                                    if (this.f143678a.f148911d.getSize() > i3 && this.f143678a.f148911d.getSize() - i3 <= PlayerAbPreloadSizeOffsetThresholdExp) {
                                        i2 = this.f143678a.f148911d.getSize();
                                    }
                                } else if (iVar.getSize() > ((long) i3) && iVar.getSize() - ((long) i3) <= ((long) PlayerAbPreloadSizeOffsetThresholdExp)) {
                                    i2 = (int) iVar.getSize();
                                }
                            }
                            EnginePreloader.g();
                            return (long) i2;
                        }
                    } : null;
                    iVar.getSourceId();
                    List<com.ss.android.ugc.playerkit.simapicommon.a.e> bitRate = iVar.getBitRate();
                    bitRate.size();
                    for (int i5 = 0; i5 < bitRate.size(); i5++) {
                        List<String> urlList2 = bitRate.get(i5).urlList();
                        if (urlList2 != null && urlList2.size() > 0) {
                            bitRate.get(i5).urlList().get(0);
                            d dVar2 = d.h.f152465a;
                            String str7 = bitRate.get(i5).urlList().get(0);
                            if (dVar2.f152369d != 0 || TextUtils.isEmpty(str7)) {
                                j.b("DataLoaderHelper", "[predown]  state or url is invalid, not allow predown");
                            } else if (dVar2.f152376k.mLoaderType <= 0) {
                                j.b("DataLoaderHelper", "[predown]  loader type is http, not allow predown");
                            } else {
                                dVar2.r.lock();
                                try {
                                    j.b("DataLoaderHelper", "[predown] start predown for url: ".concat(String.valueOf(str7)));
                                    if (dVar2.f152375j != null) {
                                        dVar2.f152375j.p2pPredown(str7);
                                    }
                                    j.b("DataLoaderHelper", "[predown] end predown for url");
                                } finally {
                                    dVar2.r.unlock();
                                }
                            }
                        }
                    }
                    if (k()) {
                        com.ss.android.ugc.aweme.player.sdk.b.e a5 = a(iVar, (com.ss.android.ugc.aweme.player.sdk.b.c) null);
                        if (a5 != null) {
                            com.ss.ttvideoengine.v vVar2 = new com.ss.ttvideoengine.v(o.a(a5), w.Auto, (long) i3);
                            vVar2.f153303i = 1;
                            d.h.f152465a.a(vVar2);
                        }
                    } else {
                        r rVar = new r(uri, uri, (long) i3, r16, a(nVar.f143758a));
                        if (aVar != null) {
                            if (aVar.f143724a == 1) {
                                rVar.f153212g = 100;
                            } else if (aVar.f143724a == 2) {
                                rVar.f153212g = 10000;
                            }
                        }
                        Object[] objArr = new Object[4];
                        objArr[0] = uri;
                        objArr[1] = uri;
                        objArr[2] = Integer.valueOf(i3);
                        if (aVar != null) {
                            i4 = aVar.f143724a;
                        }
                        objArr[3] = Integer.valueOf(i4);
                        com.a.a("addTask: key:%s, vid:%s, limit:%s, priority:%s", objArr);
                        d.h.f152465a.a(rVar);
                    }
                    a(iVar, i3, uri);
                    this.f143661m.a(iVar, i3);
                }
                z3 = true;
            } else {
                p a6 = a.a(iVar.getDashVideoModelStr());
                if (!(a6 == null || a6.f152968d == null)) {
                    String str8 = a6.f152968d.f152983h;
                    if (!TextUtils.isEmpty(str8) && !TextUtils.isEmpty(sourceId)) {
                        a(str8, sourceId);
                    }
                    g();
                    iVar.setDashVideoId(str8);
                    a.a(str8, a6);
                    com.ss.android.ugc.playerkit.session.a.f148854a.c(sourceId, a6.f152968d.f152983h);
                    w a7 = j.a(this.f143660l.getProperResolution(sourceId, new com.ss.android.ugc.aweme.player.sdk.a.p(a6)));
                    if (k()) {
                        a7 = w.Auto;
                    } else if (a7 == null || a7 == w.Undefine) {
                        a7 = aj.a(a6, a.f143686a, 1, (h) null);
                    }
                    iVar.getSourceId();
                    com.ss.ttvideoengine.v vVar3 = new com.ss.ttvideoengine.v(a6, a7, (long) i2);
                    if (k()) {
                        vVar3.f153303i = 1;
                    }
                    a(iVar, new com.ss.android.ugc.aweme.player.sdk.a.p(a6));
                    d.h.f152465a.a(vVar3);
                    a(iVar, i2, iVar.getDashVideoId());
                    this.f143661m.a(iVar, i3);
                }
            }
            if (b2 != null && (c(iVar) <= 0 || z2)) {
                b2.speed = h2;
            }
        }
        return z3;
    }

    public final void a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, int i2, String str) {
        if (str != null && iVar != null) {
            this.f143657i.put(str, Integer.valueOf(i2));
            this.f143658j.put(str, iVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final void a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, String str, boolean z2, com.ss.android.ugc.aweme.video.preload.d dVar) {
        String str2;
        if (iVar == null) {
            a(dVar);
        } else if (!TextUtils.isEmpty(iVar.getDashVideoModelStr())) {
            a(dVar);
        } else {
            if (k()) {
                com.ss.android.ugc.f.a.a.a.a.c e2 = com.ss.android.ugc.playerkit.session.a.f148854a.e(iVar.getSourceId());
                str2 = e2 != null ? e2.getUrlKey() : iVar.getUrlKey();
            } else {
                str2 = this.f143660l.createVideoUrlProcessor() != null ? this.f143660l.createVideoUrlProcessor().a(iVar, com.ss.android.ugc.playerkit.model.c.f148702a.getPlayerType()).f148910c : "";
            }
            if (TextUtils.isEmpty(str2)) {
                a(dVar);
                return;
            }
            com.ss.ttvideoengine.b.a aVar = new com.ss.ttvideoengine.b.a(str2, str, true, new c(dVar));
            d dVar2 = d.h.f152465a;
            AVMDLCopyOperation aVMDLCopyOperation = new AVMDLCopyOperation(aVar.f152312a, aVar.f152313b, aVar.f152314c, new AVMDLCopyOperationListener(aVar) {
                /* class com.ss.ttvideoengine.d.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ com.ss.ttvideoengine.b.a f152380a;

                static {
                    Covode.recordClassIndex(101529);
                }

                {
                    this.f152380a = r2;
                }

                @Override // com.ss.mediakit.medialoader.AVMDLCopyOperationListener
                public final void onCopyComplete(boolean z, int i2, String str) {
                    if (this.f152380a.f152315d != null) {
                        this.f152380a.f152315d.a(z);
                    }
                }
            });
            if (dVar2.f152369d == 0) {
                dVar2.r.lock();
                try {
                    if (dVar2.f152375j != null) {
                        dVar2.f152375j.asyncCopyOperation(aVMDLCopyOperation);
                    }
                } catch (Throwable unused) {
                }
                dVar2.r.unlock();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final void a(k kVar) {
        if (kVar != null && !this.f143655g.contains(kVar)) {
            this.f143655g.add(kVar);
        }
    }

    public final void a(String str, String str2) {
        if (this.z.size() > 50) {
            this.f143654f.remove(this.z.poll());
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.z.add(str);
            g();
            this.f143654f.put(str, str2);
        }
    }

    public static void g() {
        com.ss.android.ugc.playerkit.simapicommon.a.a().isDebug();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final File e() {
        return this.u;
    }

    static {
        Covode.recordClassIndex(93994);
    }

    private boolean k() {
        if (!b.f().useNative || !this.v || !this.w) {
            return false;
        }
        return true;
    }

    public final int h() {
        int i2;
        int d2 = this.f143660l.getSpeedManager().d();
        if (((double) d2) <= 0.0d && (i2 = n) > 0) {
            d2 = i2;
        }
        n = d2;
        return d2;
    }

    private String j() {
        if (!TextUtils.isEmpty(this.C)) {
            return this.C;
        }
        Application application = com.ss.android.ugc.playerkit.simapicommon.a.f148866a;
        if (application == null) {
            return null;
        }
        File a2 = a(application);
        if (com.ss.android.ugc.playerkit.simapicommon.a.a().isDebug()) {
            a2 = com.ss.android.ugc.playerkit.d.a.a(application);
        }
        if (TextUtils.equals("playback_simulator_test", com.ss.android.ugc.playerkit.simapicommon.a.a().getChannel())) {
            a2 = com.ss.android.ugc.playerkit.d.a.a(application);
        }
        if (a2 == null) {
            return null;
        }
        String absolutePath = a2.getAbsolutePath();
        this.C = absolutePath;
        return absolutePath;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final void c() {
        d dVar = d.h.f152465a;
        if (dVar.f152369d == 0) {
            dVar.r.lock();
            try {
                if (dVar.f152375j == null) {
                    j.e("DataLoaderHelper", "mInnerDataLoader == null");
                } else {
                    dVar.f152375j.clearAllCaches();
                }
            } catch (Throwable unused) {
            }
            dVar.r.unlock();
        }
    }

    public EnginePreloader() {
        k.b bVar = k.b.f143630a;
        this.f143661m = new l(new i(bVar), bVar);
        if (((Boolean) b.f148674h.getValue()).booleanValue()) {
            HandlerThread handlerThread = new HandlerThread("SC_Preload_Thread", ((Number) b.f148675i.getValue()).intValue());
            handlerThread.start();
            this.t = new Handler(handlerThread.getLooper());
        }
    }

    private void i() {
        long j2;
        try {
            j();
            HashMap hashMap = new HashMap();
            com.ss.android.ugc.aweme.video.preload.c[] values = com.ss.android.ugc.aweme.video.preload.c.values();
            int i2 = 0;
            for (com.ss.android.ugc.aweme.video.preload.c cVar : values) {
                if (cVar == null || TextUtils.isEmpty(cVar.getCacheDir())) {
                    j2 = -1;
                } else {
                    Long l2 = this.f143660l.getExperiment().getExCacheDirSizeConfig().get(cVar.getCacheDir());
                    if (l2 == null || l2.longValue() <= 0) {
                        j2 = cVar.getSizeMB();
                    } else {
                        j2 = l2.longValue();
                    }
                }
                boolean z2 = true;
                boolean z3 = !TextUtils.isEmpty(cVar.getCacheDir());
                if (j2 <= 0) {
                    z2 = false;
                }
                if (z3 && z2) {
                    hashMap.put(a(cVar), Long.valueOf(j2));
                }
            }
            if (hashMap.size() > 0) {
                String[] strArr = new String[hashMap.size()];
                long[] jArr = new long[hashMap.size()];
                for (Map.Entry entry : hashMap.entrySet()) {
                    strArr[i2] = (String) entry.getKey();
                    jArr[i2] = ((Long) entry.getValue()).longValue() * 1048576;
                    i2++;
                }
                Pair pair = new Pair(strArr, jArr);
                d dVar = d.h.f152465a;
                String[] strArr2 = (String[]) pair.first;
                long[] jArr2 = (long[]) pair.second;
                j.b("DataLoaderHelper", "setcustom paths and maxcaches ");
                dVar.r.lock();
                try {
                    dVar.f152376k.setCacheInfoList(strArr2, jArr2);
                } finally {
                    dVar.r.unlock();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void l() {
        List<com.ss.android.ugc.playerkit.model.f> engineStaticOptionList = this.f143660l.getExperiment().engineStaticOptionList();
        if (engineStaticOptionList != null && engineStaticOptionList.size() > 0) {
            for (com.ss.android.ugc.playerkit.model.f fVar : engineStaticOptionList) {
                if (fVar.f148723b != null) {
                    try {
                        if (fVar.f148724c == 1) {
                            aj.e(fVar.f148722a, ((Integer) fVar.f148723b).intValue());
                        } else if (fVar.f148724c == 2) {
                            aj.b(fVar.f148722a, ((Long) fVar.f148723b).longValue());
                        } else if (fVar.f148724c == 4) {
                            aj.a(fVar.f148722a, (String) fVar.f148723b);
                        } else if (fVar.f148724c == 5) {
                            aj.a(fVar.f148722a, ((JSONObject) fVar.f148723b).toString());
                        } else if (fVar.f148724c == 6) {
                            aj.a(fVar.f148722a, ((JSONArray) fVar.f148723b).toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final void b() {
        g();
        d.h.f152465a.h();
        Map<String, Integer> map = this.f143657i;
        if (map != null) {
            map.clear();
        }
        this.f143659k.clear();
        if (this.f143658j != null) {
            ArrayList<com.ss.android.ugc.playerkit.simapicommon.a.i> arrayList = new ArrayList(this.f143658j.values());
            this.f143658j.clear();
            for (com.ss.android.ugc.aweme.video.preload.k kVar : this.f143655g) {
                kVar.a(arrayList);
            }
            for (com.ss.android.ugc.playerkit.simapicommon.a.i iVar : arrayList) {
                this.f143661m.a(iVar, b.Cancel);
            }
        }
    }

    private static void a(com.ss.android.ugc.aweme.video.preload.d dVar) {
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final long a(String str) {
        if (d.h.f152465a != null) {
            return d(str);
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final long b(String str) {
        d.a j2 = d.h.f152465a.j(str);
        if (j2 != null) {
            return j2.f152383b;
        }
        return 0;
    }

    private static File a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107194b != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107194b = cacheDir;
        return cacheDir;
    }

    private void e(String str) {
        if (!TextUtils.isEmpty(str) && this.f143660l.getExperiment().EnablePreloaderPreConnect().booleanValue()) {
            d.h.f152465a.b(str);
        }
    }

    private static long d(String str) {
        long j2 = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (b.u()) {
            return d.h.f152465a.d(str);
        }
        d.a j3 = d.h.f152465a.j(str);
        if (j3 != null) {
            j2 = j3.f152384c;
        }
        return (long) ((int) j2);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final boolean b(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        long j2;
        if (iVar == null) {
            return false;
        }
        d.a j3 = d.h.f152465a.j(iVar.getBitRatedRatioUri());
        if (j3 != null) {
            j2 = j3.f152384c;
        } else {
            j2 = 0;
        }
        int i2 = (int) j2;
        if (i2 <= 0 || ((long) i2) != j3.f152383b) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final int c(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        long d2;
        if (iVar == null) {
            return 0;
        }
        String bitRatedRatioUri = iVar.getBitRatedRatioUri();
        if (!TextUtils.isEmpty(iVar.getDashVideoId())) {
            p b2 = a.b(iVar.getDashVideoId());
            if (b2 == null) {
                return 0;
            }
            d2 = a.a(b2);
        } else {
            d2 = d(bitRatedRatioUri);
        }
        return (int) d2;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final v f(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        String dashVideoId;
        List<v> list;
        if (TextUtils.isEmpty(iVar.getDashVideoId())) {
            dashVideoId = iVar.getBitRatedRatioUri();
        } else {
            dashVideoId = iVar.getDashVideoId();
        }
        if (TextUtils.isEmpty(dashVideoId) || !this.f143653e.containsKey(dashVideoId) || (list = this.f143653e.get(dashVideoId)) == null || list.size() <= 0) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    private void b(Map<String, String> map) {
        if (this.f143660l.getExperiment().PlayerAbMedialoaderEnableBackupDnsIPExp() == 1 && map != null) {
            try {
                if (map.size() > 0) {
                    for (String str : map.keySet()) {
                        d.h.f152465a.a(str, map.get(str));
                    }
                }
            } catch (Throwable th) {
                com.ss.android.ugc.playerkit.simapicommon.a.b().ensureNotReachHere(th, "setDnsBackupIpMap fail.");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final List<v> g(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        String dashVideoId;
        if (TextUtils.isEmpty(iVar.getDashVideoId())) {
            dashVideoId = iVar.getBitRatedRatioUri();
        } else {
            dashVideoId = iVar.getDashVideoId();
        }
        List<v> list = this.f143653e.get(dashVideoId);
        if (com.ss.android.ugc.playerkit.simapicommon.a.a().isDebug() || this.f143660l.getExperiment().EnableGetCDNLogExperiment()) {
            while (true) {
                JSONObject c2 = d.h.f152465a.c(dashVideoId);
                g();
                if (c2 == null) {
                    break;
                }
                com.ss.android.ugc.playerkit.model.b bVar = (com.ss.android.ugc.playerkit.model.b) com.ss.android.ugc.aweme.cf.a.d.a(c2.toString(), com.ss.android.ugc.playerkit.model.b.class);
                bVar.f148689a = 1;
                v vVar = new v(bVar);
                if (list != null) {
                    list.add(vVar);
                } else {
                    list = new ArrayList<>();
                    list.add(vVar);
                }
            }
        }
        return list;
    }

    private static boolean a(File file) {
        MethodCollector.i(7494);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(7494);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(7494);
        return delete;
    }

    public final void c(String str) {
        this.f143657i.remove(str);
        com.ss.android.ugc.playerkit.simapicommon.a.i remove = this.f143658j.remove(str);
        if (remove != null) {
            this.f143661m.a(remove, b.Failed);
            for (com.ss.android.ugc.aweme.video.preload.k kVar : this.f143655g) {
                kVar.a(remove);
            }
            if (!TextUtils.isEmpty(remove.getSourceId())) {
                this.f143659k.remove(remove.getSourceId());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final void d(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        String dashVideoId;
        if (iVar != null) {
            if (TextUtils.isEmpty(iVar.getDashVideoId())) {
                dashVideoId = iVar.getBitRatedRatioUri();
            } else {
                dashVideoId = iVar.getDashVideoId();
            }
            d dVar = d.h.f152465a;
            if (!TextUtils.isEmpty(dashVideoId)) {
                if (dVar.f152375j == null || dVar.f152369d != 0) {
                    j.e("DataLoaderHelper", "need start mdl first");
                } else {
                    dVar.r.lock();
                    try {
                        d.C4065d d2 = dVar.f152370e.d(dashVideoId);
                        if (d2 != null) {
                            d.a(d2);
                        } else {
                            d.C4065d d3 = dVar.f152371f.d(dashVideoId);
                            if (d3 != null) {
                                if (d3.f152410j != null) {
                                    d3.f152410j.a();
                                }
                                d.a(d3);
                            } else {
                                d.C4065d d4 = dVar.f152372g.d(dashVideoId);
                                if (d4 != null) {
                                    dVar.f152375j.cancel(dashVideoId);
                                    d.a(d4);
                                }
                            }
                        }
                        j.a("DataLoaderHelper", "[preload] cancel preload task. key = ".concat(String.valueOf(dashVideoId)));
                    } catch (Throwable unused) {
                    }
                    dVar.r.unlock();
                }
            }
            this.f143657i.remove(dashVideoId);
            com.ss.android.ugc.playerkit.simapicommon.a.i remove = this.f143658j.remove(dashVideoId);
            if (remove != null) {
                this.f143661m.a(remove, b.Cancel);
                ArrayList arrayList = new ArrayList();
                arrayList.add(remove);
                for (com.ss.android.ugc.aweme.video.preload.k kVar : this.f143655g) {
                    kVar.a(arrayList);
                }
                if (!TextUtils.isEmpty(remove.getSourceId())) {
                    this.f143659k.remove(remove.getSourceId());
                }
            }
        }
    }

    public final String a(com.ss.android.ugc.aweme.video.preload.c cVar) {
        if (cVar == null || TextUtils.isEmpty(cVar.getCacheDir())) {
            return null;
        }
        File file = new File(j(), cVar.getCacheDir());
        if (!file.isDirectory()) {
            a(file);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final void a(f fVar) {
        for (WeakReference<f> weakReference : this.f143649a) {
            if (weakReference.get() == fVar) {
                return;
            }
        }
        this.f143649a.add(new WeakReference<>(fVar));
    }

    static class a extends com.ss.android.ugc.aweme.video.preload.c.a {
        static {
            Covode.recordClassIndex(94007);
        }

        a(com.ss.android.ugc.aweme.video.preload.api.e eVar, int i2) {
            super(new e(eVar), i2);
        }
    }

    private com.ss.android.ugc.aweme.player.sdk.b.e a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, com.ss.android.ugc.aweme.player.sdk.b.c cVar) {
        if (!k() || iVar == null) {
            return null;
        }
        com.ss.android.ugc.aweme.player.sdk.b.e a2 = com.ss.android.ugc.playerkit.d.d.a(iVar, cVar);
        if (this.f143660l.getBitrateSelectListener() != null) {
            this.f143660l.getBitrateSelectListener().a(2, 2, a2);
        }
        iVar.getSourceId();
        this.f143659k.size();
        if (!(iVar.getSourceId() == null || a2 == null)) {
            this.f143659k.put(iVar.getSourceId(), a2);
        }
        return a2;
    }

    public static void a(f fVar, int i2, LoaderEventInfo loaderEventInfo) {
        if (fVar != null) {
            com.ss.android.ugc.playerkit.model.k kVar = new com.ss.android.ugc.playerkit.model.k();
            kVar.f148739a = i2;
            kVar.f148740b = loaderEventInfo.fileHash;
            kVar.f148741c = loaderEventInfo.taskType;
            kVar.f148742d = loaderEventInfo.bytesLoaded;
            kVar.f148744f = loaderEventInfo.off;
            kVar.f148745g = loaderEventInfo.endOff;
            kVar.f148743e = loaderEventInfo.loadDurationMs;
            com.ss.android.ugc.playerkit.model.k.a(kVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final Object a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, String str, String[] strArr) {
        return d.h.f152465a.a(str, iVar.getSourceId(), 0L, strArr, (w) null, (String) null, (com.ss.ttvideoengine.j.o) null, (String) null, (String) null, false, false, (String) null);
    }
}
