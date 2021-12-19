package com.ss.android.ugc.aweme.im.sdk.share.data.a;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.List;

public interface b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f103390d = a.f103391a;

    static {
        Covode.recordClassIndex(66253);
    }

    LiveData<String> a();

    void a(String str);

    LiveData<List<IMContact>> b();

    LiveData<List<IMContact>> c();

    void d();

    void e();

    void f();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f103391a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(66254);
        }
    }
}
