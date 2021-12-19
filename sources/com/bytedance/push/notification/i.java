package com.bytedance.push.notification;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.common.utility.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.c.k;
import com.bytedance.push.c.o;
import com.bytedance.push.f;
import com.bytedance.push.f.b;
import com.bytedance.push.settings.LocalFrequencySettings;
import com.bytedance.push.settings.h;
import com.ss.android.message.a.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final o f42281a = null;

    /* renamed from: b  reason: collision with root package name */
    private final Context f42282b;

    /* renamed from: c  reason: collision with root package name */
    private final k f42283c;

    /* renamed from: d  reason: collision with root package name */
    private final b f42284d = null;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f42285e;

    static {
        Covode.recordClassIndex(25826);
    }

    public final void run() {
        String str;
        LocalFrequencySettings localFrequencySettings = (LocalFrequencySettings) h.a(this.f42282b, LocalFrequencySettings.class);
        int b2 = a.b(this.f42282b);
        Map<String, String> e2 = this.f42283c.e();
        if (this.f42285e) {
            str = "0";
        } else {
            str = "1";
        }
        e2.put("notice", str);
        e2.put("system_notify_status", String.valueOf(b2));
        String a2 = a.a(com.ss.android.pushmanager.a.a("/service/1/app_notice_status/"), e2);
        try {
            JSONArray a3 = e.f42254a.a(this.f42282b);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("out_app_channel_notify", a3.toString()));
            b bVar = this.f42284d;
            if (bVar != null) {
                String a4 = bVar.a();
                if (!TextUtils.isEmpty(a4)) {
                    arrayList.add(new Pair("mute_setting", a4));
                }
                String b3 = this.f42284d.b();
                if (!TextUtils.isEmpty(b3)) {
                    arrayList.add(new Pair("scene_status_list", b3));
                }
            }
            String a5 = j.f26946a.a(a2, arrayList, (Map<String, String>) null);
            if (!TextUtils.isEmpty(a5)) {
                String optString = new JSONObject(a5).optString("message");
                if ("success".equals(optString)) {
                    localFrequencySettings.a(true);
                    localFrequencySettings.a(b2);
                    localFrequencySettings.f(a3.toString());
                    localFrequencySettings.b(System.currentTimeMillis());
                    f.d().d();
                    if (this.f42281a != null) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            /* class com.bytedance.push.notification.i.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(25827);
                            }

                            public final void run() {
                            }
                        });
                        return;
                    }
                    return;
                }
                this.f42283c.m().b(302, a5);
                a(1001, optString);
            } else {
                this.f42283c.m().b(304, a5);
                a(1001, "server return empty");
            }
            localFrequencySettings.a(false);
        } catch (Exception e3) {
            localFrequencySettings.a(false);
            f.d().b(301, Log.getStackTraceString(e3));
            e3.printStackTrace();
            if (e3 instanceof IOException) {
                a(1002, "network error : " + e3.getMessage());
            } else {
                a(1003, "unknown error: " + e3.getMessage());
            }
        }
    }

    private void a(final int i2, final String str) {
        if (this.f42281a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                /* class com.bytedance.push.notification.i.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(25828);
                }

                public final void run() {
                }
            });
        }
    }

    i(Context context, k kVar, boolean z) {
        this.f42282b = context;
        this.f42283c = kVar;
        this.f42285e = z;
    }
}
