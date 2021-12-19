package com.bytedance.android.livesdk.like.widget;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.like.OptimizedLikeHelper;
import com.bytedance.android.livesdk.like.b;
import com.bytedance.android.livesdk.like.widget.anim.BottomLikeOptimizedView;
import com.bytedance.android.livesdk.model.ba;
import com.bytedance.android.livesdk.model.message.ai;
import com.bytedance.android.livesdk.model.message.bx;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.i.c;
import java.util.LinkedList;
import java.util.List;

public final class OthersLikeViewOptimizedWidget extends LiveRecyclableWidget implements Handler.Callback, au, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18379a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private BottomLikeOptimizedView f18380b;

    /* renamed from: c  reason: collision with root package name */
    private long f18381c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f18382d;

    /* renamed from: e  reason: collision with root package name */
    private IMessageManager f18383e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f18384f;

    /* renamed from: g  reason: collision with root package name */
    private b f18385g;

    /* renamed from: h  reason: collision with root package name */
    private int f18386h = 1;

    /* renamed from: i  reason: collision with root package name */
    private long f18387i = 300;

    /* renamed from: j  reason: collision with root package name */
    private final Handler f18388j = new Handler(Looper.getMainLooper(), this);

    /* renamed from: k  reason: collision with root package name */
    private final LinkedList<Bitmap> f18389k = new LinkedList<>();

    /* renamed from: l  reason: collision with root package name */
    private int f18390l;

    static {
        Covode.recordClassIndex(10344);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bbt;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(10345);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final void b() {
        if (!this.f18389k.isEmpty()) {
            this.f18388j.sendEmptyMessageDelayed(1, this.f18387i);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        BottomLikeOptimizedView bottomLikeOptimizedView = this.f18380b;
        if (bottomLikeOptimizedView == null) {
            l.a("bottomLikeView");
        }
        bottomLikeOptimizedView.a();
        IMessageManager iMessageManager = this.f18383e;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.f18388j.removeCallbacksAndMessages(null);
        a();
        this.f18389k.clear();
    }

    private final void a() {
        Long l2;
        Long l3;
        String str;
        com.bytedance.android.live.base.model.user.b a2;
        ba userAttr;
        if (this.f18390l > 0) {
            com.bytedance.android.livesdk.ab.b a3 = b.a.a("livesdk_like_special_effect_show").a(this.dataChannel);
            f b2 = u.a().b();
            Room room = (Room) this.dataChannel.b(df.class);
            Boolean bool = null;
            if (b2 != null) {
                l2 = Long.valueOf(b2.c());
            } else {
                l2 = null;
            }
            if (room != null) {
                l3 = Long.valueOf(room.getOwnerUserId());
            } else {
                l3 = null;
            }
            if (l.a(l2, l3)) {
                str = "anchor";
            } else {
                if (!(b2 == null || (a2 = b2.a()) == null || (userAttr = a2.getUserAttr()) == null)) {
                    bool = Boolean.valueOf(userAttr.f19030b);
                }
                if (p.a(bool)) {
                    str = "admin";
                } else {
                    str = "user";
                }
            }
            a3.a("admin_type", str);
            a3.a("special_effect_amount", this.f18390l);
            a3.a("action_type", e.e());
            a3.b();
            this.f18390l = 0;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.d0o);
        l.b(findViewById, "");
        this.f18380b = (BottomLikeOptimizedView) findViewById;
    }

    private final void a(Bitmap bitmap) {
        if (bitmap != null) {
            int a2 = y.a((float) (c.Default.nextInt(1, 16) * 2));
            BottomLikeOptimizedView bottomLikeOptimizedView = this.f18380b;
            if (bottomLikeOptimizedView == null) {
                l.a("bottomLikeView");
            }
            float f2 = (float) a2;
            bottomLikeOptimizedView.a(bitmap, OptimizedLikeHelper.w - ((float) (OptimizedLikeHelper.u / 2)), OptimizedLikeHelper.x, OptimizedLikeHelper.w - f2, OptimizedLikeHelper.y, OptimizedLikeHelper.w - f2, OptimizedLikeHelper.v - ((float) (OptimizedLikeHelper.u / 2)));
        }
    }

    public final boolean handleMessage(Message message) {
        l.d(message, "");
        if (message.what == 1) {
            a(this.f18389k.poll());
            b();
            return true;
        } else if (message.what != 2) {
            return false;
        } else {
            a();
            this.f18388j.sendEmptyMessageDelayed(2, 60000);
            return false;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        long j2;
        IMessageManager iMessageManager;
        int i2;
        long j3;
        IMessageManager iMessageManager2;
        Boolean bool;
        Room room;
        boolean z = false;
        this.f18384f = false;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (room = (Room) dataChannel.b(df.class)) == null) {
            j2 = 0;
        } else {
            j2 = room.getId();
        }
        this.f18381c = j2;
        DataChannel dataChannel2 = this.dataChannel;
        if (!(dataChannel2 == null || (bool = (Boolean) dataChannel2.b(ee.class)) == null)) {
            z = bool.booleanValue();
        }
        this.f18382d = z;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            iMessageManager = (IMessageManager) dataChannel3.b(cg.class);
        } else {
            iMessageManager = null;
        }
        this.f18383e = iMessageManager;
        com.bytedance.android.livesdk.like.b likeHelper = ((com.bytedance.android.livesdk.p) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.p.class)).getLikeHelper(this.f18381c);
        this.f18385g = likeHelper;
        if (!(likeHelper == null || !likeHelper.n() || (iMessageManager2 = this.f18383e) == null)) {
            iMessageManager2.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.LIKE.getIntType(), this);
        }
        com.bytedance.android.livesdk.like.b bVar = this.f18385g;
        if (bVar != null) {
            i2 = bVar.e();
        } else {
            i2 = 1;
        }
        this.f18386h = i2;
        com.bytedance.android.livesdk.like.b bVar2 = this.f18385g;
        if (bVar2 != null) {
            j3 = bVar2.f();
        } else {
            j3 = 300;
        }
        this.f18387i = j3;
        this.f18388j.sendEmptyMessageDelayed(2, 60000);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Bitmap bitmap;
        if ((iMessage instanceof ai) && this.isViewValid) {
            if (this.f18382d && !this.f18384f) {
                this.f18384f = true;
                bx a2 = com.bytedance.android.livesdk.chatroom.b.b.a(this.f18381c, this.context.getString(R.string.e6m));
                IMessageManager iMessageManager = this.f18383e;
                if (iMessageManager != null) {
                    iMessageManager.insertMessage(a2, true);
                }
            }
            ai aiVar = (ai) iMessage;
            User user = aiVar.f19136h;
            if (user != null) {
                long id = user.getId();
                f b2 = u.a().b();
                l.b(b2, "");
                if (id == b2.c()) {
                    return;
                }
            }
            this.f18390l += this.f18386h;
            List<ImageModel> list = aiVar.f19138j;
            com.bytedance.android.livesdk.like.b bVar = this.f18385g;
            if (bVar != null) {
                bitmap = bVar.a(list);
            } else {
                bitmap = null;
            }
            int i2 = 0;
            if (this.f18387i < 0) {
                int i3 = this.f18386h;
                while (i2 < i3) {
                    a(bitmap);
                    i2++;
                }
                return;
            }
            int i4 = this.f18386h;
            while (i2 < i4) {
                this.f18389k.offer(bitmap);
                i2++;
            }
            if (!this.f18388j.hasMessages(1)) {
                b();
            }
        }
    }
}
