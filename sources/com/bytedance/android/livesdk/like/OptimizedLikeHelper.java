package com.bytedance.android.livesdk.like;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.d;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.d;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.utils.f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.au;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import f.a.h.a;
import java.util.HashMap;
import java.util.Map;

public class OptimizedLikeHelper extends LikeHelper implements au {
    public static final int t = y.a(85.0f);
    public static final int u = y.a(32.0f);
    public static final float v = ((float) y.a(150.0f));
    public static final float w = ((float) y.a(50.0f));
    public static final float x = ((float) y.a(236.0f));
    public static final float y = ((float) y.a(55.0f));
    private boolean z;

    @Override // com.bytedance.android.livesdk.like.LikeHelper, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.livesdk.like.LikeHelper, com.bytedance.android.livesdk.like.b
    public final boolean p() {
        return true;
    }

    static {
        Covode.recordClassIndex(10315);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.like.LikeHelper
    public final float a(MotionEvent motionEvent) {
        return motionEvent.getX();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.like.LikeHelper
    public final float b(MotionEvent motionEvent) {
        return motionEvent.getY();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e(String str) {
        this.p.remove(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.like.LikeHelper
    public final void a(int i2) {
        String valueOf = String.valueOf(SystemClock.uptimeMillis());
        this.p.put(valueOf, ((LikeApi) e.a().a(LikeApi.class)).like(this.f18313c.getId(), (long) i2).b(a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new v(this, valueOf), new w(this, valueOf)));
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.like.LikeHelper
    public final void b(int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("live_source", this.f18320j);
        hashMap.put("request_id", this.f18313c.getRequestId());
        hashMap.put("log_pb", this.f18313c.getLog_pb());
        hashMap.put("like_amount", String.valueOf(i2));
        hashMap.put("source", new StringBuilder().append(this.f18313c.getUserFrom()).toString());
        String e2 = d.a().e();
        if (!com.bytedance.common.utility.m.a(e2)) {
            hashMap.put("enter_live_method", e2);
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
        b.a.a("like").a((Map<String, String>) hashMap).a().b("live_interact").b();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, Throwable th) {
        if (this.f18312b == null || this.f18312b.isFinishing()) {
            f.a(y.e(), th);
        } else {
            f.a(this.f18312b, th);
        }
        this.p.remove(str);
    }

    public static Bitmap a(Bitmap bitmap, int i2) {
        MethodCollector.i(5230);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        Rect rect = new Rect(0, 0, i2, i2);
        RectF rectF = new RectF(rect);
        float f2 = (float) (i2 >> 1);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f2, f2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
        paint.setColor(Color.parseColor("#ffffff"));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) y.a(1.3f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        MethodCollector.o(5230);
        return createBitmap;
    }

    public OptimizedLikeHelper(androidx.fragment.app.e eVar, m mVar, Room room, boolean z2, boolean z3, boolean z4, DataChannel dataChannel) {
        super(eVar, mVar, room, z2, z3, z4, dataChannel);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.like.LikeHelper
    public final void a(int i2, int i3, int i4, float f2, float f3, float f4, float f5) {
        super.a(i2, i3, i4, f2, f3, f4, f5);
        if (!this.z) {
            IMessageManager iMessageManager = (IMessageManager) this.o.b(cg.class);
            User a2 = d.a.a();
            if (iMessageManager != null && a2 != null) {
                iMessageManager.insertMessage(com.bytedance.android.livesdk.chatroom.b.b.a(this.f18313c.getId(), a2), true);
                this.z = true;
            }
        }
    }
}
