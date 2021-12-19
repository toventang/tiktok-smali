package com.ss.android.ugc.aweme.choosemusic.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.f.a;
import com.ss.android.ugc.aweme.choosemusic.viewholder.k;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class g extends a {

    /* renamed from: d  reason: collision with root package name */
    protected List<Banner> f70299d;

    /* renamed from: e  reason: collision with root package name */
    private int f70300e;

    /* renamed from: f  reason: collision with root package name */
    private int f70301f;

    static {
        Covode.recordClassIndex(43365);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List<Banner> list = this.f70299d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final void a(List<Banner> list) {
        if (this.f70299d != list) {
            this.f70299d = list;
            notifyDataSetChanged();
        }
    }

    @Override // com.bytedance.ies.uikit.f.a
    public final View a(int i2, View view, ViewGroup viewGroup) {
        k kVar;
        if (view == null) {
            view = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aa3, viewGroup, false);
            kVar = new k(view, this.f70300e, this.f70301f);
            view.setTag(kVar);
        } else {
            kVar = (k) view.getTag();
        }
        if (getCount() > 0) {
            kVar.a(this.f70299d.get(i2), i2);
        }
        return view;
    }

    public g(Context context, LayoutInflater layoutInflater, int i2, int i3) {
        super(context, layoutInflater);
        this.f70300e = i2;
        this.f70301f = i3;
    }
}
