package com.ss.android.ugc.aweme.ce;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.powerpermissions.l;
import java.util.Arrays;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final c f69812a;

    /* renamed from: com.ss.android.ugc.aweme.ce.b$b  reason: collision with other inner class name */
    public interface AbstractC1579b {
        static {
            Covode.recordClassIndex(43045);
        }

        void a(String[] strArr, int[] iArr);
    }

    /* access modifiers changed from: package-private */
    public interface c {
        static {
            Covode.recordClassIndex(43046);
        }

        void a(Activity activity, String[] strArr, AbstractC1579b bVar);
    }

    static class d implements c {
        static {
            Covode.recordClassIndex(43047);
        }

        d() {
        }

        @Override // com.ss.android.ugc.aweme.ce.b.c
        public final void a(Activity activity, String[] strArr, AbstractC1579b bVar) {
            if (activity.getFragmentManager().findFragmentByTag("permissions") == null) {
                a aVar = new a();
                Bundle bundle = new Bundle();
                bundle.putStringArray("permissions", strArr);
                aVar.setArguments(bundle);
                aVar.f69811a = bVar;
                activity.getFragmentManager().beginTransaction().add(aVar, "permissions").commitAllowingStateLoss();
            }
        }
    }

    static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final Handler f69813a = new Handler(Looper.getMainLooper());

        static {
            Covode.recordClassIndex(43043);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.ce.b.c
        public final void a(Activity activity, final String[] strArr, final AbstractC1579b bVar) {
            this.f69813a.post(new Runnable() {
                /* class com.ss.android.ugc.aweme.ce.b.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(43044);
                }

                public final void run() {
                    if (bVar != null) {
                        int[] iArr = new int[strArr.length];
                        Arrays.fill(iArr, 0);
                        bVar.a(strArr, iArr);
                    }
                }
            });
        }
    }

    static {
        Covode.recordClassIndex(43042);
        if (Build.VERSION.SDK_INT >= 23) {
            f69812a = new d();
        } else {
            f69812a = new a();
        }
    }

    public static void a(Activity activity, String[] strArr, AbstractC1579b bVar) {
        boolean z = activity instanceof e;
        boolean a2 = SettingsManager.a().a("enable_power_permissions", false);
        if (!z || !a2) {
            f69812a.a(activity, strArr, bVar);
        } else {
            l.a((e) activity).a(strArr).a(new c(bVar));
        }
    }
}
