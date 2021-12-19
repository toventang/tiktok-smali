package com.ss.android.ugc.aweme.question.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.app.api.Api;

public final class QuestionApi {

    /* renamed from: a  reason: collision with root package name */
    private static final RealApi f119905a = ((RealApi) RetrofitFactory.a().a(Api.f66569d).a(RealApi.class));

    /* access modifiers changed from: package-private */
    public interface RealApi {
        static {
            Covode.recordClassIndex(77904);
        }

        @h(a = "/tiktok/v1/forum/question/detail/")
        i<a> queryQuestionDetail(@z(a = "question_id") long j2);

        @h(a = "/tiktok/v1/forum/question/status/")
        i<a> queryQuestionValidation(@z(a = "question_id") long j2);

        @h(a = "/tiktok/v1/forum/question/videos/")
        i<b> queryQuestionVideos(@z(a = "question_id") long j2, @z(a = "cursor") int i2, @z(a = "count") int i3);

        @h(a = "/tiktok/v1/forum/question/videos/")
        i<b> queryQuestionVideos(@z(a = "question_id") long j2, @z(a = "cursor") int i2, @z(a = "count") int i3, @z(a = "aweme_ids_str") String str);
    }

    static {
        Covode.recordClassIndex(77903);
    }

    public static a a(long j2) {
        i<a> queryQuestionDetail = f119905a.queryQuestionDetail(j2);
        try {
            queryQuestionDetail.f();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        if (queryQuestionDetail.c()) {
            try {
                throw queryQuestionDetail.e();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        return queryQuestionDetail.d();
    }

    public static a b(long j2) {
        i<a> queryQuestionValidation = f119905a.queryQuestionValidation(j2);
        try {
            queryQuestionValidation.f();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        if (queryQuestionValidation.c()) {
            try {
                throw queryQuestionValidation.e();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        return queryQuestionValidation.d();
    }

    public static b a(long j2, int i2, int i3, String str) {
        i<b> iVar;
        if (str == null || str.isEmpty()) {
            iVar = f119905a.queryQuestionVideos(j2, i2, i3);
        } else {
            iVar = f119905a.queryQuestionVideos(j2, i2, i3, str);
        }
        try {
            iVar.f();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        if (iVar.c()) {
            try {
                throw iVar.e();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        return iVar.d();
    }
}
