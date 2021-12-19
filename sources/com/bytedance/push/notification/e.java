package com.bytedance.push.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.settings.LocalFrequencySettings;
import com.bytedance.push.settings.h;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class e {

    /* renamed from: a  reason: collision with root package name */
    static b f42254a;

    interface b {
        static {
            Covode.recordClassIndex(25817);
        }

        JSONArray a(Context context);

        void a(Context context, com.bytedance.push.f.a aVar);

        boolean a(Context context, int i2);

        void b(Context context, com.bytedance.push.f.a aVar);
    }

    static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private NotificationManager f42255a;

        static {
            Covode.recordClassIndex(25816);
        }

        @Override // com.bytedance.push.notification.e.b
        public void a(Context context, com.bytedance.push.f.a aVar) {
        }

        @Override // com.bytedance.push.notification.e.b
        public void b(Context context, com.bytedance.push.f.a aVar) {
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        @Override // com.bytedance.push.notification.e.b
        public JSONArray a(Context context) {
            return new JSONArray();
        }

        /* access modifiers changed from: package-private */
        public final NotificationManager b(Context context) {
            if (this.f42255a == null) {
                this.f42255a = (NotificationManager) a(context, "notification");
            }
            return this.f42255a;
        }

        @Override // com.bytedance.push.notification.e.b
        public boolean a(Context context, int i2) {
            if (com.ss.android.message.a.a.b(context) != i2) {
                return true;
            }
            return false;
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(6990);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        i.f107220b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (i.f107219a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                            } catch (Exception e2) {
                                d.a(e2, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        i.f107219a = false;
                    } finally {
                        MethodCollector.o(6990);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    static class c extends a {

        /* renamed from: a  reason: collision with root package name */
        private List<NotificationChannel> f42256a;

        static {
            Covode.recordClassIndex(25818);
        }

        private c() {
            super((byte) 0);
        }

        /* synthetic */ c(byte b2) {
            this();
        }

        @Override // com.bytedance.push.notification.e.b, com.bytedance.push.notification.e.a
        public final JSONArray a(Context context) {
            return a(c(context));
        }

        private static Map<String, com.bytedance.push.f.a> a(JSONArray jSONArray) {
            if (jSONArray.length() == 0) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap(jSONArray.length());
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                hashMap.put(optJSONObject.optString("id"), new com.bytedance.push.f.a(optJSONObject));
            }
            return hashMap;
        }

        private List<NotificationChannel> c(Context context) {
            List<NotificationChannel> list = this.f42256a;
            if (list == null || list.isEmpty()) {
                try {
                    this.f42256a = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannels();
                } catch (Throwable unused) {
                    this.f42256a = Collections.emptyList();
                }
            }
            return this.f42256a;
        }

        private boolean d(Context context) {
            try {
                List<NotificationChannel> c2 = c(context);
                String i2 = ((LocalFrequencySettings) h.a(context, LocalFrequencySettings.class)).i();
                if (TextUtils.isEmpty(i2)) {
                    if (c2 != null) {
                        if (!c2.isEmpty()) {
                            return true;
                        }
                    }
                    return false;
                } else if (!a(c2, a(new JSONArray(i2)))) {
                    return true;
                } else {
                    return false;
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
                return false;
            }
        }

        private static JSONArray a(List<NotificationChannel> list) {
            JSONArray jSONArray = new JSONArray();
            if (list == null) {
                return jSONArray;
            }
            for (NotificationChannel notificationChannel : list) {
                try {
                    com.bytedance.push.f.a aVar = new com.bytedance.push.f.a(notificationChannel);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", aVar.f42111c);
                    jSONObject.put(StringSet.name, aVar.f42112d);
                    jSONObject.put("importance", aVar.f42113e);
                    jSONObject.put("bypassDnd", aVar.f42114f);
                    jSONObject.put("lockscreenVisibility", aVar.f42115g);
                    jSONObject.put("lights", aVar.f42116h);
                    jSONObject.put("vibration", aVar.f42117i);
                    jSONObject.put("showBadge", aVar.f42118j);
                    jSONObject.put("enable", aVar.f42110b);
                    jSONObject.put("desc", aVar.f42109a);
                    jSONArray.put(jSONObject);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            return jSONArray;
        }

        @Override // com.bytedance.push.notification.e.b, com.bytedance.push.notification.e.a
        public final boolean a(Context context, int i2) {
            if (super.a(context, i2)) {
                return true;
            }
            return d(context);
        }

        @Override // com.bytedance.push.notification.e.b, com.bytedance.push.notification.e.a
        public final void b(Context context, com.bytedance.push.f.a aVar) {
            NotificationManager b2;
            if (aVar != null && (b2 = b(context)) != null && !TextUtils.isEmpty(aVar.f42111c) && b2.getNotificationChannel(aVar.f42111c) != null) {
                b2.deleteNotificationChannel(aVar.f42111c);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x0016  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean a(java.util.List<android.app.NotificationChannel> r6, java.util.Map<java.lang.String, com.bytedance.push.f.a> r7) {
            /*
                int r1 = r6.size()
                int r0 = r7.size()
                r5 = 0
                if (r1 == r0) goto L_0x000c
                return r5
            L_0x000c:
                java.util.Iterator r4 = r6.iterator()
            L_0x0010:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x0056
                java.lang.Object r3 = r4.next()
                android.app.NotificationChannel r3 = (android.app.NotificationChannel) r3
                java.lang.String r0 = r3.getId()
                java.lang.Object r2 = r7.get(r0)
                com.bytedance.push.f.a r2 = (com.bytedance.push.f.a) r2
                if (r2 != 0) goto L_0x0029
                return r5
            L_0x0029:
                int r1 = r2.f42113e
                int r0 = r3.getImportance()
                if (r1 == r0) goto L_0x0032
                return r5
            L_0x0032:
                int r1 = r2.f42115g
                int r0 = r3.getLockscreenVisibility()
                if (r1 == r0) goto L_0x003b
                return r5
            L_0x003b:
                boolean r1 = r2.f42114f
                boolean r0 = r3.canBypassDnd()
                if (r1 == r0) goto L_0x0044
                return r5
            L_0x0044:
                boolean r1 = r2.f42116h
                boolean r0 = r3.shouldShowLights()
                if (r1 == r0) goto L_0x004d
                return r5
            L_0x004d:
                boolean r1 = r2.f42117i
                boolean r0 = r3.shouldVibrate()
                if (r1 == r0) goto L_0x0010
                return r5
            L_0x0056:
                r0 = 1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.notification.e.c.a(java.util.List, java.util.Map):boolean");
        }

        @Override // com.bytedance.push.notification.e.b, com.bytedance.push.notification.e.a
        public final void a(Context context, com.bytedance.push.f.a aVar) {
            NotificationManager b2;
            if (aVar != null && (b2 = b(context)) != null && !TextUtils.isEmpty(aVar.f42111c) && !TextUtils.isEmpty(aVar.f42112d) && b2.getNotificationChannel(aVar.f42111c) == null) {
                int i2 = aVar.f42113e;
                if (i2 < 0 || i2 > 5) {
                    i2 = 3;
                }
                NotificationChannel notificationChannel = new NotificationChannel(aVar.f42111c, aVar.f42112d, i2);
                notificationChannel.setShowBadge(aVar.f42118j);
                notificationChannel.setDescription(aVar.f42109a);
                notificationChannel.enableVibration(aVar.f42117i);
                notificationChannel.setBypassDnd(aVar.f42114f);
                notificationChannel.enableLights(aVar.f42116h);
                notificationChannel.setLockscreenVisibility(aVar.f42115g);
                b2.createNotificationChannel(notificationChannel);
            }
        }
    }

    static {
        Covode.recordClassIndex(25815);
        if (Build.VERSION.SDK_INT >= 26) {
            f42254a = new c((byte) 0);
        } else {
            f42254a = new a((byte) 0);
        }
    }
}
