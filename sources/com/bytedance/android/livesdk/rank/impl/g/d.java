package com.bytedance.android.livesdk.rank.impl.g;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.rank.impl.f.c;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class d extends j.a.a.c<com.bytedance.android.livesdk.rank.api.model.b, a> {
    static {
        Covode.recordClassIndex(12274);
    }

    public static final class c implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f20745a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f20746b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.rank.api.model.b f20747c;

        static {
            Covode.recordClassIndex(12282);
        }

        @Override // com.bytedance.android.livesdk.rank.impl.f.c.a
        public final com.bytedance.android.livesdk.rank.api.model.b c() {
            return this.f20747c;
        }

        @Override // com.bytedance.android.livesdk.rank.impl.f.c.a
        public final void a() {
            d.a(this.f20746b.a(), true);
        }

        @Override // com.bytedance.android.livesdk.rank.impl.f.c.a
        public final void b() {
            d.a(this.f20746b.a(), false);
        }

        c(d dVar, a aVar, com.bytedance.android.livesdk.rank.api.model.b bVar) {
            this.f20745a = dVar;
            this.f20746b = aVar;
            this.f20747c = bVar;
        }
    }

    public static final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final h f20738a;

        /* renamed from: b  reason: collision with root package name */
        final h f20739b;

        /* renamed from: c  reason: collision with root package name */
        final h f20740c;

        /* renamed from: d  reason: collision with root package name */
        final h f20741d;

        /* renamed from: e  reason: collision with root package name */
        private final h f20742e;

        static {
            Covode.recordClassIndex(12275);
        }

        public final LiveButton a() {
            return (LiveButton) this.f20742e.getValue();
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.d$a$a  reason: collision with other inner class name */
        static final class C0424a extends m implements h.f.a.a<LiveButton> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(12276);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0424a(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LiveButton invoke() {
                return this.$itemView.findViewById(R.id.b7g);
            }
        }

        static final class b extends m implements h.f.a.a<LiveTextView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(12277);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LiveTextView invoke() {
                return this.$itemView.findViewById(R.id.f5g);
            }
        }

        static final class c extends m implements h.f.a.a<ImageView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(12278);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ ImageView invoke() {
                return this.$itemView.findViewById(R.id.c2r);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.g.d$a$d  reason: collision with other inner class name */
        static final class C0425d extends m implements h.f.a.a<HSImageView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(12279);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0425d(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ HSImageView invoke() {
                return this.$itemView.findViewById(R.id.bu1);
            }
        }

        static final class e extends m implements h.f.a.a<LiveTextView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(12280);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LiveTextView invoke() {
                return this.$itemView.findViewById(R.id.f_b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.d(view, "");
            this.f20738a = i.a((h.f.a.a) new b(view));
            this.f20739b = i.a((h.f.a.a) new c(view));
            this.f20740c = i.a((h.f.a.a) new e(view));
            this.f20742e = i.a((h.f.a.a) new C0424a(view));
            this.f20741d = i.a((h.f.a.a) new C0425d(view));
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f20743a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.rank.api.model.b f20744b;

        static {
            Covode.recordClassIndex(12281);
        }

        b(d dVar, com.bytedance.android.livesdk.rank.api.model.b bVar) {
            this.f20743a = dVar;
            this.f20744b = bVar;
        }

        public final void onClick(View view) {
            com.bytedance.android.livesdk.rank.impl.f.c.a(this.f20744b.f20593a.getId());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.g.d$d  reason: collision with other inner class name */
    static final class View$OnClickListenerC0426d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.rank.api.model.b f20748a;

        static {
            Covode.recordClassIndex(12283);
        }

        View$OnClickListenerC0426d(com.bytedance.android.livesdk.rank.api.model.b bVar) {
            this.f20748a = bVar;
        }

        public final void onClick(View view) {
            UserProfileEvent userProfileEvent = new UserProfileEvent(this.f20748a.f20593a.getId());
            userProfileEvent.mReportType = "report_user";
            com.bytedance.android.livesdk.an.a.a().a(userProfileEvent);
        }
    }

    public static void a(LiveButton liveButton, boolean z) {
        if (z) {
            liveButton.setText(R.string.e39);
        } else {
            liveButton.setText(R.string.e34);
        }
        liveButton.setEnabled(!z);
        liveButton.setClickable(!z);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // j.a.a.c
    public final /* synthetic */ a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.b_b, viewGroup, false);
        l.b(a2, "");
        return new a(a2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // j.a.a.c
    public final /* synthetic */ void a(a aVar, com.bytedance.android.livesdk.rank.api.model.b bVar) {
        a aVar2 = aVar;
        com.bytedance.android.livesdk.rank.api.model.b bVar2 = bVar;
        l.d(aVar2, "");
        l.d(bVar2, "");
        com.bytedance.android.livesdk.rank.impl.f.c.a((LiveTextView) aVar2.f20738a.getValue(), bVar2, (Boolean) false);
        com.bytedance.android.livesdk.rank.impl.f.c.a((HSImageView) aVar2.f20741d.getValue(), (ImageView) aVar2.f20739b.getValue(), bVar2);
        LiveTextView liveTextView = (LiveTextView) aVar2.f20740c.getValue();
        String str = bVar2.f20593a.displayId;
        if (str == null) {
            str = "";
        }
        liveTextView.setText(str);
        LiveButton a2 = aVar2.a();
        a(a2, com.bytedance.android.livesdk.rank.impl.f.c.a(bVar2));
        a2.setOnClickListener(new b(this, bVar2));
        com.bytedance.android.livesdk.rank.impl.f.c.a(new c(this, aVar2, bVar2));
        aVar2.itemView.setOnClickListener(new View$OnClickListenerC0426d(bVar2));
    }
}
