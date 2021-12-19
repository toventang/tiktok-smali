package com.ss.android.ugc.aweme.im.sdk.common.controller.utils.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ay;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CheckMessage;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.j;
import f.a.d.f;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f102406a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(65554);
    }

    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f102410a = new b();

        static {
            Covode.recordClassIndex(65556);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            HashMap hashMap = new HashMap();
            hashMap.put("error_msg", "report error");
            l.b(th, "");
            hashMap.put("error_desc", th);
            c.b("send_msg_error", hashMap);
            com.ss.android.ugc.aweme.framework.a.a.a((Exception) new RuntimeException(th));
        }
    }

    public static int a(Map<String, String> map) {
        int i2;
        try {
            i2 = ((CheckMessage) j.a(map.get("s:send_response_check_msg"), CheckMessage.class)).status_code;
            if (i2 != 0) {
                return i2;
            }
            String str = map.get("s:err_code");
            if (str == null) {
                return i2;
            }
            try {
                if (!TextUtils.isEmpty(str)) {
                    return Integer.parseInt(str);
                }
                return i2;
            } catch (Exception unused) {
                return i2;
            }
        } catch (Exception unused2) {
            i2 = 0;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.d.a$a  reason: collision with other inner class name */
    public static final class C2568a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f102407a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f102408b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ay f102409c;

        static {
            Covode.recordClassIndex(65555);
        }

        public C2568a(boolean z, long j2, ay ayVar) {
            this.f102407a = z;
            this.f102408b = j2;
            this.f102409c = ayVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:123:0x02c3, code lost:
            if (r3.put("sdk_metrics_valid", r17) == null) goto L_0x02c5;
         */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x0235  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x024b  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x025b  */
        /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x01ab  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x01b6  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01bc  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01ce A[Catch:{ Exception -> 0x0215 }] */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x01da A[Catch:{ Exception -> 0x0215 }] */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x01e4 A[Catch:{ Exception -> 0x0215 }] */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r28) {
            /*
            // Method dump skipped, instructions count: 727
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.d.a.C2568a.accept(java.lang.Object):void");
        }
    }
}
