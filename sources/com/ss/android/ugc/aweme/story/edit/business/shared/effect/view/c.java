package com.ss.android.ugc.aweme.story.edit.business.shared.effect.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.shortvideo.sticker.StickerImageView;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageView;
import com.ss.android.ugc.aweme.views.CircleDraweeView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;

public final class c extends RecyclerView.ViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static final int f137401b = en.a(16.0d, i.f115645a);

    /* renamed from: c  reason: collision with root package name */
    public static final a f137402c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.b<Integer, z> f137403a;

    /* renamed from: d  reason: collision with root package name */
    private final h f137404d;

    /* renamed from: e  reason: collision with root package name */
    private final h f137405e;

    /* renamed from: f  reason: collision with root package name */
    private ObjectAnimator f137406f;

    /* renamed from: g  reason: collision with root package name */
    private int f137407g = 1;

    private final AVDmtImageTextView a() {
        return (AVDmtImageTextView) this.f137404d.getValue();
    }

    private final AVDmtImageView b() {
        return (AVDmtImageView) this.f137405e.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89864);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<AVDmtImageView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(89865);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AVDmtImageView invoke() {
            return this.$itemView.findViewById(R.id.bwk);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.view.c$c  reason: collision with other inner class name */
    static final class C3606c extends m implements h.f.a.a<AVDmtImageTextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(89866);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3606c(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AVDmtImageTextView invoke() {
            return this.$itemView.findViewById(R.id.atx);
        }
    }

    static {
        Covode.recordClassIndex(89862);
    }

    private final void d() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.f137406f;
        if (!(objectAnimator2 == null || !objectAnimator2.isRunning() || (objectAnimator = this.f137406f) == null)) {
            objectAnimator.cancel();
        }
        b().setRotation(0.0f);
        b().setImageResource(2131230946);
    }

    private final void c() {
        b().setVisibility(0);
        b().setImageResource(2131230948);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b(), "rotation", 0.0f, 360.0f);
        this.f137406f = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(800L);
        }
        ObjectAnimator objectAnimator = this.f137406f;
        if (objectAnimator != null) {
            objectAnimator.setRepeatMode(1);
        }
        ObjectAnimator objectAnimator2 = this.f137406f;
        if (objectAnimator2 != null) {
            objectAnimator2.setRepeatCount(-1);
        }
        ObjectAnimator objectAnimator3 = this.f137406f;
        if (objectAnimator3 != null) {
            objectAnimator3.start();
        }
    }

    public final void a(boolean z) {
        a().a(z);
    }

    private void a(int i2) {
        if (this.f137407g != i2) {
            this.f137407g = i2;
            if (i2 == 2) {
                d();
                b().setVisibility(0);
            } else if (i2 == 4) {
                b().setVisibility(8);
            } else if (i2 == 8) {
                c();
            } else if (i2 == 16) {
                d();
                b().setVisibility(8);
            } else if (i2 == 32) {
                b().setVisibility(0);
                d();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(View view, h.f.a.b<? super Integer, z> bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
        this.f137403a = bVar;
        this.f137404d = h.i.a((h.f.a.a) new C3606c(view));
        this.f137405e = h.i.a((h.f.a.a) new b(view));
        a().setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.story.edit.business.shared.effect.view.c.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f137408a;

            static {
                Covode.recordClassIndex(89863);
            }

            {
                this.f137408a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                int adapterPosition = this.f137408a.getAdapterPosition();
                if (adapterPosition != -1) {
                    this.f137408a.f137403a.invoke(Integer.valueOf(adapterPosition));
                }
            }
        });
        StickerImageView stickerImageView = a().f138668a;
        if (stickerImageView == null) {
            l.a("imageView");
        }
        if (!stickerImageView.f130211e) {
            CircleDraweeView circleDraweeView = stickerImageView.f130207a;
            if (circleDraweeView == null) {
                l.a("iconImageView");
            }
            circleDraweeView.f144434d = true;
        }
        AVDmtImageTextView a2 = a();
        int i2 = CircleDraweeView.f144431a;
        float a3 = (float) en.a(10.0d, i.f115645a);
        StickerImageView stickerImageView2 = a2.f138668a;
        if (stickerImageView2 == null) {
            l.a("imageView");
        }
        if (!stickerImageView2.f130211e) {
            CircleDraweeView circleDraweeView2 = stickerImageView2.f130207a;
            if (circleDraweeView2 == null) {
                l.a("iconImageView");
            }
            circleDraweeView2.setClipStyle(i2);
            if (i2 == CircleDraweeView.f144431a) {
                CircleDraweeView circleDraweeView3 = stickerImageView2.f130207a;
                if (circleDraweeView3 == null) {
                    l.a("iconImageView");
                }
                circleDraweeView3.setRectFRadius(a3);
            }
        }
    }

    private final void a(EffectModel effectModel, int i2) {
        String str;
        String str2;
        if (i2 == 0) {
            str = "tag_none";
        } else if (effectModel != null) {
            str = effectModel.iconUrl;
        } else {
            str = null;
        }
        if (!l.a((Object) str, a().getTag())) {
            String str3 = "";
            if (i2 == 0) {
                AVDmtImageTextView a2 = a();
                View view = this.itemView;
                l.b(view, str3);
                Context context = view.getContext();
                l.b(context, str3);
                a2.a(context.getResources().getDrawable(2131232513), f137401b);
            } else {
                AVDmtImageTextView a3 = a();
                if (!(effectModel == null || (str2 = effectModel.iconUrl) == null)) {
                    str3 = str2;
                }
                a3.a(str3, Bitmap.Config.RGB_565);
            }
            a().setTag(str);
        }
    }

    public final void a(int i2, EffectModel effectModel, int i3, int i4) {
        boolean z = false;
        if (i2 == 0) {
            AVDmtImageTextView a2 = a();
            View view = this.itemView;
            l.b(view, "");
            a2.setText(view.getResources().getString(R.string.dig));
            b().setVisibility(8);
        } else if (effectModel != null) {
            a().setImageViewPadding(0);
            a().setText(effectModel.name);
        }
        a(effectModel, i2);
        a(i3);
        if (i2 == i4) {
            z = true;
        }
        a(z);
    }
}
