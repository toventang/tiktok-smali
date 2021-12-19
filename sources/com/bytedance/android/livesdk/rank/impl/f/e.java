package com.bytedance.android.livesdk.rank.impl.f;

import com.bytedance.android.live.a.a.b.a;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements f {

    /* renamed from: a  reason: collision with root package name */
    static final f f20713a = new e();

    static {
        Covode.recordClassIndex(12247);
    }

    private e() {
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
