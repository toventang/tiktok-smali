package com.ss.android.ugc.aweme.shortvideo.ui;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.tooltip.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f131776a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(86316);
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ e $activity;
        final /* synthetic */ View $mSaveDraftButton;

        static {
            Covode.recordClassIndex(86318);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, View view) {
            super(0);
            this.$activity = eVar;
            this.$mSaveDraftButton = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            final com.bytedance.tux.tooltip.a d2 = ((com.bytedance.tux.tooltip.a.b.a) new com.bytedance.tux.tooltip.a.b.a(this.$activity).b(this.$mSaveDraftButton).a(h.TOP)).e(R.string.esi).a(3000L).d();
            this.$mSaveDraftButton.post(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.ui.g.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f131780a;

                static {
                    Covode.recordClassIndex(86319);
                }

                {
                    this.f131780a = r1;
                }

                public final void run() {
                    if (!this.f131780a.$activity.isFinishing() && this.f131780a.$mSaveDraftButton.getVisibility() == 0) {
                        d2.a();
                    }
                }
            });
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ImageView f131777a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f131778b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f131779c;

        static {
            Covode.recordClassIndex(86317);
        }

        a(ImageView imageView, View view, View view2) {
            this.f131777a = imageView;
            this.f131778b = view;
            this.f131779c = view2;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            l.b(motionEvent, "");
            int action = motionEvent.getAction();
            if (action == 0) {
                ImageView imageView = this.f131777a;
                l.b(imageView, "");
                imageView.setAlpha(0.75f);
                View view2 = this.f131778b;
                l.b(view2, "");
                view2.setAlpha(0.75f);
                if (this.f131779c.getBackground() == null) {
                    return false;
                }
                Drawable background = this.f131779c.getBackground();
                l.b(background, "");
                background.setAlpha(191);
                return false;
            } else if (action != 1 && action != 3) {
                return false;
            } else {
                ImageView imageView2 = this.f131777a;
                l.b(imageView2, "");
                imageView2.setAlpha(1.0f);
                View view3 = this.f131778b;
                l.b(view3, "");
                view3.setAlpha(1.0f);
                if (this.f131779c.getBackground() == null) {
                    return false;
                }
                Drawable background2 = this.f131779c.getBackground();
                l.b(background2, "");
                background2.setAlpha(255);
                return false;
            }
        }
    }
}
