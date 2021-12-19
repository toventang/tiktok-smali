package com.bytedance.ies.xbridge.i.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.List;

public final class e extends com.bytedance.ies.xbridge.model.params.a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f36117f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f36118a;

    /* renamed from: b  reason: collision with root package name */
    public String f36119b;

    /* renamed from: c  reason: collision with root package name */
    public n f36120c;

    /* renamed from: d  reason: collision with root package name */
    public n f36121d;

    /* renamed from: e  reason: collision with root package name */
    public List<b> f36122e;

    static {
        Covode.recordClassIndex(21595);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21596);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String a() {
        String str = this.f36119b;
        if (str == null) {
            l.a("filePath");
        }
        return str;
    }

    @Override // com.bytedance.ies.xbridge.model.params.a
    public final List<String> provideParamList() {
        return h.a.n.b("url", "filePath", "params", "header", "formDataBody");
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f36123a;

        /* renamed from: b  reason: collision with root package name */
        public final String f36124b;

        static {
            Covode.recordClassIndex(21597);
        }

        public b(String str, String str2) {
            l.c(str, "");
            l.c(str2, "");
            this.f36123a = str;
            this.f36124b = str2;
        }
    }
}
