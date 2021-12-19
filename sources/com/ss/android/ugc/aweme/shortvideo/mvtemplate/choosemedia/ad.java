package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public final List<MvImageChooseAdapter.MyMediaModel> f128899a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f128900b;

    static {
        Covode.recordClassIndex(84588);
    }

    public final String toString() {
        return "MediaRefreshData(mediaModelList=" + this.f128899a + ", allRefresh=" + this.f128900b + ")";
    }

    public /* synthetic */ ad() {
        this(new ArrayList(), true);
    }

    public final int hashCode() {
        int i2;
        int hashCode = this.f128899a.hashCode() * 31;
        if (this.f128900b) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return hashCode + i2;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!l.a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaRefreshData");
        ad adVar = (ad) obj;
        if (this.f128900b != adVar.f128900b || this.f128899a.size() != adVar.f128899a.size()) {
            return false;
        }
        Iterator<T> it = this.f128899a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (adVar.f128899a.get(i2) != it.next()) {
                return false;
            }
            i2++;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public ad(List<? extends MvImageChooseAdapter.MyMediaModel> list, boolean z) {
        l.d(list, "");
        this.f128899a = list;
        this.f128900b = z;
    }
}
