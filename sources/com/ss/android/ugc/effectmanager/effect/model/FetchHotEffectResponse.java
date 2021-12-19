package com.ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class FetchHotEffectResponse extends FetchHotEffectResponseTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel;

    static {
        Covode.recordClassIndex(95410);
    }

    public FetchHotEffectResponse() {
        this(null, 1, null);
    }

    public static final class Data extends FetchHotEffectResponseTemplate.DataTemplate implements Serializable {
        private final transient FetchHotEffectResponse.Data kData;

        static {
            Covode.recordClassIndex(95411);
        }

        public Data() {
            this(null, 1, null);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate.DataTemplate
        public final FetchHotEffectResponse.Data getKData() {
            return this.kData;
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public final List<Effect> getCollection() {
            List<Effect> collection;
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 == null || (collection = kData2.getCollection()) == null) {
                return super.getCollection();
            }
            return collection;
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public final List<Effect> getEffects() {
            List<Effect> effects;
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 == null || (effects = kData2.getEffects()) == null) {
                return super.getEffects();
            }
            return effects;
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public final String getRecId() {
            String recId;
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 == null || (recId = kData2.getRecId()) == null) {
                return super.getRecId();
            }
            return recId;
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public final List<String> getUrl_prefix() {
            List<String> url_prefix;
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 == null || (url_prefix = kData2.getUrl_prefix()) == null) {
                return super.getUrl_prefix();
            }
            return url_prefix;
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public final void setRecId(String str) {
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 != null) {
                kData2.setRecId(str);
            }
            super.setRecId(str);
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public final void setCollection(List<? extends Effect> list) {
            l.c(list, "");
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 != null) {
                kData2.setCollection(list);
            }
            super.setCollection(list);
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public final void setEffects(List<? extends Effect> list) {
            l.c(list, "");
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 != null) {
                kData2.setEffects(list);
            }
            super.setEffects(list);
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public final void setUrl_prefix(List<String> list) {
            l.c(list, "");
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 != null) {
                kData2.setUrl_prefix(list);
            }
            super.setUrl_prefix(list);
        }

        public Data(FetchHotEffectResponse.Data data) {
            super(data);
            this.kData = data;
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 != null) {
                List<Effect> collection = kData2.getCollection();
                if (collection != null) {
                    super.setCollection(collection);
                }
                List<Effect> effects = kData2.getEffects();
                if (effects != null) {
                    super.setEffects(effects);
                }
                String recId = kData2.getRecId();
                if (recId != null) {
                    super.setRecId(recId);
                }
                List<String> url_prefix = kData2.getUrl_prefix();
                if (url_prefix != null) {
                    super.setUrl_prefix(url_prefix);
                }
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Data(FetchHotEffectResponse.Data data, int i2, g gVar) {
            this((i2 & 1) != 0 ? null : data);
        }
    }

    public static final class Extra extends FetchHotEffectResponseTemplate.ExtraTemplate implements Serializable {
        private final transient FetchHotEffectResponse.Extra kData;

        static {
            Covode.recordClassIndex(95412);
        }

        public Extra() {
            this(null, 1, null);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate.ExtraTemplate
        public final FetchHotEffectResponse.Extra getKData() {
            return this.kData;
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Extra
        public final String getRec_id() {
            String rec_id;
            FetchHotEffectResponse.Extra kData2 = getKData();
            if (kData2 == null || (rec_id = kData2.getRec_id()) == null) {
                return super.getRec_id();
            }
            return rec_id;
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Extra
        public final void setRec_id(String str) {
            FetchHotEffectResponse.Extra kData2 = getKData();
            if (kData2 != null) {
                kData2.setRec_id(str);
            }
            super.setRec_id(str);
        }

        public Extra(FetchHotEffectResponse.Extra extra) {
            super(extra);
            String rec_id;
            this.kData = extra;
            FetchHotEffectResponse.Extra kData2 = getKData();
            if (kData2 != null && (rec_id = kData2.getRec_id()) != null) {
                super.setRec_id(rec_id);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Extra(FetchHotEffectResponse.Extra extra, int i2, g gVar) {
            this((i2 & 1) != 0 ? null : extra);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate
    public final com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse getKFetchHotModel() {
        return this.kFetchHotModel;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate
    public final List<Effect> getCollection() {
        return super.getCollection();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate
    public final List<Effect> getEffects() {
        return super.getEffects();
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public final int getStatus_code() {
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 != null) {
            return kFetchHotModel2.getStatus_code();
        }
        return super.getStatus_code();
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public final FetchHotEffectResponse.Data getData() {
        FetchHotEffectResponse.Data data;
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 == null || (data = kFetchHotModel2.getData()) == null) {
            return super.getData();
        }
        return data;
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public final String getMessage() {
        String message;
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 == null || (message = kFetchHotModel2.getMessage()) == null) {
            return super.getMessage();
        }
        return message;
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public final String getRecId() {
        String recId;
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 == null || (recId = kFetchHotModel2.getRecId()) == null) {
            return super.getRecId();
        }
        return recId;
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public final List<String> getUrlPrefix() {
        List<String> urlPrefix;
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 == null || (urlPrefix = kFetchHotModel2.getUrlPrefix()) == null) {
            return super.getUrlPrefix();
        }
        return urlPrefix;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate
    public final void setEffects(List<? extends Effect> list) {
        l.c(list, "");
        super.setEffects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public final void setMessage(String str) {
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 != null) {
            kFetchHotModel2.setMessage(str);
        }
        super.setMessage(str);
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public final void setRecId(String str) {
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 != null) {
            kFetchHotModel2.setRecId(str);
        }
        super.setRecId(str);
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public final void setStatus_code(int i2) {
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 != null) {
            kFetchHotModel2.setStatus_code(i2);
        }
        super.setStatus_code(i2);
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public final void setData(FetchHotEffectResponse.Data data) {
        l.c(data, "");
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 != null) {
            kFetchHotModel2.setData(data);
        }
        super.setData(data);
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public final void setUrlPrefix(List<String> list) {
        l.c(list, "");
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 != null) {
            kFetchHotModel2.setUrlPrefix(list);
        }
        super.setUrlPrefix(list);
    }

    public FetchHotEffectResponse(com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse fetchHotEffectResponse) {
        super(fetchHotEffectResponse);
        this.kFetchHotModel = fetchHotEffectResponse;
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 != null) {
            List<Effect> collection_list = kFetchHotModel2.getCollection_list();
            if (collection_list != null) {
                super.setCollection_list(collection_list);
            }
            FetchHotEffectResponse.Data data = kFetchHotModel2.getData();
            if (data != null) {
                super.setData(data);
            }
            List<Effect> effect_list = kFetchHotModel2.getEffect_list();
            if (effect_list != null) {
                super.setEffect_list(effect_list);
            }
            super.setFromCache(kFetchHotModel2.isFromCache());
            String message = kFetchHotModel2.getMessage();
            if (message != null) {
                super.setMessage(message);
            }
            String recId = kFetchHotModel2.getRecId();
            if (recId != null) {
                super.setRecId(recId);
            }
            super.setStatus_code(kFetchHotModel2.getStatus_code());
            List<String> urlPrefix = kFetchHotModel2.getUrlPrefix();
            if (urlPrefix != null) {
                super.setUrlPrefix(urlPrefix);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FetchHotEffectResponse(com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse fetchHotEffectResponse, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : fetchHotEffectResponse);
    }
}
