package com.ss.android.ugc.aweme.ck;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ck.t;
import h.a.n;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.l.k;
import java.util.Iterator;
import java.util.Set;

public final class e implements t.b {

    /* renamed from: a  reason: collision with root package name */
    public static final e f71130a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(43774);
    }

    static final class a extends m implements b<String, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f71131a = new a();

        static {
            Covode.recordClassIndex(43775);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(String str) {
            return Boolean.valueOf(!l.a((Object) str, (Object) "cid"));
        }
    }

    @Override // com.ss.android.ugc.aweme.ck.t.b
    public final String a(String str) {
        Uri parse;
        String queryParameter;
        if (str == null || (queryParameter = (parse = Uri.parse(str)).getQueryParameter("cid")) == null || queryParameter.length() == 0) {
            return "";
        }
        Uri.Builder buildUpon = Uri.parse("aweme://challenge/detail/".concat(String.valueOf(queryParameter))).buildUpon();
        l.b(parse, "");
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        l.b(queryParameterNames, "");
        Iterator a2 = k.a(n.t(queryParameterNames), (b) a.f71131a).a();
        while (a2.hasNext()) {
            String str2 = (String) a2.next();
            buildUpon.appendQueryParameter(str2, parse.getQueryParameter(str2));
        }
        String builder = buildUpon.toString();
        l.b(builder, "");
        return builder;
    }
}
