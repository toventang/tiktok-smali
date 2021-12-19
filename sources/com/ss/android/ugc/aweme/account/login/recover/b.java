package com.ss.android.ugc.aweme.account.login.recover;

import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.ui.l;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;

public final class b extends com.ss.android.ugc.aweme.account.login.v2.ui.a.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f63575c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f63576a = -1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f63577b = true;

    /* renamed from: d  reason: collision with root package name */
    private l f63578d;

    /* renamed from: e  reason: collision with root package name */
    private final h f63579e = i.a((h.f.a.a) new e(this));

    /* renamed from: j  reason: collision with root package name */
    private final h f63580j = i.a((h.f.a.a) new C1418b(this));

    /* renamed from: k  reason: collision with root package name */
    private HashMap f63581k;

    static {
        Covode.recordClassIndex(39198);
    }

    private final l.a g() {
        return (l.a) this.f63580j.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        h.f.b.l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f63581k == null) {
            this.f63581k = new HashMap();
        }
        View view = (View) this.f63581k.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f63581k.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.gc;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f63581k;
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
            Covode.recordClassIndex(39199);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean e() {
        ViewPager viewPager = (ViewPager) c(R.id.d46);
        h.f.b.l.b(viewPager, "");
        if (viewPager.getCurrentItem() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        return new com.ss.android.ugc.aweme.account.login.v2.ui.b(getString(R.string.f_s), null, false, null, null, false, "phone_login_homepage", false, false, 1278);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        int i2 = this.f63576a;
        if (i2 == -1) {
            Bundle arguments = getArguments();
            if (arguments == null || arguments.getInt("child_page") != k.INPUT_EMAIL_LOGIN.getValue()) {
                i2 = 0;
            } else {
                i2 = 1;
            }
        }
        int i3 = this.f63576a;
        if (i3 != i2) {
            if (i3 != -1) {
                this.f63577b = false;
            }
            this.f63576a = i2;
            ViewPager viewPager = (ViewPager) c(R.id.d46);
            h.f.b.l.b(viewPager, "");
            viewPager.setCurrentItem(i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.b$b  reason: collision with other inner class name */
    static final class C1418b extends m implements h.f.a.a<l.a> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(39200);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1418b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ l.a invoke() {
            a aVar = new a();
            aVar.setArguments(new Bundle(this.this$0.getArguments()));
            Bundle arguments = aVar.getArguments();
            if (arguments == null) {
                h.f.b.l.b();
            }
            arguments.putInt("current_page", k.INPUT_EMAIL_LOGIN.getValue());
            Bundle arguments2 = aVar.getArguments();
            if (arguments2 == null) {
                h.f.b.l.b();
            }
            arguments2.remove("next_page");
            String string = this.this$0.getString(R.string.aod);
            h.f.b.l.b(string, "");
            return new l.a(aVar, string);
        }
    }

    static final class e extends m implements h.f.a.a<l.a> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(39203);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ l.a invoke() {
            c cVar = new c();
            cVar.setArguments(new Bundle(this.this$0.getArguments()));
            Bundle arguments = cVar.getArguments();
            if (arguments == null) {
                h.f.b.l.b();
            }
            arguments.putInt("current_page", k.INPUT_PHONE_LOGIN.getValue());
            Bundle arguments2 = cVar.getArguments();
            if (arguments2 == null) {
                h.f.b.l.b();
            }
            arguments2.remove("next_page");
            String string = this.this$0.getString(R.string.d_9);
            h.f.b.l.b(string, "");
            return new l.a(cVar, string);
        }
    }

    public static final class c implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f63582a;

        static {
            Covode.recordClassIndex(39201);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(b bVar) {
            this.f63582a = bVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            String str;
            this.f63582a.f63576a = i2;
            com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = this.f63582a.v;
            if (bVar == null) {
                h.f.b.l.b();
            }
            if (this.f63582a.e()) {
                str = "phone_login_homepage";
            } else {
                str = "email_login_homepage";
            }
            bVar.f65055i = str;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            String str;
            if (i2 != 2) {
                return;
            }
            if (!this.f63582a.f63577b) {
                this.f63582a.f63577b = true;
                return;
            }
            ViewPager viewPager = (ViewPager) this.f63582a.c(R.id.d46);
            h.f.b.l.b(viewPager, "");
            if (viewPager.getCurrentItem() != this.f63582a.f63576a) {
                if (this.f63582a.e()) {
                    str = "switch_to_phone";
                } else {
                    str = "switch_to_email";
                }
                r.a(str, new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", this.f63582a.x()).a("enter_type", "slide").f62575a);
                ViewPager viewPager2 = (ViewPager) this.f63582a.c(R.id.d46);
                h.f.b.l.b(viewPager2, "");
                viewPager2.getCurrentItem();
            }
        }
    }

    static final class d implements DmtTabLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f63583a;

        static {
            Covode.recordClassIndex(39202);
        }

        d(b bVar) {
            this.f63583a = bVar;
        }

        @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.b
        public final void a(DmtTabLayout.f fVar) {
            String str;
            this.f63583a.f63577b = false;
            h.f.b.l.b(fVar, "");
            if (fVar.f33752e == 0) {
                str = "switch_to_phone";
            } else {
                str = "switch_to_email";
            }
            r.a(str, new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", this.f63583a.x()).a("enter_type", "click").f62575a);
            ViewPager viewPager = (ViewPager) this.f63583a.c(R.id.d46);
            h.f.b.l.b(viewPager, "");
            viewPager.setCurrentItem(fVar.f33752e);
            String.valueOf(fVar.f33750c);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        float f2;
        DmtTabLayout.h hVar;
        TextView textView;
        TextPaint paint;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
        h.f.b.l.b(childFragmentManager, "");
        l lVar = new l(childFragmentManager);
        this.f63578d = lVar;
        lVar.a((l.a) this.f63579e.getValue());
        l lVar2 = this.f63578d;
        if (lVar2 == null) {
            h.f.b.l.a("tabAdapter");
        }
        lVar2.a(g());
        ViewPager viewPager = (ViewPager) c(R.id.d46);
        h.f.b.l.b(viewPager, "");
        l lVar3 = this.f63578d;
        if (lVar3 == null) {
            h.f.b.l.a("tabAdapter");
        }
        viewPager.setAdapter(lVar3);
        ((DmtTabLayout) c(R.id.d47)).setCustomTabViewResId(R.layout.ha);
        ((DmtTabLayout) c(R.id.d47)).setupWithViewPager((ViewPager) c(R.id.d46));
        ((ViewPager) c(R.id.d46)).addOnPageChangeListener(new c(this));
        ((DmtTabLayout) c(R.id.d47)).setOnTabClickListener(new d(this));
        ViewPager viewPager2 = (ViewPager) c(R.id.d46);
        h.f.b.l.b(viewPager2, "");
        viewPager2.setCurrentItem(1);
        DmtTabLayout.f b2 = ((DmtTabLayout) c(R.id.d47)).b(1);
        if (b2 == null || (hVar = b2.f33756i) == null || (textView = hVar.getTextView()) == null || (paint = textView.getPaint()) == null) {
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
}
