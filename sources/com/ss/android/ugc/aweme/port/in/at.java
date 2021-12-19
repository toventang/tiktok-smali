package com.ss.android.ugc.aweme.port.in;

import android.content.Intent;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.CutSameEditData;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

public interface at {

    public interface a {
        static {
            Covode.recordClassIndex(74540);
        }

        Intent a(CutSameEditData cutSameEditData);

        String a();

        void a(e eVar);

        void a(e eVar, MusicModel musicModel, IServiceMusicResDownListener iServiceMusicResDownListener, String str);

        void a(e eVar, String str, String str2);

        void a(c cVar);

        String b();

        void b(e eVar);

        void b(c cVar);

        String c();

        void c(e eVar);

        void d();
    }

    static {
        Covode.recordClassIndex(74539);
    }

    a a();
}
