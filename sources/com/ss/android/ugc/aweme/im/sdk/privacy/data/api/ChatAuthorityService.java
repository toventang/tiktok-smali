package com.ss.android.ugc.aweme.im.sdk.privacy.data.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.ab;
import l.b.f;
import l.b.t;

public interface ChatAuthorityService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f102935a = a.f102937b;

    static {
        Covode.recordClassIndex(65987);
    }

    @f(a = "/aweme/v1/im/set/chatpriv/")
    ab<BaseResponse> setChatAuthority(@t(a = "val") int i2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChatAuthorityService f102936a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f102937b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(65988);
        }
    }
}
