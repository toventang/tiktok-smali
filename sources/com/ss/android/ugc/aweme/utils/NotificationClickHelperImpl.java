package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper;
import com.ss.android.ugc.b;
import com.zhiliaoapp.musically.R;

public final class NotificationClickHelperImpl implements NotificationClickHelper {
    static {
        Covode.recordClassIndex(93253);
    }

    public static NotificationClickHelper a() {
        MethodCollector.i(3439);
        Object a2 = b.a(NotificationClickHelper.class, false);
        if (a2 != null) {
            NotificationClickHelper notificationClickHelper = (NotificationClickHelper) a2;
            MethodCollector.o(3439);
            return notificationClickHelper;
        }
        if (b.eA == null) {
            synchronized (NotificationClickHelper.class) {
                try {
                    if (b.eA == null) {
                        b.eA = new NotificationClickHelperImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3439);
                    throw th;
                }
            }
        }
        NotificationClickHelperImpl notificationClickHelperImpl = (NotificationClickHelperImpl) b.eA;
        MethodCollector.o(3439);
        return notificationClickHelperImpl;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper
    public final boolean a(Activity activity, boolean z, boolean z2, boolean z3, String str) {
        if (activity == null) {
            return false;
        }
        if (!z) {
            return ff.a(activity, z2, z3, str);
        }
        new a.C0731a(activity).a(R.string.dmh).b(R.string.dmf).b(R.string.c5x, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.ss.android.ugc.aweme.utils.ff.AnonymousClass2 */

            static {
                Covode.recordClassIndex(93516);
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
            }
        }, false).a(R.string.ss, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(activity, z2, z3, str) {
            /* class com.ss.android.ugc.aweme.utils.ff.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Activity f142906a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f142907b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f142908c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f142909d;

            static {
                Covode.recordClassIndex(93515);
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                ff.a(this.f142906a, this.f142907b, this.f142908c, this.f142909d);
                dialogInterface.dismiss();
            }

            {
                this.f142906a = r1;
                this.f142907b = r2;
                this.f142908c = r3;
                this.f142909d = r4;
            }
        }, false).a().b();
        return true;
    }
}
