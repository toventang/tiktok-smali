package com.ss.android.ugc.aweme.qna.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.c.b;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.i;
import l.b.c;
import l.b.e;
import l.b.o;

public interface QnaApiV2 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f119217a = a.f119218a;

    static {
        Covode.recordClassIndex(77451);
    }

    @o(a = "/tiktok/v1/forum/question/create/")
    @e
    t<com.ss.android.ugc.aweme.question.model.a> createQuestion(@c(a = "user_id") Long l2, @c(a = "question_content") String str, @c(a = "invited_users") String str2);

    @o(a = "/tiktok/v1/forum/question/invite/delete/")
    @e
    t<Object> deleteInviteQuestion(@c(a = "question_id") long j2);

    @o(a = "/tiktok/v1/forum/question/delete/")
    @e
    t<j> deleteQuestion(@c(a = "question_id") long j2);

    @h(a = "/tiktok/v1/forum/profile/answers/")
    t<g> getAnswersTabData(@z(a = "user_id") Long l2, @z(a = "count") int i2, @z(a = "cursor") int i3, @z(a = "sec_user_id") String str);

    @h(a = "/tiktok/v1/forum/profile/banner/")
    t<h> getBannerData(@z(a = "user_id") Long l2, @z(a = "sec_user_id") String str);

    @h(a = "/tiktok/v1/forum/profile/questions/")
    t<i> getQuestionsTabData(@z(a = "user_id") Long l2, @z(a = "count") int i2, @z(a = "cursor") int i3, @z(a = "sec_user_id") String str);

    @h(a = "/tiktok/v1/forum/question/suggest/")
    t<k> getSuggestedTabData(@z(a = "user_id") Long l2, @z(a = "requests") String str);

    @o(a = "/tiktok/v1/forum/question/collect/")
    t<Object> sflQuestion(@z(a = "question_id") long j2, @z(a = "action") int i2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f119218a;

        /* renamed from: b  reason: collision with root package name */
        private static final h.h f119219b;

        public static QnaApiV2 a() {
            return (QnaApiV2) f119219b.getValue();
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.qna.api.QnaApiV2$a$a  reason: collision with other inner class name */
        static final class C3078a extends m implements h.f.a.a<QnaApiV2> {
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(77453);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3078a(a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ QnaApiV2 invoke() {
                return a.b();
            }
        }

        static {
            Covode.recordClassIndex(77452);
            a aVar = new a();
            f119218a = aVar;
            f119219b = i.a((h.f.a.a) new C3078a(aVar));
        }

        public static QnaApiV2 b() {
            Object a2 = RetrofitFactory.a().b(b.f59141e).d().a(QnaApiV2.class);
            l.b(a2, "");
            return (QnaApiV2) a2;
        }
    }
}
