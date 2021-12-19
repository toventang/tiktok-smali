package com.ss.android.ugc.aweme.services;

import android.view.TextureView;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.live.e.b;
import h.f.b.l;

public final class ProfileDependentComponentImpl$newLivePlayHelper$1$livePlayHelper$1 implements b {
    final /* synthetic */ ProfileDependentComponentImpl$newLivePlayHelper$1 this$0;

    static {
        Covode.recordClassIndex(79553);
    }

    @Override // com.ss.android.ugc.aweme.live.e.b
    public final void firstFrame() {
        this.this$0.$callback.firstFrame();
    }

    @Override // com.ss.android.ugc.aweme.live.e.b
    public final void playing() {
        this.this$0.$callback.playing();
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    ProfileDependentComponentImpl$newLivePlayHelper$1$livePlayHelper$1(ProfileDependentComponentImpl$newLivePlayHelper$1 profileDependentComponentImpl$newLivePlayHelper$1) {
        this.this$0 = profileDependentComponentImpl$newLivePlayHelper$1;
    }

    @Override // com.ss.android.ugc.aweme.live.e.b
    public final void playComplete(String str) {
        l.d(str, "");
        this.this$0.$callback.playComplete(str);
    }

    @Override // com.ss.android.ugc.aweme.live.e.b
    public final void playPrepared(String str) {
        l.d(str, "");
        this.this$0.$callback.playPrepared(str);
    }

    @Override // com.ss.android.ugc.aweme.live.e.b
    public final void playerMediaError(String str) {
        l.d(str, "");
        this.this$0.$callback.playerMediaError(str);
    }

    @Override // com.ss.android.ugc.aweme.live.e.b
    public final void seiUpdate(String str) {
        l.d(str, "");
        this.this$0.$callback.seiUpdate(str);
    }

    @Override // com.ss.android.ugc.aweme.live.e.b
    public final void onPlayerMessage(g.b bVar, Object obj) {
        l.d(bVar, "");
        this.this$0.$callback.onPlayerMessage(bVar, obj);
    }

    @Override // com.ss.android.ugc.aweme.live.e.b
    public final void onVideoSizeChange(TextureView textureView, int i2, int i3) {
        this.this$0.$callback.onVideoSizeChange(textureView, i2, i3);
    }
}
