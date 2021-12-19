package com.ss.android.ugc.aweme.ug;

import android.app.Application;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.deeplink.p;

public interface e {
    static {
        Covode.recordClassIndex(92691);
    }

    void a();

    void a(Application application, String str);

    void a(Uri uri, boolean z, long j2, boolean z2);

    void a(Uri uri, boolean z, p pVar, boolean z2, long j2, boolean z3);

    void a(a aVar, String str);

    void a(boolean z);

    void b();

    public enum a {
        MAIN("enter_launch"),
        DEEP_LINK("deep_link"),
        SHORTCUT("client_shortcut"),
        WIDGET("client_widget"),
        OPEN_SHARE("open_share"),
        NONE("none");
        
        private final String value;

        public final String getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(92692);
        }

        private a(String str) {
            this.value = str;
        }
    }
}
