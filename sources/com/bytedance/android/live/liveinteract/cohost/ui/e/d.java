package com.bytedance.android.live.liveinteract.cohost.ui.e;

import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class d extends j.a.a.c<com.bytedance.android.live.liveinteract.cohost.ui.d.d, b> {

    /* renamed from: a  reason: collision with root package name */
    public final a f10355a;

    public interface a {
        static {
            Covode.recordClassIndex(5468);
        }

        boolean a();
    }

    static {
        Covode.recordClassIndex(5467);
    }

    public final class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final h f10356a;

        /* renamed from: b  reason: collision with root package name */
        final h f10357b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f10358c;

        /* renamed from: d  reason: collision with root package name */
        private final h f10359d;

        /* renamed from: e  reason: collision with root package name */
        private final h f10360e;

        /* renamed from: f  reason: collision with root package name */
        private final h f10361f;

        static {
            Covode.recordClassIndex(5469);
        }

        public final ImageView a() {
            return (ImageView) this.f10359d.getValue();
        }

        public final LiveButton b() {
            return (LiveButton) this.f10360e.getValue();
        }

        public final View c() {
            return (View) this.f10361f.getValue();
        }

        static final class a extends m implements h.f.a.a<ImageView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5470);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ ImageView invoke() {
                return this.$itemView.findViewById(R.id.c08);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.d$b$b  reason: collision with other inner class name */
        static final class C0176b extends m implements h.f.a.a<LiveButton> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5471);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0176b(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LiveButton invoke() {
                return this.$itemView.findViewById(R.id.xd);
            }
        }

        static final class c extends m implements h.f.a.a<LiveTextView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5472);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LiveTextView invoke() {
                return this.$itemView.findViewById(R.id.f5e);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.d$b$d  reason: collision with other inner class name */
        static final class C0177d extends m implements h.f.a.a<View> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5473);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0177d(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ View invoke() {
                return this.$itemView.findViewById(R.id.fir);
            }
        }

        static final class e extends m implements h.f.a.a<LiveTextView> {
            final /* synthetic */ View $itemView;

            static {
                Covode.recordClassIndex(5474);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(View view) {
                super(0);
                this.$itemView = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ LiveTextView invoke() {
                return this.$itemView.findViewById(R.id.f5f);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar, View view) {
            super(view);
            l.d(view, "");
            this.f10358c = dVar;
            this.f10359d = i.a((h.f.a.a) new a(view));
            this.f10356a = i.a((h.f.a.a) new e(view));
            this.f10357b = i.a((h.f.a.a) new c(view));
            this.f10360e = i.a((h.f.a.a) new C0176b(view));
            this.f10361f = i.a((h.f.a.a) new C0177d(view));
        }
    }

    public d(a aVar) {
        l.d(aVar, "");
        this.f10355a = aVar;
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final c f10362a = new c();

        static {
            Covode.recordClassIndex(5475);
        }

        c() {
        }

        public final void onClick(View view) {
            ao.a(y.e(), y.a((int) R.string.du5), 0);
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // j.a.a.c
    public final /* synthetic */ b a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MethodCollector.i(7879);
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.bat, viewGroup, false);
        l.b(a2, "");
        b bVar = new b(this, a2);
        bVar.a().setScaleType(ImageView.ScaleType.MATRIX);
        int c2 = y.c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(y.a(), 2131234208, options);
        float f2 = (((float) c2) * 1.0f) / ((float) options.outWidth);
        Matrix matrix = new Matrix();
        matrix.setScale(f2, f2);
        bVar.a().setImageMatrix(matrix);
        bVar.b().setMaxWidth(Integer.MAX_VALUE);
        bVar.c().setOnClickListener(c.f10362a);
        MethodCollector.o(7879);
        return bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // j.a.a.c
    public final /* synthetic */ void a(b bVar, com.bytedance.android.live.liveinteract.cohost.ui.d.d dVar) {
        b bVar2 = bVar;
        com.bytedance.android.live.liveinteract.cohost.ui.d.d dVar2 = dVar;
        l.d(bVar2, "");
        l.d(dVar2, "");
        ((LiveTextView) bVar2.f10356a.getValue()).setText(dVar2.f10336a.f15626a);
        ((LiveTextView) bVar2.f10357b.getValue()).setText(dVar2.f10336a.f15627b);
        bVar2.c().setVisibility(8);
        com.bytedance.android.live.liveinteract.cohost.a.e.c.a(bVar2.b(), dVar2.f10336a);
        com.bytedance.android.live.liveinteract.cohost.a.e.c.a(bVar2.b(), this.f10355a);
        if (!bVar2.b().isEnabled() && com.bytedance.android.live.liveinteract.cohost.a.e.d.b()) {
            bVar2.c().setVisibility(0);
        }
    }
}
