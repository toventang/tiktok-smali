package com.bytedance.android.livesdk.olddialog.giftpanellist.c;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView;
import com.bytedance.android.livesdk.service.c.c.a;
import com.bytedance.android.livesdk.service.c.c.c;
import com.bytedance.android.livesdk.z.c.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

public abstract class b extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    private ImageView f20056a;

    /* renamed from: b  reason: collision with root package name */
    private LiveTextView f20057b;

    /* renamed from: f  reason: collision with root package name */
    protected ImageView f20058f;

    /* renamed from: g  reason: collision with root package name */
    protected LiveTextView f20059g;

    /* renamed from: h  reason: collision with root package name */
    protected HSImageView f20060h;

    /* renamed from: i  reason: collision with root package name */
    public DataChannel f20061i;

    /* renamed from: j  reason: collision with root package name */
    public com.bytedance.android.livesdk.gift.model.a.b f20062j;

    /* renamed from: k  reason: collision with root package name */
    a f20063k;

    /* renamed from: l  reason: collision with root package name */
    LiveNewSendGiftAnimationView f20064l;

    /* renamed from: m  reason: collision with root package name */
    View f20065m;
    protected View n;
    protected LiveTextView o;
    protected LiveTextView p;
    protected boolean q;
    protected int r;

    public interface a {
        static {
            Covode.recordClassIndex(11847);
        }

        com.bytedance.android.livesdk.gift.model.a.b a();

        void a(com.bytedance.android.livesdk.gift.model.a.b bVar, b bVar2);

        void a(b bVar);

        void a(b bVar, long j2, com.bytedance.android.livesdk.gift.model.a.b bVar2);

        void a(String str, String str2);

        boolean b(long j2);
    }

    static {
        Covode.recordClassIndex(11844);
    }

    public boolean e() {
        return false;
    }

    public void h() {
        this.f20064l.setVisibility(8);
        LiveNewSendGiftAnimationView liveNewSendGiftAnimationView = this.f20064l;
        if (liveNewSendGiftAnimationView != null) {
            liveNewSendGiftAnimationView.a();
        }
        this.q = false;
        if (this.f20063k.a() == this.f20062j) {
            b();
        }
    }

    public void c() {
        ImageView imageView;
        this.n.setVisibility(4);
        com.bytedance.android.livesdk.gift.model.a.b bVar = this.f20062j;
        if (bVar == null || bVar.f17864b == null || ((u) this.f20062j.f17864b).L == null || !((u) this.f20062j.f17864b).L.f19780b || (imageView = this.f20056a) == null) {
            ImageView imageView2 = this.f20056a;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                return;
            }
            return;
        }
        imageView.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public void d() {
        boolean z = false;
        try {
            z = k.a(Uri.parse(this.f20062j.c().getUrls().get(0)));
        } catch (Exception unused) {
        }
        a.C0460a.C0461a.f21366a.a(this.f20062j.d(), z);
        k.b(this.f20060h, this.f20062j.c(), new p.a() {
            /* class com.bytedance.android.livesdk.olddialog.giftpanellist.c.b.AnonymousClass2 */

            /* renamed from: b  reason: collision with root package name */
            private long f20068b;

            static {
                Covode.recordClassIndex(11846);
            }

            @Override // com.bytedance.android.live.core.f.p.a
            public final void a(ImageModel imageModel) {
                a.C0460a.C0461a.f21366a.a(b.this.f20062j.d());
                this.f20068b = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.android.live.core.f.p.a
            public final void a(ImageModel imageModel, Exception exc) {
                if (b.this.f20062j.f17863a == 1) {
                    com.bytedance.android.livesdk.service.c.g.a.a(b.this.f20062j.d(), imageModel.getUri(), exc.getMessage());
                }
                try {
                    a.C0460a.C0461a.f21366a.c(b.this.f20062j.d());
                } catch (Exception unused) {
                }
            }

            @Override // com.bytedance.android.live.core.f.p.a
            public final void a(ImageModel imageModel, int i2, int i3) {
                String str;
                if (b.this.f20062j.f17863a == 1) {
                    com.bytedance.android.livesdk.service.c.g.a.a(b.this.f20062j.d(), imageModel.getUri());
                }
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f20068b;
                long d2 = b.this.f20062j.d();
                if (imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
                    str = "";
                } else {
                    str = imageModel.getUrls().get(0);
                }
                c.a(elapsedRealtime, d2, str);
                try {
                    a.C0460a.C0461a.f21366a.b(b.this.f20062j.d());
                } catch (Exception unused) {
                }
            }
        });
    }

    public void b() {
        this.n.setVisibility(0);
        ImageView imageView = this.f20056a;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (this instanceof j) {
            return;
        }
        if (a.C0498a.f22936a.f22931a) {
            this.o.setVisibility(0);
            this.p.setVisibility(4);
            this.f20057b.setVisibility(4);
            return;
        }
        com.bytedance.android.livesdk.gift.model.a.b bVar = this.f20062j;
        if (bVar == null || ((u) bVar.f17864b).L == null || !((u) this.f20062j.f17864b).L.f19780b) {
            this.p.setVisibility(0);
            this.f20057b.setVisibility(4);
            this.o.setVisibility(4);
            return;
        }
        this.f20057b.setVisibility(0);
        this.p.setVisibility(4);
        this.o.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    public void g() {
        this.f20058f = (ImageView) this.f20065m.findViewById(R.id.c9v);
        this.f20059g = (LiveTextView) this.f20065m.findViewById(R.id.cul);
        this.f20060h = (HSImageView) this.f20065m.findViewById(R.id.cuk);
        this.n = this.f20065m.findViewById(R.id.es6);
        this.f20064l = (LiveNewSendGiftAnimationView) this.f20065m.findViewById(R.id.bb5);
        this.o = (LiveTextView) this.f20065m.findViewById(R.id.bs3);
        LiveTextView liveTextView = (LiveTextView) this.f20065m.findViewById(R.id.bsu);
        this.p = liveTextView;
        liveTextView.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(d.f33796b));
        this.f20059g.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(d.f33801g));
        this.f20057b = (LiveTextView) this.f20065m.findViewById(R.id.bsv);
        this.f20056a = (ImageView) this.f20065m.findViewById(R.id.ee3);
    }

    public b(View view) {
        super(view);
        this.f20065m = view;
        g();
    }

    public void a(a aVar) {
        this.f20065m.setOnClickListener(new c(this, aVar));
        this.f20065m.setOnTouchListener(new d(this));
        this.f20063k = aVar;
    }

    public void a(long j2) {
        if (j2 == this.f20062j.d()) {
            com.bytedance.android.livesdk.gift.model.a.b bVar = this.f20062j;
            if ((bVar instanceof com.bytedance.android.livesdk.dialogv2.b.d) || ((bVar instanceof com.bytedance.android.livesdk.dialogv2.b.c) && !((u) bVar.f17864b).a())) {
                this.f20064l.setVisibility(0);
                c();
                this.f20064l.a(new e(this));
                this.q = true;
            }
        }
    }

    public void b(long j2) {
        String concat;
        String concat2;
        if (j2 > 0 && !(this instanceof j)) {
            int i2 = (int) (j2 / 1000);
            int i3 = i2 / 60;
            int i4 = i2 % 60;
            if (i3 >= 10) {
                concat = String.valueOf(i3);
            } else {
                concat = "0".concat(String.valueOf(i3));
            }
            if (i4 >= 10) {
                concat2 = String.valueOf(i4);
            } else {
                concat2 = "0".concat(String.valueOf(i4));
            }
            this.o.setText(concat + " : " + concat2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        if (this.q) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            com.bytedance.android.livesdk.service.animation.a.a.a(view).start();
        } else if (1 == motionEvent.getAction()) {
            com.bytedance.android.livesdk.service.animation.a.a.b(view).start();
        } else if (3 == motionEvent.getAction()) {
            com.bytedance.android.livesdk.service.animation.a.a.b(view).start();
        }
        return false;
    }

    public void a(com.bytedance.android.livesdk.gift.model.a.b bVar, int i2) {
        ImageView imageView;
        this.f20062j = bVar;
        this.f20059g.setText(bVar.a());
        this.f20059g.setVisibility(0);
        this.f20060h.setVisibility(0);
        this.n.setVisibility(4);
        this.p.setVisibility(0);
        if (((u) this.f20062j.f17864b).L == null || !((u) this.f20062j.f17864b).L.f19780b || (imageView = this.f20056a) == null) {
            ImageView imageView2 = this.f20056a;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        } else {
            imageView.setVisibility(0);
        }
        a aVar = this.f20063k;
        if (aVar != null && aVar.a() == this.f20062j) {
            this.n.setVisibility(0);
            if (!(this instanceof j)) {
                if (a.C0498a.f22936a.f22931a) {
                    this.o.setVisibility(0);
                    this.p.setVisibility(4);
                    this.f20057b.setVisibility(4);
                } else if (((u) this.f20062j.f17864b).L == null || !((u) this.f20062j.f17864b).L.f19780b) {
                    this.p.setVisibility(0);
                    this.f20057b.setVisibility(4);
                    this.o.setVisibility(4);
                } else {
                    this.f20057b.setVisibility(0);
                    ImageView imageView3 = this.f20056a;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    }
                    this.o.setVisibility(4);
                    this.p.setVisibility(4);
                }
            }
            this.f20059g.setVisibility(8);
            this.f20063k.a(this);
        }
        this.r = i2;
        if (this.f20062j.f() == null || TextUtils.isEmpty(this.f20062j.f().getUri())) {
            this.f20058f.setVisibility(8);
        } else {
            this.f20058f.setVisibility(0);
            p.a(this.f20058f, this.f20062j.f(), 0, new p.a() {
                /* class com.bytedance.android.livesdk.olddialog.giftpanellist.c.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(11845);
                }

                @Override // com.bytedance.android.live.core.f.p.a
                public final void a(ImageModel imageModel) {
                }

                @Override // com.bytedance.android.live.core.f.p.a
                public final void a(ImageModel imageModel, Exception exc) {
                }

                @Override // com.bytedance.android.live.core.f.p.a
                public final void a(ImageModel imageModel, int i2, int i3) {
                    if (i2 != 0 && i3 != 0) {
                        ViewGroup.LayoutParams layoutParams = b.this.f20058f.getLayoutParams();
                        layoutParams.width = (i2 * y.a(13.0f)) / i3;
                        b.this.f20058f.setLayoutParams(layoutParams);
                    }
                }
            });
        }
        d();
    }
}
