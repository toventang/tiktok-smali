package com.ss.android.ugc.aweme.comment.n;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.ArrayList;
import java.util.List;

public final class b {
    @c(a = "translation_info")

    /* renamed from: a  reason: collision with root package name */
    public List<a> f72120a = new ArrayList();
    @c(a = "trg_lang")

    /* renamed from: b  reason: collision with root package name */
    public String f72121b;

    static {
        Covode.recordClassIndex(44318);
    }

    public final void a(String str) {
        this.f72120a.add(new a(str));
    }

    public class a {
        @c(a = "src_content")

        /* renamed from: a  reason: collision with root package name */
        public String f72122a;

        static {
            Covode.recordClassIndex(44319);
        }

        public a(String str) {
            this.f72122a = str;
        }
    }
}
