package com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public class FamiliarsRelationFetchResponse extends BaseResponse {
    @c(a = "results")
    List<FamiliarRelation> relations;

    static {
        Covode.recordClassIndex(66130);
    }

    public List<FamiliarRelation> getRelations() {
        return this.relations;
    }

    public void setRelations(List<FamiliarRelation> list) {
        this.relations = list;
    }
}
