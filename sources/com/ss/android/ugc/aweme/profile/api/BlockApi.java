package com.ss.android.ugc.aweme.profile.api;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import com.ss.android.ugc.aweme.services.RetrofitService;

public final class BlockApi {

    /* renamed from: a  reason: collision with root package name */
    private static final BlockService f115981a = ((BlockService) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(BlockService.class));

    public interface BlockService {
        static {
            Covode.recordClassIndex(74795);
        }

        @h(a = "/aweme/v1/user/block/")
        b<BlockStruct> block(@z(a = "user_id") String str, @z(a = "sec_user_id") String str2, @z(a = "block_type") int i2, @z(a = "source") int i3);
    }

    static {
        Covode.recordClassIndex(74794);
    }

    public static BlockStruct a(String str, String str2, int i2, int i3) {
        return f115981a.block(str, str2, i2, i3).execute().f42630b;
    }

    public static void a(Handler handler, String str, String str2, int i2, int i3) {
        int i4;
        n a2 = n.a();
        b bVar = new b(str, str2, i2, i3);
        if (i3 == 1) {
            i4 = 32;
        } else {
            i4 = 31;
        }
        a2.a(handler, bVar, i4);
    }
}
