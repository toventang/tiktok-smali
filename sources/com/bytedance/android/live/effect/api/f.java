package com.bytedance.android.live.effect.api;

import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.covode.number.Covode;
import java.util.List;

public interface f {

    public interface a {
        static {
            Covode.recordClassIndex(4918);
        }

        void a(int i2, boolean z, boolean z2);

        void a(FilterModel filterModel, float f2);
    }

    public interface b {
        static {
            Covode.recordClassIndex(4919);
        }

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(4917);
    }

    float a(int i2);

    List<FilterModel> a();

    void a(a aVar);

    void a(b bVar);

    void a(FilterModel filterModel);

    void b();

    void b(int i2);

    void b(a aVar);

    void b(b bVar);

    boolean b(FilterModel filterModel);

    boolean c();

    boolean c(FilterModel filterModel);

    float d(FilterModel filterModel);
}
