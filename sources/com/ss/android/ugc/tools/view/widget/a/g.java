package com.ss.android.ugc.tools.view.widget.a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.widget.b.b;
import h.f.b.l;
import h.z;

public abstract class g extends d implements b<com.ss.android.ugc.tools.view.widget.b.a> {

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.tools.view.widget.b.a f150353c;

    /* renamed from: d  reason: collision with root package name */
    public h.f.a.a<z> f150354d;

    static {
        Covode.recordClassIndex(98897);
    }

    /* access modifiers changed from: protected */
    public abstract RecyclerView.ViewHolder a(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public abstract void a(RecyclerView.ViewHolder viewHolder, com.ss.android.ugc.tools.view.widget.b.a aVar);

    /* Return type fixed from 'java.lang.Enum' to match base method */
    @Override // com.ss.android.ugc.tools.view.widget.b.b
    public /* bridge */ /* synthetic */ com.ss.android.ugc.tools.view.widget.b.a getState() {
        return this.f150353c;
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f150355a;

        static {
            Covode.recordClassIndex(98898);
        }

        a(g gVar) {
            this.f150355a = gVar;
        }

        public final void run() {
            h.f.a.a<z> aVar = this.f150355a.f150354d;
            if (aVar != null && this.f150355a.f150353c == com.ss.android.ugc.tools.view.widget.b.a.NONE) {
                aVar.invoke();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private g(RecyclerView.a<RecyclerView.ViewHolder> aVar) {
        super(aVar, true);
        l.d(aVar, "");
        this.f150353c = com.ss.android.ugc.tools.view.widget.b.a.NONE;
    }

    @Override // com.ss.android.ugc.tools.view.widget.a.d
    public final RecyclerView.ViewHolder b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        return a(viewGroup);
    }

    @Override // com.ss.android.ugc.tools.view.widget.a.d
    public final void a(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        a(viewHolder, this.f150353c);
        viewHolder.itemView.post(new a(this));
    }

    /* renamed from: a */
    public final void setState(com.ss.android.ugc.tools.view.widget.b.a aVar) {
        l.d(aVar, "");
        this.f150353c = aVar;
        notifyItemChanged(getItemCount() - 1);
    }

    public /* synthetic */ g(RecyclerView.a aVar, byte b2) {
        this(aVar);
    }
}
