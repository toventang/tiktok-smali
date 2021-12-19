package com.bytedance.android.livesdk.container.k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.android.live.b.k;
import com.bytedance.android.live.core.f.ac;
import com.bytedance.android.livesdk.container.config.base.PageConfig;
import com.bytedance.android.livesdk.container.k.a;
import com.bytedance.android.livesdk.container.type.HColor;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.e.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

public final class d extends com.bytedance.android.livesdk.ui.a implements com.bytedance.android.livesdk.container.d, com.bytedance.android.livesdk.container.g.b, com.bytedance.android.livesdk.container.h.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f16850c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f16851b;

    /* renamed from: d  reason: collision with root package name */
    private final h f16852d = com.bytedance.android.livesdkapi.m.d.a(new c(this));

    /* renamed from: e  reason: collision with root package name */
    private final h f16853e = com.bytedance.android.livesdkapi.m.d.a(new C0344d(this));

    /* renamed from: f  reason: collision with root package name */
    private ViewGroup f16854f;

    /* renamed from: g  reason: collision with root package name */
    private View f16855g;

    /* renamed from: h  reason: collision with root package name */
    private View f16856h;

    /* renamed from: i  reason: collision with root package name */
    private View f16857i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f16858j;

    /* renamed from: k  reason: collision with root package name */
    private a f16859k;

    /* renamed from: l  reason: collision with root package name */
    private HashMap f16860l;

    static {
        Covode.recordClassIndex(9352);
    }

    private final String f() {
        return (String) this.f16853e.getValue();
    }

    public final PageConfig a() {
        return (PageConfig) this.f16852d.getValue();
    }

    @Override // com.bytedance.android.livesdk.container.h.a
    public final void a(String str) {
    }

    @Override // com.bytedance.android.livesdk.container.h.a
    public final void e() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(9353);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.container.h.a
    public final void d() {
        g();
    }

    @Override // com.bytedance.android.livesdk.container.b
    public final String getHybridContainerId() {
        return f();
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f16864a;

        static {
            Covode.recordClassIndex(9359);
        }

        g(d dVar) {
            this.f16864a = dVar;
        }

        public final void run() {
            ViewGroup viewGroup = this.f16864a.f16851b;
            if (viewGroup != null) {
                viewGroup.setPadding(0, 0, 0, 0);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.container.b
    public final void b() {
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f16860l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f16861a;

        static {
            Covode.recordClassIndex(9354);
        }

        b(d dVar) {
            this.f16861a = dVar;
        }

        public final void run() {
            ViewGroup viewGroup = this.f16861a.f16851b;
            if (viewGroup != null) {
                viewGroup.setPadding(0, ac.a(this.f16861a.getContext()), 0, 0);
            }
        }
    }

    static final class c extends m implements h.f.a.a<PageConfig> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(9355);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PageConfig invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null) {
                l.b();
            }
            Serializable serializable = arguments.getSerializable("argument_key_config");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.bytedance.android.livesdk.container.config.base.PageConfig");
            return serializable;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.k.d$d  reason: collision with other inner class name */
    static final class C0344d extends m implements h.f.a.a<String> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(9356);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0344d(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            if (this.this$0.a().getEngineType() == com.bytedance.android.livesdk.container.d.a.LYNX) {
                return com.bytedance.android.livesdk.browser.c.b();
            }
            return com.bytedance.android.livesdk.browser.c.a();
        }
    }

    private final void g() {
        a aVar;
        com.bytedance.android.livesdk.container.c.a aVar2;
        if (!a().getShowCloseAll() || (aVar = this.f16859k) == null || (aVar2 = aVar.f16816a) == null || !aVar2.g()) {
            View view = this.f16856h;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = this.f16856h;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    public final void c() {
        com.bytedance.android.livesdk.container.c.a aVar;
        com.bytedance.android.livesdk.container.c.a aVar2;
        a aVar3 = this.f16859k;
        if (aVar3 == null || (aVar = aVar3.f16816a) == null || !aVar.g()) {
            b();
            return;
        }
        a aVar4 = this.f16859k;
        if (!(aVar4 == null || (aVar2 = aVar4.f16816a) == null)) {
            aVar2.h();
        }
        g();
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f16862a;

        static {
            Covode.recordClassIndex(9357);
        }

        e(d dVar) {
            this.f16862a = dVar;
        }

        public final void onClick(View view) {
            this.f16862a.c();
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f16863a;

        static {
            Covode.recordClassIndex(9358);
        }

        f(d dVar) {
            this.f16863a = dVar;
        }

        public final void onClick(View view) {
            this.f16863a.b();
        }
    }

    @Override // com.bytedance.android.livesdk.container.g.b
    public final boolean a(KeyEvent keyEvent) {
        com.bytedance.android.livesdk.container.c.a aVar;
        l.d(keyEvent, "");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            if (a().getDisableBackPress()) {
                return true;
            }
            a aVar2 = this.f16859k;
            if (!(aVar2 == null || (aVar = aVar2.f16816a) == null || !aVar.g())) {
                c();
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        com.bytedance.android.live.b.f fVar;
        k hybridPageManager;
        super.onCreate(bundle);
        if (f().length() > 0 && getActivity() != null && (fVar = (com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)) != null && (hybridPageManager = fVar.getHybridPageManager()) != null) {
            String f2 = f();
            androidx.fragment.app.e activity = getActivity();
            if (activity == null) {
                l.b();
            }
            l.b(activity, "");
            hybridPageManager.a(f2, activity);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int hashCode;
        Resources resources;
        TextView textView;
        Resources resources2;
        View view2;
        androidx.fragment.app.e activity;
        Window window;
        androidx.fragment.app.e activity2;
        Resources resources3;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        a a2 = a.C0341a.a(a());
        a2.b(f());
        a2.f16818c = this;
        this.f16859k = a2;
        getChildFragmentManager().a().a(R.id.bhc, a2).c();
        Configuration configuration = null;
        if (!(Build.VERSION.SDK_INT < 21 || (activity = getActivity()) == null || (window = activity.getWindow()) == null || (activity2 = getActivity()) == null)) {
            l.b(activity2, "");
            a.C1099a.a(activity2).b(window.getStatusBarColor()).f44923a.d();
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            if (a().getHideStatusBar() || a().getTransStatusBar()) {
                ViewGroup viewGroup = this.f16851b;
                if (viewGroup != null) {
                    viewGroup.post(new g(this));
                }
            } else {
                ViewGroup viewGroup2 = this.f16851b;
                if (viewGroup2 != null) {
                    viewGroup2.post(new b(this));
                }
            }
            if (a().getHideStatusBar()) {
                l.d(activity2, "");
                activity2.getWindow().setFlags(1024, 1024);
                try {
                    Context applicationContext = activity2.getApplicationContext();
                    if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                        if (applicationContext == null) {
                            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                        }
                    }
                    l.b(applicationContext, "");
                    Class<?> loadClass = applicationContext.getClassLoader().loadClass("android.os.SystemProperties");
                    Object invoke = loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, "ro.miui.notch", 0);
                    if (invoke == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    } else if (((Integer) invoke).intValue() == 1 && Build.VERSION.SDK_INT < 28) {
                        try {
                            Class[] clsArr = new Class[1];
                            Class cls = Integer.TYPE;
                            if (cls == null) {
                                l.b();
                            }
                            clsArr[0] = cls;
                            Window.class.getMethod("addExtraFlags", clsArr).invoke(activity2.getWindow(), 768);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            HColor statusBgColor = a().getStatusBgColor();
            if (statusBgColor != null) {
                Integer valueOf = Integer.valueOf(statusBgColor.getColor(getContext()));
                if (!(valueOf.intValue() == 0 || valueOf == null)) {
                    com.bytedance.android.livesdk.container.util.c.a(activity2, valueOf.intValue());
                }
            }
            if (a().getTransStatusBar()) {
                a().setHideNavBar(true);
                com.bytedance.android.livesdk.container.util.c.a(activity2, 0);
            }
            String statusFontMode = a().getStatusFontMode();
            if (statusFontMode != null) {
                int hashCode2 = statusFontMode.hashCode();
                if (hashCode2 != 3075958) {
                    if (hashCode2 == 102970646 && statusFontMode.equals("light")) {
                        com.bytedance.android.live.core.f.c.a.c(window, true);
                    }
                } else if (statusFontMode.equals("dark")) {
                    com.bytedance.android.live.core.f.c.a.c(window, false);
                }
            }
            Context context = getContext();
            if (!(context == null || (resources3 = context.getResources()) == null)) {
                configuration = resources3.getConfiguration();
            }
            if (l.a((Object) com.bytedance.android.livesdk.container.util.h.a(configuration), (Object) "dark")) {
                com.bytedance.android.live.core.f.c.a.c(window, false);
            } else {
                com.bytedance.android.live.core.f.c.a.c(window, true);
            }
        }
        if (a().getHideNavBar()) {
            ViewGroup viewGroup3 = this.f16854f;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
        } else {
            View view3 = this.f16855g;
            if (view3 != null) {
                view3.setOnClickListener(new e(this));
            }
            if (a().getShowCloseAll() && (view2 = this.f16856h) != null) {
                view2.setOnClickListener(new f(this));
            }
            HColor navBarColor = a().getNavBarColor();
            if (navBarColor != null) {
                Integer valueOf2 = Integer.valueOf(navBarColor.getColor(getContext()));
                int intValue = valueOf2.intValue();
                Context context2 = getContext();
                if ((context2 == null || (resources2 = context2.getResources()) == null || intValue != resources2.getColor(R.color.f159928l)) && valueOf2 != null) {
                    int intValue2 = valueOf2.intValue();
                    ViewGroup viewGroup4 = this.f16854f;
                    if (viewGroup4 != null) {
                        viewGroup4.setBackgroundColor(intValue2);
                    }
                }
            }
            if (a().getTitle().length() > 0 && (textView = this.f16858j) != null) {
                textView.setText(a().getTitle());
            }
            HColor titleColor = a().getTitleColor();
            if (titleColor != null) {
                Integer valueOf3 = Integer.valueOf(titleColor.getColor(getContext()));
                int intValue3 = valueOf3.intValue();
                Context context3 = getContext();
                if ((context3 == null || (resources = context3.getResources()) == null || intValue3 != resources.getColor(R.color.bx)) && valueOf3 != null) {
                    int intValue4 = valueOf3.intValue();
                    TextView textView2 = this.f16858j;
                    if (textView2 != null) {
                        textView2.setTextColor(intValue4);
                    }
                }
            }
            String navBtnType = a().getNavBtnType();
            if (navBtnType != null && ((hashCode = navBtnType.hashCode()) == -934521548 ? navBtnType.equals("report") : !(hashCode == 109400031 ? !navBtnType.equals("share") : hashCode != 949444906 || !navBtnType.equals("collect")))) {
                View view4 = this.f16857i;
                if (view4 != null) {
                    view4.setVisibility(0);
                }
            } else {
                View view5 = this.f16857i;
                if (view5 != null) {
                    view5.setVisibility(8);
                }
            }
        }
        l.d(a(), "");
        l.d(this, "");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.bd9, viewGroup, false);
        this.f16851b = (ViewGroup) a2.findViewById(R.id.dqk);
        this.f16854f = (ViewGroup) a2.findViewById(R.id.em8);
        this.f16855g = a2.findViewById(R.id.em9);
        this.f16856h = a2.findViewById(R.id.ema);
        this.f16857i = a2.findViewById(R.id.emf);
        this.f16858j = (TextView) a2.findViewById(R.id.emg);
        return a2;
    }
}
