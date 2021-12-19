package com.bytedance.android.live.wallet;

import android.app.Activity;
import com.bytedance.android.live.base.a;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.g;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.android.livesdk.wallet.c;
import com.bytedance.covode.number.Covode;
import f.a.t;
import java.util.List;

public interface d extends a {
    static {
        Covode.recordClassIndex(7279);
    }

    t<Long> a();

    t<com.bytedance.android.live.network.response.a<c, DiamondPackageExtra>> a(String str, long j2, long j3, long j4);

    void a(long j2);

    void a(g gVar);

    void a(com.bytedance.android.live.wallet.model.c cVar, com.bytedance.android.livesdkapi.depend.d.b.a aVar);

    void a(c cVar, Activity activity);

    void a(com.bytedance.android.livesdkapi.depend.d.b.c cVar);

    void a(String str);

    void a(List<String> list);

    long b();

    void b(g gVar);

    boolean b(long j2);

    String c(long j2);

    void c();

    String d(long j2);

    void d();

    BalanceStruct e();

    void e(long j2);

    g f();

    boolean g();

    void h();
}
