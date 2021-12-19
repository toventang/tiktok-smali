package com.ss.android.ugc.aweme.sticker.repository.a;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bw.b.a;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;

public interface i {
    static {
        Covode.recordClassIndex(88520);
    }

    LiveData<a<FetchFavoriteListResponse>> b();

    LiveData<Boolean> c();
}
