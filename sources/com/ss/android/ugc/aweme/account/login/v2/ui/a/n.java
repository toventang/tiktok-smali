package com.ss.android.ugc.aweme.account.login.v2.ui.a;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import b.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.DialogContext;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.bytedance.router.SmartRouter;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder;
import com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper;
import com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator;
import com.ss.android.ugc.aweme.account.login.v2.ui.f;
import com.ss.android.ugc.aweme.account.ui.InputWithIndicator;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.ss.android.ugc.aweme.account.util.h;
import com.ss.android.ugc.aweme.base.ui.o;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public final class n extends a {

    /* renamed from: a  reason: collision with root package name */
    public EditText f64901a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f64902b;

    static {
        Covode.recordClassIndex(39892);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f64902b == null) {
            this.f64902b = new HashMap();
        }
        View view = (View) this.f64902b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f64902b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.hm;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f64902b;
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
        ((LoadingButton) c(R.id.bph)).b(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void s() {
        ((LoadingButton) c(R.id.bph)).a(true);
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f64905a;

        static {
            Covode.recordClassIndex(39895);
        }

        c(n nVar) {
            this.f64905a = nVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.bytedance.ies.dmt.ui.dialog.dialogmanager.a aVar = a.C0732a.f33434a;
            DialogContext.a aVar2 = new DialogContext.a(this.f64905a);
            aVar2.f33424a = b.a.TWO_FACTOR_AUTH;
            aVar.a(aVar2.a(new b.c(this) {
                /* class com.ss.android.ugc.aweme.account.login.v2.ui.a.n.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f64906a;

                static {
                    Covode.recordClassIndex(39896);
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a(List<Integer> list) {
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a(List<Integer> list, int i2) {
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a() {
                    if (this.f64906a.f64905a.getActivity() != null) {
                        e activity = this.f64906a.f64905a.getActivity();
                        if (!(activity instanceof com.ss.android.ugc.aweme.account.login.v2.base.b)) {
                            activity = null;
                        }
                        com.ss.android.ugc.aweme.account.login.v2.base.b bVar = (com.ss.android.ugc.aweme.account.login.v2.base.b) activity;
                        if (bVar != null && !bVar.isFinishing()) {
                            e activity2 = this.f64906a.f64905a.getActivity();
                            if (activity2 == null) {
                                l.b();
                            }
                            l.b(activity2, "");
                            ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a(new com.bytedance.tux.dialog.b(activity2).b(this.f64906a.f64905a.getString(R.string.h1a)).d(this.f64906a.f64905a.getString(R.string.h19)), new a(this)).a(false)).a().b().show();
                        }
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f64906a = r1;
                }

                /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.n$c$1$a */
                static final class a extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(39897);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    a(AnonymousClass1 r2) {
                        super(1);
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
                        com.bytedance.tux.dialog.b.b bVar2 = bVar;
                        l.d(bVar2, "");
                        String string = this.this$0.f64906a.f64905a.getString(R.string.h18);
                        l.b(string, "");
                        bVar2.a(string, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                            /* class com.ss.android.ugc.aweme.account.login.v2.ui.a.n.c.AnonymousClass1.a.AnonymousClass1 */
                            final /* synthetic */ a this$0;

                            static {
                                Covode.recordClassIndex(39898);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                                l.d(aVar, "");
                                g gVar = new g("aweme://i18n_feedback_input");
                                gVar.a("feedback_id", "5695");
                                SmartRouter.buildRoute(this.this$0.this$0.f64906a.f64905a.getActivity(), gVar.a()).open();
                                a.C0732a.f33434a.a(b.a.TWO_FACTOR_AUTH);
                                return z.f158842a;
                            }
                        });
                        String string2 = this.this$0.f64906a.f64905a.getString(R.string.asq);
                        l.b(string2, "");
                        bVar2.b(string2, AnonymousClass2.f64907a);
                        bVar2.f44820b = true;
                        return z.f158842a;
                    }
                }
            }));
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.k
    public final void f() {
        super.f();
        RecyclerView recyclerView = (RecyclerView) c(R.id.bpf);
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.k
    public final void u() {
        super.u();
        RecyclerView recyclerView = (RecyclerView) c(R.id.bpf);
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (AccountKeyBoardHelper.a.a()) {
            EditText editText = this.f64901a;
            if (editText == null) {
                l.a("emailInput");
            }
            com.ss.android.ugc.aweme.account.login.v2.ui.c.a(editText);
            return;
        }
        EditText editText2 = this.f64901a;
        if (editText2 == null) {
            l.a("emailInput");
        }
        editText2.requestFocus();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.a.n.p():com.ss.android.ugc.aweme.account.login.v2.ui.b");
    }

    public static final class a extends o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f64903a;

        static {
            Covode.recordClassIndex(39893);
        }

        a(n nVar) {
            this.f64903a = nVar;
        }

        @Override // com.ss.android.ugc.aweme.base.ui.o
        public final void afterTextChanged(Editable editable) {
            InputResultIndicator inputResultIndicator;
            LoadingButton loadingButton = (LoadingButton) this.f64903a.c(R.id.bph);
            if (loadingButton != null) {
                EditText editText = this.f64903a.f64901a;
                if (editText == null) {
                    l.a("emailInput");
                }
                loadingButton.setEnabled(!TextUtils.isEmpty(editText.getText()));
            }
            View c2 = this.f64903a.c(R.id.bpg);
            if (c2 != null && (inputResultIndicator = (InputResultIndicator) c2.findViewById(R.id.bpx)) != null) {
                inputResultIndicator.a();
            }
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f64908a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64909b;

        static {
            Covode.recordClassIndex(39900);
        }

        d(n nVar, String str) {
            this.f64908a = nVar;
            this.f64909b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f64908a.a(this.f64909b, true);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f64904a;

        static {
            Covode.recordClassIndex(39894);
        }

        b(n nVar) {
            this.f64904a = nVar;
        }

        public final void onClick(View view) {
            com.ss.android.ugc.aweme.account.login.ui.a aVar;
            ClickAgent.onClick(view);
            n nVar = this.f64904a;
            EditText editText = nVar.f64901a;
            if (editText == null) {
                l.a("emailInput");
            }
            String obj = editText.getText().toString();
            TimerHolder.b a2 = TimerHolder.a.a(nVar.getActivity(), obj, nVar.A());
            if (a2 != null && (aVar = a2.f64744a) != null && aVar.d()) {
                nVar.a(obj, false);
            } else if (!h.a(obj)) {
                View c2 = nVar.c(R.id.bpg);
                l.b(c2, "");
                String string = nVar.getString(R.string.aq5);
                l.b(string, "");
                ((InputResultIndicator) c2.findViewById(R.id.bpx)).a(string);
            } else {
                x.a(nVar, obj, 4, "user_click", (Map) null, (String) null, 112).d(new d(nVar, obj)).c();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        InputResultIndicator inputResultIndicator;
        l.d(str, "");
        View c2 = c(R.id.bpg);
        if (!(c2 == null || (inputResultIndicator = (InputResultIndicator) c2.findViewById(R.id.bpx)) == null)) {
            inputResultIndicator.a(str);
        }
        if (i2 == 1356) {
            i.b(new c(this), i.f4826c);
        }
    }

    public final void a(String str, boolean z) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        com.ss.android.ugc.aweme.account.login.v2.base.e.a(this, str);
        arguments.putBoolean("code_sent", z);
        arguments.putInt("next_page", k.EMAIL_SMS_FIND_PASSWORD.getValue());
        l.b(arguments, "");
        a(arguments);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        EditText editText = ((InputWithIndicator) c(R.id.bpw)).getEditText();
        this.f64901a = editText;
        if (editText == null) {
            l.a("emailInput");
        }
        editText.setInputType(32);
        editText.addTextChangedListener(new a(this));
        editText.setNextFocusDownId(editText.getId());
        editText.setHint(getString(R.string.apc));
        String a2 = com.ss.android.ugc.aweme.account.login.v2.base.e.a(this);
        if (!TextUtils.isEmpty(a2)) {
            editText.setText(a2);
            editText.setSelection(a2.length());
        }
        a(c(R.id.bph), new b(this));
        RecyclerView recyclerView = (RecyclerView) c(R.id.bpf);
        l.b(recyclerView, "");
        EditText editText2 = this.f64901a;
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
