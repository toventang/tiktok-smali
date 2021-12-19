package com.ss.android.ugc.aweme.kids.setting;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import h.f.b.l;

public interface o {
    static {
        Covode.recordClassIndex(68507);
    }

    CommonItemView a(View view);

    String a();

    void a(CommonItemView commonItemView);

    void a(String str, String str2, Boolean bool);

    Activity b();

    public static final class a {
        static {
            Covode.recordClassIndex(68508);
        }

        public static /* synthetic */ void a(o oVar, String str, String str2, Boolean bool, int i2) {
            if ((i2 & 2) != 0) {
                str2 = null;
            }
            if ((i2 & 4) != 0) {
                bool = null;
            }
            oVar.a(str, str2, bool);
        }

        public static void a(o oVar, String str, String str2, Boolean bool, Boolean bool2) {
            l.d(str, "");
            IBulletService f2 = BulletService.f();
            Activity b2 = oVar.b();
            Bundle bundle = new Bundle();
            if (str2 != null) {
                bundle.putString("title", str2);
            }
            if (bool != null) {
                bool.booleanValue();
                bundle.putBoolean("hide_nav_bar", bool.booleanValue());
            }
            f2.a(b2, str, bundle);
        }
    }
}
