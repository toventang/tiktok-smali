package com.google.android.gms.common;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.util.a;
import com.google.android.gms.common.util.i;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class o implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f50451a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50452b;

    /* renamed from: c  reason: collision with root package name */
    private final n f50453c;

    static {
        Covode.recordClassIndex(31444);
    }

    o(boolean z, String str, n nVar) {
        this.f50451a = z;
        this.f50452b = str;
        this.f50453c = nVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        boolean z = this.f50451a;
        String str2 = this.f50452b;
        n nVar = this.f50453c;
        if (z || !m.b(str2, nVar, true, false).f50491b) {
            str = "not whitelisted";
        } else {
            str = "debug cert rejected";
        }
        Object[] objArr = new Object[5];
        objArr[0] = str;
        objArr[1] = str2;
        byte[] digest = a.a("SHA-1").digest(nVar.c());
        char[] cArr = new char[(digest.length << 1)];
        int i2 = 0;
        for (byte b2 : digest) {
            int i3 = b2 & 255;
            int i4 = i2 + 1;
            cArr[i2] = i.f50511a[i3 >>> 4];
            i2 = i4 + 1;
            cArr[i4] = i.f50511a[i3 & 15];
        }
        objArr[2] = new String(cArr);
        objArr[3] = Boolean.valueOf(z);
        objArr[4] = "12451009.false";
        return com.a.a("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", objArr);
    }
}
