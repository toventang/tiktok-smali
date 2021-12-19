package com.ss.android.ugc.aweme.simkit.impl.a;

import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper;
import com.ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.ss.android.ugc.aweme.simkit.api.d;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private final String f133505a = "SrStrategyV2";

    /* renamed from: b  reason: collision with root package name */
    private volatile long f133506b;

    /* renamed from: c  reason: collision with root package name */
    private volatile double f133507c = 0.2d;

    /* renamed from: d  reason: collision with root package name */
    private final LinkedList<Boolean> f133508d = new LinkedList<>();

    /* renamed from: e  reason: collision with root package name */
    private volatile float f133509e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f133510f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private volatile int f133511g;

    /* renamed from: h  reason: collision with root package name */
    private final h f133512h = i.a(m.SYNCHRONIZED, C3459c.f133519a);

    /* renamed from: i  reason: collision with root package name */
    private final Queue<a> f133513i = new ConcurrentLinkedQueue();

    /* renamed from: j  reason: collision with root package name */
    private final Map<String, Boolean> f133514j;

    static {
        Covode.recordClassIndex(87330);
    }

    private final com.ss.android.ugc.aweme.simkit.model.b.b c() {
        return (com.ss.android.ugc.aweme.simkit.model.b.b) this.f133512h.getValue();
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.d
    public final void b() {
    }

    public static final class b extends LinkedHashMap<String, Boolean> {
        static {
            Covode.recordClassIndex(87332);
        }

        b() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, Boolean>> entrySet() {
            return getEntries();
        }

        public final Set getEntries() {
            return super.entrySet();
        }

        public final Set getKeys() {
            return super.keySet();
        }

        public final int getSize() {
            return super.size();
        }

        public final Collection getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<String> keySet() {
            return getKeys();
        }

        public final int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Collection<Boolean> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(Boolean bool) {
            return super.containsValue((Object) bool);
        }

        public final /* bridge */ Boolean get(String str) {
            return (Boolean) super.get((Object) str);
        }

        public final /* bridge */ Boolean remove(String str) {
            return (Boolean) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof Boolean)) {
                return false;
            }
            return containsValue((Boolean) obj);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Boolean get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
            if (size() > 200) {
                return true;
            }
            return false;
        }

        public final /* bridge */ Boolean getOrDefault(String str, Boolean bool) {
            return (Boolean) super.getOrDefault((Object) str, (Object) bool);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Boolean getOrDefault(Object obj, Boolean bool) {
            if (!(obj instanceof String)) {
                return bool;
            }
            return getOrDefault((String) obj, bool);
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof Boolean)) {
                return remove((String) obj, (Boolean) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, Boolean bool) {
            return super.remove((Object) str, (Object) bool);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.simkit.impl.a.c$c  reason: collision with other inner class name */
    static final class C3459c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.simkit.model.b.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3459c f133519a = new C3459c();

        static {
            Covode.recordClassIndex(87333);
        }

        C3459c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.simkit.model.b.b invoke() {
            ICommonConfig commonConfig;
            com.ss.android.ugc.aweme.simkit.c a2 = com.ss.android.ugc.aweme.simkit.d.a();
            l.a((Object) a2, "");
            ISimKitConfig b2 = a2.b();
            if (b2 == null || (commonConfig = b2.getCommonConfig()) == null) {
                return null;
            }
            return commonConfig.getSuperResolutionStrategyConfigV2();
        }
    }

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f133515a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f133516b;

        /* renamed from: c  reason: collision with root package name */
        public final long f133517c;

        /* renamed from: d  reason: collision with root package name */
        public final int f133518d;

        static {
            Covode.recordClassIndex(87331);
        }

        public final String toString() {
            return "awemeId " + this.f133515a + " isSr " + this.f133516b + " duration " + this.f133517c + " srFailReason " + this.f133518d;
        }
    }

    public c() {
        Map<String, Boolean> synchronizedMap = Collections.synchronizedMap(new b());
        l.a((Object) synchronizedMap, "");
        this.f133514j = synchronizedMap;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.d
    public final void a() {
        if (c() != null && System.currentTimeMillis() - this.f133506b >= 300000) {
            Intent b2 = b(com.ss.android.ugc.playerkit.simapicommon.a.f148866a, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (b2 != null) {
                double intExtra = (double) b2.getIntExtra("level", -1);
                double intExtra2 = (double) b2.getIntExtra("scale", -1);
                Double.isNaN(intExtra);
                Double.isNaN(intExtra2);
                Double valueOf = Double.valueOf(intExtra / intExtra2);
                if (valueOf != null) {
                    this.f133507c = valueOf.doubleValue();
                }
            }
            this.f133506b = System.currentTimeMillis();
        }
    }

    private static Intent a(Application application, IntentFilter intentFilter) {
        try {
            return application.registerReceiver(null, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(null, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    private static Intent b(Application application, IntentFilter intentFilter) {
        SecurityException securityException;
        com.ss.android.ugc.aweme.lancet.receiver.a.a(g.a());
        try {
            return a(application, intentFilter);
        } catch (Exception unused) {
            try {
                return ReceiverRegisterLancetHelper.registerReceiver(null, intentFilter);
            } catch (SecurityException e2) {
                securityException = e2;
                com.bytedance.c.a.a.a.b.a(securityException, "Register Receiver Exception");
                return null;
            } catch (IllegalArgumentException e3) {
                String message = e3.getMessage();
                securityException = e3;
                if (message != null) {
                    boolean contains = e3.getMessage().contains("regist too many Broadcast Receivers");
                    securityException = e3;
                    if (contains) {
                        throw e3;
                    }
                }
                com.bytedance.c.a.a.a.b.a(securityException, "Register Receiver Exception");
                return null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0196, code lost:
        if (r17 < (r0.longValue() * 1000)) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ee, code lost:
        if (r17 < (r0.longValue() * 1000)) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x010f, code lost:
        if (r17 > (r0.longValue() * 1000)) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0134, code lost:
        if (r17 < (r0.longValue() * 1000)) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0155, code lost:
        if (r17 > (r0.longValue() * 1000)) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0175, code lost:
        if (r17 < (r0.longValue() * 1000)) goto L_0x00f0;
     */
    @Override // com.ss.android.ugc.aweme.simkit.api.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.String r15, boolean r16, long r17, int r19, java.lang.String r20, float r21) {
        /*
        // Method dump skipped, instructions count: 641
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.simkit.impl.a.c.a(java.lang.String, boolean, long, int, java.lang.String, float):int");
    }
}
