package com.bytedance.ies.android.base.runtime.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.INetworkDepend;
import h.f.b.l;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

public final class c {

    /* renamed from: l  reason: collision with root package name */
    public static INetworkDepend f31884l;

    /* renamed from: m  reason: collision with root package name */
    public static final a f31885m = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public LinkedHashMap<String, String> f31886a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f31887b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, String> f31888c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f31889d;

    /* renamed from: e  reason: collision with root package name */
    public String f31890e;

    /* renamed from: f  reason: collision with root package name */
    public String f31891f;

    /* renamed from: g  reason: collision with root package name */
    public long f31892g;

    /* renamed from: h  reason: collision with root package name */
    public long f31893h;

    /* renamed from: i  reason: collision with root package name */
    public long f31894i;

    /* renamed from: j  reason: collision with root package name */
    public LinkedHashMap<String, File> f31895j;

    /* renamed from: k  reason: collision with root package name */
    public String f31896k;

    static {
        Covode.recordClassIndex(18643);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(18644);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final b a() {
        String str;
        Map<String, String> map = this.f31888c;
        if (map != null && (!map.isEmpty())) {
            d dVar = new d(this.f31896k);
            for (String str2 : map.keySet()) {
                if (!TextUtils.isEmpty(str2) && (str = map.get(str2)) != null) {
                    l.c(str2, "");
                    l.c(str, "");
                    dVar.f31898a.put(str2, str);
                }
            }
            this.f31896k = dVar.a();
        }
        e eVar = e.GET;
        l.c(eVar, "");
        l.c(this, "");
        INetworkDepend iNetworkDepend = f31884l;
        if (iNetworkDepend != null) {
            return iNetworkDepend.requestForString(eVar, this);
        }
        return null;
    }

    public c(String str) {
        l.c(str, "");
        this.f31896k = str;
    }
}
