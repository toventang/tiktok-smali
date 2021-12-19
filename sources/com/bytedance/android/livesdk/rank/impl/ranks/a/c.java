package com.bytedance.android.livesdk.rank.impl.ranks.a;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.rank.impl.api.model.RankPage;
import com.bytedance.android.livesdk.rank.impl.api.model.RankResponse;
import com.bytedance.android.livesdk.rank.impl.api.model.WeeklyRankRegionInfo;
import com.bytedance.android.livesdk.rank.impl.f.m;
import com.bytedance.covode.number.Covode;
import h.z;
import java.util.Map;

public final class c {

    public interface a {
        static {
            Covode.recordClassIndex(12321);
        }

        void a();

        void a(int i2, Fragment fragment, h.f.a.b<? super RankPage, z> bVar);

        void a(b bVar);

        void b();

        Map<Integer, m> c();

        void d();

        boolean e();

        int f();

        WeeklyRankRegionInfo g();
    }

    public interface b {
        static {
            Covode.recordClassIndex(12322);
        }

        void a();

        void a(RankResponse rankResponse);

        void b();

        void c();

        void d();
    }

    static {
        Covode.recordClassIndex(12320);
    }
}
