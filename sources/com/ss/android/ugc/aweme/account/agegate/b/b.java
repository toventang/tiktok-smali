package com.ss.android.ugc.aweme.account.agegate.b;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.agegate.util.a;
import com.ss.android.ugc.aweme.account.agegate.viewmodel.AgeGateNicknameViewModel;
import com.ss.android.ugc.aweme.account.agegate.viewmodel.AgeGateResultViewModel;
import com.ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.ss.android.ugc.aweme.account.experiment.a;
import com.ss.android.ugc.aweme.account.login.f.a;
import com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator;
import com.ss.android.ugc.aweme.account.ui.InputWithIndicator;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.hk;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.a.am;
import h.z;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public abstract class b extends com.ss.android.ugc.aweme.account.login.v2.ui.a.a implements com.ss.android.ugc.aweme.account.agegate.e.a {
    private static final HashSet<Integer> F = am.c(3008010, 3008008, 3008012, 3008020, 3008026);
    public static final HashSet<Integer> r = am.c(3008010, 3008011, 3008009, 3008008, 3008012, 3008020, 3008026);
    public static final a s = new a((byte) 0);
    private final h.h A = h.i.a((h.f.a.a) new s(this));
    private CharSequence B;
    private final h.h C = h.i.a((h.f.a.a) new o(this));
    private final h.h D = h.i.a((h.f.a.a) new p(this));
    private final h.h E = h.i.a((h.f.a.a) new c(this));
    private HashMap G;

    /* renamed from: a  reason: collision with root package name */
    private final h.h f62642a = h.i.a((h.f.a.a) new e(this));

    /* renamed from: b  reason: collision with root package name */
    private int f62643b = -3001;

    /* renamed from: c  reason: collision with root package name */
    private long f62644c;

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.account.login.f.b f62645d = new com.ss.android.ugc.aweme.account.login.f.b();

    /* renamed from: e  reason: collision with root package name */
    private boolean f62646e;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f62647j = h.i.a((h.f.a.a) new n(this));

    /* renamed from: k  reason: collision with root package name */
    public int f62648k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f62649l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f62650m;
    public int n;
    public int o;
    public String p;
    final h.h q = h.i.a((h.f.a.a) new g(this));
    private final h.h y = h.i.a((h.f.a.a) new f(this));
    private final h.h z = h.i.a((h.f.a.a) new d(this));

    private final String E() {
        return (String) this.z.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public View c(int i2) {
        if (this.G == null) {
            this.G = new HashMap();
        }
        View view = (View) this.G.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.G.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public void h() {
        HashMap hashMap = this.G;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    public final com.ss.android.ugc.aweme.account.agegate.d.a i() {
        return (com.ss.android.ugc.aweme.account.agegate.d.a) this.f62642a.getValue();
    }

    public final boolean j() {
        return ((Boolean) this.f62647j.getValue()).booleanValue();
    }

    public final String k() {
        return (String) this.A.getValue();
    }

    public final AgeGateNicknameViewModel l() {
        return (AgeGateNicknameViewModel) this.C.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38574);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(38577);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return this.this$0.getString(R.string.qs);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(38580);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            if (this.this$0.V_() == com.ss.android.ugc.aweme.account.login.v2.base.k.AGE_GATE_LOGIN) {
                return "login";
            }
            return "sign_up";
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<AgeGateNicknameViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(38588);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AgeGateNicknameViewModel invoke() {
            return ae.a(this.this$0, (ad.b) null).a(AgeGateNicknameViewModel.class);
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(38593);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return this.this$0.getString(R.string.qx);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.e.a
    public final void o() {
        this.f62648k = -1;
        com.ss.android.ugc.aweme.account.agegate.util.f.a(a(a.f.f63448a));
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void r() {
        ((LoadingButton) c(R.id.i9)).b(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void s() {
        ((LoadingButton) c(R.id.i9)).a(true);
    }

    static final class c extends h.f.b.m implements h.f.a.a<androidx.lifecycle.r<AgeGateResponse>> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(38576);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.r<AgeGateResponse> invoke() {
            Fragment parentFragment = this.this$0.getParentFragment();
            if (parentFragment != null) {
                return ((AgeGateResultViewModel) ae.a(parentFragment, (ad.b) null).a(AgeGateResultViewModel.class)).f62855b;
            }
            return null;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.account.agegate.d.a> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(38578);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.account.agegate.d.a invoke() {
            return new com.ss.android.ugc.aweme.account.agegate.d.a(this.this$0.V_(), this.this$0.A());
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(38579);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            b bVar = this.this$0;
            return bVar.getString(R.string.qw, bVar.k());
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(38587);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (this.this$0.V_() == com.ss.android.ugc.aweme.account.login.v2.base.k.THIRD_PARTY_AGE_GATE || this.this$0.V_() == com.ss.android.ugc.aweme.account.login.v2.base.k.THIRD_PARTY_FTC_AGE_GATE) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<androidx.lifecycle.r<String>> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(38589);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.r<String> invoke() {
            Fragment parentFragment = this.this$0.getParentFragment();
            if (parentFragment != null) {
                return ((AgeGateResultViewModel) ae.a(parentFragment, (ad.b) null).a(AgeGateResultViewModel.class)).f62854a;
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.ss.android.ugc.aweme.account.util.p.f65498a = null;
        com.ss.android.ugc.aweme.account.agegate.d.a i2 = i();
        i2.cd_();
        i2.h();
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            KeyboardUtils.a(activity, 16);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(38586);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            Editable editable;
            boolean z;
            EditText editText;
            InputWithIndicator inputWithIndicator = (InputWithIndicator) this.this$0.c(R.id.ib);
            if (inputWithIndicator == null || (editText = inputWithIndicator.getEditText()) == null) {
                editable = null;
            } else {
                editable = editText.getText();
            }
            String valueOf = String.valueOf(editable);
            if (valueOf == null || h.m.p.a((CharSequence) valueOf)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(!z);
        }
    }

    private final boolean I() {
        int i2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            i2 = arguments.getInt("age_gate_register_action", 0);
        } else {
            i2 = 0;
        }
        if (i2 != 1) {
            User c2 = in.c();
            h.f.b.l.b(c2, "");
            if (c2.getAgeGateAction() == 1) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        com.ss.android.ugc.aweme.common.r.a("age_gate_page", new com.ss.android.ugc.aweme.account.a.b.a().a("stay_time", this.f62645d.a()).a("page_show_cost", this.f62644c).a("step", V_().getValue()).f62575a);
        h();
    }

    static {
        Covode.recordClassIndex(38573);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.e.a
    public final void m() {
        Context context = getContext();
        if (context != null) {
            h.f.b.l.b(context, "");
            int b2 = androidx.core.content.a.f.b(context.getResources(), R.color.bx, null);
            t tVar = new t(b2, b2, b2, this);
            String str = (String) this.y.getValue();
            h.f.b.l.b(str, "");
            String k2 = k();
            h.f.b.l.b(k2, "");
            ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a(((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(context).a(R.string.qy)).d(a(str, k2, tVar)), new u(this)).a(false)).a().b().show();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.e.a
    public final void n() {
        String str;
        Context context = getContext();
        if (context != null) {
            h.f.b.l.b(context, "");
            int b2 = androidx.core.content.a.f.b(context.getResources(), R.color.bx, null);
            C1374b bVar = new C1374b(b2, b2, b2, this);
            TuxTextView tuxTextView = (TuxTextView) c(R.id.rn);
            tuxTextView.setLinksClickable(true);
            tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
            StringBuilder sb = new StringBuilder();
            com.ss.android.ugc.aweme.account.login.v2.ui.b bVar2 = this.v;
            if (bVar2 == null || (str = bVar2.f65052f) == null) {
                str = "";
            }
            String sb2 = sb.append(str).append(" ").append(E()).toString();
            String E2 = E();
            h.f.b.l.b(E2, "");
            tuxTextView.setText(a(sb2, E2, bVar));
            Context context2 = tuxTextView.getContext();
            h.f.b.l.b(context2, "");
            tuxTextView.setHighlightColor(androidx.core.content.a.f.b(context2.getResources(), R.color.c9, null));
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Bundle arguments = getArguments();
        if (arguments != null) {
            InputWithIndicator inputWithIndicator = (InputWithIndicator) c(R.id.ib);
            if (inputWithIndicator != null) {
                String string = arguments.getString("key_dob", "");
                h.f.b.l.b(string, "");
                inputWithIndicator.setText(string);
            }
            InputWithIndicator inputWithIndicator2 = (InputWithIndicator) c(R.id.ie);
            if (inputWithIndicator2 != null) {
                String string2 = arguments.getString("key_nickname", "");
                h.f.b.l.b(string2, "");
                inputWithIndicator2.setText(string2);
            }
        }
        InputWithIndicator inputWithIndicator3 = (InputWithIndicator) c(R.id.ie);
        if (inputWithIndicator3 != null && inputWithIndicator3.getVisibility() == 0) {
            com.ss.android.ugc.aweme.account.login.v2.ui.c.a(((InputWithIndicator) c(R.id.ie)).getEditText());
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onStop() {
        IBinder windowToken;
        String str;
        Bundle arguments = getArguments();
        if (arguments != null) {
            InputWithIndicator inputWithIndicator = (InputWithIndicator) c(R.id.ie);
            String str2 = null;
            if (inputWithIndicator != null) {
                str = inputWithIndicator.getText();
            } else {
                str = null;
            }
            arguments.putString("key_nickname", str);
            InputWithIndicator inputWithIndicator2 = (InputWithIndicator) c(R.id.ib);
            if (inputWithIndicator2 != null) {
                str2 = inputWithIndicator2.getText();
            }
            arguments.putString("key_dob", str2);
        }
        InputWithIndicator inputWithIndicator3 = (InputWithIndicator) c(R.id.ie);
        if (!(inputWithIndicator3 == null || (windowToken = inputWithIndicator3.getWindowToken()) == null)) {
            a(windowToken);
        }
        super.onStop();
    }

    public final void t() {
        boolean z2;
        Editable editable;
        EditText editText;
        InputWithIndicator inputWithIndicator = (InputWithIndicator) c(R.id.ie);
        boolean z3 = false;
        if (inputWithIndicator == null || inputWithIndicator.getVisibility() != 0) {
            z2 = true;
        } else {
            z2 = !h.f.b.l.a((Object) l().f62852d.getValue(), (Object) false);
        }
        LoadingButton loadingButton = (LoadingButton) c(R.id.i9);
        h.f.b.l.b(loadingButton, "");
        InputWithIndicator inputWithIndicator2 = (InputWithIndicator) c(R.id.ib);
        if (inputWithIndicator2 == null || (editText = inputWithIndicator2.getEditText()) == null) {
            editable = null;
        } else {
            editable = editText.getText();
        }
        if (hk.a(String.valueOf(editable)) && z2) {
            z3 = true;
        }
        loadingButton.setEnabled(z3);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.e.a
    public void e() {
        EditText editText;
        EditText editText2;
        TuxTextView tuxTextView = (TuxTextView) c(R.id.rn);
        h.f.b.l.b(tuxTextView, "");
        this.B = tuxTextView.getText();
        TuxTextView tuxTextView2 = (TuxTextView) c(R.id.ro);
        h.f.b.l.b(tuxTextView2, "");
        tuxTextView2.setText(getString(R.string.g0y));
        TuxTextView tuxTextView3 = (TuxTextView) c(R.id.rn);
        h.f.b.l.b(tuxTextView3, "");
        tuxTextView3.setText(getString(R.string.g0v));
        InputResultIndicator inputResultIndicator = (InputResultIndicator) c(R.id.ig);
        if (inputResultIndicator != null) {
            inputResultIndicator.setVisibility(0);
        }
        InputWithIndicator inputWithIndicator = (InputWithIndicator) c(R.id.ie);
        if (inputWithIndicator != null) {
            inputWithIndicator.setVisibility(0);
            inputWithIndicator.setTextWatcher(new h(this));
        }
        l().f62852d.observe(this, new j(this));
        InputWithIndicator inputWithIndicator2 = (InputWithIndicator) c(R.id.ie);
        if (!(inputWithIndicator2 == null || (editText2 = inputWithIndicator2.getEditText()) == null)) {
            editText2.setInputType(524288);
            editText2.setTypeface(Typeface.DEFAULT);
            editText2.setHint(getString(R.string.g0x));
            editText2.setEnabled(true);
            editText2.setFilters(new InputFilter[]{l().f62851c});
            editText2.setImeOptions(1);
            editText2.setSingleLine(true);
        }
        InputWithIndicator inputWithIndicator3 = (InputWithIndicator) c(R.id.ib);
        if (inputWithIndicator3 != null && (editText = inputWithIndicator3.getEditText()) != null) {
            editText.setOnFocusChangeListener(new i(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        String string;
        String string2;
        String string3;
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, false, null, false, false, 2047);
        if (this.f62650m) {
            bVar.f65047a = null;
            if (this.o != 1) {
                string3 = getString(R.string.r2);
            } else {
                string3 = getString(R.string.h7l);
            }
            bVar.f65052f = string3;
        } else {
            if (!this.f62649l) {
                bVar.f65047a = getString(R.string.aox);
                string = getString(R.string.d70);
            } else {
                bVar.f65047a = null;
                if (I()) {
                    string = getString(R.string.d8n);
                } else {
                    string = getString(R.string.a67);
                }
            }
            bVar.f65052f = string;
        }
        if (!this.f62650m) {
            string2 = getString(R.string.a68);
        } else if (this.n == 2) {
            string2 = getString(R.string.qr);
        } else {
            string2 = getString(R.string.r3);
        }
        bVar.f65051e = string2;
        bVar.f65053g = 2131231080;
        bVar.f65056j = false;
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final boolean q() {
        if (!this.f62646e && A() == com.ss.android.ugc.aweme.account.login.v2.base.j.GUEST_MODE && com.ss.android.ugc.aweme.account.experiment.f.f62988a.b()) {
            this.f62646e = true;
            Context requireContext = requireContext();
            h.f.b.l.b(requireContext, "");
            com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(requireContext).a(R.string.c_8).b(R.string.c_7), new r(this)).a().b().show();
            com.ss.android.ugc.aweme.account.a.b.a aVar = new com.ss.android.ugc.aweme.account.a.b.a();
            String str = this.p;
            if (str == null) {
                h.f.b.l.a("mPlatform");
            }
            com.ss.android.ugc.aweme.common.r.a("show_age_gate_persuade_popup", aVar.a("platform", str).f62575a);
            return true;
        } else if (!i().f62765a.e()) {
            return true;
        } else {
            if (this.f62650m) {
                cj.c().a("", false);
            }
            com.ss.android.ugc.aweme.account.agegate.util.h.a();
            if (j()) {
                int i2 = this.f62648k;
                if (i2 != -99) {
                    i2 = 0;
                }
                this.f62648k = i2;
                Bundle arguments = getArguments();
                if (arguments != null) {
                    arguments.putInt("result_code", this.f62648k);
                }
            } else {
                com.ss.android.ugc.aweme.account.agegate.util.f.a(a(a.C1410a.f63443a));
            }
            return false;
        }
    }

    public void g() {
        boolean z2;
        LoadingButton loadingButton;
        String string;
        EditText editText;
        int i2;
        com.ss.android.ugc.aweme.account.agegate.d.a i3 = i();
        com.ss.android.ugc.aweme.account.agegate.e.a aVar = (com.ss.android.ugc.aweme.account.agegate.e.a) i3.f76397i;
        boolean e2 = i3.f62765a.e();
        if (i3.f62765a.f62776b == com.ss.android.ugc.aweme.account.login.v2.base.k.EDIT_DOB_AGE_GATE || !a.c.a()) {
            z2 = false;
        } else {
            z2 = true;
        }
        aVar.a(e2, z2);
        if (i3.f62765a.f62776b != com.ss.android.ugc.aweme.account.login.v2.base.k.EDIT_DOB_AGE_GATE && com.bytedance.ies.abmock.b.a().a(true, "age_gate_pop_explaining_why", 0) == a.c.f62973a) {
            ((com.ss.android.ugc.aweme.account.agegate.e.a) i3.f76397i).n();
        }
        com.ss.android.ugc.aweme.account.agegate.model.b bVar = i3.f62765a;
        if ((bVar.f62776b == com.ss.android.ugc.aweme.account.login.v2.base.k.AGE_GATE_SIGN_UP || bVar.f62776b == com.ss.android.ugc.aweme.account.login.v2.base.k.AGE_GATE_LOGIN) && !a.b.a() && com.bytedance.ies.abmock.b.a().a(true, "age_gate_ask_nickname_before_dob", 0) == a.C1393a.f62968a) {
            ((com.ss.android.ugc.aweme.account.agegate.e.a) i3.f76397i).e();
        }
        Context context = getContext();
        if (context != null) {
            ((TuxTextView) c(R.id.rn)).setTextColor(androidx.core.content.b.c(context, R.color.c4));
        }
        InputWithIndicator inputWithIndicator = (InputWithIndicator) c(R.id.ib);
        if (!(inputWithIndicator == null || (editText = inputWithIndicator.getEditText()) == null)) {
            editText.setInputType(1);
            editText.setTypeface(Typeface.DEFAULT);
            if (this.f62650m) {
                i2 = R.string.qt;
            } else {
                i2 = R.string.d6z;
            }
            editText.setHint(getString(i2));
            editText.setEnabled(true);
        }
        InputWithIndicator inputWithIndicator2 = (InputWithIndicator) c(R.id.ib);
        if (inputWithIndicator2 != null) {
            inputWithIndicator2.setTextWatcher(new l(this));
        }
        InputWithIndicator inputWithIndicator3 = (InputWithIndicator) c(R.id.ib);
        if (inputWithIndicator3 != null) {
            inputWithIndicator3.setAutoHideRules(new m(this));
        }
        if (A() != com.ss.android.ugc.aweme.account.login.v2.base.j.GUEST_MODE || !com.ss.android.ugc.aweme.account.experiment.f.f62988a.a()) {
            loadingButton = (LoadingButton) c(R.id.i9);
            if (this.f62650m) {
                string = getString(R.string.asg);
            } else {
                string = getString(R.string.dgv);
            }
        } else {
            loadingButton = (LoadingButton) c(R.id.i9);
            string = getString(R.string.c_b);
        }
        h.f.b.l.b(string, "");
        loadingButton.setButtonText(string);
        t();
    }

    public static final class h extends com.ss.android.ugc.aweme.account.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f62653a;

        static {
            Covode.recordClassIndex(38581);
        }

        h(b bVar) {
            this.f62653a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.account.i
        public final void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            AgeGateNicknameViewModel l2 = this.f62653a.l();
            if (l2 != null) {
                l2.a(String.valueOf(editable));
            }
        }
    }

    public static final class k implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f62656a;

        static {
            Covode.recordClassIndex(38584);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(b bVar) {
            this.f62656a = bVar;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            this.f62656a.D();
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
            com.ss.android.ugc.aweme.account.agegate.d.a i2 = this.f62656a.i();
            if (a.c.a()) {
                ((com.ss.android.ugc.aweme.account.agegate.e.a) i2.f76397i).m();
                com.ss.android.ugc.aweme.account.agegate.util.f.a("click_question_mark");
            }
        }
    }

    public static final class l extends com.ss.android.ugc.aweme.account.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f62657a;

        static {
            Covode.recordClassIndex(38585);
        }

        l(b bVar) {
            this.f62657a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.account.i
        public final void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            this.f62657a.t();
        }
    }

    public static final /* synthetic */ String a(b bVar) {
        String str = bVar.p;
        if (str == null) {
            h.f.b.l.a("mPlatform");
        }
        return str;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.b$b  reason: collision with other inner class name */
    public static final class C1374b extends com.ss.android.ugc.aweme.account.views.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f62651a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f62652b;

        static {
            Covode.recordClassIndex(38575);
        }

        public final void onClick(View view) {
            h.f.b.l.d(view, "");
            ((com.ss.android.ugc.aweme.account.agegate.e.a) this.f62652b.i().f76397i).m();
            com.ss.android.ugc.aweme.account.agegate.util.f.a("click_link");
        }

        @Override // com.ss.android.ugc.aweme.account.views.c
        public final void updateDrawState(TextPaint textPaint) {
            h.f.b.l.d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setFakeBoldText(false);
            textPaint.setUnderlineText(false);
            textPaint.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1374b(int i2, int i3, int i4, b bVar) {
            super(i3, i4);
            this.f62651a = i2;
            this.f62652b = bVar;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(38591);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.a(17039370, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.account.agegate.b.b.r.AnonymousClass1 */
                final /* synthetic */ r this$0;

                static {
                    Covode.recordClassIndex(38592);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    com.ss.android.ugc.aweme.common.r.a("click_age_gate_persuade_popup", new com.ss.android.ugc.aweme.account.a.b.a().a("platform", b.a(this.this$0.this$0)).f62575a);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    public static final class t extends com.ss.android.ugc.aweme.account.views.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f62659a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f62660b;

        static {
            Covode.recordClassIndex(38594);
        }

        @Override // com.ss.android.ugc.aweme.account.views.c
        public final void updateDrawState(TextPaint textPaint) {
            h.f.b.l.d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setFakeBoldText(true);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            String concat;
            h.f.b.l.d(view, "");
            com.ss.android.ugc.aweme.account.agegate.e.a aVar = (com.ss.android.ugc.aweme.account.agegate.e.a) this.f62660b.i().f76397i;
            String a2 = com.ss.android.ugc.aweme.language.d.a();
            String lowerCase = ((ILanguageService) com.ss.android.ugc.aweme.a.a(ILanguageService.class)).a().toLowerCase();
            if (com.ss.android.ugc.aweme.language.d.f()) {
                concat = "https://www.tiktok.com/legal/privacy-policy-us?lang=".concat(String.valueOf(lowerCase));
            } else if ((!TextUtils.isEmpty(a2) && Arrays.asList("AT", "BE", "BG", "HR", "CY", "CZ", "DK", "EE", "FI", "FR", "DE", "GR", "HU", "IE", "IT", "LV", "LT", "LU", "MT", "NL", "PL", "PT", "RO", "SK", "SI", "ES", "SE", "IS", "LI", "NO").contains(a2.toUpperCase(Locale.US))) || a2.equalsIgnoreCase("GB") || a2.equalsIgnoreCase("CH")) {
                if (com.ss.android.ugc.aweme.account.agegate.model.b.f62774a.contains(a2)) {
                    lowerCase = "en";
                }
                concat = "https://www.tiktok.com/legal/privacy-policy-eea?lang=".concat(String.valueOf(lowerCase));
            } else {
                concat = "https://www.tiktok.com/legal/privacy-policy-row?lang=".concat(String.valueOf(lowerCase));
            }
            aVar.b(concat);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(int i2, int i3, int i4, b bVar) {
            super(i3, i4);
            this.f62659a = i2;
            this.f62660b = bVar;
        }
    }

    static final class u extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(38595);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.a(R.string.asq, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.account.agegate.b.b.u.AnonymousClass1 */
                final /* synthetic */ u this$0;

                static {
                    Covode.recordClassIndex(38596);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    String str;
                    h.f.b.l.d(aVar, "");
                    this.this$0.this$0.i();
                    if (a.c.a()) {
                        str = "click_question_mark";
                    } else {
                        str = "click_link";
                    }
                    h.f.b.l.d(str, "");
                    com.ss.android.ugc.aweme.common.r.a("age_gate_info_popup_click", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", str).a("action_type", "click_ok").f62575a);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.e.a
    public void b(int i2) {
        this.f62643b = i2;
        com.ss.android.ugc.aweme.account.agegate.util.f.a(a(new a.e(this.f62643b)));
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.e.a
    public final void b(AgeGateResponse ageGateResponse) {
        LiveData liveData;
        String str;
        if (ageGateResponse != null) {
            InputWithIndicator inputWithIndicator = (InputWithIndicator) c(R.id.ie);
            if (!(inputWithIndicator == null || inputWithIndicator.getVisibility() != 0 || (liveData = (LiveData) this.D.getValue()) == null)) {
                InputWithIndicator inputWithIndicator2 = (InputWithIndicator) c(R.id.ie);
                if (inputWithIndicator2 != null) {
                    str = inputWithIndicator2.getText();
                } else {
                    str = null;
                }
                liveData.postValue(str);
            }
            LiveData liveData2 = (LiveData) this.E.getValue();
            if (liveData2 != null) {
                liveData2.postValue(ageGateResponse);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.e.a
    public final void d(String str) {
        if (hk.a(str)) {
            androidx.fragment.app.e activity = getActivity();
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            new com.bytedance.tux.g.b(activity).a(str).b();
            return;
        }
        androidx.fragment.app.e activity2 = getActivity();
        if (activity2 == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(activity2, "");
        new com.bytedance.tux.g.b(activity2).e(R.string.de8).b();
    }

    /* access modifiers changed from: package-private */
    public static final class j<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f62655a;

        static {
            Covode.recordClassIndex(38583);
        }

        j(b bVar) {
            this.f62655a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            EditText editText;
            EditText editText2;
            if (h.f.b.l.a(obj, (Object) false)) {
                InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f62655a.c(R.id.ig);
                if (inputResultIndicator != null) {
                    String string = this.f62655a.getString(R.string.g0w);
                    h.f.b.l.b(string, "");
                    inputResultIndicator.a(string);
                }
                InputWithIndicator inputWithIndicator = (InputWithIndicator) this.f62655a.c(R.id.ib);
                if (!(inputWithIndicator == null || (editText2 = inputWithIndicator.getEditText()) == null)) {
                    editText2.setEnabled(false);
                }
                com.ss.android.ugc.aweme.account.agegate.util.f.a((String) this.f62655a.q.getValue(), "combine");
            } else {
                InputResultIndicator inputResultIndicator2 = (InputResultIndicator) this.f62655a.c(R.id.ig);
                if (inputResultIndicator2 != null) {
                    inputResultIndicator2.a();
                }
                InputWithIndicator inputWithIndicator2 = (InputWithIndicator) this.f62655a.c(R.id.ib);
                if (!(inputWithIndicator2 == null || (editText = inputWithIndicator2.getEditText()) == null)) {
                    editText.setEnabled(true);
                }
            }
            this.f62655a.t();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.e.a
    public final void b(String str) {
        h.f.b.l.d(str, "");
        Context context = getContext();
        if (context != null) {
            SmartRouter.buildRoute(context, "//webview").withParam(Uri.parse(str)).withParam("use_webview_title", true).open();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.e.a
    public final void c(String str) {
        h.f.b.l.d(str, "");
        a.C0731a aVar = new a.C0731a(getActivity());
        if (!TextUtils.isEmpty(str)) {
            com.ss.android.ugc.aweme.account.a.b.a aVar2 = new com.ss.android.ugc.aweme.account.a.b.a();
            String str2 = this.p;
            if (str2 == null) {
                h.f.b.l.a("mPlatform");
            }
            com.ss.android.ugc.aweme.common.r.a("age_gate_eligible_popup", aVar2.a("platform", str2).a("enter_method", x()).a("enter_from", w()).f62575a);
            aVar.f33402b = str;
            aVar.a(R.string.asq, (DialogInterface.OnClickListener) new q(this), false);
            aVar.a().c().setCancelable(false);
        }
    }

    private static void a(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playSequentially(ObjectAnimator.ofFloat(view, "translationX", 0.0f, -((float) com.ss.android.ugc.aweme.base.utils.n.a(6.0d))).setDuration(80L), ObjectAnimator.ofFloat(view, "translationX", -((float) com.ss.android.ugc.aweme.base.utils.n.a(6.0d)), 0.0f).setDuration(80L), ObjectAnimator.ofFloat(view, "translationX", 0.0f, (float) com.ss.android.ugc.aweme.base.utils.n.a(4.0d)).setDuration(60L), ObjectAnimator.ofFloat(view, "translationX", (float) com.ss.android.ugc.aweme.base.utils.n.a(4.0d), 0.0f).setDuration(60L), ObjectAnimator.ofFloat(view, "translationX", 0.0f, -((float) com.ss.android.ugc.aweme.base.utils.n.a(2.0d))).setDuration(40L), ObjectAnimator.ofFloat(view, "translationX", -((float) com.ss.android.ugc.aweme.base.utils.n.a(2.0d)), 0.0f).setDuration(40L), ObjectAnimator.ofFloat(view, "translationX", 0.0f, (float) com.ss.android.ugc.aweme.base.utils.n.a(1.0d)).setDuration(20L), ObjectAnimator.ofFloat(view, "translationX", (float) com.ss.android.ugc.aweme.base.utils.n.a(1.0d), 0.0f).setDuration(20L));
        animatorSet.start();
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.e.a
    public final void a(AgeGateResponse ageGateResponse) {
        h.f.b.l.d(ageGateResponse, "");
        if (ageGateResponse.getAgeGatePostAction() == 1 || ageGateResponse.getRegisterAgeGatePostAction() == 1) {
            com.ss.android.ugc.aweme.account.agegate.util.f.a(a(a.d.f63446a));
        } else {
            com.ss.android.ugc.aweme.account.agegate.util.f.a(a(a.b.f63444a));
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z2;
        String str;
        String str2;
        com.ss.android.ugc.aweme.account.login.f.c cVar;
        boolean z3;
        int i2;
        User curUser;
        String str3;
        int i3;
        int i4;
        super.onCreate(bundle);
        this.f62645d.f63449a = SystemClock.elapsedRealtime();
        boolean z4 = false;
        Keva.getRepo("compliance_setting").storeBoolean("need_to_show_ftc_age_gate_but_no_showed", false);
        if (V_() == com.ss.android.ugc.aweme.account.login.v2.base.k.EDIT_DOB_AGE_GATE) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                i3 = arguments.getInt("user_age_status", 0);
            } else {
                i3 = 0;
            }
            this.n = i3;
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                i4 = arguments2.getInt("description_type", 0);
            } else {
                i4 = 0;
            }
            this.o = i4;
            this.f62650m = true;
        }
        if (j()) {
            Bundle arguments3 = getArguments();
            if (arguments3 == null || (str3 = arguments3.getString("platform", "")) == null) {
                str3 = "";
            }
            this.p = str3;
        } else {
            if (V_() == com.ss.android.ugc.aweme.account.login.v2.base.k.AGE_GATE) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f62649l = z2;
            if (V_() == com.ss.android.ugc.aweme.account.login.v2.base.k.AGE_GATE_LOGIN) {
                str = "sms_verification";
            } else {
                str = "phone";
            }
            this.p = str;
        }
        if (A() == com.ss.android.ugc.aweme.account.login.v2.base.j.GUEST_MODE) {
            this.p = "guestmode";
        }
        boolean I = I();
        if (this.f62649l) {
            str2 = "existing";
        } else {
            str2 = this.p;
            if (str2 == null) {
                h.f.b.l.a("mPlatform");
            }
        }
        if (this.f62649l) {
            cVar = com.ss.android.ugc.aweme.account.login.f.c.EXISTING_USER;
        } else {
            cVar = com.ss.android.ugc.aweme.account.login.f.c.NEW_USER;
        }
        boolean z5 = this.f62650m;
        String x = x();
        h.f.b.l.b(x, "");
        int i5 = this.n;
        String w = w();
        h.f.b.l.b(w, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(x, "");
        h.f.b.l.d(w, "");
        if (z5) {
            com.ss.android.ugc.aweme.common.r.a("show_age_edit_page", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", "age_edit_page").a("enter_method", x).a("user_age_status", i5).f62575a);
        } else if (I) {
            IAccountUserService e2 = cj.f71084b.e();
            com.ss.android.ugc.aweme.account.a.b.a a2 = new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", x);
            if (e2 == null || !e2.isLogin()) {
                z3 = false;
            } else {
                z3 = true;
            }
            com.ss.android.ugc.aweme.account.a.b.a a3 = a2.a("user_is_login", String.valueOf(z3)).a("is_bind_fb", String.valueOf(com.ss.android.sdk.a.b.f60131a.a("facebook"))).a("is_bind_gl", String.valueOf(com.ss.android.sdk.a.b.f60131a.a("google")));
            if (e2 == null || (curUser = e2.getCurUser()) == null) {
                i2 = -1;
            } else {
                i2 = curUser.getUserMode();
            }
            com.ss.android.ugc.aweme.account.a.b.a a4 = a3.a("user_mode", i2);
            if (com.ss.android.ugc.aweme.account.util.q.f65501a == -1) {
                com.ss.android.ugc.aweme.account.util.q.f65501a = com.ss.android.ugc.aweme.account.util.q.c().getInt("ftc_age_enable", 0);
            }
            if (com.ss.android.ugc.aweme.account.util.q.f65501a == 1) {
                z4 = true;
            }
            com.ss.android.ugc.aweme.common.r.a("f_age_gate_show", a4.a("is_ftc_enable", String.valueOf(z4)).a("user_type", com.ss.android.ugc.aweme.account.agegate.util.f.a(cVar)).a("enter_from", w).a("platform", str2).f62575a);
        } else {
            com.ss.android.ugc.aweme.common.r.a("age_gate_show", new com.ss.android.ugc.aweme.account.a.b.a().a("platform", str2).a("user_type", com.ss.android.ugc.aweme.account.agegate.util.f.a(cVar)).a("enter_from", w).a("enter_method", x).f62575a);
        }
        com.ss.android.ugc.aweme.account.agegate.d.a i6 = i();
        i6.a_(this);
        i6.a(i6.f62765a);
    }

    /* access modifiers changed from: protected */
    public final com.ss.android.ugc.aweme.account.agegate.util.a a(com.ss.android.ugc.aweme.account.login.f.a aVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        h.f.b.l.d(aVar, "");
        String str = null;
        if (aVar instanceof a.f) {
            if (this.f62650m) {
                T t2 = i().f76396h;
                h.f.b.l.b(t2, "");
                T t3 = t2.mData;
                h.f.b.l.b(t3, "");
                String x = x();
                h.f.b.l.b(x, "");
                String w = w();
                h.f.b.l.b(w, "");
                return new a.b(t3, w, x, this.f62645d.a(), this.n);
            } else if (I()) {
                com.ss.android.ugc.aweme.account.login.f.c a2 = com.ss.android.ugc.aweme.account.login.f.d.a(this.f62649l);
                T t4 = i().f76396h;
                h.f.b.l.b(t4, "");
                T t5 = t4.mData;
                h.f.b.l.b(t5, "");
                String x2 = x();
                h.f.b.l.b(x2, "");
                String w2 = w();
                h.f.b.l.b(w2, "");
                String str2 = this.p;
                if (str2 == null) {
                    h.f.b.l.a("mPlatform");
                }
                long a3 = this.f62645d.a();
                InputWithIndicator inputWithIndicator = (InputWithIndicator) c(R.id.ie);
                if (inputWithIndicator != null) {
                    str = inputWithIndicator.getText();
                }
                if (String.valueOf(str).length() > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                return new a.c(a2, t5, x2, w2, str2, a3, z5, 64);
            } else {
                com.ss.android.ugc.aweme.account.login.f.c a4 = com.ss.android.ugc.aweme.account.login.f.d.a(this.f62649l);
                String w3 = w();
                h.f.b.l.b(w3, "");
                String x3 = x();
                h.f.b.l.b(x3, "");
                T t6 = i().f76396h;
                h.f.b.l.b(t6, "");
                T t7 = t6.mData;
                h.f.b.l.b(t7, "");
                String str3 = this.p;
                if (str3 == null) {
                    h.f.b.l.a("mPlatform");
                }
                long a5 = this.f62645d.a();
                InputWithIndicator inputWithIndicator2 = (InputWithIndicator) c(R.id.ie);
                if (inputWithIndicator2 != null) {
                    str = inputWithIndicator2.getText();
                }
                if (String.valueOf(str).length() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return new a.C1382a(a4, t7, w3, x3, str3, a5, z4);
            }
        } else if (aVar instanceof a.e) {
            if (this.f62650m) {
                AgeGateResponse ageGateResponse = new AgeGateResponse(((a.e) aVar).f63447a, null, false, 0, 0, null, 62, null);
                String x4 = x();
                h.f.b.l.b(x4, "");
                String w4 = w();
                h.f.b.l.b(w4, "");
                return new a.b(ageGateResponse, w4, x4, this.f62645d.a(), this.n);
            } else if (I()) {
                com.ss.android.ugc.aweme.account.login.f.c a6 = com.ss.android.ugc.aweme.account.login.f.d.a(this.f62649l);
                AgeGateResponse ageGateResponse2 = new AgeGateResponse(((a.e) aVar).f63447a, null, false, 0, 0, null, 62, null);
                String x5 = x();
                h.f.b.l.b(x5, "");
                String w5 = w();
                h.f.b.l.b(w5, "");
                String str4 = this.p;
                if (str4 == null) {
                    h.f.b.l.a("mPlatform");
                }
                return new a.c(a6, ageGateResponse2, x5, w5, str4, this.f62645d.a(), false, 192);
            } else {
                com.ss.android.ugc.aweme.account.login.f.c a7 = com.ss.android.ugc.aweme.account.login.f.d.a(this.f62649l);
                AgeGateResponse ageGateResponse3 = new AgeGateResponse(((a.e) aVar).f63447a, null, false, 0, 0, null, 62, null);
                String w6 = w();
                h.f.b.l.b(w6, "");
                String x6 = x();
                h.f.b.l.b(x6, "");
                String str5 = this.p;
                if (str5 == null) {
                    h.f.b.l.a("mPlatform");
                }
                return new a.C1382a(a7, ageGateResponse3, w6, x6, str5, this.f62645d.a());
            }
        } else if (aVar instanceof a.b) {
            if (this.f62650m) {
                AgeGateResponse ageGateResponse4 = new AgeGateResponse(56004, null, false, 0, 0, null, 62, null);
                String x7 = x();
                h.f.b.l.b(x7, "");
                String w7 = w();
                h.f.b.l.b(w7, "");
                return new a.b(ageGateResponse4, w7, x7, this.f62645d.a(), this.n);
            }
            com.ss.android.ugc.aweme.account.login.f.c a8 = com.ss.android.ugc.aweme.account.login.f.d.a(this.f62649l);
            AgeGateResponse ageGateResponse5 = new AgeGateResponse(56004, null, false, 0, 0, null, 62, null);
            String w8 = w();
            h.f.b.l.b(w8, "");
            String x8 = x();
            h.f.b.l.b(x8, "");
            String str6 = this.p;
            if (str6 == null) {
                h.f.b.l.a("mPlatform");
            }
            return new a.C1382a(a8, ageGateResponse5, w8, x8, str6, this.f62645d.a());
        } else if ((aVar instanceof a.d) || (aVar instanceof a.c)) {
            if (this.f62650m) {
                AgeGateResponse ageGateResponse6 = new AgeGateResponse(56004, null, false, 0, 0, null, 62, null);
                String x9 = x();
                h.f.b.l.b(x9, "");
                String w9 = w();
                h.f.b.l.b(w9, "");
                return new a.b(ageGateResponse6, w9, x9, this.f62645d.a(), this.n);
            }
            com.ss.android.ugc.aweme.account.login.f.c a9 = com.ss.android.ugc.aweme.account.login.f.d.a(this.f62649l);
            AgeGateResponse ageGateResponse7 = new AgeGateResponse(56004, null, false, 0, 0, null, 62, null);
            String w10 = w();
            h.f.b.l.b(w10, "");
            String x10 = x();
            h.f.b.l.b(x10, "");
            String str7 = this.p;
            if (str7 == null) {
                h.f.b.l.a("mPlatform");
            }
            return new a.c(a9, ageGateResponse7, x10, w10, str7, this.f62645d.a(), false, 192);
        } else if (!(aVar instanceof a.C1410a)) {
            throw new h.n();
        } else if (this.f62650m) {
            AgeGateResponse ageGateResponse8 = new AgeGateResponse(this.f62643b, null, false, 0, 0, null, 62, null);
            String x11 = x();
            h.f.b.l.b(x11, "");
            String w11 = w();
            h.f.b.l.b(w11, "");
            return new a.b(ageGateResponse8, w11, x11, this.f62645d.a(), this.n);
        } else if (I()) {
            com.ss.android.ugc.aweme.account.login.f.c a10 = com.ss.android.ugc.aweme.account.login.f.d.a(this.f62649l);
            AgeGateResponse ageGateResponse9 = new AgeGateResponse(this.f62643b, null, false, 0, 0, null, 62, null);
            String x12 = x();
            h.f.b.l.b(x12, "");
            String w12 = w();
            h.f.b.l.b(w12, "");
            String str8 = this.p;
            if (str8 == null) {
                h.f.b.l.a("mPlatform");
            }
            long a11 = this.f62645d.a();
            InputWithIndicator inputWithIndicator3 = (InputWithIndicator) c(R.id.ie);
            if (inputWithIndicator3 != null) {
                str = inputWithIndicator3.getText();
            }
            if (String.valueOf(str).length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new a.c(a10, ageGateResponse9, x12, w12, str8, a11, z3, 64);
        } else {
            com.ss.android.ugc.aweme.account.login.f.c a12 = com.ss.android.ugc.aweme.account.login.f.d.a(this.f62649l);
            String w13 = w();
            h.f.b.l.b(w13, "");
            String x13 = x();
            h.f.b.l.b(x13, "");
            AgeGateResponse ageGateResponse10 = new AgeGateResponse(this.f62643b, null, false, 0, 0, null, 62, null);
            String str9 = this.p;
            if (str9 == null) {
                h.f.b.l.a("mPlatform");
            }
            long a13 = this.f62645d.a();
            InputWithIndicator inputWithIndicator4 = (InputWithIndicator) c(R.id.ie);
            if (inputWithIndicator4 != null) {
                str = inputWithIndicator4.getText();
            }
            if (String.valueOf(str).length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new a.C1382a(a12, ageGateResponse10, w13, x13, str9, a13, z2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f62654a;

        static {
            Covode.recordClassIndex(38582);
        }

        i(b bVar) {
            this.f62654a = bVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (this.f62654a.f35364f) {
                b bVar = this.f62654a;
                h.f.b.l.b(view, "");
                bVar.a(view, z);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        h.f.b.l.d(str, "");
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            h.f.b.l.b(activity, "");
            new com.bytedance.tux.g.b(activity).a(str).b();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        g();
        this.f62644c = this.f62645d.a();
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            KeyboardUtils.a(activity, 48);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f62658a;

        static {
            Covode.recordClassIndex(38590);
        }

        q(b bVar) {
            this.f62658a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            if (this.f62658a.j()) {
                this.f62658a.f62648k = -99;
                androidx.fragment.app.e activity = this.f62658a.getActivity();
                if (activity != null) {
                    activity.setResult(this.f62658a.f62648k);
                }
            }
            com.ss.android.ugc.aweme.account.agegate.util.h.a();
            com.ss.android.ugc.aweme.common.r.a("age_gate_eligible_popup_confirm", new com.ss.android.ugc.aweme.account.a.b.a().a("platform", b.a(this.f62658a)).a("enter_method", this.f62658a.x()).a("enter_from", this.f62658a.w()).f62575a);
            androidx.fragment.app.e activity2 = this.f62658a.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    public void a(View view, boolean z2) {
        CharSequence charSequence;
        h.f.b.l.d(view, "");
        TuxTextView tuxTextView = (TuxTextView) c(R.id.rn);
        h.f.b.l.b(tuxTextView, "");
        if (!z2) {
            charSequence = getString(R.string.g0v);
        } else {
            charSequence = this.B;
            if (charSequence == null) {
                charSequence = "";
            }
        }
        tuxTextView.setText(charSequence);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.e.a
    public final void a(String str, int i2) {
        h.f.b.l.d(str, "");
        TuxTextView tuxTextView = (TuxTextView) c(R.id.i8);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setText(str);
        LinearLayout linearLayout = (LinearLayout) c(R.id.i_);
        h.f.b.l.b(linearLayout, "");
        linearLayout.setVisibility(0);
        if (!this.f62650m) {
            TuxTextView tuxTextView2 = (TuxTextView) c(R.id.i8);
            h.f.b.l.b(tuxTextView2, "");
            switch (i2) {
                case 3008008:
                    str = getResources().getQuantityString(R.plurals.p, 2, 2);
                    break;
                case 3008010:
                    str = getResources().getQuantityString(R.plurals.p, 0, 0);
                    break;
                case 3008012:
                    str = getResources().getQuantityString(R.plurals.p, 1, 1);
                    break;
                case 3008020:
                    str = getResources().getQuantityString(R.plurals.p, 4, 4);
                    break;
                case 3008026:
                    str = getResources().getQuantityString(R.plurals.p, 3, 3);
                    break;
            }
            tuxTextView2.setText(str);
            if (F.contains(Integer.valueOf(i2))) {
                LinearLayout linearLayout2 = (LinearLayout) c(R.id.i_);
                h.f.b.l.b(linearLayout2, "");
                a(linearLayout2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.e.a
    public final void a(boolean z2, boolean z3) {
        int i2;
        NormalTitleBar normalTitleBar = (NormalTitleBar) c(R.id.rq);
        h.f.b.l.b(normalTitleBar, "");
        int i3 = 0;
        normalTitleBar.setVisibility(0);
        NormalTitleBar normalTitleBar2 = (NormalTitleBar) c(R.id.rq);
        h.f.b.l.b(normalTitleBar2, "");
        ImageView startBtn = normalTitleBar2.getStartBtn();
        h.f.b.l.b(startBtn, "");
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        startBtn.setVisibility(i2);
        NormalTitleBar normalTitleBar3 = (NormalTitleBar) c(R.id.rq);
        h.f.b.l.b(normalTitleBar3, "");
        ImageView endBtn = normalTitleBar3.getEndBtn();
        h.f.b.l.b(endBtn, "");
        if (!z3) {
            i3 = 8;
        }
        endBtn.setVisibility(i3);
        Context context = getContext();
        if (context != null) {
            ((NormalTitleBar) c(R.id.rq)).setEndBtnIcon(R.drawable.jl);
            NormalTitleBar normalTitleBar4 = (NormalTitleBar) c(R.id.rq);
            h.f.b.l.b(normalTitleBar4, "");
            ImageView endBtn2 = normalTitleBar4.getEndBtn();
            h.f.b.l.b(context, "");
            endBtn2.setColorFilter(androidx.core.content.a.f.b(context.getResources(), R.color.bx, null), PorterDuff.Mode.SRC_IN);
        }
        ((NormalTitleBar) c(R.id.rq)).setOnTitleBarClickListener(new k(this));
    }

    private static SpannableStringBuilder a(String str, String str2, com.ss.android.ugc.aweme.account.views.c cVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        h.f.b.l.b(spannableStringBuilder2, "");
        int a2 = h.m.p.a((CharSequence) spannableStringBuilder2, str2, 0, false, 6);
        if (a2 >= 0) {
            spannableStringBuilder.setSpan(cVar, a2, str2.length() + a2, 34);
        }
        return spannableStringBuilder;
    }
}
