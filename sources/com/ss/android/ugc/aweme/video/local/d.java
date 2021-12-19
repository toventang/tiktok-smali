package com.ss.android.ugc.aweme.video.local;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    private final LocalVideoPlayerManager.a f143473a;

    /* renamed from: b  reason: collision with root package name */
    private final String f143474b;

    static {
        Covode.recordClassIndex(93882);
    }

    d(LocalVideoPlayerManager.a aVar, String str) {
        this.f143473a = aVar;
        this.f143474b = str;
    }

    @Override // b.g
    public final Object then(i iVar) {
        LocalVideoPlayerManager.a aVar = this.f143473a;
        String str = this.f143474b;
        if (iVar.c()) {
            aVar.a();
            return null;
        }
        aVar.a(str);
        return null;
    }
}
