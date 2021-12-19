package com.bytedance.ies.xbridge.base.runtime.depend;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface IHostUserDepend {

    public interface a {
        static {
            Covode.recordClassIndex(21432);
        }

        void a();

        void b();
    }

    public interface b {
        static {
            Covode.recordClassIndex(21433);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(21431);
    }

    String getAvatarURL();

    String getBoundPhone();

    String getNickname();

    String getSecUid();

    String getUniqueID();

    String getUserId();

    boolean hasLogin();

    void login(Activity activity, a aVar, Map<String, String> map);

    void logout(Activity activity, b bVar, Map<String, String> map);
}
