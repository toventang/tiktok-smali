package j.a.a;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.a;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import java.util.Collections;
import java.util.List;

public class f extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: b  reason: collision with root package name */
    public List<?> f158845b;

    /* renamed from: c  reason: collision with root package name */
    public k f158846c;

    static {
        Covode.recordClassIndex(105403);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public f() {
        this(Collections.emptyList());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f158845b.size();
    }

    public void a(List<?> list) {
        this.f158845b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        a(viewHolder);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        a(viewHolder).a(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        a(viewHolder).b(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        a(viewHolder).c(viewHolder);
    }

    private f(List<?> list) {
        this(list, new g());
    }

    private c a(RecyclerView.ViewHolder viewHolder) {
        return this.f158846c.a(viewHolder.getItemViewType());
    }

    public final void a(Class<?> cls) {
        if (this.f158846c.a(cls)) {
            cls.getSimpleName();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final long getItemId(int i2) {
        this.f158845b.get(i2);
        this.f158846c.a(getItemViewType(i2));
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        Object obj = this.f158845b.get(i2);
        int b2 = this.f158846c.b(obj.getClass());
        if (b2 != -1) {
            return b2 + this.f158846c.b(b2).a(obj);
        }
        throw new a(obj.getClass());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        throw new IllegalAccessError("You should not call this method. Call RecyclerView.Adapter#onBindViewHolder(holder, position, payloads) instead.");
    }

    private f(List<?> list, k kVar) {
        this.f158845b = list;
        this.f158846c = kVar;
    }

    public final <T> void a(Class<? extends T> cls, c<T, ?> cVar) {
        a(cls);
        this.f158846c.a(cls, cVar, new b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2, List<Object> list) {
        this.f158846c.a(viewHolder.getItemViewType()).a(viewHolder, this.f158845b.get(i2), list);
    }

    private static RecyclerView.ViewHolder a(f fVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(3340);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        c<?, ?> a3 = fVar.f158846c.a(i2);
        a3.f158844e = fVar;
        RecyclerView.ViewHolder a4 = a3.a(from, viewGroup);
        try {
            if (a4.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a4.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a4.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a4.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = a4.getClass().getName();
        MethodCollector.o(3340);
        return a4;
    }
}
