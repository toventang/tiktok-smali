package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.a.e;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.f;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.g;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.i;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.j;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.k;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.ui.d;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.aweme.utils.fc;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import h.f.b.z;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

public final class s extends com.google.android.material.bottomsheet.a implements f {

    /* renamed from: e  reason: collision with root package name */
    public static final a f124249e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public NestedScrollView f124250a;

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f124251b;

    /* renamed from: c  reason: collision with root package name */
    public BottomSheetBehavior<View> f124252c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f124253d;

    /* renamed from: f  reason: collision with root package name */
    private View f124254f;

    /* renamed from: j  reason: collision with root package name */
    private LinearLayout f124255j;

    /* renamed from: k  reason: collision with root package name */
    private LinearLayout f124256k;

    /* renamed from: l  reason: collision with root package name */
    private ViewGroup f124257l;

    /* renamed from: m  reason: collision with root package name */
    private LinearLayout f124258m;
    private String n;
    private final NestedScrollView.b o;
    private final a.C3238a p;
    private final i q;
    private final float r;

    static {
        Covode.recordClassIndex(81603);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81604);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.share.s$a$a  reason: collision with other inner class name */
        public static final class C3238a {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f124259a;

            /* renamed from: b  reason: collision with root package name */
            public final d f124260b;

            /* renamed from: c  reason: collision with root package name */
            public final List<h> f124261c;

            /* renamed from: d  reason: collision with root package name */
            public final List<com.ss.android.ugc.aweme.im.service.model.f> f124262d;

            static {
                Covode.recordClassIndex(81605);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3238a)) {
                    return false;
                }
                C3238a aVar = (C3238a) obj;
                return this.f124259a == aVar.f124259a && l.a(this.f124260b, aVar.f124260b) && l.a(this.f124261c, aVar.f124261c) && l.a(this.f124262d, aVar.f124262d);
            }

            public final int hashCode() {
                boolean z = this.f124259a;
                if (z) {
                    z = true;
                }
                int i2 = z ? 1 : 0;
                int i3 = z ? 1 : 0;
                int i4 = z ? 1 : 0;
                int i5 = i2 * 31;
                d dVar = this.f124260b;
                int i6 = 0;
                int hashCode = (i5 + (dVar != null ? dVar.hashCode() : 0)) * 31;
                List<h> list = this.f124261c;
                int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
                List<com.ss.android.ugc.aweme.im.service.model.f> list2 = this.f124262d;
                if (list2 != null) {
                    i6 = list2.hashCode();
                }
                return hashCode2 + i6;
            }

            public final String toString() {
                return "LongPressSharePanelConfig(supportIM=" + this.f124259a + ", imShareHook=" + this.f124260b + ", actions=" + this.f124261c + ", batchGroups=" + this.f124262d + ")";
            }

            public /* synthetic */ C3238a(boolean z) {
                this(z, null, z.INSTANCE, z.INSTANCE);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.sharer.ui.h> */
            /* JADX WARN: Multi-variable type inference failed */
            public C3238a(boolean z, d dVar, List<? extends h> list, List<com.ss.android.ugc.aweme.im.service.model.f> list2) {
                l.d(list, "");
                l.d(list2, "");
                this.f124259a = z;
                this.f124260b = dVar;
                this.f124261c = list;
                this.f124262d = list2;
            }
        }

        private static int a(Aweme aweme) {
            if (com.ss.android.ugc.aweme.utils.z.c(aweme)) {
                return 2;
            }
            User author = aweme.getAuthor();
            if (author == null || !author.isSecret()) {
                return -1;
            }
            return 1;
        }

        private static com.ss.android.ugc.aweme.feed.ui.masklayer2.a a(Aweme aweme, String str) {
            boolean z;
            String str2;
            com.ss.android.ugc.aweme.feed.ui.masklayer2.a aVar = new com.ss.android.ugc.aweme.feed.ui.masklayer2.a(aweme, str);
            if (aweme != null) {
                aVar.f94864a.f124595i.putInt("share_im_limit_tip_type", a(aweme));
                Bundle bundle = aVar.f94864a.f124595i;
                User author = aweme.getAuthor();
                if (author != null) {
                    str2 = author.getUniqueId();
                } else {
                    str2 = null;
                }
                bundle.putString("author_user_name", str2);
            }
            Bundle bundle2 = aVar.f94864a.f124595i;
            if (aweme != null) {
                z = aweme.isAd();
            } else {
                z = false;
            }
            bundle2.putBoolean("is_ad", z);
            return aVar;
        }

        public static s a(Context context, Aweme aweme, String str) {
            boolean z;
            l.d(context, "");
            l.d(str, "");
            com.ss.android.ugc.aweme.feed.ui.masklayer2.a a2 = a(aweme, str);
            if (!com.ss.android.ugc.aweme.feed.share.a.b(aweme)) {
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                if (g2.isLogin()) {
                    z = true;
                    return new s(context, new C3238a(z), a2, (byte) 0);
                }
            }
            z = false;
            return new s(context, new C3238a(z), a2, (byte) 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.f
    public final ViewGroup a() {
        return this.f124258m;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.f
    public final ViewGroup b() {
        return this.f124257l;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.f
    public final Dialog c() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.f
    public final String d() {
        return this.n;
    }

    public final void onBackPressed() {
        e a2;
        ViewGroup viewGroup = this.f124257l;
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            super.onBackPressed();
            return;
        }
        View view = this.f124254f;
        if (view != null && (a2 = this.q.a(this)) != null) {
            a2.b(view);
        }
    }

    public final void show() {
        Object obj;
        Activity a2 = o.a(getContext());
        if (a2 != null) {
            obj = a(a2, "vibrator");
        } else {
            obj = null;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type android.os.Vibrator");
        Vibrator vibrator = (Vibrator) obj;
        if (vibrator != null) {
            vibrator.vibrate(15);
        }
        super.show();
    }

    @Override // com.google.android.material.bottomsheet.a
    public final void onStart() {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        super.onStart();
        int a2 = h.g.a.a(((float) n.b(getContext())) * this.r);
        z.a aVar = new z.a();
        aVar.element = false;
        if (com.ss.android.ugc.aweme.im.service.c.e.c()) {
            aVar.element = true;
            i2 = h.g.a.a(((float) n.b(getContext())) * 0.7f);
        } else {
            i2 = a2;
        }
        View findViewById = findViewById(R.id.akq);
        if (findViewById != null) {
            findViewById.setBackground(null);
        }
        boolean d2 = IMUnder16ProxyImpl.n().d();
        if (!this.p.f124259a || d2) {
            if (!(findViewById == null || (layoutParams = findViewById.getLayoutParams()) == null)) {
                layoutParams.height = -2;
            }
        } else if (!(findViewById == null || (layoutParams2 = findViewById.getLayoutParams()) == null)) {
            layoutParams2.height = i2;
        }
        setOnShowListener(new c(this, findViewById, aVar, a2));
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.f
    public final void a(String str) {
        l.d(str, "");
        this.n = str;
    }

    public final void a(boolean z) {
        int i2;
        this.f124253d = z;
        BottomSheetBehavior<View> bottomSheetBehavior = this.f124252c;
        if (bottomSheetBehavior != null) {
            if (z) {
                i2 = 3;
            } else {
                i2 = 4;
            }
            bottomSheetBehavior.c(i2);
        }
    }

    static final class c implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f124265a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f124266b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.a f124267c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f124268d;

        static {
            Covode.recordClassIndex(81607);
        }

        c(s sVar, View view, z.a aVar, int i2) {
            this.f124265a = sVar;
            this.f124266b = view;
            this.f124267c = aVar;
            this.f124268d = i2;
        }

        public final void onShow(DialogInterface dialogInterface) {
            int i2;
            this.f124265a.f124252c = BottomSheetBehavior.a(this.f124266b);
            BottomSheetBehavior<View> bottomSheetBehavior = this.f124265a.f124252c;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.a(true);
                bottomSheetBehavior.f52333i = !this.f124267c.element;
                bottomSheetBehavior.f52332h = true;
                bottomSheetBehavior.b(this.f124268d);
                if (this.f124267c.element) {
                    i2 = 4;
                } else {
                    i2 = 3;
                }
                bottomSheetBehavior.c(i2);
                if (this.f124267c.element) {
                    bottomSheetBehavior.o = new a(bottomSheetBehavior, this);
                }
            }
        }

        public static final class a extends BottomSheetBehavior.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ BottomSheetBehavior f124269a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f124270b;

            static {
                Covode.recordClassIndex(81608);
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
            public final void a(View view, float f2) {
                l.d(view, "");
            }

            a(BottomSheetBehavior bottomSheetBehavior, c cVar) {
                this.f124269a = bottomSheetBehavior;
                this.f124270b = cVar;
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
            public final void a(View view, int i2) {
                l.d(view, "");
                if (this.f124270b.f124265a.f124253d && i2 == 4) {
                    this.f124269a.c(3);
                }
            }
        }
    }

    @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.h
    public final void onCreate(Bundle bundle) {
        Window window;
        Window window2;
        MethodCollector.i(8405);
        try {
            if (Build.VERSION.SDK_INT >= 21 && (window2 = getWindow()) != null) {
                window2.addFlags(Integer.MIN_VALUE);
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a(e2.getMessage());
        }
        super.onCreate(bundle);
        setContentView(R.layout.sr);
        Window window3 = getWindow();
        if (window3 != null) {
            fc.a(window3);
        }
        if (Build.VERSION.SDK_INT >= 21 && (window = getWindow()) != null) {
            window.setStatusBarColor(0);
        }
        this.f124254f = findViewById(R.id.d1n);
        this.f124255j = (LinearLayout) findViewById(R.id.amx);
        this.f124256k = (LinearLayout) findViewById(R.id.e0x);
        this.f124257l = (ViewGroup) findViewById(R.id.amx);
        this.f124250a = (NestedScrollView) findViewById(R.id.dt9);
        this.f124258m = (LinearLayout) findViewById(R.id.e18);
        this.f124251b = (ViewGroup) findViewById(R.id.dyt);
        List<g> b2 = this.q.b(this);
        LinearLayout linearLayout = this.f124256k;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        if (b2.isEmpty()) {
            View findViewById = findViewById(R.id.wi);
            l.b(findViewById, "");
            findViewById.setVisibility(8);
        }
        int size = b2.size();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= size) {
                break;
            }
            g gVar = b2.get(i2);
            if (i2 != b2.size() - 1) {
                z = false;
            }
            if (gVar instanceof j) {
                Context context = getContext();
                l.b(context, "");
                com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.d dVar = new com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.d(context);
                dVar.a((k) gVar, z);
                ImageView imageView = dVar.f94954a.f94937a;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                LinearLayout linearLayout2 = this.f124256k;
                if (linearLayout2 != null) {
                    linearLayout2.addView(dVar);
                }
            } else if (gVar instanceof k) {
                Context context2 = getContext();
                l.b(context2, "");
                com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.d dVar2 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.d(context2);
                dVar2.a((k) gVar, z);
                LinearLayout linearLayout3 = this.f124256k;
                if (linearLayout3 != null) {
                    linearLayout3.addView(dVar2);
                }
            } else if (gVar instanceof com.ss.android.ugc.aweme.feed.ui.masklayer2.d) {
                com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.a aVar = new com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.a(getContext());
                com.ss.android.ugc.aweme.feed.ui.masklayer2.d dVar3 = (com.ss.android.ugc.aweme.feed.ui.masklayer2.d) gVar;
                l.d(dVar3, "");
                aVar.f94941b = dVar3.f94928b;
                aVar.f94942c = dVar3.f94929c;
                aVar.f94940a.a(dVar3.f94927a);
                if (z) {
                    View a2 = aVar.a();
                    l.b(a2, "");
                    a2.setVisibility(4);
                } else {
                    View a3 = aVar.a();
                    l.b(a3, "");
                    a3.setVisibility(0);
                }
                LinearLayout linearLayout4 = this.f124256k;
                if (linearLayout4 != null) {
                    linearLayout4.addView(aVar);
                }
            }
            i2++;
        }
        LinearLayout linearLayout5 = this.f124256k;
        if (linearLayout5 != null) {
            linearLayout5.requestLayout();
        }
        NestedScrollView nestedScrollView = this.f124250a;
        if (nestedScrollView != null) {
            nestedScrollView.setOnScrollChangeListener(this.o);
        }
        boolean d2 = IMUnder16ProxyImpl.n().d();
        ViewGroup.LayoutParams layoutParams = null;
        if (!this.p.f124259a || d2) {
            TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.e17);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(8);
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.djh);
            l.b(recyclerView, "");
            recyclerView.setVisibility(8);
            View findViewById2 = findViewById(R.id.wi);
            l.b(findViewById2, "");
            findViewById2.setVisibility(8);
            LinearLayout linearLayout6 = this.f124258m;
            if (linearLayout6 != null) {
                ViewGroup.LayoutParams layoutParams2 = linearLayout6.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = -2;
                } else {
                    layoutParams2 = null;
                }
                linearLayout6.setLayoutParams(layoutParams2);
            }
            LinearLayout linearLayout7 = this.f124255j;
            if (linearLayout7 != null) {
                ViewGroup.LayoutParams layoutParams3 = linearLayout7.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = -2;
                } else {
                    layoutParams3 = null;
                }
                linearLayout7.setLayoutParams(layoutParams3);
            }
            NestedScrollView nestedScrollView2 = this.f124250a;
            if (nestedScrollView2 != null) {
                ViewGroup.LayoutParams layoutParams4 = nestedScrollView2.getLayoutParams();
                if (layoutParams4 != null) {
                    layoutParams4.height = -2;
                } else {
                    layoutParams4 = null;
                }
                nestedScrollView2.setLayoutParams(layoutParams4);
            }
            View view = this.f124254f;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
                if (layoutParams5 != null) {
                    layoutParams5.height = -2;
                    layoutParams = layoutParams5;
                }
                view.setLayoutParams(layoutParams);
            }
            View view2 = this.f124254f;
            if (view2 != null) {
                view2.setPadding(0, 0, 0, (int) n.b(getContext(), 16.0f));
            }
        } else {
            Context context3 = getContext();
            l.b(context3, "");
            Activity a4 = com.ss.android.ugc.aweme.share.improve.c.b.a(context3);
            if (a4 != null) {
                com.ss.android.ugc.aweme.im.service.share.b.a aVar2 = new com.ss.android.ugc.aweme.im.service.share.b.a(a4, this, this.q.a(), (FrameLayout) findViewById(R.id.elo), (RecyclerView) findViewById(R.id.djh), (LinearLayout) findViewById(R.id.e1_), (TextView) findViewById(R.id.e17), this.p.f124260b, this.p.f124262d, this.o);
                r rVar = new r(aVar2);
                com.ss.android.ugc.aweme.im.service.j.c shareService = IMService.createIIMServicebyMonsterPlugin(false).getShareService();
                if (shareService != null) {
                    shareService.a(aVar2, rVar);
                }
            }
        }
        com.bytedance.ies.abmock.b.a().a(true, "did_precise_exp_long_press_menu", false);
        r.a("verify_precise_exp", new com.ss.android.ugc.aweme.app.f.d().a("scene", "long_press_menu").f66730a);
        MethodCollector.o(8405);
    }

    private static Object a(Activity activity, String str) {
        Object obj;
        MethodCollector.i(8414);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = activity.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = activity.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = activity.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(8414);
                }
            }
        } else {
            obj = activity.getSystemService(str);
        }
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(Context context, a.C3238a aVar, com.ss.android.ugc.aweme.feed.ui.masklayer2.i iVar) {
        super(context, R.style.vy);
        l.d(context, "");
        l.d(aVar, "");
        l.d(iVar, "");
        this.p = aVar;
        this.q = iVar;
        this.r = 0.5f;
        this.n = "";
        this.o = new b(this, context);
    }

    public /* synthetic */ s(Context context, a.C3238a aVar, com.ss.android.ugc.aweme.feed.ui.masklayer2.i iVar, byte b2) {
        this(context, aVar, iVar);
    }

    static final class b implements NestedScrollView.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f124263a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f124264b;

        static {
            Covode.recordClassIndex(81606);
        }

        b(s sVar, Context context) {
            this.f124263a = sVar;
            this.f124264b = context;
        }

        @Override // androidx.core.widget.NestedScrollView.b
        public final void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
            int[] iArr = new int[2];
            ((TuxTextView) this.f124263a.findViewById(R.id.e17)).getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            NestedScrollView nestedScrollView2 = this.f124263a.f124250a;
            if (nestedScrollView2 != null) {
                nestedScrollView2.getLocationOnScreen(iArr2);
            }
            int i6 = iArr[1] - iArr2[1];
            if (((float) i6) < 0.0f) {
                ViewGroup viewGroup = this.f124263a.f124251b;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                float b2 = ((float) (-i6)) / n.b(this.f124264b, 40.0f);
                ViewGroup viewGroup2 = this.f124263a.f124251b;
                if (viewGroup2 != null) {
                    if (b2 > 1.0f) {
                        b2 = 1.0f;
                    }
                    viewGroup2.setAlpha(b2);
                    return;
                }
                return;
            }
            ViewGroup viewGroup3 = this.f124263a.f124251b;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
        }
    }
}
