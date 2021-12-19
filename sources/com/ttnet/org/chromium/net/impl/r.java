package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.ac;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;

public final class r extends ac {

    /* renamed from: a  reason: collision with root package name */
    final a f155818a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f155819b;

    /* renamed from: c  reason: collision with root package name */
    private final int f155820c;

    /* renamed from: d  reason: collision with root package name */
    private final String f155821d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f155822e;

    /* renamed from: f  reason: collision with root package name */
    private final String f155823f;

    /* renamed from: g  reason: collision with root package name */
    private final String f155824g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicLong f155825h;

    static {
        Covode.recordClassIndex(103540);
    }

    @Override // com.ttnet.org.chromium.net.ac
    public final int a() {
        return this.f155820c;
    }

    @Override // com.ttnet.org.chromium.net.ac
    public final String b() {
        return this.f155821d;
    }

    @Override // com.ttnet.org.chromium.net.ac
    public final List<Map.Entry<String, String>> c() {
        return this.f155818a.f155826a;
    }

    public static final class a extends ac.a {

        /* renamed from: a  reason: collision with root package name */
        final List<Map.Entry<String, String>> f155826a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, List<String>> f155827b;

        static {
            Covode.recordClassIndex(103541);
        }

        public final Map<String, List<String>> a() {
            Map<String, List<String>> map = this.f155827b;
            if (map != null) {
                return map;
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (Map.Entry<String, String> entry : this.f155826a) {
                ArrayList arrayList = new ArrayList();
                if (treeMap.containsKey(entry.getKey())) {
                    arrayList.addAll((Collection) treeMap.get(entry.getKey()));
                }
                arrayList.add(entry.getValue());
                treeMap.put(entry.getKey(), Collections.unmodifiableList(arrayList));
            }
            Map<String, List<String>> unmodifiableMap = Collections.unmodifiableMap(treeMap);
            this.f155827b = unmodifiableMap;
            return unmodifiableMap;
        }

        a(List<Map.Entry<String, String>> list) {
            this.f155826a = list;
        }
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        List<String> list = this.f155819b;
        return com.a.a(locale, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", new Object[]{Integer.toHexString(System.identityHashCode(this)), list.get(list.size() - 1), this.f155819b.toString(), Integer.valueOf(this.f155820c), this.f155821d, this.f155818a.f155826a.toString(), Boolean.valueOf(this.f155822e), this.f155823f, this.f155824g, Long.valueOf(this.f155825h.get())});
    }

    public final void a(long j2) {
        this.f155825h.set(j2);
    }

    public r(List<String> list, int i2, String str, List<Map.Entry<String, String>> list2, boolean z, String str2, String str3, long j2) {
        this.f155819b = Collections.unmodifiableList(list);
        this.f155820c = i2;
        this.f155821d = str;
        this.f155818a = new a(Collections.unmodifiableList(list2));
        this.f155822e = z;
        this.f155823f = str2;
        this.f155824g = str3;
        this.f155825h = new AtomicLong(j2);
    }
}
