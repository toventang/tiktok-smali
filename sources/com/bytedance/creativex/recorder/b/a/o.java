package com.bytedance.creativex.recorder.b.a;

import com.bytedance.covode.number.Covode;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final int f28198a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28199b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f28200c;

    static {
        Covode.recordClassIndex(16530);
    }

    public o(int i2) {
        this(i2, 0, 6);
    }

    public final String toString() {
        return "StartRecordingCommandEvent{recordType=" + this.f28198a + '}';
    }

    private o(int i2, int i3) {
        this.f28198a = i2;
        this.f28199b = i3;
        this.f28200c = false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i2, int i3, int i4) {
        this(i2, (i4 & 2) != 0 ? 0 : i3);
    }
}
