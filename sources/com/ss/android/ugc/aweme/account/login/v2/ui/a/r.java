package com.ss.android.ugc.aweme.account.login.v2.ui.a;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.ss.android.ugc.aweme.account.login.h.a;
import com.ss.android.ugc.aweme.account.login.recover.f;
import com.ss.android.ugc.aweme.account.login.v2.a.v;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.ui.l;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.i;
import java.io.Serializable;
import java.util.HashMap;

public final class r extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f64939d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public l f64940a;

    /* renamed from: b  reason: collision with root package name */
    public int f64941b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f64942c = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f64943e;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f64944j = i.a((h.f.a.a) new f(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f64945k = i.a((h.f.a.a) new c(this));

    /* renamed from: l  reason: collision with root package name */
    private HashMap f64946l;

    static {
        Covode.recordClassIndex(39921);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        h.f.b.l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f64946l == null) {
            this.f64946l = new HashMap();
        }
        View view = (View) this.f64946l.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f64946l.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.hp;
    }

    public final l.a e() {
        return (l.a) this.f64944j.getValue();
    }

    public final l.a g() {
        return (l.a) this.f64945k.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f64946l;
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
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void s() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39922);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f64947a;

        static {
            Covode.recordClassIndex(39923);
        }

        b(Fragment fragment) {
            this.f64947a = fragment;
        }

        @Override // f.a.d.a
        public final void a() {
            LoadingButton loadingButton = (LoadingButton) ((com.ss.android.ugc.aweme.account.login.v2.base.c) this.f64947a).c(R.id.d4b);
            if (loadingButton != null) {
                loadingButton.b(true);
            }
        }
    }

    public final boolean i() {
        ViewPager viewPager = (ViewPager) c(R.id.d46);
        h.f.b.l.b(viewPager, "");
        if (viewPager.getCurrentItem() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        boolean z;
        String string = getString(R.string.aqk);
        if (A() != j.RECOVER_ACCOUNT) {
            z = true;
        } else {
            z = false;
        }
        return new com.ss.android.ugc.aweme.account.login.v2.ui.b(string, null, false, null, null, false, "phone_login_homepage", z, false, 1278);
    }

    static final class c extends m implements h.f.a.a<l.a> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(39924);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(r rVar) {
            super(0);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ l.a invoke() {
            f fVar = new f();
            fVar.setArguments(new Bundle(this.this$0.getArguments()));
            Bundle arguments = fVar.getArguments();
            if (arguments == null) {
                h.f.b.l.b();
            }
            arguments.putInt("current_page", k.INPUT_EMAIL_LOGIN.getValue());
            Bundle arguments2 = fVar.getArguments();
            if (arguments2 == null) {
                h.f.b.l.b();
            }
            arguments2.remove("next_page");
            String string = this.this$0.getString(R.string.aod);
            h.f.b.l.b(string, "");
            return new l.a(fVar, string);
        }
    }

    static final class f extends m implements h.f.a.a<l.a> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(39927);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(r rVar) {
            super(0);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ l.a invoke() {
            t tVar = new t();
            tVar.setArguments(new Bundle(this.this$0.getArguments()));
            Bundle arguments = tVar.getArguments();
            if (arguments == null) {
                h.f.b.l.b();
            }
            arguments.putInt("current_page", k.INPUT_PHONE_LOGIN.getValue());
            Bundle arguments2 = tVar.getArguments();
            if (arguments2 == null) {
                h.f.b.l.b();
            }
            arguments2.putInt("current_scene", tVar.A().getValue());
            Bundle arguments3 = tVar.getArguments();
            if (arguments3 == null) {
                h.f.b.l.b();
            }
            arguments3.remove("next_page");
            String string = this.this$0.getString(R.string.d_9);
            h.f.b.l.b(string, "");
            return new l.a(tVar, string);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        int i2 = this.f64941b;
        if (i2 == -1) {
            Bundle arguments = getArguments();
            if (arguments == null || arguments.getInt("child_page") != k.INPUT_EMAIL_LOGIN.getValue()) {
                i2 = 0;
            } else {
                i2 = 1;
            }
        }
        int i3 = this.f64941b;
        if (i3 != i2) {
            if (i3 != -1) {
                this.f64942c = false;
            }
            this.f64941b = i2;
            ViewPager viewPager = (ViewPager) c(R.id.d46);
            h.f.b.l.b(viewPager, "");
            viewPager.setCurrentItem(i2);
        }
        l lVar = this.f64940a;
        if (lVar == null) {
            h.f.b.l.a("tabAdapter");
        }
        Fragment a2 = lVar.a(this.f64941b);
        if (a2 instanceof com.bytedance.analytics.page.b) {
            com.bytedance.analytics.b.a((com.bytedance.analytics.page.b) a2);
        }
    }

    public static final class d implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f64948a;

        static {
            Covode.recordClassIndex(39925);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(r rVar) {
            this.f64948a = rVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            String str;
            this.f64948a.f64941b = i2;
            com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = this.f64948a.v;
            if (bVar == null) {
                h.f.b.l.b();
            }
            if (this.f64948a.i()) {
                str = "phone_login_homepage";
            } else {
                str = "email_login_homepage";
            }
            bVar.f65055i = str;
            l lVar = this.f64948a.f64940a;
            if (lVar == null) {
                h.f.b.l.a("tabAdapter");
            }
            Fragment a2 = lVar.a(this.f64948a.f64941b);
            if (a2 instanceof com.bytedance.analytics.page.b) {
                com.bytedance.analytics.b.a((com.bytedance.analytics.page.b) a2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            String str;
            if (i2 != 2) {
                return;
            }
            if (!this.f64948a.f64942c) {
                this.f64948a.f64942c = true;
                return;
            }
            ViewPager viewPager = (ViewPager) this.f64948a.c(R.id.d46);
            h.f.b.l.b(viewPager, "");
            if (viewPager.getCurrentItem() != this.f64948a.f64941b) {
                if (this.f64948a.i()) {
                    str = "switch_to_phone";
                } else {
                    str = "switch_to_email";
                }
                com.ss.android.ugc.aweme.common.r.a(str, new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", this.f64948a.x()).a("enter_type", "slide").f62575a);
                ViewPager viewPager2 = (ViewPager) this.f64948a.c(R.id.d46);
                h.f.b.l.b(viewPager2, "");
                viewPager2.getCurrentItem();
            }
        }
    }

    public static final class h implements com.bytedance.sdk.a.e.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f64952a;

        static {
            Covode.recordClassIndex(39929);
        }

        @Override // com.bytedance.sdk.a.e.c
        public final void a(int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(r rVar) {
            this.f64952a = rVar;
        }

        @Override // com.bytedance.sdk.a.e.c
        public final void a(com.bytedance.sdk.a.e.a aVar) {
            if (aVar != null) {
                if (com.ss.android.ugc.aweme.account.login.h.a.a(com.ss.android.ugc.aweme.account.login.h.a.a(aVar.f43163a), com.ss.android.ugc.aweme.account.login.h.a.b(aVar.f43163a))) {
                    this.f64952a.a(aVar.f43163a, aVar.f43165c, true);
                    v.a("phone");
                    return;
                }
                this.f64952a.b(aVar.f43163a, aVar.f43165c, true);
                v.a("email");
            }
        }
    }

    static final class e implements DmtTabLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f64949a;

        static {
            Covode.recordClassIndex(39926);
        }

        e(r rVar) {
            this.f64949a = rVar;
        }

        @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.b
        public final void a(DmtTabLayout.f fVar) {
            String str;
            this.f64949a.f64942c = false;
            h.f.b.l.b(fVar, "");
            if (fVar.f33752e == 0) {
                str = "switch_to_phone";
            } else {
                str = "switch_to_email";
            }
            com.ss.android.ugc.aweme.common.r.a(str, new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", this.f64949a.x()).a("enter_type", "click").f62575a);
            ViewPager viewPager = (ViewPager) this.f64949a.c(R.id.d46);
            h.f.b.l.b(viewPager, "");
            viewPager.setCurrentItem(fVar.f33752e);
            String.valueOf(fVar.f33750c);
        }
    }

    public static final class g implements com.bytedance.sdk.a.e.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f64950a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f64951b;

        static {
            Covode.recordClassIndex(39928);
        }

        @Override // com.bytedance.sdk.a.e.c
        public final void a(com.bytedance.sdk.a.e.a aVar) {
            if (aVar != null) {
                if (com.ss.android.ugc.aweme.account.login.h.a.a(com.ss.android.ugc.aweme.account.login.h.a.a(aVar.f43163a), com.ss.android.ugc.aweme.account.login.h.a.b(aVar.f43163a))) {
                    if (this.f64951b && this.f64950a.v() == k.INPUT_EMAIL_LOGIN) {
                        return;
                    }
                    if (this.f64950a.A() != j.RECOVER_ACCOUNT || this.f64950a.v() != k.INPUT_EMAIL_LOGIN) {
                        this.f64950a.a(aVar.f43163a, aVar.f43165c, false);
                        v.a("phone");
                    }
                } else if (this.f64951b && this.f64950a.v() == k.INPUT_PHONE_LOGIN) {
                } else {
                    if (this.f64950a.A() != j.RECOVER_ACCOUNT || this.f64950a.v() != k.INPUT_PHONE_LOGIN) {
                        this.f64950a.b(aVar.f43163a, aVar.f43165c, false);
                        v.a("email");
                    }
                }
            }
        }

        g(r rVar, boolean z) {
            this.f64950a = rVar;
            this.f64951b = z;
        }

        @Override // com.bytedance.sdk.a.e.c
        public final void a(int i2, int i3) {
            Serializable serializable;
            if (i3 == 6 && !this.f64951b) {
                r rVar = this.f64950a;
                Bundle arguments = rVar.getArguments();
                if (arguments != null) {
                    serializable = arguments.getSerializable("recover_account_data");
                } else {
                    serializable = null;
                }
                f.b bVar = (f.b) serializable;
                if (rVar.A() != j.RECOVER_ACCOUNT || bVar == null || !bVar.getSafe()) {
                    com.ss.android.ugc.aweme.common.r.onEventV3("gms_login_info_autofill_notify");
                    com.bytedance.sdk.a.e.d.a().a((Activity) rVar.getActivity(), true, (com.bytedance.sdk.a.e.c) new h(rVar));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        float f2;
        DmtTabLayout.h hVar;
        TextView customTextView;
        TextPaint paint;
        boolean z;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
        h.f.b.l.b(childFragmentManager, "");
        l lVar = new l(childFragmentManager);
        this.f64940a = lVar;
        lVar.a(e());
        l lVar2 = this.f64940a;
        if (lVar2 == null) {
            h.f.b.l.a("tabAdapter");
        }
        lVar2.a(g());
        ViewPager viewPager = (ViewPager) c(R.id.d46);
        h.f.b.l.b(viewPager, "");
        l lVar3 = this.f64940a;
        if (lVar3 == null) {
            h.f.b.l.a("tabAdapter");
        }
        viewPager.setAdapter(lVar3);
        ((DmtTabLayout) c(R.id.d47)).setCustomTabViewResId(R.layout.ha);
        ((DmtTabLayout) c(R.id.d47)).setupWithViewPager((ViewPager) c(R.id.d46));
        ((ViewPager) c(R.id.d46)).addOnPageChangeListener(new d(this));
        ((DmtTabLayout) c(R.id.d47)).setOnTabClickListener(new e(this));
        if (!this.f64943e && com.ss.android.ugc.aweme.am.a.a()) {
            this.f64943e = true;
            Bundle arguments = getArguments();
            if (arguments != null) {
                z = arguments.getBoolean("disable_auto_gms", false);
            } else {
                z = false;
            }
            com.bytedance.sdk.a.e.d.a().a((Activity) getActivity(), false, (com.bytedance.sdk.a.e.c) new g(this, z));
        }
        DmtTabLayout.f b2 = ((DmtTabLayout) c(R.id.d47)).b(1);
        if (b2 == null || (hVar = b2.f33756i) == null || (customTextView = hVar.getCustomTextView()) == null || (paint = customTextView.getPaint()) == null) {
            f2 = 0.0f;
        } else {
            f2 = paint.measureText(g().f65084b);
        }
        if (f2 + n.b(getContext(), 24.0f) > ((float) (n.a(getContext()) / 2))) {
            DmtTabLayout dmtTabLayout = (DmtTabLayout) c(R.id.d47);
            h.f.b.l.b(dmtTabLayout, "");
            dmtTabLayout.setTabMode(0);
        }
    }

    public final void a(String str, String str2, boolean z) {
        String a2 = com.ss.android.ugc.aweme.account.login.h.a.a(str);
        h.f.b.l.b(a2, "");
        if (a2.length() != 0) {
            String b2 = com.ss.android.ugc.aweme.account.login.h.a.b(str);
            h.f.b.l.b(b2, "");
            if (b2.length() != 0 && !TextUtils.isEmpty(str2)) {
                String a3 = com.ss.android.ugc.aweme.account.login.h.a.a(str);
                h.f.b.l.b(a3, "");
                int parseInt = Integer.parseInt(a3);
                String b3 = com.ss.android.ugc.aweme.account.login.h.a.b(str);
                h.f.b.l.b(b3, "");
                a.C1412a create = a.C1412a.create(parseInt, Long.parseLong(b3));
                h.f.b.l.b(create, "");
                com.ss.android.ugc.aweme.account.login.v2.base.e.a(this, create);
                Fragment fragment = e().f65083a;
                if (!(fragment instanceof t)) {
                    return;
                }
                if (z) {
                    ((t) fragment).a(com.ss.android.ugc.aweme.account.login.h.a.b(str), str2, com.ss.android.ugc.aweme.account.login.h.a.a(str), str, true);
                    if (str == null) {
                        h.f.b.l.b();
                    }
                    if (str2 == null) {
                        h.f.b.l.b();
                    }
                    x.a((com.ss.android.ugc.aweme.account.login.v2.base.c) this, str, str2, "phone", true, (h.f.a.b) null, 32).a((f.a.d.a) new b(fragment)).c();
                    return;
                }
                ((t) fragment).a(com.ss.android.ugc.aweme.account.login.h.a.b(str), str2, com.ss.android.ugc.aweme.account.login.h.a.a(str), str, false);
            }
        }
    }

    public final void b(String str, String str2, boolean z) {
        String str3;
        if (c(R.id.d46) != null) {
            ViewPager viewPager = (ViewPager) c(R.id.d46);
            h.f.b.l.b(viewPager, "");
            boolean z2 = true;
            viewPager.setCurrentItem(1);
            Fragment fragment = g().f65083a;
            if (fragment instanceof f) {
                f fVar = (f) fragment;
                if (fVar.f64815a != null) {
                    EditText editText = fVar.f64815a;
                    if (editText == null) {
                        h.f.b.l.a("emailInput");
                    }
                    Editable text = editText.getText();
                    h.f.b.l.b(text, "");
                    if (text.length() != 0) {
                        z2 = false;
                    }
                    if (z2 || z) {
                        if (!TextUtils.isEmpty(str)) {
                            if (str == null) {
                                str = "";
                            }
                            fVar.f64819e = str;
                            EditText editText2 = fVar.f64815a;
                            if (editText2 == null) {
                                h.f.b.l.a("emailInput");
                            }
                            editText2.setText(fVar.f64819e);
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            if (str2 == null) {
                                str2 = "";
                            }
                            fVar.f64820j = str2;
                            EditText editText3 = fVar.f64816b;
                            if (editText3 == null) {
                                h.f.b.l.a("passwordInput");
                            }
                            editText3.setText(fVar.f64820j);
                        }
                        if (z) {
                            boolean a2 = com.ss.android.ugc.aweme.account.util.h.a(fVar.f64819e);
                            String str4 = fVar.f64819e;
                            String str5 = fVar.f64820j;
                            if (a2) {
                                str3 = "email";
                            } else {
                                str3 = "handle";
                            }
                            x.a((com.ss.android.ugc.aweme.account.login.v2.base.c) fVar, str4, str5, str3, true, (h.f.a.b) null, 32).c();
                            return;
                        }
                        return;
                    }
                    EditText editText4 = fVar.f64815a;
                    if (editText4 == null) {
                        h.f.b.l.a("emailInput");
                    }
                    if (h.f.b.l.a((Object) editText4.getText().toString(), (Object) str) && !TextUtils.isEmpty(str2)) {
                        if (str2 == null) {
                            str2 = "";
                        }
                        fVar.f64820j = str2;
                        EditText editText5 = fVar.f64816b;
                        if (editText5 == null) {
                            h.f.b.l.a("passwordInput");
                        }
                        editText5.setText(fVar.f64820j);
                    }
                }
            }
        }
    }
}
