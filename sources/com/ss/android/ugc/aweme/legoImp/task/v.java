package com.ss.android.ugc.aweme.legoImp.task;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.i.a;

final /* synthetic */ class v implements a {

    /* renamed from: a  reason: collision with root package name */
    static final a f107997a = new v();

    static {
        Covode.recordClassIndex(69237);
    }

    private v() {
    }

    @Override // com.bytedance.crash.i.a
    public final String a(Activity activity) {
        if (activity instanceof com.bytedance.ies.powerpage.a) {
            String rootFragmentClsName = ((com.bytedance.ies.powerpage.a) activity).getRootFragmentClsName();
            if (!TextUtils.isEmpty(rootFragmentClsName)) {
                return rootFragmentClsName;
            }
        }
        return activity.getClass().getName();
    }
}
