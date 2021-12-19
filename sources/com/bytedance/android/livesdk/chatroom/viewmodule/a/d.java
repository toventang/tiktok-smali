package com.bytedance.android.livesdk.chatroom.viewmodule.a;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements u {

    /* renamed from: a  reason: collision with root package name */
    private final b f16383a;

    static {
        Covode.recordClassIndex(9059);
    }

    d(b bVar) {
        this.f16383a = bVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        b bVar = this.f16383a;
        String str = (String) obj;
        if (bVar.f16360m != null) {
            bVar.f16360m.setText(str);
        }
    }
}
