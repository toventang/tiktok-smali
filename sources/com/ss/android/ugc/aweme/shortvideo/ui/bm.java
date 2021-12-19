package com.ss.android.ugc.aweme.shortvideo.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.fragment.app.e;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.publish.o;
import com.ss.android.ugc.aweme.scheduler.PublishService;
import com.ss.android.ugc.aweme.settings.m;
import com.ss.android.ugc.aweme.shoutouts.d;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.concurrent.Callable;

public final class bm {

    /* renamed from: a  reason: collision with root package name */
    public static final bm f131500a = new bm();

    private bm() {
    }

    static {
        Covode.recordClassIndex(86139);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f131503a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f131504b;

        static {
            Covode.recordClassIndex(86142);
        }

        b(e eVar, c cVar) {
            this.f131503a = eVar;
            this.f131504b = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            o.a(this.f131503a, this.f131504b);
            com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
            bVar.a("enter_from", "homepage_hot");
            bVar.a("action_type", "1");
            if (this.f131504b.W.aU != null && l.a((Object) this.f131504b.W.aU.getShoutOutsMode(), (Object) d.MODE_SEND) && !TextUtils.isEmpty(this.f131504b.W.aU.getOrderId())) {
                bVar.a("order_id", this.f131504b.W.aU.getOrderId());
            }
            r.a("upload_failed_pop_up_response", bVar.f149193a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f131501a;

        static {
            Covode.recordClassIndex(86140);
        }

        a(c cVar) {
            this.f131501a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            i.b(new Callable(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.ui.bm.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f131502a;

                static {
                    Covode.recordClassIndex(86141);
                }

                {
                    this.f131502a = r1;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    AVServiceImpl.a().draftService().delete(this.f131502a.f131501a);
                    return z.f158842a;
                }
            }, i.f4824a);
            if (m.a()) {
                g.a().o().l().c(this.f131501a.r());
            } else {
                g.a().o().l().a(null);
            }
            PublishService.a.a();
            q.d("Publish | remove recover path by dismiss panel so");
            com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
            bVar.a("enter_from", "homepage_hot");
            bVar.a("action_type", "0");
            if (this.f131501a.W.aU != null && l.a((Object) this.f131501a.W.aU.getShoutOutsMode(), (Object) d.MODE_SEND) && !TextUtils.isEmpty(this.f131501a.W.aU.getOrderId())) {
                bVar.a("order_id", this.f131501a.W.aU.getOrderId());
            }
            r.a("upload_failed_pop_up_response", bVar.f149193a);
        }
    }

    public static final Dialog a(e eVar, c cVar) {
        int i2;
        l.d(eVar, "");
        l.d(cVar, "");
        a.C0731a aVar = new a.C0731a(eVar);
        if (l.a((Object) d.MODE_SEND, (Object) cVar.W.aU.getShoutOutsMode())) {
            i2 = R.string.fys;
        } else {
            i2 = R.string.h6n;
        }
        com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
        bVar.a("enter_from", "homepage_hot");
        if (cVar.W.aU != null && l.a((Object) cVar.W.aU.getShoutOutsMode(), (Object) d.MODE_SEND) && !TextUtils.isEmpty(cVar.W.aU.getOrderId())) {
            bVar.a("order_id", cVar.W.aU.getOrderId());
        }
        r.a("show_upload_failed_pop_up", bVar.f149193a);
        a.C0731a a2 = aVar.a(i2);
        a2.M = false;
        Dialog c2 = a2.b(R.string.h6m).b(R.string.a9e, (DialogInterface.OnClickListener) new a(cVar), false).a(R.string.fen, (DialogInterface.OnClickListener) new b(eVar, cVar), false).a().c();
        l.b(c2, "");
        return c2;
    }

    public static final p a(e eVar, c cVar, boolean z, boolean z2) {
        l.d(eVar, "");
        l.d(cVar, "");
        return new bp(eVar, cVar, z, z2);
    }
}
