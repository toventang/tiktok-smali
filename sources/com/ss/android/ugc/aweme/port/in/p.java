package com.ss.android.ugc.aweme.port.in;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

public interface p {

    public interface a {
        static {
            Covode.recordClassIndex(74603);
        }

        void a();

        void a(int i2);

        void a(Integer num, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(74602);
    }

    MusicModel a(c cVar);

    String a(MusicModel musicModel);

    String a(String str);

    void a();

    void a(Context context, c cVar, int i2, a aVar);

    void a(Context context, String str, UrlModel urlModel, a aVar);

    void a(String str, aq aqVar);

    boolean a(c cVar, Context context, boolean z);

    String b(c cVar);

    boolean b();

    String c();

    String c(c cVar);

    String d();
}
