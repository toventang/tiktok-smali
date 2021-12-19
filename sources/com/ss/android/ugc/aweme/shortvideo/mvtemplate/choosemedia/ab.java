package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import h.f.b.l;
import java.util.List;

public final class ab extends j.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<MvImageChooseAdapter.MyMediaModel> f128894a;

    /* renamed from: b  reason: collision with root package name */
    private final List<MvImageChooseAdapter.MyMediaModel> f128895b;

    static {
        Covode.recordClassIndex(84583);
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int a() {
        return this.f128894a.size();
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int b() {
        return this.f128895b.size();
    }

    @Override // androidx.recyclerview.widget.j.a
    public final Object a(int i2, int i3) {
        return bo.f129075a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public ab(List<? extends MvImageChooseAdapter.MyMediaModel> list, List<? extends MvImageChooseAdapter.MyMediaModel> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.f128894a = list;
        this.f128895b = list2;
    }

    @Override // androidx.recyclerview.widget.j.a
    public final boolean b(int i2, int i3) {
        return l.a((Object) this.f128894a.get(i2).f109389a, (Object) this.f128895b.get(i3).f109389a);
    }

    @Override // androidx.recyclerview.widget.j.a
    public final boolean c(int i2, int i3) {
        if (this.f128894a.get(i2) == this.f128895b.get(i3)) {
            return true;
        }
        return false;
    }
}
