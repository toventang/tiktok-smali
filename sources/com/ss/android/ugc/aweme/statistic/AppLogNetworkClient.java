package com.ss.android.ugc.aweme.statistic;

import android.util.Pair;
import com.bytedance.common.utility.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.b.c;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.a;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.b;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.l;
import com.bytedance.retrofit2.b.o;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.c.h.a.q;
import com.ss.android.common.util.NetworkUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public final class AppLogNetworkClient extends j {

    /* renamed from: b  reason: collision with root package name */
    private volatile AppLogGetApi f134680b;

    /* renamed from: c  reason: collision with root package name */
    private volatile AppLogPostApi f134681c;

    /* renamed from: d  reason: collision with root package name */
    private final int f134682d = 1024;

    interface AppLogGetApi {
        static {
            Covode.recordClassIndex(88012);
        }

        @h
        q<String> getResponse(@ag String str);
    }

    /* access modifiers changed from: package-private */
    public interface AppLogPostApi {
        static {
            Covode.recordClassIndex(88013);
        }

        @t
        q<String> doPost(@ag String str, @b TypedOutput typedOutput, @o int i2, @l List<com.bytedance.retrofit2.client.b> list);

        @t
        @g
        q<String> getResponse(@ag String str, @f Map<String, String> map, @o int i2);

        @t
        com.bytedance.retrofit2.b<TypedInput> postDataStream(@o int i2, @ag String str, @b TypedOutput typedOutput, @l List<com.bytedance.retrofit2.client.b> list, @a boolean z);
    }

    static {
        Covode.recordClassIndex(88011);
    }

    private AppLogPostApi a() {
        if (this.f134681c == null) {
            this.f134681c = (AppLogPostApi) RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(AppLogPostApi.class);
        }
        return this.f134681c;
    }

    private static List<com.bytedance.retrofit2.client.b> a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new com.bytedance.retrofit2.client.b(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    @Override // com.bytedance.common.utility.j
    public final String a(String str, Map<String, String> map) {
        if (str == null) {
            return null;
        }
        try {
            if (this.f134680b == null) {
                this.f134680b = (AppLogGetApi) RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(AppLogGetApi.class);
            }
            return this.f134680b.getResponse(str).get();
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof com.ss.android.http.a.a.b) {
                throw new com.bytedance.common.utility.b(((com.ss.android.http.a.a.b) e2.getCause()).getStatusCode(), e2.getMessage());
            }
            throw new com.bytedance.common.utility.b(0, e2.getMessage());
        } catch (Exception e3) {
            throw new com.bytedance.common.utility.b(0, e3.getMessage());
        }
    }

    @Override // com.bytedance.common.utility.j
    public final String a(String str, List<Pair<String, String>> list, Map<String, String> map) {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Pair<String, String> pair : list) {
            hashMap.put(pair.first, pair.second);
        }
        com.ss.android.common.applog.q.b(hashMap, true);
        try {
            return a().getResponse(str, hashMap, 204800).get();
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof com.ss.android.http.a.a.b) {
                throw new com.bytedance.common.utility.b(((com.ss.android.http.a.a.b) e2.getCause()).getStatusCode(), e2.getMessage());
            } else if (e2.getCause() instanceof c) {
                c cVar = (c) e2.getCause();
                throw new com.bytedance.common.utility.b(cVar.getStatusCode(), cVar.getMessage());
            } else {
                throw new com.bytedance.common.utility.b(0, e2.getMessage());
            }
        } catch (Exception e3) {
            throw new com.bytedance.common.utility.b(0, e3.getMessage());
        }
    }

    @Override // com.bytedance.common.utility.j
    public final String a(String str, byte[] bArr, Map<String, String> map) {
        String filterUrl = NetworkUtils.filterUrl(str);
        if (filterUrl == null) {
            return null;
        }
        if (map != null) {
            try {
                String str2 = map.get("Content-Encoding");
                String str3 = map.get("Content-Type");
                ArrayList arrayList = new ArrayList();
                if (str2 != null) {
                    arrayList.add(new com.bytedance.retrofit2.client.b("Content-Encoding", str2));
                }
                if (str3 != null && str3.length() > 0) {
                    arrayList.add(new com.bytedance.retrofit2.client.b("Content-Type", str3));
                }
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    arrayList.add(new com.bytedance.retrofit2.client.b(entry.getKey(), entry.getValue()));
                }
                return a().doPost(filterUrl, new TypedByteArray(str3, bArr, new String[0]), 204800, arrayList).get();
            } catch (ExecutionException e2) {
                if (e2.getCause() instanceof com.ss.android.http.a.a.b) {
                    throw new com.bytedance.common.utility.b(((com.ss.android.http.a.a.b) e2.getCause()).getStatusCode(), e2.getMessage());
                } else if (e2.getCause() instanceof c) {
                    c cVar = (c) e2.getCause();
                    throw new com.bytedance.common.utility.b(cVar.getStatusCode(), cVar.getMessage());
                } else {
                    throw new com.bytedance.common.utility.b(0, e2.getMessage());
                }
            } catch (Exception e3) {
                throw new com.bytedance.common.utility.b(0, e3.getMessage());
            }
        } else {
            return a().doPost(filterUrl, new TypedByteArray(null, bArr, new String[0]), 204800, null).get();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e6 A[Catch:{ all -> 0x0107 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fa A[Catch:{ all -> 0x0107 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010e A[SYNTHETIC, Splitter:B:52:0x010e] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0118 A[SYNTHETIC, Splitter:B:57:0x0118] */
    @Override // com.bytedance.common.utility.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] b(java.lang.String r16, byte[] r17, java.util.Map<java.lang.String, java.lang.String> r18) {
        /*
        // Method dump skipped, instructions count: 292
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.statistic.AppLogNetworkClient.b(java.lang.String, byte[], java.util.Map):byte[]");
    }
}
