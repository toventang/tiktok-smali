package com.bytedance.android.livesdk.dialogv2;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.t;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.u.h;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.dialogv2.c.c;
import com.bytedance.android.livesdk.dialogv2.c.d;
import com.bytedance.android.livesdk.dialogv2.viewmodel.LiveGiftDialogViewModel;
import com.bytedance.android.livesdk.dialogv2.viewmodel.a;
import com.bytedance.android.livesdk.dialogv2.widget.LiveGiftBottomWidget;
import com.bytedance.android.livesdk.dialogv2.widget.LiveGiftDescriptionWidget;
import com.bytedance.android.livesdk.dialogv2.widget.LiveGiftGuestInfoWidget;
import com.bytedance.android.livesdk.dialogv2.widget.LiveGiftPanelWidget;
import com.bytedance.android.livesdk.i;
import com.bytedance.android.livesdk.j;
import com.bytedance.android.livesdk.j.aq;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.wallet.LiveEnableRechargeSucceedAnimationSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdk.service.a.a;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.c.a.a;
import com.bytedance.android.livesdk.service.c.a.f;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.android.livesdk.utils.ap;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.File;
import java.util.HashMap;
import java.util.Objects;

public final class b extends v implements a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f16944e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public LiveGiftBottomWidget f16945a;

    /* renamed from: b  reason: collision with root package name */
    public LiveGiftPanelWidget f16946b;

    /* renamed from: c  reason: collision with root package name */
    public LiveGiftDialogViewModel f16947c;

    /* renamed from: d  reason: collision with root package name */
    public Runnable f16948d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f16949f;

    /* renamed from: g  reason: collision with root package name */
    private Room f16950g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f16951h = true;

    /* renamed from: i  reason: collision with root package name */
    private long f16952i;

    /* renamed from: j  reason: collision with root package name */
    private final WidgetCreateTimeUtil f16953j = new WidgetCreateTimeUtil(null, 1, null);

    /* renamed from: k  reason: collision with root package name */
    private final f.a.b.a f16954k = new f.a.b.a();

    /* renamed from: l  reason: collision with root package name */
    private HashMap f16955l;

    static {
        Covode.recordClassIndex(9415);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f16955l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f16955l == null) {
            this.f16955l = new HashMap();
        }
        View view = (View) this.f16955l.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f16955l.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(9416);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final ak.a c_() {
        return ak.a.PANEL_GIFT;
    }

    @Override // com.bytedance.android.livesdk.dialogv2.a
    public final void d() {
        LiveGiftPanelWidget liveGiftPanelWidget = this.f16946b;
        if (liveGiftPanelWidget != null) {
            liveGiftPanelWidget.a();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final boolean i() {
        dismissAllowingStateLoss();
        return super.i();
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b6r);
        bVar.f22375b = R.style.a2z;
        bVar.f22385l = 48;
        bVar.f22380g = 80;
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        f.a(SystemClock.uptimeMillis() - this.f16952i);
        com.bytedance.android.livesdk.an.a.a().a(new j());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        super.onDestroy();
        DataChannel dataChannel = this.p;
        if (dataChannel != null) {
            dataChannel.c(com.bytedance.android.live.gift.e.class, false);
        }
        this.f16954k.a();
        this.f16953j.send();
        a.C0452a.C0453a.f21303a.a();
        com.bytedance.android.livesdk.service.c.a.e eVar = com.bytedance.android.livesdk.service.c.a.e.f21319i;
        String str2 = a.C0355a.C0356a.f17017a.f17009e;
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("tab_leave").a().a("gift_dialog_request_id", com.bytedance.android.livesdk.service.a.c.f21167a).a("live", GiftManager.inst().getTabName(a.C0355a.C0356a.f17017a.f17014j)).a("tab_position", GiftManager.inst().getTabLocation(a.C0355a.C0356a.f17017a.f17014j)).a("enter_method", com.bytedance.android.livesdk.ab.e.d()).a("enter_from_merge", com.bytedance.android.livesdk.ab.e.a()).a("action_type", com.bytedance.android.livesdk.ab.e.e());
        if (str2 == null) {
            str2 = "icon";
        }
        com.bytedance.android.livesdk.ab.b a3 = a2.a("gift_enter_from", str2).a("send_gift_scene", com.bytedance.android.livesdk.u.a.b().getDesc());
        if (com.bytedance.android.livesdk.service.c.a.e.b()) {
            str = "1";
        } else {
            str = "0";
        }
        a3.a("is_anchor", str).a("gift_dialog_request_id", com.bytedance.android.livesdk.service.a.c.f21167a).a("timestamp", com.bytedance.android.livesdk.utils.a.a.a()).a("from_panel_duration", com.bytedance.android.livesdk.utils.a.a.a() - a.C0355a.C0356a.f17017a.f17016l).a("stay_duration", (com.bytedance.android.livesdk.utils.a.a.a() - eVar.f21327f) / 1000).b();
        DataChannel dataChannel2 = this.p;
        if (dataChannel2 != null) {
            dataChannel2.b(com.bytedance.android.live.gift.f.class, (Object) false);
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onStart() {
        boolean z;
        Window window;
        super.onStart();
        if (this.p != null) {
            DataChannel dataChannel = this.p;
            if (dataChannel == null) {
                l.b();
            }
            Object b2 = dataChannel.b(cp.class);
            if (b2 == null) {
                l.b();
            }
            boolean booleanValue = ((Boolean) b2).booleanValue();
            if (!booleanValue || (!this.f16949f && !com.bytedance.android.live.core.f.d.a(getContext()))) {
                z = false;
            } else {
                z = true;
            }
            Dialog dialog = getDialog();
            if (!(dialog == null || (window = dialog.getWindow()) == null)) {
                if (!booleanValue || (!this.f16949f && !com.bytedance.android.live.core.f.d.a(getContext()))) {
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
            Handler handler = new Handler(Looper.getMainLooper());
            Runnable runnable = this.f16948d;
            if (runnable != null) {
                handler.postDelayed(runnable, 10);
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f16957a;

        static {
            Covode.recordClassIndex(9419);
        }

        d(b bVar) {
            this.f16957a = bVar;
        }

        public final void onClick(View view) {
            this.f16957a.dismissAllowingStateLoss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.b$b  reason: collision with other inner class name */
    static final class C0351b extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(9417);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0351b(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            bool.booleanValue();
            this.this$0.dismissAllowingStateLoss();
            return z.f158842a;
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f16958a;

        static {
            Covode.recordClassIndex(9420);
        }

        e(b bVar) {
            this.f16958a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            View view = this.f16958a.getView();
            if (view != null) {
                view.postDelayed(new Runnable(this) {
                    /* class com.bytedance.android.livesdk.dialogv2.b.e.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ e f16959a;

                    static {
                        Covode.recordClassIndex(9421);
                    }

                    {
                        this.f16959a = r1;
                    }

                    public final void run() {
                        View view;
                        float a2;
                        View view2 = this.f16959a.f16958a.getView();
                        if (view2 != null) {
                            view = view2.findViewById(R.id.alm);
                        } else {
                            view = null;
                        }
                        Context context = this.f16959a.f16958a.getContext();
                        if (context != null) {
                            com.bytedance.android.livesdk.an.a a3 = com.bytedance.android.livesdk.an.a.a();
                            if (view != null) {
                                a2 = (float) view.getHeight();
                            } else {
                                a2 = ap.a(context, 276.0f);
                            }
                            a3.a(new i(Float.valueOf(a2)));
                        }
                    }
                }, 30);
            }
        }
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f16956a;

        static {
            Covode.recordClassIndex(9418);
        }

        c(b bVar) {
            this.f16956a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.livesdk.dialogv2.a.a aVar;
            HSImageView hSImageView;
            File tTLiveGeckoResourceFile;
            com.bytedance.android.livesdk.wallet.d dVar = (com.bytedance.android.livesdk.wallet.d) obj;
            if (dVar != null) {
                int i2 = dVar.f22416b;
                LiveGiftBottomWidget liveGiftBottomWidget = this.f16956a.f16945a;
                if (!(liveGiftBottomWidget == null || (tTLiveGeckoResourceFile = ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).getTTLiveGeckoResourceFile("tiktok_live_basic_resource", "ttlive_recharge_anim.webp")) == null)) {
                    HSImageView hSImageView2 = (HSImageView) liveGiftBottomWidget.findViewById(R.id.c0b);
                    l.b(hSImageView2, "");
                    hSImageView2.setVisibility(0);
                    com.bytedance.android.live.core.f.a.a a2 = com.bytedance.android.live.core.f.a.a.a(hSImageView2.getContext()).a(tTLiveGeckoResourceFile).a(ImageView.ScaleType.CENTER_CROP);
                    a2.f9023h = true;
                    a2.f9017b = new LiveGiftBottomWidget.g(liveGiftBottomWidget, i2);
                    a2.a(hSImageView2);
                }
                LiveGiftPanelWidget liveGiftPanelWidget = this.f16956a.f16946b;
                if (!(liveGiftPanelWidget == null || (aVar = liveGiftPanelWidget.f17053b) == null)) {
                    if (aVar.f16935a instanceof com.bytedance.android.livesdk.dialogv2.c.d) {
                        com.bytedance.android.livesdk.dialogv2.c.a aVar2 = aVar.f16935a;
                        Objects.requireNonNull(aVar2, "null cannot be cast to non-null type com.bytedance.android.livesdk.dialogv2.viewholder.LiveGiftPanelViewHolder");
                        com.bytedance.android.livesdk.dialogv2.c.d dVar2 = (com.bytedance.android.livesdk.dialogv2.c.d) aVar2;
                        if (!dVar2.e() && (hSImageView = dVar2.f16962c) != null) {
                            hSImageView.postDelayed(new d.RunnableC0354d(dVar2), 50);
                        }
                    } else if (aVar.f16935a instanceof com.bytedance.android.livesdk.dialogv2.c.c) {
                        com.bytedance.android.livesdk.dialogv2.c.a aVar3 = aVar.f16935a;
                        Objects.requireNonNull(aVar3, "null cannot be cast to non-null type com.bytedance.android.livesdk.dialogv2.viewholder.LiveGiftFirstRechargeViewHolder");
                        com.bytedance.android.livesdk.dialogv2.c.c cVar = (com.bytedance.android.livesdk.dialogv2.c.c) aVar3;
                        if (!cVar.e()) {
                            if (com.bytedance.android.livesdk.firstrecharge.d.u.f()) {
                                HSImageView hSImageView3 = cVar.f16962c;
                                if (hSImageView3 != null) {
                                    hSImageView3.postDelayed(new c.e(cVar), 50);
                                }
                            } else {
                                LottieAnimationView lottieAnimationView = cVar.o;
                                if (lottieAnimationView != null) {
                                    lottieAnimationView.a();
                                }
                            }
                        }
                    }
                }
                b.a.a("livesdk_recharge_success_anime").a().b();
            }
        }
    }

    public static final b a(Runnable runnable) {
        t<Integer> tVar;
        long j2;
        t<Integer> tVar2;
        long j3;
        b bVar = new b();
        bVar.f16947c = new LiveGiftDialogViewModel();
        if (l.a((Object) a.C0355a.C0356a.f17017a.f17009e, (Object) "gift_panel")) {
            GiftManager inst = GiftManager.inst();
            Long l2 = a.C0355a.C0356a.f17017a.f17005a;
            long j4 = 0;
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = 0;
            }
            if (inst.getTabByGiftId(j2) != -1) {
                LiveGiftDialogViewModel liveGiftDialogViewModel = bVar.f16947c;
                if (!(liveGiftDialogViewModel == null || (tVar2 = liveGiftDialogViewModel.f17003a) == null)) {
                    GiftManager inst2 = GiftManager.inst();
                    Long l3 = a.C0355a.C0356a.f17017a.f17005a;
                    if (l3 != null) {
                        j3 = l3.longValue();
                    } else {
                        j3 = 0;
                    }
                    tVar2.setValue(Integer.valueOf(inst2.getTabByGiftId(j3)));
                }
                com.bytedance.android.livesdk.dialogv2.viewmodel.a aVar = a.C0355a.C0356a.f17017a;
                GiftManager inst3 = GiftManager.inst();
                Long l4 = a.C0355a.C0356a.f17017a.f17005a;
                if (l4 != null) {
                    j4 = l4.longValue();
                }
                aVar.f17011g = inst3.getTabByGiftId(j4);
                bVar.f16948d = runnable;
                return bVar;
            }
        }
        LiveGiftDialogViewModel liveGiftDialogViewModel2 = bVar.f16947c;
        if (!(liveGiftDialogViewModel2 == null || (tVar = liveGiftDialogViewModel2.f17003a) == null)) {
            tVar.setValue(Integer.valueOf(com.bytedance.android.livesdk.olddialog.a.a.a(y.e(), "sp_gift_page_type", 1)));
        }
        a.C0355a.C0356a.f17017a.f17011g = com.bytedance.android.livesdk.olddialog.a.a.a(y.e(), "sp_gift_page_type", 1);
        bVar.f16948d = runnable;
        return bVar;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        Long l2;
        Hashtag hashtag;
        Hashtag hashtag2;
        boolean z;
        super.onCreate(bundle);
        com.bytedance.android.livesdk.service.c.a.e eVar = com.bytedance.android.livesdk.service.c.a.e.f21319i;
        eVar.f21328g = a.C0355a.C0356a.f17017a.f17009e;
        eVar.f21327f = com.bytedance.android.livesdk.utils.a.a.a();
        String a2 = com.bytedance.android.livesdk.service.c.a.e.a(String.valueOf(com.bytedance.android.livesdk.u.a.a() + com.bytedance.android.livesdk.utils.a.a.a()));
        if (!l.a((Object) eVar.f21323b, (Object) a2)) {
            eVar.f21323b = a2;
            if (a.C0355a.C0356a.f17017a.f17007c == GiftDialogViewModel.b.GUEST) {
                z = true;
            } else {
                z = false;
            }
            eVar.f21326e = z;
        }
        a.C0355a.C0356a.f17017a.f17016l = com.bytedance.android.livesdk.utils.a.a.a();
        this.f16952i = SystemClock.uptimeMillis();
        DataChannel dataChannel = this.p;
        if (dataChannel == null || (hashtag2 = (Hashtag) dataChannel.b(aq.class)) == null || (str = hashtag2.title) == null) {
            str = "";
        }
        DataChannel dataChannel2 = this.p;
        if (dataChannel2 == null || (hashtag = (Hashtag) dataChannel2.b(aq.class)) == null) {
            l2 = null;
        } else {
            l2 = hashtag.id;
        }
        f.a(a.C0355a.C0356a.f17017a.f17009e, y.f(), str, String.valueOf(l2));
        a.C0445a.C0446a.f21161a.f21160a = true;
        com.bytedance.android.livesdk.service.c.c.c.a();
        this.f16954k.a(com.bytedance.android.livesdk.an.a.a().a(j.class).d(new e(this)));
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        Room room;
        long j2;
        Boolean bool;
        Boolean bool2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        boolean z2 = true;
        a.C0355a.C0356a.f17017a.f17012h = true;
        DataChannel dataChannel = this.p;
        if (dataChannel == null || (bool2 = (Boolean) dataChannel.b(ee.class)) == null) {
            z = false;
        } else {
            z = bool2.booleanValue();
        }
        this.f16949f = z;
        DataChannel dataChannel2 = this.p;
        if (dataChannel2 != null) {
            room = (Room) dataChannel2.b(df.class);
        } else {
            room = null;
        }
        this.f16950g = room;
        DataChannel dataChannel3 = this.p;
        if (!(dataChannel3 == null || (bool = (Boolean) dataChannel3.b(cp.class)) == null)) {
            z2 = bool.booleanValue();
        }
        this.f16951h = z2;
        DataChannel dataChannel4 = this.p;
        if (dataChannel4 != null) {
            dataChannel4.c(com.bytedance.android.live.gift.e.class, true);
        }
        DataChannel dataChannel5 = this.p;
        if (dataChannel5 != null) {
            dataChannel5.a((Object) this, com.bytedance.android.live.gift.e.class, (h.f.a.b) new C0351b(this));
        }
        if (LiveEnableRechargeSucceedAnimationSetting.INSTANCE.enable()) {
            this.f16954k.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.wallet.d.class).d(new c(this)));
        }
        com.bytedance.android.livesdk.service.a.c.a();
        GiftManager inst = GiftManager.inst();
        Room room2 = this.f16950g;
        if (room2 != null) {
            j2 = room2.getId();
        } else {
            j2 = 0;
        }
        inst.syncGiftList(null, j2, 3, this.f16949f);
        ((FrameLayout) a_(R.id.cug)).setOnClickListener(new d(this));
        WidgetManager of = WidgetManager.of(this, getView(), h.f12831c);
        of.mWidgetCreateTimeListener = this.f16953j;
        of.load(R.id.baw, new LiveGiftDescriptionWidget(), false);
        LiveGiftPanelWidget liveGiftPanelWidget = new LiveGiftPanelWidget(this.f16947c);
        this.f16946b = liveGiftPanelWidget;
        of.load(R.id.cuh, liveGiftPanelWidget);
        if (a.C0355a.C0356a.f17017a.f17007c == GiftDialogViewModel.b.GUEST) {
            LiveGiftGuestInfoWidget liveGiftGuestInfoWidget = new LiveGiftGuestInfoWidget();
            LiveGiftDialogViewModel liveGiftDialogViewModel = this.f16947c;
            if (liveGiftDialogViewModel != null) {
                l.d(liveGiftDialogViewModel, "");
                liveGiftGuestInfoWidget.f17048a = liveGiftDialogViewModel;
            }
            View a_ = a_(R.id.bay);
            l.b(a_, "");
            a_.setVisibility(8);
            of.load(R.id.bb6, liveGiftGuestInfoWidget);
        }
        LiveGiftBottomWidget liveGiftBottomWidget = new LiveGiftBottomWidget();
        this.f16945a = liveGiftBottomWidget;
        GiftManager inst2 = GiftManager.inst();
        l.b(inst2, "");
        liveGiftBottomWidget.f17022d = inst2.getGiftPageList();
        liveGiftBottomWidget.a();
        LiveGiftBottomWidget liveGiftBottomWidget2 = this.f16945a;
        if (liveGiftBottomWidget2 != null) {
            liveGiftBottomWidget2.f17020b = this.f16947c;
        }
        of.load(R.id.cue, this.f16945a);
        DataChannel dataChannel6 = this.p;
        if (dataChannel6 != null) {
            dataChannel6.b(com.bytedance.android.live.gift.f.class, (Object) true);
        }
    }
}
