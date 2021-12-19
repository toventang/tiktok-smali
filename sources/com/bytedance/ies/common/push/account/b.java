package com.bytedance.ies.common.push.account;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public final class b extends AbstractAccountAuthenticator {
    static {
        Covode.recordClassIndex(19805);
    }

    public b(Context context) {
        super(context);
    }

    public final String getAuthTokenLabel(String str) {
        throw new UnsupportedOperationException();
    }

    public final Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        throw new UnsupportedOperationException();
    }
}
