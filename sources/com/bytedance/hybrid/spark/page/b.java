package com.bytedance.hybrid.spark.page;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.anim.BottomSheetBehavior;
import com.bytedance.hybrid.spark.d.a;
import com.bytedance.hybrid.spark.d.q;
import com.bytedance.hybrid.spark.d.r;
import com.bytedance.hybrid.spark.d.s;
import com.bytedance.hybrid.spark.view.RadiusLayout;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.w;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class b extends androidx.appcompat.app.i implements com.bytedance.hybrid.spark.a.e {

    /* renamed from: e  reason: collision with root package name */
    public static final a f31220e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.lynx.a.a.b.b f31221a;

    /* renamed from: b  reason: collision with root package name */
    public SparkContext f31222b;

    /* renamed from: c  reason: collision with root package name */
    public a f31223c;

    /* renamed from: d  reason: collision with root package name */
    public BottomSheetBehavior<RadiusLayout> f31224d;

    /* renamed from: f  reason: collision with root package name */
    private RadiusLayout f31225f;

    /* renamed from: g  reason: collision with root package name */
    private View f31226g;

    /* renamed from: h  reason: collision with root package name */
    private CoordinatorLayout f31227h;

    /* renamed from: i  reason: collision with root package name */
    private final List<com.bytedance.hybrid.spark.a.f> f31228i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private com.bytedance.hybrid.spark.d.a f31229j;

    /* renamed from: k  reason: collision with root package name */
    private HashMap f31230k;

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final d f31233a = new d();

        static {
            Covode.recordClassIndex(18122);
        }

        d() {
        }

        public final void onClick(View view) {
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final f f31235a = new f();

        static {
            Covode.recordClassIndex(18124);
        }

        f() {
        }

        public final void onClick(View view) {
        }
    }

    static {
        Covode.recordClassIndex(18118);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(18119);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class e extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f31234a = new e();

        static {
            Covode.recordClassIndex(18123);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f31236a = new g();

        static {
            Covode.recordClassIndex(18125);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(18127);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.hybrid.spark.a.e
    public final void a() {
        a(true);
    }

    @Override // com.bytedance.hybrid.spark.a.g
    public final void b() {
        a aVar = this.f31223c;
        if (aVar != null) {
            aVar.b();
        }
    }

    static final class h extends m implements h.f.a.a<z> {
        final /* synthetic */ View $view$inlined;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(18126);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar, View view) {
            super(0);
            this.this$0 = bVar;
            this.$view$inlined = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a(true);
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f31230k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.bytedance.hybrid.spark.page.b$b  reason: collision with other inner class name */
    public static final class DialogC0660b extends com.bytedance.hybrid.spark.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f31231a;

        static {
            Covode.recordClassIndex(18120);
        }

        public final void onBackPressed() {
            com.bytedance.lynx.a.a.b.b bVar = this.f31231a.f31221a;
            if (bVar == null) {
                l.a("schemaParam");
            }
            if (!bVar.getDisableBackPress()) {
                this.f31231a.a(true);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        DialogC0660b(b bVar, Context context) {
            super(context, (byte) 0);
            this.f31231a = bVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        c cVar;
        com.bytedance.lynx.hybrid.a.h kitView;
        a aVar = this.f31223c;
        if (!(aVar == null || (cVar = aVar.f31216a) == null || (kitView = cVar.getKitView()) == null)) {
            kitView.a("viewDisappeared", null);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        c cVar;
        com.bytedance.lynx.hybrid.a.h kitView;
        super.onResume();
        a aVar = this.f31223c;
        if (aVar != null && (cVar = aVar.f31216a) != null && (kitView = cVar.getKitView()) != null) {
            kitView.a("viewAppeared", null);
        }
    }

    private final boolean c() {
        com.bytedance.lynx.a.a.b.b bVar = this.f31221a;
        if (bVar == null) {
            l.a("schemaParam");
        }
        if (bVar.getPullDownClose()) {
            return true;
        }
        com.bytedance.lynx.a.a.b.b bVar2 = this.f31221a;
        if (bVar2 == null) {
            l.a("schemaParam");
        }
        if (bVar2.getDragByGesture()) {
            return true;
        }
        com.bytedance.lynx.a.a.b.b bVar3 = this.f31221a;
        if (bVar3 == null) {
            l.a("schemaParam");
        }
        if (l.a((Object) bVar3.getGravity(), (Object) "bottom")) {
            return true;
        }
        return false;
    }

    public static final class c extends BottomSheetBehavior.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f31232a;

        static {
            Covode.recordClassIndex(18121);
        }

        @Override // com.bytedance.hybrid.spark.anim.BottomSheetBehavior.a
        public final void a(View view) {
            l.c(view, "");
        }

        c(b bVar) {
            this.f31232a = bVar;
        }

        @Override // com.bytedance.hybrid.spark.anim.BottomSheetBehavior.a
        public final void a(View view, int i2) {
            String str;
            c cVar;
            com.bytedance.lynx.hybrid.a.h kitView;
            l.c(view, "");
            if (i2 != 1) {
                if (i2 == 3) {
                    str = "enterFullScreen";
                } else if (i2 == 4) {
                    str = "enterHalfScreen";
                }
                com.bytedance.hybrid.spark.e.c.a("SparkActivity", "popup state changed: ".concat(String.valueOf(str)), this.f31232a.f31222b);
                a aVar = this.f31232a.f31223c;
                if (!(aVar == null || (cVar = aVar.f31216a) == null || (kitView = cVar.getKitView()) == null)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", str);
                    kitView.a("popupStatusChange", n.a(jSONObject));
                }
            } else {
                BottomSheetBehavior<RadiusLayout> bottomSheetBehavior = this.f31232a.f31224d;
                if (bottomSheetBehavior == null) {
                    l.a("behavior");
                } else if (bottomSheetBehavior.w == 3) {
                    str = "leaveFullScreen";
                    com.bytedance.hybrid.spark.e.c.a("SparkActivity", "popup state changed: ".concat(String.valueOf(str)), this.f31232a.f31222b);
                    a aVar2 = this.f31232a.f31223c;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", str);
                    kitView.a("popupStatusChange", n.a(jSONObject2));
                }
                str = "leaveHalfScreen";
                com.bytedance.hybrid.spark.e.c.a("SparkActivity", "popup state changed: ".concat(String.valueOf(str)), this.f31232a.f31222b);
                a aVar22 = this.f31232a.f31223c;
                JSONObject jSONObject22 = new JSONObject();
                jSONObject22.put("status", str);
                kitView.a("popupStatusChange", n.a(jSONObject22));
            }
            if (i2 == 5) {
                this.f31232a.a(false);
            }
        }
    }

    @Override // androidx.fragment.app.d, androidx.appcompat.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        l.a((Object) requireContext, "");
        DialogC0660b bVar = new DialogC0660b(this, requireContext);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            bVar.setOwnerActivity(activity);
        }
        return bVar;
    }

    public final void a(boolean z) {
        WindowManager windowManager;
        Display defaultDisplay;
        c cVar;
        com.bytedance.lynx.hybrid.a.h kitView;
        String str;
        com.bytedance.lynx.a.a.b.b bVar = this.f31221a;
        if (bVar == null) {
            l.a("schemaParam");
        }
        if (bVar.getBlockBackPress()) {
            a aVar = this.f31223c;
            if (aVar != null && (cVar = aVar.f31216a) != null && (kitView = cVar.getKitView()) != null) {
                JSONObject jSONObject = new JSONObject();
                SparkContext sparkContext = this.f31222b;
                if (sparkContext == null || (str = sparkContext.f40979f) == null) {
                    str = "";
                }
                jSONObject.put("containerID", str);
                kitView.a("sparkOnBackPressAction", n.a(jSONObject));
            }
        } else if (z) {
            com.bytedance.hybrid.spark.d.a aVar2 = this.f31229j;
            if (aVar2 == null) {
                l.a("animatorParamHandler");
            }
            i iVar = new i(this);
            String animation = aVar2.f31112a.getAnimation();
            switch (animation.hashCode()) {
                case -1383228885:
                    if (animation.equals("bottom")) {
                        aVar2.f31113b.animate().translationY((float) aVar2.f31113b.getHeight()).setDuration(300).setListener(new a.C0655a(iVar)).start();
                        return;
                    }
                    break;
                case 3005871:
                    if (animation.equals("auto")) {
                        View view = aVar2.f31113b;
                        view.setAlpha(1.0f);
                        view.animate().alpha(0.0f).setDuration(300).setListener(new a.c(aVar2, iVar)).start();
                        return;
                    }
                    break;
                case 3387192:
                    if (animation.equals("none")) {
                        iVar.invoke();
                        return;
                    }
                    break;
                case 108511772:
                    if (animation.equals("right")) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        if (aVar2.f31113b.getContext() instanceof Activity) {
                            Context context = aVar2.f31113b.getContext();
                            if (context != null) {
                                windowManager = ((Activity) context).getWindowManager();
                            } else {
                                throw new w("null cannot be cast to non-null type");
                            }
                        } else {
                            Object a2 = com.bytedance.hybrid.spark.d.a.a(aVar2.f31113b.getContext(), "window");
                            if (a2 != null) {
                                windowManager = (WindowManager) a2;
                            } else {
                                throw new w("null cannot be cast to non-null type");
                            }
                        }
                        if (!(windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
                            defaultDisplay.getMetrics(displayMetrics);
                        }
                        aVar2.f31113b.animate().translationX((float) displayMetrics.widthPixels).setDuration(300).setListener(new a.b(iVar)).start();
                        return;
                    }
                    break;
            }
            iVar.invoke();
        } else {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int height;
        l.c(view, "");
        super.onViewCreated(view, bundle);
        List<com.bytedance.hybrid.spark.a.f> list = this.f31228i;
        if (c()) {
            com.bytedance.lynx.a.a.b.b bVar = this.f31221a;
            if (bVar == null) {
                l.a("schemaParam");
            }
            RadiusLayout radiusLayout = this.f31225f;
            if (radiusLayout == null) {
                l.a("popupContainer");
            }
            list.add(new s(bVar, radiusLayout));
            com.bytedance.lynx.a.a.b.b bVar2 = this.f31221a;
            if (bVar2 == null) {
                l.a("schemaParam");
            }
            RadiusLayout radiusLayout2 = this.f31225f;
            if (radiusLayout2 == null) {
                l.a("popupContainer");
            }
            BottomSheetBehavior<RadiusLayout> bottomSheetBehavior = this.f31224d;
            if (bottomSheetBehavior == null) {
                l.a("behavior");
            }
            list.add(new com.bytedance.hybrid.spark.d.d(bVar2, radiusLayout2, bottomSheetBehavior.r));
        } else {
            com.bytedance.lynx.a.a.b.b bVar3 = this.f31221a;
            if (bVar3 == null) {
                l.a("schemaParam");
            }
            RadiusLayout radiusLayout3 = this.f31225f;
            if (radiusLayout3 == null) {
                l.a("popupContainer");
            }
            list.add(new s(bVar3, radiusLayout3));
            com.bytedance.lynx.a.a.b.b bVar4 = this.f31221a;
            if (bVar4 == null) {
                l.a("schemaParam");
            }
            RadiusLayout radiusLayout4 = this.f31225f;
            if (radiusLayout4 == null) {
                l.a("popupContainer");
            }
            Context context = view.getContext();
            l.a((Object) context, "");
            com.bytedance.lynx.a.a.b.b bVar5 = this.f31221a;
            if (bVar5 == null) {
                l.a("schemaParam");
            }
            l.c(context, "");
            l.c(bVar5, "");
            if (bVar5.getHeight() > 0) {
                height = h.j.h.c(bVar5.getHeight(), com.bytedance.lynx.a.a.f.b.a());
            } else if (bVar5.getHeight() != 0) {
                height = bVar5.getHeight();
            } else if (l.a((Object) bVar5.getGravity(), (Object) "center")) {
                height = com.bytedance.hybrid.spark.e.d.a(context, 400.0d);
            } else {
                height = -1;
            }
            list.add(new com.bytedance.hybrid.spark.d.d(bVar4, radiusLayout4, height));
        }
        com.bytedance.lynx.a.a.b.b bVar6 = this.f31221a;
        if (bVar6 == null) {
            l.a("schemaParam");
        }
        RadiusLayout radiusLayout5 = this.f31225f;
        if (radiusLayout5 == null) {
            l.a("popupContainer");
        }
        list.add(new q(bVar6, radiusLayout5, c()));
        com.bytedance.lynx.a.a.b.b bVar7 = this.f31221a;
        if (bVar7 == null) {
            l.a("schemaParam");
        }
        View view2 = this.f31226g;
        if (view2 == null) {
            l.a("popupBg");
        }
        list.add(new r(bVar7, view2));
        com.bytedance.lynx.a.a.b.b bVar8 = this.f31221a;
        if (bVar8 == null) {
            l.a("schemaParam");
        }
        View view3 = this.f31226g;
        if (view3 == null) {
            l.a("popupBg");
        }
        list.add(new com.bytedance.hybrid.spark.d.e(bVar8, view3));
        com.bytedance.lynx.a.a.b.b bVar9 = this.f31221a;
        if (bVar9 == null) {
            l.a("schemaParam");
        }
        View view4 = this.f31226g;
        if (view4 == null) {
            l.a("popupBg");
        }
        list.add(new com.bytedance.hybrid.spark.d.b(bVar9, view4, new h(this, view)));
        Iterator<T> it = this.f31228i.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SparkContext sparkContext;
        com.bytedance.lynx.hybrid.h.c cVar;
        com.bytedance.lynx.a.a.b.b bVar;
        int i2;
        com.bytedance.lynx.a.a.b.c b2;
        SparkContext sparkContext2;
        l.c(layoutInflater, "");
        Bundle arguments = getArguments();
        if (arguments != null) {
            sparkContext = (SparkContext) arguments.getParcelable("sparkContext");
        } else {
            sparkContext = null;
        }
        this.f31222b = sparkContext;
        if ((sparkContext == null || sparkContext.a() == null) && (sparkContext2 = this.f31222b) != null) {
            sparkContext2.a(this);
        }
        SparkContext sparkContext3 = this.f31222b;
        if (sparkContext3 != null) {
            cVar = sparkContext3.f31052c;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            cVar.put("isPopup", (Object) 1);
        }
        SparkContext sparkContext4 = this.f31222b;
        if (sparkContext4 == null || (b2 = sparkContext4.b()) == null || !(b2 instanceof com.bytedance.lynx.a.a.b.b) || (bVar = (com.bytedance.lynx.a.a.b.b) b2) == null) {
            bVar = new com.bytedance.lynx.a.a.b.b(null, 1, null);
        }
        this.f31221a = bVar;
        if (c()) {
            View a2 = com.a.a(layoutInflater, R.layout.b18, viewGroup, false);
            View findViewById = a2.findViewById(R.id.d7k);
            RadiusLayout radiusLayout = (RadiusLayout) findViewById;
            androidx.fragment.app.n a3 = getChildFragmentManager().a();
            a aVar = new a();
            this.f31223c = aVar;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("sparkContext", this.f31222b);
            aVar.setArguments(bundle2);
            a3.a(R.id.d7k, aVar, "popup").c();
            radiusLayout.setOnClickListener(d.f31233a);
            l.a((Object) findViewById, "");
            this.f31225f = radiusLayout;
            View findViewById2 = a2.findViewById(R.id.d7j);
            l.a((Object) findViewById2, "");
            this.f31226g = findViewById2;
            RadiusLayout radiusLayout2 = this.f31225f;
            if (radiusLayout2 == null) {
                l.a("popupContainer");
            }
            ViewGroup.LayoutParams layoutParams = radiusLayout2.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                CoordinatorLayout.b bVar2 = ((CoordinatorLayout.e) layoutParams).f2100a;
                if (bVar2 instanceof BottomSheetBehavior) {
                    BottomSheetBehavior<RadiusLayout> bottomSheetBehavior = (BottomSheetBehavior) bVar2;
                    bottomSheetBehavior.b(true);
                    c cVar2 = new c(this);
                    if (!bottomSheetBehavior.D.contains(cVar2)) {
                        bottomSheetBehavior.D.add(cVar2);
                    }
                    l.a((Object) bottomSheetBehavior, "");
                    this.f31224d = bottomSheetBehavior;
                    bottomSheetBehavior.a(false);
                    BottomSheetBehavior<RadiusLayout> bottomSheetBehavior2 = this.f31224d;
                    if (bottomSheetBehavior2 == null) {
                        l.a("behavior");
                    }
                    com.bytedance.lynx.a.a.b.b bVar3 = this.f31221a;
                    if (bVar3 == null) {
                        l.a("schemaParam");
                    }
                    bottomSheetBehavior2.b(bVar3.getPullDownClose());
                    BottomSheetBehavior<RadiusLayout> bottomSheetBehavior3 = this.f31224d;
                    if (bottomSheetBehavior3 == null) {
                        l.a("behavior");
                    }
                    com.bytedance.lynx.a.a.b.b bVar4 = this.f31221a;
                    if (bVar4 == null) {
                        l.a("schemaParam");
                    }
                    bottomSheetBehavior3.p = bVar4.getDragByGesture();
                    com.bytedance.lynx.a.a.b.b bVar5 = this.f31221a;
                    if (bVar5 == null) {
                        l.a("schemaParam");
                    }
                    if (bVar5.getHeight() <= 0) {
                        BottomSheetBehavior<RadiusLayout> bottomSheetBehavior4 = this.f31224d;
                        if (bottomSheetBehavior4 == null) {
                            l.a("behavior");
                        }
                        bottomSheetBehavior4.r = com.bytedance.lynx.a.a.f.b.a();
                        BottomSheetBehavior<RadiusLayout> bottomSheetBehavior5 = this.f31224d;
                        if (bottomSheetBehavior5 == null) {
                            l.a("behavior");
                        }
                        bottomSheetBehavior5.b(com.bytedance.lynx.a.a.f.b.a() - 1);
                        BottomSheetBehavior<RadiusLayout> bottomSheetBehavior6 = this.f31224d;
                        if (bottomSheetBehavior6 == null) {
                            l.a("behavior");
                        }
                        bottomSheetBehavior6.o = true;
                        BottomSheetBehavior<RadiusLayout> bottomSheetBehavior7 = this.f31224d;
                        if (bottomSheetBehavior7 == null) {
                            l.a("behavior");
                        }
                        bottomSheetBehavior7.c(3);
                    } else {
                        com.bytedance.lynx.a.a.b.b bVar6 = this.f31221a;
                        if (bVar6 == null) {
                            l.a("schemaParam");
                        }
                        if (bVar6.getDragByGesture()) {
                            com.bytedance.lynx.a.a.b.b bVar7 = this.f31221a;
                            if (bVar7 == null) {
                                l.a("schemaParam");
                            }
                            int height = bVar7.getHeight();
                            com.bytedance.lynx.a.a.b.b bVar8 = this.f31221a;
                            if (bVar8 == null) {
                                l.a("schemaParam");
                            }
                            if (height < bVar8.getDragHeight()) {
                                BottomSheetBehavior<RadiusLayout> bottomSheetBehavior8 = this.f31224d;
                                if (bottomSheetBehavior8 == null) {
                                    l.a("behavior");
                                }
                                com.bytedance.lynx.a.a.b.b bVar9 = this.f31221a;
                                if (bVar9 == null) {
                                    l.a("schemaParam");
                                }
                                if (bVar9.getHeight() > 0) {
                                    com.bytedance.lynx.a.a.b.b bVar10 = this.f31221a;
                                    if (bVar10 == null) {
                                        l.a("schemaParam");
                                    }
                                    i2 = h.j.h.c(bVar10.getHeight(), com.bytedance.lynx.a.a.f.b.a());
                                } else {
                                    i2 = 0;
                                }
                                bottomSheetBehavior8.b(i2);
                                BottomSheetBehavior<RadiusLayout> bottomSheetBehavior9 = this.f31224d;
                                if (bottomSheetBehavior9 == null) {
                                    l.a("behavior");
                                }
                                com.bytedance.lynx.a.a.b.b bVar11 = this.f31221a;
                                if (bVar11 == null) {
                                    l.a("schemaParam");
                                }
                                bottomSheetBehavior9.r = bVar11.getDragHeight();
                                BottomSheetBehavior<RadiusLayout> bottomSheetBehavior10 = this.f31224d;
                                if (bottomSheetBehavior10 == null) {
                                    l.a("behavior");
                                }
                                com.bytedance.lynx.a.a.b.b bVar12 = this.f31221a;
                                if (bVar12 == null) {
                                    l.a("schemaParam");
                                }
                                bottomSheetBehavior10.s = bVar12.getDragUpThreshold();
                                BottomSheetBehavior<RadiusLayout> bottomSheetBehavior11 = this.f31224d;
                                if (bottomSheetBehavior11 == null) {
                                    l.a("behavior");
                                }
                                com.bytedance.lynx.a.a.b.b bVar13 = this.f31221a;
                                if (bVar13 == null) {
                                    l.a("schemaParam");
                                }
                                bottomSheetBehavior11.t = bVar13.getDragDownThreshold();
                                BottomSheetBehavior<RadiusLayout> bottomSheetBehavior12 = this.f31224d;
                                if (bottomSheetBehavior12 == null) {
                                    l.a("behavior");
                                }
                                com.bytedance.lynx.a.a.b.b bVar14 = this.f31221a;
                                if (bVar14 == null) {
                                    l.a("schemaParam");
                                }
                                bottomSheetBehavior12.v = bVar14.getDragDownCloseThreshold();
                                BottomSheetBehavior<RadiusLayout> bottomSheetBehavior13 = this.f31224d;
                                if (bottomSheetBehavior13 == null) {
                                    l.a("behavior");
                                }
                                com.bytedance.lynx.a.a.b.b bVar15 = this.f31221a;
                                if (bVar15 == null) {
                                    l.a("schemaParam");
                                }
                                bottomSheetBehavior13.u = bVar15.getPeekDownCloseThreshold();
                                BottomSheetBehavior<RadiusLayout> bottomSheetBehavior14 = this.f31224d;
                                if (bottomSheetBehavior14 == null) {
                                    l.a("behavior");
                                }
                                bottomSheetBehavior14.c(4);
                                BottomSheetBehavior<RadiusLayout> bottomSheetBehavior15 = this.f31224d;
                                if (bottomSheetBehavior15 == null) {
                                    l.a("behavior");
                                }
                                com.bytedance.lynx.a.a.b.b bVar16 = this.f31221a;
                                if (bVar16 == null) {
                                    l.a("schemaParam");
                                }
                                bottomSheetBehavior15.o = !bVar16.getDragBack();
                            }
                        }
                        BottomSheetBehavior<RadiusLayout> bottomSheetBehavior16 = this.f31224d;
                        if (bottomSheetBehavior16 == null) {
                            l.a("behavior");
                        }
                        com.bytedance.lynx.a.a.b.b bVar17 = this.f31221a;
                        if (bVar17 == null) {
                            l.a("schemaParam");
                        }
                        bottomSheetBehavior16.r = bVar17.getHeight();
                        BottomSheetBehavior<RadiusLayout> bottomSheetBehavior17 = this.f31224d;
                        if (bottomSheetBehavior17 == null) {
                            l.a("behavior");
                        }
                        com.bytedance.lynx.a.a.b.b bVar18 = this.f31221a;
                        if (bVar18 == null) {
                            l.a("schemaParam");
                        }
                        bottomSheetBehavior17.b(bVar18.getHeight() - 1);
                        BottomSheetBehavior<RadiusLayout> bottomSheetBehavior18 = this.f31224d;
                        if (bottomSheetBehavior18 == null) {
                            l.a("behavior");
                        }
                        bottomSheetBehavior18.o = true;
                        BottomSheetBehavior<RadiusLayout> bottomSheetBehavior19 = this.f31224d;
                        if (bottomSheetBehavior19 == null) {
                            l.a("behavior");
                        }
                        bottomSheetBehavior19.c(3);
                        BottomSheetBehavior<RadiusLayout> bottomSheetBehavior20 = this.f31224d;
                        if (bottomSheetBehavior20 == null) {
                            l.a("behavior");
                        }
                        if (bottomSheetBehavior20.n) {
                            BottomSheetBehavior<RadiusLayout> bottomSheetBehavior21 = this.f31224d;
                            if (bottomSheetBehavior21 == null) {
                                l.a("behavior");
                            }
                            bottomSheetBehavior21.p = true;
                        }
                    }
                    View findViewById3 = a2.findViewById(R.id.d7l);
                    l.a((Object) findViewById3, "");
                    this.f31227h = (CoordinatorLayout) findViewById3;
                    List<com.bytedance.hybrid.spark.a.f> list = this.f31228i;
                    com.bytedance.lynx.a.a.b.b bVar19 = this.f31221a;
                    if (bVar19 == null) {
                        l.a("schemaParam");
                    }
                    CoordinatorLayout coordinatorLayout = this.f31227h;
                    if (coordinatorLayout == null) {
                        l.a("popupCoordinator");
                    }
                    list.add(new com.bytedance.hybrid.spark.d.c(bVar19, coordinatorLayout));
                    com.bytedance.lynx.a.a.b.b bVar20 = this.f31221a;
                    if (bVar20 == null) {
                        l.a("schemaParam");
                    }
                    RadiusLayout radiusLayout3 = this.f31225f;
                    if (radiusLayout3 == null) {
                        l.a("popupContainer");
                    }
                    com.bytedance.hybrid.spark.d.a aVar2 = new com.bytedance.hybrid.spark.d.a(bVar20, radiusLayout3);
                    this.f31229j = aVar2;
                    aVar2.a(e.f31234a);
                    return a2;
                }
                throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
            }
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        View a4 = com.a.a(layoutInflater, R.layout.b17, viewGroup, false);
        View findViewById4 = a4.findViewById(R.id.d7k);
        RadiusLayout radiusLayout4 = (RadiusLayout) findViewById4;
        androidx.fragment.app.n a5 = getChildFragmentManager().a();
        a aVar3 = new a();
        this.f31223c = aVar3;
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("sparkContext", this.f31222b);
        aVar3.setArguments(bundle3);
        a5.a(R.id.d7k, aVar3, "popup").c();
        radiusLayout4.setOnClickListener(f.f31235a);
        l.a((Object) findViewById4, "");
        this.f31225f = radiusLayout4;
        View findViewById5 = a4.findViewById(R.id.d7j);
        l.a((Object) findViewById5, "");
        this.f31226g = findViewById5;
        List<com.bytedance.hybrid.spark.a.f> list2 = this.f31228i;
        com.bytedance.lynx.a.a.b.b bVar21 = this.f31221a;
        if (bVar21 == null) {
            l.a("schemaParam");
        }
        RadiusLayout radiusLayout5 = this.f31225f;
        if (radiusLayout5 == null) {
            l.a("popupContainer");
        }
        list2.add(new com.bytedance.hybrid.spark.d.c(bVar21, radiusLayout5));
        com.bytedance.lynx.a.a.b.b bVar22 = this.f31221a;
        if (bVar22 == null) {
            l.a("schemaParam");
        }
        RadiusLayout radiusLayout6 = this.f31225f;
        if (radiusLayout6 == null) {
            l.a("popupContainer");
        }
        com.bytedance.hybrid.spark.d.a aVar4 = new com.bytedance.hybrid.spark.d.a(bVar22, radiusLayout6);
        this.f31229j = aVar4;
        aVar4.a(g.f31236a);
        return a4;
    }
}
