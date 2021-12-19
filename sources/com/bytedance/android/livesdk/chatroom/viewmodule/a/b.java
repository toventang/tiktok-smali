package com.bytedance.android.livesdk.chatroom.viewmodule.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.design.view.j;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p.f;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.live.slot.ac;
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

public final class b implements f, IIconSlot.a {

    /* renamed from: a  reason: collision with root package name */
    m f16348a;

    /* renamed from: b  reason: collision with root package name */
    public Context f16349b;

    /* renamed from: c  reason: collision with root package name */
    w f16350c;

    /* renamed from: d  reason: collision with root package name */
    public View f16351d;

    /* renamed from: e  reason: collision with root package name */
    public LottieAnimationView f16352e;

    /* renamed from: f  reason: collision with root package name */
    public View f16353f;

    /* renamed from: g  reason: collision with root package name */
    public View f16354g;

    /* renamed from: h  reason: collision with root package name */
    public TextView f16355h;

    /* renamed from: i  reason: collision with root package name */
    public ImageView f16356i;

    /* renamed from: j  reason: collision with root package name */
    long f16357j;

    /* renamed from: k  reason: collision with root package name */
    IIconSlot.SlotViewModel f16358k;

    /* renamed from: l  reason: collision with root package name */
    IIconSlot.c f16359l;

    /* renamed from: m  reason: collision with root package name */
    LiveTextView f16360m;
    private ImageView n;
    private boolean o;

    static {
        Covode.recordClassIndex(9047);
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
        this.f16356i.setVisibility(8);
        this.f16355h.setVisibility(8);
        this.f16354g.setVisibility(8);
    }

    @Override // com.bytedance.android.live.slot.IIconSlot.a
    public final void a(IIconSlot.c cVar) {
        this.f16359l = cVar;
    }

    public b(Context context, m mVar) {
        this.f16349b = context;
        this.f16348a = mVar;
    }

    @Override // com.bytedance.android.live.slot.IIconSlot.a
    public final void a(ah ahVar, IIconSlot.SlotViewModel slotViewModel) {
        a(ahVar.f12758b, slotViewModel);
    }

    public final void a(Drawable drawable, Drawable drawable2) {
        if (!this.o || drawable2 == null) {
            this.n.setImageDrawable(drawable);
        } else {
            this.n.setImageDrawable(drawable2);
        }
    }

    @Override // com.bytedance.android.live.p.f
    public final void b(View view, DataChannel dataChannel) {
        IIconSlot.SlotViewModel slotViewModel = this.f16358k;
        if (slotViewModel != null) {
            slotViewModel.a(this.f16348a);
        }
        w wVar = this.f16350c;
        if (wVar != null) {
            wVar.onDestroy();
            this.f16348a.getLifecycle().b(this.f16350c);
        }
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(View view, DataChannel dataChannel) {
        this.o = Boolean.TRUE.equals(dataChannel.b(ea.class));
        this.f16353f = view;
        this.n = (ImageView) view.findViewById(R.id.enn);
        this.f16355h = (TextView) view.findViewById(R.id.enh);
        this.f16356i = (ImageView) view.findViewById(R.id.eng);
        this.f16354g = view.findViewById(R.id.enk);
        this.f16352e = (LottieAnimationView) view.findViewById(R.id.eni);
        this.f16351d = view.findViewById(R.id.enj);
        this.f16353f.setVisibility(8);
        if (this.o) {
            this.f16360m = (LiveTextView) view.findViewById(R.id.enr);
        }
        g.b(new c(this, dataChannel), null);
    }

    @Override // com.bytedance.android.live.slot.IIconSlot.a
    public final void a(final ab abVar, final IIconSlot.SlotViewModel slotViewModel) {
        final IIconSlot iIconSlot = (IIconSlot) abVar.f();
        this.f16358k = slotViewModel;
        if (slotViewModel != null && this.f16353f != null) {
            slotViewModel.f12713a.setValue(true);
            slotViewModel.f12714b.observe(this.f16348a, new u<Boolean>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.a.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(9048);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Boolean bool) {
                    int i2;
                    String str;
                    View view = b.this.f16353f;
                    if (Boolean.TRUE.equals(bool)) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    view.setVisibility(i2);
                    if (Boolean.TRUE.equals(bool)) {
                        abVar.a("during_live");
                    }
                    if (Boolean.TRUE.equals(bool)) {
                        str = abVar.g();
                    } else {
                        str = "";
                    }
                    ac.b(str);
                }
            });
            slotViewModel.f12720h.observe(this.f16348a, new u<Drawable>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.a.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(9049);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Drawable drawable) {
                    int i2;
                    Drawable drawable2 = drawable;
                    b.this.c();
                    ImageView imageView = b.this.f16356i;
                    if (drawable2 == null) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    imageView.setVisibility(i2);
                    b.this.f16356i.setImageDrawable(drawable2);
                }
            });
            slotViewModel.f12716d.observe(this.f16348a, new u<Boolean>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.a.b.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(9050);
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
                        b.this.c();
                        View view = b.this.f16354g;
                        if (!bool2.booleanValue()) {
                            i2 = 8;
                        }
                        view.setVisibility(i2);
                    }
                }
            });
            slotViewModel.f12715c.observe(this.f16348a, new u<String>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.a.b.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(9051);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(String str) {
                    int i2;
                    String str2 = str;
                    if (slotViewModel.f12720h.getValue() == null) {
                        b.this.c();
                        TextView textView = b.this.f16355h;
                        if (TextUtils.isEmpty(str2)) {
                            i2 = 8;
                        } else {
                            i2 = 0;
                        }
                        textView.setVisibility(i2);
                        b.this.f16355h.setText(str2);
                    }
                }
            });
            slotViewModel.f12717e.observe(this.f16348a, new u<Drawable>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.a.b.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(9052);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Drawable drawable) {
                    b.this.a(drawable, slotViewModel.f12718f.getValue());
                }
            });
            slotViewModel.f12718f.observe(this.f16348a, new u<Drawable>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.a.b.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(9053);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Drawable drawable) {
                    b.this.a(slotViewModel.f12717e.getValue(), drawable);
                }
            });
            if (this.o) {
                slotViewModel.f12721i.observe(this.f16348a, new d(this));
            }
            slotViewModel.f12723k.observe(this.f16348a, new u<String>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.a.b.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(9054);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(String str) {
                    String str2 = str;
                    if (Boolean.TRUE.equals(slotViewModel.f12714b.getValue())) {
                        b bVar = b.this;
                        long j2 = slotViewModel.f12725m;
                        j.a(bVar.f16357j);
                        bVar.f16357j = j.a(bVar.f16353f, str2, j2);
                    }
                }
            });
            slotViewModel.f12724l.observe(this.f16348a, new u<Boolean>() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.a.b.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(9055);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Boolean bool) {
                    if (!Boolean.TRUE.equals(slotViewModel.f12714b.getValue()) || TextUtils.isEmpty(slotViewModel.o)) {
                        b.this.f16352e.d();
                        b.this.f16352e.setVisibility(8);
                        b.this.f16351d.setVisibility(0);
                    } else if (Boolean.FALSE.equals(bool)) {
                        b.this.f16352e.d();
                        b.this.f16352e.setVisibility(8);
                        b.this.f16351d.setVisibility(0);
                    } else {
                        b.this.f16352e.setVisibility(0);
                        b.this.f16351d.setVisibility(8);
                        b.this.f16352e.setImageAssetsFolder(slotViewModel.n);
                        b.this.f16352e.setAnimation(slotViewModel.o);
                        b.this.f16352e.a(iIconSlot.b());
                        b.this.f16352e.a(new AnimatorListenerAdapter() {
                            /* class com.bytedance.android.livesdk.chatroom.viewmodule.a.b.AnonymousClass8.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(9056);
                            }

                            public final void onAnimationEnd(Animator animator) {
                                super.onAnimationEnd(animator);
                            }
                        });
                        b.this.f16352e.a();
                    }
                }
            });
            this.f16353f.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.a.b.AnonymousClass9 */

                static {
                    Covode.recordClassIndex(9057);
                }

                public final void onClick(View view) {
                    ae a2 = iIconSlot.a();
                    if (a2 != null) {
                        a2.a(b.this.f16353f, "during_live");
                    } else if (!TextUtils.isEmpty(null)) {
                        ((IHostAction) a.a(IHostAction.class)).openLiveBrowser((String) null, slotViewModel.f12721i.getValue(), b.this.f16349b);
                    }
                }
            });
        }
    }
}
