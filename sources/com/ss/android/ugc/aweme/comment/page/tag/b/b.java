package com.ss.android.ugc.aweme.comment.page.tag.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.page.tag.api.VideoTagApi;
import dagger.a.c;
import dagger.a.f;

public final class b implements c<VideoTagApi> {
    static {
        Covode.recordClassIndex(44527);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        return a();
    }

    public static VideoTagApi a() {
        return (VideoTagApi) f.a(VideoTagApi.a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
