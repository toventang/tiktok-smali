package com.bytedance.android.livesdk.feed.a;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.d;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements f {

    /* renamed from: a  reason: collision with root package name */
    private final d f17261a;

    static {
        Covode.recordClassIndex(9578);
    }

    j(d dVar) {
        this.f17261a = dVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        d dVar = this.f17261a;
        dVar.f17240k = false;
        if (dVar.f17232c != null) {
            String d2 = d.a().d();
            String str = "";
            String str2 = !TextUtils.isEmpty(d2) ? d2 + "_" : str;
            if (m.a("homepage_hot", d.a().e())) {
                str = "foru_";
            }
            String str3 = str2 + str + "feed_loadmore";
            if (m.a("referral_task", d.a().e())) {
                str3 = "referrals_loadmore";
            }
            if (LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance()) {
                str3 = "drawer_loadmore";
            }
            BaseFeedDataViewModel baseFeedDataViewModel = dVar.f17232c;
            if (baseFeedDataViewModel.f17697a != null) {
                baseFeedDataViewModel.f17697a.a(null, str3);
            }
        }
    }
}
