package com.bytedance.android.live.copyrightreview.helper;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.android.live.copyrightreview.ReviewApi;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.b.a.d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.b.f;
import com.bytedance.android.livesdk.chatroom.f.c;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.model.message.bv;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import f.a.b.b;
import f.a.h.a;
import java.util.HashMap;
import java.util.Map;

public class CopyrightViolationHelper implements au {

    /* renamed from: a  reason: collision with root package name */
    Dialog f8831a;

    /* renamed from: b  reason: collision with root package name */
    Dialog f8832b;

    /* renamed from: c  reason: collision with root package name */
    b f8833c;

    /* renamed from: d  reason: collision with root package name */
    boolean f8834d;

    /* renamed from: e  reason: collision with root package name */
    boolean f8835e;

    /* renamed from: f  reason: collision with root package name */
    final Runnable f8836f = new a(this);

    /* renamed from: g  reason: collision with root package name */
    private final Handler f8837g;

    static {
        Covode.recordClassIndex(4520);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        Dialog dialog = this.f8831a;
        if (dialog != null && dialog.isShowing()) {
            this.f8831a.dismiss();
        }
        Dialog dialog2 = this.f8832b;
        if (dialog2 != null && dialog2.isShowing()) {
            this.f8832b.dismiss();
        }
        this.f8837g.removeMessages(1);
        this.f8837g.removeMessages(2);
    }

    static int b(Room room) {
        if (d(room)) {
            return 1;
        }
        return 2;
    }

    private static String c(Room room) {
        if (d(room)) {
            return "anchor";
        }
        return "user";
    }

    public CopyrightViolationHelper(m mVar) {
        mVar.getLifecycle().a(this);
        this.f8837g = new Handler(new b(this));
    }

    private static boolean d(Room room) {
        if (room.getOwnerUserId() == u.a().b().c()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (!this.f8837g.hasMessages(i2)) {
            this.f8837g.sendEmptyMessageDelayed(i2, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        }
        ao.a(y.e(), (int) R.string.e8f);
    }

    static void a(Room room) {
        if (d(room)) {
            f.a((Handler) null);
        } else {
            ((LinkApi) e.a().a(LinkApi.class)).leave(room.getId(), d.a().v).b(a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).c();
        }
    }

    static void a(Room room, String str, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(room.author().getId()));
        hashMap.put("room_id", String.valueOf(room.getId()));
        if (z) {
            hashMap.put("button_click_type", str);
            hashMap.put("object_oriented", c(room));
            b.a.a("livesdk_copyright_notification_popup_click").a((Map<String, String>) hashMap).b();
            return;
        }
        hashMap.put("button_type", str);
        b.a.a("livesdk_copyright_warning_popup_click").a((Map<String, String>) hashMap).b();
    }

    /* access modifiers changed from: package-private */
    public final f.a.b.b a(Room room, int i2, int i3) {
        return ((ReviewApi) e.a().a(ReviewApi.class)).confirmCopyright(room.getId(), i2, i3).b(a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new h(this), new i(this));
    }

    public final void a(Context context, bv bvVar, Room room, f.a.b.a aVar) {
        boolean z;
        Dialog dialog;
        if (bvVar.f19368f == 7) {
            z = true;
        } else {
            z = false;
            Dialog dialog2 = this.f8831a;
            if (dialog2 != null && dialog2.isShowing()) {
                return;
            }
        }
        if (!this.f8834d && !this.f8837g.hasMessages(1)) {
            if ((!z || (dialog = this.f8832b) == null || !dialog.isShowing()) && !this.f8835e && !this.f8837g.hasMessages(2)) {
                CharSequence a2 = c.a(bvVar.n, "");
                if (TextUtils.isEmpty(a2)) {
                    a2 = bvVar.f19367a;
                }
                if (!TextUtils.isEmpty(a2)) {
                    CharSequence a3 = c.a(bvVar.f19375m, "");
                    if (TextUtils.isEmpty(a3)) {
                        a3 = c.a(bvVar.f19370h, "");
                    }
                    if (TextUtils.isEmpty(a3)) {
                        a3 = y.a((int) R.string.goq);
                    }
                    if (z) {
                        int b2 = b(room);
                        b.a aVar2 = new b.a(context);
                        aVar2.f18296m = false;
                        b.a b3 = aVar2.a(R.string.gz9, (DialogInterface.OnClickListener) new f(this, aVar, room, b2), false).b(R.string.e1b, (DialogInterface.OnClickListener) new g(this, room, aVar, b2), false);
                        b3.f18284a = a3;
                        b3.f18286c = a2;
                        this.f8832b = b3.a();
                        Dialog dialog3 = this.f8831a;
                        if (dialog3 == null || !dialog3.isShowing()) {
                            this.f8837g.post(this.f8836f);
                        } else {
                            this.f8837g.postDelayed(this.f8836f, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                        }
                    } else {
                        b.a aVar3 = new b.a(context);
                        aVar3.f18296m = false;
                        b.a b4 = aVar3.a(R.string.gz9, (DialogInterface.OnClickListener) new d(this, aVar, room), false).b(R.string.glc, (DialogInterface.OnClickListener) new e(this, room), false);
                        b4.f18284a = a3;
                        b4.f18286c = a2;
                        com.bytedance.android.livesdk.l.b a4 = b4.a();
                        this.f8831a = a4;
                        a4.show();
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("anchor_id", String.valueOf(room.author().getId()));
                    hashMap.put("room_id", String.valueOf(room.getId()));
                    if (z) {
                        hashMap.put("object_oriented", c(room));
                        b.a.a("livesdk_copyright_notification_popup_show").a((Map<String, String>) hashMap).b();
                        return;
                    }
                    b.a.a("livesdk_copyright_warning_popup_show").a((Map<String, String>) hashMap).b();
                }
            }
        }
    }
}
