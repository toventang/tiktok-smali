package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Arrays;
import java.util.List;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f102431a = new String[0];

    /* renamed from: b  reason: collision with root package name */
    public static final a f102432b = new a((byte) 0);

    public static final class a {

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.p$a$a  reason: collision with other inner class name */
        public static final class C2569a {

            /* renamed from: d  reason: collision with root package name */
            public static String f102433d = "";

            /* renamed from: e  reason: collision with root package name */
            public static String f102434e = "large";

            /* renamed from: f  reason: collision with root package name */
            public static String f102435f = "medium";

            /* renamed from: g  reason: collision with root package name */
            public static String f102436g = "thumb";

            /* renamed from: h  reason: collision with root package name */
            public static final C2570a f102437h = new C2570a((byte) 0);

            /* renamed from: a  reason: collision with root package name */
            public List<String> f102438a;

            /* renamed from: b  reason: collision with root package name */
            public String f102439b;

            /* renamed from: c  reason: collision with root package name */
            public String f102440c;

            /* renamed from: i  reason: collision with root package name */
            private String f102441i = f102433d;

            /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.p$a$a$a  reason: collision with other inner class name */
            public static final class C2570a {
                static {
                    Covode.recordClassIndex(65576);
                }

                private C2570a() {
                }

                public /* synthetic */ C2570a(byte b2) {
                    this();
                }
            }

            static {
                Covode.recordClassIndex(65575);
            }

            public final String a() {
                String a2 = com.a.a("/img/%s~tplv-x-get:%s.image%s%s", Arrays.copyOf(new Object[]{this.f102439b, this.f102441i, "%%secretKey=", this.f102440c}, 4));
                l.b(a2, "");
                return a2;
            }

            public C2569a(List<String> list, String str, String str2) {
                l.d(list, "");
                l.d(str, "");
                l.d(str2, "");
                this.f102439b = str;
                this.f102440c = str2;
                this.f102438a = list;
            }
        }

        static {
            Covode.recordClassIndex(65574);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(65573);
    }
}
