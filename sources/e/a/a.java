package e.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.utils.ap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import e.e.b;
import e.e.d;
import java.util.ArrayList;
import java.util.List;

public final class a extends RecyclerView.a<e.e.a> {

    /* renamed from: a  reason: collision with root package name */
    public final List<com.bytedance.android.live.base.model.emoji.a> f157047a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public e.c.a f157048b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f157049c;

    /* renamed from: d  reason: collision with root package name */
    private final LayoutInflater f157050d;

    static {
        Covode.recordClassIndex(104290);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final long getItemId(int i2) {
        return (long) i2;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ e.e.a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f157047a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        com.bytedance.android.live.base.model.emoji.a aVar = this.f157047a.get(i2);
        if (aVar == null) {
            return 2;
        }
        return aVar.f7401e;
    }

    public a(Context context) {
        this.f157049c = context;
        this.f157050d = LayoutInflater.from(context);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(e.e.a aVar, int i2) {
        e.e.a aVar2 = aVar;
        com.bytedance.android.live.base.model.emoji.a aVar3 = this.f157047a.get(i2);
        if (aVar3 == null) {
            return;
        }
        if (aVar3.f7401e == 2) {
            aVar2.itemView.setVisibility(4);
            return;
        }
        aVar2.a(aVar3);
        e.c.a aVar4 = this.f157048b;
        if (aVar4 != null) {
            aVar2.a(aVar4);
        }
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        e.e.a aVar2;
        boolean a2;
        MethodCollector.i(1748);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) ap.a(aVar.f157049c, 62.0f));
        if (i2 != 0) {
            aVar2 = new b(aVar.f157050d.inflate(R.layout.bai, (ViewGroup) null));
            aVar2.itemView.setLayoutParams(layoutParams);
        } else {
            aVar2 = new d(aVar.f157050d.inflate(R.layout.bap, (ViewGroup) null));
            aVar2.itemView.setLayoutParams(layoutParams);
        }
        try {
            if (aVar2.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar2.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = aVar2.getClass().getName();
        MethodCollector.o(1748);
        return aVar2;
    }
}
