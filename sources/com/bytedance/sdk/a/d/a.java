package com.bytedance.sdk.a.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.account.f;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f43146a;

    /* renamed from: b  reason: collision with root package name */
    public final String f43147b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f43148c;

    /* renamed from: d  reason: collision with root package name */
    public long f43149d;

    /* renamed from: e  reason: collision with root package name */
    public final String f43150e;

    /* renamed from: f  reason: collision with root package name */
    public final String f43151f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f43152g;

    static {
        Covode.recordClassIndex(26465);
    }

    /* renamed from: com.bytedance.sdk.a.d.a$a  reason: collision with other inner class name */
    public static class C1046a {

        /* renamed from: a  reason: collision with root package name */
        public String f43153a;

        /* renamed from: b  reason: collision with root package name */
        private String f43154b;

        /* renamed from: c  reason: collision with root package name */
        private Map<String, String> f43155c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f43156d;

        static {
            Covode.recordClassIndex(26466);
        }

        public final C1046a a() {
            if (this.f43155c == null) {
                this.f43155c = new HashMap();
            }
            if (f.a().d()) {
                this.f43155c.put("multi_login", "1");
            }
            return this;
        }

        public final a b() {
            this.f43154b = "get";
            a aVar = new a(this.f43153a, this.f43154b, this.f43155c);
            aVar.f43152g = this.f43156d;
            return aVar;
        }

        public final a c() {
            this.f43154b = UGCMonitor.TYPE_POST;
            a aVar = new a(this.f43153a, this.f43154b, this.f43155c);
            aVar.f43152g = this.f43156d;
            return aVar;
        }

        public final C1046a a(Map<String, String> map) {
            if (this.f43155c == null) {
                this.f43155c = map;
            } else if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    this.f43155c.put(entry.getKey(), entry.getValue());
                }
            }
            return this;
        }

        public final C1046a a(String str, String str2) {
            if (this.f43155c == null) {
                this.f43155c = new HashMap();
            }
            this.f43155c.put(str, str2);
            return this;
        }

        public final C1046a a(Map<String, String> map, Map<String, String> map2) {
            if (this.f43155c == null) {
                this.f43155c = new HashMap();
            }
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    this.f43155c.put(entry.getKey(), entry.getValue());
                }
            }
            if (map2 != null && !map2.isEmpty()) {
                for (String str : map2.keySet()) {
                    if (!TextUtils.isEmpty(str) && map2.get(str) != null) {
                        this.f43155c.put(str, map2.get(str));
                    }
                }
            }
            return this;
        }
    }

    public final String a(String str) {
        Map<String, String> map = this.f43148c;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public a(String str, String str2, Map<String, String> map) {
        this.f43146a = str;
        this.f43147b = str2;
        this.f43148c = map;
    }
}
