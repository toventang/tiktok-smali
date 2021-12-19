package com.bytedance.android.livesdk.firstrecharge;

import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f17758a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(9853);
    }

    public static void a() {
        b.a.a("welcome_gift_show").a().a("request_id", com.bytedance.android.livesdk.ab.e.k()).b();
    }

    public static void b(String str) {
        b.a.a("welcome_gift_pack_buy_success").a().a("gift_enter_from", str).a("request_id", com.bytedance.android.livesdk.ab.e.k()).b();
    }

    public static void a(String str) {
        b.a.a("welcome_gift_pack_page_show").a().a("gift_enter_from", str).a("request_id", com.bytedance.android.livesdk.ab.e.k()).b();
    }
}
