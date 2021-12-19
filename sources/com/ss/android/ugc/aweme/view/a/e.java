package com.ss.android.ugc.aweme.view.a;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.model.d;
import com.ss.android.ugc.aweme.model.l;
import com.ss.android.ugc.aweme.view.b.b;
import java.util.ArrayList;
import java.util.List;

public final class e extends m {

    /* renamed from: a  reason: collision with root package name */
    public Context f144062a;

    /* renamed from: b  reason: collision with root package name */
    public i f144063b;

    /* renamed from: c  reason: collision with root package name */
    public d f144064c;

    /* renamed from: d  reason: collision with root package name */
    private final List<l> f144065d = new ArrayList(this.f144064c.f().values());

    static {
        Covode.recordClassIndex(94278);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f144064c.f().size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i2) {
        return this.f144065d.get(i2).f110790c;
    }

    @Override // androidx.fragment.app.m
    public final Fragment a(int i2) {
        l lVar = this.f144065d.get(i2);
        d dVar = this.f144064c;
        h.f.b.l.d(lVar, "");
        h.f.b.l.d(dVar, "");
        b bVar = new b();
        bVar.f144110a = dVar;
        bVar.f144111b = lVar;
        return bVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.m
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        h.f.b.l.d(viewGroup, "");
        h.f.b.l.d(obj, "");
        super.destroyItem(viewGroup, i2, obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Context context, i iVar, d dVar) {
        super(iVar);
        h.f.b.l.d(context, "");
        h.f.b.l.d(iVar, "");
        h.f.b.l.d(dVar, "");
        this.f144062a = context;
        this.f144063b = iVar;
        this.f144064c = dVar;
    }
}
