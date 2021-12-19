package com.bytedance.android.live.liveinteract.multilive.e;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.multilive.c.r;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.utils.z;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.facebook.drawee.a.a.e;
import com.facebook.imagepipeline.o.c;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class d extends FrameLayout {
    @com.bytedance.android.live.liveinteract.api.c.d(a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a f11819a;

    /* renamed from: b  reason: collision with root package name */
    public f.a.b.b f11820b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11821c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11822d;

    /* renamed from: e  reason: collision with root package name */
    private DataChannel f11823e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f11824f;

    static {
        Covode.recordClassIndex(6445);
    }

    public final View a(int i2) {
        if (this.f11824f == null) {
            this.f11824f = new HashMap();
        }
        View view = (View) this.f11824f.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f11824f.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final DataChannel getMDataChannel() {
        return this.f11823e;
    }

    public final boolean getMIsNormalAudience() {
        return this.f11821c;
    }

    public final void a() {
        a(Boolean.valueOf(b()));
    }

    public final com.bytedance.android.live.liveinteract.multiguest.opt.a.a getMDataHolder() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11819a;
        if (aVar == null) {
            l.a("mDataHolder");
        }
        return aVar;
    }

    private boolean b() {
        long j2;
        String a2;
        Room room;
        DataChannel dataChannel = this.f11823e;
        if (dataChannel == null || (room = (Room) dataChannel.b(df.class)) == null) {
            j2 = 0;
        } else {
            j2 = room.getOwnerUserId();
        }
        if (j2 == 0 || (a2 = g.a.f14199a.a(j2)) == null || a2.length() == 0) {
            return true;
        }
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11819a;
        if (aVar == null) {
            l.a("mDataHolder");
        }
        Boolean bool = aVar.a().get(a2);
        if (bool == null) {
            bool = false;
        }
        if (!bool.booleanValue()) {
            return true;
        }
        return false;
    }

    private final void d() {
        ImageModel imageModel;
        List<String> urls;
        Room room;
        User owner;
        DataChannel dataChannel = this.f11823e;
        if (dataChannel == null || (room = (Room) dataChannel.b(df.class)) == null || (owner = room.getOwner()) == null) {
            imageModel = null;
        } else {
            imageModel = owner.getAvatarThumb();
        }
        z zVar = new z(5, 0.0f);
        if (imageModel == null || (urls = imageModel.getUrls()) == null || urls.size() != 0) {
            k.a((HSImageView) a(R.id.cz6), imageModel, zVar);
            return;
        }
        c a2 = c.a(com.facebook.common.k.g.a(2131234424));
        a2.f48454k = zVar;
        e b2 = com.facebook.drawee.a.a.c.b();
        b2.f47315c = (REQUEST) a2.a();
        com.facebook.drawee.view.c cVar = (com.facebook.drawee.view.c) a(R.id.cz6);
        l.b(cVar, "");
        b2.f47325m = cVar.getController();
        com.facebook.drawee.c.a c2 = b2.e();
        com.facebook.drawee.view.c cVar2 = (com.facebook.drawee.view.c) a(R.id.cz6);
        l.b(cVar2, "");
        cVar2.setController(c2);
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f11826a;

        static {
            Covode.recordClassIndex(6449);
        }

        b(d dVar) {
            this.f11826a = dVar;
        }

        public final void run() {
            HSImageView hSImageView = (HSImageView) this.f11826a.a(R.id.cz3);
            l.b(hSImageView, "");
            ViewGroup.LayoutParams layoutParams = hSImageView.getLayoutParams();
            ConstraintLayout.a aVar = null;
            if (!(layoutParams instanceof ConstraintLayout.a)) {
                layoutParams = null;
            }
            ConstraintLayout.a aVar2 = (ConstraintLayout.a) layoutParams;
            if (aVar2 != null) {
                if (this.f11826a.getMDataHolder().q == n.GRID || this.f11826a.getMDataHolder().q == n.GRID_FIX) {
                    aVar2.bottomMargin = y.a(0.0f);
                    aVar2.width = y.a(60.0f);
                    aVar2.height = y.a(60.0f);
                } else {
                    aVar2.bottomMargin = y.a(30.0f);
                    aVar2.width = y.a(70.0f);
                    aVar2.height = y.a(70.0f);
                }
                HSImageView hSImageView2 = (HSImageView) this.f11826a.a(R.id.cz3);
                l.b(hSImageView2, "");
                hSImageView2.setLayoutParams(aVar2);
                LiveTextView liveTextView = (LiveTextView) this.f11826a.a(R.id.exq);
                l.b(liveTextView, "");
                ViewGroup.LayoutParams layoutParams2 = liveTextView.getLayoutParams();
                if (layoutParams2 instanceof ConstraintLayout.a) {
                    aVar = layoutParams2;
                }
                ConstraintLayout.a aVar3 = aVar;
                if (aVar3 != null) {
                    aVar3.f2047d = R.id.cz3;
                    aVar3.f2050g = R.id.cz3;
                    aVar3.f2051h = R.id.cz3;
                    aVar3.f2054k = R.id.cz3;
                    aVar3.width = aVar2.width;
                    aVar3.height = aVar2.height;
                    LiveTextView liveTextView2 = (LiveTextView) this.f11826a.a(R.id.exq);
                    l.b(liveTextView2, "");
                    liveTextView2.setLayoutParams(aVar3);
                }
            }
        }
    }

    private final void c() {
        ImageModel imageModel;
        Room room;
        User owner;
        HSImageView hSImageView = (HSImageView) a(R.id.cz3);
        l.b(hSImageView, "");
        hSImageView.setVisibility(0);
        DataChannel dataChannel = this.f11823e;
        if (dataChannel == null || (room = (Room) dataChannel.b(df.class)) == null || (owner = room.getOwner()) == null) {
            imageModel = null;
        } else {
            imageModel = owner.getAvatarThumb();
        }
        HSImageView hSImageView2 = (HSImageView) a(R.id.cz3);
        l.b(hSImageView2, "");
        int width = hSImageView2.getWidth();
        HSImageView hSImageView3 = (HSImageView) a(R.id.cz3);
        l.b(hSImageView3, "");
        com.bytedance.android.livesdk.chatroom.g.g.a((ImageView) a(R.id.cz3), imageModel, width, hSImageView3.getHeight(), 2131234424);
        if (this.f11821c) {
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11819a;
            if (aVar == null) {
                l.a("mDataHolder");
            }
            if (aVar.q == n.FLOATING) {
                HSImageView hSImageView4 = (HSImageView) a(R.id.cz6);
                l.b(hSImageView4, "");
                hSImageView4.setVisibility(8);
                return;
            }
        }
        HSImageView hSImageView5 = (HSImageView) a(R.id.cz6);
        l.b(hSImageView5, "");
        hSImageView5.setVisibility(0);
        if (!this.f11822d) {
            d();
            this.f11822d = true;
        }
    }

    public final void setMDataChannel(DataChannel dataChannel) {
        this.f11823e = dataChannel;
    }

    public final void setMIsNormalAudience(boolean z) {
        this.f11821c = z;
    }

    public final void setMDataHolder(com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar) {
        l.d(aVar, "");
        this.f11819a = aVar;
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f11825a;

        static {
            Covode.recordClassIndex(6448);
        }

        a(d dVar) {
            this.f11825a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            long longValue = 5 - ((Number) obj).longValue();
            LiveTextView liveTextView = (LiveTextView) this.f11825a.a(R.id.exq);
            l.b(liveTextView, "");
            liveTextView.setText(String.valueOf(longValue));
            if (longValue == 0) {
                LiveTextView liveTextView2 = (LiveTextView) this.f11825a.a(R.id.exq);
                l.b(liveTextView2, "");
                liveTextView2.setVisibility(8);
                f.a.b.b bVar = this.f11825a.f11820b;
                if (bVar != null) {
                    bVar.dispose();
                }
            }
        }
    }

    public final void a(Boolean bool) {
        if (l.a((Object) bool, (Object) true)) {
            HSImageView hSImageView = (HSImageView) a(R.id.cz3);
            l.b(hSImageView, "");
            hSImageView.setVisibility(8);
            HSImageView hSImageView2 = (HSImageView) a(R.id.cz6);
            l.b(hSImageView2, "");
            hSImageView2.setVisibility(8);
            LiveTextView liveTextView = (LiveTextView) a(R.id.exq);
            l.b(liveTextView, "");
            liveTextView.setVisibility(8);
            return;
        }
        c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, DataChannel dataChannel, boolean z) {
        super(context);
        l.d(context, "");
        MethodCollector.i(7265);
        this.f11823e = dataChannel;
        this.f11821c = z;
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
        FrameLayout.inflate(context, R.layout.bex, this);
        a(Boolean.valueOf(b()));
        ((HSImageView) a(R.id.cz3)).post(new b(this));
        DataChannel dataChannel2 = this.f11823e;
        if (dataChannel2 != null) {
            dataChannel2.a(com.bytedance.android.live.liveinteract.multilive.anchor.b.a.class, (h.f.a.b) new h.f.a.b<com.bytedance.android.live.liveinteract.multilive.anchor.b.d, h.z>(this) {
                /* class com.bytedance.android.live.liveinteract.multilive.e.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(6446);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.android.live.liveinteract.multilive.anchor.b.d dVar) {
                    com.bytedance.android.live.liveinteract.multilive.anchor.b.d dVar2 = dVar;
                    l.d(dVar2, "");
                    if (dVar2.f11596a) {
                        LiveTextView liveTextView = (LiveTextView) this.this$0.a(R.id.exq);
                        l.b(liveTextView, "");
                        liveTextView.setVisibility(0);
                        d dVar3 = this.this$0;
                        dVar3.f11820b = com.bytedance.android.livesdk.utils.b.b.a(1, TimeUnit.SECONDS).b(6).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new a(dVar3));
                    } else {
                        this.this$0.a((Boolean) true);
                        f.a.b.b bVar = this.this$0.f11820b;
                        if (bVar != null) {
                            bVar.dispose();
                        }
                    }
                    return h.z.f158842a;
                }
            }).a(com.bytedance.android.live.liveinteract.multilive.c.l.class, (h.f.a.b) new h.f.a.b<r, h.z>(this) {
                /* class com.bytedance.android.live.liveinteract.multilive.e.d.AnonymousClass2 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(6447);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(r rVar) {
                    l.d(rVar, "");
                    if (!this.this$0.getMIsNormalAudience()) {
                        this.this$0.a();
                    }
                    return h.z.f158842a;
                }
            });
            MethodCollector.o(7265);
            return;
        }
        MethodCollector.o(7265);
    }
}
