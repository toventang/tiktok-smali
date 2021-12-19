package com.ss.android.ugc.aweme.q.a.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.api.model.AnchorIcon;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteRoundImageView;
import com.ss.android.ugc.aweme.bl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends com.ss.android.ugc.aweme.q.a.a<AnchorCell, a> {
    static {
        Covode.recordClassIndex(77255);
    }

    public b(bl blVar) {
        super(blVar);
    }

    public final class a extends com.ss.android.ugc.aweme.q.a.a<AnchorCell, a>.C3047a {

        /* renamed from: b  reason: collision with root package name */
        public final RemoteRoundImageView f118921b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f118922c;

        static {
            Covode.recordClassIndex(77256);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, View view) {
            super(bVar, view);
            l.d(view, "");
            this.f118922c = bVar;
            this.f118921b = (RemoteRoundImageView) view.findViewById(R.id.bin);
        }
    }

    @Override // j.a.a.c
    public final /* synthetic */ RecyclerView.ViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.a9c, viewGroup, false);
        l.b(a2, "");
        return new a(this, a2);
    }

    @Override // j.a.a.c
    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, Object obj) {
        String str;
        a aVar = (a) viewHolder;
        AnchorCell anchorCell = (AnchorCell) obj;
        l.d(aVar, "");
        l.d(anchorCell, "");
        RemoteRoundImageView remoteRoundImageView = aVar.f118921b;
        AnchorIcon anchorIcon = anchorCell.f66454b;
        if (anchorIcon != null) {
            str = anchorIcon.f66461a;
        } else {
            str = null;
        }
        e.b(remoteRoundImageView, str, -1, -1);
    }
}
