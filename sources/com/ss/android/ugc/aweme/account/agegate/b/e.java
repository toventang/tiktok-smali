package com.ss.android.ugc.aweme.account.agegate.b;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.r;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.ss.android.ugc.aweme.account.agegate.util.f;
import com.ss.android.ugc.aweme.account.agegate.viewmodel.AgeGateNicknameViewModel;
import com.ss.android.ugc.aweme.account.agegate.viewmodel.AgeGateResultViewModel;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator;
import com.ss.android.ugc.aweme.account.ui.InputWithIndicator;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;

public final class e extends com.ss.android.ugc.aweme.account.login.v2.ui.a.a {

    /* renamed from: a  reason: collision with root package name */
    public AgeGateNicknameViewModel f62670a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.account.login.f.b f62671b = new com.ss.android.ugc.aweme.account.login.f.b();

    /* renamed from: c  reason: collision with root package name */
    final h f62672c = i.a((h.f.a.a) new C1376e(this));

    /* renamed from: d  reason: collision with root package name */
    private final h f62673d = i.a((h.f.a.a) new a(this));

    /* renamed from: e  reason: collision with root package name */
    private HashMap f62674e;

    static {
        Covode.recordClassIndex(38606);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f62674e == null) {
            this.f62674e = new HashMap();
        }
        View view = (View) this.f62674e.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f62674e.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.g4;
    }

    public final String e() {
        return (String) this.f62673d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f62674e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void r() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void s() {
    }

    static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(38607);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            if (this.this$0.V_() == k.AGE_GATE_LOGIN) {
                return "login";
            }
            return "sign_up";
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final boolean q() {
        f.a(e(), 0, this.f62671b.a());
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.e$e  reason: collision with other inner class name */
    static final class C1376e extends m implements h.f.a.a<r<String>> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(38611);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1376e(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ r<String> invoke() {
            Fragment parentFragment = this.this$0.getParentFragment();
            if (parentFragment != null) {
                return ((AgeGateResultViewModel) ae.a(parentFragment, (ad.b) null).a(AgeGateResultViewModel.class)).f62854a;
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f65047a = getString(R.string.aox);
        bVar.f65051e = getString(R.string.g0z);
        bVar.f65052f = getString(R.string.g0v);
        bVar.f65056j = false;
        return bVar;
    }

    public static final class b extends com.ss.android.ugc.aweme.account.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f62675a;

        static {
            Covode.recordClassIndex(38608);
        }

        b(e eVar) {
            this.f62675a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.account.i
        public final void afterTextChanged(Editable editable) {
            AgeGateNicknameViewModel ageGateNicknameViewModel = this.f62675a.f62670a;
            if (ageGateNicknameViewModel == null) {
                l.a("viewModel");
            } else {
                ageGateNicknameViewModel.a(String.valueOf(editable));
            }
        }
    }

    public final void a(boolean z) {
        LoadingButton loadingButton = (LoadingButton) c(R.id.f364if);
        if (loadingButton != null) {
            loadingButton.setEnabled(z);
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f62676a;

        static {
            Covode.recordClassIndex(38609);
        }

        c(e eVar) {
            this.f62676a = eVar;
        }

        public final void onClick(View view) {
            Editable editable;
            EditText editText;
            ClickAgent.onClick(view);
            LiveData liveData = (LiveData) this.f62676a.f62672c.getValue();
            if (liveData != null) {
                InputWithIndicator inputWithIndicator = (InputWithIndicator) this.f62676a.c(R.id.ie);
                if (inputWithIndicator == null || (editText = inputWithIndicator.getEditText()) == null) {
                    editable = null;
                } else {
                    editable = editText.getText();
                }
                liveData.postValue(String.valueOf(editable));
            }
            f.a(this.f62676a.e(), 1, this.f62676a.f62671b.a());
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f62677a;

        static {
            Covode.recordClassIndex(38610);
        }

        d(e eVar) {
            this.f62677a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (l.a(obj, (Object) true)) {
                this.f62677a.a(true);
                InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f62677a.c(R.id.ig);
                if (inputResultIndicator != null) {
                    inputResultIndicator.a();
                }
            } else if (l.a(obj, (Object) false)) {
                this.f62677a.a(false);
                InputResultIndicator inputResultIndicator2 = (InputResultIndicator) this.f62677a.c(R.id.ig);
                if (inputResultIndicator2 != null) {
                    String string = this.f62677a.getString(R.string.g0w);
                    l.b(string, "");
                    inputResultIndicator2.a(string);
                }
                f.a(this.f62677a.e(), "separate");
            } else {
                this.f62677a.a(false);
                InputResultIndicator inputResultIndicator3 = (InputResultIndicator) this.f62677a.c(R.id.ig);
                if (inputResultIndicator3 != null) {
                    inputResultIndicator3.a();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        l.d(str, "");
        InputResultIndicator inputResultIndicator = (InputResultIndicator) c(R.id.ig);
        if (inputResultIndicator != null) {
            inputResultIndicator.a(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EditText editText;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        this.f62671b.f63449a = SystemClock.elapsedRealtime();
        getViewModelStore().a();
        ac a2 = ae.a(this, (ad.b) null).a(AgeGateNicknameViewModel.class);
        l.b(a2, "");
        this.f62670a = (AgeGateNicknameViewModel) a2;
        NormalTitleBar normalTitleBar = (NormalTitleBar) c(R.id.rq);
        l.b(normalTitleBar, "");
        normalTitleBar.setVisibility(0);
        NormalTitleBar normalTitleBar2 = (NormalTitleBar) c(R.id.rq);
        l.b(normalTitleBar2, "");
        ImageView startBtn = normalTitleBar2.getStartBtn();
        l.b(startBtn, "");
        startBtn.setVisibility(0);
        NormalTitleBar normalTitleBar3 = (NormalTitleBar) c(R.id.rq);
        l.b(normalTitleBar3, "");
        ImageView endBtn = normalTitleBar3.getEndBtn();
        l.b(endBtn, "");
        endBtn.setVisibility(8);
        InputWithIndicator inputWithIndicator = (InputWithIndicator) c(R.id.ie);
        if (inputWithIndicator != null) {
            inputWithIndicator.setTextWatcher(new b(this));
        }
        InputWithIndicator inputWithIndicator2 = (InputWithIndicator) c(R.id.ie);
        if (!(inputWithIndicator2 == null || (editText = inputWithIndicator2.getEditText()) == null)) {
            InputFilter[] inputFilterArr = new InputFilter[1];
            AgeGateNicknameViewModel ageGateNicknameViewModel = this.f62670a;
            if (ageGateNicknameViewModel == null) {
                l.a("viewModel");
            }
            inputFilterArr[0] = ageGateNicknameViewModel.f62851c;
            editText.setFilters(inputFilterArr);
        }
        a(c(R.id.f364if), new c(this));
        AgeGateNicknameViewModel ageGateNicknameViewModel2 = this.f62670a;
        if (ageGateNicknameViewModel2 == null) {
            l.a("viewModel");
        }
        ageGateNicknameViewModel2.f62852d.observe(this, new d(this));
        com.ss.android.ugc.aweme.account.login.v2.ui.c.a(((InputWithIndicator) c(R.id.ie)).getEditText());
        String e2 = e();
        l.d(e2, "");
        com.ss.android.ugc.aweme.common.r.a("reg_name_page_show", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", e2).a("platform", "phone_or_email").a("user_type", "new").f62575a);
    }
}
