package com.bytedance.android.livesdk.ah;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.c.h;
import com.bytedance.android.livesdk.ah.b.c;
import com.bytedance.android.livesdk.ah.b.d;
import com.bytedance.android.livesdk.ah.c.e;
import com.bytedance.android.livesdk.ah.e;
import com.bytedance.covode.number.Covode;

public final class b extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    h<a> f13707a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    h<a> f13708b = new h<>();

    static {
        Covode.recordClassIndex(7615);
    }

    private static Intent a() {
        return new Intent("android.settings.APPLICATION_SETTINGS");
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String[] f13713a;

        /* renamed from: b  reason: collision with root package name */
        public String[] f13714b = new String[0];

        /* renamed from: c  reason: collision with root package name */
        com.bytedance.android.livesdk.ah.b.b f13715c;

        /* renamed from: d  reason: collision with root package name */
        Runnable f13716d;

        /* renamed from: e  reason: collision with root package name */
        Runnable f13717e;

        /* renamed from: f  reason: collision with root package name */
        private d f13718f;

        /* renamed from: g  reason: collision with root package name */
        private com.bytedance.android.livesdk.ah.b.b f13719g;

        static {
            Covode.recordClassIndex(7618);
        }

        public final void a() {
            this.f13718f.b(this.f13713a);
            e.a.f13726a.b(this.f13714b);
        }

        public final void a(boolean z) {
            this.f13718f.a(this.f13713a);
            e.a.f13726a.a(this.f13713a);
            if (z) {
                this.f13717e.run();
                e.a.f13726a.c(this.f13714b);
            }
        }

        public final void a(Activity activity, c cVar) {
            this.f13719g.a(activity, cVar, this.f13713a);
        }

        a(String[] strArr, Runnable runnable, d dVar, com.bytedance.android.livesdk.ah.b.b bVar, Runnable runnable2, com.bytedance.android.livesdk.ah.b.b bVar2) {
            this.f13713a = strArr;
            this.f13716d = runnable;
            this.f13717e = runnable2;
            this.f13718f = dVar;
            this.f13715c = bVar;
            this.f13719g = bVar2;
        }
    }

    static Intent a(Context context) {
        return e.a.f13723a.a(context);
    }

    private static Intent b(Context context) {
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + context.getPackageName()));
    }

    /* access modifiers changed from: package-private */
    public final void a(final a aVar) {
        aVar.a(getActivity(), new c() {
            /* class com.bytedance.android.livesdk.ah.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(7617);
            }

            @Override // com.bytedance.android.livesdk.ah.b.c
            public final void b() {
                aVar.a();
            }

            @Override // com.bytedance.android.livesdk.ah.b.c
            public final void a() {
                b bVar = b.this;
                a aVar = aVar;
                int a2 = (a.a(aVar.f13713a) & -65536) >>> 16;
                try {
                    if (b.a(bVar.getActivity(), b.a(bVar.getActivity()))) {
                        bVar.startActivityForResult(b.a(bVar.getActivity()), a2);
                        bVar.f13708b.b(a2, aVar);
                        return;
                    }
                    bVar.a(aVar, a2);
                } catch (Exception unused) {
                    bVar.a(aVar, a2);
                    com.bytedance.android.live.core.c.a.a(6, "PermissionFragment", "go to origin setting error");
                }
            }
        });
    }

    static boolean a(Context context, Intent intent) {
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo == null || resolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
            return false;
        }
        String str = resolveActivity.activityInfo.permission;
        if (TextUtils.isEmpty(str) || context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    private void b(a aVar, int i2) {
        try {
            getActivity();
            startActivityForResult(a(), i2);
            this.f13708b.b(i2, aVar);
        } catch (Exception unused) {
            com.bytedance.android.live.core.c.a.a(6, "PermissionFragment", "go to origin setting error");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar, int i2) {
        try {
            if (a(getActivity(), b(getActivity()))) {
                startActivityForResult(b(getActivity()), i2);
                this.f13708b.b(i2, aVar);
                return;
            }
            b(aVar, i2);
        } catch (Exception unused) {
            b(aVar, i2);
            com.bytedance.android.live.core.c.a.a(6, "PermissionFragment", "go to app info error");
        }
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        a a2 = this.f13708b.a(i2, null);
        this.f13708b.b(i2);
        if (a2 != null && d.a((Context) getActivity(), a2.f13713a)) {
            a2.a(true);
        }
    }

    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        com.bytedance.android.live.core.c.a.a(3, "PermissionFragment", "onRequestPermissionsResult: requestCode = ".concat(String.valueOf(i2)));
        super.onRequestPermissionsResult(i2, strArr, iArr);
        a a2 = this.f13707a.a(i2, null);
        this.f13707a.b(i2);
        if (a2 != null) {
            Activity activity = getActivity();
            if (iArr.length != 0) {
                int length = iArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        if (iArr[i3] != 0) {
                            break;
                        }
                        i3++;
                    } else if (!e.a.f13723a.a() || d.a((Context) activity, strArr)) {
                        a2.a(true);
                        return;
                    }
                }
            }
            Activity activity2 = getActivity();
            if (strArr != null) {
                for (String str : strArr) {
                    if (androidx.core.app.a.a(activity2, str)) {
                        a2.a();
                        return;
                    }
                }
            }
            if (!a(getActivity(), a(getActivity())) && !a(getActivity(), b(getActivity()))) {
                Activity activity3 = getActivity();
                getActivity();
                if (!a(activity3, a())) {
                    com.bytedance.android.live.core.c.a.a(3, "PermissionFragment", "afterPermissionRequest: AppSettingIntent is not avaliable.");
                    a2.a();
                    return;
                }
            }
            a2.f13714b = d.a(getActivity(), a2.f13713a);
            a(a2);
        }
    }
}
