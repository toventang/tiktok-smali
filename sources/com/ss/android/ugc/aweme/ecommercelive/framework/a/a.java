package com.ss.android.ugc.aweme.ecommercelive.framework.a;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2133a f88003a = new C2133a((byte) 0);

    static {
        Covode.recordClassIndex(55325);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.framework.a.a$a  reason: collision with other inner class name */
    public static final class C2133a {
        static {
            Covode.recordClassIndex(55326);
        }

        private C2133a() {
        }

        public /* synthetic */ C2133a(byte b2) {
            this();
        }

        public static int a(String str) {
            if (str == null) {
                return 0;
            }
            int hashCode = str.hashCode();
            if (hashCode != 3322092) {
                if (hashCode != 112202875) {
                    if (hashCode == 644224882 && str.equals("show_window")) {
                        return 3;
                    }
                    return 0;
                } else if (str.equals("video")) {
                    return 2;
                } else {
                    return 0;
                }
            } else if (str.equals("live")) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
