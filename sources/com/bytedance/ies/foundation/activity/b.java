package com.bytedance.ies.foundation.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public interface b {

    public static final class a {
        static {
            Covode.recordClassIndex(20078);
        }

        public static void a(a aVar, Configuration configuration) {
            l.d(aVar, "");
            l.d(configuration, "");
        }

        public static void a(a aVar, Bundle bundle) {
            l.d(aVar, "");
            l.d(bundle, "");
        }

        public static void b(a aVar, Bundle bundle) {
            l.d(aVar, "");
            l.d(bundle, "");
        }

        public static void c(a aVar, Bundle bundle) {
            l.d(aVar, "");
            l.d(bundle, "");
        }
    }

    static {
        Covode.recordClassIndex(20077);
    }

    Context a(Context context);

    Resources a(Resources resources);

    void a();

    void a(int i2, int i3, Intent intent);

    void a(int i2, Intent intent);

    void a(Activity activity);

    void a(Bundle bundle);

    void a(a aVar);

    void a(a aVar, Configuration configuration);

    void a(a aVar, Bundle bundle);

    void a(a aVar, boolean z);

    boolean a(int i2, KeyEvent keyEvent);

    void b(Activity activity);

    void b(a aVar);

    void b(a aVar, Bundle bundle);

    void c(Activity activity);

    void c(a aVar);

    void c(a aVar, Bundle bundle);

    void d(a aVar);

    void d(a aVar, Bundle bundle);

    void e(a aVar);

    void f(a aVar);

    void g(a aVar);

    void h(a aVar);

    void i(a aVar);

    void j(a aVar);

    void k(a aVar);

    void l(a aVar);

    void m(a aVar);

    void n(a aVar);

    void o(a aVar);

    void p(a aVar);

    void q(a aVar);

    void r(a aVar);
}
