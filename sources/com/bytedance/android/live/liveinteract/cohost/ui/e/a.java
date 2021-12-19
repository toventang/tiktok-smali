package com.bytedance.android.live.liveinteract.cohost.ui.e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.n;

public final class a extends j.a.a.c<com.bytedance.android.live.liveinteract.cohost.ui.d.a, d> {

    /* renamed from: b  reason: collision with root package name */
    public static c f10340b = c.SHRINK;

    /* renamed from: c  reason: collision with root package name */
    public static final C0173a f10341c = new C0173a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final b f10342a;

    public interface b {
        static {
            Covode.recordClassIndex(5455);
        }

        void h();
    }

    public enum c {
        EXTENSION,
        SHRINK;

        static {
            Covode.recordClassIndex(5456);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.a$a  reason: collision with other inner class name */
    public static final class C0173a {
        static {
            Covode.recordClassIndex(5454);
        }

        private C0173a() {
        }

        public /* synthetic */ C0173a(byte b2) {
            this();
        }
    }

    public final class d extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10344a;

        /* renamed from: b  reason: collision with root package name */
        private final h f10345b;

        /* renamed from: c  reason: collision with root package name */
        private final h f10346c;

        static {
            Covode.recordClassIndex(5457);
        }

        public final LiveTextView a() {
            return (LiveTextView) this.f10345b.getValue();
        }

        public final AppCompatImageView b() {
            return (AppCompatImageView) this.f10346c.getValue();
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.a$d$a  reason: collision with other inner class name */
        static final class C0174a extends m implements h.f.a.a<LiveTextView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5458);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0174a(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LiveTextView invoke() {
                return this.$itemView.findViewById(R.id.f0p);
            }
        }

        static final class b extends m implements h.f.a.a<AppCompatImageView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5459);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ AppCompatImageView invoke() {
                return this.$itemView.findViewById(R.id.by9);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(a aVar, View view) {
            super(view);
            l.d(view, "");
            this.f10344a = aVar;
            this.f10345b = i.a((h.f.a.a) new C0174a(view));
            this.f10346c = i.a((h.f.a.a) new b(view));
        }
    }

    static {
        Covode.recordClassIndex(5453);
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10347a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f10348b;

        static {
            Covode.recordClassIndex(5460);
        }

        e(a aVar, d dVar) {
            this.f10347a = aVar;
            this.f10348b = dVar;
        }

        public final void onClick(View view) {
            this.f10347a.f10342a.h();
            this.f10347a.a(this.f10348b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10349a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f10350b;

        static {
            Covode.recordClassIndex(5461);
        }

        f(a aVar, d dVar) {
            this.f10349a = aVar;
            this.f10350b = dVar;
        }

        public final void onClick(View view) {
            this.f10349a.f10342a.h();
            this.f10349a.a(this.f10350b);
        }
    }

    public a(b bVar) {
        l.d(bVar, "");
        this.f10342a = bVar;
    }

    private final void b(d dVar) {
        dVar.a().setText(y.a((int) R.string.e6i));
        dVar.b().setImageResource(2131234814);
        dVar.itemView.setOnClickListener(new f(this, dVar));
    }

    private final void c(d dVar) {
        dVar.a().setText(y.a((int) R.string.e6h));
        dVar.b().setImageResource(2131234812);
        dVar.itemView.setOnClickListener(new e(this, dVar));
    }

    public final void a(d dVar) {
        c cVar;
        int i2 = b.f10352b[f10340b.ordinal()];
        if (i2 == 1) {
            c(dVar);
            cVar = c.EXTENSION;
        } else if (i2 == 2) {
            b(dVar);
            cVar = c.SHRINK;
        } else {
            throw new n();
        }
        f10340b = cVar;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // j.a.a.c
    public final /* synthetic */ d a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.bb5, viewGroup, false);
        l.b(a2, "");
        return new d(this, a2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // j.a.a.c
    public final /* synthetic */ void a(d dVar, com.bytedance.android.live.liveinteract.cohost.ui.d.a aVar) {
        d dVar2 = dVar;
        l.d(dVar2, "");
        l.d(aVar, "");
        int i2 = b.f10351a[f10340b.ordinal()];
        if (i2 == 1) {
            b(dVar2);
        } else if (i2 == 2) {
            c(dVar2);
        }
    }
}
