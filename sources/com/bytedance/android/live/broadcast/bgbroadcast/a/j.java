package com.bytedance.android.live.broadcast.bgbroadcast.a;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.bgbroadcast.BgBroadcastServiceImpl;
import com.bytedance.android.live.broadcast.bgbroadcast.a.a.a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.core.widget.a.b;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.c.y;
import com.bytedance.android.livesdk.chatroom.ui.ap;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.livesetting.broadcast.EnableTTCaptureSetting;
import com.bytedance.android.livesdk.s.j;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.utils.z;
import com.bytedance.android.livesdkapi.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.message.IMessageService;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import f.a.t;
import java.lang.reflect.Field;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class j extends com.bytedance.android.live.broadcast.bgbroadcast.b {

    /* renamed from: k  reason: collision with root package name */
    public static final a f7671k = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public boolean f7672f;

    /* renamed from: g  reason: collision with root package name */
    com.bytedance.android.live.publicscreen.a.d f7673g;

    /* renamed from: h  reason: collision with root package name */
    public int f7674h;

    /* renamed from: i  reason: collision with root package name */
    public g f7675i;

    /* renamed from: j  reason: collision with root package name */
    com.bytedance.android.live.publicscreen.a.c.b f7676j;

    /* renamed from: l  reason: collision with root package name */
    private boolean f7677l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f7678m = this.f7724b.getIntent().getBooleanExtra("hotsoon.intent.extra.IS_LANDSCAPE", true);
    private boolean n;
    private boolean o;
    private Dialog p;
    private f.a.b.b q;
    private final y r = new y();
    private final Handler s = new Handler();
    private r t;
    private k u;
    private Intent v;
    private HSImageView w;
    private com.bytedance.android.livesdkapi.a x;
    private final BroadcastReceiver y = new n(this);

    static {
        Covode.recordClassIndex(3783);
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.b
    public final int b() {
        return R.layout.b55;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(3784);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a(boolean z) {
        a aVar = a.CMD_ORIENTATION_CHANGED;
        aVar.setParam(new n(z, this.f7674h));
        a(aVar);
    }

    public static final class c extends com.bytedance.android.livesdk.s.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f7681a;

        static {
            Covode.recordClassIndex(3787);
        }

        @Override // com.bytedance.android.livesdk.s.f, com.bytedance.android.livesdk.s.c
        public final void d() {
            this.f7681a.a(a.CMD_DRAG_MOVE_END);
        }

        @Override // com.bytedance.android.livesdk.s.f, com.bytedance.android.livesdk.s.c
        public final void e() {
            this.f7681a.a(a.CMD_CLICK_FLOAT_BALL);
        }

        @Override // com.bytedance.android.livesdk.s.f, com.bytedance.android.livesdk.s.c
        public final void a() {
            b.a.a("livesdk_floating_window_status").a("isOpen", "1").b();
        }

        @Override // com.bytedance.android.livesdk.s.f, com.bytedance.android.livesdk.s.c
        public final void b() {
            b.a.a("livesdk_floating_window_status").a("isOpen", "0").b();
        }

        @Override // com.bytedance.android.livesdk.s.f, com.bytedance.android.livesdk.s.c
        public final void c() {
            this.f7681a.a(a.CMD_DRAG_MOVE_START);
            b.a.a("livesdk_floating_ball_drag").b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(j jVar) {
            this.f7681a = jVar;
        }

        @Override // com.bytedance.android.livesdk.s.f, com.bytedance.android.livesdk.s.c
        public final void a(int i2, int i3) {
            j jVar = this.f7681a;
            a aVar = a.CMD_DRAG_ONGOING;
            aVar.setParam(new o(true, i2, i3));
            jVar.a(aVar);
        }
    }

    public static final class d implements com.bytedance.android.live.publicscreen.a.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f7682a;

        static {
            Covode.recordClassIndex(3788);
        }

        @Override // com.bytedance.android.live.publicscreen.a.c.a
        public final void b() {
            this.f7682a.a(a.CMD_NEW_COMMON_MSG);
        }

        @Override // com.bytedance.android.live.publicscreen.a.c.a
        public final void a() {
            if (this.f7682a.f7675i != null) {
                this.f7682a.a(a.CMD_READ_REMIND_MSG);
            }
        }

        @Override // com.bytedance.android.live.publicscreen.a.c.a
        public final void c() {
            g gVar = this.f7682a.f7675i;
            if (gVar != null && h.f.b.l.a(gVar.n, gVar.q) && gVar.f()) {
                com.bytedance.android.livesdk.s.h hVar = gVar.f7627c;
                if (hVar == null) {
                    h.f.b.l.a("msgWindow");
                }
                if (hVar.f21125k) {
                    gVar.a(true, false);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(j jVar) {
            this.f7682a = jVar;
        }

        @Override // com.bytedance.android.live.publicscreen.a.c.a
        public final void a(int i2) {
            g gVar = this.f7682a.f7675i;
            if (gVar != null) {
                gVar.f7630f = i2;
                if (i2 == 1) {
                    gVar.a(true, false);
                }
            }
        }
    }

    public static final class e extends com.bytedance.android.livesdk.s.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f7683a;

        static {
            Covode.recordClassIndex(3789);
        }

        @Override // com.bytedance.android.livesdk.s.f, com.bytedance.android.livesdk.s.c
        public final void d() {
            this.f7683a.a(a.CMD_DRAG_MOVE_END);
        }

        @Override // com.bytedance.android.livesdk.s.f, com.bytedance.android.livesdk.s.c
        public final void c() {
            this.f7683a.a(a.CMD_DRAG_MOVE_START);
            b.a.a("livesdk_floating_ball_drag").b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(j jVar) {
            this.f7683a = jVar;
        }

        @Override // com.bytedance.android.livesdk.s.f, com.bytedance.android.livesdk.s.c
        public final void a(int i2, int i3) {
            j jVar = this.f7683a;
            a aVar = a.CMD_DRAG_ONGOING;
            aVar.setParam(new o(false, i2, i3));
            jVar.a(aVar);
        }
    }

    static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f7690a;

        static {
            Covode.recordClassIndex(3796);
        }

        l(j jVar) {
            this.f7690a = jVar;
        }

        public final void run() {
            this.f7690a.a(a.CMD_TRANSITION_TO_HIDDEN);
        }
    }

    private static com.bytedance.android.livesdk.s.h k() {
        com.bytedance.android.livesdk.s.b b2 = com.bytedance.android.livesdk.s.j.b("control_view");
        if (!(b2 instanceof com.bytedance.android.livesdk.s.h)) {
            b2 = null;
        }
        return (com.bytedance.android.livesdk.s.h) b2;
    }

    private static com.bytedance.android.livesdk.s.h l() {
        return (com.bytedance.android.livesdk.s.h) com.bytedance.android.livesdk.s.j.b("msg_view");
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.b
    public final void i() {
        a(a.CMD_TRANSITION_TO_DESTROY);
        this.f7672f = true;
    }

    static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f7686a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f7687b;

        static {
            Covode.recordClassIndex(3793);
        }

        i(j jVar, View view) {
            this.f7686a = jVar;
            this.f7687b = view;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f7687b.getWindowVisibleDisplayFrame(rect);
            if (rect.top == 0) {
                this.f7686a.f7674h = 0;
            }
            this.f7686a.a(true);
        }
    }

    static final class m implements a.AbstractC0499a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f7691a;

        static {
            Covode.recordClassIndex(3797);
        }

        m(j jVar) {
            this.f7691a = jVar;
        }

        @Override // com.bytedance.android.livesdkapi.a.AbstractC0499a
        public final void a() {
            com.bytedance.android.live.core.c.a.a(3, this.f7691a.f7723a, "room close onLiveFinished");
            this.f7691a.f7726d.d();
        }
    }

    private final void m() {
        MethodCollector.i(8413);
        if (this.t != null) {
            MethodCollector.o(8413);
            return;
        }
        View inflate = LayoutInflater.from(com.bytedance.android.live.core.f.y.e()).inflate(R.layout.bf_, (ViewGroup) null);
        h.f.b.l.b(inflate, "");
        inflate.setClickable(false);
        Context e2 = com.bytedance.android.live.core.f.y.e();
        h.f.b.l.b(e2, "");
        Context a2 = a(e2);
        h.f.b.l.b(a2, "");
        this.t = new r(a2, inflate);
        MethodCollector.o(8413);
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.b
    public final void a() {
        com.bytedance.android.livesdk.model.k.GAME.config();
        this.f7727e.a(this, com.bytedance.android.live.publicscreen.a.j.class, new h(this));
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.b
    public final void f() {
        this.n = com.bytedance.android.livesdk.s.k.a(this.f7724b);
        if (this.o) {
            com.bytedance.android.live.publicscreen.a.c.b bVar = this.f7676j;
            if (bVar != null) {
                bVar.b();
            }
            this.q = t.b(1000, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new C0108j(this), k.f7689a);
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.b
    public final void g() {
        Dialog dialog;
        a(a.CMD_TRANSITION_TO_DESTROY);
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.ae;
        h.f.b.l.b(bVar, "");
        if (!bVar.a().booleanValue() && (dialog = this.p) != null) {
            p.b(dialog);
        }
        f.a.b.b bVar2 = this.q;
        if (bVar2 != null) {
            bVar2.dispose();
        }
        this.f7727e.b(this);
        com.bytedance.android.live.publicscreen.a.c.b bVar3 = this.f7676j;
        if (bVar3 != null) {
            bVar3.c();
        }
        this.f7724b.unregisterReceiver(this.y);
    }

    public static final class b implements a.AbstractC0106a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f7679a;

        static {
            Covode.recordClassIndex(3785);
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.a.a.a.AbstractC0106a
        public final void a() {
            Activity activity = this.f7679a.f7724b;
            String str = Build.MANUFACTURER;
            str.hashCode();
            if (str.equals("Xiaomi")) {
                int i2 = Build.VERSION.SDK_INT;
                if (!com.bytedance.android.livesdk.s.k.d(activity)) {
                    new b.a(this.f7679a.f7724b).b(R.string.goe).a(R.string.gwr, (DialogInterface.OnClickListener) a.f7680a, false).a().show();
                    return;
                }
            }
            this.f7679a.f7726d.f();
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_floating_ball_click").a("click_icon", "home");
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.D;
            h.f.b.l.b(bVar, "");
            Boolean a3 = bVar.a();
            h.f.b.l.b(a3, "");
            a2.a("notification_status", a3.booleanValue() ? 1 : 0).b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(j jVar) {
            this.f7679a = jVar;
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.a.a.a.AbstractC0106a
        public final void a(boolean z) {
            a aVar;
            j jVar = this.f7679a;
            if (z) {
                aVar = a.CMD_CLICK_MSG_BTN_CHECKED;
            } else {
                aVar = a.CMD_CLICK_MSG_BTN_UNCHECKED;
            }
            jVar.a(aVar);
            b.a.a("livesdk_floating_ball_click").a("click_icon", "notification").a("notification_status", z ? 1 : 0).b();
        }

        static final class a implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static final a f7680a = new a();

            static {
                Covode.recordClassIndex(3786);
            }

            a() {
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                h.f.b.l.d(dialogInterface, "");
                dialogInterface.dismiss();
            }
        }
    }

    private final void n() {
        com.bytedance.android.live.publicscreen.a.c.b createGameMessageView = ((com.bytedance.android.live.publicscreen.a.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.publicscreen.a.e.class)).createGameMessageView(this.f7724b, 2, new d(this));
        this.f7676j = createGameMessageView;
        com.bytedance.android.live.publicscreen.a.d dVar = this.f7673g;
        if (!(dVar == null || createGameMessageView == null)) {
            createGameMessageView.a(dVar);
        }
        j.a a2 = com.bytedance.android.livesdk.s.j.a(com.bytedance.android.live.core.f.y.e());
        a2.f21146b = this.f7676j;
        a2.r = "msg_view";
        a2.f21155k = 2;
        j.a a3 = a2.a().a(new AccelerateDecelerateInterpolator());
        a3.s = true;
        a3.t = new e(this);
        a3.b();
    }

    private final void o() {
        com.bytedance.android.live.broadcast.bgbroadcast.a.a.a aVar = new com.bytedance.android.live.broadcast.bgbroadcast.a.a.a(this.f7724b);
        aVar.setOnViewClickListener(new b(this));
        j.a a2 = com.bytedance.android.livesdk.s.j.a(com.bytedance.android.live.core.f.y.e());
        a2.f21146b = aVar;
        a2.r = "control_view";
        a2.f21155k = 2;
        a2.f21148d = com.bytedance.android.live.core.f.y.a(166.0f);
        a2.f21149e = com.bytedance.android.live.core.f.y.a(96.0f);
        j.a a3 = a2.a().a(new AccelerateDecelerateInterpolator());
        a3.s = true;
        a3.t = new c(this);
        a3.b();
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.b
    public final void d() {
        HSImageView hSImageView;
        this.w = (HSImageView) this.f7724b.findViewById(R.id.qq);
        float a2 = (float) (com.bytedance.common.utility.n.a(this.f7724b) / com.bytedance.common.utility.n.b(this.f7724b));
        if (this.f7725c.background != null) {
            if (Build.VERSION.SDK_INT >= 23 && (hSImageView = this.w) != null) {
                hSImageView.setForeground(null);
            }
            com.bytedance.android.live.core.f.k.a(this.w, this.f7725c.background);
            return;
        }
        HSImageView hSImageView2 = this.w;
        User owner = this.f7725c.getOwner();
        h.f.b.l.b(owner, "");
        com.bytedance.android.live.core.f.k.a(hSImageView2, owner.getAvatarThumb(), new z(5, a2));
    }

    private final void j() {
        Boolean bool;
        com.bytedance.android.livesdk.s.h l2;
        com.bytedance.android.livesdk.s.h l3;
        com.bytedance.android.livesdk.s.h k2;
        if (!this.f7677l) {
            this.f7677l = true;
            com.bytedance.android.livesdk.s.h k3 = k();
            Boolean bool2 = null;
            if (k3 != null) {
                bool = Boolean.valueOf(k3.f21125k);
            } else {
                bool = null;
            }
            if (p.a(bool) && (k2 = k()) != null) {
                k2.a();
            }
            com.bytedance.android.livesdk.s.h l4 = l();
            if (l4 != null) {
                bool2 = Boolean.valueOf(l4.f21125k);
            }
            if (p.a(bool2) && (l3 = l()) != null) {
                l3.a();
            }
            if (this.f7724b != null) {
                int i2 = Build.VERSION.SDK_INT;
                if (!this.f7724b.isDestroyed()) {
                    o();
                    n();
                    m();
                    this.u = new k();
                    g gVar = new g();
                    r rVar = this.t;
                    if (rVar != null) {
                        com.bytedance.android.livesdk.s.h k4 = k();
                        if (!(k4 == null || (l2 = l()) == null)) {
                            gVar.a(k4, l2, rVar);
                        }
                        k kVar = this.u;
                        if (kVar == null) {
                            h.f.b.l.b();
                        }
                        gVar.a(kVar);
                    }
                    this.f7675i = gVar;
                    a(a.CMD_TRANSITION_TO_INIT);
                    a(a.CMD_TRANSITION_TO_HIDDEN);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.b
    public final void c() {
        Intent createScreenCaptureIntent;
        Activity activity = this.f7724b;
        BroadcastReceiver broadcastReceiver = this.y;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
        b(activity, broadcastReceiver, intentFilter);
        this.n = com.bytedance.android.livesdk.s.k.a(this.f7724b);
        com.bytedance.android.live.core.f.y.f9121c = false;
        com.bytedance.android.live.core.f.y.f9120b = new int[]{0, 0};
        this.v = (Intent) this.f7724b.getIntent().getParcelableExtra("hotsoon.intent.extra.PROJECTION_INTENT");
        if (Build.VERSION.SDK_INT >= 21 && EnableTTCaptureSetting.INSTANCE.enable()) {
            com.bytedance.android.live.broadcast.m.a().b();
            if (this.v == null) {
                Object a2 = a(this.f7724b, "media_projection");
                Objects.requireNonNull(a2, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
                MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) a2;
                Pair<Boolean, Object> a3 = com.bytedance.helios.sdk.a.a(mediaProjectionManager, new Object[0], 102100, "android.content.Intent", false, null);
                if (((Boolean) a3.first).booleanValue()) {
                    createScreenCaptureIntent = (Intent) a3.second;
                } else {
                    createScreenCaptureIntent = mediaProjectionManager.createScreenCaptureIntent();
                    com.bytedance.helios.sdk.a.a(createScreenCaptureIntent, mediaProjectionManager, new Object[0], 102100, "com_bytedance_android_live_broadcast_bgbroadcast_game_GameUiStrategy_android_media_projection_MediaProjectionManager_createScreenCaptureIntent(Landroid/media/projection/MediaProjectionManager;)Landroid/content/Intent;");
                }
                this.f7726d.c().startActivityForResult(createScreenCaptureIntent, 1000);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r1 == false) goto L_0x0079;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053 A[Catch:{ Exception -> 0x0057 }] */
    @Override // com.bytedance.android.live.broadcast.bgbroadcast.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.bgbroadcast.a.j.e():void");
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.b
    public final void h() {
        Dialog dialog;
        boolean a2 = com.bytedance.android.livesdk.s.k.a(this.f7724b);
        if (a2) {
            j();
        }
        if (a2) {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.ai;
            h.f.b.l.b(bVar, "");
            if (bVar.a().booleanValue()) {
                com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.ah;
                h.f.b.l.b(bVar2, "");
                if (bVar2.a().booleanValue()) {
                    return;
                }
            }
        }
        com.bytedance.android.live.core.c.a.a(4, this.f7723a, "onShowInteraction: no float window permission");
        com.bytedance.android.livesdk.l.b a3 = new b.a(this.f7724b).a(R.string.ek5).b(R.string.ek4).a(R.string.ek2, (DialogInterface.OnClickListener) new f(this), false).b(R.string.ek1, (DialogInterface.OnClickListener) new g(this), false).a();
        this.p = a3;
        if (!(a3 instanceof com.bytedance.android.livesdk.l.b)) {
            a3 = null;
        }
        com.bytedance.android.livesdk.l.b bVar3 = a3;
        if (bVar3 != null) {
            bVar3.setCanceledOnTouchOutside(false);
        }
        Dialog dialog2 = this.p;
        if (dialog2 != null && !dialog2.isShowing() && !this.f7672f && (dialog = this.p) != null) {
            dialog.show();
        }
    }

    public static final class n extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f7692a;

        static {
            Covode.recordClassIndex(3798);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        n(j jVar) {
            this.f7692a = jVar;
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(6697);
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
                        MethodCollector.o(6697);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }

        public final void onReceive(Context context, Intent intent) {
            boolean z;
            h.f.b.l.d(context, "");
            h.f.b.l.d(intent, "");
            if (TextUtils.equals(intent.getAction(), "android.intent.action.CONFIGURATION_CHANGED")) {
                int a2 = com.bytedance.android.live.broadcast.utils.h.a();
                int b2 = com.bytedance.android.live.broadcast.utils.h.b();
                Context applicationContext = context.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
                Object a3 = a(applicationContext, "window");
                Objects.requireNonNull(a3, "null cannot be cast to non-null type android.view.WindowManager");
                WindowManager windowManager = (WindowManager) a3;
                Point point = new Point();
                try {
                    windowManager.getDefaultDisplay().getSize(point);
                    a2 = point.x;
                    b2 = point.y;
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    h.f.b.l.b(defaultDisplay, "");
                    int rotation = defaultDisplay.getRotation();
                    z = true;
                    if (rotation == 1) {
                        if (a2 > b2 || !z || Build.VERSION.SDK_INT < 28) {
                            j jVar = this.f7692a;
                            jVar.f7674h = 0;
                            jVar.a(false);
                        }
                        j jVar2 = this.f7692a;
                        Activity i2 = jVar2.f7726d.i();
                        h.f.b.l.b(i2, "");
                        Window window = i2.getWindow();
                        h.f.b.l.b(window, "");
                        View decorView = window.getDecorView();
                        h.f.b.l.b(decorView, "");
                        decorView.post(new i(jVar2, decorView));
                        return;
                    }
                } catch (Exception e2) {
                    com.bytedance.android.live.core.c.a.a(3, this.f7692a.f7723a, e2.toString());
                }
                z = false;
                if (a2 > b2) {
                }
                j jVar3 = this.f7692a;
                jVar3.f7674h = 0;
                jVar3.a(false);
            }
        }
    }

    public final void a(a aVar) {
        g gVar = this.f7675i;
        if (gVar != null) {
            gVar.a(aVar);
        }
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final k f7689a = new k();

        static {
            Covode.recordClassIndex(3795);
        }

        k() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            h.f.b.l.d(th, "");
            com.bytedance.android.live.core.c.a.a(6, "ALogger", th.getMessage());
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<h.z, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(3792);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(j jVar) {
            super(1);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(h.z zVar) {
            h.f.b.l.d(zVar, "");
            com.bytedance.android.live.publicscreen.a.d dVar = (com.bytedance.android.live.publicscreen.a.d) this.this$0.f7727e.b(com.bytedance.android.live.publicscreen.a.i.class);
            if (dVar != null) {
                j jVar = this.this$0;
                jVar.f7673g = dVar;
                if (jVar.f7676j != null) {
                    com.bytedance.android.live.publicscreen.a.c.b bVar = jVar.f7676j;
                    if (bVar == null) {
                        h.f.b.l.b();
                    }
                    bVar.a(dVar);
                }
            }
            return h.z.f158842a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.j$j  reason: collision with other inner class name */
    static final class C0108j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f7688a;

        static {
            Covode.recordClassIndex(3794);
        }

        C0108j(j jVar) {
            this.f7688a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (com.bytedance.android.livesdk.s.k.a(this.f7688a.f7724b)) {
                int i2 = Build.VERSION.SDK_INT;
                if (!this.f7688a.f7724b.isDestroyed()) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    if (runningAppProcessInfo.importance != 100 && runningAppProcessInfo.importance != 200) {
                        this.f7688a.a(a.CMD_TRANSITION_TO_FLOATING);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.b
    public final void a(Bundle bundle) {
        p pVar;
        h.f.b.l.d(bundle, "");
        super.a(bundle);
        Dialog dialog = this.p;
        if (dialog != null) {
            p.b(dialog);
        }
        try {
            com.bytedance.android.livesdk.s.b b2 = com.bytedance.android.livesdk.s.j.b("control_view");
            if (b2 != null) {
                b2.a();
            }
        } catch (Throwable th) {
            com.bytedance.android.live.core.c.a.a(6, "ALogger", th.getMessage());
        }
        try {
            com.bytedance.android.livesdk.s.b b3 = com.bytedance.android.livesdk.s.j.b("msg_view");
            if (b3 != null) {
                b3.a();
            }
        } catch (Throwable th2) {
            com.bytedance.android.live.core.c.a.a(6, "ALogger", th2.getMessage());
        }
        k kVar = this.u;
        if (kVar != null && (pVar = kVar.f7693a) != null) {
            bundle.putLong("live_end_ui_float_time", pVar.f7705d);
            bundle.putFloat("live_end_ui_float_time_percent", pVar.f7706e);
            bundle.putLong("live_end_ui_snapped_time", pVar.f7703b);
            bundle.putFloat("live_end_ui_snapped_time_percent", pVar.f7704c);
        }
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.b
    public final void a(com.bytedance.android.livesdkapi.a aVar) {
        h.f.b.l.d(aVar, "");
        this.x = aVar;
        if (aVar.isLiveFinished()) {
            com.bytedance.android.live.core.c.a.a(3, this.f7723a, "room close onServiceConnected isLiveFinished");
            this.f7726d.d();
        } else {
            aVar.setLiveStatusListener(new m(this));
            if (!EnableTTCaptureSetting.INSTANCE.enable()) {
                com.bytedance.android.live.core.c.a.a(4, j.class.getCanonicalName(), "ksystart: " + System.currentTimeMillis());
                aVar.startStream(this.f7678m, PrivacyCert.Builder.Companion.with("bpea-574").usage("").tag("start video/audio capture when live starts").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                com.bytedance.android.live.core.c.a.a(4, j.class.getCanonicalName(), "ksyend: " + System.currentTimeMillis());
            }
            DataChannel dataChannel = this.f7727e;
            Object b2 = this.f7727e.b(cg.class);
            if (b2 == null) {
                b2 = ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).messageManagerProvider(this.f7725c.getId(), true, (Context) this.f7724b);
            }
            dataChannel.a(cg.class, b2);
        }
        Intent intent = this.v;
        if (intent != null) {
            a(intent, PrivacyCert.Builder.Companion.with("bpea-577").usage("").tag("start video/audio capture when live starts").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    static final class f implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f7684a;

        static {
            Covode.recordClassIndex(3790);
        }

        f(j jVar) {
            this.f7684a = jVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            h.f.b.l.d(dialogInterface, "");
            if (!com.bytedance.android.livesdk.s.k.a(this.f7684a.f7724b)) {
                com.bytedance.android.livesdk.s.k.b(this.f7684a.f7724b);
            } else {
                com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.ai;
                h.f.b.l.b(bVar, "");
                com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) true);
                com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) com.bytedance.android.livesdk.ap.a.ah, (Object) true);
            }
            dialogInterface.dismiss();
            b.a.a("livesdk_gift_and_comment_notification").a("click_icon", "allow").b();
        }
    }

    private static Object a(Activity activity, String str) {
        Object obj;
        MethodCollector.i(8381);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = activity.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = activity.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = activity.getSystemService(str);
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
                    MethodCollector.o(8381);
                }
            }
        } else {
            obj = activity.getSystemService(str);
        }
        return obj;
    }

    static final class g implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f7685a;

        static {
            Covode.recordClassIndex(3791);
        }

        g(j jVar) {
            this.f7685a = jVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            h.f.b.l.d(dialogInterface, "");
            dialogInterface.dismiss();
            if (!this.f7685a.f7672f) {
                j jVar = this.f7685a;
                com.bytedance.android.livesdk.ap.b<Integer> bVar = com.bytedance.android.livesdk.ap.a.E;
                if (bVar.a().intValue() < 3) {
                    com.bytedance.android.livesdk.ap.c.a(bVar, Integer.valueOf(bVar.a().intValue() + 1));
                    b.a aVar = new b.a(jVar.f7724b);
                    aVar.f9344m = true;
                    aVar.r = R.string.ek_;
                    aVar.s = 182.0f;
                    aVar.o = ((int) com.bytedance.common.utility.n.b(jVar.f7724b, 206.0f)) + ((int) com.bytedance.common.utility.n.b(aVar.F, 14.0f));
                    aVar.p = ((int) com.bytedance.common.utility.n.b(jVar.f7724b, 58.0f)) + ((int) com.bytedance.common.utility.n.b(aVar.F, 14.0f));
                    aVar.f9343l = 3000;
                    aVar.f9336e = false;
                    aVar.B = true;
                    aVar.f9341j = (int) (-com.bytedance.common.utility.n.b(jVar.f7724b, 5.0f));
                    aVar.f9334c = jVar.f7724b.getResources().getColor(R.color.vk);
                    com.bytedance.android.live.core.widget.a.b bVar2 = new com.bytedance.android.live.core.widget.a.b(aVar);
                    bVar2.a();
                    View view = com.bytedance.android.live.p.l.MORE.getView(jVar.f7727e);
                    if (view != null) {
                        float c2 = ((float) bVar2.c()) - com.bytedance.common.utility.n.b(jVar.f7724b, 20.0f);
                        bVar2.f9324d = view.getMeasuredWidth() - bVar2.c();
                        bVar2.f9322b = c2;
                        bVar2.a(view);
                    }
                }
            }
            b.a.a("livesdk_gift_and_comment_notification").a("click_icon", "cancel").b();
        }
    }

    private final void a(Intent intent, PrivacyCert privacyCert) {
        com.bytedance.android.livesdkapi.a aVar = this.x;
        if (aVar != null) {
            aVar.setData(intent, this.f7678m, this.f7727e);
            BgBroadcastServiceImpl.setProjectionIntent(null);
            aVar.startStream(this.f7678m, privacyCert);
            com.bytedance.android.live.core.c.a.a(4, j.class.getCanonicalName(), "end: " + System.currentTimeMillis());
            DataChannel dataChannel = this.f7727e;
            Object b2 = this.f7727e.b(cg.class);
            if (b2 == null) {
                b2 = ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).messageManagerProvider(this.f7725c.getId(), true, (Context) this.f7724b);
            }
            dataChannel.a(cg.class, b2);
            this.f7726d.a(new ap());
            this.o = true;
        }
    }

    private static Intent a(Activity activity, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return activity.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Room room, com.bytedance.android.live.broadcast.bgbroadcast.f fVar, DataChannel dataChannel) {
        super(room, fVar, dataChannel);
        h.f.b.l.d(room, "");
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(dataChannel, "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent b(android.app.Activity r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.c.a.a.a.b.a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.bgbroadcast.a.j.b(android.app.Activity, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.b
    public final void a(int i2, int i3, Intent intent) {
        super.a(i2, i3, intent);
        if (i2 != 1000) {
            return;
        }
        if (i3 != -1) {
            this.f7726d.d();
        } else if (intent != null) {
            a(intent, PrivacyCert.Builder.Companion.with("bpea-576").usage("").tag("start video/audio capture when live starts").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }
}
