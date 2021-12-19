package com.facebook.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.a.c;
import androidx.browser.a.e;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.a.b.a;
import com.facebook.m;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private Uri f48603a;

    static {
        Covode.recordClassIndex(29315);
    }

    public f(String str, Bundle bundle) {
        this.f48603a = a(str, bundle == null ? new Bundle() : bundle);
    }

    public static Uri a(String str, Bundle bundle) {
        if (a.a(f.class)) {
            return null;
        }
        try {
            return ad.a(ab.a(), m.e() + "/dialog/" + str, bundle);
        } catch (Throwable th) {
            a.a(th, f.class);
            return null;
        }
    }

    public final boolean a(Activity activity, String str) {
        if (a.a(this)) {
            return false;
        }
        try {
            e eVar = com.facebook.login.a.f48854a;
            com.facebook.login.a.f48854a = null;
            c a2 = new c.a(eVar).a();
            a2.f1776a.setPackage(str);
            a2.f1776a.addFlags(1073741824);
            try {
                a2.a(activity, this.f48603a);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th) {
            a.a(th, this);
            return false;
        }
    }
}
