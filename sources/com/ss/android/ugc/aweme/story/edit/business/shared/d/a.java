package com.ss.android.ugc.aweme.story.edit.business.shared.d;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.story.base.widget.RoundCornerImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;

public final class a extends RecyclerView.ViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static final int f137311b = en.a(28.0d, i.f115645a);

    /* renamed from: c  reason: collision with root package name */
    public static final int f137312c = en.a(40.0d, i.f115645a);

    /* renamed from: d  reason: collision with root package name */
    public static final C3600a f137313d = new C3600a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.b<Integer, z> f137314a;

    /* renamed from: e  reason: collision with root package name */
    private final h f137315e;

    /* renamed from: f  reason: collision with root package name */
    private final h f137316f;

    /* renamed from: g  reason: collision with root package name */
    private final h f137317g;

    public final RoundCornerImageView a() {
        return (RoundCornerImageView) this.f137315e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.d.a$a  reason: collision with other inner class name */
    public static final class C3600a {
        static {
            Covode.recordClassIndex(89808);
        }

        private C3600a() {
        }

        public /* synthetic */ C3600a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<RoundCornerImageView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(89810);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RoundCornerImageView invoke() {
            return this.$itemView.findViewById(R.id.bvt);
        }
    }

    static final class d extends m implements h.f.a.a<View> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(89811);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.$itemView.findViewById(R.id.buh);
        }
    }

    static final class e extends m implements h.f.a.a<View> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(89812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.$itemView.findViewById(R.id.buj);
        }
    }

    static {
        Covode.recordClassIndex(89806);
    }

    static final class b extends m implements h.f.a.b<Bitmap, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(89809);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                this.this$0.a().setScaleType(ImageView.ScaleType.CENTER_CROP);
                this.this$0.a().setImageBitmap(bitmap2);
            } else {
                this.this$0.a().setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                this.this$0.a().setImageResource(2131233905);
            }
            return z.f158842a;
        }
    }

    public final void a(boolean z) {
        int i2;
        View view = (View) this.f137316f.getValue();
        int i3 = 0;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        View view2 = (View) this.f137317g.getValue();
        if (z) {
            i3 = 8;
        }
        view2.setVisibility(i3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view, h.f.a.b<? super Integer, z> bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
        this.f137314a = bVar;
        this.f137315e = h.i.a((h.f.a.a) new c(view));
        this.f137316f = h.i.a((h.f.a.a) new d(view));
        this.f137317g = h.i.a((h.f.a.a) new e(view));
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.story.edit.business.shared.d.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f137318a;

            static {
                Covode.recordClassIndex(89807);
            }

            {
                this.f137318a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f137318a.f137314a.invoke(Integer.valueOf(this.f137318a.getAdapterPosition()));
            }
        });
    }
}
