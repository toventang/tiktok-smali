package com.ss.android.ugc.aweme.feedback.reply;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.app.l;
import com.ss.android.ugc.aweme.feedback.reply.FeedbackNewestReplyApi;
import com.ss.android.ugc.d.a.c;

public final class a implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public Handler f95389a;

    /* renamed from: b  reason: collision with root package name */
    private Context f95390b;

    static {
        Covode.recordClassIndex(60408);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a() {
        try {
            Keva a2 = d.a();
            if (a2 == null || !a2.getBoolean("has", false)) {
                return null;
            }
            com.bytedance.ies.e.a.a a3 = com.bytedance.ies.e.a.a.a();
            Handler handler = this.f95389a;
            FeedbackNewestReplyApi.a aVar = FeedbackNewestReplyApi.f95388b;
            aVar.getClass();
            a3.a(handler, new c(aVar), 0);
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f95390b = applicationContext;
        this.f95389a = new Handler(this.f95390b.getMainLooper(), this);
    }

    public final boolean handleMessage(Message message) {
        if (message.obj instanceof e) {
            e eVar = (e) message.obj;
            if (eVar.f95396b == 0 && eVar.f95397c != null && eVar.f95397c.f95399b.booleanValue() && com.ss.android.ugc.aweme.activity.a.a(f.j(), false) && l.a() > 0) {
                c.a(new com.ss.android.ugc.aweme.feedback.a());
            }
        } else if (message.obj instanceof Exception) {
            ((Exception) message.obj).printStackTrace();
        }
        return false;
    }
}
