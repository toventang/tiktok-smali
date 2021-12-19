package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n;
import com.ss.android.ugc.aweme.im.sdk.privacy.b.b.a;
import com.ss.android.ugc.aweme.im.sdk.privacy.b.c.a;
import h.f.b.z;

public final class IMService$tryShowingChatPrivacyPanel$$inlined$run$lambda$1 implements a.b {
    final /* synthetic */ com.ss.android.ugc.aweme.im.service.h.a $callback$inlined;
    final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.privacy.data.a.a $chatUserSetting$inlined;
    final /* synthetic */ String $enterFrom$inlined;
    final /* synthetic */ i $fragmentManager$inlined;
    final /* synthetic */ a $this_apply;
    final /* synthetic */ n $this_run$inlined;
    final /* synthetic */ z.e $tuxSheet$inlined;

    static {
        Covode.recordClassIndex(65500);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.privacy.b.b.a.b
    public final void onCancel() {
        a.b.a(this.$this_apply, a.C2603a.f102932a);
        T t = this.$tuxSheet$inlined.element;
        if (t != null) {
            t.dismissAllowingStateLoss();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.privacy.b.b.a.b
    public final void onSetPrivacyValue(int i2) {
        a.b.a(this.$this_apply, new a.b(i2));
        T t = this.$tuxSheet$inlined.element;
        if (t != null) {
            t.dismissAllowingStateLoss();
        }
    }

    IMService$tryShowingChatPrivacyPanel$$inlined$run$lambda$1(com.ss.android.ugc.aweme.im.sdk.privacy.b.b.a aVar, z.e eVar, com.ss.android.ugc.aweme.im.sdk.privacy.data.a.a aVar2, n nVar, String str, com.ss.android.ugc.aweme.im.service.h.a aVar3, i iVar) {
        this.$this_apply = aVar;
        this.$tuxSheet$inlined = eVar;
        this.$chatUserSetting$inlined = aVar2;
        this.$this_run$inlined = nVar;
        this.$enterFrom$inlined = str;
        this.$callback$inlined = aVar3;
        this.$fragmentManager$inlined = iVar;
    }
}
