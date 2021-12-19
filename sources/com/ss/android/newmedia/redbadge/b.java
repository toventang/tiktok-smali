package com.ss.android.newmedia.redbadge;

import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.os.Message;
import android.text.format.DateUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.b.e;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.newmedia.redbadge.b.a;
import com.ss.android.pushmanager.a.b;
import org.json.JSONObject;

public class b implements WeakHandler.IHandler {

    /* renamed from: g  reason: collision with root package name */
    private static volatile b f59996g;

    /* renamed from: a  reason: collision with root package name */
    public Context f59997a;

    /* renamed from: b  reason: collision with root package name */
    public WeakHandler f59998b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f59999c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f60000d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f60001e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f60002f = new Runnable() {
        /* class com.ss.android.newmedia.redbadge.b.AnonymousClass2 */

        static {
            Covode.recordClassIndex(37094);
        }

        public final void run() {
            if (b.this.f59997a != null) {
                Logger.debug();
                if (b.this.f60001e) {
                    b.this.f60001e = false;
                    b.this.f59998b.sendEmptyMessage(1);
                }
            }
        }
    };

    /* renamed from: h  reason: collision with root package name */
    private int f60003h;

    /* renamed from: i  reason: collision with root package name */
    private int f60004i;

    /* renamed from: j  reason: collision with root package name */
    private a f60005j;

    /* renamed from: k  reason: collision with root package name */
    private a f60006k;

    /* renamed from: l  reason: collision with root package name */
    private ContentObserver f60007l = new ContentObserver(this.f59998b) {
        /* class com.ss.android.newmedia.redbadge.b.AnonymousClass3 */

        static {
            Covode.recordClassIndex(37095);
        }

        public final void onChange(boolean z) {
            Logger.debug();
            b.this.a();
        }
    };

    /* renamed from: m  reason: collision with root package name */
    private ContentObserver f60008m = new ContentObserver(this.f59998b) {
        /* class com.ss.android.newmedia.redbadge.b.AnonymousClass4 */

        static {
            Covode.recordClassIndex(37096);
        }

        public final void onChange(boolean z) {
            Logger.debug();
            b.this.a();
        }
    };

    static {
        Covode.recordClassIndex(37092);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f60013a;

        /* renamed from: b  reason: collision with root package name */
        long f60014b;

        /* renamed from: c  reason: collision with root package name */
        long f60015c;

        static {
            Covode.recordClassIndex(37097);
        }

        private a() {
        }

        /* access modifiers changed from: package-private */
        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("launch", this.f60013a);
                jSONObject.put("leave", this.f60014b);
                jSONObject.put("badge", this.f60015c);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        static a a(String str) {
            a aVar = new a();
            try {
                JSONObject jSONObject = new JSONObject(str);
                aVar.f60013a = jSONObject.optLong("launch", 0);
                aVar.f60014b = jSONObject.optLong("leave", 0);
                aVar.f60015c = jSONObject.optLong("badge", 0);
            } catch (Throwable unused) {
            }
            return aVar;
        }
    }

    public final void a() {
        this.f59999c = a.a(this.f59997a).a();
    }

    public final void b() {
        if (this.f59997a != null) {
            if (this.f60001e) {
                this.f59998b.postDelayed(this.f60002f, 30000);
                this.f59998b.sendEmptyMessage(2);
            }
            Logger.debug();
        }
    }

    private void c() {
        String str;
        try {
            a.a(this.f59997a).b(this.f60003h);
            a.a(this.f59997a).c(this.f60004i);
            a a2 = a.a(this.f59997a);
            a aVar = this.f60005j;
            String str2 = "";
            if (aVar == null) {
                str = str2;
            } else {
                str = aVar.a().toString();
            }
            a2.a(str);
            a a3 = a.a(this.f59997a);
            a aVar2 = this.f60006k;
            if (aVar2 != null) {
                str2 = aVar2.a().toString();
            }
            a3.b(str2);
        } catch (Throwable unused) {
        }
    }

    static long a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return new JSONObject(str).optLong("rule_id");
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static b a(Context context) {
        MethodCollector.i(261);
        if (f59996g == null) {
            synchronized (b.class) {
                try {
                    if (f59996g == null) {
                        f59996g = new b(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(261);
                    throw th;
                }
            }
        }
        b bVar = f59996g;
        MethodCollector.o(261);
        return bVar;
    }

    public final void b(String str) {
        try {
            a.a(this.f59997a).c(str);
            e.a(new Runnable() {
                /* class com.ss.android.newmedia.redbadge.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(37093);
                }

                public final void run() {
                    b.AbstractC1307b a2 = com.ss.android.pushmanager.a.b.a();
                    if (a2 != null) {
                        a.a(b.this.f59997a).d(a2.d());
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message != null) {
            try {
                int i2 = message.what;
                if (i2 == 0) {
                    a(0);
                    e.a().a(this.f59997a, 0);
                    this.f60000d = false;
                    Logger.debug();
                    if (this.f59999c) {
                        Intent intent = new Intent(this.f59997a, RedBadgePushProcessService.class);
                        intent.putExtra("app_entrance", true);
                        a(this.f59997a, intent);
                    }
                } else if (i2 == 1) {
                    a(1);
                    Logger.debug();
                    if (this.f59999c) {
                        Intent intent2 = new Intent(this.f59997a, RedBadgePushProcessService.class);
                        intent2.putExtra("app_exit", true);
                        a(this.f59997a, intent2);
                    }
                } else if (i2 == 2) {
                    a(1);
                } else if (i2 == 3) {
                    e.a().a(this.f59997a, 0);
                    this.f60000d = false;
                    Logger.debug();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00a7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private b(android.content.Context r6) {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.redbadge.b.<init>(android.content.Context):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f60005j == null) {
                this.f60005j = new a((byte) 0);
            }
            if (this.f60006k == null) {
                this.f60006k = new a((byte) 0);
            }
            if (!DateUtils.isToday(this.f60005j.f60013a)) {
                this.f60003h = 0;
            }
            if (!DateUtils.isToday(this.f60005j.f60015c)) {
                this.f60004i = 0;
            }
            if (i2 == 0) {
                this.f60006k.f60013a = this.f60005j.f60013a;
                this.f60006k.f60014b = this.f60005j.f60014b;
                this.f60005j.f60013a = currentTimeMillis;
                this.f60005j.f60014b = currentTimeMillis + 900000;
                this.f60003h++;
            } else if (i2 == 1) {
                this.f60005j.f60014b = currentTimeMillis;
            } else if (i2 == 2) {
                this.f60006k.f60015c = this.f60005j.f60015c;
                this.f60005j.f60015c = currentTimeMillis;
                this.f60004i++;
            }
            c();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.redbadge.b.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, long j2, JSONObject jSONObject) {
        b.AbstractC1307b a2 = com.ss.android.pushmanager.a.b.a();
        if (a2 != null) {
            a2.a(this.f59997a, "event_v1", "red_badge", str, j2, 0, jSONObject);
        }
    }
}
