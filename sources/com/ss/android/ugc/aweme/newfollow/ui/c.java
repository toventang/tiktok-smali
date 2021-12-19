package com.ss.android.ugc.aweme.newfollow.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.analytics.page.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.discover.c.b;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class c extends a implements d, com.bytedance.hox.a.d {

    /* renamed from: a  reason: collision with root package name */
    ViewPager f112617a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<Fragment> f112618b = new ArrayList<>();

    static {
        Covode.recordClassIndex(72370);
    }

    @Override // com.bytedance.analytics.page.d
    public final String ad_() {
        return "MainTabPage";
    }

    @Override // com.bytedance.hox.a.d
    public final void b(Bundle bundle) {
    }

    @Override // com.bytedance.analytics.page.b
    public final String bp_() {
        return "5131";
    }

    @Override // com.bytedance.analytics.page.b
    public final Map<String, String> c() {
        return null;
    }

    @Override // com.bytedance.analytics.page.b
    public final String ac_() {
        return String.valueOf(hashCode());
    }

    public final b e() {
        if (this.f112618b.size() == 0 || !(this.f112618b.get(0) instanceof b)) {
            return null;
        }
        return (b) this.f112618b.get(0);
    }

    public final com.ss.android.ugc.aweme.discover.activity.a g() {
        if (this.f112618b.size() == 0 || !(this.f112618b.get(0) instanceof com.ss.android.ugc.aweme.discover.activity.a)) {
            return null;
        }
        return (com.ss.android.ugc.aweme.discover.activity.a) this.f112618b.get(0);
    }

    @Override // com.bytedance.hox.a.d
    public final void a(Bundle bundle) {
        com.bytedance.analytics.b.a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        Iterator<Fragment> it = this.f112618b.iterator();
        while (it.hasNext()) {
            it.next().setUserVisibleHint(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        this.f112617a = (ViewPager) view.findViewById(R.id.fk_);
        super.onViewCreated(view, bundle);
        this.f112618b.clear();
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("i18n_tab_mode", true);
        Fragment a2 = getChildFragmentManager().a(new StringBuilder("android:switcher:2131370423:0").toString());
        if (a2 == null) {
            a2 = com.ss.android.ugc.aweme.discover.b.f80832a.a();
            a2.setArguments(bundle2);
        }
        this.f112618b.add(a2);
        this.f112617a.setAdapter(new d(getChildFragmentManager(), this.f112618b));
        this.f112617a.setOverScrollMode(2);
        this.f112617a.setCurrentItem(0);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.a11, viewGroup, false);
    }
}
