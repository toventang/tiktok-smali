package com.bytedance.lynx.hybrid.b.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final b f40881g = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f40882a = "";

    /* renamed from: b  reason: collision with root package name */
    public EnumC0990a f40883b = EnumC0990a.PUBLIC;

    /* renamed from: c  reason: collision with root package name */
    public String f40884c = "";

    /* renamed from: d  reason: collision with root package name */
    public b f40885d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f40886e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f40887f = true;

    static {
        Covode.recordClassIndex(25063);
    }

    /* renamed from: com.bytedance.lynx.hybrid.b.a.a$a  reason: collision with other inner class name */
    public enum EnumC0990a {
        PUBLIC("public"),
        PROTECT("protected"),
        PRIVATE("private"),
        SECURE("secure");
        
        private final String value;

        public final String getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(25064);
        }

        private EnumC0990a(String str) {
            this.value = str;
        }
    }

    public static final class b {
        static {
            Covode.recordClassIndex(25065);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final void a(EnumC0990a aVar) {
        l.c(aVar, "");
        this.f40883b = aVar;
    }

    public final void b(String str) {
        l.c(str, "");
        this.f40884c = str;
    }

    public final void a(String str) {
        l.c(str, "");
        this.f40882a = str;
    }
}
