package com.bytedance.tiktok.homepage;

import android.content.DialogInterface;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class a implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public MainActivity f44110a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.share.viewmodel.a f44111b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f44112c = new Handler();

    static {
        Covode.recordClassIndex(27032);
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(139, new g(a.class, "onFeedbackEvent", com.ss.android.ugc.aweme.feedback.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public a(MainActivity mainActivity) {
        this.f44110a = mainActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r5 = (com.ss.android.ugc.aweme.common.ad) r7.getSerializableExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r4 = r6.f44110a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r1 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG"
            boolean r0 = r7.hasExtra(r1)     // Catch:{ Exception -> 0x003f }
            if (r0 == 0) goto L_0x003f
            java.io.Serializable r5 = r7.getSerializableExtra(r1)     // Catch:{ Exception -> 0x003f }
            com.ss.android.ugc.aweme.common.ad r5 = (com.ss.android.ugc.aweme.common.ad) r5     // Catch:{ Exception -> 0x003f }
            if (r5 == 0) goto L_0x003f
            r0 = 1
            r5.mNeedShowDialog = r0     // Catch:{ Exception -> 0x003f }
            boolean r0 = com.ss.android.ugc.aweme.utils.ha.a(r5)     // Catch:{ Exception -> 0x003f }
            if (r0 == 0) goto L_0x003f
            com.ss.android.ugc.aweme.main.MainActivity r4 = r6.f44110a     // Catch:{ Exception -> 0x003f }
            if (r4 == 0) goto L_0x003f
            java.lang.String r0 = r5.mAppName     // Catch:{ Exception -> 0x003f }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x003f }
            if (r0 == 0) goto L_0x003c
            r0 = 2131830424(0x7f112698, float:1.9293845E38)
            java.lang.String r3 = r4.getString(r0)     // Catch:{ Exception -> 0x003f }
        L_0x002c:
            com.ss.android.ugc.aweme.opensdk.a.a.a r2 = new com.ss.android.ugc.aweme.opensdk.a.a.a     // Catch:{ Exception -> 0x003f }
            java.lang.String r1 = "share saved"
            com.bytedance.tiktok.homepage.a$1 r0 = new com.bytedance.tiktok.homepage.a$1     // Catch:{ Exception -> 0x003f }
            r0.<init>(r4, r5)     // Catch:{ Exception -> 0x003f }
            r2.<init>(r4, r3, r1, r0)     // Catch:{ Exception -> 0x003f }
            r2.show()     // Catch:{ Exception -> 0x003f }
            goto L_0x003f
        L_0x003c:
            java.lang.String r3 = r5.mAppName     // Catch:{ Exception -> 0x003f }
            goto L_0x002c
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.a.a(android.content.Intent):void");
    }

    public final void a(MainActivity mainActivity) {
        AVExternalServiceImpl.a().abnormalExitLogService().logRestoreDialogShow();
        IExternalService a2 = AVExternalServiceImpl.a();
        if (a2 == null || a2.publishService().restoreWorkExperimentDisableCover()) {
            a.C0731a b2 = new a.C0731a(mainActivity).b(R.string.h_r).a(R.string.asg, (DialogInterface.OnClickListener) new d(this, mainActivity), false).b(R.string.a9e, (DialogInterface.OnClickListener) new e(this, mainActivity), false);
            b2.M = false;
            b2.a().b();
            return;
        }
        a2.publishService().showRestoreWorkDialog(mainActivity, mainActivity.getEnterFrom());
    }

    @r
    public void onFeedbackEvent(com.ss.android.ugc.aweme.feedback.a aVar) {
        final MainActivity mainActivity = this.f44110a;
        com.ss.android.ugc.aweme.common.r.a("feedback_reply_alert", new d().a("uid", b.g().getCurUserId()).f66730a);
        new a.C0731a(mainActivity).a(R.string.cn2).a(R.string.cuu, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.bytedance.tiktok.homepage.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(27034);
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                com.ss.android.ugc.aweme.common.r.a("feedback_reply_view", new d().a("uid", b.g().getCurUserId()).f66730a);
                com.ss.android.ugc.aweme.feedback.b.a(mainActivity, "feedback_alert");
            }
        }, false).b(R.string.cuh, (DialogInterface.OnClickListener) null, false).a().b();
    }
}
