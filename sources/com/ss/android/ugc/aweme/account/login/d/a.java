package com.ss.android.ugc.aweme.account.login.d;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.v2.base.c;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import h.a.am;
import h.f.b.l;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<Integer> f63389a = am.a((Object[]) new Integer[]{7, 2027, 2028, 2033, 2032, 2020, 2046, 1091, 1092, 1093, 2031});

    /* renamed from: b  reason: collision with root package name */
    public static final a f63390b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(39067);
    }

    public static void a(c cVar, String str) {
        l.d(cVar, "");
        l.d(str, "");
        Bundle arguments = cVar.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", k.QRCODE_LOGIN.getValue());
        arguments.putString("extra_previous_page", "login_procedure_jump");
        arguments.putString("previous_page_location", str);
        l.b(arguments, "");
        cVar.a(arguments);
    }

    public static void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        r.a("login_procedure_jump_cancel", new d().a("platform", str).a("desc", str2).f66730a);
    }
}
