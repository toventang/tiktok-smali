package com.bytedance.tux.sheet;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.c.e;
import com.bytedance.tux.c.f;
import com.bytedance.tux.e.a;
import com.bytedance.tux.sheet.c;
import com.bytedance.tux.widget.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.w;
import h.z;
import java.lang.reflect.Field;
import java.util.HashMap;

public class a extends i {

    /* renamed from: f  reason: collision with root package name */
    public static final C1108a f45232f = new C1108a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public DialogInterface.OnCancelListener f45233a;

    /* renamed from: b  reason: collision with root package name */
    public DialogInterface.OnDismissListener f45234b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f45235c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f45236d;

    /* renamed from: e  reason: collision with root package name */
    public Integer f45237e;

    /* renamed from: g  reason: collision with root package name */
    private HashMap f45238g;

    static {
        Covode.recordClassIndex(27563);
    }

    public void a() {
        HashMap hashMap = this.f45238g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    /* renamed from: com.bytedance.tux.sheet.a$a  reason: collision with other inner class name */
    public static final class C1108a {
        static {
            Covode.recordClassIndex(27564);
        }

        private C1108a() {
        }

        public /* synthetic */ C1108a(byte b2) {
            this();
        }
    }

    public static final class b extends com.google.android.material.bottomsheet.a {

        /* renamed from: a  reason: collision with root package name */
        public final int f45274a;

        /* renamed from: b  reason: collision with root package name */
        public c f45275b = c.C1111c.f45283a;

        /* renamed from: c  reason: collision with root package name */
        public c f45276c = c.C1111c.f45283a;

        /* renamed from: d  reason: collision with root package name */
        public boolean f45277d;

        /* renamed from: e  reason: collision with root package name */
        public Drawable f45278e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f45279f;

        static {
            Covode.recordClassIndex(27565);
        }

        private final void b() {
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.akq);
            if (viewGroup != null) {
                l.a((Object) viewGroup, "");
                viewGroup.setBackground(this.f45278e);
                this.f45279f = viewGroup;
            }
        }

        private final void c() {
            MethodCollector.i(6726);
            if (this.f45277d) {
                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.ad7);
                if (viewGroup == null) {
                    MethodCollector.o(6726);
                    return;
                }
                l.a((Object) viewGroup, "");
                Context context = getContext();
                l.a((Object) context, "");
                d dVar = new d(context, (byte) 0);
                dVar.setLayoutParams(viewGroup.getLayoutParams());
                dVar.setFitsSystemWindows(true);
                dVar.setRemoveTopInsets(true);
                dVar.setId(viewGroup.getId());
                ViewParent parent = viewGroup.getParent();
                if (parent instanceof ViewGroup) {
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        viewGroup.removeView(childAt);
                        dVar.addView(childAt);
                    }
                    ViewGroup viewGroup2 = (ViewGroup) parent;
                    viewGroup2.removeView(viewGroup);
                    viewGroup2.addView(dVar);
                }
            }
            MethodCollector.o(6726);
        }

        public final void a(c cVar) {
            l.c(cVar, "");
            this.f45275b = cVar;
        }

        public final void b(c cVar) {
            l.c(cVar, "");
            this.f45276c = cVar;
        }

        @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.h, android.app.Dialog
        public final void setContentView(int i2) {
            super.setContentView(i2);
            b();
            c();
        }

        public final void a(boolean z) {
            if (z) {
                ViewGroup viewGroup = this.f45279f;
                if (viewGroup != null) {
                    viewGroup.setBackground(this.f45278e);
                    return;
                }
                return;
            }
            ViewGroup viewGroup2 = this.f45279f;
            if (viewGroup2 != null) {
                viewGroup2.setBackgroundColor(this.f45274a);
            }
        }

        @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.h, android.app.Dialog
        public final void setContentView(View view) {
            l.c(view, "");
            super.setContentView(view);
            b();
            c();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(context, R.style.lg);
            Window window;
            WindowManager.LayoutParams attributes;
            l.c(context, "");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.eu, R.attr.ev, R.attr.ew, R.attr.ex, R.attr.ey, R.attr.ez, R.attr.f0, R.attr.f1, R.attr.f2, R.attr.f3, R.attr.f4, R.attr.f5, R.attr.f6, R.attr.f7, R.attr.f8, R.attr.f9, R.attr.f_, R.attr.fa, R.attr.fb, R.attr.fc}, R.attr.c3, 0);
            l.a((Object) obtainStyledAttributes, "");
            this.f45274a = obtainStyledAttributes.getColor(3, 1);
            obtainStyledAttributes.recycle();
            Window window2 = getWindow();
            if (window2 != null) {
                window2.addFlags(256);
            }
            if (!(Build.VERSION.SDK_INT < 30 || (window = getWindow()) == null || (attributes = window.getAttributes()) == null)) {
                attributes.setFitInsetsSides(0);
            }
            this.f45278e = f.a(new h.f.a.b<e, z>(this) {
                /* class com.bytedance.tux.sheet.a.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(27566);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(e eVar) {
                    e eVar2 = eVar;
                    l.c(eVar2, "");
                    eVar2.f44775a = Integer.valueOf(this.this$0.f45274a);
                    Resources system = Resources.getSystem();
                    l.a((Object) system, "");
                    eVar2.f44783i = Float.valueOf(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
                    Resources system2 = Resources.getSystem();
                    l.a((Object) system2, "");
                    eVar2.f44784j = Float.valueOf(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()));
                    return z.f158842a;
                }
            }).a(context);
        }

        @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.h
        public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
            l.c(view, "");
            super.setContentView(view, layoutParams);
            b();
            c();
        }
    }

    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f45280a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f45281b;

        static {
            Covode.recordClassIndex(27567);
        }

        public final void onGlobalLayout() {
            ViewParent viewParent;
            Window window;
            View decorView;
            ViewTreeObserver viewTreeObserver;
            View view = this.f45280a.getView();
            do {
                if (view != null) {
                    viewParent = view.getParent();
                } else {
                    viewParent = null;
                }
                if (viewParent instanceof CoordinatorLayout) {
                    View view2 = (View) viewParent;
                    if (view2 != null) {
                        View view3 = this.f45280a.getView();
                        if (!(view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null)) {
                            viewTreeObserver.removeOnGlobalLayoutListener(this);
                        }
                        int[] iArr = new int[2];
                        view2.getLocationInWindow(iArr);
                        int measuredHeight = iArr[1] + view2.getMeasuredHeight();
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setShape(0);
                        gradientDrawable2.setColor(this.f45281b);
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
                        layerDrawable.setLayerInset(1, 0, measuredHeight, 0, 0);
                        Dialog dialog = this.f45280a.getDialog();
                        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                            decorView.setBackground(layerDrawable);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (viewParent instanceof View) {
                    view = (View) viewParent;
                } else {
                    return;
                }
            } while (view != null);
        }

        c(a aVar, int i2) {
            this.f45280a = aVar;
            this.f45281b = i2;
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onStart() {
        ViewTreeObserver viewTreeObserver;
        super.onStart();
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            l.a((Object) activity, "");
            Dialog dialog = getDialog();
            if (dialog != null) {
                int i2 = ((b) dialog).f45274a;
                Dialog dialog2 = getDialog();
                l.a((Object) dialog2, "");
                a.C1099a.a(activity, dialog2).a().e(i2).a(true).f44923a.d();
                View view = getView();
                if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                    viewTreeObserver.addOnGlobalLayoutListener(new c(this, i2));
                    return;
                }
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    @Override // androidx.fragment.app.d
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        DialogInterface.OnCancelListener onCancelListener = this.f45233a;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.d
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f45234b;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.d, androidx.appcompat.app.i
    public Dialog onCreateDialog(Bundle bundle) {
        Context context;
        if (this.f45237e != null) {
            Context context2 = getContext();
            if (context2 == null) {
                l.a();
            }
            Integer num = this.f45237e;
            if (num == null) {
                l.a();
            }
            context = new ContextThemeWrapper(context2, num.intValue());
        } else {
            context = getContext();
            if (context == null) {
                l.a();
            }
            l.a((Object) context, "");
        }
        b bVar = new b(context);
        bVar.setCanceledOnTouchOutside(this.f45235c);
        bVar.f45277d = this.f45236d;
        return bVar;
    }

    @Override // androidx.fragment.app.d
    public void show(androidx.fragment.app.i iVar, String str) {
        n nVar;
        try {
            Field declaredField = androidx.fragment.app.d.class.getDeclaredField("mDismissed");
            l.a((Object) declaredField, "");
            declaredField.setAccessible(true);
            declaredField.set(this, false);
            Field declaredField2 = androidx.fragment.app.d.class.getDeclaredField("mShownByMe");
            l.a((Object) declaredField2, "");
            declaredField2.setAccessible(true);
            declaredField2.set(this, true);
        } catch (Exception unused) {
        }
        if (iVar != null) {
            nVar = iVar.a();
        } else {
            nVar = null;
        }
        if (isAdded()) {
            if (nVar != null) {
                nVar.c(this);
            } else {
                return;
            }
        } else if (nVar != null) {
            nVar.a(this, str);
        } else {
            return;
        }
        nVar.c();
    }
}
