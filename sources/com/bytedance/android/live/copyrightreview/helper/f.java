package com.bytedance.android.live.copyrightreview.helper;

import android.content.DialogInterface;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import f.a.b.a;

final /* synthetic */ class f implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final CopyrightViolationHelper f8846a;

    /* renamed from: b  reason: collision with root package name */
    private final a f8847b;

    /* renamed from: c  reason: collision with root package name */
    private final Room f8848c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8849d;

    static {
        Covode.recordClassIndex(4526);
    }

    f(CopyrightViolationHelper copyrightViolationHelper, a aVar, Room room, int i2) {
        this.f8846a = copyrightViolationHelper;
        this.f8847b = aVar;
        this.f8848c = room;
        this.f8849d = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        CopyrightViolationHelper copyrightViolationHelper = this.f8846a;
        a aVar = this.f8847b;
        Room room = this.f8848c;
        int i3 = this.f8849d;
        copyrightViolationHelper.f8835e = true;
        if (copyrightViolationHelper.f8833c != null) {
            copyrightViolationHelper.f8833c.dispose();
        }
        aVar.a(copyrightViolationHelper.a(room, i3, 101));
        dialogInterface.dismiss();
        CopyrightViolationHelper.a(room, "confirm", true);
    }
}
