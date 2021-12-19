package com.ss.android.ugc.aweme.account.login.v2.ui.a;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.e.f;
import com.ss.android.ugc.aweme.account.login.ui.a;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder;
import com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.j;
import com.ss.android.ugc.aweme.account.ui.CodeInputView;
import com.ss.android.ugc.aweme.account.ui.LoadingCircleView;
import com.ss.android.ugc.aweme.account.ui.TimerTextView;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public abstract class m extends a implements View.OnClickListener, CodeInputView.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f64888e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private TimerHolder.b f64889a;

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.account.login.ui.a f64890b;

    /* renamed from: c  reason: collision with root package name */
    public l f64891c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f64892d;

    /* renamed from: j  reason: collision with root package name */
    private f f64893j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f64894k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f64895l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f64896m = true;
    private final e n = new e(this);
    private HashMap o;

    static {
        Covode.recordClassIndex(39886);
    }

    public abstract void a(String str);

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public View c(int i2) {
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
    public int d() {
        return R.layout.g6;
    }

    public abstract l e();

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public void h() {
        HashMap hashMap = this.o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public abstract void i();

    public static final class a {
        static {
            Covode.recordClassIndex(39887);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void s() {
        l();
    }

    public static final class e extends a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f64900a;

        static {
            Covode.recordClassIndex(39891);
        }

        @Override // com.ss.android.ugc.aweme.account.login.ui.a.b, com.ss.android.ugc.aweme.account.login.ui.a.AbstractC1435a
        public final void a() {
            this.f64900a.n();
        }

        @Override // com.ss.android.ugc.aweme.account.login.ui.a.b, com.ss.android.ugc.aweme.account.login.ui.a.AbstractC1435a
        public final void b() {
            if (this.f64900a.ab_()) {
                this.f64900a.o();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(m mVar) {
            this.f64900a = mVar;
        }

        @Override // com.ss.android.ugc.aweme.account.login.ui.a.b, com.ss.android.ugc.aweme.account.login.ui.a.AbstractC1435a
        public final void a(long j2) {
            if (this.f64900a.ab_()) {
                this.f64900a.a(j2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        f fVar = this.f64893j;
        if (fVar != null) {
            fVar.c();
        }
        super.onDestroyView();
        h();
    }

    public final void t() {
        if (ab_()) {
            g();
        } else {
            this.f64896m = true;
        }
    }

    private void l() {
        LoadingCircleView loadingCircleView = (LoadingCircleView) c(R.id.bp9);
        l.b(loadingCircleView, "");
        loadingCircleView.setVisibility(0);
        ((LoadingCircleView) c(R.id.bp9)).a();
    }

    public final void E() {
        r.a("auto_fill_sms_verification", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", x()).f62575a);
    }

    public final void n() {
        TimerTextView timerTextView = (TimerTextView) c(R.id.bpc);
        l.b(timerTextView, "");
        if (timerTextView.getVisibility() != 0) {
            TimerTextView timerTextView2 = (TimerTextView) c(R.id.bpc);
            l.b(timerTextView2, "");
            timerTextView2.setVisibility(0);
        }
        TuxTextView tuxTextView = (TuxTextView) c(R.id.bp_);
        l.b(tuxTextView, "");
        tuxTextView.setEnabled(false);
    }

    public final void o() {
        TimerTextView timerTextView = (TimerTextView) c(R.id.bpc);
        l.b(timerTextView, "");
        if (timerTextView.getVisibility() != 8) {
            TimerTextView timerTextView2 = (TimerTextView) c(R.id.bpc);
            l.b(timerTextView2, "");
            timerTextView2.setVisibility(8);
        }
        TuxTextView tuxTextView = (TuxTextView) c(R.id.bp_);
        l.b(tuxTextView, "");
        tuxTextView.setEnabled(true);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        l lVar = this.f64891c;
        if (lVar == null) {
            l.a("config");
        }
        if (lVar.f64887f) {
            CodeInputView codeInputView = (CodeInputView) c(R.id.bpd);
            l.b(codeInputView, "");
            com.ss.android.ugc.aweme.account.login.v2.ui.c.a(codeInputView);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void r() {
        CodeInputView codeInputView = (CodeInputView) c(R.id.bpd);
        l.b(codeInputView, "");
        codeInputView.setEnabled(true);
        LoadingCircleView loadingCircleView = (LoadingCircleView) c(R.id.bp9);
        l.b(loadingCircleView, "");
        loadingCircleView.setVisibility(8);
        ((LoadingCircleView) c(R.id.bp9)).b();
    }

    private final void g() {
        TuxTextView tuxTextView = (TuxTextView) c(R.id.bp_);
        l.b(tuxTextView, "");
        tuxTextView.setEnabled(false);
        ((TimerTextView) c(R.id.bpc)).setCallback(this.n);
        com.ss.android.ugc.aweme.account.login.ui.a c2 = ((TimerTextView) c(R.id.bpc)).c();
        androidx.fragment.app.e activity = getActivity();
        l lVar = this.f64891c;
        if (lVar == null) {
            l.a("config");
        }
        TimerHolder.a.a(activity, lVar.a(), new TimerHolder.b(c2), A());
        l lVar2 = this.f64891c;
        if (lVar2 == null) {
            l.a("config");
        }
        if (lVar2.f64883b) {
            l lVar3 = this.f64891c;
            if (lVar3 == null) {
                l.a("config");
            }
            if (l.a((Object) lVar3.f64884c, (Object) true)) {
                k();
            }
        }
    }

    private final void k() {
        HashMap<String, Boolean> a2 = j.a.a();
        l lVar = this.f64891c;
        if (lVar == null) {
            l.a("config");
        }
        if (a2.containsKey(lVar.a())) {
            HashMap<String, Boolean> a3 = j.a.a();
            l lVar2 = this.f64891c;
            if (lVar2 == null) {
                l.a("config");
            }
            if (a3.get(lVar2.a()) != null) {
                HashMap<String, Boolean> a4 = j.a.a();
                l lVar3 = this.f64891c;
                if (lVar3 == null) {
                    l.a("config");
                }
                Boolean bool = a4.get(lVar3.a());
                if (bool == null) {
                    l.b();
                }
                this.f64892d = bool.booleanValue();
                return;
            }
        }
        l lVar4 = this.f64891c;
        if (lVar4 == null) {
            l.a("config");
        }
        com.ss.android.ugc.aweme.account.loginsetting.d.a(lVar4.a(), new b(this));
    }

    public static final class b implements com.ss.android.ugc.aweme.account.loginsetting.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f64897a;

        static {
            Covode.recordClassIndex(39888);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(m mVar) {
            this.f64897a = mVar;
        }

        @Override // com.ss.android.ugc.aweme.account.loginsetting.a
        public final void a(boolean z) {
            HashMap<String, Boolean> a2 = j.a.a();
            l lVar = this.f64897a.f64891c;
            if (lVar == null) {
                l.a("config");
            }
            a2.put(lVar.a(), Boolean.valueOf(z));
            this.f64897a.f64892d = z;
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f64898a;

        static {
            Covode.recordClassIndex(39889);
        }

        c(m mVar) {
            this.f64898a = mVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            ((CodeInputView) this.f64898a.c(R.id.bpd)).setTextAndAutoCheck((String) obj);
            this.f64898a.E();
        }
    }

    public static final class d extends com.ss.android.ugc.aweme.account.views.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f64899a;

        static {
            Covode.recordClassIndex(39890);
        }

        public final void onClick(View view) {
            l.d(view, "");
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && this.f64899a.C()) {
                this.f64899a.onClick(view);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(m mVar, int i2, int i3) {
            super(i2, i3);
            this.f64899a = mVar;
        }
    }

    public final void a(long j2) {
        if (this.f64892d && j2 <= 50000) {
            TuxTextView tuxTextView = (TuxTextView) c(R.id.bpe);
            l.b(tuxTextView, "");
            if (tuxTextView.getVisibility() != 0) {
                TuxTextView tuxTextView2 = (TuxTextView) c(R.id.bpe);
                l.b(tuxTextView2, "");
                tuxTextView2.setVisibility(0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.ui.CodeInputView.a
    public final void a_(String str) {
        l.d(str, "");
        CodeInputView codeInputView = (CodeInputView) c(R.id.bpd);
        l.b(codeInputView, "");
        l lVar = this.f64891c;
        if (lVar == null) {
            l.a("config");
        }
        codeInputView.setEnabled(!lVar.f64886e);
        this.f64895l = false;
        a(str);
    }

    @Override // com.ss.android.ugc.aweme.account.ui.CodeInputView.a
    public final void b(String str) {
        l.d(str, "");
        if (ab_()) {
            if (this.f64895l) {
                ((CodeInputView) c(R.id.bpd)).setText("");
                this.f64895l = false;
            }
            ((InputResultIndicator) c(R.id.bp7)).a();
            ((CodeInputView) c(R.id.bpd)).d();
        }
    }

    public void onClick(View view) {
        Integer valueOf;
        ClickAgent.onClick(view);
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.bp_) {
                i();
            } else if (valueOf.intValue() == R.id.bpe && this.f64892d) {
                this.f64894k = true;
                l lVar = this.f64891c;
                if (lVar == null) {
                    l.a("config");
                }
                x.b(this, lVar.a(), A(), V_(), "user_click").c();
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l e2 = e();
        this.f64891c = e2;
        if (e2 == null) {
            l.a("config");
        }
        this.f64896m = e2.f64885d;
        l lVar = this.f64891c;
        if (lVar == null) {
            l.a("config");
        }
        if (lVar.f64883b) {
            if (this.f64893j == null) {
                Context context = getContext();
                if (context == null) {
                    l.b();
                }
                this.f64893j = new f(context);
            }
            f fVar = this.f64893j;
            if (fVar == null) {
                l.b();
            }
            fVar.b();
            f fVar2 = this.f64893j;
            if (fVar2 == null) {
                l.b();
            }
            fVar2.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        String str2;
        l.d(str, "");
        if (!this.f64894k || i2 != 1206) {
            this.f64895l = true;
            CodeInputView codeInputView = (CodeInputView) c(R.id.bpd);
            l.b(codeInputView, "");
            codeInputView.setEnabled(true);
            ((CodeInputView) c(R.id.bpd)).c();
            ((InputResultIndicator) c(R.id.bp7)).a(str);
            return;
        }
        this.f64894k = false;
        a.C0731a aVar = new a.C0731a(getContext());
        Context context = getContext();
        if (context != null) {
            str2 = context.getString(R.string.ar2);
        } else {
            str2 = null;
        }
        aVar.f33401a = str2;
        aVar.a(R.string.asq, (DialogInterface.OnClickListener) null, false).a().c().setCancelable(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
        // Method dump skipped, instructions count: 517
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.a.m.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
