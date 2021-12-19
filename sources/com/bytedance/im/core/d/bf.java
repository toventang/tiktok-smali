package com.bytedance.im.core.d;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.im.core.internal.utils.j;
import com.bytedance.im.core.internal.utils.s;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class bf {

    /* renamed from: a  reason: collision with root package name */
    public static final int f37900a = d.a().b().as;

    /* renamed from: b  reason: collision with root package name */
    public static c f37901b = null;

    /* renamed from: c  reason: collision with root package name */
    private static long f37902c = 0;

    public interface c {
        static {
            Covode.recordClassIndex(22742);
        }

        void a();

        void a(int i2, String str, DeleteConversationRequestBody deleteConversationRequestBody);

        void a(String str);

        Map<String, n> b();
    }

    public static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, n> f37906a = new ConcurrentHashMap();

        /* renamed from: b  reason: collision with root package name */
        public volatile boolean f37907b = false;

        static {
            Covode.recordClassIndex(22738);
        }

        private void c() {
            com.bytedance.im.core.internal.e.a.d().execute(new Runnable() {
                /* class com.bytedance.im.core.d.bf.b.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(22741);
                }

                public final void run() {
                    try {
                        String b2 = h.f38770a.b(b.this.f37906a);
                        if (b2 == null) {
                            b2 = "";
                        }
                        s.a();
                        s.f38859a.a(s.a("wait_del_conversation"), b2);
                        f.b("imsdk", "WaitDelCon_FileStore updateSp, cache:" + b.this.f37906a.size(), (Throwable) null);
                    } catch (Throwable th) {
                        j.b("WaitDelCon_FileStore updateSp error ", th);
                    }
                }
            });
        }

        @Override // com.bytedance.im.core.d.bf.c
        public final void a() {
            com.bytedance.im.core.internal.e.a.a().execute(new Runnable() {
                /* class com.bytedance.im.core.d.bf.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22739);
                }

                public final void run() {
                    b bVar = b.this;
                    s.a();
                    String b2 = s.f38859a.b(s.a("wait_del_conversation"), "");
                    if (!TextUtils.isEmpty(b2)) {
                        try {
                            Map<? extends String, ? extends n> map = (Map) h.f38770a.a(b2, new com.google.gson.b.a<ConcurrentHashMap<String, n>>() {
                                /* class com.bytedance.im.core.d.bf.b.AnonymousClass2 */

                                static {
                                    Covode.recordClassIndex(22740);
                                }
                            }.type);
                            if (map != null) {
                                bVar.f37906a.putAll(map);
                            }
                            f.b("imsdk", "WaitDelCon_FileStore initFromSp success, cache:" + bVar.f37906a.size(), (Throwable) null);
                        } catch (Throwable th) {
                            j.b("WaitDelCon_FileStore initFromSp error, json:".concat(String.valueOf(b2)), th);
                        }
                    }
                    b.this.f37907b = true;
                }
            });
        }

        @Override // com.bytedance.im.core.d.bf.c
        public final Map<String, n> b() {
            f.b("imsdk", "WaitDelCon_FileStore trigger, cache:" + this.f37906a.size() + ", isInit:" + this.f37907b, (Throwable) null);
            if (this.f37906a.isEmpty()) {
                return new HashMap();
            }
            for (n nVar : this.f37906a.values()) {
                nVar.retryTimes++;
            }
            HashMap hashMap = new HashMap(this.f37906a);
            if (bf.f37900a != 2) {
                this.f37906a.clear();
            }
            c();
            return hashMap;
        }

        @Override // com.bytedance.im.core.d.bf.c
        public final void a(String str) {
            if (TextUtils.isEmpty(str)) {
                f.b("imsdk", "WaitDelCon_FileStore remove, invalid cid:".concat(String.valueOf(str)), (Throwable) null);
            } else if (this.f37906a.remove(str) == null) {
                f.b("imsdk", "WaitDelCon_FileStore remove not exist, cid:".concat(String.valueOf(str)), (Throwable) null);
            } else {
                c();
            }
        }

        @Override // com.bytedance.im.core.d.bf.c
        public final void a(int i2, String str, DeleteConversationRequestBody deleteConversationRequestBody) {
            if (TextUtils.isEmpty(str) || deleteConversationRequestBody == null) {
                f.b("imsdk", "WaitDelCon_FileStore add, invalid param, cid:".concat(String.valueOf(str)), (Throwable) null);
                return;
            }
            if (!this.f37907b) {
                f.b("imsdk", "WaitDelCon_FileStore add, not init, cid:".concat(String.valueOf(str)), (Throwable) null);
            }
            if (this.f37906a.containsKey(str)) {
                f.b("imsdk", "WaitDelCon_FileStore , add, already in cache, cid:".concat(String.valueOf(str)), (Throwable) null);
            }
            this.f37906a.put(str, n.fromReqBody(i2, str, deleteConversationRequestBody));
            c();
        }
    }

    static {
        Covode.recordClassIndex(22735);
    }

    public static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, n> f37905a = new ConcurrentHashMap();

        static {
            Covode.recordClassIndex(22737);
        }

        @Override // com.bytedance.im.core.d.bf.c
        public final void a() {
        }

        @Override // com.bytedance.im.core.d.bf.c
        public final Map<String, n> b() {
            for (n nVar : this.f37905a.values()) {
                nVar.retryTimes++;
            }
            HashMap hashMap = new HashMap(this.f37905a);
            this.f37905a.clear();
            return hashMap;
        }

        @Override // com.bytedance.im.core.d.bf.c
        public final void a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f37905a.remove(str);
            }
        }

        @Override // com.bytedance.im.core.d.bf.c
        public final void a(int i2, String str, DeleteConversationRequestBody deleteConversationRequestBody) {
            if (TextUtils.isEmpty(str) || deleteConversationRequestBody == null) {
                f.b("imsdk", "WaitDelCon_CacheStoreadd, invalid param, cid:".concat(String.valueOf(str)), (Throwable) null);
                return;
            }
            if (this.f37905a.containsKey(str)) {
                f.b("imsdk", "WaitDelCon_CacheStore, add, already in cache, cid:".concat(String.valueOf(str)), (Throwable) null);
            }
            this.f37905a.put(str, n.fromReqBody(i2, str, deleteConversationRequestBody));
        }
    }

    public static void a() {
        StringBuilder sb = new StringBuilder("WaitDelCon onLogin, mode:");
        int i2 = f37900a;
        f.b("imsdk", sb.append(i2).toString(), (Throwable) null);
        if (i2 == 0) {
            f37901b = new a();
        } else {
            f37901b = new b();
        }
        f37901b.a();
    }

    public static void b() {
        if (f37901b == null) {
            f.b("imsdk", "WaitDelCon trigger, store null", (Throwable) null);
        } else if (SystemClock.uptimeMillis() - f37902c <= 30000) {
            f.b("imsdk", "WaitDelCon trigger, time limit", (Throwable) null);
        } else {
            f37902c = SystemClock.uptimeMillis();
            Map<String, n> b2 = f37901b.b();
            f.b("imsdk", "WaitDelCon trigger, map:" + b2.size() + ", mode:" + f37900a, (Throwable) null);
            for (Map.Entry<String, n> entry : b2.entrySet()) {
                final String key = entry.getKey();
                final n value = entry.getValue();
                if (value == null) {
                    f.b("imsdk", "WaitDelCon trigger, invalid request, cid:".concat(String.valueOf(key)), (Throwable) null);
                } else if (com.bytedance.im.core.internal.b.a.a(value.inboxType, key)) {
                    f.b("imsdk", "WaitDelCon trigger, cid:" + key + " conversation waiting to create", (Throwable) null);
                } else {
                    j.a().b(key, new com.bytedance.im.core.a.a.b<h>() {
                        /* class com.bytedance.im.core.d.bf.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(22736);
                        }

                        @Override // com.bytedance.im.core.a.a.b
                        public final void a(u uVar) {
                            new com.bytedance.im.core.internal.b.a.j().a(value);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.bytedance.im.core.a.a.b
                        public final /* synthetic */ void a(h hVar) {
                            if (hVar == null) {
                                new com.bytedance.im.core.internal.b.a.j().a(value);
                            } else {
                                f.b("imsdk", "WaitDelCon trigger, cid:" + key + " conversation ever created after deleted", (Throwable) null);
                            }
                        }
                    });
                }
            }
        }
    }
}
