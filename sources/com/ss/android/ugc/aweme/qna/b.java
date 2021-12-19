package com.ss.android.ugc.aweme.qna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.qna.fragment.a;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class b extends m {

    /* renamed from: a  reason: collision with root package name */
    public int f119264a = -1;

    /* renamed from: b  reason: collision with root package name */
    public final Context f119265b;

    /* renamed from: c  reason: collision with root package name */
    private final List<a> f119266c = new ArrayList();

    static {
        Covode.recordClassIndex(77465);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f119266c.size();
    }

    @Override // androidx.fragment.app.m
    public final Fragment a(int i2) {
        return b(i2);
    }

    public final void a(a aVar) {
        l.d(aVar, "");
        this.f119266c.add(aVar);
        notifyDataSetChanged();
    }

    public final a b(int i2) {
        return this.f119266c.get(i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i2) {
        String string = this.f119265b.getString(b(i2).c(), "0");
        l.b(string, "");
        return string;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, i iVar) {
        super(iVar);
        l.d(context, "");
        l.d(iVar, "");
        this.f119265b = context;
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.m
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        l.d(viewGroup, "");
        l.d(obj, "");
        super.destroyItem(viewGroup, i2, obj);
        this.f119266c.remove(i2);
        notifyDataSetChanged();
    }
}
