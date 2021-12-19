package com.ss.android.ugc.aweme.notification.a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public interface f {
    static {
        Covode.recordClassIndex(72692);
    }

    RecyclerView.ViewHolder a(ViewGroup viewGroup);

    String a();

    List<BaseNotice> a(List<BaseNotice> list);

    void a(RecyclerView.ViewHolder viewHolder, BaseNotice baseNotice, int i2, HashMap<String, BaseNotice> hashMap);

    String b();

    String c();

    public static final class a {
        static {
            Covode.recordClassIndex(72693);
        }

        public static String a() {
            String string = d.a().getString(R.string.cwz);
            l.b(string, "");
            return string;
        }
    }
}
