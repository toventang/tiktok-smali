package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.b;
import com.ss.android.ugc.aweme.runtime.behavior.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class n extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f95453a = new a((byte) 0);

    static {
        Covode.recordClassIndex(60471);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60472);
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

    public final List<AwemeToolFeedbackInfo> d() {
        long currentTimeMillis = System.currentTimeMillis() - b();
        List<c> a2 = b.a("record_start", currentTimeMillis);
        List<c> a3 = b.a("record_error", currentTimeMillis);
        List<c> a4 = b.a("record_success", currentTimeMillis);
        List<c> a5 = b.a("camera_start", currentTimeMillis);
        List<c> a6 = b.a("camera_error", currentTimeMillis);
        List<c> a7 = b.a("camera_success", currentTimeMillis);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = a3.iterator();
        while (it.hasNext()) {
            arrayList2.add(new AwemeToolFeedbackECode(it.next().f120725d, null, 2, null));
        }
        arrayList.add(new AwemeToolFeedbackInfo("record", a2.size(), a4.size(), 0, arrayList2));
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it2 = a6.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new AwemeToolFeedbackECode(it2.next().f120725d, null, 2, null));
        }
        arrayList.add(new AwemeToolFeedbackInfo("camera start", a5.size(), a7.size(), 0, arrayList3));
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final boolean a(String str) {
        l.d(str, "");
        switch (str.hashCode()) {
            case -2122358630:
                if (str.equals("record_error")) {
                    return true;
                }
                return false;
            case -2109385996:
                if (str.equals("record_start")) {
                    return true;
                }
                return false;
            case -785402647:
                if (str.equals("camera_success")) {
                    return true;
                }
                return false;
            case -603764626:
                if (str.equals("camera_error")) {
                    return true;
                }
                return false;
            case -590791992:
                if (str.equals("camera_start")) {
                    return true;
                }
                return false;
            case 134640149:
                if (str.equals("record_success")) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
}
