package com.bytedance.ies.xelement.picker.a;

import com.bytedance.covode.number.Covode;

public final class b implements d<Integer> {

    /* renamed from: a  reason: collision with root package name */
    private int f37240a;

    /* renamed from: b  reason: collision with root package name */
    private int f37241b;

    static {
        Covode.recordClassIndex(22395);
    }

    @Override // com.bytedance.ies.xelement.picker.a.d
    public final int a() {
        return (this.f37241b - this.f37240a) + 1;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.ies.xelement.picker.a.d
    public final /* synthetic */ Integer a(int i2) {
        if (i2 < 0 || i2 >= a()) {
            return 0;
        }
        return Integer.valueOf(this.f37240a + i2);
    }

    public b(int i2, int i3) {
        this.f37240a = i2;
        this.f37241b = i3;
    }
}
