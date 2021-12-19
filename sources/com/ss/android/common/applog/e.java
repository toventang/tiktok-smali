package com.ss.android.common.applog;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.common.utility.b;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bf.d;
import java.util.HashMap;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public Context f59253a;

    /* renamed from: b  reason: collision with root package name */
    a f59254b = new a(this, (byte) 0);

    static {
        Covode.recordClassIndex(36618);
    }

    /* access modifiers changed from: package-private */
    public class a {

        /* renamed from: b  reason: collision with root package name */
        private final long[][] f59256b;

        /* renamed from: c  reason: collision with root package name */
        private Map<String, C1292a> f59257c;

        static {
            Covode.recordClassIndex(36619);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.common.applog.e$a$a  reason: collision with other inner class name */
        public class C1292a {

            /* renamed from: a  reason: collision with root package name */
            int f59258a;

            /* renamed from: b  reason: collision with root package name */
            int f59259b;

            /* renamed from: c  reason: collision with root package name */
            int f59260c;

            /* renamed from: d  reason: collision with root package name */
            long f59261d;

            /* renamed from: e  reason: collision with root package name */
            long f59262e;

            static {
                Covode.recordClassIndex(36620);
            }

            C1292a() {
            }

            /* access modifiers changed from: package-private */
            public final void a(C1292a aVar) {
                this.f59258a = aVar.f59258a;
                this.f59259b = aVar.f59259b;
                this.f59260c = aVar.f59260c;
                this.f59261d = aVar.f59261d;
                this.f59262e = aVar.f59262e;
            }
        }

        public final synchronized boolean b(String str) {
            MethodCollector.i(7669);
            if (!m.a(str) && this.f59257c.containsKey(str)) {
                C1292a aVar = this.f59257c.get(str);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - aVar.f59261d >= this.f59256b[aVar.f59258a][0]) {
                    aVar.f59259b = 1;
                    aVar.f59261d = currentTimeMillis;
                } else if (((long) aVar.f59259b) < this.f59256b[aVar.f59258a][2]) {
                    aVar.f59259b++;
                } else {
                    MethodCollector.o(7669);
                    return false;
                }
            }
            MethodCollector.o(7669);
            return true;
        }

        private a() {
            this.f59256b = new long[][]{new long[]{120000, 0, 12}, new long[]{120000, 5, 1}, new long[]{240000, 5, 1}, new long[]{480000, 4, 1}, new long[]{960000, 2, 1}};
            this.f59257c = new HashMap();
        }

        public final synchronized void a(String str) {
            MethodCollector.i(7660);
            if (!m.a(str) && !this.f59257c.containsKey(str)) {
                C1292a aVar = new C1292a();
                SharedPreferences a2 = d.a(e.this.f59253a, com.ss.android.deviceregister.a.a.f59402a, 0);
                if (System.currentTimeMillis() - a2.getLong(str + "_downgrade_time", 0) < 10800000) {
                    aVar.f59258a = a2.getInt(str + "_downgrade_index", 0);
                } else {
                    a2.edit().remove(str + "_downgrade_time").remove(str + "_downgrade_index").commit();
                }
                this.f59257c.put(str, aVar);
            }
            MethodCollector.o(7660);
        }

        /* synthetic */ a(e eVar, byte b2) {
            this();
        }

        public final synchronized void a(int i2, String[] strArr) {
            MethodCollector.i(7780);
            String str = strArr[i2];
            if (!m.a(str) && this.f59257c.containsKey(str)) {
                C1292a aVar = this.f59257c.get(str);
                long currentTimeMillis = System.currentTimeMillis();
                if (((long) aVar.f59260c) < this.f59256b[aVar.f59258a][1] && currentTimeMillis - aVar.f59262e <= 1800000) {
                    aVar.f59260c++;
                } else if (aVar.f59258a > 0) {
                    aVar.f59258a--;
                    aVar.f59259b = 1;
                    aVar.f59260c = 1;
                    aVar.f59261d = currentTimeMillis;
                    aVar.f59262e = currentTimeMillis;
                    SharedPreferences.Editor edit = d.a(e.this.f59253a, com.ss.android.deviceregister.a.a.f59402a, 0).edit();
                    for (String str2 : strArr) {
                        if (!m.a(str2) && !str2.equals(str) && this.f59257c.containsKey(str2)) {
                            C1292a aVar2 = this.f59257c.get(str2);
                            aVar2.a(aVar);
                            edit.putLong(str2 + "_downgrade_time", currentTimeMillis);
                            edit.putInt(str2 + "_downgrade_index", aVar2.f59258a);
                        }
                    }
                    edit.putLong(str + "_downgrade_time", currentTimeMillis);
                    edit.putInt(str + "_downgrade_index", aVar.f59258a);
                    edit.commit();
                    MethodCollector.o(7780);
                    return;
                }
            }
            MethodCollector.o(7780);
        }

        public final synchronized void a(int i2, String[] strArr, Throwable th) {
            int responseCode;
            MethodCollector.i(7696);
            if ((th instanceof b) && (responseCode = ((b) th).getResponseCode()) >= 500 && responseCode < 600) {
                String str = strArr[i2];
                if (!m.a(str) && this.f59257c.containsKey(str)) {
                    C1292a aVar = this.f59257c.get(str);
                    if (aVar.f59258a < this.f59256b.length - 1) {
                        aVar.f59258a++;
                        aVar.f59259b = 1;
                        aVar.f59260c = 0;
                        long currentTimeMillis = System.currentTimeMillis();
                        aVar.f59261d = currentTimeMillis;
                        aVar.f59262e = currentTimeMillis;
                        SharedPreferences.Editor edit = d.a(e.this.f59253a, com.ss.android.deviceregister.a.a.f59402a, 0).edit();
                        for (String str2 : strArr) {
                            if (!m.a(str2) && !str2.equals(str) && this.f59257c.containsKey(str2)) {
                                C1292a aVar2 = this.f59257c.get(str2);
                                aVar2.a(aVar);
                                edit.putLong(str2 + "_downgrade_time", currentTimeMillis);
                                edit.putInt(str2 + "_downgrade_index", aVar2.f59258a);
                            }
                        }
                        edit.putLong(str + "_downgrade_time", currentTimeMillis);
                        edit.putInt(str + "_downgrade_index", aVar.f59258a);
                        edit.commit();
                        MethodCollector.o(7696);
                        return;
                    }
                    aVar.f59260c = 0;
                }
            }
            MethodCollector.o(7696);
        }
    }

    public e(Context context) {
        this.f59253a = context;
    }
}
