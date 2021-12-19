package com.ss.android.ugc.aweme.favorites.service;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.u;
import java.util.List;

public interface IFavoriteService {
    static {
        Covode.recordClassIndex(56983);
    }

    u<List<Aweme>, Boolean, Long> a(String str, long j2);

    void a(e eVar, String str, String str2);

    void a(String str);
}
