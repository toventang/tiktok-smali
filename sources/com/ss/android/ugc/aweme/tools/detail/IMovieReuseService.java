package com.ss.android.ugc.aweme.tools.detail;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.detail.operators.aa;

public interface IMovieReuseService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f139291a = a.f139293b;

    public interface b {
        static {
            Covode.recordClassIndex(91069);
        }

        void a(int i2, Boolean bool);
    }

    static {
        Covode.recordClassIndex(91067);
    }

    aa a(com.ss.android.ugc.aweme.common.e.a<?, ?> aVar);

    void a(Context context, Integer num, String str, Integer num2, String str2, String str3);

    void a(Fragment fragment, String str);

    void a(String str, Activity activity, b bVar);

    void b(Fragment fragment, String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f139292a = 2;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f139293b = new a();

        /* renamed from: c  reason: collision with root package name */
        private static final int f139294c = 1;

        /* renamed from: d  reason: collision with root package name */
        private static final int f139295d = 3;

        private a() {
        }

        static {
            Covode.recordClassIndex(91068);
        }
    }
}
