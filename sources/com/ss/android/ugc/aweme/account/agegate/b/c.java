package com.ss.android.ugc.aweme.account.agegate.b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.a;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.bytedance.tux.sheet.sheet.a;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.agegate.util.e;
import com.ss.android.ugc.aweme.account.agegate.viewmodel.AgeGateResultViewModel;
import com.ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.ss.android.ugc.aweme.account.experiment.a;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import com.ss.android.ugc.aweme.account.util.p;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public final class c extends com.ss.android.ugc.aweme.account.login.v2.base.c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f62661a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.account.login.v2.ui.a.a f62662b;

    /* renamed from: c  reason: collision with root package name */
    private final h f62663c = i.a((h.f.a.a) new b(this));

    /* renamed from: d  reason: collision with root package name */
    private HashMap f62664d;

    static {
        Covode.recordClassIndex(38597);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void b_(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final View c(int i2) {
        if (this.f62664d == null) {
            this.f62664d = new HashMap();
        }
        View view = (View) this.f62664d.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f62664d.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void h() {
        HashMap hashMap = this.f62664d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38598);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.account.login.v2.base.c, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onDestroyView() {
        super.onDestroyView();
        getViewModelStore().a();
        h();
    }

    static final class b extends m implements h.f.a.a<com.ss.android.ugc.aweme.account.agegate.util.e> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(38599);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.account.agegate.util.e invoke() {
            Context context = this.this$0.getContext();
            if (context == null) {
                return null;
            }
            k V_ = this.this$0.V_();
            l.b(context, "");
            return new com.ss.android.ugc.aweme.account.agegate.util.e(V_, context);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Context context = getContext();
        if (context != null) {
            l.b(context, "");
            com.bytedance.tux.dialog.b a2 = a.C1094a.a(context);
            String a3 = com.a.a("%s\n%s", Arrays.copyOf(new Object[]{getString(R.string.a6b), getString(R.string.a6c)}, 2));
            l.b(a3, "");
            ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.e.a(a2.d(a3), new e(this)).a(false)).a().b().show();
            r.onEventV3("confirm_f_special_age_popup");
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final boolean q() {
        com.ss.android.ugc.aweme.account.login.v2.ui.a.a aVar = this.f62662b;
        if (aVar != null && aVar.q()) {
            return true;
        }
        androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
        l.b(childFragmentManager, "");
        if (childFragmentManager.e() > 1) {
            getChildFragmentManager().c();
        } else {
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            l.b(arguments, "");
            arguments.putInt("next_page", k.FINISH.getValue());
            arguments.putInt("result_code", -1);
            a(arguments);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<com.bytedance.tux.dialog.b.d, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(38602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.d dVar) {
            com.bytedance.tux.dialog.b.d dVar2 = dVar;
            l.d(dVar2, "");
            dVar2.a(R.string.a6a, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.account.agegate.b.c.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(38603);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    Bundle arguments = this.this$0.this$0.getArguments();
                    if (arguments == null) {
                        arguments = new Bundle();
                    }
                    l.b(arguments, "");
                    c cVar = this.this$0.this$0;
                    arguments.putInt("next_page", k.FTC_CREATE_ACCOUNT.getValue());
                    int i2 = d.f62669b[this.this$0.this$0.V_().ordinal()];
                    if (i2 == 1) {
                        arguments.putString("enter_method", "age_gate");
                    } else if (i2 == 2) {
                        arguments.putString("enter_method", "sign_in");
                    } else if (i2 == 3) {
                        arguments.putString("enter_method", "sign_up");
                    } else if (i2 == 4) {
                        arguments.putString("enter_method", "edit_dob");
                    }
                    cVar.a(arguments);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.c$c  reason: collision with other inner class name */
    static final class C1375c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f62665a;

        static {
            Covode.recordClassIndex(38600);
        }

        C1375c(c cVar) {
            this.f62665a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            String str = (String) obj;
            c cVar = this.f62665a;
            l.b(str, "");
            if (a.C1393a.a()) {
                Fragment a2 = cVar.getChildFragmentManager().a("age_gate_dob_fragment");
                if (!(a2 instanceof a)) {
                    a2 = null;
                }
                a aVar = (a) a2;
                if (aVar == null) {
                    aVar = new a();
                    aVar.setArguments(cVar.getArguments());
                }
                cVar.a(aVar, "age_gate_dob_fragment");
            }
            com.ss.android.ugc.aweme.account.agegate.util.h.f62843b = str;
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f62666a;

        static {
            Covode.recordClassIndex(38601);
        }

        d(c cVar) {
            this.f62666a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            AgeGateResponse ageGateResponse = (AgeGateResponse) obj;
            if (ageGateResponse.getStatus_code() == 0 && ageGateResponse.getAgeGatePostAction() == 0 && ageGateResponse.getRegisterAgeGatePostAction() == 0) {
                c cVar = this.f62666a;
                l.b(ageGateResponse, "");
                if (cVar.V_() != k.AGE_GATE) {
                    if (cVar.getActivity() instanceof SignUpOrLoginActivity) {
                        androidx.fragment.app.e activity = cVar.getActivity();
                        Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity");
                        ((SignUpOrLoginActivity) activity).f64775a = ageGateResponse;
                    } else {
                        Bundle arguments = cVar.getArguments();
                        if (arguments != null) {
                            arguments.putSerializable("age_gate_response", ageGateResponse);
                        }
                    }
                }
                Bundle arguments2 = cVar.getArguments();
                if (arguments2 == null) {
                    arguments2 = new Bundle();
                }
                l.b(arguments2, "");
                switch (d.f62668a[cVar.V_().ordinal()]) {
                    case 1:
                        if (cVar.A() == j.GUEST_MODE) {
                            com.ss.android.ugc.aweme.account.f.a.a(14);
                            arguments2.putInt("next_page", k.FINISH.getValue());
                            cVar.a(arguments2);
                            return;
                        } else if (com.ss.android.ugc.aweme.account.login.g.c.a()) {
                            arguments2.putInt("next_page", k.TERMS_CONSENT_SIGN_UP.getValue());
                            cVar.a(arguments2);
                            return;
                        } else {
                            arguments2.putInt("next_page", k.PHONE_EMAIL_SIGN_UP.getValue());
                            cVar.a(arguments2);
                            return;
                        }
                    case 2:
                        if (ageGateResponse.is_prompt()) {
                            SmartRouter.buildRoute(cVar.getActivity(), "//account/video/deleted/alert").withParam("age_gate_response", ageGateResponse).open();
                            androidx.fragment.app.e activity2 = cVar.getActivity();
                            if (activity2 != null) {
                                activity2.finish();
                                return;
                            }
                            return;
                        }
                        a.C0731a aVar = new a.C0731a(cVar.getActivity());
                        aVar.a(R.string.a63);
                        aVar.b(R.string.a62);
                        aVar.a(R.string.asq, (DialogInterface.OnClickListener) new f(cVar), false);
                        aVar.a().b().setCancelable(false);
                        return;
                    case 3:
                        Intent intent = new Intent();
                        intent.putExtra("age_gate_response", ageGateResponse);
                        androidx.fragment.app.e activity3 = cVar.getActivity();
                        if (activity3 != null) {
                            activity3.setResult(-1, intent);
                        }
                        androidx.fragment.app.e activity4 = cVar.getActivity();
                        if (activity4 != null) {
                            activity4.finish();
                            return;
                        }
                        return;
                    case 4:
                        Bundle arguments3 = cVar.getArguments();
                        if (arguments3 == null) {
                            arguments3 = new Bundle();
                        }
                        l.b(arguments3, "");
                        Bundle arguments4 = cVar.getArguments();
                        if (arguments4 == null || (str = arguments4.getString("sms_code_key")) == null) {
                            str = "";
                        }
                        l.b(str, "");
                        if (com.ss.android.ugc.aweme.account.login.g.c.a()) {
                            arguments3.putInt("next_page", k.TERMS_CONSENT_NEW_PHONE_USER.getValue());
                            arguments3.putString("phone_number_format", com.ss.android.ugc.aweme.account.login.h.a.a(com.ss.android.ugc.aweme.account.login.v2.base.e.b(cVar)));
                            arguments3.putString("sms_code_key", str);
                            cVar.a(arguments3);
                            return;
                        }
                        String a2 = com.ss.android.ugc.aweme.account.login.h.a.a(com.ss.android.ugc.aweme.account.login.v2.base.e.b(cVar));
                        l.b(a2, "");
                        x.a(cVar, a2, str, j.SIGN_UP, cVar.V_()).c();
                        return;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        Bundle arguments5 = cVar.getArguments();
                        if (arguments5 == null) {
                            arguments5 = new Bundle();
                        }
                        l.b(arguments5, "");
                        if (com.ss.android.ugc.aweme.account.login.g.c.a()) {
                            arguments5.putInt("next_page", k.TERMS_CONSENT_SIGN_UP_THIRD_PARTY.getValue());
                            cVar.a(arguments5);
                            return;
                        }
                        arguments5.putInt("next_page", k.FINISH.getValue());
                        arguments5.putInt("result_code", -1);
                        cVar.a(arguments5);
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        if (ageGateResponse.is_prompt()) {
                            SmartRouter.buildRoute(cVar.getActivity(), "//account/video/deleted/alert").withParam("age_gate_response", ageGateResponse).open();
                            androidx.fragment.app.e activity5 = cVar.getActivity();
                            if (activity5 != null) {
                                activity5.finish();
                                return;
                            }
                            return;
                        }
                        cj.c().a(com.ss.android.ugc.aweme.account.agegate.util.h.f62842a, true);
                        com.ss.android.ugc.aweme.account.agegate.util.h.a();
                        androidx.fragment.app.e activity6 = cVar.getActivity();
                        if (activity6 != null) {
                            activity6.finish();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } else {
                c cVar2 = this.f62666a;
                l.b(ageGateResponse, "");
                if ((cVar2.getActivity() instanceof SignUpOrLoginActivity) && cVar2.V_() != k.AGE_GATE) {
                    androidx.fragment.app.e activity7 = cVar2.getActivity();
                    Objects.requireNonNull(activity7, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity");
                    ((SignUpOrLoginActivity) activity7).f64775a = ageGateResponse;
                }
                if (cVar2.V_() == k.EDIT_DOB_AGE_GATE || cVar2.V_() == k.AGE_GATE) {
                    if (ageGateResponse.getAgeGatePostAction() != 1) {
                        SmartRouter.buildRoute(cVar2.getActivity(), "//account/deleted/alert").withParam("age_gate_response", ageGateResponse).open();
                        androidx.fragment.app.e activity8 = cVar2.getActivity();
                        if (activity8 != null) {
                            activity8.finish();
                            return;
                        }
                        return;
                    }
                    cVar2.a();
                } else if (ageGateResponse.getRegisterAgeGatePostAction() == 1) {
                    cVar2.a();
                }
            }
        }
    }

    static final class f implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f62667a;

        static {
            Covode.recordClassIndex(38604);
        }

        f(c cVar) {
            this.f62667a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            cj.c().a("", true);
            androidx.fragment.app.e activity = this.f62667a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(com.ss.android.ugc.aweme.account.login.v2.ui.a.a aVar, String str) {
        this.f62662b = aVar;
        getChildFragmentManager().a().b(R.id.id, aVar, str).a(str).c();
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String str;
        int i2;
        int i3;
        int i4 = 8728;
        MethodCollector.i(8728);
        l.d(view, "");
        super.onViewCreated(view, bundle);
        if ((V_() == k.AGE_GATE_SIGN_UP || V_() == k.AGE_GATE_LOGIN) && !a.b.a() && a.C1393a.a()) {
            Fragment a2 = getChildFragmentManager().a("age_gate_nickname_fragment");
            if (!(a2 instanceof e) || a2 == null) {
                e eVar = new e();
                eVar.setArguments(getArguments());
                a(eVar, "age_gate_nickname_fragment");
            }
        } else {
            Fragment a3 = getChildFragmentManager().a("age_gate_dob_fragment");
            if (!(a3 instanceof a) || a3 == null) {
                a aVar = new a();
                aVar.setArguments(getArguments());
                a(aVar, "age_gate_dob_fragment");
            }
        }
        ac a4 = ae.a(this, (ad.b) null).a(AgeGateResultViewModel.class);
        l.b(a4, "");
        AgeGateResultViewModel ageGateResultViewModel = (AgeGateResultViewModel) a4;
        ageGateResultViewModel.f62854a.observe(this, new C1375c(this));
        ageGateResultViewModel.f62855b.observe(this, new d(this));
        androidx.fragment.app.i fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            com.ss.android.ugc.aweme.account.agegate.util.e eVar2 = (com.ss.android.ugc.aweme.account.agegate.util.e) this.f62663c.getValue();
            if (eVar2 != null) {
                l.b(fragmentManager, "");
                l.d(fragmentManager, "");
                if (eVar2.f62837e != k.EDIT_DOB_AGE_GATE && p.a() && !eVar2.f62833a) {
                    if (p.f65498a != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    eVar2.f62833a = z;
                    TuxTextView tuxTextView = new TuxTextView(eVar2.f62838f, null, 0, 6);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    Resources system = Resources.getSystem();
                    l.a((Object) system, "");
                    int a5 = h.g.a.a(TypedValue.applyDimension(1, 32.0f, system.getDisplayMetrics()));
                    Resources system2 = Resources.getSystem();
                    l.a((Object) system2, "");
                    int a6 = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()));
                    Resources system3 = Resources.getSystem();
                    l.a((Object) system3, "");
                    int a7 = h.g.a.a(TypedValue.applyDimension(1, 32.0f, system3.getDisplayMetrics()));
                    Resources system4 = Resources.getSystem();
                    l.a((Object) system4, "");
                    layoutParams.setMargins(a5, a6, a7, h.g.a.a(TypedValue.applyDimension(1, 20.0f, system4.getDisplayMetrics())));
                    tuxTextView.setLayoutParams(layoutParams);
                    if (!eVar2.f62833a) {
                        str = "Select country or region";
                    } else {
                        str = "Your account will be registered in " + p.f65498a;
                    }
                    tuxTextView.setText(str);
                    tuxTextView.setTuxFont(52);
                    Resources system5 = Resources.getSystem();
                    l.a((Object) system5, "");
                    int a8 = h.g.a.a(TypedValue.applyDimension(1, 12.0f, system5.getDisplayMetrics()));
                    Resources system6 = Resources.getSystem();
                    l.a((Object) system6, "");
                    int a9 = h.g.a.a(TypedValue.applyDimension(1, 8.0f, system6.getDisplayMetrics()));
                    Resources system7 = Resources.getSystem();
                    l.a((Object) system7, "");
                    int a10 = h.g.a.a(TypedValue.applyDimension(1, 12.0f, system7.getDisplayMetrics()));
                    Resources system8 = Resources.getSystem();
                    l.a((Object) system8, "");
                    tuxTextView.setPaddingRelative(a8, a9, a10, h.g.a.a(TypedValue.applyDimension(1, 8.0f, system8.getDisplayMetrics())));
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    Context context = tuxTextView.getContext();
                    l.b(context, "");
                    Integer a11 = com.bytedance.tux.h.d.a(context, R.attr.f159897h);
                    if (a11 != null) {
                        i2 = a11.intValue();
                    } else {
                        i2 = -3355444;
                    }
                    gradientDrawable.setColor(i2);
                    Resources system9 = Resources.getSystem();
                    l.a((Object) system9, "");
                    gradientDrawable.setCornerRadius(TypedValue.applyDimension(1, 2.0f, system9.getDisplayMetrics()));
                    tuxTextView.setBackground(gradientDrawable);
                    eVar2.f62836d = tuxTextView;
                    LinearLayout linearLayout = new LinearLayout(eVar2.f62838f);
                    linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    linearLayout.setOrientation(1);
                    View view2 = eVar2.f62836d;
                    if (view2 == null) {
                        l.a("regionSelect");
                    }
                    linearLayout.addView(view2);
                    View view3 = new View(linearLayout.getContext());
                    Resources system10 = Resources.getSystem();
                    l.a((Object) system10, "");
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, h.g.a.a(TypedValue.applyDimension(1, 0.5f, system10.getDisplayMetrics())));
                    Resources system11 = Resources.getSystem();
                    l.a((Object) system11, "");
                    layoutParams2.setMarginStart(h.g.a.a(TypedValue.applyDimension(1, 32.0f, system11.getDisplayMetrics())));
                    Resources system12 = Resources.getSystem();
                    l.a((Object) system12, "");
                    layoutParams2.setMarginEnd(h.g.a.a(TypedValue.applyDimension(1, 32.0f, system12.getDisplayMetrics())));
                    view3.setLayoutParams(layoutParams2);
                    Context context2 = view3.getContext();
                    l.b(context2, "");
                    Integer a12 = com.bytedance.tux.h.d.a(context2, R.attr.ah);
                    if (a12 != null) {
                        i3 = a12.intValue();
                    } else {
                        i3 = -12303292;
                    }
                    view3.setBackground(new ColorDrawable(i3));
                    linearLayout.addView(view3);
                    Context context3 = linearLayout.getContext();
                    l.b(context3, "");
                    TuxTextView tuxTextView2 = new TuxTextView(context3, null, 0, 6);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                    Resources system13 = Resources.getSystem();
                    l.a((Object) system13, "");
                    int a13 = h.g.a.a(TypedValue.applyDimension(1, 32.0f, system13.getDisplayMetrics()));
                    Resources system14 = Resources.getSystem();
                    l.a((Object) system14, "");
                    int a14 = h.g.a.a(TypedValue.applyDimension(1, 32.0f, system14.getDisplayMetrics()));
                    Resources system15 = Resources.getSystem();
                    l.a((Object) system15, "");
                    int a15 = h.g.a.a(TypedValue.applyDimension(1, 32.0f, system15.getDisplayMetrics()));
                    Resources system16 = Resources.getSystem();
                    l.a((Object) system16, "");
                    layoutParams3.setMargins(a13, a14, a15, h.g.a.a(TypedValue.applyDimension(1, 16.0f, system16.getDisplayMetrics())));
                    tuxTextView2.setLayoutParams(layoutParams3);
                    tuxTextView2.setTuxFont(71);
                    tuxTextView2.setTextColorRes(R.attr.a4);
                    tuxTextView2.setText("This is a local_test only feature. You may need to specify registration region first when signing up in beta app.");
                    linearLayout.addView(tuxTextView2);
                    eVar2.f62835c = linearLayout;
                    TextView textView = eVar2.f62836d;
                    if (textView == null) {
                        l.a("regionSelect");
                    } else {
                        textView.setOnClickListener(new e.b(eVar2));
                    }
                    a.C1112a aVar2 = new a.C1112a();
                    LinearLayout linearLayout2 = eVar2.f62835c;
                    if (linearLayout2 == null) {
                        l.a("regionSelectViews");
                    }
                    a.C1112a b2 = aVar2.a(linearLayout2).b(false).c(false).a().b();
                    LinearLayout linearLayout3 = eVar2.f62835c;
                    if (linearLayout3 == null) {
                        l.a("regionSelectViews");
                    }
                    a.C1112a b3 = b2.b(linearLayout3.getHeight());
                    TuxNavBar.a aVar3 = new TuxNavBar.a();
                    com.bytedance.tux.navigation.a.b a16 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark);
                    a16.f45194b = true;
                    TuxNavBar.a a17 = aVar3.a(a16.a((h.f.a.a<z>) new e.c(eVar2))).a(new g().a("Choose your registration region"));
                    a17.f45188d = true;
                    eVar2.f62834b = b3.a(a17).f45299a;
                    com.bytedance.tux.sheet.sheet.a aVar4 = eVar2.f62834b;
                    if (aVar4 == null) {
                        l.a("regionSelectSheet");
                    }
                    aVar4.show(fragmentManager, (String) null);
                    i4 = 8728;
                }
                MethodCollector.o(i4);
                return;
            }
            MethodCollector.o(8728);
            return;
        }
        MethodCollector.o(8728);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.g3, viewGroup, false);
    }
}
