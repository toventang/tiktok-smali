package com.bytedance.ies.bullet.service.base.resourceloader.config;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public int f32620a;

    /* renamed from: b  reason: collision with root package name */
    public int f32621b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f32622c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f32623d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f32624e;

    /* renamed from: f  reason: collision with root package name */
    public List<String> f32625f;

    /* renamed from: g  reason: collision with root package name */
    public String f32626g;

    /* renamed from: h  reason: collision with root package name */
    public String f32627h;

    /* renamed from: i  reason: collision with root package name */
    public List<String> f32628i;

    /* renamed from: j  reason: collision with root package name */
    public String f32629j;

    /* renamed from: k  reason: collision with root package name */
    public String f32630k;

    /* renamed from: l  reason: collision with root package name */
    public String f32631l;

    /* renamed from: m  reason: collision with root package name */
    public GeckoConfig f32632m;
    public Map<String, GeckoConfig> n;
    public c o;
    public Object p;
    public Object q;

    static {
        Covode.recordClassIndex(19382);
    }

    public final String toString() {
        StringBuilder append = new StringBuilder("{[host]=").append(this.f32626g).append(",[region]=").append(this.f32627h).append(",[prefix]=");
        Object[] array = this.f32628i.toArray(new String[0]);
        if (array != null) {
            String arrays = Arrays.toString(array);
            l.a((Object) arrays, "");
            return append.append(arrays).append(',').append("[appId]=").append(this.f32629j).append(",[appVersion]=").append(this.f32630k).append(",[did]=").append(this.f32631l).append('}').toString();
        }
        throw new w("null cannot be cast to non-null type");
    }

    private i(String str, String str2, List<String> list, String str3, String str4, String str5, GeckoConfig geckoConfig, Map<String, GeckoConfig> map, c cVar, Object obj) {
        l.c(str, "");
        l.c(str2, "");
        l.c(list, "");
        l.c(str3, "");
        l.c(str4, "");
        l.c(str5, "");
        l.c(geckoConfig, "");
        l.c(map, "");
        l.c(cVar, "");
        this.f32626g = str;
        this.f32627h = str2;
        this.f32628i = list;
        this.f32629j = str3;
        this.f32630k = str4;
        this.f32631l = str5;
        this.f32632m = geckoConfig;
        this.n = map;
        this.o = cVar;
        this.p = null;
        this.q = obj;
        this.f32620a = 10;
        this.f32621b = 83886080;
        this.f32625f = new ArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, String str2, List list, String str3, String str4, String str5, GeckoConfig geckoConfig, Map map, c cVar, Object obj, int i2) {
        this(str, str2, list, str3, str4, str5, geckoConfig, (i2 & 128) != 0 ? new LinkedHashMap() : map, cVar, (i2 & 1024) != 0 ? null : obj);
    }
}
