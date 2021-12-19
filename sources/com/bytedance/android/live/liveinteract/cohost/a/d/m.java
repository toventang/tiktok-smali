package com.bytedance.android.live.liveinteract.cohost.a.d;

import com.bytedance.android.live.a.a.b.a;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.d.f;

public final /* synthetic */ class m implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f10142a = new m();

    static {
        Covode.recordClassIndex(5323);
    }

    private m() {
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof a) {
            ao.a(y.e(), ((a) th).getPrompt(), 0);
            return;
        }
        ao.a(y.e(), (int) R.string.gss);
    }
}
