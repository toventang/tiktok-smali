package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.experiment.gf;
import com.ss.android.ugc.aweme.experiment.gu;
import com.ss.android.ugc.aweme.experiment.h;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public final class ApiUserInitTask implements w {
    static {
        Covode.recordClassIndex(68917);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class a implements com.bytedance.a.a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f107726a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(68918);
        }

        @Override // com.bytedance.a.a
        public final void a(String str, JSONObject jSONObject) {
            com.ss.android.common.c.a.a(str, jSONObject);
            String.valueOf(jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        try {
            boolean z = true;
            Object a2 = b.a().a(true, "api_user_config", h.class);
            l.b(a2, "");
            h hVar = (h) a2;
            Integer num = null;
            (hVar != null ? Integer.valueOf(hVar.f90192b) : null).intValue();
            if (hVar != null) {
                num = Integer.valueOf(hVar.f90191a);
            }
            num.intValue();
            HashMap hashMap = new HashMap();
            if (hVar != null) {
                List<gf> list = hVar.f90193c;
                if (list != null) {
                    for (T t : list) {
                        if (t != null) {
                            String str = t.f90137a;
                            List<gu> list2 = t.f90138b;
                            if (list2 != null) {
                                for (T t2 : list2) {
                                    hashMap.put(l.a(str, (Object) t2.f90167a), Integer.valueOf(t2.f90168b));
                                }
                            }
                        }
                    }
                }
                int intValue = Integer.valueOf(hVar.f90192b).intValue();
                int intValue2 = Integer.valueOf(hVar.f90191a).intValue();
                a aVar = a.f107726a;
                if (intValue != 1) {
                    z = false;
                }
                com.bytedance.a.b.f6417b = z;
                com.bytedance.a.b.f6418c = hashMap;
                com.bytedance.a.b.f6416a = (long) intValue2;
                com.bytedance.a.b.f6419d = aVar;
            }
        } catch (Throwable unused) {
        }
    }
}
