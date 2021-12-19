package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Activity;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.model.f;
import com.bytedance.covode.number.Covode;
import java.util.List;

public interface ar {

    public interface a {
        static {
            Covode.recordClassIndex(8795);
        }

        boolean a();

        void b();
    }

    public interface b {
        static {
            Covode.recordClassIndex(8796);
        }

        void a();

        void a(f fVar);

        void a(String str, boolean z, int i2);

        void a(List<? extends EmoteModel> list);

        void b();
    }

    static {
        Covode.recordClassIndex(8794);
    }

    void a();

    void a(Activity activity, String str);

    void a(b bVar);

    void a(com.bytedance.android.livesdk.event.b bVar);

    void a(String str);

    void a(boolean z);

    void b();

    void dismissAllowingStateLoss();
}
