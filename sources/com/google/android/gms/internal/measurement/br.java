package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class br<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f50717a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile ca f50718b = null;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicInteger f50719c = new AtomicInteger();

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f50720d = false;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReference<Collection<br<?>>> f50721e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    private static cf f50722f = new cf(bt.f50730a);

    /* renamed from: g  reason: collision with root package name */
    private final cb f50723g;

    /* renamed from: h  reason: collision with root package name */
    private final String f50724h;

    /* renamed from: i  reason: collision with root package name */
    private final T f50725i;

    /* renamed from: j  reason: collision with root package name */
    private volatile int f50726j;

    /* renamed from: k  reason: collision with root package name */
    private volatile T f50727k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f50728l;

    /* access modifiers changed from: package-private */
    public abstract T a(Object obj);

    public final String a() {
        return a(this.f50723g.f50734c);
    }

    static {
        Covode.recordClassIndex(31684);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T b() {
        /*
        // Method dump skipped, instructions count: 339
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.br.b():java.lang.Object");
    }

    private final String a(String str) {
        if (str != null && str.isEmpty()) {
            return this.f50724h;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f50724h);
        if (valueOf2.length() != 0) {
            return valueOf.concat(valueOf2);
        }
        return new String(valueOf);
    }

    /* synthetic */ br(cb cbVar, String str, Object obj) {
        this(cbVar, str, obj, true);
    }

    private br(cb cbVar, String str, T t, boolean z) {
        this.f50726j = -1;
        if (cbVar.f50732a != null) {
            this.f50723g = cbVar;
            this.f50724h = str;
            this.f50725i = t;
            this.f50728l = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }
}
