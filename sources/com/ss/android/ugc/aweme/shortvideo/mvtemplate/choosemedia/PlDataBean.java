package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class PlDataBean implements Serializable {
    private List<String> alg = new ArrayList();
    private boolean guide;
    private boolean loading;
    private String relation;

    static {
        Covode.recordClassIndex(84576);
    }

    public final List<String> getAlg() {
        return this.alg;
    }

    public final boolean getGuide() {
        return this.guide;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final String getRelation() {
        return this.relation;
    }

    public final void setGuide(boolean z) {
        this.guide = z;
    }

    public final void setLoading(boolean z) {
        this.loading = z;
    }

    public final void setRelation(String str) {
        this.relation = str;
    }

    public final void setAlg(List<String> list) {
        l.d(list, "");
        this.alg = list;
    }
}
