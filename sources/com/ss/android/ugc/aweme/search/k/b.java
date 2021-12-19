package com.ss.android.ugc.aweme.search.k;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.search.k.b;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public class b<T extends b<T>> extends c<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f121205c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, String> f121206a = new HashMap<>();

    static {
        Covode.recordClassIndex(78973);
    }

    @Override // com.ss.android.ugc.aweme.metrics.c
    public void a() {
    }

    public void b() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(78974);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void e() {
        super.e();
        this.f109555g.putAll(this.f121206a);
    }

    public final T i(String str) {
        c("group_id", str);
        return this;
    }

    public final T j(String str) {
        c("author_id", str);
        return this;
    }

    public final T k(String str) {
        c("music_id", str);
        return this;
    }

    public final T l(String str) {
        c("user_list", str);
        return this;
    }

    public final T m(String str) {
        c("previous_page", str);
        return this;
    }

    public final T n(String str) {
        c("request_id", str);
        return this;
    }

    public final T p(String str) {
        c("enter_method", str);
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(String str) {
        super(str);
        l.d(str, "");
    }

    public final T o(String str) {
        this.f109556h = str;
        b();
        c("enter_from", str);
        return this;
    }

    public final T b(Map<String, String> map) {
        l.d(map, "");
        this.f121206a.putAll(map);
        return this;
    }

    public final T b(String str, String str2) {
        l.d(str, "");
        HashMap<String, String> hashMap = this.f121206a;
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put(str, str2);
        return this;
    }

    public final T c(String str, String str2) {
        l.d(str, "");
        if (!(str2 == null || str2.length() == 0)) {
            this.f121206a.put(str, str2);
        }
        return this;
    }
}
