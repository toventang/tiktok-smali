package com.ss.android.ugc.aweme.kids.choosemusic.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.f.a;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class g extends a {

    /* renamed from: d  reason: collision with root package name */
    protected List<Banner> f105469d;

    /* renamed from: e  reason: collision with root package name */
    private int f105470e;

    static {
        Covode.recordClassIndex(67583);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List<Banner> list = this.f105469d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final void a(List<Banner> list) {
        if (this.f105469d != list) {
            this.f105469d = list;
            notifyDataSetChanged();
        }
    }

    public g(Context context, LayoutInflater layoutInflater, int i2) {
        super(context, layoutInflater);
        this.f105470e = i2;
    }

    @Override // com.bytedance.ies.uikit.f.a
    public final View a(int i2, View view, ViewGroup viewGroup) {
        com.ss.android.ugc.aweme.kids.choosemusic.i.g gVar;
        if (view == null) {
            view = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aa3, viewGroup, false);
            gVar = new com.ss.android.ugc.aweme.kids.choosemusic.i.g(view, this.f105470e);
            view.setTag(gVar);
        } else {
            gVar = (com.ss.android.ugc.aweme.kids.choosemusic.i.g) view.getTag();
        }
        if (getCount() > 0) {
            gVar.a(this.f105469d.get(i2), i2);
        }
        return view;
    }
}
