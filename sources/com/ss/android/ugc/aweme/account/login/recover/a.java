package com.ss.android.ugc.aweme.account.login.recover;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.recover.a.b;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper;
import com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator;
import com.ss.android.ugc.aweme.account.login.x;
import com.ss.android.ugc.aweme.account.ui.InputWithIndicator;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.ss.android.ugc.aweme.account.util.h;
import com.ss.android.ugc.aweme.base.ui.o;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import java.util.HashMap;

public final class a extends com.ss.android.ugc.aweme.account.login.v2.ui.a.a implements View.OnClickListener, com.ss.android.ugc.aweme.account.login.v2.ui.d, x {

    /* renamed from: j  reason: collision with root package name */
    public static final C1415a f63544j = new C1415a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public EditText f63545a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f63546b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f63547c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.account.login.recover.a.b.a f63548d;

    /* renamed from: e  reason: collision with root package name */
    public String f63549e;

    /* renamed from: k  reason: collision with root package name */
    private String f63550k = "";

    /* renamed from: l  reason: collision with root package name */
    private boolean f63551l = true;

    /* renamed from: m  reason: collision with root package name */
    private boolean f63552m;
    private boolean n;
    private HashMap o;

    static {
        Covode.recordClassIndex(39173);
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
        return R.layout.g7;
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

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a$a  reason: collision with other inner class name */
    public static final class C1415a {
        static {
            Covode.recordClassIndex(39174);
        }

        private C1415a() {
        }

        public /* synthetic */ C1415a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.x
    public final boolean a() {
        return this.f63551l;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void r() {
        LoadingButton loadingButton = (LoadingButton) c(R.id.auf);
        if (loadingButton != null) {
            loadingButton.b(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void s() {
        LoadingButton loadingButton = (LoadingButton) c(R.id.auf);
        if (loadingButton != null) {
            loadingButton.a(true);
        }
    }

    private final void g() {
        if (AccountKeyBoardHelper.a.a()) {
            EditText editText = this.f63545a;
            if (editText == null) {
                l.a("emailInput");
            }
            com.ss.android.ugc.aweme.account.login.v2.ui.c.a(editText);
            return;
        }
        EditText editText2 = this.f63545a;
        if (editText2 == null) {
            l.a("emailInput");
        }
        editText2.requestFocus();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.d
    public final String e() {
        EditText editText = this.f63545a;
        if (editText == null) {
            l.a("emailInput");
        }
        return editText.getText().toString();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        return new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, false, null, false, true, 462);
    }

    public static final class d extends o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f63566a;

        static {
            Covode.recordClassIndex(39177);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(a aVar) {
            this.f63566a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.base.ui.o
        public final void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            if (this.f63566a.ab_()) {
                LoadingButton loadingButton = (LoadingButton) this.f63566a.c(R.id.auf);
                l.b(loadingButton, "");
                loadingButton.setEnabled(!com.ss.android.ugc.aweme.account.login.v2.ui.c.b(a.a(this.f63566a)));
                View c2 = this.f63566a.c(R.id.aue);
                l.b(c2, "");
                ((InputResultIndicator) c2.findViewById(R.id.bpx)).a();
            }
        }
    }

    public static final /* synthetic */ EditText a(a aVar) {
        EditText editText = aVar.f63545a;
        if (editText == null) {
            l.a("emailInput");
        }
        return editText;
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
            this.f63546b = true;
        }
    }

    static final class e<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f63569a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f63570b;

        static {
            Covode.recordClassIndex(39178);
        }

        e(a aVar, boolean z) {
            this.f63569a = aVar;
            this.f63570b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.account.login.recover.a.b.c cVar = (com.ss.android.ugc.aweme.account.login.recover.a.b.c) obj;
            if (cVar != null) {
                this.f63569a.f63547c = cVar.f63560j;
                String str = cVar.f63561k;
                if (this.f63569a.f63549e != null) {
                    a aVar = this.f63569a;
                    String str2 = aVar.f63549e;
                    if (str2 == null) {
                        l.b();
                    }
                    com.ss.android.ugc.aweme.account.login.v2.a.x.b(aVar, str2, str, j.RECOVER_ACCOUNT, k.PHONE_EMAIL_USERNAME_RECOVER).d(new c(aVar, this.f63570b)).c();
                }
                if (this.f63569a.f63549e != null) {
                    return;
                }
                if (this.f63570b) {
                    a aVar2 = this.f63569a;
                    String string = aVar2.getString(R.string.fa6);
                    l.b(string, "");
                    aVar2.a(0, string);
                    return;
                }
                a aVar3 = this.f63569a;
                String string2 = aVar3.getString(R.string.fa8);
                l.b(string2, "");
                aVar3.a(0, string2);
            } else if (this.f63570b) {
                a aVar4 = this.f63569a;
                String string3 = aVar4.getString(R.string.fa6);
                l.b(string3, "");
                aVar4.a(0, string3);
            } else {
                a aVar5 = this.f63569a;
                String string4 = aVar5.getString(R.string.fa8);
                l.b(string4, "");
                aVar5.a(0, string4);
            }
        }
    }

    public final void onClick(View view) {
        int i2;
        String str;
        ClickAgent.onClick(view);
        this.f63552m = false;
        this.n = false;
        String str2 = null;
        this.f63548d = null;
        this.f63547c = false;
        this.f63551l = false;
        com.ss.android.ugc.aweme.account.n.a.a(getContext());
        EditText editText = this.f63545a;
        if (editText == null) {
            l.a("emailInput");
        }
        String obj = editText.getText().toString();
        boolean a2 = h.a(obj);
        if (a2) {
            i2 = 4;
        } else {
            i2 = 1;
            str2 = obj;
            obj = null;
        }
        b.C1417b bVar = new b.C1417b(i2, null, null, m.c(str2), m.c(obj));
        j jVar = j.RECOVER_ACCOUNT;
        k kVar = k.PHONE_EMAIL_USERNAME_RECOVER;
        if (a2) {
            str = "email";
        } else {
            str = "username";
        }
        com.ss.android.ugc.aweme.account.login.v2.a.x.a(this, bVar, jVar, kVar, str).d(new b(this, a2)).c();
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f63555a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f63556b;

        static {
            Covode.recordClassIndex(39175);
        }

        b(a aVar, boolean z) {
            this.f63555a = aVar;
            this.f63556b = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r8) {
            /*
            // Method dump skipped, instructions count: 165
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.recover.a.b.accept(java.lang.Object):void");
        }
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f63562a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f63563b;

        static {
            Covode.recordClassIndex(39176);
        }

        c(a aVar, boolean z) {
            this.f63562a = aVar;
            this.f63563b = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
            if (r0.f43095m != false) goto L_0x0039;
         */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r15) {
            /*
            // Method dump skipped, instructions count: 306
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.recover.a.c.accept(java.lang.Object):void");
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        l.d(str, "");
        View c2 = c(R.id.aue);
        l.b(c2, "");
        ((InputResultIndicator) c2.findViewById(R.id.bpx)).a(str);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        View c2 = c(R.id.aue);
        l.b(c2, "");
        this.f63545a = ((InputWithIndicator) c2.findViewById(R.id.bpw)).getEditText();
        d dVar = new d(this);
        EditText editText = this.f63545a;
        if (editText == null) {
            l.a("emailInput");
        }
        editText.setInputType(32);
        editText.setHint(getString(R.string.aoe));
        editText.addTextChangedListener(dVar);
        if (!TextUtils.isEmpty(this.f63550k)) {
            editText.setText(this.f63550k);
            editText.setSelection(this.f63550k.length());
        }
        a(c(R.id.auf), this);
        if (this.f63546b) {
            g();
        }
    }
}
