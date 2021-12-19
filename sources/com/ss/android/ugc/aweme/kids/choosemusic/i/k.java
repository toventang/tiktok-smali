package com.ss.android.ugc.aweme.kids.choosemusic.i;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.kids.a.e.d;
import com.ss.android.ugc.aweme.kids.choosemusic.d.c;
import com.ss.android.ugc.aweme.l.a.a;
import com.zhiliaoapp.musically.R;

public final class k extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    TextView f105784a;

    /* renamed from: b  reason: collision with root package name */
    RemoteImageView f105785b;

    /* renamed from: c  reason: collision with root package name */
    d f105786c;

    /* renamed from: d  reason: collision with root package name */
    private int f105787d;

    /* renamed from: e  reason: collision with root package name */
    private c f105788e;

    static {
        Covode.recordClassIndex(67718);
    }

    public final void onClick(View view) {
        c cVar;
        ClickAgent.onClick(view);
        if (!a.a(view, 1200) && this.f105786c != null && this.itemView != null && (cVar = this.f105788e) != null) {
            cVar.a(this.f105786c);
        }
    }

    public k(View view, int i2, c cVar) {
        super(view);
        this.f105784a = (TextView) view.findViewById(R.id.ewz);
        this.f105785b = (RemoteImageView) view.findViewById(R.id.bva);
        this.f105787d = i2;
        this.itemView.setOnClickListener(this);
        this.f105788e = cVar;
    }
}
