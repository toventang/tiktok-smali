package com.ss.android.ugc.aweme.base.component;

import android.app.Activity;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.experiment.gy;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import java.util.Calendar;

final /* synthetic */ class d implements PopupWindow.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    private final EventActivityComponent f68065a;

    /* renamed from: b  reason: collision with root package name */
    private final long f68066b;

    static {
        Covode.recordClassIndex(41923);
    }

    d(EventActivityComponent eventActivityComponent, long j2) {
        this.f68065a = eventActivityComponent;
        this.f68066b = j2;
    }

    public final void onDismiss() {
        long j2 = this.f68066b;
        User curUser = b.g().getCurUser();
        if ((!gy.a() || (curUser != null && curUser.nicknameUpdateReminder())) && !a.c().a(4)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > j2) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(currentTimeMillis);
                instance.set(11, 0);
                instance.set(12, 0);
                instance.set(13, 0);
                instance.set(14, 0);
                if (instance.getTimeInMillis() >= j2) {
                    if (curUser.nicknameUpdateReminder()) {
                        Activity j3 = f.j();
                        if (j3 == null) {
                            return;
                        }
                        if (EventActivityComponent.f68053c == null || !EventActivityComponent.f68053c.isShowing()) {
                            i iVar = new i(j3, curUser);
                            EventActivityComponent.f68053c = iVar;
                            iVar.show();
                            r.onEventV3("modify_username_notify");
                            return;
                        }
                        return;
                    }
                    MainServiceImpl.createIMainServicebyMonsterPlugin(false).tryShowIllegalUsernameDialog("publish", null, null);
                }
            }
        }
    }
}
