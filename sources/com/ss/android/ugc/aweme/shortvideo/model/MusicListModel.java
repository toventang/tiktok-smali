package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.shortvideo.api.MusicChoicesApi;
import java.util.concurrent.Callable;

public class MusicListModel extends b<MusicList> {
    static {
        Covode.recordClassIndex(84460);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public boolean sendRequest(Object... objArr) {
        n.a().a(this.mHandler, new Callable() {
            /* class com.ss.android.ugc.aweme.shortvideo.model.MusicListModel.AnonymousClass1 */

            static {
                Covode.recordClassIndex(84461);
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                return MusicChoicesApi.a();
            }
        }, 0);
        return true;
    }
}
