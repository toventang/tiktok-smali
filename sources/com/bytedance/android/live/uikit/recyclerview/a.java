package com.bytedance.android.live.uikit.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public abstract class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public AbstractC0269a f12919a;

    /* renamed from: c  reason: collision with root package name */
    private b f12920c;

    /* renamed from: com.bytedance.android.live.uikit.recyclerview.a$a  reason: collision with other inner class name */
    public interface AbstractC0269a {
        static {
            Covode.recordClassIndex(7170);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(7168);
    }

    public final void a() {
        b bVar = this.f12920c;
        if (bVar != null) {
            ((LoadingStatusView) bVar.itemView).setStatus(0);
        }
    }

    public final void b() {
        b bVar = this.f12920c;
        if (bVar != null) {
            ((LoadingStatusView) bVar.itemView).a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.bytedance.android.live.uikit.recyclerview.b
    public final int getItemCount() {
        if (c() == 0) {
            return 0;
        }
        return super.getItemCount();
    }

    @Override // com.bytedance.android.live.uikit.recyclerview.b
    public final void a(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof b) {
            b bVar = (b) viewHolder;
            if (((LoadingStatusView) bVar.itemView).f12913b == -1 && a.this.f12919a != null) {
                a.this.f12919a.a();
            }
            RecyclerView.j jVar = (RecyclerView.j) this.f12920c.itemView.getLayoutParams();
            if (jVar instanceof StaggeredGridLayoutManager.b) {
                ((StaggeredGridLayoutManager.b) jVar).f3934b = true;
            }
            this.f12920c.itemView.setLayoutParams(jVar);
        }
    }

    @Override // com.bytedance.android.live.uikit.recyclerview.b
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
        LoadingStatusView loadingStatusView = new LoadingStatusView(viewGroup.getContext());
        int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.wz);
        int dimensionPixelSize2 = viewGroup.getResources().getDimensionPixelSize(R.dimen.x0);
        loadingStatusView.setLayoutParams(new RecyclerView.j(-1, dimensionPixelSize));
        LoadingStatusView.a aVar = new LoadingStatusView.a(viewGroup.getContext());
        aVar.a(dimensionPixelSize2).a(R.string.gm2, new View.OnClickListener() {
            /* class com.bytedance.android.live.uikit.recyclerview.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(7169);
            }

            public final void onClick(View view) {
                if (a.this.f12919a != null) {
                    a.this.f12919a.a();
                }
            }
        });
        aVar.f12916b = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.bcc, viewGroup, false);
        loadingStatusView.setBuilder(aVar);
        b bVar = new b(loadingStatusView);
        this.f12920c = bVar;
        return bVar;
    }

    class b extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(7171);
        }

        public b(View view) {
            super(view);
        }
    }
}
