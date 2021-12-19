package com.bytedance.android.livesdk.like;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.livesdk.BarrageServiceImpl;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.d;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.chatroom.model.h;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.bp;
import com.bytedance.android.livesdk.j.bq;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.barrage.DiggParamsSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.android.livesdk.utils.f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import f.a.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class LikeHelper implements b, au {
    private final int A;
    private final int B;
    private boolean C;
    private final boolean D;
    private boolean E;
    private final boolean F;
    private View G;
    private View H;
    private int[] I;
    private final SparseArray<Bitmap> J;
    private final Random K;
    private final List<Bitmap> L;
    private final Handler M;

    /* renamed from: a  reason: collision with root package name */
    protected final m f18311a;

    /* renamed from: b  reason: collision with root package name */
    protected final e f18312b;

    /* renamed from: c  reason: collision with root package name */
    protected Room f18313c;

    /* renamed from: d  reason: collision with root package name */
    final List<d> f18314d;

    /* renamed from: e  reason: collision with root package name */
    public int f18315e;

    /* renamed from: f  reason: collision with root package name */
    public int f18316f;

    /* renamed from: g  reason: collision with root package name */
    public final int f18317g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f18318h;

    /* renamed from: i  reason: collision with root package name */
    public int f18319i;

    /* renamed from: j  reason: collision with root package name */
    protected final String f18320j;

    /* renamed from: k  reason: collision with root package name */
    protected final boolean f18321k;

    /* renamed from: l  reason: collision with root package name */
    protected final SparseArray<Bitmap> f18322l = new SparseArray<>();

    /* renamed from: m  reason: collision with root package name */
    protected final List<Bitmap> f18323m = new ArrayList();
    protected final BitmapFactory.Options n;
    protected final DataChannel o;
    protected final Map<String, f.a.b.b> p;
    final List<Bitmap> q;
    final Map<String, Bitmap> r;
    final List<Bitmap> s;
    private final View.OnTouchListener t;
    private final long u;
    private final int v;
    private final long w;
    private final boolean x;
    private float y;
    private float z;

    static {
        Covode.recordClassIndex(10310);
    }

    /* access modifiers changed from: protected */
    public void a(int i2, int i3, int i4, float f2, float f3, float f4, float f5) {
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.bytedance.android.livesdk.like.b
    public boolean p() {
        return false;
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f18327a;

        /* renamed from: b  reason: collision with root package name */
        String f18328b;

        /* renamed from: c  reason: collision with root package name */
        Bitmap f18329c;

        static {
            Covode.recordClassIndex(10314);
        }

        private c() {
        }

        /* synthetic */ c(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.like.b
    public final View.OnTouchListener a() {
        return this.t;
    }

    @Override // com.bytedance.android.livesdk.like.b
    public final View b() {
        return this.H;
    }

    @Override // com.bytedance.android.livesdk.like.b
    public final int c() {
        return this.A;
    }

    @Override // com.bytedance.android.livesdk.like.b
    public final int d() {
        return this.B;
    }

    @Override // com.bytedance.android.livesdk.like.b
    public final int e() {
        return this.v;
    }

    @Override // com.bytedance.android.livesdk.like.b
    public final long f() {
        return this.w;
    }

    @Override // com.bytedance.android.livesdk.like.b
    public final int g() {
        return this.f18319i;
    }

    @Override // com.bytedance.android.livesdk.like.b
    public final boolean k() {
        return this.C;
    }

    @Override // com.bytedance.android.livesdk.like.b
    public final boolean l() {
        return this.f18321k;
    }

    @Override // com.bytedance.android.livesdk.like.b
    public final boolean m() {
        return this.D;
    }

    @Override // com.bytedance.android.livesdk.like.b
    public final boolean n() {
        return this.E;
    }

    @Override // com.bytedance.android.livesdk.like.b
    public final boolean o() {
        return this.F;
    }

    @Override // com.bytedance.android.livesdk.like.b
    public final void a(boolean z2) {
        this.C = z2;
    }

    public final boolean a(float f2, float f3) {
        View view;
        View view2;
        if (!(this.o.b(bq.class) == bp.DISMISS && this.E && !this.C && this.f18318h)) {
            return false;
        }
        this.f18316f++;
        this.f18319i++;
        if (!(this.y > 0.0f || this.z > 0.0f || (view = this.H) == null || view.getMeasuredWidth() == 0 || this.H.getMeasuredHeight() == 0 || (view2 = this.G) == null || view2.getMeasuredWidth() == 0 || this.G.getMeasuredHeight() == 0)) {
            int[] iArr = new int[2];
            this.H.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            this.G.getLocationInWindow(iArr2);
            int i2 = iArr[0] - iArr2[0];
            int i3 = iArr[1] - iArr2[1];
            this.y = ((float) i2) + (((float) this.H.getMeasuredWidth()) / 2.0f);
            this.z = ((float) i3) + (((float) this.H.getMeasuredHeight()) / 2.0f);
        }
        int i4 = this.f18315e;
        int i5 = this.f18316f;
        int i6 = this.f18319i;
        float f4 = this.y;
        float f5 = this.z;
        a(i4, i5, i6, f2, f3, f4, f5);
        for (d dVar : this.f18314d) {
            dVar.a(this, i4, i5, f2, f3, f4, f5);
        }
        this.M.removeMessages(1);
        this.M.sendEmptyMessageDelayed(1, this.u);
        return true;
    }

    @Override // com.bytedance.android.livesdk.like.b
    public final void i() {
        Bitmap bitmap = this.f18322l.get(2131234010);
        if (bitmap != null) {
            this.f18322l.remove(2131234010);
            this.f18323m.remove(bitmap);
        }
    }

    private void r() {
        if (this.I == null) {
            TypedArray obtainTypedArray = this.f18312b.getResources().obtainTypedArray(R.array.ax);
            if (obtainTypedArray.length() > 0) {
                this.I = new int[obtainTypedArray.length()];
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    this.I[i2] = obtainTypedArray.getResourceId(i2, 0);
                }
            }
            obtainTypedArray.recycle();
        }
    }

    @Override // com.bytedance.android.livesdk.like.b
    public final void h() {
        MethodCollector.i(6512);
        if (this.f18322l.get(2131234010) != null) {
            MethodCollector.o(6512);
            return;
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(this.f18312b.getResources(), 2131234010, this.n);
        if (decodeResource != null) {
            this.f18322l.put(2131234010, decodeResource);
            this.f18323m.add(decodeResource);
        }
        MethodCollector.o(6512);
    }

    public final boolean q() {
        if (this.o.b(bq.class) != bp.DISMISS || !this.E || this.C || this.f18318h) {
            return false;
        }
        this.f18315e++;
        this.f18316f = 0;
        this.f18318h = true;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (r1 != null) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap s() {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.like.LikeHelper.s():android.graphics.Bitmap");
    }

    private boolean t() {
        boolean z2;
        boolean z3;
        if (this.o.b(ee.class) != null) {
            z2 = ((Boolean) this.o.b(ee.class)).booleanValue();
        } else {
            z2 = false;
        }
        if (!z2 || DiggParamsSetting.INSTANCE.getValue().f15772a == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!this.f18313c.getRoomAuthStatus().isEnableDigg() || !z3 || !u.a().b().e()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.like.b
    public final Bitmap j() {
        if (!this.f18323m.isEmpty()) {
            List<Bitmap> list = this.f18323m;
            Bitmap bitmap = list.get(this.K.nextInt(list.size()));
            if (bitmap != null && !bitmap.isRecycled()) {
                return bitmap;
            }
        }
        if (!this.s.isEmpty()) {
            List<Bitmap> list2 = this.s;
            Bitmap bitmap2 = list2.get(this.K.nextInt(list2.size()));
            if (bitmap2 != null) {
                return bitmap2;
            }
        }
        return s();
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        this.M.removeMessages(1);
        this.f18314d.clear();
        this.f18322l.clear();
        for (Bitmap bitmap : this.f18323m) {
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        this.f18323m.clear();
        for (int i2 = 0; i2 < this.J.size(); i2++) {
            Bitmap bitmap2 = this.J.get(i2);
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
        }
        this.J.clear();
        this.I = null;
        for (f.a.b.b bVar : this.p.values()) {
            if (bVar != null && !bVar.isDisposed()) {
                bVar.dispose();
            }
        }
        this.f18311a.getLifecycle().b(this);
    }

    class a implements d {
        static {
            Covode.recordClassIndex(10312);
        }

        private a() {
        }

        /* synthetic */ a(LikeHelper likeHelper, byte b2) {
            this();
        }

        @Override // com.bytedance.android.livesdk.like.d
        public final void a(b bVar, int i2) {
            int i3 = i2 % LikeHelper.this.f18317g;
            if (i3 != 0) {
                LikeHelper.this.a(i3);
                LikeHelper.this.b(i3);
            }
        }

        @Override // com.bytedance.android.livesdk.like.d
        public final void a(b bVar, int i2, int i3, float f2, float f3, float f4, float f5) {
            if (i3 % LikeHelper.this.f18317g == 0) {
                LikeHelper likeHelper = LikeHelper.this;
                likeHelper.a(likeHelper.f18317g);
                LikeHelper likeHelper2 = LikeHelper.this;
                likeHelper2.b(likeHelper2.f18317g);
            }
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {
        static {
            Covode.recordClassIndex(10313);
        }

        private b() {
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (LikeHelper.this.q() || super.onDoubleTap(motionEvent)) {
                return true;
            }
            return false;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            LikeHelper likeHelper = LikeHelper.this;
            if (likeHelper.a(likeHelper.a(motionEvent), LikeHelper.this.b(motionEvent)) || super.onDown(motionEvent)) {
                return true;
            }
            return false;
        }

        /* synthetic */ b(LikeHelper likeHelper, byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public float a(MotionEvent motionEvent) {
        return motionEvent.getRawX();
    }

    /* access modifiers changed from: protected */
    public float b(MotionEvent motionEvent) {
        return motionEvent.getRawY();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(String str) {
        this.p.remove(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(String str) {
        this.p.remove(str);
    }

    @Override // com.bytedance.android.livesdk.like.b
    public final void b(View view) {
        this.G = view;
    }

    @Override // com.bytedance.android.livesdk.like.b
    public final void b(d dVar) {
        this.f18314d.remove(dVar);
    }

    /* access modifiers changed from: protected */
    public void a(int i2) {
        ((z) ((LikeApi) com.bytedance.android.live.network.e.a().a(LikeApi.class)).like(this.f18313c.getId(), (long) i2).a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a(this.f18311a))).a(i.f18342a, new j(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(String str) {
        this.p.remove(str);
    }

    @Override // com.bytedance.android.livesdk.like.b
    public final void a(View view) {
        this.H = view;
        this.y = 0.0f;
        this.z = 0.0f;
    }

    @Override // com.bytedance.android.livesdk.like.b
    public final Bitmap a(List<ImageModel> list) {
        Bitmap bitmap = null;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (ImageModel imageModel : list) {
                if (this.r.containsKey(imageModel.mUri)) {
                    this.L.add(this.r.get(imageModel.mUri));
                } else {
                    arrayList.add(g.a(imageModel).d(new r(imageModel)));
                }
            }
            if (!this.L.isEmpty()) {
                List<Bitmap> list2 = this.L;
                bitmap = list2.get(this.K.nextInt(list2.size()));
                this.L.clear();
            }
            if (!arrayList.isEmpty()) {
                String valueOf = String.valueOf(SystemClock.uptimeMillis());
                this.p.put(valueOf, t.c(arrayList).a(s.f18354a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new t(this), new g(this, valueOf), new h(this, valueOf)));
            }
            if (bitmap != null) {
                return bitmap;
            }
        }
        return s();
    }

    @Override // com.bytedance.android.livesdk.like.b
    public final void a(d dVar) {
        if (dVar != null && !this.f18314d.contains(dVar)) {
            this.f18314d.add(dVar);
        }
    }

    /* access modifiers changed from: protected */
    public void b(int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("live_source", this.f18320j);
        hashMap.put("request_id", this.f18313c.getRequestId());
        hashMap.put("log_pb", this.f18313c.getLog_pb());
        hashMap.put("like_amount", String.valueOf(i2));
        hashMap.put("source", new StringBuilder().append(this.f18313c.getUserFrom()).toString());
        if (!com.bytedance.common.utility.m.a(d.a().e())) {
            hashMap.put("enter_live_method", d.a().e());
        }
        String g2 = com.bytedance.android.livesdk.ab.e.g();
        if (TextUtils.isEmpty(g2) || !"click_push_live_cd_user".equals(g2)) {
            hashMap.put("is_subscribe", "0");
        } else {
            hashMap.put("is_subscribe", "1");
        }
        if (y.f()) {
            hashMap.put("room_orientation", "portrait");
        } else {
            hashMap.put("room_orientation", "landscape");
        }
        long j2 = 0;
        if (DataChannelGlobal.f34575d.b(ac.class) != null) {
            j2 = ((Room) DataChannelGlobal.f34575d.b(ac.class)).getOwnerUserId();
        }
        long j3 = b.a.a().f9941f;
        if (((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).isInCoHost()) {
            hashMap.put("connection_type", "anchor");
            hashMap.put("channel_id", String.valueOf(b.a.a().f9940e));
            hashMap.put("invitee_list", ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).getCurrentInviteeList());
            if (b.a.a().q) {
                hashMap.put("connection_inviter_id", String.valueOf(j2));
                hashMap.put("connection_invitee_id", String.valueOf(j3));
            } else {
                hashMap.put("connection_invitee_id", String.valueOf(j2));
                hashMap.put("connection_inviter_id", String.valueOf(j3));
            }
        }
        if (((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).isRoomInBattle()) {
            hashMap.put("connection_type", "manual_pk");
            hashMap.put("pk_id", String.valueOf(b.a.a().ai));
            if (((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).isBattleStarter()) {
                hashMap.put("pk_inviter_id", String.valueOf(j2));
                hashMap.put("pk_invitee_id", String.valueOf(j3));
            } else {
                hashMap.put("pk_invitee_id", String.valueOf(j2));
                hashMap.put("pk_inviter_id", String.valueOf(j3));
            }
        }
        if (((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).isInMultiGuest()) {
            hashMap.put("connection_type", "audience");
        }
        hashMap.put("admin_type", com.bytedance.android.livesdk.utils.ac.a(this.f18313c, this.o));
        b.a.a("like").a((Map<String, String>) hashMap).b("live_interact").a().b();
        if (com.bytedance.android.livesdk.utils.a.a(this.o)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("room_id", String.valueOf(this.f18313c.getId()));
            hashMap2.put("anchor_id", String.valueOf(this.f18313c.getOwnerUserId()));
            com.bytedance.android.livesdk.utils.a.a("live_ad", "like", null, hashMap2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str) {
        this.p.remove(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Throwable th) {
        e eVar = this.f18312b;
        if (eVar == null || eVar.isFinishing()) {
            f.a(y.e(), th);
        } else {
            f.a(this.f18312b, th);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ h.z a(Room room, boolean z2, boolean z3, boolean z4, DataChannel dataChannel, Room room2) {
        if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() != 1) {
            return h.z.f158842a;
        }
        this.f18313c = room2;
        this.E = t();
        BarrageServiceImpl.addALogTrace(room, z2, z3, z4, dataChannel, this);
        return h.z.f158842a;
    }

    public LikeHelper(e eVar, m mVar, Room room, boolean z2, boolean z3, boolean z4, DataChannel dataChannel) {
        long j2;
        int i2;
        int i3;
        boolean z5;
        int i4;
        long j3;
        String str;
        BitmapFactory.Options options = new BitmapFactory.Options();
        this.n = options;
        this.G = null;
        this.H = null;
        HashMap hashMap = new HashMap();
        this.p = hashMap;
        this.J = new SparseArray<>();
        this.K = new Random();
        this.q = new ArrayList();
        this.r = new HashMap();
        this.s = new ArrayList();
        this.L = new ArrayList();
        this.M = new Handler(new Handler.Callback() {
            /* class com.bytedance.android.livesdk.like.LikeHelper.AnonymousClass1 */

            static {
                Covode.recordClassIndex(10311);
            }

            public final boolean handleMessage(Message message) {
                if (message.what != 1) {
                    return false;
                }
                LikeHelper.this.f18318h = false;
                LikeHelper likeHelper = LikeHelper.this;
                int i2 = likeHelper.f18316f;
                for (d dVar : likeHelper.f18314d) {
                    dVar.a(likeHelper, i2);
                }
                return true;
            }
        });
        this.f18321k = z2;
        this.D = z3;
        this.F = z4;
        h value = DiggParamsSetting.INSTANCE.getValue();
        if (value == null || value.f15773b <= 0) {
            j2 = 500;
        } else {
            j2 = value.f15773b;
        }
        this.u = j2;
        int i5 = 15;
        if (room != null && room.likeInfo != null && room.likeInfo.f18941a.intValue() > 0) {
            i2 = room.likeInfo.f18941a.intValue();
        } else if (value == null || value.f15775d <= 0) {
            i2 = 15;
        } else {
            i2 = value.f15775d;
        }
        this.f18317g = i2;
        if (room != null && room.likeInfo != null && room.likeInfo.f18942b.intValue() > 0) {
            i3 = room.likeInfo.f18942b.intValue();
        } else if (value == null || value.f15777f <= 0) {
            i3 = 1;
        } else {
            i3 = value.f15777f;
        }
        this.v = i3;
        if (value != null) {
            z5 = value.f15778g;
        } else {
            z5 = false;
        }
        this.x = z5;
        if (value != null && value.f15775d > 0) {
            i5 = value.f15775d;
        }
        this.A = i5;
        if (value == null || value.f15776e <= 0) {
            i4 = 80;
        } else {
            i4 = value.f15776e;
        }
        this.B = i4;
        if (value == null || value.f15779h == 0) {
            j3 = 300;
        } else {
            j3 = value.f15779h;
        }
        this.w = j3;
        this.f18312b = eVar;
        this.f18311a = mVar;
        mVar.getLifecycle().a(this);
        this.t = new e(new GestureDetector(eVar, new b(this, (byte) 0)));
        ArrayList arrayList = new ArrayList();
        this.f18314d = arrayList;
        arrayList.add(new a(this, (byte) 0));
        this.f18313c = room;
        if (com.ss.android.ugc.aweme.bf.d.a(eVar, "feed_live_span", 0).getInt("span_count", 0) > 1) {
            str = "live_small_picture";
        } else {
            str = "live_big_picture";
        }
        this.f18320j = str;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        this.o = dataChannel;
        this.E = t();
        dataChannel.a(df.class, (h.f.a.b) new f(this, room, z2, z3, z4, dataChannel));
        String valueOf = String.valueOf(SystemClock.uptimeMillis());
        hashMap.put(valueOf, ((LikeApi) com.bytedance.android.live.network.e.a().a(LikeApi.class)).getIcons(this.f18313c.getId(), this.f18313c.getOwnerUserId()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(m.f18346a, false).a(n.f18347a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new o(this), new p(this, valueOf), new q(this, valueOf)));
        r();
    }
}
