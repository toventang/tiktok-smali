package com.bytedance.android.livesdk.chatroom.widget;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseBooleanArray;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.g.e;
import com.bytedance.android.livesdk.event.g;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import java.util.HashMap;
import java.util.Map;

final /* synthetic */ class m implements f {

    /* renamed from: a  reason: collision with root package name */
    private final LockScreenWidget f16663a;

    static {
        Covode.recordClassIndex(9241);
    }

    m(LockScreenWidget lockScreenWidget) {
        this.f16663a = lockScreenWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        boolean z;
        Drawable drawable;
        LockScreenWidget lockScreenWidget = this.f16663a;
        g gVar = (g) obj;
        SparseBooleanArray sparseBooleanArray = gVar.f17192a;
        boolean z2 = gVar.f17194c;
        boolean z3 = sparseBooleanArray.get(0);
        boolean z4 = sparseBooleanArray.get(2);
        e.a(lockScreenWidget.context, lockScreenWidget.getView(), !z3, z2);
        if (lockScreenWidget.getContext() != null) {
            if (z4) {
                if (Build.VERSION.SDK_INT >= 21) {
                    drawable = lockScreenWidget.getContext().getDrawable(2131234678);
                }
            } else if (Build.VERSION.SDK_INT >= 21) {
                drawable = lockScreenWidget.getContext().getDrawable(R.drawable.c76);
            }
            if (!(drawable == null || lockScreenWidget.f16585a == null)) {
                lockScreenWidget.f16585a.setImageDrawable(drawable);
            }
        }
        if (gVar.f17193b == 2 && (z = sparseBooleanArray.get(2)) != lockScreenWidget.f16586b) {
            lockScreenWidget.f16586b = z;
            boolean z5 = lockScreenWidget.f16586b;
            HashMap hashMap = new HashMap();
            if (z5) {
                hashMap.put("lock_type", "lock");
            } else {
                hashMap.put("lock_type", "unlock");
            }
            hashMap.put("room_orientation", "landscape");
            b.a.a("livesdk_landscape_screen_lock_click").a((Map<String, String>) hashMap).a(lockScreenWidget.dataChannel).b("live").c("click").d("live_landscape").b();
        }
    }
}
