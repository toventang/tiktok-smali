package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class SdkExtraInfo implements Serializable {
    private String mvAlgorithmHint = "";
    private PlDataBean pl;

    static {
        Covode.recordClassIndex(84579);
    }

    public final String getMvAlgorithmHint() {
        return this.mvAlgorithmHint;
    }

    public final PlDataBean getPl() {
        return this.pl;
    }

    public final boolean isLegal() {
        PlDataBean plDataBean;
        List<String> alg;
        if (this.mvAlgorithmHint.length() <= 0 || (plDataBean = this.pl) == null || (alg = plDataBean.getAlg()) == null || !(!alg.isEmpty())) {
            return false;
        }
        return true;
    }

    public final void setPl(PlDataBean plDataBean) {
        this.pl = plDataBean;
    }

    public final void setMvAlgorithmHint(String str) {
        l.d(str, "");
        this.mvAlgorithmHint = str;
    }
}
