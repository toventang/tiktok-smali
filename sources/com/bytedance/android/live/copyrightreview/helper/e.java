package com.bytedance.android.live.copyrightreview.helper;

import android.content.DialogInterface;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final CopyrightViolationHelper f8844a;

    /* renamed from: b  reason: collision with root package name */
    private final Room f8845b;

    static {
        Covode.recordClassIndex(4525);
    }

    e(CopyrightViolationHelper copyrightViolationHelper, Room room) {
        this.f8844a = copyrightViolationHelper;
        this.f8845b = room;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        Room room = this.f8845b;
        dialogInterface.dismiss();
        CopyrightViolationHelper.a(room, "cancel", false);
    }
}
