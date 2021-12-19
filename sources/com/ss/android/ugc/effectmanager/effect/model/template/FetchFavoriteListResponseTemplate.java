package com.ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public class FetchFavoriteListResponseTemplate extends FetchFavoriteListResponse {
    private final transient FetchFavoriteListResponse kFavoriteModel;

    static {
        Covode.recordClassIndex(95451);
    }

    public FetchFavoriteListResponseTemplate() {
        this(null, 1, null);
    }

    public static class DataTemplate extends FetchFavoriteListResponse.Data {
        private final transient FetchFavoriteListResponse.Data kData;

        static {
            Covode.recordClassIndex(95452);
        }

        public DataTemplate() {
            this(null, 1, null);
        }

        public FetchFavoriteListResponse.Data getKData() {
            return this.kData;
        }

        public DataTemplate(FetchFavoriteListResponse.Data data) {
            super(null, null, null, null, null, 31, null);
            this.kData = data;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DataTemplate(FetchFavoriteListResponse.Data data, int i2, g gVar) {
            this((i2 & 1) != 0 ? null : data);
        }
    }

    public FetchFavoriteListResponse getKFavoriteModel() {
        return this.kFavoriteModel;
    }

    public String getType() {
        List<FetchFavoriteListResponse.Data> data;
        FetchFavoriteListResponse.Data data2;
        String type;
        FetchFavoriteListResponse kFavoriteModel2 = getKFavoriteModel();
        if (kFavoriteModel2 == null || (data = kFavoriteModel2.getData()) == null || (data2 = data.get(0)) == null || (type = data2.getType()) == null) {
            return super.getData().get(0).getType();
        }
        return type;
    }

    public List<String> getUrlPrefix() {
        List<FetchFavoriteListResponse.Data> data;
        FetchFavoriteListResponse.Data data2;
        List<String> url_prefix;
        FetchFavoriteListResponse kFavoriteModel2 = getKFavoriteModel();
        if (kFavoriteModel2 == null || (data = kFavoriteModel2.getData()) == null || (data2 = data.get(0)) == null || (url_prefix = data2.getUrl_prefix()) == null) {
            return super.getData().get(0).getUrl_prefix();
        }
        return url_prefix;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r1 == null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getBindEffects() {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate.getBindEffects():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r1 == null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCollectEffects() {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate.getCollectEffects():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r1 == null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getEffects() {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate.getEffects():java.util.List");
    }

    public FetchFavoriteListResponseTemplate(FetchFavoriteListResponse fetchFavoriteListResponse) {
        super(null, null, 0, 7, null);
        this.kFavoriteModel = fetchFavoriteListResponse;
    }

    public void setEffects(List<? extends Effect> list) {
        List<FetchFavoriteListResponse.Data> data;
        FetchFavoriteListResponse.Data data2;
        l.c(list, "");
        FetchFavoriteListResponse kFavoriteModel2 = getKFavoriteModel();
        if (!(kFavoriteModel2 == null || (data = kFavoriteModel2.getData()) == null || (data2 = data.get(0)) == null)) {
            data2.setEffects(list);
        }
        if (!super.getData().isEmpty()) {
            super.getData().get(0).setEffects(list);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FetchFavoriteListResponseTemplate(FetchFavoriteListResponse fetchFavoriteListResponse, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : fetchFavoriteListResponse);
    }
}
