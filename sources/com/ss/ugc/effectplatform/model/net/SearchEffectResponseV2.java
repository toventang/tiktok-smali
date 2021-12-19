package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.h;
import h.f.b.g;

public class SearchEffectResponseV2 extends h<SearchEffectResponseV2> {
    private SearchEffectModel data;
    private String message;
    private SearchNilInfo search_nil_info;
    private int status_code;

    static {
        Covode.recordClassIndex(102521);
    }

    public SearchEffectResponseV2() {
        this(null, null, 0, null, 15, null);
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public SearchEffectResponseV2 getResponseData() {
        return this;
    }

    public final SearchEffectModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public String getResponseMessage() {
        return this.message;
    }

    public final SearchNilInfo getSearch_nil_info() {
        return this.search_nil_info;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }

    public final void setData(SearchEffectModel searchEffectModel) {
        this.data = searchEffectModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setSearch_nil_info(SearchNilInfo searchNilInfo) {
        this.search_nil_info = searchNilInfo;
    }

    public final void setStatus_code(int i2) {
        this.status_code = i2;
    }

    public SearchEffectResponseV2(SearchEffectModel searchEffectModel, SearchNilInfo searchNilInfo, int i2, String str) {
        this.data = searchEffectModel;
        this.search_nil_info = searchNilInfo;
        this.status_code = i2;
        this.message = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchEffectResponseV2(SearchEffectModel searchEffectModel, SearchNilInfo searchNilInfo, int i2, String str, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : searchEffectModel, (i3 & 2) != 0 ? null : searchNilInfo, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : str);
    }
}
