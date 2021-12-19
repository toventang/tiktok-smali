package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.controller;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.detail.operators.ab;
import com.ss.android.ugc.aweme.feed.param.b;
import h.f.b.l;
import java.util.HashMap;

public final class FavoriteVideoChatDetailPageOperatorService implements IDetailPageOperatorService {
    static {
        Covode.recordClassIndex(64484);
    }

    public static final class a implements ab {
        static {
            Covode.recordClassIndex(64485);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ab
        public final aa a(b bVar, com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            l.d(bVar, "");
            return new a(aVar, bVar.getUid());
        }
    }

    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, ab> a() {
        HashMap<String, ab> hashMap = new HashMap<>();
        hashMap.put("from_chat_favorite_video_panel", new a());
        return hashMap;
    }
}
