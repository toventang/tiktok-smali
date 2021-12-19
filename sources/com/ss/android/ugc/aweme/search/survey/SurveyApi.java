package com.ss.android.ugc.aweme.search.survey;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.m;
import h.h;
import h.i;
import l.b.c;
import l.b.e;
import l.b.f;
import l.b.o;
import l.b.t;

public final class SurveyApi {

    /* renamed from: a  reason: collision with root package name */
    public static final SurveyApi f121607a = new SurveyApi();

    /* renamed from: b  reason: collision with root package name */
    private static final h f121608b = i.a((h.f.a.a) a.f121611a);

    public interface Api {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f121609a = a.f121610a;

        static {
            Covode.recordClassIndex(79211);
        }

        @f(a = "/aweme/v1/search/survey/detail/")
        b.i<d> fetch(@t(a = "survey_id") String str);

        @o(a = "/aweme/v1/search/survey/submit/")
        @e
        b.i<BaseResponse> submit(@c(a = "survey_id") String str, @c(a = "search_id") String str2, @c(a = "survey_answer_rating") int i2, @c(a = "keyword") String str3);

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ a f121610a = new a();

            private a() {
            }

            static {
                Covode.recordClassIndex(79212);
            }
        }
    }

    static Api a() {
        return (Api) f121608b.getValue();
    }

    private SurveyApi() {
    }

    static final class a extends m implements h.f.a.a<Api> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f121611a = new a();

        static {
            Covode.recordClassIndex(79213);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Api invoke() {
            return RetrofitFactory.a().b(b.f59138b).d().a(Api.class);
        }
    }

    static {
        Covode.recordClassIndex(79210);
    }
}
