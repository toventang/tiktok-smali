package com.ss.android.ugc.aweme.dmt_integration;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.widget.j;

final /* synthetic */ class d implements j.b {

    /* renamed from: a  reason: collision with root package name */
    static final j.b f82925a = new d();

    static {
        Covode.recordClassIndex(51678);
    }

    private d() {
    }

    @Override // com.ss.android.ugc.tools.view.widget.j.b
    public final void a(Context context, String str, int i2, int i3) {
        if (i3 == 1) {
            new com.ss.android.ugc.tools.view.widget.d(context, str, i2, 1, com.ss.android.ugc.tools.view.widget.d.a()).b();
        } else if (i3 != 2) {
            if (i3 != 3) {
                return;
            }
            com.ss.android.ugc.tools.view.widget.d.b(context, str, i2).b();
        }
        com.ss.android.ugc.tools.view.widget.d.a(context, str, i2).b();
        com.ss.android.ugc.tools.view.widget.d.b(context, str, i2).b();
    }
}
