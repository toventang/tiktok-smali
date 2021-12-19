package com.ss.android.ugc.aweme.commercialize.track;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.log.a.a;
import h.f.a.m;
import h.f.b.l;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f75367a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(46509);
    }

    public static boolean a() {
        return b.a().a(true, "enable_tracker_sdk", false);
    }

    public static final class a implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f75368a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Long f75369b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f75370c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m f75371d;

        static {
            Covode.recordClassIndex(46510);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.track.e
        public final void a(String str, String str2, long j2) {
            l.d(str, "");
            l.d(str2, "");
            a.b a2 = com.ss.android.ugc.aweme.commercialize.log.a.a.a(str, str2, j2);
            a2.f74720f = "track_url";
            a2.f74715a = "track_ad";
            a.b a3 = a2.b(this.f75368a).a(this.f75369b);
            String str3 = this.f75370c;
            if (str3 == null) {
                str3 = "";
            }
            a.b c2 = a3.c(str3);
            m mVar = this.f75371d;
            if (mVar != null) {
                l.b(c2, "");
                mVar.invoke(c2, true);
            }
            c2.d();
        }

        a(String str, Long l2, String str2, m mVar) {
            this.f75368a = str;
            this.f75369b = l2;
            this.f75370c = str2;
            this.f75371d = mVar;
        }
    }

    public static void a(String str, UrlModel urlModel, Long l2, String str2, m<? super a.b, ? super Boolean, ? extends a.b> mVar) {
        List<String> list;
        l.d(str, "");
        if (urlModel != null) {
            list = urlModel.getUrlList();
        } else {
            list = null;
        }
        a(str, list, l2, str2, mVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r0 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.String r5, java.util.List<java.lang.String> r6, java.lang.Long r7, java.lang.String r8, h.f.a.m<? super com.ss.android.ugc.aweme.commercialize.log.a.a.b, ? super java.lang.Boolean, ? extends com.ss.android.ugc.aweme.commercialize.log.a.a.b> r9) {
        /*
            java.lang.String r0 = ""
            h.f.b.l.d(r5, r0)
            r4 = 1
            if (r6 == 0) goto L_0x000e
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x000f
        L_0x000e:
            return
        L_0x000f:
            r0 = 0
            r3 = 0
            if (r0 != 0) goto L_0x000e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            if (r0 == 0) goto L_0x000e
            r0.booleanValue()
            boolean r0 = a()
            if (r0 == 0) goto L_0x004e
            com.bytedance.android.a.a.d.b$a r2 = new com.bytedance.android.a.a.d.b$a
            r2.<init>()
            r2.f6637f = r5
            if (r7 == 0) goto L_0x004b
            long r0 = r7.longValue()
        L_0x002f:
            r2.f6632a = r0
            com.bytedance.android.a.a.d.b$a r0 = r2.a(r6)
            r0.f6635d = r8
            r0.f6633b = r4
            r0.f6636e = r3
            r0.f6639h = r4
            com.bytedance.android.a.a.d.b r1 = r0.a()
            com.ss.android.ugc.aweme.commercialize.track.h r0 = com.ss.android.ugc.aweme.commercialize.track.h.f75373b
            com.bytedance.android.a.a.d r0 = r0.a()
            r0.a(r1)
            return
        L_0x004b:
            r0 = 0
            goto L_0x002f
        L_0x004e:
            if (r6 != 0) goto L_0x0053
            h.f.b.l.b()
        L_0x0053:
            com.ss.android.ugc.aweme.commercialize.track.f$a r0 = new com.ss.android.ugc.aweme.commercialize.track.f$a
            r0.<init>(r5, r7, r8, r9)
            com.ss.android.ugc.aweme.commercialize.track.b.a(r0, r6)
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.track.f.a(java.lang.String, java.util.List, java.lang.Long, java.lang.String, h.f.a.m):void");
    }
}
