package emotes.c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends a<h, i> {

    /* renamed from: a  reason: collision with root package name */
    private final EmoteModel f157117a;

    static {
        Covode.recordClassIndex(104331);
    }

    public d(EmoteModel emoteModel) {
        l.d(emoteModel, "");
        this.f157117a = emoteModel;
    }

    @Override // j.a.a.c
    public final /* synthetic */ RecyclerView.ViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = a.a(layoutInflater, R.layout.b_m, viewGroup, false);
        l.b(a2, "");
        return new i(a2, this.f157117a);
    }
}
