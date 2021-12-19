package com.ss.android.ugc.aweme.ecommerce.address.candinput;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.address.candinput.a.b;
import com.ss.android.ugc.aweme.ecommerce.address.candinput.a.c;
import com.ss.android.ugc.aweme.ecommerce.address.dto.d;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class a extends RecyclerView.a<com.ss.android.ugc.aweme.ecommerce.address.candinput.a.a> {

    /* renamed from: d  reason: collision with root package name */
    public static final C2013a f84288d = new C2013a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<d> f84289a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f84290b;

    /* renamed from: c  reason: collision with root package name */
    b f84291c;

    static {
        Covode.recordClassIndex(52554);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final long getItemId(int i2) {
        return (long) i2;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.address.candinput.a.a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.candinput.a$a  reason: collision with other inner class name */
    public static final class C2013a {
        static {
            Covode.recordClassIndex(52555);
        }

        private C2013a() {
        }

        public /* synthetic */ C2013a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        List<d> list = this.f84289a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    private final d a(int i2) {
        List<d> list = this.f84289a;
        if (list != null) {
            return list.get(i2);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        Integer num;
        d a2 = a(i2);
        if (a2 == null || (num = a2.f84331a) == null) {
            return 1;
        }
        return num.intValue();
    }

    private static View a(ViewGroup viewGroup, int i2) {
        return com.a.a(LayoutInflater.from(viewGroup.getContext()), i2, viewGroup, false);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(com.ss.android.ugc.aweme.ecommerce.address.candinput.a.a aVar, int i2) {
        com.ss.android.ugc.aweme.ecommerce.address.candinput.a.a aVar2 = aVar;
        l.d(aVar2, "");
        aVar2.a(a(i2), getItemCount());
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        com.ss.android.ugc.aweme.ecommerce.address.candinput.a.a bVar;
        MethodCollector.i(5237);
        l.d(viewGroup, "");
        boolean z = true;
        if (i2 == -2) {
            View a2 = a(viewGroup, R.layout.ns);
            l.b(a2, "");
            bVar = new b(a2);
        } else if (i2 == 1) {
            View a3 = a(viewGroup, R.layout.nt);
            l.b(a3, "");
            bVar = new c(a3);
        } else if (i2 == 2) {
            View a4 = a(viewGroup, R.layout.nu);
            l.b(a4, "");
            bVar = new com.ss.android.ugc.aweme.ecommerce.address.candinput.a.d(a4);
        } else {
            AssertionError assertionError = new AssertionError();
            MethodCollector.o(5237);
            throw assertionError;
        }
        bVar.f84292a = aVar.f84291c;
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = bVar.getClass().getName();
        MethodCollector.o(5237);
        return bVar;
    }
}
