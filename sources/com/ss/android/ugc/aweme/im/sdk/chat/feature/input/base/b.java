package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base;

import androidx.lifecycle.i;
import androidx.lifecycle.l;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view.b;

public interface b extends l {

    public interface a {
        static {
            Covode.recordClassIndex(64425);
        }

        void a();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b$b  reason: collision with other inner class name */
    public interface AbstractC2490b {
        static {
            Covode.recordClassIndex(64426);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(64424);
    }

    void a(com.ss.android.ugc.aweme.emoji.b.a aVar);

    void a(a aVar);

    void a(AbstractC2490b bVar);

    void a(d dVar);

    void a(b.a aVar);

    void a(String str);

    void l();

    void m();

    void n();

    @v(a = i.a.ON_DESTROY)
    void onDestroy();

    @v(a = i.a.ON_PAUSE)
    void onPause();

    @v(a = i.a.ON_RESUME)
    void onResume();

    void q();

    boolean r();
}
