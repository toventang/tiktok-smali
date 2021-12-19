package com.ss.android.ugc.aweme.services.external.ui;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import h.f.b.l;
import java.util.ArrayList;

public final class MultiVideoMedia implements MediaInfo {
    private Bundle extraBundle;
    private final ArrayList<MediaModel> videoMedias;

    static {
        Covode.recordClassIndex(79706);
    }

    public final Bundle getExtraBundle() {
        return this.extraBundle;
    }

    public final ArrayList<MediaModel> getVideoMedias() {
        return this.videoMedias;
    }

    public final void setExtraBundle(Bundle bundle) {
        this.extraBundle = bundle;
    }

    public MultiVideoMedia(ArrayList<MediaModel> arrayList) {
        l.d(arrayList, "");
        this.videoMedias = arrayList;
    }
}
