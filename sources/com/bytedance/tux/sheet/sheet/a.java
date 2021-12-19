package com.bytedance.tux.sheet.sheet;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.TuxSheetContainer;
import com.bytedance.tux.sheet.TuxSheetNavBarContainer;
import com.bytedance.tux.sheet.a;
import com.bytedance.tux.sheet.c;
import com.bytedance.tux.widget.RadiusLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.w;
import h.z;
import java.util.HashMap;

public final class a extends com.bytedance.tux.sheet.a {
    public static final b y = new b((byte) 0);
    private HashMap A;

    /* renamed from: g */
    public View f45292g;

    /* renamed from: h */
    public Fragment f45293h;

    /* renamed from: i */
    public boolean f45294i = true;

    /* renamed from: j */
    public TuxNavBar.a f45295j;

    /* renamed from: k */
    public int f45296k;

    /* renamed from: l */
    public int f45297l = -1;

    /* renamed from: m */
    public int f45298m = -1;
    public int n = -1;
    public boolean o = true;
    public boolean p;
    public boolean q = true;
    public boolean r = true;
    public TuxSheetNavBarContainer s;
    RadiusLayout t;
    public TuxSheetContainer u;
    public Integer v;
    public BottomSheetBehavior<?> w;
    boolean x = true;
    private final d z = new d(this);

    static {
        Covode.recordClassIndex(27587);
    }

    @Override // com.bytedance.tux.sheet.a
    public final void a() {
        HashMap hashMap = this.A;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.tux.sheet.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(27589);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        public static com.bytedance.tux.sheet.c a(DialogInterface dialogInterface) {
            l.c(dialogInterface, "");
            if (dialogInterface instanceof a.b) {
                return ((a.b) dialogInterface).f45276c;
            }
            return c.C1111c.f45283a;
        }

        public static void b(Fragment fragment) {
            l.c(fragment, "");
            a c2 = c(fragment);
            if (c2 != null) {
                c2.b();
            }
        }

        public static a c(Fragment fragment) {
            a aVar = (a) fragment.getParentFragment();
            if (aVar == null || !aVar.isAdded()) {
                return null;
            }
            return aVar;
        }

        public static void a(Dialog dialog, com.bytedance.tux.sheet.c cVar) {
            if (dialog instanceof a.b) {
                a.b bVar = (a.b) dialog;
                bVar.a(cVar);
                bVar.b(cVar);
            }
        }

        private static void b(Dialog dialog, com.bytedance.tux.sheet.c cVar) {
            if (dialog instanceof a.b) {
                ((a.b) dialog).b(cVar);
            }
        }

        public static void a(View view, com.bytedance.tux.sheet.c cVar) {
            l.c(view, "");
            l.c(cVar, "");
            androidx.fragment.app.d dVar = (androidx.fragment.app.d) view.getTag(R.id.ai0);
            if (dVar != null) {
                b(dVar.getDialog(), cVar);
                dVar.dismissAllowingStateLoss();
            }
        }

        public static void a(Fragment fragment, com.bytedance.tux.sheet.c cVar) {
            Dialog dialog;
            l.c(fragment, "");
            l.c(cVar, "");
            a c2 = c(fragment);
            if (c2 != null) {
                dialog = c2.getDialog();
            } else {
                dialog = null;
            }
            b(dialog, cVar);
            if (c2 != null) {
                c2.dismissAllowingStateLoss();
            }
        }
    }

    /* renamed from: com.bytedance.tux.sheet.sheet.a$a */
    public static final class C1112a {

        /* renamed from: a */
        public final a f45299a = new a();

        static {
            Covode.recordClassIndex(27588);
        }

        public final C1112a a() {
            this.f45299a.q = false;
            return this;
        }

        public final C1112a b() {
            this.f45299a.r = false;
            return this;
        }

        public final C1112a c() {
            this.f45299a.p = true;
            return this;
        }

        public final C1112a b(int i2) {
            this.f45299a.f45297l = i2;
            return this;
        }

        public final C1112a c(int i2) {
            this.f45299a.f45237e = Integer.valueOf(i2);
            return this;
        }

        public final C1112a a(int i2) {
            boolean z;
            this.f45299a.f45296k = i2;
            a aVar = this.f45299a;
            if (i2 == 3 || i2 == 4) {
                z = true;
            } else {
                z = false;
            }
            aVar.f45236d = z;
            return this;
        }

        public final C1112a b(boolean z) {
            this.f45299a.o = z;
            return this;
        }

        public final C1112a c(boolean z) {
            this.f45299a.f45235c = z;
            return this;
        }

        public final C1112a a(DialogInterface.OnCancelListener onCancelListener) {
            l.c(onCancelListener, "");
            this.f45299a.f45233a = onCancelListener;
            return this;
        }

        public final C1112a a(DialogInterface.OnDismissListener onDismissListener) {
            l.c(onDismissListener, "");
            this.f45299a.f45234b = onDismissListener;
            return this;
        }

        public final C1112a a(View view) {
            l.c(view, "");
            this.f45299a.f45292g = view;
            return this;
        }

        public final C1112a a(Fragment fragment) {
            l.c(fragment, "");
            this.f45299a.f45293h = fragment;
            return this;
        }

        public final C1112a a(TuxNavBar.a aVar) {
            this.f45299a.f45295j = aVar;
            return this;
        }

        public final C1112a a(boolean z) {
            this.f45299a.f45294i = z;
            return this;
        }

        public final C1112a a(int i2, int i3) {
            this.f45299a.f45298m = i2;
            this.f45299a.n = i3;
            return this;
        }
    }

    static final class f extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(27593);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.b();
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(27594);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.dismissAllowingStateLoss();
            return z.f158842a;
        }
    }

    public final void b() {
        i childFragmentManager = getChildFragmentManager();
        l.a((Object) childFragmentManager, "");
        if (childFragmentManager.e() > 0) {
            getChildFragmentManager().d();
        } else if (this.q) {
            b.a(getDialog(), c.a.f45282a);
            onCancel(getDialog());
            dismissAllowingStateLoss();
        }
    }

    public static final class d extends BottomSheetBehavior.a {

        /* renamed from: a */
        final /* synthetic */ a f45302a;

        static {
            Covode.recordClassIndex(27591);
        }

        d(a aVar) {
            this.f45302a = aVar;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
        public final void a(View view, float f2) {
            Dialog dialog;
            Window window;
            l.c(view, "");
            Object obj = this.f45302a.f45292g;
            if (obj == null) {
                obj = this.f45302a.f45293h;
            }
            if (obj instanceof com.bytedance.tux.sheet.b) {
                ((com.bytedance.tux.sheet.b) obj).a(this.f45302a, f2);
            }
            if (this.f45302a.f45294i && f2 <= 0.0f && (dialog = this.f45302a.getDialog()) != null && (window = dialog.getWindow()) != null) {
                window.setDimAmount((f2 + 1.0f) * 0.5f);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
        public final void a(View view, int i2) {
            boolean z;
            l.c(view, "");
            Object obj = this.f45302a.f45292g;
            if (obj == null) {
                obj = this.f45302a.f45293h;
            }
            if (obj instanceof com.bytedance.tux.sheet.b) {
                ((com.bytedance.tux.sheet.b) obj).a(this.f45302a, i2);
            }
            if (this.f45302a.f45296k == 3) {
                a aVar = this.f45302a;
                if (i2 != 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (!aVar.x) {
                        RadiusLayout radiusLayout = aVar.t;
                        if (radiusLayout != null) {
                            Resources system = Resources.getSystem();
                            l.a((Object) system, "");
                            float applyDimension = TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics());
                            Resources system2 = Resources.getSystem();
                            l.a((Object) system2, "");
                            radiusLayout.a(applyDimension, TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()), 0.0f, 0.0f);
                        }
                        Dialog dialog = aVar.getDialog();
                        if (dialog != null) {
                            ((a.b) dialog).a(true);
                            aVar.x = true;
                            return;
                        }
                        throw new w("null cannot be cast to non-null type");
                    }
                } else if (aVar.x) {
                    RadiusLayout radiusLayout2 = aVar.t;
                    if (radiusLayout2 != null) {
                        radiusLayout2.setRadius(0.0f);
                    }
                    Dialog dialog2 = aVar.getDialog();
                    if (dialog2 != null) {
                        ((a.b) dialog2).a(false);
                        aVar.x = false;
                        return;
                    }
                    throw new w("null cannot be cast to non-null type");
                }
            }
        }
    }

    public static final class e extends i.b {

        /* renamed from: a */
        final /* synthetic */ a f45303a;

        static {
            Covode.recordClassIndex(27592);
        }

        e(a aVar) {
            this.f45303a = aVar;
        }

        @Override // androidx.fragment.app.i.b
        public final void onFragmentActivityCreated(i iVar, Fragment fragment, Bundle bundle) {
            l.c(iVar, "");
            l.c(fragment, "");
            super.onFragmentActivityCreated(iVar, fragment, bundle);
            Context context = this.f45303a.getContext();
            if (!(fragment instanceof com.bytedance.tux.navigation.a) || context == null) {
                TuxSheetNavBarContainer tuxSheetNavBarContainer = this.f45303a.s;
                if (tuxSheetNavBarContainer != null) {
                    tuxSheetNavBarContainer.setNavActions(null);
                    return;
                }
                return;
            }
            TuxSheetNavBarContainer tuxSheetNavBarContainer2 = this.f45303a.s;
            if (tuxSheetNavBarContainer2 != null) {
                tuxSheetNavBarContainer2.setNavActions(((com.bytedance.tux.navigation.a) fragment).a());
            }
        }
    }

    static final class c implements DialogInterface.OnKeyListener {

        /* renamed from: a */
        public final h.f.a.a<z> f45300a;

        /* renamed from: b */
        private int f45301b;

        static {
            Covode.recordClassIndex(27590);
        }

        public c(h.f.a.a<z> aVar) {
            l.c(aVar, "");
            this.f45300a = aVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
            Integer valueOf;
            if (i2 != 4 || keyEvent == null || (valueOf = Integer.valueOf(keyEvent.getAction())) == null) {
                return false;
            }
            if (valueOf.intValue() == 1) {
                int i3 = this.f45301b - 1;
                this.f45301b = i3;
                if (i3 >= 0) {
                    this.f45300a.invoke();
                    return true;
                }
                this.f45301b = 0;
                return false;
            } else if (valueOf.intValue() != 0) {
                return false;
            } else {
                this.f45301b++;
                return false;
            }
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getChildFragmentManager().a((i.b) new e(this), false);
    }

    @Override // androidx.fragment.app.d, com.bytedance.tux.sheet.a, androidx.appcompat.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnKeyListener(new c(new f(this)));
        Integer num = this.v;
        if (num != null) {
            int intValue = num.intValue();
            Window window = onCreateDialog.getWindow();
            if (window != null) {
                window.setSoftInputMode(intValue);
            }
        }
        return onCreateDialog;
    }

    public final void a(Fragment fragment) {
        l.c(fragment, "");
        i childFragmentManager = getChildFragmentManager();
        l.a((Object) childFragmentManager, "");
        String concat = "sheet_content_fragment".concat(String.valueOf(childFragmentManager.e() + 1));
        n a2 = getChildFragmentManager().a();
        l.a((Object) a2, "");
        Context context = getContext();
        if (context == null || !com.bytedance.tux.h.i.a(context)) {
            a2.a(R.anim.dj, R.anim.dk, R.anim.di, R.anim.dl);
        } else {
            a2.a(R.anim.di, R.anim.dl, R.anim.dj, R.anim.dk);
        }
        a2.b(R.id.e2l, fragment, concat);
        a2.a(concat);
        a2.c();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        MethodCollector.i(6398);
        l.c(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.q, viewGroup, false);
        this.t = (RadiusLayout) a2.findViewById(R.id.dgs);
        TuxSheetContainer tuxSheetContainer = (TuxSheetContainer) a2.findViewById(R.id.e2k);
        this.u = tuxSheetContainer;
        tuxSheetContainer.setFixedHeightPx(this.f45297l);
        tuxSheetContainer.setDynamicPeekHeightPx(this.f45298m);
        tuxSheetContainer.setDynamicMaxHeightPx(this.n);
        tuxSheetContainer.setVariant(this.f45296k);
        tuxSheetContainer.setHideable(this.r);
        tuxSheetContainer.setDismissFunc(new g(this));
        tuxSheetContainer.setBehavior(this.w);
        tuxSheetContainer.setBottomSheetCallback(this.z);
        ViewStub viewStub = (ViewStub) a2.findViewById(R.id.e2m);
        l.a((Object) viewStub, "");
        if (this.o) {
            i2 = R.layout.s;
        } else {
            i2 = R.layout.t;
        }
        viewStub.setLayoutResource(i2);
        viewStub.inflate();
        if (this.p) {
            ViewGroup viewGroup2 = (ViewGroup) a2.findViewById(R.id.e2l);
            l.a((Object) viewGroup2, "");
            ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            layoutParams.height = -1;
            viewGroup2.setLayoutParams(layoutParams);
        }
        View view = this.f45292g;
        if (view != null) {
            view.setTag(R.id.ai0, this);
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            ((ViewGroup) a2.findViewById(R.id.e2l)).addView(view);
        }
        Fragment fragment = this.f45293h;
        if (fragment != null) {
            getChildFragmentManager().a().b(R.id.e2l, fragment, "sheet_content_fragment").c();
        }
        TuxSheetNavBarContainer tuxSheetNavBarContainer = (TuxSheetNavBarContainer) a2.findViewById(R.id.e2v);
        this.s = tuxSheetNavBarContainer;
        if (tuxSheetNavBarContainer != null) {
            tuxSheetNavBarContainer.setNavActions(this.f45295j);
        }
        if (this.f45294i) {
            Dialog dialog = getDialog();
            l.a((Object) dialog, "");
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(2);
            }
            Dialog dialog2 = getDialog();
            l.a((Object) dialog2, "");
            Window window2 = dialog2.getWindow();
            if (window2 != null) {
                window2.setDimAmount(0.5f);
            }
        } else {
            Dialog dialog3 = getDialog();
            l.a((Object) dialog3, "");
            Window window3 = dialog3.getWindow();
            if (window3 != null) {
                window3.clearFlags(2);
            }
        }
        MethodCollector.o(6398);
        return a2;
    }
}
