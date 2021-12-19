package com.ss.android.ugc.aweme.share.silent;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;

final /* synthetic */ class m implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    static final DialogInterface.OnClickListener f124358a = new m();

    static {
        Covode.recordClassIndex(81650);
    }

    private m() {
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        r.onEvent(MobClick.obtain().setEventName("sync_permission").setLabelName("cancel"));
    }
}
