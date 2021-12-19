package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.model.h;
import h.f.b.g;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class DownloadableModelResponse extends h<Data> {
    private Data data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102490);
    }

    public DownloadableModelResponse() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ DownloadableModelResponse copy$default(DownloadableModelResponse downloadableModelResponse, Data data2, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            data2 = downloadableModelResponse.data;
        }
        if ((i3 & 2) != 0) {
            str = downloadableModelResponse.message;
        }
        if ((i3 & 4) != 0) {
            i2 = downloadableModelResponse.status_code;
        }
        return downloadableModelResponse.copy(data2, str, i2);
    }

    public final Data component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final DownloadableModelResponse copy(Data data2, String str, int i2) {
        return new DownloadableModelResponse(data2, str, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadableModelResponse)) {
            return false;
        }
        DownloadableModelResponse downloadableModelResponse = (DownloadableModelResponse) obj;
        return l.a(this.data, downloadableModelResponse.data) && l.a(this.message, downloadableModelResponse.message) && this.status_code == downloadableModelResponse.status_code;
    }

    public final int hashCode() {
        Data data2 = this.data;
        int i2 = 0;
        int hashCode = (data2 != null ? data2.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((hashCode + i2) * 31) + this.status_code;
    }

    public final String toString() {
        return "DownloadableModelResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    public static final class Data {
        private Map<String, ? extends List<? extends ModelInfo>> arithmetics;

        static {
            Covode.recordClassIndex(102491);
        }

        public Data() {
            this(null, 1, null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.ugc.effectplatform.model.net.DownloadableModelResponse$Data */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Data copy$default(Data data, Map map, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                map = data.arithmetics;
            }
            return data.copy(map);
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.List<? extends com.ss.ugc.effectplatform.model.algorithm.ModelInfo>>, java.util.Map<java.lang.String, java.util.List<com.ss.ugc.effectplatform.model.algorithm.ModelInfo>> */
        public final Map<String, List<ModelInfo>> component1() {
            return this.arithmetics;
        }

        public final Data copy(Map<String, ? extends List<? extends ModelInfo>> map) {
            return new Data(map);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Data) && l.a(this.arithmetics, ((Data) obj).arithmetics);
            }
            return true;
        }

        public final int hashCode() {
            Map<String, ? extends List<? extends ModelInfo>> map = this.arithmetics;
            if (map != null) {
                return map.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Data(arithmetics=" + this.arithmetics + ")";
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.List<? extends com.ss.ugc.effectplatform.model.algorithm.ModelInfo>>, java.util.Map<java.lang.String, java.util.List<com.ss.ugc.effectplatform.model.algorithm.ModelInfo>> */
        public final Map<String, List<ModelInfo>> getArithmetics() {
            return this.arithmetics;
        }

        public final void setArithmetics(Map<String, ? extends List<? extends ModelInfo>> map) {
            this.arithmetics = map;
        }

        public Data(Map<String, ? extends List<? extends ModelInfo>> map) {
            this.arithmetics = map;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Data(Map map, int i2, g gVar) {
            this((i2 & 1) != 0 ? null : map);
        }
    }

    public final Data getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final Data getResponseData() {
        return this.data;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final String getResponseMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final void setData(Data data2) {
        this.data = data2;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i2) {
        this.status_code = i2;
    }

    public DownloadableModelResponse(Data data2, String str, int i2) {
        this.data = data2;
        this.message = str;
        this.status_code = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DownloadableModelResponse(Data data2, String str, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : data2, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? 0 : i2);
    }
}
