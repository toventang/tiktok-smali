package com.bytedance.android.livesdk.chatroom.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.s;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.gift.o;
import com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget;
import com.bytedance.android.live.liveinteract.api.as;
import com.bytedance.android.live.liveinteract.api.e;
import com.bytedance.android.live.liveinteract.api.t;
import com.bytedance.android.live.m.c;
import com.bytedance.android.live.n.ad;
import com.bytedance.android.live.n.x;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.u.g;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.b;
import com.bytedance.android.livesdk.chatroom.c.al;
import com.bytedance.android.livesdk.chatroom.c.an;
import com.bytedance.android.livesdk.chatroom.g.k;
import com.bytedance.android.livesdk.chatroom.viewmodule.BackRoomWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.CloseWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.EndWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.FullVideoButtonWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveDrawerEntranceWidget;
import com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidget;
import com.bytedance.android.livesdk.drawerfeed.f;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.gift.b.a;
import com.bytedance.android.livesdk.hashtag.MessageStationWidget;
import com.bytedance.android.livesdk.j.au;
import com.bytedance.android.livesdk.j.ax;
import com.bytedance.android.livesdk.j.ba;
import com.bytedance.android.livesdk.j.be;
import com.bytedance.android.livesdk.j.bl;
import com.bytedance.android.livesdk.j.cb;
import com.bytedance.android.livesdk.j.cd;
import com.bytedance.android.livesdk.j.cl;
import com.bytedance.android.livesdk.j.di;
import com.bytedance.android.livesdk.j.dq;
import com.bytedance.android.livesdk.j.dx;
import com.bytedance.android.livesdk.j.dz;
import com.bytedance.android.livesdk.j.ed;
import com.bytedance.android.livesdk.j.l;
import com.bytedance.android.livesdk.livesetting.gift.LiveWishlistPermissionSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveDrawerVersion;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMtMockLandscapeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractStartFetchingMessageStyleSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMtFeedDrawerShowMoreLiveSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMtForyouEntranceShowMoreLiveSetting;
import com.bytedance.android.livesdk.model.AbsBarrageWidget;
import com.bytedance.android.livesdk.p;
import com.bytedance.android.livesdk.rank.api.d;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdk.widget.LiveDebugInfoView;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.android.widget.Widget;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import f.a.b.a;
import h.z;
import java.util.HashMap;
import java.util.Map;

public final class dd extends a implements x {
    BaseLinkControlWidget H;
    HSImageView I;
    public boolean J;
    public LiveWidget K = null;
    private FullVideoButtonWidget L;
    private SwitchDefinitionTipsWidget M;
    private boolean N;
    private LiveDebugInfoView O;
    private View P;
    private final a Q = new a();
    private LiveRecyclableWidget R;
    private LiveRecyclableWidget S;
    private LiveWidget T;
    private LiveRecyclableWidget U;
    private LiveRecyclableWidget V;
    private AbsBarrageWidget W;
    private LiveRecyclableWidget X;
    private LiveWidget Y;
    private MessageStationWidget Z;

    static {
        Covode.recordClassIndex(8919);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.ui.a
    public final b d() {
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.ui.a
    public final boolean h() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.ui.a
    public final void k() {
        super.k();
        M();
    }

    public final void E() {
        View view = this.P;
        if (view != null) {
            view.findViewById(R.id.va).setVisibility(0);
        }
    }

    @Override // com.bytedance.android.live.n.x
    public final void e() {
        if (this.f15832i != null) {
            this.f15832i.getStreamType();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment, com.bytedance.android.livesdk.chatroom.ui.a
    public final void onDestroy() {
        this.Q.a();
        super.onDestroy();
    }

    private int J() {
        an anVar = (an) this.f15831h.b(ad.class);
        if (anVar == null) {
            return 0;
        }
        return anVar.f15100a;
    }

    private void M() {
        ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = 0;
        n.a(this.I, 8);
    }

    public final void D() {
        View view;
        if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() != 1 && (view = this.P) != null) {
            view.findViewById(R.id.va).setVisibility(8);
        }
    }

    public final void F() {
        FrameLayout frameLayout = (FrameLayout) this.f15825b.findViewById(R.id.bqc);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        layoutParams.leftMargin = 0;
        frameLayout.setLayoutParams(layoutParams);
    }

    private View I() {
        FullVideoButtonWidget fullVideoButtonWidget = this.L;
        if (fullVideoButtonWidget == null || !fullVideoButtonWidget.isViewValid || getView() != null) {
            return getView().findViewById(R.id.b_l);
        }
        return this.L.getView();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z H() {
        an anVar = (an) this.f15831h.b(ad.class);
        if (anVar != null) {
            int i2 = anVar.f15100a;
            if (i2 <= 0) {
                com.bytedance.android.live.core.c.a.a(6, "AbsInteractionFragment", "showOrLoadDefinitionTipsWidget. videoBottom <= 0 and not show!");
            } else {
                if (this.M == null) {
                    SwitchDefinitionTipsWidget switchDefinitionTipsWidget = (SwitchDefinitionTipsWidget) this.f15836m.load(R.id.egr, SwitchDefinitionTipsWidget.class);
                    this.M = switchDefinitionTipsWidget;
                    switchDefinitionTipsWidget.a(i2);
                }
                this.M.show();
            }
        }
        return z.f158842a;
    }

    private void K() {
        int J2;
        if (I() != null) {
            ((ViewGroup.MarginLayoutParams) I().getLayoutParams()).topMargin = J() - ((int) n.b(getContext(), 210.0f));
            if (this.f15831h != null && (J2 = J() - ((int) n.b(getContext(), 110.0f))) > 0 && J2 < (y.b() - y.d()) / 2) {
                this.f15831h.c(com.bytedance.android.livesdk.j.x.class, Integer.valueOf(J2));
            }
        }
    }

    private void L() {
        if (!this.f15832i.isOfficial() && this.f15833j.getTranslationX() == 0.0f && u.a().b().e() && O()) {
            Bundle bundle = new Bundle();
            bundle.putString("pull_type", "draw");
            bundle.putLong("room_id", ((Long) this.f15831h.b(di.class)).longValue());
            if (LiveDrawerVersion.INSTANCE.getValue()) {
                f.a(getActivity(), true, bundle, "drawer");
            } else {
                f.a((Activity) getActivity(), true);
            }
        }
    }

    private void N() {
        if (!com.bytedance.android.livesdk.chatroom.backroom.d.a.a() && this.v != null && this.v.f23299c.ag && this.f15831h != null) {
            this.f15831h.b(l.class, Long.valueOf(this.v.f23299c.aj));
        }
        if (this.v != null && this.f15831h != null) {
            this.f15831h.a(cl.class, Boolean.valueOf(this.v.f23299c.az));
        }
    }

    private boolean O() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f15831h == null) {
            return false;
        }
        if (!LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance()) {
            if (!k.a(this.f15831h) || !LiveMtFeedDrawerShowMoreLiveSetting.INSTANCE.getValue()) {
                z = false;
            } else {
                z = true;
            }
            if (!k.b(this.f15831h) || !LiveMtForyouEntranceShowMoreLiveSetting.INSTANCE.getValue()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!k.c(this.f15831h) || !LiveMtFeedDrawerShowMoreLiveSetting.INSTANCE.getValue()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z || z2 || z3) {
                return true;
            }
            return false;
        } else if (!((Boolean) this.f15831h.b(cl.class)).booleanValue() || LiveDrawerSettings.INSTANCE.getValue().getEnableDrawerRepeatJump()) {
            return true;
        } else {
            return false;
        }
    }

    public final void G() {
        View findViewById;
        if (this.f15832i != null && this.P != null && com.bytedance.android.livesdkapi.depend.model.live.f.f23137c.booleanValue() && (findViewById = this.P.findViewById(R.id.ail)) != null) {
            findViewById.setVisibility(8);
            Boolean bool = com.bytedance.android.livesdkapi.depend.model.live.f.f23135a;
            if (bool != null && bool.booleanValue()) {
                findViewById.setVisibility(0);
                if (this.O == null) {
                    this.O = new LiveDebugInfoView();
                }
                this.O.setArgs(new Object[]{this.f15832i});
                this.f15836m.load(R.id.ail, this.O);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.ui.a
    public final void g() {
        an anVar = (an) this.f15831h.b(ad.class);
        if ((anVar == null || anVar.a()) && J() > 0 && isViewValid() && !((Boolean) this.f15831h.b(ba.class)).booleanValue()) {
            this.f15831h.c(dx.class, -1);
            this.f15831h.c(dz.class, Integer.valueOf(J()));
            this.f15831h.c(ed.class, new al(n.b(getContext()) - J()));
            be beVar = new be();
            beVar.f18256a = (n.b(getContext()) - J()) + y.a(4.0f);
            this.f15831h.c(o.class, Integer.valueOf(beVar.f18256a));
            be beVar2 = new be();
            beVar2.f18256a = n.b(getContext()) - J();
            this.f15831h.c(com.bytedance.android.livesdk.j.al.class, beVar2);
            K();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.ui.a
    public final void j() {
        super.j();
        this.f15836m.load(R.id.a82, new CloseWidget());
        N();
        if (BackRoomWidget.a.a(getActivity())) {
            this.f15836m.load(R.id.qp, new BackRoomWidget());
            b(R.id.qp, 0);
        } else {
            b(R.id.qp, 8);
        }
        this.f15836m.load(R.id.n9, ((d) com.bytedance.android.live.t.a.a(d.class)).getRankWidgetClass(5), g.a());
        this.f15836m.load(R.id.bem, ((com.bytedance.android.live.h.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.h.b.class)).getAudienceHashTagWidget());
        if ((LiveMtMockLandscapeSetting.INSTANCE.getValue() || (this.f15832i != null && !this.f15832i.isStar() && ((this.f15832i.isThirdParty || this.f15832i.isScreenshot) && this.f15832i.mRoomAuthStatus != null && this.f15832i.mRoomAuthStatus.isEnableLandscape()))) && this.f15831h != null) {
            this.f15831h.c(com.bytedance.android.livesdk.j.x.class, Integer.valueOf((int) n.b(getContext(), 210.0f)));
        }
        if (this.f15831h != null && EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1) {
            this.f15831h.c(dq.class, true);
        }
        this.L = new FullVideoButtonWidget();
        this.f15836m.load(R.id.b_l, this.L);
        if (this.f15825b != null) {
            this.r = this.f15836m.load(R.id.sg, LiveDrawerEntranceWidget.class);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.a
    public final void l() {
        super.l();
        N();
        this.R = this.f15836m.load(((ISlotService) com.bytedance.android.live.t.a.a(ISlotService.class)).getBarrageWidget());
        this.S = this.f15836m.load(R.id.e65, ((ISlotService) com.bytedance.android.live.t.a.a(ISlotService.class)).getFrameSlotWidget());
        if (this.f15832i != null && this.f15832i.getRoomAuthStatus() != null && com.bytedance.android.livesdk.gift.b.a.a(false, true, this.f15832i.getRoomAuthStatus().isEnableGift()) == a.EnumC0371a.SHOW && this.f15832i != null && this.f15832i.haveWishList && LiveWishlistPermissionSetting.INSTANCE.getValue().f17948b == 1) {
            this.f15836m.load(R.id.fms, ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).getWishListWidget());
            this.f15831h.b(bl.class, (h.f.a.b) new dl(this));
        }
        if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1 && InteractStartFetchingMessageStyleSetting.INSTANCE.getValue() == 1) {
            this.p = new EndWidget();
            this.f15836m.load(R.id.awq, this.p);
        }
        if (this.f15832i != null && this.f15832i.getId() != 0) {
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.chatroom.backroom.a.a(this.f15832i, (byte) 0));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.ui.a
    public final void m() {
        super.m();
        if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1 && this.f15832i != null && this.f15832i.mRoomAuthStatus != null && !this.f15832i.mRoomAuthStatus.isEnableLandscape()) {
            I().setVisibility(8);
        }
        this.T = ((com.bytedance.android.live.c.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.c.b.class)).getDecorationWidget();
        this.f15836m.load(R.id.ccf, this.T);
        if (this.f15830g == i.VIDEO && c.a(this.f15831h)) {
            this.U = this.f15836m.load(R.id.dfs, ((com.bytedance.android.live.m.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.m.a.class)).getQAWidget());
        }
        this.V = this.f15836m.load(R.id.b9m, ((ISlotService) com.bytedance.android.live.t.a.a(ISlotService.class)).getFrameL2SlotWidget());
        if (this.f15832i != null && !this.f15832i.isOfficial() && !com.bytedance.android.livesdk.bl.f14211a) {
            this.W = ((p) com.bytedance.android.live.t.a.a(p.class)).getBarrageWidget();
            this.f15836m.load(R.id.ri, this.W);
        }
        com.bytedance.android.live.j.a aVar = (com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class);
        if (!(aVar == null || this.f15832i == null || this.f15832i.officialChannelInfo == null || this.f15832i.getId() != this.f15832i.officialChannelInfo.f18985h)) {
            this.X = this.f15836m.load(R.id.r0, aVar.getMicRoomBackupTipsWidget());
        }
        if (this.f15830g == i.VIDEO || this.f15830g == i.AUDIO) {
            final e linkWidgetFactory = ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).getLinkWidgetFactory();
            this.H = linkWidgetFactory.a(new BaseLinkControlWidget.a() {
                /* class com.bytedance.android.livesdk.chatroom.ui.dd.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(8922);
                }

                @Override // com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget.a
                public final void a(LiveWidget liveWidget) {
                    dd.this.f15836m.unload(liveWidget);
                }

                @Override // com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget.a
                public final LiveWidget a(int i2) {
                    if (i2 == 0) {
                        dd.this.K = linkWidgetFactory.a();
                        dd.this.f15836m.load(R.id.cwb, (Widget) dd.this.K, false);
                    } else if (i2 == 1) {
                        dd ddVar = dd.this;
                        ddVar.K = linkWidgetFactory.b((FrameLayout) ddVar.f15825b.findViewById(R.id.bqc));
                        dd.this.f15836m.load(R.id.cwb, (Widget) dd.this.K, false);
                    } else if (i2 == 2) {
                        dd ddVar2 = dd.this;
                        ddVar2.K = linkWidgetFactory.a((FrameLayout) ddVar2.f15825b.findViewById(R.id.bqc));
                        dd.this.f15836m.load(R.id.d54, (Widget) dd.this.K, false);
                    }
                    return dd.this.K;
                }
            });
        }
        this.f15836m.load(R.id.bqf, this.H);
        if (this.H != null) {
            this.A.add(0, this.H);
        }
        if (!com.bytedance.android.livesdk.bl.f14211a) {
            this.Y = ((com.bytedance.android.live.share.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.share.c.class)).getShareWidget();
            this.f15836m.load(this.Y);
        }
        if (!((com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class)).isMicRoomForCurrentRoom()) {
            this.f15836m.load(R.id.bh8, ((d) com.bytedance.android.live.t.a.a(d.class)).getRankWidgetClass(4), g.a());
        }
        this.Z = (MessageStationWidget) this.f15836m.load(MessageStationWidget.class);
        G();
        this.f15836m.load(R.id.cju, ((com.bytedance.android.livesdk.lynx.lynxcard.b) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.lynx.lynxcard.b.class)).getLynxCardPreviewWidget());
        this.f15836m.load(R.id.cjv, ((com.bytedance.android.livesdk.lynx.lynxcard.b) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.lynx.lynxcard.b.class)).getLynxCardWidget());
        IGiftService iGiftService = (IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class);
        if (iGiftService != null && iGiftService.enableRedEnvelope()) {
            this.f15836m.load(R.id.cdn, iGiftService.getRedEnvelopeWidget());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        K();
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.android.livesdk.chatroom.ui.a
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f15831h.a((Object) this, t.class, (h.f.a.b) new dh(this));
        this.f15831h.a((m) this, as.class, (h.f.a.b) new di(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(com.bytedance.android.live.liveinteract.api.b.o oVar) {
        if (oVar.f10006d) {
            return z.f158842a;
        }
        com.bytedance.android.live.liveinteract.api.b.n nVar = oVar.f10003a;
        boolean z = oVar.f10005c;
        final FrameLayout frameLayout = oVar.f10004b;
        if (nVar == com.bytedance.android.live.liveinteract.api.b.n.NORMAL) {
            F();
        } else if (!z) {
            final FrameLayout frameLayout2 = (FrameLayout) this.f15825b.findViewById(R.id.bqc);
            frameLayout2.post(new Runnable() {
                /* class com.bytedance.android.livesdk.chatroom.ui.dd.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(8926);
                }

                public final void run() {
                    if (frameLayout != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
                        layoutParams.width = frameLayout.getWidth();
                        layoutParams.height = frameLayout.getHeight();
                        layoutParams.topMargin = frameLayout.getTop();
                        layoutParams.leftMargin = frameLayout.getLeft();
                        layoutParams.gravity = 3;
                        frameLayout2.setLayoutParams(layoutParams);
                        return;
                    }
                    dd.this.F();
                }
            });
        }
        return z.f158842a;
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment, com.bytedance.android.livesdk.chatroom.ui.a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f15831h != null) {
            this.f15831h.a((m) this, au.class, (h.f.a.b) new de(this));
            this.f15831h.a((m) this, com.bytedance.android.livesdk.j.k.class, (h.f.a.b) new df(this));
        }
        this.Q.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.n.e.class).d(new dg(this)));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(com.bytedance.android.livesdk.chatroom.c.p pVar) {
        if (isViewValid()) {
            if (pVar.f15136a == 0) {
                this.I.setBackgroundColor(Color.parseColor("#303342"));
                if (this.f15832i.background != null) {
                    com.bytedance.android.live.core.f.p.a(this.I, this.f15832i.background, com.bytedance.android.livesdk.chatroom.g.i.BOTTOM);
                }
                n.a(this.I, 0);
            } else if (pVar.f15136a == 1) {
                M();
            }
        }
        return z.f158842a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z c(Boolean bool) {
        int i2;
        if (bool.booleanValue()) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        b(R.id.fms, i2);
        b(R.id.epk, i2);
        b(R.id.d9p, i2);
        b(R.id.dcl, i2);
        b(R.id.ai6, i2);
        b(R.id.d56, i2);
        b(R.id.b01, i2);
        if (this.q != null) {
            a(this.q.getView(), i2);
        } else {
            b(R.id.dpy, i2);
        }
        this.f15831h.c(com.bytedance.android.livesdk.j.y.class, Integer.valueOf(i2));
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(View view) {
        this.f15831h.a(ax.class, Integer.valueOf(view.getHeight()));
        ((GestureDetectLayout) view).setOnSizeChangedListener(new dm(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(com.bytedance.android.livesdk.n.e eVar) {
        if (!this.N) {
            boolean z = eVar.f19839a;
            boolean a2 = com.bytedance.android.live.uikit.c.a.a(getContext());
            int width = this.f15833j.getWidth();
            if (a2) {
                width = -width;
            }
            if (!z) {
                if (b() != null) {
                    b().animate().x((float) width).setListener(new AnimatorListenerAdapter() {
                        /* class com.bytedance.android.livesdk.chatroom.ui.dd.AnonymousClass7 */

                        static {
                            Covode.recordClassIndex(8927);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            com.bytedance.android.livesdk.like.b likeHelper = ((p) com.bytedance.android.live.t.a.a(p.class)).getLikeHelper(dd.this.f15832i.getId());
                            if (likeHelper != null) {
                                likeHelper.a(true);
                                com.bytedance.android.livesdk.like.c.a(dd.this.f15832i, likeHelper);
                            }
                        }
                    }).start();
                }
                this.f15833j.animate().x((float) width).setListener(new AnimatorListenerAdapter() {
                    /* class com.bytedance.android.livesdk.chatroom.ui.dd.AnonymousClass8 */

                    static {
                        Covode.recordClassIndex(8928);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.chatroom.c.e(true));
                    }
                }).start();
                return;
            }
            if (b() != null) {
                b().animate().x(0.0f).setListener(new AnimatorListenerAdapter() {
                    /* class com.bytedance.android.livesdk.chatroom.ui.dd.AnonymousClass9 */

                    static {
                        Covode.recordClassIndex(8929);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        com.bytedance.android.livesdk.like.b likeHelper = ((p) com.bytedance.android.live.t.a.a(p.class)).getLikeHelper(dd.this.f15832i.getId());
                        if (likeHelper != null) {
                            likeHelper.a(false);
                            com.bytedance.android.livesdk.like.c.a(dd.this.f15832i, likeHelper);
                        }
                    }
                }).start();
            }
            this.f15833j.animate().x(0.0f).setListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.android.livesdk.chatroom.ui.dd.AnonymousClass10 */

                static {
                    Covode.recordClassIndex(8921);
                }

                public final void onAnimationStart(Animator animator) {
                    com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.chatroom.c.e(false));
                }
            }).start();
            L();
        }
    }

    private static void a(View view, int i2) {
        if (view != null) {
            view.setVisibility(i2);
        }
    }

    private void b(int i2, int i3) {
        if (this.f15833j != null) {
            a(this.f15833j.findViewById(i2), i3);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i2, int i3) {
        if (i2 != i3) {
            this.f15831h.a(ax.class, Integer.valueOf(i2));
            this.f15831h.c(cb.class, Integer.valueOf(i2));
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment, com.bytedance.android.livesdk.chatroom.ui.a
    public final void onViewCreated(View view, Bundle bundle) {
        View findViewById;
        super.onViewCreated(view, bundle);
        this.P = view;
        view.post(new dj(this, view));
        if (this.J) {
            D();
        } else {
            E();
        }
        this.I = (HSImageView) view.findViewById(R.id.sk);
        if (s.b(this.f15831h) && (findViewById = view.findViewById(R.id.bqo)) != null) {
            findViewById.setVisibility(0);
        }
        this.f15831h.a((m) this, com.bytedance.android.live.liveinteract.api.a.class, (h.f.a.b) new dk(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.bytedance.android.b.a(R.layout.b9s, viewGroup);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.ui.a
    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2) {
        boolean z;
        if (!(motionEvent == null || motionEvent2 == null)) {
            float x = motionEvent2.getX() - motionEvent.getX();
            if (Math.abs(x) > 200.0f && Math.abs(f2) > 100.0f) {
                boolean a2 = com.bytedance.android.live.uikit.c.a.a(getContext());
                if (!a2 ? x <= 0.0f : x >= 0.0f) {
                    z = false;
                } else {
                    z = true;
                }
                int width = this.f15833j.getWidth();
                if (a2) {
                    width = -width;
                }
                if (z) {
                    this.N = true;
                    HashMap hashMap = new HashMap();
                    hashMap.put("scene_id", "1001");
                    Object b2 = this.f15831h.b(cd.class);
                    if (b2 != null) {
                        hashMap.put("action_type", b2);
                    }
                    if (!(this.f15832i == null || this.f15832i.author() == null)) {
                        hashMap.put("anchor_id", String.valueOf(this.f15832i.author().getId()));
                        hashMap.put("room_id", String.valueOf(this.f15832i.getId()));
                    }
                    hashMap.put("clear_type", "draw");
                    b.a.a("livesdk_screen_clear").a((Map<String, String>) hashMap).b("live").d("live_take_detail").a(this.f15831h).b();
                    com.bytedance.android.livesdk.ab.k.a(getActivity());
                    this.f15832i.getId();
                    if (b() != null) {
                        b().animate().x((float) width).setListener(new AnimatorListenerAdapter() {
                            /* class com.bytedance.android.livesdk.chatroom.ui.dd.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(8920);
                            }

                            public final void onAnimationEnd(Animator animator) {
                                com.bytedance.android.livesdk.like.b likeHelper = ((p) com.bytedance.android.live.t.a.a(p.class)).getLikeHelper(dd.this.f15832i.getId());
                                if (likeHelper != null) {
                                    likeHelper.a(true);
                                    com.bytedance.android.livesdk.like.c.a(dd.this.f15832i, likeHelper);
                                }
                            }
                        }).start();
                    }
                    this.f15833j.animate().x((float) width).setListener(new AnimatorListenerAdapter() {
                        /* class com.bytedance.android.livesdk.chatroom.ui.dd.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(8923);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.chatroom.c.e(true));
                        }
                    }).start();
                } else {
                    this.N = false;
                    com.bytedance.android.livesdk.ab.k.a(getActivity());
                    this.f15832i.getId();
                    if (b() != null) {
                        b().animate().x(0.0f).setListener(new AnimatorListenerAdapter() {
                            /* class com.bytedance.android.livesdk.chatroom.ui.dd.AnonymousClass4 */

                            static {
                                Covode.recordClassIndex(8924);
                            }

                            public final void onAnimationEnd(Animator animator) {
                                com.bytedance.android.livesdk.like.b likeHelper = ((p) com.bytedance.android.live.t.a.a(p.class)).getLikeHelper(dd.this.f15832i.getId());
                                if (likeHelper != null) {
                                    likeHelper.a(false);
                                    com.bytedance.android.livesdk.like.c.a(dd.this.f15832i, likeHelper);
                                }
                            }
                        }).start();
                    }
                    this.f15833j.animate().x(0.0f).setListener(new AnimatorListenerAdapter() {
                        /* class com.bytedance.android.livesdk.chatroom.ui.dd.AnonymousClass5 */

                        static {
                            Covode.recordClassIndex(8925);
                        }

                        public final void onAnimationStart(Animator animator) {
                            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.chatroom.c.e(false));
                        }
                    }).start();
                    L();
                }
                return true;
            }
        }
        return false;
    }
}
