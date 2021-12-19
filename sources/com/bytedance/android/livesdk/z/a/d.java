package com.bytedance.android.livesdk.z.a;

import com.bytedance.android.livesdk.z.b.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f22928a;

    static {
        Covode.recordClassIndex(13547);
    }

    d(a aVar) {
        this.f22928a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        a aVar = this.f22928a;
        long j2 = ((a) obj).f22930a;
        if (j2 > 0) {
            int i2 = (int) (j2 / 1000);
            int i3 = i2 / 60;
            int i4 = i2 % 60;
            String valueOf = i3 >= 10 ? String.valueOf(i3) : "0".concat(String.valueOf(i3));
            String valueOf2 = i4 >= 10 ? String.valueOf(i4) : "0".concat(String.valueOf(i4));
            aVar.f22921a.setText(valueOf);
            aVar.f22922b.setText(valueOf2);
        }
    }
}
