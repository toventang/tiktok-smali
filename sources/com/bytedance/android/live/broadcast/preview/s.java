package com.bytedance.android.live.broadcast.preview;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.android.live.broadcast.ab;
import com.bytedance.android.live.broadcast.api.c.b;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.broadcast.model.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.browser.c.e;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;

public final class s {
    static {
        Covode.recordClassIndex(4213);
    }

    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f8289a;

        static {
            Covode.recordClassIndex(4217);
        }

        public d(Context context) {
            this.f8289a = context;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            l.b(th, "");
            Context context = this.f8289a;
            com.bytedance.android.livesdk.ab.a b2 = b.a.b("ttlive_fetch_ban_status_all", th).b("preview");
            b2.f13428e = true;
            b2.a();
            com.bytedance.android.livesdk.utils.f.a(context, th);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f8285a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f8286b;

        static {
            Covode.recordClassIndex(4215);
        }

        b(Context context, String str) {
            this.f8285a = context;
            this.f8286b = str;
        }

        public final void onClick(View view) {
            b.a.a("livesdk_enter_live_appeal_page").a().a("enter_from", "popup").a("appeal_type", "general").b();
            com.bytedance.android.livesdk.browser.c.d webViewManager = ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager();
            Context context = this.f8285a;
            d.a b2 = e.b(this.f8286b + "&enter_from=toast");
            b2.f14292c = true;
            b2.f14291b = y.a((int) R.string.gl9);
            webViewManager.a(context, b2);
        }
    }

    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f8287a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DataChannel f8288b;

        static {
            Covode.recordClassIndex(4216);
        }

        public c(Context context, DataChannel dataChannel) {
            this.f8287a = context;
            this.f8288b = dataChannel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.broadcast.model.c cVar;
            long j2;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            if (dVar != null && (cVar = (com.bytedance.android.live.broadcast.model.c) dVar.data) != null) {
                Context context = this.f8287a;
                DataChannel dataChannel = this.f8288b;
                String str = "";
                l.d(cVar, str);
                com.bytedance.android.livesdk.ab.a a2 = c.a.b("ttlive_fetch_ban_status_all").b("preview").a("ban_time", Long.valueOf(cVar.f7893a)).a("ban_duration", Integer.valueOf(cVar.f7894b)).a("ban_count", Integer.valueOf(cVar.f7895c)).a("ban_reason", cVar.f7898f).a("is_ban_forever", Boolean.valueOf(cVar.f7896d));
                a2.f13426c = true;
                a2.a();
                if (cVar.f7896d) {
                    j2 = -1;
                } else {
                    j2 = cVar.f7893a + ((long) cVar.f7894b);
                }
                if (dataChannel != null) {
                    m mVar = new m(j2, cVar.f7897e);
                    dataChannel.b(ab.class, mVar);
                    c.a.a("ttlive_blocked_detail_url").b("preview").a("url", mVar.f7932b).a();
                    String str2 = mVar.f7931a;
                    if (str2 != null) {
                        str = str2;
                    }
                    String str3 = mVar.f7932b;
                    SpannableString spannableString = new SpannableString(y.a((int) R.string.ecs));
                    spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FE2C55")), 0, spannableString.length(), 33);
                    b.a aVar = new b.a(context);
                    aVar.f18286c = str;
                    aVar.f18284a = y.a((int) R.string.ecr);
                    aVar.a(R.string.e5f, (DialogInterface.OnClickListener) a.f8284a, false).a(spannableString, new b(context, str3)).a().show();
                    b.a.a("livesdk_live_appeal_popup_show").a().c("show").b();
                }
            }
        }
    }

    static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8284a = new a();

        static {
            Covode.recordClassIndex(4214);
        }

        a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }
}
