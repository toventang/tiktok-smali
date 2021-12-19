package com.ss.android.ugc.aweme.base.component;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.login.v2.a.ad;
import com.ss.android.ugc.aweme.account.ui.InputWithIndicator;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ae;
import com.ss.android.ugc.aweme.profile.presenter.x;
import com.ss.android.ugc.aweme.utils.dk;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.views.o;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.m;
import h.z;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

public final class h extends o implements KeyboardUtils.a, x {

    /* renamed from: a  reason: collision with root package name */
    ad f68068a = new ad();

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.account.login.v2.ui.f f68069b;

    /* renamed from: c  reason: collision with root package name */
    ae f68070c = new ae();

    /* renamed from: d  reason: collision with root package name */
    public EditText f68071d;

    /* renamed from: e  reason: collision with root package name */
    public String f68072e = "background";

    /* renamed from: f  reason: collision with root package name */
    public boolean f68073f;

    /* renamed from: g  reason: collision with root package name */
    public final Activity f68074g;

    /* renamed from: h  reason: collision with root package name */
    public final User f68075h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f68076i = h.i.a((h.f.a.a) new b(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f68077j = h.i.a((h.f.a.a) new l(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f68078k = h.i.a((h.f.a.a) new j(this));
    private final h.h n = h.i.a((h.f.a.a) new c(this));
    private final h.h o = h.i.a((h.f.a.a) new C1538h(this));
    private final h.h p = h.i.a((h.f.a.a) new i(this));
    private String q;

    static {
        Covode.recordClassIndex(41927);
    }

    private final LinearLayout d() {
        return (LinearLayout) this.f68078k.getValue();
    }

    /* access modifiers changed from: package-private */
    public final TextView a() {
        return (TextView) this.o.getValue();
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(User user, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.base.utils.KeyboardUtils.a
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.base.utils.KeyboardUtils.a
    public final void c() {
    }

    static final class b extends m implements h.f.a.a<SmartImageView> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(41929);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SmartImageView invoke() {
            return this.this$0.findViewById(R.id.bv1);
        }
    }

    static final class c extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(41930);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.findViewById(R.id.cu4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.h$h  reason: collision with other inner class name */
    static final class C1538h extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(41935);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1538h(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.findViewById(R.id.d7p);
        }
    }

    static final class i extends m implements h.f.a.a<RecyclerView> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(41936);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RecyclerView invoke() {
            return this.this$0.findViewById(R.id.drs);
        }
    }

    static final class j extends m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(41937);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            return this.this$0.findViewById(R.id.xz);
        }
    }

    static final class l extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(41939);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.findViewById(R.id.ewr);
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        EditText editText = this.f68071d;
        if (editText == null) {
            h.f.b.l.a("etUserName");
        } else {
            KeyboardUtils.c(editText);
        }
    }

    public static final class a extends com.ss.android.ugc.aweme.base.ui.o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f68079a;

        static {
            Covode.recordClassIndex(41928);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(h hVar) {
            this.f68079a = hVar;
        }

        @Override // com.ss.android.ugc.aweme.base.ui.o
        public final void afterTextChanged(Editable editable) {
            String obj = h.a(this.f68079a).getText().toString();
            if (this.f68079a.f68073f) {
                this.f68079a.f68073f = false;
            } else {
                com.ss.android.ugc.aweme.account.login.v2.ui.f fVar = this.f68079a.f68069b;
                if (fVar == null) {
                    h.f.b.l.b();
                }
                fVar.a(null);
            }
            h.a(this.f68079a).setTextColor(androidx.core.content.b.c(this.f68079a.getContext(), R.color.bx));
            if (TextUtils.isEmpty(obj)) {
                this.f68079a.a(0);
            } else {
                this.f68079a.a(1);
            }
        }
    }

    public static final class g extends f.a.m.a<com.ss.android.ugc.aweme.account.login.v2.a.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f68082a;

        static {
            Covode.recordClassIndex(41934);
        }

        @Override // org.a.c
        public final void onComplete() {
        }

        @Override // org.a.c
        public final void onError(Throwable th) {
            h.f.b.l.d(th, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(h hVar) {
            this.f68082a = hVar;
        }

        @Override // org.a.c
        public final /* synthetic */ void onNext(Object obj) {
            List g2;
            List g3;
            com.ss.android.ugc.aweme.account.login.v2.a.d dVar = (com.ss.android.ugc.aweme.account.login.v2.a.d) obj;
            h.f.b.l.d(dVar, "");
            List<String> list = dVar.f64234b;
            if (list != null && (!list.isEmpty())) {
                h hVar = this.f68082a;
                h.f.b.l.d(dVar, "");
                List<String> list2 = dVar.f64234b;
                if (list2 != null && (g2 = n.g((Iterable) list2)) != null && (g3 = n.g((Collection) g2)) != null && (!g3.isEmpty())) {
                    EditText editText = hVar.f68071d;
                    if (editText == null) {
                        h.f.b.l.a("etUserName");
                    }
                    editText.setText((CharSequence) g3.get(0));
                    com.ss.android.ugc.aweme.account.login.v2.ui.f fVar = hVar.f68069b;
                    if (fVar == null) {
                        h.f.b.l.b();
                    }
                    fVar.a(g3.subList(1, g3.size()));
                }
            }
        }
    }

    public static final /* synthetic */ EditText a(h hVar) {
        EditText editText = hVar.f68071d;
        if (editText == null) {
            h.f.b.l.a("etUserName");
        }
        return editText;
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f68081a;

        static {
            Covode.recordClassIndex(41933);
        }

        f(h hVar) {
            this.f68081a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h hVar = this.f68081a;
            h.f.b.l.d("cancel", "");
            hVar.f68072e = "cancel";
            this.f68081a.dismiss();
        }
    }

    static final class d extends m implements h.f.a.b<String, z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(41931);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            String str2 = str;
            h.f.b.l.d(str2, "");
            if (!TextUtils.isEmpty(str2)) {
                this.this$0.f68073f = true;
                h.a(this.this$0).setText(str2);
                h.a(this.this$0).setSelection(str2.length());
            }
            return z.f158842a;
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f68080a;

        static {
            Covode.recordClassIndex(41932);
        }

        e(h hVar) {
            this.f68080a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h hVar = this.f68080a;
            String obj = h.a(hVar).getText().toString();
            if (!TextUtils.isEmpty(obj)) {
                hVar.a(2);
                hVar.f68068a.a(obj, new k(hVar, obj));
            }
        }
    }

    public static final class k extends f.a.m.a<com.ss.android.ugc.aweme.account.login.v2.a.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f68083a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f68084b;

        static {
            Covode.recordClassIndex(41938);
        }

        @Override // org.a.c
        public final void onComplete() {
        }

        @Override // org.a.c
        public final /* synthetic */ void onNext(Object obj) {
            List<String> list;
            List g2;
            com.ss.android.ugc.aweme.account.login.v2.a.d dVar = (com.ss.android.ugc.aweme.account.login.v2.a.d) obj;
            h.f.b.l.d(dVar, "");
            h hVar = this.f68083a;
            String str = this.f68084b;
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(str, "");
            if (!h.f.b.l.a((Object) dVar.f64233a, (Object) false)) {
                IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g3, "");
                g3.getCurUser();
                if (dk.a(str, hVar.getContext())) {
                    hVar.f68070c.a(str);
                }
            } else {
                com.ss.android.ugc.aweme.account.login.v2.ui.f fVar = hVar.f68069b;
                if (fVar == null) {
                    h.f.b.l.b();
                }
                List<String> list2 = dVar.f64234b;
                if (list2 == null || (g2 = n.g((Iterable) list2)) == null) {
                    list = null;
                } else {
                    list = n.g((Collection) g2);
                }
                fVar.a(list);
            }
            hVar.a(1);
        }

        @Override // org.a.c
        public final void onError(Throwable th) {
            String str;
            List<String> list;
            List g2;
            h.f.b.l.d(th, "");
            h hVar = this.f68083a;
            h.f.b.l.d(th, "");
            List<String> list2 = null;
            if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) th;
                if (aVar.getRawResponse() != null) {
                    Object rawResponse = aVar.getRawResponse();
                    if (rawResponse instanceof com.ss.android.ugc.aweme.account.login.v2.a.d) {
                        com.ss.android.ugc.aweme.account.login.v2.a.d dVar = (com.ss.android.ugc.aweme.account.login.v2.a.d) rawResponse;
                        list = dVar.f64234b;
                        str = dVar.status_msg;
                    } else {
                        str = null;
                        list = null;
                    }
                    com.ss.android.ugc.aweme.account.login.v2.ui.f fVar = hVar.f68069b;
                    if (fVar == null) {
                        h.f.b.l.b();
                    }
                    if (!(list == null || (g2 = n.g((Iterable) list)) == null)) {
                        list2 = n.g((Collection) g2);
                    }
                    fVar.a(list2);
                    if (str != null && !TextUtils.isEmpty(str)) {
                        new com.bytedance.tux.g.b(hVar.f68074g).a(str).b();
                    }
                }
            }
            hVar.a(1);
            EditText editText = hVar.f68071d;
            if (editText == null) {
                h.f.b.l.a("etUserName");
            }
            editText.setTextColor(androidx.core.content.b.c(hVar.getContext(), R.color.ly));
            hVar.a().setEnabled(false);
            hVar.a().setTextColor(androidx.core.content.b.c(hVar.getContext(), R.color.c5));
        }

        k(h hVar, String str) {
            this.f68083a = hVar;
            this.f68084b = str;
        }
    }

    public final void a(int i2) {
        ((InputWithIndicator) d().findViewById(R.id.bpw)).a(i2, 0);
        if (i2 == 0) {
            a().setEnabled(false);
            a().setTextColor(androidx.core.content.b.c(getContext(), R.color.c5));
            return;
        }
        a().setEnabled(true);
        a().setTextColor(androidx.core.content.b.c(getContext(), R.color.bx));
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(boolean z) {
        if (z) {
            new com.bytedance.tux.g.b(this.f68074g).e(R.string.h_y).b();
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.base.d.d());
            this.f68072e = "save";
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.afu);
        this.f68070c.f116520c = this;
        EditText editText = ((InputWithIndicator) d().findViewById(R.id.bpw)).getEditText();
        this.f68071d = editText;
        if (editText == null) {
            h.f.b.l.a("etUserName");
        }
        editText.setFocusable(true);
        EditText editText2 = this.f68071d;
        if (editText2 == null) {
            h.f.b.l.a("etUserName");
        }
        editText2.setFocusableInTouchMode(true);
        EditText editText3 = this.f68071d;
        if (editText3 == null) {
            h.f.b.l.a("etUserName");
        }
        editText3.requestFocus();
        EditText editText4 = this.f68071d;
        if (editText4 == null) {
            h.f.b.l.a("etUserName");
        }
        if (editText4 instanceof DmtEditText) {
            EditText editText5 = this.f68071d;
            if (editText5 == null) {
                h.f.b.l.a("etUserName");
            }
            Objects.requireNonNull(editText5, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtEditText");
            ((DmtEditText) editText5).setFontType(com.bytedance.ies.dmt.ui.widget.util.d.f33795a);
        }
        UrlModel urlModel = null;
        com.ss.android.ugc.aweme.account.login.v2.ui.f fVar = new com.ss.android.ugc.aweme.account.login.v2.ui.f((RecyclerView) this.p.getValue(), null, new d(this));
        this.f68069b = fVar;
        fVar.f65069a = true;
        a().setOnClickListener(new e(this));
        ((TextView) this.n.getValue()).setOnClickListener(new f(this));
        this.f68068a.a("", new g(this));
        a(0);
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(37);
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        User user = this.f68075h;
        if (user != null) {
            urlModel = user.getAvatarMedium();
        }
        v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(urlModel));
        e.a aVar = new e.a();
        aVar.f39827a = true;
        a2.w = aVar.a();
        a2.E = (SmartImageView) this.f68076i.getValue();
        a2.c();
        String b2 = in.b(user);
        h.f.b.l.b(b2, "");
        this.q = b2;
        TextView textView = (TextView) this.f68077j.getValue();
        String str = this.q;
        if (str == null) {
            h.f.b.l.a("currentUserName");
        }
        textView.setText(str);
        EditText editText6 = this.f68071d;
        if (editText6 == null) {
            h.f.b.l.a("etUserName");
        }
        editText6.addTextChangedListener(new a(this));
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(Exception exc, int i2) {
        if (exc != null) {
            if ((exc instanceof ExecutionException) && (exc.getCause() instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                Throwable cause = exc.getCause();
                Objects.requireNonNull(cause, "null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
                exc = (Exception) cause;
            }
            if (exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) exc;
                String valueOf = String.valueOf(aVar.getErrorCode());
                String errorMsg = aVar.getErrorMsg();
                String str = this.q;
                if (str == null) {
                    h.f.b.l.a("currentUserName");
                }
                dk.a(valueOf, errorMsg, str, getContext());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Activity activity, User user) {
        super(activity, R.style.fk, true, false, false);
        h.f.b.l.d(activity, "");
        this.f68074g = activity;
        this.f68075h = user;
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            new com.bytedance.tux.g.b(this.f68074g).a(str).b();
        }
    }
}
