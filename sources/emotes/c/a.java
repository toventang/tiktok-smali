package emotes.c;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import emotes.c.b;
import h.f.b.l;
import j.a.a.c;

public abstract class a<D, VH extends b<D>> extends c<D, VH> {
    static {
        Covode.recordClassIndex(104328);
    }

    @Override // j.a.a.c
    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, Object obj) {
        b bVar = (b) viewHolder;
        l.d(bVar, "");
        bVar.a(obj, bVar.getAdapterPosition());
    }
}
