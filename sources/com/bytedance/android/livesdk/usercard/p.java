package com.bytedance.android.livesdk.usercard;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.c.b;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.api.aj;
import com.bytedance.android.live.liveinteract.api.b;
import com.bytedance.android.live.n.ac;
import com.bytedance.android.live.p.e;
import com.bytedance.android.live.u.h;
import com.bytedance.android.livesdk.a.l;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.b.a.d;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.cw;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAnchorInviteGuestLinkmicSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveHideAudienceFollowingSetting;
import com.bytedance.android.livesdk.model.ab;
import com.bytedance.android.livesdk.usercard.y;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;

public class p extends v implements View.OnClickListener, y.b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f21858a = p.class.getSimpleName();
    ImageView A;
    Activity B;
    public f C;
    boolean D;
    public final f.a.b.a E = new f.a.b.a();
    UserProfileEvent F;
    private long G;
    private String H;
    private View I;
    private View J;
    private ViewGroup K;
    private View L;
    private HSImageView M;
    private HSImageView N;

    /* renamed from: b  reason: collision with root package name */
    int f21859b;

    /* renamed from: c  reason: collision with root package name */
    y f21860c;

    /* renamed from: d  reason: collision with root package name */
    public w f21861d;

    /* renamed from: e  reason: collision with root package name */
    public long f21862e;

    /* renamed from: f  reason: collision with root package name */
    public User f21863f;

    /* renamed from: g  reason: collision with root package name */
    public Room f21864g;

    /* renamed from: h  reason: collision with root package name */
    User f21865h;

    /* renamed from: i  reason: collision with root package name */
    boolean f21866i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f21867j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f21868k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f21869l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f21870m;
    public boolean n;
    String t = "";
    public View u;
    public View v;
    public View w;
    public ImageView x;
    public HSImageView y;
    HSImageView z;

    public interface a {
        static {
            Covode.recordClassIndex(12877);
        }

        void a();
    }

    @Override // com.bytedance.android.livesdk.v
    public final ak.a c_() {
        return ak.a.PANEL_PROFILE;
    }

    @Override // com.bytedance.android.livesdk.usercard.y.b
    public final void h() {
        dismiss();
    }

    static {
        Covode.recordClassIndex(12872);
    }

    private static boolean l() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        UserProfileEvent userProfileEvent = this.F;
        if (userProfileEvent != null) {
            this.G = userProfileEvent.msgId;
            this.H = this.F.content;
        }
    }

    @Override // com.bytedance.android.livesdk.usercard.y.b
    public final void f() {
        f fVar;
        if (this.o && (fVar = this.C) != null) {
            fVar.a();
        }
    }

    @Override // com.bytedance.android.livesdk.usercard.y.b
    public final void g() {
        f fVar;
        if (this.o && (fVar = this.C) != null) {
            fVar.b();
        }
    }

    public static boolean e() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean l2 = l();
        j.f107226e = l2;
        return l2;
    }

    private void j() {
        if (this.f21864g != null && this.f21863f != null) {
            this.K.setVisibility(4);
            this.I.setVisibility(4);
            this.K.post(new Runnable() {
                /* class com.bytedance.android.livesdk.usercard.p.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(12873);
                }

                /* JADX WARNING: Removed duplicated region for block: B:17:0x007f  */
                /* JADX WARNING: Removed duplicated region for block: B:18:0x0085  */
                /* JADX WARNING: Removed duplicated region for block: B:51:0x013c  */
                /* JADX WARNING: Removed duplicated region for block: B:75:0x0219  */
                /* JADX WARNING: Removed duplicated region for block: B:86:0x0260  */
                /* JADX WARNING: Removed duplicated region for block: B:87:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
                /* JADX WARNING: Removed duplicated region for block: B:9:0x0057  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 611
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.usercard.p.AnonymousClass1.run():void");
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        int i2;
        if (this.D) {
            i2 = R.layout.b7f;
        } else {
            i2 = R.layout.b7c;
        }
        v.b bVar = new v.b(i2);
        bVar.f22374a = 0;
        if (this.D) {
            bVar.f22380g = 80;
            bVar.f22381h = -1;
            bVar.f22382i = -1;
            bVar.f22375b = R.style.mh;
        } else {
            bVar.f22380g = 5;
            bVar.f22381h = com.bytedance.android.live.core.f.y.d(R.dimen.wl);
            bVar.f22382i = -1;
            bVar.f22375b = R.style.mi;
        }
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        y yVar = this.f21860c;
        if (yVar != null) {
            yVar.b();
        }
        this.f21866i = false;
        if (this.p != null) {
            this.p.c(e.class, false);
        }
        this.E.a();
        d.a().f14191l = false;
        super.onDestroy();
    }

    private void k() {
        String str;
        UserProfileEvent userProfileEvent;
        if (this.f21864g != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("target_uid", String.valueOf(this.f21862e));
            hashMap.put("sec_target_uid", u.a().b().a(this.f21862e));
            hashMap.put("packed_level", "2");
            hashMap.put("current_room_id", String.valueOf(this.f21864g.getId()));
            hashMap.put("request_from", "live_push_settings");
            if (this.f21864g.getOwner() != null) {
                str = String.valueOf(this.f21864g.getOwner().getId());
            } else {
                str = "0";
            }
            hashMap.put("anchor_id", str);
            hashMap.put("sec_anchor_id", u.a().b().a(this.f21864g.getOwnerUserId()));
            y yVar = this.f21860c;
            if (yVar != null) {
                yVar.a(hashMap);
                int currentLinkMode = ((b) com.bytedance.android.live.t.a.a(b.class)).getCurrentLinkMode();
                UserProfileEvent userProfileEvent2 = this.F;
                if (userProfileEvent2 == null || !userProfileEvent2.coHostEnable) {
                    if (this.f21870m && aj.a(currentLinkMode, 2) && (userProfileEvent = this.F) != null && userProfileEvent.linkInRoomEnable && LiveAnchorInviteGuestLinkmicSetting.INSTANCE.getValue()) {
                        this.f21860c.a(this.f21864g, this.f21862e);
                    }
                } else if (this.f21870m) {
                    this.f21860c.a(this.f21864g);
                }
            }
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f21866i = true;
        y yVar = this.f21860c;
        if (yVar != null) {
            yVar.a(this);
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.p != null) {
            this.p.b(ac.class, (Object) false);
        }
    }

    @Override // com.bytedance.android.livesdk.usercard.y.b
    public final void a(Throwable th) {
        com.bytedance.android.livesdk.ab.a b2 = b.a.b("ttlive_show_profile_all", th);
        b2.f13428e = true;
        b2.a();
        if (this.f21866i) {
            if (this.J.getVisibility() == 8) {
                this.I.setVisibility(8);
                this.J.setVisibility(0);
            } else if (th instanceof com.bytedance.android.live.a.a.b.a) {
                ao.a(com.bytedance.android.live.core.f.y.e(), ((com.bytedance.android.live.a.a.b.a) th).getPrompt(), 0);
            } else {
                ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.gt1);
            }
        }
    }

    public final void b(int i2) {
        Context e2;
        int i3;
        int i4;
        int i5;
        if (getContext() != null) {
            e2 = getContext();
        } else {
            e2 = com.bytedance.android.live.core.f.y.e();
        }
        if (i2 != 0) {
            if (i2 == 1) {
                ImageView imageView = this.x;
                if (this.D) {
                    i4 = 2131234881;
                } else {
                    i4 = 2131234882;
                }
                imageView.setImageDrawable(androidx.appcompat.a.a.a.b(e2, i4));
                return;
            } else if (i2 != 2) {
                if (i2 == 3) {
                    ImageView imageView2 = this.x;
                    if (this.D) {
                        i5 = 2131234883;
                    } else {
                        i5 = 2131234884;
                    }
                    imageView2.setImageDrawable(androidx.appcompat.a.a.a.b(e2, i5));
                    return;
                }
                return;
            }
        }
        ImageView imageView3 = this.x;
        if (this.D) {
            i3 = 2131234885;
        } else {
            i3 = 2131234886;
        }
        imageView3.setImageDrawable(androidx.appcompat.a.a.a.b(e2, i3));
    }

    public final void a(com.bytedance.android.livesdk.model.j jVar) {
        Activity activity = this.B;
        if (activity == null || activity.getRequestedOrientation() != 0) {
            n.a(this.L, 0);
            this.f21863f.getLiveRoomId();
            View view = this.L;
            if (view == null) {
                return;
            }
            if (jVar != null) {
                n.a(view, 8);
                n.a(this.M, 0);
                k.a(this.M, jVar.f19085a);
                HSImageView hSImageView = this.N;
                if (hSImageView != null) {
                    n.a(hSImageView, 0);
                    com.bytedance.android.live.core.f.p.a(this.N, jVar.f19088d, 0);
                    return;
                }
                return;
            }
            n.a(view, 0);
            n.a(this.M, 8);
            HSImageView hSImageView2 = this.N;
            if (hSImageView2 != null) {
                n.a(hSImageView2, 8);
            }
        } else if (jVar != null) {
            n.a(this.L, 8);
            n.a(this.M, 0);
            this.y.setPadding(0, 0, 0, 0);
            this.y.setBackgroundResource(0);
            k.a(this.M, jVar.f19085a);
        } else {
            n.a(this.L, 8);
            n.a(this.M, 8);
            this.y.setPadding(0, com.bytedance.android.live.core.f.y.a(5.0f), 0, com.bytedance.android.live.core.f.y.a(7.0f));
            this.y.setBackgroundResource(2131234034);
        }
    }

    @Override // com.bytedance.android.livesdk.usercard.y.b
    public final void a(User user) {
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (this.f21866i) {
            boolean z3 = true;
            if (user == null || user.getId() <= 0) {
                com.bytedance.android.livesdk.ab.a b2 = c.a.d("ttlive_show_profile_all").b("error_code", (Integer) 1).b("error_msg", "user is null");
                b2.f13428e = true;
                b2.a();
                a(new IllegalArgumentException("User is invalid"));
                return;
            }
            if (h.b()) {
                this.f21863f = user;
            } else {
                this.f21863f = User.from(user);
            }
            j();
            com.bytedance.android.livesdk.ab.a a2 = c.a.b("ttlive_show_profile_all").a("target_is_anchor", Boolean.valueOf(this.f21868k)).a("self_is_anchor", Boolean.valueOf(this.f21870m)).a("user_id", Long.valueOf(this.f21863f.getId())).a("user_name", this.f21863f.getNickName());
            if (this.f21863f.getFollowInfo() != null && this.f21868k) {
                this.p.c(com.bytedance.android.live.n.d.class, Long.valueOf(this.f21863f.getFollowInfo().getFollowerCount()));
            }
            if (this.f21863f.getFollowInfo() != null) {
                a2.a("followers", Long.valueOf(user.getFollowInfo().getFollowerCount())).a("following", Long.valueOf(user.getFollowInfo().getFollowingCount()));
            }
            a2.f13426c = true;
            a2.a();
            if (Room.isValid(this.f21864g)) {
                long id = this.f21864g.getOwner().getId();
                int i2 = 0;
                if (u.a().b().c() == 0 || u.a().b().c() != id) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (this.f21863f.getLiveRoomId() == 0) {
                    z3 = false;
                }
                if (z2) {
                    if (z3) {
                        str = "live_anchor_c_anchor";
                    } else {
                        str = "live_anchor_c_audience";
                    }
                } else if (z3) {
                    str = "live_audience_c_anchor";
                } else {
                    str = "live_audience_c_audience";
                }
                if (this.f21864g != null && this.f21863f != null) {
                    com.bytedance.android.live.j.a aVar = (com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class);
                    if (!(aVar == null || !aVar.isMicRoomForRoom(this.f21864g) || this.f21864g.officialChannelInfo == null)) {
                        if (aVar.isMicAudience() && this.f21863f.getId() == this.f21864g.officialChannelInfo.f18978a.getId()) {
                            str = "carousel_audience_c_official_id";
                        } else if (!aVar.isMicAudience() && this.f21863f.getId() == this.f21864g.officialChannelInfo.f18978a.getId()) {
                            str = "loyal_audience_c_official_id";
                        } else if (aVar.isMicAudience() && this.f21863f.getId() == this.f21864g.getOwner().getId()) {
                            str = "carousel_audience_c_anchor";
                        } else if (!aVar.isMicAudience() && this.f21863f.getId() == this.f21864g.getOwner().getId()) {
                            str = "loyal_audience_c_anchor";
                        }
                    }
                    String g2 = com.bytedance.android.livesdk.ab.e.g();
                    com.bytedance.android.livesdk.ab.b a3 = b.a.a("livesdk_live_click_user").a(this.p).d("live_detail").b("live_interact").a("click_type", str);
                    UserProfileEvent userProfileEvent = this.F;
                    if (userProfileEvent != null) {
                        str2 = userProfileEvent.clickModule;
                    } else {
                        str2 = "";
                    }
                    com.bytedance.android.livesdk.ab.b a4 = a3.a("click_module", str2).a("request_page", str).a("to_user_id", String.valueOf(this.f21863f.getId())).a("enter_live_method", com.bytedance.android.livesdk.chatroom.d.a().e());
                    if (TextUtils.isEmpty(g2) || !"click_push_live_cd_user".equals(g2)) {
                        str3 = "0";
                    } else {
                        str3 = "1";
                    }
                    com.bytedance.android.livesdk.ab.b a5 = a4.a("is_subscribe", str3);
                    if (this.D) {
                        str4 = "portrait";
                    } else {
                        str4 = "landscape";
                    }
                    com.bytedance.android.livesdk.ab.b a6 = a5.a("room_orientation", str4);
                    UserProfileEvent userProfileEvent2 = this.F;
                    if (userProfileEvent2 == null || TextUtils.isEmpty(userProfileEvent2.mClickUserPosition)) {
                        str5 = "profile_card";
                    } else {
                        str5 = this.F.mClickUserPosition;
                    }
                    com.bytedance.android.livesdk.ab.b a7 = a6.a("click_user_position", str5);
                    if (this.f21863f.getSubscribeInfo() != null) {
                        if (this.f21863f.getSubscribeInfo().isAnchorQualified()) {
                            str6 = "open";
                        } else {
                            str6 = "close";
                        }
                        com.bytedance.android.livesdk.ab.b a8 = a7.a("subscription_status", str6);
                        if (this.f21863f.getSubscribeInfo().isAnchorQualified()) {
                            i2 = this.f21863f.getSubscribeInfo().getSubscriberCount();
                        }
                        a8.a("subscriber", i2);
                    }
                    a7.b();
                }
            }
        }
    }

    public void onClick(View view) {
        User user;
        String str;
        String str2;
        Room room;
        int id = view.getId();
        if (id == R.id.or) {
            if ((view.getTag(R.id.or) instanceof User) && !this.f21870m) {
                User user2 = (User) view.getTag(R.id.or);
                if (this.f21864g != null) {
                    if (com.bytedance.android.live.liveinteract.api.a.c.a().n.intValue() == 2) {
                        ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.grf);
                    } else {
                        if (this.f21868k) {
                            w wVar = this.f21861d;
                            user2.getId();
                            wVar.a();
                        } else {
                            w wVar2 = this.f21861d;
                            user2.getId();
                            wVar2.a();
                        }
                        HashMap hashMap = new HashMap(1);
                        if (this.p != null) {
                            hashMap.put("log_enter_live_source", this.p.b(com.bytedance.android.livesdkapi.e.b.class));
                        } else {
                            hashMap.put("log_enter_live_source", this.t);
                        }
                        hashMap.put("sec_user_id", user2.getSecUid());
                        if (LiveHideAudienceFollowingSetting.INSTANCE.getValue() && (room = this.f21864g) != null) {
                            hashMap.put("room_id", String.valueOf(room.getId()));
                        }
                        hashMap.put("enter_from", "live");
                        ((IHostAction) com.bytedance.android.live.t.a.a(IHostAction.class)).openUserProfilePage(user2.getId(), hashMap);
                        User user3 = this.f21863f;
                        if (!(user3 == null || user3.getFollowInfo() == null)) {
                            b.a.b("enter_personal_detail").a(this.p).a("enter_method", "click_head").a("to_user_id", this.f21863f.getId()).a("anchor_id", this.f21863f.getId()).a("follow_status", this.f21863f.getFollowInfo().getFollowStatus()).a("enter_from", "live").a("enter_from_method", "live").a("play_mode", "normal").a("relation_tag", this.f21863f.getFollowInfo().getFollowStatus()).b();
                        }
                        dismiss();
                    }
                }
                dismiss();
            }
        } else if (id == R.id.dmf) {
            this.I.setVisibility(0);
            this.J.setVisibility(8);
            k();
        } else {
            String str3 = "";
            if (id == R.id.ckf) {
                if (this.f21864g != null) {
                    getContext();
                    if (!e()) {
                        ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.efp);
                        return;
                    }
                    i iVar = (i) this.p.b(com.bytedance.android.livesdk.j.ao.class);
                    if (iVar != null) {
                        if (this.f21863f == null || this.f21864g.getOwner().getId() == this.f21863f.getId()) {
                            new l().show(iVar, f21858a);
                        } else {
                            this.p.a(cw.class, this.f21863f);
                            UserProfileEvent userProfileEvent = this.F;
                            if (userProfileEvent != null) {
                                str2 = userProfileEvent.mReportType;
                            } else {
                                str2 = "report_anchor";
                            }
                            long j2 = this.G;
                            String str4 = this.H;
                            boolean z2 = this.D;
                            h.f.b.l.d(str2, str3);
                            x xVar = new x();
                            Bundle bundle = new Bundle();
                            bundle.putLong("arg_msg_id", j2);
                            if (str4 != null) {
                                str3 = str4;
                            }
                            bundle.putString("arg_msg_content", str3);
                            bundle.putBoolean("arg_msg_is_vertical", z2);
                            bundle.putString("arg_msg_report_type", str2);
                            xVar.setArguments(bundle);
                            xVar.show(iVar, f21858a);
                        }
                    }
                    long c2 = u.a().b().c();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("user_id", String.valueOf(c2));
                    hashMap2.put("to_user_id", String.valueOf(this.f21862e));
                    if (c2 == this.f21864g.getOwnerUserId()) {
                        str = "anchor";
                    } else {
                        str = "admin";
                    }
                    hashMap2.put("admin_type", str);
                    b.a.a("livesdk_manage_click").a((Map<String, String>) hashMap2).a(this.p).c("click").b();
                }
            } else if (id == this.x.getId() && this.f21864g != null && (user = this.f21863f) != null && user.getFollowInfo() != null) {
                int pushStatus = (int) this.f21863f.getFollowInfo().getPushStatus();
                com.bytedance.android.live.j.a aVar = (com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class);
                if (aVar == null || !aVar.isMicRoomForRoom(this.f21864g) || !aVar.isMicAudienceForRoom(this.f21864g)) {
                    str3 = this.f21863f.displayId;
                } else {
                    Room room2 = this.f21864g;
                    if (!(room2 == null || room2.officialChannelInfo == null || this.f21864g.officialChannelInfo.f18978a == null)) {
                        str3 = this.f21864g.officialChannelInfo.f18978a.displayId;
                    }
                }
                IHostApp.a aVar2 = new IHostApp.a();
                aVar2.f23242b = String.valueOf(this.f21863f.getId());
                aVar2.f23241a = String.valueOf(this.f21864g.getId());
                aVar2.f23243c = "message";
                aVar2.f23244d = "live_cell";
                aVar2.f23245e.put("event_belong", "live");
                aVar2.f23245e.put("event_page", "notification_setting");
                ((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).showNotificationTipDialog(new StringBuilder().append(this.f21863f.getId()).toString(), str3, this.f21863f.getSecUid(), pushStatus, this.x, "", aVar2, ((Boolean) this.p.b(cp.class)).booleanValue(), new ab() {
                    /* class com.bytedance.android.livesdk.usercard.p.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(12876);
                    }

                    @Override // com.bytedance.android.livesdk.model.ab
                    public final void a() {
                    }

                    @Override // com.bytedance.android.livesdk.model.ab
                    public final void a(int i2) {
                        p.this.b(i2);
                        p.this.f21863f.getFollowInfo().setPushStatus((long) i2);
                    }
                });
                HashMap hashMap3 = new HashMap();
                hashMap3.put("enter_from_merge", "message");
                hashMap3.put("enter_method", "live_cell");
                hashMap3.put("anchor_id", String.valueOf(this.f21862e));
                hashMap3.put("room_id", String.valueOf(this.f21864g.getId()));
                b.a.a("livesdk_live_notification_button_click").a((Map<String, String>) hashMap3).a(this.p).c("click").b("live").a("event_page", "anchor_profile").b();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f21864g != null) {
            view.findViewById(R.id.epv).setOnClickListener(new q(this));
            this.v = view.findViewById(R.id.cdl);
            this.K = (ViewGroup) view.findViewById(R.id.ci9);
            this.I = view.findViewById(R.id.dby);
            View findViewById = view.findViewById(R.id.dmf);
            this.J = findViewById;
            findViewById.setOnClickListener(this);
            boolean z2 = false;
            this.I.setVisibility(0);
            this.J.setVisibility(8);
            this.u = view.findViewById(R.id.dlk);
            this.w = view.findViewById(R.id.ckf);
            this.x = (ImageView) view.findViewById(R.id.cww);
            this.y = (HSImageView) view.findViewById(R.id.or);
            this.L = view.findViewById(R.id.bu6);
            this.M = (HSImageView) view.findViewById(R.id.bu1);
            this.z = (HSImageView) view.findViewById(R.id.b_o);
            this.A = (ImageView) view.findViewById(R.id.b_n);
            this.N = (HSImageView) view.findViewById(R.id.bu2);
            this.y.setOnClickListener(this);
            this.x.setOnClickListener(this);
            Activity activity = this.B;
            User user = this.f21863f;
            Room room = this.f21864g;
            boolean z3 = this.D;
            int i2 = this.f21859b;
            y yVar = this.f21860c;
            DataChannel dataChannel = this.p;
            String str = this.t;
            UserProfileEvent userProfileEvent = this.F;
            f fVar = new f();
            fVar.f21836d = user;
            if (user != null) {
                fVar.f21839g = user.getId();
                fVar.f21842j = new w(activity, room, user.getId());
            }
            fVar.f21840h = room;
            fVar.f21845m = i2;
            fVar.f21843k = z3;
            fVar.f21844l = yVar;
            fVar.f21834b = activity;
            fVar.f21835c = dataChannel;
            fVar.q = str;
            fVar.n = userProfileEvent.interactLogLabel;
            fVar.o = userProfileEvent.coHostEnable;
            fVar.f21841i = userProfileEvent.roomId;
            this.C = fVar;
            fVar.r = new u(this);
            UserProfileEvent userProfileEvent2 = this.F;
            if (!(userProfileEvent2 == null || userProfileEvent2.mRankInfo == null)) {
                this.C.p = this.F.mRankInfo;
            }
            y yVar2 = this.f21860c;
            if (yVar2 != null) {
                yVar2.f21897b = this.C;
            }
            f fVar2 = this.C;
            if (fVar2 != null) {
                androidx.fragment.app.n a2 = getChildFragmentManager().a();
                a2.b(R.id.d_j, fVar2);
                a2.c();
            }
            if (this.f21865h == null) {
                this.v.setVisibility(8);
                this.K.setVisibility(0);
            } else {
                j();
            }
            long c2 = u.a().b().c();
            if (this.f21864g.getOwner() != null && c2 == this.f21864g.getOwner().getId()) {
                z2 = true;
            }
            this.f21870m = z2;
            if (z2) {
                this.n = true;
            } else {
                User user2 = this.f21865h;
                if (!(user2 == null || user2.getUserAttr() == null)) {
                    this.n = this.f21865h.getUserAttr().f19030b;
                }
            }
            k();
            ((z) com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdkapi.depend.b.a.class).a(com.bytedance.android.livesdk.util.rxutils.i.a(this, com.bytedance.android.livesdk.util.rxutils.b.b.DESTROY)).a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a((Fragment) this))).a(new r(this));
        }
    }
}
