package com.ss.android.ugc.aweme.story.record.toolbar;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.story.record.StoryRecordBaseState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class e extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f138452a = new e();

    static {
        Covode.recordClassIndex(90562);
    }

    e() {
        super(StoryRecordBaseState.class, "showOrHideCommonButtons", "getShowOrHideCommonButtons()Lcom/bytedance/jedi/arch/JediBooleanEvent;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((StoryRecordBaseState) obj).getShowOrHideCommonButtons();
    }
}
