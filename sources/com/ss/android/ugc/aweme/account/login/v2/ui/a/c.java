package com.ss.android.ugc.aweme.account.login.v2.ui.a;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.v2.base.e;
import com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper;
import com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator;
import com.ss.android.ugc.aweme.account.login.v2.ui.f;
import com.ss.android.ugc.aweme.account.ui.InputWithIndicator;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.ss.android.ugc.aweme.account.util.h;
import com.ss.android.ugc.aweme.base.ui.o;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public abstract class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private HashMap f64797a;

    /* renamed from: e  reason: collision with root package name */
    protected EditText f64798e;

    static {
        Covode.recordClassIndex(39825);
    }

    public abstract void a(String str);

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public View c(int i2) {
        if (this.f64797a == null) {
            this.f64797a = new HashMap();
        }
        View view = (View) this.f64797a.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f64797a.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.hh;
    }

    public void g() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public void h() {
        HashMap hashMap = this.f64797a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    /* access modifiers changed from: protected */
    public final EditText i() {
        EditText editText = this.f64798e;
        if (editText == null) {
            l.a("emailInput");
        }
        return editText;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void r() {
        ((LoadingButton) c(R.id.bph)).b(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void s() {
        ((LoadingButton) c(R.id.bph)).a(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.k
    public final void f() {
        super.f();
        RecyclerView recyclerView = (RecyclerView) c(R.id.bpf);
        l.b(recyclerView, "");
        recyclerView.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.k
    public final void u() {
        super.u();
        RecyclerView recyclerView = (RecyclerView) c(R.id.bpf);
        l.b(recyclerView, "");
        recyclerView.setVisibility(8);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (AccountKeyBoardHelper.a.a()) {
            EditText editText = this.f64798e;
            if (editText == null) {
                l.a("emailInput");
            }
            com.ss.android.ugc.aweme.account.login.v2.ui.c.a(editText);
            return;
        }
        EditText editText2 = this.f64798e;
        if (editText2 == null) {
            l.a("emailInput");
        }
        editText2.requestFocus();
    }

    public final void k() {
        EditText editText = this.f64798e;
        if (editText == null) {
            l.a("emailInput");
        }
        String obj = editText.getText().toString();
        if (!h.a(obj)) {
            View c2 = c(R.id.bpg);
            l.b(c2, "");
            String string = getString(R.string.aq5);
            l.b(string, "");
            ((InputResultIndicator) c2.findViewById(R.id.bpx)).a(string);
            g();
            return;
        }
        a(obj);
    }

    public static final class a extends o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f64799a;

        static {
            Covode.recordClassIndex(39826);
        }

        a(c cVar) {
            this.f64799a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.base.ui.o
        public final void afterTextChanged(Editable editable) {
            InputResultIndicator inputResultIndicator;
            LoadingButton loadingButton = (LoadingButton) this.f64799a.c(R.id.bph);
            if (loadingButton != null) {
                loadingButton.setEnabled(!TextUtils.isEmpty(this.f64799a.i().getText()));
            }
            View c2 = this.f64799a.c(R.id.bpg);
            if (c2 != null && (inputResultIndicator = (InputResultIndicator) c2.findViewById(R.id.bpx)) != null) {
                inputResultIndicator.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f64800a;

        static {
            Covode.recordClassIndex(39827);
        }

        b(c cVar) {
            this.f64800a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f64800a.k();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        InputResultIndicator inputResultIndicator;
        l.d(str, "");
        View c2 = c(R.id.bpg);
        if (c2 != null && (inputResultIndicator = (InputResultIndicator) c2.findViewById(R.id.bpx)) != null) {
            inputResultIndicator.a(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        EditText editText = ((InputWithIndicator) c(R.id.bpw)).getEditText();
        this.f64798e = editText;
        if (editText == null) {
            l.a("emailInput");
        }
        editText.setInputType(32);
        editText.addTextChangedListener(new a(this));
        editText.setNextFocusDownId(editText.getId());
        editText.setHint(getString(R.string.apc));
        String a2 = e.a(this);
        if (!TextUtils.isEmpty(a2)) {
            editText.setText(a2);
            editText.setSelection(a2.length());
        }
        a(c(R.id.bph), new b(this));
        RecyclerView recyclerView = (RecyclerView) c(R.id.bpf);
        l.b(recyclerView, "");
        EditText editText2 = this.f64798e;
        if (editText2 == null) {
            l.a("emailInput");
        }
        String w = w();
        l.b(w, "");
        String x = x();
        l.b(x, "");
        f.c.a(recyclerView, editText2, w, x);
    }
}
