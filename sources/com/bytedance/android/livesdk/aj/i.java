package com.bytedance.android.livesdk.aj;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.e;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.i.a.c;
import com.bytedance.android.live.i.b.b;
import com.bytedance.android.live.n.k;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.d.b;
import com.bytedance.android.livesdk.ab.h;
import com.bytedance.android.livesdk.aj.g;
import com.bytedance.android.livesdk.aj.n;
import com.bytedance.android.livesdk.chatroom.g.d;
import com.bytedance.android.livesdk.j.cx;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableReusePlayerWithoutFirstFrameSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFirstFrameCallbackInsertMqHeadSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveUseSurfaceViewExperiment;
import com.bytedance.android.livesdk.livesetting.watchlive.MtPlayerInvokeStopBeforePlaySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.ShowAudienceDefinitionSelectionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveMultiPlayerEnableSetting;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.c.a;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.android.livesdkapi.depend.d.q;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.android.livesdkapi.view.SurfaceRenderView;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.bytedance.android.livesdkapi.view.TextureViewWrapper;
import com.bytedance.common.utility.l;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class i implements k, b, g.a, g.b, a.AbstractC0502a {

    /* renamed from: l  reason: collision with root package name */
    private static final g.d f13833l = new g.d.a().a();
    private final Context A;
    private final IHostPlugin B;
    private final f C;
    private String D = "";
    private boolean E = true;
    private boolean F;
    private boolean G;
    private boolean H = true;
    private boolean I;
    private final TextureView.SurfaceTextureListener J = new TextureView.SurfaceTextureListener() {
        /* class com.bytedance.android.livesdk.aj.i.AnonymousClass1 */

        static {
            Covode.recordClassIndex(7697);
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            d.a("LivePlayController", "onSurfaceTextureDestroyed");
            if (i.this.f13834a != null && i.this.f13841h) {
                i.this.f13834a.a((SurfaceHolder) null);
            }
            return i.this.f13841h;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
            d.b("LivePlayController", "onSurfaceTextureSizeChanged -> width: " + i2 + ",height: " + i3 + ",");
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
            d.a("LivePlayController", "onSurfaceTextureAvailable");
            if (i.this.f13838e != null) {
                i.this.f13838e.setSurfaceTextureListener(null);
            }
            i.this.p();
            if (((i.this.f13835b instanceof TextureRenderView) || (i.this.f13835b instanceof TextureViewWrapper)) && i.this.f13841h) {
                if (i.this.f13836c != null) {
                    i.this.f13836c.release();
                }
                i.this.f13836c = new Surface(surfaceTexture);
                i.this.g(true);
            }
        }
    };
    private final SurfaceHolder.Callback K = new SurfaceHolder.Callback() {
        /* class com.bytedance.android.livesdk.aj.i.AnonymousClass2 */

        static {
            Covode.recordClassIndex(7698);
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            d.b("LivePlayController", "surfaceDestroyed");
            if (i.this.f13834a != null) {
                i.this.f13834a.a((SurfaceHolder) null);
            }
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            d.b("LivePlayController", "surfaceCreated");
            if (i.this.f13836c != null) {
                i.this.f13836c.release();
                i.this.f13836c = null;
            }
            i.this.f13837d = surfaceHolder;
            i.this.g(true);
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            d.b("LivePlayController", "surfaceChanged -> width: " + i3 + ",height: " + i4 + ",");
        }
    };
    private long L;
    private String M = "";
    private com.bytedance.android.livesdkapi.depend.model.c.a N = null;

    /* renamed from: a  reason: collision with root package name */
    public g f13834a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.view.d f13835b;

    /* renamed from: c  reason: collision with root package name */
    public Surface f13836c;

    /* renamed from: d  reason: collision with root package name */
    public SurfaceHolder f13837d;

    /* renamed from: e  reason: collision with root package name */
    public TextureView f13838e;

    /* renamed from: f  reason: collision with root package name */
    final n f13839f;

    /* renamed from: g  reason: collision with root package name */
    SoftReference<c> f13840g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f13841h = true;

    /* renamed from: i  reason: collision with root package name */
    boolean f13842i = LiveMultiPlayerEnableSetting.INSTANCE.getValue();

    /* renamed from: j  reason: collision with root package name */
    com.bytedance.android.livesdkapi.depend.d.k f13843j;

    /* renamed from: k  reason: collision with root package name */
    final Map<String, String> f13844k = new ConcurrentHashMap();

    /* renamed from: m  reason: collision with root package name */
    private boolean f13845m;
    private int n;
    private TextureView.SurfaceTextureListener o;
    private String p = "";
    private String q = "";
    private String r = "";
    private String s;
    private g.d t = f13833l;
    private boolean u;
    private final com.bytedance.android.livesdkapi.depend.c.a v;
    private g.c w;
    private volatile int x;
    private int y;
    private com.bytedance.android.livesdkapi.depend.model.live.i z;

    @Override // com.bytedance.android.live.n.k
    public final String b() {
        return this.D;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final int k() {
        return this.x;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final String m() {
        return this.p;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final String n() {
        return this.q;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final void a(String str, String str2, com.bytedance.android.livesdkapi.view.d dVar, int i2, g.d dVar2, g.c cVar) {
        a(str, str2, dVar, i2, dVar2, cVar, (String) null);
    }

    @Override // com.bytedance.android.live.n.k
    public final void a(String str, String str2, com.bytedance.android.livesdkapi.view.d dVar, int i2, g.d dVar2, g.c cVar, String str3) {
        if (str == null) {
            r();
            if (this.f13834a != null) {
                d.a("LivePlayController", "the method to reset player -> wanna start play, but stream data is empty");
                this.f13834a.a();
                return;
            }
            return;
        }
        this.M = "";
        this.p = "";
        if (this.f13841h) {
            d.a("LivePlayController", "start player -> reset controller`s pullStreamData");
            this.q = "";
        }
        this.z = com.bytedance.android.livesdkapi.depend.model.live.i.valueOf(i2);
        if (dVar != null) {
            b(dVar);
        }
        if (str3 != null) {
            this.D = str3;
        }
        this.w = cVar;
        this.u = true;
        boolean z2 = !m.a(this.q, str);
        this.q = str;
        this.r = str2;
        if (dVar2 == null) {
            dVar2 = f13833l;
        }
        this.t = dVar2;
        if (this.f13834a == null) {
            s();
        } else if (this.f13845m) {
            s();
        }
        if (this.G) {
            this.f13834a.a(1);
        } else {
            this.f13834a.a(0);
        }
        this.f13834a.a(this, this);
        this.f13834a.a(this.N);
        C();
        d.a("LivePlayController", "start player -> playerTag: " + str3 + " ,mPlayContextTag: " + this.D);
        if (z2 || !A()) {
            if (this.f13841h || !EnableReusePlayerWithoutFirstFrameSetting.INSTANCE.getValue()) {
                if (z2) {
                    this.y = 0;
                }
                u();
            }
        } else if (z()) {
            d.a("LivePlayController", "start player -> share player reuse stream");
            com.bytedance.android.livesdkapi.view.d dVar3 = this.f13835b;
            if (dVar3 instanceof SurfaceRenderView) {
                this.f13834a.a(this.f13837d);
            } else if ((dVar3 instanceof TextureRenderView) || (dVar3 instanceof TextureViewWrapper)) {
                this.f13834a.a(this.f13836c);
            }
            if (!this.f13834a.g()) {
                d.a("LivePlayController", "start player -> fallback: live player start pulling");
                this.f13834a.c();
            }
            if (B()) {
                this.v.obtainMessage(g.b.DISPLAYED_PLAY.ordinal(), "all is ready and start render.").sendToTarget();
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final void a(String str, com.bytedance.android.livesdkapi.view.d dVar, int i2, g.d dVar2, g.c cVar, String str2) {
        a(str, dVar, i2, dVar2, cVar, str2, (String) null);
    }

    @Override // com.bytedance.android.live.n.k
    public final void a(String str, com.bytedance.android.livesdkapi.view.d dVar, int i2, g.d dVar2, g.c cVar, String str2, String str3) {
        if (str == null) {
            r();
            if (this.f13834a != null) {
                d.a("LivePlayController", "the method to reset player -> wanna start play, but stream data is empty");
                this.f13834a.a();
                return;
            }
            return;
        }
        this.M = "";
        this.p = "";
        this.q = "";
        this.z = com.bytedance.android.livesdkapi.depend.model.live.i.valueOf(i2);
        if (dVar != null) {
            b(dVar);
        }
        if (str3 != null) {
            this.D = str3;
        }
        g.c cVar2 = this.w;
        if (cVar2 != null) {
            cVar2.a(g.b.PLAYER_DETACHED, null);
        }
        this.w = cVar;
        this.u = true;
        boolean h2 = h(str);
        this.p = str;
        this.s = str2;
        if (dVar2 == null) {
            dVar2 = f13833l;
        }
        this.t = dVar2;
        if (this.f13834a == null) {
            s();
        } else if (this.f13845m) {
            s();
        }
        if (this.G) {
            this.f13834a.a(1);
        } else {
            this.f13834a.a(0);
        }
        this.f13834a.a(this, this);
        this.f13834a.a(this.N);
        C();
        d.a("LivePlayController", "start player -> playerTag: " + str3 + " ,mPlayContextTag: " + this.D);
        if (h2 || !A()) {
            if (this.f13841h || !EnableReusePlayerWithoutFirstFrameSetting.INSTANCE.getValue()) {
                if (h2) {
                    this.y = 0;
                }
                u();
            }
        } else if (z()) {
            com.bytedance.android.livesdkapi.view.d dVar3 = this.f13835b;
            if (dVar3 instanceof SurfaceRenderView) {
                this.f13834a.a(this.f13837d);
            } else if ((dVar3 instanceof TextureRenderView) || (dVar3 instanceof TextureViewWrapper)) {
                this.f13834a.a(this.f13836c);
            }
            d.a("LivePlayController", "start player -> share player or reuse stream");
            if (!this.f13834a.g()) {
                d.a("LivePlayController", "start player -> fallback: live player start pulling");
                this.f13834a.c();
            }
            if (B()) {
                this.v.obtainMessage(g.b.DISPLAYED_PLAY.ordinal(), "all is ready and start render.").sendToTarget();
            }
        }
    }

    @Override // com.bytedance.android.live.n.k
    public final void a(Map<String, String> map) {
        this.f13844k.clear();
        this.f13844k.putAll(map);
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final void a(boolean z2, Context context) {
        a(z2, g.a.a(context));
    }

    @Override // com.bytedance.android.live.n.k
    public final void a(boolean z2, String str) {
        g gVar;
        d.a("LivePlayController", "setMute " + z2 + "-> playerTag: " + str + " ,mPlayContextTag" + this.D + " ,controller: " + hashCode());
        if (TextUtils.equals(str, this.D) && (gVar = this.f13834a) != null) {
            gVar.a(z2);
        }
    }

    @Override // com.bytedance.android.live.n.k
    public final boolean a() {
        g gVar = this.f13834a;
        if (gVar != null) {
            Point i2 = gVar.i();
            if (i2.x > i2.y) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.n.k
    public final void a(boolean z2) {
        this.F = z2;
        y();
    }

    @Override // com.bytedance.android.live.n.k
    public final void a(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            if (jSONObject.has("player_type")) {
                if (this.f13834a instanceof u) {
                    try {
                        jSONObject.put("new_sdk", true);
                    } catch (JSONException e2) {
                        com.bytedance.android.live.core.c.a.a("LivePlayController", e2);
                    }
                } else {
                    try {
                        jSONObject.put("new_sdk", false);
                    } catch (JSONException e3) {
                        com.bytedance.android.live.core.c.a.a("LivePlayController", e3);
                    }
                }
            }
            try {
                for (Map.Entry<String, String> entry : this.f13844k.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        a(jSONObject);
        n nVar = this.f13839f;
        h.a().a(new n.b(nVar.f13867c, nVar.f13868d, nVar.f13866b, nVar.f13869e, nVar.f13870f, jSONObject, str, (byte) 0));
    }

    /* access modifiers changed from: package-private */
    public final void a(JSONObject jSONObject) {
        String optString = jSONObject.optString("cdn_play_url");
        if (!TextUtils.isEmpty(optString) && !TextUtils.equals(optString, "none")) {
            if (TextUtils.isEmpty(this.M)) {
                this.M = optString;
            } else if (!TextUtils.equals(this.M, optString)) {
                s.a(jSONObject, this.M, this.p, this.q, this.r, this.s);
            }
        }
    }

    private boolean A() {
        if ((this.n & 1) > 0) {
            return true;
        }
        return false;
    }

    private boolean B() {
        if ((this.n & 4) > 0) {
            return true;
        }
        return false;
    }

    private boolean z() {
        if ((this.n & 2) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.n.k
    public final void d() {
        n nVar = this.f13839f;
        nVar.f13865a = false;
        nVar.f13866b = 0.0f;
    }

    @Override // com.bytedance.android.livesdk.ab.d.b, com.bytedance.android.live.n.k
    public final JSONObject e() {
        g gVar = this.f13834a;
        if (gVar != null) {
            return gVar.j();
        }
        return new JSONObject();
    }

    @Override // com.bytedance.android.live.n.k
    public final String g() {
        g gVar = this.f13834a;
        if (gVar != null) {
            return gVar.k();
        }
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final View o() {
        com.bytedance.android.livesdkapi.view.d dVar = this.f13835b;
        if (dVar instanceof View) {
            return (View) dVar;
        }
        return null;
    }

    static {
        Covode.recordClassIndex(7696);
    }

    private void v() {
        if (!ShowAudienceDefinitionSelectionSetting.INSTANCE.isEnable()) {
            return;
        }
        if (this.z == com.bytedance.android.livesdkapi.depend.model.live.i.THIRD_PARTY || this.z == com.bytedance.android.livesdkapi.depend.model.live.i.SCREEN_RECORD) {
            this.f13834a.e(!this.I);
        }
    }

    private void y() {
        g gVar = this.f13834a;
        if (gVar != null) {
            if (!this.E) {
                gVar.a(0);
            } else if (this.F) {
                gVar.a(3);
            } else {
                gVar.a(2);
            }
        }
    }

    @Override // com.bytedance.android.live.n.k
    public final void c() {
        n nVar = this.f13839f;
        nVar.f13865a = true;
        nVar.f13867c = y.b();
        nVar.f13868d = y.c();
        h.a().a(new q(nVar));
    }

    @Override // com.bytedance.android.livesdk.aj.g.b
    public final void h() {
        d.a("LivePlayController", "player callback onStartPulling()");
        g.c cVar = this.w;
        if (cVar instanceof g.e) {
            try {
                ((g.e) cVar).a();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.android.livesdk.aj.g.b
    public final void i() {
        d.b("LivePlayController", "player callback onFirstFrame()");
        com.bytedance.android.livesdkapi.depend.d.k kVar = this.f13843j;
        if (kVar != null) {
            kVar.e();
        }
        g.c cVar = this.w;
        if (cVar instanceof g.e) {
            try {
                ((g.e) cVar).b();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final int q() {
        if (m.a(this.p) && m.a(this.q)) {
            return 0;
        }
        if (!m.a(this.p)) {
            return 1;
        }
        return 2;
    }

    @Override // com.bytedance.android.live.n.k
    public final boolean f() {
        if (this.n == 7) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final void j() {
        g gVar = this.f13834a;
        if (gVar != null) {
            gVar.a((g.a) null, (g.b) null);
            this.f13834a.e();
            this.f13834a = null;
        }
        r();
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final boolean l() {
        boolean z2;
        g gVar = this.f13834a;
        if (gVar == null || !gVar.g()) {
            z2 = false;
        } else {
            z2 = true;
        }
        d.a("LivePlayController", "playing -> controller" + hashCode() + " status: " + z2);
        return z2;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final void p() {
        MethodCollector.i(1876);
        TextureView textureView = this.f13838e;
        if (textureView == null) {
            MethodCollector.o(1876);
            return;
        }
        ViewParent parent = textureView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f13838e);
        }
        d.a("LivePlayController", "remove one px texture view");
        this.f13838e.setSurfaceTextureListener(null);
        this.f13838e = null;
        this.o = null;
        MethodCollector.o(1876);
    }

    private void C() {
        if (this.z == com.bytedance.android.livesdkapi.depend.model.live.i.SCREEN_RECORD || this.z == com.bytedance.android.livesdkapi.depend.model.live.i.THIRD_PARTY || this.z == com.bytedance.android.livesdkapi.depend.model.live.i.OFFICIAL_ACTIVITY) {
            if (((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).isInMusicallyRegion()) {
                this.f13834a.b("musically_game_live");
            } else {
                this.f13834a.b("tiktok_game_live");
            }
        } else if (((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).isInMusicallyRegion()) {
            this.f13834a.b("musically_live");
        } else {
            this.f13834a.b("tiktok_live");
        }
    }

    private void r() {
        this.w = null;
        this.u = false;
        this.p = "";
        this.q = "";
        this.t = f13833l;
        com.bytedance.android.livesdkapi.view.d dVar = this.f13835b;
        if (dVar instanceof TextureRenderView) {
            ((TextureRenderView) dVar).setSurfaceTextureListener(null);
        } else if (dVar instanceof TextureViewWrapper) {
            ((TextureViewWrapper) dVar).setSurfaceTextureListener(null);
        } else if (dVar instanceof SurfaceRenderView) {
            ((SurfaceRenderView) dVar).getHolder().removeCallback(this.K);
        }
        this.f13835b = null;
        if (this.f13837d != null) {
            this.f13837d = null;
        }
        Surface surface = this.f13836c;
        if (surface != null) {
            surface.release();
            this.f13836c = null;
        }
        this.x = 0;
        this.y = 0;
        this.f13844k.clear();
        j(false);
        i(false);
        g(false);
        this.f13841h = true;
    }

    private void s() {
        long currentTimeMillis = System.currentTimeMillis();
        g gVar = this.f13834a;
        if (gVar != null) {
            gVar.f();
            this.f13834a.a((g.a) null, (g.b) null);
            i(false);
            j(false);
        }
        this.f13834a = this.C.a(this.A, new j(this));
        d.a("LivePlayController", "create TTPlayer2 -> controller: " + hashCode());
        this.f13845m = this.f13834a.h();
        this.f13834a.a(this, this);
        this.f13834a.c(this.G);
        C();
        long currentTimeMillis2 = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("player_create_start", String.valueOf(currentTimeMillis));
        hashMap.put("player_create_end", String.valueOf(currentTimeMillis2));
        this.f13844k.putAll(hashMap);
    }

    private void t() {
        g gVar;
        if (z() && (gVar = this.f13834a) != null) {
            com.bytedance.android.livesdkapi.view.d dVar = this.f13835b;
            if (dVar instanceof SurfaceRenderView) {
                gVar.a(this.f13837d);
            } else if ((dVar instanceof TextureRenderView) || (dVar instanceof TextureViewWrapper)) {
                gVar.a(this.f13836c);
            }
            if (A() && this.u && !this.f13834a.g()) {
                d.a("LivePlayController", " Start Player! -> has surface and player, but not playing ");
                this.f13834a.c();
            }
        }
        if (this.n == 7 && this.u) {
            d.a("LivePlayController", "first frame -> send first frame message");
            if (LiveFirstFrameCallbackInsertMqHeadSetting.INSTANCE.getValue()) {
                g.c cVar = this.w;
                if (cVar != null) {
                    cVar.a(g.b.DISPLAYED_PLAY, null);
                    return;
                }
                return;
            }
            this.v.obtainMessage(g.b.DISPLAYED_PLAY.ordinal(), "all is ready and start render.").sendToTarget();
        }
    }

    private void x() {
        g gVar = this.f13834a;
        if (gVar != null) {
            gVar.a((Surface) null);
            this.f13834a.a((SurfaceHolder) null);
            this.f13834a.a(true);
        }
        com.bytedance.android.livesdkapi.view.d dVar = this.f13835b;
        if (dVar instanceof TextureRenderView) {
            ((TextureRenderView) dVar).setSurfaceTextureListener(null);
        } else if (dVar instanceof TextureViewWrapper) {
            ((TextureViewWrapper) dVar).setSurfaceTextureListener(null);
        } else if (dVar instanceof SurfaceRenderView) {
            ((SurfaceRenderView) dVar).getHolder().removeCallback(this.K);
        }
        this.f13835b = null;
        Surface surface = this.f13836c;
        if (surface != null) {
            surface.release();
            this.f13836c = null;
        }
        if (this.f13837d != null) {
            this.f13837d = null;
        }
        g(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.aj.i$4  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f13849a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f13850b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
        static {
            /*
            // Method dump skipped, instructions count: 151
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.aj.i.AnonymousClass4.<clinit>():void");
        }
    }

    private void u() {
        g.d dVar;
        if (this.f13834a != null) {
            if (this.f13845m) {
                s();
            }
            if (this.f13834a.g() && MtPlayerInvokeStopBeforePlaySetting.INSTANCE.getValue()) {
                d.a("LivePlayController", "start player -> controller: " + hashCode() + " is playing. invoke stop");
                this.f13834a.d();
            }
            C();
            this.x = 0;
            i(false);
            j(false);
            d.a("LivePlayController", "start player -> controller: " + hashCode() + " setDataSource()");
            if (!m.a(this.q)) {
                w();
            } else {
                int i2 = AnonymousClass4.f13849a[this.z.ordinal()];
                if (i2 == 1) {
                    dVar = g.d.AUDIO;
                } else if (i2 == 2) {
                    dVar = g.d.OBS;
                } else if (i2 != 3) {
                    dVar = g.d.VIDEO;
                } else {
                    dVar = g.d.SCREENSHOT;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("sdk_params", this.s);
                this.f13834a.a(this.p, hashMap, dVar);
                this.f13834a.a(this.t.f22954a, this.t.f22955b, this.t.f22956c);
            }
            this.L = SystemClock.currentThreadTimeMillis();
            this.f13834a.b(this.H);
            this.f13834a.b();
            v();
        }
    }

    private void w() {
        this.I = false;
        if (ShowAudienceDefinitionSelectionSetting.INSTANCE.isEnable() && (this.z == com.bytedance.android.livesdkapi.depend.model.live.i.THIRD_PARTY || this.z == com.bytedance.android.livesdkapi.depend.model.live.i.SCREEN_RECORD)) {
            boolean b2 = l.b(this.A);
            com.bytedance.android.live.core.c.a.a(4, "LivePlayController", "setDataSource(). third party or screen live strategy. isWifiEnv=".concat(String.valueOf(b2)));
            if (b2) {
                Map<String, String> a2 = com.bytedance.android.livesdk.ap.a.cQ.a();
                if (a2 != null) {
                    String str = a2.get("sdk_key");
                    if (a(str, this.q)) {
                        this.I = true;
                        this.r = str;
                    }
                }
            } else {
                com.bytedance.android.livesdk.ap.c.a(com.bytedance.android.livesdk.ap.a.cQ, (Object) null);
                if (!"sd".equals(this.r) && !"ld".equals(this.r)) {
                    this.r = "sd";
                }
            }
        }
        com.bytedance.android.live.core.c.a.a(4, "LivePlayController", "setDataSource(). mDefaultResolution=" + this.r + "; mStreamType=" + this.z);
        this.f13834a.a(this.q, this.r);
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final void a(com.bytedance.android.livesdkapi.depend.d.k kVar) {
        this.f13843j = kVar;
    }

    @Override // com.bytedance.android.live.n.k
    public final void c(boolean z2) {
        this.H = z2;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final void h(boolean z2) {
        this.f13841h = z2;
    }

    @Override // com.bytedance.android.live.n.k
    public final void a(Context context) {
        d(g.a.a(context));
    }

    @Override // com.bytedance.android.live.n.k
    public final void b(Context context) {
        e(g.a.a(context));
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final void d(Context context) {
        a(g.a.a(context));
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final void e(Context context) {
        b(g.a.a(context));
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final void f(Context context) {
        c(g.a.a(context));
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final void g(String str) {
        g gVar = this.f13834a;
        if (gVar != null) {
            gVar.c(str);
        }
    }

    @Override // com.bytedance.android.live.n.k
    public final void a(c cVar) {
        this.f13840g = new SoftReference<>(cVar);
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final void f(boolean z2) {
        this.G = z2;
        g gVar = this.f13834a;
        if (gVar != null) {
            gVar.c(z2);
        }
    }

    private void b(com.bytedance.android.livesdkapi.view.d dVar) {
        String str;
        if (dVar instanceof View) {
            str = g.a.a(((View) dVar).getContext());
        } else {
            str = null;
        }
        this.D = str;
        a(dVar);
    }

    private void j(boolean z2) {
        if (z2) {
            this.n |= 4;
        } else {
            this.n &= -5;
        }
        t();
    }

    @Override // com.bytedance.android.live.n.k
    public final void d(boolean z2) {
        g gVar = this.f13834a;
        if (gVar != null) {
            gVar.d(z2);
        }
    }

    @Override // com.bytedance.android.live.n.k
    public final void e(String str) {
        if (TextUtils.equals(str, this.D)) {
            g.c cVar = this.w;
            if (cVar != null) {
                cVar.a(g.b.STOP_WHEN_JOIN_INTERACT, null);
            }
            b(str);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final void f(String str) {
        g gVar = this.f13834a;
        if (gVar != null) {
            gVar.a(str);
            g.c cVar = this.w;
            if (cVar != null) {
                cVar.a(g.b.START_SWITCH_RESOLUTION, null);
            }
        }
    }

    public static final class a implements b.AbstractC0153b<k> {
        static {
            Covode.recordClassIndex(7701);
        }

        @Override // com.bytedance.android.live.i.b.b.AbstractC0153b
        public final b.AbstractC0153b.a<k> a(b.AbstractC0153b.a<k> aVar) {
            aVar.f9912a = (R) new i(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).context(), (IHostPlugin) com.bytedance.android.live.t.a.a(IHostPlugin.class), new m());
            aVar.f9913b = true;
            return aVar;
        }
    }

    private void i(boolean z2) {
        if (z2) {
            this.n |= 1;
            if (this.z == com.bytedance.android.livesdkapi.depend.model.live.i.AUDIO) {
                int i2 = this.n | 2;
                this.n = i2;
                this.n = i2 | 4;
            }
        } else {
            this.n &= -2;
        }
        t();
    }

    @Override // com.bytedance.android.live.n.k
    public final void b(boolean z2) {
        this.E = z2;
        y();
    }

    @Override // com.bytedance.android.live.n.k
    public final void c(String str) {
        if (TextUtils.equals(str, this.D)) {
            g.c cVar = this.w;
            if (cVar != null) {
                cVar.a(g.b.STOP_WHEN_PLAYING_OTHER, null);
            }
            b(str);
        }
    }

    @Override // com.bytedance.android.live.n.k
    public final void e(boolean z2) {
        g gVar = this.f13834a;
        if (gVar != null) {
            gVar.e(z2);
        }
    }

    public final void g(boolean z2) {
        if (z2) {
            this.n |= 2;
        } else {
            this.n &= -3;
        }
        d.a("LivePlayController", "isReady = " + z2 + ", mDisplayState = " + this.n);
        t();
    }

    @Override // com.bytedance.android.livesdkapi.depend.c.a.AbstractC0502a
    public final void handleMsg(Message message) {
        g.c cVar;
        if (message.what == 9) {
            d.a("LivePlayController", "restart play -> receive try again msg");
            try {
                u();
            } catch (Exception e2) {
                d.a("LivePlayController", e2.getMessage());
            }
        } else {
            g.b valueOf = g.b.valueOf(message.what);
            if (valueOf != g.b.UNKNOWN && (cVar = this.w) != null) {
                cVar.a(valueOf, message.obj);
            }
        }
    }

    private boolean h(String str) {
        try {
            Uri parse = Uri.parse(this.p);
            Uri parse2 = Uri.parse(str);
            if (!m.a(parse.getHost() + parse.getPath(), parse2.getHost() + parse2.getPath())) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final void a(com.bytedance.android.livesdkapi.depend.model.c.a aVar) {
        this.N = aVar;
    }

    @Override // com.bytedance.android.live.n.k
    public final void b(String str) {
        ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayControllerManager().d(str);
        d.a("LivePlayController", "destroy player -> tag " + str + " ,mPlayContextTag: " + this.D + " ,controller: " + hashCode());
        if (TextUtils.equals(str, this.D)) {
            g gVar = this.f13834a;
            if (gVar != null) {
                gVar.a((g.a) null, (g.b) null);
                this.f13834a.e();
                this.f13834a = null;
            }
            r();
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final boolean c(Context context) {
        String a2 = g.a.a(context);
        if (!TextUtils.equals(a2, this.D)) {
            return false;
        }
        new com.bytedance.android.livesdk.chatroom.detail.a(this).b(null, a2);
        a(a2);
        b(a2);
        return true;
    }

    @Override // com.bytedance.android.live.n.k
    public final void d(String str) {
        d.a("LivePlayController", "stopWhenSlideSwitch -> playerTag: " + str + " ,mPlayContextTag" + this.D + " ,controller: " + hashCode());
        if (TextUtils.equals(str, this.D)) {
            this.u = false;
            g gVar = this.f13834a;
            if (gVar != null) {
                gVar.d();
            }
            this.w = null;
            x();
            this.f13841h = true;
        }
    }

    @Override // com.bytedance.android.live.n.k
    public final void a(String str) {
        d.b("LivePlayController", "stop -> playerTag: " + str + " ,mPlayContextTag" + this.D + " ,controller: " + hashCode());
        if (TextUtils.equals(str, this.D)) {
            this.u = false;
            g gVar = this.f13834a;
            if (gVar != null) {
                gVar.d();
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final boolean g(Context context) {
        MethodCollector.i(1874);
        if (this.N == null) {
            MethodCollector.o(1874);
            return false;
        } else if (LiveUseSurfaceViewExperiment.INSTANCE.isEnable()) {
            MethodCollector.o(1874);
            return false;
        } else if (this.f13838e != null) {
            MethodCollector.o(1874);
            return false;
        } else {
            e a2 = p.a(context);
            if (a2 == null) {
                MethodCollector.o(1874);
                return false;
            } else if (a2.isFinishing() || a2.getWindow() == null) {
                MethodCollector.o(1874);
                return false;
            } else {
                int i2 = Build.VERSION.SDK_INT;
                if (a2.isDestroyed()) {
                    MethodCollector.o(1874);
                    return false;
                }
                this.f13838e = new TextureView(a2);
                AnonymousClass3 r1 = new TextureView.SurfaceTextureListener() {
                    /* class com.bytedance.android.livesdk.aj.i.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(7699);
                    }

                    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                        return false;
                    }

                    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                    }

                    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                    }

                    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                        if (i.this.f13838e != null && i.this.f13836c == null) {
                            d.a("PreCreateSurface", "one px surface available, create one px surface");
                            i.this.f13836c = new Surface(surfaceTexture);
                            i.this.g(true);
                        }
                    }
                };
                this.o = r1;
                this.f13838e.setSurfaceTextureListener(r1);
                ((ViewGroup) a2.getWindow().getDecorView().findViewById(16908290)).addView(this.f13838e, new ViewGroup.LayoutParams(1, 1));
                d.a("PreCreateSurface", "add one px texture view into main activity");
                MethodCollector.o(1874);
                return true;
            }
        }
    }

    @Override // com.bytedance.android.live.n.k
    public final void a(com.bytedance.android.livesdkapi.view.d dVar) {
        if (dVar == null) {
            d.a("LivePlayController", "bindSurface -> textureView == null, stop player and release surface");
            g gVar = this.f13834a;
            if (gVar != null) {
                gVar.d();
            }
            com.bytedance.android.livesdkapi.view.d dVar2 = this.f13835b;
            if (dVar2 instanceof SurfaceRenderView) {
                ((SurfaceRenderView) dVar2).getHolder().removeCallback(this.K);
            } else if (dVar2 instanceof TextureRenderView) {
                ((TextureRenderView) dVar2).setSurfaceTextureListener(null);
            } else if (dVar2 instanceof TextureViewWrapper) {
                ((TextureViewWrapper) dVar2).setSurfaceTextureListener(null);
            }
            this.f13835b = null;
            Surface surface = this.f13836c;
            if (surface != null) {
                surface.release();
                this.f13836c = null;
            }
            this.f13837d = null;
            if (z()) {
                g(false);
                return;
            }
            return;
        }
        com.bytedance.android.livesdkapi.view.d dVar3 = this.f13835b;
        if (dVar3 != dVar) {
            if (dVar3 instanceof SurfaceRenderView) {
                ((SurfaceRenderView) dVar3).getHolder().removeCallback(this.K);
            } else if (dVar3 instanceof TextureRenderView) {
                ((TextureRenderView) dVar3).setSurfaceTextureListener(null);
            } else if (dVar3 instanceof TextureViewWrapper) {
                ((TextureViewWrapper) dVar3).setSurfaceTextureListener(null);
            }
            this.f13835b = null;
            Surface surface2 = this.f13836c;
            if (surface2 != null) {
                surface2.release();
                this.f13836c = null;
            }
            this.f13835b = dVar;
            if (dVar instanceof SurfaceRenderView) {
                ((SurfaceRenderView) dVar).getHolder().addCallback(this.K);
            } else if (dVar instanceof TextureRenderView) {
                ((TextureRenderView) dVar).setSurfaceTextureListener(this.J);
            } else if (dVar instanceof TextureViewWrapper) {
                ((TextureViewWrapper) dVar).setSurfaceTextureListener(this.J);
            }
            if (this.f13838e != null && z()) {
                d.a("PreCreateSurface", "set one px surface into real textureView to replace surface");
                com.bytedance.android.livesdkapi.view.d dVar4 = this.f13835b;
                if (!(dVar4 instanceof TextureRenderView) || ((TextureRenderView) dVar4).getSurfaceTexture() == this.f13838e.getSurfaceTexture()) {
                    com.bytedance.android.livesdkapi.view.d dVar5 = this.f13835b;
                    if ((dVar5 instanceof TextureViewWrapper) && ((TextureViewWrapper) dVar5).getSurfaceTexture() != this.f13838e.getSurfaceTexture()) {
                        ((TextureViewWrapper) this.f13835b).setSurfaceTexture(this.f13838e.getSurfaceTexture());
                    }
                } else {
                    ((TextureRenderView) this.f13835b).setSurfaceTexture(this.f13838e.getSurfaceTexture());
                }
            }
            com.bytedance.android.livesdkapi.view.d dVar6 = this.f13835b;
            if (dVar6 instanceof TextureRenderView) {
                if (((TextureRenderView) dVar6).getSurfaceTexture() != null) {
                    this.f13836c = new Surface(((TextureRenderView) this.f13835b).getSurfaceTexture());
                    g(true);
                    return;
                }
                g(false);
            } else if (dVar6 instanceof TextureViewWrapper) {
                if (((TextureViewWrapper) dVar6).getSurfaceTexture() != null) {
                    this.f13836c = new Surface(((TextureViewWrapper) this.f13835b).getSurfaceTexture());
                    g(true);
                    return;
                }
                g(false);
            } else if (!(dVar6 instanceof SurfaceRenderView)) {
                g(false);
            } else if (((SurfaceRenderView) dVar6).getHolder() != null) {
                this.f13837d = ((SurfaceRenderView) this.f13835b).getHolder();
                g(true);
            } else {
                g(false);
            }
        }
    }

    private void a(g.b bVar, Object obj) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            g.c cVar = this.w;
            if (cVar != null) {
                cVar.a(bVar, obj);
                return;
            }
            return;
        }
        this.v.obtainMessage(bVar.ordinal(), obj).sendToTarget();
    }

    private static boolean a(String str, String str2) {
        boolean z2 = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            new JSONObject(str2).getJSONObject("data").getJSONObject(str);
            z2 = true;
            return true;
        } catch (JSONException e2) {
            com.bytedance.android.live.core.c.a.a(6, "LivePlayController", "coldStart(). catch exception. e=".concat(String.valueOf(e2)));
            return z2;
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final void a(String str, q qVar) {
        g gVar = this.f13834a;
        if (gVar != null) {
            gVar.a(str, qVar);
            g.c cVar = this.w;
            if (cVar != null) {
                cVar.a(g.b.START_SWITCH_RESOLUTION, null);
            }
        }
    }

    public i(Context context, IHostPlugin iHostPlugin, f fVar) {
        this.A = context;
        this.B = iHostPlugin;
        this.C = fVar;
        this.v = new com.bytedance.android.livesdkapi.depend.c.a(Looper.getMainLooper(), this);
        n b2 = com.bytedance.android.live.i.b.d.g().b();
        this.f13839f = b2;
        String a2 = com.bytedance.android.live.i.b.d.g().e().a(context);
        if (a2 != null) {
            b2.f13870f = a2;
        }
        r();
        DataChannelGlobal.f34575d.a(cx.class, this);
    }

    @Override // com.bytedance.android.livesdk.aj.g.a
    public final void a(g.c cVar, int i2, String str) {
        Object obj;
        switch (AnonymousClass4.f13850b[cVar.ordinal()]) {
            case 1:
                JSONObject e2 = e();
                if (e2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("video_codec", e2.optString("Codec_Type:"));
                    hashMap.put("video_codec_name", e2.optString("Codec_Name:"));
                    if (e2.optBoolean("HardDecode:")) {
                        obj = "1";
                    } else {
                        obj = "0";
                    }
                    hashMap.put("hardware", obj);
                    LivePerformanceManager.getInstance().onModuleStart("stream", hashMap);
                }
                j(true);
                break;
            case 2:
            case 3:
                i(false);
                j(false);
                if (cVar != g.c.MEDIA_ERROR) {
                    a(g.b.COMPLETE_PLAY, str);
                    break;
                } else {
                    a(g.b.MEDIA_ERROR, str);
                    break;
                }
            case 4:
                g gVar = this.f13834a;
                if (gVar != null) {
                    Point i3 = gVar.i();
                    this.x = (i3.y << 16) | i3.x;
                }
                this.y = 0;
                i(true);
                a(g.b.PLAYER_PREPARED, str);
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                this.x = i2;
                y();
                a(g.b.VIDEO_SIZE_CHANGED, String.valueOf(i2));
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                a(g.b.INTERACT_SEI, str);
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                a(g.b.BUFFERING_START, str);
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                a(g.b.BUFFERING_END, str);
                break;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                a(g.b.RESOLUTION_DEGRADE, str);
                break;
        }
        try {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("event_page", "live_detail");
            hashMap2.put("time", String.valueOf(SystemClock.currentThreadTimeMillis() - this.L));
            hashMap2.put("url", this.p);
            hashMap2.put("pull_stream_data", this.q);
            hashMap2.put("default_resolution", this.r);
            int i4 = AnonymousClass4.f13850b[cVar.ordinal()];
            if (i4 == 1) {
                hashMap2.put("is_success", "1");
                b.a.a("live_first_play").a((Map<String, String>) hashMap2).a().b();
            } else if (i4 == 2) {
                hashMap2.put("is_success", "0");
                b.a.a("live_first_play").a((Map<String, String>) hashMap2).a().b();
            } else if (i4 == 7) {
                b.a.a("live_block_start").a((Map<String, String>) hashMap2).a().b();
            } else if (i4 == 8) {
                b.a.a("live_block_end").a((Map<String, String>) hashMap2).a().b();
            }
        } catch (Throwable th) {
            com.bytedance.android.live.core.c.a.a("LivePlayController", th);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g
    public final void b(String str, String str2, com.bytedance.android.livesdkapi.view.d dVar, int i2, g.d dVar2, g.c cVar, String str3) {
        a(str, str2, dVar, i2, dVar2, cVar, str3);
    }
}
