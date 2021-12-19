package com.bytedance.android.livesdk.chatroom.end;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.ab;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.at.j;
import com.bytedance.android.livesdk.chatroom.end.LiveRecommendBar;
import com.bytedance.android.livesdk.chatroom.end.g;
import com.bytedance.android.livesdk.j.bv;
import com.bytedance.android.livesdk.j.by;
import com.bytedance.android.livesdk.j.bz;
import com.bytedance.android.livesdk.j.ca;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableEnterRoomOptFromLiveAudienceEndSetting;
import com.bytedance.android.livesdk.model.RoomStats;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.b.c;
import com.bytedance.android.livesdk.utils.z;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.a.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.j;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.h;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import f.a.e.b.a;
import f.a.e.e.e.m;
import f.a.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class b extends h implements g.a, a, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public View f15416a;

    /* renamed from: b  reason: collision with root package name */
    public List<Room> f15417b;

    /* renamed from: c  reason: collision with root package name */
    public DataChannel f15418c;

    /* renamed from: i  reason: collision with root package name */
    private a f15419i;

    /* renamed from: j  reason: collision with root package name */
    private Activity f15420j;

    /* renamed from: k  reason: collision with root package name */
    private WeakHandler f15421k = new WeakHandler(this);

    /* renamed from: l  reason: collision with root package name */
    private VHeadView f15422l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f15423m;
    private HSImageView n;
    private TopFansLayout o;
    private View p;
    private View q;
    private LinearLayout r;
    private View s;
    private List<LiveRecommendBar> t = new ArrayList();
    private g u;
    private View.OnClickListener v = new View.OnClickListener() {
        /* class com.bytedance.android.livesdk.chatroom.end.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(8518);
        }

        public final void onClick(View view) {
            if (view.getTag() != null && (view.getTag() instanceof Room)) {
                Room room = (Room) view.getTag();
                EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                enterRoomConfig.f23298b.f23315g = room.getLog_pb();
                enterRoomConfig.f23298b.f23309a = room.getRequestId();
                enterRoomConfig.f23299c.J = "live_end";
                enterRoomConfig.f23299c.L = "live_cover";
                enterRoomConfig.f23298b.f23319k = room.getUserFrom();
                enterRoomConfig.f23299c.r = room.getOrientation();
                enterRoomConfig.f23299c.R = room.getId();
                enterRoomConfig.f23299c.S = room.getStreamType();
                if (b.this.f15418c != null && ((Boolean) b.this.f15418c.b(by.class)).booleanValue()) {
                    enterRoomConfig.f23299c.O = ((Boolean) b.this.f15418c.b(by.class)).booleanValue();
                    enterRoomConfig.f23299c.P = (String) b.this.f15418c.b(bz.class);
                    enterRoomConfig.f23299c.Q = (String) b.this.f15418c.b(bv.class);
                    enterRoomConfig.f23299c.W = "full_screen";
                    enterRoomConfig.f23299c.A = (String) b.this.f15418c.b(ca.class);
                }
                Boolean valueOf = Boolean.valueOf(EnableEnterRoomOptFromLiveAudienceEndSetting.INSTANCE.getValue());
                if (valueOf != null && valueOf.booleanValue()) {
                    enterRoomConfig = com.bytedance.android.livesdkapi.g.a.a(room, enterRoomConfig);
                }
                ((j) com.bytedance.android.live.t.a.a(j.class)).a(b.this.getContext(), enterRoomConfig);
                com.bytedance.android.livesdk.live.c.a.a().f18672a = new com.bytedance.android.livesdk.live.a.a("live_end");
            }
        }
    };
    private View.OnClickListener w = new View.OnClickListener() {
        /* class com.bytedance.android.livesdk.chatroom.end.b.AnonymousClass2 */

        static {
            Covode.recordClassIndex(8519);
        }

        public final void onClick(View view) {
            int id = view.getId();
            if (id == R.id.b7a) {
                b.this.b();
            } else if (id == R.id.qk || id == R.id.c9k) {
                b.d();
            } else if (id == R.id.emx) {
                b.this.c();
            }
        }
    };
    private LiveRecommendBar.b x = new LiveRecommendBar.b() {
        /* class com.bytedance.android.livesdk.chatroom.end.b.AnonymousClass3 */

        static {
            Covode.recordClassIndex(8520);
        }

        @Override // com.bytedance.android.livesdk.chatroom.end.LiveRecommendBar.b
        public final void a() {
            if (b.this.getUserVisibleHint() && b.this.f15417b.size() >= 2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(b.this.f15417b.get(0));
                arrayList.add(b.this.f15417b.get(1));
                b.this.f15417b.removeAll(arrayList);
                b.this.a(arrayList);
            }
        }
    };

    static {
        Covode.recordClassIndex(8517);
    }

    @Override // com.bytedance.android.livesdkapi.depend.a.a
    public final boolean i_() {
        a aVar = this.f15419i;
        if (aVar == null || !aVar.i_()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        WeakHandler weakHandler = this.f15421k;
        if (weakHandler != null) {
            weakHandler.removeCallbacks(null);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.t)) {
            for (LiveRecommendBar liveRecommendBar : this.t) {
                if (liveRecommendBar != null) {
                    liveRecommendBar.a();
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, com.bytedance.android.livesdk.chatroom.end.h, androidx.fragment.app.Fragment
    public final void onResume() {
        LiveRecommendBar.b bVar;
        super.onResume();
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.t)) {
            for (LiveRecommendBar liveRecommendBar : this.t) {
                if (liveRecommendBar != null && getUserVisibleHint()) {
                    if (this.t.indexOf(liveRecommendBar) == 0) {
                        bVar = this.x;
                    } else {
                        bVar = null;
                    }
                    liveRecommendBar.a(bVar);
                }
            }
        }
    }

    public final void b() {
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
            a2.f14160c = -1;
            a2.f14162e = "live_detail";
            a2.f14163f = "follow";
            a2.f14161d = "live";
            b2.a(context, a2.a()).b(new com.bytedance.android.livesdk.at.g());
        } else if (this.f15446d != null) {
            User owner = this.f15446d.getOwner();
            if (owner != null) {
                this.u.a(owner.getId(), this.f15446d, this.f15449g, this);
            }
            if (com.bytedance.android.livesdk.utils.a.a(this.f15418c) && this.f15446d.author() != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("refer", "card_follow_button");
                HashMap hashMap2 = new HashMap();
                hashMap2.put("anchor_id", String.valueOf(this.f15446d.author().getId()));
                hashMap2.put("room_id", String.valueOf(this.f15446d.getId()));
                com.bytedance.android.livesdk.utils.a.a("live_ad", "follow", hashMap, hashMap2);
            }
        }
    }

    private static String b(Room room) {
        User owner;
        FollowInfo followInfo;
        if (room == null || (owner = room.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null) {
            return "0";
        }
        long followStatus = followInfo.getFollowStatus();
        if (followStatus == 1 || followStatus == 2) {
            return "1";
        }
        return "0";
    }

    @Override // com.bytedance.android.livesdk.chatroom.end.g.a
    public final void a(com.bytedance.android.livesdkapi.depend.model.b.a aVar) {
        if (this.f15420j != null) {
            View view = this.p;
            if (view != null && view.getVisibility() == 0) {
                this.p.setVisibility(8);
            }
            ao.a(this.f15420j, (int) R.string.gqv);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15418c = com.bytedance.ies.sdk.datachannel.f.a(this);
        if (this.f15446d != null) {
            com.bytedance.android.livesdk.chatroom.b.f.f14958a.a(this.f15421k, false, this.f15446d.getId(), 4, 12);
            this.u = new g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        LiveRecommendBar.b bVar;
        super.setUserVisibleHint(z);
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.t)) {
            for (LiveRecommendBar liveRecommendBar : this.t) {
                if (liveRecommendBar != null) {
                    if (z) {
                        if (this.t.indexOf(liveRecommendBar) == 0) {
                            bVar = this.x;
                        } else {
                            bVar = null;
                        }
                        liveRecommendBar.a(bVar);
                    } else {
                        liveRecommendBar.a();
                    }
                }
            }
        }
    }

    private void a(RoomStats roomStats) {
        View a2 = a(R.id.bqd);
        if (roomStats != null && isViewValid()) {
            n.a(a2, 0);
            TextView textView = (TextView) a(R.id.bqh);
            if (textView != null) {
                try {
                    n.a(textView, com.bytedance.android.live.core.f.b.b(roomStats.getTicket()));
                } catch (Exception e2) {
                    com.bytedance.android.live.core.c.a.a("ALogger", e2);
                }
                String b2 = com.bytedance.android.live.core.f.b.b(roomStats.getTicket());
                if (com.bytedance.android.live.core.f.b.c(roomStats.getTicket())) {
                    textView.setText(ab.a(b2, b2.length() - 1, b2.length()));
                } else {
                    textView.setText(b2);
                }
            }
        }
    }

    private void c(Room room) {
        String str;
        if (room != null) {
            if (this.f15447e) {
                str = "anchor_live_ending";
            } else {
                str = "live_end";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_view");
            hashMap.put("action_type", "click");
            hashMap.put("event_page", str);
            hashMap.put("enter_from", "live_detail");
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("request_id", room.getRequestId());
            hashMap.put("log_pb", room.getLog_pb());
            hashMap.put("room_id", String.valueOf(room.getId()));
            hashMap.put("live_type", com.bytedance.android.livesdkapi.depend.model.live.j.a(room.getStreamType()));
            hashMap.put("enter_from_merge", "live_end");
            hashMap.put("enter_method", "live_cover");
            String g2 = e.g();
            if (TextUtils.isEmpty(g2) || !"click_push_live_cd_user".equals(g2)) {
                hashMap.put("is_subscribe", "0");
            } else {
                hashMap.put("is_subscribe", "1");
            }
            hashMap.put("is_fans", b(room));
            hashMap.put("is_return", "0");
            if (room.getLinkMicInfo() == null) {
                b.a.a("live_show").a((Map<String, String>) hashMap).a(this.f15418c).b();
            } else {
                t.b(room.getLinkMicInfo()).d(c.f15429a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.h.a.b(f.a.k.a.f158006c)).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new d(this, hashMap), e.f15432a);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.end.g.a
    public final void a(Throwable th) {
        if (this.f15420j != null && th != null) {
            n.a(this.p, 0);
            if (th instanceof com.bytedance.android.live.a.a.b.a) {
                ao.a(this.f15420j, ((com.bytedance.android.live.a.a.b.a) th).getPrompt(), 0);
            } else {
                ao.a(this.f15420j, (int) R.string.gqu);
            }
        }
    }

    public final void a(List<Room> list) {
        boolean z;
        if (this.r.getChildCount() >= 2) {
            int i2 = 0;
            while (i2 < list.size() && i2 < 2) {
                Room room = list.get(i2);
                if (Room.isValid(room)) {
                    View childAt = this.r.getChildAt(i2);
                    if (i2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    a(room, childAt, z);
                }
                i2++;
            }
            if (this.f15417b.size() <= 4) {
                com.bytedance.android.livesdk.chatroom.api.a.a(this.f15421k, this.f15446d.getId());
            }
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        boolean z;
        Room room;
        MethodCollector.i(2955);
        Activity activity = this.f15420j;
        if (activity == null) {
            MethodCollector.o(2955);
        } else if (activity.isFinishing()) {
            MethodCollector.o(2955);
        } else {
            int i2 = message.what;
            if (!(message.obj instanceof Exception)) {
                if (12 == i2) {
                    if (!(!(message.obj instanceof Room) || (room = (Room) message.obj) == null || room.getStats() == null || this.o == null)) {
                        User owner = this.f15446d.getOwner();
                        if (owner != null && owner.isFollowing()) {
                            this.f15448f = true;
                            n.a(this.p, 8);
                        }
                        if (h.a(room.getTopFanTickets())) {
                            n.a(this.o, 8);
                        } else {
                            this.o.setFollowVisible(false);
                            this.o.setDataChannel(this.f15418c);
                            TopFansLayout topFansLayout = this.o;
                            Activity activity2 = this.f15420j;
                            String str = this.f15449g;
                            if (activity2 != null) {
                                topFansLayout.f15398f = room;
                                topFansLayout.f15393a = room.getTopFanTickets();
                                topFansLayout.f15396d = activity2;
                                topFansLayout.f15397e = this;
                                topFansLayout.f15401i = str;
                                f.a.d.g gVar = j.f15452a;
                                a.l lVar = a.l.INSTANCE;
                                f.a.e.b.b.a((Object) gVar, "keySelector is null");
                                f.a.e.b.b.a((Object) lVar, "collectionSupplier is null");
                                f.a.h.a.a(new m(((com.bytedance.android.livesdk.utils.b.b) t.b((Iterable) topFansLayout.f15393a).a(new c())).f22249a, gVar, lVar)).h().a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new k(topFansLayout, this), l.f15455a);
                                topFansLayout.f15399g = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0108: IPUT  
                                      (wrap: com.bytedance.android.livesdk.chatroom.end.TopFansLayout$1 : 0x0105: CONSTRUCTOR  (r0v65 com.bytedance.android.livesdk.chatroom.end.TopFansLayout$1) = (r4v1 'topFansLayout' com.bytedance.android.livesdk.chatroom.end.TopFansLayout) call: com.bytedance.android.livesdk.chatroom.end.TopFansLayout.1.<init>(com.bytedance.android.livesdk.chatroom.end.TopFansLayout):void type: CONSTRUCTOR)
                                      (r4v1 'topFansLayout' com.bytedance.android.livesdk.chatroom.end.TopFansLayout)
                                     com.bytedance.android.livesdk.chatroom.end.TopFansLayout.g android.view.View$OnClickListener in method: com.bytedance.android.livesdk.chatroom.end.b.handleMsg(android.os.Message):void, file: classes6.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0105: CONSTRUCTOR  (r0v65 com.bytedance.android.livesdk.chatroom.end.TopFansLayout$1) = (r4v1 'topFansLayout' com.bytedance.android.livesdk.chatroom.end.TopFansLayout) call: com.bytedance.android.livesdk.chatroom.end.TopFansLayout.1.<init>(com.bytedance.android.livesdk.chatroom.end.TopFansLayout):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.chatroom.end.b.handleMsg(android.os.Message):void, file: classes6.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                    	... 46 more
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.chatroom.end.TopFansLayout, state: GENERATED_AND_UNLOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                    	... 50 more
                                    */
                                /*
                                // Method dump skipped, instructions count: 524
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.end.b.handleMsg(android.os.Message):void");
                            }

                            public static void a(long j2, int i2) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("time", Long.valueOf(j2));
                                com.bytedance.android.live.core.d.c.a("ttlive_image_load_recommond_live", i2, hashMap);
                            }

                            @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
                            public final void onViewCreated(View view, Bundle bundle) {
                                User user;
                                View view2;
                                super.onViewCreated(view, bundle);
                                this.f15422l = (VHeadView) a(R.id.emx);
                                this.f15423m = (TextView) a(R.id.emy);
                                this.n = (HSImageView) a(R.id.ccw);
                                this.o = (TopFansLayout) a(R.id.epf);
                                this.p = a(R.id.b7a);
                                this.q = a(R.id.din);
                                this.s = a(R.id.title);
                                View a2 = a(R.id.qk);
                                this.f15416a = a2;
                                a2.setOnClickListener(this.w);
                                this.f15422l.setOnClickListener(this.w);
                                this.p.setOnClickListener(this.w);
                                n.a(a(R.id.ccu), 8);
                                if (this.f15446d != null) {
                                    user = this.f15446d.getOwner();
                                    if (user != null) {
                                        com.bytedance.android.livesdk.chatroom.g.g.a(this.f15422l, user.getAvatarThumb(), 2131234424);
                                        this.f15423m.setText(com.bytedance.android.livesdk.ac.g.b(user));
                                    }
                                } else {
                                    user = null;
                                }
                                if (this.f15446d != null) {
                                    com.bytedance.android.livesdk.chatroom.api.a.a(this.f15421k, this.f15446d.getId());
                                    a(this.f15446d.getStats());
                                }
                                if (user != null) {
                                    if (user.isFollowing()) {
                                        n.a(this.p, 8);
                                    }
                                    if (user.getId() == u.a().b().c()) {
                                        u.a().b().f();
                                    }
                                }
                                float a3 = ((float) n.a(getContext())) / ((float) n.b(getContext()));
                                if (user != null) {
                                    k.a(this.n, user.getAvatarLarge(), new z(8, a3));
                                }
                                n.a(this.o, 8);
                                if (!(getContext() == null || (view2 = this.s) == null)) {
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                                    marginLayoutParams.topMargin = (int) n.b(getContext(), 100.0f);
                                    this.s.setLayoutParams(marginLayoutParams);
                                }
                                com.bytedance.android.livesdk.ab.k.a(this.f15420j);
                                if (this.f15446d != null) {
                                    this.f15446d.getId();
                                }
                                b.a.a("livesdk_finish_show").a().b();
                                com.bytedance.android.live.liveinteract.api.a.c.a().a((Integer) 0);
                            }

                            @Override // androidx.fragment.app.Fragment
                            public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                                return com.a.a(LayoutInflater.from(getContext()), R.layout.b93, viewGroup, false);
                            }

                            private void a(Room room, View view, boolean z) {
                                ImageModel avatarMedium;
                                HSImageView hSImageView = (HSImageView) view.findViewById(R.id.agf);
                                TextView textView = (TextView) view.findViewById(R.id.awm);
                                LiveRecommendBar liveRecommendBar = (LiveRecommendBar) view.findViewById(R.id.awl);
                                if (!this.t.contains(liveRecommendBar)) {
                                    this.t.add(liveRecommendBar);
                                }
                                if (room.getOwner() != null && !TextUtils.isEmpty(room.getOwner().getNickName())) {
                                    n.a(textView, room.getOwner().getNickName());
                                }
                                LiveRecommendBar.b bVar = null;
                                if (z) {
                                    bVar = this.x;
                                }
                                liveRecommendBar.a(bVar);
                                if (!(room.getOwner() == null || (avatarMedium = room.getOwner().getAvatarMedium()) == null)) {
                                    k.a(hSImageView, avatarMedium, new p.a() {
                                        /* class com.bytedance.android.livesdk.chatroom.end.b.AnonymousClass4 */

                                        /* renamed from: a  reason: collision with root package name */
                                        long f15427a;

                                        static {
                                            Covode.recordClassIndex(8521);
                                        }

                                        @Override // com.bytedance.android.live.core.f.p.a
                                        public final void a(ImageModel imageModel) {
                                            this.f15427a = SystemClock.elapsedRealtime();
                                        }

                                        @Override // com.bytedance.android.live.core.f.p.a
                                        public final void a(ImageModel imageModel, Exception exc) {
                                            b.a(SystemClock.elapsedRealtime() - this.f15427a, 1);
                                        }

                                        @Override // com.bytedance.android.live.core.f.p.a
                                        public final void a(ImageModel imageModel, int i2, int i3) {
                                            b.a(SystemClock.elapsedRealtime() - this.f15427a, 0);
                                        }
                                    });
                                }
                                view.setTag(room);
                                c(room);
                            }

                            public final void a(Activity activity, Room room, com.bytedance.android.livesdkapi.depend.a.a aVar, String str, String str2) {
                                this.f15420j = activity;
                                this.f15446d = room;
                                this.f15419i = aVar;
                                this.f15449g = str;
                                this.f15450h = str2;
                                this.f15447e = false;
                            }
                        }
