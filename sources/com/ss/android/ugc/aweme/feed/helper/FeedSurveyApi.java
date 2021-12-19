package com.ss.android.ugc.aweme.feed.helper;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.ab;
import l.b.c;
import l.b.e;
import l.b.o;

public interface FeedSurveyApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f93311a = a.f93312a;

    static {
        Covode.recordClassIndex(59154);
    }

    @o(a = "/aweme/v1/survey/set/")
    @e
    ab<BaseResponse> submitFeedSurvey(@c(a = "item_id") String str, @c(a = "source") int i2, @c(a = "operation") int i3, @c(a = "feed_survey") String str2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f93312a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(59155);
        }
    }
}
