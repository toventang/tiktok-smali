package com.bytedance.android.live.publicscreen.impl.model;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.live.publicscreen.a.e;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.livesetting.message.LiveAnchorMessageFoldTypeSetting;
import com.bytedance.android.livesdk.model.message.ce;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class q extends k<ce> {

    /* renamed from: e  reason: collision with root package name */
    private static final int f12490e = LiveAnchorMessageFoldTypeSetting.INSTANCE.getValue();

    @Override // com.bytedance.android.live.publicscreen.a.d.i, com.bytedance.android.livesdk.chatroom.f.b
    public final User b() {
        return ((ce) this.f12190d).f19471f;
    }

    static {
        Covode.recordClassIndex(6865);
    }

    private boolean u() {
        if (((ce) this.f12190d).f19470a == 2) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if (((ce) this.f12190d).f19470a == 3) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        if (((ce) this.f12190d).f19470a == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final int h_() {
        if (((ce) this.f12190d).f19470a == 1) {
            return 2131234663;
        }
        if (((ce) this.f12190d).f19470a == 3) {
            return 2131234707;
        }
        return super.h_();
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final CharSequence a() {
        ((e) a.a(e.class)).getTextMessageConfig();
        ((e) a.a(e.class)).getTextMessageConfig();
        User user = ((ce) this.f12190d).f19471f;
        ce ceVar = (ce) this.f12190d;
        String str = "";
        if (ceVar != null) {
            Context e2 = y.e();
            int i2 = (int) ceVar.f19470a;
            if (i2 == 1) {
                str = Build.VERSION.SDK_INT >= 24 ? y.a((int) R.string.e35) : e2.getResources().getString(R.string.e35);
            } else if (i2 == 3) {
                str = Build.VERSION.SDK_INT >= 24 ? y.a((int) R.string.gvn) : e2.getResources().getString(R.string.gvn);
            }
        }
        return k.a(user, " ", str, R.color.a1t, R.color.a0e);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k, com.bytedance.android.live.publicscreen.a.d.f
    public final boolean k() {
        if (C()) {
            int i2 = f12490e;
            if ((i2 == 1 || (i2 == 2 && this.f12189c.n.c())) && (s() || t() || u())) {
                return true;
            }
            return false;
        } else if (s() || t() || u()) {
            return true;
        } else {
            return false;
        }
    }

    public q(ce ceVar) {
        super(ceVar);
    }
}
