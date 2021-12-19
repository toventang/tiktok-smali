package com.bytedance.android.livesdk.widgets.giftwidget.b;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.livesdk.ap.c;
import com.bytedance.android.livesdk.at.g;
import com.bytedance.android.livesdk.at.h;
import com.bytedance.android.livesdk.at.j;
import com.bytedance.android.livesdk.bd;
import com.bytedance.android.livesdk.be;
import com.bytedance.android.livesdk.bg;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.e;
import com.bytedance.android.livesdk.gift.model.w;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.dn;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeConfirmThreshold;
import com.bytedance.android.livesdk.livesetting.gift.LiveFreeGiftSendSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveSendGiftEnterFromParamSetting;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.assets.i;
import com.bytedance.android.livesdk.service.assets.j;
import com.bytedance.android.livesdk.service.b.d;
import com.bytedance.android.livesdk.service.network.GiftRetrofitApi;
import com.bytedance.android.livesdk.service.network.PropApi;
import com.bytedance.android.livesdk.u.a;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ag {

    /* renamed from: a  reason: collision with root package name */
    LinkedList<d> f22700a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    boolean f22701b = false;

    /* renamed from: c  reason: collision with root package name */
    public DataChannel f22702c;

    /* renamed from: d  reason: collision with root package name */
    public Activity f22703d;

    /* renamed from: e  reason: collision with root package name */
    public a f22704e;

    /* renamed from: f  reason: collision with root package name */
    public b<d, z> f22705f = new ah(this);

    /* renamed from: g  reason: collision with root package name */
    private d f22706g;

    /* renamed from: h  reason: collision with root package name */
    private g<com.bytedance.android.live.base.model.user.b> f22707h = new g<com.bytedance.android.live.base.model.user.b>() {
        /* class com.bytedance.android.livesdk.widgets.giftwidget.b.ag.AnonymousClass1 */

        static {
            Covode.recordClassIndex(13392);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.android.livesdk.at.g, f.a.z
        public final /* synthetic */ void onNext(com.bytedance.android.live.base.model.user.b bVar) {
            super.onNext(bVar);
            ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().d();
        }
    };

    public interface a {
        static {
            Covode.recordClassIndex(13397);
        }

        void a(Exception exc, d dVar);
    }

    static {
        Covode.recordClassIndex(13391);
    }

    /* access modifiers changed from: package-private */
    public final void a(d dVar, List<e> list) {
        if (dVar.f21287c == 1) {
            if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
                for (e eVar : list) {
                    if (eVar != null && eVar.f17878b == 1) {
                        ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().e(eVar.f17877a.longValue());
                    }
                }
            }
            if (dVar.f21288d) {
                ao.a(y.e(), (int) R.string.e2l);
            } else {
                ao.a(y.e(), (int) R.string.e2e);
            }
            if (com.bytedance.android.livesdk.ap.a.cH.a().intValue() > 0 && com.bytedance.android.livesdk.ap.a.cI.a().booleanValue()) {
                ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).showTurnOnAutoExchangeDialog(this.f22703d, this.f22702c);
                c.a((com.bytedance.android.livesdk.ao.c) com.bytedance.android.livesdk.ap.a.cI, (Object) false);
            }
            com.bytedance.android.livesdk.ap.b<Integer> bVar = com.bytedance.android.livesdk.ap.a.cH;
            c.a(bVar, Integer.valueOf(bVar.a().intValue() + 1));
        }
    }

    private void c() {
        this.f22700a.clear();
        this.f22701b = false;
    }

    private static boolean d() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        c();
        this.f22702c.c(com.bytedance.android.livesdk.d.class);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.ag$4  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f22723a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 13396(0x3454, float:1.8772E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel$a[] r0 = com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.widgets.giftwidget.b.ag.AnonymousClass4.f22723a = r2
                com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel$a r0 = com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel.a.GIFT     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.widgets.giftwidget.b.ag.AnonymousClass4.f22723a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel$a r0 = com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel.a.PROP     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widgets.giftwidget.b.ag.AnonymousClass4.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        boolean z;
        final boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        LinkedList<d> linkedList = this.f22700a;
        if (linkedList != null && !linkedList.isEmpty()) {
            final d pollFirst = this.f22700a.pollFirst();
            if (!j.f107226e || !j.b() || j.c()) {
                z = d();
                j.f107226e = z;
            } else {
                z = j.f107226e;
            }
            if (!z) {
                com.bytedance.android.livesdk.service.c.a.e.a("-1: Network error", pollFirst.f21294j, pollFirst.t);
                com.bytedance.android.livesdk.service.c.a.e.b(pollFirst.r, "8", "network_error", pollFirst.f21294j, pollFirst.t);
                ao.a(this.f22703d, (int) R.string.efp);
                b();
            } else if (!u.a().b().e()) {
                com.bytedance.android.livesdk.at.f b2 = u.a().b();
                Activity activity = this.f22703d;
                j.a a2 = com.bytedance.android.livesdk.at.j.a();
                a2.f14158a = y.a((int) R.string.gw0);
                a2.f14160c = 1001;
                a2.f14162e = "live_detail";
                a2.f14163f = "gift_send";
                a2.f14161d = "enableGift";
                b2.a(activity, a2.a()).b(this.f22707h);
                b();
                com.bytedance.android.livesdk.service.c.a.e.a("-2: Not login error", pollFirst.f21294j, pollFirst.t);
                com.bytedance.android.livesdk.service.c.a.e.b(pollFirst.r, "2", "unlogin", pollFirst.f21294j, pollFirst.t);
            } else if (u.a().b().a(h.GIFT)) {
                b();
                com.bytedance.android.livesdk.service.c.a.e.a("-3: User center error", pollFirst.f21294j, pollFirst.t);
                com.bytedance.android.livesdk.service.c.a.e.b(pollFirst.r, "9", "intercept", pollFirst.f21294j, pollFirst.t);
            } else if (((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).isNeedProtectMinor()) {
                ao.a(y.e(), (int) R.string.gte);
                b();
                com.bytedance.android.livesdk.service.c.a.e.a("-6: Restrict mode error", pollFirst.f21294j, pollFirst.t);
                com.bytedance.android.livesdk.service.c.a.e.b(pollFirst.r, "1", "forbidden", pollFirst.f21294j, pollFirst.t);
            } else {
                int i3 = pollFirst.f21290f;
                if (pollFirst.f21285a != GiftDialogViewModel.a.PROP) {
                    long j2 = (long) i3;
                    if (!((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().b(j2)) {
                        final long b3 = j2 - ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().b();
                        if (i3 > LiveExchangeConfirmThreshold.INSTANCE.getValue()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (com.bytedance.android.livesdk.ap.a.cF.a().intValue() < 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        final boolean g2 = ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().g();
                        BalanceStruct e2 = ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().e();
                        final com.bytedance.android.live.wallet.model.g f2 = ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().f();
                        final RevenueExchange revenueExchange = f2.f13234c;
                        if (revenueExchange == null || !revenueExchange.getEnableExchange() || revenueExchange.getBalance() <= 0 || f2.f13235d == null || f2.f13235d.getBasePackage() == null) {
                            if (e2.getExchangeInfo() != null && b3 <= e2.getExchangeInfo().getMaxCoins() && e2.getValidUser() && (z3 || g2)) {
                                pollFirst.f21289e = ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().b();
                                if ((!z2 || !g2) && (!z3 || g2)) {
                                    pollFirst.f21287c = 1;
                                } else {
                                    aw.a(this.f22702c, a(Boolean.valueOf(z2)), pollFirst.f21286b);
                                    IWalletService iWalletService = (IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class);
                                    Activity activity2 = this.f22703d;
                                    AnonymousClass3 r17 = new com.bytedance.android.live.wallet.a() {
                                        /* class com.bytedance.android.livesdk.widgets.giftwidget.b.ag.AnonymousClass3 */

                                        /* renamed from: a  reason: collision with root package name */
                                        boolean f22717a = true;

                                        static {
                                            Covode.recordClassIndex(13395);
                                        }

                                        @Override // com.bytedance.android.live.wallet.a
                                        public final void b() {
                                            aw.c(ag.this.f22702c, ag.a(Boolean.valueOf(z2)), pollFirst.f21286b);
                                            if (!g2) {
                                                com.bytedance.android.livesdk.ap.b<Integer> bVar = com.bytedance.android.livesdk.ap.a.cF;
                                                c.a(bVar, Integer.valueOf(bVar.a().intValue() + 1));
                                            }
                                            if (!((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).isLocalTest() || !LiveFreeGiftSendSetting.INSTANCE.getValue()) {
                                                ag agVar = ag.this;
                                                d dVar = pollFirst;
                                                agVar.a(dVar, dVar.f21290f);
                                                return;
                                            }
                                            ag.this.b(pollFirst);
                                        }

                                        @Override // com.bytedance.android.live.wallet.a
                                        public final void a() {
                                            aw.b(ag.this.f22702c, ag.a(Boolean.valueOf(z2)), pollFirst.f21286b);
                                            if (!this.f22717a) {
                                                ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().a("not_auto_exchange");
                                            }
                                            if (!z2 || !g2) {
                                                pollFirst.f21287c = 1;
                                                if (!this.f22717a) {
                                                    pollFirst.f21288d = true;
                                                }
                                                ag.this.b(pollFirst);
                                                return;
                                            }
                                            aw.a(ag.this.f22702c, "over_threshold_two", pollFirst.f21286b);
                                            b.a aVar = new b.a(ag.this.f22703d);
                                            aVar.f18296m = false;
                                            b.a a2 = aVar.a(R.string.e2p);
                                            a2.f18285b = y.a((int) R.string.e22, ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().c(b3));
                                            a2.b(R.string.e20, (DialogInterface.OnClickListener) new ar(this, pollFirst), false).a(R.string.e2m, (DialogInterface.OnClickListener) new as(this, pollFirst), false).a().show();
                                        }

                                        @Override // com.bytedance.android.live.wallet.a
                                        public final void a(Boolean bool) {
                                            this.f22717a = !bool.booleanValue();
                                        }
                                    };
                                    String a3 = y.a((int) R.string.e2c, Long.valueOf(b3), ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().c(b3), Long.valueOf(b3));
                                    if (com.bytedance.android.livesdk.ap.a.cH.a().intValue() <= 1 || g2) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    iWalletService.showExchangeConfirmDialog(activity2, r17, new com.bytedance.android.live.wallet.b(R.string.e2d, a3, R.string.e2a, R.string.e2_, R.string.e2b, z4));
                                    return;
                                }
                            } else if (!((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).isLocalTest() || !LiveFreeGiftSendSetting.INSTANCE.getValue()) {
                                a(pollFirst, pollFirst.f21290f);
                                return;
                            }
                        } else if (b3 > f2.f13235d.getMaxCoins() || com.bytedance.android.livesdk.ap.a.cG.a().intValue() >= 2) {
                            a(pollFirst, pollFirst.f21290f);
                            return;
                        } else {
                            aw.a(this.f22702c, pollFirst.f21286b);
                            IWalletService iWalletService2 = (IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class);
                            Activity activity3 = this.f22703d;
                            AnonymousClass2 r172 = new com.bytedance.android.live.wallet.a() {
                                /* class com.bytedance.android.livesdk.widgets.giftwidget.b.ag.AnonymousClass2 */

                                static {
                                    Covode.recordClassIndex(13393);
                                }

                                @Override // com.bytedance.android.live.wallet.a
                                public final void a(Boolean bool) {
                                }

                                @Override // com.bytedance.android.live.wallet.a
                                public final void a() {
                                    int i2;
                                    aw.b(ag.this.f22702c, pollFirst.f21286b);
                                    aw.a(ag.this.f22702c, pollFirst.f21286b);
                                    b.a aVar = new b.a(ag.this.f22703d);
                                    aVar.f18296m = false;
                                    b.a a2 = aVar.a(R.string.e2p);
                                    if (revenueExchange.isRevenue()) {
                                        i2 = R.string.e4h;
                                    } else {
                                        i2 = R.string.e4b;
                                    }
                                    a2.f18285b = y.a(i2, ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().d(b3));
                                    a2.b(R.string.e20, (DialogInterface.OnClickListener) new ap(this, pollFirst), false).a(R.string.e2m, (DialogInterface.OnClickListener) new aq(this, f2, pollFirst, revenueExchange, b3), false).a().show();
                                }

                                @Override // com.bytedance.android.live.wallet.a
                                public final void b() {
                                    aw.c(ag.this.f22702c, pollFirst.f21286b);
                                    com.bytedance.android.livesdk.ap.b<Integer> bVar = com.bytedance.android.livesdk.ap.a.cG;
                                    c.a(bVar, Integer.valueOf(bVar.a().intValue() + 1));
                                    if (!((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).isLocalTest() || !LiveFreeGiftSendSetting.INSTANCE.getValue()) {
                                        ag agVar = ag.this;
                                        d dVar = pollFirst;
                                        agVar.a(dVar, dVar.f21290f);
                                        return;
                                    }
                                    ag.this.b(pollFirst);
                                }
                            };
                            if (revenueExchange.isRevenue()) {
                                i2 = R.string.e4h;
                            } else {
                                i2 = R.string.e4g;
                            }
                            iWalletService2.showExchangeConfirmDialog(activity3, r172, new com.bytedance.android.live.wallet.b(i2, y.a((int) R.string.e2c, Long.valueOf(b3), ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().d(b3), Long.valueOf(b3)), R.string.e2a, R.string.e2_, 0, false));
                            return;
                        }
                    }
                }
                b(pollFirst);
            }
        }
    }

    public static String a(Boolean bool) {
        if (bool.booleanValue()) {
            return "over_threshold_one";
        }
        if (com.bytedance.android.livesdk.ap.a.cH.a().intValue() > 1) {
            return "not_auto";
        }
        return "first_two_times";
    }

    private static String a(String str) {
        if (TextUtils.equals(str, "wishlist")) {
            return "wishlist";
        }
        if (TextUtils.equals(str, "convenient_gift")) {
            return "shortcut_gift";
        }
        return "gift";
    }

    public final void b(d dVar) {
        int i2 = AnonymousClass4.f22723a[dVar.f21285a.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                a(dVar.f21286b, dVar.f21291g, dVar);
            }
        } else if (!dVar.s) {
            a(dVar);
        } else if (com.bytedance.android.livesdk.r.j.a(dVar.f21286b)) {
            com.bytedance.android.livesdk.r.j.a((androidx.appcompat.app.d) this.f22703d, new ao(this, dVar));
        } else {
            DataChannel dataChannel = this.f22702c;
            if (dataChannel != null) {
                dataChannel.c(com.bytedance.android.livesdk.h.class, true);
            }
            a(dVar);
        }
    }

    private void b(w wVar) {
        if (wVar.n != null && !wVar.n.isEmpty()) {
            com.bytedance.android.livesdk.service.assets.j a2 = com.bytedance.android.livesdk.service.assets.j.a();
            List<Prop> list = wVar.n;
            if (!list.isEmpty()) {
                for (Prop prop : list) {
                    Prop a3 = a2.a(prop.id);
                    if (a3 != null) {
                        a2.f21271a.set(a2.f21271a.indexOf(a3), prop);
                    }
                }
                for (j.a aVar : a2.f21272b) {
                    aVar.b(a2.f21271a);
                }
            }
        }
        u.a().b().f();
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            IMessageManager iMessageManager = (IMessageManager) this.f22702c.b(cg.class);
            User user = (User) this.f22702c.b(dn.class);
            if (user != null) {
                List<com.bytedance.android.livesdk.model.message.y> b2 = i.b(room.getId(), wVar, this.f22706g.f21293i, user);
                if (iMessageManager == null) {
                    return;
                }
                if (com.bytedance.common.utility.h.a(b2)) {
                    iMessageManager.insertMessage(i.a(room.getId(), wVar, this.f22706g.f21293i, user));
                    return;
                }
                for (com.bytedance.android.livesdk.model.message.y yVar : b2) {
                    iMessageManager.insertMessage(yVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(w wVar) {
        ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().a(wVar.f17952d);
        if (wVar.f17960l > 0) {
            wVar.q = com.bytedance.android.livesdk.service.assets.j.a().a(wVar.f17960l);
            if (wVar.q != null) {
                wVar.f17954f = wVar.q.gift.f19761d;
                if (!com.bytedance.common.utility.h.a(wVar.n)) {
                    Iterator<Prop> it = wVar.n.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().id == wVar.f17960l) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                Prop newInstance = Prop.newInstance(wVar.q);
                newInstance.count -= wVar.f17955g;
                if (wVar.n == null) {
                    wVar.n = new ArrayList();
                }
                wVar.n.add(newInstance);
            }
        } else {
            long j2 = wVar.f17954f;
            SharedPreferences.Editor edit = com.ss.android.ugc.aweme.bf.d.a(this.f22703d, "gift_dialog_storage", 0).edit();
            edit.putLong("default_dialog_item", j2);
            edit.commit();
            if (this.f22706g.n != -1) {
                Activity activity = this.f22703d;
                int i2 = this.f22706g.n;
                SharedPreferences.Editor edit2 = com.ss.android.ugc.aweme.bf.d.a(activity, "gift_dialog_storage", 0).edit();
                edit2.putInt("sp_gift_page_type", i2);
                edit2.commit();
            }
        }
        if (this.f22706g.f21292h) {
            this.f22702c.c(com.bytedance.android.live.gift.e.class, false);
        }
        b(wVar);
        com.bytedance.android.livesdk.model.u findGiftById = GiftManager.inst().findGiftById(wVar.f17954f);
        if (findGiftById != null && findGiftById.a() && !com.bytedance.android.livesdk.service.c.a.e.f21319i.f21322a) {
            this.f22702c.c(bg.class, this.f22706g);
            com.bytedance.android.livesdk.service.c.a.e.f21319i.f21322a = true;
        }
        a();
    }

    /* access modifiers changed from: package-private */
    public final void a(d dVar) {
        int i2;
        String str;
        if (GiftManager.inst().findGiftById(dVar.f21286b) == null) {
            b();
            return;
        }
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room == null) {
            b();
            com.bytedance.android.livesdk.service.c.a.e.a("-4: Room info error", dVar.f21294j, dVar.t);
            com.bytedance.android.livesdk.service.c.a.e.b(dVar.r, "7", "room", dVar.f21294j, dVar.t);
            return;
        }
        this.f22706g = dVar;
        this.f22701b = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        a.EnumC0481a b2 = com.bytedance.android.livesdk.u.a.b();
        if (b2 == a.EnumC0481a.LINK_MIC_GUEST) {
            i2 = 2;
        } else if (b2 == a.EnumC0481a.LINK_MIC_PK) {
            i2 = 4;
        } else {
            i2 = 1;
        }
        if (LiveSendGiftEnterFromParamSetting.INSTANCE.getValue()) {
            str = com.bytedance.android.livesdk.ab.e.a() + "-" + com.bytedance.android.livesdk.ab.e.d();
        } else {
            str = "";
        }
        long a2 = com.bytedance.android.livesdk.utils.a.a.a();
        ((GiftRetrofitApi) com.bytedance.android.live.network.e.a().a(GiftRetrofitApi.class)).sendAddType(dVar.f21286b, room.getId(), dVar.f21293i.getId(), dVar.f21291g, i2, 3, str, com.bytedance.android.livesdk.utils.a.a.a(), dVar.f21287c).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new al(this, dVar, room, a2, uptimeMillis), new am(this, dVar, room, a2), new an(this));
    }

    public final void a(d dVar, int i2) {
        ao.a(y.e(), (int) R.string.e43);
        a(dVar, i2, false);
    }

    private void a(long j2, int i2, d dVar) {
        Prop a2 = com.bytedance.android.livesdk.service.assets.j.a().a(j2);
        if (a2 != null) {
            if (a2.count <= 0) {
                ao.a(y.e(), (int) R.string.gtd);
                b();
                return;
            }
            Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
            if (room != null) {
                this.f22706g = dVar;
                ((PropApi) com.bytedance.android.live.network.e.a().a(PropApi.class)).sendProp(j2, room.getId(), i2, dVar.f21293i.getId(), a2.isAwemeFreeGift).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new ai(this, room, j2, SystemClock.uptimeMillis(), dVar), new aj(this, j2, room), new ak(this));
            }
        }
    }

    public final void a(d dVar, int i2, boolean z) {
        String a2;
        long b2 = ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().b();
        DataChannel dataChannel = this.f22702c;
        if (z) {
            a2 = "anchor_income";
        } else {
            a2 = a(dVar.f21294j);
        }
        dataChannel.c(be.class, new bd(a2, ((long) i2) - b2, "normal", dVar.f21294j));
        b();
        com.bytedance.android.livesdk.service.c.a.e.a("-7: Balance error", dVar.f21294j, dVar.t);
        com.bytedance.android.livesdk.service.c.a.e.b(dVar.r, "3", "money", dVar.f21294j, dVar.t);
    }
}
