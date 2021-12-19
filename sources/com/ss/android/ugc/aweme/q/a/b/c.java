package com.ss.android.ugc.aweme.q.a.b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends com.ss.android.ugc.aweme.q.a.a<com.ss.android.ugc.aweme.api.model.a, RecyclerView.ViewHolder> {
    static {
        Covode.recordClassIndex(77266);
    }

    public c(bl blVar) {
        super(blVar);
    }

    @Override // j.a.a.c
    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, Object obj) {
        l.d(viewHolder, "");
        l.d(obj, "");
    }

    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f118935a;

        static {
            Covode.recordClassIndex(77267);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, final View view) {
            super(view);
            l.d(view, "");
            this.f118935a = cVar;
            view.post(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.q.a.b.c.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f118936a;

                static {
                    Covode.recordClassIndex(77268);
                }

                {
                    this.f118936a = r1;
                }

                public final void run() {
                    int i2;
                    View childAt;
                    int height = view.getHeight();
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof RecyclerView)) {
                        parent = null;
                    }
                    RecyclerView recyclerView = (RecyclerView) parent;
                    int adapterPosition = this.f118936a.getAdapterPosition();
                    int i3 = 0;
                    for (int i4 = 0; i4 < adapterPosition; i4++) {
                        if (recyclerView == null || (childAt = recyclerView.getChildAt(i4)) == null) {
                            i2 = 0;
                        } else {
                            i2 = childAt.getHeight();
                        }
                        i3 += i2;
                    }
                    view.getLayoutParams().height = height - i3;
                    View view = view;
                    view.setLayoutParams(view.getLayoutParams());
                }
            });
        }
    }

    @Override // j.a.a.c
    public final RecyclerView.ViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.a9h, viewGroup, false);
        l.b(a2, "");
        return new a(this, a2);
    }
}
