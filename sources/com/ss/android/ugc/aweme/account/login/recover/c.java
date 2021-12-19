package com.ss.android.ugc.aweme.account.login.recover;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.recover.a.b;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator;
import com.ss.android.ugc.aweme.account.login.x;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.ss.android.ugc.aweme.account.ui.PhoneInputView;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;

public final class c extends com.ss.android.ugc.aweme.account.login.v2.ui.a.a implements x {

    /* renamed from: j  reason: collision with root package name */
    public static final a f63584j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f63585a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.account.login.recover.a.b.a f63586b;

    /* renamed from: c  reason: collision with root package name */
    boolean f63587c;

    /* renamed from: d  reason: collision with root package name */
    boolean f63588d;

    /* renamed from: e  reason: collision with root package name */
    public String f63589e;

    /* renamed from: k  reason: collision with root package name */
    private boolean f63590k = true;

    /* renamed from: l  reason: collision with root package name */
    private boolean f63591l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f63592m;
    private final h n = i.a((h.f.a.a) new e(this));
    private HashMap o;

    static {
        Covode.recordClassIndex(39204);
    }

    private final com.ss.android.ugc.aweme.account.login.e.a e() {
        return (com.ss.android.ugc.aweme.account.login.e.a) this.n.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.o == null) {
            this.o = new HashMap();
        }
        View view = (View) this.o.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.o.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.gd;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.o;
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
            Covode.recordClassIndex(39205);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.x
    public final boolean a() {
        return this.f63590k;
    }

    static final class e extends m implements h.f.a.a<com.ss.android.ugc.aweme.account.login.e.a> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(39210);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.account.login.e.a invoke() {
            c cVar = this.this$0;
            return new com.ss.android.ugc.aweme.account.login.e.a(cVar, cVar.x());
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        e().b();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void r() {
        ((LoadingButton) c(R.id.d4b)).b(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void s() {
        ((LoadingButton) c(R.id.d4b)).a(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        return new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, true, null, false, false, 1358);
    }

    private final void g() {
        if (((PhoneInputView) c(R.id.d4d)).getPhoneNumber() <= 0 && !this.f63592m) {
            e().a(((PhoneInputView) c(R.id.d4d)).getEditText());
        }
        this.f63592m = true;
        com.ss.android.ugc.aweme.account.login.v2.ui.c.a(((PhoneInputView) c(R.id.d4d)).getInputView().getEditText());
    }

    public static final class d extends com.ss.android.ugc.aweme.account.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f63596a;

        static {
            Covode.recordClassIndex(39209);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(c cVar) {
            this.f63596a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.account.i
        public final void afterTextChanged(Editable editable) {
            String obj;
            InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f63596a.c(R.id.d4c);
            if (inputResultIndicator != null) {
                inputResultIndicator.a();
            }
            LoadingButton loadingButton = (LoadingButton) this.f63596a.c(R.id.d4b);
            l.b(loadingButton, "");
            boolean z = false;
            if (!(editable == null || (obj = editable.toString()) == null || obj.length() <= 0)) {
                z = true;
            }
            loadingButton.setEnabled(z);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e().a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z) {
            return;
        }
        if (ab_()) {
            g();
        } else {
            this.f63591l = true;
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f63597a;

        static {
            Covode.recordClassIndex(39211);
        }

        f(c cVar) {
            this.f63597a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.account.login.recover.a.b.c cVar = (com.ss.android.ugc.aweme.account.login.recover.a.b.c) obj;
            if (cVar != null) {
                this.f63597a.f63585a = cVar.f63560j;
                String str = cVar.f63561k;
                if (this.f63597a.f63589e != null) {
                    c cVar2 = this.f63597a;
                    String str2 = cVar2.f63589e;
                    if (str2 == null) {
                        l.b();
                    }
                    com.ss.android.ugc.aweme.account.login.v2.a.x.b(cVar2, str2, str, j.RECOVER_ACCOUNT, k.PHONE_EMAIL_USERNAME_RECOVER).d(new b(cVar2)).c();
                }
                if (this.f63597a.f63589e == null) {
                    c cVar3 = this.f63597a;
                    String string = cVar3.getString(R.string.fa7);
                    l.b(string, "");
                    cVar3.a(0, string);
                    return;
                }
                return;
            }
            c cVar4 = this.f63597a;
            String string2 = cVar4.getString(R.string.fa7);
            l.b(string2, "");
            cVar4.a(0, string2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.c$c  reason: collision with other inner class name */
    static final class View$OnClickListenerC1419c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f63594a;

        static {
            Covode.recordClassIndex(39207);
        }

        View$OnClickListenerC1419c(c cVar) {
            this.f63594a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            c cVar = this.f63594a;
            cVar.f63587c = false;
            cVar.f63588d = false;
            cVar.f63586b = null;
            cVar.f63585a = false;
            if (!com.ss.android.ugc.aweme.account.login.h.a.a(((PhoneInputView) this.f63594a.c(R.id.d4d)).getCountryCodeString(), ((PhoneInputView) this.f63594a.c(R.id.d4d)).getPhoneNumberString())) {
                String x = this.f63594a.x();
                l.b(x, "");
                l.d(x, "");
                r.a("login_click_next_result", new com.ss.android.ugc.aweme.account.a.b.a().a("platform", "phone").a("enter_method", x).a("is_success", 0).a("is_register", 0).f62575a);
                c cVar2 = this.f63594a;
                String string = cVar2.getString(R.string.aqs);
                l.b(string, "");
                cVar2.a(0, string);
                return;
            }
            com.ss.android.ugc.aweme.account.login.v2.a.x.a(this.f63594a, new b.C1417b(0, com.bytedance.common.utility.m.c(((PhoneInputView) this.f63594a.c(R.id.d4d)).getCountryCodeString()), com.bytedance.common.utility.m.c(((PhoneInputView) this.f63594a.c(R.id.d4d)).getPhoneNumberString()), null, null), j.RECOVER_ACCOUNT, k.PHONE_EMAIL_USERNAME_RECOVER, "phone").d(new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.account.login.recover.c.View$OnClickListenerC1419c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ View$OnClickListenerC1419c f63595a;

                static {
                    Covode.recordClassIndex(39208);
                }

                {
                    this.f63595a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    int i2;
                    com.ss.android.ugc.aweme.account.login.recover.a.b.b bVar = (com.ss.android.ugc.aweme.account.login.recover.a.b.b) obj;
                    if (bVar != null) {
                        if (bVar.f63559j == null || com.bytedance.x.c.c.a(bVar.f63559j)) {
                            c cVar = this.f63595a.f63594a;
                            String string = this.f63595a.f63594a.getString(R.string.fa7);
                            l.b(string, "");
                            cVar.a(0, string);
                        } else {
                            this.f63595a.f63594a.f63589e = bVar.f63559j;
                            c cVar2 = this.f63595a.f63594a;
                            String str = bVar.f63559j;
                            if (str == null) {
                                l.b();
                            }
                            com.ss.android.ugc.aweme.account.login.v2.a.x.a(cVar2, str, j.RECOVER_ACCOUNT, k.PHONE_EMAIL_USERNAME_RECOVER).d(new f(cVar2)).c();
                            i2 = 1;
                            r.a("find_account_check_result", new com.ss.android.ugc.aweme.account.a.b.a().a("platform", "phone").a("status", i2).a("aid", 1233).a("error_code", 0).f62575a);
                        }
                    }
                    i2 = 0;
                    if (bVar == null) {
                        c cVar3 = this.f63595a.f63594a;
                        String string2 = this.f63595a.f63594a.getString(R.string.fa7);
                        l.b(string2, "");
                        cVar3.a(0, string2);
                    }
                    r.a("find_account_check_result", new com.ss.android.ugc.aweme.account.a.b.a().a("platform", "phone").a("status", i2).a("aid", 1233).a("error_code", 0).f62575a);
                }
            }).c();
        }
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f63593a;

        static {
            Covode.recordClassIndex(39206);
        }

        b(c cVar) {
            this.f63593a = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            if (r0.f43095m != false) goto L_0x003d;
         */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r16) {
            /*
            // Method dump skipped, instructions count: 340
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.recover.c.b.accept(java.lang.Object):void");
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        l.d(str, "");
        ((InputResultIndicator) c(R.id.d4c)).a(str);
        ((LoadingButton) c(R.id.d4b)).b(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        a(c(R.id.d4b), new View$OnClickListenerC1419c(this));
        ((PhoneInputView) c(R.id.d4d)).getInputView().setTextWatcher(new d(this));
        if (((PhoneInputView) c(R.id.d4d)).getCountryCodeString().length() == 0 && ((PhoneInputView) c(R.id.d4d)).getCountryName().length() == 0) {
            ((PhoneInputView) c(R.id.d4d)).a();
        }
        if (this.f63591l) {
            g();
            this.f63591l = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        e().a(i2, i3, intent);
    }
}
