package com.ss.android.ugc.aweme.mvtemplate.api;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.mvtemplate.a.c;
import java.util.Map;
import l.b.d;
import l.b.e;
import l.b.f;
import l.b.o;
import l.b.t;

public final class MovieDetailAPi {

    /* renamed from: a  reason: collision with root package name */
    public static final int f112155a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final String f112156b = "template_id";

    /* renamed from: c  reason: collision with root package name */
    public static final String f112157c = "template_type";

    /* renamed from: d  reason: collision with root package name */
    public static final String f112158d = "operate_type";

    /* renamed from: e  reason: collision with root package name */
    public static final String f112159e = Api.f66569d;

    /* renamed from: f  reason: collision with root package name */
    public static final a f112160f = new a((byte) 0);

    public interface MvDetail {
        static {
            Covode.recordClassIndex(72057);
        }

        @o(a = "/aweme/v1/ulike/collect/template/")
        @e
        q<Object> collectTemplate(@d Map<String, Object> map);

        @f(a = "/aweme/v1/mv/detail/")
        q<com.ss.android.ugc.aweme.mvtemplate.a.d> getMvDetail(@t(a = "mv_id") String str);

        @f(a = "/aweme/v1/mv/aweme/")
        q<c> getMvDetailList(@t(a = "mv_id") String str, @t(a = "cursor") long j2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72058);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(72056);
    }
}
