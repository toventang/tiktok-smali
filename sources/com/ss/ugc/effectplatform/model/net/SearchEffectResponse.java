package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.h;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class SearchEffectResponse extends h<SearchEffectResponse> {
    private List<? extends Effect> bind_effects;
    private List<? extends Effect> collection;
    private int cursor;
    private List<? extends Effect> effects;
    private boolean has_more;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102520);
    }

    public SearchEffectResponse() {
        this(false, 0, null, null, null, 0, null, 127, null);
    }

    @Override // com.ss.ugc.effectplatform.model.h
    public SearchEffectResponse getResponseData() {
        return this;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public List<Effect> getBind_effects() {
        return this.bind_effects;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getCollection_list() {
        return this.collection;
    }

    public int getCursor() {
        return this.cursor;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getEffect_list() {
        return this.effects;
    }

    public boolean getHas_more() {
        return this.has_more;
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
        if (!getEffect_list().isEmpty()) {
            return true;
        }
        return false;
    }

    public void setCursor(int i2) {
        this.cursor = i2;
    }

    public void setHas_more(boolean z) {
        this.has_more = z;
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
        this.effects = list;
    }

    public SearchEffectResponse(boolean z, int i2, List<? extends Effect> list, List<? extends Effect> list2, List<? extends Effect> list3, int i3, String str) {
        l.c(list, "");
        l.c(list2, "");
        l.c(list3, "");
        this.has_more = z;
        this.cursor = i2;
        this.effects = list;
        this.collection = list2;
        this.bind_effects = list3;
        this.status_code = i3;
        this.message = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchEffectResponse(boolean z, int i2, List list, List list2, List list3, int i3, String str, int i4, g gVar) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? new ArrayList() : list, (i4 & 8) != 0 ? new ArrayList() : list2, (i4 & 16) != 0 ? new ArrayList() : list3, (i4 & 32) == 0 ? i3 : 0, (i4 & 64) != 0 ? null : str);
    }
}
