package com.ss.android.ugc.aweme.prop.a;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.l;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.f.a;
import java.util.List;

public final class a<T extends com.ss.android.ugc.aweme.base.f.a> extends l {

    /* renamed from: a  reason: collision with root package name */
    private List<T> f118203a;

    static {
        Covode.recordClassIndex(76761);
    }

    @Override // androidx.fragment.app.l
    public final long b(int i2) {
        return (long) i2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f118203a.size();
    }

    @Override // androidx.fragment.app.l
    public final Fragment a(int i2) {
        return this.f118203a.get(i2);
    }

    public a(i iVar, List<T> list) {
        super(iVar);
        this.f118203a = list;
    }
}
