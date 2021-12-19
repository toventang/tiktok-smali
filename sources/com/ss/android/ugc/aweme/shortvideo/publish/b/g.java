package com.ss.android.ugc.aweme.shortvideo.publish.b;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.e;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.LinkedHashMap;
import java.util.Objects;

final /* synthetic */ class g implements e {

    /* renamed from: a  reason: collision with root package name */
    private final a f129776a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoPublishEditModel f129777b;

    static {
        Covode.recordClassIndex(85187);
    }

    g(a aVar, VideoPublishEditModel videoPublishEditModel) {
        this.f129776a = aVar;
        this.f129777b = videoPublishEditModel;
    }

    @Override // com.google.c.h.a.e
    public final q a(Object obj) {
        return this.f129776a.a(this.f129777b, (LinkedHashMap) Objects.requireNonNull(obj));
    }
}
