package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.h;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class EffectListResponse extends h<List<? extends Effect>> {
    private List<? extends Effect> bind_effects;
    private List<? extends Effect> collection;
    private List<? extends Effect> data;
    private String message;
    private int status_code;
    private List<String> url_prefix;

    static {
        Covode.recordClassIndex(102494);
    }

    public EffectListResponse() {
        this(null, null, null, 0, null, null, 63, null);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public List<Effect> getBind_effects() {
        return this.bind_effects;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getCollection_list() {
        return this.collection;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getEffect_list() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public String getResponseMessage() {
        return getMessage();
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public int getStatusCode() {
        return getStatus_code();
    }

    /* Return type fixed from 'java.util.List<com.ss.ugc.effectplatform.model.Effect>' to match base method */
    @Override // com.ss.ugc.effectplatform.model.h
    public List<? extends Effect> getResponseData() {
        return getEffect_list();
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus_code(int i2) {
        this.status_code = i2;
    }

    public void setBind_effects(List<? extends Effect> list) {
        l.c(list, "");
        this.bind_effects = list;
    }

    public final void setCollection_list(List<? extends Effect> list) {
        l.c(list, "");
        this.collection = list;
    }

    public final void setEffect_list(List<? extends Effect> list) {
        l.c(list, "");
        this.data = list;
    }

    public void setUrl_prefix(List<String> list) {
        l.c(list, "");
        this.url_prefix = list;
    }

    public EffectListResponse(List<String> list, List<? extends Effect> list2, List<? extends Effect> list3, int i2, String str, List<? extends Effect> list4) {
        l.c(list, "");
        l.c(list2, "");
        l.c(list3, "");
        l.c(list4, "");
        this.url_prefix = list;
        this.bind_effects = list2;
        this.collection = list3;
        this.status_code = i2;
        this.message = str;
        this.data = list4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectListResponse(List list, List list2, List list3, int i2, String str, List list4, int i3, g gVar) {
        this((i3 & 1) != 0 ? new ArrayList() : list, (i3 & 2) != 0 ? new ArrayList() : list2, (i3 & 4) != 0 ? new ArrayList() : list3, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? null : str, (i3 & 32) != 0 ? new ArrayList() : list4);
    }
}
