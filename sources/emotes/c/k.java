package emotes.c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import e.c.a;
import emotes.a.c;
import h.f.b.l;

public final class k extends a<EmoteModel, l> {

    /* renamed from: a  reason: collision with root package name */
    public int f157140a;

    /* renamed from: b  reason: collision with root package name */
    public a f157141b;

    /* renamed from: c  reason: collision with root package name */
    public c f157142c;

    static {
        Covode.recordClassIndex(104340);
    }

    @Override // j.a.a.c
    public final /* synthetic */ RecyclerView.ViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.bam, viewGroup, false);
        l.b(a2, "");
        l lVar = new l(a2, this.f157141b, this.f157142c);
        View view = lVar.itemView;
        l.b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = this.f157140a;
        layoutParams.width = this.f157140a;
        View view2 = lVar.itemView;
        l.b(view2, "");
        view2.setLayoutParams(layoutParams);
        return lVar;
    }

    public k(int i2, a aVar, c cVar) {
        this.f157140a = i2;
        this.f157141b = aVar;
        this.f157142c = cVar;
    }
}
