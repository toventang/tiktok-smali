package com.bytedance.android.live.liveinteract.cohost.widget;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.e;
import com.bytedance.android.live.liveinteract.api.BaseLinkWidget;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.r;
import com.bytedance.android.live.liveinteract.api.t;
import com.bytedance.android.live.liveinteract.cohost.a.c.a;
import com.bytedance.android.live.liveinteract.cohost.a.d.d;
import com.bytedance.android.live.liveinteract.cohost.ui.view.LinkCrossTitleLayout;
import com.bytedance.android.live.liveinteract.linkroom.widget.ad;
import com.bytedance.android.live.liveinteract.match.b.b.c;
import com.bytedance.android.live.liveinteract.match.b.c.e;
import com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget;
import com.bytedance.android.live.liveinteract.platform.common.d.a;
import com.bytedance.android.live.liveinteract.platform.common.g.h;
import com.bytedance.android.live.liveinteract.platform.common.g.v;
import com.bytedance.android.live.liveinteract.platform.common.g.w;
import com.bytedance.android.live.liveinteract.platform.common.view.b;
import com.bytedance.android.live.n.x;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.viewmodule.br;
import com.bytedance.android.livesdk.j.bh;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.LiveBannerExperiment;
import com.bytedance.android.livesdk.livesetting.linkmic.HostLinkMicBattleHealthBarStyleSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkEntranceExperiment;
import com.bytedance.android.livesdk.performance.g;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public class LinkCrossRoomWidget extends BaseLinkWidget implements d.a, a.AbstractC0250a, au {

    /* renamed from: a  reason: collision with root package name */
    public static int f10462a;

    /* renamed from: b  reason: collision with root package name */
    public static int f10463b;

    /* renamed from: c  reason: collision with root package name */
    public static int f10464c;

    /* renamed from: d  reason: collision with root package name */
    public static int f10465d;
    private boolean A;
    private boolean B = com.bytedance.android.live.liveinteract.cohost.a.c.a.a();
    private boolean C;
    private boolean D;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10466e;

    /* renamed from: f  reason: collision with root package name */
    Room f10467f;

    /* renamed from: g  reason: collision with root package name */
    public d f10468g;

    /* renamed from: h  reason: collision with root package name */
    b f10469h;

    /* renamed from: i  reason: collision with root package name */
    public a f10470i;

    /* renamed from: j  reason: collision with root package name */
    boolean f10471j;

    /* renamed from: k  reason: collision with root package name */
    LinkBattleWidget f10472k;

    /* renamed from: l  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.match.ui.c.b f10473l = new com.bytedance.android.live.liveinteract.match.ui.c.b();

    /* renamed from: m  reason: collision with root package name */
    private int f10474m;
    private FrameLayout n;
    private View o;
    private HSImageView p;
    private LiveLoadingView q;
    private LinkCrossTitleLayout r;
    private Guideline s;
    private com.bytedance.android.live.liveinteract.platform.common.view.a t;
    private com.bytedance.android.live.liveinteract.platform.common.view.b<LinearLayout> u;
    private HSImageView v;
    private View w;
    private com.bytedance.android.live.liveinteract.cohost.ui.b.b x;
    private x y;
    private com.bytedance.android.live.liveinteract.platform.common.e.a.a z;

    static {
        Covode.recordClassIndex(5561);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final void a(Throwable th) {
        br.a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bf3;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.d.d.a
    public final LinkBattleWidget a() {
        return this.f10472k;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.d.d.a
    public final void e() {
        x xVar = this.y;
        if (xVar != null) {
            xVar.e();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.d.d.a
    public final void c() {
        ao.a(y.e(), (int) R.string.grg);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final String g() {
        return getClass().getName();
    }

    @Override // com.bytedance.android.widget.Widget
    public void onPause() {
        super.onPause();
        if (this.f10466e) {
            this.f10468g.a(false);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void onResume() {
        super.onResume();
        if (this.f10466e) {
            this.f10468g.a(true);
        }
    }

    private void h() {
        if (this.f10472k == null) {
            enableSubWidgetManager();
            this.f10472k = new LinkBattleWidget(getView());
            this.subWidgetManager.load(this.f10472k);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.d.d.a
    public final void b() {
        ao.a(y.e(), (int) R.string.grz);
        this.f10468g.b(207);
    }

    public final void f() {
        String a2 = y.a((int) R.string.dy8);
        if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a() == c.START) {
            a2 = y.a((int) R.string.dyi);
        }
        com.bytedance.android.live.liveinteract.cohost.ui.b.b bVar = this.x;
        if (bVar != null && bVar.n()) {
            this.x.dismiss();
        }
        com.bytedance.android.live.liveinteract.cohost.ui.b.b bVar2 = new com.bytedance.android.live.liveinteract.cohost.ui.b.b();
        this.x = bVar2;
        bVar2.f10241a = y.a((int) R.string.dy9);
        bVar2.f10242b = a2;
        bVar2.f10243c = 1;
        bVar2.f10245e = y.a((int) R.string.eid);
        bVar2.f10244d = y.a((int) R.string.ei8);
        d dVar = this.f10468g;
        l.d(dVar, "");
        bVar2.f10246f = dVar;
        b bVar3 = this.f10469h;
        l.d(bVar3, "");
        bVar2.f10247g = bVar3;
        androidx.fragment.app.i iVar = (androidx.fragment.app.i) this.dataChannel.b(com.bytedance.android.livesdk.j.ao.class);
        if (iVar != null) {
            this.x.show(iVar, "InteractDisconnectDialog");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.d.d.a
    public final void d() {
        String str;
        if (!this.f10469h.f9938c) {
            this.dataChannel.c(com.bytedance.android.live.liveinteract.cohost.a.b.d.class, 1);
        }
        this.f10471j = true;
        this.r.a();
        c(false);
        if (this.f10466e) {
            LinkBattleWidget linkBattleWidget = this.f10472k;
            if (linkBattleWidget != null && linkBattleWidget.v) {
                ((LinearLayout) this.u.f12070b).setVisibility(0);
            } else if (this.f10472k == null) {
                ((LinearLayout) this.u.f12070b).setVisibility(0);
            }
            this.f10469h.H = SystemClock.elapsedRealtime();
            Room room = this.f10467f;
            h.f11964a = true;
            b a2 = b.a.a();
            if (a2.q) {
                str = "inviter";
            } else {
                str = "invitee";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("connection_type", "anchor");
            hashMap.put("anchor_type", str);
            hashMap.put("invited_room_id", String.valueOf(a2.f9944i));
            hashMap.put("time_stamp", String.valueOf(System.currentTimeMillis()));
            String str2 = a2.x;
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("request_id", str2);
            }
            if (com.bytedance.android.live.liveinteract.cohost.a.c.a.a()) {
                w.a(hashMap, com.bytedance.android.live.liveinteract.api.m.RANDOM_LINK_MIC_INVITE, true);
                hashMap.put("random_match_waiting_time", String.valueOf(com.bytedance.android.live.liveinteract.cohost.a.c.a.f10046c * 1000));
            } else {
                w.a(hashMap, b.a.a().p, true);
                if (b.a.a().S != 0 && a2.q) {
                    hashMap.put("invite_to_success_dur", String.valueOf(System.currentTimeMillis() - h.f11968e));
                }
            }
            if (b.a.a().q) {
                hashMap.put("connection_inviter_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("connection_invitee_id", String.valueOf(b.a.a().f9941f));
            } else {
                hashMap.put("connection_invitee_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("connection_inviter_id", String.valueOf(b.a.a().f9941f));
            }
            hashMap.put("event_type", String.valueOf(b.a.a().p.getType()));
            w.a(hashMap);
            b.a.a("connection_success").a(h.a(room)).a((Map<String, String>) hashMap).a().b();
            if (this.B) {
                a(f10462a, f10464c, 0);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        boolean z2;
        boolean z3;
        super.onCreate();
        com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_Widget_onCreate");
        this.C = LiveBannerExperiment.isNewBannerEnable();
        this.D = HostLinkMicBattleHealthBarStyleSetting.INSTANCE.isNewStyle();
        this.f10467f = (Room) this.dataChannel.b(df.class);
        this.f10466e = ((Boolean) this.dataChannel.b(ee.class)).booleanValue();
        this.f10469h = b.a.a();
        g.h();
        g.f20232c = "broadcast_link_period";
        g.g();
        com.bytedance.android.live.p.l.INTERACTION_PK.load(this.dataChannel, this.f10473l);
        this.f10473l.a(8);
        this.f10468g = new d(this.dataChannel);
        this.f10474m = y.c();
        if (!com.bytedance.android.live.core.f.b.b.b() || com.bytedance.android.live.core.f.b.b.a() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            this.f10474m = (int) (((float) y.b()) * 0.5625f);
        }
        if (this.C) {
            f10462a = com.bytedance.android.live.liveinteract.match.b.d.a.a(this.D);
            View view = getView();
            if (view != null) {
                Space space = (Space) view.findViewById(R.id.dca);
                boolean z4 = this.D;
                if (space != null) {
                    ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
                    if (z4) {
                        aVar.f2051h = R.id.ae6;
                        aVar.f2053j = -1;
                    } else {
                        aVar.f2053j = R.id.ae6;
                        aVar.f2051h = -1;
                    }
                    space.setLayoutParams(aVar);
                }
            }
        } else {
            double d2 = (double) ((((float) this.f10474m) * 1.0f) / 360.0f);
            Double.isNaN(d2);
            f10462a = (int) (d2 * 138.0d);
        }
        f10465d = 0;
        int i2 = this.f10474m / 2;
        f10463b = i2;
        f10464c = (int) (((((float) i2) * 1.0f) / 9.0f) * 13.0f);
        if (!com.bytedance.android.live.core.f.b.b.b() || com.bytedance.android.live.core.f.b.b.a() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f10474m = y.c();
        if (z3) {
            this.f10474m = (int) (((float) y.b()) * 0.5625f);
        }
        ViewGroup.LayoutParams layoutParams2 = getView().getLayoutParams();
        if (z3) {
            layoutParams2.width = this.f10474m;
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
            } else if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams2).addRule(13, -1);
            }
        } else {
            layoutParams2.width = -1;
            layoutParams2.height = -1;
        }
        getView().setLayoutParams(layoutParams2);
        this.n.setVisibility(0);
        this.o = findViewById(R.id.ae6);
        this.q = (LiveLoadingView) findViewById(R.id.ci9);
        this.r = (LinkCrossTitleLayout) findViewById(R.id.c6c);
        this.s = (Guideline) findViewById(R.id.bca);
        this.w = findViewById(R.id.c5y);
        HSImageView hSImageView = (HSImageView) findViewById(R.id.n_);
        this.v = hSImageView;
        hSImageView.setVisibility(8);
        HSImageView hSImageView2 = (HSImageView) findViewById(R.id.cdf);
        this.p = hSImageView2;
        k.a(hSImageView2, "tiktok_live_interaction_resource", "ttlive_match_winning_streak_tip_bg.png");
        if (this.f10467f.background != null) {
            p.a(this.v, this.f10467f.background, com.bytedance.android.livesdk.chatroom.g.i.TOP);
        }
        this.t = new com.bytedance.android.live.liveinteract.platform.common.view.a(this.dataChannel, getView());
        if (this.dataChannel != null) {
            b.a a2 = this.t.a(R.id.c78);
            a2.f12073b = new k(this);
            this.u = a2.a(com.bytedance.android.live.liveinteract.cohost.a.b.g.class, new l(this)).a();
            b.a a3 = this.t.a(R.id.bxc);
            a3.f12073b = new m(this);
            a3.a(com.bytedance.android.live.liveinteract.cohost.a.b.g.class, n.f10488a).a();
            if (this.C && this.D) {
                b.a a4 = this.t.a(R.id.c6c);
                com.bytedance.android.live.liveinteract.match.b.d.a aVar2 = com.bytedance.android.live.liveinteract.match.b.d.a.f10692a;
                aVar2.getClass();
                a4.a(bh.class, new o(aVar2)).a();
                b.a a5 = this.t.a(R.id.crs);
                com.bytedance.android.live.liveinteract.match.b.d.a aVar3 = com.bytedance.android.live.liveinteract.match.b.d.a.f10692a;
                aVar3.getClass();
                a5.a(bh.class, new p(aVar3)).a();
                b.a a6 = this.t.a(R.id.c6a);
                com.bytedance.android.live.liveinteract.match.b.d.a aVar4 = com.bytedance.android.live.liveinteract.match.b.d.a.f10692a;
                aVar4.getClass();
                a6.a(bh.class, new c(aVar4)).a();
            }
        }
        View findViewById = findViewById(R.id.c6c);
        ViewGroup.LayoutParams layoutParams3 = findViewById.getLayoutParams();
        layoutParams3.width = y.c() - (y.a(87.0f) * 2);
        findViewById.setLayoutParams(layoutParams3);
        this.f10468g.a((d.a) this);
        if (this.f10466e) {
            if (this.f10469h.f9938c && !this.B) {
                a(f10462a, f10464c, 0);
            }
            this.f10468g.c();
        } else {
            this.f10470i = new a(this);
            h.f11967d = false;
            h.f11966c = SystemClock.elapsedRealtime();
        }
        this.dataChannel.a(com.bytedance.android.live.liveinteract.api.p.class, (Object) true).a(e.class, (h.f.a.b) new a(this));
        ((z) com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdkapi.depend.b.a.class).a(WidgetExtendsKt.autoDispose(this))).a(new b(this));
        ((z) com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.live.liveinteract.api.b.g.class).a(WidgetExtendsKt.autoDispose(this))).a(new i(this));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        String str;
        String str2;
        String str3;
        MethodCollector.i(8634);
        com.bytedance.android.live.liveinteract.cohost.ui.b.b bVar = this.x;
        if (bVar != null && bVar.n()) {
            this.x.dismiss();
        }
        if (this.dataChannel != null) {
            this.dataChannel.a(com.bytedance.android.live.liveinteract.api.p.class, (Object) false);
        }
        com.bytedance.android.livesdk.ab.c.g gVar = new com.bytedance.android.livesdk.ab.c.g();
        if (this.f10469h.r > 0 && this.f10469h.D == 0) {
            gVar.a(b.a.a().p.getType());
        }
        if (this.f10472k != null) {
            this.subWidgetManager.unload(this.f10472k);
            this.f10472k = null;
        }
        boolean z2 = true;
        if (this.f10466e) {
            Room room = this.f10467f;
            if (h.f11964a) {
                h.f11964a = false;
                com.bytedance.android.live.liveinteract.api.a.b a2 = b.a.a();
                com.bytedance.android.livesdk.ab.c.g a3 = h.a(room);
                long elapsedRealtime = SystemClock.elapsedRealtime() - a2.H;
                long j2 = elapsedRealtime / 1000;
                a3.f13518d = String.valueOf(j2);
                HashMap hashMap = new HashMap();
                hashMap.put("connection_type", "anchor");
                hashMap.put("invited_room_id", String.valueOf(a2.f9944i));
                if (b.a.a().q) {
                    str2 = "inviter";
                } else {
                    str2 = "invitee";
                }
                hashMap.put("anchor_type", str2);
                String str4 = a2.x;
                if (!TextUtils.isEmpty(str4)) {
                    hashMap.put("request_id", str4);
                }
                if (a2.V != null) {
                    hashMap.put("enter_from", a2.V);
                }
                if (b.a.a().Q) {
                    str3 = "positive_over";
                } else {
                    str3 = "negative_over";
                }
                hashMap.put("over_type", str3);
                if (b.a.a().R) {
                    hashMap.put("is_live_end", "1");
                }
                w.a(hashMap, b.a.a().p, true);
                if (j2 <= 10) {
                    z2 = false;
                }
                hashMap.put("is_effective_connection", String.valueOf(z2));
                hashMap.put("connection_duration", String.valueOf(elapsedRealtime));
                hashMap.put("event_type", String.valueOf(b.a.a().p.getType()));
                w.a(hashMap);
                b.a.a("connection_over").a(a3).a((Map<String, String>) hashMap).a().b();
            }
        } else if (!h.f11967d) {
            h.f11967d = true;
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - h.f11966c;
            com.bytedance.android.live.liveinteract.api.a.b a4 = b.a.a();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("connection_type", "anchor");
            hashMap2.put("channel_id", String.valueOf(a4.f9940e));
            hashMap2.put("watch_connection_duration", String.valueOf(elapsedRealtime2 / 1000));
            hashMap2.put("right_user_id", String.valueOf(a4.f9941f));
            if (a4.V != null) {
                hashMap2.put("enter_from", a4.V);
            }
            h.a("connection_watch_duration", hashMap2);
        }
        boolean z3 = this.f10469h.f9946k;
        boolean z4 = this.f10469h.f9947l;
        try {
            this.f10468g.b();
            this.t.a();
            this.f10469h.e("LinkCrossWidget_OnDestroy");
        } catch (Throwable unused) {
            com.bytedance.android.live.core.c.a.a(6, "DATA_CENTER", "should crash at onDestroy()");
        }
        if (LinkEntranceExperiment.INSTANCE.getValue()) {
            ad.a(this.f10473l.f10831a, new j(this), ad.b.PK);
        } else {
            com.bytedance.android.live.p.l.INTERACTION_PK.unload(this.dataChannel);
        }
        this.n.removeAllViews();
        this.n.setBackgroundColor(0);
        this.n.setVisibility(8);
        g.h();
        if (g.f20233d) {
            str = "broadcast_period";
        } else {
            str = "watch_period";
        }
        g.f20232c = str;
        g.g();
        super.onDestroy();
        com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkCross_Widget_onDestroy");
        if (this.f10466e) {
            if (z4) {
                this.dataChannel.c(r.class, "");
                MethodCollector.o(8634);
                return;
            } else if (com.bytedance.android.live.liveinteract.cohost.a.c.a.b()) {
                this.f10469h.b(com.bytedance.android.live.liveinteract.api.k.MATCH);
                MethodCollector.o(8634);
                return;
            } else if (z3) {
                com.bytedance.android.live.liveinteract.cohost.a.c.a.g();
                com.bytedance.android.live.liveinteract.cohost.a.c.a.a(this.dataChannel, a.e.TYPE_AUTO_START_WHEN_END);
                MethodCollector.o(8634);
                return;
            } else if (com.bytedance.android.live.liveinteract.cohost.a.c.a.a()) {
                com.bytedance.android.live.liveinteract.cohost.a.c.a.g();
            }
        }
        MethodCollector.o(8634);
    }

    @Override // com.bytedance.android.live.liveinteract.api.f
    public final void a(x xVar) {
        this.y = xVar;
    }

    private void d(boolean z2) {
        int i2;
        LiveLoadingView liveLoadingView = this.q;
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        liveLoadingView.setVisibility(i2);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.d.a.AbstractC0250a
    public final boolean b(int i2) {
        if (this.f10466e || i2 != 2) {
            return false;
        }
        return true;
    }

    public LinkCrossRoomWidget(FrameLayout frameLayout) {
        this.n = frameLayout;
    }

    private void c(boolean z2) {
        if (this.f10466e) {
            if (z2) {
                this.w.setVisibility(0);
                d(true);
                return;
            }
            this.w.setVisibility(8);
            d(false);
        }
    }

    public final void a(PrivacyCert privacyCert) {
        d dVar = this.f10468g;
        if (dVar != null) {
            dVar.a(privacyCert);
            if (!this.B) {
                a(f10462a, f10464c, 0);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.d.d.a
    public final void a(int i2) {
        if (com.bytedance.android.live.liveinteract.cohost.a.c.a.d()) {
            ao.a(y.e(), (int) R.string.dzb);
        } else {
            ao.a(y.e(), (int) R.string.gou);
        }
        this.f10468g.b(i2);
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.d.d.a
    public final void b(boolean z2) {
        com.bytedance.android.live.core.c.a.a(4, "LinkCrossRoomLogs", "onPkPermissionResult, result = ".concat(String.valueOf(z2)));
        this.f10469h.U = z2;
        JSONObject jSONObject = new JSONObject();
        com.bytedance.android.live.core.d.a.a(jSONObject, "enable_battle", String.valueOf(z2 ? 1 : 0));
        com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - com.bytedance.android.live.liveinteract.match.c.a.f10797a);
        int i2 = 0;
        com.bytedance.android.live.liveinteract.match.c.a.a(com.bytedance.android.live.liveinteract.match.c.a.f10803g, "check_permission_complete", jSONObject, false, 12);
        if (!LinkEntranceExperiment.INSTANCE.getValue()) {
            com.bytedance.android.live.liveinteract.match.ui.c.b bVar = this.f10473l;
            if (!z2) {
                i2 = 8;
            }
            bVar.a(i2);
            if (!z2) {
                return;
            }
        } else if (z2) {
            this.dataChannel.c(com.bytedance.android.live.liveinteract.platform.common.c.g.class, new d(this));
        } else {
            this.dataChannel.c(com.bytedance.android.live.liveinteract.platform.common.c.g.class, e.f10479a);
            return;
        }
        h();
        this.f10473l.f10834d = this.f10472k;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.d.a.AbstractC0250a
    public final void a(com.bytedance.android.live.liveinteract.platform.common.e.a.a aVar) {
        com.bytedance.android.live.liveinteract.platform.common.e.a.c cVar;
        if (!this.f10466e && isViewValid() && aVar.f11923e != null && !aVar.f11923e.isEmpty() && (cVar = aVar.f11923e.get(0)) != null) {
            this.v.setVisibility(0);
            if (this.f10469h.f9940e <= 0) {
                try {
                    this.f10469h.f9940e = Long.parseLong(aVar.f11922d);
                } catch (Exception e2) {
                    com.bytedance.android.live.core.c.a.a(4, "LinkCrossRoomLogs", "Parse ChannelId, Exception = " + e2.toString());
                }
            }
            this.z = aVar;
            v.a(4, e.a.f9628b.b(aVar));
            this.A = true;
            if (this.f10469h.f9941f <= 0) {
                Iterator<com.bytedance.android.live.liveinteract.platform.common.e.a.c> it = aVar.f11923e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!TextUtils.equals(it.next().a(), b.a.a().L)) {
                            this.f10469h.f9941f = cVar.f11929b;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            this.f10468g.c();
            float f2 = (((float) this.f10474m) * 1.0f) / ((float) aVar.f11924f.f11927c);
            if (this.C) {
                double d2 = (double) aVar.f11924f.f11926b;
                double d3 = cVar.f11934g;
                Double.isNaN(d2);
                double d4 = d2 * d3;
                double d5 = (double) f2;
                Double.isNaN(d5);
                int a2 = com.bytedance.android.live.liveinteract.match.b.d.a.a(this.D);
                f10462a = a2;
                f10465d = a2 - ((int) (d4 * d5));
            } else {
                double d6 = (double) aVar.f11924f.f11926b;
                double d7 = cVar.f11934g;
                Double.isNaN(d6);
                double d8 = d6 * d7;
                double d9 = (double) f2;
                Double.isNaN(d9);
                f10462a = (int) (d8 * d9);
                f10465d = 0;
            }
            double d10 = cVar.f11932e;
            double d11 = (double) aVar.f11924f.f11926b;
            Double.isNaN(d11);
            double d12 = d10 * d11;
            double d13 = (double) f2;
            Double.isNaN(d13);
            int i2 = (int) (d12 * d13);
            f10464c = i2;
            this.dataChannel.c(com.bytedance.android.live.liveinteract.api.a.class, Integer.valueOf(f10462a + i2));
            a(f10462a, f10464c, f10465d);
            h();
            this.f10469h.ae = cVar.o;
            if (com.bytedance.android.live.liveinteract.match.b.b.a.a()) {
                this.f10472k.c();
            } else {
                this.r.a();
            }
            b("SEI Debug Stream Height", ",marginTop:" + f10462a + ",height:" + f10464c + ",region.getHeight()=" + cVar.f11932e + ",region.getWidth()=" + cVar.f11931d + ",region.getY()=" + cVar.f11934g);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.d.d.a
    public final void a(boolean z2) {
        String str;
        d(!z2);
        StringBuilder sb = new StringBuilder("state:");
        if (z2) {
            str = "foreground";
        } else {
            str = "background";
        }
        b("LinkCross_Guest_State_Changed", sb.append(str).toString());
    }

    private void b(String str, String str2) {
        com.bytedance.android.live.liveinteract.platform.common.g.a.a(str, this.f10466e, str2);
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.d.d.a
    public final void a(String str, String str2) {
        b(str, str2);
    }

    private void b(int i2, int i3, int i4) {
        com.bytedance.android.livesdk.chatroom.c.p pVar = new com.bytedance.android.livesdk.chatroom.c.p(0);
        pVar.f15137b = Integer.valueOf(i2 + i3);
        pVar.f15138c = com.bytedance.android.live.liveinteract.match.b.b.a.a();
        pVar.f15139d = i4;
        this.dataChannel.c(t.class, pVar);
        if (!this.f10471j) {
            c(true);
        }
    }

    private void a(int i2, int i3, int i4) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) this.o.getLayoutParams();
        aVar.height = i3;
        this.o.setLayoutParams(aVar);
        this.dataChannel.c(com.bytedance.android.live.liveinteract.api.g.class, new com.bytedance.android.live.liveinteract.api.b.e(true, new StringBuilder().append(i3).append(i2).toString()));
        this.s.setGuidelineBegin(i2);
        if (this.o.getVisibility() != 0) {
            this.o.setVisibility(0);
            if (this.f10467f.getLinkMicInfo() == null) {
                com.bytedance.android.livesdk.ab.c.g gVar = new com.bytedance.android.livesdk.ab.c.g();
                if (!this.f10466e) {
                    b.a.a("connection_transform").d("live_detail").b("live").c("other").a(gVar).a(b.a.a().e()).a(this.dataChannel).b();
                }
            }
        }
        b(i2, i3, i4);
    }
}
