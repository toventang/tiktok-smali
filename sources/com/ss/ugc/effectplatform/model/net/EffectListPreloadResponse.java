package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.h;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class EffectListPreloadResponse extends h<EffectListPreloadResponse> {
    private List<? extends Effect> bind_effects;
    private List<? extends Effect> collection;
    private List<? extends Effect> data;
    private String message;
    private final List<String> preloading_effect_id_list;
    private int status_code;
    private List<String> url_prefix;

    static {
        Covode.recordClassIndex(102493);
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final EffectListPreloadResponse getResponseData() {
        return this;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getBind_effects() {
        return this.bind_effects;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getCollection() {
        return this.collection;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<String> getPreloading_effect_id_list() {
        return this.preloading_effect_id_list;
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

    public final List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public final boolean checkValue() {
        if (!this.data.isEmpty()) {
            return true;
        }
        return false;
    }

    public final List<Effect> getPreloadEffectList() {
        ArrayList arrayList = new ArrayList();
        List<? extends Effect> list = this.data;
        if (list != null) {
            arrayList.addAll(list);
        }
        List<? extends Effect> list2 = this.collection;
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        List<? extends Effect> list3 = this.bind_effects;
        if (list3 != null) {
            arrayList.addAll(list3);
        }
        return arrayList;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i2) {
        this.status_code = i2;
    }

    public final void setBind_effects(List<? extends Effect> list) {
        l.c(list, "");
        this.bind_effects = list;
    }

    public final void setCollection(List<? extends Effect> list) {
        l.c(list, "");
        this.collection = list;
    }

    public final void setData(List<? extends Effect> list) {
        l.c(list, "");
        this.data = list;
    }

    public final void setUrl_prefix(List<String> list) {
        l.c(list, "");
        this.url_prefix = list;
    }

    public EffectListPreloadResponse(List<String> list, List<? extends Effect> list2, List<? extends Effect> list3, List<? extends Effect> list4, List<String> list5, int i2, String str) {
        l.c(list, "");
        l.c(list2, "");
        l.c(list3, "");
        l.c(list4, "");
        l.c(list5, "");
        this.preloading_effect_id_list = list;
        this.data = list2;
        this.collection = list3;
        this.bind_effects = list4;
        this.url_prefix = list5;
        this.status_code = i2;
        this.message = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectListPreloadResponse(List list, List list2, List list3, List list4, List list5, int i2, String str, int i3, g gVar) {
        this(list, (i3 & 2) != 0 ? new ArrayList() : list2, (i3 & 4) != 0 ? new ArrayList() : list3, (i3 & 8) != 0 ? new ArrayList() : list4, (i3 & 16) != 0 ? new ArrayList() : list5, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? null : str);
    }
}
