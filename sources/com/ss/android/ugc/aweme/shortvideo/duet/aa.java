package com.ss.android.ugc.aweme.shortvideo.duet;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.als.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import h.f.b.l;

public final class aa implements y {

    /* renamed from: a  reason: collision with root package name */
    private final e f126495a;

    /* renamed from: b  reason: collision with root package name */
    private final d f126496b;

    static {
        Covode.recordClassIndex(82982);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.duet.y
    public final h<Boolean> a() {
        return this.f126496b.j();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.duet.y
    public final ShortVideoContext b() {
        ac a2 = ae.a(this.f126495a, (ad.b) null).a(ShortVideoContextViewModel.class);
        l.b(a2, "");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a2).f124769a;
        l.b(shortVideoContext, "");
        return shortVideoContext;
    }

    public aa(e eVar, d dVar) {
        l.d(eVar, "");
        l.d(dVar, "");
        this.f126495a = eVar;
        this.f126496b = dVar;
    }
}
