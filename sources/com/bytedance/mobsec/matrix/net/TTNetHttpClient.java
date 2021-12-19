package com.bytedance.mobsec.matrix.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.ae;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.l;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;

public final class TTNetHttpClient extends a {

    public interface TTNetInterface {
        static {
            Covode.recordClassIndex(25333);
        }

        @h
        @ae
        b<TypedInput> get(@ag String str, @l List<com.bytedance.retrofit2.client.b> list);

        @t
        @ae
        b<TypedInput> post(@ag String str, @l List<com.bytedance.retrofit2.client.b> list, @com.bytedance.retrofit2.b.b TypedByteArray typedByteArray);
    }

    static {
        Covode.recordClassIndex(25332);
    }

    private static String a(List<com.bytedance.retrofit2.client.b> list) {
        MethodCollector.i(9776);
        if (list == null || list.size() <= 0) {
            MethodCollector.o(9776);
            return null;
        }
        for (com.bytedance.retrofit2.client.b bVar : list) {
            if (bVar != null && ((String) ms.bd.o.h.a(16777217, 0, 0, "0d6ce6", new byte[]{57, 43, 81, 3, 23, 45, 60, 66, 110, 55})).equalsIgnoreCase(bVar.f42471a)) {
                String str = bVar.f42472b;
                MethodCollector.o(9776);
                return str;
            }
        }
        MethodCollector.o(9776);
        return null;
    }

    @Override // com.bytedance.mobsec.matrix.net.a
    public final Object[] a(String str, String str2) {
        return a(str, (byte[]) null, str2, (String) null, false);
    }

    @Override // com.bytedance.mobsec.matrix.net.a
    public final Object[] a(String str, byte[] bArr, String str2) {
        return a(str, bArr, str2, (String) null, true);
    }

    @Override // com.bytedance.mobsec.matrix.net.a
    public final Object[] b(String str, String str2) {
        return a(str, (byte[]) null, (String) null, str2, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0378 A[Catch:{ all -> 0x03a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0379 A[Catch:{ all -> 0x03a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x038e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object[] a(java.lang.String r29, byte[] r30, java.lang.String r31, java.lang.String r32, boolean r33) {
        /*
        // Method dump skipped, instructions count: 948
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.mobsec.matrix.net.TTNetHttpClient.a(java.lang.String, byte[], java.lang.String, java.lang.String, boolean):java.lang.Object[]");
    }
}
