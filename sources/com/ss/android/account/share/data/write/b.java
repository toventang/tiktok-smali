package com.ss.android.account.share.data.write;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.common.utility.b.e;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.account.share.data.write.a;
import com.ss.android.ugc.aweme.bf.d;
import h.a.n;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f58231a = {new y(ab.a(b.class), "gson", "getGson()Lcom/google/gson/Gson;")};

    /* renamed from: b  reason: collision with root package name */
    public static d f58232b = new d();

    /* renamed from: c  reason: collision with root package name */
    public static boolean f58233c;

    /* renamed from: d  reason: collision with root package name */
    public static Context f58234d;

    /* renamed from: e  reason: collision with root package name */
    public static final h f58235e = h.i.a((h.f.a.a) a.f58237a);

    /* renamed from: f  reason: collision with root package name */
    public static final b f58236f = new b();

    private b() {
    }

    static final class a extends m implements h.f.a.a<f> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f58237a = new a();

        static {
            Covode.recordClassIndex(36187);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            return new f();
        }
    }

    static {
        Covode.recordClassIndex(36186);
    }

    /* renamed from: com.ss.android.account.share.data.write.b$b  reason: collision with other inner class name */
    static final class RunnableC1282b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f58238a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f58239b = null;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f58240c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f58241d;

        static {
            Covode.recordClassIndex(36188);
        }

        RunnableC1282b(Context context, String str, String str2, String str3) {
            this.f58238a = context;
            this.f58240c = str2;
            this.f58241d = str3;
        }

        public final void run() {
            Account[] accountArr;
            try {
                AccountManager accountManager = AccountManager.get(this.f58238a);
                String str = this.f58239b;
                if (str == null) {
                    str = "";
                }
                if (TextUtils.isEmpty(str)) {
                    str = this.f58238a.getPackageName();
                    l.a((Object) str, "");
                }
                Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(accountManager, new Object[]{str}, 102501, "android.accounts.Account[]", false, null);
                if (((Boolean) a2.first).booleanValue()) {
                    accountArr = (Account[]) a2.second;
                } else {
                    accountArr = accountManager.getAccountsByType(str);
                    com.bytedance.helios.sdk.a.a(accountArr, accountManager, new Object[]{str}, 102501, "com_ss_android_account_share_data_write_SecShareDataWriteManager$save2AccountManager$1_android_accounts_AccountManager_getAccountsByType(Landroid/accounts/AccountManager;Ljava/lang/String;)[Landroid/accounts/Account;");
                }
                if (accountArr != null) {
                    for (Account account : accountArr) {
                        AccountManager.get(this.f58238a).setUserData(account, this.f58240c, this.f58241d);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                com.ss.android.account.share.data.a.a().a("share_sdk_save_account_info_failed").a("err_msg", e2.getMessage()).a("err_msg_stack", Log.getStackTraceString(e2)).b();
            }
        }
    }

    public static boolean a(String str) {
        String str2;
        if (!f58233c) {
            com.ss.android.account.share.data.a.a().a("share_sdk_no_init").b();
            return false;
        }
        String str3 = "";
        if (!TextUtils.isEmpty(str) && f58233c && n.a((Iterable) f58232b.f58243a.keySet(), (Object) str)) {
            Context context = f58234d;
            if (context == null) {
                l.a("mContext");
            }
            if (str == null) {
                l.a();
            }
            String a2 = c.a(context, str);
            if (a2 == null) {
                a2 = str3;
            }
            if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(f58232b.f58243a.get(str))) {
                String lowerCase = a2.toLowerCase();
                l.a((Object) lowerCase, str3);
                String str4 = f58232b.f58243a.get(str);
                if (str4 != null) {
                    str2 = str4.toLowerCase();
                    l.a((Object) str2, str3);
                } else {
                    str2 = null;
                }
                if (l.a((Object) lowerCase, (Object) str2)) {
                    return true;
                }
            }
            str3 = a2;
        }
        com.ss.android.account.share.data.a.a().a("share_sdk_check_pkg_sign_failed").a("pkg_name", str).a("pkg_sign", str3).b();
        return false;
    }

    public static void a(Context context, String str, String str2) {
        l.c(context, "");
        l.c(str, "");
        l.c(str2, "");
        e.a(new RunnableC1282b(context, null, str, str2));
        a a2 = a.C1281a.a(context);
        l.c(str, "");
        l.c(str2, "");
        SharedPreferences.Editor edit = d.a(a2.f58230b, a2.f58229a, 0).edit();
        l.a((Object) edit, "");
        edit.putString(str, str2).apply();
    }
}
