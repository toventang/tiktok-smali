package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.LinkedHashSet;

public final class DuetStickerSearchViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public final t<LinkedHashSet<User>> f127263a = new t<>();

    static {
        Covode.recordClassIndex(83473);
    }

    public final void a(LinkedHashSet<User> linkedHashSet) {
        l.d(linkedHashSet, "");
        this.f127263a.setValue(linkedHashSet);
    }
}
