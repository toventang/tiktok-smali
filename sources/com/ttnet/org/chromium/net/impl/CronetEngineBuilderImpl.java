package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import com.ttnet.org.chromium.net.c;
import com.ttnet.org.chromium.net.i;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks;
import com.ttnet.org.chromium.net.u;
import com.ttnet.org.chromium.net.v;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public abstract class CronetEngineBuilderImpl extends i {
    private static final String F = CronetEngineBuilderImpl.class.getSimpleName();
    private static final Pattern G = Pattern.compile("^[0-9\\.]*$");
    public String A;
    public boolean B;
    public long C;
    public String D;
    public boolean E;

    /* renamed from: a  reason: collision with root package name */
    public final Context f155499a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f155500b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f155501c = new LinkedList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f155502d;

    /* renamed from: e  reason: collision with root package name */
    public String f155503e;

    /* renamed from: f  reason: collision with root package name */
    public String f155504f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f155505g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f155506h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f155507i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f155508j;

    /* renamed from: k  reason: collision with root package name */
    public int f155509k;

    /* renamed from: l  reason: collision with root package name */
    public long f155510l;

    /* renamed from: m  reason: collision with root package name */
    public String f155511m;
    public long n;
    public boolean o;
    int p = 20;
    public boolean q;
    public boolean r;
    public TTAppInfoProvider s;
    public v t;
    public u u;
    public String v;
    public ArrayList<byte[]> w;
    public Map<String[], Pair<byte[], byte[]>> x;
    public String y;
    public String z;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final String f155512a;

        /* renamed from: b  reason: collision with root package name */
        final byte[][] f155513b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f155514c;

        /* renamed from: d  reason: collision with root package name */
        final Date f155515d;

        static {
            Covode.recordClassIndex(103438);
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final /* bridge */ /* synthetic */ i a() {
        this.r = true;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final /* bridge */ /* synthetic */ i b() {
        this.f155507i = true;
        return this;
    }

    /* renamed from: b */
    public CronetEngineBuilderImpl a(c.a.AbstractC4117a aVar) {
        return this;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final /* bridge */ /* synthetic */ i d() {
        this.o = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    public VersionSafeCallbacks.a f() {
        return null;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final /* bridge */ /* synthetic */ i a(Map map) {
        this.x = map;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final /* bridge */ /* synthetic */ i a(ArrayList arrayList) {
        this.w = arrayList;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final /* bridge */ /* synthetic */ i a(boolean z2) {
        this.f155506h = z2;
        return this;
    }

    public final String e() {
        return s.a(this.f155499a);
    }

    static {
        Covode.recordClassIndex(103437);
    }

    @Override // com.ttnet.org.chromium.net.i
    public final /* bridge */ /* synthetic */ i c(String str) {
        this.z = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final /* bridge */ /* synthetic */ i e(boolean z2) {
        this.B = z2;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final /* bridge */ /* synthetic */ i f(String str) {
        this.f155503e = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final i g(String str) {
        this.D = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final /* bridge */ /* synthetic */ i b(String str) {
        this.y = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final /* bridge */ /* synthetic */ i c(boolean z2) {
        this.q = z2;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final /* bridge */ /* synthetic */ i d(String str) {
        this.A = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final /* bridge */ /* synthetic */ i a(long j2) {
        this.C = j2;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final /* bridge */ /* synthetic */ i b(boolean z2) {
        this.f155505g = z2;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final /* bridge */ /* synthetic */ i d(boolean z2) {
        this.E = z2;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final /* synthetic */ i a(int i2) {
        if (i2 > 19 || i2 < -20) {
            throw new IllegalArgumentException("Thread priority invalid");
        }
        this.p = i2;
        return this;
    }

    public CronetEngineBuilderImpl(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f155499a = applicationContext;
        this.f155505g = false;
        this.f155506h = true;
        this.f155507i = false;
        a(0, 0);
        this.o = false;
        this.f155502d = true;
        this.q = false;
        this.E = false;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final /* bridge */ /* synthetic */ i a(TTAppInfoProvider tTAppInfoProvider) {
        this.s = tTAppInfoProvider;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final /* synthetic */ i e(String str) {
        File file = new File(str);
        if (!file.exists() && !file.mkdirs()) {
            throw new IllegalArgumentException("create Storage path failed");
        } else if (file.isDirectory()) {
            this.f155504f = str;
            return this;
        } else {
            throw new IllegalArgumentException("Storage path must be set to existing directory");
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final /* bridge */ /* synthetic */ i a(u uVar) {
        this.u = uVar;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final /* bridge */ /* synthetic */ i a(v vVar) {
        this.t = vVar;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final /* bridge */ /* synthetic */ i a(String str) {
        this.v = str;
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public CronetEngineBuilderImpl a(int i2, long j2) {
        boolean z2;
        if (i2 == 3 || i2 == 2) {
            if (this.f155504f == null) {
                throw new IllegalArgumentException("Storage path must be set");
            }
        } else if (this.f155504f != null) {
            throw new IllegalArgumentException("Storage path must not be set");
        }
        if (i2 == 0 || i2 == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f155508j = z2;
        this.f155510l = j2;
        if (i2 == 0) {
            this.f155509k = 0;
        } else if (i2 == 1) {
            this.f155509k = 2;
        } else if (i2 == 2 || i2 == 3) {
            this.f155509k = 1;
        } else {
            throw new IllegalArgumentException("Unknown cache mode");
        }
        return this;
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final String f155516a;

        /* renamed from: b  reason: collision with root package name */
        final int f155517b;

        /* renamed from: c  reason: collision with root package name */
        final int f155518c;

        static {
            Covode.recordClassIndex(103439);
        }

        b(String str, int i2, int i3) {
            this.f155516a = str;
            this.f155517b = i2;
            this.f155518c = i3;
        }
    }

    @Override // com.ttnet.org.chromium.net.i
    public final /* synthetic */ i a(String str, int i2, int i3) {
        if (!str.contains("/")) {
            this.f155500b.add(new b(str, i2, i3));
            return this;
        }
        throw new IllegalArgumentException("Illegal QUIC Hint Host: ".concat(String.valueOf(str)));
    }
}
