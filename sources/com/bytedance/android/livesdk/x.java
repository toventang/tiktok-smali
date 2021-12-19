package com.bytedance.android.livesdk;

import com.bytedance.android.livesdk.model.message.a.a;
import com.bytedance.android.livesdk.model.message.aa;
import com.bytedance.android.livesdk.model.message.ab;
import com.bytedance.android.livesdk.model.message.ac;
import com.bytedance.android.livesdk.model.message.ae;
import com.bytedance.android.livesdk.model.message.af;
import com.bytedance.android.livesdk.model.message.ag;
import com.bytedance.android.livesdk.model.message.ah;
import com.bytedance.android.livesdk.model.message.ai;
import com.bytedance.android.livesdk.model.message.aj;
import com.bytedance.android.livesdk.model.message.ak;
import com.bytedance.android.livesdk.model.message.al;
import com.bytedance.android.livesdk.model.message.am;
import com.bytedance.android.livesdk.model.message.an;
import com.bytedance.android.livesdk.model.message.ao;
import com.bytedance.android.livesdk.model.message.ap;
import com.bytedance.android.livesdk.model.message.aq;
import com.bytedance.android.livesdk.model.message.ar;
import com.bytedance.android.livesdk.model.message.at;
import com.bytedance.android.livesdk.model.message.au;
import com.bytedance.android.livesdk.model.message.aw;
import com.bytedance.android.livesdk.model.message.ay;
import com.bytedance.android.livesdk.model.message.az;
import com.bytedance.android.livesdk.model.message.bd;
import com.bytedance.android.livesdk.model.message.be;
import com.bytedance.android.livesdk.model.message.bf;
import com.bytedance.android.livesdk.model.message.bg;
import com.bytedance.android.livesdk.model.message.bh;
import com.bytedance.android.livesdk.model.message.bi;
import com.bytedance.android.livesdk.model.message.bk;
import com.bytedance.android.livesdk.model.message.bl;
import com.bytedance.android.livesdk.model.message.bm;
import com.bytedance.android.livesdk.model.message.bn;
import com.bytedance.android.livesdk.model.message.bo;
import com.bytedance.android.livesdk.model.message.bq;
import com.bytedance.android.livesdk.model.message.bt;
import com.bytedance.android.livesdk.model.message.bu;
import com.bytedance.android.livesdk.model.message.bv;
import com.bytedance.android.livesdk.model.message.bw;
import com.bytedance.android.livesdk.model.message.bx;
import com.bytedance.android.livesdk.model.message.by;
import com.bytedance.android.livesdk.model.message.bz;
import com.bytedance.android.livesdk.model.message.ca;
import com.bytedance.android.livesdk.model.message.cb;
import com.bytedance.android.livesdk.model.message.cc;
import com.bytedance.android.livesdk.model.message.cd;
import com.bytedance.android.livesdk.model.message.ce;
import com.bytedance.android.livesdk.model.message.cf;
import com.bytedance.android.livesdk.model.message.ci;
import com.bytedance.android.livesdk.model.message.cj;
import com.bytedance.android.livesdk.model.message.ck;
import com.bytedance.android.livesdk.model.message.d;
import com.bytedance.android.livesdk.model.message.e;
import com.bytedance.android.livesdk.model.message.e.b;
import com.bytedance.android.livesdk.model.message.g;
import com.bytedance.android.livesdk.model.message.i;
import com.bytedance.android.livesdk.model.message.j;
import com.bytedance.android.livesdk.model.message.k;
import com.bytedance.android.livesdk.model.message.l;
import com.bytedance.android.livesdk.model.message.n;
import com.bytedance.android.livesdk.model.message.o;
import com.bytedance.android.livesdk.model.message.p;
import com.bytedance.android.livesdk.model.message.q;
import com.bytedance.android.livesdk.model.message.s;
import com.bytedance.android.livesdk.model.message.t;
import com.bytedance.android.livesdk.model.message.u;
import com.bytedance.android.livesdk.model.message.v;
import com.bytedance.android.livesdk.model.message.w;
import com.bytedance.android.livesdk.model.message.y;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public enum x {
    CHAT(a.CHAT.getWsMethod(), i.class),
    EMOTE_CHAT(a.EMOTE_CHAT.getWsMethod(), s.class),
    DONATION_INFO(a.DONATION_INFO.getWsMethod(), q.class),
    CONTROL(a.CONTROL.getWsMethod(), n.class),
    DIGG(a.DIGG.getWsMethod(), p.class),
    LIKE(a.LIKE.getWsMethod(), ai.class),
    GIFT(a.GIFT.getWsMethod(), y.class),
    MEMBER(a.MEMBER.getWsMethod(), az.class),
    ROOM(a.ROOM.getWsMethod(), bx.class),
    SOCIAL(a.SOCIAL.getWsMethod(), ce.class),
    SCREEN(a.SCREEN.getWsMethod(), cc.class),
    ROOM_NOTIFY(a.ROOM_NOTIFY.getWsMethod(), by.class),
    REMIND(a.REMIND.getWsMethod(), bv.class),
    MODIFY_DECORATION(a.MODIFY_DECORATION.getWsMethod(), o.class),
    MODIFY_STICKER(a.MODIFY_STICKER.getWsMethod(), cf.class),
    ROOM_PUSH(a.ROOM_PUSH.getWsMethod(), bz.class),
    USER_STATS(a.USER_STATS.getWsMethod(), ci.class),
    IN_ROOM_BANNER(a.IN_ROOM_BANNER_MESSAGE.getWsMethod(), ag.class),
    ROOM_RICH_CHAT(a.ROOM_RICH_CHAT_MESSAGE.getWsMethod(), bw.class),
    LINK_MIC(a.LINK_MIC.getWsMethod(), ar.class),
    LINK_MESSAGE(a.LINK_MESSAGE.getWsMethod(), aj.class),
    WISH_LIST_MESSAGE(a.WISH_LIST_UPDATE_MESSAGE.getWsMethod(), com.bytedance.android.livesdk.gift.model.y.class),
    BOTTOM_MESSAGE(a.BOTTOM_MESSAGE.getWsMethod(), g.class),
    LINK_MIC_SIGNAL(a.LINK_MIC_SIGNAL.getWsMethod(), at.class),
    BANNER_UPDATE(a.BANNER_UPDATE.getWsMethod(), d.class),
    LINK_MIC_BATTLE(a.LINK_MIC_BATTLE.getWsMethod(), an.class),
    LINK_MIC_BATTLE_ARMIES(a.LINK_MIC_BATTLE_ARMIES.getWsMethod(), am.class),
    LINK_MIC_BATTLE_PUNISH_FINISH(a.LINK_MIC_BATTLE_PUNISH_FINISH.getWsMethod(), ap.class),
    LINK_MIC_BATTLE_NOTICE(a.LINK_MIC_BATTLE_NOTICE.getWsMethod(), ao.class),
    LINK_MIC_BATTLE_TASK(a.LINK_MIC_BATTLE_TASK.getWsMethod(), aq.class),
    LINK_CO_HOST_GUIDE(a.LINK_CO_HOST_GUIDE.getWsMethod(), ak.class),
    LINK_AUDIENCE_GUIDE(a.LINK_AUDIENCE_NOTICE.getWsMethod(), al.class),
    HASHTAG(a.HASHTAG.getWsMethod(), ac.class),
    GIFT_UPDATE(a.GIFT_UPDATE.getWsMethod(), aa.class),
    COMMON_TOAST(a.COMMON_TOAST.getWsMethod(), l.class),
    COMMENT_IMAGE(a.COMMENT_IMAGE.getWsMethod(), j.class),
    USER_SEQ(a.USER_SEQ.getWsMethod(), ca.class),
    ROOM_VERIFY(a.ROOM_VERIFY.getWsMethod(), cb.class),
    GOODS_ORDER(a.GOODS_ORDER.getWsMethod(), ck.class),
    FOLLOW_GUIDE(a.FOLLOW_GUIDE.getWsMethod(), t.class),
    GUIDE_MESSAGE(a.GUIDE_MESSAGE.getWsMethod(), ab.class),
    ASSET_MESSAGE(a.ASSET_MESSAGE.getWsMethod(), com.bytedance.android.livesdk.model.message.a.class),
    D_H5_Message(a.D_H5_MESSAGE.getWsMethod(), bi.class),
    PORTAL_MESSAGE(a.PORTAL_MESSAGE.getWsMethod(), bh.class),
    POPULAR_CARD_MESSAGE(a.POPULAR_CARD_MESSAGE.getWsMethod(), bg.class),
    COMMON_POPUP_MESSAGE(a.COMMON_POPUP_MESSAGE.getWsMethod(), k.class),
    IN_ROOM_BANNER_REFRESH(a.IN_ROOM_BANNER_REFRESH_MESSAGE.getWsMethod(), ah.class),
    SHARE_GUIDE_MESSAGE(a.SHARE_GUIDE_MESSAGE.getWsMethod(), cd.class),
    HOURLY_RANK_MESSAGE(a.HOURLY_RANK_MESSAGE.getWsMethod(), bu.class),
    HOURLY_RANK_REWARD_MESSAGE(a.HOURLY_RANK_REWARD_MESSAGE.getWsMethod(), ae.class),
    RANK_PROMPT_MESSAGE(a.RANK_PROMPT_MESSAGE.getWsMethod(), bq.class),
    OFFICIAL_CHANNEL_ANCHOR_MESSAGE(a.OFFICIAL_CHANNEL_ANCHOR_MESSAGE.getWsMethod(), bd.class),
    OFFICIAL_CHANNEL_MODIFY_MESSAGE(a.OFFICIAL_CHANNEL_MODIFY_MESSAGE.getWsMethod(), be.class),
    OFFICIAL_CHANNEL_USER_MESSAGE(a.OFFICIAL_CHANNEL_USER_MESSAGE.getWsMethod(), bf.class),
    TRAY_MESSAGE(a.TRAY_MESSAGE.getWsMethod(), aw.class),
    QUESTION(a.QUESTION.getWsMethod(), bl.class),
    QUESTION_DELETE_MESSAGE(a.QUESTION_DELETE_MESSAGE.getWsMethod(), bk.class),
    QUESTION_SELECT_MESSAGE(a.QUESTION_SELECT_MESSAGE.getWsMethod(), bm.class),
    QUESTION_SLIDE_DOWN_MESSAGE(a.QUESTION_SLIDE_DOWN_MESSAGE.getWsMethod(), bn.class),
    QUESTION_SWITCH_MESSAGE(a.QUESTION_SWITCH_MESSAGE.getWsMethod(), bo.class),
    BARRAGE_MESSAGE(a.BARRAGE_MESSAGE.getWsMethod(), e.class),
    RANK_TOAST_MESSAGE(a.RANK_TOAST_MESSAGE.getWsMethod(), bt.class),
    GIFT_GUIDE_MESSAGE(a.GIFT_GUIDE_MESSAGE.getWsMethod(), w.class),
    MARQUEE_ANNOUNCEMENT_MESSAGE(a.MARQUEE_ANNOUNCEMENT_MESSAGE.getWsMethod(), ay.class),
    WEEKLY_RANK_REWARD_MESSAGE(a.WEEKLY_RANK_REWARD_MESSAGE.getWsMethod(), cj.class),
    IM_DELETE_MESSAGE(a.IM_DELETE.getWsMethod(), af.class),
    GIFT_GLOBAL_MESSAGE(a.GIFT_GLOBAL_MESSAGE.getWsMethod(), v.class),
    RED_ENVELOPE_MESSAGE(a.RED_ENVELOPE_MESSAGE.getWsMethod(), b.class),
    LIVE_INTRO_MESSAGE(a.LIVE_INTRO_MESSAGE.getWsMethod(), au.class),
    GIFT_BOOST_CARD_MESSAGE(a.GIFT_BOOST_CARD_MESSAGE.getWsMethod(), u.class);
    

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, x> f22898a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<String, Class<? extends com.bytedance.android.livesdk.ac.b.a>> f22899b = new HashMap<>();
    private Class<? extends com.bytedance.android.livesdk.ac.b.a> messageClass;
    private com.bytedance.android.livesdk.ac.b.a messageObject;
    private String method;

    static {
        Covode.recordClassIndex(13530);
        x[] values = values();
        for (x xVar : values) {
            f22898a.put(xVar.method, xVar);
        }
    }

    public static com.bytedance.android.livesdk.ac.b.a getMessageObject(String str) {
        x xVar = f22898a.get(str);
        if (xVar == null) {
            return null;
        }
        if (xVar.messageObject == null) {
            try {
                xVar.messageObject = (com.bytedance.android.livesdk.ac.b.a) xVar.messageClass.newInstance();
            } catch (IllegalAccessException | InstantiationException unused) {
            }
        }
        return xVar.messageObject;
    }

    public static Class<? extends com.bytedance.android.livesdk.ac.b.a> getMessageClass(String str) {
        HashMap<String, x> hashMap = f22898a;
        if (hashMap.containsKey(str)) {
            return hashMap.get(str).messageClass;
        }
        HashMap<String, Class<? extends com.bytedance.android.livesdk.ac.b.a>> hashMap2 = f22899b;
        if (hashMap2.containsKey(str)) {
            return hashMap2.get(str);
        }
        return null;
    }

    public static void registerMessageClass(String str, Class<? extends com.bytedance.android.livesdk.ac.b.a> cls) {
        f22899b.put(str, cls);
    }

    private x(String str, Class cls) {
        this.method = str;
        this.messageClass = cls;
    }
}
