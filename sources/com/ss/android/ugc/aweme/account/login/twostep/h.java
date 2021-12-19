package com.ss.android.ugc.aweme.account.login.twostep;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import b.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.account.login.twostep.n;
import com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator;
import com.ss.android.ugc.aweme.account.ui.InputWithIndicator;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.ss.android.ugc.aweme.account.util.f;
import com.ss.android.ugc.aweme.utils.ai;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import h.z;
import org.json.JSONObject;

public final class h extends n {

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f63928b = false;

    /* renamed from: c  reason: collision with root package name */
    public static final a f63929c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public LoadingButton f63930a;

    /* renamed from: d  reason: collision with root package name */
    private InputWithIndicator f63931d;

    /* renamed from: e  reason: collision with root package name */
    private InputResultIndicator f63932e;

    public static final class a {
        static {
            Covode.recordClassIndex(39394);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(39393);
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f63933a;

        static {
            Covode.recordClassIndex(39395);
        }

        b(h hVar) {
            this.f63933a = hVar;
        }

        public final void run() {
            JSONObject jSONObject;
            JSONObject jSONObject2 = this.f63933a.f63981h;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.getJSONObject("data");
            } else {
                jSONObject = null;
            }
            h hVar = this.f63933a;
            String a2 = g.a(jSONObject, "verify_ticket", "");
            l.b(a2, "");
            hVar.d(a2);
            if (TextUtils.isEmpty(this.f63933a.f63983j)) {
                this.f63933a.a(null, "Cannot find verify ticket from JSON data");
            }
        }
    }

    public final void b() {
        boolean z;
        InputWithIndicator inputWithIndicator = this.f63931d;
        if (inputWithIndicator == null) {
            l.a("passwordInput");
        }
        String text = inputWithIndicator.getText();
        if (text.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            androidx.appcompat.app.d d2 = d();
            if (d2 == null) {
                l.b();
            }
            String string = d2.getString(R.string.bpb);
            l.b(string, "");
            b(string);
            return;
        }
        LoadingButton loadingButton = this.f63930a;
        if (loadingButton == null) {
            l.a("loadingButton");
        }
        loadingButton.a(true);
        String str = this.f63983j;
        l.d(text, "");
        l.d(str, "");
        TwoStepAuthApi.Api a2 = TwoStepAuthApi.a();
        String a3 = f.a(text);
        l.b(a3, "");
        a2.verifyPassword(null, null, null, a3, 1, str).a(new e(this), i.f4826c, null);
    }

    @Override // com.ss.android.ugc.aweme.account.login.twostep.n
    public final View a() {
        MethodCollector.i(8998);
        if (this.f63984k.getLayoutResource() <= 0) {
            this.f63984k.setLayoutResource(R.layout.gz);
        }
        View inflate = this.f63984k.inflate();
        l.b(inflate, "");
        View findViewById = inflate.findViewById(R.id.d20);
        l.b(findViewById, "");
        this.f63930a = (LoadingButton) findViewById;
        View findViewById2 = inflate.findViewById(R.id.d22);
        l.b(findViewById2, "");
        this.f63931d = (InputWithIndicator) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.d23);
        l.b(findViewById3, "");
        this.f63932e = (InputResultIndicator) findViewById3;
        InputWithIndicator inputWithIndicator = this.f63931d;
        if (inputWithIndicator == null) {
            l.a("passwordInput");
        }
        inputWithIndicator.setTextWatcher(new c(this));
        LoadingButton loadingButton = this.f63930a;
        if (loadingButton == null) {
            l.a("loadingButton");
        }
        loadingButton.setEnabled(false);
        LoadingButton loadingButton2 = this.f63930a;
        if (loadingButton2 == null) {
            l.a("loadingButton");
        }
        loadingButton2.setOnClickListener(new d(this));
        if (this.f63981h == null) {
            a(null, "JSON is empty");
        } else {
            ai.a(new b(this), "BoltsUtils");
        }
        MethodCollector.o(8998);
        return inflate;
    }

    public static final class c extends com.ss.android.ugc.aweme.account.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f63934a;

        static {
            Covode.recordClassIndex(39396);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(h hVar) {
            this.f63934a = hVar;
        }

        @Override // com.ss.android.ugc.aweme.account.i
        public final void afterTextChanged(Editable editable) {
            String str;
            boolean z;
            LoadingButton loadingButton = this.f63934a.f63930a;
            if (loadingButton == null) {
                l.a("loadingButton");
            }
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            loadingButton.setEnabled(!z);
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f63935a;

        static {
            Covode.recordClassIndex(39397);
        }

        d(h hVar) {
            this.f63935a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f63935a.b();
        }
    }

    private final void b(String str) {
        InputResultIndicator inputResultIndicator = this.f63932e;
        if (inputResultIndicator == null) {
            l.a("passwordInputResult");
        }
        inputResultIndicator.a(str);
        LoadingButton loadingButton = this.f63930a;
        if (loadingButton == null) {
            l.a("loadingButton");
        }
        loadingButton.b(true);
    }

    public final void a(String str) {
        InputResultIndicator inputResultIndicator = this.f63932e;
        if (inputResultIndicator == null) {
            l.a("passwordInputResult");
        }
        inputResultIndicator.a();
        LoadingButton loadingButton = this.f63930a;
        if (loadingButton == null) {
            l.a("loadingButton");
        }
        loadingButton.b(true);
        e(str);
    }

    /* access modifiers changed from: package-private */
    public static final class e<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f63936a;

        static {
            Covode.recordClassIndex(39398);
        }

        e(h hVar) {
            this.f63936a = hVar;
        }

        @Override // b.g
        public final Object then(i<TwoStepAuthApi.c> iVar) {
            Integer num;
            String str;
            String str2;
            if (!ai.a(iVar)) {
                h hVar = this.f63936a;
                l.b(iVar, "");
                Exception e2 = iVar.e();
                if (e2 != null) {
                    str2 = e2.toString();
                } else {
                    str2 = null;
                }
                hVar.a(null, str2);
                return null;
            }
            l.b(iVar, "");
            TwoStepAuthApi.c d2 = iVar.d();
            if (!p.a("success", d2.f63762a, true) || d2.f63763b == null || TextUtils.isEmpty(d2.f63763b.f63764a)) {
                TwoStepAuthApi.c.a aVar = d2.f63763b;
                if (aVar != null) {
                    num = aVar.f63766c;
                } else {
                    num = null;
                }
                TwoStepAuthApi.c.a aVar2 = d2.f63763b;
                if (aVar2 != null) {
                    str = aVar2.f63767d;
                } else {
                    str = null;
                }
                this.f63936a.a(num, str);
                return null;
            }
            this.f63936a.a(d2.f63763b.f63764a);
            return z.f158842a;
        }
    }

    public final void a(Integer num, String str) {
        b(b(num, str));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(androidx.appcompat.app.d dVar, ViewStub viewStub, n.a aVar) {
        super(dVar, viewStub, aVar);
        l.d(dVar, "");
        l.d(viewStub, "");
        l.d(aVar, "");
    }
}
