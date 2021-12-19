package com.ss.android.deviceregister;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.deviceregister.a.d;
import com.ss.android.deviceregister.b.a.a;

public class c {

    /* renamed from: a  reason: collision with root package name */
    static a f59454a;

    /* renamed from: b  reason: collision with root package name */
    static Account f59455b;

    /* renamed from: c  reason: collision with root package name */
    private static String f59456c;

    static {
        Covode.recordClassIndex(36709);
    }

    static boolean a() {
        if (TextUtils.isEmpty(f59456c)) {
            f59456c = d.f59405a;
        }
        return "local_test".equals(f59456c);
    }

    public static boolean b(Context context) {
        if (context == null || !a()) {
            return false;
        }
        return com.ss.android.deviceregister.c.a.a(context).f59458a;
    }

    public static a a(Context context) {
        MethodCollector.i(2944);
        if (DeviceRegisterManager.hasInit()) {
            if (f59454a == null) {
                synchronized (c.class) {
                    try {
                        if (f59454a == null) {
                            if (context != null) {
                                if (b(context)) {
                                    if (com.ss.android.deviceregister.c.a.a(context).f59459b) {
                                        com.ss.android.deviceregister.c.a a2 = com.ss.android.deviceregister.c.a.a(context);
                                        if (a2.a()) {
                                            SharedPreferences.Editor edit = com.ss.android.ugc.aweme.bf.d.a(a2.f59461d.get(), "device_param_fake", 0).edit();
                                            edit.clear();
                                            edit.apply();
                                            if (Build.VERSION.SDK_INT >= 21) {
                                                CookieManager.getInstance().removeAllCookies(null);
                                            }
                                            SharedPreferences.Editor edit2 = com.ss.android.ugc.aweme.bf.d.a(a2.f59461d.get(), "cookieStore", 0).edit();
                                            edit2.clear();
                                            edit2.apply();
                                            SharedPreferences.Editor edit3 = com.ss.android.ugc.aweme.bf.d.a(a2.f59461d.get(), "tt_new_token_save_sp", 0).edit();
                                            edit3.putString("X-Tt-Token", "");
                                            edit3.apply();
                                            SharedPreferences.Editor edit4 = com.ss.android.ugc.aweme.bf.d.a(a2.f59461d.get(), "com.ss.android.deviceregister.utils.Cdid", 0).edit();
                                            edit4.putString("cdid", "");
                                            edit4.apply();
                                        }
                                    }
                                    try {
                                        f59454a = (a) Class.forName("com.ss.android.deviceregister.newuser.DeviceParamsProvider").getConstructor(Context.class).newInstance(context);
                                    } catch (Exception e2) {
                                        e2.printStackTrace();
                                    }
                                }
                                if (f59454a == null) {
                                    b bVar = new b(context, DeviceRegisterManager.isLocalTest());
                                    f59454a = bVar;
                                    Account account = f59455b;
                                    if (account != null) {
                                        bVar.a(account);
                                    }
                                }
                            } else {
                                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("context == null");
                                MethodCollector.o(2944);
                                throw illegalArgumentException;
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(2944);
                        throw th;
                    }
                }
            }
            a aVar = f59454a;
            MethodCollector.o(2944);
            return aVar;
        }
        IllegalStateException illegalStateException = new IllegalStateException("please init TeaAgent first");
        MethodCollector.o(2944);
        throw illegalStateException;
    }
}
