package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.port.in.v;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bk;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.tools.view.widget.k;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bl implements v.a {

    /* renamed from: a  reason: collision with root package name */
    private final bk.a f129069a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f129070b;

    static {
        Covode.recordClassIndex(84711);
    }

    bl(bk.a aVar, Context context) {
        this.f129069a = aVar;
        this.f129070b = context;
    }

    @Override // com.ss.android.ugc.aweme.port.in.v.a
    public final void a(String[] strArr, int[] iArr) {
        boolean z;
        bk.a aVar = this.f129069a;
        Context context = this.f129070b;
        if (iArr == null || iArr.length == 0 || strArr == null || strArr.length == 0) {
            bj.b("reuse mv permission is empty!");
            aVar.a();
            return;
        }
        for (int i2 : iArr) {
            if (i2 == -1) {
                bj.b("reuse mv deny permission");
                String[] strArr2 = {"android.permission.WRITE_EXTERNAL_STORAGE"};
                int i3 = 0;
                while (true) {
                    String str = strArr2[0];
                    if (c.D.c().a(context, str) == -1 && !c.D.c().a((Activity) context, str)) {
                        z = true;
                        break;
                    }
                    i3++;
                    if (i3 > 0) {
                        z = false;
                        break;
                    }
                }
                k.a(new a.C0731a(context).b(R.string.v_).b(R.string.va, bm.f129071a, false).a(R.string.asi, (DialogInterface.OnClickListener) new bn(z, context, aVar), false).a().b());
                aVar.b();
                return;
            }
        }
        bj.a("reuse mv allow permission");
        aVar.a();
    }
}
