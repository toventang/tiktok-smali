package com.ss.android.ugc.aweme.profile.survey;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.cu.a;
import com.ss.android.ugc.aweme.services.RetrofitService;
import l.b.f;
import l.b.t;

public final class SurveyApi {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f116635a = false;

    /* renamed from: b  reason: collision with root package name */
    private static final SurveyRetrofit f116636b = ((SurveyRetrofit) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(SurveyRetrofit.class));

    interface SurveyRetrofit {
        static {
            Covode.recordClassIndex(75358);
        }

        @f(a = "/aweme/v1/survey/get/")
        i<a> getSurveyData();

        @f(a = "/aweme/v1/survey/record/")
        i<Object> recordAnswer(@t(a = "action_type") int i2, @t(a = "dialog_id") int i3, @t(a = "original_id") int i4);
    }

    public static i<a> a() {
        try {
            return f116636b.getSurveyData();
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(75357);
    }

    static i<Object> a(b bVar) {
        try {
            return f116636b.recordAnswer(bVar.f116637a, bVar.f116638b, bVar.f116639c);
        } catch (Throwable unused) {
            return null;
        }
    }
}
