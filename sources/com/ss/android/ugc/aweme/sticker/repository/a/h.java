package com.ss.android.ugc.aweme.sticker.repository.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import f.a.ab;
import java.util.List;

public interface h {

    public static final class a {
        static {
            Covode.recordClassIndex(88519);
        }
    }

    static {
        Covode.recordClassIndex(88518);
    }

    i a();

    ab<List<String>> a(Effect effect, boolean z, c cVar);

    ab<FetchFavoriteListResponse> a(boolean z);

    boolean a(String str);

    void b(boolean z);
}
