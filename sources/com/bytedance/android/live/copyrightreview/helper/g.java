package com.bytedance.android.live.copyrightreview.helper;

import android.content.DialogInterface;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import f.a.b.a;

final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final CopyrightViolationHelper f8850a;

    /* renamed from: b  reason: collision with root package name */
    private final Room f8851b;

    /* renamed from: c  reason: collision with root package name */
    private final a f8852c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8853d;

    static {
        Covode.recordClassIndex(4527);
    }

    g(CopyrightViolationHelper copyrightViolationHelper, Room room, a aVar, int i2) {
        this.f8850a = copyrightViolationHelper;
        this.f8851b = room;
        this.f8852c = aVar;
        this.f8853d = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        CopyrightViolationHelper copyrightViolationHelper = this.f8850a;
        Room room = this.f8851b;
        a aVar = this.f8852c;
        int i3 = this.f8853d;
        if (copyrightViolationHelper.f8833c != null) {
            copyrightViolationHelper.f8833c.dispose();
        }
        CopyrightViolationHelper.a(room, "end_live", true);
        dialogInterface.dismiss();
        aVar.a(copyrightViolationHelper.a(room, i3, 102));
        CopyrightViolationHelper.a(room);
    }
}
