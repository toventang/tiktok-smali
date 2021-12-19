package com.bytedance.d.a.a.a.a;

import com.bytedance.bdp.serviceapi.defaults.network.BdpRequest;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final long f28517a = 30000;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap<String, String> f28518b = new LinkedHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public boolean f28519c;

    /* renamed from: d  reason: collision with root package name */
    public long f28520d = 30000;

    /* renamed from: e  reason: collision with root package name */
    public long f28521e = 30000;

    /* renamed from: f  reason: collision with root package name */
    public long f28522f = 30000;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f28523g;

    /* renamed from: h  reason: collision with root package name */
    public final String f28524h;

    /* renamed from: i  reason: collision with root package name */
    public final String f28525i;

    static {
        Covode.recordClassIndex(16764);
    }

    public final BdpRequest a() {
        BdpRequest bdpRequest = new BdpRequest();
        bdpRequest.setMethod(this.f28524h);
        bdpRequest.setUrl(this.f28525i);
        bdpRequest.getHeaders().clear();
        bdpRequest.getHeaders().putAll(this.f28518b);
        bdpRequest.setNeedAddCommonParam(this.f28519c);
        bdpRequest.setConnectTimeOut(this.f28520d);
        bdpRequest.setReadTimeOut(this.f28521e);
        bdpRequest.setWriteTimeOut(this.f28522f);
        bdpRequest.setData(this.f28523g);
        return bdpRequest;
    }

    public b(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        this.f28524h = str;
        this.f28525i = str2;
    }
}
