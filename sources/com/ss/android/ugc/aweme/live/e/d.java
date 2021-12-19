package com.ss.android.ugc.aweme.live.e;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.platform.common.d.a;
import com.bytedance.android.live.liveinteract.platform.common.e.a.c;
import com.bytedance.android.live.n.k;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreviewCardUsePreviewSetting;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class d implements a.AbstractC0250a, g.c, c {

    /* renamed from: a  reason: collision with root package name */
    public String f108355a;

    /* renamed from: b  reason: collision with root package name */
    public TextureRenderView f108356b;

    /* renamed from: c  reason: collision with root package name */
    public volatile k f108357c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f108358d;

    /* renamed from: e  reason: collision with root package name */
    private b f108359e;

    /* renamed from: f  reason: collision with root package name */
    private String f108360f;

    /* renamed from: g  reason: collision with root package name */
    private String f108361g;

    /* renamed from: h  reason: collision with root package name */
    private LiveRoomStruct f108362h;

    /* renamed from: i  reason: collision with root package name */
    private FrameLayout f108363i;

    /* renamed from: j  reason: collision with root package name */
    private a f108364j;

    /* renamed from: k  reason: collision with root package name */
    private Runnable f108365k;

    /* renamed from: l  reason: collision with root package name */
    private a f108366l;

    /* renamed from: m  reason: collision with root package name */
    private int f108367m;
    private final Object n = new Object();
    private com.bytedance.android.livesdkapi.depend.model.c.a o = null;
    private com.bytedance.android.livesdkapi.depend.d.k p = null;
    private int q;
    private int r;

    static {
        Covode.recordClassIndex(69430);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.d.a.AbstractC0250a
    public final boolean b(int i2) {
        return i2 == 1;
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final String getPlayerTag() {
        return this.f108360f;
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final TextureRenderView getTextureView() {
        return this.f108356b;
    }

    private void c() {
        this.o = null;
        this.p = null;
        this.f108356b = null;
        b();
    }

    private Context e() {
        FrameLayout frameLayout = this.f108363i;
        if (frameLayout == null) {
            return null;
        }
        return frameLayout.getContext();
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final Boolean getLivePlayControllerIsPlaying() {
        return Boolean.valueOf(this.f108357c.l());
    }

    private void b() {
        try {
            g a2 = a();
            if (a2 != null) {
                a2.a((String) null, (com.bytedance.android.livesdkapi.view.d) null, 0, (g.d) null, (g.c) null, (String) null);
                if (a2 instanceof k) {
                    ((k) a2).a((com.bytedance.android.livesdkapi.view.d) null);
                }
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final JSONObject getStaticLog() {
        if (a() != null) {
            return this.f108357c.e();
        }
        return new JSONObject();
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void pause() {
        if (a() != null && TextUtils.equals(this.f108355a, this.f108357c.m())) {
            f();
            d();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void pauseWithStreamData() {
        if (a() != null && TextUtils.equals(this.f108361g, this.f108357c.n())) {
            f();
            d();
        }
    }

    private void d() {
        MethodCollector.i(10462);
        TextureRenderView textureRenderView = this.f108356b;
        if (textureRenderView == null) {
            MethodCollector.o(10462);
            return;
        }
        textureRenderView.setVisibility(8);
        ViewGroup viewGroup = (ViewGroup) this.f108356b.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.f108356b);
        }
        MethodCollector.o(10462);
    }

    private void f() {
        if (a() != null) {
            if (this.f108357c != null) {
                if (!TextUtils.isEmpty(this.f108360f)) {
                    this.f108357c.a(this.f108360f);
                } else {
                    this.f108357c.d(e());
                }
            }
            this.f108361g = null;
            this.f108355a = null;
            this.f108362h = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void destroy() {
        if (a() != null) {
            f();
            if (!TextUtils.isEmpty(this.f108360f)) {
                this.f108357c.b(this.f108360f);
            } else {
                this.f108357c.e(e());
            }
        }
        d();
        this.f108356b = null;
        this.o = null;
        this.p = null;
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void stop() {
        com.bytedance.android.live.core.c.a.a(3, "LivePlayHelper", "+++++++++++++++++++++ready to stop");
        if (a() != null && TextUtils.equals(this.f108355a, this.f108357c.m())) {
            c();
            f();
            d();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void stopWithStreamData() {
        com.bytedance.android.live.core.c.a.a(3, "LivePlayHelper", "+++++++++++++++++++++ready to stop");
        if (a() != null && TextUtils.equals(this.f108361g, this.f108357c.n())) {
            c();
            f();
            d();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void switchCndAbrSwitchResolution() {
        LiveRoomStruct liveRoomStruct;
        String str;
        if (a() != null && (liveRoomStruct = this.f108362h) != null) {
            if (liveRoomStruct.getMultiStreamDefaultPreviewQualitySdkKey() != null) {
                str = this.f108362h.getMultiStreamDefaultPreviewQualitySdkKey().toLowerCase(Locale.US);
            } else {
                str = "";
            }
            if (!TextUtils.equals("auto", str)) {
                this.f108357c.g(this.f108362h.getMultiStreamDefaultQualitySdkKey());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.e.d$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f108368a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 69431(0x10f37, float:9.7294E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdkapi.depend.d.g$b[] r0 = com.bytedance.android.livesdkapi.depend.d.g.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.live.e.d.AnonymousClass1.f108368a = r2
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.d.g.b.VIDEO_SIZE_CHANGED     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.live.e.d.AnonymousClass1.f108368a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.d.g.b.DISPLAYED_PLAY     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.android.ugc.aweme.live.e.d.AnonymousClass1.f108368a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.d.g.b.INTERACT_SEI     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.android.ugc.aweme.live.e.d.AnonymousClass1.f108368a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.d.g.b.PLAYER_PREPARED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.ss.android.ugc.aweme.live.e.d.AnonymousClass1.f108368a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.d.g.b.COMPLETE_PLAY     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r2 = com.ss.android.ugc.aweme.live.e.d.AnonymousClass1.f108368a     // Catch:{ NoSuchFieldError -> 0x004f }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.d.g.b.MEDIA_ERROR     // Catch:{ NoSuchFieldError -> 0x004f }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.e.d.AnonymousClass1.<clinit>():void");
        }
    }

    private g a() {
        if (this.f108357c == null) {
            g gVar = null;
            if (this.f108362h == null) {
                return null;
            }
            this.f108360f = "preview_" + this.f108362h.id + "_" + SystemClock.uptimeMillis();
            if (!(LiveOuterService.s() == null || LiveOuterService.s().d() == null)) {
                gVar = LiveOuterService.s().d().a(this.f108360f);
            }
            this.f108357c = (k) gVar;
        }
        return this.f108357c;
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void setLivePlayerEntranceParam(com.bytedance.android.livesdkapi.depend.model.c.a aVar) {
        this.o = aVar;
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void setPlayerLogCache(com.bytedance.android.livesdkapi.depend.d.k kVar) {
        this.p = kVar;
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void setPlayControllerShouldDestroy(boolean z) {
        this.f108357c.h(z);
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void changeSRSupportScene(boolean z) {
        if (a() != null) {
            this.f108357c.d(z);
        }
    }

    private void a(FrameLayout frameLayout) {
        MethodCollector.i(10305);
        if (frameLayout.indexOfChild(this.f108356b) < 0) {
            d();
            this.f108356b.setVisibility(0);
            frameLayout.addView(this.f108356b);
        }
        MethodCollector.o(10305);
    }

    private void a(Context context) {
        if (this.f108356b == null) {
            this.f108356b = com.ss.android.ugc.aweme.newfollow.a.a(context, this.f108362h);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f108356b.setLayoutParams(layoutParams);
        this.f108356b.setVisibility(0);
        this.f108356b.setScaleType(2);
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void setMute(boolean z) {
        if (a() != null) {
            if (!TextUtils.isEmpty(this.f108360f)) {
                this.f108357c.a(z, this.f108360f);
            } else if (this.f108357c != null && e() != null) {
                try {
                    this.f108357c.a(z, e());
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.framework.a.a.b("LivePlayHelper", Log.getStackTraceString(e2));
                }
            }
        }
    }

    private void a(boolean z) {
        TextureRenderView textureRenderView = this.f108356b;
        if (textureRenderView == null) {
            return;
        }
        if (z) {
            ViewGroup.LayoutParams layoutParams = textureRenderView.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 85;
                this.f108356b.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = textureRenderView.getLayoutParams();
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
            this.f108356b.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.d.a.AbstractC0250a
    public final void a(com.bytedance.android.live.liveinteract.platform.common.e.a.a aVar) {
        List<c> list;
        LiveRoomStruct liveRoomStruct;
        this.f108367m = 0;
        int i2 = 2;
        int[] iArr = new int[2];
        if (aVar != null && (list = aVar.f11923e) != null && (liveRoomStruct = this.f108362h) != null) {
            long anchorId = liveRoomStruct.getAnchorId();
            int i3 = 0;
            for (c cVar : list) {
                if (!(cVar == null || cVar.f11929b == anchorId)) {
                    int width = this.f108363i.getWidth();
                    int height = this.f108363i.getHeight();
                    iArr = new int[i2];
                    float f2 = ((float) width) / ((float) this.q);
                    float f3 = (float) this.r;
                    float f4 = ((float) height) / f3;
                    if (f2 <= f4) {
                        f2 = f4;
                    }
                    double d2 = (double) (f3 * f2);
                    Double.isNaN(d2);
                    int i4 = (int) (d2 * ((1.0d - cVar.f11934g) - cVar.f11932e));
                    double d3 = cVar.f11932e;
                    Double.isNaN(d2);
                    iArr[0] = i4;
                    iArr[1] = (int) ((d2 * d3) + 0.5d);
                    if (i3 <= 0) {
                        i3 = iArr[0];
                    }
                    this.f108367m++;
                }
                i2 = 2;
            }
            int i5 = iArr[0];
            int i6 = iArr[1];
            if (this.f108364j == null) {
                return;
            }
            if (list.size() == 1) {
                a(true);
            } else if (list.size() > 1) {
                a(true);
            } else {
                a(false);
            }
        }
    }

    public d(Runnable runnable, b bVar) {
        this.f108365k = runnable;
        this.f108359e = bVar;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g.c
    public final void a(g.b bVar, Object obj) {
        com.bytedance.android.live.core.c.a.a(3, "LivePlayHelper", "onPlayerMessage ..." + bVar + "param:" + obj);
        switch (AnonymousClass1.f108368a[bVar.ordinal()]) {
            case 1:
                if (this.f108359e != null) {
                    int parseInt = Integer.parseInt((String) obj);
                    int i2 = 65535 & parseInt;
                    this.q = i2;
                    int i3 = parseInt >> 16;
                    this.r = i3;
                    ALog.d("LivePlayHelper", "width = " + i2 + "; height = " + i3);
                    this.f108359e.onVideoSizeChange(this.f108356b, this.q, this.r);
                    TextureRenderView textureRenderView = this.f108356b;
                    if (textureRenderView != null) {
                        textureRenderView.setScaleType(2);
                        this.f108356b.a(this.q, this.r);
                        break;
                    }
                }
                break;
            case 2:
                Runnable runnable = this.f108365k;
                if (runnable != null) {
                    runnable.run();
                }
                b bVar2 = this.f108359e;
                if (bVar2 != null) {
                    bVar2.firstFrame();
                    this.f108359e.playing();
                    break;
                }
                break;
            case 3:
                if (obj instanceof String) {
                    a aVar = this.f108366l;
                    if (aVar != null) {
                        aVar.b((String) obj);
                    }
                    b bVar3 = this.f108359e;
                    if (bVar3 != null) {
                        bVar3.seiUpdate(String.valueOf(obj));
                    }
                    if (!TextUtils.isEmpty((String) obj)) {
                        try {
                            if (!new JSONObject((String) obj).has("app_data") && this.f108367m > 0) {
                                this.f108367m = 0;
                                break;
                            }
                        } catch (JSONException unused) {
                            break;
                        }
                    }
                }
                break;
            case 4:
                b bVar4 = this.f108359e;
                if (bVar4 != null) {
                    bVar4.playPrepared(String.valueOf(obj));
                    break;
                }
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                b bVar5 = this.f108359e;
                if (bVar5 != null) {
                    bVar5.playComplete(String.valueOf(obj));
                    break;
                }
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                b bVar6 = this.f108359e;
                if (bVar6 != null) {
                    bVar6.playerMediaError(String.valueOf(obj));
                    break;
                }
                break;
        }
        b bVar7 = this.f108359e;
        if (bVar7 != null) {
            bVar7.onPlayerMessage(bVar, obj);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void play(boolean z, LiveRoomStruct liveRoomStruct, FrameLayout frameLayout) {
        com.bytedance.android.live.core.c.a.a(3, "LivePlayHelper", "+++++++++++++++++++++ready to play");
        if (frameLayout == null) {
            com.ss.android.ugc.aweme.framework.a.a.b("LivePlayHelper", "liveStreamContainer is null");
            return;
        }
        this.f108358d = z;
        if (liveRoomStruct.stream_url != null && !TextUtils.equals(this.f108355a, liveRoomStruct.stream_url.rtmp_pull_url)) {
            b();
        }
        if (liveRoomStruct.stream_url != null) {
            this.f108355a = liveRoomStruct.stream_url.rtmp_pull_url;
        }
        this.f108362h = liveRoomStruct;
        this.f108363i = frameLayout;
        try {
            a(frameLayout.getContext());
            a(this.f108363i);
            if (a() != null) {
                this.f108357c.f(true);
                this.f108357c.a(this.p);
                this.f108357c.a(this.o);
                this.f108357c.a(this.f108362h.stream_url.rtmp_pull_url, this.f108356b, RoomStruct.getStreamType(this.f108362h).ordinal(), (g.d) null, this, (String) null);
                this.f108357c.a(this.f108358d, e());
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.b("LivePlayHelper", Log.getStackTraceString(e2));
        }
        this.f108366l = new a(this);
        this.f108367m = 0;
    }

    @Override // com.ss.android.ugc.aweme.live.e.c
    public final void playWithStreamData(boolean z, LiveRoomStruct liveRoomStruct, FrameLayout frameLayout) {
        String multiStreamDefaultQualitySdkKey;
        g.d dVar;
        com.bytedance.android.live.core.c.a.a(3, "LivePlayHelper", "+++++++++++++++++++++ready to play");
        if (frameLayout == null) {
            com.ss.android.ugc.aweme.framework.a.a.b("LivePlayHelper", "liveStreamContainer is null");
            return;
        }
        this.f108358d = z;
        if (liveRoomStruct.getMultiStreamData() != null) {
            b();
        }
        if (liveRoomStruct.getMultiStreamData() != null) {
            this.f108361g = liveRoomStruct.getMultiStreamData();
        }
        this.f108362h = liveRoomStruct;
        this.f108363i = frameLayout;
        try {
            a(frameLayout.getContext());
            a(this.f108363i);
            if (a() != null) {
                this.f108357c.f(true);
                if (EnablePreviewCardUsePreviewSetting.INSTANCE.getValue() == 1) {
                    multiStreamDefaultQualitySdkKey = this.f108362h.getMultiStreamDefaultPreviewQualitySdkKey();
                } else {
                    multiStreamDefaultQualitySdkKey = this.f108362h.getMultiStreamDefaultQualitySdkKey();
                }
                this.f108357c.a(this.p);
                this.f108357c.a(this.o);
                k kVar = this.f108357c;
                String multiStreamData = this.f108362h.getMultiStreamData();
                TextureRenderView textureRenderView = this.f108356b;
                int ordinal = RoomStruct.getStreamType(this.f108362h).ordinal();
                if (this.f108362h.getStreamUrlExtraSafely().getSrConfig() == null) {
                    dVar = null;
                } else {
                    g.d.a aVar = new g.d.a();
                    aVar.f22957a = this.f108362h.getStreamUrlExtraSafely().getSrConfig().enabled;
                    aVar.f22958b = this.f108362h.getStreamUrlExtraSafely().getSrConfig().antiAlias;
                    aVar.f22959c = this.f108362h.getStreamUrlExtraSafely().getSrConfig().strength;
                    dVar = aVar.a();
                }
                kVar.b(multiStreamData, multiStreamDefaultQualitySdkKey, textureRenderView, ordinal, dVar, this, this.f108360f);
                k kVar2 = this.f108357c;
                kVar2.a(this.f108358d, this.f108360f);
                LiveOuterService.s().d().a(this.f108360f, kVar2);
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.b("LivePlayHelper", Log.getStackTraceString(e2));
        }
        this.f108366l = new a(this);
        this.f108367m = 0;
    }
}
