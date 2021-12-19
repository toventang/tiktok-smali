package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.choosemusic.d.c;
import com.ss.android.ugc.aweme.l.a.a;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.R;

public final class o extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    TextView f70932a;

    /* renamed from: b  reason: collision with root package name */
    RemoteImageView f70933b;

    /* renamed from: c  reason: collision with root package name */
    MusicCollectionItem f70934c;

    /* renamed from: d  reason: collision with root package name */
    private int f70935d;

    /* renamed from: e  reason: collision with root package name */
    private c f70936e;

    static {
        Covode.recordClassIndex(43688);
    }

    public final void onClick(View view) {
        c cVar;
        ClickAgent.onClick(view);
        if (!a.a(view, 1200) && this.f70934c != null && this.itemView != null && (cVar = this.f70936e) != null) {
            cVar.a(this.f70934c);
        }
    }

    public o(View view, int i2, c cVar) {
        super(view);
        this.f70932a = (TextView) view.findViewById(R.id.ewz);
        this.f70933b = (RemoteImageView) view.findViewById(R.id.bva);
        this.f70935d = i2;
        this.itemView.setOnClickListener(this);
        this.f70936e = cVar;
    }
}
