package com.bytedance.sdk.a.f;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.a;
import com.bytedance.sdk.a.a.c;
import com.bytedance.sdk.a.a.d.d;
import com.bytedance.sdk.a.a.g;
import com.bytedance.sdk.a.d.a;
import java.util.Map;

public final class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private Context f43216a;

    static {
        Covode.recordClassIndex(26499);
    }

    public i(Context context) {
        this.f43216a = context;
    }

    @Override // com.bytedance.sdk.a.a.g
    public final void a(String str, Map<String, String> map, a<d> aVar) {
        Context context = this.f43216a;
        String a2 = c.a.a(str);
        a.C1046a aVar2 = new a.C1046a();
        aVar2.f43153a = a2;
        new com.bytedance.sdk.a.g.d(context, aVar2.a(map).c(), aVar).d();
    }
}
