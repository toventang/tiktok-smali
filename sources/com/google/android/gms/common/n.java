package com.google.android.gms.common;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.common.internal.aj;
import com.google.android.gms.common.internal.al;
import com.google.android.gms.common.internal.r;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public abstract class n extends al {

    /* renamed from: a  reason: collision with root package name */
    private int f50450a;

    static {
        Covode.recordClassIndex(31443);
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] c();

    public int hashCode() {
        return this.f50450a;
    }

    @Override // com.google.android.gms.common.internal.aj
    public final int b() {
        return hashCode();
    }

    @Override // com.google.android.gms.common.internal.aj
    public final a a() {
        return b.a(c());
    }

    protected static byte[] a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    protected n(byte[] bArr) {
        boolean z;
        if (bArr.length == 25) {
            z = true;
        } else {
            z = false;
        }
        r.b(z);
        this.f50450a = Arrays.hashCode(bArr);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof aj)) {
            try {
                aj ajVar = (aj) obj;
                if (ajVar.b() != hashCode()) {
                    return false;
                }
                a a2 = ajVar.a();
                if (a2 == null) {
                    return false;
                }
                return Arrays.equals(c(), (byte[]) b.a(a2));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}
