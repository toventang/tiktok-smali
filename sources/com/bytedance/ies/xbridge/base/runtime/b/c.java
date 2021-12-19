package com.bytedance.ies.xbridge.base.runtime.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.d.g;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import h.f.b.l;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public LinkedHashMap<String, String> f35813a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f35814b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, String> f35815c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f35816d;

    /* renamed from: e  reason: collision with root package name */
    public String f35817e;

    /* renamed from: f  reason: collision with root package name */
    public String f35818f;

    /* renamed from: g  reason: collision with root package name */
    public long f35819g;

    /* renamed from: h  reason: collision with root package name */
    public long f35820h;

    /* renamed from: i  reason: collision with root package name */
    public long f35821i;

    /* renamed from: j  reason: collision with root package name */
    public LinkedHashMap<String, File> f35822j;

    /* renamed from: k  reason: collision with root package name */
    public String f35823k;

    static {
        Covode.recordClassIndex(21385);
    }

    public final c a(String str) {
        l.c(str, "");
        this.f35818f = str;
        return this;
    }

    public c(String str) {
        l.c(str, "");
        this.f35823k = str;
    }

    public final b a(IHostNetworkDepend iHostNetworkDepend) {
        l.c(iHostNetworkDepend, "");
        return g.a(f.POST, this, iHostNetworkDepend);
    }

    public final c a(LinkedHashMap<String, String> linkedHashMap) {
        l.c(linkedHashMap, "");
        this.f35813a = linkedHashMap;
        return this;
    }

    public final c a(Map<String, String> map) {
        l.c(map, "");
        this.f35815c = map;
        return this;
    }
}
