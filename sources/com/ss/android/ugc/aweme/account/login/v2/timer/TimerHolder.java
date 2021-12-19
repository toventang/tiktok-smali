package com.ss.android.ugc.aweme.account.login.v2.timer;

import android.app.Application;
import android.util.SparseArray;
import androidx.fragment.app.e;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.r;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class TimerHolder extends AndroidViewModel {

    /* renamed from: c  reason: collision with root package name */
    public static final a f64742c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final r<SparseArray<Map<String, b>>> f64743b = new r<>();

    static {
        Covode.recordClassIndex(39794);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39795);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static b a(e eVar, String str, j jVar) {
            SparseArray<Map<String, b>> value;
            Map<String, b> map;
            l.d(str, "");
            l.d(jVar, "");
            if (eVar == null || (value = ((TimerHolder) ae.a(eVar, (ad.b) null).a(TimerHolder.class)).f64743b.getValue()) == null || (map = value.get(jVar.getValue())) == null) {
                return null;
            }
            return map.get(str);
        }

        public static void a(e eVar, String str, b bVar, j jVar) {
            l.d(str, "");
            l.d(bVar, "");
            l.d(jVar, "");
            if (eVar != null) {
                r<SparseArray<Map<String, b>>> rVar = ((TimerHolder) ae.a(eVar, (ad.b) null).a(TimerHolder.class)).f64743b;
                SparseArray<Map<String, b>> value = rVar.getValue();
                if (value == null) {
                    value = new SparseArray<>();
                }
                Map<String, b> map = value.get(jVar.getValue());
                if (map == null) {
                    map = new LinkedHashMap<>();
                }
                map.put(str, bVar);
                value.put(jVar.getValue(), map);
                rVar.postValue(value);
            }
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public com.ss.android.ugc.aweme.account.login.ui.a f64744a;

        static {
            Covode.recordClassIndex(39796);
        }

        public b(com.ss.android.ugc.aweme.account.login.ui.a aVar) {
            l.d(aVar, "");
            this.f64744a = aVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimerHolder(Application application) {
        super(application);
        l.d(application, "");
    }
}
