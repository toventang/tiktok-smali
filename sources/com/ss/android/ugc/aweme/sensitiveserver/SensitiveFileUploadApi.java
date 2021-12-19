package com.ss.android.ugc.aweme.sensitiveserver;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.q;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.v;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedString;

final class SensitiveFileUploadApi {

    /* renamed from: a  reason: collision with root package name */
    private static final String f121822a;

    /* renamed from: b  reason: collision with root package name */
    private static final SensitiveFileService f121823b;

    interface SensitiveFileService {
        static {
            Covode.recordClassIndex(79338);
        }

        @t(a = "/pssresource/external/upload")
        @q
        i<String> uploadSensitiveFile(@v(a = "file") TypedFile typedFile, @v(a = "app_id") Integer num, @v(a = "channel_key") TypedString typedString, @v(a = "ftype") Integer num2);
    }

    static {
        Covode.recordClassIndex(79337);
        String str = "https://" + d.f34604k.f34586a;
        f121822a = str;
        f121823b = (SensitiveFileService) RetrofitFactory.a().b(str).d().a(SensitiveFileService.class);
    }
}
