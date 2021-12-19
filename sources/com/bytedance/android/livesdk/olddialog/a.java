package com.bytedance.android.livesdk.olddialog;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.gift.e;
import com.bytedance.android.live.u.h;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.j.aq;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeStyleSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveEnableRechargeSucceedAnimationSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.olddialog.b.a;
import com.bytedance.android.livesdk.olddialog.b.b;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdk.olddialog.widget.LiveNewFirstRechargeWidget;
import com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftBottomWidget;
import com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftGuestInfoWidget;
import com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftPageIndicatorWidget;
import com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftPanelWidget;
import com.bytedance.android.livesdk.service.a.a;
import com.bytedance.android.livesdk.service.a.b;
import com.bytedance.android.livesdk.service.a.c;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.assets.j;
import com.bytedance.android.livesdk.service.c.a.a;
import com.bytedance.android.livesdk.service.c.a.f;
import com.bytedance.android.livesdk.service.d;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a extends v implements com.bytedance.android.livesdk.dialogv2.a, a.AbstractC0406a, j.a {

    /* renamed from: a  reason: collision with root package name */
    LiveNewGiftPanelWidget f19995a;

    /* renamed from: b  reason: collision with root package name */
    LiveNewGiftBottomWidget f19996b;

    /* renamed from: c  reason: collision with root package name */
    b f19997c;

    /* renamed from: d  reason: collision with root package name */
    String f19998d;

    /* renamed from: e  reason: collision with root package name */
    int f19999e;

    /* renamed from: f  reason: collision with root package name */
    private Room f20000f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f20001g;

    /* renamed from: h  reason: collision with root package name */
    private GiftDialogViewModel.b f20002h;

    /* renamed from: i  reason: collision with root package name */
    private com.bytedance.android.livesdk.olddialog.viewmodel.a f20003i;

    /* renamed from: j  reason: collision with root package name */
    private com.bytedance.android.livesdk.olddialog.b.a f20004j;

    /* renamed from: k  reason: collision with root package name */
    private String f20005k;

    /* renamed from: l  reason: collision with root package name */
    private long f20006l;

    /* renamed from: m  reason: collision with root package name */
    private Runnable f20007m;
    private final List<GiftPage> n = new ArrayList();
    private final f.a.b.a t = new f.a.b.a();
    private final WidgetCreateTimeUtil u = new WidgetCreateTimeUtil();

    static {
        Covode.recordClassIndex(11816);
    }

    @Override // com.bytedance.android.livesdk.v
    public final ak.a c_() {
        return ak.a.PANEL_GIFT;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        f.a(SystemClock.uptimeMillis() - this.f20006l);
    }

    @Override // com.bytedance.android.livesdk.dialogv2.a
    public final void d() {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f19995a;
        liveNewGiftPanelWidget.f20139m = false;
        liveNewGiftPanelWidget.f20137k = false;
        a(GiftManager.inst().getGiftPageList());
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void dismiss() {
        if (this.p != null) {
            this.p.c(e.class, false);
        }
        f.a.b.a aVar = this.t;
        if (aVar != null) {
            aVar.a();
        }
        super.dismiss();
    }

    @Override // com.bytedance.android.livesdk.olddialog.b.a.AbstractC0406a
    public final void e() {
        com.bytedance.android.livesdk.an.a.a().a(new d());
        getView().findViewById(R.id.bb3).setVisibility(8);
    }

    @Override // com.bytedance.android.livesdk.v
    public final boolean i() {
        if (this.p != null) {
            this.p.c(e.class, false);
        }
        return super.i();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (this.p != null) {
            this.p.b(com.bytedance.android.live.gift.f.class, (Object) false);
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        int i2;
        int i3;
        int i4;
        IMessageManager iMessageManager;
        if (this.p != null) {
            boolean booleanValue = ((Boolean) this.p.b(cp.class)).booleanValue();
            com.bytedance.android.livesdk.olddialog.b.a aVar = this.f20004j;
            DataChannel dataChannel = this.p;
            aVar.f20012c = dataChannel;
            if (dataChannel != null) {
                iMessageManager = (IMessageManager) dataChannel.b(cg.class);
            } else {
                iMessageManager = null;
            }
            aVar.f20011b = iMessageManager;
            IMessageManager iMessageManager2 = aVar.f20011b;
            if (iMessageManager2 != null) {
                iMessageManager2.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.GIFT_UPDATE.getIntType(), aVar);
            }
            if (!booleanValue) {
                i2 = R.layout.b6p;
                i4 = R.style.a30;
                i3 = 5;
                v.b bVar = new v.b(i2);
                bVar.f22375b = i4;
                bVar.f22385l = 48;
                bVar.f22380g = i3;
                return bVar;
            }
        }
        i2 = R.layout.b6o;
        i4 = R.style.a2z;
        i3 = 80;
        v.b bVar2 = new v.b(i2);
        bVar2.f22375b = i4;
        bVar2.f22385l = 48;
        bVar2.f22380g = i3;
        return bVar2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        IMessageManager iMessageManager;
        super.onDestroy();
        a.C0452a.C0453a.f21303a.a();
        j a2 = j.a();
        if (a2.f21272b.contains(this)) {
            a2.f21272b.remove(this);
        }
        com.bytedance.android.livesdk.olddialog.viewmodel.a aVar = this.f20003i;
        if (!(aVar == null || aVar.f20097c == null || this.f20003i.f20098d == null || this.f20003i.f20099e == null)) {
            com.bytedance.android.livesdk.olddialog.b.a aVar2 = this.f20004j;
            if (!(aVar2 == null || (iMessageManager = aVar2.f20011b) == null)) {
                iMessageManager.removeMessageListener(aVar2);
            }
            this.u.send();
            this.f20003i.f20097c.removeObservers(this);
            this.f20003i.f20098d.removeObservers(this);
            this.f20003i.f20099e.removeObservers(this);
            int intValue = this.f20003i.f20096b.getValue().intValue();
            for (int i2 = 0; i2 < this.n.size(); i2++) {
                if (this.n.get(i2).pageType == intValue) {
                    com.bytedance.android.livesdk.service.c.a.e eVar = com.bytedance.android.livesdk.service.c.a.e.f21319i;
                    GiftPage giftPage = this.n.get(i2);
                    l.d(giftPage, "");
                    b.a.a("tab_leave").a().a("gift_dialog_request_id", c.f21167a).a("live", giftPage.pageName).a("tab_position", i2 + 1).a("stay_duration", (com.bytedance.android.livesdk.utils.a.a.a() - eVar.f21327f) / 1000).b();
                    return;
                }
            }
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onStart() {
        boolean z;
        super.onStart();
        if (this.p != null) {
            boolean booleanValue = ((Boolean) this.p.b(cp.class)).booleanValue();
            if (!booleanValue || (!this.f20001g && !com.bytedance.android.live.core.f.d.a(getContext()))) {
                z = false;
            } else {
                z = true;
            }
            Window window = getDialog().getWindow();
            if (window != null) {
                if (!booleanValue || (!this.f20001g && !com.bytedance.android.live.core.f.d.a(getContext()))) {
                    window.addFlags(1024);
                } else {
                    window.clearFlags(1024);
                }
                if (z) {
                    window.setLayout(-1, -2);
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.width = y.c();
                    attributes.height = y.b() - y.d();
                    window.setAttributes(attributes);
                } else if (booleanValue) {
                    window.setLayout(-1, -1);
                } else {
                    window.setLayout(y.d(R.dimen.wl), -1);
                }
            }
            if (this.f20007m != null) {
                new Handler(Looper.getMainLooper()).postDelayed(this.f20007m, 10);
            }
            this.p.b(com.bytedance.android.live.gift.f.class, (Object) true);
        }
    }

    public final void a(List<GiftPage> list) {
        this.n.clear();
        boolean z = false;
        for (GiftPage giftPage : list) {
            if (this.f20003i.f20096b.getValue().intValue() == giftPage.pageType) {
                z = true;
            }
            this.n.add(giftPage);
        }
        if (!z) {
            this.f20003i.f20096b.setValue(1);
        }
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f19995a;
        if (liveNewGiftPanelWidget != null) {
            liveNewGiftPanelWidget.a(this.n);
        }
        LiveNewGiftBottomWidget liveNewGiftBottomWidget = this.f19996b;
        if (liveNewGiftBottomWidget != null) {
            liveNewGiftBottomWidget.a(this.n);
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        b.a.C0448a.f21165a.f21164a = true;
        com.bytedance.android.livesdk.firstrecharge.d.u.o = this.f19998d;
        this.f20006l = SystemClock.uptimeMillis();
        com.bytedance.android.livesdk.service.c.c.c.a();
        String str2 = "";
        if (this.p == null || this.p.b(aq.class) == null) {
            str = str2;
        } else {
            str2 = ((Hashtag) this.p.b(aq.class)).title;
            str = String.valueOf(((Hashtag) this.p.b(aq.class)).id);
        }
        f.a(this.f19998d, y.f(), str2, str);
        a.C0445a.C0446a.f21161a.f21160a = true;
    }

    @Override // com.bytedance.android.livesdk.service.assets.j.a
    public final void b(List<Prop> list) {
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = this.f19995a;
        liveNewGiftPanelWidget.f20131e.clear();
        liveNewGiftPanelWidget.f20131e.addAll(list);
        if (!(liveNewGiftPanelWidget.f20133g == null || liveNewGiftPanelWidget.f20133g.f20096b == null || liveNewGiftPanelWidget.f20133g.f20096b.getValue() == null || liveNewGiftPanelWidget.f20133g == null || liveNewGiftPanelWidget.f20133g.f20096b.getValue().intValue() != 5)) {
            liveNewGiftPanelWidget.b(list);
        }
        if (!(list == null || list.isEmpty() || list.get(0).banner == null)) {
            this.f20005k = list.get(0).banner.f19076f;
        }
        LiveNewGiftBottomWidget liveNewGiftBottomWidget = this.f19996b;
        String str = this.f20005k;
        if (str == null || !(liveNewGiftBottomWidget.f20105b == null || liveNewGiftBottomWidget.f20105b.f20096b == null || liveNewGiftBottomWidget.f20105b.f20096b.getValue() == null || liveNewGiftBottomWidget.f20105b.f20096b.getValue().intValue() == 5)) {
            liveNewGiftBottomWidget.f20106c.setVisibility(8);
        } else {
            liveNewGiftBottomWidget.f20106c.setVisibility(0);
        }
        liveNewGiftBottomWidget.f20107d = str;
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long j2;
        super.onViewCreated(view, bundle);
        c.a();
        if (this.p != null) {
            this.f20000f = (Room) this.p.b(df.class);
            this.f20001g = ((Boolean) this.p.b(ee.class)).booleanValue();
        }
        View view2 = getView();
        if (view2 != null) {
            view2.findViewById(R.id.cug).setOnClickListener(new g(this));
        }
        View view3 = getView();
        if (!(view3 == null || getContext() == null || this.p == null)) {
            WidgetManager of = WidgetManager.of(this, view3, h.f12831c);
            of.mWidgetCreateTimeListener = this.u;
            boolean booleanValue = ((Boolean) this.p.b(cp.class)).booleanValue();
            LiveNewGiftPanelWidget liveNewGiftPanelWidget = new LiveNewGiftPanelWidget();
            this.f19995a = liveNewGiftPanelWidget;
            liveNewGiftPanelWidget.f20133g = this.f20003i;
            this.f19995a.f20129c = this.f20002h;
            this.f19995a.f20134h = booleanValue;
            this.f19995a.f20136j = this.f19998d;
            long j3 = 0;
            if (this.f20003i.f20101g.getValue() != null) {
                j2 = this.f20003i.f20101g.getValue().longValue();
            } else {
                j2 = 0;
            }
            long a2 = com.bytedance.android.livesdk.olddialog.a.a.a(getContext(), "default_dialog_item");
            if (j2 == 0) {
                j2 = a2;
            }
            this.f19995a.f20135i = j2;
            ((ViewGroup) getView().findViewById(R.id.alj)).setClipChildren(!booleanValue);
            of.load(R.id.cuh, this.f19995a, false);
            LiveNewGiftPageIndicatorWidget liveNewGiftPageIndicatorWidget = new LiveNewGiftPageIndicatorWidget();
            liveNewGiftPageIndicatorWidget.f20122b = this.f20003i;
            of.load(R.id.d1f, liveNewGiftPageIndicatorWidget);
            LiveNewGiftBottomWidget liveNewGiftBottomWidget = new LiveNewGiftBottomWidget();
            this.f19996b = liveNewGiftBottomWidget;
            liveNewGiftBottomWidget.f20105b = this.f20003i;
            this.f19996b.f20108e = this.f19998d;
            of.load(R.id.cue, this.f19996b, false);
            a(GiftManager.inst().getGiftPageList());
            if (booleanValue && this.f20002h == GiftDialogViewModel.b.GUEST) {
                LiveNewGiftGuestInfoWidget liveNewGiftGuestInfoWidget = new LiveNewGiftGuestInfoWidget();
                liveNewGiftGuestInfoWidget.f20120a = this.f20003i;
                of.load(R.id.bb6, liveNewGiftGuestInfoWidget);
                getView().findViewById(R.id.bb6).setVisibility(0);
            }
            if (LiveFirstRechargeStyleSetting.INSTANCE.getValue() && com.bytedance.android.livesdk.firstrecharge.d.u.d() && !com.bytedance.android.livesdk.firstrecharge.d.u.e()) {
                com.bytedance.android.livesdk.firstrecharge.e.a();
                of.load(R.id.bb3, new LiveNewFirstRechargeWidget());
                getView().findViewById(R.id.bb3).setVisibility(0);
            }
            AnonymousClass1 r6 = new com.bytedance.android.livesdk.gift.e.b() {
                /* class com.bytedance.android.livesdk.olddialog.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(11817);
                }

                @Override // com.bytedance.android.livesdk.gift.e.b
                public final void a(List<u> list) {
                }

                @Override // com.bytedance.android.livesdk.gift.e.b
                public final void b(List<GiftPage> list) {
                    a.this.a(list);
                }
            };
            GiftManager inst = GiftManager.inst();
            Room room = this.f20000f;
            if (room != null) {
                j3 = room.getId();
            }
            inst.syncGiftList(r6, j3, 3, this.f20001g);
            j a3 = j.a();
            if (!a3.f21272b.contains(this)) {
                a3.f21272b.add(this);
            }
            if (this.f20000f != null) {
                j.a().b(this.f20000f.getId());
            }
        }
        this.f20003i.f20097c.observe(this, new b(this));
        this.f20003i.f20098d.observe(this, new c(this));
        this.f20003i.f20099e.observe(this, new d(this));
        if (this.p != null) {
            this.p.c(e.class, true);
            this.p.a((m) this, e.class, (h.f.a.b) new e(this));
        }
        if (LiveEnableRechargeSucceedAnimationSetting.INSTANCE.enable()) {
            this.t.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.wallet.d.class).d(new f(this)));
        }
        this.f19997c.f20015a = getContext();
    }

    public static a a(Room room, User user, com.bytedance.android.livesdk.gift.g.a.a aVar, String str, Runnable runnable, long j2) {
        a aVar2 = new a();
        if (user == null || user.getId() == room.getOwnerUserId()) {
            aVar2.f20002h = GiftDialogViewModel.b.ANCHOR;
        } else {
            aVar2.f20002h = GiftDialogViewModel.b.GUEST;
        }
        aVar2.f20000f = room;
        if (com.bytedance.android.livesdk.guide.c.f18109a && "icon".equals(str)) {
            str = "gift_guide_bubble";
        }
        aVar2.f19998d = str;
        aVar2.f19997c = new com.bytedance.android.livesdk.olddialog.b.b();
        com.bytedance.android.livesdk.olddialog.b.a aVar3 = new com.bytedance.android.livesdk.olddialog.b.a();
        aVar2.f20004j = aVar3;
        l.d(aVar2, "");
        aVar3.f20010a = aVar2;
        aVar2.f20004j.f20013d = str;
        aVar2.f19997c.f20016b = user;
        aVar2.f20003i = new com.bytedance.android.livesdk.olddialog.viewmodel.a();
        if (com.bytedance.android.livesdk.gift.g.a.a.DEFAULT != aVar) {
            aVar2.f20003i.f20096b.setValue(Integer.valueOf(aVar.value));
        } else {
            aVar2.f20003i.f20096b.setValue(Integer.valueOf(com.bytedance.android.livesdk.olddialog.a.a.a(y.e(), "sp_gift_page_type", 1)));
        }
        if (str.equals("gift_panel") && GiftManager.inst().getTabByGiftId(j2) != -1) {
            aVar2.f20003i.f20096b.setValue(Integer.valueOf(GiftManager.inst().getTabByGiftId(j2)));
        }
        aVar2.f20003i.f20101g.setValue(Long.valueOf(j2));
        aVar2.f20003i.f20095a = user;
        aVar2.f20007m = runnable;
        return aVar2;
    }
}
