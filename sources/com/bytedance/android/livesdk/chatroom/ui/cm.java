package com.bytedance.android.livesdk.chatroom.ui;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import h.f.a.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cm implements a {

    /* renamed from: a  reason: collision with root package name */
    private final br f16071a;

    static {
        Covode.recordClassIndex(8892);
    }

    cm(br brVar) {
        this.f16071a = brVar;
    }

    @Override // h.f.a.a
    public final Object invoke() {
        br brVar = this.f16071a;
        if (brVar.getActivity() == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        brVar.getActivity().finishAndRemoveTask();
        return null;
    }
}
