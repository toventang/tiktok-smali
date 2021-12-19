package com.ss.android.ugc.aweme.ml.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;

public interface ISmartFeedLoadMoreService {

    public interface a {
        static {
            Covode.recordClassIndex(70856);
        }

        void a(boolean z, int i2);
    }

    static {
        Covode.recordClassIndex(70855);
    }

    void addVideoPlayEndReportData(JSONObject jSONObject, Aweme aweme, Integer num);

    void checkAndInit();

    boolean isSmartFeedLoadMoreScene(String str);

    boolean needCheckLoadMore(int i2, int i3, Aweme aweme);

    void startSmartFeedLoadMoreJudge(Aweme aweme, a aVar);

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public float f110374a = -1.0f;

        /* renamed from: b  reason: collision with root package name */
        public String f110375b;

        /* renamed from: c  reason: collision with root package name */
        public int f110376c = -1;

        static {
            Covode.recordClassIndex(70857);
        }

        public final String toString() {
            return "QualityData(lpPredict=" + this.f110374a + ", lpPredictL=" + this.f110375b + ", leftVideosCnt=" + this.f110376c + ')';
        }
    }
}
