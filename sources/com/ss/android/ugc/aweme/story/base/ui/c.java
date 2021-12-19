package com.ss.android.ugc.aweme.story.base.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.story.record.StoryRecordBaseState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class c extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f136934a = new c();

    static {
        Covode.recordClassIndex(89497);
    }

    c() {
        super(StoryRecordBaseState.class, "forbidDrawerScrollEvent", "getForbidDrawerScrollEvent()Ljava/lang/Boolean;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((StoryRecordBaseState) obj).getForbidDrawerScrollEvent();
    }
}
