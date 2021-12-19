package com.ss.android.ugc.aweme.ftc.components.audioeffect;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends RecyclerView.ViewHolder {

    /* renamed from: e  reason: collision with root package name */
    public static final a f97636e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    ImageView f97637a = ((ImageView) this.itemView.findViewById(R.id.btz));

    /* renamed from: b  reason: collision with root package name */
    AVDmtImageTextView f97638b = ((AVDmtImageTextView) this.itemView.findViewById(R.id.bnj));

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f97639c;

    /* renamed from: d  reason: collision with root package name */
    public final b f97640d;

    /* renamed from: f  reason: collision with root package name */
    private ObjectAnimator f97641f;

    /* renamed from: g  reason: collision with root package name */
    private int f97642g = -1;

    /* renamed from: h  reason: collision with root package name */
    private long f97643h;

    public interface b {
        static {
            Covode.recordClassIndex(62040);
        }

        void a(View view, int i2);
    }

    static {
        Covode.recordClassIndex(62037);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(62039);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f97645a;

        static {
            Covode.recordClassIndex(62041);
        }

        c(d dVar) {
            this.f97645a = dVar;
        }

        public final void run() {
            this.f97645a.b();
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
        ImageView imageView = this.f97637a;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        d();
    }

    private final void d() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.f97641f;
        if (!(objectAnimator2 == null || !objectAnimator2.isRunning() || (objectAnimator = this.f97641f) == null)) {
            objectAnimator.cancel();
        }
        ImageView imageView = this.f97637a;
        if (imageView != null) {
            imageView.setRotation(0.0f);
        }
    }

    private final void c() {
        ImageView imageView = this.f97637a;
        if (imageView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 360.0f);
            this.f97641f = ofFloat;
            if (ofFloat != null) {
                ofFloat.setDuration(800L);
            }
            ObjectAnimator objectAnimator = this.f97641f;
            if (objectAnimator != null) {
                objectAnimator.setRepeatMode(1);
            }
            ObjectAnimator objectAnimator2 = this.f97641f;
            if (objectAnimator2 != null) {
                objectAnimator2.setRepeatCount(-1);
            }
            ObjectAnimator objectAnimator3 = this.f97641f;
            if (objectAnimator3 != null) {
                objectAnimator3.start();
            }
        }
    }

    public final void a(boolean z) {
        AVDmtImageTextView aVDmtImageTextView = this.f97638b;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.a(z);
        }
    }

    public final void a(int i2) {
        int i3;
        if (!a() && i2 != (i3 = this.f97642g)) {
            this.f97642g = i2;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        this.f97643h = System.currentTimeMillis();
                        ImageView imageView = this.f97637a;
                        if (imageView != null) {
                            imageView.setVisibility(0);
                        }
                        ImageView imageView2 = this.f97637a;
                        if (imageView2 != null) {
                            imageView2.setImageResource(2131230948);
                        }
                        c();
                        return;
                    } else if (i2 != 3) {
                        return;
                    }
                } else if (2 != i3 || this.f97643h <= 0) {
                    b();
                    return;
                } else {
                    long currentTimeMillis = System.currentTimeMillis() - this.f97643h;
                    if (currentTimeMillis >= 100) {
                        b();
                        return;
                    } else {
                        this.itemView.postDelayed(new c(this), 100 - currentTimeMillis);
                        return;
                    }
                }
            }
            ImageView imageView3 = this.f97637a;
            if (imageView3 != null) {
                imageView3.setImageResource(2131232487);
            }
            ImageView imageView4 = this.f97637a;
            if (imageView4 != null) {
                imageView4.setVisibility(0);
            }
            d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(FrameLayout frameLayout, b bVar) {
        super(frameLayout);
        l.d(frameLayout, "");
        this.f97639c = frameLayout;
        this.f97640d = bVar;
        this.itemView.setOnClickListener(new com.ss.android.ugc.aweme.views.d(this) {
            /* class com.ss.android.ugc.aweme.ftc.components.audioeffect.d.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f97644a;

            static {
                Covode.recordClassIndex(62038);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f97644a = r1;
            }

            @Override // com.ss.android.ugc.aweme.views.d
            public final void a(View view) {
                l.d(view, "");
                b bVar = this.f97644a.f97640d;
                if (bVar != null) {
                    bVar.a(view, this.f97644a.getAdapterPosition());
                }
            }
        });
    }
}
