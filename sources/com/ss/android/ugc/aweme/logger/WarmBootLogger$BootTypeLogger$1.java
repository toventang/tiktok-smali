package com.ss.android.ugc.aweme.logger;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.common.c.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.List;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class WarmBootLogger$BootTypeLogger$1 implements w {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f108999a;

    static {
        Covode.recordClassIndex(69796);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
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

    WarmBootLogger$BootTypeLogger$1(int i2) {
        this.f108999a = i2;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        int i2 = this.f108999a;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(StringSet.type, i2);
            a.a("main_boot_type", jSONObject);
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        c.f109015c = 2;
                    } else if (i2 != 4) {
                        if (i2 != 5) {
                            c.f109015c = -1;
                        }
                    }
                    com.ss.android.ugc.i.a.a().a(c.f109015c);
                }
                c.f109015c = 1;
                com.ss.android.ugc.i.a.a().a(c.f109015c);
            }
            c.f109015c = 0;
            com.ss.android.ugc.i.a.a().a(c.f109015c);
        } catch (Exception unused) {
        }
    }
}
