package com.ss.android.ugc.aweme.story.record.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.story.record.StoryRecordBaseState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class b extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f138247a = new b();

    static {
        Covode.recordClassIndex(90455);
    }

    b() {
        super(StoryRecordBaseState.class, "openAlbum", "getOpenAlbum()Lcom/bytedance/jedi/arch/JediBooleanEvent;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((StoryRecordBaseState) obj).getOpenAlbum();
    }
}
