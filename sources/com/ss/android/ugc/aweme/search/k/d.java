package com.ss.android.ugc.aweme.search.k;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.utils.w;
import h.f.b.l;

public class d<T extends c<T>> extends c<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f121246b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final r f121247a;

    static {
        Covode.recordClassIndex(79013);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(79014);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.k.b
    public final void b() {
        String str = this.f109554f;
        l.b(str, "");
        String str2 = this.f109556h;
        r rVar = this.f121247a;
        l.d(str, "");
        a(w.a((Aweme) null, str, str2, rVar));
    }

    public final T r(String str) {
        c("list_result_type", str);
        return this;
    }

    public final T s(String str) {
        c("aladdin_words", str);
        return this;
    }

    public final T t(String str) {
        b("user_tag", str);
        return this;
    }

    public final T u(String str) {
        c("user_name", str);
        return this;
    }

    public final T v(String str) {
        c("list_item_id", str);
        return this;
    }

    public final T x(String str) {
        c("token_type", str);
        return this;
    }

    public final T y(String str) {
        c("item_rank", str);
        return this;
    }

    public final T c(Integer num) {
        c("relation_tag", String.valueOf(num));
        return this;
    }

    public final T d(Integer num) {
        c("aladdin_rank", String.valueOf(num));
        return this;
    }

    public final T w(String str) {
        l.d(str, "");
        c("is_aladdin", str);
        return this;
    }

    public final T z(String str) {
        if (TextUtils.isEmpty(str) || l.a((Object) "null", (Object) str)) {
            b("music_tag_info", "");
        } else {
            c("music_tag_info", str);
        }
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(String str, r rVar) {
        super(str);
        l.d(str, "");
        this.f121247a = rVar;
    }
}
