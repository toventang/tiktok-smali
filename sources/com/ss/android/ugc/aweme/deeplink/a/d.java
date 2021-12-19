package com.ss.android.ugc.aweme.deeplink.a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.deeplink.d.c;
import com.ss.android.ugc.aweme.deeplink.r;

public final class d extends a {

    /* renamed from: a  reason: collision with root package name */
    private Uri f79431a;

    /* renamed from: b  reason: collision with root package name */
    private String f79432b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f79433c;

    /* renamed from: d  reason: collision with root package name */
    private Context f79434d;

    static {
        Covode.recordClassIndex(49331);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x009f, code lost:
        if (r6 != null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if ((!"link.e.tiktok.com".equals(r6.getHost())) != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0061, code lost:
        if (r6 != null) goto L_0x0063;
     */
    @Override // com.ss.android.ugc.aweme.deeplink.a.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.net.Uri a(final android.net.Uri r6) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.deeplink.a.d.a(android.net.Uri):android.net.Uri");
    }

    public d(Context context, boolean z) {
        this.f79434d = context;
        this.f79433c = z;
    }

    public final void a(Uri uri, String str) {
        try {
            String queryParameter = uri.getQueryParameter("backurl");
            Uri parse = Uri.parse(str);
            this.f79432b = parse.getQueryParameter("user_id");
            if (!TextUtils.isEmpty(queryParameter)) {
                Uri.Builder buildUpon = Uri.parse(parse.toString()).buildUpon();
                buildUpon.appendQueryParameter("backurl", queryParameter);
                parse = buildUpon.build();
            }
            String[] a2 = r.a.a();
            int i2 = 0;
            while (true) {
                if (!a2[i2].equals(parse.getHost())) {
                    i2++;
                    if (i2 >= 34) {
                        break;
                    }
                } else {
                    this.f79431a = new b().a(parse);
                    break;
                }
            }
            if (this.f79431a == null) {
                this.f79431a = new c().a(parse);
            }
        } catch (Exception e2) {
            c.a("short_2_long", 2004, uri, "uri parse exception");
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.net.Uri r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.deeplink.a.d.b(android.net.Uri, java.lang.String):void");
    }
}
