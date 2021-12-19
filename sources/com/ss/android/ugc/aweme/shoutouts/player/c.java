package com.ss.android.ugc.aweme.shoutouts.player;

import com.bytedance.covode.number.Covode;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class c extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f133280a = new c();

    static {
        Covode.recordClassIndex(87171);
    }

    c() {
        super(ShoutoutsPlayState.class, "status", "getStatus()Lcom/ss/android/ugc/aweme/shoutouts/player/DownloadStatus;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((ShoutoutsPlayState) obj).getStatus();
    }
}
