package com.ss.android.ugc.aweme.ml.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.a.b;
import h.f.b.l;

public final class MLCommonServiceDefault extends MLCommonService {
    static {
        Covode.recordClassIndex(70864);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void addCommonEventListener(String str, b bVar) {
        l.d(str, "");
    }

    public final void checkAndInit() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final b getAwemeAdapter() {
        return null;
    }

    public final void onAppLaunch() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayFinishFirst(Aweme aweme, String str) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayFirstFrame(Aweme aweme, String str) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayPause(Aweme aweme, String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayPrepare(Aweme aweme, String str, b bVar) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayResume(Aweme aweme, String str) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayStop(String str, Aweme aweme, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void onPlayStopCallPlayTime(Aweme aweme, long j2, String str) {
    }

    public final void removeCommonEventListener(String str, b bVar) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void runInMainActivityOnCreate() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public final void runInMainActivityOnDestroy() {
    }
}
