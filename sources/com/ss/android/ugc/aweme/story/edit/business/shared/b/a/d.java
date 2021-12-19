package com.ss.android.ugc.aweme.story.edit.business.shared.b.a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.shortvideo.edit.i;
import com.ss.android.ugc.aweme.sticker.s;

public final class d extends s {

    /* renamed from: b  reason: collision with root package name */
    public boolean f137196b = true;

    static {
        Covode.recordClassIndex(89717);
    }

    @Override // com.ss.android.ugc.aweme.sticker.s
    public final boolean c() {
        if (!this.f137196b || !b.a().a(true, "story_editpage_enable_stickerpanel_swipup", false)) {
            return false;
        }
        return true;
    }

    public d(i iVar, View view) {
        super(iVar, view);
    }
}
