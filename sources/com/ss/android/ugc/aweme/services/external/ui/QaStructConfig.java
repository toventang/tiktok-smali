package com.ss.android.ugc.aweme.services.external.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import java.io.Serializable;

public final class QaStructConfig implements Serializable {
    private QaStruct qaStruct;

    static {
        Covode.recordClassIndex(79711);
    }

    public final QaStruct getQaStruct() {
        return this.qaStruct;
    }

    public final void setQaStruct(QaStruct qaStruct2) {
        this.qaStruct = qaStruct2;
    }
}
