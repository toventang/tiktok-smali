package com.ss.android.ugc.aweme.ecommerce.pdp.view.compat;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Outline;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.utils.fc;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;

public class b extends androidx.fragment.app.d {

    /* renamed from: h  reason: collision with root package name */
    public static final a f86852h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final h.h f86853a = i.a((h.f.a.a) new C2090b(this));

    /* renamed from: b  reason: collision with root package name */
    private final h.h f86854b = i.a((h.f.a.a) new d(this));

    /* renamed from: c  reason: collision with root package name */
    private final h.h f86855c = i.a((h.f.a.a) new c(this));

    /* renamed from: d  reason: collision with root package name */
    public BottomSheetBehavior<View> f86856d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f86857e = true;

    /* renamed from: f  reason: collision with root package name */
    public int f86858f = 4;

    /* renamed from: g  reason: collision with root package name */
    public boolean f86859g = true;

    /* renamed from: i  reason: collision with root package name */
    private boolean f86860i;

    /* renamed from: j  reason: collision with root package name */
    private float f86861j;

    /* renamed from: k  reason: collision with root package name */
    private float f86862k;

    /* renamed from: l  reason: collision with root package name */
    private SparseArray f86863l;

    static {
        Covode.recordClassIndex(54416);
    }

    public void a(int i2, int i3, boolean z) {
    }

    public void c() {
    }

    public void e() {
    }

    public boolean f() {
        return false;
    }

    public View i() {
        if (this.f86863l == null) {
            this.f86863l = new SparseArray();
        }
        View view = (View) this.f86863l.get(R.id.epv);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(R.id.epv);
        this.f86863l.put(R.id.epv, findViewById);
        return findViewById;
    }

    public void j() {
        SparseArray sparseArray = this.f86863l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final ViewGroup k() {
        return (ViewGroup) this.f86853a.getValue();
    }

    public final ViewGroup l() {
        return (ViewGroup) this.f86854b.getValue();
    }

    public final ViewGroup m() {
        return (ViewGroup) this.f86855c.getValue();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        j();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54417);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f86860i = true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b$b  reason: collision with other inner class name */
    static final class C2090b extends m implements h.f.a.a<ViewGroup> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(54418);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2090b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ViewGroup invoke() {
            View view = this.this$0.getView();
            if (view != null) {
                return view.findViewById(R.id.v_);
            }
            return null;
        }
    }

    static final class c extends m implements h.f.a.a<ViewGroup> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(54419);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ViewGroup invoke() {
            View view = this.this$0.getView();
            if (view != null) {
                return view.findViewById(R.id.af5);
            }
            return null;
        }
    }

    static final class d extends m implements h.f.a.a<ViewGroup> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(54420);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ViewGroup invoke() {
            View view = this.this$0.getView();
            if (view != null) {
                return view.findViewById(R.id.w7);
            }
            return null;
        }
    }

    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f86868a;

        static {
            Covode.recordClassIndex(54426);
        }

        h(b bVar) {
            this.f86868a = bVar;
        }

        public final void run() {
            Window window;
            Dialog dialog = this.f86868a.getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setWindowAnimations(R.style.vn);
            }
        }
    }

    public void b() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.f86856d;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.b((int) com.ss.android.ugc.aweme.ecommerce.util.h.a());
        }
        BottomSheetBehavior<View> bottomSheetBehavior2 = this.f86856d;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.f52333i = false;
        }
        h();
    }

    public void g() {
        BottomSheetBehavior<View> bottomSheetBehavior;
        int i2 = this.f86858f;
        if (i2 != 3 && i2 != 2 && (bottomSheetBehavior = this.f86856d) != null) {
            bottomSheetBehavior.c(3);
        }
    }

    public void h() {
        BottomSheetBehavior<View> bottomSheetBehavior;
        int i2 = this.f86858f;
        if (i2 != 4 && i2 != 2 && (bottomSheetBehavior = this.f86856d) != null) {
            bottomSheetBehavior.c(4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        int i2;
        super.onResume();
        try {
            Dialog dialog = getDialog();
            if (!(dialog == null || (window = dialog.getWindow()) == null)) {
                if (this.f86860i) {
                    i2 = R.style.vr;
                } else {
                    i2 = R.style.vn;
                }
                window.setWindowAnimations(i2);
            }
            View view = getView();
            if (view != null) {
                view.postDelayed(new h(this), 100);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f86864a;

        static {
            Covode.recordClassIndex(54421);
        }

        e(b bVar) {
            this.f86864a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f86864a.e();
            this.f86864a.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.d
    public Dialog onCreateDialog(Bundle bundle) {
        return new c(getActivity(), (byte) 0);
    }

    public void a(boolean z) {
        int i2 = this.f86858f;
        if (i2 != 5 && i2 != 2) {
            this.f86857e = z;
            if (z) {
                dismissAllowingStateLoss();
                return;
            }
            BottomSheetBehavior<View> bottomSheetBehavior = this.f86856d;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.c(5);
            }
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f86856d = BottomSheetBehavior.a(l());
        View i2 = i();
        if (i2 != null) {
            i2.setOnClickListener(new e(this));
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new f(this));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnKeyListener(new g(this));
        }
    }

    static final class f implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f86865a;

        static {
            Covode.recordClassIndex(54422);
        }

        f(b bVar) {
            this.f86865a = bVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            Dialog dialog;
            View findViewById;
            Window window;
            Window window2;
            Dialog dialog2 = this.f86865a.getDialog();
            if (!(dialog2 == null || (window2 = dialog2.getWindow()) == null)) {
                fc.a(window2);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                ViewGroup l2 = this.f86865a.l();
                if (l2 != null) {
                    l2.setOutlineProvider(new ViewOutlineProvider() {
                        /* class com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b.f.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(54423);
                        }

                        public final void getOutline(View view, Outline outline) {
                            if (view != null && outline != null) {
                                outline.setRoundRect(0, 0, view.getWidth(), (int) (((float) view.getHeight()) + com.ss.android.ugc.aweme.ecommerce.util.h.f87570d), com.ss.android.ugc.aweme.ecommerce.util.h.f87570d);
                            }
                        }
                    });
                }
                ViewGroup l3 = this.f86865a.l();
                if (l3 != null) {
                    l3.setClipToOutline(true);
                }
            }
            Dialog dialog3 = this.f86865a.getDialog();
            if (!(dialog3 == null || (window = dialog3.getWindow()) == null || Build.VERSION.SDK_INT < 28)) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            if (!(Build.VERSION.SDK_INT < 21 || (dialog = this.f86865a.getDialog()) == null || (findViewById = dialog.findViewById(16908335)) == null)) {
                findViewById.setVisibility(8);
            }
            BottomSheetBehavior<View> bottomSheetBehavior = this.f86865a.f86856d;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f52332h = true;
            }
            b bVar = this.f86865a;
            bVar.getDialog();
            bVar.b();
            BottomSheetBehavior<View> bottomSheetBehavior2 = this.f86865a.f86856d;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.o = new BottomSheetBehavior.a(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b.f.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ f f86866a;

                    static {
                        Covode.recordClassIndex(54424);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f86866a = r1;
                    }

                    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
                    public final void a(View view, float f2) {
                        l.d(view, "");
                        this.f86866a.f86865a.a(view, f2);
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0075, code lost:
                        if (r8 != 3) goto L_0x005e;
                     */
                    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void a(android.view.View r7, int r8) {
                        /*
                        // Method dump skipped, instructions count: 120
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.b.f.AnonymousClass2.a(android.view.View, int):void");
                    }
                };
            }
        }
    }

    @Override // androidx.fragment.app.d
    public void show(androidx.fragment.app.i iVar, String str) {
        l.d(iVar, "");
        if (!iVar.g() && !iVar.h()) {
            super.show(iVar, str);
        }
    }

    public void a(View view, float f2) {
        int i2;
        l.d(view, "");
        if (!Float.isNaN(f2)) {
            float f3 = 0.0f;
            if (f2 <= 0.0f) {
                f3 = f2;
            }
            if (this.f86862k != f3) {
                this.f86862k = f3;
                ViewGroup k2 = k();
                if (k2 != null) {
                    BottomSheetBehavior<View> bottomSheetBehavior = this.f86856d;
                    if (bottomSheetBehavior == null) {
                        i2 = 0;
                    } else if (bottomSheetBehavior.f52327c) {
                        i2 = -1;
                    } else {
                        i2 = bottomSheetBehavior.f52326b;
                    }
                    k2.setTranslationY(((float) (-i2)) * this.f86862k);
                }
            }
            if (this.f86859g) {
                if (this.f86861j < 0.5f && f2 >= 0.5f) {
                    g();
                    ViewGroup l2 = l();
                    if (l2 != null) {
                        l2.dispatchTouchEvent(MotionEvent.obtain(0, 0, 3, 0.0f, 0.0f, 0));
                    }
                }
                if (this.f86861j >= 0.5f && f2 < 0.5f) {
                    h();
                    ViewGroup l3 = l();
                    if (l3 != null) {
                        l3.dispatchTouchEvent(MotionEvent.obtain(0, 0, 3, 0.0f, 0.0f, 0));
                    }
                }
            }
            this.f86861j = f2;
        }
    }

    static final class g implements DialogInterface.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f86867a;

        static {
            Covode.recordClassIndex(54425);
        }

        g(b bVar) {
            this.f86867a = bVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
            if (i2 != 4) {
                return false;
            }
            l.b(keyEvent, "");
            if (keyEvent.getAction() == 1) {
                return this.f86867a.f();
            }
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.o8, viewGroup, false);
        l.b(a2, "");
        a2.findViewById(R.id.w7);
        l.d(layoutInflater, "");
        a2.findViewById(R.id.bf7);
        l.d(layoutInflater, "");
        a2.findViewById(R.id.v_);
        l.d(layoutInflater, "");
        return a2;
    }
}
