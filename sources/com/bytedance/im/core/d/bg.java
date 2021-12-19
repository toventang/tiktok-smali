package com.bytedance.im.core.d;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.internal.b.a.k;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.im.core.internal.utils.j;
import com.bytedance.im.core.internal.utils.s;
import com.bytedance.im.core.proto.DeleteMessageRequestBody;
import com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class bg {

    /* renamed from: a  reason: collision with root package name */
    public static final int f37911a = d.a().b().au;

    /* renamed from: b  reason: collision with root package name */
    public static c f37912b = null;

    /* renamed from: c  reason: collision with root package name */
    private static long f37913c = 0;

    public interface c {
        static {
            Covode.recordClassIndex(22749);
        }

        void a();

        void a(int i2, Long l2, DeleteMessageRequestBody deleteMessageRequestBody);

        void a(int i2, Long l2, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody);

        Map<Long, o> b();
    }

    public static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final Map<Long, o> f37915a = new ConcurrentHashMap();

        /* renamed from: b  reason: collision with root package name */
        public volatile boolean f37916b = false;

        static {
            Covode.recordClassIndex(22745);
        }

        private void c() {
            com.bytedance.im.core.internal.e.a.d().execute(new Runnable() {
                /* class com.bytedance.im.core.d.bg.b.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(22748);
                }

                public final void run() {
                    try {
                        String b2 = h.f38770a.b(b.this.f37915a);
                        if (b2 == null) {
                            b2 = "";
                        }
                        s.a();
                        s.f38859a.a(s.a("wait_del_message"), b2);
                        f.b("imsdk", "WaitDelCon_FileStore updateSp, cache:" + b.this.f37915a.size(), (Throwable) null);
                    } catch (Throwable th) {
                        j.b("WaitDelCon_FileStore updateSp error ", th);
                    }
                }
            });
        }

        @Override // com.bytedance.im.core.d.bg.c
        public final void a() {
            com.bytedance.im.core.internal.e.a.a().execute(new Runnable() {
                /* class com.bytedance.im.core.d.bg.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22746);
                }

                public final void run() {
                    b bVar = b.this;
                    s.a();
                    String b2 = s.f38859a.b(s.a("wait_del_message"), "");
                    if (!TextUtils.isEmpty(b2)) {
                        try {
                            Map<? extends Long, ? extends o> map = (Map) h.f38770a.a(b2, new com.google.gson.b.a<ConcurrentHashMap<Long, o>>() {
                                /* class com.bytedance.im.core.d.bg.b.AnonymousClass2 */

                                static {
                                    Covode.recordClassIndex(22747);
                                }
                            }.type);
                            if (map != null) {
                                bVar.f37915a.putAll(map);
                            }
                            f.b("imsdk", "WaitDelCon_FileStore initFromSp success, cache:" + bVar.f37915a.size(), (Throwable) null);
                        } catch (Throwable th) {
                            j.b("WaitDelCon_FileStore initFromSp error, json:".concat(String.valueOf(b2)), th);
                        }
                    }
                    b.this.f37916b = true;
                }
            });
        }

        @Override // com.bytedance.im.core.d.bg.c
        public final Map<Long, o> b() {
            f.b("imsdk", "WaitDelCon_FileStore trigger, cache:" + this.f37915a.size() + ", isInit:" + this.f37916b, (Throwable) null);
            if (this.f37915a.isEmpty()) {
                return new HashMap();
            }
            for (o oVar : this.f37915a.values()) {
                oVar.retryTimes = Integer.valueOf(oVar.retryTimes.intValue() + 1);
            }
            HashMap hashMap = new HashMap(this.f37915a);
            if (bg.f37911a != 5) {
                this.f37915a.clear();
            }
            c();
            return hashMap;
        }

        @Override // com.bytedance.im.core.d.bg.c
        public final void a(int i2, Long l2, DeleteMessageRequestBody deleteMessageRequestBody) {
            if (deleteMessageRequestBody == null) {
                f.b("imsdk", "WaitDelCon_FileStore add, invalid param, msgId:".concat(String.valueOf(l2)), (Throwable) null);
                return;
            }
            if (!this.f37916b) {
                f.b("imsdk", "WaitDelCon_FileStore add, not init, msgId:".concat(String.valueOf(l2)), (Throwable) null);
            }
            if (this.f37915a.containsKey(l2)) {
                f.b("imsdk", "WaitDelCon_FileStore , add, already in cache, msgId:".concat(String.valueOf(l2)), (Throwable) null);
            }
            this.f37915a.put(deleteMessageRequestBody.message_id, o.fromReqBody(i2, deleteMessageRequestBody));
            c();
        }

        @Override // com.bytedance.im.core.d.bg.c
        public final void a(int i2, Long l2, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody) {
            if (deleteStrangerMessageRequestBody == null) {
                f.b("imsdk", "WaitDelCon_FileStore add, invalid param, msgId:".concat(String.valueOf(l2)), (Throwable) null);
                return;
            }
            if (!this.f37916b) {
                f.b("imsdk", "WaitDelCon_FileStore add, not init, msgId:".concat(String.valueOf(l2)), (Throwable) null);
            }
            if (this.f37915a.containsKey(l2)) {
                f.b("imsdk", "WaitDelCon_FileStore , add, already in cache, msgId:".concat(String.valueOf(l2)), (Throwable) null);
            }
            this.f37915a.put(deleteStrangerMessageRequestBody.server_message_id, o.fromReqBody(i2, deleteStrangerMessageRequestBody));
            c();
        }
    }

    static {
        Covode.recordClassIndex(22743);
    }

    public static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final Map<Long, o> f37914a = new ConcurrentHashMap();

        static {
            Covode.recordClassIndex(22744);
        }

        @Override // com.bytedance.im.core.d.bg.c
        public final void a() {
        }

        @Override // com.bytedance.im.core.d.bg.c
        public final Map<Long, o> b() {
            for (o oVar : this.f37914a.values()) {
                oVar.retryTimes = Integer.valueOf(oVar.retryTimes.intValue() + 1);
            }
            HashMap hashMap = new HashMap(this.f37914a);
            this.f37914a.clear();
            return hashMap;
        }

        @Override // com.bytedance.im.core.d.bg.c
        public final void a(int i2, Long l2, DeleteMessageRequestBody deleteMessageRequestBody) {
            if (deleteMessageRequestBody == null) {
                f.b("imsdk", "WaitDelCon_CacheStoreadd, invalid param, msgId:".concat(String.valueOf(l2)), (Throwable) null);
                return;
            }
            if (this.f37914a.containsKey(l2)) {
                f.b("imsdk", "WaitDelCon_CacheStore, add, already in cache, msgId:".concat(String.valueOf(l2)), (Throwable) null);
            }
            this.f37914a.put(deleteMessageRequestBody.message_id, o.fromReqBody(i2, deleteMessageRequestBody));
        }

        @Override // com.bytedance.im.core.d.bg.c
        public final void a(int i2, Long l2, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody) {
            if (deleteStrangerMessageRequestBody == null) {
                f.b("imsdk", "WaitDelCon_CacheStoreadd, invalid param, msgId:".concat(String.valueOf(l2)), (Throwable) null);
                return;
            }
            if (this.f37914a.containsKey(l2)) {
                f.b("imsdk", "WaitDelCon_CacheStore, add, already in cache, msgId:".concat(String.valueOf(l2)), (Throwable) null);
            }
            this.f37914a.put(deleteStrangerMessageRequestBody.server_message_id, o.fromReqBody(i2, deleteStrangerMessageRequestBody));
        }
    }

    public static void a() {
        if (f37912b == null) {
            f.b("imsdk", "WaitDelCon trigger, store null", (Throwable) null);
        } else if (SystemClock.uptimeMillis() - f37913c <= 30000) {
            f.b("imsdk", "WaitDelCon trigger, time limit", (Throwable) null);
        } else {
            f37913c = SystemClock.uptimeMillis();
            Map<Long, o> b2 = f37912b.b();
            f.b("imsdk", "WaitDelCon trigger, map:" + b2.size() + ", mode:" + f37911a, (Throwable) null);
            for (Map.Entry<Long, o> entry : b2.entrySet()) {
                Long key = entry.getKey();
                o value = entry.getValue();
                if (value == null) {
                    f.b("imsdk", "WaitDelCon trigger, invalid request, msgId:".concat(String.valueOf(key)), (Throwable) null);
                } else {
                    new k(value.isStranger, null).a(value);
                }
            }
        }
    }
}
