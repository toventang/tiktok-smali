package com.benchmark.b;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class c {
    @com.google.gson.a.c(a = "key")

    /* renamed from: a  reason: collision with root package name */
    public String f6051a;
    @com.google.gson.a.c(a = "configs")

    /* renamed from: b  reason: collision with root package name */
    public List<C0080c> f6052b = new ArrayList();

    static {
        Covode.recordClassIndex(2944);
    }

    public class a {
        @com.google.gson.a.c(a = "min_value")

        /* renamed from: a  reason: collision with root package name */
        public float f6053a = -1.0f;
        @com.google.gson.a.c(a = "max_value")

        /* renamed from: b  reason: collision with root package name */
        public float f6054b = -1.0f;
        @com.google.gson.a.c(a = "operator")

        /* renamed from: c  reason: collision with root package name */
        public int f6055c;

        static {
            Covode.recordClassIndex(2945);
        }

        public a() {
        }
    }

    public class b {
        @com.google.gson.a.c(a = "temp")

        /* renamed from: a  reason: collision with root package name */
        public a f6057a;
        @com.google.gson.a.c(a = "battery")

        /* renamed from: b  reason: collision with root package name */
        public a f6058b;
        @com.google.gson.a.c(a = "memory")

        /* renamed from: c  reason: collision with root package name */
        public a f6059c;

        static {
            Covode.recordClassIndex(2946);
        }

        public b() {
            this.f6057a = new a();
            this.f6058b = new a();
            this.f6059c = new a();
        }
    }

    /* renamed from: com.benchmark.b.c$c  reason: collision with other inner class name */
    public class C0080c {
        @com.google.gson.a.c(a = "config_type")

        /* renamed from: a  reason: collision with root package name */
        public int f6061a;
        @com.google.gson.a.c(a = "config")

        /* renamed from: b  reason: collision with root package name */
        public String f6062b = "";
        @com.google.gson.a.c(a = "matched")

        /* renamed from: c  reason: collision with root package name */
        public int f6063c;
        @com.google.gson.a.c(a = "cond_list")

        /* renamed from: d  reason: collision with root package name */
        public List<b> f6064d = new ArrayList();

        static {
            Covode.recordClassIndex(2947);
        }

        public C0080c() {
        }
    }

    public static void a(a aVar, String str) {
        if (!str.isEmpty()) {
            char charAt = str.charAt(0);
            char charAt2 = str.charAt(str.length() - 1);
            String[] split = str.split(",");
            String substring = split[0].substring(1);
            String substring2 = split[1].substring(0, split[1].length() - 1);
            aVar.f6053a = Float.parseFloat(substring);
            aVar.f6054b = Float.parseFloat(substring2);
            if (aVar.f6054b <= 0.0f) {
                aVar.f6054b = Float.MAX_VALUE;
            }
            if (charAt == '(') {
                if (charAt2 == ')') {
                    aVar.f6055c = g.ON_ON.ordinal();
                    return;
                }
            } else if (charAt != '(') {
                if (charAt == '[' && charAt2 == ')') {
                    aVar.f6055c = g.OFF_ON.ordinal();
                    return;
                }
                aVar.f6055c = g.OFF_OFF.ordinal();
            }
            if (charAt2 == ']') {
                aVar.f6055c = g.ON_OFF.ordinal();
                return;
            }
            aVar.f6055c = g.OFF_OFF.ordinal();
        }
    }
}
