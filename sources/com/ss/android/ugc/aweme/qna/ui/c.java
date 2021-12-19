package com.ss.android.ugc.aweme.qna.ui;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.qna.model.k;
import com.ss.android.ugc.aweme.qna.ui.e;
import com.ss.android.ugc.aweme.qna.vm.i;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends t<k, e> {

    /* renamed from: b  reason: collision with root package name */
    private final i f119530b;

    /* renamed from: c  reason: collision with root package name */
    private final String f119531c;

    static {
        Covode.recordClassIndex(77677);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(i iVar, String str) {
        super(d.f119532a);
        l.d(iVar, "");
        this.f119530b = iVar;
        this.f119531c = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        e eVar = (e) viewHolder;
        l.d(eVar, "");
        Object a2 = a(i2);
        l.b(a2, "");
        k kVar = (k) a2;
        i iVar = this.f119530b;
        l.d(kVar, "");
        l.d(iVar, "");
        SmartImageView smartImageView = (SmartImageView) eVar.f119533a.findViewById(R.id.l7);
        smartImageView.setImageURI(Uri.parse(kVar.f119526c));
        smartImageView.setOnClickListener(new e.a(eVar, iVar, kVar));
    }

    private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(7528);
        l.d(viewGroup, "");
        View a3 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ar0, viewGroup, false);
        l.b(a3, "");
        e eVar = new e(a3, cVar.f119531c);
        try {
            if (eVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(eVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) eVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(eVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = eVar.getClass().getName();
        MethodCollector.o(7528);
        return eVar;
    }
}
