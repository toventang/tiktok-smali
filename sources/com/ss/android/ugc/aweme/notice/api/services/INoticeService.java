package com.ss.android.ugc.aweme.notice.api.services;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;

public interface INoticeService {
    static {
        Covode.recordClassIndex(72486);
    }

    <T extends com.ss.android.ugc.aweme.base.f.a> Class<? extends T> a();

    String a(User user);

    void a(int i2);

    void a(Context context);

    void a(Bundle bundle, int i2);

    void a(Handler handler, String str);

    boolean a(Context context, User user, String str, String str2, boolean z);

    boolean a(BaseResponse baseResponse);

    a b();

    void b(Handler handler, String str);

    boolean b(BaseResponse baseResponse);

    void c();

    void d();

    int e();

    public static final class a {
        static {
            Covode.recordClassIndex(72487);
        }

        public static /* synthetic */ boolean a(INoticeService iNoticeService, Context context, User user, String str, String str2, boolean z, int i2) {
            if ((i2 & 4) != 0) {
                str = "notification_page";
            }
            if ((i2 & 8) != 0) {
                str2 = "button";
            }
            return iNoticeService.a(context, user, str, str2, z);
        }
    }
}
