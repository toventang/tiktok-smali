package com.ss.android.ugc.aweme.net.f;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.b.a;
import com.ss.android.common.b.c;
import com.ss.android.common.util.e;
import com.ss.android.http.a.b.d;
import java.util.List;
import org.apache.http.client.RedirectHandler;

public abstract class b implements a {

    /* renamed from: a  reason: collision with root package name */
    protected a f112310a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f112311b;

    static {
        Covode.recordClassIndex(72169);
    }

    /* access modifiers changed from: protected */
    public abstract a a();

    @Override // com.ss.android.common.b.a
    public final byte[] a(int i2, String str) {
        if (this.f112310a == null) {
            this.f112310a = a();
        }
        return this.f112310a.a(i2, str);
    }

    @Override // com.ss.android.common.b.a
    public final boolean a(int i2, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, com.ss.android.common.util.b<String> bVar, String str2, e eVar, List<d> list, String[] strArr, int[] iArr, RedirectHandler redirectHandler) {
        if (this.f112310a == null) {
            this.f112310a = a();
        }
        return this.f112310a.a(i2, str, stringBuffer, stringBuffer2, stringBuffer3, bVar, str2, eVar, list, strArr, iArr, redirectHandler);
    }

    public b(Context context) {
        this.f112311b = context;
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, int i3, String str, List<com.ss.android.http.a.a> list) {
        a aVar = this.f112310a;
        if (aVar == null) {
            return null;
        }
        return aVar.a(i2, i3, str, list);
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, int i3, String str, List<d> list, com.ss.android.common.b.a.a aVar, c[] cVarArr) {
        if (this.f112310a == null) {
            this.f112310a = a();
        }
        return this.f112310a.a(i2, i3, str, list, aVar, cVarArr);
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, int i3, String str, byte[] bArr, String str2, String str3) {
        if (this.f112310a == null) {
            this.f112310a = a();
        }
        return this.f112310a.a(i2, i3, str, bArr, str2, str3);
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, String str, com.ss.android.common.b.a.a aVar, com.ss.android.common.util.c<Long> cVar, long j2, c[] cVarArr) {
        if (this.f112310a == null) {
            this.f112310a = a();
        }
        return this.f112310a.a(i2, str, aVar, cVar, j2, cVarArr);
    }

    @Override // com.ss.android.common.b.a
    public final String b(int i2, int i3, String str, List<d> list, boolean z, c[] cVarArr, List<com.ss.android.http.a.a> list2) {
        a aVar = this.f112310a;
        if (aVar == null) {
            return null;
        }
        return aVar.b(i2, i3, str, list, z, cVarArr, list2);
    }

    @Override // com.ss.android.common.b.a
    public final String b(int i2, int i3, String str, byte[] bArr, String str2, String str3, List<com.ss.android.http.a.a> list) {
        a aVar = this.f112310a;
        if (aVar == null) {
            return null;
        }
        return aVar.b(i2, i3, str, bArr, str2, str3, list);
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, int i3, String str, List<d> list, boolean z, c[] cVarArr, List<com.ss.android.http.a.a> list2) {
        if (this.f112310a == null) {
            this.f112310a = a();
        }
        return this.f112310a.a(i2, i3, str, list, z, cVarArr, list2);
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, int i3, String str, byte[] bArr, String str2, String str3, List<com.ss.android.http.a.a> list) {
        if (this.f112310a == null) {
            this.f112310a = a();
        }
        return this.f112310a.a(i2, i3, str, bArr, str2, str3, list);
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, int i3, String str, List<com.ss.android.http.a.a> list, boolean z, boolean z2, com.ss.android.http.a.b.e eVar, boolean z3) {
        if (this.f112310a == null) {
            this.f112310a = a();
        }
        return this.f112310a.a(i2, i3, str, list, z, z2, eVar, z3);
    }

    @Override // com.ss.android.common.b.a
    public final boolean a(int i2, String str, String str2, String str3, String str4, com.ss.android.common.util.b<String> bVar, String str5, e eVar, List<d> list, String[] strArr, int[] iArr) {
        if (this.f112310a == null) {
            this.f112310a = a();
        }
        return this.f112310a.a(i2, str, str2, str3, str4, bVar, str5, eVar, list, strArr, iArr);
    }
}
