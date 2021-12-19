package com.ss.android.ugc.aweme.video.preload.enginepreloader.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.g;
import com.ss.mediakit.net.AVMDLNetClient;
import com.ss.mediakit.net.AVMDLNetClientMaker;

public final class a implements AVMDLNetClientMaker {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC3827a f143689a;

    /* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.a.a$a  reason: collision with other inner class name */
    public interface AbstractC3827a {
        static {
            Covode.recordClassIndex(94011);
        }

        g a();
    }

    static {
        Covode.recordClassIndex(94010);
    }

    @Override // com.ss.mediakit.net.AVMDLNetClientMaker
    public final AVMDLNetClient getNetClient() {
        return new b(this.f143689a.a());
    }

    public a(AbstractC3827a aVar) {
        this.f143689a = aVar;
    }
}
