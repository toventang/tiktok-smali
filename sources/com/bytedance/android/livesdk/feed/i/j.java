package com.bytedance.android.livesdk.feed.i;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.android.live.a.a.b.a;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f17521a;

    static {
        Covode.recordClassIndex(9705);
    }

    j(a aVar) {
        this.f17521a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Context context = this.f17521a.itemView.getContext();
        if (th instanceof a) {
            a aVar = (a) th;
            String alert = aVar.getAlert();
            String prompt = aVar.getPrompt();
            if (!TextUtils.isEmpty(alert)) {
                String string = context.getResources().getString(R.string.gly);
                b.a aVar2 = new b.a(context);
                aVar2.f18284a = context.getResources().getString(R.string.gmf);
                aVar2.f18285b = alert;
                aVar2.a((CharSequence) string, (DialogInterface.OnClickListener) null, false);
                aVar2.a().show();
            } else if (!TextUtils.isEmpty(prompt)) {
                ao.a(context, prompt, 0);
            }
        } else {
            ao.a(context, (int) R.string.gme);
        }
    }
}
