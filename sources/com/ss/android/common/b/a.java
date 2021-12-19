package com.ss.android.common.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.b;
import com.ss.android.common.util.c;
import com.ss.android.http.a.b.d;
import com.ss.android.http.a.b.e;
import java.util.List;
import org.apache.http.client.RedirectHandler;

public interface a {
    static {
        Covode.recordClassIndex(36641);
    }

    String a(int i2, int i3, String str, List<com.ss.android.http.a.a> list);

    String a(int i2, int i3, String str, List<d> list, com.ss.android.common.b.a.a aVar, c[] cVarArr);

    String a(int i2, int i3, String str, List<com.ss.android.http.a.a> list, boolean z, boolean z2, e eVar, boolean z3);

    String a(int i2, int i3, String str, List<d> list, boolean z, c[] cVarArr, List<com.ss.android.http.a.a> list2);

    String a(int i2, int i3, String str, byte[] bArr, String str2, String str3);

    String a(int i2, int i3, String str, byte[] bArr, String str2, String str3, List<com.ss.android.http.a.a> list);

    String a(int i2, String str, com.ss.android.common.b.a.a aVar, c<Long> cVar, long j2, c[] cVarArr);

    boolean a(int i2, String str, String str2, String str3, String str4, b<String> bVar, String str5, com.ss.android.common.util.e eVar, List<d> list, String[] strArr, int[] iArr);

    boolean a(int i2, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, b<String> bVar, String str2, com.ss.android.common.util.e eVar, List<d> list, String[] strArr, int[] iArr, RedirectHandler redirectHandler);

    byte[] a(int i2, String str);

    String b(int i2, int i3, String str, List<d> list, boolean z, c[] cVarArr, List<com.ss.android.http.a.a> list2);

    String b(int i2, int i3, String str, byte[] bArr, String str2, String str3, List<com.ss.android.http.a.a> list);
}
