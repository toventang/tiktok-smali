package com.bytedance.frameworks.baselib.network.http.d.a.a;

import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import java.util.List;

public class a {

    /* renamed from: g  reason: collision with root package name */
    private static final String f29096g = a.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public String f29097a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f29098b;

    /* renamed from: c  reason: collision with root package name */
    public List<String> f29099c;

    /* renamed from: d  reason: collision with root package name */
    public long f29100d;

    /* renamed from: e  reason: collision with root package name */
    public long f29101e;

    /* renamed from: f  reason: collision with root package name */
    final WeakHandler f29102f = new WeakHandler(e.f29132l.getLooper(), e.a());

    public final void b() {
        this.f29102f.removeMessages(13);
    }

    public final void c() {
        this.f29102f.removeMessages(11);
    }

    static {
        Covode.recordClassIndex(17036);
    }

    public final void a() {
        this.f29102f.removeMessages(10);
        this.f29102f.removeMessages(12);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.a.a$a  reason: collision with other inner class name */
    public enum EnumC0624a {
        CACHE_UNSET,
        CACHE_VALID,
        CACHE_STALE_BOTH,
        CACHE_STALE_NETCHANGED,
        CACHE_STALE_EXPIRED,
        PRELOAD_BATCH,
        REFRESH_BATCH;

        static {
            Covode.recordClassIndex(17037);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Message message) {
        Bundle bundle = new Bundle();
        bundle.putString("dnsrecord_host", this.f29097a);
        message.setData(bundle);
    }

    public a(String str, long j2, List<String> list, List<String> list2, int i2) {
        this.f29097a = str;
        this.f29101e = j2;
        this.f29098b = list;
        this.f29099c = list2;
        this.f29100d = (long) i2;
        e.a();
    }
}
