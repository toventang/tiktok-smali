package com.bytedance.android.livesdk.lynx.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.core.f.ac;
import com.bytedance.android.live.core.f.j;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.browser.d.h;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.g;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.l;
import com.bytedance.android.livesdk.livesetting.hybrid.EnableLynxDebugBadgeSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LynxDelayDestroyJSB;
import com.bytedance.android.livesdk.lynx.ui.a;
import com.bytedance.android.livesdk.utils.ah;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.x;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import org.json.JSONObject;

public final class d extends a implements com.bytedance.android.livesdk.lynx.d {
    public static final a p = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f18826a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f18827b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f18828c = true;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.livesdk.lynx.b f18829d;

    /* renamed from: e  reason: collision with root package name */
    public View f18830e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.android.livesdk.lynx.c f18831f;

    /* renamed from: g  reason: collision with root package name */
    public String f18832g = "";

    /* renamed from: h  reason: collision with root package name */
    public int f18833h;

    /* renamed from: i  reason: collision with root package name */
    public Integer f18834i;

    /* renamed from: j  reason: collision with root package name */
    public String f18835j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f18836k;

    /* renamed from: l  reason: collision with root package name */
    public String f18837l = "";

    /* renamed from: m  reason: collision with root package name */
    public boolean f18838m;
    public boolean n;
    public l o;
    private HashMap q;

    public final /* synthetic */ class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f18841a;

        static {
            Covode.recordClassIndex(11205);
        }

        public e(h.f.a.b bVar) {
            this.f18841a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            h.f.b.l.b(this.f18841a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(11200);
    }

    @Override // com.bytedance.android.livesdk.lynx.ui.a
    public final void i() {
        HashMap hashMap = this.q;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.lynx.ui.a, com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        i();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(11201);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f18839a;

        static {
            Covode.recordClassIndex(11203);
        }

        c(d dVar) {
            this.f18839a = dVar;
        }

        public final void run() {
            com.bytedance.android.livesdk.lynx.b bVar = this.f18839a.f18829d;
            if (bVar != null) {
                bVar.c();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.ui.d$d  reason: collision with other inner class name */
    static final class C0399d implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f18840a;

        static {
            Covode.recordClassIndex(11204);
        }

        C0399d(d dVar) {
            this.f18840a = dVar;
        }

        @Override // com.bytedance.ies.web.jsbridge2.e.b
        public final com.bytedance.ies.web.jsbridge2.e<Object, Object> a() {
            l lVar = new l(this.f18840a);
            this.f18840a.o = lVar;
            return lVar;
        }
    }

    @Override // com.bytedance.android.livesdk.lynx.ui.a
    public final View f() {
        com.bytedance.android.livesdk.lynx.b bVar = this.f18829d;
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        com.bytedance.android.live.core.c.a.a(4, "LiveLynx.LiveLynxFragment", "onDetach()");
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (LynxDelayDestroyJSB.INSTANCE.getValue()) {
            j.a(new c(this));
            return;
        }
        com.bytedance.android.livesdk.lynx.b bVar = this.f18829d;
        if (bVar != null) {
            bVar.c();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            a("container_disappear", new JSONObject());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.bytedance.android.live.core.c.a.a(4, "LiveLynx.LiveLynxFragment", "onResume()");
        try {
            a("container_appear", new JSONObject());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public d() {
        boolean z = true;
        IHostContext iHostContext = (IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class);
        this.f18826a = (iHostContext == null || !iHostContext.isLocalTest() || !EnableLynxDebugBadgeSetting.INSTANCE.getValue()) ? false : z;
        this.f18831f = (com.bytedance.android.livesdk.lynx.c) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.lynx.c.class);
        this.K = com.bytedance.android.livesdk.browser.c.b();
    }

    @Override // com.bytedance.android.livesdk.lynx.d
    public final void a() {
        String string;
        Object valueOf;
        Bundle arguments = getArguments();
        if (!(arguments == null || (string = arguments.getString("fallback_url")) == null)) {
            h.f.b.l.b(string, "");
            if (string.length() > 0) {
                Context context = null;
                if (1 != 0) {
                    a.b bVar = this.H;
                    if (bVar != null) {
                        bVar.g();
                    }
                    if (this.n) {
                        androidx.fragment.app.e activity = getActivity();
                        if (activity != null) {
                            activity.finish();
                        }
                        if (this.I != null) {
                            f.a aVar = this.I;
                            if (aVar != null) {
                                aVar.a(string);
                                valueOf = z.f158842a;
                            }
                        } else {
                            IActionHandlerService iActionHandlerService = (IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class);
                            Context context2 = getContext();
                            if (context2 != null) {
                                context = context2.getApplicationContext();
                                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && context == null) {
                                    context = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                                }
                            }
                            valueOf = Boolean.valueOf(iActionHandlerService.handle(context, string));
                        }
                    } else if (this.I != null) {
                        f.a aVar2 = this.I;
                        if (aVar2 != null) {
                            aVar2.a(string);
                            valueOf = z.f158842a;
                        }
                    } else {
                        valueOf = Boolean.valueOf(((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).handle(getContext(), string));
                    }
                    if (valueOf != null) {
                        return;
                    }
                }
            }
        }
        if (this.f18826a) {
            ao.a(y.e(), "Lynx fallback with no fallback_url!!", 0);
        }
    }

    static final class b extends m implements h.f.a.b<View, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(11202);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            h.f.b.l.d(view, "");
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdk.lynx.d
    public final void a(View view) {
        h.f.b.l.d(view, "");
        View view2 = this.f18830e;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        com.bytedance.android.live.core.c.a.a(4, "LiveLynx.LiveLynxFragment", "onAttach()");
    }

    @Override // com.bytedance.android.livesdk.lynx.ui.a, com.bytedance.android.livesdkapi.b.a
    public final boolean a(String str) {
        h.f.b.l.d(str, "");
        super.a(str);
        com.bytedance.android.livesdkapi.b.b bVar = this.M;
        if (bVar != null) {
            return bVar.a();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.lynx.ui.a, com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        String str;
        String queryParameter;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("url", "");
            h.f.b.l.b(string, "");
            this.f18832g = string;
            if (!TextUtils.isEmpty(string)) {
                Uri parse = Uri.parse(this.f18832g);
                this.f18838m = arguments.getBoolean("hide_status_bar", false);
                this.f18836k = arguments.getBoolean("is_fullscreen", false);
                this.f18837l = arguments.getString("title");
                this.f18834i = Integer.valueOf(arguments.getInt("bundle_preset_width"));
                this.f18835j = arguments.getString("original_scheme", "");
                this.n = arguments.getBoolean("is_dummy_host", false);
                String string2 = arguments.getString("soft_input_mode", "");
                h.f.b.l.b(string2, "");
                this.L = string2;
                String str2 = null;
                if (parse != null) {
                    try {
                        str = parse.getQueryParameter("web_bg_color");
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str) && (queryParameter = parse.getQueryParameter("web_bg_color")) != null) {
                    this.f18833h = Color.parseColor(com.bytedance.android.livesdk.browser.j.a.a(queryParameter));
                }
                if (parse != null) {
                    try {
                        boolean z2 = true;
                        if (parse.getQueryParameter("hide_loading") != null) {
                            if (ah.b(parse.getQueryParameter("hide_loading")) == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.f18827b = z;
                        } else if (parse != null) {
                        }
                        if (parse.getQueryParameter("hide_status_bar") != null) {
                            String queryParameter2 = parse.getQueryParameter("hide_status_bar");
                            if (queryParameter2 == null) {
                                h.f.b.l.b();
                            }
                            h.f.b.l.b(queryParameter2, "");
                            if (Integer.parseInt(queryParameter2) != 1) {
                                z2 = false;
                            }
                            this.f18838m = z2;
                        } else if (parse != null) {
                        }
                        str2 = parse.getQueryParameter("title");
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                if (!TextUtils.isEmpty(str2)) {
                    this.f18837l = parse.getQueryParameter("title");
                }
            }
        }
        if (this.f18838m && this.f18836k) {
            if (com.bytedance.android.live.core.f.d.a(getActivity())) {
                androidx.fragment.app.e activity = getActivity();
                if (activity == null) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    Window window = activity.getWindow();
                    window.clearFlags(67108864);
                    window.getDecorView().setSystemUiVisibility(1280);
                    window.addFlags(Integer.MIN_VALUE);
                    window.setStatusBarColor(0);
                    return;
                }
                int i2 = Build.VERSION.SDK_INT;
                activity.getWindow().setFlags(67108864, 67108864);
                return;
            }
            ac.a((Activity) getActivity());
        }
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.b
    public final <T> void a(String str, T t) {
        com.bytedance.android.livesdk.lynx.b bVar = this.f18829d;
        if (bVar != null) {
            bVar.a(str, t);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        l lVar = this.o;
        if (lVar != null) {
            lVar.a(i2, i3, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.i(9492);
        h.f.b.l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.bci, viewGroup, false);
        if (a2 != null) {
            FrameLayout frameLayout = (FrameLayout) a2;
            View findViewById = frameLayout.findViewById(R.id.cd_);
            this.f18830e = findViewById;
            if (this.f18827b) {
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            } else if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            com.bytedance.android.livesdk.lynx.c cVar = this.f18831f;
            if (cVar == null) {
                h.f.b.l.b();
            }
            androidx.fragment.app.e activity = getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            com.bytedance.android.livesdk.lynx.b createAndLoad = cVar.createAndLoad(activity, this.f18832g, this.f18834i, this.f18835j, this.K, this);
            if (createAndLoad != null) {
                View d2 = createAndLoad.d();
                d2.setScrollBarStyle(0);
                d2.setBackgroundColor(this.f18833h);
                frameLayout.addView(d2, 0, new FrameLayout.LayoutParams(-1, -1));
                h.a aVar = this.G;
                if (aVar != null) {
                    aVar.a(createAndLoad.b());
                }
                com.bytedance.android.livesdk.browser.c.a b2 = createAndLoad.b();
                g gVar = new g();
                this.M = gVar;
                x a3 = b2.a();
                if (a3 != null) {
                    a3.a("viewController", (com.bytedance.ies.web.jsbridge2.f<?, ?>) gVar);
                }
                x a4 = b2.a();
                if (a4 != null) {
                    a4.a("chooseImage", (e.b) new C0399d(this));
                }
                this.f18829d = createAndLoad;
                if (this.f18826a) {
                    b bVar = new b(this);
                    LiveTextView liveTextView = new LiveTextView(getContext());
                    liveTextView.setText("Lynx");
                    liveTextView.setTextSize(14.0f);
                    liveTextView.setTextColor(Color.parseColor("#FFFFFF"));
                    liveTextView.setBackgroundColor(Color.parseColor("#88008800"));
                    liveTextView.setOnClickListener(new e(bVar));
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 8388661;
                    frameLayout.addView(liveTextView, layoutParams);
                }
                MethodCollector.o(9492);
                return frameLayout;
            }
            a();
            MethodCollector.o(9492);
            return frameLayout;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        MethodCollector.o(9492);
        throw nullPointerException;
    }
}
