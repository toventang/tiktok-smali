package com.ss.android.ugc.aweme.ug.amplify;

import android.app.Activity;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.settingsrequest.PopupSettingManager;
import com.ss.android.ugc.aweme.settingsrequest.d.c;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class a implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<Activity> f141714a;

    /* renamed from: b  reason: collision with root package name */
    public static WeakHandler f141715b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f141716c;

    private a() {
    }

    static {
        Covode.recordClassIndex(92626);
        a aVar = new a();
        f141716c = aVar;
        f141715b = new WeakHandler(aVar);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        c a2;
        l.d(message, "");
        WeakReference<Activity> weakReference = f141714a;
        if (weakReference == null) {
            l.a("activityRef");
        }
        Activity activity = weakReference.get();
        if (activity != null && !activity.isFinishing() && message.what == 3 && (a2 = PopupSettingManager.a.f123158a.a("ugc_permission_v2")) != null) {
            new com.ss.android.ugc.aweme.ug.amplify.ui.a(activity, a2).show();
        }
    }
}
