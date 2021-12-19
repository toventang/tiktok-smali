package com.ss.android.ugc.aweme.newfollow.ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.l;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

public final class d extends l {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<Fragment> f112619a = new ArrayList<>();

    static {
        Covode.recordClassIndex(72371);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f112619a.size();
    }

    @Override // androidx.fragment.app.l
    public final Fragment a(int i2) {
        return this.f112619a.get(i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i2) {
        if (i2 != 0 && i2 == 1) {
            return com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.c20);
        }
        return "";
    }

    public d(i iVar, ArrayList<Fragment> arrayList) {
        super(iVar);
        this.f112619a = arrayList;
    }
}
