package com.ss.android.ugc.aweme.question.g;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a {
    @c(a = "translation_info")

    /* renamed from: a  reason: collision with root package name */
    public List<C3095a> f119970a = new ArrayList();
    @c(a = "trg_lang")

    /* renamed from: b  reason: collision with root package name */
    public String f119971b;

    static {
        Covode.recordClassIndex(77935);
    }

    public final void a(String str) {
        if (str != null) {
            this.f119970a.add(new C3095a(this, str));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.g.a$a  reason: collision with other inner class name */
    public final class C3095a {
        @c(a = "src_content")

        /* renamed from: a  reason: collision with root package name */
        public String f119972a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f119973b;

        static {
            Covode.recordClassIndex(77936);
        }

        public C3095a(a aVar, String str) {
            l.d(str, "");
            this.f119973b = aVar;
            this.f119972a = str;
        }
    }
}
