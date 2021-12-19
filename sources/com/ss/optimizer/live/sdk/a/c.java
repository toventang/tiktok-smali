package com.ss.optimizer.live.sdk.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    final String f151650a;

    /* renamed from: b  reason: collision with root package name */
    final String f151651b;

    /* renamed from: c  reason: collision with root package name */
    final b f151652c;

    /* renamed from: d  reason: collision with root package name */
    final List<Pair<String, String>> f151653d;

    /* renamed from: e  reason: collision with root package name */
    final ThreadPoolExecutor f151654e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f151655f;

    /* renamed from: g  reason: collision with root package name */
    final Map<String, Integer> f151656g;

    /* renamed from: h  reason: collision with root package name */
    long f151657h;

    /* renamed from: i  reason: collision with root package name */
    int f151658i;

    static {
        Covode.recordClassIndex(101179);
    }

    static class b implements b {
        static {
            Covode.recordClassIndex(101181);
        }

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        @Override // com.ss.optimizer.live.sdk.a.b
        public final String a(String str) {
            throw new RuntimeException("no implementation");
        }

        @Override // com.ss.optimizer.live.sdk.a.b
        public final String a(String str, byte[] bArr, String str2) {
            throw new RuntimeException("no implementation");
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f151659a;

        /* renamed from: b  reason: collision with root package name */
        public String f151660b;

        /* renamed from: c  reason: collision with root package name */
        public String f151661c;

        /* renamed from: d  reason: collision with root package name */
        public int f151662d;

        /* renamed from: e  reason: collision with root package name */
        public b f151663e;

        /* renamed from: f  reason: collision with root package name */
        public ThreadPoolExecutor f151664f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f151665g;

        /* renamed from: h  reason: collision with root package name */
        public Map<String, Integer> f151666h;

        static {
            Covode.recordClassIndex(101180);
        }

        public final c a() {
            return new c(this, (byte) 0);
        }
    }

    private c(a aVar) {
        this.f151657h = 10000;
        this.f151658i = 5;
        String str = aVar.f151659a;
        this.f151650a = str;
        this.f151651b = aVar.f151660b;
        if (aVar.f151663e == null) {
            this.f151652c = new b((byte) 0);
        } else {
            this.f151652c = aVar.f151663e;
        }
        ArrayList arrayList = new ArrayList();
        this.f151653d = arrayList;
        if (str != null) {
            arrayList.add(Pair.create("ProjectKey", str));
        }
        if (aVar.f151661c != null) {
            arrayList.add(Pair.create("DeviceId", aVar.f151661c));
        }
        this.f151654e = aVar.f151664f;
        this.f151655f = aVar.f151665g;
        Map<String, Integer> map = aVar.f151666h;
        this.f151656g = map;
        if (map != null) {
            if (map.containsKey("request_retry_interval")) {
                this.f151657h = (long) map.get("request_retry_interval").intValue();
            }
            if (map.containsKey("request_max_retry_times")) {
                this.f151658i = map.get("request_max_retry_times").intValue();
            }
        }
    }

    /* synthetic */ c(a aVar, byte b2) {
        this(aVar);
    }
}
