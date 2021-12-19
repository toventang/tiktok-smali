package com.ss.android.ugc.aweme.feed.ui.masklayer2.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.api.DislikeReasonApi;
import h.f.b.l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class h extends b<String> {
    static {
        Covode.recordClassIndex(60184);
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object[] f94894a;

        static {
            Covode.recordClassIndex(60185);
        }

        a(Object[] objArr) {
            this.f94894a = objArr;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.HashMap */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public final Object call() {
            Object[] objArr = this.f94894a;
            Object obj = objArr[0];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            Aweme aweme = (Aweme) obj;
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = "";
            if (aweme == null) {
                return str;
            }
            Map<String, String> hashMap = new HashMap<>();
            hashMap.put("dislike_reason_id", obj2);
            if (aweme.getMusic() != null) {
                str = aweme.getMusic().getMid();
            }
            hashMap.put("music_id", str);
            hashMap.put("author_id", aweme.getAuthorUid());
            DislikeReasonApi.f94922a.disLikeReason(hashMap).execute();
            return obj2;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        l.d(objArr, "");
        if (objArr.length == 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean sendRequest(Object... objArr) {
        l.d(objArr, "");
        if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
            return false;
        }
        n.a().a(this.mHandler, new a(objArr), 0);
        return true;
    }
}
