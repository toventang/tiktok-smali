package com.ss.android.ugc.aweme.discover.lynx.d;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.search.k.b;
import h.f.b.l;
import h.m.p;
import java.util.concurrent.ConcurrentHashMap;

public final class c extends b<c> {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, Integer> f81471a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final a f81472b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(50628);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void b(String str) {
            if (str != null && !p.a((CharSequence) str)) {
                c.f81471a.remove(str);
            }
        }

        public static int a(String str) {
            if (str == null || p.a((CharSequence) str)) {
                return 3;
            }
            Integer num = c.f81471a.get(str);
            if (num != null) {
                return num.intValue();
            }
            return 1;
        }

        public static void a(String str, int i2) {
            l.d(str, "");
            c.f81471a.put(str, Integer.valueOf(i2));
        }
    }

    public c() {
        super("search_lynx_load_event");
    }

    static {
        Covode.recordClassIndex(50627);
    }

    public final c a(String str) {
        c(StringSet.type, str);
        return this;
    }

    public final c b(String str) {
        c("schema", str);
        return this;
    }

    public final c c(String str) {
        c("error", str);
        return this;
    }

    public final c d(String str) {
        c("rank", str);
        return this;
    }

    public final c e(String str) {
        c("prerender", str);
        return this;
    }

    public final c f(String str) {
        c("load_time", str);
        return this;
    }

    public final c g(String str) {
        c("is_built_in", str);
        return this;
    }

    public final c a(int i2) {
        c("load_stage", String.valueOf(i2));
        return this;
    }

    public final c b(int i2) {
        c("container_type", String.valueOf(i2));
        return this;
    }

    public final c a(boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        c("continue_render", str);
        return this;
    }
}
