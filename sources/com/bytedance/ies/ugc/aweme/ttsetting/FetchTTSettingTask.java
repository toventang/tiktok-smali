package com.bytedance.ies.ugc.aweme.ttsetting;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.ttsetting.TTSettingDataApi;
import com.bytedance.ies.ugc.aweme.ttsetting.a;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.o;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.services.RetrofitService;
import h.f.b.l;
import h.f.b.z;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class FetchTTSettingTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static final a f35184a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final String f35185b;

    static {
        Covode.recordClassIndex(21082);
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
        return x.a();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return o.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return o.a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21083);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    public FetchTTSettingTask(String str) {
        l.c(str, "");
        this.f35185b = str;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        l.c(context, "");
        if (System.currentTimeMillis() - Keva.getRepo("TTSettingData").getLong("last_get_setting_time", 0) > TimeUnit.HOURS.toMillis(6)) {
            String str = this.f35185b;
            l.c(str, "");
            IRetrofit createNewRetrofit = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(str);
            z.e eVar = new z.e();
            eVar.element = "";
            ((TTSettingDataApi.SettingApi) createNewRetrofit.create(TTSettingDataApi.SettingApi.class)).getResponse(!TextUtils.isEmpty(Keva.getRepo("TTSettingData").getString("settingData", "")), 1, 1).enqueue(new a.C0797a(eVar));
            return;
        }
        a.a();
    }
}
