package com.bytedance.android.livesdk.feed.banner.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.uikit.d.a;
import com.bytedance.android.livesdk.feed.p;
import com.bytedance.android.livesdk.model.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public List<n> f17298a = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public String f17299e;

    /* renamed from: f  reason: collision with root package name */
    private p f17300f;

    static {
        Covode.recordClassIndex(9595);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List<n> list = this.f17298a;
        if (list == null) {
            return 0;
        }
        if (list.size() > 1) {
            return Integer.MAX_VALUE;
        }
        return this.f17298a.size();
    }

    public final void a(List<n> list) {
        this.f17298a.clear();
        if (list != null) {
            this.f17298a.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter, com.bytedance.android.live.uikit.d.a
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        MethodCollector.i(2405);
        if (obj == null) {
            MethodCollector.o(2405);
            return;
        }
        View view = (View) obj;
        viewGroup.removeView(view);
        if (this.f12900b.size() < this.f17298a.size()) {
            this.f12900b.add(view);
        }
        MethodCollector.o(2405);
    }

    @Override // com.bytedance.android.live.uikit.d.a
    public final View a(int i2, View view, ViewGroup viewGroup) {
        a aVar;
        View view2 = view;
        if (view2 == null) {
            view2 = com.a.a(this.f12901c, R.layout.b_d, viewGroup, false);
            aVar = new a(view2, viewGroup.getContext(), this.f17299e, this.f17300f, i2 % this.f17298a.size());
            view2.setTag(aVar);
        } else {
            aVar = (a) view2.getTag();
        }
        List<n> list = this.f17298a;
        if (list != null && !list.isEmpty()) {
            List<n> list2 = this.f17298a;
            n nVar = list2.get(i2 % list2.size());
            aVar.f17293e = nVar;
            if (nVar != null) {
                aVar.f17291c.setVisibility(8);
                String str = nVar.f19727h;
                if (!(nVar.a() == null || nVar.a().getUrls() == null || nVar.a().getUrls().size() <= 0)) {
                    aVar.f17289a.setImageURI(nVar.a().getUrls().get(0));
                }
                if (TextUtils.isEmpty(str)) {
                    aVar.f17290b.setVisibility(8);
                } else {
                    aVar.f17290b.setVisibility(0);
                    aVar.f17290b.setText(str);
                }
            }
        }
        return view2;
    }

    public c(Context context, LayoutInflater layoutInflater, String str, p pVar) {
        super(context, layoutInflater);
        this.f17299e = str;
        this.f17300f = pVar;
    }
}
