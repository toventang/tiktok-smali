package com.ss.android.ugc.aweme.feed.helper;

import android.text.TextUtils;
import androidx.c.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.app.c.c;
import com.ss.android.ugc.aweme.experiment.cn;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Map;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final t f93424a = new t();

    /* renamed from: b  reason: collision with root package name */
    private static e<String, o> f93425b = new e<>(com.bytedance.ies.abmock.b.a().a(true, "real_time_report_max_nums", 10));

    /* renamed from: c  reason: collision with root package name */
    private static final h f93426c = i.a((h.f.a.a) b.f93428a);

    private t() {
    }

    public static final boolean a() {
        if (com.bytedance.ies.abmock.b.a().a(false, "real_time_report_of_new_user", 0) == 1) {
            return true;
        }
        return false;
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f93428a = new b();

        static {
            Covode.recordClassIndex(59196);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            String deviceId = DeviceRegisterManager.getDeviceId();
            boolean z = true;
            if (!TextUtils.isEmpty(deviceId) && !TextUtils.equals(deviceId, "0") && com.bytedance.ies.abmock.b.a().a(false, "real_time_report_of_new_user", 0) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(59194);
    }

    private static boolean c() {
        if (cn.f89703a) {
            return ((Boolean) f93426c.getValue()).booleanValue();
        }
        String deviceId = DeviceRegisterManager.getDeviceId();
        if (TextUtils.isEmpty(deviceId) || TextUtils.equals(deviceId, "0") || com.bytedance.ies.abmock.b.a().a(false, "real_time_report_of_new_user", 0) == 1) {
            return true;
        }
        return false;
    }

    public static final String b() {
        p a2;
        if (f93425b.b() == 0) {
            return null;
        }
        Map<String, o> c2 = f93425b.c();
        l.b(c2, "");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, o> entry : c2.entrySet()) {
            int a3 = c.a(entry.getValue().f93414e);
            if (!(a3 == -1 || (a2 = v.a(Integer.valueOf(a3), entry.getValue())) == null)) {
                arrayList.add(a2);
            }
        }
        return n.a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, a.f93427a, 30);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<p<? extends Integer, ? extends o>, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f93427a = new a();

        static {
            Covode.recordClassIndex(59195);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(p<? extends Integer, ? extends o> pVar) {
            return a(pVar);
        }

        private static CharSequence a(p<Integer, o> pVar) {
            l.d(pVar, "");
            try {
                o second = pVar.getSecond();
                return second.f93411b + '|' + second.f93412c + '|' + ((int) (second.f93413d / 1000)) + '|' + pVar.getFirst().intValue() + '|' + second.f93410a;
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
                return "";
            }
        }
    }

    public static final void a(o oVar) {
        l.d(oVar, "");
        if (c()) {
            f93425b.a(oVar.f93411b + oVar.f93412c, oVar);
        }
    }
}
