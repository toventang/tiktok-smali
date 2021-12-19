package com.ss.android.ugc.aweme.social.widget.card.a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final a f133746a;

    /* renamed from: b  reason: collision with root package name */
    public final int f133747b;

    /* renamed from: c  reason: collision with root package name */
    public final int f133748c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakReference<RecyclerView> f133749d;

    static {
        Covode.recordClassIndex(87495);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f133746a, hVar.f133746a) && this.f133747b == hVar.f133747b && this.f133748c == hVar.f133748c && l.a(this.f133749d, hVar.f133749d);
    }

    public final int hashCode() {
        a aVar = this.f133746a;
        int i2 = 0;
        int hashCode = (((((aVar != null ? aVar.hashCode() : 0) * 31) + this.f133747b) * 31) + this.f133748c) * 31;
        WeakReference<RecyclerView> weakReference = this.f133749d;
        if (weakReference != null) {
            i2 = weakReference.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "RecUserGroupConfig(variant=" + this.f133746a + ", step=" + this.f133747b + ", maxCount=" + this.f133748c + ", attachRecyclerViewRef=" + this.f133749d + ")";
    }

    private /* synthetic */ h() {
        this(a.RECTANGLE, 20, Integer.MAX_VALUE, null);
    }

    public h(a aVar, int i2, int i3, WeakReference<RecyclerView> weakReference) {
        l.d(aVar, "");
        this.f133746a = aVar;
        this.f133747b = i2;
        this.f133748c = i3;
        this.f133749d = weakReference;
    }
}
