package com.ss.android.ugc.aweme.share.improve.c;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.share.ad;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.share.improve.e;
import com.ss.android.ugc.aweme.utils.bt;
import com.ss.android.ugc.aweme.utils.cp;
import com.ss.android.ugc.aweme.utils.cr;
import com.ss.android.ugc.aweme.utils.in;
import f.a.n;
import f.a.q;
import h.f.b.l;
import java.io.File;

public final class c {
    static {
        Covode.recordClassIndex(81285);
    }

    public static final ShareInfo a(ShareInfo shareInfo) {
        if (shareInfo != null) {
            return shareInfo;
        }
        ShareInfo shareInfo2 = new ShareInfo();
        shareInfo2.setShareTitle("");
        shareInfo2.setBoolPersist(0);
        shareInfo2.setShareDesc("");
        shareInfo2.setShareSignatureDesc("");
        shareInfo2.setShareSignatureUrl("");
        shareInfo2.setShareUrl("");
        shareInfo2.setShareQuote("");
        return shareInfo2;
    }

    public static final void a(Context context) {
        Activity j2;
        l.d(context, "");
        if (context instanceof Activity) {
            j2 = (Activity) context;
        } else {
            j2 = f.j();
        }
        if (j2 != null) {
            b.a(j2, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new a(j2, context));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements b.AbstractC1579b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f123842a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f123843b;

        static {
            Covode.recordClassIndex(81286);
        }

        a(Activity activity, Context context) {
            this.f123842a = activity;
            this.f123843b = context;
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.c.c$a$a  reason: collision with other inner class name */
        static final class DialogInterface$OnClickListenerC3207a implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f123844a;

            static {
                Covode.recordClassIndex(81287);
            }

            DialogInterface$OnClickListenerC3207a(a aVar) {
                this.f123844a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                cp.a(this.f123844a.f123843b);
            }
        }

        @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
        public final void a(String[] strArr, int[] iArr) {
            l.b(iArr, "");
            if (iArr.length != 0 && iArr[0] == -1 && !androidx.core.app.a.a(this.f123842a, strArr[0])) {
                bt.a(this.f123843b, null, new DialogInterface$OnClickListenerC3207a(this)).show();
            }
        }
    }

    public static final Uri a(String str, Context context) {
        l.d(str, "");
        l.d(context, "");
        Uri a2 = cr.a(context, new File(str));
        l.b(a2, "");
        return a2;
    }

    public static final String a(String str, String str2, com.ss.android.ugc.aweme.sharer.b bVar) {
        l.d(str, "");
        l.d(str2, "");
        l.d(bVar, "");
        return e.a(str2, str, bVar.a());
    }

    public static final n<String> b(String str, String str2, com.ss.android.ugc.aweme.sharer.b bVar) {
        n<String> nVar;
        l.d(str, "");
        l.d(str2, "");
        l.d(bVar, "");
        String a2 = bVar.a();
        l.d(str2, "");
        l.d(a2, "");
        if (in.d() || str == null || str.length() == 0) {
            nVar = n.a((q) new e.b(str));
        } else {
            String a3 = ad.a(str, a2);
            if (TextUtils.isEmpty(a3)) {
                nVar = null;
            } else {
                nVar = ah.f123353b.a(str2, a2, a3);
            }
        }
        l.b(nVar, "");
        return nVar;
    }
}
