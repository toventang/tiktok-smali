package com.bytedance.android.livesdk.ad;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.s.a;
import com.bytedance.android.live.s.a.b;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.f;
import com.zhiliaoapp.musically.R;
import java.util.Collection;

public final class c extends a implements a {

    /* renamed from: b  reason: collision with root package name */
    TextView f13655b;

    /* renamed from: c  reason: collision with root package name */
    View f13656c;

    /* renamed from: d  reason: collision with root package name */
    public HSImageView f13657d;

    /* renamed from: e  reason: collision with root package name */
    Context f13658e;

    /* renamed from: f  reason: collision with root package name */
    com.bytedance.android.live.s.a.a f13659f;

    /* renamed from: g  reason: collision with root package name */
    long f13660g;

    /* renamed from: h  reason: collision with root package name */
    long f13661h;

    /* renamed from: i  reason: collision with root package name */
    String f13662i;

    /* renamed from: j  reason: collision with root package name */
    private VHeadView f13663j;

    /* renamed from: k  reason: collision with root package name */
    private View f13664k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f13665l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f13666m;
    private boolean n;

    static {
        Covode.recordClassIndex(7572);
    }

    @Override // com.bytedance.android.live.s.a
    public final void a(b bVar, Exception exc) {
    }

    public static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.live.s.a
    public final void b(Exception exc) {
        this.f13655b.setVisibility(0);
        this.f13656c.setVisibility(8);
        com.bytedance.android.livesdk.utils.f.a(this.f13658e, exc);
    }

    @Override // com.bytedance.android.livesdk.ad.a
    public final <T> void a(T t) {
        ImageModel o;
        int i2;
        int i3;
        int i4;
        if (t instanceof com.bytedance.android.live.s.a.a) {
            T t2 = t;
            this.f13659f = t2;
            if (t2.f12597e != null) {
                p.a(this.f13663j, this.f13659f.f12597e);
            } else {
                this.f13663j.setImageResource(2131234424);
            }
            if (this.n) {
                this.f13664k.setVisibility(0);
                boolean z = this.f13659f.f12599g;
                this.f13655b.setVisibility(0);
                TextView textView = this.f13655b;
                if (z) {
                    i2 = R.string.eiy;
                } else {
                    i2 = R.string.eis;
                }
                textView.setText(i2);
                TextView textView2 = this.f13655b;
                if (z) {
                    i3 = R.drawable.bpe;
                } else {
                    i3 = R.drawable.bp8;
                }
                textView2.setBackground(y.c(i3));
                TextView textView3 = this.f13655b;
                if (z) {
                    i4 = R.color.uv;
                } else {
                    i4 = R.color.a0a;
                }
                textView3.setTextColor(y.b(i4));
                this.f13655b.setOnClickListener(new d(this));
            }
            this.f13663j.setOnClickListener(new e(this));
            this.f13666m.setText(this.f13659f.f12596d);
            this.f13665l.setText(this.f13659f.f12595c);
            if (this.f13659f.f12598f == null || (o = this.f13659f.f12598f.o()) == null || com.bytedance.common.utility.collection.b.a((Collection) o.getUrls())) {
                this.f13657d.setVisibility(8);
                return;
            }
            p.a(this.f13657d, o, 0, new p.a() {
                /* class com.bytedance.android.livesdk.ad.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(7573);
                }

                @Override // com.bytedance.android.live.core.f.p.a
                public final void a(ImageModel imageModel) {
                }

                @Override // com.bytedance.android.live.core.f.p.a
                public final void a(ImageModel imageModel, Exception exc) {
                }

                @Override // com.bytedance.android.live.core.f.p.a
                public final void a(ImageModel imageModel, int i2, int i3) {
                    ViewGroup.LayoutParams layoutParams = c.this.f13657d.getLayoutParams();
                    int a2 = y.a(32.0f);
                    layoutParams.width = a2;
                    layoutParams.height = (i3 * a2) / i2;
                    c.this.f13657d.setLayoutParams(layoutParams);
                }
            });
            this.f13657d.setVisibility(0);
        }
    }

    @Override // com.bytedance.android.live.s.a
    public final void a(boolean z, long j2) {
        this.f13656c.setVisibility(8);
        this.f13659f.f12599g = z;
        com.bytedance.android.livesdk.an.a.a().a(new f(j2));
    }

    public c(View view, String str, long j2, long j3, boolean z) {
        super(view);
        this.f13658e = view.getContext();
        this.f13660g = j2;
        this.n = z;
        this.f13661h = j3;
        this.f13662i = str;
        this.f13663j = (VHeadView) view.findViewById(R.id.bfb);
        this.f13655b = (TextView) view.findViewById(R.id.a1s);
        this.f13664k = view.findViewById(R.id.a1x);
        this.f13656c = view.findViewById(R.id.a1z);
        this.f13665l = (TextView) view.findViewById(R.id.cv_);
        this.f13666m = (TextView) view.findViewById(R.id.fdm);
        this.f13657d = (HSImageView) view.findViewById(R.id.fd6);
    }
}
