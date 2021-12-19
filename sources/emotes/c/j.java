package emotes.c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import emotes.a.d;
import h.f.b.l;

public final class j extends a<h, g> {

    /* renamed from: a  reason: collision with root package name */
    private final d f157139a;

    static {
        Covode.recordClassIndex(104339);
    }

    public j(d dVar) {
        l.d(dVar, "");
        this.f157139a = dVar;
    }

    @Override // j.a.a.c
    public final /* synthetic */ RecyclerView.ViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = a.a(layoutInflater, R.layout.bal, viewGroup, false);
        l.b(a2, "");
        return new g(a2, this.f157139a);
    }
}
