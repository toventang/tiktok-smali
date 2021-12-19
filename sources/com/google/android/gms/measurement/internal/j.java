package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import com.google.android.gms.common.util.e;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class j extends fy {

    /* renamed from: a  reason: collision with root package name */
    long f51906a;

    /* renamed from: b  reason: collision with root package name */
    private long f51907b;

    /* renamed from: c  reason: collision with root package name */
    private String f51908c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f51909d;

    /* renamed from: e  reason: collision with root package name */
    private AccountManager f51910e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f51911f;

    static {
        Covode.recordClassIndex(32329);
    }

    private static AccountManagerFuture a(AccountManager accountManager, String str, String[] strArr) {
        Pair<Boolean, Object> a2 = a.a(accountManager, new Object[]{str, strArr, null, null}, 102502, "android.accounts.AccountManagerFuture", false, null);
        if (((Boolean) a2.first).booleanValue()) {
            return (AccountManagerFuture) a2.second;
        }
        AccountManagerFuture<Account[]> accountsByTypeAndFeatures = accountManager.getAccountsByTypeAndFeatures(str, strArr, null, null);
        a.a(accountsByTypeAndFeatures, accountManager, new Object[]{str, strArr, null, null}, 102502, "com_google_android_gms_measurement_internal_zzai_android_accounts_AccountManager_getAccountsByTypeAndFeatures(Landroid/accounts/AccountManager;Ljava/lang/String;[Ljava/lang/String;Landroid/accounts/AccountManagerCallback;Landroid/os/Handler;)Landroid/accounts/AccountManagerFuture;");
        return accountsByTypeAndFeatures;
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final long e() {
        x();
        return this.f51907b;
    }

    public final String f() {
        x();
        return this.f51908c;
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ j k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ e l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ dz n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ jz o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ ex p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ eb q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ em r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ km s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ kl t() {
        return super.t();
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        c();
        this.f51911f = null;
        this.f51906a = 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.fy
    public final boolean d() {
        Calendar instance = Calendar.getInstance();
        this.f51907b = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        this.f51908c = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()).append(lowerCase).append("-").append(lowerCase2).toString();
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        c();
        long a2 = l().a();
        if (a2 - this.f51906a > 86400000) {
            this.f51911f = null;
        }
        Boolean bool = this.f51911f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (b.a(m(), "android.permission.GET_ACCOUNTS") != 0) {
            q().f51472g.a("Permission error checking for dasher/unicorn accounts");
            this.f51906a = a2;
            this.f51911f = false;
            return false;
        }
        if (this.f51910e == null) {
            this.f51910e = AccountManager.get(m());
        }
        try {
            Account[] accountArr = (Account[]) a(this.f51910e, com.bytedance.ies.xbridge.system.b.a.b.a.f36455d, new String[]{"service_HOSTED"}).getResult();
            if (accountArr == null || accountArr.length <= 0) {
                Account[] accountArr2 = (Account[]) a(this.f51910e, com.bytedance.ies.xbridge.system.b.a.b.a.f36455d, new String[]{"service_uca"}).getResult();
                if (accountArr2 != null && accountArr2.length > 0) {
                    this.f51911f = true;
                    this.f51906a = a2;
                    return true;
                }
                this.f51906a = a2;
                this.f51911f = false;
                return false;
            }
            this.f51911f = true;
            this.f51906a = a2;
            return true;
        } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
            q().f51469d.a("Exception checking account types", e2);
        }
    }

    j(ff ffVar) {
        super(ffVar);
    }

    public final boolean a(Context context) {
        if (this.f51909d == null) {
            t();
            this.f51909d = false;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.f51909d = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.f51909d.booleanValue();
    }
}
