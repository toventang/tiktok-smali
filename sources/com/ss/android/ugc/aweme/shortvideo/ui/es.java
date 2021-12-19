package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.OnActivityResultCallback;
import java.util.ArrayList;

final /* synthetic */ class es implements OnActivityResultCallback {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131732a;

    static {
        Covode.recordClassIndex(86275);
    }

    es(cj cjVar) {
        this.f131732a = cjVar;
    }

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i2, int i3, Intent intent) {
        cj cjVar = this.f131732a;
        if (i3 == -1 && intent != null && intent.getBooleanExtra("need_update", false)) {
            cjVar.K.tagUserList = (ArrayList) intent.getSerializableExtra("tagged_user_list");
            cjVar.g();
        }
    }
}
