package com.bytedance.ies.uikit.a;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.d.a;
import com.bytedance.ies.uikit.d.b;
import com.bytedance.ies.uikit.d.d;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;

public final class f extends a implements com.bytedance.common.utility.f {

    /* renamed from: a  reason: collision with root package name */
    protected int f35384a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f35385b;

    static {
        Covode.recordClassIndex(21178);
    }

    public final void overridePendingTransition(int i2, int i3) {
    }

    @Override // androidx.fragment.app.e
    public final void onBackPressed() {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            finish();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.uikit.a.a
    public final void onResume() {
        super.onResume();
        b.a().a(this);
    }

    private a a() {
        a aVar = new a(this);
        aVar.f35393c = 17;
        aVar.t = false;
        aVar.f35403m = false;
        aVar.a(d.a(aVar.b()), d.b(aVar.b()));
        return aVar;
    }

    public final void finish() {
        int i2;
        int i3;
        super.finish();
        int i4 = this.f35384a;
        if (i4 == 0) {
            i2 = c.f35368a;
            i3 = c.f35369b;
        } else if (i4 == 1) {
            i2 = c.f35376i;
            i3 = c.f35377j;
        } else if (i4 == 2) {
            i2 = c.f35372e;
            i3 = c.f35373f;
        } else if (i4 != 3) {
            i2 = c.f35368a;
            i3 = c.f35369b;
        } else {
            i2 = c.f35370c;
            i3 = c.f35371d;
        }
        super.overridePendingTransition(i2, i3);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.uikit.a.a
    public final void onPause() {
        for (a aVar : b.a().f35406a) {
            if (aVar != null && aVar.f35391a == this) {
                aVar.f35399i = true;
            }
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d, com.bytedance.ies.uikit.a.a
    public final void onStop() {
        super.onStop();
        b a2 = b.a();
        a2.removeMessages(1929);
        int size = a2.f35406a.size();
        for (int i2 = 0; i2 < size; i2++) {
            a poll = a2.f35406a.poll();
            if (poll != null) {
                if (poll.f35391a == this) {
                    a2.removeMessages(1110, poll);
                    poll.d();
                    poll.f35395e.clearAnimation();
                    poll.f35391a = null;
                    b a3 = b.a();
                    a3.f35406a.remove(poll);
                    while (a3.f35406a.contains(poll)) {
                        a3.f35406a.remove(poll);
                    }
                } else {
                    a2.f35406a.add(poll);
                }
            }
        }
        if (!a2.f35406a.isEmpty()) {
            a2.sendEmptyMessage(1929);
        }
        a2.f35407b = false;
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d, com.bytedance.ies.uikit.a.a
    public final void onCreate(Bundle bundle) {
        int i2;
        int i3;
        super.onCreate(bundle);
        this.f35385b = false;
        int i4 = this.f35384a;
        if (i4 == 0) {
            i2 = c.f35370c;
            i3 = c.f35371d;
        } else if (i4 == 1) {
            i2 = c.f35378k;
            i3 = c.f35379l;
        } else if (i4 == 2) {
            i2 = c.f35374g;
            i3 = c.f35375h;
        } else if (i4 != 3) {
            i2 = c.f35370c;
            i3 = c.f35371d;
        } else {
            i2 = c.f35368a;
            i3 = c.f35369b;
        }
        super.overridePendingTransition(i2, i3);
    }

    public final void a(int i2, int i3) {
        super.overridePendingTransition(i2, i3);
    }

    @Override // com.bytedance.common.utility.f
    public final void showCustomLongToast(int i2, String str) {
        if (u()) {
            a().a(str, i2);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.uikit.a.a
    public final void onActivityResult(int i2, int i3, Intent intent) {
        b.a().a(this);
        super.onActivityResult(i2, i3, intent);
    }

    @Override // com.bytedance.common.utility.f
    public final void showCustomToast(int i2, String str, int i3, int i4) {
        if (u()) {
            a a2 = a();
            a2.f35398h = (long) i3;
            a2.f35393c = i4;
            a2.a(str, i2);
        }
    }
}
