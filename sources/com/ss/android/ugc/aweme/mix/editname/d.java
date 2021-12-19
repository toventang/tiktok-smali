package com.ss.android.ugc.aweme.mix.editname;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.util.h;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.z;
import java.lang.reflect.Field;
import java.util.Objects;

public final class d extends com.bytedance.assem.arch.d.a {

    /* renamed from: j  reason: collision with root package name */
    public int f109936j = 15;

    /* renamed from: k  reason: collision with root package name */
    public EditText f109937k;

    /* renamed from: l  reason: collision with root package name */
    View f109938l;

    /* renamed from: m  reason: collision with root package name */
    LinearLayout f109939m;
    public TuxSpinner n;
    TuxButton o;
    public ImageView p;
    public boolean q;
    public final com.ss.android.ugc.aweme.util.h r;
    private final long s = 1000;
    private TextView t;
    private TextView u;
    private final com.bytedance.assem.arch.viewModel.b v;
    private final com.bytedance.assem.arch.viewModel.b w;

    public static final class b extends h.f.b.m implements h.f.a.b<a, a> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(70450);
        }

        public b() {
            super(1);
        }

        public final a invoke(a aVar) {
            h.f.b.l.c(aVar, "");
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.d$d  reason: collision with other inner class name */
    public static final class C2816d extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.mix.createmix.viewmodel.a, com.ss.android.ugc.aweme.mix.createmix.viewmodel.a> {
        public static final C2816d INSTANCE = new C2816d();

        static {
            Covode.recordClassIndex(70452);
        }

        public C2816d() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.mix.createmix.viewmodel.a invoke(com.ss.android.ugc.aweme.mix.createmix.viewmodel.a aVar) {
            h.f.b.l.c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(70448);
    }

    public final EditPlayListNameEditTextVM u() {
        return (EditPlayListNameEditTextVM) this.v.getValue();
    }

    public final MixCreateViewModel v() {
        return (MixCreateViewModel) this.w.getValue();
    }

    static final class g extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f109940a = new g();

        static {
            Covode.recordClassIndex(70455);
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

    static final class j extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f109941a = new j();

        static {
            Covode.recordClassIndex(70458);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f109942a = new m();

        static {
            Covode.recordClassIndex(70461);
        }

        m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(70449);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(70451);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    @Override // com.bytedance.assem.arch.core.a
    public final void l() {
        if (this.f109937k == null) {
            h.f.b.l.a("editText");
        } else {
            MixCreateViewModel v2 = v();
            EditText editText = this.f109937k;
            if (editText == null) {
                h.f.b.l.a("editText");
            }
            v2.b(a(editText.getText().toString()));
        }
        super.l();
    }

    static final class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f109943a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InputMethodManager f109944b;

        static {
            Covode.recordClassIndex(70462);
        }

        n(d dVar, InputMethodManager inputMethodManager) {
            this.f109943a = dVar;
            this.f109944b = inputMethodManager;
        }

        public final void run() {
            d.a(this.f109943a).setFocusable(true);
            d.a(this.f109943a).setFocusableInTouchMode(true);
            d.a(this.f109943a).requestFocus();
            d.a(this.f109943a).setSelection(d.a(this.f109943a).getText().toString().length());
            InputMethodManager inputMethodManager = this.f109944b;
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(d.a(this.f109943a), 2);
            }
        }
    }

    public static final class s implements h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f109951a;

        static {
            Covode.recordClassIndex(70467);
        }

        @Override // com.ss.android.ugc.aweme.util.h.a
        public final void a() {
            if (h.f.b.l.a((Object) d.a(this.f109951a).getText().toString(), (Object) "")) {
                d.b(this.f109951a).setVisibility(8);
                d.c(this.f109951a).setVisibility(8);
                return;
            }
            String obj = d.a(this.f109951a).getText().toString();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            if (h.m.p.b((CharSequence) obj).toString().length() == 0) {
                this.f109951a.x();
            } else if (d.a(this.f109951a).getText().toString().length() <= this.f109951a.f109936j) {
                d.b(this.f109951a).setVisibility(0);
                d.c(this.f109951a).setVisibility(8);
                this.f109951a.u().a(d.a(this.f109951a).getText().toString());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        s(d dVar) {
            this.f109951a = dVar;
        }
    }

    public d() {
        com.bytedance.assem.arch.viewModel.b bVar;
        h.k.c a2 = ab.a(EditPlayListNameEditTextVM.class);
        this.v = new com.bytedance.assem.arch.viewModel.b(a2, new a(a2), u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.a(this), b.INSTANCE, u.b(this), u.c(this));
        i.a aVar = i.a.f25718a;
        h.k.c a3 = ab.a(MixCreateViewModel.class);
        c cVar = new c(a3);
        C2816d dVar = C2816d.INSTANCE;
        if (h.f.b.l.a(aVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), u.c.f25670a, dVar, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (h.f.b.l.a(aVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), u.c.f25670a, dVar, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (aVar == null || h.f.b.l.a(aVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, dVar, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.w = bVar;
        this.r = new com.ss.android.ugc.aweme.util.h(1000, new s(this));
    }

    public final void w() {
        String str;
        CharSequence charSequence;
        androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this);
        if (b2 != null) {
            a.C0730a aVar = new a.C0730a();
            EditText editText = this.f109937k;
            if (editText == null) {
                h.f.b.l.a("editText");
            }
            a.C0730a a2 = aVar.a(String.valueOf(editText.getText().length()));
            if (gb.a()) {
                str = "‏\\";
            } else {
                str = "‎/";
            }
            com.bytedance.ies.dmt.ui.d.a aVar2 = a2.a(str).a(String.valueOf(this.f109936j)).f33382a;
            EditText editText2 = this.f109937k;
            if (editText2 == null) {
                h.f.b.l.a("editText");
            }
            if (editText2.getText().length() > this.f109936j) {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(b2.getResources().getColor(R.color.bd));
                EditText editText3 = this.f109937k;
                if (editText3 == null) {
                    h.f.b.l.a("editText");
                }
                aVar2.setSpan(foregroundColorSpan, 0, String.valueOf(editText3.getText().length()).length() + 1, 33);
                TextView textView = this.t;
                if (textView == null) {
                    h.f.b.l.a("lengthHint");
                }
                textView.setText(aVar2);
                LinearLayout linearLayout = this.f109939m;
                if (linearLayout == null) {
                    h.f.b.l.a("errorHint");
                }
                linearLayout.setVisibility(0);
                TextView textView2 = this.u;
                if (textView2 == null) {
                    h.f.b.l.a("txErrorHint");
                }
                Context ar_ = ar_();
                if (ar_ != null) {
                    charSequence = ar_.getText(R.string.abq);
                } else {
                    charSequence = null;
                }
                textView2.setText(charSequence);
                androidx.fragment.app.e b3 = com.bytedance.assem.arch.extensions.b.b(this);
                if (b3 != null) {
                    View view = this.f109938l;
                    if (view == null) {
                        h.f.b.l.a("viewLint");
                    }
                    view.setBackground(b3.getResources().getDrawable(R.color.bd));
                    return;
                }
                return;
            }
            TextView textView3 = this.t;
            if (textView3 == null) {
                h.f.b.l.a("lengthHint");
            }
            textView3.setText(aVar2);
        }
    }

    public final void x() {
        CharSequence charSequence;
        androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this);
        if (b2 != null) {
            View view = this.f109938l;
            if (view == null) {
                h.f.b.l.a("viewLint");
            }
            view.setBackground(b2.getResources().getDrawable(R.color.b0));
            TuxButton tuxButton = this.o;
            if (tuxButton == null) {
                h.f.b.l.a("button");
            }
            tuxButton.setBackground(b2.getResources().getDrawable(R.color.f159923g));
            TuxButton tuxButton2 = this.o;
            if (tuxButton2 == null) {
                h.f.b.l.a("button");
            }
            tuxButton2.setTextColor(b2.getResources().getColor(R.color.bz));
        }
        LinearLayout linearLayout = this.f109939m;
        if (linearLayout == null) {
            h.f.b.l.a("errorHint");
        }
        linearLayout.setVisibility(8);
        TuxSpinner tuxSpinner = this.n;
        if (tuxSpinner == null) {
            h.f.b.l.a("loading");
        }
        tuxSpinner.setVisibility(8);
        ImageView imageView = this.p;
        if (imageView == null) {
            h.f.b.l.a("delete");
        }
        imageView.setVisibility(0);
        TextView textView = this.u;
        if (textView == null) {
            h.f.b.l.a("txErrorHint");
        }
        Context ar_ = ar_();
        if (ar_ != null) {
            charSequence = ar_.getText(R.string.drh);
        } else {
            charSequence = null;
        }
        textView.setText(charSequence);
        TuxButton tuxButton3 = this.o;
        if (tuxButton3 == null) {
            h.f.b.l.a("button");
        }
        tuxButton3.setEnabled(false);
    }

    public static final class o implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f109945a;

        static {
            Covode.recordClassIndex(70463);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        o(d dVar) {
            this.f109945a = dVar;
        }

        public final void afterTextChanged(Editable editable) {
            this.f109945a.x();
            this.f109945a.w();
            this.f109945a.r.a();
            this.f109945a.r.b();
        }
    }

    static final class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f109946a;

        static {
            Covode.recordClassIndex(70464);
        }

        p(d dVar) {
            this.f109946a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            d.a(this.f109946a).setText("");
        }
    }

    public static final /* synthetic */ EditText a(d dVar) {
        EditText editText = dVar.f109937k;
        if (editText == null) {
            h.f.b.l.a("editText");
        }
        return editText;
    }

    public static final /* synthetic */ TuxSpinner b(d dVar) {
        TuxSpinner tuxSpinner = dVar.n;
        if (tuxSpinner == null) {
            h.f.b.l.a("loading");
        }
        return tuxSpinner;
    }

    public static final /* synthetic */ ImageView c(d dVar) {
        ImageView imageView = dVar.p;
        if (imageView == null) {
            h.f.b.l.a("delete");
        }
        return imageView;
    }

    static final class l extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(70460);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            h.f.b.l.d(th, "");
            androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this.this$0);
            if (b2 != null) {
                new com.bytedance.tux.g.b(b2).e(R.string.g21).b();
            }
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(70454);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            androidx.fragment.app.e b2;
            Throwable th2 = th;
            h.f.b.l.d(th2, "");
            String message = th2.getMessage();
            if ((message == null || !message.equals("dark_post_failed")) && (b2 = com.bytedance.assem.arch.extensions.b.b(this.this$0)) != null) {
                new com.bytedance.tux.g.b(b2).e(R.string.g21).b();
            }
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(70457);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            h.f.b.l.d(th, "");
            d.b(this.this$0).setVisibility(8);
            d.c(this.this$0).setVisibility(0);
            androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this.this$0);
            if (b2 != null) {
                new com.bytedance.tux.g.b(b2).e(R.string.g21).b();
            }
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.mix.api.response.b, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(70459);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.mix.api.response.b bVar) {
            com.ss.android.ugc.aweme.mix.api.response.b bVar2 = bVar;
            if (bVar2 != null && bVar2.status_code == 0) {
                ((k) com.bytedance.assem.arch.service.d.a(this.this$0, ab.a(k.class))).a(d.a(d.a(this.this$0).getText().toString()));
            }
            return z.f158842a;
        }
    }

    public static String a(String str) {
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        char[] charArray = str.toCharArray();
        h.f.b.l.b(charArray, "");
        int length = charArray.length;
        while (length > 0 && h.f.b.l.a(charArray[length - 1], 32) <= 0) {
            length--;
        }
        if (length >= charArray.length) {
            return new String(charArray);
        }
        String substring = new String(charArray).substring(0, length);
        h.f.b.l.b(substring, "");
        return substring;
    }

    static final class e extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.mix.api.response.b, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(70453);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.mix.api.response.b bVar) {
            com.ss.android.ugc.aweme.mix.api.response.b bVar2 = bVar;
            if (bVar2 != null && bVar2.status_code == 0 && this.this$0.q) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.mix.b.d(d.a(d.a(this.this$0).getText().toString()), bVar2.f109797a, this.this$0.v().f109872m, MixFeedService.k().b(), this.this$0.v().f109871l));
            }
            return z.f158842a;
        }
    }

    static final class q implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f109947a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InputMethodManager f109948b;

        static {
            Covode.recordClassIndex(70465);
        }

        q(d dVar, InputMethodManager inputMethodManager) {
            this.f109947a = dVar;
            this.f109948b = inputMethodManager;
        }

        public final void onClick(View view) {
            androidx.fragment.app.i supportFragmentManager;
            ClickAgent.onClick(view);
            androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this.f109947a);
            if (b2 != null && (supportFragmentManager = b2.getSupportFragmentManager()) != null) {
                InputMethodManager inputMethodManager = this.f109948b;
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(d.a(this.f109947a).getWindowToken(), 0);
                }
                this.f109947a.v().b(d.a(d.a(this.f109947a).getText().toString()));
                if (supportFragmentManager.e() == 0) {
                    androidx.fragment.app.e b3 = com.bytedance.assem.arch.extensions.b.b(this.f109947a);
                    if (b3 != null) {
                        b3.finish();
                        return;
                    }
                    return;
                }
                supportFragmentManager.c();
            }
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.mix.api.response.a, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(70456);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.mix.api.response.a aVar) {
            com.ss.android.ugc.aweme.mix.api.response.a aVar2 = aVar;
            if (this.this$0.r.c()) {
                if (aVar2 == null || !aVar2.f109795c) {
                    d dVar = this.this$0;
                    androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(dVar);
                    if (b2 != null) {
                        View view = dVar.f109938l;
                        if (view == null) {
                            h.f.b.l.a("viewLint");
                        }
                        view.setBackground(b2.getResources().getDrawable(R.color.bd));
                    }
                    LinearLayout linearLayout = dVar.f109939m;
                    if (linearLayout == null) {
                        h.f.b.l.a("errorHint");
                    }
                    linearLayout.setVisibility(0);
                    ImageView imageView = dVar.p;
                    if (imageView == null) {
                        h.f.b.l.a("delete");
                    }
                    imageView.setVisibility(0);
                    TuxButton tuxButton = dVar.o;
                    if (tuxButton == null) {
                        h.f.b.l.a("button");
                    }
                    tuxButton.setEnabled(false);
                } else {
                    d dVar2 = this.this$0;
                    EditText editText = dVar2.f109937k;
                    if (editText == null) {
                        h.f.b.l.a("editText");
                    }
                    Editable text = editText.getText();
                    h.f.b.l.b(text, "");
                    if (text.length() > 0) {
                        EditText editText2 = dVar2.f109937k;
                        if (editText2 == null) {
                            h.f.b.l.a("editText");
                        }
                        if (editText2.getText().length() <= dVar2.f109936j) {
                            TuxButton tuxButton2 = dVar2.o;
                            if (tuxButton2 == null) {
                                h.f.b.l.a("button");
                            }
                            tuxButton2.setButtonVariant(0);
                            TuxButton tuxButton3 = dVar2.o;
                            if (tuxButton3 == null) {
                                h.f.b.l.a("button");
                            }
                            tuxButton3.setEnabled(true);
                        }
                    }
                }
            }
            d.b(this.this$0).setVisibility(8);
            d.c(this.this$0).setVisibility(0);
            return z.f158842a;
        }
    }

    static final class r implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f109949a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InputMethodManager f109950b;

        static {
            Covode.recordClassIndex(70466);
        }

        r(d dVar, InputMethodManager inputMethodManager) {
            this.f109949a = dVar;
            this.f109950b = inputMethodManager;
        }

        public final void onClick(View view) {
            Integer valueOf;
            ClickAgent.onClick(view);
            InputMethodManager inputMethodManager = this.f109950b;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(d.a(this.f109949a).getWindowToken(), 0);
            }
            j jVar = (j) com.bytedance.assem.arch.service.d.f(this.f109949a, ab.a(k.class));
            String str = null;
            if (jVar != null && (valueOf = Integer.valueOf(jVar.f109964a)) != null) {
                if (valueOf.intValue() == 1) {
                    if (com.ss.android.ugc.aweme.mix.c.b.a() == 1 || com.ss.android.ugc.aweme.mix.c.b.a() == 2) {
                        this.f109949a.v().b(d.a(d.a(this.f109949a).getText().toString()));
                        this.f109949a.v().i();
                        return;
                    }
                    this.f109949a.v().b(d.a(d.a(this.f109949a).getText().toString()));
                    this.f109949a.v().a(com.ss.android.ugc.aweme.mix.createmix.viewmodel.b.MULTI_VIDEO);
                } else if (valueOf.intValue() == 2) {
                    j jVar2 = (j) com.bytedance.assem.arch.service.d.f(this.f109949a, ab.a(k.class));
                    if (jVar2 != null) {
                        str = jVar2.f109966c;
                    }
                    if (str == null) {
                        str = "";
                    }
                    EditPlayListNameEditTextVM u = this.f109949a.u();
                    String a2 = d.a(d.a(this.f109949a).getText().toString());
                    h.f.b.l.d(str, "");
                    h.f.b.l.d(a2, "");
                    u.b(new EditPlayListNameEditTextVM.a(u, str, a2));
                } else if (valueOf.intValue() == 3) {
                    this.f109949a.v().b(d.a(d.a(this.f109949a).getText().toString()));
                    this.f109949a.v().i();
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        Object obj;
        String str;
        Integer num;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        h.f.b.l.d(view, "");
        this.f109936j = com.ss.android.ugc.aweme.mix.f.a.a();
        h.f.b.l.d(view, "");
        View findViewById = view.findViewById(R.id.ay0);
        h.f.b.l.b(findViewById, "");
        this.f109937k = (EditText) findViewById;
        View findViewById2 = view.findViewById(R.id.c_5);
        h.f.b.l.b(findViewById2, "");
        this.t = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.fhz);
        h.f.b.l.b(findViewById3, "");
        this.f109938l = findViewById3;
        View findViewById4 = view.findViewById(R.id.asm);
        h.f.b.l.b(findViewById4, "");
        this.f109939m = (LinearLayout) findViewById4;
        View findViewById5 = view.findViewById(R.id.chg);
        h.f.b.l.b(findViewById5, "");
        this.n = (TuxSpinner) findViewById5;
        View findViewById6 = view.findViewById(R.id.button);
        h.f.b.l.b(findViewById6, "");
        this.o = (TuxButton) findViewById6;
        View findViewById7 = view.findViewById(R.id.ajp);
        h.f.b.l.b(findViewById7, "");
        this.p = (ImageView) findViewById7;
        View findViewById8 = view.findViewById(R.id.eyy);
        h.f.b.l.b(findViewById8, "");
        this.u = (TextView) findViewById8;
        TextView textView = (TextView) view.findViewById(R.id.anz);
        androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this);
        if (b2 != null) {
            obj = a(b2, "input_method");
        } else {
            obj = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) obj;
        EditText editText = this.f109937k;
        if (editText == null) {
            h.f.b.l.a("editText");
        }
        editText.postDelayed(new n(this, inputMethodManager), 300);
        j jVar = (j) com.bytedance.assem.arch.service.d.f(this, ab.a(k.class));
        if (jVar != null) {
            str = jVar.f109965b;
        } else {
            str = null;
        }
        if (!(str == null || str.length() == 0)) {
            EditText editText2 = this.f109937k;
            if (editText2 == null) {
                h.f.b.l.a("editText");
            }
            editText2.setText(str);
            EditText editText3 = this.f109937k;
            if (editText3 == null) {
                h.f.b.l.a("editText");
            }
            editText3.setSelection(str.length());
        }
        EditText editText4 = this.f109937k;
        if (editText4 == null) {
            h.f.b.l.a("editText");
        }
        editText4.addTextChangedListener(new o(this));
        j jVar2 = (j) com.bytedance.assem.arch.service.d.f(this, ab.a(k.class));
        if (jVar2 != null) {
            num = Integer.valueOf(jVar2.f109964a);
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 1) {
                if (com.ss.android.ugc.aweme.mix.c.b.a() == 1 || com.ss.android.ugc.aweme.mix.c.b.a() == 2) {
                    h.f.b.l.b(textView, "");
                    Context ar_ = ar_();
                    if (ar_ != null) {
                        charSequence5 = ar_.getText(R.string.dds);
                    } else {
                        charSequence5 = null;
                    }
                    textView.setText(charSequence5);
                    TuxButton tuxButton = this.o;
                    if (tuxButton == null) {
                        h.f.b.l.a("button");
                    }
                    Context ar_2 = ar_();
                    if (ar_2 != null) {
                        charSequence6 = ar_2.getText(R.string.awh);
                    } else {
                        charSequence6 = null;
                    }
                    tuxButton.setText(charSequence6);
                } else {
                    h.f.b.l.b(textView, "");
                    Context ar_3 = ar_();
                    if (ar_3 != null) {
                        charSequence7 = ar_3.getText(R.string.dds);
                    } else {
                        charSequence7 = null;
                    }
                    textView.setText(charSequence7);
                    TuxButton tuxButton2 = this.o;
                    if (tuxButton2 == null) {
                        h.f.b.l.a("button");
                    }
                    Context ar_4 = ar_();
                    if (ar_4 != null) {
                        charSequence8 = ar_4.getText(R.string.dgt);
                    } else {
                        charSequence8 = null;
                    }
                    tuxButton2.setText(charSequence8);
                }
                com.ss.android.ugc.aweme.mix.a.a.a(v().f109870k);
            } else if (num.intValue() == 2) {
                h.f.b.l.b(textView, "");
                Context ar_5 = ar_();
                if (ar_5 != null) {
                    charSequence3 = ar_5.getText(R.string.abb);
                } else {
                    charSequence3 = null;
                }
                textView.setText(charSequence3);
                TuxButton tuxButton3 = this.o;
                if (tuxButton3 == null) {
                    h.f.b.l.a("button");
                }
                Context ar_6 = ar_();
                if (ar_6 != null) {
                    charSequence4 = ar_6.getText(R.string.ffx);
                } else {
                    charSequence4 = null;
                }
                tuxButton3.setText(charSequence4);
            } else if (num.intValue() == 3) {
                h.f.b.l.b(textView, "");
                Context ar_7 = ar_();
                if (ar_7 != null) {
                    charSequence = ar_7.getText(R.string.dds);
                } else {
                    charSequence = null;
                }
                textView.setText(charSequence);
                TuxButton tuxButton4 = this.o;
                if (tuxButton4 == null) {
                    h.f.b.l.a("button");
                }
                Context ar_8 = ar_();
                if (ar_8 != null) {
                    charSequence2 = ar_8.getText(R.string.dgt);
                } else {
                    charSequence2 = null;
                }
                tuxButton4.setText(charSequence2);
                this.q = true;
                com.ss.android.ugc.aweme.mix.a.a.a(v().f109870k);
            }
        }
        ImageView imageView = this.p;
        if (imageView == null) {
            h.f.b.l.a("delete");
        }
        imageView.setOnClickListener(new p(this));
        View findViewById9 = view.findViewById(R.id.em8);
        h.f.b.l.b(findViewById9, "");
        ((TextTitleBar) findViewById9).getBackBtn().setOnClickListener(new q(this, inputMethodManager));
        TuxButton tuxButton5 = this.o;
        if (tuxButton5 == null) {
            h.f.b.l.a("button");
        }
        com.ss.android.ugc.aweme.l.a.a.a(tuxButton5, 300);
        View findViewById10 = view.findViewById(R.id.em8);
        h.f.b.l.b(findViewById10, "");
        ((TextTitleBar) findViewById10).getBackBtn().setImageResource(2131233214);
        TuxButton tuxButton6 = this.o;
        if (tuxButton6 == null) {
            h.f.b.l.a("button");
        }
        tuxButton6.setOnClickListener(new r(this, inputMethodManager));
        w();
        x();
        AssemViewModel.a(u(), e.f109952a, null, new i(this), j.f109941a, new h(this), 2);
        AssemViewModel.a(u(), f.f109953a, null, new l(this), m.f109942a, new k(this), 2);
        AssemViewModel.a(v(), g.f109954a, null, new f(this), g.f109940a, new e(this), 2);
        ImageView imageView2 = this.p;
        if (imageView2 == null) {
            h.f.b.l.a("delete");
        }
        imageView2.setVisibility(0);
        if (!TextUtils.isEmpty(v().g())) {
            EditText editText5 = this.f109937k;
            if (editText5 == null) {
                h.f.b.l.a("editText");
            }
            editText5.setText(v().g());
        }
    }

    private static Object a(androidx.fragment.app.e eVar, String str) {
        Object obj;
        MethodCollector.i(2190);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = eVar.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = eVar.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = eVar.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(2190);
                }
            }
        } else {
            obj = eVar.getSystemService(str);
        }
        return obj;
    }
}
