package com.bytedance.android.live.broadcast.preview.widget;

import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import androidx.lifecycle.i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.ab;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.model.i;
import com.bytedance.android.live.broadcast.preview.c.a;
import com.bytedance.android.live.broadcast.preview.t;
import com.bytedance.android.live.broadcast.utils.i;
import com.bytedance.android.live.broadcast.v;
import com.bytedance.android.live.broadcast.w;
import com.bytedance.android.live.broadcast.x;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.performance.b;
import com.bytedance.android.live.design.view.a;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.af;
import com.bytedance.android.livesdk.j.cs;
import com.bytedance.android.livesdk.j.dg;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.util.c;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.c.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import h.z;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

public final class PreviewStartLiveWidget extends LiveWidget implements a.AbstractC0502a, com.bytedance.ies.xbridge.e.d, au {

    /* renamed from: k  reason: collision with root package name */
    public static final a f8406k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.android.livesdkapi.l.b f8407a = ((com.bytedance.android.livesdkapi.l.b) DataChannelGlobal.f34575d.b(af.class));

    /* renamed from: b  reason: collision with root package name */
    final com.bytedance.android.livesdkapi.l.a f8408b = ((com.bytedance.android.livesdkapi.l.a) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.e.class));

    /* renamed from: c  reason: collision with root package name */
    public Intent f8409c;

    /* renamed from: d  reason: collision with root package name */
    public LiveButton f8410d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8411e;

    /* renamed from: f  reason: collision with root package name */
    public long f8412f;

    /* renamed from: g  reason: collision with root package name */
    public androidx.fragment.app.d f8413g;

    /* renamed from: h  reason: collision with root package name */
    public Map<String, Boolean> f8414h = new LinkedHashMap();

    /* renamed from: i  reason: collision with root package name */
    public boolean f8415i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f8416j = true;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f8417l = com.bytedance.android.livesdkapi.m.d.a(new b(this));

    /* renamed from: m  reason: collision with root package name */
    private Dialog f8418m;
    private final h.h n = com.bytedance.android.livesdkapi.m.d.a(c.f8419a);
    private final h.h o = com.bytedance.android.livesdkapi.m.d.a(new d(this));
    private boolean p = true;
    private final User q;
    private final h.f.a.b<Boolean, z> r;
    private final h.f.a.a<com.bytedance.android.livesdkapi.depend.model.a.e> s;

    static {
        Covode.recordClassIndex(4301);
    }

    private static Intent a(MediaProjectionManager mediaProjectionManager) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(mediaProjectionManager, new Object[0], 102100, "android.content.Intent", false, null);
        if (((Boolean) a2.first).booleanValue()) {
            return (Intent) a2.second;
        }
        Intent createScreenCaptureIntent = mediaProjectionManager.createScreenCaptureIntent();
        com.bytedance.helios.sdk.a.a(createScreenCaptureIntent, mediaProjectionManager, new Object[0], 102100, "com_bytedance_android_live_broadcast_preview_widget_PreviewStartLiveWidget_android_media_projection_MediaProjectionManager_createScreenCaptureIntent(Landroid/media/projection/MediaProjectionManager;)Landroid/content/Intent;");
        return createScreenCaptureIntent;
    }

    private final com.bytedance.android.livesdkapi.depend.c.a f() {
        return (com.bytedance.android.livesdkapi.depend.c.a) this.f8417l.getValue();
    }

    private final com.bytedance.android.live.broadcast.preview.c.a[] g() {
        return (com.bytedance.android.live.broadcast.preview.c.a[]) this.n.getValue();
    }

    private final a.C0122a h() {
        return (a.C0122a) this.o.getValue();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bhp;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4302);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a(String str) {
        com.bytedance.android.live.core.c.a.a(4, "PreviewStartLiveWidget", "updateStartLiveButtonEnable(). scene=" + str + ", selectedGame=" + this.p + ',' + ", startLiveAccess=" + this.f8416j);
        if (!this.p || !this.f8416j) {
            LiveButton liveButton = this.f8410d;
            if (liveButton == null) {
                h.f.b.l.a("mStartButton");
            }
            liveButton.b(R.style.sn);
            LiveButton liveButton2 = this.f8410d;
            if (liveButton2 == null) {
                h.f.b.l.a("mStartButton");
            }
            liveButton2.setEnabled(false);
            return;
        }
        LiveButton liveButton3 = this.f8410d;
        if (liveButton3 == null) {
            h.f.b.l.a("mStartButton");
        }
        liveButton3.b(R.style.sm);
        LiveButton liveButton4 = this.f8410d;
        if (liveButton4 == null) {
            h.f.b.l.a("mStartButton");
        }
        liveButton4.setEnabled(true);
    }

    public final void a(boolean z) {
        com.bytedance.android.live.broadcast.preview.c.a[] g2 = g();
        for (com.bytedance.android.live.broadcast.preview.c.a aVar : g2) {
            if (aVar.a(h())) {
                a(a(aVar));
                return;
            }
        }
        if (z) {
            t.a(this.dataChannel);
        }
        i();
    }

    public final void a(Room room) {
        com.bytedance.android.live.broadcast.model.o oVar;
        try {
            com.bytedance.android.livesdk.util.c.a(c.a.ENTER_BROADCAST_ROOM);
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IEffectService.class);
            h.f.b.l.b(a2, "");
            ((IEffectService) a2).getLiveFilterManager().b();
            com.bytedance.android.livesdk.performance.g.i();
            this.r.invoke(true);
            com.bytedance.android.live.core.performance.b.b(b.a.CreateLive);
            Intent intent = new Intent(this.context, ((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).getHostActivity(b().isStreamingBackground ? 6 : 5));
            if (com.bytedance.android.livesdkapi.depend.model.live.j.e(b()) || com.bytedance.android.livesdkapi.depend.model.live.j.f(b())) {
                com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.ae;
                h.f.b.l.b(bVar, "");
                com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) false);
            }
            DataChannel dataChannel = this.dataChannel;
            h.f.b.l.b(dataChannel, "");
            com.bytedance.android.live.broadcast.utils.e.a(com.bytedance.android.live.broadcast.utils.e.a(dataChannel) ? SystemClock.elapsedRealtime() : -1);
            DataChannel dataChannel2 = this.dataChannel;
            String str = null;
            intent.putExtra("live.intent.extra.LIVE_PC_TIPS", (dataChannel2 == null || (oVar = (com.bytedance.android.live.broadcast.model.o) dataChannel2.b(dg.class)) == null) ? null : oVar.f7947i);
            Context context = this.context;
            String name = b().name();
            User user = this.q;
            if (user != null) {
                str = user.getIdStr();
            }
            i.a.a(context, name, str);
            a(intent);
            Context context2 = this.context;
            if (context2 != null) {
                a(context2, intent);
            }
            DataChannelGlobal.f34575d.a(ac.class, room);
            ((com.bytedance.android.livesdkapi.host.b) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdkapi.host.b.class)).a().a();
            androidx.fragment.app.e a3 = com.bytedance.android.livesdk.utils.p.a(this.context);
            if (a3 != null) {
                a3.finish();
            }
            androidx.fragment.app.e a4 = com.bytedance.android.livesdk.utils.p.a(this.context);
            if (a4 != null) {
                a4.overridePendingTransition(0, 0);
            }
            ((IBroadcastService) com.bytedance.android.live.t.a.a(IBroadcastService.class)).startLiveManager().onStartLive();
            com.bytedance.android.live.broadcast.api.c.a.a("start_broadcast_page", String.valueOf(System.currentTimeMillis()));
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.a(3, "ALogger", e2.getMessage());
        }
    }

    @Override // com.bytedance.ies.xbridge.e.d
    public final void a(com.bytedance.ies.xbridge.e.c cVar) {
        com.bytedance.android.livesdkapi.depend.model.live.i iVar;
        h.f.b.l.d(cVar, "");
        if (h.f.b.l.a((Object) cVar.f35926a, (Object) "ttlive_apply_success")) {
            com.bytedance.ies.xbridge.n nVar = cVar.f35927b;
            String str = null;
            if (h.f.b.l.a((Object) (nVar != null ? nVar.f("status") : null), (Object) "success")) {
                com.bytedance.ies.xbridge.n nVar2 = cVar.f35927b;
                if (nVar2 != null) {
                    this.f8414h.put(nVar2.f("mode"), true);
                    androidx.fragment.app.d dVar = this.f8413g;
                    if (dVar != null) {
                        dVar.dismiss();
                    }
                    ao.a(com.bytedance.android.livesdk.utils.p.a(this.context), y.a((int) R.string.e7w));
                    com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_anchor_live_access_apply_success").a(this.dataChannel);
                    DataChannel dataChannel = this.dataChannel;
                    if (!(dataChannel == null || (iVar = (com.bytedance.android.livesdkapi.depend.model.live.i) dataChannel.b(x.class)) == null)) {
                        str = com.bytedance.android.livesdkapi.depend.model.live.j.a(iVar);
                    }
                    a2.a("live_type", str).b();
                    return;
                }
                return;
            }
            com.bytedance.ies.xbridge.n nVar3 = cVar.f35927b;
            if (nVar3 != null) {
                str = nVar3.f("status");
            }
            if (h.f.b.l.a((Object) str, (Object) "hit-risk")) {
                ao.a(y.e(), y.a((int) R.string.e7r), 0);
            }
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.bytedance.android.livesdkapi.depend.c.a> {
        final /* synthetic */ PreviewStartLiveWidget this$0;

        static {
            Covode.recordClassIndex(4303);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PreviewStartLiveWidget previewStartLiveWidget) {
            super(0);
            this.this$0 = previewStartLiveWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.livesdkapi.depend.c.a invoke() {
            return new com.bytedance.android.livesdkapi.depend.c.a(this.this$0);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        com.bytedance.ies.xbridge.e.b.b("ttlive_apply_success", this);
        this.f8413g = null;
    }

    static final class d extends h.f.b.m implements h.f.a.a<a.C0122a> {
        final /* synthetic */ PreviewStartLiveWidget this$0;

        static {
            Covode.recordClassIndex(4305);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(PreviewStartLiveWidget previewStartLiveWidget) {
            super(0);
            this.this$0 = previewStartLiveWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a.C0122a invoke() {
            Context context = this.this$0.context;
            h.f.b.l.b(context, "");
            return new a.C0122a(context, this.this$0.dataChannel, new h.f.a.a<z>(this) {
                /* class com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(4306);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.this$0.a(false);
                    return z.f158842a;
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r0 == null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.livesdkapi.depend.model.live.i b() {
        /*
            r2 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r2.dataChannel
            if (r1 == 0) goto L_0x0012
            java.lang.Class<com.bytedance.android.live.broadcast.x> r0 = com.bytedance.android.live.broadcast.x.class
            java.lang.Object r0 = r1.b(r0)
            com.bytedance.android.livesdkapi.depend.model.live.i r0 = (com.bytedance.android.livesdkapi.depend.model.live.i) r0
            if (r0 != 0) goto L_0x0011
        L_0x000e:
            h.f.b.l.b()
        L_0x0011:
            return r0
        L_0x0012:
            r0 = 0
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget.b():com.bytedance.android.livesdkapi.depend.model.live.i");
    }

    public final void e() {
        ao.a(y.e(), y.a((int) R.string.gz3), 0);
        a(105);
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.android.live.broadcast.preview.c.a[]> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f8419a = new c();

        static {
            Covode.recordClassIndex(4304);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.live.broadcast.preview.c.a[] invoke() {
            return new com.bytedance.android.live.broadcast.preview.c.a[]{new com.bytedance.android.live.broadcast.preview.c.a.a(), new com.bytedance.android.live.broadcast.preview.c.a.b(), new com.bytedance.android.live.broadcast.preview.c.a.c(), new com.bytedance.android.live.broadcast.preview.c.a.d(), new com.bytedance.android.live.broadcast.preview.c.a.e(), new com.bytedance.android.live.broadcast.preview.c.a.f()};
        }
    }

    public final void c() {
        if (!this.f8415i && com.bytedance.android.livesdk.t.a.a(this.dataChannel)) {
            com.bytedance.android.livesdk.ap.b<Map<String, String>> bVar = com.bytedance.android.livesdk.ap.a.cN;
            h.f.b.l.b(bVar, "");
            a(GameTag.a.a(bVar.a()));
            a("read local SelectedGameItem");
        }
    }

    public final boolean d() {
        Map map;
        i.a aVar;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (map = (Map) dataChannel.b(com.bytedance.android.live.broadcast.z.class)) == null || (aVar = (i.a) map.get(a())) == null || aVar.f7922h != 2) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        View view = getView();
        if (!(view instanceof LiveButton)) {
            view = null;
        }
        LiveButton liveButton = (LiveButton) view;
        if (liveButton != null) {
            this.f8410d = liveButton;
            View view2 = getView();
            if (view2 != null) {
                view2.setOnClickListener(new g(this));
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.b((androidx.lifecycle.m) this, ab.class, (h.f.a.b) new h(this)).b(x.class, (h.f.a.b) new i(this)).b(com.bytedance.android.live.broadcast.z.class, (h.f.a.b) new j(this)).b((androidx.lifecycle.m) this, cs.class, (h.f.a.b) new k(this)).b((androidx.lifecycle.m) this, w.class, (h.f.a.b) new l(this)).b((androidx.lifecycle.m) this, dg.class, (h.f.a.b) new m(this)).b((androidx.lifecycle.m) this, com.bytedance.android.live.broadcast.a.class, (h.f.a.b) new n(this));
            }
            com.bytedance.ies.xbridge.e.b.a("ttlive_apply_success", this);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v25, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0194, code lost:
        if (r0 == null) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c2, code lost:
        if (r0 == null) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01f9, code lost:
        if (r0.booleanValue() != false) goto L_0x01fb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void i() {
        /*
        // Method dump skipped, instructions count: 748
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget.i():void");
    }

    public final String a() {
        Object b2 = this.dataChannel.b(x.class);
        if (b2 == null) {
            h.f.b.l.b();
        }
        String modeFromServer = ((com.bytedance.android.livesdkapi.depend.model.live.i) b2).getModeFromServer();
        h.f.b.l.b(modeFromServer, "");
        return modeFromServer;
    }

    public static final /* synthetic */ LiveButton a(PreviewStartLiveWidget previewStartLiveWidget) {
        LiveButton liveButton = previewStartLiveWidget.f8410d;
        if (liveButton == null) {
            h.f.b.l.a("mStartButton");
        }
        return liveButton;
    }

    static final class j extends h.f.b.m implements h.f.a.b<Map<String, ? extends i.a>, z> {
        final /* synthetic */ PreviewStartLiveWidget this$0;

        static {
            Covode.recordClassIndex(4312);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(PreviewStartLiveWidget previewStartLiveWidget) {
            super(1);
            this.this$0 = previewStartLiveWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Map<String, ? extends i.a> map) {
            h.f.b.l.d(map, "");
            if (!this.this$0.f8415i) {
                PreviewStartLiveWidget previewStartLiveWidget = this.this$0;
                previewStartLiveWidget.f8416j = !previewStartLiveWidget.d();
                this.this$0.a("observe PermissionApply");
            }
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<GameTag, z> {
        final /* synthetic */ PreviewStartLiveWidget this$0;

        static {
            Covode.recordClassIndex(4313);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(PreviewStartLiveWidget previewStartLiveWidget) {
            super(1);
            this.this$0 = previewStartLiveWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(GameTag gameTag) {
            GameTag gameTag2 = gameTag;
            h.f.b.l.d(gameTag2, "");
            if (!this.this$0.f8415i) {
                this.this$0.a(gameTag2);
                this.this$0.a("observe SelectedGameItem");
            }
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<com.bytedance.android.live.broadcast.model.o, z> {
        final /* synthetic */ PreviewStartLiveWidget this$0;

        static {
            Covode.recordClassIndex(4315);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(PreviewStartLiveWidget previewStartLiveWidget) {
            super(1);
            this.this$0 = previewStartLiveWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.live.broadcast.model.o oVar) {
            h.f.b.l.d(oVar, "");
            if (!this.this$0.f8415i) {
                this.this$0.c();
            }
            return z.f158842a;
        }
    }

    private final void a(int i2) {
        ((IBroadcastService) com.bytedance.android.live.t.a.a(IBroadcastService.class)).startLiveManager().a(i2, this.dataChannel);
    }

    static final class h extends h.f.b.m implements h.f.a.b<com.bytedance.android.live.broadcast.model.m, z> {
        final /* synthetic */ PreviewStartLiveWidget this$0;

        static {
            Covode.recordClassIndex(4310);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(PreviewStartLiveWidget previewStartLiveWidget) {
            super(1);
            this.this$0 = previewStartLiveWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.live.broadcast.model.m mVar) {
            h.f.b.l.d(mVar, "");
            PreviewStartLiveWidget.a(this.this$0).setEnabled(true);
            PreviewStartLiveWidget.a(this.this$0).b(R.style.sn);
            this.this$0.f8415i = true;
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<com.bytedance.android.livesdkapi.depend.model.live.i, z> {
        final /* synthetic */ PreviewStartLiveWidget this$0;

        static {
            Covode.recordClassIndex(4311);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(PreviewStartLiveWidget previewStartLiveWidget) {
            super(1);
            this.this$0 = previewStartLiveWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.livesdkapi.depend.model.live.i iVar) {
            h.f.b.l.d(iVar, "");
            if (!this.this$0.f8415i) {
                PreviewStartLiveWidget previewStartLiveWidget = this.this$0;
                previewStartLiveWidget.f8416j = !previewStartLiveWidget.d();
                this.this$0.c();
                this.this$0.a("observe LiveMode");
            }
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ PreviewStartLiveWidget this$0;

        static {
            Covode.recordClassIndex(4314);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(PreviewStartLiveWidget previewStartLiveWidget) {
            super(1);
            this.this$0 = previewStartLiveWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                PreviewStartLiveWidget previewStartLiveWidget = this.this$0;
                LiveButton liveButton = previewStartLiveWidget.f8410d;
                if (liveButton == null) {
                    h.f.b.l.a("mStartButton");
                }
                previewStartLiveWidget.f8412f = com.bytedance.android.live.design.view.j.a(((a.C0140a) new a.C0140a(liveButton).d()).a(R.string.e8w).b());
            }
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<z, z> {
        final /* synthetic */ PreviewStartLiveWidget this$0;

        static {
            Covode.recordClassIndex(4316);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(PreviewStartLiveWidget previewStartLiveWidget) {
            super(1);
            this.this$0 = previewStartLiveWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            h.f.b.l.d(zVar, "");
            PreviewStartLiveWidget.a(this.this$0).setEnabled(false);
            PreviewStartLiveWidget.a(this.this$0).b(R.style.sn);
            this.this$0.f8415i = true;
            return z.f158842a;
        }
    }

    public static final class q implements IHostPlugin.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewStartLiveWidget f8425a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Room f8426b;

        static {
            Covode.recordClassIndex(4319);
        }

        @Override // com.bytedance.android.livesdkapi.host.IHostPlugin.a
        public final void a(String str) {
            h.f.b.l.d(str, "");
            IHostPlugin iHostPlugin = (IHostPlugin) com.bytedance.android.live.t.a.a(IHostPlugin.class);
            if (iHostPlugin != null && !iHostPlugin.isFull()) {
                iHostPlugin.preload(com.bytedance.android.livesdk.h.a.LiveResource.getPackageName());
            }
            com.bytedance.android.livesdk.h.a.LiveResource.load(this.f8425a.context, false);
            this.f8425a.a(this.f8426b);
        }

        q(PreviewStartLiveWidget previewStartLiveWidget, Room room) {
            this.f8425a = previewStartLiveWidget;
            this.f8426b = room;
        }
    }

    private static int a(com.bytedance.android.live.broadcast.preview.c.a aVar) {
        if (aVar instanceof com.bytedance.android.live.broadcast.preview.c.a.a) {
            return 100;
        }
        if (aVar instanceof com.bytedance.android.live.broadcast.preview.c.a.b) {
            return 101;
        }
        if (aVar instanceof com.bytedance.android.live.broadcast.preview.c.a.c) {
            return 107;
        }
        if (aVar instanceof com.bytedance.android.live.broadcast.preview.c.a.d) {
            return 108;
        }
        if (aVar instanceof com.bytedance.android.live.broadcast.preview.c.a.e) {
            return 109;
        }
        if (aVar instanceof com.bytedance.android.live.broadcast.preview.c.a.f) {
            return 110;
        }
        return 102;
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewStartLiveWidget f8422a;

        static {
            Covode.recordClassIndex(4309);
        }

        g(PreviewStartLiveWidget previewStartLiveWidget) {
            this.f8422a = previewStartLiveWidget;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x006c, code lost:
            if (com.bytedance.android.livesdk.utils.p.a(r4) != false) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x008f, code lost:
            if (com.bytedance.android.livesdk.utils.p.a(r4) != false) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b2, code lost:
            if (com.bytedance.android.livesdk.utils.p.a(r4) != false) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c8, code lost:
            if (com.bytedance.android.livesdk.utils.p.c(r5.f8422a.f8414h.get(r5.f8422a.a())) == false) goto L_0x0041;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ca, code lost:
            r1 = r5.f8422a.dataChannel;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ce, code lost:
            if (r1 == null) goto L_0x00ec;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d0, code lost:
            r1 = (java.util.Map) r1.b(com.bytedance.android.live.broadcast.z.class);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d8, code lost:
            if (r1 == null) goto L_0x00ec;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00da, code lost:
            r0 = (com.bytedance.android.live.broadcast.model.i.a) r1.get(r5.f8422a.a());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e6, code lost:
            if (r0 == null) goto L_0x00ec;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ea, code lost:
            if (r0.f7922h == 1) goto L_0x0041;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ec, code lost:
            r1 = r5.f8422a.dataChannel;
            h.f.b.l.b(r1, "");
            r1 = com.bytedance.android.live.broadcast.preview.u.a(r1, r5.f8422a.a());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ff, code lost:
            if (r1 == null) goto L_0x0110;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0101, code lost:
            r5.f8422a.f8413g = r1;
            com.bytedance.android.live.core.widget.a.a(com.bytedance.android.live.core.f.a.b(r5.f8422a.context), r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0110, code lost:
            r1 = r5.f8422a.dataChannel;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0114, code lost:
            if (r1 == null) goto L_0x011f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0116, code lost:
            com.bytedance.android.live.broadcast.preview.u.b(r1, r5.f8422a.a());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x011f, code lost:
            com.bytedance.android.live.broadcast.preview.t.a(r5.f8422a.dataChannel, true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0126, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r6) {
            /*
            // Method dump skipped, instructions count: 298
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget.g.onClick(android.view.View):void");
        }
    }

    private final void a(Intent intent) {
        Boolean bool;
        if (com.bytedance.android.livesdkapi.depend.model.live.j.f(b())) {
            intent.putExtra("hotsoon.intent.extra.PROJECTION_INTENT", this.f8409c);
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                bool = (Boolean) dataChannel.b(com.bytedance.android.live.broadcast.k.class);
            } else {
                bool = null;
            }
            intent.putExtra("hotsoon.intent.extra.IS_LANDSCAPE", bool);
        }
    }

    public final void a(GameTag gameTag) {
        boolean z = true;
        if ((b() == com.bytedance.android.livesdkapi.depend.model.live.i.SCREEN_RECORD || b() == com.bytedance.android.livesdkapi.depend.model.live.i.THIRD_PARTY) && gameTag == null) {
            z = false;
        }
        this.p = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0386, code lost:
        if (r6 == null) goto L_0x0396;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0394, code lost:
        if (r6 != null) goto L_0x0397;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x046c  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x04ea  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0541  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x058f  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x05a2  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0679  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x06b1  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x06b4  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x06bb  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x06be  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x06d8  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x06db  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x06df  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0717  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x071a  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0721  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0727  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x074f  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x078d  */
    @Override // com.bytedance.android.livesdkapi.depend.c.a.AbstractC0502a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r26) {
        /*
        // Method dump skipped, instructions count: 1946
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.widget.PreviewStartLiveWidget.handleMsg(android.os.Message):void");
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    static final class f implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final f f8421a = new f();

        static {
            Covode.recordClassIndex(4308);
        }

        f() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            h.f.b.l.d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    static final class e implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewStartLiveWidget f8420a;

        static {
            Covode.recordClassIndex(4307);
        }

        e(PreviewStartLiveWidget previewStartLiveWidget) {
            this.f8420a = previewStartLiveWidget;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.bytedance.android.live.broadcast.widget.e eVar;
            h.f.b.l.d(dialogInterface, "");
            dialogInterface.dismiss();
            DataChannel dataChannel = this.f8420a.dataChannel;
            if (dataChannel != null && (eVar = (com.bytedance.android.live.broadcast.widget.e) dataChannel.b(v.class)) != null) {
                eVar.b();
            }
        }
    }

    static final class o implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewStartLiveWidget f8423a;

        static {
            Covode.recordClassIndex(4317);
        }

        o(PreviewStartLiveWidget previewStartLiveWidget) {
            this.f8423a = previewStartLiveWidget;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            t.a("end_live", this.f8423a.dataChannel);
            com.bytedance.android.livesdk.chatroom.b.f.a((Handler) null);
            this.f8423a.f8411e = true;
        }
    }

    static final class p implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewStartLiveWidget f8424a;

        static {
            Covode.recordClassIndex(4318);
        }

        p(PreviewStartLiveWidget previewStartLiveWidget) {
            this.f8424a = previewStartLiveWidget;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            t.a("back", this.f8424a.dataChannel);
            androidx.fragment.app.e a2 = com.bytedance.android.livesdk.utils.p.a(this.f8424a.getContext());
            if (a2 != null) {
                a2.finish();
            }
        }
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(7342);
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
                    MethodCollector.o(7342);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.a<? extends com.bytedance.android.livesdkapi.depend.model.a.e> */
    /* JADX WARN: Multi-variable type inference failed */
    public PreviewStartLiveWidget(User user, h.f.a.b<? super Boolean, z> bVar, h.f.a.a<? extends com.bytedance.android.livesdkapi.depend.model.a.e> aVar) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar, "");
        this.q = user;
        this.r = bVar;
        this.s = aVar;
    }
}
