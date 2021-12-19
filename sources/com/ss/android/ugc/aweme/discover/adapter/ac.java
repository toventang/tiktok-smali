package com.ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.SearchHistory;
import com.ss.android.ugc.aweme.discover.ui.aj;
import com.ss.android.ugc.aweme.discover.ui.al;
import com.zhiliaoapp.musically.R;

public final class ac extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    View f80303a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f80304b;

    /* renamed from: c  reason: collision with root package name */
    public SearchHistory f80305c;

    /* renamed from: d  reason: collision with root package name */
    public al.b f80306d;

    static {
        Covode.recordClassIndex(49991);
    }

    public ac(View view, al.b bVar) {
        super(view);
        this.f80303a = view.findViewById(R.id.bw7);
        this.f80304b = (TextView) view.findViewById(R.id.exf);
        this.f80306d = bVar;
        this.f80303a.setOnTouchListener(new aj() {
            /* class com.ss.android.ugc.aweme.discover.adapter.ac.AnonymousClass1 */

            static {
                Covode.recordClassIndex(49992);
            }

            @Override // com.ss.android.ugc.aweme.discover.ui.aj
            public final void a(View view) {
                if (ac.this.f80306d != null) {
                    ac.this.f80306d.b(ac.this.f80305c, ac.this.getAdapterPosition());
                }
            }
        });
        this.f80304b.setMaxLines(2);
    }
}
