package com.ss.android.ugc.aweme.account.unbind;

import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.d.o;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.l;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.m;
import com.ss.android.ugc.aweme.account.unbind.IUnbindApi;
import com.ss.android.ugc.aweme.account.unbind.d;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ai;
import com.zhiliaoapp.musically.R;
import h.i;
import h.m.p;
import h.z;
import java.util.HashMap;
import java.util.Map;

public final class c extends m {

    /* renamed from: a  reason: collision with root package name */
    private final h.h f65456a = i.a((h.f.a.a) new d(this));

    /* renamed from: b  reason: collision with root package name */
    private HashMap f65457b;

    static {
        Covode.recordClassIndex(40244);
    }

    private String g() {
        return (String) this.f65456a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final String Z_() {
        return "UnbindInputCodeFragment";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f65457b == null) {
            this.f65457b = new HashMap();
        }
        View view = (View) this.f65457b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f65457b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f65457b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    static final class e extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(40250);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.t();
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(40251);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.t();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final l e() {
        l lVar = new l();
        lVar.a(g());
        lVar.f64883b = e.b(this);
        lVar.f64885d = com.ss.android.ugc.aweme.account.login.v2.base.e.d(this);
        return lVar;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void i() {
        if (e.b(this)) {
            e.a(this, "resend", new e(this));
        } else {
            e.b(this, "resend", new f(this));
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(40249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            if (e.b(this.this$0)) {
                User f2 = cj.f();
                h.f.b.l.b(f2, "");
                return f2.getBindPhone();
            }
            User f3 = cj.f();
            h.f.b.l.b(f3, "");
            return f3.getEmail();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        int i2;
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f65051e = getString(R.string.h5s);
        if (e.a(this)) {
            i2 = R.string.h5r;
        } else {
            i2 = R.string.h58;
        }
        bVar.f65052f = getString(i2, g());
        bVar.f65047a = " ";
        bVar.f65056j = false;
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public static final class a<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f65458a;

        static {
            Covode.recordClassIndex(40245);
        }

        a(c cVar) {
            this.f65458a = cVar;
        }

        @Override // b.g
        public final Object then(b.i<d> iVar) {
            c cVar = this.f65458a;
            h.f.b.l.b(iVar, "");
            cVar.a(iVar);
            return null;
        }
    }

    static final class b<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f65459a;

        static {
            Covode.recordClassIndex(40246);
        }

        b(c cVar) {
            this.f65459a = cVar;
        }

        @Override // b.g
        public final Object then(b.i<d> iVar) {
            c cVar = this.f65459a;
            h.f.b.l.b(iVar, "");
            cVar.a(iVar);
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.c$c  reason: collision with other inner class name */
    static final class View$OnClickListenerC1462c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f65460a;

        static {
            Covode.recordClassIndex(40247);
        }

        View$OnClickListenerC1462c(c cVar) {
            this.f65460a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            e.a(this.f65460a, "auto_system", new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.account.unbind.c.View$OnClickListenerC1462c.AnonymousClass1 */
                final /* synthetic */ View$OnClickListenerC1462c this$0;

                static {
                    Covode.recordClassIndex(40248);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    com.ss.android.ugc.aweme.account.login.v2.base.e.a((Fragment) this.this$0.f65460a, true);
                    c cVar = this.this$0.f65460a;
                    Bundle arguments = this.this$0.f65460a.getArguments();
                    if (arguments == null) {
                        h.f.b.l.b();
                    }
                    arguments.putInt("next_page", k.UNBIND_EMAIL_VERIFY_USING_PHONE.getValue());
                    h.f.b.l.b(arguments, "");
                    cVar.a(arguments);
                    return z.f158842a;
                }
            });
        }
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f65461a;

        static {
            Covode.recordClassIndex(40252);
        }

        g(c cVar) {
            this.f65461a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            c cVar = this.f65461a;
            String str = ((o) obj).f43104j;
            h.f.b.l.b(str, "");
            cVar.c(str);
        }
    }

    private Bundle a(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("unbind_success", z);
        bundle.putInt("unbind_type", A().getValue());
        return bundle;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void a(String str) {
        h.f.b.l.d(str, "");
        if (e.b(this)) {
            h.f.b.l.d(str, "");
            x.a(this, str, 22, (Map<String, String>) null).d(new h(this)).c();
            return;
        }
        h.f.b.l.d(str, "");
        x.b(this, str, 6, null).d(new g(this)).c();
    }

    static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f65462a;

        static {
            Covode.recordClassIndex(40253);
        }

        h(c cVar) {
            this.f65462a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.sdk.a.a.a.f fVar = (com.bytedance.sdk.a.a.a.f) obj;
            if (e.b(this.f65462a)) {
                c cVar = this.f65462a;
                h.f.b.l.b(fVar, "");
                String str = fVar.f43086j;
                h.f.b.l.b(str, "");
                h.f.b.l.d(str, "");
                IUnbindApi iUnbindApi = IUnbindApi.a.f65438a;
                String a2 = com.bytedance.sdk.a.f.h.a(com.ss.android.c.b.f59141e + "/passport/mobile/unbind/");
                h.f.b.l.b(a2, "");
                iUnbindApi.unbindMobile(str, a2).a(new b(cVar), b.i.f4826c, null);
                return;
            }
            c cVar2 = this.f65462a;
            h.f.b.l.b(fVar, "");
            String str2 = fVar.f43086j;
            h.f.b.l.b(str2, "");
            cVar2.c(str2);
        }
    }

    public final void a(b.i<d> iVar) {
        if (!ai.a(iVar) || iVar.d().f65464b == null) {
            new com.bytedance.tux.g.b(this).e(R.string.c4f);
            return;
        }
        d.a aVar = iVar.d().f65464b;
        if (aVar == null) {
            h.f.b.l.b();
        }
        if (aVar.f65465a == 0) {
            User f2 = cj.f();
            if (e.a(this)) {
                h.f.b.l.b(f2, "");
                f2.setPhoneBinded(false);
                f2.setBindPhone("");
            } else {
                h.f.b.l.b(f2, "");
                f2.setEmail("");
            }
            b(a(true));
            return;
        }
        b(a(false));
    }

    public final void c(String str) {
        h.f.b.l.d(str, "");
        IUnbindApi iUnbindApi = IUnbindApi.a.f65438a;
        String a2 = com.bytedance.sdk.a.f.h.a(com.ss.android.c.b.f59141e + "/passport/email/unbind/");
        h.f.b.l.b(a2, "");
        iUnbindApi.unbindEmail(str, a2).a(new a(this), b.i.f4826c, null);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        if (!e.b(this) && !e.c(this)) {
            TuxTextView tuxTextView = (TuxTextView) c(R.id.a4j);
            tuxTextView.setVisibility(0);
            tuxTextView.setTuxFont(41);
            tuxTextView.setOnClickListener(new View$OnClickListenerC1462c(this));
            String string = getString(R.string.h7t);
            h.f.b.l.b(string, "");
            String string2 = getString(R.string.a9w, string);
            h.f.b.l.b(string2, "");
            SpannableString spannableString = new SpannableString(string2);
            int a2 = p.a((CharSequence) string2, string, 0, false, 6);
            spannableString.setSpan(new com.bytedance.tux.f.a.b(43, true), a2, string.length() + a2, 33);
            tuxTextView.setText(spannableString);
        }
    }
}
