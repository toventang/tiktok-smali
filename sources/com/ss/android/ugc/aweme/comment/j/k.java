package com.ss.android.ugc.aweme.comment.j;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.comment.m.d;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lancet.j;

public final class k extends b<i> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f72051a;

    static {
        Covode.recordClassIndex(44258);
    }

    private static boolean f() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public final long d() {
        if (this.f76396h == null) {
            return 0;
        }
        return ((i) this.f76396h).b();
    }

    public final String e() {
        if (this.f76396h == null) {
            return "";
        }
        return ((i) this.f76396h).f72035d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.common.e.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.j.k.c():void");
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public final boolean a(Object... objArr) {
        return super.a(objArr);
    }

    private static String a(i iVar) {
        if (iVar == null || iVar.mData == null || iVar.mData.logPd == null) {
            return null;
        }
        return iVar.mData.logPd.getImprId();
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.common.e.b
    public final void a_(Exception exc) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("CommentFetchPresenter: onFailed() => aid = ");
        String str3 = null;
        if (this.f76396h != null) {
            str3 = ((i) this.f76396h).f72033b;
        }
        a.b(6, "CommentLog", sb.append(str3).append(" logPb: impr_id = ").append(a((i) this.f76396h)).append(" exceptionType = ").append(com.bytedance.ies.b.a.a.a(d.a(), exc)).append(" ").append(exc.getMessage()).toString());
        com.bytedance.a.b.a(UGCMonitor.EVENT_COMMENT, "info", com.bytedance.ies.b.a.a.a(d.a(), exc));
        if (this.f76396h != null && ((i) this.f76396h).a()) {
            d.a();
            if (!j.f107229h || !j.b() || j.c()) {
                j.f107229h = f();
            }
            if (j.f107229h) {
                String str4 = ((i) this.f76396h).f72034c;
                String str5 = ((i) this.f76396h).f72033b;
                long j2 = ((i) this.f76396h).f72037f;
                String str6 = "";
                Class<?> cls = exc.getClass();
                if (cls == null || (str = cls.getName()) == null) {
                    str = str6;
                }
                Throwable cause = exc.getCause();
                if (!((cause == null || (str2 = cause.getMessage()) == null) && (str2 = exc.getMessage()) == null)) {
                    str6 = str2;
                }
                d.a.a(str4, str5, j2, 201, str, str6);
            }
        }
        this.f72051a = true;
        super.a_(exc);
        exc.printStackTrace();
    }
}
