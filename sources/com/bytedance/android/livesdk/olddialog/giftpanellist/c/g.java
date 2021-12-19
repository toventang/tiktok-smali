package com.bytedance.android.livesdk.olddialog.giftpanellist.c;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.service.c.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.zhiliaoapp.musically.R;

public final class g extends b {

    /* renamed from: a  reason: collision with root package name */
    ImageView f20073a = ((ImageView) this.f20065m.findViewById(R.id.baz));

    /* renamed from: b  reason: collision with root package name */
    private LiveTextView f20074b = ((LiveTextView) this.f20065m.findViewById(R.id.cuj));

    /* renamed from: c  reason: collision with root package name */
    private ImageView f20075c = ((ImageView) this.f20065m.findViewById(R.id.a84));

    static {
        Covode.recordClassIndex(11852);
    }

    public final void a() {
        if (!e()) {
            this.f20060h.postDelayed(new i(this), 50);
        }
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b
    public final void b() {
        super.b();
        this.f20073a.setVisibility(0);
        if (!e()) {
            this.f20060h.setVisibility(8);
        }
        this.f20059g.setVisibility(8);
        this.f20074b.setTextColor(y.b((int) R.color.xl));
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b
    public final void c() {
        super.c();
        this.f20060h.setVisibility(0);
        this.f20073a.setVisibility(8);
        this.f20059g.setVisibility(0);
        this.f20074b.setTextColor(y.b((int) R.color.xk));
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b
    public final boolean e() {
        ImageModel imageModel;
        if (this.f20062j == null || !(this.f20062j.f17864b instanceof u) || (imageModel = ((u) this.f20062j.f17864b).p) == null || imageModel.mUrls == null || imageModel.mUrls.size() <= 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b
    public final void d() {
        if (this.f20062j.f17864b instanceof u) {
            u uVar = (u) this.f20062j.f17864b;
            ImageModel imageModel = uVar.p;
            if (e()) {
                final long j2 = uVar.f19761d;
                final boolean z = false;
                try {
                    z = k.a(Uri.parse(imageModel.mUrls.get(0)));
                } catch (Exception unused) {
                }
                p.a(this.f20073a, imageModel, -1, -1, true, R.drawable.c4t, new p.a() {
                    /* class com.bytedance.android.livesdk.olddialog.giftpanellist.c.g.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(11853);
                    }

                    @Override // com.bytedance.android.live.core.f.p.a
                    public final void a(ImageModel imageModel) {
                        a.C0452a.C0453a.f21303a.a(j2, g.this.r);
                    }

                    @Override // com.bytedance.android.live.core.f.p.a
                    public final void a(ImageModel imageModel, Exception exc) {
                        String str;
                        if (exc.getMessage() != null) {
                            str = exc.getMessage();
                        } else {
                            str = "Download Error";
                        }
                        a.a(j2, str);
                    }

                    @Override // com.bytedance.android.live.core.f.p.a
                    public final void a(ImageModel imageModel, int i2, int i3) {
                        if (g.this.f20063k != null && g.this.f20063k.a() == g.this.f20062j) {
                            g.this.f20060h.setVisibility(8);
                        }
                        a.C0452a.C0453a.f21303a.a(j2, z);
                    }
                });
            } else {
                p.b(this.f20073a, uVar.f19759b);
            }
        }
        super.d();
    }

    public g(View view) {
        super(view);
        this.f20074b.setTypeface(b.a().a(d.f33801g));
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.c.b
    public final void a(com.bytedance.android.livesdk.gift.model.a.b bVar, int i2) {
        super.a(bVar, i2);
        this.f20073a.setVisibility(8);
        if (this.f20063k != null) {
            if (this.f20063k.a() == this.f20062j) {
                this.f20060h.setVisibility(8);
                this.f20073a.setVisibility(0);
            }
            if (this.f20063k.b(this.f20062j.d()) && !e()) {
                this.f20060h.postDelayed(new h(this), 50);
            }
        }
        this.f20075c.setVisibility(0);
        this.f20074b.setText(y.a((int) R.string.gr2, String.valueOf(((com.bytedance.android.livesdk.gift.model.a.a) this.f20062j).e())));
    }
}
