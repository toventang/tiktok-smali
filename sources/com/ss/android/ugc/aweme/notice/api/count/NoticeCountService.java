package com.ss.android.ugc.aweme.notice.api.count;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.api.bean.c;
import java.util.List;
import java.util.Map;

public interface NoticeCountService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f112703a = a.f112704a;

    static {
        Covode.recordClassIndex(72432);
    }

    int a(int i2);

    int a(String str);

    void a();

    void a(int i2, int i3);

    void a(Message message);

    void a(c cVar, int[] iArr);

    void a(List<String> list, String str);

    void a(boolean z);

    void a(boolean z, int i2);

    int b(int i2);

    void b();

    Map<Integer, Integer> c();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f112704a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(72433);
        }
    }
}
