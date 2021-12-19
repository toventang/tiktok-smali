package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.h;
import h.a.n;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class FetchFavoriteListResponse extends h<FetchFavoriteListResponse> {
    private List<? extends Data> data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102497);
    }

    public FetchFavoriteListResponse() {
        this(null, null, 0, 7, null);
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public FetchFavoriteListResponse getResponseData() {
        return this;
    }

    public static class Data {
        private List<? extends Effect> bind_effects;
        private List<? extends Effect> collection;
        private List<? extends Effect> effects;
        private String type;
        private List<String> url_prefix;

        static {
            Covode.recordClassIndex(102498);
        }

        public Data() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
        public List<Effect> getBind_effects() {
            return this.bind_effects;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
        public List<Effect> getCollection() {
            return this.collection;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
        public List<Effect> getEffects() {
            return this.effects;
        }

        public String getType() {
            return this.type;
        }

        public List<String> getUrl_prefix() {
            return this.url_prefix;
        }

        public void setBind_effects(List<? extends Effect> list) {
            l.c(list, "");
            this.bind_effects = list;
        }

        public void setCollection(List<? extends Effect> list) {
            l.c(list, "");
            this.collection = list;
        }

        public void setEffects(List<? extends Effect> list) {
            l.c(list, "");
            this.effects = list;
        }

        public void setType(String str) {
            l.c(str, "");
            this.type = str;
        }

        public void setUrl_prefix(List<String> list) {
            l.c(list, "");
            this.url_prefix = list;
        }

        public Data(String str, List<? extends Effect> list, List<? extends Effect> list2, List<? extends Effect> list3, List<String> list4) {
            l.c(str, "");
            l.c(list, "");
            l.c(list2, "");
            l.c(list3, "");
            l.c(list4, "");
            this.type = str;
            this.effects = list;
            this.collection = list2;
            this.bind_effects = list3;
            this.url_prefix = list4;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Data(String str, List list, List list2, List list3, List list4, int i2, g gVar) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? new ArrayList() : list, (i2 & 4) != 0 ? new ArrayList() : list2, (i2 & 8) != 0 ? new ArrayList() : list3, (i2 & 16) != 0 ? new ArrayList() : list4);
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse$Data>, java.util.List<com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse$Data> */
    public List<Data> getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public String getResponseMessage() {
        return getMessage();
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public int getStatusCode() {
        return getStatus_code();
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public boolean checkValue() {
        List<Data> data2 = getData();
        if (data2 != null && !data2.isEmpty()) {
            return true;
        }
        return false;
    }

    public final List<Effect> getCollection_effects() {
        List<Data> data2 = getData();
        if (data2 == null) {
            return new ArrayList();
        }
        return data2.get(0).getCollection();
    }

    public final List<Effect> getEffect_list() {
        List<Data> data2 = getData();
        if (data2 == null) {
            return new ArrayList();
        }
        return data2.get(0).getEffects();
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus_code(int i2) {
        this.status_code = i2;
    }

    public void setData(List<? extends Data> list) {
        l.c(list, "");
        this.data = list;
    }

    public final void setCollection_effects(List<? extends Effect> list) {
        l.c(list, "");
        List<Data> data2 = getData();
        if (data2 == null || data2.isEmpty()) {
            setData(n.d(new Data(null, null, null, null, null, 31, null)));
        }
        getData().get(0).setCollection(list);
    }

    public final void setEffect_list(List<? extends Effect> list) {
        l.c(list, "");
        List<Data> data2 = getData();
        if (data2 == null || data2.isEmpty()) {
            setData(n.d(new Data(null, null, null, null, null, 31, null)));
        }
        getData().get(0).setEffects(list);
    }

    public FetchFavoriteListResponse(List<? extends Data> list, String str, int i2) {
        l.c(list, "");
        this.data = list;
        this.message = str;
        this.status_code = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FetchFavoriteListResponse(List list, String str, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? new ArrayList() : list, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? 0 : i2);
    }
}
