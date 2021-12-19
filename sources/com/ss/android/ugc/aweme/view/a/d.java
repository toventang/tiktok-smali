package com.ss.android.ugc.aweme.view.a;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.model.u;
import com.ss.android.ugc.aweme.view.b.a;
import h.f.b.l;
import java.util.List;

public final class d extends m {

    /* renamed from: a  reason: collision with root package name */
    public Context f144059a;

    /* renamed from: b  reason: collision with root package name */
    public i f144060b;

    /* renamed from: c  reason: collision with root package name */
    public List<? extends u> f144061c;

    static {
        Covode.recordClassIndex(94277);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f144061c.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i2) {
        return ((u) this.f144061c.get(i2)).b();
    }

    @Override // androidx.fragment.app.m
    public final Fragment a(int i2) {
        u uVar = (u) this.f144061c.get(i2);
        l.d(uVar, "");
        a aVar = new a();
        aVar.f144107a = uVar;
        return aVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.m
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        l.d(viewGroup, "");
        l.d(obj, "");
        super.destroyItem(viewGroup, i2, obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, i iVar, List<? extends u> list) {
        super(iVar);
        l.d(context, "");
        l.d(iVar, "");
        l.d(list, "");
        this.f144059a = context;
        this.f144060b = iVar;
        this.f144061c = list;
    }
}
