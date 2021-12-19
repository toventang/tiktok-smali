package com.ss.android.ugc.playerkit.videoview;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.i;
import com.ss.android.ugc.playerkit.videoview.d.c;
import com.ss.android.ugc.playerkit.videoview.d.e;
import com.ss.android.ugc.playerkit.videoview.d.k;

public enum d {
    INSTANCE;
    
    private c bitrateManager;
    private e httpsHelper;
    private c mCacheChecker;
    private i mPlayInfoCallback;
    private k playUrlBuilder;

    public final c cacheChecker() {
        return this.mCacheChecker;
    }

    public final c getBitrateManager() {
        return this.bitrateManager;
    }

    public final e getHttpsHelper() {
        return this.httpsHelper;
    }

    public final k getPlayUrlBuilder() {
        return this.playUrlBuilder;
    }

    public final i playInfoCallback() {
        return this.mPlayInfoCallback;
    }

    static {
        Covode.recordClassIndex(98064);
    }

    public final d setBitrateManager(c cVar) {
        this.bitrateManager = cVar;
        return this;
    }

    public final d setCacheChecker(c cVar) {
        this.mCacheChecker = cVar;
        return this;
    }

    public final d setHttpsHelper(e eVar) {
        this.httpsHelper = eVar;
        return this;
    }

    public final d setPlayInfoCallback(i iVar) {
        this.mPlayInfoCallback = iVar;
        return this;
    }

    public final d setPlayUrlBuilder(k kVar) {
        this.playUrlBuilder = kVar;
        return this;
    }
}
