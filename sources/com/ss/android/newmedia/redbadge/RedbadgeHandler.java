package com.ss.android.newmedia.redbadge;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.ss.android.message.d;
import com.ss.android.pushmanager.a.b;
import com.ss.android.pushmanager.setting.a;
import java.util.Random;
import org.json.JSONObject;

public class RedbadgeHandler extends Service implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    private WeakHandler f59981a;

    /* renamed from: b  reason: collision with root package name */
    private Messenger f59982b;

    static {
        Covode.recordClassIndex(37067);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    public void onCreate() {
        super.onCreate();
        this.f59981a = new WeakHandler(this);
        this.f59982b = new Messenger(this.f59981a);
    }

    public IBinder onBind(final Intent intent) {
        d.a().a(new Runnable() {
            /* class com.ss.android.newmedia.redbadge.RedbadgeHandler.AnonymousClass2 */

            static {
                Covode.recordClassIndex(37069);
            }

            public final void run() {
                RedbadgeHandler.this.a(intent);
                RedbadgeHandler.this.stopSelf();
            }
        }, 0);
        return this.f59982b.getBinder();
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        int i2;
        if (intent != null) {
            try {
                if ("com.ss.android.redbadge.message".equals(intent.getAction())) {
                    String a2 = a(intent, "message_data");
                    b a3 = b.a(this);
                    if (a2 != null && a3.f59997a != null) {
                        if (a3.f59999c) {
                            Logger.debug();
                            JSONObject jSONObject = new JSONObject(a2);
                            if (jSONObject.optInt("show") > 0) {
                                String optString = jSONObject.optString("content_type");
                                String optString2 = jSONObject.optString("content");
                                long a4 = b.a(a2);
                                if (!m.a(optString) && !m.a(optString2)) {
                                    if (!a.a().f60125a.b()) {
                                        if ("desktop_red_badge".equals(optString)) {
                                            int i3 = 1;
                                            try {
                                                i2 = Integer.parseInt(optString2);
                                            } catch (Throwable unused) {
                                                i2 = new Random().nextInt(5) + 1;
                                            }
                                            if (i2 > 0) {
                                                e.a().a(a3.f59997a, i2);
                                                a3.f60000d = true;
                                                JSONObject jSONObject2 = new JSONObject();
                                                jSONObject2.put("content", optString2);
                                                a3.a("desktop_red_badge", (long) i2, jSONObject2);
                                                Bundle bundle = new Bundle();
                                                bundle.putInt("badge_number", i2);
                                                if (!a3.f59999c) {
                                                    i3 = 0;
                                                }
                                                bundle.putInt("red_badge_is_open", i3);
                                                bundle.putString("show_type", "request");
                                                bundle.putLong("rule_id", a4);
                                                b.AbstractC1307b a5 = b.a();
                                                if (a5 != null) {
                                                    a5.a("red_badge_show", bundle);
                                                }
                                            } else {
                                                e.a().a(a3.f59997a, 0);
                                                a3.f60000d = false;
                                            }
                                            a3.a(2);
                                        } else if ("notification".equals(optString)) {
                                            Intent intent2 = new Intent(b.a().c());
                                            intent2.putExtra(b.a().b(), optString2);
                                            intent2.setPackage(a3.f59997a.getPackageName());
                                            b.a(a3.f59997a, intent2);
                                            JSONObject jSONObject3 = new JSONObject();
                                            jSONObject3.put("content", optString2);
                                            a3.a("notification", 0, jSONObject3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public int onStartCommand(final Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        d.a().a(new Runnable() {
            /* class com.ss.android.newmedia.redbadge.RedbadgeHandler.AnonymousClass1 */

            static {
                Covode.recordClassIndex(37068);
            }

            public final void run() {
                RedbadgeHandler.this.a(intent);
                RedbadgeHandler.this.stopSelf();
            }
        }, 0);
        int onStartCommand = super.onStartCommand(intent, i2, i3);
        b.AbstractC1307b bVar = (b.AbstractC1307b) com.ss.android.ug.bus.b.a(b.AbstractC1307b.class);
        if (bVar == null || bVar.g()) {
            return 2;
        }
        return onStartCommand;
    }
}
