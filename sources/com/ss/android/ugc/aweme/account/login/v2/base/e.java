package com.ss.android.ugc.aweme.account.login.v2.base;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.h.a;
import h.f.b.l;
import h.m.p;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f64730a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(39780);
    }

    public static String a(Bundle bundle) {
        l.d(bundle, "");
        String string = bundle.getString("args_email");
        if (string == null) {
            return "";
        }
        return string;
    }

    public static a.C1412a b(Bundle bundle) {
        l.d(bundle, "");
        return (a.C1412a) bundle.getSerializable("args_phone_number");
    }

    public static void c(Bundle bundle) {
        l.d(bundle, "");
        bundle.putBoolean("login_with_2sv", true);
    }

    public static String a(Fragment fragment) {
        l.d(fragment, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            l.b();
        }
        l.b(arguments, "");
        return a(arguments);
    }

    public static a.C1412a b(Fragment fragment) {
        l.d(fragment, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            l.b();
        }
        l.b(arguments, "");
        return b(arguments);
    }

    public static String c(Fragment fragment) {
        l.d(fragment, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            l.b();
        }
        String string = arguments.getString("args_string_phone_number", "");
        l.b(string, "");
        return string;
    }

    public static boolean d(Fragment fragment) {
        l.d(fragment, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            l.b();
        }
        return arguments.getBoolean("code_sent", false);
    }

    public static String e(Fragment fragment) {
        l.d(fragment, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            l.b();
        }
        String string = arguments.getString("ticket", "");
        l.b(string, "");
        return string;
    }

    public static String f(Fragment fragment) {
        l.d(fragment, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            l.b();
        }
        String string = arguments.getString("not_login_ticket", "");
        l.b(string, "");
        return string;
    }

    public static String g(Fragment fragment) {
        l.d(fragment, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            l.b();
        }
        String string = arguments.getString("verify_ticket", "");
        l.b(string, "");
        return string;
    }

    public static boolean h(Fragment fragment) {
        l.d(fragment, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            l.b();
        }
        return arguments.getBoolean("use_legacy_check_code", false);
    }

    public static boolean i(Fragment fragment) {
        l.d(fragment, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            l.b();
        }
        return arguments.getBoolean("login_with_2sv", false);
    }

    public static void d(Bundle bundle, String str) {
        l.d(bundle, "");
        l.d(str, "");
        bundle.putString("ticket", str);
    }

    public static void e(Bundle bundle, String str) {
        l.d(bundle, "");
        l.d(str, "");
        bundle.putString("verify_ticket", str);
    }

    public static void a(Bundle bundle, String str) {
        l.d(bundle, "");
        l.d(str, "");
        bundle.putString("args_email", str);
    }

    public static void b(Bundle bundle, String str) {
        l.d(bundle, "");
        l.d(str, "");
        bundle.putString("args_string_phone_number", str);
    }

    public static void a(Fragment fragment, a.C1412a aVar) {
        l.d(fragment, "");
        l.d(aVar, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            l.b();
        }
        arguments.putSerializable("args_phone_number", aVar);
    }

    public static void b(Fragment fragment, String str) {
        l.d(fragment, "");
        l.d(str, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            l.b();
        }
        l.b(arguments, "");
        d(arguments, str);
    }

    public static void c(Bundle bundle, String str) {
        l.d(bundle, "");
        l.d(str, "");
        try {
            List<String> b2 = p.b(str, new String[]{" "});
            if (b2 != null && b2.size() == 2) {
                bundle.putSerializable("args_phone_number", a.C1412a.create(Integer.parseInt(b2.get(0)), Long.parseLong(b2.get(1))));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        bundle.putString("args_string_phone_number", str);
    }

    public static void a(Fragment fragment, String str) {
        l.d(fragment, "");
        l.d(str, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            l.b();
        }
        arguments.putString("args_email", str);
    }

    public static void a(Fragment fragment, boolean z) {
        l.d(fragment, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            l.b();
        }
        arguments.putBoolean("code_sent", z);
    }
}
