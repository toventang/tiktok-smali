package com.ss.android.ugc.aweme.comment.m;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import h.a.ag;
import h.f.b.l;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static int f72106c;

    /* renamed from: d  reason: collision with root package name */
    public static long f72107d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f72108e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, String> f72109a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public long f72110b;

    static {
        Covode.recordClassIndex(44286);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44287);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(String str, String str2, long j2, int i2, String str3, String str4) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("unexpectedType", String.valueOf(i2));
                HashMap hashMap2 = new HashMap();
                if (str != null) {
                    if (str.length() != 0) {
                        hashMap2.put("MethodName", str);
                    }
                }
                if (!(str2 == null || str2.length() == 0)) {
                    hashMap2.put("GroupId", str2);
                }
                hashMap2.put("expectedCount", String.valueOf(j2));
                if (str3.length() > 0) {
                    hashMap2.put("errorType", str3);
                }
                if (str4.length() > 0) {
                    hashMap2.put("errorDescription", str4);
                }
                b.a("aweme_comment_list_unexpected", new JSONObject(ag.c(hashMap)), (JSONObject) null, new JSONObject(ag.c(hashMap2)));
            } catch (Throwable unused) {
            }
        }
    }

    public final void a() {
        this.f72109a.clear();
        long currentTimeMillis = System.currentTimeMillis();
        this.f72110b = currentTimeMillis;
        this.f72109a.put("TimeStamp", String.valueOf(currentTimeMillis));
    }

    public final void a(BaseResponse baseResponse) {
        LogPbBean logPbBean;
        String imprId;
        l.d(baseResponse, "");
        if (!(!(baseResponse instanceof BaseCommentResponse) || (logPbBean = ((BaseCommentResponse) baseResponse).logPd) == null || (imprId = logPbBean.getImprId()) == null)) {
            this.f72109a.put("LogID", imprId);
        }
        this.f72109a.put("ErrorCode", String.valueOf(baseResponse.status_code));
    }

    public static final void a(int i2, long j2) {
        f72106c = i2;
        f72107d = j2;
    }
}
