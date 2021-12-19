package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.runtime.behavior.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f95416a = new a((byte) 0);

    static {
        Covode.recordClassIndex(60429);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final String a() {
        return "abnor_im";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60430);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final long b() {
        return TimeUnit.HOURS.toMillis(2);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final String c() {
        long currentTimeMillis = System.currentTimeMillis() - b();
        List<c> a2 = com.ss.android.ugc.aweme.feedback.runtime.behavior.b.a("message_send_fail", currentTimeMillis);
        List<c> a3 = com.ss.android.ugc.aweme.feedback.runtime.behavior.b.a("message_self_visiable", currentTimeMillis);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a2);
        arrayList.addAll(a3);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(((c) arrayList.get(i2)).f120725d);
            if (i2 != arrayList.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final boolean a(String str) {
        l.d(str, "");
        int hashCode = str.hashCode();
        if (hashCode != -1082517890) {
            if (hashCode == 171840317 && str.equals("message_send_fail")) {
                return true;
            }
            return false;
        } else if (str.equals("message_self_visiable")) {
            return true;
        } else {
            return false;
        }
    }
}
