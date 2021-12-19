package com.ss.android.ugc.aweme.profile.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.c.b;
import f.a.t;
import h.f.b.l;
import l.b.f;

public interface RelationCheckApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f115989a = a.f115990a;

    static {
        Covode.recordClassIndex(74805);
    }

    @f(a = "/aweme/v1/im/spotlight/multi_relation/")
    t<j> checkRelation(@l.b.t(a = "sec_to_user_id") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f115990a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(74806);
        }

        public static RelationCheckApi a() {
            Object a2 = RetrofitFactory.a().b(b.f59141e).d().a(RelationCheckApi.class);
            l.b(a2, "");
            return (RelationCheckApi) a2;
        }
    }
}
