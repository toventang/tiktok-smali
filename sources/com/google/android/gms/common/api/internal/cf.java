package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class cf extends ch {

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<a> f50147b = new SparseArray<>();

    static {
        Covode.recordClassIndex(31277);
    }

    @Override // com.google.android.gms.common.api.internal.ch, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void d() {
        super.d();
        for (int i2 = 0; i2 < this.f50147b.size(); i2++) {
            a b2 = b(i2);
            if (b2 != null) {
                b2.f50149b.f();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.ch
    public final void e() {
        for (int i2 = 0; i2 < this.f50147b.size(); i2++) {
            a b2 = b(i2);
            if (b2 != null) {
                b2.f50149b.e();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.ch, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void b() {
        super.b();
        boolean z = this.f50158d;
        String.valueOf(String.valueOf(this.f50147b)).length();
        if (this.f50159e.get() == null) {
            for (int i2 = 0; i2 < this.f50147b.size(); i2++) {
                a b2 = b(i2);
                if (b2 != null) {
                    b2.f50149b.e();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class a implements i.c {

        /* renamed from: a  reason: collision with root package name */
        public final int f50148a;

        /* renamed from: b  reason: collision with root package name */
        public final i f50149b;

        /* renamed from: c  reason: collision with root package name */
        public final i.c f50150c;

        static {
            Covode.recordClassIndex(31278);
        }

        @Override // com.google.android.gms.common.api.internal.m
        public final void a(ConnectionResult connectionResult) {
            String.valueOf(String.valueOf(connectionResult)).length();
            cf.this.b(connectionResult, this.f50148a);
        }

        public a(int i2, i iVar, i.c cVar) {
            this.f50148a = i2;
            this.f50149b = iVar;
            this.f50150c = cVar;
            iVar.a(this);
        }
    }

    private cf(j jVar) {
        super(jVar);
        this.f50018a.a("AutoManageHelper", this);
    }

    private final a b(int i2) {
        if (this.f50147b.size() <= i2) {
            return null;
        }
        SparseArray<a> sparseArray = this.f50147b;
        return sparseArray.get(sparseArray.keyAt(i2));
    }

    public final void a(int i2) {
        a aVar = this.f50147b.get(i2);
        this.f50147b.remove(i2);
        if (aVar != null) {
            aVar.f50149b.b(aVar);
            aVar.f50149b.f();
        }
    }

    public static cf b(i iVar) {
        j a2 = a(iVar);
        cf cfVar = (cf) a2.a("AutoManageHelper", cf.class);
        if (cfVar != null) {
            return cfVar;
        }
        return new cf(a2);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.ch
    public final void a(ConnectionResult connectionResult, int i2) {
        if (i2 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        a aVar = this.f50147b.get(i2);
        if (aVar != null) {
            a(i2);
            i.c cVar = aVar.f50150c;
            if (cVar != null) {
                cVar.a(connectionResult);
            }
        }
    }

    public final void a(int i2, i iVar, i.c cVar) {
        boolean z;
        r.a(iVar, "GoogleApiClient instance cannot be null");
        if (this.f50147b.indexOfKey(i2) < 0) {
            z = true;
        } else {
            z = false;
        }
        r.a(z, new StringBuilder(54).append("Already managing a GoogleApiClient with id ").append(i2).toString());
        Object obj = this.f50159e.get();
        boolean z2 = this.f50158d;
        String.valueOf(String.valueOf(obj)).length();
        this.f50147b.put(i2, new a(i2, iVar, cVar));
        if (this.f50158d && obj == null) {
            String.valueOf(String.valueOf(iVar)).length();
            iVar.e();
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i2 = 0; i2 < this.f50147b.size(); i2++) {
            a b2 = b(i2);
            if (b2 != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(b2.f50148a);
                printWriter.println(":");
                b2.f50149b.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }
}
