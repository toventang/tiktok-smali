package com.ss.android.ugc.aweme.favorites.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.favorites.api.VideoCollectionApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import f.a.t;
import h.f.b.l;
import java.util.List;

public final class j implements com.bytedance.assem.arch.a.a<k> {

    /* renamed from: a  reason: collision with root package name */
    public final VideoCollectionApi f90620a = VideoCollectionApi.a.a();

    /* renamed from: b  reason: collision with root package name */
    public final k f90621b = new a(this);

    static {
        Covode.recordClassIndex(56923);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.a.a
    public final /* bridge */ /* synthetic */ k a() {
        return this.f90621b;
    }

    public static final class a implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f90622a;

        static {
            Covode.recordClassIndex(56924);
        }

        /* renamed from: com.ss.android.ugc.aweme.favorites.e.j$a$a  reason: collision with other inner class name */
        static final class C2191a<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final C2191a f90623a = new C2191a();

            static {
                Covode.recordClassIndex(56925);
            }

            C2191a() {
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                ((com.ss.android.ugc.aweme.base.api.a) obj).checkValid();
            }
        }

        static final class b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final b f90624a = new b();

            static {
                Covode.recordClassIndex(56926);
            }

            b() {
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                ((com.ss.android.ugc.aweme.base.api.a) obj).checkValid();
            }
        }

        static final class d<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final d f90626a = new d();

            static {
                Covode.recordClassIndex(56928);
            }

            d() {
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                ((com.ss.android.ugc.aweme.base.api.a) obj).checkValid();
            }
        }

        static final class e<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final e f90627a = new e();

            static {
                Covode.recordClassIndex(56929);
            }

            e() {
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                ((com.ss.android.ugc.aweme.base.api.a) obj).checkValid();
            }
        }

        static final class f<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final f f90628a = new f();

            static {
                Covode.recordClassIndex(56930);
            }

            f() {
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                ((com.ss.android.ugc.aweme.base.api.a) obj).checkValid();
            }
        }

        static final class g<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final g f90629a = new g();

            static {
                Covode.recordClassIndex(56931);
            }

            g() {
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                ((com.ss.android.ugc.aweme.base.api.a) obj).checkValid();
            }
        }

        static final class h<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final h f90630a = new h();

            static {
                Covode.recordClassIndex(56932);
            }

            h() {
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                ((com.ss.android.ugc.aweme.base.api.a) obj).checkValid();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(j jVar) {
            this.f90622a = jVar;
        }

        @Override // com.ss.android.ugc.aweme.favorites.e.k
        public final t<BaseResponse> b(String str) {
            l.d(str, "");
            return this.f90622a.f90620a.unFavorites(str, 0);
        }

        @Override // com.ss.android.ugc.aweme.favorites.e.k
        public final t<com.ss.android.ugc.aweme.favorites.api.b> a(int i2) {
            t<com.ss.android.ugc.aweme.favorites.api.b> b2 = this.f90622a.f90620a.allFavoritesDetail(i2).b(d.f90626a);
            l.b(b2, "");
            return b2;
        }

        @Override // com.ss.android.ugc.aweme.favorites.e.k
        public final t<com.ss.android.ugc.aweme.favorites.api.c> b(long j2) {
            int i2;
            VideoCollectionApi videoCollectionApi = this.f90622a.f90620a;
            if (j2 == 0) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            t<com.ss.android.ugc.aweme.favorites.api.c> b2 = videoCollectionApi.candidateContent(j2, 30, i2).b(e.f90627a);
            l.b(b2, "");
            return b2;
        }

        static final class c<T, R> implements f.a.d.g {

            /* renamed from: a  reason: collision with root package name */
            public static final c f90625a = new c();

            static {
                Covode.recordClassIndex(56927);
            }

            c() {
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                com.ss.android.ugc.aweme.favorites.api.a aVar = (com.ss.android.ugc.aweme.favorites.api.a) obj;
                l.d(aVar, "");
                List<Aweme> list = aVar.f90442a;
                Long l2 = aVar.f90443b;
                Integer num = aVar.f90444c;
                boolean z = true;
                if (num == null || num.intValue() != 1) {
                    z = false;
                }
                return new com.ss.android.ugc.aweme.favorites.api.c(list, l2, Boolean.valueOf(z));
            }
        }

        @Override // com.ss.android.ugc.aweme.favorites.e.k
        public final t<com.ss.android.ugc.aweme.favorites.api.c> a(long j2) {
            t<R> d2 = this.f90622a.f90620a.allFavoritesContent(j2, 30).b(b.f90624a).d(c.f90625a);
            l.b(d2, "");
            return d2;
        }

        @Override // com.ss.android.ugc.aweme.favorites.e.k
        public final t<com.ss.android.ugc.aweme.favorites.api.g> a(com.ss.android.ugc.aweme.favorites.api.f fVar) {
            String str;
            String str2;
            l.d(fVar, "");
            VideoCollectionApi videoCollectionApi = this.f90622a.f90620a;
            int i2 = fVar.f90461a;
            String str3 = fVar.f90462b;
            String str4 = fVar.f90463c;
            String str5 = fVar.f90464d;
            String str6 = fVar.f90465e;
            List<String> list = fVar.f90466f;
            String str7 = null;
            if (list != null) {
                str = list.toString();
            } else {
                str = null;
            }
            List<String> list2 = fVar.f90467g;
            if (list2 != null) {
                str2 = list2.toString();
            } else {
                str2 = null;
            }
            List<String> list3 = fVar.f90468h;
            if (list3 != null) {
                str7 = list3.toString();
            }
            t<com.ss.android.ugc.aweme.favorites.api.g> b2 = videoCollectionApi.collectionManage(i2, str3, str4, str5, str6, str, str2, str7).b(h.f90630a);
            l.b(b2, "");
            return b2;
        }

        @Override // com.ss.android.ugc.aweme.favorites.e.k
        public final t<com.ss.android.ugc.aweme.favorites.api.h> a(String str) {
            l.d(str, "");
            t<com.ss.android.ugc.aweme.favorites.api.h> b2 = this.f90622a.f90620a.collectionNameCheck(1, str).b(C2191a.f90623a);
            l.b(b2, "");
            return b2;
        }

        @Override // com.ss.android.ugc.aweme.favorites.e.k
        public final t<com.ss.android.ugc.aweme.favorites.api.e> a(long j2, String str) {
            t<com.ss.android.ugc.aweme.favorites.api.e> b2 = this.f90622a.f90620a.collectionDetailList(j2, 30, str).b(g.f90629a);
            l.b(b2, "");
            return b2;
        }

        @Override // com.ss.android.ugc.aweme.favorites.e.k
        public final t<com.ss.android.ugc.aweme.favorites.api.c> a(String str, long j2) {
            int i2;
            l.d(str, "");
            VideoCollectionApi videoCollectionApi = this.f90622a.f90620a;
            if (j2 == 0) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            t<com.ss.android.ugc.aweme.favorites.api.c> b2 = videoCollectionApi.collectionContent(str, j2, 30, i2).b(f.f90628a);
            l.b(b2, "");
            return b2;
        }
    }
}
