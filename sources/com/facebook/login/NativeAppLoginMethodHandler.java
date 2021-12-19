package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.facebook.c;
import com.facebook.internal.ab;
import com.facebook.internal.ad;
import com.facebook.j;
import com.facebook.login.LoginClient;

public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    static {
        Covode.recordClassIndex(29449);
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    public abstract int a(LoginClient.Request request);

    NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String b(Bundle bundle) {
        String string = bundle.getString("error_message");
        if (string == null) {
            return bundle.getString("error_description");
        }
        return string;
    }

    private static String a(Bundle bundle) {
        String string = bundle.getString("error");
        if (string == null) {
            return bundle.getString("error_type");
        }
        return string;
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(Intent intent, int i2) {
        if (intent == null) {
            return false;
        }
        try {
            this.f48844c.f48801c.startActivityForResult(intent, i2);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    private LoginClient.Result a(LoginClient.Request request, Intent intent) {
        String str;
        Bundle a2 = a(intent);
        String a3 = a(a2);
        if (a(a2, "error_code") != null) {
            str = a(a2, "error_code").toString();
        } else {
            str = null;
        }
        String b2 = b(a2);
        String string = a2.getString("e2e");
        if (!ad.a(string)) {
            b(string);
        }
        if (a3 == null && str == null && b2 == null) {
            try {
                return LoginClient.Result.a(request, a(request.f48812b, a2, c.FACEBOOK_APPLICATION_WEB, request.f48814d));
            } catch (j e2) {
                return LoginClient.Result.a(request, null, e2.getMessage(), null);
            }
        } else if (a3.equals("logged_out")) {
            CustomTabLoginMethodHandler.f48756a = true;
            return null;
        } else if (ab.f48510a.contains(a3)) {
            return null;
        } else {
            if (ab.f48511b.contains(a3)) {
                return LoginClient.Result.a(request, (String) null);
            }
            return LoginClient.Result.a(request, a3, b2, str);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    public final boolean a(int i2, int i3, Intent intent) {
        LoginClient.Result a2;
        LoginClient.Request request = this.f48844c.f48805g;
        if (intent == null) {
            a2 = LoginClient.Result.a(request, "Operation canceled");
        } else {
            String str = null;
            if (i3 == 0) {
                Bundle a3 = a(intent);
                String a4 = a(a3);
                if (a(a3, "error_code") != null) {
                    str = a(a3, "error_code").toString();
                }
                if ("CONNECTION_FAILURE".equals(str)) {
                    a2 = LoginClient.Result.a(request, a4, b(a3), str);
                } else {
                    a2 = LoginClient.Result.a(request, a4);
                }
            } else if (i3 != -1) {
                a2 = LoginClient.Result.a(request, "Unexpected resultCode from authorization.", null, null);
            } else {
                a2 = a(request, intent);
            }
        }
        if (a2 != null) {
            this.f48844c.a(a2);
            return true;
        }
        this.f48844c.c();
        return true;
    }
}
