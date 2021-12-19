package com.ss.ttvideoengine.f;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.mediakit.fetcher.AVMDLFetcherMakerInterface;
import com.ss.mediakit.fetcher.AVMDLURLFetcherInterface;
import com.ss.ttvideoengine.s.j;
import java.util.Hashtable;

public final class b implements AVMDLFetcherMakerInterface {

    /* renamed from: a  reason: collision with root package name */
    private static Hashtable<String, a> f152523a = new Hashtable<>();

    /* renamed from: b  reason: collision with root package name */
    private final Context f152524b;

    public b() {
    }

    static {
        Covode.recordClassIndex(101572);
    }

    public b(Context context) {
        this.f152524b = context;
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            f152523a.remove(str);
        }
    }

    @Override // com.ss.mediakit.fetcher.AVMDLFetcherMakerInterface
    public final AVMDLURLFetcherInterface getFetcher(String str, String str2, String str3) {
        j.a("FetcherMaker", "getFetcher rawKey " + str + ", fileKey " + str2 + ", oldURL " + str3);
        a aVar = f152523a.get(str);
        if (aVar == null) {
            j.a("FetcherMaker", "getFetcher FetcherBase is null");
            return null;
        }
        String str4 = aVar.f152510a;
        String str5 = aVar.f152511b;
        int i2 = aVar.f152512c;
        if (TextUtils.isEmpty(str5) || (i2 != 3 && TextUtils.isEmpty(str4))) {
            j.a("FetcherMaker", "getFetcher FetcherBase is error ".concat(String.valueOf(aVar)));
            return null;
        }
        c cVar = new c(this.f152524b, str5, str4);
        j.a("FetcherMaker", "return fetcher to mdl ".concat(String.valueOf(cVar)));
        return cVar;
    }

    public static void a(String str, String str2, String str3, int i2) {
        j.a("FetcherMaker", "store videoId " + str + ", keyseed " + str2 + ", fallbackAPI " + str3 + ", version " + i2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3) || (i2 != 3 && TextUtils.isEmpty(str2))) {
            j.a("FetcherMaker", "mdlFetch store fail");
        } else {
            f152523a.put(str, new a(str2, str3, i2));
        }
    }
}
