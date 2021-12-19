package com.ss.android.ugc.aweme.filter.repository.internal.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.f;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.internal.utils.FilterConfig;
import com.ss.android.ugc.tools.utils.i;
import h.a.n;
import h.e.c;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<Integer, Boolean> f95749a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<Integer, FilterConfig> f95750b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static f f95751c = new f();

    static {
        Covode.recordClassIndex(60672);
    }

    public static final String b(FilterBean filterBean) {
        List<FilterConfig.FilterConfigItem> items;
        l.d(filterBean, "");
        FilterConfig d2 = d(filterBean);
        if (d2 == null || (items = d2.getItems()) == null || !(!items.isEmpty())) {
            return "Filter_intensity";
        }
        return items.get(0).getTag();
    }

    public static final float c(FilterBean filterBean) {
        List<FilterConfig.FilterConfigItem> items;
        FilterConfig.FilterConfigItem filterConfigItem;
        int max;
        l.d(filterBean, "");
        FilterConfig d2 = d(filterBean);
        if (d2 == null || (items = d2.getItems()) == null || (filterConfigItem = (FilterConfig.FilterConfigItem) n.h((List) items)) == null || (max = filterConfigItem.getMax() - filterConfigItem.getMin()) == 0) {
            return 0.0f;
        }
        return ((float) filterConfigItem.getValue()) / ((float) max);
    }

    public static final boolean a(FilterBean filterBean) {
        MethodCollector.i(10970);
        l.d(filterBean, "");
        HashMap<Integer, Boolean> hashMap = f95749a;
        Boolean bool = hashMap.get(Integer.valueOf(filterBean.getId()));
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            MethodCollector.o(10970);
            return booleanValue;
        }
        String filterFolder = filterBean.getFilterFolder();
        boolean z = false;
        if (filterFolder == null) {
            MethodCollector.o(10970);
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(filterFolder, "config.json"));
            try {
                boolean has = new JSONObject(i.a((InputStream) fileInputStream)).has("effect");
                hashMap.put(Integer.valueOf(filterBean.getId()), Boolean.valueOf(has));
                c.a(fileInputStream, null);
                z = has;
                MethodCollector.o(10970);
                return z;
            } catch (Throwable th) {
                c.a(fileInputStream, th);
                MethodCollector.o(10970);
                throw th;
            }
        } catch (Exception unused) {
        }
    }

    private static FilterConfig d(FilterBean filterBean) {
        boolean z;
        FilterConfigExtra filterConfigExtra;
        String filterconfig;
        l.d(filterBean, "");
        HashMap<Integer, FilterConfig> hashMap = f95750b;
        FilterConfig filterConfig = hashMap.get(Integer.valueOf(filterBean.getId()));
        if (filterConfig != null) {
            return filterConfig;
        }
        String extra = filterBean.getExtra();
        if (extra == null || p.a((CharSequence) extra)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            if (f95751c == null) {
                f95751c = new f();
            }
            f fVar = f95751c;
            if (fVar == null || (filterConfigExtra = (FilterConfigExtra) fVar.a(extra, FilterConfigExtra.class)) == null || (filterconfig = filterConfigExtra.getFilterconfig()) == null) {
                return null;
            }
            FilterConfig filterConfig2 = (FilterConfig) fVar.a(filterconfig, FilterConfig.class);
            Integer valueOf = Integer.valueOf(filterBean.getId());
            l.b(filterConfig2, "");
            hashMap.put(valueOf, filterConfig2);
            return filterConfig2;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final String a(FilterBean filterBean, float f2) {
        l.d(filterBean, "");
        return filterBean.getFilterFolder() + ':' + b(filterBean) + ':' + f2;
    }
}
