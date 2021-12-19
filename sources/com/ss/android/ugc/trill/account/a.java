package com.ss.android.ugc.trill.account;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.zhiliaoapp.musically.R;

public final class a extends AbstractAccountAuthenticator {

    /* renamed from: a  reason: collision with root package name */
    private Context f150471a;

    static {
        Covode.recordClassIndex(98955);
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        return null;
    }

    public final Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        return null;
    }

    public a(Context context) {
        super(context);
        this.f150471a = context;
    }

    public final String getAuthTokenLabel(String str) {
        return this.f150471a.getResources().getString(R.string.cby);
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        AccountManager accountManager = AccountManager.get(this.f150471a);
        String peekAuthToken = accountManager.peekAuthToken(account, str);
        if (TextUtils.isEmpty(peekAuthToken) && accountManager.getPassword(account) != null) {
            peekAuthToken = "success";
        }
        if (!TextUtils.isEmpty(peekAuthToken)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("authAccount", account.name);
            bundle2.putString("accountType", account.type);
            bundle2.putString("authtoken", peekAuthToken);
            return bundle2;
        }
        Intent intent = new Intent(this.f150471a, MainActivity.class);
        intent.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("intent", intent);
        return bundle3;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        Intent intent = new Intent(this.f150471a, MainActivity.class);
        intent.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("intent", intent);
        return bundle2;
    }
}
