package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import android.content.DialogInterface;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.c;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n;
import com.ss.android.ugc.aweme.im.sdk.privacy.b.c.a;
import com.ss.android.ugc.aweme.im.service.h.a;
import h.f.b.l;

final class IMService$tryShowingChatPrivacyPanel$$inlined$run$lambda$2 implements DialogInterface.OnDismissListener {
    final /* synthetic */ a $callback$inlined;
    final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.privacy.data.a.a $chatUserSetting$inlined;
    final /* synthetic */ String $enterFrom$inlined;
    final /* synthetic */ i $fragmentManager$inlined;
    final /* synthetic */ n $this_run$inlined;

    static {
        Covode.recordClassIndex(65501);
    }

    IMService$tryShowingChatPrivacyPanel$$inlined$run$lambda$2(com.ss.android.ugc.aweme.im.sdk.privacy.data.a.a aVar, n nVar, String str, a aVar2, i iVar) {
        this.$chatUserSetting$inlined = aVar;
        this.$this_run$inlined = nVar;
        this.$enterFrom$inlined = str;
        this.$callback$inlined = aVar2;
        this.$fragmentManager$inlined = iVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        a aVar;
        com.ss.android.ugc.aweme.im.service.m.a.b("follow_status", "PrivacyPanel dismiss");
        l.b(dialogInterface, "");
        c a2 = a.b.a(dialogInterface);
        if ((a2 instanceof a.b) && (aVar = this.$callback$inlined) != null) {
            aVar.a(((a.b) a2).f102933a);
        }
    }
}
