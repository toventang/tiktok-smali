package com.bytedance.sdk.a.f;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.a;
import com.bytedance.sdk.a.a.b.h;
import com.bytedance.sdk.a.a.c;
import com.bytedance.sdk.a.a.e;
import com.bytedance.sdk.a.d.a;
import com.bytedance.sdk.a.g.j;
import com.bytedance.sdk.a.h.a.k;
import com.bytedance.sdk.a.h.a.p;
import com.bytedance.sdk.a.h.b.a.b;
import com.bytedance.sdk.a.h.b.a.i;
import com.bytedance.sdk.a.h.b.a.l;
import com.bytedance.sdk.a.h.b.a.n;
import com.bytedance.sdk.a.h.b.a.o;
import com.bytedance.sdk.a.h.b.d;
import com.bytedance.sdk.a.h.b.f;
import com.bytedance.sdk.a.h.b.g;
import com.bytedance.sdk.a.h.b.l;
import com.bytedance.sdk.a.h.b.o;
import com.kakao.usermgmt.StringSet;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class c implements e {

    /* renamed from: a  reason: collision with root package name */
    Context f43182a;

    static {
        Covode.recordClassIndex(26483);
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, Map map, a<com.bytedance.sdk.a.a.a.c> aVar) {
        Context context = this.f43182a;
        a.C1046a aVar2 = new a.C1046a();
        aVar2.f43153a = c.b.a("/passport/user/logout/");
        new com.bytedance.sdk.a.a(context, aVar2.a("logout_from", str).a(map).c(), str, aVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, String str2, String str3, String str4, Map<String, String> map, com.bytedance.sdk.a.h.b.a.e eVar) {
        com.bytedance.sdk.a.l.a.a(4, str2);
        Context context = this.f43182a;
        com.bytedance.sdk.a.h.a.e eVar2 = new com.bytedance.sdk.a.h.a.e(str, str2, str3, str4);
        a.C1046a aVar = new a.C1046a();
        aVar.f43153a = c.a.a("/passport/email/register/v2/");
        HashMap hashMap = new HashMap();
        hashMap.put("email", m.c(eVar2.f43261a));
        if (!TextUtils.isEmpty(eVar2.f43263c)) {
            hashMap.put("code", m.c(eVar2.f43263c));
        }
        hashMap.put("password", m.c(eVar2.f43262b));
        if (!TextUtils.isEmpty(eVar2.f43264d)) {
            hashMap.put("recaptcha_token", eVar2.f43264d);
        }
        hashMap.put("mix_mode", "1");
        hashMap.put("fixed_mix_mode", "1");
        new d(context, aVar.a(hashMap, map).c(), eVar2, eVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, String str2, Map<String, String> map, i iVar) {
        com.bytedance.sdk.a.l.a.a(2, str);
        Context context = this.f43182a;
        k kVar = new k(str, str2);
        a.C1046a aVar = new a.C1046a();
        aVar.f43153a = c.a.a("/passport/mobile/sms_login_continue/");
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", m.c(kVar.f43288a));
        hashMap.put("sms_code_key", m.c(String.valueOf(kVar.f43289b)));
        if (kVar.f43290c > 0) {
            hashMap.put("vcd_auth", String.valueOf(kVar.f43290c));
        }
        hashMap.put("mix_mode", "1");
        new g(context, aVar.a(hashMap, map).c(), kVar, iVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, String str2, int i2, Map map, com.bytedance.sdk.a.a.b.a aVar) {
        Context context = this.f43182a;
        a.C1046a aVar2 = new a.C1046a();
        aVar2.f43153a = c.a.a("/passport/mobile/check_code/");
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", m.c(str));
        hashMap.put("code", m.c(str2));
        hashMap.put(StringSet.type, m.c(String.valueOf(i2)));
        hashMap.put("mix_mode", "1");
        hashMap.put("fixed_mix_mode", "1");
        new com.bytedance.sdk.a.g.a(context, aVar2.a(hashMap, map).c(), aVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, String str2, Map<String, String> map, h hVar) {
        Context context = this.f43182a;
        a.C1046a aVar = new a.C1046a();
        aVar.f43153a = c.a.a("/passport/password/reset_by_ticket/");
        HashMap hashMap = new HashMap();
        hashMap.put("password", m.c(str));
        hashMap.put("ticket", m.c(str2));
        hashMap.put("mix_mode", "1");
        hashMap.putAll(map);
        new com.bytedance.sdk.a.g.k(context, aVar.a(hashMap).c(), "mobile", hVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, String str2, int i2, Map map, com.bytedance.sdk.a.h.b.a.g gVar) {
        f.a(this.f43182a, str, str2, i2, map, gVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, String str2, int i2, int i3, Map<String, String> map, com.bytedance.sdk.a.h.b.a.g gVar) {
        Context context = this.f43182a;
        map.put("email_logic_type", String.valueOf(i3));
        f.a(context, str, str2, i2, map, gVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, String str2, Map map, com.bytedance.sdk.a.h.b.a.f fVar) {
        com.bytedance.sdk.a.l.a.a(4, str);
        Context context = this.f43182a;
        com.bytedance.sdk.a.h.a.f fVar2 = new com.bytedance.sdk.a.h.a.f(str, str2, 1, map, null);
        a.C1046a aVar = new a.C1046a();
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(fVar2.f43266a)) {
            hashMap.put("email", m.c(fVar2.f43266a));
        }
        hashMap.put(StringSet.type, m.c(String.valueOf(fVar2.f43268c)));
        if (!TextUtils.isEmpty(fVar2.f43267b)) {
            hashMap.put("code", fVar2.f43267b);
        }
        hashMap.put("mix_mode", "1");
        a.C1046a a2 = aVar.a(hashMap, fVar2.f43269d);
        a2.f43153a = com.bytedance.sdk.a.o.i.a(c.a.a("/passport/email/register_verify_login/"), null);
        new com.bytedance.sdk.a.h.b.e(context, a2.c(), fVar2, fVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, String str2, int i2, int i3, Map<String, String> map, com.bytedance.sdk.a.c<com.bytedance.sdk.a.a.d.e> cVar) {
        Context context = this.f43182a;
        a.C1046a aVar = new a.C1046a();
        aVar.f43153a = c.a.a("/passport/app/email/register/code_verify/");
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("email", m.c(str));
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("code", m.c(str2));
        }
        hashMap.put(StringSet.type, m.c(String.valueOf(i2)));
        hashMap.put("email_logic_type", String.valueOf(i3));
        hashMap.put("mix_mode", "1");
        hashMap.put("fixed_mix_mode", "1");
        new com.bytedance.sdk.a.g.e(context, aVar.a(hashMap, map).c(), cVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, Map map, String str2, com.bytedance.sdk.a.h.b.a.d dVar) {
        Context context = this.f43182a;
        com.bytedance.sdk.a.h.a.d dVar2 = new com.bytedance.sdk.a.h.a.d(str, map, str2);
        a.C1046a aVar = new a.C1046a();
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(dVar2.f43257a)) {
            hashMap.put("email", m.c(dVar2.f43257a));
        }
        hashMap.put("mix_mode", "1");
        a.C1046a a2 = aVar.a(hashMap, dVar2.f43258b);
        a2.f43153a = com.bytedance.sdk.a.o.i.a(c.a.a("/passport/user/check_email_registered"), str2);
        new com.bytedance.sdk.a.h.b.c(context, a2.c(), dVar2, dVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, String str2, String str3, String str4, Map map, b bVar) {
        Context context = this.f43182a;
        com.bytedance.sdk.a.h.a.b bVar2 = new com.bytedance.sdk.a.h.a.b(str, str2, str3, str4, map);
        a.C1046a aVar = new a.C1046a();
        aVar.f43153a = c.a.a("/passport/mobile/change/v1/");
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", m.c(bVar2.f43248a));
        if (!TextUtils.isEmpty(bVar2.f43249b)) {
            hashMap.put("captcha", bVar2.f43249b);
        }
        hashMap.put("code", m.c(bVar2.f43250c));
        hashMap.put("mix_mode", "1");
        if (!TextUtils.isEmpty(bVar2.f43251d)) {
            hashMap.put("ticket", bVar2.f43251d);
        }
        new com.bytedance.sdk.a.h.b.b(context, aVar.a(hashMap, bVar2.f43252e).c(), bVar2, bVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, String str2, String str3, com.bytedance.sdk.a.h.b.a.a aVar) {
        Context context = this.f43182a;
        com.bytedance.sdk.a.h.a.a aVar2 = new com.bytedance.sdk.a.h.a.a(str, str2, null, str3, 0);
        a.C1046a aVar3 = new a.C1046a();
        aVar3.f43153a = c.a.a("/passport/mobile/bind/v1/");
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(aVar2.f43243c)) {
            hashMap.put("captcha", aVar2.f43243c);
        }
        hashMap.put("code", m.c(aVar2.f43242b));
        hashMap.put("mobile", m.c(aVar2.f43241a));
        hashMap.put("password", m.c(aVar2.f43244d));
        hashMap.put("unbind_exist", m.c(String.valueOf(aVar2.f43245e)));
        if (!TextUtils.isEmpty(aVar2.f43246f)) {
            hashMap.put("not_login_ticket", aVar2.f43246f);
        }
        hashMap.put("mix_mode", "1");
        new com.bytedance.sdk.a.h.b.a(context, aVar3.a(hashMap).c(), aVar2, aVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, String str2, String str3, n nVar) {
        com.bytedance.sdk.a.l.a.a(5, str);
        com.bytedance.sdk.a.h.b.m.a(this.f43182a, null, null, str, str2, str3, nVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, String str2, Map<String, String> map, o oVar) {
        com.bytedance.sdk.a.l.a.a(5, str);
        Context context = this.f43182a;
        p pVar = new p(str, str2);
        a.C1046a aVar = new a.C1046a();
        aVar.f43153a = c.a.a("/passport/username/register/");
        HashMap hashMap = new HashMap();
        hashMap.put("username", m.c(pVar.f43316a));
        hashMap.put("password", m.c(pVar.f43317b));
        hashMap.put("mix_mode", "1");
        new com.bytedance.sdk.a.h.b.n(context, aVar.a(hashMap, map).c(), pVar, oVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, String str2, int i2, Map<String, String> map, l lVar) {
        Context context = this.f43182a;
        com.bytedance.sdk.a.h.a.n nVar = new com.bytedance.sdk.a.h.a.n(str, str2, i2);
        a.C1046a aVar = new a.C1046a();
        aVar.f43153a = c.a.a("/passport/mobile/send_voice_code/");
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", m.c(nVar.f43302a));
        if (!TextUtils.isEmpty(nVar.f43308g)) {
            hashMap.put("old_mobile", m.c(nVar.f43308g));
        }
        hashMap.put("captcha", nVar.f43303b);
        hashMap.put(StringSet.type, m.c(String.valueOf(nVar.f43306e)));
        hashMap.put("unbind_exist", m.c(String.valueOf(nVar.f43307f)));
        hashMap.put("mix_mode", "1");
        new com.bytedance.sdk.a.h.b.k(context, aVar.a(hashMap, map).c(), nVar, lVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, Map<String, String> map, com.bytedance.sdk.a.h.b.a.m mVar) {
        Context context = this.f43182a;
        l.a aVar = new l.a(str, null);
        a.C1046a aVar2 = new a.C1046a();
        aVar2.f43153a = c.a.a("/passport/password/set/");
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(aVar.f43334b)) {
            hashMap.put("captcha", aVar.f43334b);
        }
        hashMap.put("password", m.c(aVar.f43333a));
        hashMap.put("mix_mode", "1");
        hashMap.putAll(map);
        new com.bytedance.sdk.a.h.b.l(context, aVar2.a(hashMap).c(), aVar, mVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, Map<String, String> map, com.bytedance.sdk.a.a.b.g gVar) {
        Context context = this.f43182a;
        a.C1046a aVar = new a.C1046a();
        aVar.f43153a = c.a.a("/passport/account/switch/");
        new j(context, aVar.a("to_user_id", str).a(map).c(), gVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, Map<String, String> map, com.bytedance.sdk.a.a.b.b bVar) {
        Context context = this.f43182a;
        a.C1046a aVar = new a.C1046a();
        aVar.f43153a = c.a.a("/passport/password/check/");
        HashMap hashMap = new HashMap();
        hashMap.put("password", m.c(str));
        hashMap.put("mix_mode", "1");
        new com.bytedance.sdk.a.g.b(context, aVar.a(hashMap, map).c(), bVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, String str2, Map<String, String> map, com.bytedance.sdk.a.a.b.i iVar) {
        Context context = this.f43182a;
        a.C1046a aVar = new a.C1046a();
        aVar.f43153a = c.a.a("/passport/password/update/");
        HashMap hashMap = new HashMap();
        hashMap.put("current_password", m.c(str));
        hashMap.put("password", m.c(str2));
        hashMap.put("mix_mode", "1");
        new com.bytedance.sdk.a.g.l(context, aVar.a(hashMap, map).c(), iVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, String str2, com.bytedance.sdk.a.a.b.c cVar) {
        Context context = this.f43182a;
        a.C1046a a2 = new a.C1046a().a("token", str).a("service", str2);
        a2.f43153a = c.a.a("/passport/mobile/check_qrconnect/");
        new com.bytedance.sdk.a.g.c(context, a2.b(), cVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, boolean z, String str2, Integer num, Long l2, String str3, Map<String, String> map, com.bytedance.sdk.a.h.b.a.k kVar) {
        com.bytedance.sdk.a.l.a.a(7, null);
        Context context = this.f43182a;
        a.C1046a aVar = new a.C1046a();
        aVar.f43153a = c.a.a("/passport/device/one_login/");
        HashMap hashMap = new HashMap();
        hashMap.put("encrypted", z ? "1" : "0");
        hashMap.put("mix_mode", "1");
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                hashMap.put("sec_user_id", str);
            } else {
                hashMap.put("user_id", str);
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("d_ticket", m.c(str2));
        }
        if (num != null) {
            hashMap.put("last_login_way", String.valueOf(num));
        }
        if (l2 != null) {
            hashMap.put("last_login_time", String.valueOf(l2));
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("last_login_platform", str3);
        }
        new com.bytedance.sdk.a.h.b.i(context, aVar.a(hashMap, map).b(), kVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, String str2, String str3, com.bytedance.sdk.a.h.b.a.j jVar) {
        com.bytedance.sdk.a.l.a.a(2, str);
        Context context = this.f43182a;
        com.bytedance.sdk.a.h.a.l lVar = new com.bytedance.sdk.a.h.a.l(str, str2, str3);
        a.C1046a aVar = new a.C1046a();
        aVar.f43153a = c.a.a("/passport/mobile/sms_login_only/");
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", m.c(lVar.f43292a));
        if (!TextUtils.isEmpty(lVar.f43294c)) {
            hashMap.put("captcha", lVar.f43294c);
        }
        hashMap.put("code", m.c(String.valueOf(lVar.f43293b)));
        hashMap.put("mix_mode", "1");
        new com.bytedance.sdk.a.h.b.h(context, aVar.a(hashMap, (Map<String, String>) null).c(), lVar, jVar).d();
    }

    public c(Context context) {
        this.f43182a = context;
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, com.bytedance.sdk.a.a.b.d dVar) {
        Context context = this.f43182a;
        a.C1046a aVar = new a.C1046a();
        aVar.f43153a = c.b.a("/passport/account/info/v2/");
        a.C1046a a2 = aVar.a("scene", str);
        if ("polling".equals(str)) {
            a2.a("get_info_type", "1");
        }
        new com.bytedance.sdk.a.g.g(context, a2.b(), dVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, com.bytedance.sdk.a.a.b.e eVar) {
        Context context = this.f43182a;
        a.C1046a a2 = new a.C1046a().a("service", str);
        a2.f43153a = c.a.a("/passport/mobile/get_qrcode/");
        new com.bytedance.sdk.a.g.h(context, a2.b(), eVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, com.bytedance.sdk.a.h.b.a.p pVar) {
        Context context = this.f43182a;
        HashMap hashMap = new HashMap();
        o.a aVar = new o.a(str, false, 23);
        a.C1046a aVar2 = new a.C1046a();
        aVar2.f43153a = c.a.a("/passport/mobile/validate_code/v1/");
        new com.bytedance.sdk.a.h.b.o(context, aVar2.a(com.bytedance.sdk.a.h.b.o.a(aVar), hashMap).c(), aVar, pVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, int i2, Map<String, String> map, com.bytedance.sdk.a.h.b.a.p pVar) {
        com.bytedance.sdk.a.h.b.o.a(this.f43182a, str, i2, 0, null, map, pVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void b(String str, String str2, String str3, n nVar) {
        com.bytedance.sdk.a.l.a.a(4, str);
        com.bytedance.sdk.a.h.b.m.a(this.f43182a, null, str, null, str2, str3, nVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void c(String str, String str2, String str3, n nVar) {
        com.bytedance.sdk.a.l.a.a(3, str);
        com.bytedance.sdk.a.h.b.m.a(this.f43182a, str, null, null, str2, str3, nVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(int i2, String str, Map<String, String> map, com.bytedance.sdk.a.a.b.k kVar) {
        Context context = this.f43182a;
        a.C1046a aVar = new a.C1046a();
        aVar.f43153a = c.a.a("/passport/email/verify/");
        new com.bytedance.sdk.a.g.n(context, aVar.a("mix_mode", "1").a(StringSet.type, m.c(String.valueOf(i2))).a("code", m.c(str)).a(map).c(), kVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, int i2, String str2, com.bytedance.sdk.a.h.b.a.p pVar) {
        com.bytedance.sdk.a.h.b.o.a(this.f43182a, str, i2, 1, str2, new HashMap(), pVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, int i2, Map<String, String> map, com.bytedance.sdk.a.h.b.a.l lVar) {
        com.bytedance.sdk.a.h.b.j.a(this.f43182a, str, i2, null, -1, 0, null, null, map, lVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void b(String str, String str2, Map map, h hVar) {
        Context context = this.f43182a;
        a.C1046a aVar = new a.C1046a();
        aVar.f43153a = com.bytedance.sdk.a.o.i.a(c.a.a("/passport/password/reset_by_email_ticket/"), null);
        HashMap hashMap = new HashMap();
        hashMap.put("password", m.c(str));
        hashMap.put("ticket", str2);
        hashMap.put("mix_mode", "1");
        new com.bytedance.sdk.a.g.k(context, aVar.a(hashMap, map).c(), "email", hVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void b(String str, String str2, int i2, Map map, com.bytedance.sdk.a.a.b.a aVar) {
        Context context = this.f43182a;
        a.C1046a aVar2 = new a.C1046a();
        aVar2.f43153a = com.bytedance.sdk.a.o.i.a(c.a.a("/passport/email/check_code/"), null);
        HashMap hashMap = new HashMap();
        hashMap.put("email", m.c(str));
        hashMap.put("code", m.c(str2));
        hashMap.put(StringSet.type, m.c(String.valueOf(i2)));
        hashMap.put("mix_mode", "1");
        hashMap.put("fixed_mix_mode", "1");
        new com.bytedance.sdk.a.g.a(context, aVar2.a(hashMap, map).c(), aVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void b(String str, String str2, int i2, int i3, Map<String, String> map, com.bytedance.sdk.a.c<com.bytedance.sdk.a.a.a.e> cVar) {
        Context context = this.f43182a;
        a.C1046a aVar = new a.C1046a();
        aVar.f43153a = c.a.a("/passport/app/email/register/ticket_register/");
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("password", m.c(str));
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("email_ticket", str2);
        }
        hashMap.put(StringSet.type, m.c(String.valueOf(i2)));
        hashMap.put("email_logic_type", String.valueOf(i3));
        hashMap.put("mix_mode", "1");
        new com.bytedance.sdk.a.g.f(context, aVar.a(hashMap, map).c(), cVar).d();
    }

    @Override // com.bytedance.sdk.a.a.e
    public final void a(String str, int i2, String str2, int i3, int i4, String str3, String str4, Map map, com.bytedance.sdk.a.h.b.a.l lVar) {
        com.bytedance.sdk.a.h.b.j.a(this.f43182a, str, i2, str2, i3, i4, str3, str4, map, lVar).d();
    }
}
