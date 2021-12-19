package com.ss.android.ugc.aweme.favorites.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.dmt.ui.widget.tablayout.b;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.commercialize.e_commerce.service.ShoppingAdsServiceImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.cl;
import com.ss.android.ugc.aweme.favorites.a.f;
import com.ss.android.ugc.aweme.profile.ui.cs;
import com.zhiliaoapp.musically.R;
import dagger.a;
import java.util.ArrayList;

public final class y extends i implements ViewPager.e {

    /* renamed from: a  reason: collision with root package name */
    protected a<f> f90942a;

    /* renamed from: b  reason: collision with root package name */
    protected a<String> f90943b;

    /* renamed from: c  reason: collision with root package name */
    protected TextTitleBar f90944c;

    /* renamed from: d  reason: collision with root package name */
    DmtTabLayout f90945d;

    /* renamed from: e  reason: collision with root package name */
    protected ViewPager f90946e;

    /* renamed from: j  reason: collision with root package name */
    boolean f90947j;

    /* renamed from: k  reason: collision with root package name */
    public String[] f90948k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f90949l;

    /* renamed from: m  reason: collision with root package name */
    public int f90950m;
    public int n;
    public boolean o = true;
    private String p;
    private String q;

    static {
        Covode.recordClassIndex(57165);
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public final void onPageScrollStateChanged(int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public final void onPageScrolled(int i2, float f2, int i3) {
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f90942a.get().a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        DmtTabLayout dmtTabLayout = this.f90945d;
        if (dmtTabLayout != null) {
            b.a(dmtTabLayout);
        }
        ViewPager viewPager = this.f90946e;
        if (viewPager != null) {
            viewPager.setCurrentItem(this.n);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        cs csVar;
        super.onResume();
        if (!this.f90947j && this.f90942a.get() != null) {
            f fVar = this.f90942a.get();
            int i2 = this.n;
            fVar.c(i2);
            if (fVar.f90430a != null && i2 >= 0 && i2 < fVar.f90430a.size() && (fVar.f90430a.get(i2) instanceof cs) && (csVar = (cs) fVar.f90430a.get(i2)) != null) {
                csVar.au_();
            }
        }
        this.f90947j = false;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public final void onPageSelected(int i2) {
        if (this.f90942a.get() != null && i2 >= 0 && i2 < this.f90942a.get().getCount()) {
            this.n = i2;
            f fVar = this.f90942a.get();
            fVar.c(i2);
            if (fVar.f90430a != null && i2 < fVar.f90430a.size()) {
                if (fVar.f90430a.get(i2) instanceof cs) {
                    cs csVar = (cs) fVar.f90430a.get(i2);
                    if (csVar != null && csVar.cb_()) {
                        csVar.bM_();
                    }
                } else if (fVar.f90430a.get(i2) instanceof j) {
                    ((j) fVar.f90430a.get(i2)).c();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList arrayList = new ArrayList();
        if (!cl.b()) {
            arrayList.add("video");
            arrayList.add("music");
            arrayList.add("sticker");
            if (com.ss.android.ugc.aweme.comment.d.a.a()) {
                arrayList.add(UGCMonitor.EVENT_COMMENT);
            }
            if (com.ss.android.ugc.aweme.question.b.a.f119907a) {
                arrayList.add("question");
            }
            arrayList.add("challenge");
            if (ShoppingAdsServiceImpl.d() != null && ShoppingAdsServiceImpl.d().a()) {
                arrayList.add("product");
            }
        } else {
            arrayList.add("video");
            arrayList.add("challenge");
            arrayList.add("music");
            arrayList.add("sticker");
            if (com.ss.android.ugc.aweme.comment.d.a.a()) {
                arrayList.add(UGCMonitor.EVENT_COMMENT);
            }
            if (com.ss.android.ugc.aweme.question.b.a.f119907a) {
                arrayList.add("question");
            }
            if (ShoppingAdsServiceImpl.d() != null && ShoppingAdsServiceImpl.d().a()) {
                arrayList.add("product");
            }
        }
        String[] strArr = new String[arrayList.size()];
        this.f90948k = strArr;
        this.f90948k = (String[]) arrayList.toArray(strArr);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i2;
        super.onViewCreated(view, bundle);
        this.f90944c = (TextTitleBar) view.findViewById(R.id.em8);
        this.f90945d = (DmtTabLayout) view.findViewById(R.id.ehe);
        this.f90946e = (ViewPager) view.findViewById(R.id.fk_);
        Intent intent = getActivity().getIntent();
        this.f90946e.setAdapter(this.f90942a.get());
        if (intent != null) {
            if (intent.hasExtra("tab_name")) {
                this.q = a(intent, "tab_name");
                int i3 = 0;
                while (true) {
                    String[] strArr = this.f90948k;
                    if (i3 >= strArr.length) {
                        break;
                    } else if (TextUtils.equals(this.q, strArr[i3])) {
                        this.f90950m = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
                int i4 = this.f90950m;
                if (i4 > 0 && i4 < this.f90942a.get().getCount()) {
                    this.n = this.f90950m;
                    this.f90949l = true;
                }
            } else if (intent.hasExtra("index")) {
                int intValue = Integer.valueOf(a(intent, "index")).intValue();
                this.f90950m = intValue;
                if (intValue > 0 && intValue < this.f90942a.get().getCount()) {
                    this.n = this.f90950m;
                    this.f90949l = true;
                }
            }
            if (intent.hasExtra("enter_method")) {
                this.p = a(intent, "enter_method");
            } else {
                this.p = "click_h5";
            }
            if (intent.hasExtra("tab_name")) {
                this.q = a(intent, "tab_name");
            }
            d dVar = new d();
            if (!TextUtils.isEmpty(this.f90943b.get())) {
                dVar.a("enter_from", this.f90943b.get());
            }
            if (!TextUtils.isEmpty(this.p)) {
                dVar.a("enter_method", this.p);
            }
            if (intent.hasExtra("scene_id")) {
                dVar.a("scene_id", intent.getIntExtra("scene_id", 0));
            }
            if (!TextUtils.isEmpty(this.p)) {
                dVar.a("enter_method", this.p);
            }
            if (!TextUtils.isEmpty(this.q)) {
                dVar.a("tab_name", this.q);
            }
            r.a("enter_personal_favourite", dVar.f66730a);
        }
        this.f90945d.setCustomTabViewResId(R.layout.a04);
        this.f90945d.setupWithViewPager(this.f90946e);
        this.f90945d.setOnTabClickListener(new aa(this));
        this.f90945d.a(new DmtTabLayout.c() {
            /* class com.ss.android.ugc.aweme.favorites.ui.y.AnonymousClass2 */

            static {
                Covode.recordClassIndex(57167);
            }

            @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.c
            public final void b(DmtTabLayout.f fVar) {
            }

            @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.c
            public final void a(DmtTabLayout.f fVar) {
                String str;
                int i2 = fVar.f33752e;
                if (y.this.o) {
                    str = "click";
                } else {
                    str = "slide";
                }
                if (y.this.f90949l) {
                    if (i2 == y.this.f90950m) {
                        com.ss.android.ugc.aweme.favorites.i.a.a(str, y.this.f90948k[i2]);
                    }
                    y.this.f90949l = false;
                } else {
                    com.ss.android.ugc.aweme.favorites.i.a.a(str, y.this.f90948k[i2]);
                }
                y.this.o = false;
                fVar.f33756i.findViewById(R.id.cat).setVisibility(8);
                if (!cl.b()) {
                    if (TextUtils.equals(y.this.f90948k[y.this.n], "music")) {
                        y.this.f90942a.get().a();
                    }
                } else if (TextUtils.equals(y.this.f90948k[y.this.n], "challenge")) {
                    y.this.f90942a.get().a();
                }
            }
        });
        this.f90945d.setTabMode(0);
        this.f90945d.setAutoFillWhenScrollable(true);
        this.f90945d.a(n.a(16.0d), n.a(16.0d));
        this.f90946e.addOnPageChangeListener(this);
        if (com.ss.android.ugc.aweme.question.b.a.f119907a) {
            i2 = 6;
        } else {
            i2 = 5;
        }
        this.f90946e.setOffscreenPageLimit(i2);
        this.f90944c.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {
            /* class com.ss.android.ugc.aweme.favorites.ui.y.AnonymousClass1 */

            static {
                Covode.recordClassIndex(57166);
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void b(View view) {
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void a(View view) {
                y yVar = y.this;
                if (yVar.getActivity() != null && (yVar.getActivity() instanceof UserFavoritesActivity)) {
                    yVar.getActivity().finish();
                }
            }
        });
        com.ss.android.ugc.aweme.favorites.i.a.f90645a = this.f90943b.get();
        this.f90945d.post(new z(this));
        ViewPager viewPager = this.f90946e;
        if (viewPager != null) {
            viewPager.setBackground(null);
        }
        DmtTabLayout dmtTabLayout = this.f90945d;
        if (dmtTabLayout != null) {
            dmtTabLayout.setBackground(null);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getArguments();
        return com.a.a(layoutInflater, R.layout.zt, viewGroup, false);
    }
}
