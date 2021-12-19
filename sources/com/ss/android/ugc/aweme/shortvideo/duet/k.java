package com.ss.android.ugc.aweme.shortvideo.duet;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.shortvideo.sticker.AVCircleProgressView;
import com.ss.android.ugc.aweme.shortvideo.sticker.StickerImageView;
import com.ss.android.ugc.aweme.sticker.StickerWrapper;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.ss.android.ugc.aweme.views.d;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.Objects;

public final class k extends RecyclerView.ViewHolder {

    /* renamed from: f  reason: collision with root package name */
    public static final a f126554f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    AVDmtImageTextView f126555a;

    /* renamed from: b  reason: collision with root package name */
    public StickerWrapper f126556b;

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f126557c;

    /* renamed from: d  reason: collision with root package name */
    public final f f126558d;

    /* renamed from: e  reason: collision with root package name */
    public final b f126559e;

    public interface b {
        static {
            Covode.recordClassIndex(83010);
        }

        void a(int i2, boolean z);
    }

    static {
        Covode.recordClassIndex(83007);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83009);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static Object a(String str) {
            l.d(str, "");
            String obj = p.b((CharSequence) str).toString();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = obj.toLowerCase();
            l.b(lowerCase, "");
            switch (lowerCase.hashCode()) {
                case -1984141450:
                    if (lowerCase.equals("vertical")) {
                        return 2131232277;
                    }
                    return str;
                case -865465250:
                    if (lowerCase.equals("triple")) {
                        return 2131232276;
                    }
                    return str;
                case 346401221:
                    if (lowerCase.equals("picture_in_picture")) {
                        return 2131232275;
                    }
                    return str;
                case 1387629604:
                    if (lowerCase.equals("horizontal")) {
                        return 2131232273;
                    }
                    return str;
                case 1415681320:
                    if (lowerCase.equals("green_screen")) {
                        return 2131232271;
                    }
                    return str;
                default:
                    return str;
            }
        }
    }

    public final void c(boolean z) {
        this.f126555a.a(z);
    }

    public static final /* synthetic */ StickerWrapper a(k kVar) {
        StickerWrapper stickerWrapper = kVar.f126556b;
        if (stickerWrapper == null) {
            l.a("duetLayoutEffect");
        }
        return stickerWrapper;
    }

    public static final class c implements IEffectDownloadProgressListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f126561a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f126562b;

        static {
            Covode.recordClassIndex(83011);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
            k.a(this.f126561a).f134689c = 2;
            k kVar = this.f126561a;
            kVar.a(k.a(kVar));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            k.a(this.f126561a).f134689c = 1;
            k kVar = this.f126561a;
            kVar.a(k.a(kVar));
            this.f126561a.b(this.f126562b);
        }

        c(k kVar, boolean z) {
            this.f126561a = kVar;
            this.f126562b = z;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            l.d(exceptionResult, "");
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f126561a.f126557c.getContext()).a(R.string.bbu).a();
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
        public final void onProgress(Effect effect, int i2, long j2) {
            k.a(this.f126561a).f134689c = 5;
            k.a(this.f126561a).f134691e = i2;
            k kVar = this.f126561a;
            kVar.a(k.a(kVar));
        }
    }

    public final void b(boolean z) {
        this.f126555a.a(true);
        this.f126559e.a(getAdapterPosition(), z);
        c(true);
    }

    public final void a(boolean z) {
        StickerWrapper stickerWrapper = this.f126556b;
        if (stickerWrapper == null) {
            l.a("duetLayoutEffect");
        }
        if (stickerWrapper.f134689c != 2) {
            StickerWrapper stickerWrapper2 = this.f126556b;
            if (stickerWrapper2 == null) {
                l.a("duetLayoutEffect");
            }
            if (stickerWrapper2.f134689c == 1) {
                b(z);
                return;
            }
            StickerWrapper stickerWrapper3 = this.f126556b;
            if (stickerWrapper3 == null) {
                l.a("duetLayoutEffect");
            }
            Effect effect = stickerWrapper3.f134687a;
            l.b(effect, "");
            this.f126558d.a(effect, new c(this, z));
        }
    }

    public final void a(StickerWrapper stickerWrapper) {
        AVDmtImageTextView aVDmtImageTextView = this.f126555a;
        int i2 = stickerWrapper.f134689c;
        int i3 = stickerWrapper.f134691e;
        StickerImageView stickerImageView = aVDmtImageTextView.f138668a;
        if (stickerImageView == null) {
            l.a("imageView");
        }
        if (i2 == 1) {
            ImageView imageView = stickerImageView.f130208b;
            if (imageView == null) {
                l.a("downloadImg");
            }
            imageView.setVisibility(4);
            AVCircleProgressView aVCircleProgressView = stickerImageView.f130209c;
            if (aVCircleProgressView == null) {
                l.a("progressView");
            }
            aVCircleProgressView.setVisibility(4);
        } else if (i2 == 2) {
            ImageView imageView2 = stickerImageView.f130208b;
            if (imageView2 == null) {
                l.a("downloadImg");
            }
            imageView2.setVisibility(4);
            AVCircleProgressView aVCircleProgressView2 = stickerImageView.f130209c;
            if (aVCircleProgressView2 == null) {
                l.a("progressView");
            }
            aVCircleProgressView2.setVisibility(0);
            AVCircleProgressView aVCircleProgressView3 = stickerImageView.f130209c;
            if (aVCircleProgressView3 == null) {
                l.a("progressView");
            }
            aVCircleProgressView3.setProgress(0);
        } else if (i2 == 3) {
            if (stickerImageView.f130210d) {
                ImageView imageView3 = stickerImageView.f130208b;
                if (imageView3 == null) {
                    l.a("downloadImg");
                }
                imageView3.setVisibility(0);
            } else {
                ImageView imageView4 = stickerImageView.f130208b;
                if (imageView4 == null) {
                    l.a("downloadImg");
                }
                imageView4.setVisibility(4);
            }
            AVCircleProgressView aVCircleProgressView4 = stickerImageView.f130209c;
            if (aVCircleProgressView4 == null) {
                l.a("progressView");
            }
            aVCircleProgressView4.setVisibility(4);
        } else if (i2 == 4) {
            ImageView imageView5 = stickerImageView.f130208b;
            if (imageView5 == null) {
                l.a("downloadImg");
            }
            imageView5.setVisibility(4);
            AVCircleProgressView aVCircleProgressView5 = stickerImageView.f130209c;
            if (aVCircleProgressView5 == null) {
                l.a("progressView");
            }
            aVCircleProgressView5.setVisibility(4);
        } else if (i2 == 5) {
            ImageView imageView6 = stickerImageView.f130208b;
            if (imageView6 == null) {
                l.a("downloadImg");
            }
            imageView6.setVisibility(4);
            AVCircleProgressView aVCircleProgressView6 = stickerImageView.f130209c;
            if (aVCircleProgressView6 == null) {
                l.a("progressView");
            }
            if (aVCircleProgressView6.getVisibility() != 0) {
                AVCircleProgressView aVCircleProgressView7 = stickerImageView.f130209c;
                if (aVCircleProgressView7 == null) {
                    l.a("progressView");
                }
                aVCircleProgressView7.setVisibility(0);
            }
            AVCircleProgressView aVCircleProgressView8 = stickerImageView.f130209c;
            if (aVCircleProgressView8 == null) {
                l.a("progressView");
            }
            aVCircleProgressView8.setProgress(i3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(FrameLayout frameLayout, f fVar, b bVar) {
        super(frameLayout);
        l.d(frameLayout, "");
        l.d(fVar, "");
        l.d(bVar, "");
        this.f126557c = frameLayout;
        this.f126558d = fVar;
        this.f126559e = bVar;
        View findViewById = frameLayout.findViewById(R.id.cn9);
        l.b(findViewById, "");
        this.f126555a = (AVDmtImageTextView) findViewById;
        this.itemView.setOnClickListener(new d(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.duet.k.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f126560a;

            static {
                Covode.recordClassIndex(83008);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f126560a = r1;
            }

            @Override // com.ss.android.ugc.aweme.views.d
            public final void a(View view) {
                l.d(view, "");
                this.f126560a.a(true);
            }
        });
    }
}
