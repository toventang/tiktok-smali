package com.bytedance.android.livesdk;

import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.d.c;
import com.bytedance.android.live.base.model.RoomStatus;
import com.bytedance.android.live.core.f.j;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.performance.b;
import com.bytedance.android.live.n.k;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.f;
import com.bytedance.android.livesdk.ai.c;
import com.bytedance.android.livesdk.aj.l;
import com.bytedance.android.livesdk.chatroom.LiveOntologyInfoManager$$Lambda$0;
import com.bytedance.android.livesdk.chatroom.api.PortalApi;
import com.bytedance.android.livesdk.chatroom.d;
import com.bytedance.android.livesdk.chatroom.detail.r;
import com.bytedance.android.livesdk.chatroom.ui.a.b;
import com.bytedance.android.livesdk.chatroom.ui.br;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.list.MultiPlusFeedRoomListProvider;
import com.bytedance.android.livesdk.list.MultiRoomIdListProvider;
import com.bytedance.android.livesdk.liveroom.NetworkController;
import com.bytedance.android.livesdk.liveroom.RoomListener;
import com.bytedance.android.livesdk.liveroom.RoomStatusController;
import com.bytedance.android.livesdk.liveroom.RoomTaskController;
import com.bytedance.android.livesdk.livesetting.other.LiveFeedPreloadSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableALogSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayFluencyOptSettingV2;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableSlideEnterRoomOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawPreEnterRoom;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMtRoomSlideUpGuideSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.MtPlayerInvokeStopBeforePlaySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveMultiPlayerEnableSetting;
import com.bytedance.android.livesdk.model.p;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.util.c;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.watch.chatroom.StackContext;
import com.bytedance.android.livesdk.widget.LiveVerticalViewPager;
import com.bytedance.android.livesdkapi.depend.d.d;
import com.bytedance.android.livesdkapi.depend.d.h;
import com.bytedance.android.livesdkapi.depend.d.i;
import com.bytedance.android.livesdkapi.depend.d.m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.g;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.android.message.IMessageService;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public class ab extends com.bytedance.android.livesdk.ui.a implements b.AbstractC0329b, h, i.a, i.b, com.bytedance.android.livesdkapi.view.b {

    /* renamed from: a  reason: collision with root package name */
    public static f f13391a;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f13392f = true;
    private boolean A = false;
    private l B;
    private final d C = new ac(this);
    private boolean D = false;

    /* renamed from: b  reason: collision with root package name */
    public RoomStatusController f13393b;

    /* renamed from: c  reason: collision with root package name */
    RoomListener f13394c;

    /* renamed from: d  reason: collision with root package name */
    ViewGroup f13395d;

    /* renamed from: e  reason: collision with root package name */
    com.bytedance.android.livesdk.chatroom.backroom.c.b f13396e;

    /* renamed from: g  reason: collision with root package name */
    LiveVerticalViewPager f13397g;

    /* renamed from: h  reason: collision with root package name */
    FrameLayout f13398h;

    /* renamed from: i  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.g.h f13399i;

    /* renamed from: j  reason: collision with root package name */
    public com.bytedance.android.livesdk.live.a f13400j;

    /* renamed from: k  reason: collision with root package name */
    Runnable f13401k;

    /* renamed from: l  reason: collision with root package name */
    public a f13402l;

    /* renamed from: m  reason: collision with root package name */
    k f13403m;
    g n;
    public final boolean o = EnableSlideEnterRoomOptSetting.INSTANCE.getValue();
    long p = 0;
    String q;
    public boolean r = LiveMultiPlayerEnableSetting.INSTANCE.getValue();
    private NetworkController s;
    private RoomTaskController t;
    private boolean u;
    private long v = -1;
    private boolean w;
    private b x;
    private boolean y;
    private f.a.b.a z = new f.a.b.a();

    @Override // com.bytedance.android.livesdkapi.depend.d.h
    public final Fragment b() {
        return this;
    }

    static class b implements LiveVerticalViewPager.f {
        static {
            Covode.recordClassIndex(7465);
        }

        private b() {
        }

        @Override // com.bytedance.android.livesdk.widget.LiveVerticalViewPager.f
        public final boolean a() {
            return ((com.bytedance.android.livesdk.survey.a) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.survey.a.class)).tryShowHoldingSurveyFromSlide();
        }

        /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.h
    public final com.bytedance.android.livesdkapi.depend.d.l d() {
        return this.f13394c.getRoomAction();
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.h
    public final m e() {
        return this.f13394c.getRoomEventListener();
    }

    static {
        Covode.recordClassIndex(7460);
    }

    static String q() {
        return f.a.f23366a.a().f23354b.f23299c.J;
    }

    static String r() {
        return f.a.f23366a.a().f23354b.f23299c.L;
    }

    private static boolean u() {
        return ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).isInteracting();
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i.b
    public final boolean j() {
        com.bytedance.android.livesdk.chatroom.backroom.c.b bVar = this.f13396e;
        if (bVar == null || !bVar.a("draw")) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.a.b.AbstractC0329b
    public final void l() {
        FrameLayout frameLayout = this.f13398h;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(0);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.h
    public final void s() {
        if (c() != null) {
            c().D();
        }
    }

    public static String a() {
        return q() + "_" + r();
    }

    private void t() {
        LiveVerticalViewPager liveVerticalViewPager;
        if (this.f13401k != null && (liveVerticalViewPager = this.f13397g) != null && !this.y) {
            liveVerticalViewPager.post(new ah(this));
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.h
    public final i c() {
        com.bytedance.android.livesdk.live.a aVar = this.f13400j;
        if (aVar == null || aVar.getCount() == 0) {
            return null;
        }
        return this.f13400j.b(this.f13397g.getCurrentItem());
    }

    @Override // com.bytedance.android.livesdkapi.view.b
    public final boolean g() {
        i c2 = c();
        if (c2 != null && c2.i_()) {
            return true;
        }
        if (!com.bytedance.android.livesdk.chatroom.backroom.d.a.c() || !j()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i.b
    public final boolean i() {
        if (this.f13399i.a() <= 1) {
            return false;
        }
        LiveMtRoomSlideUpGuideSetting.INSTANCE.getValue().isGuideEnable(a());
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void k() {
        boolean z2;
        LiveVerticalViewPager liveVerticalViewPager = this.f13397g;
        if (liveVerticalViewPager != null) {
            if (this.u || this.D || u()) {
                z2 = false;
            } else {
                z2 = true;
            }
            liveVerticalViewPager.setEnabled(z2);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        t();
        this.A = false;
        k kVar = this.f13403m;
        if (kVar != null) {
            kVar.f(false);
        }
    }

    public final void p() {
        if (getActivity() != null) {
            getActivity().getIntent().putExtra("has_page_slide", true);
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        com.bytedance.android.livesdk.ab.i.b();
        com.bytedance.android.livesdk.ab.i.b("invite_issue_check", "LinkIn_Guest_resetViews");
        i c2 = c();
        if (c2 != null) {
            c2.c();
        }
        try {
            this.f13397g.setAdapter(null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        com.bytedance.android.livesdk.live.a aVar = this.f13400j;
        if (aVar != null) {
            aVar.a();
            this.f13400j = null;
        }
        com.bytedance.android.livesdkapi.g.h hVar = this.f13399i;
        if (hVar != null) {
            hVar.c();
            this.f13399i = null;
        }
    }

    public final void h() {
        com.bytedance.android.livesdk.live.a aVar;
        int i2;
        int currentItem = this.f13397g.getCurrentItem();
        if (currentItem >= 0 && (aVar = this.f13400j) != null) {
            int count = aVar.getCount() - currentItem;
            p value = LiveFeedPreloadSetting.INSTANCE.getValue();
            if (value == null || (i2 = value.f19739c) <= 0) {
                i2 = 2;
            }
            if (count <= i2) {
                this.f13399i.b(currentItem);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i.a
    public final void m() {
        Object instantiateItem = this.f13400j.instantiateItem((ViewGroup) this.f13397g, this.f13397g.getCurrentItem());
        if (instantiateItem != null && (instantiateItem instanceof br)) {
            br brVar = (br) instantiateItem;
            brVar.O = true;
            if (brVar.R != null) {
                brVar.R.setVisibility(8);
            }
            if (brVar.X != null) {
                brVar.X.b();
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i.a
    public final void n() {
        int currentItem = this.f13397g.getCurrentItem();
        int i2 = currentItem + 1;
        if (i2 >= this.f13400j.getCount()) {
            e activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        Object instantiateItem = this.f13400j.instantiateItem((ViewGroup) this.f13397g, currentItem);
        if (instantiateItem != null && (instantiateItem instanceof br)) {
            ((br) instantiateItem).P = true;
        }
        this.f13397g.setCurrentItem(i2);
        ao.a(y.e(), (int) R.string.efb);
    }

    class a implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        public i f13411a;

        /* renamed from: b  reason: collision with root package name */
        int f13412b;

        /* renamed from: d  reason: collision with root package name */
        private int f13414d = -1;

        /* renamed from: e  reason: collision with root package name */
        private long f13415e = -1;

        /* renamed from: f  reason: collision with root package name */
        private String f13416f;

        /* renamed from: g  reason: collision with root package name */
        private int f13417g;

        /* renamed from: h  reason: collision with root package name */
        private int f13418h;

        /* renamed from: i  reason: collision with root package name */
        private int f13419i;

        /* renamed from: j  reason: collision with root package name */
        private final String f13420j;

        /* renamed from: k  reason: collision with root package name */
        private int f13421k;

        /* renamed from: l  reason: collision with root package name */
        private final SparseBooleanArray f13422l = new SparseBooleanArray();

        static {
            Covode.recordClassIndex(7464);
        }

        private void a() {
            int currentItem = ab.this.f13397g.getCurrentItem();
            ArrayList arrayList = new ArrayList();
            int count = ab.this.f13400j.getCount();
            for (int i2 = 0; i2 < this.f13422l.size(); i2++) {
                int keyAt = this.f13422l.keyAt(i2);
                if (keyAt >= 0 && keyAt < count && Math.abs(keyAt - currentItem) > 1) {
                    arrayList.add(Integer.valueOf(keyAt));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                this.f13422l.delete(intValue);
                i b2 = ab.this.f13400j.b(intValue);
                if (b2 != null) {
                    b2.x();
                }
            }
            com.bytedance.android.livesdk.chatroom.g.d.a("MultiPlayerPrePullStream", "releaseFarawayPlayer index ".concat(String.valueOf(currentItem)));
        }

        private c b(int i2) {
            i b2;
            if (i2 < 0 || i2 >= ab.this.f13400j.getCount() || (b2 = ab.this.f13400j.b(i2)) == null) {
                return null;
            }
            return ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getIRoomPlayerManager().b(b2.y());
        }

        private void c(int i2) {
            StringBuilder sb = new StringBuilder("mute status: ");
            for (int i3 = 0; i3 < this.f13422l.size(); i3++) {
                int keyAt = this.f13422l.keyAt(i3);
                c b2 = b(keyAt);
                if (b2 != null) {
                    if (keyAt == i2) {
                        b2.setMute(false);
                        sb.append("[").append(keyAt).append("] ");
                    } else {
                        b2.setMute(true);
                        sb.append(keyAt).append(" ");
                    }
                }
            }
            com.bytedance.android.livesdk.chatroom.g.d.a("MultiPlayerPrePullStream", sb.toString());
        }

        private void a(int i2) {
            if (i2 >= 0 && i2 < ab.this.f13400j.getCount()) {
                i b2 = ab.this.f13400j.b(i2);
                Collection<i> values = ab.this.f13400j.f18649e.values();
                if (values != null) {
                    for (i iVar : values) {
                        if (!(iVar == null || iVar == b2)) {
                            iVar.x();
                            iVar.z();
                        }
                    }
                }
                a(i2, true);
                c b3 = b(i2);
                if (b3 != null) {
                    b3.setMute(false);
                }
                com.bytedance.android.d.e iRoomPlayerManager = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getIRoomPlayerManager();
                ab.this.getContext();
                iRoomPlayerManager.b(b3);
                this.f13422l.clear();
                this.f13422l.put(i2, true);
                com.bytedance.android.livesdk.chatroom.g.d.a("MultiPlayerPrePullStream", "releaseAllUselessPlayer index ".concat(String.valueOf(i2)));
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            com.bytedance.android.livesdk.performance.b value;
            com.bytedance.android.livesdk.performance.b value2;
            com.bytedance.android.livesdk.chatroom.g.d.a("LiveRoomFragment", "onPageScrollStateChanged invoked, state is ".concat(String.valueOf(i2)));
            if (i2 == 0) {
                if (ab.this.r && this.f13417g != 1) {
                    com.bytedance.android.livesdk.chatroom.g.d.a("MultiPlayerPrePullStream", "onPageScrollStateChanged -> curScrollState != LiveVerticalViewPager.SCROLL_STATE_DRAGGING");
                    a(ab.this.f13397g.getCurrentItem());
                }
                com.bytedance.android.live.u.f.a();
                com.bytedance.android.live.u.f.b();
                h.h<com.bytedance.android.livesdk.performance.b> hVar = com.bytedance.android.livesdk.performance.g.f20231b.get("watch_slide");
                if (!(hVar == null || (value2 = hVar.getValue()) == null)) {
                    value2.b();
                }
            } else if (i2 == 1) {
                com.bytedance.android.livesdk.util.c.a(c.a.LIVE_SLIDE);
                com.bytedance.android.live.u.f.c();
                h.h<com.bytedance.android.livesdk.performance.b> hVar2 = com.bytedance.android.livesdk.performance.g.f20231b.get("watch_slide");
                if (!(hVar2 == null || (value = hVar2.getValue()) == null)) {
                    value.a();
                }
                com.bytedance.android.livesdk.performance.g.h();
                com.bytedance.android.livesdk.performance.g.f20232c = "";
            }
            this.f13417g = i2;
            if (i2 == 1) {
                this.f13421k = ab.this.f13397g.getCurrentItem();
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            Object instantiateItem;
            i b2 = ab.this.f13400j.b(i2);
            if (b2 != this.f13411a) {
                com.bytedance.android.livesdk.chatroom.g.d.a("LiveRoomFragment", "selected position = " + i2 + "!!!!!!");
                com.bytedance.android.livesdk.chatroom.d.d a2 = com.bytedance.android.livesdk.chatroom.d.d.a();
                if (a2.f15203a) {
                    a2.e();
                }
                com.bytedance.android.livesdk.chatroom.d.d a3 = com.bytedance.android.livesdk.chatroom.d.d.a();
                if (a3.f15203a && a3.f15208f && !a3.f15209g) {
                    b.a.a("livesdk_draw_guide_use").a().b();
                    a3.f15209g = true;
                }
                if (ab.this.getContext() == null) {
                    com.bytedance.android.livesdk.ab.i.b();
                    com.bytedance.android.livesdk.ab.i.c("LiveRoomFragment", "onPageSelected getContext==null");
                    return;
                }
                com.bytedance.android.livesdk.ab.a.a a4 = com.bytedance.android.livesdk.ab.a.a.a();
                LiveVerticalViewPager liveVerticalViewPager = ab.this.f13397g;
                if (!(liveVerticalViewPager == null || i2 == -1)) {
                    JSONObject a5 = com.bytedance.android.livesdk.ab.a.a.a(a4.a(liveVerticalViewPager, "ViewPage#onPageSelected()"));
                    com.bytedance.android.livesdk.ab.a.a.a(a5, "position", i2);
                    com.bytedance.android.livesdk.ab.a.a.a(a5, "description", "room scroll change");
                    com.bytedance.android.livesdk.ab.a.a.f13433a.b(com.bytedance.android.livesdk.ab.a.b.Page.info, a5);
                }
                this.f13412b = i2;
                this.f13414d = i2;
                if (this.f13411a != null) {
                    if (ab.this.o && !ab.this.r) {
                        this.f13411a.d();
                    }
                    f.a.f23366a.a().a(new Event("liveroom_slide_end_liveplay", 33030, com.bytedance.android.livesdkapi.session.b.BussinessApiCall));
                    ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).releaseMsgAlog(this.f13411a.i());
                }
                if (b2 != null) {
                    if (LiveDrawPreEnterRoom.INSTANCE.isEnable()) {
                        r.a.a().a();
                        r.a.a().b(b2.w());
                    }
                    b2.v();
                    b2.w().f23299c.af.f23351a = System.currentTimeMillis();
                    b2.w().f23299c.M = "draw";
                    b2.w().f23299c.aa = "inner_draw";
                    EnterRoomLinkSession.a(b2.w()).a(new Event("live_room_slide_start_enter_next", 259, com.bytedance.android.livesdkapi.session.b.BussinessApiCall));
                }
                if (ab.this.r) {
                    a(i2, true);
                    if (this.f13417g == 0) {
                        a(ab.this.f13397g.getCurrentItem());
                    } else {
                        a();
                    }
                    c(i2);
                } else if (ab.this.o) {
                    if (!(this.f13415e == -1 || this.f13416f == null)) {
                        ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).stopRoomPlayer(this.f13416f, false);
                        ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).recycleRoomPlayer(this.f13416f);
                    }
                    if (b2 != null) {
                        f.a.f23366a.a().a(new Event("live_room_warm_up_player", 260, com.bytedance.android.livesdkapi.session.b.SdkInterfaceCall).a());
                        ab.this.a(i2);
                        EnterRoomConfig a6 = ab.this.f13399i.a(i2);
                        a6.f23299c.aa = "inner_draw";
                        if (!a6.f23299c.ap) {
                            com.bytedance.android.live.core.c.a.a(3, "LiveRoomFragment_tag", "warmUp next room " + a6.f23299c.R + " pull stream,");
                            a(b2, a6, ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).warmUp(a6.f23299c.R, a6, ab.this.getContext()));
                        }
                    }
                }
                if (this.f13417g == 0) {
                    a(i2, b2);
                    ab.this.p();
                }
                if (!(i2 == this.f13421k || (instantiateItem = ab.this.f13400j.instantiateItem((ViewGroup) ab.this.f13397g, this.f13421k)) == null || !(instantiateItem instanceof br))) {
                    br brVar = (br) instantiateItem;
                    boolean b3 = brVar.b(brVar.f15994d);
                    if (!brVar.P && b3 && brVar.X != null) {
                        b.a.a("livesdk_mask_layer_click").a("click_icon", "draw").f("draw").a().b();
                    }
                    brVar.O = false;
                    brVar.P = false;
                }
                com.bytedance.android.live.core.c.a.a(3, "LiveRoomFragment_tag", "onPageScrolled invoked, position: " + i2 + ",mLastPagerPosition:" + this.f13421k);
            }
        }

        a(String str) {
            this.f13420j = str;
        }

        private void a(int i2, boolean z) {
            i b2;
            com.bytedance.android.livesdk.chatroom.g.d.a("MultiPlayerPrePullStream", "multiPlayerPrePullTargetFragment START (" + i2 + ")");
            if (ab.this.f13400j != null) {
                int count = ab.this.f13400j.getCount();
                if (i2 >= 0 && i2 < count && (b2 = ab.this.f13400j.b(i2)) != null) {
                    if (this.f13422l.get(i2)) {
                        com.bytedance.android.livesdk.chatroom.g.d.a("MultiPlayerPrePullStream", "mMultiPlayerPrePullStreamState --->  has pre pull, target position: (" + i2 + ")");
                        return;
                    }
                    this.f13422l.put(i2, true);
                    com.bytedance.android.d.c b3 = b(i2);
                    if (b3 == null || !b3.isPlaying()) {
                        com.bytedance.android.livesdk.chatroom.g.d.a("MultiPlayerPrePullStream", "multiPlayerPrePullTargetFragment start pull stream ~~~~~~~ (" + i2 + ")");
                        b2.w().f23299c.aa = "inner_draw";
                        b2.c(z);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, i iVar) {
            com.bytedance.android.live.core.performance.b.b(b.a.ScrollWatchLivePlay);
            if (!(ab.this.c() == null || ab.this.c().w() == null)) {
                ab.this.c().w().f23299c.q = "0";
            }
            com.bytedance.android.livesdk.live.c.a.a().f18672a = new com.bytedance.android.livesdk.live.a.a(com.bytedance.android.livesdkapi.depend.d.a.SLIDE.typeName);
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f13411a != null) {
                if (ab.this.r) {
                    a(i2);
                } else if (ab.this.o) {
                    this.f13411a.e();
                } else {
                    com.bytedance.android.livesdk.ab.i.b();
                    com.bytedance.android.livesdk.ab.i.b("invite_issue_check", "LinkIn_Guest_doChangePage");
                    this.f13411a.f();
                }
                this.f13411a.w().f23299c.ab = null;
                this.f13411a.w().f23299c.aa = "inner_draw";
                if (ab.f13392f) {
                    ab.f13392f = false;
                }
            }
            if (iVar != null) {
                if (this.f13411a != null) {
                    iVar.w().f23299c.ab = "draw";
                    iVar.w().f23299c.af.f23351a = currentTimeMillis;
                    iVar.w().f23299c.aa = "inner_draw";
                    if (this.f13411a.w() != null) {
                        iVar.w().f23299c.al = this.f13411a.w().f23299c.am;
                    }
                    Room a2 = ab.this.a(i2);
                    if (a2 != null && a2.isFromRecommendCard) {
                        iVar.w().f23299c.Z = "pop_card";
                    }
                }
                f.a.f23366a.a().a(new Event("liveroom_slide_start_liveplay", 256, com.bytedance.android.livesdkapi.session.b.BussinessApiCall));
                if (ab.this.r) {
                    a(i2);
                    ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayControllerManager().c(iVar.y());
                }
                com.bytedance.android.livesdk.chatroom.d.c.a(iVar.w(), i2);
                iVar.k();
                if (this.f13411a != null) {
                    com.bytedance.android.livesdk.ab.d.a("draw");
                    com.bytedance.android.livesdk.ab.d.a();
                    if ((ab.this.f13399i instanceof MultiRoomIdListProvider) || (ab.this.f13399i instanceof MultiPlusFeedRoomListProvider)) {
                        String str = ab.this.f13399i.a(i2).f23298b.f23310b;
                        if (!com.bytedance.common.utility.m.a(ab.this.f13399i.a(i2).f23298b.f23310b)) {
                            iVar.w().f23298b.f23310b = str;
                        }
                        if (!TextUtils.isEmpty(ab.this.f13399i.a(i2).f23298b.f23309a)) {
                            iVar.w().f23298b.f23309a = ab.this.f13399i.a(i2).f23298b.f23309a;
                        }
                    }
                    if (ab.f13391a != null) {
                        com.bytedance.android.livesdk.ab.f.a("draw", iVar.w());
                    }
                    iVar.w().f23299c.X = this.f13420j;
                    if (ab.f13391a != null) {
                        ab.f13391a.b(iVar.w());
                    }
                    if (ab.this.f13399i instanceof com.bytedance.android.livesdk.live.b.a) {
                        ((com.bytedance.android.livesdk.live.b.a) ab.this.f13399i).c(iVar.w().f23299c.R);
                    }
                }
            } else {
                Event event = new Event("liveroom_selected_fragment_is_null", 33029, com.bytedance.android.livesdkapi.session.b.BussinessApiCall);
                event.a("newFragment is empty!");
                f.a.f23366a.a().a(event);
            }
            this.f13411a = iVar;
            this.f13414d = -1;
            if (ab.this.o) {
                this.f13415e = -1;
                this.f13416f = null;
            }
            ab.this.h();
            ab.this.f13393b.refreshTimer();
        }

        private void a(i iVar, EnterRoomConfig enterRoomConfig, com.bytedance.android.d.c cVar) {
            if (cVar != null) {
                this.f13416f = cVar.getPlayerTag();
                ab.this.q = cVar.getPlayerTag();
                if (enterRoomConfig != null) {
                    this.f13415e = enterRoomConfig.f23299c.R;
                }
                iVar.w().f23299c.E = this.f13416f;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
            int i4;
            int i5;
            int i6;
            if (ab.this.r) {
                com.bytedance.android.livesdk.chatroom.g.d.a("MultiPlayerPrePullStream", "onPageScrolled -> position: " + i2 + ", positionOffset: " + f2);
                int currentItem = ab.this.f13397g.getCurrentItem();
                this.f13422l.put(currentItem, true);
                if (i2 == currentItem) {
                    int i7 = i2 + 1;
                    if (a(i7, f2, true)) {
                        a(i7, false);
                        com.bytedance.android.livesdk.chatroom.g.d.a("MultiPlayerPrePullStream", "onPageScrolled -> n+1 preload -->".concat(String.valueOf(i7)));
                    }
                } else if (i2 == currentItem - 1 && a(i2, f2, false)) {
                    a(i2, false);
                    com.bytedance.android.livesdk.chatroom.g.d.a("MultiPlayerPrePullStream", "onPageScrolled -> n-1 preload -->".concat(String.valueOf(i2)));
                }
            }
            if (i2 == this.f13414d && f2 < 1.0E-10f) {
                i b2 = ab.this.f13400j.b(i2);
                com.bytedance.android.livesdk.chatroom.g.d.a("MultiPlayerPrePullStream", "onPageScrolled -> newFragment != activeFragment, pos=" + i2 + ", positionOffset < MAX_OFFSET");
                if (b2 != this.f13411a) {
                    a(i2, b2);
                    ab.this.p();
                }
            } else if (ab.this.o && !ab.this.r && (i5 = this.f13414d) != -1 && i2 != i5 && f2 < 1.0E-10f) {
                com.bytedance.android.livesdk.chatroom.g.d.a("LiveRoomFragment", "The case of sliding back after triggering onPageSelected, re-stream the current live broadcast room");
                Room a2 = ab.this.a(i2);
                if (!(a2 == null || this.f13415e == -1 || a2.getId() == this.f13415e)) {
                    if (this.f13416f != null) {
                        ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).stopRoomPlayer(this.f13416f, false);
                        ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).recycleRoomPlayer(this.f13416f);
                        this.f13416f = null;
                    }
                    this.f13415e = -1;
                }
                a(i2, ab.this.f13400j.b(i2));
            } else if (ab.this.r && (i4 = this.f13414d) != -1 && i2 != i4 && f2 < 1.0E-10f) {
                com.bytedance.android.livesdk.chatroom.g.d.a("MultiPlayerPrePullStream", "multi-player!! The case of sliding back after triggering onPageSelected, re-stream the current live broadcast room");
                Room a3 = ab.this.a(i2);
                if (!(a3 == null || this.f13415e == -1 || a3.getId() == this.f13415e)) {
                    if (this.f13416f != null) {
                        ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).stopRoomPlayer(this.f13416f, false);
                        ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).recycleRoomPlayer(this.f13416f);
                        this.f13416f = null;
                    }
                    this.f13415e = -1;
                }
            }
            if (i2 == this.f13414d && f2 < 1.0E-10f && (i6 = this.f13419i) >= 0 && i2 != i6) {
                if (i2 < i6) {
                    this.f13418h = 0;
                } else {
                    this.f13418h++;
                }
                this.f13419i = i2;
                if (this.f13418h > 15) {
                    this.f13419i = -1;
                }
            }
        }

        private boolean a(int i2, float f2, boolean z) {
            int count = ab.this.f13400j.getCount();
            if (i2 >= 0 && i2 < count) {
                if (ab.this.f13400j.b(i2) == null) {
                    com.bytedance.android.livesdk.chatroom.g.d.a("MultiPlayerPrePullStream", "canPrePullStream -> targetFragment == null, ".concat(String.valueOf(i2)));
                    return false;
                } else if (this.f13422l.get(i2)) {
                    com.bytedance.android.livesdk.chatroom.g.d.a("MultiPlayerPrePullStream", "canPrePullStream -> already prePullStream position == ".concat(String.valueOf(i2)));
                    return false;
                } else if (z) {
                    if (f2 > 0.05f) {
                        return true;
                    }
                    return false;
                } else if (f2 < 0.95f) {
                    return true;
                }
            }
            return false;
        }
    }

    public final String o() {
        if (!(this.f13397g == null || this.f13399i == null)) {
            if (com.bytedance.android.livesdkapi.depend.model.live.f.f23137c == null) {
                com.bytedance.android.livesdkapi.depend.model.live.f.f23137c = Boolean.valueOf(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).isOffline());
            }
            if (!(!com.bytedance.android.livesdkapi.depend.model.live.f.f23137c.booleanValue() || c() == null || c().A() == null)) {
                return this.f13399i.b(c().A().getId());
            }
        }
        return "";
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onPause() {
        int currentItem;
        if (getActivity() != null && getActivity().isFinishing() && (this.f13399i instanceof com.bytedance.android.livesdkapi.g.m) && (currentItem = this.f13397g.getCurrentItem()) >= 0 && currentItem < this.f13399i.a()) {
            this.f13399i.a(currentItem);
        }
        super.onPause();
        com.bytedance.android.livesdk.chatroom.d a2 = com.bytedance.android.livesdk.chatroom.d.a();
        e activity = getActivity();
        if (activity != null && activity.hashCode() == a2.f15173c && activity.isFinishing()) {
            a2.f15171a = false;
            a2.f15172b = null;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onDestroy() {
        String str;
        super.onDestroy();
        j.a().removeCallbacksAndMessages(null);
        com.bytedance.android.livesdk.performance.g.i();
        com.bytedance.android.live.u.f.c();
        b.a.a("live_room_ctr").f15849a.clear();
        c.b.a().f13751e = true;
        ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).releaseAll();
        ((com.bytedance.android.livesdk.survey.a) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.survey.a.class)).release();
        com.bytedance.android.livesdk.chatroom.d.d.a().b();
        e activity = getActivity();
        if (activity != null && activity.isFinishing()) {
            com.bytedance.android.livesdk.chatroom.backroom.b.a().remove(Integer.valueOf(activity.hashCode()));
        }
        com.bytedance.android.live.core.c.a.a(3, "LiveBackRoomStack", "destroyBackRoomStack for " + activity + ", remaining cnt: " + com.bytedance.android.livesdk.chatroom.backroom.b.a().size());
        ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).removeInteractStateChangeListener(this.C);
        com.bytedance.android.livesdkapi.g.h hVar = this.f13399i;
        if (hVar instanceof com.bytedance.android.livesdk.live.b.a) {
            ((com.bytedance.android.livesdk.live.b.a) hVar).e();
        }
        if (com.bytedance.android.livesdk.chatroom.backroom.b.f15002a.a(getActivity()).a() == null && !this.A) {
            com.bytedance.android.b.a.a.f6785g.d();
        }
        if (this.A || getActivity() == null || getActivity().getLifecycle().a().isAtLeast(i.b.INITIALIZED)) {
            e activity2 = getActivity();
            if (activity2 != null) {
                activity2.getLifecycle().a(new LiveRoomFragment$$Lambda$4(this, activity2));
            }
        } else {
            f();
            if (this.n.b() == this.f13399i) {
                this.n.a();
            }
            com.bytedance.android.livesdk.chatroom.backroom.d.a.f15024a = null;
        }
        if (this.w) {
            this.w = false;
        } else {
            DataChannelGlobal.f34575d.c(ac.class);
        }
        ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayControllerManager().a(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).context());
        LiveWidgetProvider.getInstance().clear();
        LivePerformanceManager.getInstance().onModuleStop("stream");
        LivePerformanceManager.getInstance().reportBatteryDrainage();
        LivePerformanceManager.getInstance().onExitRoom();
        LivePerformanceManager.getInstance().stopTimerMonitor();
        LivePerformanceManager.getInstance().release();
        EnterRoomLinkSession a2 = f.a.f23366a.a();
        if (MtPlayerInvokeStopBeforePlaySetting.INSTANCE.getValue()) {
            str = this.q;
        } else {
            str = a2.f23354b.f23299c.E;
        }
        k kVar = this.f13403m;
        if (kVar != null) {
            kVar.d();
            if (str != null) {
                com.bytedance.android.livesdk.chatroom.g.d.a("LiveRoomFragment", "onDestroy -> stop Play. playerTag:".concat(String.valueOf(str)));
                this.f13403m.a(true, str);
                ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).stopRoomPlayer(str, false);
                ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).recycleRoomPlayer(str);
            }
            this.f13403m.p();
        }
        if (this.v > 0) {
            this.v = 0;
        }
        if ((getActivity() instanceof com.bytedance.android.livesdkapi.d) && !this.A) {
            getActivity();
        }
        if (this.f13396e != null) {
            com.bytedance.android.livesdk.chatroom.backroom.c.a.a();
            com.bytedance.android.livesdk.chatroom.backroom.c.a.f15009c = null;
            this.f13396e = null;
        }
        a aVar = this.f13402l;
        if (aVar != null) {
            aVar.f13411a = null;
            this.f13402l = null;
            this.f13401k = null;
        }
        DataChannelGlobal.f34575d.c(com.bytedance.android.livesdk.ab.c.b.class);
        DataChannelGlobal.f34575d.c(com.bytedance.android.livesdk.ab.c.j.class);
        f.a.b.a aVar2 = this.z;
        if (aVar2 != null && !aVar2.isDisposed()) {
            this.z.dispose();
            this.z = null;
        }
    }

    public final Room a(int i2) {
        return this.f13399i.c(i2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        boolean z2;
        com.bytedance.android.livesdk.chatroom.backroom.c.b bVar;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.u = z2;
        k();
        if (getActivity() != null && (bVar = this.f13396e) != null) {
            bVar.a(configuration.orientation);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i.b
    public final void a(boolean z2) {
        this.D = z2;
        k();
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i.b
    public final void a(RoomStatus roomStatus) {
        com.bytedance.android.livesdkapi.g.h hVar = this.f13399i;
        if (hVar instanceof com.bytedance.android.livesdk.list.g) {
            h.f.b.l.d(roomStatus, "");
            HashMap hashMap = new HashMap();
            hashMap.put("roomId", String.valueOf(roomStatus.f7369a));
            hashMap.put("anchorId", String.valueOf(roomStatus.f7370b));
            hashMap.put("countOfWatchUsers", String.valueOf(roomStatus.f7372d));
            hashMap.put("isFinish", String.valueOf(roomStatus.f7371c));
            com.bytedance.android.livesdkapi.g.i iVar = ((com.bytedance.android.livesdk.list.g) hVar).f18641c;
            if (iVar != null) {
                iVar.a(hashMap);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.h
    public final void a(EnterRoomConfig enterRoomConfig) {
        if (com.bytedance.android.livesdk.chatroom.backroom.d.a.a() && getActivity() != null && this.f13397g != null && this.f13399i != null && c() != null) {
            c();
            if (c().w() != null) {
                EnterRoomConfig w2 = c().w();
                if (!(w2 == null || w2.f23299c.H == null || w2.f23299c.H.length <= 0)) {
                    w2.f23299c.V = this.f13397g.getCurrentItem();
                }
                if (c().A() != null) {
                    StackContext stackContext = new StackContext();
                    stackContext.setActivityHashCode(getActivity().hashCode());
                    com.bytedance.android.livesdk.chatroom.backroom.b.f15002a.a(getActivity()).a(w2, enterRoomConfig, stackContext);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.h
    public final void a(String str) {
        com.bytedance.android.livesdkapi.depend.d.i c2 = c();
        if (c2 != null) {
            com.bytedance.android.livesdkapi.depend.d.p g2 = c2.g();
            if (g2 == com.bytedance.android.livesdkapi.depend.d.p.LIVE_STARTED || g2 == com.bytedance.android.livesdkapi.depend.d.p.DETACHED) {
                f.a.f23366a.a();
                if (f13391a != null) {
                    com.bytedance.android.livesdk.ab.f.a(c2.w());
                }
                com.bytedance.android.livesdk.ab.d.a(str);
                if (g2 == com.bytedance.android.livesdkapi.depend.d.p.LIVE_STARTED) {
                    return;
                }
            }
            if (this.y) {
                this.y = false;
                t();
            } else if (TextUtils.equals(str, "click")) {
                c2.k();
            } else {
                a aVar = this.f13402l;
                if (aVar != null) {
                    aVar.a(aVar.f13412b, c2);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z2;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        LiveEnableALogSetting.INSTANCE.update();
        com.bytedance.android.live.u.h.f12830b = LivePlayFluencyOptSettingV2.INSTANCE.enable();
        int i2 = 0;
        com.bytedance.android.live.u.h.f12829a = false;
        com.bytedance.android.b.a((int) R.layout.b9j);
        com.bytedance.android.live.u.f.a();
        com.bytedance.android.live.u.f.b();
        com.bytedance.android.livesdk.util.c.a(c.a.ENTER_LIVE_ROOM);
        com.bytedance.android.livesdk.ab.m.f13604j = false;
        com.bytedance.android.livesdk.model.k.AUDIENCE.config();
        c.b.a().f13751e = false;
        String a2 = a();
        if (LiveMtRoomSlideUpGuideSetting.INSTANCE.getValue().isGuideEnable(a2)) {
            com.bytedance.android.livesdk.chatroom.d.d a3 = com.bytedance.android.livesdk.chatroom.d.d.a();
            a3.b();
            a3.f15203a = true;
            a3.f15210h = a2;
            bf a4 = bf.a();
            a4.e();
            a4.f14205a = true;
            bf.a().f14206b.observeForever(a3);
        }
        this.p = System.currentTimeMillis();
        com.bytedance.android.live.core.performance.b.b(b.a.StartLivePlay);
        HashMap hashMap = new HashMap();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.onCreate(null);
        hashMap.put("time", String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        hashMap.put("location", "live detail after super oncreate");
        ((com.bytedance.android.livesdkapi.host.g) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdkapi.host.g.class)).a("feed_enter_room", hashMap);
        this.B = new l();
        this.n = com.bytedance.android.livesdkapi.g.k.f23204a;
        this.q = f.a.f23366a.a().f23354b.f23299c.E;
        k b2 = ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayControllerManager().b(this.q);
        this.f13403m = b2;
        if (b2 != null) {
            b2.c();
        }
        ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).registerInteractStateChangeListener(this.C);
        ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getDnsOptimizer().a();
        ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLiveStreamStrategy().a();
        RoomListener roomListener = new RoomListener(this);
        this.f13394c = roomListener;
        if (roomListener.initRoomEnvironment()) {
            this.s = new NetworkController();
            this.f13393b = new RoomStatusController(this);
            this.t = new RoomTaskController();
            getLifecycle().a(this.s);
            getLifecycle().a(this.f13393b);
            getLifecycle().a(this.t);
            com.bytedance.android.livesdk.chatroom.d a5 = com.bytedance.android.livesdk.chatroom.d.a();
            e activity = getActivity();
            EnterRoomConfig enterRoomConfig = f.a.f23366a.a().f23354b;
            if (activity != null) {
                a5.f15171a = true;
                a5.f15172b = new d.a(enterRoomConfig);
                a5.f15173c = activity.hashCode();
                if (a5.f15174d == null) {
                    a5.f15174d = new LiveOntologyInfoManager$$Lambda$0(a5);
                    activity.getLifecycle().a(a5.f15174d);
                }
            }
            f.a.b.a aVar = this.z;
            if (aVar != null) {
                aVar.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.n.f.class).d(new ae(this)));
                this.z.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.chatroom.c.e.class).d(new af(this)));
            }
            if (!com.bytedance.android.livesdk.chatroom.backroom.d.a.a()) {
                EnterRoomConfig enterRoomConfig2 = f.a.f23366a.a().f23354b;
                ValueAnimator valueAnimator = com.bytedance.android.livesdk.chatroom.backroom.micbackwidget.a.f15043d;
                if (valueAnimator != null) {
                    valueAnimator.removeAllUpdateListeners();
                    valueAnimator.removeAllListeners();
                    valueAnimator.cancel();
                }
                com.bytedance.android.livesdk.chatroom.backroom.micbackwidget.a.f15043d = null;
                com.bytedance.android.livesdk.chatroom.backroom.micbackwidget.a.f15044e = null;
                com.bytedance.android.livesdk.chatroom.backroom.micbackwidget.a.f15041b = false;
                com.bytedance.android.livesdk.chatroom.backroom.micbackwidget.a.f15042c = 0;
                if (enterRoomConfig2 == null || (roomsData2 = enterRoomConfig2.f23299c) == null) {
                    z2 = false;
                } else {
                    z2 = roomsData2.ag;
                }
                com.bytedance.android.livesdk.chatroom.backroom.micbackwidget.a.f15041b = z2;
                if (!(enterRoomConfig2 == null || (roomsData = enterRoomConfig2.f23299c) == null)) {
                    i2 = roomsData.ah;
                }
                com.bytedance.android.livesdk.chatroom.backroom.micbackwidget.a.f15042c = i2;
                if (i2 <= 0) {
                    com.bytedance.android.livesdk.chatroom.backroom.micbackwidget.a.f15042c = com.bytedance.android.livesdk.chatroom.backroom.micbackwidget.a.f15040a;
                }
            }
            if (!(getActivity() == null || getActivity().getRequestedOrientation() == 1 || bundle != null)) {
                ao.a(y.e(), (int) R.string.eoh);
            }
            if (((com.bytedance.android.livesdk.rank.api.d) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.rank.api.d.class)).getRankOptOutPresenter() != null) {
                ((com.bytedance.android.livesdk.rank.api.d) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.rank.api.d.class)).getRankOptOutPresenter().c();
            }
            b.a.a("live_room_ctr").a(this, 1);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i.b
    public final boolean a(long j2) {
        com.bytedance.android.livesdkapi.g.h hVar = this.f13399i;
        if (hVar == null || hVar.b() == null || this.f13399i.b().size() <= 1) {
            return false;
        }
        for (Room room : this.f13399i.b()) {
            if (room != null && j2 == room.getId()) {
                this.f13399i.a(j2);
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01a4, code lost:
        if (com.bytedance.android.livesdk.livesetting.watchlive.LiveFeedInnerStyleSetting.INSTANCE.getValue() != 0) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c2, code lost:
        if (com.bytedance.android.livesdk.live.model.LiveFeedDraw.isEnable(r5, r4) != false) goto L_0x01a6;
     */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityCreated(android.os.Bundle r23) {
        /*
        // Method dump skipped, instructions count: 1292
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.ab.onActivityCreated(android.os.Bundle):void");
    }

    private void a(int i2, String str) {
        l lVar = this.B;
        if (lVar != null) {
            lVar.a(i2, str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2;
        if (com.bytedance.android.live.u.g.c()) {
            a2 = com.a.b.a.a(getContext(), R.layout.b9o, null, false);
        } else {
            a2 = com.a.a(layoutInflater, R.layout.b9o, viewGroup, false);
        }
        LiveVerticalViewPager liveVerticalViewPager = (LiveVerticalViewPager) a2.findViewById(R.id.fk_);
        this.f13397g = liveVerticalViewPager;
        this.f13393b.setViewPager(liveVerticalViewPager);
        this.f13398h = (FrameLayout) a2.findViewById(R.id.ad7);
        EnterRoomConfig enterRoomConfig = f.a.f23366a.a().f23354b;
        if (this.f13398h != null) {
            if (enterRoomConfig == null || !enterRoomConfig.f23300d.f23303a) {
                this.f13398h.setBackgroundColor(getResources().getColor(R.color.k2));
            } else {
                this.f13398h.setBackgroundColor(0);
            }
        }
        if (com.bytedance.android.livesdk.chatroom.backroom.d.a.a()) {
            this.f13395d = (ViewGroup) a2.findViewById(R.id.qj);
            this.f13396e = new com.bytedance.android.livesdk.chatroom.backroom.c.b(getContext(), getLifecycle(), this.f13395d);
        }
        com.bytedance.android.livesdk.chatroom.d.d a3 = com.bytedance.android.livesdk.chatroom.d.d.a();
        FrameLayout frameLayout = this.f13398h;
        if (a3.f15203a) {
            a3.f15207e = frameLayout;
        }
        return a2;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.i.b
    public final void a(long j2, EnterRoomConfig enterRoomConfig, boolean z2) {
        long j3;
        String str;
        long j4;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        EnterRoomConfig enterRoomConfig2 = enterRoomConfig;
        f.a.f23366a.a().a(new Event("live_room_jump_to_other", 258, com.bytedance.android.livesdkapi.session.b.BussinessApiCall));
        if (z2 && com.bytedance.android.livesdk.chatroom.backroom.d.a.a()) {
            if (this.f13395d != null) {
                com.bytedance.android.livesdk.chatroom.backroom.c.b bVar = this.f13396e;
                String str2 = enterRoomConfig2.f23299c.ax;
                com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_return_last_click").a().a("layer_level", com.bytedance.android.livesdk.chatroom.backroom.b.f15002a.a(com.bytedance.android.live.core.f.a.a(bVar.f15017e)).c());
                EnterRoomConfig enterRoomConfig3 = bVar.f15013a;
                if (enterRoomConfig3 == null || (roomsData2 = enterRoomConfig3.f23299c) == null) {
                    j3 = 0;
                } else {
                    j3 = roomsData2.R;
                }
                com.bytedance.android.livesdk.ab.b a3 = a2.a("to_room_id", j3);
                EnterRoomConfig enterRoomConfig4 = bVar.f15013a;
                if (enterRoomConfig4 == null || (roomsData = enterRoomConfig4.f23299c) == null || (str = roomsData.D) == null) {
                    str = "0";
                }
                com.bytedance.android.livesdk.ab.b a4 = a3.a("to_anchor_id", str).a("return_type", str2);
                if (com.bytedance.android.livesdk.chatroom.backroom.c.a.f15007a > 0 || com.bytedance.android.livesdk.chatroom.backroom.c.a.f15010d <= 0) {
                    ValueAnimator valueAnimator = com.bytedance.android.livesdk.chatroom.backroom.c.a.f15008b;
                    if (valueAnimator != null) {
                        j4 = valueAnimator.getCurrentPlayTime();
                    } else {
                        j4 = 0;
                    }
                } else {
                    j4 = SystemClock.currentThreadTimeMillis() - com.bytedance.android.livesdk.chatroom.backroom.c.a.f15010d;
                }
                a4.a("process_duration", j4).b();
            }
            enterRoomConfig2 = com.bytedance.android.livesdk.chatroom.backroom.b.f15002a.a(getActivity()).b();
        }
        if (enterRoomConfig2 == null) {
            com.bytedance.android.livesdk.chatroom.g.d.a("LiveRoomFragment", "jump2Other event is null");
            return;
        }
        enterRoomConfig2.f23299c.W = "full_screen";
        enterRoomConfig2.f23299c.R = j2;
        this.A = true;
        long j5 = enterRoomConfig2.f23299c.Y;
        if (!(c() == null || c().w() == null)) {
            enterRoomConfig2.f23299c.X = c().w().f23299c.X;
            enterRoomConfig2.f23299c.O = c().w().f23299c.O;
            enterRoomConfig2.f23299c.A = c().w().f23299c.A;
            if (j5 == 0) {
                j5 = c().w().f23299c.R;
            }
            enterRoomConfig2.f23299c.al = c().w().f23299c.am;
            if (!c().w().f23299c.az || !z2) {
                enterRoomConfig2.f23299c.aB = 0;
            } else {
                com.bytedance.android.b.a.a aVar = com.bytedance.android.b.a.a.f6785g;
                if (!aVar.a().empty()) {
                    Long pop = aVar.a().pop();
                    h.f.b.l.b(pop, "");
                    pop.longValue();
                }
                enterRoomConfig2.f23299c.aB = 1;
                enterRoomConfig2.f23299c.W = "small_picture";
            }
        }
        long j6 = enterRoomConfig2.f23298b.u;
        if (j6 > 0) {
            ((z) ((PortalApi) com.bytedance.android.live.network.e.a().a(PortalApi.class)).ping(j5, j6, PortalApi.a.JUMP_TO_ROOM).a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a((Fragment) this))).a(ai.f13741a, aj.f13794a);
        }
        enterRoomConfig2.f23299c.R = j2;
        f.a.f23366a.a(new EnterRoomLinkSession(enterRoomConfig2));
        ((com.bytedance.android.livesdkapi.host.j) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdkapi.host.j.class)).b(getContext(), enterRoomConfig2);
    }
}
