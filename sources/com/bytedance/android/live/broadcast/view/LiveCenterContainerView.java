package com.bytedance.android.live.broadcast.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.b.i;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.u.h;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.bm;
import com.bytedance.android.livesdk.j.bn;
import com.bytedance.android.livesdk.j.bo;
import com.bytedance.android.livesdk.j.bp;
import com.bytedance.android.livesdk.j.bq;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastLiveCenterUrl;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import org.json.JSONObject;

public final class LiveCenterContainerView extends FrameLayout implements com.bytedance.ies.xbridge.e.d {

    /* renamed from: e  reason: collision with root package name */
    public static final a f8660e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final float f8661a;

    /* renamed from: b  reason: collision with root package name */
    public String f8662b;

    /* renamed from: c  reason: collision with root package name */
    public DataChannel f8663c;

    /* renamed from: d  reason: collision with root package name */
    public bp f8664d;

    /* renamed from: f  reason: collision with root package name */
    private long f8665f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f8666g;

    /* renamed from: h  reason: collision with root package name */
    private float f8667h;

    /* renamed from: i  reason: collision with root package name */
    private float f8668i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f8669j;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.android.live.b.i f8670k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f8671l;

    /* renamed from: m  reason: collision with root package name */
    private bp f8672m;
    private final f.a.b.a n;
    private GestureDetectLayout o;
    private HashMap p;

    static {
        Covode.recordClassIndex(4433);
    }

    public LiveCenterContainerView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public LiveCenterContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4435);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class f extends com.bytedance.android.live.b.e {
        static {
            Covode.recordClassIndex(4441);
        }

        f() {
        }
    }

    public final DataChannel getDataChannel() {
        return this.f8663c;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.rank.api.a.a.class).d(new g(this)));
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8662b = null;
        com.bytedance.ies.xbridge.e.b.b("anchor_center_request_room_info", this);
        com.bytedance.ies.xbridge.e.b.b("live_anchor_center_mask_close", this);
        com.bytedance.android.live.b.i iVar = this.f8670k;
        if (iVar != null) {
            iVar.a();
        }
        this.n.a();
    }

    public final void a() {
        if (!this.f8671l) {
            this.f8671l = true;
            com.bytedance.android.live.b.i iVar = this.f8670k;
            if (iVar != null) {
                String value = BroadcastLiveCenterUrl.INSTANCE.getValue();
                if (this.p == null) {
                    this.p = new HashMap();
                }
                View view = (View) this.p.get(Integer.valueOf((int) R.id.cc9));
                if (view == null) {
                    view = findViewById(R.id.cc9);
                    this.p.put(Integer.valueOf((int) R.id.cc9), view);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                l.b(frameLayout, "");
                i.b.a(iVar, "lynx", value, "", frameLayout, new f());
            }
        }
    }

    static final class b extends m implements h.f.a.b<z, z> {
        final /* synthetic */ LiveCenterContainerView this$0;

        static {
            Covode.recordClassIndex(4436);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LiveCenterContainerView liveCenterContainerView) {
            super(1);
            this.this$0 = liveCenterContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            l.d(zVar, "");
            LiveCenterContainerView.a(this.this$0, null, false, 3);
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<z, z> {
        final /* synthetic */ LiveCenterContainerView this$0;

        static {
            Covode.recordClassIndex(4437);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(LiveCenterContainerView liveCenterContainerView) {
            super(1);
            this.this$0 = liveCenterContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            l.d(zVar, "");
            LiveCenterContainerView.b(this.this$0, null, false, 3);
            return z.f158842a;
        }
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveCenterContainerView f8674a;

        static {
            Covode.recordClassIndex(4442);
        }

        g(LiveCenterContainerView liveCenterContainerView) {
            this.f8674a = liveCenterContainerView;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (((com.bytedance.android.livesdk.rank.api.a.a) obj).f20582b == 1) {
                LiveCenterContainerView.b(this.f8674a, null, false, 3);
            }
        }
    }

    private final void setStatus(bp bpVar) {
        this.f8664d = bpVar;
        DataChannel dataChannel = this.f8663c;
        if (dataChannel != null) {
            dataChannel.b(bq.class, bpVar);
        }
    }

    public final void setGestureDetectLayout(GestureDetectLayout gestureDetectLayout) {
        this.o = gestureDetectLayout;
        if (gestureDetectLayout != null) {
            gestureDetectLayout.a(new h(this));
            gestureDetectLayout.f22478a.add(new i(this));
        }
    }

    static final class e extends m implements h.f.a.b<z, z> {
        final /* synthetic */ LiveCenterContainerView this$0;

        static {
            Covode.recordClassIndex(4439);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(LiveCenterContainerView liveCenterContainerView) {
            super(1);
            this.this$0 = liveCenterContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            l.d(zVar, "");
            if (com.bytedance.android.live.u.h.f12829a) {
                AnonymousClass1 r1 = new h.f.a.a<z>(this.this$0) {
                    /* class com.bytedance.android.live.broadcast.view.LiveCenterContainerView.e.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(4440);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        ((LiveCenterContainerView) this.receiver).a();
                        return z.f158842a;
                    }
                };
                l.d(r1, "");
                com.bytedance.android.live.u.h.a(null, new h.b(r1), 0, 8000);
            }
            return z.f158842a;
        }
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.f8663c = dataChannel;
        if (dataChannel != null) {
            dataChannel.a(bo.class, (h.f.a.b) new b(this)).a(bm.class, (h.f.a.b) new c(this)).a(com.bytedance.android.live.liveinteract.api.b.i.class, (h.f.a.b) new d(this)).b(bn.class, (h.f.a.b) new e(this));
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.android.live.liveinteract.api.b.h, z> {
        final /* synthetic */ LiveCenterContainerView this$0;

        static {
            Covode.recordClassIndex(4438);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(LiveCenterContainerView liveCenterContainerView) {
            super(1);
            this.this$0 = liveCenterContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.live.liveinteract.api.b.h hVar) {
            com.bytedance.android.live.liveinteract.api.b.h hVar2 = hVar;
            l.d(hVar2, "");
            if (!l.a((Object) this.this$0.f8662b, (Object) hVar2.f9995a)) {
                if (l.a((Object) hVar2.f9995a, (Object) com.bytedance.android.live.liveinteract.api.b.h.f9989f)) {
                    LiveCenterContainerView.b(this.this$0, null, false, 3);
                } else if (l.a((Object) hVar2.f9995a, (Object) com.bytedance.android.live.liveinteract.api.b.h.f9987d) && (!l.a((Object) this.this$0.f8662b, (Object) com.bytedance.android.live.liveinteract.api.b.h.f9989f))) {
                    LiveCenterContainerView.b(this.this$0, null, false, 3);
                }
                this.this$0.f8662b = hVar2.f9995a;
            }
            return z.f158842a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        if (r1 != 3) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 235
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.view.LiveCenterContainerView.a(android.view.MotionEvent):void");
    }

    @Override // com.bytedance.ies.xbridge.e.d
    public final void a(com.bytedance.ies.xbridge.e.c cVar) {
        Room room;
        RoomAuthStatus roomAuthStatus;
        l.d(cVar, "");
        Boolean bool = null;
        if (l.a((Object) cVar.f35926a, (Object) "anchor_center_request_room_info")) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("room_id", String.valueOf(com.bytedance.android.livesdk.ab.e.i()));
            DataChannel dataChannel = this.f8663c;
            if (!(dataChannel == null || (room = (Room) dataChannel.b(df.class)) == null || (roomAuthStatus = room.getRoomAuthStatus()) == null)) {
                bool = Boolean.valueOf(roomAuthStatus.isEnableGift());
            }
            jSONObject.put("gift_permission", bool);
            com.bytedance.ies.xbridge.e.b.a(new com.bytedance.ies.xbridge.e.a("anchor_center_response_room_info", currentTimeMillis, new com.bytedance.ies.xbridge.model.a.a.d(jSONObject)));
        } else if (l.a((Object) cVar.f35926a, (Object) "live_anchor_center_mask_close")) {
            b(this, null, false, 3);
        }
    }

    static final class h implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveCenterContainerView f8675a;

        static {
            Covode.recordClassIndex(4443);
        }

        h(LiveCenterContainerView liveCenterContainerView) {
            this.f8675a = liveCenterContainerView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f8675a.a(motionEvent);
            return false;
        }
    }

    static final class i implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveCenterContainerView f8676a;

        static {
            Covode.recordClassIndex(4444);
        }

        i(LiveCenterContainerView liveCenterContainerView) {
            this.f8676a = liveCenterContainerView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f8676a.a(motionEvent);
            return false;
        }
    }

    private final void a(String str, boolean z) {
        if (this.f8664d != bp.SHOWING) {
            if (com.bytedance.android.live.u.h.f12829a) {
                a();
            }
            if (z) {
                ObjectAnimator.ofFloat(this, "translationX", 0.0f).setDuration(300L).start();
            } else {
                setTranslationX(0.0f);
            }
            setStatus(bp.SHOWING);
            this.f8665f = SystemClock.elapsedRealtime();
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("room_id", String.valueOf(com.bytedance.android.livesdk.ab.e.i()));
            com.bytedance.ies.xbridge.e.b.a(new com.bytedance.ies.xbridge.e.a("live_anchor_center_mask_will_appear", currentTimeMillis, new com.bytedance.ies.xbridge.model.a.a.d(jSONObject)));
            if (this.f8672m != bp.SHOWING) {
                b.a.a("livesdk_live_center_show").a(this.f8663c).a("enter_type", str).b();
            }
            this.f8672m = bp.SHOWING;
        }
    }

    private final void b(String str, boolean z) {
        if (this.f8664d != bp.DISMISS) {
            if (z) {
                ObjectAnimator.ofFloat(this, "translationX", this.f8661a).setDuration(300L).start();
            } else {
                setTranslationX(this.f8661a);
            }
            setStatus(bp.DISMISS);
            if (this.f8672m != bp.DISMISS) {
                b.a.a("livesdk_live_center_leave").a(this.f8663c).a("leave_type", str).a("duration", SystemClock.elapsedRealtime() - this.f8665f).b();
            }
            this.f8672m = bp.DISMISS;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ LiveCenterContainerView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LiveCenterContainerView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        int c2;
        l.d(context, "");
        MethodCollector.i(6608);
        boolean g2 = y.g();
        this.f8666g = g2;
        if (g2) {
            c2 = -y.c();
        } else {
            c2 = y.c();
        }
        this.f8661a = (float) c2;
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class);
        l.b(a2, "");
        this.f8670k = ((com.bytedance.android.live.b.f) a2).getHybridContainerManager();
        this.f8672m = bp.DISMISS;
        this.n = new f.a.b.a();
        addView(com.bytedance.android.b.a(R.layout.bf5, this));
        post(new Runnable(this) {
            /* class com.bytedance.android.live.broadcast.view.LiveCenterContainerView.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ LiveCenterContainerView f8673a;

            static {
                Covode.recordClassIndex(4434);
            }

            {
                this.f8673a = r1;
            }

            public final void run() {
                LiveCenterContainerView liveCenterContainerView = this.f8673a;
                liveCenterContainerView.setTranslationX(liveCenterContainerView.f8661a);
                p.b(this.f8673a);
            }
        });
        com.bytedance.ies.xbridge.e.b.a("anchor_center_request_room_info", this);
        com.bytedance.ies.xbridge.e.b.a("live_anchor_center_mask_close", this);
        if (!com.bytedance.android.live.u.h.f12829a) {
            a();
        }
        this.f8664d = bp.DISMISS;
        MethodCollector.o(6608);
    }

    public static /* synthetic */ void a(LiveCenterContainerView liveCenterContainerView, String str, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            str = "click";
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        liveCenterContainerView.a(str, z);
    }

    public static /* synthetic */ void b(LiveCenterContainerView liveCenterContainerView, String str, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            str = "click";
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        liveCenterContainerView.b(str, z);
    }
}
