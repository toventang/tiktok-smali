package com.bytedance.android.live.publicscreen.impl.e;

import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.a.d.h;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.live.publicscreen.a.e;
import com.bytedance.android.live.publicscreen.impl.model.chat.b;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.android.livesdk.model.message.ai;
import com.bytedance.android.livesdk.model.message.az;
import com.bytedance.android.livesdk.model.message.ce;
import com.bytedance.android.livesdk.model.message.i;
import com.bytedance.android.livesdk.model.message.y;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.d;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;
import h.f.b.l;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class q extends f {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private long F;
    private int G;
    private int H;
    private int I;
    private long J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int w;
    private int x;
    private long y;
    private int z;

    static {
        Covode.recordClassIndex(6796);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.c, com.bytedance.android.live.publicscreen.impl.e.b, com.bytedance.android.live.publicscreen.impl.e.g
    public final void d() {
        super.d();
        if (this.J == 0) {
            this.J = SystemClock.uptimeMillis();
        }
        this.K += e().n.f();
        this.L += e().n.g();
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.g
    public final void a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("room_id", e().f12197a);
            jSONObject.put("anchor_id", e().f12199c);
            jSONObject.put("msg_comment_cnt", this.f12327f);
            jSONObject.put("msg_comment_chathead_loaded", this.p);
            jSONObject.put("admin_type", g());
            jSONObject.put("hot_duration", TimeUnit.MILLISECONDS.toSeconds(this.v));
            jSONObject.put("folded_show_msg_cnt", this.q);
            jSONObject.put("unfolded_show_msg_cnt", this.r);
            jSONObject.put("show_msg_cnt", this.q + this.r);
            jSONObject.put("msg_like_cnt", this.f12328g);
            jSONObject.put("msg_gift_cnt", this.f12329h);
            jSONObject.put("msg_share_cnt", this.f12330i);
            jSONObject.put("msg_follow_cnt", this.f12331j);
            jSONObject.put("drop_like_cnt", this.f12332k);
            jSONObject.put("drop_gift_cnt", this.f12333l);
            jSONObject.put("drop_share_cnt", this.f12334m);
            jSONObject.put("drop_follow_cnt", this.n);
            jSONObject.put("drop_comment_cnt", this.o);
            jSONObject.put("msg_received_total_cnt", this.w);
            jSONObject.put("msg_filtered_total_cnt", this.x);
            jSONObject.put("msg_bind_total_duration", this.y);
            jSONObject.put("msg_bind_total_cnt", this.z);
            jSONObject.put("msg_member_enter_cnt", this.s);
            jSONObject.put("drop_member_enter_cnt", this.t);
            jSONObject.put("drop_total_cnt", this.A);
            jSONObject.put("drop_anchor_msg_cnt", this.B);
            jSONObject.put("drop_anchor_comment_cnt", this.C);
            jSONObject.put("drop_following_user_msg_cnt", this.D);
            jSONObject.put("drop_following_user_comment_cnt", this.E);
            jSONObject.put("msg_buffer_total_duration", this.F);
            jSONObject.put("msg_others_buffer_cnt", this.G);
            jSONObject.put("msg_fold_buffer_cnt", this.H);
            jSONObject.put("msg_buffer_total_cnt", this.I);
            jSONObject.put("receive_comment_cnt", this.M);
            jSONObject.put("receive_like_cnt", this.N);
            jSONObject.put("receive_gift_cnt", this.O);
            jSONObject.put("receive_share_cnt", this.P);
            jSONObject.put("receive_follow_cnt", this.Q);
            jSONObject.put("receive_member_enter_cnt", this.R);
            long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.uptimeMillis() - this.J);
            jSONObject.put("msg_others_buffer_avg_cnt", ((long) this.K) / seconds);
            jSONObject.put("msg_fold_buffer_avg_cnt", ((long) this.L) / seconds);
        } catch (Exception unused) {
        }
        d.a("ttlive_public_screen_message_metrics", null, null, jSONObject);
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.z = 0;
        this.G = 0;
        this.H = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.I = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.c, com.bytedance.android.live.publicscreen.impl.e.b
    public final void b(h hVar) {
        l.d(hVar, "");
        super.b(hVar);
        this.I++;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.c, com.bytedance.android.live.publicscreen.impl.e.b
    public final void a(a aVar) {
        l.d(aVar, "");
        super.a(aVar);
        if (aVar instanceof i) {
            this.M++;
        } else if (aVar instanceof ai) {
            this.N++;
        } else if (aVar instanceof y) {
            this.O++;
        } else {
            if (aVar instanceof ce) {
                if (((int) ((ce) aVar).f19470a) == 3) {
                    this.P++;
                } else if (((int) ((ce) aVar).f19470a) == 1) {
                    this.Q++;
                }
            }
            if ((aVar instanceof az) && ((az) aVar).f19236h == 1) {
                this.R++;
            }
        }
        this.w++;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.c, com.bytedance.android.live.publicscreen.impl.e.b, com.bytedance.android.live.publicscreen.impl.e.g
    public final void f(h hVar) {
        Boolean bool;
        l.d(hVar, "");
        super.f(hVar);
        if (hVar instanceof k) {
            k kVar = (k) hVar;
            if (kVar.D()) {
                this.B++;
                if (hVar instanceof b) {
                    this.C++;
                }
            }
            User b2 = kVar.b();
            if (b2 != null) {
                bool = b2.isFollowing;
            } else {
                bool = null;
            }
            if (l.a((Object) bool, (Object) true)) {
                this.D++;
                if (hVar instanceof b) {
                    this.E++;
                }
            }
        }
        this.A++;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.c, com.bytedance.android.live.publicscreen.impl.e.b
    public final void a(com.bytedance.android.live.publicscreen.a.b<? extends IMessage> bVar, a aVar) {
        l.d(bVar, "");
        l.d(aVar, "");
        super.a(bVar, aVar);
        this.x++;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.c, com.bytedance.android.live.publicscreen.impl.e.b
    public final void c(h hVar, long j2) {
        l.d(hVar, "");
        super.c(hVar, j2);
        if (hVar.h().f12182a) {
            this.F += hVar.h().f12184c - hVar.h().f12183b;
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.c, com.bytedance.android.live.publicscreen.impl.e.b, com.bytedance.android.live.publicscreen.impl.e.g, com.bytedance.android.live.publicscreen.impl.e.f
    public final void a(h hVar, long j2) {
        l.d(hVar, "");
        super.a(hVar, j2);
        this.y += hVar.d().f12181c - hVar.d().f12180b;
        this.z++;
        if (j2 == 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("room_id", e().f12197a);
                jSONObject.put("anchor_id", e().f12199c);
                jSONObject.put("admin_type", g());
                if (e().f12205i) {
                    Long startStreamingTimestamp = ((e) com.bytedance.android.live.t.a.a(e.class)).getStartStreamingTimestamp(e().f12197a);
                    if (startStreamingTimestamp != null) {
                        long longValue = startStreamingTimestamp.longValue();
                        jSONObject.put("public_screen_load_duration", ((f) this).f12320b - longValue);
                        jSONObject.put("public_screen_first_message_total_duration", this.f12322d - longValue);
                    }
                } else {
                    f fVar = f.a.f23366a;
                    l.b(fVar, "");
                    EnterRoomLinkSession a2 = fVar.a();
                    l.b(a2, "");
                    EnterRoomConfig.TimeStamp timeStamp = a2.f23354b.f23299c.af;
                    if (timeStamp != null) {
                        long j3 = timeStamp.f23351a;
                        jSONObject.put("public_screen_load_duration", ((f) this).f12320b - j3);
                        jSONObject.put("public_screen_first_message_total_duration", this.f12322d - j3);
                    }
                }
                jSONObject.put("public_screen_first_message_receive_duration", ((f) this).f12321c - ((f) this).f12320b);
                jSONObject.put("public_screen_first_message_show_duration", this.f12322d - ((f) this).f12321c);
            } catch (Exception unused) {
            }
            d.a("ttlive_public_screen_metrics", null, null, jSONObject);
        }
    }
}
