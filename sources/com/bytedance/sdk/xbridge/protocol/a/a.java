package com.bytedance.sdk.xbridge.protocol.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: l  reason: collision with root package name */
    public static final C1068a f43926l = new C1068a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f43927a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f43928b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f43929c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f43930d = "";

    /* renamed from: e  reason: collision with root package name */
    public Object f43931e;

    /* renamed from: f  reason: collision with root package name */
    public String f43932f = "";

    /* renamed from: g  reason: collision with root package name */
    public String f43933g = "DEFAULT";

    /* renamed from: h  reason: collision with root package name */
    public String f43934h = "";

    /* renamed from: i  reason: collision with root package name */
    public long f43935i = -1;

    /* renamed from: j  reason: collision with root package name */
    public String f43936j = "";

    /* renamed from: k  reason: collision with root package name */
    public b f43937k;

    public enum b {
        Lynx,
        Web;

        static {
            Covode.recordClassIndex(26843);
        }
    }

    static {
        Covode.recordClassIndex(26841);
    }

    /* renamed from: com.bytedance.sdk.xbridge.protocol.a.a$a  reason: collision with other inner class name */
    public static final class C1068a {
        static {
            Covode.recordClassIndex(26842);
        }

        private C1068a() {
        }

        public /* synthetic */ C1068a(byte b2) {
            this();
        }
    }

    public final String toString() {
        return "BridgeCall(callbackId='" + this.f43927a + "', bridgeName='" + this.f43928b + "', url='" + this.f43929c + "', msgType='" + this.f43930d + "', params='" + this.f43931e + "', sdkVersion=" + this.f43932f + ", nameSpace='" + this.f43933g + "', frameUrl='" + this.f43934h + "')";
    }

    public final void a(b bVar) {
        l.c(bVar, "");
        this.f43937k = bVar;
    }

    public final void b(String str) {
        l.c(str, "");
        this.f43928b = str;
    }

    public final void c(String str) {
        l.c(str, "");
        this.f43929c = str;
    }

    public final void d(String str) {
        l.c(str, "");
        this.f43930d = str;
    }

    public final void e(String str) {
        l.c(str, "");
        this.f43932f = str;
    }

    public final void f(String str) {
        l.c(str, "");
        this.f43933g = str;
    }

    public final void g(String str) {
        l.c(str, "");
        this.f43934h = str;
    }

    public final void a(String str) {
        l.c(str, "");
        this.f43927a = str;
    }
}
