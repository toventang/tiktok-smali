package com.ss.android.deviceregister;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.b.e;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.q;
import com.ss.android.deviceregister.b.a.a.b;
import com.ss.android.ugc.aweme.bf.d;
import java.util.Map;
import java.util.UUID;

public abstract class a implements com.ss.android.deviceregister.b.a.a {

    /* renamed from: d  reason: collision with root package name */
    static volatile String f59394d;

    /* renamed from: g  reason: collision with root package name */
    private static String f59395g;

    /* renamed from: h  reason: collision with root package name */
    private static String f59396h;

    /* renamed from: a  reason: collision with root package name */
    protected final Context f59397a;

    /* renamed from: b  reason: collision with root package name */
    protected final boolean f59398b;

    /* renamed from: c  reason: collision with root package name */
    b f59399c;

    /* renamed from: e  reason: collision with root package name */
    protected final String f59400e;

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.android.deviceregister.b.a.a.a f59401f;

    static {
        Covode.recordClassIndex(36685);
    }

    @Override // com.ss.android.deviceregister.b.a.a
    public final String c() {
        synchronized (this) {
            if (!m.a(f59394d)) {
                return f59394d;
            }
            f59394d = this.f59399c.b("", "");
            return f59394d;
        }
    }

    @Override // com.ss.android.deviceregister.b.a.a
    public final String b() {
        if (!TextUtils.isEmpty(f59396h)) {
            return f59396h;
        }
        try {
            SharedPreferences a2 = d.a(this.f59397a, com.ss.android.deviceregister.a.a.a(), 0);
            String string = a2.getString("clientudid", null);
            if (!com.ss.android.deviceregister.d.b.a(string)) {
                string = UUID.randomUUID().toString();
                SharedPreferences.Editor edit = a2.edit();
                edit.putString("clientudid", string);
                edit.commit();
            }
            if (!m.a(string)) {
                string = string + this.f59400e;
            }
            f59396h = string;
            return string;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r3.length() >= 13) goto L_0x0082;
     */
    @Override // com.ss.android.deviceregister.b.a.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a() {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.deviceregister.a.a():java.lang.String");
    }

    public final void a(Account account) {
        com.ss.android.deviceregister.b.a.a.a aVar = this.f59401f;
        if (account != null) {
            aVar.f59424b = account;
            if (aVar.f59425c != null && aVar.f59425c.size() > 0) {
                e.a(new Runnable(account) {
                    /* class com.ss.android.deviceregister.b.a.a.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ Account f59426a;

                    static {
                        Covode.recordClassIndex(36695);
                    }

                    public final void run() {
                        try {
                            if (a.this.f59425c != null && a.this.f59425c.size() > 0) {
                                if (a.this.f59423a != null) {
                                    for (Map.Entry<String, String> entry : a.this.f59425c.entrySet()) {
                                        if (entry != null) {
                                            a.this.f59423a.setUserData(this.f59426a, entry.getKey(), entry.getValue());
                                        }
                                    }
                                    a.this.f59425c.clear();
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }

                    {
                        this.f59426a = r2;
                    }
                });
            }
        }
    }

    @Override // com.ss.android.deviceregister.b.a.a
    public final void a(String str) {
        if (!q.a(str) && !m.a(str, f59394d)) {
            f59394d = this.f59399c.b(str, f59394d);
        }
    }

    @Override // com.ss.android.deviceregister.b.a.a
    public final void b(String str) {
        if (TextUtils.equals(str, "device_id")) {
            f59394d = null;
        }
        if (TextUtils.equals(str, "openudid")) {
            f59395g = null;
        }
        if (TextUtils.equals(str, "clientudid")) {
            f59396h = null;
        }
        this.f59399c.b(str);
    }

    a(Context context, boolean z) {
        String str;
        if (z) {
            str = "_local";
        } else {
            str = "";
        }
        this.f59400e = str;
        this.f59398b = z;
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f59397a = applicationContext;
        this.f59399c = new com.ss.android.deviceregister.b.a.a.d(applicationContext);
        com.ss.android.deviceregister.b.a.a.a aVar = new com.ss.android.deviceregister.b.a.a.a(applicationContext);
        this.f59401f = aVar;
        this.f59399c.f59428d = aVar;
    }
}
