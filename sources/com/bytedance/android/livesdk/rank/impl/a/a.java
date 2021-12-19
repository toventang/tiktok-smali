package com.bytedance.android.livesdk.rank.impl.a;

import androidx.recyclerview.widget.j;
import com.bytedance.android.livesdk.rank.api.model.e;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class a extends j.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<?> f20629a;

    /* renamed from: b  reason: collision with root package name */
    private final List<?> f20630b;

    static {
        Covode.recordClassIndex(12184);
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int a() {
        List<?> list = this.f20629a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int b() {
        List<?> list = this.f20630b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public a(List<?> list, List<?> list2) {
        this.f20629a = list;
        this.f20630b = list2;
    }

    @Override // androidx.recyclerview.widget.j.a
    public final boolean b(int i2, int i3) {
        if ((this.f20629a.get(i2) instanceof e) && (this.f20630b.get(i3) instanceof e)) {
            return ((e) this.f20629a.get(i2)).a(this.f20630b.get(i3));
        }
        if (this.f20629a.get(i2) == this.f20630b.get(i3)) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.j.a
    public final boolean c(int i2, int i3) {
        if (!(this.f20629a.get(i2) instanceof e) || !(this.f20630b.get(i3) instanceof e)) {
            return false;
        }
        return ((e) this.f20629a.get(i2)).b(this.f20630b.get(i3));
    }
}
