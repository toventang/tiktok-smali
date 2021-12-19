package com.ss.android.ugc.aweme.discover.adapter.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.ui.al;
import h.f.b.l;

public final class e extends RecyclerView.ViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static final a f80657b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public al.b f80658a;

    static {
        Covode.recordClassIndex(50165);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50166);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b extends com.ss.android.ugc.aweme.discover.m.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f80659a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ al.b f80660b;

        static {
            Covode.recordClassIndex(50167);
        }

        @Override // com.ss.android.ugc.aweme.discover.m.e
        public final void a() {
            al.b bVar;
            if (this.f80659a.f80658a != null && (bVar = this.f80660b) != null) {
                bVar.c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, al.b bVar) {
            super((byte) 0);
            this.f80659a = eVar;
            this.f80660b = bVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(View view, al.b bVar) {
        super(view);
        l.d(view, "");
        this.f80658a = bVar;
        this.itemView.setOnClickListener(new b(this, bVar));
    }
}
