package com.ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.g;
import java.io.Serializable;

public final class k extends User {
    public static final a Companion = new a(null);
    private int type;

    static {
        Covode.recordClassIndex(72821);
    }

    public static final class a implements Serializable {
        static {
            Covode.recordClassIndex(72822);
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i2) {
        this.type = i2;
    }

    public k(int i2) {
        this.type = i2;
    }
}
