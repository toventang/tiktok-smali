package com.bytedance.jedi.ext.adapter.a.a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

public interface m {
    static {
        Covode.recordClassIndex(24395);
    }

    RecyclerView.ViewHolder a(ViewGroup viewGroup);

    void a(int i2);

    void a(RecyclerView.ViewHolder viewHolder);

    void a(boolean z);

    boolean a();

    RecyclerView.ViewHolder b();

    void d();

    int e();

    boolean g();

    public static final class a {
        static {
            Covode.recordClassIndex(24396);
        }

        public static void a(m mVar) {
            RecyclerView.ViewHolder b2 = mVar.b();
            if (b2 != null) {
                b2.setIsRecyclable(false);
            }
            mVar.a((RecyclerView.ViewHolder) null);
            mVar.a(false);
            mVar.a(mVar.e() + 1);
        }
    }
}
