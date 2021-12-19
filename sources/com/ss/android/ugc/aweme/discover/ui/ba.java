package com.ss.android.ugc.aweme.discover.ui;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.ui.bd;

public final class ba<T> extends bd<ao<T>> implements ad<T> {

    public interface a<T> {
        static {
            Covode.recordClassIndex(51293);
        }

        RecyclerView.ViewHolder a();

        void a(RecyclerView.ViewHolder viewHolder, ao<T> aoVar);
    }

    static {
        Covode.recordClassIndex(51292);
    }

    static class b<T> implements bd.a<ao<T>> {

        /* renamed from: a  reason: collision with root package name */
        private a<T> f82409a;

        static {
            Covode.recordClassIndex(51294);
        }

        @Override // com.ss.android.ugc.aweme.discover.ui.bd.a
        public final /* bridge */ /* synthetic */ RecyclerView.ViewHolder a() {
            return this.f82409a.a();
        }

        b(a<T> aVar) {
            this.f82409a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.discover.ui.bd.a
        public final /* bridge */ /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, Object obj) {
            this.f82409a.a(viewHolder, (ao) obj);
        }
    }

    public ba(a<T> aVar) {
        super(new b(aVar));
    }
}
