package com.bytedance.android.live.liveinteract.multiguest.a.c;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.app.a.b;
import com.bytedance.android.live.liveinteract.api.o;
import com.bytedance.android.live.liveinteract.platform.common.g.h;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.chatroom.model.g;
import com.bytedance.android.livesdk.g.e;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import h.n;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class a {
    static {
        Covode.recordClassIndex(5941);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements LiveDialog.b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f11055a = new b();

        static {
            Covode.recordClassIndex(5943);
        }

        b() {
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.b
        public final void a(DialogInterface dialogInterface) {
            l.d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f11057a = new d();

        static {
            Covode.recordClassIndex(5945);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.livesdk.utils.f.a(y.e(), (Throwable) obj);
        }
    }

    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o.a f11056a;

        static {
            Covode.recordClassIndex(5944);
        }

        public c(o.a aVar) {
            this.f11056a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            if (dVar != null) {
                try {
                    if (dVar.data != null) {
                        String a2 = a.a((g) dVar.data, this.f11056a);
                        if (!TextUtils.isEmpty(a2)) {
                            ao.a(y.e(), a2, 0);
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                } catch (IllegalArgumentException unused) {
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.a$a  reason: collision with other inner class name */
    public static final class View$OnClickListenerC0208a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f11053a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveDialog f11054b;

        static {
            Covode.recordClassIndex(5942);
        }

        View$OnClickListenerC0208a(Context context, LiveDialog liveDialog) {
            this.f11053a = context;
            this.f11054b = liveDialog;
        }

        public final void onClick(View view) {
            String str;
            Context context = this.f11053a;
            Uri.Builder appendQueryParameter = Uri.parse(e.a()).buildUpon().appendQueryParameter("enter_from", "popup").appendQueryParameter("ban_type", String.valueOf(o.a.BAN_FOR_LINK.type));
            String str2 = "anchor";
            if (p.f()) {
                str = str2;
            } else {
                str = "guest";
            }
            String uri = appendQueryParameter.appendQueryParameter("user_type", str).build().toString();
            l.b(uri, "");
            d.a b2 = com.bytedance.android.livesdk.browser.c.e.b(uri);
            b2.f14292c = true;
            ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager().a(context, b2);
            this.f11054b.dismiss();
            com.bytedance.android.livesdk.ab.b f2 = b.a.a("livesdk_guest_linkmic_ban_details_click").a().f("click");
            if (!p.f()) {
                str2 = "guest";
            }
            f2.a("user_type", str2).b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0057, code lost:
        if (r0 == null) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.String a(com.bytedance.android.livesdk.chatroom.model.g r6) {
        /*
            java.lang.String r4 = ""
            if (r6 == 0) goto L_0x0059
            boolean r1 = r6.f15768a
            r0 = 1
            if (r1 != r0) goto L_0x0014
            r0 = 2131827285(0x7f111a55, float:1.9287478E38)
            java.lang.String r0 = com.bytedance.android.live.core.f.y.a(r0)
        L_0x0010:
            h.f.b.l.b(r0, r4)
            return r0
        L_0x0014:
            java.util.Date r5 = new java.util.Date
            long r2 = r6.f15770c
            long r0 = r6.f15771d
            long r2 = r2 + r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            r5.<init>(r2)
            r0 = 2131827289(0x7f111a59, float:1.9287486E38)
            java.lang.String r3 = com.bytedance.android.live.core.f.y.a(r0)
            h.f.b.l.b(r3, r4)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = "HH:mm"
            r2.<init>(r0, r1)
            java.lang.String r1 = r2.format(r5)
            h.f.b.l.b(r1, r4)
            java.lang.String r0 = "{time}"
            java.lang.String r3 = h.m.p.a(r3, r0, r1)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = "dd-MM-yyyy"
            r2.<init>(r0, r1)
            java.lang.String r1 = r2.format(r5)
            h.f.b.l.b(r1, r4)
            java.lang.String r0 = "{date}"
            java.lang.String r0 = h.m.p.a(r3, r0, r1)
            if (r0 != 0) goto L_0x0010
        L_0x0059:
            r0 = 2131827595(0x7f111b8b, float:1.9288107E38)
            java.lang.String r0 = com.bytedance.android.live.core.f.y.a(r0)
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguest.a.c.a.a(com.bytedance.android.livesdk.chatroom.model.g):java.lang.String");
    }

    public static final String a(g gVar, o.a aVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (aVar == null) {
            try {
                throw new IllegalArgumentException("Required value was null.".toString());
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } else if (gVar.f15768a) {
            int i2 = b.f11058a[aVar.ordinal()];
            if (i2 == 1) {
                h.c("suspend_permanent_guest");
                return y.a((int) R.string.ebw);
            } else if (i2 == 2) {
                h.c("suspend_permanent_host");
                return y.a((int) R.string.ebu);
            } else {
                throw new n();
            }
        } else {
            Date date = new Date((gVar.f15770c + gVar.f15771d) * 1000);
            int i3 = b.f11059b[aVar.ordinal()];
            if (i3 == 1) {
                h.c("suspend_temporarily_guest");
                String a2 = y.a((int) R.string.ebx);
                l.b(a2, "");
                String format = new SimpleDateFormat("HH:mm", Locale.ENGLISH).format(date);
                l.b(format, "");
                String a3 = h.m.p.a(a2, "{0}", format);
                String format2 = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(date);
                l.b(format2, "");
                return h.m.p.a(a3, "{1}", format2);
            } else if (i3 == 2) {
                h.c("suspend_temporarily_host");
                String a4 = y.a((int) R.string.ebv);
                l.b(a4, "");
                String format3 = new SimpleDateFormat("HH:mm", Locale.ENGLISH).format(date);
                l.b(format3, "");
                String a5 = h.m.p.a(a4, "{0}", format3);
                String format4 = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(date);
                l.b(format4, "");
                return h.m.p.a(a5, "{1}", format4);
            } else {
                throw new n();
            }
        }
    }

    public static final void a(g gVar, Context context, m mVar) {
        LiveDialog.a aVar = new LiveDialog.a(context);
        aVar.f9360a = mVar;
        aVar.q = false;
        LiveDialog a2 = aVar.a(R.string.e5e).a(a(gVar)).a(R.string.e5f, b.f11055a).a();
        b.a a3 = new b.a().a(context);
        a3.f9390b = new View$OnClickListenerC0208a(context, a2);
        a2.a(a3.a());
        a2.show();
        h.b();
    }
}
