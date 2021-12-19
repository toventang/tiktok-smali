package com.ss.android.ugc.aweme.ecommerce.router;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;
import java.util.Set;

public final class o implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f87195a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private h.f.a.a<? extends m> f87196b;

    /* renamed from: c  reason: collision with root package name */
    private h.f.a.a<? extends m> f87197c;

    static {
        Covode.recordClassIndex(54718);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54719);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.router.h
    public final h a(h.f.a.a<? extends m> aVar) {
        l.d(aVar, "");
        this.f87196b = aVar;
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.router.h
    public final h b(h.f.a.a<? extends m> aVar) {
        l.d(aVar, "");
        this.f87197c = aVar;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        if ("echybrid".equals(r3.getAuthority()) == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        if ("webview".equals(r3.getAuthority()) != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        r5 = new android.net.Uri.Builder().scheme("bullet").encodedAuthority("bullet");
        h.f.b.l.b(r3, "");
        r0 = r3.getQueryParameterNames();
        h.f.b.l.b(r0, "");
        r4 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008c, code lost:
        if (r4.hasNext() == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        r1 = r4.next();
        r5.appendQueryParameter(r1, r3.getQueryParameter(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b4, code lost:
        if ("bullet".equals(r3.getAuthority()) == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b8, code lost:
        r3 = r5.build();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bc, code lost:
        r1 = r3.getQueryParameter("url");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c2, code lost:
        if (r1 == null) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c8, code lost:
        if (r1.length() != 0) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cc, code lost:
        h.f.b.l.b(r3, "");
        r3 = a(r3, h.a.n.a("url"));
        r5 = android.net.Uri.parse(r1);
        h.f.b.l.b(r5, "");
        r4 = a(r5, null);
        r0 = r9.getQueryParameterNames();
        h.f.b.l.b(r0, "");
        r2 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f1, code lost:
        if (r2.hasNext() == false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f3, code lost:
        r1 = r2.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fd, code lost:
        if ("fallback".equals(r1) != false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0107, code lost:
        if (r5.getQueryParameterNames().contains(r1) != false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0109, code lost:
        r4.appendQueryParameter(r1, r9.getQueryParameter(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0111, code lost:
        r3.appendQueryParameter("url", r4.toString());
        r1 = r8.f87197c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011a, code lost:
        if (r1 != null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011c, code lost:
        h.f.b.l.a("fallbackStrategyFactory");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0121, code lost:
        r1 = (com.ss.android.ugc.aweme.ecommerce.router.m) r1.invoke();
        r1.a(com.ss.android.ugc.aweme.ecommerce.router.m.b.FALLBACK);
        r1.f87185i = r3.build();
        r1.f87184h = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0134, code lost:
        return r1;
     */
    @Override // com.ss.android.ugc.aweme.ecommerce.router.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.ecommerce.router.m a(android.net.Uri r9) {
        /*
        // Method dump skipped, instructions count: 309
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.router.o.a(android.net.Uri):com.ss.android.ugc.aweme.ecommerce.router.m");
    }

    /* access modifiers changed from: private */
    public static Uri.Builder a(Uri uri, List<String> list) {
        boolean z;
        Uri.Builder encodedPath = new Uri.Builder().scheme(uri.getScheme()).encodedAuthority(uri.getAuthority()).encodedPath(uri.getPath());
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            l.b(queryParameterNames, "");
            for (T t : queryParameterNames) {
                encodedPath.appendQueryParameter(t, uri.getQueryParameter(t));
            }
        } else {
            Set<String> queryParameterNames2 = uri.getQueryParameterNames();
            l.b(queryParameterNames2, "");
            for (T t2 : queryParameterNames2) {
                if (!list.contains(t2)) {
                    encodedPath.appendQueryParameter(t2, uri.getQueryParameter(t2));
                }
            }
        }
        l.b(encodedPath, "");
        return encodedPath;
    }
}
