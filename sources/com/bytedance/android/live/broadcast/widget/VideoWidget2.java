package com.bytedance.android.live.broadcast.widget;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.i;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.broadcast.ah;
import com.bytedance.android.live.broadcast.api.StickerReportApi;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.broadcast.stream.b;
import com.bytedance.android.live.broadcast.stream.capture.c;
import com.bytedance.android.live.broadcast.utils.StickerImageUploader;
import com.bytedance.android.live.broadcast.utils.d;
import com.bytedance.android.live.core.f.ae;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.a.g;
import com.bytedance.android.live.effect.api.a.l;
import com.bytedance.android.live.effect.api.e;
import com.bytedance.android.live.effect.api.f;
import com.bytedance.android.live.effect.api.h;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.k;
import com.bytedance.android.livesdk.chatroom.c.r;
import com.bytedance.android.livesdk.chatroom.c.v;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.dr;
import com.bytedance.android.livesdk.j.ds;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastForceUploadVideoImageSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCaptureVideoRecordDurationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.StreamHardwareEncodeSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.a.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.s;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.n;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.au;
import com.ss.avframework.effect.IVideoEffectProcessor;
import com.ss.avframework.livestreamv2.core.Client;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.opengl.GlUtil;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class VideoWidget2 extends CaptureWidget2 implements com.bytedance.android.live.broadcast.c.a.a, com.bytedance.android.live.broadcast.stream.b.a, g, com.bytedance.android.livesdk.chatroom.interact.b, WeakHandler.IHandler, au {

    /* renamed from: e  reason: collision with root package name */
    public static final String f8738e = VideoWidget2.class.getSimpleName();
    private Dialog A;
    private s B;
    private IVideoEffectProcessor.FaceDetectListener C;
    private Map<String, Runnable> D = new HashMap();
    private com.bytedance.android.live.broadcast.stream.b E;
    private f F;
    private com.bytedance.android.live.effect.api.a.b G = new com.bytedance.android.live.effect.api.a.b() {
        /* class com.bytedance.android.live.broadcast.widget.VideoWidget2.AnonymousClass2 */

        static {
            Covode.recordClassIndex(4474);
        }

        @Override // com.bytedance.android.live.effect.api.a.b
        public final int a() {
            VideoWidget2.this.f8741h.a();
            return 1;
        }

        @Override // com.bytedance.android.live.effect.api.a.b
        public final int b(String[] strArr) {
            VideoWidget2.this.f8741h.b(strArr);
            return 1;
        }

        @Override // com.bytedance.android.live.effect.api.a.b
        public final int c(String[] strArr) {
            VideoWidget2.this.f8741h.c(strArr);
            return 0;
        }

        @Override // com.bytedance.android.live.effect.api.a.b
        public final int a(boolean z) {
            VideoWidget2.this.f8741h.a(z);
            return 1;
        }

        @Override // com.bytedance.android.live.effect.api.a.b
        public final int a(String[] strArr) {
            VideoWidget2.this.f8741h.a(strArr);
            return 1;
        }

        @Override // com.bytedance.android.live.effect.api.a.b
        public final int b(String[] strArr, String[] strArr2) {
            VideoWidget2.this.f8741h.b(strArr, strArr2);
            return 0;
        }

        @Override // com.bytedance.android.live.effect.api.a.b
        public final int a(String str, boolean z) {
            try {
                VideoWidget2.this.f8741h.a(str, z);
                return 1;
            } catch (FileNotFoundException e2) {
                com.bytedance.android.live.core.c.a.a(VideoWidget2.f8738e, e2);
                return -1;
            }
        }

        @Override // com.bytedance.android.live.effect.api.a.b
        public final int a(String[] strArr, String[] strArr2) {
            VideoWidget2.this.f8741h.a(strArr, strArr2);
            return 1;
        }

        @Override // com.bytedance.android.live.effect.api.a.b
        public final int a(String str, String str2, float f2) {
            VideoWidget2.this.f8741h.a(str, str2, f2);
            return 1;
        }

        @Override // com.bytedance.android.live.effect.api.a.b
        public final int a(String str, String str2, int[] iArr) {
            VideoWidget2.this.f8741h.a(str, str2, iArr);
            return 0;
        }
    };
    private com.bytedance.android.live.effect.api.a.d H = new com.bytedance.android.live.effect.api.a.d() {
        /* class com.bytedance.android.live.broadcast.widget.VideoWidget2.AnonymousClass3 */

        static {
            Covode.recordClassIndex(4475);
        }

        @Override // com.bytedance.android.live.effect.api.a.d
        public final void a(boolean z, String str, com.bytedance.android.livesdkapi.depend.model.a aVar) {
            f.a.b.b bVar;
            if (com.bytedance.android.live.effect.api.a.f9636a.equals(str) && z && aVar != null) {
                b.a.a("live_take_gesture_select").a(VideoWidget2.this.dataChannel).b("live_take").c("click").a("gesture_id", aVar.f22995a).b();
            }
            Map<String, Map<String, com.bytedance.android.livesdkapi.depend.model.a>> a2 = com.bytedance.android.live.effect.d.e().a();
            if (!a2.containsKey(com.bytedance.android.live.effect.api.a.f9637b) || a2.get(com.bytedance.android.live.effect.api.a.f9637b).size() <= 0) {
                VideoWidget2.this.o = false;
                VideoWidget2.this.n.removeMessages(101);
                if (VideoWidget2.this.f8744k != null) {
                    VideoWidget2.this.f8744k.a(false);
                }
            } else {
                VideoWidget2.this.o = true;
            }
            if ((aVar != null && aVar.u) || LiveBroadcastForceUploadVideoImageSetting.INSTANCE.isEnable()) {
                if (z) {
                    com.bytedance.android.live.broadcast.stream.a aVar2 = VideoWidget2.this.u;
                    com.bytedance.android.live.broadcast.api.d.a aVar3 = VideoWidget2.this.f8679b;
                    long id = VideoWidget2.this.f8746m.getId();
                    l.d(aVar3, "");
                    aVar2.f8475i++;
                    if (!LiveBroadcastUploadVideoImageSetting.INSTANCE.isDisable()) {
                        f.a.b.b bVar2 = aVar2.f8467a;
                        if (!(bVar2 == null || bVar2.isDisposed() || (bVar = aVar2.f8467a) == null)) {
                            bVar.dispose();
                        }
                        if (!aVar2.f8470d) {
                            aVar2.f8470d = true;
                            com.bytedance.android.live.core.c.a.a(3, "CaptureImageUploadController", "start");
                            aVar2.f8472f = aVar3;
                            aVar2.f8473g = id;
                            aVar2.a();
                            return;
                        }
                        return;
                    }
                    return;
                }
                VideoWidget2.this.u.b();
            }
        }
    };
    private com.bytedance.android.live.effect.api.a.c I = new com.bytedance.android.live.effect.api.a.c() {
        /* class com.bytedance.android.live.broadcast.widget.VideoWidget2.AnonymousClass4 */

        static {
            Covode.recordClassIndex(4476);
        }
    };

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.android.live.broadcast.stream.capture.a f8739f;

    /* renamed from: g  reason: collision with root package name */
    public e f8740g;

    /* renamed from: h  reason: collision with root package name */
    public com.bytedance.android.live.broadcast.stream.capture.a.a f8741h;

    /* renamed from: i  reason: collision with root package name */
    public com.bytedance.android.live.broadcast.c.a.g f8742i;

    /* renamed from: j  reason: collision with root package name */
    public c.b f8743j;

    /* renamed from: k  reason: collision with root package name */
    public c.a f8744k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f8745l;

    /* renamed from: m  reason: collision with root package name */
    public Room f8746m;
    public WeakHandler n = new WeakHandler(this);
    public volatile boolean o;
    long p;
    public c q = new c(this, (byte) 0);
    public FrameLayout r;
    public i s;
    public boolean t = false;
    public com.bytedance.android.live.broadcast.stream.a u;
    com.bytedance.android.live.broadcast.c.d v;
    public long w;
    public long x;
    public boolean y = true;
    private com.bytedance.android.live.broadcast.c.a z;

    @Override // com.bytedance.android.live.broadcast.widget.CaptureWidget2, com.bytedance.android.live.broadcast.widget.AbsCaptureWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static {
        Covode.recordClassIndex(4472);
    }

    public static boolean e() {
        return ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).isAnchorVideoEnable();
    }

    @Override // com.bytedance.android.live.broadcast.c.a.a
    public final void d_() {
        com.bytedance.android.live.effect.d.e().a("effect_gift");
    }

    public final long g() {
        Room room = this.f8746m;
        if (room != null) {
            return room.getId();
        }
        return 0;
    }

    @Override // com.bytedance.android.widget.Widget
    public void onResume() {
        super.onResume();
        this.f8742i.a();
        com.bytedance.android.live.broadcast.stream.a aVar = this.u;
        if (aVar != null) {
            aVar.a();
        }
    }

    public static long f() {
        if (u.a().b() != null) {
            return u.a().b().c();
        }
        return 0;
    }

    class c implements com.bytedance.android.live.p.f {

        /* renamed from: a  reason: collision with root package name */
        boolean f8755a;

        static {
            Covode.recordClassIndex(4479);
        }

        @Override // com.bytedance.android.live.p.f
        public final void a() {
        }

        @Override // com.bytedance.android.live.p.f
        public final void a(boolean z) {
        }

        @Override // com.bytedance.android.live.p.f
        public final void b() {
        }

        @Override // com.bytedance.android.live.p.f
        public final void b(View view, DataChannel dataChannel) {
        }

        private void c() {
            float f2;
            View view = com.bytedance.android.live.p.l.REVERSE_MIRROR.getView(VideoWidget2.this.dataChannel);
            float[] fArr = new float[2];
            boolean z = this.f8755a;
            float f3 = 0.4f;
            if (z) {
                f2 = 0.4f;
            } else {
                f2 = 1.0f;
            }
            fArr[0] = f2;
            if (z) {
                f3 = 1.0f;
            }
            fArr[1] = f3;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
            ofFloat.setDuration(100L);
            ofFloat.start();
        }

        private c() {
        }

        /* access modifiers changed from: package-private */
        public final void b(boolean z) {
            int i2;
            int i3;
            if (com.bytedance.android.live.core.f.s.a(VideoWidget2.this.dataChannel)) {
                com.bytedance.android.live.p.l lVar = com.bytedance.android.live.p.l.REVERSE_MIRROR;
                DataChannel dataChannel = VideoWidget2.this.dataChannel;
                if (VideoWidget2.this.f8745l) {
                    i3 = 2131234554;
                } else {
                    i3 = 2131234552;
                }
                lVar.setBackgroundResource(dataChannel, i3);
            } else {
                com.bytedance.android.live.p.l lVar2 = com.bytedance.android.live.p.l.REVERSE_MIRROR;
                DataChannel dataChannel2 = VideoWidget2.this.dataChannel;
                if (VideoWidget2.this.f8745l) {
                    i2 = R.drawable.c_n;
                } else {
                    i2 = R.drawable.c_o;
                }
                lVar2.setBackgroundResource(dataChannel2, i2);
            }
            if (z) {
                c();
            }
        }

        public final void onClick(View view) {
            String string;
            String str;
            if (this.f8755a && VideoWidget2.e()) {
                VideoWidget2 videoWidget2 = VideoWidget2.this;
                videoWidget2.f8745l = !videoWidget2.f8745l;
                VideoWidget2.this.f8739f.a();
                Context context = VideoWidget2.this.context;
                if (VideoWidget2.this.f8745l) {
                    string = VideoWidget2.this.context.getResources().getString(R.string.e_z);
                } else {
                    string = VideoWidget2.this.context.getResources().getString(R.string.ea0);
                }
                ao.a(context, string, 0);
                k.a(VideoWidget2.this.context);
                u.a().b().c();
                VideoWidget2.this.f8746m.getId();
                b.a.a("pm_live_mirror_click").a(VideoWidget2.this.dataChannel).b("live_take").c("click").d("live_take_detail").b();
                b(false);
                com.bytedance.android.livesdk.ab.a b2 = c.a.a("ttlive_change_mirror").b("broadcast");
                if (VideoWidget2.this.f8745l) {
                    str = "close";
                } else {
                    str = "open";
                }
                b2.a("isMirror", str).a();
            }
        }

        /* synthetic */ c(VideoWidget2 videoWidget2, byte b2) {
            this();
        }

        @Override // com.bytedance.android.live.p.f
        public final void a(View view, DataChannel dataChannel) {
            boolean z;
            if (com.bytedance.android.livesdk.ap.a.f14015i.b().intValue() != 1 || !VideoWidget2.e()) {
                z = false;
            } else {
                z = true;
            }
            this.f8755a = z;
            if (!z) {
                VideoWidget2.this.f8745l = false;
                b(true);
                return;
            }
            b(false);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void onPause() {
        f.a.b.b bVar;
        super.onPause();
        com.bytedance.android.live.broadcast.stream.a aVar = this.u;
        if (aVar != null) {
            aVar.f8474h = true;
            com.bytedance.android.live.core.c.a.a(3, "CaptureImageUploadController", "pause");
            f.a.b.b bVar2 = aVar.f8468b;
            if (bVar2 != null && !bVar2.isDisposed() && (bVar = aVar.f8468b) != null) {
                bVar.dispose();
            }
        }
    }

    public final void d() {
        HashMap hashMap = new HashMap();
        hashMap.put("sticker_id", String.valueOf(this.w));
        hashMap.put("use_time", String.valueOf((SystemClock.elapsedRealtime() - this.x) / 1000));
        b.a.a("live_sticker_use_time").a(this.dataChannel).b("live_take").c("click").a("sticker_id", String.valueOf(this.w)).a("use_time", String.valueOf((SystemClock.elapsedRealtime() - this.x) / 1000)).b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a1, code lost:
        if (r5 > 0.0f) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00cc, code lost:
        if (((com.bytedance.android.livesdk.ap.a.S.a().floatValue() + com.bytedance.android.livesdk.ap.a.R.a().floatValue()) + com.bytedance.android.livesdk.ap.a.Q.a().floatValue()) > 0.0f) goto L_0x00ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.android.live.broadcast.widget.AbsCaptureWidget
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.VideoWidget2.b():void");
    }

    @Override // com.bytedance.android.live.broadcast.widget.CaptureWidget2, com.bytedance.android.live.broadcast.widget.AbsCaptureWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        MethodCollector.i(6600);
        super.onDestroy();
        com.bytedance.android.live.broadcast.c.c a2 = com.bytedance.android.live.broadcast.c.c.a();
        if (a2.f7829a != null) {
            a2.f7829a.a();
        }
        if (a2.f7830b != null) {
            a2.f7830b.a();
            a2.f7830b = null;
        }
        com.bytedance.android.live.effect.d.e().b(this.H);
        com.bytedance.android.live.effect.d.e().b(this.I);
        com.bytedance.android.live.effect.d.e().b();
        com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) com.bytedance.android.livesdk.ap.a.at, (Object) 0);
        this.f8739f.a(PrivacyCert.Builder.with("bpea-434").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
        this.f8739f.b(this.C);
        this.f8739f.f8535b = null;
        e eVar = this.f8740g;
        if (eVar != null) {
            eVar.a();
        }
        this.f8742i.d();
        GlUtil.nativeDetachThreadToOpenGl();
        this.n.removeCallbacksAndMessages(null);
        com.bytedance.android.live.broadcast.stream.b bVar = this.E;
        if (bVar != null) {
            com.bytedance.android.live.core.c.a.a(3, "CaptureVideoUploadController", "stop");
            if (!bVar.c().isDisposed()) {
                bVar.c().dispose();
            }
            try {
                com.bytedance.android.live.broadcast.stream.b.a(new File(bVar.a()));
                com.bytedance.android.live.broadcast.stream.b.a(new File(bVar.b()));
            } catch (Throwable th) {
                com.bytedance.android.live.core.c.a.a("CaptureVideoUploadController", th);
            }
            this.E = null;
        }
        StickerImageUploader stickerImageUploader = StickerImageUploader.a.f8605a;
        if (stickerImageUploader.f8602b != null && !stickerImageUploader.f8602b.isDisposed()) {
            stickerImageUploader.f8602b.dispose();
        }
        if (stickerImageUploader.f8601a != null && !stickerImageUploader.f8601a.isDisposed()) {
            stickerImageUploader.f8601a.dispose();
        }
        stickerImageUploader.f8604d.f8606a.clear();
        MethodCollector.o(6600);
    }

    public final void c() {
        long j2;
        if (this.f8741h == null) {
            com.bytedance.android.live.broadcast.stream.capture.a.a aVar = new com.bytedance.android.live.broadcast.stream.capture.a.a();
            this.f8741h = aVar;
            this.f8739f.a(aVar);
        }
        this.f8741h.a(LiveNewEffectPanelSetting.INSTANCE.useNewPanel() ? 1 : 0);
        com.bytedance.android.live.effect.api.a.e e2 = com.bytedance.android.live.effect.d.e();
        e2.a(this.H);
        e2.a(this.I);
        l.a aVar2 = new l.a();
        aVar2.f9652b = Arrays.asList(com.bytedance.android.live.effect.api.a.f9636a, com.bytedance.android.live.effect.api.a.f9639d, "beauty");
        aVar2.f9653c = Collections.singletonList("effect_gift");
        aVar2.f9654d = this.G;
        e2.a(aVar2.a());
        com.bytedance.android.live.broadcast.c.c.a().b().a(com.bytedance.android.live.effect.api.a.f9636a, null);
        com.bytedance.android.live.broadcast.c.c.a().b().a(com.bytedance.android.live.effect.api.a.f9637b, null);
        if (this.z == null) {
            this.z = new com.bytedance.android.live.broadcast.c.b();
        }
        if (this.f8740g == null) {
            e f2 = com.bytedance.android.live.effect.d.f();
            this.f8740g = f2;
            f2.a(this.f8739f);
            this.F.a(this.f8740g);
        }
        com.bytedance.android.live.effect.api.a.e e3 = com.bytedance.android.live.effect.d.e();
        String d2 = e3.d();
        String e4 = e3.e();
        if (!TextUtils.isEmpty(d2) && !TextUtils.isEmpty(e4) && this.f8679b != null && this.f8679b.b() != null) {
            this.f8679b.b().setCustomEffect(d2, e4);
            Room room = this.f8746m;
            if (room != null) {
                j2 = room.getId();
            } else {
                j2 = 0;
            }
            StickerImageUploader.a.f8605a.a(new StickerImageUploader.c(d2, e4, j2, u.a().b().c()));
            e3.c(null);
            e3.d(null);
        }
        this.v = new com.bytedance.android.live.broadcast.c.d(this.f8739f);
        com.bytedance.android.live.effect.d.c().a(this.dataChannel, this, false);
        com.bytedance.android.live.effect.d.g().a(this.dataChannel, true);
        com.bytedance.android.live.effect.d.g().a(this.n, this.dataChannel, true);
    }

    @Override // com.bytedance.android.live.broadcast.widget.CaptureWidget2, com.bytedance.android.live.broadcast.widget.AbsCaptureWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        boolean z2;
        super.onCreate();
        a(com.bytedance.android.live.broadcast.api.model.b.class);
        a(r.class);
        a(v.class);
        this.f8746m = (Room) this.dataChannel.b(df.class);
        com.bytedance.android.live.broadcast.stream.capture.b bVar = new com.bytedance.android.live.broadcast.stream.capture.b(this.f8681d, this.f8679b, true);
        this.f8739f = bVar;
        bVar.a(this.f8680c);
        q qVar = new q(this);
        this.C = qVar;
        this.f8739f.a(qVar);
        this.f8739f.a((c.a) com.bytedance.android.livesdkapi.m.f.a(new c.a() {
            /* class com.bytedance.android.live.broadcast.widget.VideoWidget2.AnonymousClass1 */

            static {
                Covode.recordClassIndex(4473);
            }

            @Override // com.bytedance.android.live.broadcast.stream.capture.c.a
            public final void a() {
                if (!VideoWidget2.this.t) {
                    VideoWidget2.this.t = true;
                    if (com.bytedance.android.live.u.g.d()) {
                        VideoWidget2.this.c();
                    } else {
                        VideoWidget2.this.n.post(new t(this));
                    }
                }
            }

            @Override // com.bytedance.android.live.broadcast.stream.capture.c.a
            public final void a(int i2, int i3) {
                com.bytedance.android.live.core.c.a.a(6, VideoWidget2.f8738e, "CameraState onError status: " + i2 + ", ret: " + i3 + ", msg: " + ((String) null));
            }
        }));
        if (com.bytedance.android.live.core.f.b.b.b() && com.bytedance.android.live.core.f.b.b.a() == 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getView().getLayoutParams();
            layoutParams.width = (int) (((float) y.b()) * 0.5625f);
            layoutParams.gravity = 17;
        }
        int value = StreamHardwareEncodeSetting.INSTANCE.getValue();
        if (value <= 0) {
            z2 = this.B.f23187i;
        } else if (value == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.bytedance.android.live.broadcast.stream.b bVar2 = new com.bytedance.android.live.broadcast.stream.b(this.f8679b, this.B.b(), this.B.a(), z2);
        this.E = bVar2;
        if (LiveCaptureVideoRecordDurationSetting.INSTANCE.getValue() <= 0.0f) {
            com.bytedance.android.livesdk.ap.b<Long> bVar3 = com.bytedance.android.livesdk.ap.a.z;
            h.f.b.l.b(bVar3, "");
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar3, (Object) 0L);
        } else {
            com.bytedance.android.livesdk.ap.b<Long> bVar4 = com.bytedance.android.livesdk.ap.a.z;
            h.f.b.l.b(bVar4, "");
            Long a2 = bVar4.a();
            h.f.b.l.b(a2, "");
            if (!ae.f9046a.format(new Date(a2.longValue())).equals(ae.f9046a.format(new Date()))) {
                bVar2.f8487a = 0;
                bVar2.c().a(t.b((Object) 1).e(60, TimeUnit.SECONDS).a(new b.f(bVar2), b.g.f8500a));
            }
        }
        this.u = new com.bytedance.android.live.broadcast.stream.a();
        List<com.bytedance.android.livesdkapi.depend.model.a> b2 = com.bytedance.android.live.effect.d.e().b(com.bytedance.android.live.effect.api.a.f9637b);
        if (b2.size() > 0) {
            long j2 = b2.get(0).f22995a;
            a(j2);
            this.w = j2;
            this.x = SystemClock.elapsedRealtime();
        }
        this.f8742i = new com.bytedance.android.live.broadcast.c.a.g(this);
        com.bytedance.android.live.p.l.STICKER.load(this.dataChannel, new d(this, (byte) 0));
        com.bytedance.android.live.p.l.PROPS.load(this.dataChannel, new a(this, (byte) 0));
        com.bytedance.android.live.p.l.REVERSE_CAMERA.load(this.dataChannel, new b(this, (byte) 0));
        com.bytedance.android.live.p.l.REVERSE_MIRROR.load(this.dataChannel, this.q);
    }

    class a implements com.bytedance.android.live.p.f {
        static {
            Covode.recordClassIndex(4477);
        }

        @Override // com.bytedance.android.live.p.f
        public final void a() {
        }

        @Override // com.bytedance.android.live.p.f
        public final void a(boolean z) {
        }

        @Override // com.bytedance.android.live.p.f
        public final void b() {
        }

        @Override // com.bytedance.android.live.p.f
        public final void b(View view, DataChannel dataChannel) {
        }

        private a() {
        }

        public final void onClick(View view) {
            String str;
            com.bytedance.android.livesdk.v propsStickerDialog = ((com.bytedance.android.live.c.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.c.b.class)).getPropsStickerDialog();
            if (propsStickerDialog != null) {
                propsStickerDialog.show(VideoWidget2.this.s, "PROPS");
                if (VideoWidget2.this.f8746m != null) {
                    str = String.valueOf(VideoWidget2.this.f8746m.getOwnerUserId());
                } else {
                    str = "";
                }
                b.a.a("livesdk_anchor_prop_click").a(VideoWidget2.this.dataChannel).a("anchor_id", str).b();
                com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) com.bytedance.android.livesdk.ap.a.cA, (Object) false);
                VideoWidget2.this.dataChannel.c(h.class);
            }
        }

        /* synthetic */ a(VideoWidget2 videoWidget2, byte b2) {
            this();
        }

        @Override // com.bytedance.android.live.p.f
        public final void a(View view, DataChannel dataChannel) {
            com.bytedance.android.live.p.l.PROPS.setRedDotVisible(dataChannel, com.bytedance.android.livesdk.ap.a.cA.a().booleanValue());
        }
    }

    class b implements com.bytedance.android.live.p.f {

        /* renamed from: b  reason: collision with root package name */
        private boolean f8753b;

        /* renamed from: c  reason: collision with root package name */
        private long f8754c;

        static {
            Covode.recordClassIndex(4478);
        }

        @Override // com.bytedance.android.live.p.f
        public final void a() {
        }

        @Override // com.bytedance.android.live.p.f
        public final void a(boolean z) {
        }

        @Override // com.bytedance.android.live.p.f
        public final void b() {
        }

        @Override // com.bytedance.android.live.p.f
        public final void b(View view, DataChannel dataChannel) {
        }

        private b() {
        }

        public final void onClick(View view) {
            String str;
            if (VideoWidget2.e()) {
                if (com.bytedance.android.live.core.f.b.b.b()) {
                    ao.a(y.e(), (int) R.string.go9);
                }
                if (this.f8754c == 0) {
                    this.f8754c = SystemClock.elapsedRealtime();
                } else {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime >= this.f8754c + 1500) {
                        this.f8754c = elapsedRealtime;
                    } else {
                        return;
                    }
                }
                this.f8753b = !this.f8753b;
                if (VideoWidget2.this.f8745l) {
                    VideoWidget2.this.f8739f.a();
                }
                VideoWidget2.this.f8739f.b(PrivacyCert.Builder.with("bpea-376").usage("").tag("reverse camera during live broadcast").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
                VideoWidget2.this.dataChannel.c(com.bytedance.android.live.broadcast.api.h.class, Float.valueOf(0.0f));
                c cVar = VideoWidget2.this.q;
                cVar.f8755a = this.f8753b;
                if (!cVar.f8755a) {
                    VideoWidget2.this.f8745l = false;
                }
                cVar.b(true);
                com.bytedance.android.live.effect.d.e().c();
                com.bytedance.android.livesdk.ap.a.f14015i.b(Integer.valueOf(this.f8753b ? 1 : 0));
                k.a(VideoWidget2.this.getContext());
                b.a.a("pm_live_switch_camera_click").a(VideoWidget2.this.dataChannel).b("live_take").c("click").b();
                com.bytedance.android.livesdk.ab.a b2 = c.a.a("ttlive_switch_camera").b("broadcast");
                if (this.f8753b) {
                    str = "front";
                } else {
                    str = "back";
                }
                b2.a("select_camera_type", str).a();
            }
        }

        /* synthetic */ b(VideoWidget2 videoWidget2, byte b2) {
            this();
        }

        @Override // com.bytedance.android.live.p.f
        public final void a(View view, DataChannel dataChannel) {
            boolean z;
            float f2;
            if (com.bytedance.android.livesdk.ap.a.f14015i.b().intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f8753b = z;
            View view2 = com.bytedance.android.live.p.l.REVERSE_CAMERA.getView(VideoWidget2.this.dataChannel);
            float[] fArr = new float[2];
            float f3 = 0.4f;
            if (VideoWidget2.e()) {
                f2 = 0.4f;
            } else {
                f2 = 1.0f;
            }
            fArr[0] = f2;
            if (VideoWidget2.e()) {
                f3 = 1.0f;
            }
            fArr[1] = f3;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", fArr);
            ofFloat.setDuration(100L);
            ofFloat.start();
        }
    }

    class d implements com.bytedance.android.live.p.f {
        static {
            Covode.recordClassIndex(4480);
        }

        @Override // com.bytedance.android.live.p.f
        public final void a() {
        }

        @Override // com.bytedance.android.live.p.f
        public final void a(View view, DataChannel dataChannel) {
        }

        @Override // com.bytedance.android.live.p.f
        public final void a(boolean z) {
        }

        @Override // com.bytedance.android.live.p.f
        public final void b() {
        }

        @Override // com.bytedance.android.live.p.f
        public final void b(View view, DataChannel dataChannel) {
        }

        private d() {
        }

        public final void onClick(View view) {
            IHostApp iHostApp = (IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class);
            if (iHostApp != null && VideoWidget2.this.r != null) {
                iHostApp.showStickerView((androidx.appcompat.app.d) p.a(VideoWidget2.this.getContext()), VideoWidget2.this.s, "livestreaming", VideoWidget2.this.r, new n() {
                    /* class com.bytedance.android.live.broadcast.widget.VideoWidget2.d.AnonymousClass1 */

                    /* renamed from: b  reason: collision with root package name */
                    private String f8759b;

                    static {
                        Covode.recordClassIndex(4481);
                    }

                    @Override // com.bytedance.android.livesdkapi.host.n
                    public final void a(String str) {
                    }

                    @Override // com.bytedance.android.livesdkapi.host.n
                    public final void b(String str) {
                    }

                    @Override // com.bytedance.android.livesdkapi.host.n
                    public final void c(String str) {
                        if (VideoWidget2.this.y) {
                            VideoWidget2.this.y = false;
                            return;
                        }
                        this.f8759b = str;
                        b.a.a("livesdk_pm_live_sticker_tab_change").a(VideoWidget2.this.dataChannel).a("tab", str).b();
                    }

                    @Override // com.bytedance.android.livesdkapi.host.n
                    public final void b(com.bytedance.android.livesdkapi.depend.model.a aVar) {
                        VideoWidget2.this.a(0L);
                        VideoWidget2.this.dataChannel.c(ah.class, "");
                        com.bytedance.android.live.effect.d.e().a(com.bytedance.android.live.effect.api.a.f9637b);
                        if (VideoWidget2.this.w > 0) {
                            VideoWidget2.this.d();
                        }
                        VideoWidget2.this.w = 0;
                        LivePerformanceManager.getInstance().onModuleStop("sticker");
                        com.bytedance.android.live.broadcast.e.a.f7847a.remove("sticker_id");
                        VideoWidget2.this.dataChannel.c(dr.class, true);
                    }

                    @Override // com.bytedance.android.livesdkapi.host.n
                    public final void a(com.bytedance.android.livesdkapi.depend.model.a aVar) {
                        VideoWidget2.this.a(aVar.f22995a);
                        VideoWidget2.this.dataChannel.c(ah.class, aVar.f23000f);
                        com.bytedance.android.live.effect.d.e().a(com.bytedance.android.live.effect.api.a.f9637b);
                        com.bytedance.android.live.effect.d.e().a(com.bytedance.android.live.effect.api.a.f9637b, aVar);
                        if (VideoWidget2.this.w > 0 && VideoWidget2.this.w != aVar.f22995a) {
                            VideoWidget2.this.d();
                        }
                        if (VideoWidget2.this.w != aVar.f22995a) {
                            VideoWidget2.this.x = SystemClock.elapsedRealtime();
                            VideoWidget2.this.dataChannel.c(ds.class, new com.bytedance.android.live.broadcast.api.model.d(com.bytedance.android.live.effect.api.a.f9637b, aVar, this.f8759b));
                        }
                        VideoWidget2.this.w = aVar.f22995a;
                        c.a.a("ttlive_change_sticker").b("broadcast").a("select_sticker_id", Long.valueOf(aVar.f22995a)).a("select_sticker_name", aVar.f22999e).a();
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", String.valueOf(aVar.f22995a));
                        hashMap.put(StringSet.name, aVar.f22999e);
                        LivePerformanceManager.getInstance().onModuleStart("sticker", hashMap);
                        com.bytedance.android.live.broadcast.e.a.f7847a.put("sticker_id", String.valueOf(aVar.f22995a));
                        c.a.a("ttlive_broadcast_action_all").b("action", "change_sticker").b("action_id", Long.valueOf(aVar.f22995a)).b("user_id", Long.valueOf(VideoWidget2.f())).b("room_id", Long.valueOf(VideoWidget2.this.g())).a();
                    }

                    @Override // com.bytedance.android.livesdkapi.host.n
                    public final int a(String str, String str2) {
                        long j2;
                        if (VideoWidget2.this.f8679b == null || VideoWidget2.this.f8679b.b() == null) {
                            return -1;
                        }
                        int customEffect = VideoWidget2.this.f8679b.b().setCustomEffect(str, str2);
                        if (VideoWidget2.this.f8746m != null) {
                            j2 = VideoWidget2.this.f8746m.getId();
                        } else {
                            j2 = 0;
                        }
                        StickerImageUploader.a.f8605a.a(new StickerImageUploader.c(str, str2, j2, u.a().b().c()));
                        return customEffect;
                    }
                });
                b.a.a("pm_live_sticker_click").a(VideoWidget2.this.dataChannel).c("click").b("live_take").b();
            }
        }

        /* synthetic */ d(VideoWidget2 videoWidget2, byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.interact.b
    public final Client a(LiveCore.InteractConfig interactConfig) {
        return this.f8679b.a(interactConfig);
    }

    @Override // com.bytedance.android.live.effect.api.a.g
    public final void a(float f2) {
        com.bytedance.android.live.broadcast.c.a aVar = this.z;
        if (aVar != null) {
            aVar.a(f2);
        }
    }

    @Override // com.bytedance.android.live.effect.api.a.g
    public final void b(float f2) {
        com.bytedance.android.live.broadcast.c.a aVar = this.z;
        if (aVar != null) {
            aVar.b(f2);
        }
    }

    @Override // com.bytedance.android.live.effect.api.a.g
    public final void c(float f2) {
        com.bytedance.android.live.broadcast.c.a aVar = this.z;
        if (aVar != null) {
            aVar.c(f2);
        }
    }

    private <T> void a(Class<T> cls) {
        com.bytedance.android.livesdk.an.a.a().a((Class) cls).a(getAutoUnbindTransformer()).d(new p(this));
    }

    @Override // com.bytedance.android.live.broadcast.c.a.a
    public final void a(com.bytedance.android.livesdkapi.depend.model.a aVar) {
        com.bytedance.android.live.effect.d.e().a("effect_gift", aVar);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        c.a aVar;
        boolean z2;
        if (isViewValid() && message.what == 101 && (aVar = this.f8744k) != null) {
            if (!(message.obj instanceof Integer) || ((Integer) message.obj).intValue() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            aVar.a(z2);
        }
    }

    public final void a(long j2) {
        String valueOf;
        if (j2 != this.w) {
            StickerReportApi d2 = d.a.a().d();
            long g2 = g();
            String str = "";
            if (j2 == 0) {
                valueOf = str;
            } else {
                valueOf = String.valueOf(j2);
            }
            long j3 = this.w;
            if (j3 != 0) {
                str = String.valueOf(j3);
            }
            d2.reportEffectChange(g2, 1, valueOf, str).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(r.f8819a, s.f8820a);
        }
    }

    public void onEvent(com.bytedance.android.live.broadcast.api.model.b bVar) {
        if (this.f8740g != null) {
            if (bVar.f7543a == 1) {
                this.f8740g.c();
                a(true);
                com.bytedance.android.live.effect.d.g().b(this.dataChannel, false, this.f8740g.e(), false, this.f8740g.f() + 1);
            } else if (bVar.f7543a == 2) {
                this.f8740g.d();
                a(false);
                com.bytedance.android.live.effect.d.g().b(this.dataChannel, false, this.f8740g.e(), false, this.f8740g.f() + 1);
            }
            com.bytedance.android.live.effect.d.f().a(this.f8746m.getId());
            c.a.a("ttlive_broadcast_action_all").b("action", "change_filter").b("action_id", Integer.valueOf(this.f8740g.f())).b("user_id", Long.valueOf(f())).b("room_id", Long.valueOf(g())).a();
        }
    }

    public final void a(boolean z2) {
        e eVar = this.f8740g;
        if (eVar != null) {
            String b2 = eVar.b();
            c.b bVar = this.f8743j;
            if (bVar != null) {
                bVar.a(b2, z2);
            }
        }
    }

    public void onEvent(r rVar) {
        String string;
        int i2 = rVar.f15142a;
        if (i2 == 2) {
            this.f8739f.b(PrivacyCert.Builder.with("bpea-377").usage("").tag("reverse camera during social live").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            this.f8745l = false;
        } else if (i2 == 22) {
            this.f8745l = !this.f8745l;
            this.f8739f.a();
            Context context = this.context;
            if (this.f8745l) {
                string = this.context.getResources().getString(R.string.e_z);
            } else {
                string = this.context.getResources().getString(R.string.ea0);
            }
            ao.a(context, string, 0);
            k.a(this.context);
            u.a().b().c();
            this.f8746m.getId();
        } else if (i2 == 40) {
            this.f8739f.a(true, PrivacyCert.Builder.with("bpea-805").usage("").tag("multi live anchor open camera").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
        } else if (i2 == 41) {
            this.f8739f.a(false, PrivacyCert.Builder.with("bpea-806").usage("").tag("multi live anchor close camera").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
        }
    }

    @Override // com.bytedance.android.live.broadcast.c.a.a
    public final void a(String str, String str2) {
        com.bytedance.android.live.core.c.a.a(3, f8738e, "set custom sticker image:".concat(String.valueOf(str2)));
        this.f8741h.a(str, str2);
    }

    public VideoWidget2(com.bytedance.android.live.broadcast.stream.capture.f fVar, s sVar, com.bytedance.android.live.broadcast.api.d.a aVar) {
        super(fVar, aVar);
        this.B = sVar;
        this.F = ((IEffectService) com.bytedance.android.live.t.a.a(IEffectService.class)).getLiveFilterManager();
    }
}
