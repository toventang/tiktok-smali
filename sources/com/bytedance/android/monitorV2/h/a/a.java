package com.bytedance.android.monitorV2.h.a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f23922a = "__hybrid_default";

    /* renamed from: b  reason: collision with root package name */
    public Map<String, C0514a> f23923b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public List<b> f23924c = new ArrayList();

    static {
        Covode.recordClassIndex(14129);
    }

    public final String toString() {
        return "BidInfo{bidInfoMap=" + this.f23923b + ", regexList=" + this.f23924c + '}';
    }

    /* renamed from: com.bytedance.android.monitorV2.h.a.a$a  reason: collision with other inner class name */
    public static class C0514a {
        public boolean A = false;
        public boolean B = false;
        public boolean C = false;
        public boolean D = false;
        public boolean E = false;
        public boolean F = false;
        public boolean G = false;
        public boolean H = false;
        public boolean I = false;
        public boolean J = false;
        public boolean K = false;
        public boolean L = false;
        public boolean M = false;
        public boolean N = false;
        public boolean O = false;

        /* renamed from: a  reason: collision with root package name */
        public String f23925a = a.f23922a;

        /* renamed from: b  reason: collision with root package name */
        public long f23926b;

        /* renamed from: c  reason: collision with root package name */
        public long f23927c;

        /* renamed from: d  reason: collision with root package name */
        public Map<String, Integer> f23928d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        public boolean f23929e = false;

        /* renamed from: f  reason: collision with root package name */
        public boolean f23930f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f23931g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f23932h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f23933i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f23934j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f23935k = false;

        /* renamed from: l  reason: collision with root package name */
        public boolean f23936l = false;

        /* renamed from: m  reason: collision with root package name */
        public boolean f23937m = false;
        public boolean n = false;
        public boolean o = false;
        public boolean p = false;
        public boolean q = false;
        public boolean r = false;
        public boolean s = false;
        public boolean t = false;
        public boolean u = false;
        public boolean v = false;
        public boolean w = false;
        public boolean x = false;
        public boolean y = false;
        public boolean z = false;

        static {
            Covode.recordClassIndex(14130);
        }

        public C0514a() {
        }

        public final String toString() {
            return "BidConfig{bid='" + this.f23925a + '\n' + ", hitSample=" + this.f23926b + ", settingId=" + this.f23927c + ", custom_p0=" + this.f23929e + ", custom_p1=" + this.f23930f + ", custom_p2=" + this.f23931g + ", custom_p3=" + this.f23932h + ", custom_p4=" + this.f23933i + ", custom_p5=" + this.f23934j + ", custom_p6=" + this.f23935k + ", custom_p7=" + this.f23936l + ", custom_p8=" + this.f23937m + '\n' + ", perf_web=" + this.n + ", ajax_web=" + this.o + ", static_perf_web=" + this.p + ", static_error_web=" + this.q + ", js_exception_web=" + this.r + ", blank_web=" + this.s + ", fetch_error_web=" + this.t + ", jsb_error_web=" + this.u + ", jsb_perf_web=" + this.v + ", falcon_perf_web=" + this.w + ", native_error_web=" + this.x + ", navigation_start_web=" + this.y + ", static_sri_web=" + this.z + '\n' + ", performance_lynx=" + this.A + ", blank_lynx=" + this.B + ", fetch_error_lynx=" + this.C + ", jsb_error_lynx=" + this.D + ", jsb_perf_lynx=" + this.E + ", native_error_lynx=" + this.F + ", navigation_start_lynx=" + this.G + '\n' + ", performance_reactnative=" + this.H + ", blank_reactnative=" + this.I + ", fetch_error_reactnative=" + this.J + ", jsb_error_reactnative=" + this.K + ", native_error_reactnative=" + this.L + ", container_error=" + this.M + ", js_exception_lynx=" + this.N + ", static_error_lynx=" + this.O + '}' + '\n';
        }

        public C0514a(String str) {
            if (!str.isEmpty()) {
                this.f23925a = str;
            }
        }
    }

    public final Map<String, Integer> b(String str) {
        return a(str).f23928d;
    }

    public final C0514a a(String str) {
        if (this.f23923b.containsKey(str)) {
            return this.f23923b.get(str);
        }
        if (this.f23923b.containsKey(f23922a)) {
            return this.f23923b.get(f23922a);
        }
        return new C0514a(f23922a);
    }
}
