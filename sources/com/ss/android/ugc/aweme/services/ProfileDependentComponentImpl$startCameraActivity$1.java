package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Intent;
import android.os.Environment;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.ss.android.newmedia.d;
import com.ss.android.ugc.aweme.im.INotificationManagerService;
import com.ss.android.ugc.aweme.im.sdk.notification.NotificationManagerServiceImpl;
import com.ss.android.ugc.aweme.utils.ar;
import com.zhiliaoapp.musically.R;
import h.f.a.s;
import h.f.b.j;
import h.f.b.l;
import h.z;
import java.io.File;

final /* synthetic */ class ProfileDependentComponentImpl$startCameraActivity$1 extends j implements s<Activity, Fragment, Integer, String, String, z> {
    public static final ProfileDependentComponentImpl$startCameraActivity$1 INSTANCE = new ProfileDependentComponentImpl$startCameraActivity$1();

    static {
        Covode.recordClassIndex(79556);
    }

    ProfileDependentComponentImpl$startCameraActivity$1() {
        super(5, ar.class, "startCameraActivity", "startCameraActivity(Landroid/app/Activity;Landroidx/fragment/app/Fragment;ILjava/lang/String;Ljava/lang/String;)V", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // h.f.a.s
    public final /* synthetic */ z invoke(Activity activity, Fragment fragment, Integer num, String str, String str2) {
        invoke(activity, fragment, num.intValue(), str, str2);
        return z.f158842a;
    }

    public final void invoke(Activity activity, Fragment fragment, int i2, String str, String str2) {
        l.d(activity, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(activity, "");
        l.d(str, "");
        l.d(str2, "");
        if (!l.a((Object) "mounted", (Object) Environment.getExternalStorageState())) {
            new b(activity).b(2131231585).e(R.string.dq3).b();
            return;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str2);
        intent.addFlags(1);
        intent.putExtra("output", d.a(activity, file2));
        if (fragment != null) {
            try {
                fragment.startActivityForResult(intent, i2);
            } catch (Exception unused) {
                new b(activity).b(2131231585).e(R.string.dq0).b();
                return;
            }
        } else {
            activity.startActivityForResult(intent, i2);
        }
        INotificationManagerService d2 = NotificationManagerServiceImpl.d();
        if (d2 != null) {
            d2.a(true);
        }
    }
}
