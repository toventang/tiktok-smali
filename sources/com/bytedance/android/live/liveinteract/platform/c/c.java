package com.bytedance.android.live.liveinteract.platform.c;

import android.view.SurfaceView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.e;
import com.bytedance.android.live.liveinteract.api.c.d;
import com.bytedance.android.live.liveinteract.api.c.e;
import com.bytedance.android.live.liveinteract.api.c.f;
import com.bytedance.android.live.liveinteract.platform.common.b.b;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.Client;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.bytertc.engine.livertc.LiveRTCEngine;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

@f(a = "RTC_CONTROLLER")
public final class c implements com.bytedance.android.live.liveinteract.platform.common.b.a {

    /* renamed from: a  reason: collision with root package name */
    public LiveCore.InteractConfig f11886a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11887b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11888c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11889d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11890e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11891f;

    /* renamed from: g  reason: collision with root package name */
    public Client f11892g;

    /* renamed from: h  reason: collision with root package name */
    public final b f11893h = new b();
    @d(a = "LINK_LOGGER")

    /* renamed from: i  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.platform.b.a f11894i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11895j;

    /* renamed from: k  reason: collision with root package name */
    private b f11896k;

    /* renamed from: l  reason: collision with root package name */
    private final h f11897l = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(6489);
    }

    public final com.bytedance.android.live.liveinteract.api.a.a a() {
        return (com.bytedance.android.live.liveinteract.api.a.a) this.f11897l.getValue();
    }

    public final void a(PrivacyCert privacyCert, String str) {
        l.d(str, "");
        if (!this.f11887b) {
            this.f11887b = true;
            if (this.f11892g != null) {
                com.bytedance.android.live.liveinteract.platform.b.a aVar = this.f11894i;
                if (aVar == null) {
                    l.a("mLinkLogger");
                }
                aVar.a().e(str);
                b bVar = this.f11896k;
                if (bVar != null) {
                    bVar.e(str);
                }
                if (privacyCert == null) {
                    Client client = this.f11892g;
                    if (client != null) {
                        client.stop();
                    }
                } else {
                    Client client2 = this.f11892g;
                    if (client2 != null) {
                        client2.stop(privacyCert);
                    }
                }
                Client client3 = this.f11892g;
                if (client3 != null) {
                    client3.dispose();
                }
                this.f11892g = null;
                return;
            }
            f();
        }
    }

    public final void a(boolean z) {
        if (this.f11894i == null) {
            l.a("mLinkLogger");
        }
        Client client = this.f11892g;
        if (client != null) {
            client.enableAllRemoteRender(z, false);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void a(String str) {
        l.d(str, "");
        com.bytedance.android.live.liveinteract.platform.b.a aVar = this.f11894i;
        if (aVar == null) {
            l.a("mLinkLogger");
        }
        aVar.a().a(str);
        b bVar = this.f11896k;
        if (bVar != null) {
            bVar.a(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void a(String str, SurfaceView surfaceView) {
        l.d(str, "");
        l.d(surfaceView, "");
        com.bytedance.android.live.liveinteract.platform.b.a aVar = this.f11894i;
        if (aVar == null) {
            l.a("mLinkLogger");
        }
        aVar.a().a(str, surfaceView);
        b bVar = this.f11896k;
        if (bVar != null) {
            bVar.a(str, surfaceView);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void a(String str, long j2) {
        l.d(str, "");
        com.bytedance.android.live.liveinteract.platform.b.a aVar = this.f11894i;
        if (aVar == null) {
            l.a("mLinkLogger");
        }
        aVar.a().a(str, j2);
        b bVar = this.f11896k;
        if (bVar != null) {
            bVar.a(str, j2);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void a(String str, Boolean bool) {
        l.d(str, "");
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            b bVar = this.f11896k;
            if (bVar != null) {
                bVar.a(str, booleanValue);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str, "");
        l.d(str2, "");
        b bVar = this.f11896k;
        if (bVar != null) {
            bVar.a(str, str2);
        }
    }

    public final void d() {
        Client client = this.f11892g;
        if (client != null) {
            client.invalidateSei();
        }
    }

    public final void g() {
        Client client = this.f11892g;
        if (client != null) {
            client.pause();
        }
        Client client2 = this.f11892g;
        if (client2 != null) {
            client2.muteAllRemoteAudioStreams(true);
        }
    }

    public c() {
        e.f10014a.a(this);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void e() {
        com.bytedance.android.live.liveinteract.platform.b.a aVar = this.f11894i;
        if (aVar == null) {
            l.a("mLinkLogger");
        }
        aVar.a().e();
        this.f11895j = false;
        this.f11889d = true;
        this.f11888c = true;
        b bVar = this.f11896k;
        if (bVar != null) {
            bVar.e();
        }
    }

    static final class a extends m implements h.f.a.a<com.bytedance.android.live.liveinteract.api.a.a> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(6490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.live.liveinteract.api.a.a invoke() {
            com.bytedance.android.live.liveinteract.platform.b.a aVar = this.this$0.f11894i;
            if (aVar == null) {
                l.a("mLinkLogger");
            }
            if (aVar instanceof com.bytedance.android.live.liveinteract.cohost.c.a) {
                Object a2 = e.f10014a.a("LINK_CROSS_DATA_HOLDER");
                if (!(a2 instanceof com.bytedance.android.live.liveinteract.api.a.a)) {
                    return null;
                }
                return a2;
            }
            Object a3 = e.f10014a.a("MULTI_GUEST_DATA_HOLDER");
            if (!(a3 instanceof com.bytedance.android.live.liveinteract.api.a.a)) {
                return null;
            }
            return a3;
        }
    }

    public final void c() {
        if (this.f11894i == null) {
            l.a("mLinkLogger");
        }
        this.f11893h.a();
        this.f11896k = null;
        Client client = this.f11892g;
        if (client != null) {
            client.setListener(null);
        }
        Client client2 = this.f11892g;
        if (client2 != null) {
            client2.stop();
        }
        Client client3 = this.f11892g;
        if (client3 != null) {
            client3.dispose();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void f() {
        com.bytedance.android.live.liveinteract.platform.b.a aVar = this.f11894i;
        if (aVar == null) {
            l.a("mLinkLogger");
        }
        aVar.a().f();
        this.f11887b = false;
        this.f11889d = false;
        this.f11890e = false;
        this.f11888c = false;
        b bVar = this.f11896k;
        if (bVar != null) {
            bVar.f();
        }
    }

    public final boolean b() {
        if (this.f11892g == null) {
            return true;
        }
        return false;
    }

    public final void e(String str) {
        Client client = this.f11892g;
        if (client != null) {
            client.updateRtcExtInfo(str);
        }
    }

    public final void b(boolean z) {
        Client client = this.f11892g;
        if (client != null) {
            client.resume();
        }
        Client client2 = this.f11892g;
        if (client2 != null) {
            client2.muteAllRemoteAudioStreams(z);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void b(String str) {
        l.d(str, "");
        com.bytedance.android.live.liveinteract.platform.b.a aVar = this.f11894i;
        if (aVar == null) {
            l.a("mLinkLogger");
        }
        aVar.a().b(str);
        b bVar = this.f11896k;
        if (bVar != null) {
            bVar.b(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void c(String str) {
        com.bytedance.android.live.liveinteract.platform.b.a aVar = this.f11894i;
        if (aVar == null) {
            l.a("mLinkLogger");
        }
        aVar.a().c(str);
        b bVar = this.f11896k;
        if (bVar != null) {
            bVar.c(str);
        }
    }

    public final long d(String str) {
        LiveRTCEngine rtcEngine;
        l.d(str, "");
        Client client = this.f11892g;
        if (client == null || (rtcEngine = client.getRtcEngine()) == null) {
            return 0;
        }
        return rtcEngine.sendRoomMessage(str);
    }

    public final void a(com.bytedance.android.live.liveinteract.multilive.c.m mVar) {
        l.d(mVar, "");
        if (this.f11889d) {
            String b2 = e.a.f9628b.b(mVar);
            l.b(b2, "");
            d(b2);
            b bVar = this.f11896k;
            if (bVar != null) {
                bVar.a(mVar, b2);
            }
        }
    }

    public final void a(b bVar) {
        l.d(bVar, "");
        if (this.f11894i == null) {
            l.a("mLinkLogger");
        }
        this.f11893h.a(this);
        this.f11896k = bVar;
    }

    public final void a(PrivacyCert privacyCert) {
        Client client = this.f11892g;
        if (client != null && !this.f11890e) {
            com.bytedance.android.live.liveinteract.platform.b.a aVar = this.f11894i;
            if (aVar == null) {
                l.a("mLinkLogger");
            }
            aVar.a().g();
            b bVar = this.f11896k;
            if (bVar != null) {
                bVar.g();
            }
            client.startPushData();
            if (privacyCert != null) {
                client.startInteract(privacyCert);
            } else {
                client.startInteract();
            }
            this.f11890e = true;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void a(long j2, int i2) {
        b bVar = this.f11896k;
        if (bVar != null) {
            bVar.a(j2, i2);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void b(long j2, int i2) {
        b bVar = this.f11896k;
        if (bVar != null) {
            bVar.b(j2, i2);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void a(int i2, String str) {
        l.d(str, "");
        com.bytedance.android.live.liveinteract.platform.b.a aVar = this.f11894i;
        if (aVar == null) {
            l.a("mLinkLogger");
        }
        aVar.a().a(i2, str);
        this.f11895j = false;
        b bVar = this.f11896k;
        if (bVar != null) {
            bVar.a(i2, str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void b(int i2, String str) {
        l.d(str, "");
        com.bytedance.android.live.liveinteract.platform.b.a aVar = this.f11894i;
        if (aVar == null) {
            l.a("mLinkLogger");
        }
        aVar.a().b(i2, str);
        this.f11887b = false;
        if (this.f11891f) {
            this.f11889d = false;
            return;
        }
        b bVar = this.f11896k;
        if (bVar != null) {
            bVar.b(i2, str);
        }
    }

    public static Client b(com.bytedance.android.livesdk.chatroom.interact.b bVar, a aVar) {
        LiveCore.InteractConfig interactConfig = new LiveCore.InteractConfig();
        interactConfig.setContext(y.e());
        interactConfig.setLogReportInterval(5);
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class);
        l.b(a2, "");
        interactConfig.setProjectKey(((com.bytedance.android.live.i.a.d) a2).getProjectKey());
        com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(IHostContext.class);
        l.b(a3, "");
        interactConfig.setAppChannel(((IHostContext) a3).getChannel());
        interactConfig.setAppId(String.valueOf(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).appId()));
        com.bytedance.android.live.base.a a4 = com.bytedance.android.live.t.a.a(IHostContext.class);
        l.b(a4, "");
        interactConfig.setAppVersion(((IHostContext) a4).getVersionCode());
        aVar.a(interactConfig);
        return bVar.a(interactConfig);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void a(long j2, long j3) {
        com.bytedance.android.live.liveinteract.platform.b.a aVar = this.f11894i;
        if (aVar == null) {
            l.a("mLinkLogger");
        }
        aVar.a().a(j2, j3);
        b bVar = this.f11896k;
        if (bVar != null) {
            bVar.a(j2, j3);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void c(int i2, String str) {
        l.d(str, "");
        com.bytedance.android.live.liveinteract.platform.b.a aVar = this.f11894i;
        if (aVar == null) {
            l.a("mLinkLogger");
        }
        aVar.a().c(i2, str);
        this.f11895j = false;
        this.f11891f = true;
        b bVar = this.f11896k;
        if (bVar != null) {
            bVar.c(i2, str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void b(String str, SurfaceView surfaceView) {
        l.d(str, "");
        l.d(surfaceView, "");
        com.bytedance.android.live.liveinteract.platform.b.a aVar = this.f11894i;
        if (aVar == null) {
            l.a("mLinkLogger");
        }
        aVar.a().b(str, surfaceView);
        b bVar = this.f11896k;
        if (bVar != null) {
            bVar.b(str, surfaceView);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void b(String str, Boolean bool) {
        l.d(str, "");
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            b bVar = this.f11896k;
            if (bVar != null) {
                bVar.b(str, booleanValue);
            }
        }
    }

    public final void a(com.bytedance.android.livesdk.chatroom.interact.b bVar, a aVar) {
        l.d(bVar, "");
        l.d(aVar, "");
        if (!this.f11889d && !this.f11895j) {
            if (this.f11894i == null) {
                l.a("mLinkLogger");
            }
            this.f11895j = true;
            Client b2 = b(bVar, aVar);
            this.f11892g = b2;
            if (b2 != null) {
                b2.setListener(this.f11893h.f11903c);
            }
            com.bytedance.android.live.liveinteract.api.a.a a2 = a();
            if (a2 != null) {
                a2.a(System.currentTimeMillis());
            }
            Client client = this.f11892g;
            if (client != null) {
                client.joinChannel();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str, "");
        l.d(str2, "");
        b bVar = this.f11896k;
        if (bVar != null) {
            bVar.b(str, str2);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.b.a
    public final void a(int i2, long j2, Object... objArr) {
        l.d(objArr, "");
        com.bytedance.android.live.liveinteract.platform.b.a aVar = this.f11894i;
        if (aVar == null) {
            l.a("mLinkLogger");
        }
        aVar.a().a(i2, j2, objArr);
        b bVar = this.f11896k;
        if (bVar != null) {
            bVar.a(i2, j2, objArr);
        }
    }
}
