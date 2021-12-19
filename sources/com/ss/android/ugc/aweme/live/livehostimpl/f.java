package com.ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.ttlive.a;

final /* synthetic */ class f implements f.a.d.f {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f108467a;

    /* renamed from: b  reason: collision with root package name */
    private final IHostAction.a f108468b;

    /* renamed from: c  reason: collision with root package name */
    private final String f108469c;

    static {
        Covode.recordClassIndex(69509);
    }

    f(Activity activity, IHostAction.a aVar, String str) {
        this.f108467a = activity;
        this.f108468b = aVar;
        this.f108469c = str;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        Activity activity = this.f108467a;
        IHostAction.a aVar = this.f108468b;
        String str = this.f108469c;
        a aVar2 = (a) obj;
        if (aVar2.f141455a.intValue() == 1) {
            b.d().a(activity, new h(aVar, aVar2), aVar2.f141456b, str, aVar2.f141455a.intValue(), aVar2.f141459e, aVar2.f141460f.intValue());
        } else {
            aVar.a(aVar2.f141457c);
        }
    }
}
