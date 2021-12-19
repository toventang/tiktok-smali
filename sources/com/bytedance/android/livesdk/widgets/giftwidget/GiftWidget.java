package com.bytedance.android.livesdk.widgets.giftwidget;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.gift.k;
import com.bytedance.android.live.u.g;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.ba;
import com.bytedance.android.livesdk.bd;
import com.bytedance.android.livesdk.be;
import com.bytedance.android.livesdk.boostcard.LiveBoostcardApi;
import com.bytedance.android.livesdk.boostcard.d;
import com.bytedance.android.livesdk.dialogv2.viewmodel.a;
import com.bytedance.android.livesdk.gift.d.h;
import com.bytedance.android.livesdk.gift.model.o;
import com.bytedance.android.livesdk.gift.model.r;
import com.bytedance.android.livesdk.gift.model.s;
import com.bytedance.android.livesdk.gifttray.AbsNormalGiftAnimWidget;
import com.bytedance.android.livesdk.gifttray.LiveGiftTrayWidget;
import com.bytedance.android.livesdk.guide.LiveGiftGuideWidget;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.di;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftDialogUpDownSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftGuideSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRoomChargeTypeSetting;
import com.bytedance.android.livesdk.model.message.aw;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.newvideogift.LiveNewVideoGiftWidget;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdk.service.a.d;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.assets.j;
import com.bytedance.android.livesdk.service.c.f.d;
import com.bytedance.android.livesdk.toolbar.a.a;
import com.bytedance.android.livesdk.util.c;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.widgets.LiveNewSpecialGiftWidget;
import com.bytedance.android.livesdk.widgets.giftwidget.b.ad;
import com.bytedance.android.livesdk.widgets.giftwidget.b.ae;
import com.bytedance.android.livesdk.widgets.giftwidget.b.af;
import com.bytedance.android.livesdk.widgets.giftwidget.b.ag;
import com.bytedance.android.livesdk.widgets.giftwidget.b.at;
import com.bytedance.android.livesdk.widgets.giftwidget.b.av;
import com.bytedance.android.livesdk.widgets.giftwidget.b.ax;
import com.bytedance.android.livesdk.widgets.giftwidget.b.ay;
import com.bytedance.android.livesdk.widgets.giftwidget.b.az;
import com.bytedance.android.livesdk.widgets.giftwidget.b.b;
import com.bytedance.android.livesdk.widgets.giftwidget.b.v;
import com.bytedance.android.livesdk.z.c.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.widget.Widget;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.ss.android.ugc.aweme.au;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

public class GiftWidget extends LiveRecyclableWidget implements s, LiveNewVideoGiftWidget.a, ad.a, ag.a, az.a, b.a, au {

    /* renamed from: a  reason: collision with root package name */
    AbsNormalGiftAnimWidget f22662a;

    /* renamed from: b  reason: collision with root package name */
    LiveNewVideoGiftWidget f22663b;

    /* renamed from: c  reason: collision with root package name */
    v f22664c;

    /* renamed from: d  reason: collision with root package name */
    Room f22665d;

    /* renamed from: e  reason: collision with root package name */
    boolean f22666e;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.android.livesdk.v f22667f;

    /* renamed from: g  reason: collision with root package name */
    private RecyclableWidgetManager f22668g;

    /* renamed from: h  reason: collision with root package name */
    private final WidgetCreateTimeUtil f22669h = new WidgetCreateTimeUtil();

    /* renamed from: i  reason: collision with root package name */
    private a f22670i;

    /* renamed from: j  reason: collision with root package name */
    private ag f22671j;

    /* renamed from: k  reason: collision with root package name */
    private b f22672k;

    /* renamed from: l  reason: collision with root package name */
    private az f22673l;

    /* renamed from: m  reason: collision with root package name */
    private ay f22674m;
    private d n;
    private ax o;
    private ViewGroup p;
    private r q;
    private FrameLayout r;
    private int s = 0;
    private ad t;
    private boolean u = false;
    private int v;

    static {
        Covode.recordClassIndex(13375);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bgw;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object... objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.b.b.a
    public final void a(boolean z) {
        AbsNormalGiftAnimWidget absNormalGiftAnimWidget = this.f22662a;
        if (absNormalGiftAnimWidget != null && this.f22663b != null) {
            if (z) {
                absNormalGiftAnimWidget.a();
                this.f22662a.b();
                this.f22663b.a();
                this.f22662a.f17979a = true;
                return;
            }
            absNormalGiftAnimWidget.f17979a = false;
        }
    }

    @Override // com.bytedance.android.livesdk.gift.model.s
    public final void a(RecyclableWidgetManager recyclableWidgetManager) {
        this.f22668g = recyclableWidgetManager;
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.b.ag.a
    public final void a(Exception exc, com.bytedance.android.livesdk.service.b.d dVar) {
        Context context = getContext();
        v vVar = this.f22664c;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            boolean booleanValue = ((Boolean) dataChannel.b(ee.class)).booleanValue();
            Room room = (Room) dataChannel.b(df.class);
            if (room != null) {
                if (!(exc instanceof com.bytedance.android.livesdk.gift.f.a)) {
                    if (!(exc instanceof com.bytedance.android.live.a.a.b.a)) {
                        ao.a(y.e(), (int) R.string.e9_);
                        return;
                    } else if (((com.bytedance.android.live.a.a.a) exc).getErrorCode() != 40001) {
                        if (((com.bytedance.android.live.a.a.a) exc).getErrorCode() == 90501) {
                            j.a().b(room.getId());
                            b.a aVar = new b.a(context);
                            aVar.f18296m = true;
                            aVar.b(R.string.gtd).a(R.string.goz, av.f22759a, false).a().show();
                            return;
                        }
                        com.bytedance.android.live.a.a.b.a aVar2 = (com.bytedance.android.live.a.a.b.a) exc;
                        if (aVar2.getErrorCode() == 4004051) {
                            ao.a(aVar2.getPrompt());
                            com.bytedance.android.livesdk.service.c.f.d.a(d.a.ANCHOR);
                            return;
                        }
                        com.bytedance.android.live.a.a.b.a aVar3 = (com.bytedance.android.live.a.a.b.a) exc;
                        if (aVar3.getErrorCode() == 4004052) {
                            ao.a(aVar3.getPrompt());
                            com.bytedance.android.livesdk.service.c.f.d.a(d.a.GUEST);
                            return;
                        }
                        com.bytedance.android.live.a.a.b.a aVar4 = (com.bytedance.android.live.a.a.b.a) exc;
                        if (aVar4.getErrorCode() == 4025008) {
                            ao.a(aVar4.getPrompt());
                            b.a.a("subscribe_expire").a("room_id", e.i()).a("anchor_id", e.h()).a("enter_from_merge", e.a()).a("enter_method", e.d()).a("action_type", e.e()).a("request_id", e.k()).a("video_id", e.f()).a("click_position", "sub_gift").b();
                            return;
                        }
                        com.bytedance.android.live.a.a.b.a aVar5 = (com.bytedance.android.live.a.a.b.a) exc;
                        int errorCode = aVar5.getErrorCode();
                        if (errorCode == 40032) {
                            vVar.a();
                            return;
                        } else if (errorCode == 4006063) {
                            vVar.a("reject");
                            return;
                        } else if (errorCode == 4006064) {
                            vVar.a("frequency");
                            return;
                        } else {
                            ao.a(aVar5.getPrompt());
                            if (errorCode == 4006052) {
                                b.a.a("livesdk_consume_limit_toast_show").a().b();
                                return;
                            }
                            return;
                        }
                    }
                }
                if (LiveRoomChargeTypeSetting.INSTANCE.getValue() == 1 || booleanValue) {
                    ao.a(y.e(), (int) R.string.gyf);
                    String str = dVar.f21294j;
                    String str2 = "wishlist";
                    if (!TextUtils.equals(str, str2)) {
                        str2 = TextUtils.equals(str, "convenient_gift") ? "shortcut_gift" : "gift";
                    }
                    vVar.a(new bd(str2, 0, "normal", dVar.f21294j));
                    return;
                }
                b.a aVar6 = new b.a(context);
                aVar6.f18285b = context.getString(R.string.gwo);
                aVar6.a(R.string.gwr, (DialogInterface.OnClickListener) new at(context), false).b(R.string.gle, com.bytedance.android.livesdk.widgets.giftwidget.b.au.f22758a, false).a().show();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.b.ad.a
    public final void a(com.bytedance.android.livesdk.model.message.y yVar, boolean z) {
        if (isViewValid()) {
            long j2 = (long) yVar.f19709k;
            Room room = this.f22665d;
            if (!(room == null || room.getOwner() == null || ((yVar.f19706h != null && 0 != yVar.f19706h.getId() && yVar.f19706h.getId() != this.f22665d.getOwner().getId()) || (yVar.s && j2 == 0)))) {
                this.dataChannel.b(com.bytedance.android.livesdkapi.e.a.class, Long.valueOf(j2));
            }
            if (!z || yVar.s || yVar.f19711m == 1) {
                u uVar = yVar.t;
                if (uVar == null) {
                    com.bytedance.android.live.core.c.a.a(6, "GiftWidget", "The user does not have this gift locally， giftMessageId = " + yVar.getMessageId() + ",  giftId = " + yVar.f19707i);
                    return;
                }
                com.bytedance.android.livesdk.gift.a.a aVar = com.bytedance.android.livesdk.service.animation.a.a().f21177a.get(GiftManager.inst().getGiftType(uVar));
                if (aVar != null && (yVar.f19706h == null || yVar.f19706h.getId() == com.bytedance.android.livesdk.userservice.u.a().b().c())) {
                    aVar.a(yVar);
                }
                this.f22662a.a(yVar);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.b.b.a
    public final void a(String str) {
        if (getContext() instanceof Activity) {
            com.bytedance.android.livesdk.firstrecharge.d dVar = com.bytedance.android.livesdk.firstrecharge.d.u;
            androidx.fragment.app.e a2 = p.a(getContext());
            l.d(a2, "");
            if (str == null) {
                str = "";
            }
            dVar.f17740h = str;
            com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(f.class);
            l.b(a3, "");
            ((f) a3).getHybridDialogManager().a();
            com.bytedance.android.live.wallet.d walletCenter = ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter();
            l.b(walletCenter, "");
            dVar.f17735c = (int) walletCenter.b();
            dVar.n = new WeakReference<>(a2);
            a2.getApplication().unregisterActivityLifecycleCallbacks(dVar.s);
            a2.getApplication().registerActivityLifecycleCallbacks(dVar.s);
            ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().a(dVar.t);
            ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().a(dVar.r, a2);
        }
    }

    @Override // com.bytedance.android.livesdk.gift.model.s
    public final void a() {
        this.s = R.id.e81;
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.b.b.a
    public final void d() {
        this.containerView.requestFocus();
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.b.b.a
    public final void f() {
        this.f22664c.a();
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.b.b.a
    public final void h() {
        ((com.bytedance.android.livesdk.dialogv2.a) this.f22667f).d();
    }

    @Override // com.bytedance.android.livesdk.newvideogift.LiveNewVideoGiftWidget.a
    public final void b() {
        if (this.dataChannel != null) {
            this.dataChannel.c(ba.class);
        }
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.b.b.a
    public final void g() {
        MethodCollector.i(9380);
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        MethodCollector.o(9380);
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.b.b.a
    public final void e() {
        r rVar;
        if (((Boolean) this.dataChannel.b(cp.class)).booleanValue() && (rVar = this.q) != null) {
            rVar.a();
        }
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.b.b.a
    public final void c() {
        for (com.bytedance.android.livesdk.gift.a.a aVar : com.bytedance.android.livesdk.service.animation.a.a().f21177a.values()) {
            aVar.a();
        }
        AbsNormalGiftAnimWidget absNormalGiftAnimWidget = this.f22662a;
        if (absNormalGiftAnimWidget != null) {
            absNormalGiftAnimWidget.a();
        }
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.b.b.a
    public final void i() {
        Fragment a2 = ((androidx.fragment.app.e) getContext()).getSupportFragmentManager().a(((f) com.bytedance.android.live.t.a.a(f.class)).getWebDialogTag());
        if (a2 instanceof androidx.fragment.app.d) {
            ((androidx.fragment.app.d) a2).dismissAllowingStateLoss();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        IMessageManager iMessageManager;
        ad adVar = this.t;
        if (adVar.f22691a != null && !adVar.f22691a.isDisposed()) {
            adVar.f22691a.dispose();
        }
        IMessageManager iMessageManager2 = (IMessageManager) adVar.f22696f.b(cg.class);
        if (iMessageManager2 != null) {
            iMessageManager2.removeMessageListener(adVar);
        }
        com.bytedance.android.livesdk.service.c.f.d.a("GiftWidget unLoad");
        ag agVar = this.f22671j;
        if (agVar != null) {
            agVar.f22702c.b(agVar);
        }
        com.bytedance.android.livesdk.widgets.giftwidget.b.b bVar = this.f22672k;
        bVar.f22775i = null;
        bVar.f22770d.removeObserver(bVar.f22776j);
        bVar.f22774h.a();
        v vVar = this.f22664c;
        if (vVar != null) {
            vVar.f22800b.b(vVar);
        }
        ay ayVar = this.f22674m;
        if (!(ayVar == null || (iMessageManager = ayVar.f22762a) == null)) {
            iMessageManager.removeMessageListener(ayVar);
        }
        com.bytedance.android.livesdk.boostcard.d dVar = this.n;
        if (dVar != null) {
            com.bytedance.android.livesdk.boostcard.b.f14222h = false;
            dVar.f14228d = 0;
            dVar.f14229e = 0;
            dVar.f14236l.clear();
            dVar.f14227c.a();
            dVar.f14230f = false;
            com.bytedance.android.livesdk.boostcard.b.f14217c = false;
            dVar.f14231g = false;
            dVar.f14232h = false;
            dVar.f14233i = false;
            com.bytedance.ies.xbridge.e.b.b("live_boost_use_card", dVar);
        }
        a.C0498a.f22936a.b();
        com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.z.b.b());
        com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.widgets.giftwidget.a.a());
        com.bytedance.android.livesdk.v vVar2 = this.f22667f;
        if (vVar2 != null) {
            vVar2.dismiss();
        }
        this.f22669h.send();
    }

    @Override // com.bytedance.android.livesdk.gift.model.s
    public final void a(ViewGroup viewGroup) {
        this.p = viewGroup;
    }

    @Override // com.bytedance.android.livesdk.gift.model.s
    public final void a(r rVar) {
        this.q = rVar;
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.b.ad.a
    public final void a(aw awVar) {
        AbsNormalGiftAnimWidget absNormalGiftAnimWidget = this.f22662a;
        if (absNormalGiftAnimWidget != null && awVar != null) {
            absNormalGiftAnimWidget.a(awVar);
        }
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.b.b.a
    public final void a(int i2) {
        if (isViewValid() && getContext() != null) {
            this.v = i2;
            if (!this.u) {
                ViewGroup viewGroup = (ViewGroup) this.contentView.findViewById(R.id.cli);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
                layoutParams.bottomMargin = i2;
                viewGroup.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.b.b.a
    public final void b(boolean z) {
        ViewGroup viewGroup;
        float a2;
        if (this.contentView != null && (viewGroup = (ViewGroup) this.contentView.findViewById(R.id.cw8)) != null) {
            ViewPropertyAnimator animate = viewGroup.animate();
            if (z) {
                a2 = 0.0f;
            } else {
                a2 = (float) y.a(44.0f);
            }
            animate.translationY(a2).setDuration(88).start();
        }
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.b.b.a
    public final void a(View view) {
        MethodCollector.i(9175);
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.r.addView(view);
        }
        MethodCollector.o(9175);
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.b.b.a
    public final void a(com.bytedance.android.livesdk.chatroom.c.i iVar) {
        if (isViewValid() && getContext() != null && this.f22666e) {
            this.u = iVar.f15121a;
            ViewGroup viewGroup = (ViewGroup) this.contentView.findViewById(R.id.cw8);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
            int i2 = iVar.f15122b;
            if (!iVar.f15121a) {
                i2 = this.v;
                if (i2 == 0) {
                    i2 = (int) getContext().getResources().getDimension(R.dimen.w0);
                }
            } else if (layoutParams.bottomMargin >= i2) {
                return;
            }
            ObjectAnimator duration = ObjectAnimator.ofFloat(viewGroup, "translationY", (float) (layoutParams.bottomMargin - i2)).setDuration(300L);
            View findViewById = this.contentView.findViewById(R.id.bbm);
            if (findViewById != null) {
                ObjectAnimator.ofFloat(findViewById, "translationY", (float) (layoutParams.bottomMargin - i2)).setDuration(300L).start();
            }
            duration.start();
        }
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.b.az.a
    public final void b(h hVar) {
        User user;
        User owner;
        if (d.a.f21172a.a(d.c.GIFT_DIALOG)) {
            c.a(c.a.ENTER_GIFT_PANEL);
            androidx.fragment.app.i iVar = (androidx.fragment.app.i) this.dataChannel.b(com.bytedance.android.livesdk.j.ao.class);
            com.bytedance.android.livesdk.service.c.a.e.f21319i.a();
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.live.gift.c());
            if (LiveGiftDialogUpDownSetting.INSTANCE.getValue() != 1 || !this.f22666e) {
                Room room = this.f22665d;
                if (hVar.f17850a == null) {
                    user = this.f22665d.getOwner();
                } else {
                    user = hVar.f17850a;
                }
                this.f22667f = com.bytedance.android.livesdk.olddialog.a.a(room, user, hVar.f17852c, hVar.f17851b, hVar.f17853d, hVar.f17854e);
            } else {
                if (hVar.f17850a == null || this.f22665d == null || hVar.f17850a.getId() == this.f22665d.getOwnerUserId()) {
                    a.C0355a.C0356a.f17017a.a(GiftDialogViewModel.b.ANCHOR);
                } else {
                    a.C0355a.C0356a.f17017a.a(GiftDialogViewModel.b.GUEST);
                }
                a.C0355a.C0356a.f17017a.f17008d = this.f22665d;
                a.C0355a.C0356a.f17017a.a(hVar.f17851b);
                com.bytedance.android.livesdk.dialogv2.viewmodel.a aVar = a.C0355a.C0356a.f17017a;
                if (hVar.f17850a != null) {
                    owner = hVar.f17850a;
                } else {
                    owner = ((Room) this.dataChannel.b(df.class)).getOwner();
                }
                aVar.f17006b = owner;
                a.C0355a.C0356a.f17017a.f17005a = Long.valueOf(hVar.f17854e);
                this.f22667f = com.bytedance.android.livesdk.dialogv2.b.a(hVar.f17853d);
            }
            if (iVar != null) {
                ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().d();
                this.f22667f.show(iVar, "LiveNewGiftDialog");
            }
        }
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.b.b.a
    public final void a(h hVar) {
        az azVar = this.f22673l;
        if (com.bytedance.android.livesdk.userservice.u.a().b().a().childrenManagerForbidWalletFunctions()) {
            ao.a(azVar.f22764a, (int) R.string.glp);
        } else if (((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).isNeedProtectMinor()) {
            ao.a(y.e(), (int) R.string.gte);
        } else {
            if (azVar.f22766c != null) {
                azVar.f22766c.c(com.bytedance.android.live.p.e.class, true);
            }
            if (azVar.f22765b != null) {
                azVar.f22765b.b(hVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0177, code lost:
        if (r17 != null) goto L_0x0167;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x016e  */
    @Override // com.bytedance.android.livesdk.widgets.giftwidget.b.ad.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.android.livesdk.model.message.v r17) {
        /*
        // Method dump skipped, instructions count: 382
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widgets.giftwidget.GiftWidget.a(com.bytedance.android.livesdk.model.message.v):void");
    }

    @Override // com.bytedance.android.livesdk.widgets.giftwidget.b.ad.a
    public final void a(com.bytedance.android.livesdk.model.message.y yVar) {
        AbsNormalGiftAnimWidget absNormalGiftAnimWidget = this.f22662a;
        if (absNormalGiftAnimWidget != null && yVar != null) {
            absNormalGiftAnimWidget.b(yVar);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object... objArr) {
        long j2;
        Room room;
        boolean z;
        IMessageManager iMessageManager;
        Object obj;
        String str;
        Object obj2;
        com.bytedance.android.livesdkapi.depend.model.live.h hVar;
        String str2;
        com.bytedance.android.livesdkapi.depend.model.live.h hVar2;
        com.bytedance.android.livesdkapi.depend.model.live.h hVar3;
        com.bytedance.android.livesdkapi.depend.model.live.h hVar4;
        com.bytedance.android.livesdkapi.depend.model.live.h hVar5;
        String str3;
        String str4;
        Boolean bool;
        Long l2;
        IMessageManager iMessageManager2;
        if (!this.f22666e) {
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.cw8);
            if (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
                int i2 = Build.VERSION.SDK_INT;
                layoutParams.addRule(20);
                frameLayout.setLayoutParams(layoutParams);
            }
        }
        com.bytedance.android.livesdk.service.c.f.d.a("Load GiftWidget,ToolbarManager load Gift and FastGift behavior");
        this.f22666e = ((Boolean) this.dataChannel.b(cp.class)).booleanValue();
        this.f22665d = (Room) this.dataChannel.b(df.class);
        ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().d();
        ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().h();
        if (this.dataChannel != null) {
            this.dataChannel.a((m) this, com.bytedance.android.live.gift.e.class, (h.f.a.b) new a(this)).a((m) this, com.bytedance.android.live.gift.p.class, (h.f.a.b) new b(this)).a((m) this, com.bytedance.android.livesdk.k.a.a.class, c.f22811a);
        }
        if (!this.f22666e) {
            ((z) com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.gift.d.f.class).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(WidgetExtendsKt.autoDispose(this))).a(new d(this));
        }
        ag agVar = new ag();
        this.f22671j = agVar;
        agVar.f22702c = this.dataChannel;
        this.f22671j.f22703d = p.a(getContext());
        this.f22671j.f22704e = this;
        ag agVar2 = this.f22671j;
        agVar2.f22702c.a(agVar2, com.bytedance.android.livesdk.az.class, agVar2.f22705f);
        v vVar = new v();
        this.f22664c = vVar;
        vVar.f22799a = getContext();
        this.f22664c.f22800b = this.dataChannel;
        v vVar2 = this.f22664c;
        vVar2.f22800b.a(vVar2, be.class, vVar2.f22801c);
        if (LiveGiftDialogUpDownSetting.INSTANCE.getValue() == 1) {
            ay ayVar = new ay();
            this.f22674m = ayVar;
            DataChannel dataChannel = this.dataChannel;
            ayVar.f22763b = dataChannel;
            if (dataChannel != null) {
                iMessageManager2 = (IMessageManager) dataChannel.b(cg.class);
            } else {
                iMessageManager2 = null;
            }
            ayVar.f22762a = iMessageManager2;
            IMessageManager iMessageManager3 = ayVar.f22762a;
            if (iMessageManager3 != null) {
                iMessageManager3.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.GIFT_UPDATE.getIntType(), ayVar);
            }
        }
        com.bytedance.android.livesdk.widgets.giftwidget.b.b bVar = new com.bytedance.android.livesdk.widgets.giftwidget.b.b(this.dataChannel, getAutoUnbindTransformer(), this);
        this.f22672k = bVar;
        bVar.f22769c = this.p;
        com.bytedance.android.livesdk.widgets.giftwidget.b.b bVar2 = this.f22672k;
        bVar2.f22768b = this;
        if (bVar2.f22768b != null) {
            bVar2.f22768b.e();
        }
        az azVar = new az(this.context, this.dataChannel);
        this.f22673l = azVar;
        azVar.f22765b = this;
        if (!(this.dataChannel == null || this.dataChannel.b(ee.class) == null || !((Boolean) this.dataChannel.b(ee.class)).booleanValue())) {
            com.bytedance.android.livesdk.boostcard.d dVar = new com.bytedance.android.livesdk.boostcard.d();
            this.n = dVar;
            dVar.f14225a = this.dataChannel;
            DataChannel dataChannel2 = dVar.f14225a;
            long j3 = 0;
            if (dataChannel2 == null || (l2 = (Long) dataChannel2.b(di.class)) == null) {
                j2 = 0;
            } else {
                j2 = l2.longValue();
            }
            dVar.f14226b = j2;
            DataChannel dataChannel3 = dVar.f14225a;
            if (dataChannel3 != null) {
                room = (Room) dataChannel3.b(df.class);
            } else {
                room = null;
            }
            DataChannel dataChannel4 = dVar.f14225a;
            if (dataChannel4 == null || (bool = (Boolean) dataChannel4.b(ee.class)) == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            String str5 = "";
            if (room != null) {
                com.bytedance.android.livesdkapi.depend.model.live.h hVar6 = room.mBoostCardRoomStatus;
                if (hVar6 == null || !hVar6.f23142a || !z) {
                    com.bytedance.android.livesdkapi.depend.model.live.h hVar7 = room.mBoostCardRoomStatus;
                    if (hVar7 != null && hVar7.f23143b > 0 && z) {
                        if (!(room == null || (hVar5 = room.mBoostCardRoomStatus) == null)) {
                            j3 = hVar5.f23143b;
                        }
                        dVar.f14228d = j3 * 1000;
                        if (room == null || (hVar4 = room.mBoostCardRoomStatus) == null) {
                            obj = str5;
                        } else {
                            obj = Long.valueOf(hVar4.f23144c);
                        }
                        com.bytedance.android.livesdk.boostcard.b.d(obj.toString());
                        if (room == null || (hVar3 = room.mBoostCardRoomStatus) == null || (str = hVar3.f23146e) == null) {
                            str = str5;
                        }
                        com.bytedance.android.livesdk.boostcard.b.b(str);
                        if (room == null || (hVar2 = room.mBoostCardRoomStatus) == null) {
                            obj2 = str5;
                        } else {
                            obj2 = Long.valueOf(hVar2.f23147f);
                        }
                        com.bytedance.android.livesdk.boostcard.b.c(obj2.toString());
                        com.bytedance.android.livesdk.boostcard.b.f14218d = dVar.f14228d;
                        com.bytedance.android.livesdk.boostcard.b.f14222h = true;
                        if (!(room == null || (hVar = room.mBoostCardRoomStatus) == null || (str2 = hVar.f23148g) == null)) {
                            str5 = str2;
                        }
                        com.bytedance.android.livesdk.boostcard.b.a(str5);
                        dVar.f14227c.a(((LiveBoostcardApi) com.bytedance.android.live.network.e.a().a(LiveBoostcardApi.class)).queryUserStatus(dVar.f14226b, false).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d.C0308d(dVar), d.e.f14239a));
                    }
                } else {
                    dVar.f14228d = room.mBoostCardRoomStatus.f23143b * 1000;
                    com.bytedance.android.livesdk.boostcard.b.d(String.valueOf(room.mBoostCardRoomStatus.f23144c));
                    com.bytedance.android.livesdk.boostcard.b.b(room.mBoostCardRoomStatus.f23146e);
                    com.bytedance.android.livesdkapi.depend.model.live.h hVar8 = room.mBoostCardRoomStatus;
                    if (hVar8 == null || (str3 = hVar8.f23148g) == null) {
                        str3 = str5;
                    }
                    dVar.f14235k = str3;
                    com.bytedance.android.livesdkapi.depend.model.live.h hVar9 = room.mBoostCardRoomStatus;
                    if (!(hVar9 == null || (str4 = hVar9.f23148g) == null)) {
                        str5 = str4;
                    }
                    com.bytedance.android.livesdk.boostcard.b.a(str5);
                    com.bytedance.android.livesdk.boostcard.b.c(String.valueOf(room.mBoostCardRoomStatus.f23147f));
                    dVar.f14227c.a(t.b(5, TimeUnit.MILLISECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new d.c(dVar)));
                }
            }
            dVar.f14227c.a(t.b(5, TimeUnit.MILLISECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new d.h(dVar)));
            dVar.f14227c.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.gift.d.b.class).d(new d.i(dVar)));
            dVar.f14227c.a(com.bytedance.android.livesdk.an.a.a().a(k.class).d(new d.j(dVar)));
            DataChannel dataChannel5 = dVar.f14225a;
            if (!(dataChannel5 == null || (iMessageManager = (IMessageManager) dataChannel5.b(cg.class)) == null)) {
                iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.GIFT_BOOST_CARD_MESSAGE.getIntType(), dVar);
            }
            com.bytedance.ies.xbridge.e.b.a("live_boost_use_card", dVar);
        }
        ad adVar = new ad();
        this.t = adVar;
        DataChannel dataChannel6 = this.dataChannel;
        adVar.f22695e = this;
        adVar.f22696f = dataChannel6;
        adVar.f22692b = (Room) adVar.f22696f.b(df.class);
        adVar.f22694d = ((Boolean) adVar.f22696f.b(ee.class)).booleanValue();
        adVar.f22693c = ((Boolean) adVar.f22696f.b(cp.class)).booleanValue();
        IMessageManager iMessageManager4 = (IMessageManager) adVar.f22696f.b(cg.class);
        if (iMessageManager4 != null) {
            iMessageManager4.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.GIFT.getIntType(), adVar);
            iMessageManager4.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.DOODLE_GIFT.getIntType(), adVar);
            iMessageManager4.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.FREE_CELL_GIFT_MESSAGE.getIntType(), adVar);
            iMessageManager4.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.ASSET_MESSAGE.getIntType(), adVar);
            iMessageManager4.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.BINDING_GIFT_MESSAGE.getIntType(), adVar);
            iMessageManager4.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.TRAY_MESSAGE.getIntType(), adVar);
            iMessageManager4.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.GIFT_GLOBAL_MESSAGE.getIntType(), adVar);
        }
        adVar.f22691a.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdkapi.f.a.class).d(new ae(adVar)));
        adVar.f22691a.a(com.bytedance.android.livesdk.an.a.a().a(o.class).d(new af(adVar)));
        ax axVar = new ax();
        this.o = axVar;
        axVar.f22761a = this.dataChannel;
        this.f22670i = new com.bytedance.android.livesdk.toolbar.a.a(this.f22665d, this.dataChannel);
        com.bytedance.android.livesdk.toolbar.a.c cVar = new com.bytedance.android.livesdk.toolbar.a.c(this.dataChannel);
        com.bytedance.android.live.p.l.BROADCAST_GIFT.load(this.dataChannel, this.f22670i);
        com.bytedance.android.live.p.l.DUMMY_BROADCAST_GIFT.load(this.dataChannel, cVar);
        this.r = (FrameLayout) this.containerView.findViewById(R.id.cli);
        this.f22669h.clear();
        enableSubWidgetManager(this.f22669h, g.f12827a);
        this.f22662a = new LiveGiftTrayWidget();
        if (this.dataChannel == null || ((Boolean) this.dataChannel.b(cp.class)).booleanValue()) {
            this.subWidgetManager.load(R.id.cw8, this.f22662a);
        } else {
            this.subWidgetManager.load(R.id.cw9, this.f22662a);
        }
        LiveNewVideoGiftWidget liveNewVideoGiftWidget = new LiveNewVideoGiftWidget();
        this.f22663b = liveNewVideoGiftWidget;
        liveNewVideoGiftWidget.f19842b = this;
        this.subWidgetManager.load(R.id.ffh, (Widget) this.f22663b, false);
        this.subWidgetManager.load(R.id.e7w, new LiveNewSpecialGiftWidget());
        if (LiveGiftGuideSetting.INSTANCE.getValue() != 0 && y.f9119a == 1) {
            this.subWidgetManager.load(new LiveGiftGuideWidget());
        }
        h hVar10 = com.bytedance.android.livesdk.firstrecharge.d.u.f17741i;
        if (hVar10 != null) {
            com.bytedance.android.livesdk.firstrecharge.d.u.f17741i = null;
            b(hVar10);
        }
    }
}
