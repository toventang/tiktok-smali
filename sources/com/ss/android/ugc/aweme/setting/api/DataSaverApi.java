package com.ss.android.ugc.aweme.setting.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import l.b.c;
import l.b.e;
import l.b.o;

public interface DataSaverApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f122044a = a.f122046b;

    static {
        Covode.recordClassIndex(80009);
    }

    @o(a = "/aweme/v1/set/data-saver-setting/")
    @e
    i<BaseResponse> setDataSaverSetting(@c(a = "data_saver_setting") int i2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final DataSaverApi f122045a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f122046b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(80010);
            String str = Api.f66569d;
            l.b(str, "");
            f122045a = (DataSaverApi) com.bytedance.ies.ugc.aweme.network.ext.a.a().a(str).a(DataSaverApi.class);
        }
    }
}
