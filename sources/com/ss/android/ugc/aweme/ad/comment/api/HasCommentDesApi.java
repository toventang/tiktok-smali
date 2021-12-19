package com.ss.android.ugc.aweme.ad.comment.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.z;
import com.bytedance.retrofit2.d;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.base.utils.m;
import h.f.b.l;
import h.h;
import h.i;

public final class HasCommentDesApi {

    /* renamed from: a  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.ad.comment.a.b f65609a;

    /* renamed from: b  reason: collision with root package name */
    public static final h f65610b = i.a((h.f.a.a) c.f65616a);

    /* renamed from: c  reason: collision with root package name */
    public static final HasCommentDesApi f65611c = new HasCommentDesApi();

    public interface Api {
        static {
            Covode.recordClassIndex(40383);
        }

        @com.bytedance.retrofit2.b.h(a = "/tiktok/v1/ad/privacy/settings/description/")
        com.bytedance.retrofit2.b<a> getResponse(@z(a = "item_id") String str);
    }

    /* access modifiers changed from: package-private */
    public static final class a {
        @com.google.gson.a.c(a = "status_code")

        /* renamed from: a  reason: collision with root package name */
        public final int f65612a;
        @com.google.gson.a.c(a = "status_msg")

        /* renamed from: b  reason: collision with root package name */
        public final String f65613b;
        @com.google.gson.a.c(a = "has_ad_comment_des")

        /* renamed from: c  reason: collision with root package name */
        public final boolean f65614c;

        static {
            Covode.recordClassIndex(40384);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f65612a == aVar.f65612a && l.a(this.f65613b, aVar.f65613b) && this.f65614c == aVar.f65614c;
        }

        public final int hashCode() {
            int i2 = this.f65612a * 31;
            String str = this.f65613b;
            int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
            boolean z = this.f65614c;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            return hashCode + i3;
        }

        public final String toString() {
            return "HasCResponse(statusCode=" + this.f65612a + ", statusMsg=" + this.f65613b + ", hasAdCommentDes=" + this.f65614c + ")";
        }
    }

    private HasCommentDesApi() {
    }

    public static final class b implements d<a> {
        static {
            Covode.recordClassIndex(40385);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static final a f65615a = new a();

            static {
                Covode.recordClassIndex(40386);
            }

            a() {
            }

            public final void run() {
                com.ss.android.ugc.aweme.ad.comment.a.b bVar = HasCommentDesApi.f65609a;
                if (bVar != null) {
                    bVar.a();
                }
                HasCommentDesApi.f65609a = null;
            }
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<a> bVar, Throwable th) {
            HasCommentDesApi.f65609a = null;
        }

        @Override // com.bytedance.retrofit2.d
        public final void a(com.bytedance.retrofit2.b<a> bVar, u<a> uVar) {
            if (uVar == null || !uVar.f42629a.a() || !uVar.f42630b.f65614c) {
                HasCommentDesApi.f65609a = null;
            } else {
                m.a(a.f65615a);
            }
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<Api> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f65616a = new c();

        static {
            Covode.recordClassIndex(40387);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Api invoke() {
            return RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(Api.class);
        }
    }

    static {
        Covode.recordClassIndex(40382);
    }
}
