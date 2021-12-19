package com.bytedance.android.live.wallet.a;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.rtl.RtlViewPager;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.adapter.a;
import com.bytedance.android.live.wallet.e;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.BasePackage;
import com.bytedance.android.live.wallet.model.CurrencyInfo;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.UserBalance;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.di;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.l.a;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeEntranceSchema;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeTitle;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRoomRechargeAgreementConfigSetting;
import com.bytedance.android.livesdk.livesetting.recharge.LiveWebRechargeAuditing;
import com.bytedance.android.livesdk.livesetting.recharge.LiveWebRechargeDialog;
import com.bytedance.android.livesdk.livesetting.recharge.LiveWebRechargeUrl;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeFeedbackUrlSetting;
import com.bytedance.android.livesdk.livesetting.wallet.WalletEducationPopupRechargeUrlSetting;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.model.LiveRechargeAgreementConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.a.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class i extends com.bytedance.android.livesdk.v implements com.bytedance.android.live.wallet.f.b.b {
    public static final a n = new a((byte) 0);
    private final h.h A = h.i.a((h.f.a.a) new d(this));
    private final h.h B = h.i.a((h.f.a.a) new o(this));
    private com.bytedance.android.livesdk.wallet.c C;
    private final h.h D = h.i.a((h.f.a.a) new q(this));
    private final h.h E = h.i.a((h.f.a.a) new m(this));
    private HashMap F;

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.depend.d.b.d f12968a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f12969b;

    /* renamed from: c  reason: collision with root package name */
    public String f12970c = "";

    /* renamed from: d  reason: collision with root package name */
    public boolean f12971d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12972e;

    /* renamed from: f  reason: collision with root package name */
    public LiveTextView f12973f;

    /* renamed from: g  reason: collision with root package name */
    public com.bytedance.android.livesdk.l.a f12974g;

    /* renamed from: h  reason: collision with root package name */
    public com.bytedance.android.live.wallet.f.a.d f12975h;

    /* renamed from: i  reason: collision with root package name */
    public com.bytedance.android.livesdk.wallet.c f12976i;

    /* renamed from: j  reason: collision with root package name */
    public com.bytedance.android.livesdk.wallet.c f12977j;

    /* renamed from: k  reason: collision with root package name */
    public com.bytedance.android.livesdk.wallet.c f12978k;

    /* renamed from: l  reason: collision with root package name */
    public com.bytedance.android.live.wallet.f f12979l;

    /* renamed from: m  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.depend.d.b.b f12980m;
    private Application.ActivityLifecycleCallbacks t = new c(this);
    private com.bytedance.android.live.wallet.adapter.b u;
    private FrameLayout v;
    private final h.h w = h.i.a((h.f.a.a) new n(this));
    private final h.h x = h.i.a((h.f.a.a) new l(this));
    private final h.h y = h.i.a((h.f.a.a) new p(this));
    private final h.h z = h.i.a((h.f.a.a) new x(this));

    static {
        Covode.recordClassIndex(7203);
    }

    private final int o() {
        return ((Number) this.A.getValue()).intValue();
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.F;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.F == null) {
            this.F = new HashMap();
        }
        View view = (View) this.F.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.F.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final boolean d() {
        return ((Boolean) this.w.getValue()).booleanValue();
    }

    public final String e() {
        return (String) this.x.getValue();
    }

    public final String f() {
        return (String) this.y.getValue();
    }

    public final int g() {
        return ((Number) this.z.getValue()).intValue();
    }

    /* access modifiers changed from: package-private */
    public final long h() {
        return ((Number) this.B.getValue()).longValue();
    }

    public final String j() {
        return (String) this.D.getValue();
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(7204);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.wallet.f.b.c
    public final void c() {
        com.bytedance.android.livesdk.l.a aVar = this.f12974g;
        if (aVar != null) {
            com.bytedance.android.livesdk.utils.p.b(aVar);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(7207);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            int i2;
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                i2 = arguments.getInt("key_bundle_can_exchange");
            } else {
                i2 = 0;
            }
            return Integer.valueOf(i2);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(7215);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String str;
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null || (str = arguments.getString("KEY_CHARGE_REASON")) == null) {
                str = "";
            }
            h.f.b.l.b(str, "");
            return str;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(7216);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            int i2;
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                i2 = arguments.getInt("key_bundle_charge_source");
            } else {
                i2 = 0;
            }
            return Integer.valueOf(i2);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(7217);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Boolean bool;
            DataChannel dataChannel = this.this$0.p;
            if (dataChannel == null || (bool = (Boolean) dataChannel.b(cp.class)) == null) {
                z = true;
            } else {
                z = bool.booleanValue();
            }
            return Boolean.valueOf(z);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(7219);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String str;
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null || (str = arguments.getString("key_bundle_previous_page")) == null) {
                str = "normal";
            }
            h.f.b.l.b(str, "");
            return str;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(7220);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String str;
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null || (str = arguments.getString("KEY_REQUEST_PAGE")) == null) {
                str = "live_detail";
            }
            h.f.b.l.b(str, "");
            return str;
        }
    }

    static final class x extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(7227);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            int i2;
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                i2 = arguments.getInt("key_bundle_show_balance");
            } else {
                i2 = 0;
            }
            return Integer.valueOf(i2);
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void dismiss() {
        com.bytedance.android.live.wallet.f.a.d dVar = this.f12975h;
        if (dVar != null) {
            dVar.b();
        }
        com.bytedance.android.live.wallet.f.a.d dVar2 = this.f12975h;
        if (dVar2 != null) {
            dVar2.f();
        }
        super.dismiss();
    }

    @Override // com.bytedance.android.live.wallet.f.b.b
    public final void l() {
        LoadingStatusView loadingStatusView;
        View view = getView();
        if (view != null && (loadingStatusView = (LoadingStatusView) view.findViewById(R.id.e_o)) != null) {
            loadingStatusView.setStatus(0);
        }
    }

    @Override // com.bytedance.android.live.wallet.f.b.b
    public final void m() {
        LoadingStatusView loadingStatusView;
        View view = getView();
        if (view != null && (loadingStatusView = (LoadingStatusView) view.findViewById(R.id.e_o)) != null) {
            loadingStatusView.a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        Application application;
        super.onDestroy();
        androidx.fragment.app.e activity = getActivity();
        if (activity != null && (application = activity.getApplication()) != null) {
            application.unregisterActivityLifecycleCallbacks(this.t);
        }
    }

    private static String p() {
        if (com.bytedance.android.livesdk.utils.p.a((CharSequence) LiveExchangeEntranceSchema.INSTANCE.getValue())) {
            return LiveExchangeEntranceSchema.INSTANCE.getValue();
        }
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IHostApp.class);
        h.f.b.l.b(a2, "");
        if (((IHostApp) a2).isInMusicallyRegion()) {
            return "sslocal://webcast_lynxview?type=popup&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_revenue%2Frevenue%2Fpages%2Fexchange%2Fpackage_exchange.js&height=446&radius=8&gravity=bottom&popup_enter_type=right";
        }
        return "sslocal://webcast_lynxview?type=popup&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue%2Frevenue%2Fpages%2Fexchange%2Fpackage_exchange.js&height=446&radius=8&gravity=bottom&popup_enter_type=right";
    }

    static final class o extends h.f.b.m implements h.f.a.a<Long> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(7218);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            long j2;
            long j3;
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                j2 = arguments.getLong("key_bundle_need_coins");
            } else {
                j2 = 0;
            }
            Bundle arguments2 = this.this$0.getArguments();
            if (arguments2 != null) {
                j3 = arguments2.getLong("key_bundle_total_coins");
            } else {
                j3 = 0;
            }
            com.bytedance.android.live.wallet.d walletCenter = ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter();
            h.f.b.l.b(walletCenter, "");
            long b2 = walletCenter.b();
            if (j2 == 0 && j3 > 0) {
                j2 = j3 - b2;
            }
            return Long.valueOf(j2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f12994a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f12995b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Exception f12996c;

        static {
            Covode.recordClassIndex(7221);
        }

        r(i iVar, int i2, Exception exc) {
            this.f12994a = iVar;
            this.f12995b = i2;
            this.f12996c = exc;
        }

        public final void run() {
            int i2;
            if (this.f12995b == 302 && !e.a.a()) {
                Context context = this.f12994a.getContext();
                if (context != null) {
                    h.f.b.l.b(context, "");
                    String string = context.getString(R.string.epd);
                    h.f.b.l.b(string, "");
                    String string2 = context.getString(R.string.epe);
                    h.f.b.l.b(string2, "");
                    String e2 = this.f12994a.e();
                    com.bytedance.android.livesdk.wallet.c cVar = this.f12994a.f12978k;
                    if (cVar != null) {
                        i2 = cVar.f22408d;
                    } else {
                        i2 = 0;
                    }
                    com.bytedance.android.live.wallet.g.a.a(context, string, string2, "context", "package", 302, new com.bytedance.android.livesdk.wallet.a.a(e2, i2));
                }
            } else if (this.f12996c != null) {
                com.bytedance.android.livesdk.utils.f.a(this.f12994a.getContext(), this.f12996c);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        int i2;
        int i3;
        int a2;
        int i4;
        if (d()) {
            i2 = R.layout.b82;
        } else {
            i2 = R.layout.b81;
        }
        v.b bVar = new v.b(i2);
        bVar.f22377d = d();
        if (d()) {
            i3 = 80;
        } else {
            i3 = 8388613;
        }
        bVar.f22380g = i3;
        if (d()) {
            a2 = -1;
        } else {
            a2 = com.bytedance.android.live.core.f.y.a(375.0f);
        }
        bVar.f22381h = a2;
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            if (d()) {
                i4 = -2;
            } else {
                i4 = com.bytedance.android.live.core.f.y.a(activity).heightPixels;
            }
            bVar.f22382i = i4;
        }
        return bVar;
    }

    public final void k() {
        Map<String, String> map;
        com.ss.android.common.util.g gVar;
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_recharge_lagersum_click").a(ag.a(h.v.a("request_page", j()), h.v.a("charge_reason", e()), h.v.a("charge_style", "window"), h.v.a("panel_type", "normal"), h.v.a("gift_enter_from", this.f12970c), h.v.a("pay_method", e.a.b())));
        com.bytedance.android.livesdkapi.depend.d.b.d dVar = this.f12968a;
        if (dVar != null) {
            map = dVar.f22950b;
        } else {
            map = null;
        }
        a2.a(map).a(this.p).b();
        if (com.bytedance.common.utility.m.a(com.ss.android.ugc.aweme.bf.d.a(com.bytedance.android.live.core.f.y.e(), "js_kv_methods_20191113", 0).getString("live_guide_show_discount_modal", "1"), "0")) {
            gVar = new com.ss.android.common.util.g(LiveWebRechargeUrl.INSTANCE.getValue());
            double b2 = (double) com.bytedance.android.live.core.f.y.b();
            Double.isNaN(b2);
            gVar.a("height", (int) com.bytedance.android.live.core.f.y.e((int) (b2 * 0.9d)));
        } else {
            gVar = new com.ss.android.common.util.g(LiveWebRechargeDialog.INSTANCE.getValue());
        }
        gVar.a("charge_reason", e());
        gVar.a("pay_method", "google_pay");
        gVar.a("request_page", j());
        Uri parse = Uri.parse(gVar.a());
        h.f.b.l.b(parse, "");
        ((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).handle(getContext(), parse);
    }

    /* access modifiers changed from: package-private */
    public static final class s implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f12997a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f12998b;

        static {
            Covode.recordClassIndex(7222);
        }

        s(i iVar, List list) {
            this.f12997a = iVar;
            this.f12998b = list;
        }

        public final void run() {
            int height;
            RtlViewPager rtlViewPager;
            String str;
            Object obj;
            String str2;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            RtlViewPager rtlViewPager2;
            ViewGroup.LayoutParams layoutParams;
            RtlViewPager rtlViewPager3;
            LinearLayout linearLayout;
            LiveTextView liveTextView;
            LiveButton liveButton;
            LinearLayout linearLayout2;
            ConstraintLayout constraintLayout;
            Map<String, String> map = null;
            if (this.f12997a.d()) {
                int b2 = com.bytedance.android.live.core.f.y.b() / 2;
                i iVar = this.f12997a;
                View view = iVar.getView();
                if (view == null || (constraintLayout = (ConstraintLayout) view.findViewById(R.id.em8)) == null) {
                    i2 = 0;
                } else {
                    i2 = constraintLayout.getHeight();
                }
                int i7 = i2 + 0;
                View view2 = iVar.getView();
                if (view2 == null || (linearLayout2 = (LinearLayout) view2.findViewById(R.id.ahf)) == null) {
                    i3 = 0;
                } else {
                    i3 = linearLayout2.getHeight();
                }
                int i8 = i7 + i3;
                View view3 = iVar.getView();
                if (view3 == null || (liveButton = (LiveButton) view3.findViewById(R.id.a4t)) == null) {
                    i4 = 0;
                } else {
                    i4 = liveButton.getHeight();
                }
                int i9 = i8 + i4;
                View view4 = iVar.getView();
                if (view4 == null || (liveTextView = (LiveTextView) view4.findViewById(R.id.eve)) == null) {
                    i5 = 0;
                } else {
                    i5 = liveTextView.getHeight();
                }
                int i10 = i9 + i5;
                View view5 = iVar.getView();
                if (view5 == null || (linearLayout = (LinearLayout) view5.findViewById(R.id.ik)) == null) {
                    i6 = 0;
                } else {
                    i6 = linearLayout.getHeight();
                }
                height = b2 - ((i10 + i6) + com.bytedance.android.live.core.f.y.a(56.0f));
                View view6 = this.f12997a.getView();
                if (!(view6 == null || (rtlViewPager2 = (RtlViewPager) view6.findViewById(R.id.fj_)) == null)) {
                    View view7 = this.f12997a.getView();
                    if (view7 == null || (rtlViewPager3 = (RtlViewPager) view7.findViewById(R.id.fj_)) == null || (layoutParams = rtlViewPager3.getLayoutParams()) == null) {
                        layoutParams = null;
                    } else {
                        layoutParams.height = height;
                    }
                    rtlViewPager2.setLayoutParams(layoutParams);
                }
            } else {
                View view8 = this.f12997a.getView();
                height = (view8 == null || (rtlViewPager = (RtlViewPager) view8.findViewById(R.id.fj_)) == null) ? 0 : rtlViewPager.getHeight();
            }
            int a2 = ((int) (((((float) height) * 1.0f) / ((float) com.bytedance.android.live.core.f.y.a(68.0f))) + 0.2f)) * 3;
            h.p[] pVarArr = new h.p[9];
            pVarArr[0] = h.v.a("request_page", this.f12997a.j());
            pVarArr[1] = h.v.a("charge_reason", this.f12997a.e());
            pVarArr[2] = h.v.a("charge_style", "window");
            pVarArr[3] = h.v.a("panel_type", "normal");
            com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(IGiftService.class);
            h.f.b.l.b(a3, "");
            String str3 = "1";
            if (((IGiftService) a3).isFirstRecharge()) {
                str = str3;
            } else {
                str = "0";
            }
            pVarArr[4] = h.v.a("is_first_recharge", str);
            DataChannel dataChannel = this.f12997a.p;
            if (dataChannel != null) {
                obj = dataChannel.b(ee.class);
            } else {
                obj = null;
            }
            if (h.f.b.l.a(obj, (Object) true)) {
                str2 = str3;
            } else {
                str2 = "0";
            }
            pVarArr[5] = h.v.a("is_anchor", str2);
            pVarArr[6] = h.v.a("package_show_num", String.valueOf(h.j.h.c(a2, this.f12998b.size())));
            if (this.f12997a.d()) {
                str3 = "0";
            }
            pVarArr[7] = h.v.a("is_landscape", str3);
            pVarArr[8] = h.v.a("model", Build.MODEL);
            com.bytedance.android.livesdk.ab.b a4 = b.a.a("livesdk_recharge_show_before_action").a(this.f12997a.p).a(ag.a(pVarArr));
            com.bytedance.android.livesdkapi.depend.d.b.d dVar = this.f12997a.f12968a;
            if (dVar != null) {
                map = dVar.f22950b;
            }
            a4.a(map).b();
        }
    }

    public static final class c implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f12984a;

        static {
            Covode.recordClassIndex(7206);
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            h.f.b.l.d(activity, "");
        }

        public final void onActivityDestroyed(Activity activity) {
            h.f.b.l.d(activity, "");
        }

        public final void onActivityPaused(Activity activity) {
            h.f.b.l.d(activity, "");
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(bundle, "");
        }

        public final void onActivityStarted(Activity activity) {
            h.f.b.l.d(activity, "");
        }

        public final void onActivityStopped(Activity activity) {
            h.f.b.l.d(activity, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(i iVar) {
            this.f12984a = iVar;
        }

        public final void onActivityResumed(Activity activity) {
            Integer num;
            String str;
            Object obj;
            h.f.b.l.d(activity, "");
            ComponentName componentName = activity.getComponentName();
            h.f.b.l.b(componentName, "");
            if (com.bytedance.common.utility.m.a("com.android.billingclient.api.ProxyBillingActivity", componentName.getClassName())) {
                h.p[] pVarArr = new h.p[10];
                pVarArr[0] = h.v.a("request_page", this.f12984a.j());
                pVarArr[1] = h.v.a("charge_reason", this.f12984a.e());
                pVarArr[2] = h.v.a("charge_style", "window");
                pVarArr[3] = h.v.a("panel_type", "normal");
                pVarArr[4] = h.v.a("pay_method", e.a.b());
                com.bytedance.android.livesdk.wallet.c cVar = this.f12984a.f12978k;
                Map<String, String> map = null;
                if (cVar != null) {
                    num = Integer.valueOf(cVar.f22408d);
                } else {
                    num = null;
                }
                pVarArr[5] = h.v.a("recharge_package", String.valueOf(num));
                com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IGiftService.class);
                h.f.b.l.b(a2, "");
                String str2 = "1";
                if (((IGiftService) a2).isFirstRecharge()) {
                    str = str2;
                } else {
                    str = "0";
                }
                pVarArr[6] = h.v.a("is_first_recharge", str);
                pVarArr[7] = h.v.a("second_entrance", this.f12984a.f());
                pVarArr[8] = h.v.a("timestamp", String.valueOf(com.bytedance.android.livesdk.utils.a.a.a()));
                DataChannel dataChannel = this.f12984a.p;
                if (dataChannel != null) {
                    obj = dataChannel.b(ee.class);
                } else {
                    obj = null;
                }
                if (!h.f.b.l.a(obj, (Object) true)) {
                    str2 = "0";
                }
                pVarArr[9] = h.v.a("is_anchor", str2);
                com.bytedance.android.livesdk.ab.b a3 = b.a.a("livesdk_recharge_pay").a(ag.a(pVarArr)).a("gift_enter_from", this.f12984a.f12970c);
                com.bytedance.android.livesdkapi.depend.d.b.d dVar = this.f12984a.f12968a;
                if (dVar != null) {
                    map = dVar.f22950b;
                }
                a3.a(map).a(this.f12984a.p).b();
            }
        }
    }

    public static final class j implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f12992a;

        static {
            Covode.recordClassIndex(7213);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(i iVar) {
            this.f12992a = iVar;
        }

        @Override // com.bytedance.android.live.wallet.adapter.a.b
        public final void a(int i2, int i3) {
            int i4;
            String str;
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_recharge_exchange_entrance").a(this.f12992a.p).a("request_page", "live_detail");
            if (i3 == 2) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            com.bytedance.android.livesdk.ab.b a3 = a2.a("could_exchange", i4);
            if (i2 == -1) {
                str = "ug_exchange";
            } else {
                str = "anchor_income";
            }
            a3.a("charge_reason", str).a("is_anchor", com.bytedance.android.livesdk.utils.p.f() ? 1 : 0).b();
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i2 == -1) {
                        ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.e29);
                    } else if (this.f12992a.g() == -2) {
                        com.bytedance.android.live.wallet.d walletCenter = ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter();
                        h.f.b.l.b(walletCenter, "");
                        com.bytedance.android.live.wallet.model.g f2 = walletCenter.f();
                        h.f.b.l.b(f2, "");
                        RevenueExchange revenueExchange = f2.f13234c;
                        if (revenueExchange == null || !revenueExchange.isRevenue()) {
                            ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.e4k);
                        } else {
                            ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.e4l);
                        }
                    }
                } else if (!this.f12992a.d()) {
                    this.f12992a.f12971d = true;
                    com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdkapi.f.a(1));
                } else {
                    this.f12992a.c(i2);
                }
            } else if (i2 == -1) {
                ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.e28);
            } else if (this.f12992a.g() == -2) {
                com.bytedance.android.live.wallet.d walletCenter2 = ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter();
                h.f.b.l.b(walletCenter2, "");
                com.bytedance.android.live.wallet.model.g f3 = walletCenter2.f();
                h.f.b.l.b(f3, "");
                RevenueExchange revenueExchange2 = f3.f13234c;
                if (revenueExchange2 == null || !revenueExchange2.isRevenue()) {
                    ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.e4i);
                } else {
                    ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.e4j);
                }
            }
        }

        @Override // com.bytedance.android.live.wallet.adapter.a.b
        public final void a(com.bytedance.android.livesdk.wallet.c cVar, int i2) {
            String str;
            Object obj;
            String str2;
            Map<String, String> map;
            h.f.b.l.d(cVar, "");
            this.f12992a.f12978k = cVar;
            h.p[] pVarArr = new h.p[9];
            pVarArr[0] = h.v.a("request_page", this.f12992a.j());
            pVarArr[1] = h.v.a("charge_reason", this.f12992a.e());
            pVarArr[2] = h.v.a("charge_style", "window");
            pVarArr[3] = h.v.a("panel_type", "normal");
            pVarArr[4] = h.v.a("pay_method", e.a.b());
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IGiftService.class);
            h.f.b.l.b(a2, "");
            String str3 = "1";
            if (((IGiftService) a2).isFirstRecharge()) {
                str = str3;
            } else {
                str = "0";
            }
            pVarArr[5] = h.v.a("is_first_recharge", str);
            pVarArr[6] = h.v.a("recharge_package", String.valueOf(cVar.f22408d));
            DataChannel dataChannel = this.f12992a.p;
            Map<String, String> map2 = null;
            if (dataChannel != null) {
                obj = dataChannel.b(ee.class);
            } else {
                obj = null;
            }
            if (!h.f.b.l.a(obj, (Object) true)) {
                str3 = "0";
            }
            pVarArr[7] = h.v.a("is_anchor", str3);
            if (i2 == 1) {
                str2 = "call";
            } else {
                str2 = "click";
            }
            pVarArr[8] = h.v.a("preview_type", str2);
            com.bytedance.android.livesdk.ab.b a3 = b.a.a("livesdk_recharge_preview").a(this.f12992a.p).a(ag.a(pVarArr));
            com.bytedance.android.livesdkapi.depend.d.b.d dVar = this.f12992a.f12968a;
            if (dVar != null) {
                map = dVar.f22950b;
            } else {
                map = null;
            }
            a3.a(map).b();
            if (cVar.f22410f == 2) {
                com.bytedance.android.livesdk.ab.b a4 = b.a.a("livesdk_recharge_lagersum_preview").a(this.f12992a.p).a(ag.a(h.v.a("request_page", this.f12992a.j()), h.v.a("charge_reason", this.f12992a.e()), h.v.a("charge_style", "window"), h.v.a("panel_type", "normal"), h.v.a("gift_enter_from", this.f12992a.f12970c), h.v.a("pay_method", e.a.b())));
                com.bytedance.android.livesdkapi.depend.d.b.d dVar2 = this.f12992a.f12968a;
                if (dVar2 != null) {
                    map2 = dVar2.f22950b;
                }
                a4.a(map2).b();
            }
        }

        @Override // com.bytedance.android.live.wallet.adapter.a.b
        public final void a(boolean z, int i2, com.bytedance.android.livesdk.wallet.c cVar) {
            String str;
            Object obj;
            h.f.b.l.d(cVar, "");
            if (z) {
                h.p[] pVarArr = new h.p[10];
                pVarArr[0] = h.v.a("request_page", this.f12992a.j());
                pVarArr[1] = h.v.a("charge_reason", this.f12992a.e());
                pVarArr[2] = h.v.a("charge_style", "window");
                pVarArr[3] = h.v.a("panel_type", "normal");
                pVarArr[4] = h.v.a("pay_method", e.a.b());
                com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IGiftService.class);
                h.f.b.l.b(a2, "");
                String str2 = "1";
                if (((IGiftService) a2).isFirstRecharge()) {
                    str = str2;
                } else {
                    str = "0";
                }
                pVarArr[5] = h.v.a("is_first_recharge", str);
                pVarArr[6] = h.v.a("recharge_package", String.valueOf(cVar.f22408d));
                DataChannel dataChannel = this.f12992a.p;
                Map<String, String> map = null;
                if (dataChannel != null) {
                    obj = dataChannel.b(ee.class);
                } else {
                    obj = null;
                }
                if (!h.f.b.l.a(obj, (Object) true)) {
                    str2 = "0";
                }
                pVarArr[7] = h.v.a("is_anchor", str2);
                pVarArr[8] = h.v.a("line", String.valueOf((i2 / 3) + 1));
                pVarArr[9] = h.v.a("position", String.valueOf(i2));
                com.bytedance.android.livesdk.ab.b a3 = b.a.a("livesdk_recharge_package_show").a(this.f12992a.p).a(ag.a(pVarArr));
                com.bytedance.android.livesdkapi.depend.d.b.d dVar = this.f12992a.f12968a;
                if (dVar != null) {
                    map = dVar.f22950b;
                }
                a3.a(map).b();
            }
        }
    }

    static final class u<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f13001a;

        static {
            Covode.recordClassIndex(7224);
        }

        u(i iVar) {
            this.f13001a = iVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f13001a.dismiss();
        }
    }

    static final class v<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f13002a;

        static {
            Covode.recordClassIndex(7225);
        }

        v(i iVar) {
            this.f13002a = iVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f13002a.onEvent((com.bytedance.android.livesdk.event.k) obj);
        }
    }

    public static final class y implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f13004a;

        static {
            Covode.recordClassIndex(7228);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        y(i iVar) {
            this.f13004a = iVar;
        }

        public final void onClick(View view) {
            ((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).handle(this.f13004a.getContext(), Uri.parse(new com.ss.android.common.util.g(WalletEducationPopupRechargeUrlSetting.INSTANCE.getValue()).a()));
        }
    }

    @Override // com.bytedance.android.live.wallet.f.b.c
    public final void b(int i2) {
        a(i2, true);
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f12993a;

        static {
            Covode.recordClassIndex(7214);
        }

        k(i iVar) {
            this.f12993a = iVar;
        }

        public final void onClick(View view) {
            com.bytedance.android.live.wallet.f.a.d dVar = this.f12993a.f12975h;
            if (dVar != null) {
                dVar.c();
            }
        }
    }

    public final void onEvent(com.bytedance.android.livesdk.event.k kVar) {
        if (kVar != null && kVar.f17201b) {
            a(kVar.f17200a, false);
        }
    }

    public final class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public final String f12981a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f12982b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f12983c;

        static {
            Covode.recordClassIndex(7205);
        }

        public final void onClick(View view) {
            h.f.b.l.d(view, "");
            ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager().a(this.f12982b, com.bytedance.android.livesdk.browser.c.e.b(this.f12981a));
        }

        public final void updateDrawState(TextPaint textPaint) {
            h.f.b.l.d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(com.bytedance.android.live.core.f.y.b((int) R.color.zv));
            textPaint.setUnderlineText(false);
            textPaint.setFakeBoldText(true);
        }

        public b(i iVar, String str, Context context) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(context, "");
            this.f12983c = iVar;
            this.f12981a = str;
            this.f12982b = context;
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f12985a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f12986b;

        static {
            Covode.recordClassIndex(7208);
        }

        e(i iVar, String str) {
            this.f12985a = iVar;
            this.f12986b = str;
        }

        public final void onClick(View view) {
            com.bytedance.android.livesdk.browser.c.d webViewManager = ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager();
            Context context = this.f12985a.getContext();
            d.a b2 = com.bytedance.android.livesdk.browser.c.e.b(this.f12986b);
            b2.f14292c = true;
            webViewManager.a(context, b2);
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f12987a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f12988b;

        static {
            Covode.recordClassIndex(7209);
        }

        f(i iVar, String str) {
            this.f12987a = iVar;
            this.f12988b = str;
        }

        public final void onClick(View view) {
            com.bytedance.android.livesdk.browser.c.d webViewManager = ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager();
            Context context = this.f12987a.getContext();
            d.a b2 = com.bytedance.android.livesdk.browser.c.e.b(this.f12988b);
            b2.f14292c = true;
            webViewManager.a(context, b2);
        }
    }

    public static final class t implements com.bytedance.android.livesdkapi.depend.d.b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f12999a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f13000b;

        static {
            Covode.recordClassIndex(7223);
        }

        @Override // com.bytedance.android.livesdkapi.depend.d.b.c
        public final void a(Throwable th) {
            int i2;
            h.f.b.l.d(th, "");
            if (th instanceof com.bytedance.android.live.a.a.a) {
                i2 = ((com.bytedance.android.live.a.a.a) th).getErrorCode();
            } else {
                i2 = 61;
            }
            com.bytedance.android.live.wallet.c.c.a("ttlive_update_wallet_info_order", i2, -1, "update info fail");
        }

        @Override // com.bytedance.android.livesdkapi.depend.d.b.c
        public final void a(long j2) {
            HashMap hashMap = new HashMap();
            long j3 = (long) this.f12999a;
            long j4 = this.f13000b;
            if (j3 + j4 == j2) {
                com.bytedance.android.live.wallet.c.c.a("ttlive_update_wallet_info_order", hashMap);
                return;
            }
            hashMap.put("originCoins", Long.valueOf(j4));
            hashMap.put("preCoins", Integer.valueOf(this.f12999a));
            hashMap.put("serverCoins", Long.valueOf(j2));
            com.bytedance.android.live.wallet.c.c.a("ttlive_update_wallet_info_order", 62, -1, "update info fail", hashMap);
        }

        t(int i2, long j2) {
            this.f12999a = i2;
            this.f13000b = j2;
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Application application;
        super.onCreate(bundle);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null && (application = activity.getApplication()) != null) {
            application.registerActivityLifecycleCallbacks(this.t);
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        com.bytedance.android.live.wallet.f.a.d dVar = this.f12975h;
        if (dVar != null) {
            dVar.b();
        }
        com.bytedance.android.live.wallet.f.a.d dVar2 = this.f12975h;
        if (dVar2 != null) {
            dVar2.f();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(com.bytedance.android.live.design.a.a.a(getActivity()));
        h.f.b.l.b(cloneInContext, "");
        return cloneInContext;
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f12990a;

        static {
            Covode.recordClassIndex(7211);
        }

        h(i iVar) {
            this.f12990a = iVar;
        }

        public final void onClick(View view) {
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IGiftService.class);
            h.f.b.l.b(a2, "");
            ((IGiftService) a2).getFirstRechargeManager().b(this.f12990a.getActivity(), this.f12990a.e());
            this.f12990a.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onConfigurationChanged(Configuration configuration) {
        h.f.b.l.d(configuration, "");
        super.onConfigurationChanged(configuration);
        if (configuration.orientation != 1) {
            return;
        }
        if (this.f12971d) {
            dismiss();
            c(g());
            this.f12971d = false;
        } else if (this.f12972e) {
            dismiss();
            k();
            this.f12972e = false;
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f12989a;

        static {
            Covode.recordClassIndex(7210);
        }

        g(i iVar) {
            this.f12989a = iVar;
        }

        public final void onClick(View view) {
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IGiftService.class);
            h.f.b.l.b(a2, "");
            if (!((IGiftService) a2).isFirstRecharge() || !(!h.f.b.l.a((Object) this.f12989a.f(), (Object) "other_recharge"))) {
                ((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).handle(this.f12989a.getContext(), Uri.parse(LiveRechargeFeedbackUrlSetting.INSTANCE.getValue()));
                b.a.a("livesdk_recharge_faq_click").a(this.f12989a.p).b();
                return;
            }
            ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).openRechargeFAQPage(this.f12989a.getActivity());
        }
    }

    @Override // com.bytedance.android.live.wallet.f.b.c
    public final void a(int i2) {
        String str;
        Resources resources;
        androidx.fragment.app.e activity = getActivity();
        if (activity == null || !activity.isFinishing()) {
            if (this.f12974g == null) {
                this.f12974g = new a.C0382a(getContext()).a();
            }
            com.bytedance.android.livesdk.l.a aVar = this.f12974g;
            if (aVar != null) {
                if (i2 == 0) {
                    str = "";
                } else {
                    Context context = getContext();
                    if (context == null || (resources = context.getResources()) == null) {
                        str = null;
                    } else {
                        str = resources.getString(i2);
                    }
                }
                aVar.a(str);
            }
            com.bytedance.android.livesdk.l.a aVar2 = this.f12974g;
            if (aVar2 != null) {
                com.bytedance.android.livesdk.utils.p.a(aVar2);
            }
        }
    }

    static final class w<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f13003a;

        static {
            Covode.recordClassIndex(7226);
        }

        w(i iVar) {
            this.f13003a = iVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ImageView imageView;
            LiveTextView liveTextView;
            LiveTextView liveTextView2;
            LiveTextView liveTextView3;
            i iVar = this.f13003a;
            if (iVar.h() > 0) {
                View view = iVar.getView();
                if (!(view == null || (liveTextView3 = (LiveTextView) view.findViewById(R.id.eyn)) == null)) {
                    liveTextView3.setVisibility(0);
                }
                String quantityString = iVar.getResources().getQuantityString(R.plurals.gh, (int) iVar.h(), String.valueOf(iVar.h()));
                h.f.b.l.b(quantityString, "");
                View view2 = iVar.getView();
                if (!(view2 == null || (liveTextView2 = (LiveTextView) view2.findViewById(R.id.eyn)) == null)) {
                    liveTextView2.setText(quantityString);
                }
            }
            com.bytedance.android.live.wallet.d walletCenter = ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter();
            h.f.b.l.b(walletCenter, "");
            long b2 = walletCenter.b();
            View view3 = iVar.getView();
            if (!(view3 == null || (liveTextView = (LiveTextView) view3.findViewById(R.id.eym)) == null)) {
                liveTextView.setText(String.valueOf(b2));
            }
            ImageView imageView2 = null;
            if (b2 < 0) {
                View view4 = iVar.getView();
                if (view4 != null) {
                    imageView2 = (ImageView) view4.findViewById(R.id.bwc);
                }
                com.bytedance.android.livesdk.utils.p.a((View) imageView2, true);
                View view5 = iVar.getView();
                if (view5 != null && (imageView = (ImageView) view5.findViewById(R.id.bwc)) != null) {
                    imageView.setOnClickListener(new y(iVar));
                    return;
                }
                return;
            }
            View view6 = iVar.getView();
            if (view6 != null) {
                imageView2 = (ImageView) view6.findViewById(R.id.bwc);
            }
            com.bytedance.android.livesdk.utils.p.a((View) imageView2, false);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.a.i$i  reason: collision with other inner class name */
    static final class View$OnClickListenerC0271i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f12991a;

        static {
            Covode.recordClassIndex(7212);
        }

        View$OnClickListenerC0271i(i iVar) {
            this.f12991a = iVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            if (com.bytedance.common.utility.m.a(r1, r0) != false) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r9) {
            /*
            // Method dump skipped, instructions count: 307
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.a.i.View$OnClickListenerC0271i.onClick(android.view.View):void");
        }
    }

    public final void c(int i2) {
        long j2;
        BalanceStructExtra balanceStructExtra;
        String str;
        long j3;
        long j4;
        int i3;
        long j5;
        CurrencyInfo currencyInfo;
        BasePackage basePackage;
        BasePackage basePackage2;
        BasePackage basePackage3;
        CurrencyInfo currencyInfo2;
        CurrencyInfo currencyInfo3;
        String str2;
        if (i2 != 0) {
            com.ss.android.common.util.g gVar = new com.ss.android.common.util.g(p());
            int i4 = 0;
            int i5 = 1;
            if (i2 == -1) {
                gVar.a("way", 0);
                com.bytedance.android.live.wallet.d walletCenter = ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter();
                h.f.b.l.b(walletCenter, "");
                BalanceStruct e2 = walletCenter.e();
                UserBalance userBalance = e2.getUserBalance();
                if (userBalance != null) {
                    double balance = (double) userBalance.getBalance();
                    double pow = Math.pow(10.0d, 2.0d);
                    Double.isNaN(balance);
                    str2 = com.a.a("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(balance / pow)}, 1));
                    h.f.b.l.b(str2, "");
                } else {
                    str2 = "0";
                }
                gVar.a("balance", str2);
                balanceStructExtra = e2.getExchangeInfo();
            } else {
                gVar.a("way", 1);
                com.bytedance.android.live.wallet.d walletCenter2 = ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter();
                h.f.b.l.b(walletCenter2, "");
                com.bytedance.android.live.wallet.model.g f2 = walletCenter2.f();
                Object[] objArr = new Object[1];
                h.f.b.l.b(f2, "");
                RevenueExchange revenueExchange = f2.f13234c;
                if (revenueExchange != null) {
                    j2 = revenueExchange.getBalance();
                } else {
                    j2 = 0;
                }
                double d2 = (double) j2;
                double pow2 = Math.pow(10.0d, 2.0d);
                Double.isNaN(d2);
                objArr[0] = Double.valueOf(d2 / pow2);
                String a2 = com.a.a("%.2f", Arrays.copyOf(objArr, 1));
                h.f.b.l.b(a2, "");
                gVar.a("balance", a2);
                RevenueExchange revenueExchange2 = f2.f13234c;
                if (revenueExchange2 == null || !revenueExchange2.isRevenue()) {
                    i5 = 0;
                }
                gVar.a("has_short_video_gift", i5);
                balanceStructExtra = f2.f13235d;
            }
            String str3 = null;
            if (balanceStructExtra == null || (currencyInfo3 = balanceStructExtra.getCurrencyInfo()) == null) {
                str = null;
            } else {
                str = currencyInfo3.getCode();
            }
            gVar.a("currency_code", str);
            if (!(balanceStructExtra == null || (currencyInfo2 = balanceStructExtra.getCurrencyInfo()) == null)) {
                str3 = currencyInfo2.getSymbol();
            }
            gVar.a("symbol", str3);
            if (balanceStructExtra == null || (basePackage3 = balanceStructExtra.getBasePackage()) == null) {
                j3 = 0;
            } else {
                j3 = basePackage3.getId();
            }
            gVar.a("base_package_id", j3);
            if (balanceStructExtra == null || (basePackage2 = balanceStructExtra.getBasePackage()) == null) {
                j4 = 0;
            } else {
                j4 = basePackage2.getPrice();
            }
            gVar.a("base_package_price", j4);
            if (balanceStructExtra == null || (basePackage = balanceStructExtra.getBasePackage()) == null) {
                i3 = 0;
            } else {
                i3 = basePackage.getRealDot();
            }
            gVar.a("real_dot", i3);
            if (balanceStructExtra != null) {
                j5 = balanceStructExtra.getMaxCoins();
            } else {
                j5 = 0;
            }
            gVar.a("max_coins", j5);
            if (!(balanceStructExtra == null || (currencyInfo = balanceStructExtra.getCurrencyInfo()) == null)) {
                i4 = currencyInfo.getKeepDot();
            }
            gVar.a("keep_dot", i4);
            gVar.a("is_anchor", com.bytedance.android.livesdk.utils.p.f() ? 1 : 0);
            Uri parse = Uri.parse(gVar.a());
            h.f.b.l.b(parse, "");
            ((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).handle(getContext(), parse);
        }
    }

    private final void b(DiamondPackageExtra diamondPackageExtra, List<? extends com.bytedance.android.livesdk.wallet.c> list) {
        com.bytedance.android.live.wallet.adapter.b bVar = this.u;
        if (bVar != null) {
            bVar.a(list);
        }
        com.bytedance.android.live.wallet.adapter.b bVar2 = this.u;
        if (bVar2 != null) {
            bVar2.f13036e = diamondPackageExtra;
        }
        com.bytedance.android.live.wallet.adapter.b bVar3 = this.u;
        if (bVar3 != null) {
            bVar3.f13037f = o();
        }
        com.bytedance.android.live.wallet.adapter.b bVar4 = this.u;
        if (bVar4 != null) {
            bVar4.notifyDataSetChanged();
        }
    }

    @Override // com.bytedance.android.live.wallet.f.b.b
    public final void a(DiamondPackageExtra diamondPackageExtra, List<com.bytedance.android.livesdk.wallet.c> list) {
        Integer num;
        LinearLayout linearLayout;
        ViewGroup.LayoutParams layoutParams;
        LinearLayout linearLayout2;
        h.f.b.l.d(list, "");
        if (this.f12969b instanceof androidx.fragment.app.e) {
            LinkedList linkedList = new LinkedList(list);
            if (!list.isEmpty() || g() != 0) {
                if (g() != 0 && list.isEmpty()) {
                    com.bytedance.android.livesdk.wallet.c cVar = new com.bytedance.android.livesdk.wallet.c();
                    cVar.f22410f = g();
                    linkedList.addFirst(cVar);
                    LiveButton liveButton = (LiveButton) a_(R.id.a4t);
                    if (liveButton != null) {
                        liveButton.setVisibility(8);
                    }
                    b(diamondPackageExtra, linkedList);
                } else if (list.isEmpty() || g() != 0) {
                    com.bytedance.android.livesdk.wallet.c cVar2 = new com.bytedance.android.livesdk.wallet.c();
                    cVar2.f22410f = g();
                    linkedList.addFirst(cVar2);
                    this.f12978k = list.get(0);
                    c(diamondPackageExtra, linkedList);
                    b(diamondPackageExtra, linkedList);
                } else {
                    this.f12978k = list.get(0);
                    c(diamondPackageExtra, linkedList);
                    b(diamondPackageExtra, linkedList);
                }
                View view = getView();
                if (!(view == null || (linearLayout = (LinearLayout) view.findViewById(R.id.cez)) == null || (layoutParams = linearLayout.getLayoutParams()) == null)) {
                    layoutParams.height = -2;
                    View view2 = getView();
                    if (!(view2 == null || (linearLayout2 = (LinearLayout) view2.findViewById(R.id.cez)) == null)) {
                        linearLayout2.setLayoutParams(layoutParams);
                    }
                }
                View view3 = getView();
                if (view3 != null) {
                    view3.post(new s(this, list));
                }
                com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_recharge_show_recommond").a(this.p);
                com.bytedance.android.livesdk.wallet.c cVar3 = this.f12978k;
                if (cVar3 != null) {
                    num = Integer.valueOf(cVar3.f22408d);
                } else {
                    num = null;
                }
                a2.a("recommend_package", (Number) num).b();
                return;
            }
            a(new Exception("rechargeList is empty"), 0);
        }
    }

    private final void a(int i2, boolean z2) {
        String str;
        Integer num;
        String str2;
        Object obj;
        Resources resources;
        DataChannel dataChannel = this.p;
        if (dataChannel != null) {
            dataChannel.b(com.bytedance.android.live.gift.q.class, Integer.valueOf(i2));
        }
        if (z2) {
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.event.k(i2));
        }
        Activity activity = this.f12969b;
        Map<String, String> map = null;
        if (activity == null || (resources = activity.getResources()) == null) {
            str = null;
        } else {
            str = resources.getString(R.string.glk);
        }
        ao.a(activity, str, 0);
        com.bytedance.android.live.wallet.d walletCenter = ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter();
        h.f.b.l.b(walletCenter, "");
        ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().a(new t(i2, walletCenter.b()));
        h.p[] pVarArr = new h.p[10];
        pVarArr[0] = h.v.a("pay_method", e.a.b());
        pVarArr[1] = h.v.a("charge_style", "window");
        pVarArr[2] = h.v.a("charge_reason", e());
        pVarArr[3] = h.v.a("request_page", j());
        pVarArr[4] = h.v.a("panel_type", "normal");
        com.bytedance.android.livesdk.wallet.c cVar = this.f12978k;
        if (cVar != null) {
            num = Integer.valueOf(cVar.f22408d);
        } else {
            num = null;
        }
        pVarArr[5] = h.v.a("recharge_package", String.valueOf(num));
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IGiftService.class);
        h.f.b.l.b(a2, "");
        String str3 = "1";
        if (((IGiftService) a2).isFirstRecharge()) {
            str2 = str3;
        } else {
            str2 = "0";
        }
        pVarArr[6] = h.v.a("is_first_recharge", str2);
        pVarArr[7] = h.v.a("second_entrance", f());
        pVarArr[8] = h.v.a("timestamp", String.valueOf(com.bytedance.android.livesdk.utils.a.a.a()));
        DataChannel dataChannel2 = this.p;
        if (dataChannel2 != null) {
            obj = dataChannel2.b(ee.class);
        } else {
            obj = null;
        }
        if (!h.f.b.l.a(obj, (Object) true)) {
            str3 = "0";
        }
        pVarArr[9] = h.v.a("is_anchor", str3);
        Map<String, String> b2 = ag.b(pVarArr);
        com.bytedance.android.livesdk.chatroom.d a3 = com.bytedance.android.livesdk.chatroom.d.a();
        h.f.b.l.b(a3, "");
        if (!com.bytedance.common.utility.m.a(a3.e())) {
            com.bytedance.android.livesdk.chatroom.d a4 = com.bytedance.android.livesdk.chatroom.d.a();
            h.f.b.l.b(a4, "");
            String e2 = a4.e();
            h.f.b.l.b(e2, "");
            b2.put("enter_live_method", e2);
        }
        com.bytedance.android.livesdk.ab.b a5 = b.a.a("livesdk_recharge_success").a(b2).a("gift_enter_from", this.f12970c);
        com.bytedance.android.livesdkapi.depend.d.b.d dVar = this.f12968a;
        if (dVar != null) {
            map = dVar.f22950b;
        }
        a5.a(map).a(this.p).b();
        dismiss();
    }

    private final void c(DiamondPackageExtra diamondPackageExtra, List<com.bytedance.android.livesdk.wallet.c> list) {
        Map<String, String> map;
        int size = list.size();
        if (h() > 0 && !com.bytedance.common.utility.collection.b.a((Collection) list)) {
            com.bytedance.android.live.wallet.adapter.b bVar = this.u;
            if (bVar != null) {
                bVar.f13035d = size - 1;
            }
            this.f12977j = list.get(size - 1);
            int size2 = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                } else if (((long) list.get(i2).f22408d) >= h()) {
                    com.bytedance.android.live.wallet.adapter.b bVar2 = this.u;
                    if (bVar2 != null) {
                        bVar2.f13035d = i2;
                    }
                    this.f12977j = list.get(i2);
                } else {
                    i2++;
                }
            }
        }
        if (diamondPackageExtra != null) {
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                if (diamondPackageExtra.recentlyPurchasedPacketId == list.get(i3).f22405a && list.get(i3).f22410f == 0) {
                    com.bytedance.android.live.wallet.adapter.b bVar3 = this.u;
                    if (bVar3 != null) {
                        bVar3.f13032a = i3;
                    }
                    this.f12976i = list.get(i3);
                }
                if (diamondPackageExtra.RecommendedPacketId == list.get(i3).f22405a && list.get(i3).f22410f == 0) {
                    com.bytedance.android.live.wallet.adapter.b bVar4 = this.u;
                    if (bVar4 != null) {
                        bVar4.f13033b = i3;
                    }
                    this.C = list.get(i3);
                }
            }
            if (diamondPackageExtra.officialRecharge && !LiveWebRechargeAuditing.INSTANCE.getValue()) {
                com.bytedance.android.livesdk.wallet.c cVar = new com.bytedance.android.livesdk.wallet.c();
                cVar.f22410f = 2;
                h.f.b.l.b(cVar, "");
                list.add(cVar);
                com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_recharge_lagersum_show").a(this.p).a(ag.b(h.v.a("pay_method", e.a.b()), h.v.a("charge_style", "window"), h.v.a("charge_reason", e()), h.v.a("request_page", j()), h.v.a("panel_type", "normal")));
                com.bytedance.android.livesdkapi.depend.d.b.d dVar = this.f12968a;
                if (dVar != null) {
                    map = dVar.f22950b;
                } else {
                    map = null;
                }
                a2.a(map).b();
            }
        }
        com.bytedance.android.livesdk.wallet.c cVar2 = this.f12977j;
        if (cVar2 != null) {
            this.f12978k = cVar2;
            return;
        }
        com.bytedance.android.livesdk.wallet.c cVar3 = this.C;
        if (cVar3 != null) {
            this.f12978k = cVar3;
            return;
        }
        com.bytedance.android.livesdk.wallet.c cVar4 = this.f12976i;
        if (cVar4 != null) {
            this.f12978k = cVar4;
        }
    }

    @Override // com.bytedance.android.live.wallet.f.b.b
    public final void a(Exception exc, int i2) {
        LoadingStatusView loadingStatusView;
        if (g() != 0) {
            m();
            a((DiamondPackageExtra) null, new ArrayList());
            return;
        }
        View view = getView();
        if (!(view == null || (loadingStatusView = (LoadingStatusView) view.findViewById(R.id.e_o)) == null)) {
            loadingStatusView.setStatus(2);
        }
        View view2 = getView();
        if (view2 != null) {
            view2.post(new r(this, i2, exc));
        }
        com.bytedance.android.live.wallet.adapter.b bVar = this.u;
        if (bVar != null) {
            bVar.a(z.INSTANCE);
        }
        com.bytedance.android.live.wallet.adapter.b bVar2 = this.u;
        if (bVar2 != null) {
            bVar2.f13036e = new DiamondPackageExtra();
        }
        com.bytedance.android.live.wallet.adapter.b bVar3 = this.u;
        if (bVar3 != null) {
            bVar3.notifyDataSetChanged();
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        ViewGroup.LayoutParams layoutParams;
        boolean z2;
        String str2;
        Map<String, String> map;
        Boolean bool;
        long j2;
        long j3;
        Room room;
        Long l2;
        View view2;
        TextView textView;
        Context context;
        int i2;
        LiveAutoRtlImageView liveAutoRtlImageView;
        ViewGroup.LayoutParams layoutParams2;
        MethodCollector.i(9426);
        h.f.b.l.d(view, "");
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("key_bundle_gift_from", "")) == null) {
            str = "";
        }
        this.f12970c = str;
        super.onViewCreated(view, bundle);
        if (d()) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.cez);
            if (!(linearLayout == null || (layoutParams2 = linearLayout.getLayoutParams()) == null)) {
                layoutParams2.height = com.bytedance.android.live.core.f.y.a(275.0f);
                LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.cez);
                if (linearLayout2 != null) {
                    linearLayout2.setLayoutParams(layoutParams2);
                }
            }
        } else {
            LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.cez);
            if (!(linearLayout3 == null || (layoutParams = linearLayout3.getLayoutParams()) == null)) {
                layoutParams.height = -1;
                layoutParams.width = com.bytedance.android.live.core.f.y.a(375.0f);
                LinearLayout linearLayout4 = (LinearLayout) view.findViewById(R.id.cez);
                if (linearLayout4 != null) {
                    linearLayout4.setLayoutParams(layoutParams);
                }
            }
        }
        Drawable c2 = com.bytedance.android.live.core.f.y.c(2131234418);
        int a2 = com.bytedance.android.live.core.f.y.a(16.0f);
        if (c2 != null) {
            c2.setBounds(0, 0, a2, a2);
        }
        if (com.bytedance.android.live.uikit.c.a.a(getContext())) {
            TextView textView2 = (TextView) view.findViewById(R.id.eym);
            if (textView2 != null) {
                textView2.setCompoundDrawables(null, null, c2, null);
            }
        } else {
            TextView textView3 = (TextView) view.findViewById(R.id.eym);
            if (textView3 != null) {
                textView3.setCompoundDrawables(c2, null, null, null);
            }
        }
        this.v = (FrameLayout) view.findViewById(R.id.akn);
        LiveAutoRtlImageView liveAutoRtlImageView2 = (LiveAutoRtlImageView) a_(R.id.b0_);
        if (liveAutoRtlImageView2 != null) {
            liveAutoRtlImageView2.setOnClickListener(new g(this));
        }
        com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(IGiftService.class);
        h.f.b.l.b(a3, "");
        if (((IGiftService) a3).isFirstRecharge() && !com.bytedance.android.live.core.f.y.f() && (liveAutoRtlImageView = (LiveAutoRtlImageView) a_(R.id.b0_)) != null) {
            liveAutoRtlImageView.setVisibility(8);
        }
        com.bytedance.android.live.base.a a4 = com.bytedance.android.live.t.a.a(IGiftService.class);
        h.f.b.l.b(a4, "");
        if (((IGiftService) a4).isFirstRecharge() && (textView = (TextView) view.findViewById(R.id.title)) != null) {
            if (!LiveFirstRechargeTitle.INSTANCE.getValue()) {
                context = view.getContext();
                i2 = R.string.eez;
            } else {
                context = view.getContext();
                i2 = R.string.ed3;
            }
            textView.setText(context.getString(i2));
        }
        this.f12973f = (LiveTextView) view.findViewById(R.id.b3o);
        com.bytedance.android.live.base.a a5 = com.bytedance.android.live.t.a.a(IGiftService.class);
        h.f.b.l.b(a5, "");
        if (((IGiftService) a5).isFirstRecharge()) {
            LiveTextView liveTextView = this.f12973f;
            if (liveTextView != null) {
                liveTextView.setVisibility(0);
            }
            LiveTextView liveTextView2 = this.f12973f;
            if (liveTextView2 != null) {
                liveTextView2.setText(view.getContext().getText(R.string.ed2));
            }
        }
        if (h.f.b.l.a((Object) f(), (Object) "other_recharge")) {
            View findViewById = view.findViewById(R.id.c9z);
            h.f.b.l.b(findViewById, "");
            findViewById.setVisibility(0);
            view.findViewById(R.id.c9z).setOnClickListener(new h(this));
        }
        com.bytedance.android.livesdkapi.depend.d.b.d dVar = this.f12968a;
        if (!(dVar == null || (view2 = dVar.f22949a) == null)) {
            ViewParent parent = view2.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(view2);
            }
            FrameLayout frameLayout = this.v;
            if (frameLayout != null) {
                frameLayout.addView(view2);
            }
        }
        LiveButton liveButton = (LiveButton) a_(R.id.a4t);
        if (liveButton != null) {
            liveButton.setVisibility(0);
        }
        LiveButton liveButton2 = (LiveButton) a_(R.id.a4t);
        if (liveButton2 != null) {
            liveButton2.setOnClickListener(new View$OnClickListenerC0271i(this));
        }
        RtlViewPager rtlViewPager = (RtlViewPager) view.findViewById(R.id.fj_);
        h.f.b.l.b(rtlViewPager, "");
        rtlViewPager.setOverScrollMode(2);
        this.u = new com.bytedance.android.live.wallet.adapter.b(new j(this));
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.fj_);
        if (viewPager != null) {
            viewPager.setAdapter(this.u);
        }
        View inflate = getLayoutInflater().inflate(R.layout.bc2, (ViewGroup) null);
        if (e.a.a()) {
            ((TextView) inflate.findViewById(R.id.title)).setText(R.string.egz);
        }
        View inflate2 = getLayoutInflater().inflate(R.layout.bc3, (ViewGroup) null);
        ((LiveButton) inflate.findViewById(R.id.button)).setOnClickListener(new k(this));
        LoadingStatusView.a b2 = LoadingStatusView.a.a(getContext()).b(R.string.gna);
        b2.f12918d = inflate;
        b2.f12916b = inflate2;
        ((LoadingStatusView) view.findViewById(R.id.e_o)).setBuilder(b2);
        LiveRechargeAgreementConfig value = LiveRoomRechargeAgreementConfigSetting.INSTANCE.getValue();
        if (value == null) {
            value = LiveRoomRechargeAgreementConfigSetting.INSTANCE.getDEFAULT();
        }
        boolean z3 = value.isShowRechargeLawInGlobal;
        LiveTextView liveTextView3 = (LiveTextView) view.findViewById(R.id.eve);
        if (z3) {
            h.f.b.l.b(liveTextView3, "");
            liveTextView3.setVisibility(0);
            String str3 = value.agreementForGlobal;
            String a6 = com.bytedance.android.live.core.f.y.a((int) R.string.eaz);
            String a7 = com.bytedance.android.live.core.f.y.a((int) R.string.e7b);
            h.f.b.l.b(a6, "");
            String a8 = com.a.a(a6, Arrays.copyOf(new Object[]{a7}, 1));
            h.f.b.l.b(a8, "");
            SpannableString spannableString = new SpannableString(a8);
            Context context2 = getContext();
            if (context2 != null) {
                h.f.b.l.b(str3, "");
                h.f.b.l.b(context2, "");
                b bVar = new b(this, str3, context2);
                h.f.b.l.b(a7, "");
                spannableString.setSpan(bVar, h.m.p.a((CharSequence) a8, a7, 0, false, 6), h.m.p.a((CharSequence) a8, a7, 0, false, 6) + a7.length(), 17);
            }
            liveTextView3.setText(spannableString);
            liveTextView3.setHighlightColor(com.bytedance.android.live.core.f.y.b((int) R.color.c9));
            liveTextView3.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            h.f.b.l.b(liveTextView3, "");
            liveTextView3.setVisibility(8);
        }
        LiveRechargeAgreementConfig value2 = LiveRoomRechargeAgreementConfigSetting.INSTANCE.getValue();
        if (value2 == null) {
            value2 = LiveRoomRechargeAgreementConfigSetting.INSTANCE.getDEFAULT();
        }
        boolean z4 = value2.isShowRechargeLawInRegion;
        LiveTextView liveTextView4 = (LiveTextView) view.findViewById(R.id.ezk);
        LiveTextView liveTextView5 = (LiveTextView) view.findViewById(R.id.f6r);
        LinearLayout linearLayout5 = (LinearLayout) view.findViewById(R.id.ik);
        if (z4) {
            h.f.b.l.b(linearLayout5, "");
            linearLayout5.setVisibility(0);
            String str4 = value2.agreementsForRegion.get(0).lawUrl;
            h.f.b.l.b(liveTextView4, "");
            liveTextView4.setText(value2.agreementsForRegion.get(0).lawName);
            liveTextView4.setOnClickListener(new e(this, str4));
            String str5 = value2.agreementsForRegion.get(1).lawUrl;
            h.f.b.l.b(liveTextView5, "");
            liveTextView5.setText(value2.agreementsForRegion.get(1).lawName);
            liveTextView5.setOnClickListener(new f(this, str5));
        } else {
            h.f.b.l.b(linearLayout5, "");
            linearLayout5.setVisibility(8);
        }
        Activity activity = this.f12969b;
        if (activity != null) {
            com.bytedance.android.live.wallet.c.b bVar2 = new com.bytedance.android.live.wallet.c.b(((Number) this.E.getValue()).intValue());
            DataChannel dataChannel = this.p;
            if (dataChannel == null || (l2 = (Long) dataChannel.b(di.class)) == null) {
                j2 = 0;
            } else {
                j2 = l2.longValue();
            }
            DataChannel dataChannel2 = this.p;
            if (dataChannel2 == null || (room = (Room) dataChannel2.b(df.class)) == null) {
                j3 = 0;
            } else {
                j3 = room.getOwnerUserId();
            }
            com.bytedance.android.live.wallet.f.a.d dVar2 = new com.bytedance.android.live.wallet.f.a.d(activity, bVar2, j2, j3);
            this.f12975h = dVar2;
            dVar2.e();
            com.bytedance.android.live.wallet.f.a.d dVar3 = this.f12975h;
            if (dVar3 != null) {
                dVar3.a((com.bytedance.ies.a.a) this);
            }
            com.bytedance.android.live.wallet.f.a.d dVar4 = this.f12975h;
            if (dVar4 != null) {
                dVar4.f13155e = this.f12980m;
            }
        }
        DataChannel dataChannel3 = this.p;
        if (dataChannel3 == null || (bool = (Boolean) dataChannel3.b(ee.class)) == null) {
            z2 = false;
        } else {
            z2 = bool.booleanValue();
        }
        h.p[] pVarArr = new h.p[10];
        pVarArr[0] = h.v.a("request_page", j());
        pVarArr[1] = h.v.a("charge_reason", e());
        pVarArr[2] = h.v.a("charge_style", "window");
        pVarArr[3] = h.v.a("panel_type", "normal");
        pVarArr[4] = h.v.a("gift_enter_from", this.f12970c);
        pVarArr[5] = h.v.a("pay_method", e.a.b());
        com.bytedance.android.live.base.a a9 = com.bytedance.android.live.t.a.a(IGiftService.class);
        h.f.b.l.b(a9, "");
        String str6 = "1";
        if (((IGiftService) a9).isFirstRecharge()) {
            str2 = str6;
        } else {
            str2 = "0";
        }
        pVarArr[6] = h.v.a("is_first_recharge", str2);
        pVarArr[7] = h.v.a("second_entrance", f());
        pVarArr[8] = h.v.a("timestamp", String.valueOf(com.bytedance.android.livesdk.utils.a.a.a()));
        if (!z2) {
            str6 = "0";
        }
        pVarArr[9] = h.v.a("is_anchor", str6);
        com.bytedance.android.livesdk.ab.b a10 = b.a.a("livesdk_recharge_show").a(ag.a(pVarArr));
        com.bytedance.android.livesdkapi.depend.d.b.d dVar5 = this.f12968a;
        if (dVar5 != null) {
            map = dVar5.f22950b;
        } else {
            map = null;
        }
        a10.a(map).a(this.p).b();
        ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.live.wallet.model.d.class).a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a((Fragment) this))).a(new u(this));
        ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.event.k.class).a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a((Fragment) this))).a(new v(this));
        if (com.bytedance.android.live.t.a.a(IWalletService.class) != null) {
            ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().a().a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a((Fragment) this))).a(new w(this));
            ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().d();
        } else {
            b.a.a("livesdk_recharge_service_error").a(this.p).b();
        }
        if (!(!com.bytedance.android.live.wallet.e.f13122g.a().isEmpty()) || com.bytedance.android.live.wallet.e.f13122g.f13128e == null) {
            com.bytedance.android.live.wallet.f.a.d dVar6 = this.f12975h;
            if (dVar6 != null) {
                dVar6.c();
                MethodCollector.o(9426);
                return;
            }
            MethodCollector.o(9426);
            return;
        }
        m();
        a(com.bytedance.android.live.wallet.e.f13122g.f13128e, com.bytedance.android.live.wallet.e.f13122g.a());
        com.bytedance.android.livesdkapi.depend.d.b.b bVar3 = this.f12980m;
        if (bVar3 != null) {
            bVar3.a(1, 0, "ok");
            MethodCollector.o(9426);
            return;
        }
        MethodCollector.o(9426);
    }

    @Override // com.bytedance.android.live.wallet.f.b.c
    public final void a(int i2, int i3, int i4, Exception exc) {
        int i5;
        String e2 = e();
        com.bytedance.android.livesdk.wallet.c cVar = this.f12978k;
        if (cVar != null) {
            i5 = cVar.f22408d;
        } else {
            i5 = 0;
        }
        com.bytedance.android.live.wallet.g.a.a(new com.bytedance.android.livesdk.wallet.a.a(i2, i3, i4, exc, true, e2, i5, false), getContext());
    }
}
