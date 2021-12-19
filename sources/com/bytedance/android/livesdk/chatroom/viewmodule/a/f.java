package com.bytedance.android.livesdk.chatroom.viewmodule.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.android.live.design.view.j;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.live.slot.ae;
import com.bytedance.android.live.slot.ah;
import com.bytedance.android.live.slot.w;
import com.bytedance.android.live.t.a;
import com.bytedance.android.live.u.g;
import com.bytedance.android.livesdk.j.ea;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

public final class f implements com.bytedance.android.live.p.f, IIconSlot.a {

    /* renamed from: a  reason: collision with root package name */
    m f16388a;

    /* renamed from: b  reason: collision with root package name */
    public Context f16389b;

    /* renamed from: c  reason: collision with root package name */
    w f16390c;

    /* renamed from: d  reason: collision with root package name */
    public View f16391d;

    /* renamed from: e  reason: collision with root package name */
    public View f16392e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f16393f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f16394g;

    /* renamed from: h  reason: collision with root package name */
    long f16395h;

    /* renamed from: i  reason: collision with root package name */
    IIconSlot.SlotViewModel f16396i;

    /* renamed from: j  reason: collision with root package name */
    IIconSlot.c f16397j;

    /* renamed from: k  reason: collision with root package name */
    LiveTextView f16398k;

    /* renamed from: l  reason: collision with root package name */
    private ImageView f16399l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f16400m;

    static {
        Covode.recordClassIndex(9064);
    }

    @Override // com.bytedance.android.live.p.f
    public final void a() {
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(boolean z) {
    }

    @Override // com.bytedance.android.live.p.f
    public final void b() {
    }

    public final void onClick(View view) {
    }

    public final void c() {
        this.f16394g.setVisibility(8);
        this.f16393f.setVisibility(8);
        this.f16392e.setVisibility(8);
    }

    @Override // com.bytedance.android.live.slot.IIconSlot.a
    public final void a(IIconSlot.c cVar) {
        this.f16397j = cVar;
    }

    public f(Context context, m mVar) {
        this.f16389b = context;
        this.f16388a = mVar;
    }

    @Override // com.bytedance.android.live.slot.IIconSlot.a
    public final void a(ah ahVar, IIconSlot.SlotViewModel slotViewModel) {
        a(ahVar.f12758b, slotViewModel);
    }

    public final void a(Drawable drawable, Drawable drawable2) {
        if (!this.f16400m || drawable2 == null) {
            this.f16399l.setImageDrawable(drawable);
        } else {
            this.f16399l.setImageDrawable(drawable2);
        }
    }

    @Override // com.bytedance.android.live.p.f
    public final void b(View view, DataChannel dataChannel) {
        IIconSlot.SlotViewModel slotViewModel = this.f16396i;
        if (slotViewModel != null) {
            slotViewModel.a(this.f16388a);
        }
        w wVar = this.f16390c;
        if (wVar != null) {
            wVar.onDestroy();
            this.f16388a.getLifecycle().b(this.f16390c);
        }
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(View view, DataChannel dataChannel) {
        this.f16400m = Boolean.TRUE.equals(dataChannel.b(ea.class));
        this.f16391d = view;
        this.f16399l = (ImageView) view.findViewById(R.id.enn);
        this.f16393f = (TextView) view.findViewById(R.id.enh);
        this.f16394g = (ImageView) view.findViewById(R.id.eng);
        this.f16392e = view.findViewById(R.id.enk);
        this.f16391d.setVisibility(8);
        if (this.f16400m) {
            this.f16398k = (LiveTextView) view.findViewById(R.id.enr);
        }
        g.b(new g(this, dataChannel), null);
    }

    @Override // com.bytedance.android.live.slot.IIconSlot.a
    public final void a(final ab abVar, final IIconSlot.SlotViewModel slotViewModel) {
        this.f16396i = slotViewModel;
        if (slotViewModel != null && this.f16391d != null) {
            slotViewModel.f12713a.setValue(true);
            slotViewModel.f12714b.observe(this.f16388a, new u<Boolean>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.a.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(9065);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Boolean bool) {
                    int i2;
                    View view = f.this.f16391d;
                    if (Boolean.TRUE.equals(bool)) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    view.setVisibility(i2);
                    if (Boolean.TRUE.equals(bool)) {
                        abVar.a("during_live");
                    }
                }
            });
            slotViewModel.f12720h.observe(this.f16388a, new u<Drawable>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.a.f.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(9066);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Drawable drawable) {
                    int i2;
                    Drawable drawable2 = drawable;
                    f.this.c();
                    ImageView imageView = f.this.f16394g;
                    if (drawable2 == null) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    imageView.setVisibility(i2);
                    f.this.f16394g.setImageDrawable(drawable2);
                }
            });
            slotViewModel.f12716d.observe(this.f16388a, new u<Boolean>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.a.f.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(9067);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Boolean bool) {
                    Boolean bool2 = bool;
                    int i2 = 0;
                    if (bool2 == null) {
                        bool2 = false;
                    }
                    if (slotViewModel.f12720h.getValue() == null && TextUtils.isEmpty(slotViewModel.f12715c.getValue())) {
                        f.this.c();
                        View view = f.this.f16392e;
                        if (!bool2.booleanValue()) {
                            i2 = 8;
                        }
                        view.setVisibility(i2);
                    }
                }
            });
            slotViewModel.f12715c.observe(this.f16388a, new u<String>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.a.f.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(9068);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(String str) {
                    int i2;
                    String str2 = str;
                    if (slotViewModel.f12720h.getValue() == null) {
                        f.this.c();
                        TextView textView = f.this.f16393f;
                        if (TextUtils.isEmpty(str2)) {
                            i2 = 8;
                        } else {
                            i2 = 0;
                        }
                        textView.setVisibility(i2);
                        f.this.f16393f.setText(str2);
                    }
                }
            });
            slotViewModel.f12717e.observe(this.f16388a, new u<Drawable>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.a.f.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(9069);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Drawable drawable) {
                    f.this.a(drawable, slotViewModel.f12718f.getValue());
                }
            });
            slotViewModel.f12718f.observe(this.f16388a, new u<Drawable>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.a.f.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(9070);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Drawable drawable) {
                    f.this.a(slotViewModel.f12717e.getValue(), drawable);
                }
            });
            if (this.f16400m) {
                slotViewModel.f12721i.observe(this.f16388a, new h(this));
            }
            slotViewModel.f12723k.observe(this.f16388a, new u<String>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.a.f.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(9071);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(String str) {
                    String str2 = str;
                    if (Boolean.TRUE.equals(slotViewModel.f12714b.getValue())) {
                        f fVar = f.this;
                        long j2 = slotViewModel.f12725m;
                        j.a(fVar.f16395h);
                        fVar.f16395h = j.a(fVar.f16391d, str2, j2);
                    }
                }
            });
            this.f16391d.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.a.f.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(9072);
                }

                public final void onClick(View view) {
                    IIconSlot iIconSlot = (IIconSlot) abVar.f();
                    if (iIconSlot != null) {
                        ae a2 = iIconSlot.a();
                        if (a2 != null) {
                            a2.a(f.this.f16391d, "during_live");
                        } else if (!TextUtils.isEmpty(null)) {
                            ((IHostAction) a.a(IHostAction.class)).openLiveBrowser((String) null, slotViewModel.f12721i.getValue(), f.this.f16389b);
                        }
                    }
                }
            });
        }
    }
}
