package com.bytedance.android.livesdk.chatroom.viewmodule.a;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements u {

    /* renamed from: a  reason: collision with root package name */
    private final f f16419a;

    static {
        Covode.recordClassIndex(9074);
    }

    h(f fVar) {
        this.f16419a = fVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        f fVar = this.f16419a;
        String str = (String) obj;
        if (fVar.f16398k != null) {
            fVar.f16398k.setText(str);
        }
    }
}
