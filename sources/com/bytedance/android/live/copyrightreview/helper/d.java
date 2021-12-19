package com.bytedance.android.live.copyrightreview.helper;

import android.content.DialogInterface;
import com.bytedance.android.live.copyrightreview.ReviewApi;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import f.a.b.a;

final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final CopyrightViolationHelper f8841a;

    /* renamed from: b  reason: collision with root package name */
    private final a f8842b;

    /* renamed from: c  reason: collision with root package name */
    private final Room f8843c;

    static {
        Covode.recordClassIndex(4524);
    }

    d(CopyrightViolationHelper copyrightViolationHelper, a aVar, Room room) {
        this.f8841a = copyrightViolationHelper;
        this.f8842b = aVar;
        this.f8843c = room;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        CopyrightViolationHelper copyrightViolationHelper = this.f8841a;
        a aVar = this.f8842b;
        Room room = this.f8843c;
        copyrightViolationHelper.f8834d = true;
        aVar.a(((ReviewApi) e.a().a(ReviewApi.class)).notifyOfConfirmCopyright(room.getId()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new j(copyrightViolationHelper), new k(copyrightViolationHelper)));
        dialogInterface.dismiss();
        CopyrightViolationHelper.a(room, "confirm", false);
    }
}
