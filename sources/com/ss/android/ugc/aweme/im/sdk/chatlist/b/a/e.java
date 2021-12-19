package com.ss.android.ugc.aweme.im.sdk.chatlist.b.a;

import android.content.DialogInterface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.l;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n;
import com.ss.android.ugc.aweme.im.service.IIMunder16Proxy;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e extends com.ss.android.ugc.aweme.im.service.k.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f101878a = "notice_under_16_session";

    static {
        Covode.recordClassIndex(65176);
    }

    @Override // com.ss.android.ugc.aweme.im.service.k.a
    public final int c() {
        return 29;
    }

    @Override // com.ss.android.ugc.aweme.im.service.k.a
    public final String bF_() {
        return this.f101878a;
    }

    @Override // com.ss.android.ugc.aweme.im.service.k.a
    public final com.ss.android.ugc.aweme.im.service.k.b b() {
        return new a(this);
    }

    @Override // com.ss.android.ugc.aweme.im.service.k.a
    public final void d() {
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b() != null) {
            IIMunder16Proxy under16Proxy = com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().getUnder16Proxy();
            l.b(under16Proxy, "");
            if (under16Proxy != null) {
                this.f103871m = under16Proxy.e();
                this.f103870l = com.ss.android.ugc.aweme.base.model.a.a(2131232843);
                if (under16Proxy.m() < 10000000000L) {
                    a(under16Proxy.m() * 1000);
                } else {
                    a(under16Proxy.m());
                }
            }
        }
    }

    public static final class a implements com.ss.android.ugc.aweme.im.service.k.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f101879a;

        static {
            Covode.recordClassIndex(65177);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(e eVar) {
            this.f101879a = eVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.e$a$a  reason: collision with other inner class name */
        static final class DialogInterface$OnClickListenerC2535a implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f101880a;

            static {
                Covode.recordClassIndex(65178);
            }

            DialogInterface$OnClickListenerC2535a(a aVar) {
                this.f101880a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
                if (i2 == 0) {
                    n a2 = n.a();
                    l.b(a2, "");
                    a2.f102428a.edit().putBoolean("notice_under_16_deleted_state", true).commit();
                    com.ss.android.ugc.aweme.im.sdk.common.controller.e.l a3 = l.a.a();
                    if (a3 != null) {
                        a3.a(this.f101880a.f101879a.f101878a);
                    }
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.im.service.k.b
        public final void a(androidx.fragment.app.e eVar, com.ss.android.ugc.aweme.im.service.k.a aVar, int i2) {
            h.f.b.l.d(eVar, "");
            h.f.b.l.d(aVar, "");
            if (i2 == 0) {
                com.ss.android.ugc.aweme.common.f.a aVar2 = new com.ss.android.ugc.aweme.common.f.a(eVar);
                aVar2.a(new String[]{eVar.getString(R.string.ce9)}, new DialogInterface$OnClickListenerC2535a(this));
                aVar2.f76416a.b();
            }
        }
    }

    public static final class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IIMunder16Proxy f101881a;

        static {
            Covode.recordClassIndex(65179);
        }

        public b(IIMunder16Proxy iIMunder16Proxy) {
            this.f101881a = iIMunder16Proxy;
        }

        public final void onClick(View view) {
            h.f.b.l.d(view, "");
            this.f101881a.i();
        }

        public final void updateDrawState(TextPaint textPaint) {
            h.f.b.l.d(textPaint, "");
            textPaint.setUnderlineText(false);
        }
    }
}
