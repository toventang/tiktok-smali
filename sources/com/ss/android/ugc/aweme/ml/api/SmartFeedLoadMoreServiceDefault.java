package com.ss.android.ugc.aweme.ml.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService;
import h.f.b.l;
import org.json.JSONObject;

public final class SmartFeedLoadMoreServiceDefault extends SmartFeedLoadMoreService {
    static {
        Covode.recordClassIndex(70881);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public final void addVideoPlayEndReportData(JSONObject jSONObject, Aweme aweme, Integer num) {
        l.d(jSONObject, "");
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public final void checkAndInit() {
    }

    public final boolean enable() {
        return false;
    }

    public final void ensureEvaluatorAvailable() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public final boolean isSmartFeedLoadMoreScene(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public final boolean needCheckLoadMore(int i2, int i3, Aweme aweme) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public final void startSmartFeedLoadMoreJudge(Aweme aweme, ISmartFeedLoadMoreService.a aVar) {
        l.d(aVar, "");
    }
}
