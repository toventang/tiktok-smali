package com.ss.android.ugc.aweme.player.sdk.a;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.player.sdk.api.e;
import com.ss.android.ugc.aweme.player.sdk.api.h;
import com.ss.android.ugc.aweme.player.sdk.api.j;
import com.ss.android.ugc.aweme.player.sdk.api.k;
import com.ss.android.ugc.aweme.player.sdk.api.n;
import com.ss.android.ugc.aweme.player.sdk.api.o;
import com.ss.android.ugc.aweme.player.sdk.util.SurfaceWrapper;
import com.ss.android.ugc.aweme.player.sdk.util.f;
import com.ss.android.ugc.playerkit.model.c;
import com.ss.texturerender.VideoSurface;
import com.ss.ttffmpeg.FFmpegLibLoaderWrapper;
import com.ss.ttm.player.SubInfo;
import com.ss.ttm.player.p;
import com.ss.ttm.player.r;
import com.ss.ttvideoengine.aa;
import com.ss.ttvideoengine.ad;
import com.ss.ttvideoengine.aj;
import com.ss.ttvideoengine.av;
import com.ss.ttvideoengine.ax;
import com.ss.ttvideoengine.az;
import com.ss.ttvideoengine.ba;
import com.ss.ttvideoengine.bb;
import com.ss.ttvideoengine.bc;
import com.ss.ttvideoengine.bf;
import com.ss.ttvideoengine.d;
import com.ss.ttvideoengine.h.g;
import com.ss.ttvideoengine.h.q;
import com.ss.ttvideoengine.h.t;
import com.ss.ttvideoengine.q.e;
import com.ss.ttvideoengine.s.i;
import com.ss.ttvideoengine.w;
import com.ss.ttvideoengine.y;
import com.ss.ttvideoengine.z;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class m extends a implements o, y {
    public static WeakReference<com.ss.android.ugc.playerkit.a.b> D;
    private static boolean I = true;
    private static q av = new q() {
        /* class com.ss.android.ugc.aweme.player.sdk.a.m.AnonymousClass10 */

        static {
            Covode.recordClassIndex(74037);
        }

        @Override // com.ss.ttvideoengine.h.q
        public final void a() {
            com.ss.android.ugc.playerkit.a.b bVar;
            if (m.D != null && (bVar = m.D.get()) != null) {
                bVar.onEvent(t.instance.popAllEvents());
            } else if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                com.ss.android.ugc.aweme.player.sdk.a.a("video_playq", "eventListener null");
            }
        }

        @Override // com.ss.ttvideoengine.h.q
        public final void onEventV2(String str) {
            JSONArray popAllEventsV2;
            com.ss.android.ugc.playerkit.a.b bVar;
            if (!TextUtils.isEmpty(str) && c.f148702a.isEnablePlayerLogV2() && (popAllEventsV2 = t.instance.popAllEventsV2()) != null && popAllEventsV2.length() > 0) {
                for (int i2 = 0; i2 < popAllEventsV2.length(); i2++) {
                    try {
                        JSONObject jSONObject = popAllEventsV2.getJSONObject(i2);
                        if (jSONObject != null) {
                            jSONObject.put("params_for_special", "videoplayer_monitor");
                        }
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                        return;
                    }
                }
                if (!(m.D == null || (bVar = m.D.get()) == null)) {
                    bVar.a(popAllEventsV2, str);
                }
            }
        }
    };

    /* renamed from: k  reason: collision with root package name */
    public static boolean f115270k = true;
    public int A;
    public j.c B;
    public e C;
    public k E;
    public h F;
    public com.ss.android.ugc.aweme.player.sdk.api.m G;
    public com.ss.android.ugc.aweme.player.sdk.api.a H;
    private Context J;
    private long K;
    private AtomicReference<aj> L;
    private boolean M;
    private boolean N;
    private boolean O;
    private SparseIntArray P;
    private g Q;
    private boolean R;
    private j.b S;
    private boolean T;
    private d U;
    private com.ss.ttvideoengine.i.b V;
    private long W;
    private long X;
    private long Y;
    private long Z;
    private float aa;
    private p ab;
    private long ac;
    private long ad;
    private long ae;
    private c af;
    private boolean ag;
    private int ah;
    private int ai;
    private int aj;
    private boolean ak;
    private com.ss.ttvideoengine.o al;
    private bc am;
    private bb an;
    private AudioManager ao;
    private AudioManager.OnAudioFocusChangeListener ap;
    private boolean aq;
    private Bundle ar;
    private int as;
    private Bundle at;
    private com.ss.android.ugc.playerkit.a.b au;
    private a aw;
    private b ax;

    /* renamed from: b  reason: collision with root package name */
    public aj f115271b;

    /* renamed from: c  reason: collision with root package name */
    public SparseArray f115272c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f115273d;

    /* renamed from: e  reason: collision with root package name */
    public volatile String f115274e;

    /* renamed from: f  reason: collision with root package name */
    public n f115275f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.playerkit.model.m f115276g;

    /* renamed from: h  reason: collision with root package name */
    public volatile com.ss.ttvideoengine.j.p f115277h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f115278i;

    /* renamed from: j  reason: collision with root package name */
    public long f115279j;

    /* renamed from: l  reason: collision with root package name */
    public long f115280l;

    /* renamed from: m  reason: collision with root package name */
    public int f115281m;
    public String n;
    public String o;
    public Map<String, Object> p;
    public boolean q;
    public long r;
    boolean s;
    public long t;
    public List<com.ss.android.ugc.aweme.player.sdk.b.a> u;
    public boolean v;
    public boolean w;
    public long x;
    public long y;
    public long z;

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final boolean k() {
        return this.M;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final String s() {
        return this.f115274e;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final void a(Surface surface) {
        try {
            j.b bVar = this.S;
            if ((bVar == null || !bVar.a()) && this.f115271b != null) {
                if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                    com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "setSurface surface = " + surface + ", this = " + this);
                }
                com.ss.android.ugc.playerkit.model.m mVar = this.f115276g;
                if (mVar != null && mVar.G && (surface instanceof SurfaceWrapper)) {
                    ((SurfaceWrapper) surface).f115441a = new WeakReference<>(this);
                }
                if (this.f115278i) {
                    this.ad = SystemClock.elapsedRealtime() - this.f115279j;
                    k kVar = this.E;
                    if (kVar != null) {
                        kVar.d();
                    }
                }
                f.f115464a.put(surface, new WeakReference<>(this));
                this.f115271b.a(surface);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final void a(List<Surface> list) {
        try {
            if (!(this.f115271b == null || list == null || list.size() <= 0)) {
                this.f115271b.a((Surface) null, 3);
                for (Surface surface : list) {
                    if (surface != null && surface.isValid()) {
                        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                            com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "setExtraSurfaces extraSurface = " + surface + ", this = " + this);
                        }
                        this.f115271b.a(surface, 1);
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final void a(String str) {
        aj ajVar = this.f115271b;
        if (ajVar != null) {
            ajVar.b(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final void a(SurfaceHolder surfaceHolder) {
        try {
            aj ajVar = this.f115271b;
            if (ajVar != null) {
                ajVar.a(surfaceHolder);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final void a(boolean z2, Bundle bundle) {
        this.aq = z2;
        this.ar = bundle;
        D();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final void a(int i2, Bundle bundle) {
        this.as = i2;
        this.at = bundle;
        if (com.ss.android.ugc.playerkit.exp.b.a()) {
            this.f115271b.f(4, this.as);
            Bundle bundle2 = this.at;
            if (bundle2 != null && bundle2.containsKey("float_value")) {
                int i3 = this.as;
                if (i3 == 0 || i3 == 2) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("action", 27);
                    bundle3.putInt("effect_type", 11);
                    bundle3.putFloat("float_value", this.at.getFloat("float_value"));
                    this.f115271b.a(bundle3);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final void a(com.ss.android.ugc.playerkit.model.g gVar) {
        String str;
        if (gVar == null) {
            E();
            return;
        }
        int i2 = gVar.f148726a;
        if (i2 == 1 || d(23) != 1) {
            StringBuilder append = new StringBuilder("setEffect ttplayer = ").append(this).append(" The lut filter is not initialized!!! Coming soon");
            if (i2 == 1) {
                str = "Active initialization";
            } else {
                str = "Passive initialization";
            }
            append.append(str);
            if (gVar.f148729d == null) {
                E();
            } else if (this.ai == 1 || d(23) == 1) {
                b(gVar);
            } else if (!this.ak || Build.VERSION.SDK_INT > 23) {
                this.f115271b.f(199, 1);
                b(gVar);
            }
        } else {
            new StringBuilder("setEffect ttplayer = ").append(this).append(d(19) != 1 ? "The lut filter is not being used!!!" : "Lut filter is in use!!!effectInfo = " + gVar.toString());
            Bundle bundle = new Bundle();
            if (i2 == 2) {
                bundle.putInt("action", 19);
                bundle.putInt("int_value", gVar.f148730e ? 1 : 0);
            } else if (i2 == 3) {
                List<Float> list = gVar.f148728c;
                if (list != null && !list.isEmpty()) {
                    int i3 = gVar.f148731f;
                    if (i3 < 0 || i3 >= list.size()) {
                        bundle.putFloat("float_value", list.get(0).floatValue());
                    } else {
                        bundle.putFloat("float_value", list.get(i3).floatValue());
                        bundle.putInt("index", i3);
                    }
                    bundle.putInt("action", 20);
                } else {
                    return;
                }
            } else if (i2 == 4) {
                List<Bitmap> list2 = gVar.f148729d;
                if (list2 == null) {
                    throw new NullPointerException("isEmpty");
                }
                bundle.putInt("action", 22);
                bundle.putParcelable("lut_bitmap", list2.get(0));
            }
            if (gVar.f148727b == 1) {
                bundle.putInt("effect_type", 2);
            }
            this.f115271b.a(bundle);
        }
    }

    @Override // com.ss.ttvideoengine.y
    public final void a(boolean z2) {
        j.c cVar = this.B;
        if (cVar != null) {
            cVar.b(z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final void a(final com.ss.android.ugc.aweme.player.sdk.b.e eVar, final com.ss.android.ugc.aweme.player.sdk.api.b bVar) {
        bVar.a(2, 1, eVar);
        this.f115271b.a(o.a(eVar));
        this.f115271b.f(583, 1);
        aj ajVar = this.f115271b;
        AnonymousClass7 r2 = new com.ss.ttvideoengine.n.c.c() {
            /* class com.ss.android.ugc.aweme.player.sdk.a.m.AnonymousClass7 */

            static {
                Covode.recordClassIndex(74045);
            }

            @Override // com.ss.ttvideoengine.n.c.c
            public final void a(com.ss.ttvideoengine.j.e eVar, Map<String, String> map, int i2, Object obj) {
                com.ss.android.ugc.aweme.player.sdk.b.e a2;
                new StringBuilder("onAfterSelect iVideoModel ").append(eVar).append("map ").append(map).append("timing ").append(i2);
                if (!(bVar == null || i2 != 1 || (a2 = o.a(map, eVar)) == null)) {
                    bVar.b(2, i2, a2);
                    bVar.a(2, i2, a2.f115343i);
                    map.put("video_bitrarte", String.valueOf(a2.f115343i.f115348a));
                    List<com.ss.ttvideoengine.j.o> b2 = eVar.b();
                    if (b2 != null && b2.size() > 0) {
                        for (com.ss.ttvideoengine.j.o oVar : b2) {
                            if (oVar.a(3) == a2.f115343i.f115348a) {
                                oVar.w = a2.f115343i.w;
                                return;
                            }
                        }
                    }
                }
            }
        };
        com.ss.ttvideoengine.s.j.a("TTVideoEngine", "[GearStrategy]setGearStrategyListener listener=" + r2 + " userData=" + eVar);
        ajVar.bT.f153125a = r2;
        ajVar.bT.f153126b = eVar;
        this.f115271b.k();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final void a(Map<String, Object> map) {
        a(null, null, map, false);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final void a(String str, Map<String, Object> map) {
        a(null, str, map, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: com.ss.ttvideoengine.aj */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: com.ss.ttvideoengine.aj */
    /* JADX DEBUG: Multi-variable search result rejected for r1v48, resolved type: com.ss.ttvideoengine.aj */
    /* JADX DEBUG: Multi-variable search result rejected for r3v9, resolved type: com.ss.ttvideoengine.aj */
    /* JADX DEBUG: Multi-variable search result rejected for r3v11, resolved type: com.ss.ttvideoengine.aj */
    /* JADX DEBUG: Multi-variable search result rejected for r8v3, resolved type: com.ss.ttvideoengine.aj */
    /* JADX DEBUG: Multi-variable search result rejected for r3v13, resolved type: com.ss.ttvideoengine.aj */
    /* JADX DEBUG: Multi-variable search result rejected for r1v79, resolved type: com.ss.ttvideoengine.aj */
    /* JADX DEBUG: Multi-variable search result rejected for r3v24, resolved type: com.ss.ttvideoengine.aj */
    /* JADX DEBUG: Multi-variable search result rejected for r1v87, resolved type: com.ss.ttvideoengine.aj */
    /* JADX DEBUG: Multi-variable search result rejected for r1v90, resolved type: com.ss.ttvideoengine.aj */
    /* JADX DEBUG: Multi-variable search result rejected for r1v113, resolved type: com.ss.ttvideoengine.aj */
    /* JADX DEBUG: Multi-variable search result rejected for r1v116, resolved type: com.ss.ttvideoengine.aj */
    /* JADX DEBUG: Multi-variable search result rejected for r1v127, resolved type: com.ss.ttvideoengine.aj */
    /* JADX DEBUG: Multi-variable search result rejected for r3v54, resolved type: com.ss.ttvideoengine.aj */
    /* JADX DEBUG: Multi-variable search result rejected for r1v149, resolved type: com.ss.ttvideoengine.aj */
    /* JADX DEBUG: Multi-variable search result rejected for r1v160, resolved type: com.ss.ttvideoengine.aj */
    /* JADX DEBUG: Multi-variable search result rejected for r3v67, resolved type: android.os.Bundle */
    /* JADX DEBUG: Multi-variable search result rejected for r1v240, resolved type: com.ss.ttvideoengine.aj */
    /* JADX DEBUG: Multi-variable search result rejected for r3v91, resolved type: com.ss.ttvideoengine.aj */
    /* JADX DEBUG: Multi-variable search result rejected for r3v92, resolved type: com.ss.ttvideoengine.aj */
    /* JADX DEBUG: Multi-variable search result rejected for r1v250, resolved type: com.ss.ttvideoengine.aj */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v18, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0b6f, code lost:
        if (r14 == false) goto L_0x0b71;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0bd9, code lost:
        if (r35 != null) goto L_0x0982;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0be4, code lost:
        if (r35 != null) goto L_0x09df;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03a6  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0455  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0477  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x047f  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x06de  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0747  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x07f2  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x07ff  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0bf6  */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0bfa A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:472:0x0c1a  */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0c28  */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x0c3c  */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x0c52  */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x0c57  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(final com.ss.android.ugc.playerkit.model.d r33, java.lang.String r34, java.util.Map<java.lang.String, java.lang.Object> r35, boolean r36) {
        /*
        // Method dump skipped, instructions count: 3200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.sdk.a.m.a(com.ss.android.ugc.playerkit.model.d, java.lang.String, java.util.Map, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final void a(j.c cVar) {
        if (cVar == null) {
            cVar = new j.a();
        }
        this.B = cVar;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final void a(String str, e eVar) {
        try {
            this.C = eVar;
            aj ajVar = this.f115271b;
            if (this.Q == null) {
                this.Q = new g() {
                    /* class com.ss.android.ugc.aweme.player.sdk.a.m.AnonymousClass11 */

                    static {
                        Covode.recordClassIndex(74038);
                    }
                };
            }
            ajVar.S = this.Q;
            ajVar.Z = str;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final void a(k kVar) {
        if (kVar != this.E) {
            this.E = kVar;
            com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "setPrePrepareEventTimeListener listener  = ".concat(String.valueOf(kVar)));
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final void a(h hVar) {
        if (hVar != this.F) {
            this.F = hVar;
            com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "setNorPrepareEventTimeListener listener  = ".concat(String.valueOf(hVar)));
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final void a(com.ss.android.ugc.playerkit.a.b bVar) {
        if (bVar != this.au && bVar != null) {
            this.au = bVar;
            D = new WeakReference<>(this.au);
            t.instance.setListener(av);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final void a(int i2, String str) {
        com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "Enter setSubtitlesDefaultLanguage");
        if (this.f115271b != null) {
            try {
                com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "setSubtitlesDefaultLanguage languageId:".concat(String.valueOf(i2)));
                this.A = i2;
                this.f115271b.f(530, i2);
                if (str != null) {
                    this.v = true;
                    JSONObject jSONObject = new JSONObject(str);
                    com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "Ryan setSubtitlesDefaultLanguage subtitleDesInfoModel:".concat(String.valueOf(str)));
                    aj ajVar = this.f115271b;
                    aa aaVar = new aa(jSONObject);
                    com.ss.ttvideoengine.s.j.b("TTVideoEngine", "subtitle: set subtitle description info: " + aaVar.toString());
                    ajVar.I = aaVar;
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final void a(com.ss.android.ugc.aweme.player.sdk.api.m mVar) {
        com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "Enter updateSubInfoListener");
        if (mVar != this.G) {
            this.G = mVar;
            com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "updateSubInfoListener listener  = ".concat(String.valueOf(mVar)));
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final void a(com.ss.android.ugc.aweme.player.sdk.api.a aVar) {
        com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "Enter updateAudioInfoListener");
        if (aVar != this.H) {
            this.H = aVar;
            com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "updateAudioInfoListener listener  = ".concat(String.valueOf(aVar)));
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final void a(j.e eVar) {
        aj ajVar = this.f115271b;
        if (ajVar != null) {
            ajVar.f(562, 1);
            if (eVar.ordinal() == j.e.LOW.ordinal()) {
                this.f115271b.f(570, 286331153);
            } else if (eVar.ordinal() == j.e.NORMAL.ordinal()) {
                this.f115271b.f(570, 572662306);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final boolean b() {
        return d.h.f152465a.c() && aj.bS != null && e.c.f153200a.b().isRunning();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final void A() {
        aj ajVar = this.f115271b;
        if (ajVar != null) {
            ajVar.b(0);
        }
    }

    public final int B() {
        if (this.ai == 1 || d(23) == 1) {
            return 1;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final void g() {
        aj ajVar = this.f115271b;
        if (ajVar != null) {
            ajVar.h(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final float h() {
        aj ajVar = this.f115271b;
        if (ajVar != null) {
            return i.b(ajVar.aa);
        }
        return -1.0f;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final void i() {
        if (j()) {
            this.f115273d = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final boolean j() {
        if (Build.VERSION.SDK_INT >= 26 || !this.M) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final boolean m() {
        aj ajVar = this.f115271b;
        if (ajVar == null || ajVar.v != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final boolean n() {
        com.ss.android.ugc.playerkit.model.m mVar = this.f115276g;
        if (mVar == null || !mVar.H) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final long r() {
        try {
            aj ajVar = this.f115271b;
            if (ajVar != null) {
                return (long) ajVar.x;
            }
            return 1073741823;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 1073741823;
        }
    }

    static {
        Covode.recordClassIndex(74035);
    }

    private static boolean G() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str) && str.toLowerCase().contains("sony")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final long q() {
        try {
            aj ajVar = this.f115271b;
            if (ajVar == null) {
                return 0;
            }
            if (this.aj <= 0 || this.s) {
                return (long) ajVar.s();
            }
            return (long) ajVar.t();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final String t() {
        aj ajVar = this.L.get();
        if (ajVar != null) {
            return ajVar.o(82);
        }
        return "";
    }

    public final String toString() {
        return "TTPlayer{mPlayer=" + this.f115271b + '}';
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final boolean u() {
        aj ajVar = this.L.get();
        if (ajVar == null || !ajVar.p()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final j.g v() {
        String str;
        j.g gVar = new j.g();
        aj ajVar = this.L.get();
        if (ajVar != null) {
            str = ajVar.o(80);
        } else {
            str = null;
        }
        gVar.f115323a = str;
        return gVar;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final boolean x() {
        aj ajVar = this.L.get();
        if (ajVar == null || !ajVar.b()) {
            return false;
        }
        return true;
    }

    private void C() {
        if (com.ss.android.ugc.playerkit.exp.b.e()) {
            if (this.ao == null) {
                this.ao = (AudioManager) a(a(this.J), DataType.AUDIO);
                this.ap = n.f115299a;
            }
            this.ao.requestAudioFocus(this.ap, 3, 1);
        }
    }

    private void E() {
        if (d(19) == 1) {
            Bundle bundle = new Bundle();
            bundle.putInt("action", 19);
            bundle.putInt("int_value", 0);
            bundle.putInt("effect_type", 2);
            this.f115271b.a(bundle);
        } else if (this.ai != 1) {
            if (Build.VERSION.SDK_INT >= 24 || !this.ak) {
                this.f115271b.f(199, 0);
            }
        }
    }

    private static void H() {
        int t2 = com.ss.android.ugc.playerkit.exp.b.t();
        if (t2 > 0) {
            try {
                r.class.getDeclaredMethod("b", Integer.TYPE, Integer.TYPE).invoke(null, 25, Integer.valueOf(t2));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final void a() {
        aj ajVar = this.f115271b;
        if (ajVar != null && this.f115276g != null) {
            ajVar.x();
            this.T = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final void f() {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "release  mPlayer = " + this.f115271b);
        }
        try {
            this.f115271b.a((bb) null);
            this.f115271b.n();
            this.T = false;
            this.f115278i = false;
            f115270k = false;
            this.q = false;
            this.ak = false;
            this.ai = 0;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final boolean l() {
        try {
            aj ajVar = this.f115271b;
            if (ajVar != null) {
                if (!ajVar.ch.a(true)) {
                    return ajVar.R();
                }
                ajVar.ch.a(156, -1, (Object) null);
                ajVar.ch.f152266d.setDataPosition(0);
                if (ajVar.ch.f152266d.readInt() == 1) {
                    return true;
                }
                return false;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final void o() {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "sleep  mPlayer = " + this.f115271b);
        }
        aj ajVar = this.f115271b;
        if (ajVar != null) {
            ajVar.f(27, 1);
            e();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final boolean p() {
        aj ajVar = this.f115271b;
        if (ajVar.A != 3 || (!ajVar.aV && ajVar.v != 2)) {
            return ajVar.aF;
        }
        if (!ajVar.ch.a(true)) {
            return ajVar.g();
        }
        ajVar.ch.a(155, -1, (Object) null);
        ajVar.ch.f152266d.setDataPosition(0);
        if (ajVar.ch.f152266d.readInt() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final void y() {
        com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "Enter setSubInfoListener");
        if (this.f115271b != null) {
            com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "setSubInfoListener do:" + this.aw);
            aj ajVar = this.f115271b;
            ajVar.M = this.aw;
            if (ajVar.bH == null) {
                ajVar.bH = new SubInfo() {
                    /* class com.ss.ttvideoengine.aj.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(101457);
                    }

                    @Override // com.ss.ttm.player.SubInfo
                    public final void onSubLoadFinished(int i2) {
                        int i3;
                        if (aj.this.M == null || aj.this.cn <= 0) {
                            com.ss.ttvideoengine.s.j.e("TTVideoEngine", "mSubInfoCallBack is null");
                            return;
                        }
                        com.ss.ttvideoengine.s.j.b("TTVideoEngine", "subtitle call back: finished old did call back");
                        if (i2 >= 0) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        aj.this.M.a(i3);
                    }

                    @Override // com.ss.ttm.player.SubInfo
                    public final void onSubInfoCallback2(int i2, String str) {
                        if (aj.this.M == null || aj.this.cn <= 0) {
                            com.ss.ttvideoengine.s.j.e("TTVideoEngine", "mSubInfoCallBack is null");
                        } else {
                            aj.this.M.a(i2, str);
                        }
                    }

                    @Override // com.ss.ttm.player.SubInfo
                    public final void onSubSwitchCompleted(int i2, int i3) {
                        if (aj.this.M == null || aj.this.cn <= 0) {
                            com.ss.ttvideoengine.s.j.e("TTVideoEngine", "mSubInfoCallBack is null");
                        } else {
                            aj.this.M.a(i2, i3);
                        }
                    }

                    @Override // com.ss.ttm.player.SubInfo
                    public final void onSubLoadFinished2(int i2, String str) {
                        int i3;
                        if (aj.this.M == null || aj.this.cn <= 0) {
                            com.ss.ttvideoengine.s.j.e("TTVideoEngine", "mSubInfoCallBack is null");
                            return;
                        }
                        com.ss.ttvideoengine.s.j.b("TTVideoEngine", "subtitle call back: finished did call back");
                        if (i2 >= 0) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        aj.this.M.b(i3, str);
                    }

                    @Override // com.ss.ttm.player.SubInfo
                    public final void onSubInfoCallback(int i2, int i3, String str) {
                        if (aj.this.M == null || aj.this.cn <= 0) {
                            com.ss.ttvideoengine.s.j.e("TTVideoEngine", "mSubInfoCallBack is null");
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("info", str);
                            jSONObject.put("pts", i3);
                            aj.this.M.a(i2, jSONObject.toString());
                        } catch (JSONException unused) {
                            com.ss.ttvideoengine.s.j.e("TTVideoEngine", "put content field failed");
                        }
                    }
                };
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final void z() {
        com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "Enter setAudioInfoListener");
        if (this.f115271b != null) {
            com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "setAudioInfoListener do:" + this.ax);
            this.f115271b.a(this.ax);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final void c() {
        SparseIntArray sparseIntArray = this.P;
        if (sparseIntArray != null && sparseIntArray.indexOfKey(7) >= 0) {
            if (this.R) {
                this.f115271b.f(210, 1);
                this.f115271b.f(211, this.P.get(9));
                this.f115271b.f(212, this.P.get(8));
            } else {
                this.f115271b.f(210, 0);
            }
        }
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer, start mPlayer = " + this.f115271b);
        }
        C();
        this.f115271b.k();
        if (this.f115278i) {
            this.ae = SystemClock.elapsedRealtime() - this.f115279j;
            k kVar = this.E;
            if (kVar != null) {
                kVar.b(this.ad);
                this.E.c(this.ae);
                this.E.c();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final void d() {
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "pause  mPlayer = " + this.f115271b);
        }
        try {
            aj ajVar = this.f115271b;
            if (ajVar != null) {
                ajVar.l();
            }
            if (this.f115278i && this.ac == 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f115279j;
                this.ac = elapsedRealtime;
                k kVar = this.E;
                if (kVar != null) {
                    kVar.a(elapsedRealtime);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f115273d = false;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final void e() {
        this.Y = SystemClock.elapsedRealtime();
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "stop  mPlayer = " + this.f115271b);
        }
        try {
            aj ajVar = this.L.get();
            if (ajVar != null) {
                this.V = ajVar.d();
            }
            aj ajVar2 = this.f115271b;
            if (ajVar2 != null) {
                ajVar2.a((Surface) null, 3);
                this.f115105a.f115316g = this.f115271b.m(315);
                this.f115271b.m();
                this.f115281m = 1;
                SparseIntArray sparseIntArray = this.P;
                if (sparseIntArray != null && sparseIntArray.get(51, 0) > 0) {
                    this.f115281m = 2;
                }
                this.Z = SystemClock.elapsedRealtime();
            }
            this.q = false;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final j.f w() {
        com.ss.ttvideoengine.i.b bVar;
        aj ajVar = this.L.get();
        if (!(ajVar == null || ((bVar = this.V) == null && (bVar = ajVar.d()) == null))) {
            j.d dVar = new j.d();
            dVar.f115301a = this.W;
            dVar.f115302b = this.X;
            dVar.f115303c = bVar.a("ffr_read_head_duration");
            dVar.f115304d = bVar.a("ffr_read_first_data_duration");
            dVar.f115305e = bVar.a("ffr_decode_duration");
            dVar.f115306f = bVar.a("ffr_render_duration");
            dVar.f115307g = bVar.a("ffr_playback_buffering_duration");
            dVar.f115308h = bVar.a("ffr_prender_duration");
            this.f115105a.f115317h = dVar;
        }
        return super.w();
    }

    private void D() {
        Bundle bundle;
        if (com.ss.android.ugc.playerkit.exp.b.a()) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("action", 21);
            bundle2.putInt("effect_type", 11);
            if (!this.aq || (bundle = this.ar) == null || !bundle.containsKey("width") || !this.ar.containsKey("height") || !this.ar.containsKey("x") || !this.ar.containsKey("y")) {
                bundle2.putInt("int_value", 0);
            } else {
                bundle2.putFloat("width", this.ar.getFloat("width"));
                bundle2.putFloat("height", this.ar.getFloat("height"));
                bundle2.putFloat("x", this.ar.getFloat("x"));
                bundle2.putFloat("y", this.ar.getFloat("y"));
                bundle2.putInt("use_effect", 1);
                bundle2.putInt("int_value", 1);
                this.ai = 1;
                this.f115271b.f(199, 1);
            }
            this.f115271b.a(bundle2);
        }
    }

    private void F() {
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z4;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        boolean z5;
        boolean z6;
        int i33;
        int i34;
        int i35;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        boolean z7;
        boolean z8;
        boolean z9;
        com.ss.android.ugc.aweme.player.sdk.a.a("ensurePlayer");
        if (this.f115271b == null) {
            SparseIntArray sparseIntArray = this.P;
            if (sparseIntArray != null) {
                if (sparseIntArray.get(1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i8 = this.P.get(0);
                i14 = this.P.get(2);
                i5 = this.P.get(3);
                i9 = this.P.get(4);
                i11 = this.P.get(5);
                i20 = this.P.get(6);
                i21 = this.P.get(80);
                if (this.P.get(18) == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                i12 = this.P.get(28);
                i32 = this.P.get(23);
                i33 = this.P.get(26);
                i34 = this.P.get(27);
                if (this.P.get(42) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.P.indexOfKey(62) < 0 || this.P.get(62) == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (this.P.get(66) == 1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                i7 = this.P.get(43);
                i4 = this.P.get(44);
                this.ah = this.P.get(45);
                i2 = this.P.get(47);
                i3 = this.P.get(55);
                i26 = this.P.get(57);
                i25 = this.P.get(58);
                i24 = this.P.get(82);
                i23 = this.P.get(83);
                i10 = this.P.get(51, 0);
                i13 = this.P.get(52, 0);
                i6 = this.P.get(59, 0);
                i22 = this.P.get(60);
                i19 = this.P.get(84);
                i35 = this.P.get(85);
                i18 = this.P.get(86);
                this.aj = this.P.get(61);
                i17 = this.P.get(68);
                i16 = this.P.get(63);
                i27 = this.P.get(64);
                i28 = this.P.get(65);
                i29 = this.P.get(69);
                i30 = this.P.get(70);
                i31 = this.P.get(71);
                i15 = this.P.get(81);
            } else {
                z2 = false;
                i2 = 0;
                i3 = 0;
                i4 = 1;
                i5 = 1000;
                i6 = 0;
                i7 = 0;
                i8 = 0;
                i9 = 5000;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                i14 = 1;
                i15 = 0;
                z3 = false;
                i16 = 0;
                i17 = 0;
                i18 = 0;
                i19 = 0;
                i20 = 0;
                i21 = 0;
                z4 = false;
                i22 = 0;
                i23 = 90;
                i24 = 0;
                i25 = 0;
                i26 = 0;
                i27 = 0;
                i28 = 0;
                i29 = 0;
                i30 = 0;
                i31 = 0;
                i32 = 0;
                z5 = true;
                z6 = true;
                i33 = 0;
                i34 = 0;
                i35 = 1;
            }
            SparseArray sparseArray = this.f115272c;
            if (sparseArray == null || sparseArray.size() <= 0) {
                f2 = 0.0f;
                f3 = 0.0f;
                f4 = 0.0f;
                f5 = 0.0f;
                f6 = 0.0f;
            } else {
                if (this.f115272c.get(29) != null) {
                    f3 = ((Float) this.f115272c.get(29)).floatValue();
                } else {
                    f3 = 0.0f;
                }
                if (this.f115272c.get(30) != null) {
                    f4 = ((Float) this.f115272c.get(30)).floatValue();
                } else {
                    f4 = 0.0f;
                }
                if (this.f115272c.get(31) != null) {
                    f5 = ((Float) this.f115272c.get(31)).floatValue();
                } else {
                    f5 = 0.0f;
                }
                if (this.f115272c.get(32) != null) {
                    f6 = ((Float) this.f115272c.get(32)).floatValue();
                } else {
                    f6 = 0.0f;
                }
                if (this.f115272c.get(67) != null) {
                    f2 = ((Float) this.f115272c.get(67)).floatValue();
                } else {
                    f2 = 0.0f;
                }
            }
            com.ss.ttvideoengine.s.j.a(i20);
            if (i20 == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            I = z7;
            if (com.ss.android.ugc.playerkit.exp.b.p()) {
                com.ss.ttvideoengine.s.j.b(i21);
            }
            if (1 == this.f115276g.v) {
                H();
            }
            aj ajVar = new aj(this.J, i8);
            this.f115271b = ajVar;
            this.f115281m = 0;
            this.L.set(ajVar);
            if (i8 == 1) {
                this.f115271b.f(117, 1);
            }
            if (z4) {
                this.f115271b.f(216, 1);
            }
            this.f115271b.f(415, 1);
            this.f115271b.f(4, i14);
            this.f115271b.f(550, i13);
            this.f115271b.f(27, i10);
            if (i10 > 0) {
                this.f115271b.f(550, 1);
            }
            if (G()) {
                this.f115271b.a(new int[]{44100});
            }
            this.f115271b.f(664, i6);
            this.f115271b.a(this.am);
            this.f115271b.a(this.an);
            if (1 == i6) {
                this.f115271b.X = this.al;
            }
            this.f115271b.R = new z() {
                /* class com.ss.android.ugc.aweme.player.sdk.a.m.AnonymousClass12 */

                static {
                    Covode.recordClassIndex(74039);
                }

                @Override // com.ss.ttvideoengine.z
                public final void a(w wVar, int i2) {
                    m.this.B.a(f.a(wVar), i2);
                }
            };
            this.f115271b.a(new bf() {
                /* class com.ss.android.ugc.aweme.player.sdk.a.m.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(74040);
                }

                @Override // com.ss.ttvideoengine.bf
                public final boolean a(com.ss.ttvideoengine.j.p pVar) {
                    m.this.f115277h = pVar;
                    m.this.f115105a.f115318i = new p(pVar);
                    return false;
                }
            });
            if (!z2) {
                if (this.M) {
                    this.f115271b.f(7, 1);
                }
                this.f115271b.f(118, i5);
                this.f115271b.f(202, i9);
                this.f115271b.f(206, i11);
                this.f115271b.f(11, 0);
                this.f115271b.f(204, 1);
                this.f115271b.f(12, 0);
                this.f115271b.f(213, 1);
                this.f115271b.f(329, i12);
                this.f115271b.f(498, i7);
                this.f115271b.f(509, i4);
                this.f115271b.f(198, i2);
                this.f115271b.f(543, i3);
                this.f115271b.f(551, i26);
                this.f115271b.f(552, i25);
                this.f115271b.f(575, i24);
                if (i24 == 1) {
                    this.f115271b.f(576, i23);
                }
                this.f115271b.f(557, i22);
                this.f115271b.f(577, i19);
                this.f115271b.f(578, i35);
                this.f115271b.f(580, i18);
                this.f115271b.a(535, f2);
                this.f115271b.f(525, i17);
                int i36 = this.aj;
                if (i36 > 0) {
                    this.f115271b.f(602, i36);
                }
                this.f115271b.f(371, i16);
                this.f115271b.f(560, i27);
                this.f115271b.f(561, i28);
                this.f115271b.f(564, i29);
                this.f115271b.f(565, i30);
                this.f115271b.f(669, i31);
                this.f115271b.f(800, i15);
                if (i12 == 1) {
                    this.f115271b.a(325, f3);
                    this.f115271b.a(326, f4);
                    this.f115271b.a(327, f5);
                    this.f115271b.a(328, f6);
                }
                this.f115271b.f(322, i32);
                aj ajVar2 = this.f115271b;
                if (i33 == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                ajVar2.a(z8, i34);
                if (z3 && this.J != null) {
                    String str = b(this.J).getPath() + "/player/";
                    File file = new File(str);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    this.f115271b.b(z5);
                    this.f115271b.c(z6);
                    this.f115271b.b(this.f115276g.E, this.f115276g.F);
                    this.f115271b.d(this.f115276g.I);
                    this.f115271b.a(this.ah, str, "strKernelBinPath", "strOclModuleName");
                    if (com.ss.android.ugc.playerkit.exp.b.d()) {
                        Bundle bundle = new Bundle();
                        z9 = false;
                        bundle.putBoolean("srIsMaliSync", false);
                        this.f115271b.bt = bundle;
                    } else {
                        z9 = false;
                    }
                    this.f115271b.a(z9);
                    this.ag = true;
                }
                this.f115271b.a(new av() {
                    /* class com.ss.android.ugc.aweme.player.sdk.a.m.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(74041);
                    }

                    @Override // com.ss.ttvideoengine.av
                    public final void a(int i2) {
                        if (m.this.f115275f != null && i2 == 1) {
                            m.this.f115275f.a();
                        } else if (m.this.f115276g != null && m.this.f115276g.f148765l && m.this.B != null && i2 == 0) {
                            m.this.B.a(true);
                        }
                    }

                    @Override // com.ss.ttvideoengine.av
                    public final void b(int i2) {
                        if (m.this.f115275f != null && i2 == 1) {
                            m.this.f115275f.b();
                        } else if (m.this.f115276g != null && m.this.f115276g.f148765l && m.this.B != null && i2 == 0) {
                            m.this.B.a(false);
                        }
                    }
                });
                this.f115271b.O = new az() {
                    /* class com.ss.android.ugc.aweme.player.sdk.a.m.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(74042);
                    }

                    @Override // com.ss.ttvideoengine.az
                    public final void a(ba baVar) {
                        long j2;
                        if (!(baVar == null || !TextUtils.equals(baVar.f152316a, "mdlcacheend") || m.this.B == null)) {
                            m.this.B.g();
                        }
                        if (!(m.this.F == null || baVar == null || !"firstframe_split".equals(baVar.f152316a))) {
                            String str = baVar.f152322g;
                            if (baVar.f152318c != null && (baVar.f152318c instanceof JSONObject)) {
                                m.this.F.a(str, (JSONObject) baVar.f152318c);
                            }
                        }
                        if (m.this.F != null && baVar != null && !TextUtils.isEmpty(m.this.n)) {
                            if (("outsyncStartInfos".equals(baVar.f152316a) || "outsyncEndInfos".equals(baVar.f152316a)) && m.this.q) {
                                if (!TextUtils.equals(m.this.o, m.this.n)) {
                                    m mVar = m.this;
                                    mVar.o = mVar.n;
                                    m.this.p = new HashMap();
                                }
                                if (m.this.p != null) {
                                    if ("outsyncStartInfos".equals(baVar.f152316a)) {
                                        if (baVar.f152318c != null && (baVar.f152318c instanceof Map)) {
                                            m.this.r = System.currentTimeMillis();
                                        }
                                    } else if ("outsyncEndInfos".equals(baVar.f152316a) && baVar.f152318c != null && (baVar.f152318c instanceof Map)) {
                                        Map map = (Map) baVar.f152318c;
                                        if (m.this.p.isEmpty()) {
                                            m.this.p.put("min_out_sync_begin_pos", map.get("begin_pos"));
                                        }
                                        if (m.this.p.get("min_out_sync_end_pos") == null) {
                                            m.this.p.put("min_out_sync_end_pos", map.get("end_pos"));
                                        }
                                        if (m.this.p.get("out_sync_video_origin_fps") == null) {
                                            m.this.p.put("out_sync_video_origin_fps", map.get("container_fps"));
                                        }
                                        if (m.this.p.get("out_sync_video_render_fps") == null) {
                                            m.this.p.put("out_sync_video_render_fps", map.get("video_out_fps"));
                                        }
                                        int i2 = 0;
                                        if (m.this.p.get("out_sync_total_count") instanceof Integer) {
                                            i2 = ((Integer) m.this.p.get("out_sync_total_count")).intValue();
                                        }
                                        m.this.p.put("out_sync_total_count", Integer.valueOf(i2 + 1));
                                        if (m.this.r >= 0) {
                                            if (m.this.p.get("out_sync_total_duration") instanceof Long) {
                                                j2 = ((Long) m.this.p.get("out_sync_total_duration")).longValue();
                                            } else {
                                                j2 = 0;
                                            }
                                            long currentTimeMillis = System.currentTimeMillis() - m.this.r;
                                            m.this.r = -1;
                                            if (currentTimeMillis > 0) {
                                                m.this.p.put("out_sync_total_duration", Long.valueOf(j2 + currentTimeMillis));
                                            }
                                        }
                                        if (m.this.p.get("out_sync_max_decode_time") == null && (map.get("decode_time") instanceof Long)) {
                                            m.this.p.put("out_sync_max_decode_time", map.get("decode_time"));
                                        } else if (m.this.p.get("out_sync_max_decode_time") instanceof Long) {
                                            long longValue = ((Long) m.this.p.get("out_sync_max_decode_time")).longValue();
                                            if ((map.get("decode_time") instanceof Long) && ((Long) map.get("decode_time")).longValue() > longValue) {
                                                m.this.p.put("out_sync_max_decode_time", map.get("decode_time"));
                                            }
                                        }
                                        if (m.this.p.get("out_sync_clock_diff") == null && (map.get("clock_diff") instanceof Long)) {
                                            m.this.p.put("out_sync_clock_diff", map.get("clock_diff"));
                                        } else if (m.this.p.get("out_sync_clock_diff") instanceof Long) {
                                            long longValue2 = ((Long) m.this.p.get("out_sync_clock_diff")).longValue();
                                            if ((map.get("clock_diff") instanceof Long) && ((Long) map.get("clock_diff")).longValue() < longValue2) {
                                                m.this.p.put("out_sync_clock_diff", map.get("clock_diff"));
                                            }
                                        }
                                        if (m.this.p.get("out_sync_video_total_drop_count") == null && (map.get("render_drop_cnt") instanceof Integer)) {
                                            m.this.p.put("out_sync_video_total_drop_count", map.get("render_drop_cnt"));
                                        } else if (m.this.p.get("out_sync_video_total_drop_count") instanceof Integer) {
                                            int intValue = ((Integer) m.this.p.get("out_sync_video_total_drop_count")).intValue();
                                            if (map.get("render_drop_cnt") instanceof Integer) {
                                                m.this.p.put("out_sync_video_total_drop_count", Integer.valueOf(intValue + ((Integer) map.get("render_drop_cnt")).intValue()));
                                            }
                                        }
                                        m.this.F.a(m.this.n, m.this.p);
                                    }
                                }
                            }
                        }
                    }
                };
                e(2);
                FFmpegLibLoaderWrapper.b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final void a(n nVar) {
        this.f115275f = nVar;
    }

    class a extends ad {
        static {
            Covode.recordClassIndex(74048);
        }

        private a() {
        }

        @Override // com.ss.ttvideoengine.ad
        public final void a(int i2) {
            com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "Enter onSubLoadFinished: success=".concat(String.valueOf(i2)));
        }

        @Override // com.ss.ttvideoengine.ad
        public final void a(com.ss.ttvideoengine.s.c cVar) {
            com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "Enter onSubPathInfo: error = [" + cVar + "]");
            if (m.this.G != null && com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "onSubPathInfo: error = [" + cVar + "]");
            }
        }

        /* synthetic */ a(m mVar, byte b2) {
            this();
        }

        @Override // com.ss.ttvideoengine.ad
        public final void a(int i2, int i3) {
            m.this.w = true;
            m.this.y = SystemClock.elapsedRealtime();
            com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "Enter onSubSwitchCompleted: success=" + i2 + " subId=" + i3);
            if (m.this.G != null && com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "onSubSwitchCompleted: success=" + i2 + " subId=" + i3);
            }
        }

        @Override // com.ss.ttvideoengine.ad
        public final void b(int i2, String str) {
            m.this.y = SystemClock.elapsedRealtime();
            com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "Enter onSubLoadFinished2: success=" + i2 + ", info=" + str);
            if (m.this.G != null) {
                if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                    com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "onSubLoadFinished2: success=" + i2 + ", info=" + str);
                }
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        m.this.z = (long) jSONObject.getInt("first_pts");
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0083  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x009f  */
        @Override // com.ss.ttvideoengine.ad
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r19, java.lang.String r20) {
            /*
            // Method dump skipped, instructions count: 184
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.sdk.a.m.a.a(int, java.lang.String):void");
        }
    }

    class b implements ax {
        static {
            Covode.recordClassIndex(74049);
        }

        @Override // com.ss.ttvideoengine.ax
        public final void a(int i2) {
        }

        @Override // com.ss.ttvideoengine.ax
        public final void a(int i2, int i3, int i4) {
        }

        @Override // com.ss.ttvideoengine.ax
        public final void a(aj ajVar) {
        }

        @Override // com.ss.ttvideoengine.ax
        public final void a(aj ajVar, int i2) {
        }

        @Override // com.ss.ttvideoengine.ax
        public final void a(aj ajVar, int i2, int i3) {
        }

        @Override // com.ss.ttvideoengine.ax
        public final void a(com.ss.ttvideoengine.s.c cVar) {
        }

        @Override // com.ss.ttvideoengine.ax
        public final void b(int i2) {
        }

        @Override // com.ss.ttvideoengine.ax
        public final void b(aj ajVar) {
        }

        @Override // com.ss.ttvideoengine.ax
        public final void b(aj ajVar, int i2) {
        }

        @Override // com.ss.ttvideoengine.ax
        public final void c(aj ajVar) {
        }

        @Override // com.ss.ttvideoengine.ax
        public final void c(aj ajVar, int i2) {
        }

        @Override // com.ss.ttvideoengine.ax
        public final void d(aj ajVar) {
        }

        @Override // com.ss.ttvideoengine.ax
        public final void d(aj ajVar, int i2) {
        }

        @Override // com.ss.ttvideoengine.ax
        public final void e(aj ajVar) {
        }

        private b() {
        }

        @Override // com.ss.ttvideoengine.ax
        public final void c(int i2) {
            com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "Enter onInfoIdChanged: infoId=".concat(String.valueOf(i2)));
            if (m.this.H != null) {
                if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                    com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "Enter onInfoIdChanged: infoId=".concat(String.valueOf(i2)));
                }
                long currentTimeMillis = System.currentTimeMillis();
                int i3 = 300;
                String str = "";
                List<com.ss.android.ugc.aweme.player.sdk.b.a> list = m.this.u;
                if (list == null || list.isEmpty()) {
                    i3 = 300;
                } else {
                    for (com.ss.android.ugc.aweme.player.sdk.b.a aVar : list) {
                        if (!(aVar == null || aVar.f115327c == null || i2 != aVar.f115328d)) {
                            i3 = aVar.f115327c.intValue();
                            str = aVar.f115331g;
                        }
                    }
                }
                m.this.H.a(m.this.n, currentTimeMillis - m.this.t, i3, str);
            }
        }

        /* synthetic */ b(m mVar, byte b2) {
            this();
        }
    }

    public m(Context context) {
        this(context, (byte) 0);
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    private int d(int i2) {
        VideoSurface videoSurface;
        aj ajVar = this.f115271b;
        if (ajVar == null || (videoSurface = ajVar.bn) == null) {
            return 0;
        }
        return videoSurface.c(i2, 2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final void b(float f2) {
        this.aa = f2;
        this.ab.f152093d = f2;
        aj ajVar = this.f115271b;
        if (ajVar != null) {
            ajVar.a(this.ab);
        }
    }

    private static File b(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107195c;
        }
        File filesDir = context.getFilesDir();
        com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
        return filesDir;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final void c(boolean z2) {
        com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "Enter setSubtitlesEnable");
        if (this.f115271b != null) {
            com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "setSubtitlesEnable:".concat(String.valueOf(z2)));
            this.f115271b.f(534, z2 ? 1 : 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final void d(boolean z2) {
        com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "Enter setSubCallbackEnable");
        if (this.f115271b != null) {
            com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "setSubCallbackEnable callbackEnable:".concat(String.valueOf(z2)));
            this.f115271b.f(533, z2 ? 1 : 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final void b(int i2) {
        com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "Enter switchSubtitlesLaunage");
        if (this.f115271b != null) {
            com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "switchSubtitlesLaunage languageId:".concat(String.valueOf(i2)));
            this.A = i2;
            this.f115271b.f(530, i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final void c(int i2) {
        com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "Enter switchAudioLanguage");
        if (this.f115271b != null) {
            this.x = SystemClock.elapsedRealtime();
            com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "switchAudioLanguage languageId:".concat(String.valueOf(i2)));
            this.t = System.currentTimeMillis();
            this.f115271b.f(675, i2);
        }
    }

    private boolean b(Map<String, Object> map) {
        boolean z2;
        boolean z3;
        boolean z4;
        if (d.a(this.P, map)) {
            return false;
        }
        if (map != null) {
            z2 = ((Boolean) map.get("bytevc1")).booleanValue();
        } else {
            z2 = false;
        }
        SparseIntArray sparseIntArray = this.P;
        if (sparseIntArray == null || (sparseIntArray.indexOfKey(17) < 0 && this.P.indexOfKey(16) < 0)) {
            return this.M;
        }
        if (this.P.get(17, 0) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.P.get(16, 0) == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "bytevc1:" + z2 + ", bytevc1DecodeHardare:" + z3 + ", h264DecodeHardare:" + z4);
        }
        if (z2) {
            if (!z3) {
                return false;
            }
        } else if (z4) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    private void a(com.ss.android.ugc.playerkit.model.d dVar) {
        this.f115271b.f(500, dVar.f148717m);
        this.f115271b.f(501, dVar.n);
        this.f115271b.f(502, dVar.r);
        this.f115271b.f(504, dVar.o);
        this.f115271b.f(505, dVar.p);
        this.f115271b.f(506, dVar.q);
        this.f115271b.a(529, dVar.s);
        this.f115271b.a(527, dVar.t);
        this.f115271b.a(528, dVar.u);
    }

    private void b(com.ss.android.ugc.playerkit.model.g gVar) {
        if (!(gVar == null || gVar.f148729d == null)) {
            List<Bitmap> list = gVar.f148729d;
            List<Float> list2 = gVar.f148728c;
            Bundle bundle = new Bundle();
            bundle.putInt("action", 21);
            bundle.putInt("effect_type", 2);
            if (list.size() > 1) {
                HashMap hashMap = new HashMap();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    hashMap.put(Integer.valueOf(i2), list.get(i2));
                }
                bundle.putSerializable("lut_bitmap_multi", hashMap);
            } else {
                bundle.putParcelable("lut_bitmap", list.get(0));
            }
            if (list2 != null && !list2.isEmpty()) {
                if (list2.size() > 1) {
                    HashMap hashMap2 = new HashMap();
                    for (int i3 = 0; i3 < list2.size(); i3++) {
                        hashMap2.put(Integer.valueOf(i3), list2.get(i3));
                    }
                    bundle.putSerializable("strength_multi", hashMap2);
                } else {
                    bundle.putFloat("strength", list2.get(0).floatValue());
                }
            }
            bundle.putInt("use_effect", gVar.f148730e ? 1 : 0);
            this.f115271b.a(bundle);
        }
    }

    private void e(int i2) {
        List<com.ss.android.ugc.playerkit.model.f> list = this.f115276g.S;
        if (!(list == null || list.size() <= 0 || this.f115271b == null)) {
            for (com.ss.android.ugc.playerkit.model.f fVar : list) {
                if (fVar.f148723b != null && fVar.f148725d == i2) {
                    try {
                        if (fVar.f148724c == 1) {
                            this.f115271b.f(fVar.f148722a, ((Integer) fVar.f148723b).intValue());
                        } else if (fVar.f148724c == 2) {
                            this.f115271b.c(fVar.f148722a, ((Long) fVar.f148723b).longValue());
                        } else if (fVar.f148724c == 3) {
                            this.f115271b.a(fVar.f148722a, ((Float) fVar.f148723b).floatValue());
                        } else if (fVar.f148724c == 4) {
                            this.f115271b.d(fVar.f148722a, (String) fVar.f148723b);
                        } else if (fVar.f148724c == 5) {
                            this.f115271b.d(fVar.f148722a, ((JSONObject) fVar.f148723b).toString());
                        } else if (fVar.f148724c == 6) {
                            this.f115271b.d(fVar.f148722a, ((JSONArray) fVar.f148723b).toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final float a(int i2) {
        int i3;
        long j2;
        aj ajVar = this.f115271b;
        if (ajVar == null) {
            return -1.0f;
        }
        switch (i2) {
            case 0:
                if (this.aj <= 0 || this.s) {
                    i3 = ajVar.s();
                } else {
                    i3 = ajVar.t();
                }
                return (float) i3;
            case 1:
                i3 = ajVar.x;
                return (float) i3;
            case 2:
                return ajVar.c(71);
            case 3:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            default:
                return -1.0f;
            case 4:
                j2 = ajVar.m(62);
                return (float) j2;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                j2 = ajVar.m(61);
                return (float) j2;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                j2 = ajVar.m(60);
                return (float) j2;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                i3 = ajVar.l(42);
                return (float) i3;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                return ajVar.c(70);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                i3 = ajVar.l(660);
                return (float) i3;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                int i4 = this.ah;
                if (i4 == 1) {
                    return 2.0f;
                }
                if (i4 == 4) {
                    return 1.5f;
                }
                return 1.0f;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                i3 = ajVar.l(59);
                return (float) i3;
            case ABRConfig.ABR_SELECT_SCENE:
                try {
                    j2 = ajVar.m(64);
                    return (float) j2;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return -1.0f;
                }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.o
    public final void b(Surface surface) {
        aj ajVar = this.f115271b;
        if (ajVar != null) {
            com.ss.ttvideoengine.s.j.a("TTVideoEngine", "getSurface:" + ajVar.ab + ", this:" + ajVar);
            if (surface == ajVar.ab) {
                new StringBuilder("onSurfaceDestroyed sf: ").append(surface).append(", player: ").append(this).append(", engine: ").append(this.f115271b);
                this.f115271b.a((Surface) null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final void a(float f2) {
        try {
            aj ajVar = this.f115271b;
            if (ajVar != null) {
                double d2 = (double) f2;
                Double.isNaN(d2);
                double d3 = (double) ajVar.x;
                Double.isNaN(d3);
                int i2 = (int) (d2 * 0.01d * d3);
                j.c cVar = this.B;
                if (cVar != null) {
                    cVar.a(i2, f2);
                }
                this.f115271b.a(i2, this);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j, com.ss.android.ugc.aweme.player.sdk.a.a
    public final void b(String str) {
        aj ajVar = this.L.get();
        if (ajVar != null && ajVar.ae != null && !TextUtils.isEmpty(str)) {
            if (str.length() > 512) {
                str = str.substring(0, 512);
                com.ss.ttvideoengine.s.j.a("TTVideoEngine", "customStr too long to be truncated!");
            }
            ajVar.ae.d(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final void b(boolean z2) {
        SparseIntArray sparseIntArray;
        if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
            com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "reset  mPlayer = " + this.f115271b);
        }
        this.ab.f152093d = -1.0f;
        this.f115271b.a(this.ab);
        boolean z3 = true;
        if (z2 || (((sparseIntArray = this.P) == null || sparseIntArray.get(34) != 1) && !this.T)) {
            z3 = false;
        }
        this.af.a();
        if (!z3) {
            this.f115271b.a((bb) null);
            this.L.set(null);
            this.f115271b.n();
            this.f115271b.a((Surface) null);
            this.f115271b = null;
            this.ak = false;
            this.ai = 0;
            F();
        } else {
            this.f115271b.l();
            this.f115271b.a((Surface) null);
        }
        this.f115274e = null;
        this.f115277h = null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final void a(com.ss.android.ugc.playerkit.model.d dVar, Map<String, Object> map) {
        a(dVar, null, map, true);
    }

    private m(Context context, byte b2) {
        this(context, (char) 0);
    }

    private m(Context context, char c2) {
        this(context, false, null, null, null);
    }

    private static void a(aj ajVar, boolean z2) {
        if (z2) {
            ajVar.a("X-Preload-Reuse", "1");
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9260);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(9260);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.j
    public final void a(float f2, float f3) {
        try {
            aj ajVar = this.f115271b;
            if (ajVar != null) {
                ajVar.a(f2, f3);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public m(Context context, boolean z2, SparseIntArray sparseIntArray, SparseArray sparseArray, com.ss.android.ugc.playerkit.model.m mVar) {
        this.U = new d();
        this.aa = -1.0f;
        this.ah = 1;
        this.f115281m = -1;
        this.ai = 0;
        this.aj = 0;
        this.q = false;
        this.r = 0;
        this.s = false;
        this.t = 0;
        this.u = null;
        this.v = false;
        this.w = false;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.al = new com.ss.ttvideoengine.o() {
            /* class com.ss.android.ugc.aweme.player.sdk.a.m.AnonymousClass1 */

            static {
                Covode.recordClassIndex(74036);
            }

            @Override // com.ss.ttvideoengine.o
            public final void a(long j2) {
                com.ss.android.ugc.playerkit.model.h hVar = new com.ss.android.ugc.playerkit.model.h();
                hVar.f148733b = 5;
                hVar.f148734c = j2;
                hVar.f148735d = j2;
                m.this.B.a(5, com.ss.android.ugc.playerkit.model.h.a(hVar));
            }

            @Override // com.ss.ttvideoengine.o
            public final void b(long j2, long j3) {
                com.ss.android.ugc.playerkit.model.h hVar = new com.ss.android.ugc.playerkit.model.h();
                hVar.f148733b = 4;
                hVar.f148734c = j2;
                hVar.f148735d = j3;
                m.this.B.a(4, com.ss.android.ugc.playerkit.model.h.a(hVar));
            }

            @Override // com.ss.ttvideoengine.o
            public final void c(long j2, long j3) {
                com.ss.android.ugc.playerkit.model.h hVar = new com.ss.android.ugc.playerkit.model.h();
                hVar.f148733b = 6;
                hVar.f148734c = j2;
                hVar.f148735d = j3;
                m.this.B.a(6, com.ss.android.ugc.playerkit.model.h.a(hVar));
            }

            @Override // com.ss.ttvideoengine.o
            public final void d(long j2, long j3) {
                com.ss.android.ugc.playerkit.model.h hVar = new com.ss.android.ugc.playerkit.model.h();
                hVar.f148733b = 2;
                hVar.f148734c = j2;
                hVar.f148735d = j3;
                m.this.B.a(2, com.ss.android.ugc.playerkit.model.h.a(hVar));
            }

            @Override // com.ss.ttvideoengine.o
            public final void e(long j2, long j3) {
                com.ss.android.ugc.playerkit.model.h hVar = new com.ss.android.ugc.playerkit.model.h();
                hVar.f148733b = 3;
                hVar.f148734c = j2;
                hVar.f148735d = j3;
                m.this.B.a(3, com.ss.android.ugc.playerkit.model.h.a(hVar));
            }

            @Override // com.ss.ttvideoengine.o
            public final void a(long j2, long j3) {
                com.ss.android.ugc.playerkit.model.h hVar = new com.ss.android.ugc.playerkit.model.h();
                hVar.f148733b = 1;
                hVar.f148734c = j2;
                hVar.f148735d = j3;
                m.this.B.a(1, com.ss.android.ugc.playerkit.model.h.a(hVar));
            }
        };
        this.am = new bc() {
            /* class com.ss.android.ugc.aweme.player.sdk.a.m.AnonymousClass5 */

            static {
                Covode.recordClassIndex(74043);
            }

            @Override // com.ss.ttvideoengine.ax, com.ss.ttvideoengine.bc
            public final void e(aj ajVar) {
                if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                    com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "onReadyForDisplay() called with: engine = [" + ajVar + "]");
                }
                m.this.B.b();
            }
        };
        this.an = new bb() {
            /* class com.ss.android.ugc.aweme.player.sdk.a.m.AnonymousClass6 */

            static {
                Covode.recordClassIndex(74044);
            }

            @Override // com.ss.ttvideoengine.bb
            public final void a(aj ajVar) {
                if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                    com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "onPrepare() called with: engine = [" + ajVar + "]");
                }
                SystemClock.elapsedRealtime();
                if (m.this.B != null) {
                    m.this.B.e();
                }
            }

            @Override // com.ss.ttvideoengine.bb
            public final void d(aj ajVar) {
                if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                    com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "onCompletion() called with: engine = [" + ajVar + "]");
                }
                m.this.B.d();
            }

            /* JADX WARNING: Removed duplicated region for block: B:17:0x001f  */
            @Override // com.ss.ttvideoengine.bb
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(int r4) {
                /*
                    r3 = this;
                    r0 = 3
                    if (r4 == r0) goto L_0x0045
                    r0 = 4
                    if (r4 == r0) goto L_0x0045
                    r0 = 20
                    if (r4 == r0) goto L_0x0045
                    r0 = 30
                    if (r4 == r0) goto L_0x0045
                    r0 = 40
                    if (r4 == r0) goto L_0x0042
                    r0 = 1000(0x3e8, float:1.401E-42)
                    if (r4 == r0) goto L_0x0045
                    r0 = 1002(0x3ea, float:1.404E-42)
                    if (r4 == r0) goto L_0x0042
                    r2 = 0
                L_0x001b:
                    boolean r0 = com.ss.android.ugc.aweme.player.sdk.a.f115103a
                    if (r0 == 0) goto L_0x0039
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r0 = "onVideoStatusException() called with: status = ["
                    r1.<init>(r0)
                    java.lang.StringBuilder r1 = r1.append(r4)
                    java.lang.String r0 = "]"
                    java.lang.StringBuilder r0 = r1.append(r0)
                    java.lang.String r1 = r0.toString()
                    java.lang.String r0 = "TTPlayer"
                    com.ss.android.ugc.aweme.player.sdk.a.a(r0, r1)
                L_0x0039:
                    com.ss.android.ugc.aweme.player.sdk.a.m r0 = com.ss.android.ugc.aweme.player.sdk.a.m.this
                    com.ss.android.ugc.aweme.player.sdk.api.j$c r1 = r0.B
                    r0 = 0
                    r1.a(r0, r0, r2)
                    return
                L_0x0042:
                    java.lang.String r2 = "Video deleted, play failed."
                    goto L_0x001b
                L_0x0045:
                    java.lang.String r2 = "Transcoding, play failed."
                    goto L_0x001b
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.sdk.a.m.AnonymousClass6.a(int):void");
            }

            @Override // com.ss.ttvideoengine.bb
            public final void b(aj ajVar) {
                if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                    com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "onPrepared() called with: engine = [" + ajVar + "]");
                }
                SystemClock.elapsedRealtime();
                m.this.x = SystemClock.elapsedRealtime();
                m.this.B.a();
                if (TextUtils.isEmpty(m.this.f115274e) && m.this.f115271b != null) {
                    m mVar = m.this;
                    mVar.f115274e = mVar.f115271b.r();
                }
                if (m.this.f115278i) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - m.this.f115279j;
                    if (m.this.E != null) {
                        m.this.E.d(elapsedRealtime);
                        m.this.E.b();
                    }
                } else if (m.f115270k) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - m.this.f115280l;
                    if (m.this.F != null) {
                        m.this.F.a(elapsedRealtime2);
                    }
                }
            }

            @Override // com.ss.ttvideoengine.bb
            public final void c(aj ajVar) {
                if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                    com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "onRenderStart() called with: engine = [" + ajVar + "] mFromResume:" + m.this.f115273d);
                }
                SystemClock.elapsedRealtime();
                if (m.this.f115273d) {
                    m.this.B.f();
                    return;
                }
                if (m.this.f115271b != null) {
                    m.this.f115105a.f115310a = m.this.f115271b.l(43);
                    m.this.f115105a.f115312c = m.this.f115271b.l(45);
                    m.this.f115105a.f115313d = m.this.f115271b.l(47);
                    m.this.f115105a.f115320k = m.this.f115271b.l(371);
                    m.this.f115105a.f115319j = m.this.B();
                    m.this.f115105a.f115321l = m.this.f115281m;
                    m.this.f115105a.f115322m = m.this.f115271b.l(667);
                    if (m.this.f115271b.ae != null) {
                        m.this.f115105a.n = m.this.f115271b.ae.o();
                    }
                }
                if (m.this.f115278i) {
                    m.this.f115278i = false;
                    long elapsedRealtime = SystemClock.elapsedRealtime() - m.this.f115279j;
                    if (m.this.E != null) {
                        m.this.E.e(elapsedRealtime);
                        m.this.E.e();
                    }
                } else if (m.f115270k) {
                    m.f115270k = false;
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - m.this.f115280l;
                    if (m.this.F != null) {
                        m.this.F.b(elapsedRealtime2);
                    }
                }
                m.this.q = true;
                m.this.B.c();
            }

            @Override // com.ss.ttvideoengine.bb
            public final void a(com.ss.ttvideoengine.s.c cVar) {
                if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                    com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "onError() called with: error = [" + cVar + "]");
                }
                m.this.B.a(cVar.f153260a, cVar.f153261b, cVar);
            }

            @Override // com.ss.ttvideoengine.bb
            public final void d(aj ajVar, int i2) {
                if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                    com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "onStreamChanged() called with: type = [" + i2 + "]");
                }
            }

            @Override // com.ss.ttvideoengine.bb
            public final void b(aj ajVar, int i2) {
                if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                    com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "onLoadStateChanged() called with: engine = [" + ajVar + "], loadState = [" + i2 + "]");
                }
                if (m.this.f115276g != null && !m.this.f115276g.f148765l) {
                    if (i2 == 2) {
                        m.this.B.a(true);
                    } else if (i2 == 1) {
                        m.this.B.a(false);
                    }
                }
            }

            @Override // com.ss.ttvideoengine.bb
            public final void c(aj ajVar, int i2) {
                if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                    com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "onBufferingUpdate() called with: engine = [" + ajVar + "], percent = [" + i2 + "]");
                }
                long r = (long) (((float) m.this.r()) * (((float) i2) / 100.0f));
                m.this.B.a(r);
                m.this.B.a(r, i2);
            }

            @Override // com.ss.ttvideoengine.bb
            public final void a(aj ajVar, int i2) {
                if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                    com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "onPlaybackStateChanged() called with: engine = [" + ajVar + "], playbackState = [" + i2 + "]");
                }
                if (m.this.B == null) {
                    return;
                }
                if (i2 == 1) {
                    m.this.B.h();
                } else if (i2 == 0) {
                    m.this.B.j();
                } else if (i2 == 2) {
                    m.this.B.i();
                }
            }

            @Override // com.ss.ttvideoengine.bb
            public final void a(aj ajVar, int i2, int i3) {
                if (com.ss.android.ugc.aweme.player.sdk.a.f115103a) {
                    com.ss.android.ugc.aweme.player.sdk.a.a("TTPlayer", "onVideoSizeChanged() called with: engine = [" + ajVar + "], width = [" + i2 + "], height = [" + i3 + "]");
                }
                m.this.f115105a.f115314e = i2;
                m.this.f115105a.f115315f = i3;
            }
        };
        this.B = new j.a();
        this.aq = false;
        this.as = 0;
        this.G = null;
        this.H = null;
        this.aw = new a(this, (byte) 0);
        this.ax = new b(this, (byte) 0);
        this.J = context;
        this.M = z2;
        this.P = sparseIntArray;
        this.f115272c = sparseArray;
        this.K = Thread.currentThread().getId();
        this.L = new AtomicReference<>(null);
        this.f115276g = mVar;
        this.ab = new p();
        this.af = new c();
        F();
    }
}
