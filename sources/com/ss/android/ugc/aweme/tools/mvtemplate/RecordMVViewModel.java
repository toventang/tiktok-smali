package com.ss.android.ugc.aweme.tools.mvtemplate;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class RecordMVViewModel extends BaseJediViewModel<RecordMVState> {

    /* renamed from: a  reason: collision with root package name */
    public Effect f140632a;

    /* renamed from: b  reason: collision with root package name */
    public ShortVideoContext f140633b;

    static {
        Covode.recordClassIndex(91842);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new RecordMVState(null, null, 3, null);
    }

    public final ShortVideoContext a() {
        ShortVideoContext shortVideoContext = this.f140633b;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        return shortVideoContext;
    }
}
