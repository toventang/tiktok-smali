package com.bytedance.sdk.a.f;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.e;
import com.bytedance.sdk.a.a.c;
import com.bytedance.sdk.a.d.a;
import com.bytedance.sdk.a.m.d;
import com.ss.android.account.g;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class f implements com.bytedance.sdk.a.a.f {

    /* renamed from: a  reason: collision with root package name */
    Context f43201a;

    static {
        Covode.recordClassIndex(26492);
    }

    public f(Context context) {
        this.f43201a = context;
    }

    @Override // com.bytedance.sdk.a.a.f
    public final void a(String str, g gVar) {
        Context context = this.f43201a;
        a.C1046a a2 = b.a(str, null, null, null, null, null);
        a2.f43153a = c.b.a("/2/user/info/");
        new com.bytedance.sdk.a.m.g(context, a2.b(), gVar).d();
    }

    @Override // com.bytedance.sdk.a.a.f
    public final void b(String str, String str2, String str3, long j2, Map map, com.bytedance.sdk.a.a.a.a<e> aVar) {
        com.bytedance.sdk.a.l.a.a(6, str2);
        Context context = this.f43201a;
        a.C1046a a2 = b.a(str2, str3, String.valueOf(j2), null, str, map);
        a2.f43153a = c.b.a("/passport/auth/login/");
        new d(context, a2.a().c(), aVar).d();
    }

    @Override // com.bytedance.sdk.a.a.f
    public final void c(String str, String str2, String str3, long j2, Map map, com.bytedance.sdk.a.a.a.a<e> aVar) {
        com.bytedance.sdk.a.l.a.a(6, str2);
        Context context = this.f43201a;
        a.C1046a a2 = b.a(str2, null, String.valueOf(j2), str3, str, map);
        a2.f43153a = c.b.a("/passport/auth/login_only/");
        new com.bytedance.sdk.a.m.e(context, a2.c(), aVar).d();
    }

    @Override // com.bytedance.sdk.a.a.f
    public final void d(String str, String str2, String str3, long j2, Map map, com.bytedance.sdk.a.a.a.a<e> aVar) {
        com.bytedance.sdk.a.l.a.a(6, str2);
        Context context = this.f43201a;
        a.C1046a a2 = b.a(str2, str3, String.valueOf(j2), null, str, map);
        a2.f43153a = c.b.a("/passport/auth/login_only/");
        new com.bytedance.sdk.a.m.e(context, a2.c(), aVar).d();
    }

    @Override // com.bytedance.sdk.a.a.f
    public final void a(String str, String str2, String str3, long j2, Map map, com.bytedance.sdk.a.a.a.a<e> aVar) {
        com.bytedance.sdk.a.l.a.a(6, str2);
        Context context = this.f43201a;
        a.C1046a a2 = b.a(str2, null, String.valueOf(j2), str3, str, map);
        a2.f43153a = c.b.a("/passport/auth/login/");
        new d(context, a2.a().c(), aVar).d();
    }

    @Override // com.bytedance.sdk.a.a.f
    public final void a(String str, String str2, String str3, long j2, Map map, g gVar) {
        Context context = this.f43201a;
        a.C1046a a2 = b.a(str2, str3, String.valueOf(j2), null, str, map);
        a2.f43153a = c.b.a("/passport/auth/bind/");
        new com.bytedance.sdk.a.m.c(context, a2.c(), gVar).d();
    }
}
