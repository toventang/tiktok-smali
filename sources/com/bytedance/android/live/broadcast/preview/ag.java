package com.bytedance.android.live.broadcast.preview;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.preview.v;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.live.slot.ae;
import com.bytedance.android.live.t.a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ag implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final v.a f8108a;

    /* renamed from: b  reason: collision with root package name */
    private final ab f8109b;

    static {
        Covode.recordClassIndex(4034);
    }

    ag(v.a aVar, ab abVar) {
        this.f8108a = aVar;
        this.f8109b = abVar;
    }

    public final void onClick(View view) {
        v.a aVar = this.f8108a;
        IIconSlot iIconSlot = (IIconSlot) this.f8109b.f();
        if (iIconSlot != null) {
            ae a2 = iIconSlot.a();
            if (a2 != null) {
                a2.a(aVar.f8302c, "before_live");
            } else if (!TextUtils.isEmpty(null)) {
                ((IActionHandlerService) a.a(IActionHandlerService.class)).handleWithoutHost(aVar.f8300a, Uri.parse(null).toString());
            }
        }
    }
}
