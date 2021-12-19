package com.ss.android.ugc.aweme.main.page;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;

/* access modifiers changed from: package-private */
public final /* synthetic */ class a implements u {

    /* renamed from: a  reason: collision with root package name */
    private final AwemeChangeCallBack.a f109278a;

    static {
        Covode.recordClassIndex(69992);
    }

    a(AwemeChangeCallBack.a aVar) {
        this.f109278a = aVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        AwemeChangeCallBack.a aVar = this.f109278a;
        Aweme aweme = (Aweme) obj;
        if (aVar != null) {
            aVar.a(aweme);
        }
    }
}
