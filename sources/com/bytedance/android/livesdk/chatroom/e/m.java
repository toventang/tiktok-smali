package com.bytedance.android.livesdk.chatroom.e;

import android.text.TextUtils;
import com.bytedance.android.live.a.a.b.a;
import com.bytedance.android.livesdk.chatroom.e.l;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.d.f;

final /* synthetic */ class m implements f {

    /* renamed from: a  reason: collision with root package name */
    private final l f15377a;

    static {
        Covode.recordClassIndex(8494);
    }

    m(l lVar) {
        this.f15377a = lVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        l lVar = this.f15377a;
        Throwable th = (Throwable) obj;
        if (th instanceof Exception) {
            String str = null;
            if (th instanceof a) {
                str = ((a) th).getPrompt();
            }
            if (TextUtils.isEmpty(str)) {
                str = l.a((int) R.string.gmw);
            }
            if (lVar.y != null) {
                ((l.a) lVar.y).a(str);
            }
        }
    }
}
