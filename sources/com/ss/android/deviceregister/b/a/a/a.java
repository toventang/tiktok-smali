package com.ss.android.deviceregister.b.a.a;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public final AccountManager f59423a;

    /* renamed from: b  reason: collision with root package name */
    public Account f59424b;

    /* renamed from: c  reason: collision with root package name */
    public final ConcurrentHashMap<String, String> f59425c = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(36694);
    }

    public a(Context context) {
        this.f59423a = AccountManager.get(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.deviceregister.b.a.a.b
    public final String a(String str) {
        Account account = this.f59424b;
        if (account == null) {
            return null;
        }
        try {
            String userData = this.f59423a.getUserData(account, str);
            Logger.debug();
            return userData;
        } catch (Throwable unused) {
            Logger.debug();
            return null;
        }
    }

    @Override // com.ss.android.deviceregister.b.a.a.b
    public final void b(String str) {
        AccountManager accountManager;
        ConcurrentHashMap<String, String> concurrentHashMap = this.f59425c;
        if (concurrentHashMap != null && concurrentHashMap.containsKey(str)) {
            this.f59425c.remove(str);
        }
        try {
            Account account = this.f59424b;
            if (!(account == null || (accountManager = this.f59423a) == null)) {
                accountManager.setUserData(account, str, null);
            }
        } catch (Exception unused) {
        }
        a(str);
        super.b(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.deviceregister.b.a.a.b
    public final void a(String str, String str2) {
        if (this.f59424b == null) {
            this.f59425c.put(str, str2);
        } else if (str2 != null) {
            try {
                Logger.debug();
                this.f59423a.setUserData(this.f59424b, str, str2);
            } catch (Throwable unused) {
                Logger.debug();
            }
        }
    }
}
