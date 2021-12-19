package com.ss.android.ugc.aweme.detail.operators;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.ae;
import h.f.b.l;
import java.util.HashMap;

public final class DetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    static {
        Covode.recordClassIndex(49598);
    }

    public static final class a implements ab {
        static {
            Covode.recordClassIndex(49599);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ab
        public final aa a(com.ss.android.ugc.aweme.feed.param.b bVar, com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            l.d(bVar, "");
            return new x(aVar);
        }
    }

    public static final class b implements ab {
        static {
            Covode.recordClassIndex(49600);
        }

        b() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ab
        public final aa a(com.ss.android.ugc.aweme.feed.param.b bVar, com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            l.d(bVar, "");
            return new q(bVar.getIds());
        }
    }

    public static final class c implements ab {
        static {
            Covode.recordClassIndex(49601);
        }

        c() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ab
        public final aa a(com.ss.android.ugc.aweme.feed.param.b bVar, com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            l.d(bVar, "");
            return new f(bVar.getIds());
        }
    }

    public static final class d implements ab {
        static {
            Covode.recordClassIndex(49602);
        }

        d() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ab
        public final aa a(com.ss.android.ugc.aweme.feed.param.b bVar, com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            l.d(bVar, "");
            return new y(aVar);
        }
    }

    public static final class e implements ab {
        static {
            Covode.recordClassIndex(49603);
        }

        e() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ab
        public final aa a(com.ss.android.ugc.aweme.feed.param.b bVar, com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            l.d(bVar, "");
            com.ss.android.ugc.aweme.im.service.b bVar2 = ae.f95299d;
            Aweme aweme = null;
            if (ae.f95299d == bVar2) {
                ae.f95299d = null;
            }
            if (bVar2 == null) {
                return new i();
            }
            if (!TextUtils.isEmpty(bVar.getChatRoomPlayingRealAid())) {
                aweme = AwemeService.b().b(bVar.getChatRoomPlayingRealAid());
            }
            return new z(bVar2, aweme, bVar.isFromChatRoomPlaying());
        }
    }

    public static final class f implements ab {
        static {
            Covode.recordClassIndex(49604);
        }

        f() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ab
        public final aa a(com.ss.android.ugc.aweme.feed.param.b bVar, com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            l.d(bVar, "");
            return new af(aVar);
        }
    }

    public static final class g implements ab {
        static {
            Covode.recordClassIndex(49605);
        }

        g() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ab
        public final aa a(com.ss.android.ugc.aweme.feed.param.b bVar, com.ss.android.ugc.aweme.common.e.a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            l.d(bVar, "");
            return new k();
        }
    }

    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, ab> a() {
        HashMap<String, ab> hashMap = new HashMap<>();
        hashMap.put("from_time_line", new a());
        hashMap.put("from_music_children_mode", new b());
        hashMap.put("from_challenge_children_mode", new c());
        hashMap.put("from_window_following", new d());
        hashMap.put("from_chat", new e());
        hashMap.put("from_no_request", new f());
        hashMap.put("from_commerce_banner", new g());
        return hashMap;
    }
}
