package com.ss.android.ugc.aweme.promote;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Message;
import android.text.format.DateUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.settingsrequest.PopupSettingManager;
import com.ss.android.ugc.aweme.settingsrequest.d.c;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

public class b implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static d f118128a;

    /* renamed from: d  reason: collision with root package name */
    private static SharedPreferences f118129d;

    /* renamed from: e  reason: collision with root package name */
    private static b f118130e;

    /* renamed from: b  reason: collision with root package name */
    public WeakHandler f118131b = new WeakHandler(this);

    /* renamed from: c  reason: collision with root package name */
    public WeakReference<Activity> f118132c;

    /* renamed from: f  reason: collision with root package name */
    private c f118133f;

    static {
        Covode.recordClassIndex(76726);
    }

    private b() {
    }

    public static SharedPreferences b() {
        if (f118129d == null) {
            f118129d = d.a(com.bytedance.ies.ugc.appcontext.d.a(), "aweme-gdpr-dialog", 0);
        }
        return f118129d;
    }

    public static b a() {
        MethodCollector.i(3005);
        if (f118130e == null) {
            synchronized (b.class) {
                try {
                    if (f118130e == null) {
                        f118130e = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3005);
                    throw th;
                }
            }
        }
        b bVar = f118130e;
        MethodCollector.o(3005);
        return bVar;
    }

    public final void c() {
        if (d()) {
            d dVar = new d(this.f118132c.get(), "", this.f118133f);
            f118128a = dVar;
            dVar.setOnDismissListener(new DialogInterface.OnDismissListener() {
                /* class com.ss.android.ugc.aweme.promote.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(76727);
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    b.f118128a = null;
                }
            });
            f118128a.show();
        }
    }

    private boolean d() {
        WeakReference<Activity> weakReference;
        if (this.f118133f == null || (weakReference = this.f118132c) == null || weakReference.get() == null) {
            return false;
        }
        this.f118133f = null;
        String curUserId = com.ss.android.ugc.aweme.account.b.g().getCurUserId();
        if (DateUtils.isToday(b().getLong("last_pop_time_".concat(String.valueOf(curUserId)), 0))) {
            return false;
        }
        try {
            SharedPreferences.Editor edit = b().edit();
            edit.putLong("last_pop_time_".concat(String.valueOf(curUserId)), System.currentTimeMillis());
            edit.apply();
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return true;
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        Object obj = message.obj;
        int i2 = message.what;
        if (obj instanceof a) {
            a aVar = (a) obj;
            Activity activity = this.f118132c.get();
            if (activity != null) {
                new com.bytedance.tux.g.b(activity).a(aVar.getErrorMsg()).b();
            }
        } else if (obj instanceof Exception) {
            Activity activity2 = this.f118132c.get();
            if (activity2 != null) {
                new com.bytedance.tux.g.b(activity2).e(R.string.de9).b();
            }
        } else {
            if (obj instanceof c) {
                boolean z = true;
                if (i2 == 1) {
                    c cVar = (c) obj;
                    if (cVar != null) {
                        if (cVar.f118135a == null || !cVar.f118135a.booleanValue()) {
                            z = false;
                        }
                        String curUserId = com.ss.android.ugc.aweme.account.b.g().getCurUserId();
                        SharedPreferences.Editor edit = b().edit();
                        edit.putBoolean("joined_".concat(String.valueOf(curUserId)), z);
                        edit.apply();
                        c();
                        return;
                    }
                    return;
                }
            }
            if (i2 == 2) {
                this.f118133f = PopupSettingManager.a.f123158a.a("gdpr_popup");
                c();
            }
        }
    }
}
