package com.bytedance.android.livesdk.container.k;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.core.f.ag;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior;
import com.bytedance.android.livesdk.container.behavior.ContainerBottomSheetBehavior;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import com.bytedance.android.livesdk.container.config.live.LivePopupConfig;
import com.bytedance.android.livesdk.container.custom.ContainerCoordinatorLayout;
import com.bytedance.android.livesdk.container.f.a;
import com.bytedance.android.livesdk.container.k.a;
import com.bytedance.android.livesdk.container.type.HColor;
import com.bytedance.android.livesdk.container.util.b;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;

public final class e extends com.bytedance.android.live.core.widget.a implements com.bytedance.android.livesdk.container.e {

    /* renamed from: i  reason: collision with root package name */
    public static final a f16865i = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public ContainerCoordinatorLayout f16866e;

    /* renamed from: f  reason: collision with root package name */
    public a f16867f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f16868g;

    /* renamed from: h  reason: collision with root package name */
    public List<View.OnClickListener> f16869h = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private boolean f16870j;

    /* renamed from: k  reason: collision with root package name */
    private FrameLayout f16871k;

    /* renamed from: l  reason: collision with root package name */
    private ViewGroup f16872l;

    /* renamed from: m  reason: collision with root package name */
    private View f16873m;
    private final h.h n = com.bytedance.android.livesdkapi.m.d.a(new h(this));
    private final h.h o = com.bytedance.android.livesdkapi.m.d.a(new j(this));
    private HashMap p;

    static {
        Covode.recordClassIndex(9360);
    }

    private final String e() {
        return (String) this.o.getValue();
    }

    public final PopupConfig d() {
        return (PopupConfig) this.n.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(9361);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static e a(PopupConfig popupConfig) {
            l.d(popupConfig, "");
            e eVar = new e();
            com.bytedance.android.livesdk.browser.g.a.a(popupConfig.getUrl());
            Bundle bundle = new Bundle();
            bundle.putSerializable("argument_key_config", popupConfig);
            eVar.setArguments(bundle);
            return eVar;
        }
    }

    @Override // com.bytedance.android.livesdk.container.b
    public final void b() {
        dismissAllowingStateLoss();
    }

    @Override // com.bytedance.android.livesdk.container.e
    public final /* bridge */ /* synthetic */ View c() {
        return this.f16866e;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.live.a
    public final void dismiss() {
        dismissAllowingStateLoss();
    }

    static final class i extends m implements h.f.a.a<z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(9369);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            e.super.dismissAllowingStateLoss();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdk.container.custom.a.a
    public final void a() {
        ContainerCoordinatorLayout containerCoordinatorLayout = this.f16866e;
        if (containerCoordinatorLayout != null) {
            containerCoordinatorLayout.a();
        }
    }

    @Override // com.bytedance.android.livesdk.container.b
    public final String getHybridContainerId() {
        return e();
    }

    @Override // com.bytedance.android.live.core.widget.a
    public final String j_() {
        return e();
    }

    public static final class k extends Dialog {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f16880a;

        static {
            Covode.recordClassIndex(9371);
        }

        public final void onBackPressed() {
            if (this.f16880a.mCancelable) {
                this.f16880a.dismissAllowingStateLoss();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(e eVar, Context context, int i2) {
            super(context, i2);
            this.f16880a = eVar;
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment, com.bytedance.android.live.core.widget.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.p;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static final class h extends m implements h.f.a.a<PopupConfig> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(9368);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PopupConfig invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null) {
                l.b();
            }
            Serializable serializable = arguments.getSerializable("argument_key_config");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.bytedance.android.livesdk.container.config.base.PopupConfig");
            return serializable;
        }
    }

    static final class j extends m implements h.f.a.a<String> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(9370);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            if (this.this$0.d().getEngineType() == com.bytedance.android.livesdk.container.d.a.LYNX) {
                return com.bytedance.android.livesdk.browser.c.b();
            }
            return com.bytedance.android.livesdk.browser.c.a();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.android.live.core.widget.a
    public final void onDestroy() {
        super.onDestroy();
        PopupConfig d2 = d();
        l.d(d2, "");
        l.d(this, "");
        LivePopupConfig extraConfig = d2.getExtraConfig();
        if (extraConfig != null && extraConfig.getMinMarginTop() > 0) {
            a();
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f16879a;

        static {
            Covode.recordClassIndex(9367);
        }

        g(e eVar) {
            this.f16879a = eVar;
        }

        public final void run() {
            LiveLoadingView liveLoadingView;
            com.bytedance.android.livesdk.container.c.a aVar;
            View f2;
            a aVar2 = this.f16879a.f16867f;
            if (!(aVar2 == null || (aVar = aVar2.f16816a) == null || (f2 = aVar.f()) == null)) {
                com.bytedance.android.livesdk.container.e.a.a(f2, this.f16879a.d().getHeight());
            }
            a aVar3 = this.f16879a.f16867f;
            if (aVar3 != null && (liveLoadingView = aVar3.f16817b) != null) {
                com.bytedance.android.livesdk.container.e.a.a(liveLoadingView, this.f16879a.d().getHeight());
            }
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.live.a
    public final void dismissAllowingStateLoss() {
        int i2;
        MethodCollector.i(9308);
        i iVar = new i(this);
        String gravity = d().getGravity();
        int hashCode = gravity.hashCode();
        if (hashCode != -1383228885) {
            if (hashCode == -1364013995 && gravity.equals("center")) {
                ContainerCoordinatorLayout containerCoordinatorLayout = this.f16866e;
                String dialogAnimation = d().getDialogAnimation();
                l.d(dialogAnimation, "");
                if (containerCoordinatorLayout == null) {
                    MethodCollector.o(9308);
                    return;
                } else if (containerCoordinatorLayout.getAnimation() == null) {
                    int hashCode2 = dialogAnimation.hashCode();
                    if (hashCode2 != -1383228885) {
                        if (hashCode2 != -1364013995) {
                            if (hashCode2 == 3387192) {
                                dialogAnimation.equals("none");
                            }
                        } else if (dialogAnimation.equals("center")) {
                            i2 = R.anim.eg;
                            Animation loadAnimation = AnimationUtils.loadAnimation(containerCoordinatorLayout.getContext(), i2);
                            loadAnimation.setAnimationListener(new b.animation.Animation$AnimationListenerC0346b(iVar));
                            containerCoordinatorLayout.startAnimation(loadAnimation);
                        }
                    } else if (dialogAnimation.equals("bottom")) {
                        i2 = R.anim.eo;
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(containerCoordinatorLayout.getContext(), i2);
                        loadAnimation2.setAnimationListener(new b.animation.Animation$AnimationListenerC0346b(iVar));
                        containerCoordinatorLayout.startAnimation(loadAnimation2);
                    }
                    iVar.invoke();
                    MethodCollector.o(9308);
                    return;
                }
            }
        } else if (gravity.equals("bottom")) {
            com.bytedance.android.livesdk.container.util.b.a(this.f16866e, d().getAnimation(), this.f16870j, iVar);
            MethodCollector.o(9308);
            return;
        }
        MethodCollector.o(9308);
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f16875a;

        static {
            Covode.recordClassIndex(9363);
        }

        c(e eVar) {
            this.f16875a = eVar;
        }

        public final void onClick(View view) {
            this.f16875a.dismissAllowingStateLoss();
        }
    }

    public static final class d extends com.bytedance.android.livesdk.container.g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f16876a;

        static {
            Covode.recordClassIndex(9364);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(e eVar) {
            this.f16876a = eVar;
        }

        @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.a, com.bytedance.android.livesdk.container.g.a
        public final void a(View view, int i2) {
            l.d(view, "");
            if (i2 == 5) {
                this.f16876a.dismissAllowingStateLoss();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.k.e$e  reason: collision with other inner class name */
    public static final class C0345e extends com.bytedance.android.livesdk.container.g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f16877a;

        static {
            Covode.recordClassIndex(9365);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C0345e(e eVar) {
            this.f16877a = eVar;
        }

        @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.a, com.bytedance.android.livesdk.container.g.a
        public final void a(View view, int i2) {
            ImageView imageView;
            l.d(view, "");
            if (i2 == 3) {
                ImageView imageView2 = this.f16877a.f16868g;
                if (imageView2 != null) {
                    imageView2.setImageResource(2131234816);
                }
            } else if (i2 == 4 && (imageView = this.f16877a.f16868g) != null) {
                imageView.setImageResource(2131234817);
            }
        }

        @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.a, com.bytedance.android.livesdk.container.g.a
        public final void a(View view, float f2) {
            com.bytedance.android.livesdk.container.c.a aVar;
            View f3;
            l.d(view, "");
            super.a(view, f2);
            LivePopupConfig extraConfig = this.f16877a.d().getExtraConfig();
            if (extraConfig != null) {
                int height = this.f16877a.d().getHeight() + ((int) (((float) (extraConfig.getVariableHeight() - this.f16877a.d().getHeight())) * f2));
                a aVar2 = this.f16877a.f16867f;
                if (aVar2 != null && (aVar = aVar2.f16816a) != null && (f3 = aVar.f()) != null) {
                    com.bytedance.android.livesdk.container.e.a.a(f3, height);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.container.e
    public final void a(View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        this.f16869h.add(onClickListener);
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f16878a;

        static {
            Covode.recordClassIndex(9366);
        }

        f(e eVar) {
            this.f16878a = eVar;
        }

        public final void onClick(View view) {
            Iterator<T> it = this.f16878a.f16869h.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.container.e
    public final void a(androidx.fragment.app.e eVar) {
        l.d(eVar, "");
        com.bytedance.android.live.core.widget.a.a(eVar, this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        if (activity == null || activity.getRequestedOrientation() != 0) {
            z = false;
        } else {
            z = true;
        }
        this.f16870j = z;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment, com.bytedance.android.live.core.widget.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.android.live.b.j hybridDialogManager;
        super.onCreate(bundle);
        com.bytedance.android.live.b.f fVar = (com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class);
        if (fVar != null && (hybridDialogManager = fVar.getHybridDialogManager()) != null) {
            hybridDialogManager.a("ungroup", this);
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        if (context == null) {
            l.b();
        }
        k kVar = new k(this, context, getTheme());
        kVar.requestWindowFeature(1);
        return kVar;
    }

    @Override // com.bytedance.android.livesdk.container.e
    public final void a(LiveBottomSheetBehavior.a aVar) {
        l.d(aVar, "");
        FrameLayout frameLayout = this.f16871k;
        if (frameLayout != null) {
            LiveBottomSheetBehavior a2 = LiveBottomSheetBehavior.a(frameLayout);
            l.b(a2, "");
            a2.a(aVar);
        }
    }

    @Override // com.bytedance.android.livesdk.container.custom.a.a
    public final void a(com.bytedance.android.livesdk.container.custom.a.b bVar) {
        l.d(bVar, "");
        ContainerCoordinatorLayout containerCoordinatorLayout = this.f16866e;
        if (containerCoordinatorLayout != null) {
            containerCoordinatorLayout.a(bVar);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        WindowManager.LayoutParams attributes;
        View decorView;
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        l.b(dialog, "");
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable());
        }
        Dialog dialog2 = getDialog();
        l.b(dialog2, "");
        Window window2 = dialog2.getWindow();
        if (window2 != null && (attributes = window2.getAttributes()) != null) {
            Dialog dialog3 = getDialog();
            l.b(dialog3, "");
            Window window3 = dialog3.getWindow();
            if (!(window3 == null || (decorView = window3.getDecorView()) == null)) {
                decorView.setPadding(0, 0, 0, 0);
            }
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 80;
            attributes.dimAmount = 0.0f;
            Dialog dialog4 = getDialog();
            l.b(dialog4, "");
            Window window4 = dialog4.getWindow();
            if (window4 != null) {
                window4.setAttributes(attributes);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.container.e
    public final void a(String str) {
        l.d(str, "");
        String gravity = d().getGravity();
        int hashCode = gravity.hashCode();
        if (hashCode != -1383228885) {
            if (hashCode == -1364013995 && gravity.equals("center")) {
                d().setDialogAnimation(str);
            }
        } else if (gravity.equals("bottom")) {
            d().setAnimation(str);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.android.live.core.widget.a
    public final void onViewCreated(View view, Bundle bundle) {
        int i2;
        int height;
        View view2;
        JSONArray pullDownCloseIds;
        int length;
        boolean z;
        int i3;
        MethodCollector.i(9306);
        l.d(view, "");
        super.onViewCreated(view, bundle);
        String gravity = d().getGravity();
        int hashCode = gravity.hashCode();
        if (hashCode != -1383228885) {
            if (hashCode == -1364013995 && gravity.equals("center")) {
                ContainerCoordinatorLayout containerCoordinatorLayout = this.f16866e;
                String dialogAnimation = d().getDialogAnimation();
                l.d(dialogAnimation, "");
                if (containerCoordinatorLayout != null) {
                    int hashCode2 = dialogAnimation.hashCode();
                    if (hashCode2 != -1383228885) {
                        if (hashCode2 != -1364013995) {
                            if (hashCode2 == 3387192) {
                                dialogAnimation.equals("none");
                            }
                        } else if (dialogAnimation.equals("center")) {
                            i3 = R.anim.ef;
                        }
                    } else if (dialogAnimation.equals("bottom")) {
                        i3 = R.anim.ek;
                    }
                    containerCoordinatorLayout.startAnimation(AnimationUtils.loadAnimation(containerCoordinatorLayout.getContext(), i3));
                }
            }
        } else if (gravity.equals("bottom")) {
            com.bytedance.android.livesdk.container.util.b.a(this.f16866e, d().getAnimation(), this.f16870j);
        }
        ContainerCoordinatorLayout containerCoordinatorLayout2 = this.f16866e;
        Integer num = null;
        ViewGroup.LayoutParams layoutParams = containerCoordinatorLayout2 != null ? containerCoordinatorLayout2.getLayoutParams() : null;
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            LivePopupConfig extraConfig = d().getExtraConfig();
            if (extraConfig != null) {
                i2 = extraConfig.getVariableHeight();
                if (i2 > 0) {
                    LivePopupConfig extraConfig2 = d().getExtraConfig();
                    if (extraConfig2 == null || (num = Integer.valueOf(extraConfig2.getVariableHeight())) == null) {
                        l.b();
                    }
                    height = num.intValue();
                }
                height = d().getHeight();
            } else {
                i2 = 0;
                height = d().getHeight();
            }
            layoutParams2.height = height;
            layoutParams2.width = d().getWidth();
            if (i2 > 0 && (view2 = getView()) != null) {
                view2.post(new g(this));
            }
            String gravity2 = d().getGravity();
            if (gravity2.hashCode() == -1364013995 && gravity2.equals("center")) {
                layoutParams2.gravity = 17;
                ag.a(this.f16866e, d().getRadius());
            } else {
                layoutParams2.gravity = 81;
                ag.b(this.f16866e, d().getRadius());
            }
        }
        if (!d().getDisableMaskClose()) {
            a(new c(this));
        }
        FrameLayout frameLayout = this.f16871k;
        if (frameLayout != null) {
            ContainerBottomSheetBehavior b2 = ContainerBottomSheetBehavior.b((View) frameLayout);
            l.b(b2, "");
            if (d().getEngineType() == com.bytedance.android.livesdk.container.d.a.WEB_VIEW) {
                z = true;
            } else {
                z = false;
            }
            b2.v = z;
            b2.b(d().getHeight());
            b2.a(false);
            if (l.a((Object) d().getGravity(), (Object) "bottom")) {
                if (d().getPullDownClose()) {
                    b2.b(true);
                    b2.a(new d(this));
                } else {
                    b2.b(false);
                }
                LivePopupConfig extraConfig3 = d().getExtraConfig();
                if (extraConfig3 == null || extraConfig3.getVariableHeight() <= 0) {
                    ImageView imageView = this.f16868g;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                } else {
                    ImageView imageView2 = this.f16868g;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                    b2.a(new C0345e(this));
                }
            } else {
                b2.f9512m = false;
            }
        }
        ViewGroup viewGroup = this.f16872l;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new f(this));
        }
        if (!d().getShowMask()) {
            ViewGroup viewGroup2 = this.f16872l;
            if (viewGroup2 != null) {
                viewGroup2.setBackgroundColor(0);
            }
        } else {
            HColor maskBgColor = d().getMaskBgColor();
            if (maskBgColor != null) {
                Integer valueOf = Integer.valueOf(maskBgColor.getColor(getContext()));
                if (!(valueOf.intValue() == 0 || valueOf == null)) {
                    int intValue = valueOf.intValue();
                    ViewGroup viewGroup3 = this.f16872l;
                    if (viewGroup3 != null) {
                        viewGroup3.setBackgroundColor(intValue);
                    }
                }
            }
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new b(this));
        }
        Dialog dialog2 = getDialog();
        l.b(dialog2, "");
        Window window = dialog2.getWindow();
        if (window != null) {
            l.b(window, "");
            ContainerCoordinatorLayout containerCoordinatorLayout3 = this.f16866e;
            if (containerCoordinatorLayout3 != null) {
                containerCoordinatorLayout3.setOwnerWindow(window);
            }
        }
        a a2 = a.C0341a.a(d());
        a2.b(e());
        this.f16867f = a2;
        getChildFragmentManager().a().a(R.id.bhh, a2).c();
        PopupConfig d2 = d();
        l.d(d2, "");
        l.d(this, "");
        a(new a.View$OnClickListenerC0339a(this));
        LivePopupConfig extraConfig4 = d2.getExtraConfig();
        if (!(extraConfig4 == null || (pullDownCloseIds = extraConfig4.getPullDownCloseIds()) == null || (length = pullDownCloseIds.length()) == 0)) {
            com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class);
            l.b(a3, "");
            com.bytedance.android.live.b.j hybridDialogManager = ((com.bytedance.android.live.b.f) a3).getHybridDialogManager();
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < length; i4++) {
                String optString = pullDownCloseIds.optString(i4, "unknown");
                l.b(optString, "");
                com.bytedance.android.live.core.widget.a b3 = hybridDialogManager.b(optString);
                if (b3 instanceof com.bytedance.android.livesdk.container.e) {
                    arrayList.add(b3);
                }
            }
            a(new a.c(arrayList, this));
        }
        com.bytedance.android.livesdk.container.f.a.a(d2);
        MethodCollector.o(9306);
    }

    static final class b implements DialogInterface.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f16874a;

        static {
            Covode.recordClassIndex(9362);
        }

        b(e eVar) {
            this.f16874a = eVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
            com.bytedance.android.livesdk.container.c.a aVar;
            com.bytedance.android.livesdk.container.c.a aVar2;
            l.b(keyEvent, "");
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
                if (this.f16874a.d().getDisableBackPress()) {
                    return true;
                }
                a aVar3 = this.f16874a.f16867f;
                if (!(aVar3 == null || (aVar = aVar3.f16816a) == null || !aVar.g())) {
                    a aVar4 = this.f16874a.f16867f;
                    if (!(aVar4 == null || (aVar2 = aVar4.f16816a) == null)) {
                        aVar2.h();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        View a2 = com.a.a(getLayoutInflater(), R.layout.bdb, viewGroup, false);
        this.f16871k = (FrameLayout) a2.findViewById(R.id.bhc);
        this.f16872l = (ViewGroup) a2.findViewById(R.id.d7k);
        this.f16873m = a2.findViewById(R.id.d7m);
        this.f16866e = (ContainerCoordinatorLayout) a2.findViewById(R.id.adb);
        this.f16868g = (ImageView) a2.findViewById(R.id.bhd);
        return a2;
    }
}
