package com.ss.android.ugc.aweme.services.external.ability;

import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import java.util.List;

public interface IOpenPhotoNextService {
    static {
        Covode.recordClassIndex(79667);
    }

    void gotoNextPage(e eVar, boolean z, Bundle bundle, List<String> list, IPageToFinish iPageToFinish);
}
