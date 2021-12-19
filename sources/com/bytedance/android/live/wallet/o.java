package com.bytedance.android.live.wallet;

import android.os.SystemClock;
import com.bytedance.android.live.a.a.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.util.HashMap;

/* access modifiers changed from: package-private */
public final /* synthetic */ class o implements f {

    /* renamed from: a  reason: collision with root package name */
    private final long f13238a;

    static {
        Covode.recordClassIndex(7341);
    }

    o(long j2) {
        this.f13238a = j2;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        long j2 = this.f13238a;
        Throwable th = (Throwable) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", th.getMessage());
        hashMap.put("error_code", Integer.valueOf(th instanceof a ? ((a) th).getErrorCode() : -16));
        com.bytedance.android.livesdk.wallet.b.a.a(SystemClock.uptimeMillis() - j2, hashMap);
        com.bytedance.android.livesdk.wallet.b.a.a(1, SystemClock.uptimeMillis() - j2, hashMap);
    }
}
