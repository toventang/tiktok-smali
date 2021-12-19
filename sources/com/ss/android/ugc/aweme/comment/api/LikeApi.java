package com.ss.android.ugc.aweme.comment.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.comment.model.LikeListResponse;
import f.a.t;
import h.f.b.m;
import h.h;
import h.i;
import l.b.c;
import l.b.e;
import l.b.o;

public final class LikeApi {

    /* renamed from: a  reason: collision with root package name */
    static final String f71447a = ("https://" + d.f34604k.f34586a);

    /* renamed from: b  reason: collision with root package name */
    public static final LikeApi f71448b = new LikeApi();

    /* renamed from: c  reason: collision with root package name */
    private static final h f71449c = i.a((h.f.a.a) b.f71451a);

    public interface Api {

        public static final class a {
            static {
                Covode.recordClassIndex(43979);
            }
        }

        static {
            Covode.recordClassIndex(43978);
        }

        @o(a = "/tiktok/video/like/list/v1")
        @e
        t<LikeListResponse> fetchLikeList(@c(a = "aweme_id") String str, @c(a = "cursor") long j2, @c(a = "count") int i2, @c(a = "insert_ids") String str2, @c(a = "scenario") int i3);
    }

    public static Api a() {
        return (Api) f71449c.getValue();
    }

    public enum a {
        NORMAL(0),
        BULLET(1);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(43980);
        }

        private a(int i2) {
            this.value = i2;
        }
    }

    private LikeApi() {
    }

    static final class b extends m implements h.f.a.a<Api> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f71451a = new b();

        static {
            Covode.recordClassIndex(43981);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Api invoke() {
            return RetrofitFactory.a().a(LikeApi.f71447a).a(Api.class);
        }
    }

    static {
        Covode.recordClassIndex(43977);
    }
}
