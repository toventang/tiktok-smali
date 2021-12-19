package com.ss.android.ugc.aweme.sticker.repository.d.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import java.util.List;

public final class d extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final d f135496a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(88550);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.repository.d.a.a
    public final boolean a(String str, Effect effect) {
        l.d(str, "");
        l.d(effect, "");
        if (effect.getTags() == null) {
            return false;
        }
        List<String> tags = effect.getTags();
        if (tags == null) {
            l.b();
        }
        if (tags.contains("forbid_for_all_duet")) {
            return true;
        }
        return false;
    }
}
