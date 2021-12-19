package com.bytedance.android.livesdk.browser.d;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.b.j;
import com.bytedance.android.live.b.o;
import com.bytedance.android.live.core.f.ag;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.browser.c.c;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.browser.d.h;
import com.bytedance.android.livesdk.browser.jsbridge.b;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.bf;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.n;
import com.bytedance.android.livesdk.container.behavior.ContainerBottomSheetBehavior;
import com.bytedance.android.livesdk.lynx.ui.a;
import com.bytedance.android.livesdk.lynx.ui.e;
import com.bytedance.android.livesdk.utils.ah;
import com.bytedance.android.livesdk.widget.roundcorner.RoundCornerConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.lang.ref.WeakReference;

public class a extends com.bytedance.android.live.core.widget.a implements c, h.a, b, a.b {
    private View A;
    private View B;
    private View C;
    private View D;
    private View E;
    private View F;
    private View G;
    private TextView H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private String N;
    private boolean O;
    private int P;
    private int Q;
    private int R;
    private boolean S;
    private long T;
    private long U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private int Z;
    private String aa;
    private boolean ab;
    private boolean ac;
    private o ad;
    private String ae;
    private String af;
    private int ag;
    private boolean ah;
    private float ai;
    private boolean aj;
    private int ak = -1;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f14330e;

    /* renamed from: f  reason: collision with root package name */
    View f14331f;

    /* renamed from: g  reason: collision with root package name */
    boolean f14332g;

    /* renamed from: h  reason: collision with root package name */
    String f14333h;

    /* renamed from: i  reason: collision with root package name */
    String f14334i;

    /* renamed from: j  reason: collision with root package name */
    public int f14335j;

    /* renamed from: k  reason: collision with root package name */
    int f14336k;

    /* renamed from: l  reason: collision with root package name */
    int f14337l;

    /* renamed from: m  reason: collision with root package name */
    int f14338m;
    int n;
    int o;
    public com.bytedance.android.livesdk.lynx.ui.a p;
    public boolean q;
    public com.bytedance.android.live.b.h r;
    public int s;
    public boolean t = true;
    public f.a u;
    public String v = "";
    public String w = "bottom";
    private View x;
    private View y;
    private View z;

    static {
        Covode.recordClassIndex(7938);
    }

    @Override // com.bytedance.android.livesdk.lynx.ui.a.b
    public final void f() {
        this.S = true;
    }

    @Override // com.bytedance.android.livesdk.browser.c.c
    public final void b() {
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.live.a
    public void dismiss() {
        dismissAllowingStateLoss();
    }

    @Override // com.bytedance.android.livesdk.lynx.ui.a.b
    public final void g() {
        dismissAllowingStateLoss();
    }

    private boolean h() {
        if (this.P == 0 && this.f14335j == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.live.a
    public void dismissAllowingStateLoss() {
        com.bytedance.android.livesdk.container.util.b.a(this.C, this.w, this.ac, new h.f.a.a<z>() {
            /* class com.bytedance.android.livesdk.browser.d.a.AnonymousClass7 */

            static {
                Covode.recordClassIndex(7945);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                a.super.dismissAllowingStateLoss();
                return z.f158842a;
            }
        });
    }

    @Override // com.bytedance.android.live.core.widget.a
    public final String j_() {
        com.bytedance.android.livesdk.lynx.ui.a aVar = this.p;
        if (aVar == null) {
            return "";
        }
        return aVar.K;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment, com.bytedance.android.live.core.widget.a
    public void onDestroyView() {
        super.onDestroyView();
        o oVar = this.ad;
        if (oVar != null) {
            oVar.c();
        }
    }

    @Override // com.bytedance.android.livesdk.browser.c.c
    public final WebView c() {
        com.bytedance.android.livesdk.lynx.ui.a aVar = this.p;
        if (aVar == null || !(aVar.f() instanceof WebView)) {
            return null;
        }
        return (WebView) this.p.f();
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.android.live.core.widget.a
    public void onDestroy() {
        super.onDestroy();
        f fVar = (f) com.bytedance.android.live.t.a.a(f.class);
        if (fVar != null) {
            fVar.getHybridDialogManager().a(this);
        }
        o oVar = this.ad;
        if (oVar != null) {
            oVar.d();
        }
    }

    @Override // com.bytedance.android.livesdk.lynx.ui.a.b
    public final void d() {
        long currentTimeMillis = System.currentTimeMillis();
        this.U = currentTimeMillis;
        com.bytedance.android.live.core.c.a.a(3, "onPageStarted", String.valueOf(currentTimeMillis - this.T));
        this.S = false;
        if (this.f9302b) {
            this.y.setVisibility(8);
        }
    }

    private com.bytedance.android.livesdk.lynx.ui.a i() {
        Bundle bundle = new Bundle();
        bundle.putString("url", this.f14334i);
        bundle.putString("original_scheme", this.ae);
        bundle.putBoolean("bundle_user_webview_title", false);
        bundle.putBoolean("hide_nav_bar", true);
        bundle.putBoolean("shouldChangeBgResIntoTransparent", this.M);
        int i2 = this.Z;
        if (i2 != -1) {
            bundle.putInt("bundle_web_view_background_color", i2);
        }
        if (this.ag == e.b.LYNX.ordinal()) {
            this.x.setBackgroundColor(this.ak);
            bundle.putString("fallback_url", this.af);
            bundle.putInt("bundle_preset_width", y.a((float) this.P));
            Fragment createLynxFragment = ((com.bytedance.android.livesdk.lynx.c) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.lynx.c.class)).createLynxFragment(getContext(), bundle);
            if (createLynxFragment == null) {
                try {
                    Uri parse = Uri.parse(this.af);
                    if (!TextUtils.equals("webcast_webview", parse.getHost())) {
                        f.a aVar = this.u;
                        if (aVar != null) {
                            aVar.a(this.af);
                        } else {
                            ((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).handle(getContext(), this.af);
                            dismissAllowingStateLoss();
                            return null;
                        }
                    } else {
                        bundle.putString("url", parse.getQueryParameter("url"));
                    }
                } catch (Exception e2) {
                    com.bytedance.android.live.core.c.a.a("HybridDialogFragment", e2);
                }
            } else if (createLynxFragment instanceof com.bytedance.android.livesdk.lynx.ui.a) {
                com.bytedance.android.livesdk.lynx.ui.a aVar2 = (com.bytedance.android.livesdk.lynx.ui.a) createLynxFragment;
                aVar2.G = this;
                aVar2.I = this.u;
                return aVar2;
            } else {
                com.bytedance.android.live.core.c.a.a(6, "HybridDialogFragment", "fragment is not AbsHybridFragment");
                return null;
            }
        }
        h hVar = new h();
        hVar.setArguments(bundle);
        hVar.G = this;
        hVar.f14357c = this.r;
        hVar.E = this.aa;
        return hVar;
    }

    @Override // com.bytedance.android.livesdk.lynx.ui.a.b
    public final void e() {
        View view;
        com.bytedance.android.live.core.c.a.a(3, "onPageStarted", String.valueOf(System.currentTimeMillis() - this.U));
        if (this.f9302b) {
            if (this.L && (view = this.f14331f) != null) {
                view.setVisibility(8);
            }
            if (this.M) {
                this.Z = 0;
                if (c() != null) {
                    c().setBackgroundColor(this.Z);
                }
            }
            if (this.S || ((this.p.f() instanceof WebView) && TextUtils.equals(((WebView) this.p.f()).getUrl(), "about:blank"))) {
                this.y.setVisibility(0);
            } else {
                this.y.setVisibility(8);
            }
            if (this.q) {
                int i2 = this.f14336k;
                if (i2 > 0) {
                    a(i2);
                } else {
                    a(this.f14337l, this.f14338m, this.n, this.o);
                }
            }
            o oVar = this.ad;
            if (oVar != null) {
                oVar.b();
            }
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.live.core.widget.a
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    public final void a(boolean z2) {
        setCancelable(z2);
        getDialog().setCanceledOnTouchOutside(z2);
    }

    @Override // androidx.fragment.app.d
    public Dialog onCreateDialog(Bundle bundle) {
        AnonymousClass1 r2 = new Dialog(getContext(), getTheme()) {
            /* class com.bytedance.android.livesdk.browser.d.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(7939);
            }

            public final void onBackPressed() {
                if (a.this.mCancelable) {
                    a.this.dismissAllowingStateLoss();
                }
            }
        };
        r2.requestWindowFeature(1);
        return r2;
    }

    public final void a(int i2) {
        if (i2 > 0) {
            if (this.x instanceof RoundCornerConstraintLayout) {
                int a2 = y.a((float) i2);
                ((RoundCornerConstraintLayout) this.x).a(a2, a2, a2, a2);
                return;
            }
            ag.a(this.C, y.a((float) i2));
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        if (getDialog() != null && (window = getDialog().getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            window.getDecorView().setPadding(0, 0, 0, 0);
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 80;
            attributes.dimAmount = 0.0f;
            window.setAttributes(attributes);
            getDialog();
            a(this.P, this.f14335j);
            if (this.aj) {
                window.addFlags(65792);
                window.setSoftInputMode(48);
            }
            int i2 = this.f14336k;
            if (i2 != 0) {
                a(i2);
            } else {
                a(this.f14337l, this.f14338m, this.o, this.n);
            }
            window.setBackgroundDrawable(new ColorDrawable());
            if (h()) {
                window.addFlags(32);
            }
            window.setFlags(1024, 1024);
            if (this.K) {
                getDialog().setOnKeyListener(new DialogInterface.OnKeyListener() {
                    /* class com.bytedance.android.livesdk.browser.d.a.AnonymousClass6 */

                    static {
                        Covode.recordClassIndex(7944);
                    }

                    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                        if (i2 != 4 || a.this.p.f() == null) {
                            return false;
                        }
                        View f2 = a.this.p.f();
                        if (!(f2 instanceof WebView)) {
                            return false;
                        }
                        WebView webView = (WebView) f2;
                        if (!webView.canGoBack()) {
                            return false;
                        }
                        webView.goBack();
                        return true;
                    }
                });
            }
        }
    }

    @Override // com.bytedance.android.livesdk.browser.d.h.a
    public final void a(com.bytedance.android.livesdk.browser.c.a aVar) {
        aVar.a(this.v);
        aVar.a().a("close", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new n(this));
        aVar.a().a("setHotsoon", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new bf(this));
        aVar.a().a("setLive", (com.bytedance.ies.web.jsbridge2.f<?, ?>) new bf(this));
        aVar.c().a("open_live", new com.bytedance.android.livesdk.browser.jsbridge.d.a.a(new WeakReference(getActivity()), this, this.v));
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment, com.bytedance.android.live.core.widget.a
    public void onCreate(Bundle bundle) {
        boolean z2;
        int i2;
        Uri parse;
        int b2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && !this.ah) {
            this.f14334i = arguments.getString("arg_url");
            this.P = arguments.getInt("arg_width");
            this.f14335j = arguments.getInt("arg_height");
            this.R = arguments.getInt("arg_margin");
            this.f14336k = arguments.getInt("arg_radius");
            this.f14337l = arguments.getInt("arg_radius_top_left");
            this.f14338m = arguments.getInt("arg_radius_top_right");
            this.o = arguments.getInt("arg_radius_bottom_right");
            this.n = arguments.getInt("arg_radius_bottom_left");
            this.Q = arguments.getInt("arg_gravity");
            this.Z = arguments.getInt("arg_background_res");
            this.aa = arguments.getString("arg_monitor_page_service");
            this.q = arguments.getBoolean("arg_use_bottom_close");
            this.V = arguments.getBoolean("arg_landscape_custom_height");
            this.W = arguments.getBoolean("arg_landscape_custom_gravity");
            this.Y = arguments.getBoolean("arg_show_dim");
            this.ab = arguments.getBoolean("arg_enable_pull_down_close", false);
            this.s = arguments.getInt("arg_variable_height", 0);
            this.t = arguments.getBoolean("arg_cancel_on_touch_outside");
            this.I = arguments.getBoolean("arg_enable_title_bar");
            this.J = arguments.getBoolean("arg_enable_title_share");
            this.f14332g = arguments.getBoolean("arg_enable_title_share_add_report_action");
            this.f14333h = arguments.getString("arg_report_schema");
            this.O = arguments.getBoolean("arg_enable_title_close");
            this.N = arguments.getString("arg_title");
            this.K = arguments.getBoolean("arg_use_page_back");
            this.L = arguments.getBoolean("arg_use_native_loading");
            this.M = arguments.getBoolean("arg_should_change_bg_res_into_transparent");
            this.ae = arguments.getString("arg_original_scheme");
            this.af = arguments.getString("fallback_schema");
            this.v = arguments.getString("arg_from_label");
            this.ag = arguments.getInt("hybrid_type", e.b.H5.ordinal());
            this.w = arguments.getString("arg_enter_type", "bottom");
            this.ai = arguments.getFloat("arg_mask_alpha");
            this.ak = arguments.getInt("arg_web_bg_color", -1);
            this.ah = true;
        }
        if (getActivity().getRequestedOrientation() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.ac = z2;
        if (z2) {
            i2 = R.style.a2l;
        } else {
            i2 = R.style.a2k;
        }
        setStyle(1, i2);
        if (getActivity().getRequestedOrientation() == 0) {
            if (!this.V) {
                this.R = 8;
                this.f14336k = 8;
                this.f14335j = (int) y.e(y.b() - (this.R * 2));
                this.P = 375;
            }
            if (!this.W) {
                this.Q = 8388693;
            }
            if (this.X) {
                this.R = 0;
                this.f14336k = 0;
                this.f14337l = 0;
                this.f14338m = 0;
                this.n = 0;
                this.o = 0;
                this.f14335j = (int) y.e(y.b());
                this.P = 375;
                this.Z = -16777216;
            }
        }
        if (this.P <= 0) {
            this.P = 300;
        }
        if (!TextUtils.isEmpty(this.f14334i) && (parse = Uri.parse(this.f14334i)) != null && (b2 = ah.b(parse.getQueryParameter("height"))) > 0) {
            this.f14335j = b2;
        }
        if (getActivity().getRequestedOrientation() == 0 && ((float) this.f14335j) > y.e(y.b())) {
            this.f14335j = (int) y.e(y.b() - (this.R * 2));
        }
        if (this.f14335j <= 0) {
            this.f14335j = 400;
        }
        if (this.q) {
            this.f14335j += 48;
        }
        if (this.f14336k < 0) {
            this.f14336k = 0;
        }
        if (this.f14337l < 0) {
            this.f14337l = 0;
        }
        if (this.f14338m < 0) {
            this.f14338m = 0;
        }
        if (this.o < 0) {
            this.o = 0;
        }
        if (this.n < 0) {
            this.n = 0;
        }
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.b
    public final <T> void a(String str, T t2) {
        com.bytedance.android.livesdk.lynx.ui.a aVar = this.p;
        if (aVar instanceof b) {
            aVar.a(str, t2);
        }
    }

    public final void a(int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = this.C.getLayoutParams();
        layoutParams.width = y.a((float) i2);
        int i4 = this.s;
        if (i4 == 0) {
            i4 = y.a((float) i3);
        }
        if (this.I) {
            i4 = y.a((float) i3);
        }
        layoutParams.height = i4;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = this.Q;
        }
        if (this.s > 0) {
            getView().post(new g(this, i3));
        }
        this.C.setLayoutParams(layoutParams);
        this.C.requestLayout();
    }

    public static a a(d.b bVar, o oVar) {
        com.bytedance.android.livesdk.browser.g.a.a(bVar.f14300a);
        if (TextUtils.equals(Uri.parse(bVar.f14300a).getQueryParameter("landscape"), "1")) {
            bVar.o = true;
        }
        a aVar = new a();
        aVar.f14334i = bVar.f14300a;
        aVar.P = bVar.f14301b;
        aVar.f14335j = bVar.f14302c;
        aVar.Q = bVar.f14309j;
        aVar.f14336k = bVar.f14304e;
        aVar.R = bVar.f14303d;
        aVar.f14337l = bVar.f14305f;
        aVar.f14338m = bVar.f14306g;
        aVar.o = bVar.f14307h;
        aVar.n = bVar.f14308i;
        aVar.q = bVar.f14312m;
        aVar.r = bVar.u;
        aVar.V = bVar.n;
        aVar.X = bVar.o;
        aVar.W = bVar.p;
        aVar.Y = bVar.q;
        aVar.ab = bVar.H;
        aVar.s = bVar.I;
        aVar.Z = bVar.f14310k;
        aVar.aa = bVar.v;
        aVar.t = bVar.w;
        aVar.I = bVar.y;
        aVar.J = bVar.z;
        aVar.f14332g = bVar.A;
        aVar.f14333h = bVar.B;
        aVar.O = bVar.C;
        aVar.N = bVar.x;
        aVar.K = bVar.r;
        aVar.L = bVar.s;
        aVar.M = bVar.t;
        aVar.v = bVar.D;
        aVar.ae = bVar.E;
        aVar.w = bVar.F;
        aVar.ai = bVar.G;
        aVar.aj = bVar.J;
        aVar.ah = true;
        aVar.ad = oVar;
        if (oVar != null) {
            l.d(aVar, "");
            oVar.f7350a = aVar;
        }
        return aVar;
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.android.live.core.widget.a
    public void onViewCreated(View view, Bundle bundle) {
        boolean z2;
        super.onViewCreated(view, bundle);
        o oVar = this.ad;
        if (oVar != null) {
            oVar.a(view, bundle);
        }
        com.bytedance.android.livesdk.container.util.b.a(this.C, this.w, this.ac);
        if (this.ac) {
            ((CoordinatorLayout.e) this.x.getLayoutParams()).a((CoordinatorLayout.b) null);
            this.x.requestLayout();
            return;
        }
        ContainerBottomSheetBehavior b2 = ContainerBottomSheetBehavior.b(this.x);
        if (this.ag == e.b.H5.ordinal()) {
            z2 = true;
        } else {
            z2 = false;
        }
        b2.v = z2;
        b2.b(y.a((float) this.f14335j));
        if (this.Q == 80) {
            if (this.ab) {
                b2.b(true);
                b2.a(new com.bytedance.android.livesdk.container.g.a() {
                    /* class com.bytedance.android.livesdk.browser.d.a.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(7940);
                    }

                    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.a, com.bytedance.android.livesdk.container.g.a
                    public final void a(View view, int i2) {
                        if (i2 == 5) {
                            a.this.dismissAllowingStateLoss();
                        }
                    }
                });
            } else {
                b2.b(false);
            }
            if (this.s > 0) {
                ImageView imageView = this.f14330e;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                b2.a(new com.bytedance.android.livesdk.container.g.a() {
                    /* class com.bytedance.android.livesdk.browser.d.a.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(7941);
                    }

                    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.a, com.bytedance.android.livesdk.container.g.a
                    public final void a(View view, float f2) {
                        super.a(view, f2);
                        int a2 = y.a((float) a.this.f14335j);
                        int i2 = (int) (((float) a2) + (((float) (a.this.s - a2)) * f2));
                        View f3 = a.this.p.f();
                        if (f3 != null) {
                            com.bytedance.android.livesdk.container.e.a.a(f3, i2);
                        }
                    }

                    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.a, com.bytedance.android.livesdk.container.g.a
                    public final void a(View view, int i2) {
                        super.a(view, i2);
                        if (a.this.f14330e != null) {
                            if (i2 == 3) {
                                a.this.f14330e.setImageResource(2131234816);
                            } else if (i2 == 4) {
                                a.this.f14330e.setImageResource(2131234817);
                            }
                        }
                    }
                });
                return;
            }
            ImageView imageView2 = this.f14330e;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                return;
            }
            return;
        }
        b2.f9512m = false;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view;
        int i3;
        int i4;
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        this.T = currentTimeMillis;
        com.bytedance.android.live.core.c.a.a(3, "onCreateView", String.valueOf(currentTimeMillis));
        LayoutInflater from = LayoutInflater.from(getContext());
        o oVar = this.ad;
        if (oVar == null || oVar.a() <= 0) {
            i2 = R.layout.b56;
        } else {
            i2 = this.ad.a();
        }
        View a2 = com.a.a(from, i2, viewGroup, false);
        this.x = a2.findViewById(R.id.dqk);
        this.A = a2.findViewById(R.id.ad7);
        this.B = a2.findViewById(R.id.d7k);
        this.C = a2.findViewById(R.id.adb);
        this.D = a2.findViewById(R.id.em8);
        this.y = a2.findViewById(R.id.dmf);
        this.z = a2.findViewById(R.id.fm3);
        this.G = a2.findViewById(R.id.bun);
        this.E = a2.findViewById(R.id.ema);
        this.F = a2.findViewById(R.id.emf);
        this.H = (TextView) a2.findViewById(R.id.emg);
        this.f14331f = a2.findViewById(R.id.ci9);
        this.f14330e = (ImageView) a2.findViewById(R.id.bhd);
        if (h() || !this.t) {
            getDialog().hide();
        } else {
            a(true);
        }
        ViewGroup.LayoutParams layoutParams = this.z.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        }
        marginLayoutParams.setMargins(y.a((float) this.R), y.a((float) this.R), y.a((float) this.R), y.a((float) this.R));
        this.z.setLayoutParams(marginLayoutParams);
        com.bytedance.android.livesdk.lynx.ui.a i5 = i();
        this.p = i5;
        if (i5 == null) {
            return a2;
        }
        androidx.fragment.app.n a3 = getChildFragmentManager().a();
        a3.b(R.id.fm3, this.p);
        a3.c();
        this.p.H = this;
        f fVar = (f) com.bytedance.android.live.t.a.a(f.class);
        if (fVar != null) {
            j hybridDialogManager = fVar.getHybridDialogManager();
            if (TextUtils.isEmpty(this.v)) {
                str = "ungroup";
            } else {
                str = this.v;
            }
            hybridDialogManager.a(str, this);
        }
        this.B.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.android.livesdk.browser.d.a.AnonymousClass4 */

            static {
                Covode.recordClassIndex(7942);
            }

            public final void onClick(View view) {
                if (a.this.t) {
                    a.this.dismissAllowingStateLoss();
                }
                com.bytedance.ies.xbridge.e.a aVar = new com.bytedance.ies.xbridge.e.a("container_popupTapSpace", System.currentTimeMillis(), null);
                aVar.a(a.this.j_());
                com.bytedance.ies.xbridge.e.b.a(aVar);
            }
        });
        if (this.Y) {
            this.B.setBackgroundColor(((int) ((this.ai * 255.0f) + 0.5f)) << 24);
        } else {
            this.B.setBackgroundColor(0);
        }
        this.y.setOnClickListener(new b(this));
        a2.post(new c(this));
        View view2 = this.D;
        if (view2 != null) {
            int i6 = 8;
            if (this.I) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            view2.setVisibility(i3);
            View view3 = this.E;
            if (this.O) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            view3.setVisibility(i4);
            this.E.setOnClickListener(new d(this));
            View view4 = this.F;
            if (this.J) {
                i6 = 0;
            }
            view4.setVisibility(i6);
            this.F.setOnClickListener(new e(this));
            this.H.setText(this.N);
            if (this.q) {
                this.G.setVisibility(0);
                this.G.setOnClickListener(new f(this));
            }
            if (this.I) {
                a2.findViewById(R.id.eme).setVisibility(0);
            }
        }
        if (this.L && (view = this.f14331f) != null) {
            view.setVisibility(0);
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, int i4, int i5) {
        if (i2 >= 0 && i3 >= 0 && i4 >= 0 && i5 >= 0) {
            View view = this.x;
            if (view instanceof RoundCornerConstraintLayout) {
                ((RoundCornerConstraintLayout) view).a(y.a((float) i2), y.a((float) i5), y.a((float) i3), y.a((float) i4));
            } else {
                ag.b(this.C, y.a((float) i2));
            }
        }
    }
}
