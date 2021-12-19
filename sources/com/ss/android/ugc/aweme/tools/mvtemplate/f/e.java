package com.ss.android.ugc.aweme.tools.mvtemplate.f;

import androidx.fragment.app.i;
import androidx.fragment.app.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.tools.utils.k;
import java.util.ArrayList;
import java.util.List;

public final class e extends m {

    /* renamed from: a  reason: collision with root package name */
    public f f140848a;

    /* renamed from: b  reason: collision with root package name */
    private List<b> f140849b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private List<MvThemeData> f140850c = new ArrayList();

    static {
        Covode.recordClassIndex(91966);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f140850c.size();
    }

    public final void b(List<MvThemeData> list) {
        if (!k.a(list)) {
            this.f140850c.addAll(list);
            notifyDataSetChanged();
        }
    }

    public e(i iVar) {
        super(iVar);
    }

    public final void a(List<MvThemeData> list) {
        if (!k.a(list)) {
            this.f140850c.clear();
            this.f140850c.addAll(list);
            notifyDataSetChanged();
        }
    }

    public final MvThemeData c(int i2) {
        if (!k.a(this.f140850c) && i2 >= 0 && i2 < this.f140850c.size()) {
            return this.f140850c.get(i2);
        }
        return null;
    }

    /* renamed from: b */
    public final b a(int i2) {
        if (i2 < this.f140849b.size()) {
            return this.f140849b.get(i2);
        }
        b a2 = b.a(this.f140850c.get(i2), i2, this.f140848a);
        this.f140849b.add(a2);
        return a2;
    }
}
