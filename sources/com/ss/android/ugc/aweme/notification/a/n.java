package com.ss.android.ugc.aweme.notification.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.a.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class n extends c {
    static {
        Covode.recordClassIndex(72717);
    }

    public static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f113107a;

        static {
            Covode.recordClassIndex(72718);
        }

        @Override // com.ss.android.ugc.aweme.notification.a.f
        public final String c() {
            return "";
        }

        @Override // com.ss.android.ugc.aweme.notification.a.f
        public final String b() {
            return f.a.a();
        }

        @Override // com.ss.android.ugc.aweme.notification.a.f
        public final String a() {
            String string = d.a().getString(R.string.ezo);
            l.b(string, "");
            return string;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(n nVar) {
            this.f113107a = nVar;
        }

        @Override // com.ss.android.ugc.aweme.notification.a.f
        public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
            l.d(viewGroup, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.kt, viewGroup, false);
            l.b(a2, "");
            return new i(a2, this.f113107a.b());
        }

        @Override // com.ss.android.ugc.aweme.notification.a.f
        public final List<BaseNotice> a(List<BaseNotice> list) {
            l.d(list, "");
            ArrayList arrayList = new ArrayList();
            for (BaseNotice baseNotice : list) {
                if (baseNotice.promoteNotice != null) {
                    arrayList.add(baseNotice);
                } else if (baseNotice.templateNotice != null) {
                    arrayList.add(baseNotice);
                }
            }
            return arrayList;
        }

        @Override // com.ss.android.ugc.aweme.notification.a.f
        public final void a(RecyclerView.ViewHolder viewHolder, BaseNotice baseNotice, int i2, HashMap<String, BaseNotice> hashMap) {
            l.d(viewHolder, "");
            l.d(baseNotice, "");
            l.d(hashMap, "");
            if (viewHolder instanceof i) {
                ((i) viewHolder).a(baseNotice);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.a.c
    public final f a() {
        return new a(this);
    }
}
