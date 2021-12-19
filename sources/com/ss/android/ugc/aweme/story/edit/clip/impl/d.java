package com.ss.android.ugc.aweme.story.edit.clip.impl;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.story.edit.clip.a.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class d implements c<VEEditClip> {

    /* renamed from: a  reason: collision with root package name */
    final List<VEEditClip> f137573a;

    /* renamed from: b  reason: collision with root package name */
    private final List<VEEditClip> f137574b;

    static {
        Covode.recordClassIndex(90001);
    }

    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.c
    public final List<VEEditClip> getClips() {
        return this.f137574b;
    }

    public d() {
        ArrayList arrayList = new ArrayList();
        this.f137573a = arrayList;
        this.f137574b = arrayList;
    }

    /* renamed from: a */
    public final void add(VEEditClip vEEditClip, int i2) {
        l.d(vEEditClip, "");
        if (i2 < 0 || i2 > this.f137573a.size()) {
            this.f137573a.add(vEEditClip);
        } else {
            this.f137573a.add(i2, vEEditClip);
        }
    }
}
