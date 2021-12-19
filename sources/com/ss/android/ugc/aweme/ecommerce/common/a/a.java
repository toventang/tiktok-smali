package com.ss.android.ugc.aweme.ecommerce.common.a;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Outline;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.util.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommerce.util.h;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.lang.reflect.Field;
import java.util.Objects;

public class a extends e {

    /* renamed from: l  reason: collision with root package name */
    public static final C2050a f85705l = new C2050a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private Boolean f85706a;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f85707b;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f85708f;

    /* renamed from: g  reason: collision with root package name */
    public KeyBoardVisibilityUtil f85709g;

    /* renamed from: h  reason: collision with root package name */
    public h.f.a.b<? super Boolean, z> f85710h;

    /* renamed from: i  reason: collision with root package name */
    public h.f.a.a<z> f85711i;

    /* renamed from: j  reason: collision with root package name */
    public long f85712j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f85713k;

    static {
        Covode.recordClassIndex(53598);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.a.e
    public View a(int i2) {
        if (this.f85707b == null) {
            this.f85707b = new SparseArray();
        }
        View view = (View) this.f85707b.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f85707b.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.a.e
    public void a() {
        SparseArray sparseArray = this.f85707b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.ecommerce.common.a.e
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.common.a.a$a  reason: collision with other inner class name */
    public static final class C2050a {
        static {
            Covode.recordClassIndex(53599);
        }

        private C2050a() {
        }

        public /* synthetic */ C2050a(byte b2) {
            this();
        }
    }

    public static final class g extends ViewOutlineProvider {
        static {
            Covode.recordClassIndex(53605);
        }

        g() {
        }

        public final void getOutline(View view, Outline outline) {
            if (view != null && outline != null) {
                outline.setRoundRect(0, 0, view.getWidth(), (int) (((float) view.getHeight()) + h.f87570d), h.f87570d);
            }
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(53601);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            Object obj;
            KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.this$0.f85709g;
            if (keyBoardVisibilityUtil == null) {
                return;
            }
            if (keyBoardVisibilityUtil.f87543a) {
                Context context = this.this$0.getContext();
                IBinder iBinder = null;
                if (context != null) {
                    obj = a(context, "input_method");
                } else {
                    obj = null;
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                InputMethodManager inputMethodManager = (InputMethodManager) obj;
                View view = this.this$0.getView();
                if (view != null) {
                    iBinder = view.getWindowToken();
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                return;
            }
            this.this$0.dismissAllowingStateLoss();
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(4463);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        i.f107220b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (i.f107219a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                            } catch (Exception e2) {
                                com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        i.f107219a = false;
                    } finally {
                        MethodCollector.o(4463);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    @Override // androidx.fragment.app.d
    public void dismiss() {
        if (this.mCancelable) {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.d
    public void dismissAllowingStateLoss() {
        if (this.mCancelable) {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.f85709g;
        if (keyBoardVisibilityUtil != null) {
            keyBoardVisibilityUtil.a();
        }
        this.f85709g = null;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onStart() {
        this.f85712j = SystemClock.elapsedRealtime();
        super.onStart();
    }

    private a() {
        this.f85713k = true;
        setCancelable(false);
        this.f85712j = SystemClock.elapsedRealtime();
    }

    @Override // androidx.fragment.app.d
    public int getTheme() {
        if (l.a((Object) this.f85706a, (Object) false)) {
            return R.style.vp;
        }
        return R.style.vo;
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f85717a;

        static {
            Covode.recordClassIndex(53604);
        }

        f(a aVar) {
            this.f85717a = aVar;
        }

        public final void run() {
            ViewParent viewParent;
            this.f85717a.setCancelable(true);
            Boolean bool = this.f85717a.f85708f;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                a aVar = this.f85717a;
                aVar.f85708f = Boolean.valueOf(booleanValue);
                View view = aVar.getView();
                View view2 = null;
                if (view != null) {
                    viewParent = view.getParent();
                } else {
                    viewParent = null;
                }
                if (viewParent instanceof View) {
                    view2 = viewParent;
                }
                try {
                    BottomSheetBehavior a2 = BottomSheetBehavior.a(view2);
                    if (a2 != null) {
                        a2.f52332h = booleanValue;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f85714a;

        static {
            Covode.recordClassIndex(53602);
        }

        d(c cVar) {
            this.f85714a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f85714a.a();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Boolean bool;
        super.onCreate(bundle);
        if (bundle != null) {
            setCancelable(true);
            dismissAllowingStateLoss();
        }
        if (this.f85713k) {
            new Handler(Looper.getMainLooper()).postDelayed(new f(this), 450);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            bool = Boolean.valueOf(arguments.getBoolean("needs_dim", true));
        } else {
            bool = null;
        }
        this.f85706a = bool;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityCreated(android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.common.a.a.onActivityCreated(android.os.Bundle):void");
    }

    static final class b extends m implements h.f.a.m<Boolean, Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(53600);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Boolean bool, Integer num) {
            boolean booleanValue = bool.booleanValue();
            num.intValue();
            h.f.a.b<? super Boolean, z> bVar = this.this$0.f85710h;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(booleanValue));
            }
            return z.f158842a;
        }
    }

    static final class e implements DialogInterface.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f85715a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f85716b;

        static {
            Covode.recordClassIndex(53603);
        }

        e(a aVar, c cVar) {
            this.f85715a = aVar;
            this.f85716b = cVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
            if (i2 != 4) {
                return false;
            }
            h.f.a.a<z> aVar = this.f85715a.f85711i;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f85716b.a();
            return false;
        }
    }
}
