package com.ss.android.ugc.aweme.port.internal;

import android.app.Activity;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.live.k;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.utils.ActivityStack;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    final e f115670a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f115671b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f115672c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f115673d;

    static {
        Covode.recordClassIndex(74622);
    }

    static boolean a() {
        for (Activity activity : ActivityStack.getActivityStack()) {
            if (activity instanceof k) {
                return true;
            }
        }
        return false;
    }

    static boolean a(ai aiVar) {
        if (aiVar.shoutOutsType == 1 || aiVar.shoutOutsType == 2) {
            return true;
        }
        return false;
    }

    public a(e eVar) {
        this.f115670a = eVar;
        this.f115671b = !(eVar instanceof MainActivity);
        this.f115672c = eVar instanceof k;
        this.f115673d = eVar.getClass().equals(AVExternalServiceImpl.a().classnameService().getVideoPublishActivityClass());
    }
}
