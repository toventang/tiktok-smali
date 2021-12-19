package com.bytedance.android.livesdk.at;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.b;
import com.bytedance.android.livesdk.event.n;
import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.bytedance.android.livesdkapi.model.e;
import com.bytedance.covode.number.Covode;
import f.a.ab;
import f.a.h;
import f.a.t;
import java.util.HashMap;
import java.util.List;

public interface f {
    static {
        Covode.recordClassIndex(7838);
    }

    b a();

    ab<User> a(HashMap<String, String> hashMap);

    t<b> a(Context context, j jVar);

    t<a> a(d dVar);

    t<a> a(e eVar);

    t<a> a(k kVar);

    String a(long j2);

    void a(int i2);

    void a(b bVar);

    void a(a aVar);

    void a(String str, DialogInterface.OnClickListener onClickListener, Context context, String str2, String str3, long j2);

    boolean a(h hVar);

    User b();

    ab<User> b(long j2);

    long c();

    t<b> c(long j2);

    t<a> d(long j2);

    boolean d();

    boolean e();

    void f();

    List<e> g();

    h<n> h();

    ab<b> i();

    t<b> j();

    t<a> k();
}
