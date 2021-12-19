package com.bytedance.lynx.hybrid.resource.config;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.a.a;
import com.bytedance.lynx.hybrid.a.j;
import com.bytedance.lynx.hybrid.c;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class c implements j {

    /* renamed from: a  reason: collision with root package name */
    public d f41089a;

    /* renamed from: b  reason: collision with root package name */
    public int f41090b;

    /* renamed from: c  reason: collision with root package name */
    public int f41091c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f41092d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f41093e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f41094f;

    /* renamed from: g  reason: collision with root package name */
    public List<String> f41095g;

    /* renamed from: h  reason: collision with root package name */
    public String f41096h;

    /* renamed from: i  reason: collision with root package name */
    public List<String> f41097i;

    /* renamed from: j  reason: collision with root package name */
    public GeckoConfig f41098j;

    /* renamed from: k  reason: collision with root package name */
    public Map<String, GeckoConfig> f41099k;

    /* renamed from: l  reason: collision with root package name */
    public Object f41100l;

    /* renamed from: m  reason: collision with root package name */
    public Object f41101m;

    static {
        Covode.recordClassIndex(25188);
    }

    public static String a() {
        String appId;
        a aVar = c.a.a().f40904d;
        if (aVar == null || (appId = aVar.getAppId()) == null) {
            return "";
        }
        return appId;
    }

    public static String b() {
        String appVersion;
        a aVar = c.a.a().f40904d;
        if (aVar == null || (appVersion = aVar.getAppVersion()) == null) {
            return "";
        }
        return appVersion;
    }

    public static String c() {
        String did;
        a aVar = c.a.a().f40904d;
        if (aVar == null || (did = aVar.getDid()) == null) {
            return "";
        }
        return did;
    }

    public static String d() {
        String region;
        a aVar = c.a.a().f40904d;
        if (aVar == null || (region = aVar.getRegion()) == null) {
            return "";
        }
        return region;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder("{[host]=").append(this.f41096h).append(",[region]=").append(d()).append(",[prefix]=");
        Object[] array = this.f41097i.toArray(new String[0]);
        if (array != null) {
            String arrays = Arrays.toString(array);
            l.a((Object) arrays, "");
            return append.append(arrays).append(',').append("[appId]=").append(a()).append(",[appVersion]=").append(b()).append(",[did]=").append(c()).append('}').toString();
        }
        throw new w("null cannot be cast to non-null type");
    }

    private c(String str, List<String> list, GeckoConfig geckoConfig, Map<String, GeckoConfig> map, Object obj) {
        l.c(str, "");
        l.c(list, "");
        l.c(geckoConfig, "");
        l.c(map, "");
        this.f41096h = str;
        this.f41097i = list;
        this.f41098j = geckoConfig;
        this.f41099k = map;
        this.f41100l = null;
        this.f41101m = obj;
        this.f41090b = 10;
        this.f41091c = 83886080;
        this.f41095g = new ArrayList();
        this.f41089a = new com.bytedance.lynx.hybrid.resource.g.a.a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, List list, GeckoConfig geckoConfig, Map map, Object obj, int i2) {
        this(str, list, geckoConfig, (i2 & 8) != 0 ? new LinkedHashMap() : map, (i2 & 32) != 0 ? null : obj);
    }
}
