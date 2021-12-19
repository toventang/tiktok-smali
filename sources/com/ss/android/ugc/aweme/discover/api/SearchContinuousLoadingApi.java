package com.ss.android.ugc.aweme.discover.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.ContinuousLoadingAwemeList;
import f.a.t;
import h.f.b.l;
import l.b.f;

public interface SearchContinuousLoadingApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f80791a = a.f80792a;

    static {
        Covode.recordClassIndex(50240);
    }

    @f(a = "/aweme/v1/search/loadmore/")
    t<ContinuousLoadingAwemeList> getAwemeList(@l.b.t(a = "keyword") String str, @l.b.t(a = "type") int i2, @l.b.t(a = "id") String str2, @l.b.t(a = "cursor") int i3, @l.b.t(a = "count") int i4, @l.b.t(a = "last_create_time") long j2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f80792a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(50241);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public String f80793a;

        /* renamed from: b  reason: collision with root package name */
        public int f80794b = -1;

        /* renamed from: c  reason: collision with root package name */
        public String f80795c;

        /* renamed from: d  reason: collision with root package name */
        public int f80796d;

        /* renamed from: e  reason: collision with root package name */
        public int f80797e = 10;

        /* renamed from: f  reason: collision with root package name */
        public long f80798f;

        static {
            Covode.recordClassIndex(50242);
        }

        public final void a(b bVar) {
            l.d(bVar, "");
            this.f80793a = bVar.f80793a;
            this.f80794b = bVar.f80794b;
            this.f80795c = bVar.f80795c;
            this.f80796d = bVar.f80796d;
            this.f80797e = bVar.f80797e;
            this.f80798f = bVar.f80798f;
        }
    }
}
