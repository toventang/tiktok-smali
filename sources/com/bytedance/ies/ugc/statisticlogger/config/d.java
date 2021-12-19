package com.bytedance.ies.ugc.statisticlogger.config;

import android.app.Application;
import com.bytedance.common.utility.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public final Application f35342a;

    public interface a {
        static {
            Covode.recordClassIndex(21162);
        }

        j a();
    }

    static {
        Covode.recordClassIndex(21161);
    }

    public abstract a a();

    public abstract boolean b();

    public d(Application application) {
        l.d(application, "");
        this.f35342a = application;
    }
}
