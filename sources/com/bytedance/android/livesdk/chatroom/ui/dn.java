package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.j;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.at.d;
import com.bytedance.android.livesdk.at.e;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.at.j;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.g.b;
import com.bytedance.android.livesdk.livesetting.other.RoomFollowNoticeDurationSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import f.a.z;
import java.util.HashMap;
import java.util.Map;

public class dn extends b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static final String f16132a = dn.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public TextView f16133b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16134c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16135d;

    /* renamed from: e  reason: collision with root package name */
    public DataChannel f16136e;

    /* renamed from: i  reason: collision with root package name */
    private Room f16137i;

    /* renamed from: j  reason: collision with root package name */
    private User f16138j;

    /* renamed from: k  reason: collision with root package name */
    private Activity f16139k;

    /* renamed from: l  reason: collision with root package name */
    private String f16140l;

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16135d = true;
    }

    public void onDetachedFromWindow() {
        this.f16135d = false;
        super.onDetachedFromWindow();
    }

    static {
        Covode.recordClassIndex(8939);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.b83);
        ((HSImageView) findViewById(R.id.jx)).setVisibility(8);
        TextView textView = (TextView) findViewById(R.id.b7a);
        this.f16133b = textView;
        textView.setOnClickListener(this);
        g.a((ImageView) findViewById(R.id.or), this.f16138j.getAvatarThumb(), 2131234726);
        ((TextView) findViewById(R.id.cs_)).setText(com.bytedance.android.livesdk.ac.g.b(this.f16138j));
        ((TextView) findViewById(R.id.akm)).setText(R.string.e38);
        a.a().a(new j());
    }

    public void onClick(View view) {
        String str;
        if (view.getId() != R.id.b7a) {
            return;
        }
        if (!u.a().b().e()) {
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", "live_detail");
            bundle.putString("action_type", "follow");
            bundle.putString("source", "live");
            bundle.putString("v1_source", "follow");
            f b2 = u.a().b();
            Context context = getContext();
            j.a a2 = com.bytedance.android.livesdk.at.j.a();
            a2.f14158a = com.bytedance.android.livesdk.ao.a.a();
            a2.f14159b = com.bytedance.android.livesdk.ao.a.b();
            a2.f14162e = "live_detail";
            a2.f14163f = "follow";
            a2.f14161d = "live";
            a2.f14160c = -1;
            b2.a(context, a2.a()).b(new com.bytedance.android.livesdk.at.g());
        } else if (!this.f16134c) {
            u.a().b().a(((e.a) ((e.a) ((e.a) ((e.a) ((d.a) new e.b().a(this.f16138j.getId())).a(this.f16137i.getRequestId()).b("live_detail").c("live_follow_popup").b(this.f16137i.getId()).d(this.f16137i.getLabels())).a(this.f16139k)).e("live_detail")).f("follow")).c()).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new z<com.bytedance.android.livesdkapi.depend.model.b.a>() {
                /* class com.bytedance.android.livesdk.chatroom.ui.dn.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(8940);
                }

                @Override // f.a.z
                public final void onComplete() {
                }

                @Override // f.a.z
                public final void onSubscribe(f.a.b.b bVar) {
                }

                @Override // f.a.z
                public final void onError(Throwable th) {
                    if (dn.this.f16135d) {
                        dn.this.f16134c = false;
                        com.bytedance.android.livesdk.utils.f.a(dn.this.getContext(), th);
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // f.a.z
                public final /* synthetic */ void onNext(com.bytedance.android.livesdkapi.depend.model.b.a aVar) {
                    com.bytedance.android.livesdkapi.depend.model.b.a aVar2 = aVar;
                    if (dn.this.f16135d) {
                        dn.this.f16134c = false;
                        dn.this.f16133b.setText(R.string.e36);
                        dn.this.dismiss();
                        ao.a(y.e(), (int) R.string.e36);
                        a.a().a(new com.bytedance.android.livesdkapi.depend.b.a(aVar2));
                    }
                }
            });
            this.f16134c = true;
            HashMap hashMap = new HashMap();
            hashMap.put("follow_notice_duration", String.valueOf((long) RoomFollowNoticeDurationSetting.INSTANCE.getValue()));
            hashMap.put("growth_deepevent", "1");
            if (!m.a(com.bytedance.android.livesdk.chatroom.d.a().e())) {
                hashMap.put("enter_live_method", com.bytedance.android.livesdk.chatroom.d.a().e());
            }
            String g2 = com.bytedance.android.livesdk.ab.e.g();
            if (TextUtils.isEmpty(g2) || !"click_push_live_cd_user".equals(g2)) {
                hashMap.put("is_subscribe", "0");
            } else {
                hashMap.put("is_subscribe", "1");
            }
            if (this.f17818f) {
                str = "portrait";
            } else {
                str = "landscape";
            }
            hashMap.put("room_orientation", str);
            b.a.a("follow").a((Map<String, String>) hashMap).a(new com.bytedance.android.livesdk.ab.c.e("live_follow_popup", this.f16138j.getId())).b("live_interact").d("live_detail").a(this.f16136e).b();
        }
    }

    public dn(Activity activity, boolean z, Room room, String str) {
        super(activity, z);
        this.f16139k = activity;
        this.f16137i = room;
        this.f16138j = room.getOwner();
        this.f16140l = str;
    }
}
