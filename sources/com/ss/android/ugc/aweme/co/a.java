package com.ss.android.ugc.aweme.co;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.utils.dw;
import java.util.List;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected String f71244a;

    static {
        Covode.recordClassIndex(43850);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public a() {
        a();
    }

    private void b() {
        if (TextUtils.isEmpty(this.f71244a)) {
            throw new IllegalStateException("filename can not bo null");
        }
    }

    private SharedPreferences a(Context context) {
        if (context == null) {
            return null;
        }
        b();
        return d.a(context, this.f71244a, 0);
    }

    public final int b(Context context, String str) {
        SharedPreferences a2 = a(context);
        if (a2 == null) {
            return 0;
        }
        return a2.getInt(str, 0);
    }

    public final boolean c(Context context, String str) {
        SharedPreferences a2 = a(context);
        if (a2 == null) {
            return false;
        }
        return a2.getBoolean(str, false);
    }

    public final long d(Context context, String str) {
        SharedPreferences a2 = a(context);
        if (a2 == null) {
            return 0;
        }
        return a2.getLong(str, 0);
    }

    public final long e(Context context, String str) {
        SharedPreferences a2 = a(context);
        if (a2 == null) {
            return 0;
        }
        return a2.getLong(str, 0);
    }

    public final String a(Context context, String str) {
        SharedPreferences a2 = a(context);
        if (a2 == null) {
            return null;
        }
        return a2.getString(str, "");
    }

    public final <T> T a(Context context, String str, Class<T> cls) {
        SharedPreferences a2 = a(context);
        if (a2 == null) {
            return null;
        }
        String string = a2.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return (T) dw.a(string, cls);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        } catch (Error e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public final String b(Context context, String str, String str2) {
        SharedPreferences a2 = a(context);
        if (a2 == null) {
            return null;
        }
        return a2.getString(str, str2);
    }

    public final void a(Context context, String str, int i2) {
        SharedPreferences.Editor edit = d.a(context, this.f71244a, 0).edit();
        edit.putInt(str, i2);
        edit.apply();
    }

    public final <T> List<T> b(Context context, String str, Class<T> cls) {
        SharedPreferences a2 = a(context);
        if (a2 == null) {
            return null;
        }
        String string = a2.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return dw.b(string, cls);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        } catch (Error e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public final void a(Context context, String str, long j2) {
        SharedPreferences a2 = a(context);
        if (a2 != null) {
            SharedPreferences.Editor edit = a2.edit();
            edit.putLong(str, j2);
            edit.apply();
        }
    }

    public final boolean b(Context context, String str, boolean z) {
        SharedPreferences a2 = a(context);
        if (a2 == null) {
            return false;
        }
        return a2.getBoolean(str, z);
    }

    public final void a(Context context, String str, Object obj) {
        try {
            SharedPreferences a2 = a(context);
            if (a2 != null && obj != null) {
                SharedPreferences.Editor edit = a2.edit();
                edit.putString(str, dw.a(obj));
                edit.apply();
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(Context context, String str, String str2) {
        SharedPreferences a2 = a(context);
        if (a2 != null) {
            SharedPreferences.Editor edit = a2.edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }

    public final void a(Context context, String str, boolean z) {
        SharedPreferences a2 = a(context);
        if (a2 != null) {
            SharedPreferences.Editor edit = a2.edit();
            edit.putBoolean(str, z);
            edit.apply();
        }
    }
}
