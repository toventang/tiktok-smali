package com.bytedance.android.live.publicscreen.impl.model;

import android.content.res.Resources;
import android.os.Build;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.livesdk.model.message.n;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class c extends k<n> {
    static {
        Covode.recordClassIndex(6820);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.i, com.bytedance.android.livesdk.chatroom.f.b
    public final User b() {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final CharSequence a() {
        n nVar = (n) this.f12190d;
        if (nVar == null) {
            return "";
        }
        Resources resources = y.e().getResources();
        int i2 = nVar.f19656a;
        if (i2 != 1) {
            if (i2 != 2) {
                return "";
            }
            if (Build.VERSION.SDK_INT >= 24) {
                return y.a((int) R.string.gub);
            }
            return resources.getString(R.string.gub);
        } else if (Build.VERSION.SDK_INT >= 24) {
            return y.a((int) R.string.gsk);
        } else {
            return resources.getString(R.string.gsk);
        }
    }

    public c(n nVar) {
        super(nVar);
    }
}
