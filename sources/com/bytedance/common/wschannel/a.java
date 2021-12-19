package com.bytedance.common.wschannel;

import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    final int f26993a;

    /* renamed from: b  reason: collision with root package name */
    String f26994b;

    /* renamed from: c  reason: collision with root package name */
    String f26995c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f26996d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    List<String> f26997e;

    /* renamed from: f  reason: collision with root package name */
    int f26998f;

    /* renamed from: g  reason: collision with root package name */
    int f26999g;

    /* renamed from: h  reason: collision with root package name */
    String f27000h;

    /* renamed from: i  reason: collision with root package name */
    int f27001i;

    static {
        Covode.recordClassIndex(15935);
    }

    /* renamed from: com.bytedance.common.wschannel.a$a  reason: collision with other inner class name */
    public static class C0580a {

        /* renamed from: a  reason: collision with root package name */
        Map<String, String> f27002a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        List<String> f27003b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public int f27004c;

        /* renamed from: d  reason: collision with root package name */
        public int f27005d;

        /* renamed from: e  reason: collision with root package name */
        public int f27006e;

        /* renamed from: f  reason: collision with root package name */
        public String f27007f;

        /* renamed from: g  reason: collision with root package name */
        public String f27008g;

        /* renamed from: h  reason: collision with root package name */
        public String f27009h;

        /* renamed from: i  reason: collision with root package name */
        private final int f27010i;

        static {
            Covode.recordClassIndex(15936);
        }

        public final a a() {
            return new a(this.f27005d, this.f27004c, this.f27006e, this.f27007f, this.f27010i, this.f27008g, this.f27009h, this.f27003b, this.f27002a);
        }

        public static C0580a a(int i2) {
            return new C0580a(i2);
        }

        private C0580a(int i2) {
            this.f27010i = i2;
        }

        public final C0580a a(List<String> list) {
            if (list != null) {
                this.f27003b.addAll(list);
            }
            return this;
        }

        public final C0580a a(Map<String, String> map) {
            this.f27002a.putAll(map);
            return this;
        }

        public final C0580a a(String str, String str2) {
            if (!m.a(str)) {
                this.f27002a.put(str, str2);
            }
            return this;
        }
    }

    public final String toString() {
        return "ChannelInfo{channelId = " + this.f26993a + ", deviceId = " + this.f26995c + ", installId = " + this.f26995c + ", fpid = " + this.f26998f + ", aid = " + this.f26999g + ", updateVersionCode = " + this.f27001i + ", appKey = " + this.f27000h + ", extra = " + this.f26996d + ", urls = " + this.f26997e + "}";
    }

    public a(int i2, int i3, int i4, String str, int i5, String str2, String str3, List<String> list, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        this.f26997e = arrayList;
        this.f26993a = i5;
        this.f26994b = str2;
        this.f26995c = str3;
        this.f27001i = i4;
        if (list != null) {
            arrayList.addAll(list);
        }
        if (map != null) {
            this.f26996d.putAll(map);
        }
        this.f26998f = i2;
        this.f26999g = i3;
        this.f27000h = str;
    }
}
