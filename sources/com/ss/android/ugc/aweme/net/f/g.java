package com.ss.android.ugc.aweme.net.f;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.g.i;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import com.ss.android.common.b.a;
import com.ss.android.common.b.a.a;
import com.ss.android.common.util.b;
import com.ss.android.common.util.c;
import com.ss.android.common.util.e;
import com.ss.android.ugc.aweme.net.IIESNetworkApi;
import com.ss.android.ugc.aweme.net.f.e;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.apache.http.client.RedirectHandler;

public final class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public final String f112324a = ("https://" + d.f34604k.f34586a);

    /* renamed from: b  reason: collision with root package name */
    public final a f112325b;

    static {
        Covode.recordClassIndex(72176);
    }

    @Override // com.ss.android.common.b.a
    public final boolean a(int i2, String str, String str2, String str3, String str4, b<String> bVar, String str5, e eVar, List<com.ss.android.http.a.b.d> list, String[] strArr, int[] iArr) {
        return this.f112325b.a(i2, str, str2, str3, str4, bVar, str5, eVar, list, strArr, iArr);
    }

    @Override // com.ss.android.common.b.a
    public final boolean a(int i2, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, b<String> bVar, String str2, e eVar, List<com.ss.android.http.a.b.d> list, String[] strArr, int[] iArr, RedirectHandler redirectHandler) {
        return this.f112325b.a(i2, str, stringBuffer, stringBuffer2, stringBuffer3, bVar, str2, eVar, list, strArr, iArr, redirectHandler);
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, String str, com.ss.android.common.b.a.a aVar, c<Long> cVar, long j2, com.ss.android.common.b.c[] cVarArr) {
        String a2 = this.f112325b.a(i2, str, aVar, cVar, j2, cVarArr);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, int i3, String str, byte[] bArr, String str2, String str3) {
        l.d(str, "");
        return a(i2, i3, str, bArr, str2, str3, (List<com.ss.android.http.a.a>) null);
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, int i3, String str, byte[] bArr, String str2, String str3, List<com.ss.android.http.a.a> list) {
        l.d(str, "");
        ArrayList<com.bytedance.retrofit2.client.b> b2 = b(list);
        a(str2, b2, str3);
        return a(i3, str, new HashMap(), new TypedByteArray(str3, bArr, new String[0]), b2, (com.ss.android.common.b.c[]) null);
    }

    public g(a aVar) {
        l.d(aVar, "");
        this.f112325b = aVar;
    }

    private static HashMap<String, String> a(List<com.ss.android.http.a.b.d> list) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (list != null) {
            for (com.ss.android.http.a.b.d dVar : list) {
                String str = dVar.f59532a;
                l.b(str, "");
                String str2 = dVar.f59533b;
                l.b(str2, "");
                hashMap.put(str, str2);
            }
        }
        return hashMap;
    }

    private static ArrayList<com.bytedance.retrofit2.client.b> b(List<com.ss.android.http.a.a> list) {
        ArrayList<com.bytedance.retrofit2.client.b> arrayList = new ArrayList<>();
        if (list != null) {
            for (com.ss.android.http.a.a aVar : list) {
                String a2 = aVar.a();
                String b2 = aVar.b();
                if (a2 != null && a2.length() > 0) {
                    arrayList.add(new com.bytedance.retrofit2.client.b(a2, b2));
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.common.b.a
    public final byte[] a(int i2, String str) {
        byte[] a2 = this.f112325b.a(i2, str);
        l.b(a2, "");
        return a2;
    }

    private static void a(String str, ArrayList<com.bytedance.retrofit2.client.b> arrayList, String str2) {
        if (str != null) {
            arrayList.add(new com.bytedance.retrofit2.client.b("Content-Encoding", str));
        }
        if (str2 != null && str2.length() > 0) {
            arrayList.add(new com.bytedance.retrofit2.client.b("Content-Type", str2));
        }
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, int i3, String str, List<com.ss.android.http.a.a> list) {
        l.d(str, "");
        return a(i3, str, new HashMap(), (TypedOutput) null, b(list), (com.ss.android.common.b.c[]) null);
    }

    private static String a(int i2, String str, Map<String, String> map, TypedOutput typedOutput, List<com.bytedance.retrofit2.client.b> list, com.ss.android.common.b.c[] cVarArr) {
        com.bytedance.retrofit2.b<String> doPost;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> a2 = i.a(str, linkedHashMap);
        String str2 = (String) a2.second;
        IIESNetworkApi iIESNetworkApi = (IIESNetworkApi) RetrofitFactory.a().b((String) a2.first).d().a(IIESNetworkApi.class);
        if (typedOutput != null) {
            doPost = iIESNetworkApi.postBody(i2, str2, linkedHashMap, typedOutput, list, null);
            l.b(doPost, "");
        } else {
            doPost = iIESNetworkApi.doPost(i2, str2, linkedHashMap, map, list, null);
            l.b(doPost, "");
        }
        if (!(cVarArr == null || cVarArr.length == 0)) {
            cVarArr[0] = new e.a(doPost);
        }
        T t = doPost.execute().f42630b;
        l.b(t, "");
        return t;
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, int i3, String str, List<com.ss.android.http.a.b.d> list, com.ss.android.common.b.a.a aVar, com.ss.android.common.b.c[] cVarArr) {
        l.d(str, "");
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        if (list != null) {
            for (com.ss.android.http.a.b.d dVar : list) {
                multipartTypedOutput.addPart(dVar.f59532a, new TypedString(dVar.f59533b));
            }
        }
        if (aVar != null) {
            for (a.c cVar : aVar.f59348a) {
                if (cVar instanceof a.d) {
                    Object b2 = cVar.b();
                    Objects.requireNonNull(b2, "null cannot be cast to non-null type kotlin.String");
                    multipartTypedOutput.addPart(cVar.a(), new TypedString((String) b2));
                } else if (cVar instanceof a.C1293a) {
                    a.C1293a aVar2 = (a.C1293a) cVar;
                    byte[] bArr = aVar2.f59350b;
                    Objects.requireNonNull(bArr, "null cannot be cast to non-null type kotlin.ByteArray");
                    multipartTypedOutput.addPart(aVar2.f59349a, new TypedByteArray(null, bArr, aVar2.f59351c));
                } else if (cVar instanceof a.b) {
                    Object b3 = cVar.b();
                    Objects.requireNonNull(b3, "null cannot be cast to non-null type java.io.File");
                    multipartTypedOutput.addPart(cVar.a(), new TypedFile(null, (File) b3));
                }
            }
        }
        return a(i3, str, new HashMap(), multipartTypedOutput, (List<com.bytedance.retrofit2.client.b>) null, cVarArr);
    }

    @Override // com.ss.android.common.b.a
    public final String b(int i2, int i3, String str, List<com.ss.android.http.a.b.d> list, boolean z, com.ss.android.common.b.c[] cVarArr, List<com.ss.android.http.a.a> list2) {
        l.d(str, "");
        return a(i3, str, a(list), (TypedOutput) null, b(list2), (com.ss.android.common.b.c[]) null);
    }

    @Override // com.ss.android.common.b.a
    public final String b(int i2, int i3, String str, byte[] bArr, String str2, String str3, List<com.ss.android.http.a.a> list) {
        l.d(str, "");
        ArrayList<com.bytedance.retrofit2.client.b> b2 = b(list);
        a(str2, b2, str3);
        return a(i3, str, new HashMap(), new TypedByteArray(str3, bArr, new String[0]), b2, (com.ss.android.common.b.c[]) null);
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, int i3, String str, List<com.ss.android.http.a.b.d> list, boolean z, com.ss.android.common.b.c[] cVarArr, List<com.ss.android.http.a.a> list2) {
        l.d(str, "");
        return a(i3, str, a(list), (TypedOutput) null, b(list2), cVarArr);
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, int i3, String str, List<com.ss.android.http.a.a> list, boolean z, boolean z2, com.ss.android.http.a.b.e eVar, boolean z3) {
        T t = ((IIESNetworkApi) RetrofitFactory.a().b(this.f112324a).d().a(IIESNetworkApi.class)).doGet(true, i3, str, new HashMap(), b(list), null).execute().f42630b;
        l.b(t, "");
        return t;
    }
}
