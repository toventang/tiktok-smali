package com.ss.android.ugc.aweme.choosemusic.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.choosemusic.d.d;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.R;
import java.util.Collection;

public final class i extends f<MusicCollectionItem> {

    /* renamed from: a  reason: collision with root package name */
    public d f70304a;

    static {
        Covode.recordClassIndex(43368);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        return new a(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aad, viewGroup, false));
    }

    /* access modifiers changed from: package-private */
    public class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        RemoteImageView f70305a;

        /* renamed from: b  reason: collision with root package name */
        TextView f70306b;

        /* renamed from: c  reason: collision with root package name */
        MusicCollectionItem f70307c;

        static {
            Covode.recordClassIndex(43369);
        }

        a(View view) {
            super(view);
            this.f70305a = (RemoteImageView) view.findViewById(R.id.cr3);
            this.f70306b = (TextView) view.findViewById(R.id.cr4);
            this.itemView.setOnClickListener(new j(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        MusicCollectionItem musicCollectionItem;
        a aVar = (a) viewHolder;
        if (!b.a((Collection) this.f76354l) && i2 >= 0 && i2 < this.f76354l.size() && (musicCollectionItem = (MusicCollectionItem) this.f76354l.get(i2)) != null) {
            aVar.f70307c = musicCollectionItem;
            e.a(aVar.f70305a, musicCollectionItem.cover);
            aVar.f70306b.setText(musicCollectionItem.mcName);
        }
    }
}
