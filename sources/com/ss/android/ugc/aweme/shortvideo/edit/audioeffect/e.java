package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.ss.android.ugc.aweme.views.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e extends RecyclerView.ViewHolder {

    /* renamed from: e  reason: collision with root package name */
    public static final a f126803e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    ImageView f126804a = ((ImageView) this.itemView.findViewById(R.id.btz));

    /* renamed from: b  reason: collision with root package name */
    AVDmtImageTextView f126805b = ((AVDmtImageTextView) this.itemView.findViewById(R.id.bnj));

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f126806c;

    /* renamed from: d  reason: collision with root package name */
    public final b f126807d;

    /* renamed from: f  reason: collision with root package name */
    private ObjectAnimator f126808f;

    /* renamed from: g  reason: collision with root package name */
    private int f126809g = -1;

    /* renamed from: h  reason: collision with root package name */
    private long f126810h;

    public interface b {
        static {
            Covode.recordClassIndex(83196);
        }

        void a(View view, int i2);
    }

    static {
        Covode.recordClassIndex(83193);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83195);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f126812a;

        static {
            Covode.recordClassIndex(83197);
        }

        c(e eVar) {
            this.f126812a = eVar;
        }

        public final void run() {
            this.f126812a.b();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if (getAdapterPosition() == 0) {
            return true;
        }
        return false;
    }

    public final void b() {
        ImageView imageView = this.f126804a;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        d();
    }

    private final void d() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.f126808f;
        if (!(objectAnimator2 == null || !objectAnimator2.isRunning() || (objectAnimator = this.f126808f) == null)) {
            objectAnimator.cancel();
        }
        ImageView imageView = this.f126804a;
        if (imageView != null) {
            imageView.setRotation(0.0f);
        }
    }

    private final void c() {
        ImageView imageView = this.f126804a;
        if (imageView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 360.0f);
            this.f126808f = ofFloat;
            if (ofFloat != null) {
                ofFloat.setDuration(800L);
            }
            ObjectAnimator objectAnimator = this.f126808f;
            if (objectAnimator != null) {
                objectAnimator.setRepeatMode(1);
            }
            ObjectAnimator objectAnimator2 = this.f126808f;
            if (objectAnimator2 != null) {
                objectAnimator2.setRepeatCount(-1);
            }
            ObjectAnimator objectAnimator3 = this.f126808f;
            if (objectAnimator3 != null) {
                objectAnimator3.start();
            }
        }
    }

    public final void a(boolean z) {
        AVDmtImageTextView aVDmtImageTextView = this.f126805b;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.a(z);
        }
    }

    public final void a(int i2) {
        int i3;
        if (!a() && i2 != (i3 = this.f126809g)) {
            this.f126809g = i2;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        this.f126810h = System.currentTimeMillis();
                        ImageView imageView = this.f126804a;
                        if (imageView != null) {
                            imageView.setVisibility(0);
                        }
                        ImageView imageView2 = this.f126804a;
                        if (imageView2 != null) {
                            imageView2.setImageResource(2131230948);
                        }
                        c();
                        return;
                    } else if (i2 != 3) {
                        return;
                    }
                } else if (2 != i3 || this.f126810h <= 0) {
                    b();
                    return;
                } else {
                    long currentTimeMillis = System.currentTimeMillis() - this.f126810h;
                    if (currentTimeMillis >= 100) {
                        b();
                        return;
                    } else {
                        this.itemView.postDelayed(new c(this), 100 - currentTimeMillis);
                        return;
                    }
                }
            }
            ImageView imageView3 = this.f126804a;
            if (imageView3 != null) {
                imageView3.setImageResource(2131232487);
            }
            ImageView imageView4 = this.f126804a;
            if (imageView4 != null) {
                imageView4.setVisibility(0);
            }
            d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(FrameLayout frameLayout, b bVar) {
        super(frameLayout);
        l.d(frameLayout, "");
        this.f126806c = frameLayout;
        this.f126807d = bVar;
        this.itemView.setOnClickListener(new d(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.e.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f126811a;

            static {
                Covode.recordClassIndex(83194);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f126811a = r1;
            }

            @Override // com.ss.android.ugc.aweme.views.d
            public final void a(View view) {
                l.d(view, "");
                b bVar = this.f126811a.f126807d;
                if (bVar != null) {
                    bVar.a(view, this.f126811a.getAdapterPosition());
                }
            }
        });
    }
}
