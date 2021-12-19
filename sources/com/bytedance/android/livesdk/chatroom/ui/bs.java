package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.lang.reflect.Method;

final /* synthetic */ class bs implements f {

    /* renamed from: a  reason: collision with root package name */
    private final br f16047a;

    static {
        Covode.recordClassIndex(8871);
    }

    bs(br brVar) {
        this.f16047a = brVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        br brVar = this.f16047a;
        if (brVar.getActivity() != null && !brVar.getActivity().isFinishing()) {
            try {
                Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(brVar.getActivity(), new Object[0]);
            } catch (Throwable unused) {
            }
        }
    }
}
