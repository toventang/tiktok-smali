package com.bytedance.android.live.publicscreen.impl.model;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.a.d.j;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.model.message.bw;
import com.bytedance.covode.number.Covode;

public final class n extends j<bw> {

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f12487e = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    /* renamed from: f  reason: collision with root package name */
    private final boolean f12488f;

    @Override // com.bytedance.android.live.publicscreen.a.d.j, com.bytedance.android.live.publicscreen.a.d.i, com.bytedance.android.livesdk.chatroom.f.b
    public final User b() {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.j
    public final boolean v() {
        return this.f12488f;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.k
    public final CharSequence a() {
        return ((bw) this.f12190d).n;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.j
    public final ImageModel s() {
        return ((bw) this.f12190d).f19379h;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.j
    public final int t() {
        return ((bw) this.f12190d).o;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.j
    public final ImageModel u() {
        return ((bw) this.f12190d).f19383l;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.j
    public final String x() {
        return ((bw) this.f12190d).f19377f;
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.j
    public final ImageModel y() {
        return ((bw) this.f12190d).f19384m;
    }

    static {
        Covode.recordClassIndex(6862);
    }

    @Override // com.bytedance.android.live.publicscreen.a.d.j
    public final void w() {
        a.a().a(new com.bytedance.android.live.publicscreen.a.b.a((bw) this.f12190d));
    }

    public n(bw bwVar) {
        super(bwVar);
        boolean z = false;
        int i2 = 0;
        while (true) {
            String[] strArr = f12487e;
            if (i2 >= strArr.length) {
                break;
            } else if (TextUtils.equals(strArr[i2], bwVar.f19381j)) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        this.f12488f = z;
    }
}
