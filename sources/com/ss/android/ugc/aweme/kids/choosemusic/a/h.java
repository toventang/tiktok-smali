package com.ss.android.ugc.aweme.kids.choosemusic.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.kids.a.e.d;
import com.zhiliaoapp.musically.R;
import java.util.Collection;

public final class h extends f<d> {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.choosemusic.d.d f105471a;

    static {
        Covode.recordClassIndex(67584);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        return new a(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aad, viewGroup, false));
    }

    /* access modifiers changed from: package-private */
    public class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        RemoteImageView f105472a;

        /* renamed from: b  reason: collision with root package name */
        TextView f105473b;

        /* renamed from: c  reason: collision with root package name */
        d f105474c;

        static {
            Covode.recordClassIndex(67585);
        }

        a(View view) {
            super(view);
            this.f105472a = (RemoteImageView) view.findViewById(R.id.cr3);
            this.f105473b = (TextView) view.findViewById(R.id.cr4);
            this.itemView.setOnClickListener(new i(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        d dVar;
        a aVar = (a) viewHolder;
        if (!b.a((Collection) this.f76354l) && i2 >= 0 && i2 < this.f76354l.size() && (dVar = (d) this.f76354l.get(i2)) != null) {
            aVar.f105474c = dVar;
            e.a(aVar.f105472a, dVar.f105310c);
            aVar.f105473b.setText(dVar.f105309b);
        }
    }
}
