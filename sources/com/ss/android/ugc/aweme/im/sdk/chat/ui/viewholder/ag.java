package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.b;
import androidx.core.h.v;
import com.bytedance.android.livesdk.utils.z;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ak;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.g;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ae;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.q;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.c;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ag extends a<ShareLiveContent> implements p {
    private RemoteImageView A;
    private TextView B;
    private ImageView C;
    private View D;
    private TextView E;
    private ViewGroup F;
    private RemoteImageView G;
    private TextView H;
    private ViewGroup I;
    private RemoteImageView J;
    private TextView K;
    private TextView L;
    private TextView M;
    private View N;
    private View O;
    private ObjectAnimator P;
    private HashMap<String, NewLiveRoomStruct> Q;
    private Map<String, Boolean> R;
    private ak S;
    private Set<Long> T;
    private boolean U;

    /* renamed from: b  reason: collision with root package name */
    private LinearLayout f101336b;
    private RemoteImageView x;
    private TextView y;
    private TextView z;

    static {
        Covode.recordClassIndex(64807);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.p
    public final void d() {
        j();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.p
    public final String b() {
        if (this.p != null) {
            return ((ShareLiveContent) this.p).getRoomOwnerId();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.p
    public final String c() {
        if (this.p != null) {
            return ((ShareLiveContent) this.p).getRoomSecOwnerId();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final void g() {
        super.g();
        this.P.cancel();
        this.U = true;
    }

    private boolean i() {
        int followStatus;
        boolean z2;
        if (this.p == null) {
            return false;
        }
        IMUser a2 = g.a(((ShareLiveContent) this.p).getRoomOwnerId(), ((ShareLiveContent) this.p).getRoomSecOwnerId());
        if (a2 == null) {
            followStatus = 0;
        } else {
            followStatus = a2.getFollowStatus();
        }
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin != null) {
            z2 = TextUtils.equals(((ShareLiveContent) this.p).getRoomOwnerId(), createIUserServicebyMonsterPlugin.getCurrentUserID());
        } else {
            z2 = false;
        }
        if (followStatus != 0 || z2) {
            return false;
        }
        return true;
    }

    private void l() {
        String str;
        HashMap<String, NewLiveRoomStruct> hashMap;
        NewLiveRoomStruct newLiveRoomStruct;
        d dVar = new d();
        String b2 = b();
        if (TextUtils.isEmpty(b2) || (hashMap = this.Q) == null || !hashMap.containsKey(b2) || (newLiveRoomStruct = this.Q.get(b2)) == null || newLiveRoomStruct.id == 0) {
            str = "end";
        } else {
            str = "live";
        }
        dVar.a("show_type", str);
        if (this.s != null) {
            dVar.a("from_user_id", this.s.getSender());
        }
        r.a("livesdk_share_chat_show", dVar.f66730a);
    }

    private void k() {
        UrlModel roomCover;
        this.E.setVisibility(8);
        this.F.setVisibility(8);
        this.I.setVisibility(0);
        this.B.setVisibility(8);
        this.K.setText(this.itemView.getContext().getResources().getString(R.string.c_s, ((ShareLiveContent) this.p).getRoomOwnerName()));
        this.N.setVisibility(8);
        this.A.setVisibility(0);
        RemoteImageView remoteImageView = this.J;
        if (((ShareLiveContent) this.p).getRoomOwnerAvatar() != null) {
            roomCover = ((ShareLiveContent) this.p).getRoomOwnerAvatar();
        } else {
            roomCover = ((ShareLiveContent) this.p).getRoomCover();
        }
        a(remoteImageView, roomCover, 2131232839, (com.facebook.imagepipeline.o.d) null);
        a(((ShareLiveContent) this.p).getRoomCover(), new z());
        if (i()) {
            this.L.setVisibility(0);
            this.M.setVisibility(8);
            return;
        }
        this.L.setVisibility(8);
        this.M.setVisibility(0);
    }

    private void j() {
        boolean z2;
        Set<Long> set;
        Boolean bool;
        if (this.p != null && this.s != null) {
            String b2 = b();
            if (!TextUtils.isEmpty(b2)) {
                Map<String, Boolean> map = this.R;
                boolean z3 = true;
                if (map == null || ((bool = map.get(b2)) != null && !bool.booleanValue())) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2 || this.U) {
                    this.O.setVisibility(8);
                    this.P.cancel();
                    TextView textView = this.H;
                    textView.setTextColor(b.c(textView.getContext(), R.color.f159928l));
                    ViewGroup viewGroup = this.F;
                    v.a(viewGroup, b.a(viewGroup.getContext(), (int) R.drawable.aqs));
                    HashMap<String, NewLiveRoomStruct> hashMap = this.Q;
                    if (hashMap == null || !hashMap.containsKey(b2)) {
                        k();
                    } else {
                        NewLiveRoomStruct newLiveRoomStruct = this.Q.get(b2);
                        if (newLiveRoomStruct == null || newLiveRoomStruct.id == 0) {
                            k();
                        } else {
                            this.F.setVisibility(0);
                            this.I.setVisibility(8);
                            this.B.setVisibility(0);
                            this.A.setVisibility(0);
                            this.N.setVisibility(0);
                            a(newLiveRoomStruct.roomCover, (com.facebook.imagepipeline.o.d) null);
                        }
                        long msgId = this.s.getMsgId();
                        if (z3 && msgId != 0 && (set = this.T) != null && !set.contains(Long.valueOf(msgId))) {
                            l();
                            this.T.add(Long.valueOf(msgId));
                            return;
                        }
                        return;
                    }
                } else {
                    this.O.setVisibility(0);
                    this.P.start();
                    this.F.setVisibility(0);
                    this.I.setVisibility(8);
                    this.B.setVisibility(8);
                    this.N.setVisibility(8);
                    TextView textView2 = this.H;
                    textView2.setTextColor(b.c(textView2.getContext(), R.color.bx));
                    v.a(this.F, (Drawable) null);
                    this.A.setVisibility(8);
                }
                z3 = false;
                long msgId2 = this.s.getMsgId();
                if (z3) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public void a() {
        super.a();
        this.f101336b = (LinearLayout) this.itemView.findViewById(R.id.a0b);
        this.x = (RemoteImageView) this.itemView.findViewById(R.id.ads);
        this.y = (TextView) this.itemView.findViewById(R.id.aeb);
        this.z = (TextView) this.itemView.findViewById(R.id.ae2);
        this.A = (RemoteImageView) this.itemView.findViewById(R.id.ady);
        this.B = (TextView) this.itemView.findViewById(R.id.ae9);
        this.C = (ImageView) this.itemView.findViewById(R.id.aec);
        this.D = this.itemView.findViewById(R.id.ael);
        this.E = (TextView) this.itemView.findViewById(R.id.aeg);
        this.o = a.C2518a.a((View) a(R.id.adh));
        this.F = (ViewGroup) this.itemView.findViewById(R.id.ve);
        this.G = (RemoteImageView) this.itemView.findViewById(R.id.v7);
        this.H = (TextView) this.itemView.findViewById(R.id.vs);
        this.I = (ViewGroup) this.itemView.findViewById(R.id.fby);
        this.J = (RemoteImageView) this.itemView.findViewById(R.id.fbw);
        this.K = (TextView) this.itemView.findViewById(R.id.fc0);
        this.L = (TextView) this.itemView.findViewById(R.id.fbx);
        this.M = (TextView) this.itemView.findViewById(R.id.fbz);
        this.N = this.itemView.findViewById(R.id.ut);
        this.O = this.itemView.findViewById(R.id.chw);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.itemView.findViewById(R.id.ci9), View.ROTATION, 0.0f, 360.0f);
        this.P = ofFloat;
        ofFloat.setDuration(1000L);
        this.P.setInterpolator(new LinearInterpolator());
        this.P.setRepeatCount(-1);
        if (this.S == null) {
            this.S = new ak(this.itemView);
        }
    }

    public ag(View view) {
        super(view);
    }

    private void b(View view) {
        String str;
        if (view.getId() == R.id.fbx) {
            str = "follow";
        } else if (view.getId() == R.id.fbz) {
            str = "more_video";
        } else {
            str = "others";
        }
        d dVar = new d();
        if (this.s != null) {
            dVar.a("from_user_id", this.s.getSender());
        }
        dVar.a("button_type", str);
        r.a("livesdk_share_chat_click", dVar.f66730a);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public void a(View.OnClickListener onClickListener) {
        super.a(onClickListener);
        this.z.setOnClickListener(onClickListener);
        this.x.setOnClickListener(onClickListener);
        this.y.setOnClickListener(onClickListener);
        ah ahVar = new ah(this, onClickListener);
        this.L.setOnClickListener(ahVar);
        this.M.setOnClickListener(ahVar);
        this.G.setOnClickListener(ahVar);
        this.H.setOnClickListener(ahVar);
        this.o.a(new ai(this));
        ae.a aVar = this.t;
        a aVar2 = this.o;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
        this.t.a(this.z, this.x, this.y);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(View view) {
        NewLiveRoomStruct newLiveRoomStruct;
        String str;
        long j2;
        c d2;
        if (this.p != null) {
            HashMap<String, NewLiveRoomStruct> hashMap = this.Q;
            String str2 = null;
            if (hashMap == null || !hashMap.containsKey(b())) {
                newLiveRoomStruct = null;
            } else {
                newLiveRoomStruct = this.Q.get(b());
            }
            ak akVar = this.S;
            ShareLiveContent shareLiveContent = akVar.f101342b;
            if (shareLiveContent != null) {
                str = shareLiveContent.getRoomOwnerId();
            } else {
                str = null;
            }
            ShareLiveContent shareLiveContent2 = akVar.f101342b;
            if (shareLiveContent2 != null) {
                str2 = shareLiveContent2.getRoomSecOwnerId();
            }
            if (newLiveRoomStruct != null) {
                j2 = newLiveRoomStruct.id;
            } else {
                j2 = 0;
            }
            if (!(str == null || str.length() == 0)) {
                z.d dVar = new z.d();
                dVar.element = 0;
                try {
                    dVar.element = Long.parseLong(str);
                } catch (Exception unused) {
                }
                if (!akVar.f101343c) {
                    akVar.f101343c = true;
                    ILiveOuterService s = LiveOuterService.s();
                    if (s == null || (d2 = s.d()) == null) {
                        akVar.b();
                    } else {
                        Integer num = (Integer) d2.a("live_chat_enter_room_opt", (Object) 0);
                        if (num != null && num.intValue() == 1) {
                            akVar.a(newLiveRoomStruct, true);
                            akVar.a().a(d2.a(dVar.element, str2).a(new ak.a(akVar, dVar, str2, j2, newLiveRoomStruct, str), ak.d.f101364a));
                        } else {
                            akVar.a().a(d2.a(dVar.element, str2).a(new ak.b(akVar, dVar, str2, j2, newLiveRoomStruct, str), new ak.c(akVar, dVar, str2, j2, newLiveRoomStruct, str)));
                        }
                    }
                }
            }
            b(view);
        }
    }

    private void a(UrlModel urlModel, com.facebook.imagepipeline.o.d dVar) {
        a(this.A, urlModel, (int) R.drawable.aue, dVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        b(view);
        if (view.getId() == R.id.v7 || view.getId() == R.id.vs || view.getId() == R.id.fbz) {
            com.ss.android.ugc.aweme.im.sdk.chat.a.d.a(b(), "chat", "click_head");
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.p
    public final void a(HashMap<String, NewLiveRoomStruct> hashMap, HashMap<String, Boolean> hashMap2, Set<Long> set) {
        this.Q = hashMap;
        this.R = hashMap2;
        this.T = set;
    }

    private static void a(RemoteImageView remoteImageView, UrlModel urlModel, int i2, com.facebook.imagepipeline.o.d dVar) {
        if (urlModel == null) {
            remoteImageView.setController(null);
            ((com.facebook.drawee.f.a) remoteImageView.getHierarchy()).c(i2);
            return;
        }
        q.a(remoteImageView, urlModel, i2, i2, dVar);
    }

    public void a(ai aiVar, ai aiVar2, ShareLiveContent shareLiveContent, int i2) {
        super.a(aiVar, aiVar2, (BaseContent) shareLiveContent, i2);
        this.U = false;
        this.D.setVisibility(8);
        this.B.setVisibility(0);
        this.z.setVisibility(8);
        this.C.setVisibility(8);
        this.f101336b.setVisibility(8);
        this.I.setVisibility(8);
        this.F.setVisibility(0);
        this.E.setVisibility(8);
        a(shareLiveContent.getRoomCover(), (com.facebook.imagepipeline.o.d) null);
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(this.x, shareLiveContent.getRoomOwnerAvatar());
        a(this.G, shareLiveContent.getRoomOwnerAvatar(), 2131232840, (com.facebook.imagepipeline.o.d) null);
        this.y.setText(shareLiveContent.getRoomOwnerName());
        this.H.setText(shareLiveContent.getRoomOwnerName());
        this.u.a(String.valueOf(this.s.getSender()), this.s.getSecSender());
        this.x.setTag(50331648, 24);
        this.x.setTag(100663296, shareLiveContent);
        this.y.setTag(50331648, 24);
        this.y.setTag(100663296, shareLiveContent);
        this.z.setTag(50331648, 5);
        this.z.setTag(67108864, aiVar);
        this.o.a(50331648, 23);
        this.L.setTag(50331648, 5);
        this.L.setTag(67108864, aiVar);
        this.M.setTag(50331648, 24);
        this.M.setTag(100663296, shareLiveContent);
        this.G.setTag(50331648, 24);
        this.G.setTag(100663296, shareLiveContent);
        this.H.setTag(50331648, 24);
        this.H.setTag(100663296, shareLiveContent);
        String roomOwnerId = shareLiveContent.getRoomOwnerId();
        String roomId = shareLiveContent.getRoomId();
        long sender = aiVar.getSender();
        androidx.c.a aVar = new androidx.c.a();
        aVar.put("room_id", roomId);
        aVar.put("anchor_id", roomOwnerId);
        aVar.put("action_type", "click");
        aVar.put("enter_from_merge", "chat");
        aVar.put("enter_method", "live_cover");
        aVar.put("_params_live_platform", "live");
        aVar.put("from_user_id", String.valueOf(sender));
        r.a("livesdk_live_show", aVar);
        ak akVar = this.S;
        akVar.f101341a = aiVar;
        akVar.f101342b = shareLiveContent;
        String string = com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.string.ft4);
        j();
        if (this.M.getPaint().measureText(string) > ((float) n.a(106.0d))) {
            this.M.setTextSize(10.0f);
        } else {
            this.M.setTextSize(14.0f);
        }
    }
}
