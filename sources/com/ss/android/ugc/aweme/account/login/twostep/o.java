package com.ss.android.ugc.aweme.account.login.twostep;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity;
import com.ss.android.ugc.aweme.account.login.twostep.a;
import com.ss.android.ugc.aweme.br;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseBindService;
import com.zhiliaoapp.musically.R;
import h.z;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class o extends com.ss.android.ugc.aweme.base.f.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f63986a = ((int) com.bytedance.common.utility.n.b(com.bytedance.ies.ugc.appcontext.d.a(), 29.0f));

    /* renamed from: b  reason: collision with root package name */
    private final h.h f63987b = h.i.a((h.f.a.a) new a(this));

    /* renamed from: c  reason: collision with root package name */
    private HashMap f63988c;

    /* access modifiers changed from: package-private */
    public static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final l f64015a = new l();

        static {
            Covode.recordClassIndex(39439);
        }

        l() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final n f64018a = new n();

        static {
            Covode.recordClassIndex(39441);
        }

        n() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final p f64022a = new p();

        static {
            Covode.recordClassIndex(39443);
        }

        p() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final r f64025a = new r();

        static {
            Covode.recordClassIndex(39445);
        }

        r() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(39424);
    }

    public final View a(int i2) {
        if (this.f63988c == null) {
            this.f63988c = new HashMap();
        }
        View view = (View) this.f63988c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f63988c.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final String a() {
        return (String) this.f63987b.getValue();
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f63988c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(39425);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null || (string = arguments.getString("enter_from")) == null) {
                return "";
            }
            return string;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ boolean $fromBackUp;
        final /* synthetic */ boolean $isEmail;
        final /* synthetic */ boolean $isPhone;
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(39429);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(o oVar, boolean z, boolean z2, boolean z3) {
            super(0);
            this.this$0 = oVar;
            this.$isPhone = z;
            this.$fromBackUp = z2;
            this.$isEmail = z3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (this.$isPhone) {
                BaseBindService h2 = cj.h();
                androidx.fragment.app.e activity = this.this$0.getActivity();
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_success_toast", false);
                h2.modifyMobile(activity, "", bundle, new IAccountService.g(this) {
                    /* class com.ss.android.ugc.aweme.account.login.twostep.o.d.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ d f64000a;

                    static {
                        Covode.recordClassIndex(39430);
                    }

                    {
                        this.f64000a = r1;
                    }

                    @Override // com.ss.android.ugc.aweme.IAccountService.g
                    public final void onResult(int i2, int i3, Object obj) {
                        o oVar;
                        int i4;
                        if (i3 == 1) {
                            if (this.f64000a.$fromBackUp) {
                                oVar = this.f64000a.this$0;
                                i4 = R.id.qw;
                            } else {
                                oVar = this.f64000a.this$0;
                                i4 = R.id.clz;
                            }
                            TuxTextView tuxTextView = (TuxTextView) oVar.a(i4);
                            h.f.b.l.b(tuxTextView, "");
                            User f2 = cj.f();
                            h.f.b.l.b(f2, "");
                            tuxTextView.setText(f2.getBindPhone());
                        }
                    }
                });
            } else if (this.$isEmail) {
                BaseBindService h3 = cj.h();
                androidx.fragment.app.e activity2 = this.this$0.getActivity();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("show_success_toast", false);
                h3.changeEmail(activity2, "", bundle2, new IAccountService.g(this) {
                    /* class com.ss.android.ugc.aweme.account.login.twostep.o.d.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ d f64001a;

                    static {
                        Covode.recordClassIndex(39431);
                    }

                    {
                        this.f64001a = r1;
                    }

                    @Override // com.ss.android.ugc.aweme.IAccountService.g
                    public final void onResult(int i2, int i3, Object obj) {
                        o oVar;
                        int i4;
                        if (i3 == 1) {
                            if (this.f64001a.$fromBackUp) {
                                oVar = this.f64001a.this$0;
                                i4 = R.id.qw;
                            } else {
                                oVar = this.f64001a.this$0;
                                i4 = R.id.clz;
                            }
                            TuxTextView tuxTextView = (TuxTextView) oVar.a(i4);
                            h.f.b.l.b(tuxTextView, "");
                            User f2 = cj.f();
                            h.f.b.l.b(f2, "");
                            tuxTextView.setText(f2.getEmail());
                        }
                    }
                });
            } else {
                br i2 = cj.f71084b.i();
                androidx.fragment.app.e activity3 = this.this$0.getActivity();
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("show_success_toast", false);
                i2.changePassword(activity3, "", "", bundle3, null);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f64006a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f64007b;

        static {
            Covode.recordClassIndex(39435);
        }

        h(o oVar, a aVar) {
            this.f64006a = oVar;
            this.f64007b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f64006a.a("mobile_sms_verify", this.f64007b, false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f64008a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f64009b;

        static {
            Covode.recordClassIndex(39436);
        }

        i(o oVar, a aVar) {
            this.f64008a = oVar;
            this.f64009b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f64008a.a("email_verify", this.f64009b, false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f64010a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f64011b;

        static {
            Covode.recordClassIndex(39437);
        }

        j(o oVar, a aVar) {
            this.f64010a = oVar;
            this.f64011b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f64010a.a("pwd_verify", this.f64011b, false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f64012a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64013b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f64014c;

        static {
            Covode.recordClassIndex(39438);
        }

        k(o oVar, String str, a aVar) {
            this.f64012a = oVar;
            this.f64013b = str;
            this.f64014c = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f64012a.a(this.f64013b, this.f64014c, true);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f64016a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64017b;

        static {
            Covode.recordClassIndex(39440);
        }

        m(o oVar, String str) {
            this.f64016a = oVar;
            this.f64017b = str;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f64016a.a(this.f64017b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.o$o  reason: collision with other inner class name */
    public static final class View$OnClickListenerC1434o implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f64019a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64020b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f64021c;

        static {
            Covode.recordClassIndex(39442);
        }

        View$OnClickListenerC1434o(o oVar, String str, a aVar) {
            this.f64019a = oVar;
            this.f64020b = str;
            this.f64021c = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f64019a.a(this.f64020b, this.f64021c, true);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f64023a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64024b;

        static {
            Covode.recordClassIndex(39444);
        }

        q(o oVar, String str) {
            this.f64023a = oVar;
            this.f64024b = str;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f64023a.a(this.f64024b);
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f64002a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f64003b;

        static {
            Covode.recordClassIndex(39432);
        }

        e(o oVar, a aVar) {
            this.f64002a = oVar;
            this.f64003b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            String a2 = this.f64002a.a();
            h.f.b.l.b(a2, "");
            q.a("turn_off", a2);
            this.f64002a.b(this.f64003b);
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f64004a;

        static {
            Covode.recordClassIndex(39433);
        }

        f(o oVar) {
            this.f64004a = oVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            String a2 = this.f64004a.a();
            h.f.b.l.b(a2, "");
            q.a("authorized_logins", a2);
            Intent intent = new Intent(this.f64004a.getActivity(), AuthorizedDeviceActivity.class);
            intent.putExtra("enter_from", this.f64004a.a());
            this.f64004a.startActivity(intent);
        }
    }

    public final void a(String str) {
        String a2 = a();
        h.f.b.l.b(a2, "");
        q.a("add_back_up_method", a2);
        androidx.fragment.app.e activity = getActivity();
        if (!(activity instanceof TwoStepVerificationManageActivity)) {
            activity = null;
        }
        TwoStepVerificationManageActivity twoStepVerificationManageActivity = (TwoStepVerificationManageActivity) activity;
        if (twoStepVerificationManageActivity != null) {
            twoStepVerificationManageActivity.a(h.a.n.c(str), 0);
        }
    }

    public final void b(a aVar) {
        String a2 = a();
        h.f.b.l.b(a2, "");
        q.b("turn_off", a2);
        a.C0731a aVar2 = new a.C0731a(getContext());
        aVar2.f33401a = getString(R.string.g6s);
        aVar2.f33402b = getString(R.string.g6r);
        a.C0731a b2 = aVar2.a(R.string.g6q, (DialogInterface.OnClickListener) new s(this, aVar), false).b(R.string.g6d, (DialogInterface.OnClickListener) null, false);
        b2.E = true;
        b2.a().c();
    }

    public final void a(a aVar) {
        T t;
        T t2;
        T t3;
        String default_verify_way;
        String str;
        int i2;
        String str2;
        String str3;
        String str4;
        int i3;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        int i4;
        String str11;
        int i5;
        String str12;
        String str13;
        List<aa> two_step_verify_ways;
        T t4;
        List<aa> two_step_verify_ways2;
        T t5;
        List<aa> two_step_verify_ways3;
        T t6;
        h.f.b.l.d(aVar, "");
        User f2 = cj.f();
        a.C1430a data = aVar.getData();
        List<aa> two_step_verify_ways4 = data != null ? data.getTwo_step_verify_ways() : null;
        if (two_step_verify_ways4 != null) {
            int i6 = 0;
            for (aa aaVar : two_step_verify_ways4) {
                if (h.f.b.l.a((Object) aaVar.is_available(), (Object) true)) {
                    i6++;
                }
            }
            if (i6 == 1) {
                View a2 = a(R.id.an8);
                h.f.b.l.b(a2, "");
                a2.setVisibility(0);
                TuxTextView tuxTextView = (TuxTextView) a(R.id.h6);
                h.f.b.l.b(tuxTextView, "");
                tuxTextView.setVisibility(0);
                View a3 = a(R.id.an9);
                h.f.b.l.b(a3, "");
                a3.setVisibility(8);
                TuxTextView tuxTextView2 = (TuxTextView) a(R.id.h7);
                h.f.b.l.b(tuxTextView2, "");
                tuxTextView2.setVisibility(8);
                ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.qz);
                h.f.b.l.b(constraintLayout, "");
                ((ConstraintLayout) a(R.id.qz)).setPadding(0, 0, 0, constraintLayout.getPaddingBottom());
            } else if (i6 != 2) {
                View a4 = a(R.id.an8);
                h.f.b.l.b(a4, "");
                a4.setVisibility(8);
                TuxTextView tuxTextView3 = (TuxTextView) a(R.id.h6);
                h.f.b.l.b(tuxTextView3, "");
                tuxTextView3.setVisibility(8);
                View a5 = a(R.id.an9);
                h.f.b.l.b(a5, "");
                a5.setVisibility(8);
                TuxTextView tuxTextView4 = (TuxTextView) a(R.id.h7);
                h.f.b.l.b(tuxTextView4, "");
                tuxTextView4.setVisibility(8);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) a(R.id.qz);
                h.f.b.l.b(constraintLayout2, "");
                ((ConstraintLayout) a(R.id.qz)).setPadding(0, 0, 0, constraintLayout2.getPaddingBottom());
                ConstraintLayout constraintLayout3 = (ConstraintLayout) a(R.id.qz);
                h.f.b.l.b(constraintLayout3, "");
                ((ConstraintLayout) a(R.id.qy)).setPadding(0, 0, 0, constraintLayout3.getPaddingBottom());
            } else {
                View a6 = a(R.id.an8);
                h.f.b.l.b(a6, "");
                a6.setVisibility(8);
                TuxTextView tuxTextView5 = (TuxTextView) a(R.id.h6);
                h.f.b.l.b(tuxTextView5, "");
                tuxTextView5.setVisibility(8);
                View a7 = a(R.id.an9);
                h.f.b.l.b(a7, "");
                a7.setVisibility(0);
                TuxTextView tuxTextView6 = (TuxTextView) a(R.id.h7);
                h.f.b.l.b(tuxTextView6, "");
                tuxTextView6.setVisibility(0);
                ConstraintLayout constraintLayout4 = (ConstraintLayout) a(R.id.qz);
                h.f.b.l.b(constraintLayout4, "");
                ((ConstraintLayout) a(R.id.qy)).setPadding(0, 0, 0, constraintLayout4.getPaddingBottom());
            }
        }
        a.C1430a data2 = aVar.getData();
        if (data2 == null || (two_step_verify_ways3 = data2.getTwo_step_verify_ways()) == null) {
            t = null;
        } else {
            Iterator<T> it = two_step_verify_ways3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t6 = null;
                    break;
                }
                t6 = it.next();
                if (h.f.b.l.a((Object) t6.getVerify_way(), (Object) "mobile_sms_verify")) {
                    break;
                }
            }
            t = t6;
        }
        a.C1430a data3 = aVar.getData();
        if (data3 == null || (two_step_verify_ways2 = data3.getTwo_step_verify_ways()) == null) {
            t2 = null;
        } else {
            Iterator<T> it2 = two_step_verify_ways2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    t5 = null;
                    break;
                }
                t5 = it2.next();
                if (h.f.b.l.a((Object) t5.getVerify_way(), (Object) "email_verify")) {
                    break;
                }
            }
            t2 = t5;
        }
        a.C1430a data4 = aVar.getData();
        if (data4 == null || (two_step_verify_ways = data4.getTwo_step_verify_ways()) == null) {
            t3 = null;
        } else {
            Iterator<T> it3 = two_step_verify_ways.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    t4 = null;
                    break;
                }
                t4 = it3.next();
                if (h.f.b.l.a((Object) t4.getVerify_way(), (Object) "pwd_verify")) {
                    break;
                }
            }
            t3 = t4;
        }
        a.C1430a data5 = aVar.getData();
        if (data5 != null && (default_verify_way = data5.getDefault_verify_way()) != null) {
            int hashCode = default_verify_way.hashCode();
            if (hashCode != -797498437) {
                if (hashCode != 300626556) {
                    if (hashCode == 312290780 && default_verify_way.equals("mobile_sms_verify")) {
                        if (t2 == null || !h.f.b.l.a((Object) t2.is_available(), (Object) true)) {
                            if (t3 == null || !h.f.b.l.a((Object) t3.is_available(), (Object) true)) {
                                i4 = R.id.aj_;
                                h.f.b.l.b(f2, "");
                                String email = f2.getEmail();
                                if (email == null || h.m.p.a((CharSequence) email)) {
                                    str11 = getString(R.string.bf);
                                } else {
                                    str11 = f2.getEmail();
                                }
                                h.f.b.l.b(str11, "");
                                String string = getString(R.string.g69);
                                h.f.b.l.b(string, "");
                                a(str11, string, 2131231088, "email_verify", false, aVar);
                                String string2 = getString(R.string.h14);
                                h.f.b.l.b(string2, "");
                                String string3 = getString(R.string.h1k);
                                h.f.b.l.b(string3, "");
                                b(string2, string3, R.drawable.jf, "pwd_verify", false, aVar);
                            } else {
                                String string4 = getString(R.string.h14);
                                h.f.b.l.b(string4, "");
                                String string5 = getString(R.string.h1k);
                                h.f.b.l.b(string5, "");
                                i4 = R.id.aj_;
                                a(string4, string5, R.drawable.jf, "pwd_verify", true, aVar);
                                h.f.b.l.b(f2, "");
                                String email2 = f2.getEmail();
                                if (email2 == null || h.m.p.a((CharSequence) email2)) {
                                    str12 = getString(R.string.bf);
                                } else {
                                    str12 = f2.getEmail();
                                }
                                h.f.b.l.b(str12, "");
                                String string6 = getString(R.string.g69);
                                h.f.b.l.b(string6, "");
                                b(str12, string6, 2131231088, "email_verify", false, aVar);
                            }
                            i5 = R.id.clz;
                        } else {
                            h.f.b.l.b(f2, "");
                            String email3 = f2.getEmail();
                            if (email3 == null || h.m.p.a((CharSequence) email3)) {
                                str13 = getString(R.string.bf);
                            } else {
                                str13 = f2.getEmail();
                            }
                            h.f.b.l.b(str13, "");
                            String string7 = getString(R.string.g69);
                            h.f.b.l.b(string7, "");
                            a(str13, string7, 2131231088, "email_verify", true, aVar);
                            if (t3 == null || !h.f.b.l.a((Object) t3.is_available(), (Object) true)) {
                                String string8 = getString(R.string.h14);
                                h.f.b.l.b(string8, "");
                                String string9 = getString(R.string.h1k);
                                h.f.b.l.b(string9, "");
                                b(string8, string9, R.drawable.jf, "pwd_verify", false, aVar);
                            } else {
                                String string10 = getString(R.string.h14);
                                h.f.b.l.b(string10, "");
                                String string11 = getString(R.string.h1k);
                                h.f.b.l.b(string11, "");
                                b(string10, string11, R.drawable.jf, "pwd_verify", true, aVar);
                            }
                            i5 = R.id.clz;
                            i4 = R.id.aj_;
                        }
                        TuxTextView tuxTextView7 = (TuxTextView) a(i5);
                        h.f.b.l.b(tuxTextView7, "");
                        tuxTextView7.setText(f2.getBindPhone());
                        TuxTextView tuxTextView8 = (TuxTextView) a(R.id.aj9);
                        h.f.b.l.b(tuxTextView8, "");
                        tuxTextView8.setText(getString(R.string.g6_));
                        ((ImageView) a(i4)).setImageResource(2131231102);
                        ((ImageView) a(R.id.cnk)).setOnClickListener(new h(this, aVar));
                    }
                } else if (default_verify_way.equals("email_verify")) {
                    if (t != null && h.f.b.l.a((Object) t.is_available(), (Object) true)) {
                        h.f.b.l.b(f2, "");
                        String bindPhone = f2.getBindPhone();
                        if (bindPhone == null || h.m.p.a((CharSequence) bindPhone)) {
                            str10 = getString(R.string.fd);
                        } else {
                            str10 = f2.getBindPhone();
                        }
                        h.f.b.l.b(str10, "");
                        String string12 = getString(R.string.g6_);
                        h.f.b.l.b(string12, "");
                        a(str10, string12, 2131231102, "mobile_sms_verify", true, aVar);
                        if (t3 == null || !h.f.b.l.a((Object) t3.is_available(), (Object) true)) {
                            String string13 = getString(R.string.h14);
                            h.f.b.l.b(string13, "");
                            String string14 = getString(R.string.h1k);
                            h.f.b.l.b(string14, "");
                            b(string13, string14, R.drawable.jf, "pwd_verify", false, aVar);
                        } else {
                            String string15 = getString(R.string.h14);
                            h.f.b.l.b(string15, "");
                            String string16 = getString(R.string.h1k);
                            h.f.b.l.b(string16, "");
                            b(string15, string16, R.drawable.jf, "pwd_verify", true, aVar);
                        }
                    } else if (t3 == null || !h.f.b.l.a((Object) t3.is_available(), (Object) true)) {
                        h.f.b.l.b(f2, "");
                        String bindPhone2 = f2.getBindPhone();
                        if (bindPhone2 == null || h.m.p.a((CharSequence) bindPhone2)) {
                            str8 = getString(R.string.fd);
                        } else {
                            str8 = f2.getBindPhone();
                        }
                        h.f.b.l.b(str8, "");
                        String string17 = getString(R.string.g6_);
                        h.f.b.l.b(string17, "");
                        a(str8, string17, 2131231102, "mobile_sms_verify", false, aVar);
                        String string18 = getString(R.string.h14);
                        h.f.b.l.b(string18, "");
                        String string19 = getString(R.string.h1k);
                        h.f.b.l.b(string19, "");
                        b(string18, string19, R.drawable.jf, "pwd_verify", false, aVar);
                    } else {
                        String string20 = getString(R.string.h14);
                        h.f.b.l.b(string20, "");
                        String string21 = getString(R.string.h1k);
                        h.f.b.l.b(string21, "");
                        a(string20, string21, R.drawable.jf, "pwd_verify", true, aVar);
                        h.f.b.l.b(f2, "");
                        String bindPhone3 = f2.getBindPhone();
                        if (bindPhone3 == null || h.m.p.a((CharSequence) bindPhone3)) {
                            str9 = getString(R.string.fd);
                        } else {
                            str9 = f2.getBindPhone();
                        }
                        h.f.b.l.b(str9, "");
                        String string22 = getString(R.string.g6_);
                        h.f.b.l.b(string22, "");
                        b(str9, string22, 2131231102, "mobile_sms_verify", false, aVar);
                    }
                    TuxTextView tuxTextView9 = (TuxTextView) a(R.id.clz);
                    h.f.b.l.b(tuxTextView9, "");
                    tuxTextView9.setText(f2.getEmail());
                    TuxTextView tuxTextView10 = (TuxTextView) a(R.id.aj9);
                    h.f.b.l.b(tuxTextView10, "");
                    tuxTextView10.setText(getString(R.string.bf));
                    ((ImageView) a(R.id.aj_)).setImageResource(2131231088);
                    ((ImageView) a(R.id.cnk)).setOnClickListener(new i(this, aVar));
                }
            } else if (default_verify_way.equals("pwd_verify")) {
                if (t != null && h.f.b.l.a((Object) t.is_available(), (Object) true)) {
                    h.f.b.l.b(f2, "");
                    String bindPhone4 = f2.getBindPhone();
                    if (bindPhone4 == null || h.m.p.a((CharSequence) bindPhone4)) {
                        str5 = getString(R.string.fd);
                    } else {
                        str5 = f2.getBindPhone();
                    }
                    h.f.b.l.b(str5, "");
                    String string23 = getString(R.string.g6_);
                    h.f.b.l.b(string23, "");
                    i2 = R.id.aj_;
                    a(str5, string23, 2131231102, "mobile_sms_verify", true, aVar);
                    if (t2 == null || !h.f.b.l.a((Object) t2.is_available(), (Object) true)) {
                        String email4 = f2.getEmail();
                        if (email4 == null || h.m.p.a((CharSequence) email4)) {
                            str6 = getString(R.string.bf);
                        } else {
                            str6 = f2.getEmail();
                        }
                        h.f.b.l.b(str6, "");
                        String string24 = getString(R.string.g69);
                        h.f.b.l.b(string24, "");
                        b(str6, string24, 2131231088, "email_verify", false, aVar);
                    } else {
                        String email5 = f2.getEmail();
                        if (email5 == null || h.m.p.a((CharSequence) email5)) {
                            str7 = getString(R.string.bf);
                        } else {
                            str7 = f2.getEmail();
                        }
                        h.f.b.l.b(str7, "");
                        String string25 = getString(R.string.g69);
                        h.f.b.l.b(string25, "");
                        b(str7, string25, 2131231088, "email_verify", true, aVar);
                    }
                } else if (t2 == null || !h.f.b.l.a((Object) t2.is_available(), (Object) true)) {
                    h.f.b.l.b(f2, "");
                    String bindPhone5 = f2.getBindPhone();
                    if (bindPhone5 == null || h.m.p.a((CharSequence) bindPhone5)) {
                        str = getString(R.string.fd);
                    } else {
                        str = f2.getBindPhone();
                    }
                    h.f.b.l.b(str, "");
                    String string26 = getString(R.string.g6_);
                    h.f.b.l.b(string26, "");
                    i2 = R.id.aj_;
                    a(str, string26, 2131231102, "mobile_sms_verify", false, aVar);
                    String email6 = f2.getEmail();
                    if (email6 == null || h.m.p.a((CharSequence) email6)) {
                        str2 = getString(R.string.bf);
                    } else {
                        str2 = f2.getEmail();
                    }
                    h.f.b.l.b(str2, "");
                    String string27 = getString(R.string.g69);
                    h.f.b.l.b(string27, "");
                    b(str2, string27, 2131231088, "email_verify", false, aVar);
                } else {
                    h.f.b.l.b(f2, "");
                    String email7 = f2.getEmail();
                    if (email7 == null || h.m.p.a((CharSequence) email7)) {
                        str3 = getString(R.string.bf);
                    } else {
                        str3 = f2.getEmail();
                    }
                    h.f.b.l.b(str3, "");
                    String string28 = getString(R.string.g69);
                    h.f.b.l.b(string28, "");
                    a(str3, string28, 2131231088, "email_verify", true, aVar);
                    String bindPhone6 = f2.getBindPhone();
                    if (bindPhone6 == null || h.m.p.a((CharSequence) bindPhone6)) {
                        str4 = getString(R.string.fd);
                    } else {
                        str4 = f2.getBindPhone();
                    }
                    h.f.b.l.b(str4, "");
                    String string29 = getString(R.string.g6_);
                    h.f.b.l.b(string29, "");
                    b(str4, string29, 2131231102, "mobile_sms_verify", false, aVar);
                    i3 = R.id.clz;
                    i2 = R.id.aj_;
                    TuxTextView tuxTextView11 = (TuxTextView) a(i3);
                    h.f.b.l.b(tuxTextView11, "");
                    tuxTextView11.setText(getString(R.string.h14));
                    TuxTextView tuxTextView12 = (TuxTextView) a(R.id.aj9);
                    h.f.b.l.b(tuxTextView12, "");
                    tuxTextView12.setText(getString(R.string.h1k));
                    ((ImageView) a(i2)).setImageResource(R.drawable.jf);
                    ((ImageView) a(R.id.cnk)).setOnClickListener(new j(this, aVar));
                }
                i3 = R.id.clz;
                TuxTextView tuxTextView112 = (TuxTextView) a(i3);
                h.f.b.l.b(tuxTextView112, "");
                tuxTextView112.setText(getString(R.string.h14));
                TuxTextView tuxTextView122 = (TuxTextView) a(R.id.aj9);
                h.f.b.l.b(tuxTextView122, "");
                tuxTextView122.setText(getString(R.string.h1k));
                ((ImageView) a(i2)).setImageResource(R.drawable.jf);
                ((ImageView) a(R.id.cnk)).setOnClickListener(new j(this, aVar));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f63989a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f63990b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f63991c;

        static {
            Covode.recordClassIndex(39426);
        }

        b(o oVar, String str, h.f.a.a aVar) {
            this.f63989a = oVar;
            this.f63990b = str;
            this.f63991c = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            String str = this.f63990b;
            String a2 = this.f63989a.a();
            h.f.b.l.b(a2, "");
            q.b("update", str, a2);
            this.f63991c.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f64026a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f64027b;

        static {
            Covode.recordClassIndex(39446);
        }

        s(o oVar, a aVar) {
            this.f64026a = oVar;
            this.f64027b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            String str;
            String a2 = this.f64026a.a();
            h.f.b.l.b(a2, "");
            q.b("confirm", "turn_off", a2);
            androidx.fragment.app.e activity = this.f64026a.getActivity();
            if (!(activity instanceof TwoStepVerificationManageActivity)) {
                activity = null;
            }
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = (TwoStepVerificationManageActivity) activity;
            if (twoStepVerificationManageActivity != null) {
                a.C1430a data = this.f64027b.getData();
                if (data == null || (str = data.getDefault_verify_way()) == null) {
                    str = "";
                }
                twoStepVerificationManageActivity.b(str, "", "authorized_logins");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f63992a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f63993b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Boolean f63994c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f63995d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f63996e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f63997f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f63998g;

        static {
            Covode.recordClassIndex(39427);
        }

        c(o oVar, String str, Boolean bool, a aVar, String str2, String str3, String str4) {
            this.f63992a = oVar;
            this.f63993b = str;
            this.f63994c = bool;
            this.f63995d = aVar;
            this.f63996e = str2;
            this.f63997f = str3;
            this.f63998g = str4;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            String str = this.f63993b;
            String a2 = this.f63992a.a();
            h.f.b.l.b(a2, "");
            q.b("confirm", str, a2);
            if (h.f.b.l.a((Object) this.f63994c, (Object) false)) {
                this.f63992a.b(this.f63995d);
                return;
            }
            String a3 = this.f63992a.a();
            h.f.b.l.b(a3, "");
            q.b("method_remove", a3);
            a.C0731a aVar = new a.C0731a(this.f63992a.getContext());
            aVar.f33401a = this.f63996e;
            aVar.f33402b = this.f63997f;
            a.C0731a b2 = aVar.a(R.string.dn, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.account.login.twostep.o.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f63999a;

                static {
                    Covode.recordClassIndex(39428);
                }

                {
                    this.f63999a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i2) {
                    String a2 = this.f63999a.f63992a.a();
                    h.f.b.l.b(a2, "");
                    q.b("confirm", "method_remove", a2);
                    androidx.fragment.app.e activity = this.f63999a.f63992a.getActivity();
                    if (!(activity instanceof TwoStepVerificationManageActivity)) {
                        activity = null;
                    }
                    TwoStepVerificationManageActivity twoStepVerificationManageActivity = (TwoStepVerificationManageActivity) activity;
                    if (twoStepVerificationManageActivity != null) {
                        twoStepVerificationManageActivity.a(this.f63999a.f63998g, "", "authorized_logins");
                    }
                }
            }, false).b(R.string.g6d, (DialogInterface.OnClickListener) null, false);
            b2.E = true;
            b2.a().c();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            h.f.b.l.b();
        }
        Serializable serializable = arguments.getSerializable("response");
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse");
        a aVar = (a) serializable;
        a(aVar);
        ((TuxTextView) a(R.id.ety)).setOnClickListener(new e(this, aVar));
        ((ConstraintLayout) a(R.id.ny)).setOnClickListener(new f(this));
        ((TuxTextView) a(R.id.ety)).addOnLayoutChangeListener(new g(this));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.gf, viewGroup, false);
    }

    public final void a(String str, a aVar, boolean z) {
        Boolean bool;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String str2;
        int i2;
        boolean z2;
        User f2 = cj.f();
        boolean a2 = h.f.b.l.a((Object) str, (Object) "mobile_sms_verify");
        boolean a3 = h.f.b.l.a((Object) str, (Object) "email_verify");
        a.C1430a data = aVar.getData();
        List<aa> two_step_verify_ways = data != null ? data.getTwo_step_verify_ways() : null;
        if (two_step_verify_ways != null) {
            int i3 = 0;
            for (aa aaVar : two_step_verify_ways) {
                if (h.f.b.l.a((Object) aaVar.is_available(), (Object) true)) {
                    i3++;
                }
            }
            if (i3 > 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
        } else {
            bool = null;
        }
        if (a2) {
            h.f.b.l.b(f2, "");
            string = f2.getBindPhone();
            string2 = getString(R.string.bla);
        } else if (a3) {
            h.f.b.l.b(f2, "");
            string = f2.getEmail();
            string2 = getString(R.string.bjg);
        } else {
            string = getString(R.string.h14);
            string2 = getString(R.string.h0z);
        }
        h.f.b.l.b(string2, "");
        if (a2) {
            string3 = getString(R.string.hi);
        } else if (a3) {
            string3 = getString(R.string.hh);
        } else {
            string3 = getString(R.string.h0j);
        }
        h.f.b.l.b(string3, "");
        d dVar = new d(this, a2, z, a3);
        if (a2) {
            string4 = getString(R.string.fcc);
        } else if (a3) {
            string4 = getString(R.string.fc2);
        } else {
            string4 = getString(R.string.h13);
        }
        h.f.b.l.b(string4, "");
        if (a2) {
            string5 = getString(R.string.fcb);
        } else if (a3) {
            string5 = getString(R.string.fc3);
        } else {
            string5 = getString(R.string.h12);
        }
        h.f.b.l.b(string5, "");
        if (a2) {
            str2 = "edit_sms";
        } else if (a3) {
            str2 = "edit_email";
        } else {
            str2 = "edit_password";
        }
        String a4 = a();
        h.f.b.l.b(a4, "");
        q.a(str2, a4);
        String a5 = a();
        h.f.b.l.b(a5, "");
        q.b(str2, a5);
        a.C0731a aVar2 = new a.C0731a(getContext());
        aVar2.f33401a = string;
        aVar2.f33402b = string2;
        a.C0731a a6 = aVar2.a(string3, (DialogInterface.OnClickListener) new b(this, str2, dVar), false);
        if (h.f.b.l.a((Object) bool, (Object) true)) {
            i2 = R.string.dn;
        } else {
            i2 = R.string.g6q;
        }
        c cVar = new c(this, str2, bool, aVar, string4, string5, str);
        a6.f33405e = a6.r.getString(i2);
        a6.f33412l = cVar;
        a6.C = false;
        a6.G = true;
        a.C0731a c2 = a6.c(a6.r.getString(R.string.g6d), null, false);
        c2.E = true;
        c2.a().c();
    }

    private final void a(String str, String str2, int i2, String str3, boolean z, a aVar) {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.qw);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setText(str);
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.qs);
        h.f.b.l.b(tuxTextView2, "");
        tuxTextView2.setText(str2);
        ((ImageView) a(R.id.qu)).setImageResource(i2);
        if (z) {
            ((AutoRTLImageView) a(R.id.qm)).setImageResource(2131231159);
            ((AutoRTLImageView) a(R.id.qm)).setOnClickListener(new k(this, str3, aVar));
            ((ConstraintLayout) a(R.id.qy)).setOnClickListener(l.f64015a);
            return;
        }
        ((ConstraintLayout) a(R.id.qy)).setOnClickListener(new m(this, str3));
        ((AutoRTLImageView) a(R.id.qm)).setOnClickListener(n.f64018a);
        ((AutoRTLImageView) a(R.id.qm)).setImageResource(0);
    }

    private final void b(String str, String str2, int i2, String str3, boolean z, a aVar) {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.qx);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setText(str);
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.qt);
        h.f.b.l.b(tuxTextView2, "");
        tuxTextView2.setText(str2);
        ((ImageView) a(R.id.qv)).setImageResource(i2);
        if (z) {
            ((AutoRTLImageView) a(R.id.qn)).setImageResource(2131231159);
            ((AutoRTLImageView) a(R.id.qn)).setOnClickListener(new View$OnClickListenerC1434o(this, str3, aVar));
            ((ConstraintLayout) a(R.id.qz)).setOnClickListener(p.f64022a);
            return;
        }
        ((ConstraintLayout) a(R.id.qz)).setOnClickListener(new q(this, str3));
        ((AutoRTLImageView) a(R.id.qn)).setOnClickListener(r.f64025a);
        ((AutoRTLImageView) a(R.id.qn)).setImageResource(0);
    }

    static final class g implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f64005a;

        static {
            Covode.recordClassIndex(39434);
        }

        g(o oVar) {
            this.f64005a = oVar;
        }

        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            if (i3 > this.f64005a.f63986a) {
                TuxTextView tuxTextView = (TuxTextView) this.f64005a.a(R.id.ety);
                h.f.b.l.b(tuxTextView, "");
                tuxTextView.setTop(this.f64005a.f63986a);
            }
        }
    }
}
