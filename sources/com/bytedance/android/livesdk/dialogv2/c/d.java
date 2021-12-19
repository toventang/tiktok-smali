package com.bytedance.android.livesdk.dialogv2.c;

import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.dialogv2.viewmodel.a;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.service.c.a.a;
import com.bytedance.android.livesdk.service.c.c.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class d extends a {

    /* renamed from: l  reason: collision with root package name */
    public ImageView f16993l;

    /* renamed from: m  reason: collision with root package name */
    private LiveTextView f16994m;
    private ImageView n;
    private final View o;

    static {
        Covode.recordClassIndex(9443);
    }

    @Override // com.bytedance.android.livesdk.dialogv2.c.a
    public final void h() {
        super.h();
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f16995a;

        static {
            Covode.recordClassIndex(9444);
        }

        a(d dVar) {
            this.f16995a = dVar;
        }

        public final void run() {
            com.bytedance.android.livesdk.service.animation.a.a.c(this.f16995a.f16993l).start();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.c.d$d  reason: collision with other inner class name */
    public static final class RunnableC0354d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f17001a;

        static {
            Covode.recordClassIndex(9447);
        }

        public RunnableC0354d(d dVar) {
            this.f17001a = dVar;
        }

        public final void run() {
            com.bytedance.android.livesdk.service.animation.a.a.c(this.f17001a.f16993l).start();
        }
    }

    @Override // com.bytedance.android.livesdk.dialogv2.c.a
    public final boolean e() {
        T t;
        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f16966g;
        T t2 = null;
        if (bVar != null) {
            t = bVar.f17864b;
        } else {
            t = null;
        }
        if (t instanceof u) {
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar2 = this.f16966g;
            if (bVar2 != null) {
                t2 = bVar2.f17864b;
            }
            Objects.requireNonNull(t2, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.Gift");
            ImageModel imageModel = ((u) t2).p;
            if (imageModel == null || imageModel.mUrls == null || imageModel.mUrls.size() <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.dialogv2.c.a
    public final void f() {
        super.f();
        HSImageView hSImageView = this.f16962c;
        if (hSImageView != null) {
            hSImageView.setVisibility(0);
        }
        ImageView imageView = this.f16993l;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        LiveTextView liveTextView = this.f16961b;
        if (liveTextView != null) {
            liveTextView.setVisibility(0);
        }
        LiveTextView liveTextView2 = this.f16994m;
        if (liveTextView2 != null) {
            liveTextView2.setTextColor(y.b((int) R.color.xk));
        }
    }

    @Override // com.bytedance.android.livesdk.dialogv2.c.a
    public final void g() {
        HSImageView hSImageView;
        super.g();
        ImageView imageView = this.f16993l;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        if (!e() && (hSImageView = this.f16962c) != null) {
            hSImageView.setVisibility(8);
        }
        LiveTextView liveTextView = this.f16961b;
        if (liveTextView != null) {
            liveTextView.setVisibility(8);
        }
        LiveTextView liveTextView2 = this.f16994m;
        if (liveTextView2 != null) {
            liveTextView2.setTextColor(y.b((int) R.color.xl));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.dialogv2.c.a
    public final void d() {
        T t;
        T t2;
        ImageModel imageModel;
        long j2;
        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f16966g;
        ImageModel imageModel2 = null;
        if (bVar != null) {
            t = bVar.f17864b;
        } else {
            t = null;
        }
        if (t instanceof u) {
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar2 = this.f16966g;
            if (bVar2 != null) {
                t2 = bVar2.f17864b;
            } else {
                t2 = null;
            }
            if (!(t2 instanceof u)) {
                t2 = null;
            }
            u uVar = (u) t2;
            if (uVar != null) {
                imageModel2 = uVar.p;
            }
            if (e()) {
                if (imageModel2 != null) {
                    if (uVar != null) {
                        j2 = uVar.f19761d;
                    } else {
                        j2 = 0;
                    }
                    boolean z = false;
                    try {
                        z = k.a(Uri.parse(imageModel2.mUrls.get(0)));
                    } catch (Exception unused) {
                    }
                    p.a(this.f16993l, imageModel2, -1, -1, true, R.drawable.c4t, new c(this, j2, z));
                }
            } else if (!(uVar == null || (imageModel = uVar.f19759b) == null)) {
                p.a(this.f16993l, imageModel, 2131234630, new b(this));
            }
        }
        super.d();
    }

    public static final class b implements p.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f16996a;

        /* renamed from: b  reason: collision with root package name */
        private long f16997b;

        static {
            Covode.recordClassIndex(9445);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(d dVar) {
            this.f16996a = dVar;
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel) {
            long j2;
            l.d(imageModel, "");
            com.bytedance.android.livesdk.service.c.c.a aVar = a.C0460a.C0461a.f21366a;
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f16996a.f16966g;
            if (bVar != null) {
                j2 = bVar.d();
            } else {
                j2 = 0;
            }
            aVar.a(j2);
            this.f16997b = SystemClock.elapsedRealtime();
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel, Exception exc) {
            long j2;
            l.d(imageModel, "");
            l.d(exc, "");
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f16996a.f16966g;
            long j3 = 0;
            if (bVar != null && bVar.f17863a == 1) {
                com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar2 = this.f16996a.f16966g;
                if (bVar2 != null) {
                    j2 = bVar2.d();
                } else {
                    j2 = 0;
                }
                com.bytedance.android.livesdk.service.c.g.a.a(j2, imageModel.getUri(), exc.getMessage());
            }
            try {
                com.bytedance.android.livesdk.service.c.c.a aVar = a.C0460a.C0461a.f21366a;
                com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar3 = this.f16996a.f16966g;
                if (bVar3 != null) {
                    j3 = bVar3.d();
                }
                aVar.c(j3);
            } catch (Exception unused) {
            }
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel, int i2, int i3) {
            long j2;
            String str;
            long j3;
            l.d(imageModel, "");
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f16996a.f16966g;
            long j4 = 0;
            if (bVar != null && bVar.f17863a == 1) {
                com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar2 = this.f16996a.f16966g;
                if (bVar2 != null) {
                    j3 = bVar2.d();
                } else {
                    j3 = 0;
                }
                com.bytedance.android.livesdk.service.c.g.a.a(j3, imageModel.getUri());
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f16997b;
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar3 = this.f16996a.f16966g;
            if (bVar3 != null) {
                j2 = bVar3.d();
            } else {
                j2 = 0;
            }
            if (imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
                str = "";
            } else {
                str = imageModel.getUrls().get(0);
            }
            l.b(str, "");
            com.bytedance.android.livesdk.service.c.c.c.a(elapsedRealtime, j2, str);
            try {
                com.bytedance.android.livesdk.service.c.c.a aVar = a.C0460a.C0461a.f21366a;
                com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar4 = this.f16996a.f16966g;
                if (bVar4 != null) {
                    j4 = bVar4.d();
                }
                aVar.b(j4);
            } catch (Exception unused) {
            }
        }
    }

    public static final class c implements p.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f16998a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f16999b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f17000c;

        static {
            Covode.recordClassIndex(9446);
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel) {
            l.d(imageModel, "");
            a.C0452a.C0453a.f21303a.a(this.f16999b, 0);
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel, Exception exc) {
            l.d(imageModel, "");
            l.d(exc, "");
            String message = exc.getMessage();
            if (message == null) {
                message = "Download Error";
            }
            com.bytedance.android.livesdk.service.c.a.a.a(this.f16999b, message);
        }

        c(d dVar, long j2, boolean z) {
            this.f16998a = dVar;
            this.f16999b = j2;
            this.f17000c = z;
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel, int i2, int i3) {
            HSImageView hSImageView;
            l.d(imageModel, "");
            long j2 = a.C0355a.C0356a.f17017a.f17010f;
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f16998a.f16966g;
            if (bVar != null && j2 == bVar.d() && a.C0355a.C0356a.f17017a.f17011g == this.f16998a.f16963d && (hSImageView = this.f16998a.f16962c) != null) {
                hSImageView.setVisibility(8);
            }
            a.C0452a.C0453a.f21303a.a(this.f16999b, this.f17000c);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view) {
        super(view);
        l.d(view, "");
        this.o = view;
        this.f16993l = (ImageView) view.findViewById(R.id.baz);
        this.f16994m = (LiveTextView) view.findViewById(R.id.cuj);
        this.n = (ImageView) view.findViewById(R.id.a84);
        LiveTextView liveTextView = this.f16994m;
        if (liveTextView != null) {
            liveTextView.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
        }
    }

    @Override // com.bytedance.android.livesdk.dialogv2.c.a
    public final void a(com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar, int i2, DataChannel dataChannel) {
        super.a(bVar, i2, dataChannel);
        ImageView imageView = this.f16993l;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        long j2 = a.C0355a.C0356a.f17017a.f17010f;
        if (bVar != null && j2 == bVar.d() && a.C0355a.C0356a.f17017a.f17011g == this.f16963d) {
            HSImageView hSImageView = this.f16962c;
            if (hSImageView != null) {
                hSImageView.setVisibility(8);
            }
            ImageView imageView2 = this.f16993l;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        }
        long j3 = a.C0355a.C0356a.f17017a.f17010f;
        if (bVar != null && j3 == bVar.d() && !e() && a.C0355a.C0356a.f17017a.f17012h) {
            a.C0355a.C0356a.f17017a.f17012h = false;
            HSImageView hSImageView2 = this.f16962c;
            if (hSImageView2 != null) {
                hSImageView2.postDelayed(new a(this), 50);
            }
        }
        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar2 = this.f16966g;
        Objects.requireNonNull(bVar2, "null cannot be cast to non-null type com.bytedance.android.livesdk.dialogv2.panel.GiftPanel");
        com.bytedance.android.livesdk.gift.model.a.a aVar = (com.bytedance.android.livesdk.gift.model.a.a) bVar2;
        ImageView imageView3 = this.n;
        if (imageView3 != null) {
            imageView3.setVisibility(0);
        }
        LiveTextView liveTextView = this.f16994m;
        if (liveTextView != null) {
            liveTextView.setText(y.a((int) R.string.gr2, String.valueOf(aVar.e())));
        }
    }
}
