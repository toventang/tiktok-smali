package com.ss.android.ugc.aweme.base.ui.anchor;

import android.content.DialogInterface;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.crossplatform.b.d;
import com.ss.android.ugc.d.a.c;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public class f extends b implements i, j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f68352c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private String f68353d;

    static {
        Covode.recordClassIndex(42083);
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(161, new g(f.class, "onWebViewFinish", d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42084);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.f$a$a  reason: collision with other inner class name */
        public static final class DialogInterface$OnDismissListenerC1545a implements DialogInterface.OnDismissListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ long f68354a;

            static {
                Covode.recordClassIndex(42085);
            }

            public DialogInterface$OnDismissListenerC1545a(long j2) {
                this.f68354a = j2;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                c.a(new d(System.currentTimeMillis() - this.f68354a));
            }
        }

        public static String a(String str) {
            String str2;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> a2 = com.bytedance.frameworks.baselib.network.http.g.i.a(str, linkedHashMap);
            String str3 = (String) a2.first;
            if (str3 == null || !str3.equals("aweme://webDialog") || (str2 = (String) a2.second) == null || !str2.equals("/eventDetail")) {
                return null;
            }
            return (String) linkedHashMap.get("event_id");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
        if (r1 == null) goto L_0x0099;
     */
    @org.greenrobot.eventbus.r
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onWebViewFinish(com.ss.android.ugc.aweme.crossplatform.b.d r10) {
        /*
        // Method dump skipped, instructions count: 195
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.ui.anchor.f.onWebViewFinish(com.ss.android.ugc.aweme.crossplatform.b.d):void");
    }
}
