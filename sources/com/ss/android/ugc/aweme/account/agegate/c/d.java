package com.ss.android.ugc.aweme.account.agegate.c;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.agegate.c.e;
import com.ss.android.ugc.aweme.account.agegate.c.f;
import com.ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.ss.android.ugc.aweme.account.login.u;
import com.ss.android.ugc.aweme.account.login.v2.base.ActionResultModel;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator;
import com.ss.android.ugc.aweme.account.ui.ChecklistItemView;
import com.ss.android.ugc.aweme.account.ui.InputWithIndicator;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.ss.android.ugc.aweme.account.util.q;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public final class d extends com.ss.android.ugc.aweme.account.login.v2.ui.a.a implements h, InputWithIndicator.b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f62745c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public f f62746a;

    /* renamed from: b  reason: collision with root package name */
    final h f62747b = i.a((h.f.a.a) new f(this));

    /* renamed from: d  reason: collision with root package name */
    private final h f62748d = i.a((h.f.a.a) new c(this));

    /* renamed from: e  reason: collision with root package name */
    private final h f62749e = i.a((h.f.a.a) new b(this));

    /* renamed from: j  reason: collision with root package name */
    private HashMap f62750j;

    static {
        Covode.recordClassIndex(38657);
    }

    private final boolean i() {
        return ((Boolean) this.f62748d.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f62750j == null) {
            this.f62750j = new HashMap();
        }
        View view = (View) this.f62750j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f62750j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.g_;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f62750j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38658);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final boolean q() {
        r.onEventV3("exit_create_password_page");
        return i();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void r() {
        ((LoadingButton) c(R.id.b_d)).b(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void s() {
        ((LoadingButton) c(R.id.b_d)).a(true);
    }

    static final class b extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(38659);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                z = arguments.getBoolean("age_gate_block");
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(38660);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            Bundle arguments = this.this$0.getArguments();
            boolean z = false;
            if (arguments != null) {
                z = arguments.getBoolean("is_existing_user", false);
            }
            return Boolean.valueOf(z);
        }
    }

    static final class f extends m implements h.f.a.a<String> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(38663);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                return arguments.getString("ftc_username", "");
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.ss.android.ugc.aweme.account.login.v2.ui.c.a(((InputWithIndicator) c(R.id.b_e)).getEditText());
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.c.h
    public final void g() {
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putString("platform", "account");
            l.b(arguments, "");
            ((ActionResultModel) ae.a(activity, (ad.b) null).a(ActionResultModel.class)).f64699b.postValue(arguments);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        String str;
        boolean z = !i();
        if (((Boolean) this.f62749e.getValue()).booleanValue()) {
            str = getString(R.string.ard);
        } else {
            str = " ";
        }
        return new com.ss.android.ugc.aweme.account.login.v2.ui.b(str, null, z, getString(R.string.adz), null, false, null, false, false, 1514);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.c.h
    public final void e() {
        if (i()) {
            q.c(false);
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", k.DELETE_VIDEO_ALERT.getValue());
        arguments.putSerializable("age_gate_response", new AgeGateResponse(0, "", false, 0, 1, null, 32, null));
        arguments.putString("enter_from", "from_create_account_password");
        l.b(arguments, "");
        a(arguments);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.c.d$d  reason: collision with other inner class name */
    public static final class C1381d implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f62751a;

        static {
            Covode.recordClassIndex(38661);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C1381d(d dVar) {
            this.f62751a = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0082, code lost:
            if (r2 != false) goto L_0x002a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void afterTextChanged(android.text.Editable r9) {
            /*
            // Method dump skipped, instructions count: 133
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.agegate.c.d.C1381d.afterTextChanged(android.text.Editable):void");
        }
    }

    public static final /* synthetic */ f a(d dVar) {
        f fVar = dVar.f62746a;
        if (fVar == null) {
            l.a("presenter");
        }
        return fVar;
    }

    private static ChecklistItemView.b d(Boolean bool) {
        if (l.a((Object) bool, (Object) true)) {
            return ChecklistItemView.b.Success;
        }
        if (l.a((Object) bool, (Object) false)) {
            return ChecklistItemView.b.Error;
        }
        return ChecklistItemView.b.None;
    }

    @Override // com.ss.android.ugc.aweme.account.ui.InputWithIndicator.b
    public final void b(int i2) {
        if (i2 == 4) {
            u.a(true);
        } else if (i2 == 5) {
            u.a(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.c.h
    public final void c(Boolean bool) {
        ChecklistItemView checklistItemView = (ChecklistItemView) c(R.id.b_8);
        if (checklistItemView != null) {
            checklistItemView.setVariant(d(bool));
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean i2 = i();
        com.bytedance.sdk.a.a.e z = z();
        String x = x();
        l.b(x, "");
        this.f62746a = new f(this, i2, z, x);
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.c.h
    public final void a(Boolean bool) {
        ChecklistItemView checklistItemView = (ChecklistItemView) c(R.id.b_7);
        if (checklistItemView != null) {
            checklistItemView.setVariant(d(bool));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.c.h
    public final void b(Boolean bool) {
        ChecklistItemView checklistItemView = (ChecklistItemView) c(R.id.b_9);
        if (checklistItemView != null) {
            checklistItemView.setVariant(d(bool));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.c.h
    public final void a(Integer num) {
        r();
        if (num != null) {
            String string = getString(num.intValue());
            l.b(string, "");
            a(0, string);
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f62752a;

        static {
            Covode.recordClassIndex(38662);
        }

        e(d dVar) {
            this.f62752a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f62752a.s();
            f a2 = d.a(this.f62752a);
            String str = (String) this.f62752a.f62747b.getValue();
            String text = ((InputWithIndicator) this.f62752a.c(R.id.b_e)).getText();
            l.d(text, "");
            if (a2.f62761c) {
                e eVar = a2.f62759a;
                f.a aVar = new f.a(a2);
                f.b bVar = new f.b(a2);
                l.d(text, "");
                l.d(aVar, "");
                l.d(bVar, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("rules_version", "v2");
                linkedHashMap.putAll(com.ss.android.ugc.aweme.account.agegate.util.h.b());
                eVar.f62754a.a(text, (Map<String, String>) linkedHashMap, (com.bytedance.sdk.a.h.b.a.m) new e.c(aVar, bVar));
                return;
            }
            e eVar2 = a2.f62759a;
            if (str == null) {
                str = "";
            }
            f.c cVar = new f.c(a2);
            f.d dVar = new f.d(a2);
            l.d(str, "");
            l.d(text, "");
            l.d(cVar, "");
            l.d(dVar, "");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("rules_version", "v2");
            linkedHashMap2.putAll(com.ss.android.ugc.aweme.account.agegate.util.h.b());
            eVar2.f62754a.a(str, text, linkedHashMap2, new e.b(cVar, dVar));
            r.a("click_create_password_next", new com.ss.android.ugc.aweme.account.a.b.a().f62575a);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.c.h
    public final void a(String str) {
        r();
        if (str != null) {
            a(0, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.agegate.c.h
    public final void a(boolean z) {
        LoadingButton loadingButton = (LoadingButton) c(R.id.b_d);
        if (loadingButton != null) {
            loadingButton.setEnabled(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        l.d(str, "");
        InputResultIndicator inputResultIndicator = (InputResultIndicator) c(R.id.b_f);
        if (inputResultIndicator != null) {
            inputResultIndicator.a(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EditText editText;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        if (i()) {
            q.c(true);
        }
        InputWithIndicator inputWithIndicator = (InputWithIndicator) c(R.id.b_e);
        if (inputWithIndicator != null) {
            inputWithIndicator.a(4, 1);
        }
        ChecklistItemView checklistItemView = (ChecklistItemView) c(R.id.b_7);
        if (checklistItemView != null) {
            String string = getString(R.string.adv);
            l.b(string, "");
            checklistItemView.setDesc(string);
        }
        ChecklistItemView checklistItemView2 = (ChecklistItemView) c(R.id.b_9);
        if (checklistItemView2 != null) {
            String string2 = getString(R.string.adw);
            l.b(string2, "");
            checklistItemView2.setDesc(string2);
        }
        ChecklistItemView checklistItemView3 = (ChecklistItemView) c(R.id.b_8);
        if (checklistItemView3 != null) {
            String string3 = getString(R.string.adx);
            l.b(string3, "");
            checklistItemView3.setDesc(string3);
        }
        InputWithIndicator inputWithIndicator2 = (InputWithIndicator) c(R.id.b_e);
        if (inputWithIndicator2 != null) {
            inputWithIndicator2.setListener(this);
        }
        InputWithIndicator inputWithIndicator3 = (InputWithIndicator) c(R.id.b_e);
        if (!(inputWithIndicator3 == null || (editText = inputWithIndicator3.getEditText()) == null)) {
            editText.addTextChangedListener(new C1381d(this));
        }
        a(c(R.id.b_d), new e(this));
        r.a("show_create_password_page", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", w()).f62575a);
    }
}
