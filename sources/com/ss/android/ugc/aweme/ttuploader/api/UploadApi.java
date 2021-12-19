package com.ss.android.ugc.aweme.ttuploader.api;

import com.bytedance.covode.number.Covode;
import f.a.t;
import java.util.LinkedHashMap;
import l.b.d;
import l.b.e;
import l.b.o;

public interface UploadApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f141461a = a.f141462a;

    static {
        Covode.recordClassIndex(92387);
    }

    @o(a = "/aweme/v1/upload/authkey/")
    @e
    t<Object> refreshUploadConfig(@d LinkedHashMap<String, String> linkedHashMap);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f141462a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(92388);
        }
    }
}
