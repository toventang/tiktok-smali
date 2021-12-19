package com.ss.android.deviceregister.c;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static Account f59463a;

    static {
        Covode.recordClassIndex(36711);
    }

    static String b(Context context) {
        try {
            return AccountManager.get(context).getUserData(a(context), "new_user_mode_account");
        } catch (Throwable unused) {
            return "";
        }
    }

    public static Account a(Context context) {
        String str;
        Account[] accountsByType;
        Account account = f59463a;
        if (account != null) {
            return account;
        }
        AccountManager accountManager = AccountManager.get(context);
        String packageName = context.getPackageName();
        try {
            str = context.getString(context.getApplicationInfo().labelRes);
        } catch (Throwable unused) {
            str = null;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(packageName)) {
            return null;
        }
        int i2 = 0;
        Pair<Boolean, Object> a2 = a.a(accountManager, new Object[]{packageName}, 102501, "android.accounts.Account[]", false, null);
        if (((Boolean) a2.first).booleanValue()) {
            accountsByType = (Account[]) a2.second;
        } else {
            accountsByType = accountManager.getAccountsByType(packageName);
            a.a(accountsByType, accountManager, new Object[]{packageName}, 102501, "com_ss_android_deviceregister_newusermode_NewUserModeUtil_android_accounts_AccountManager_getAccountsByType(Landroid/accounts/AccountManager;Ljava/lang/String;)[Landroid/accounts/Account;");
        }
        int length = accountsByType.length;
        while (true) {
            if (i2 < length) {
                Account account2 = accountsByType[i2];
                if (account2 != null && str.equals(account2.name)) {
                    f59463a = account2;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return f59463a;
    }
}
