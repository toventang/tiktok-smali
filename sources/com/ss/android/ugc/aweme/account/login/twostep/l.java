package com.ss.android.ugc.aweme.account.login.twostep;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxCheckBox;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class l extends com.ss.android.ugc.aweme.base.f.a {

    /* renamed from: c  reason: collision with root package name */
    public static boolean f63966c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f63967d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f63968e;

    /* renamed from: j  reason: collision with root package name */
    public static final a f63969j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final h f63970a = i.a((h.f.a.a) new b(this));

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f63971b = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private HashMap f63972k;

    static {
        Covode.recordClassIndex(39414);
    }

    public final View a(int i2) {
        if (this.f63972k == null) {
            this.f63972k = new HashMap();
        }
        View view = (View) this.f63972k.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f63972k.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39415);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f63972k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static final class b extends m implements h.f.a.a<String> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(39416);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null || (string = arguments.getString("enter_from")) == null) {
                return "";
            }
            return string;
        }
    }

    public final void a() {
        boolean z;
        this.f63971b.clear();
        if (f63966c) {
            this.f63971b.add("mobile_sms_verify");
        }
        if (f63967d) {
            this.f63971b.add("email_verify");
        }
        if (f63968e) {
            this.f63971b.add("pwd_verify");
        }
        TuxButton tuxButton = (TuxButton) a(R.id.etz);
        h.f.b.l.b(tuxButton, "");
        if (this.f63971b.size() >= 2) {
            z = true;
        } else {
            z = false;
        }
        tuxButton.setEnabled(z);
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f63973a;

        static {
            Covode.recordClassIndex(39417);
        }

        c(l lVar) {
            this.f63973a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxCheckBox tuxCheckBox = (TuxCheckBox) this.f63973a.a(R.id.e6w);
            h.f.b.l.b(tuxCheckBox, "");
            l.f63966c = !tuxCheckBox.isChecked();
            TuxCheckBox tuxCheckBox2 = (TuxCheckBox) this.f63973a.a(R.id.e6w);
            h.f.b.l.b(tuxCheckBox2, "");
            tuxCheckBox2.setChecked(l.f63966c);
            this.f63973a.a();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f63974a;

        static {
            Covode.recordClassIndex(39418);
        }

        d(l lVar) {
            this.f63974a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxCheckBox tuxCheckBox = (TuxCheckBox) this.f63974a.a(R.id.av2);
            h.f.b.l.b(tuxCheckBox, "");
            l.f63967d = !tuxCheckBox.isChecked();
            TuxCheckBox tuxCheckBox2 = (TuxCheckBox) this.f63974a.a(R.id.av2);
            h.f.b.l.b(tuxCheckBox2, "");
            tuxCheckBox2.setChecked(l.f63967d);
            this.f63974a.a();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f63975a;

        static {
            Covode.recordClassIndex(39419);
        }

        e(l lVar) {
            this.f63975a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxCheckBox tuxCheckBox = (TuxCheckBox) this.f63975a.a(R.id.d28);
            h.f.b.l.b(tuxCheckBox, "");
            l.f63968e = !tuxCheckBox.isChecked();
            TuxCheckBox tuxCheckBox2 = (TuxCheckBox) this.f63975a.a(R.id.d28);
            h.f.b.l.b(tuxCheckBox2, "");
            tuxCheckBox2.setChecked(l.f63968e);
            this.f63975a.a();
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f63976a;

        static {
            Covode.recordClassIndex(39420);
        }

        f(l lVar) {
            this.f63976a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            String a2 = n.a(this.f63976a.f63971b, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 63);
            String str = (String) this.f63976a.f63970a.getValue();
            h.f.b.l.b(str, "");
            h.f.b.l.d(a2, "");
            h.f.b.l.d(str, "");
            r.a("two_step_verification_turn_on_click", q.a().a("click_button", a2).a("enter_from", str).f66730a);
            androidx.fragment.app.e activity = this.f63976a.getActivity();
            if (!(activity instanceof TwoStepVerificationManageActivity)) {
                activity = null;
            }
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = (TwoStepVerificationManageActivity) activity;
            if (twoStepVerificationManageActivity != null) {
                twoStepVerificationManageActivity.a(this.f63976a.f63971b, 1);
            }
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        ((ConstraintLayout) a(R.id.e6v)).setOnClickListener(new c(this));
        ((ConstraintLayout) a(R.id.av1)).setOnClickListener(new d(this));
        ((ConstraintLayout) a(R.id.d27)).setOnClickListener(new e(this));
        ((TuxButton) a(R.id.etz)).setOnClickListener(new f(this));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.h_, viewGroup, false);
    }
}
