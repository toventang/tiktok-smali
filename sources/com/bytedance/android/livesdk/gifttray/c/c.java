package com.bytedance.android.livesdk.gifttray.c;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.gift.m;
import com.bytedance.android.live.gift.t;
import com.bytedance.android.livesdk.ba;
import com.bytedance.android.livesdk.gift.d.h;
import com.bytedance.android.livesdk.gifttray.a.a;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.service.animation.b;
import com.bytedance.android.livesdk.service.c.c.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public AnimatorSet f18051a;

    /* renamed from: b  reason: collision with root package name */
    public DataChannel f18052b;

    /* renamed from: c  reason: collision with root package name */
    public a f18053c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f18054d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f18055e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f18056f;

    /* renamed from: g  reason: collision with root package name */
    public Long f18057g = Long.valueOf((long) InteractFirstFrameTimeOutDurationSetting.DEFAULT);

    /* renamed from: h  reason: collision with root package name */
    public final b.c f18058h = new b.c() {
        /* class com.bytedance.android.livesdk.gifttray.c.c.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        long f18064a;

        static {
            Covode.recordClassIndex(10015);
        }

        @Override // com.bytedance.android.livesdk.service.animation.b.c
        public final void b() {
        }

        @Override // com.bytedance.android.livesdk.service.animation.b.c
        public final void c() {
        }

        @Override // com.bytedance.android.livesdk.service.animation.b.c
        public final void a() {
            this.f18064a = System.currentTimeMillis();
            c.this.postDelayed(new h(this), c.this.f18057g.longValue());
        }

        @Override // com.bytedance.android.livesdk.service.animation.b.c
        public final void d() {
            if (c.this.f18052b != null) {
                c.this.f18052b.c(m.class, true);
                Boolean bool = (Boolean) c.this.f18052b.b(cp.class);
                if (bool != null) {
                    if (c.this.f18056f || !bool.booleanValue()) {
                        c.this.f18052b.c(m.class, true);
                        c.this.f18052b.c(ba.class);
                    }
                }
            }
        }
    };

    /* renamed from: i  reason: collision with root package name */
    private final Context f18059i;

    /* renamed from: j  reason: collision with root package name */
    private ImageView f18060j;

    /* renamed from: k  reason: collision with root package name */
    private ImageView f18061k;

    /* renamed from: l  reason: collision with root package name */
    private LiveTextView f18062l;

    /* renamed from: m  reason: collision with root package name */
    private LiveTextView f18063m;
    private com.bytedance.android.livesdk.service.animation.c n;

    static {
        Covode.recordClassIndex(10014);
    }

    private int getLayoutResource() {
        return R.layout.bfj;
    }

    public c(Context context) {
        super(context);
        this.f18059i = context;
    }

    @Override // com.bytedance.android.livesdk.gifttray.c.a
    public final void a(com.bytedance.android.livesdk.service.animation.c cVar) {
        this.n = cVar;
        AnimatorSet a2 = b.a(this, y.g(), this.f18058h);
        this.f18051a = a2;
        a2.start();
    }

    @Override // com.bytedance.android.livesdk.gifttray.c.a
    public final void setGiftMessage(a aVar) {
        this.f18053c = aVar;
        setUI(com.bytedance.android.live.uikit.c.a.a(getContext()));
        this.f18057g = Long.valueOf(com.bytedance.android.livesdk.gifttray.d.c.a(this.f18053c.B));
        findViewById(R.id.rr).setBackground(com.bytedance.android.livesdk.gifttray.d.c.b(this.f18053c.B));
    }

    private void setUI(boolean z) {
        CharSequence charSequence;
        LiveTextView liveTextView = this.f18062l;
        if (liveTextView != null) {
            liveTextView.setText(this.f18053c.v);
            LiveTextView liveTextView2 = this.f18063m;
            if (TextUtils.isEmpty(this.f18053c.x)) {
                charSequence = "";
            } else {
                charSequence = this.f18053c.x;
            }
            liveTextView2.setText(charSequence);
            d.a.C0463a.f21379a.a(new d.a.b(this.f18053c.y), 99);
            if (!(this.f18053c.z == null || this.f18053c.z.getAvatarThumb() == null)) {
                a(this.f18054d, this.f18053c.z.getAvatarThumb());
            }
            if (!(this.f18053c.z == null || this.f18053c.z.getUserHonor() == null)) {
                a(this.f18061k, this.f18053c.z.getUserHonor().n());
            }
            ImageModel b2 = com.bytedance.android.livesdk.d.a.b(this.f18053c.z);
            if (b2 != null) {
                a(this.f18060j, b2);
            }
            if (this.f18053c.w != null) {
                a(this.f18055e, this.f18053c.w, false);
            }
            if (z) {
                getRootView().setPadding(0, 0, y.a(16.0f), 0);
            }
            invalidate();
        }
    }

    @Override // com.bytedance.android.livesdk.gifttray.c.a
    public final void a(DataChannel dataChannel) {
        MethodCollector.i(12120);
        this.f18052b = dataChannel;
        LayoutInflater.from(this.f18059i).inflate(getLayoutResource(), this);
        this.f18054d = (ImageView) findViewById(R.id.fcz);
        this.f18060j = (ImageView) findViewById(R.id.fcv);
        this.f18061k = (ImageView) findViewById(R.id.bgs);
        this.f18055e = (ImageView) findViewById(R.id.bb_);
        this.f18062l = (LiveTextView) findViewById(R.id.fdp);
        this.f18063m = (LiveTextView) findViewById(R.id.bax);
        this.f18055e.setOnClickListener(new d(this));
        this.f18062l.setOnClickListener(new e(this));
        this.f18063m.setOnClickListener(new f(this));
        findViewById(R.id.p4).setOnClickListener(new g(this, dataChannel));
        MethodCollector.o(12120);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        User user;
        long j2 = this.f18053c.y;
        h hVar = new h();
        hVar.f17851b = "gift_panel";
        hVar.f17854e = j2;
        Room room = (Room) this.f18052b.b(df.class);
        if (room != null) {
            user = room.getOwner();
        } else {
            user = null;
        }
        hVar.f17850a = user;
        this.f18052b.c(t.class, hVar);
        com.bytedance.android.livesdk.service.c.i.a.a(str);
    }

    private void a(ImageView imageView, ImageModel imageModel) {
        boolean z;
        if (this.f18055e != imageView) {
            z = true;
        } else {
            z = false;
        }
        a(imageView, imageModel, z);
    }

    @Override // com.bytedance.android.livesdk.gifttray.c.a
    public final void a(com.bytedance.android.livesdk.service.animation.c cVar, Boolean bool) {
        this.n = cVar;
        this.f18056f = bool.booleanValue();
        AnimatorSet a2 = b.a(this, y.g(), this.f18058h);
        this.f18051a = a2;
        a2.start();
    }

    private void a(final ImageView imageView, ImageModel imageModel, final boolean z) {
        ((e) com.bytedance.android.live.t.a.a(e.class)).a(imageModel, new e.b() {
            /* class com.bytedance.android.livesdk.gifttray.c.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(10016);
            }

            @Override // com.bytedance.android.livesdkapi.host.e.b
            public final void a(Bitmap bitmap) {
                Bitmap b2;
                if (bitmap != null) {
                    if (z) {
                        b2 = com.bytedance.android.livesdk.gift.c.a.a.a.a(bitmap);
                    } else {
                        b2 = com.bytedance.android.livesdk.gift.c.a.a.a.b(bitmap);
                    }
                    if (b2 != null && !b2.isRecycled()) {
                        imageView.setImageBitmap(b2);
                        if (imageView == c.this.f18054d) {
                            d.a.C0463a.f21379a.a(99);
                        } else if (imageView == c.this.f18055e) {
                            d.a.C0463a.f21379a.a(99, false);
                        }
                        c.this.invalidate();
                    }
                }
            }
        });
    }
}
