package com.ss.android.ugc.aweme.account.login.v2.ui.a;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.ui.l;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;

public final class s extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f64953d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public l f64954a;

    /* renamed from: b  reason: collision with root package name */
    public int f64955b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f64956c = true;

    /* renamed from: e  reason: collision with root package name */
    private final h f64957e = i.a((h.f.a.a) new e(this));

    /* renamed from: j  reason: collision with root package name */
    private final h f64958j = i.a((h.f.a.a) new b(this));

    /* renamed from: k  reason: collision with root package name */
    private HashMap f64959k;

    static {
        Covode.recordClassIndex(39930);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        h.f.b.l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f64959k == null) {
            this.f64959k = new HashMap();
        }
        View view = (View) this.f64959k.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f64959k.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.hq;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f64959k;
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
            Covode.recordClassIndex(39931);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final boolean q() {
        KeyboardUtils.c(getView());
        return super.q();
    }

    public final boolean e() {
        ViewPager viewPager = (ViewPager) c(R.id.d48);
        h.f.b.l.b(viewPager, "");
        if (viewPager.getCurrentItem() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        return new com.ss.android.ugc.aweme.account.login.v2.ui.b(getString(R.string.aox), null, false, null, null, false, "phone_sign_up_homepage", false, false, 1790);
    }

    static final class b extends m implements h.f.a.a<l.a> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(39932);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(s sVar) {
            super(0);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ l.a invoke() {
            g gVar = new g();
            gVar.setArguments(new Bundle(this.this$0.getArguments()));
            Bundle arguments = gVar.getArguments();
            if (arguments == null) {
                h.f.b.l.b();
            }
            arguments.putInt("current_page", k.INPUT_EMAIL_SIGN_UP.getValue());
            Bundle arguments2 = gVar.getArguments();
            if (arguments2 == null) {
                h.f.b.l.b();
            }
            arguments2.remove("next_page");
            String string = this.this$0.getString(R.string.d7w);
            h.f.b.l.b(string, "");
            return new l.a(gVar, string);
        }
    }

    static final class e extends m implements h.f.a.a<l.a> {
        final /* synthetic */ s this$0;

        static {
            Covode.recordClassIndex(39935);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(s sVar) {
            super(0);
            this.this$0 = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ l.a invoke() {
            u uVar = new u();
            uVar.setArguments(new Bundle(this.this$0.getArguments()));
            Bundle arguments = uVar.getArguments();
            if (arguments == null) {
                h.f.b.l.b();
            }
            arguments.putInt("current_page", k.INPUT_PHONE_SIGN_UP.getValue());
            Bundle arguments2 = uVar.getArguments();
            if (arguments2 == null) {
                h.f.b.l.b();
            }
            arguments2.remove("next_page");
            String string = this.this$0.getString(R.string.d_9);
            h.f.b.l.b(string, "");
            return new l.a(uVar, string);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        int i2 = this.f64955b;
        if (i2 == -1) {
            Bundle arguments = getArguments();
            if (arguments == null || arguments.getInt("child_page") != k.INPUT_EMAIL_SIGN_UP.getValue()) {
                i2 = 0;
            } else {
                i2 = 1;
            }
        }
        int i3 = this.f64955b;
        if (i3 != i2) {
            if (i3 != -1) {
                this.f64956c = false;
            }
            this.f64955b = i2;
            ViewPager viewPager = (ViewPager) c(R.id.d48);
            h.f.b.l.b(viewPager, "");
            viewPager.setCurrentItem(i2);
        }
        l lVar = this.f64954a;
        if (lVar == null) {
            h.f.b.l.a("tabAdapter");
        }
        Fragment a2 = lVar.a(this.f64955b);
        if (a2 instanceof com.bytedance.analytics.page.b) {
            com.bytedance.analytics.b.a((com.bytedance.analytics.page.b) a2);
        }
    }

    public static final class c implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f64960a;

        static {
            Covode.recordClassIndex(39933);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(s sVar) {
            this.f64960a = sVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            String str;
            this.f64960a.f64955b = i2;
            com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = this.f64960a.v;
            if (bVar == null) {
                h.f.b.l.b();
            }
            if (this.f64960a.e()) {
                str = "phone_sign_up_homepage";
            } else {
                str = "email_sign_up_homepage";
            }
            bVar.f65055i = str;
            l lVar = this.f64960a.f64954a;
            if (lVar == null) {
                h.f.b.l.a("tabAdapter");
            }
            Fragment a2 = lVar.a(this.f64960a.f64955b);
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
            if (!this.f64960a.f64956c) {
                this.f64960a.f64956c = true;
                return;
            }
            ViewPager viewPager = (ViewPager) this.f64960a.c(R.id.d48);
            h.f.b.l.b(viewPager, "");
            if (viewPager.getCurrentItem() != this.f64960a.f64955b) {
                if (this.f64960a.e()) {
                    str = "register_switch_phone";
                } else {
                    str = "register_switch_email";
                }
                r.a(str, new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", this.f64960a.x()).a("enter_type", "slide").f62575a);
                ViewPager viewPager2 = (ViewPager) this.f64960a.c(R.id.d48);
                h.f.b.l.b(viewPager2, "");
                viewPager2.getCurrentItem();
            }
        }
    }

    static final class d implements DmtTabLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f64961a;

        static {
            Covode.recordClassIndex(39934);
        }

        d(s sVar) {
            this.f64961a = sVar;
        }

        @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.b
        public final void a(DmtTabLayout.f fVar) {
            String str;
            this.f64961a.f64956c = false;
            h.f.b.l.b(fVar, "");
            if (fVar.f33752e == 0) {
                str = "register_switch_phone";
            } else {
                str = "register_switch_email";
            }
            r.a(str, new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", this.f64961a.x()).a("enter_type", "click").f62575a);
            ViewPager viewPager = (ViewPager) this.f64961a.c(R.id.d48);
            h.f.b.l.b(viewPager, "");
            viewPager.setCurrentItem(fVar.f33752e);
            String.valueOf(fVar.f33750c);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
        h.f.b.l.b(childFragmentManager, "");
        l lVar = new l(childFragmentManager);
        this.f64954a = lVar;
        lVar.a((l.a) this.f64957e.getValue());
        l lVar2 = this.f64954a;
        if (lVar2 == null) {
            h.f.b.l.a("tabAdapter");
        }
        lVar2.a((l.a) this.f64958j.getValue());
        ViewPager viewPager = (ViewPager) c(R.id.d48);
        h.f.b.l.b(viewPager, "");
        l lVar3 = this.f64954a;
        if (lVar3 == null) {
            h.f.b.l.a("tabAdapter");
        }
        viewPager.setAdapter(lVar3);
        ((DmtTabLayout) c(R.id.d49)).setCustomTabViewResId(R.layout.ha);
        ((DmtTabLayout) c(R.id.d49)).setupWithViewPager((ViewPager) c(R.id.d48));
        ((ViewPager) c(R.id.d48)).addOnPageChangeListener(new c(this));
        ((DmtTabLayout) c(R.id.d49)).setOnTabClickListener(new d(this));
    }
}
