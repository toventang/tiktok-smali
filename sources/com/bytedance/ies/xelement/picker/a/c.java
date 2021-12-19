package com.bytedance.ies.xelement.picker.a;

import com.bytedance.covode.number.Covode;

public final class c implements d<Integer> {

    /* renamed from: a  reason: collision with root package name */
    private int f37242a;

    /* renamed from: b  reason: collision with root package name */
    private int f37243b;

    /* renamed from: c  reason: collision with root package name */
    private int f37244c = 24;

    static {
        Covode.recordClassIndex(22396);
    }

    @Override // com.bytedance.ies.xelement.picker.a.d
    public final int a() {
        return (this.f37243b - this.f37242a) + 1;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.ies.xelement.picker.a.d
    public final /* synthetic */ Integer a(int i2) {
        if (i2 < 0 || i2 >= a()) {
            return 0;
        }
        return Integer.valueOf((this.f37242a + i2) % this.f37244c);
    }

    public c(int i2, int i3) {
        this.f37242a = i2;
        if (i3 > i2) {
            this.f37243b = i3;
        } else {
            this.f37243b = i3 + 24;
        }
    }
}
