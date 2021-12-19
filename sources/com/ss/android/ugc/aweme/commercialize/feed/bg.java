package com.ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import b.i;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ad.feed.a.b;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.commercialize.utils.br;
import com.ss.android.ugc.aweme.commercialize.utils.bs;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class bg implements com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f74184a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f74185b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private Aweme f74186c;

    static {
        Covode.recordClassIndex(45780);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.b
    public final void f(Aweme aweme, Context context) {
        l.d(aweme, "");
        l.d(context, "");
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.b
    public final void g(Aweme aweme, Context context) {
        l.d(aweme, "");
        l.d(context, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45781);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.b
    public final void a(Aweme aweme, Context context, boolean z) {
        l.d(aweme, "");
        l.d(context, "");
        if (z) {
            j.i(context, aweme);
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "like", aweme.getAwemeRawAd()).a("anchor_id", b(aweme)).a("room_id", a(aweme)).c();
            return;
        }
        j.j(context, aweme);
        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "like_cancel", aweme.getAwemeRawAd()).a("anchor_id", b(aweme)).a("room_id", a(aweme)).c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0334, code lost:
        if (r11.equals("web") != false) goto L_0x0336;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0337, code lost:
        if (r24 != 2) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x033d, code lost:
        if (com.ss.android.ugc.aweme.commercialize.im.a.a(r19) == false) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x033f, code lost:
        com.ss.android.ugc.aweme.commercialize.log.j.b(r23, "click_message", r22, com.ss.android.ugc.aweme.commercialize.log.j.a(r23, r22, false, (java.util.Map<java.lang.String, java.lang.String>) null));
        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "click_message", r22.getAwemeRawAd()).a("anchor_id", b(r22)).a("room_id", a(r22)).c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0367, code lost:
        com.ss.android.ugc.aweme.commercialize.log.j.a(r23, r22, "button");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x036c, code lost:
        com.ss.android.ugc.aweme.commercialize.log.j.b(r23, "click_button", r22, com.ss.android.ugc.aweme.commercialize.log.j.a(r23, r22, false, (java.util.Map<java.lang.String, java.lang.String>) null));
        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "click_button", r22.getAwemeRawAd()).a("anchor_id", b(r22)).a("room_id", a(r22)).c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0396, code lost:
        if (r24 != 3) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x039c, code lost:
        if (com.ss.android.ugc.aweme.commercialize.im.a.a(r19) == false) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x039e, code lost:
        com.ss.android.ugc.aweme.commercialize.log.j.a(r23, "background_ad", "click_message", r22, com.ss.android.ugc.aweme.commercialize.log.j.a(r23, r22, false, (java.util.Map<java.lang.String, java.lang.String>) null));
        com.bytedance.ies.ugc.aweme.rich.a.a.a("background_ad", "click_message", r22.getAwemeRawAd()).a("anchor_id", b(r22)).a("room_id", a(r22)).c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03c6, code lost:
        r15.put("refer", "button");
        com.ss.android.ugc.aweme.commercialize.log.j.b(r23, r22, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03ce, code lost:
        com.ss.android.ugc.aweme.commercialize.log.j.m(r23, r22);
        com.bytedance.ies.ugc.aweme.rich.a.a.a("background_ad", "click_button", r22.getAwemeRawAd()).a("anchor_id", b(r22)).a("room_id", a(r22)).c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03f1, code lost:
        if (r24 != 11) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03f3, code lost:
        r15.put("refer", com.bytedance.ugc.glue.monitor.UGCMonitor.TYPE_PHOTO);
        com.ss.android.ugc.aweme.commercialize.log.j.b(r23, r22, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03fd, code lost:
        if (r24 != 19) goto L_0x0409;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03ff, code lost:
        r15.put("refer", "image");
        com.ss.android.ugc.aweme.commercialize.log.j.b(r23, r22, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x040b, code lost:
        if (r24 != 14) goto L_0x0417;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x040d, code lost:
        r15.put("refer", com.kakao.usermgmt.StringSet.name);
        com.ss.android.ugc.aweme.commercialize.log.j.b(r23, r22, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0419, code lost:
        if (r24 == 12) goto L_0x041f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x041d, code lost:
        if (r24 != 20) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x041f, code lost:
        r15.put("refer", "title");
        com.ss.android.ugc.aweme.commercialize.log.j.b(r23, r22, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0429, code lost:
        if (r24 == 13) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x042d, code lost:
        if (r24 != 21) goto L_0x0439;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x042f, code lost:
        r15.put("refer", "hot_region");
        com.ss.android.ugc.aweme.commercialize.log.j.b(r23, r22, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x043b, code lost:
        if (r24 != 53) goto L_0x04a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x043d, code lost:
        com.bytedance.ies.ugc.aweme.rich.a.a.a("result_ad", "click", r22.getAwemeRawAd()).a("anchor_id", b(r22)).a("room_id", a(r22)).b("refer", "button").b();
        com.bytedance.ies.ugc.aweme.rich.a.a.a("result_ad", "otherclick", r22.getAwemeRawAd()).a("anchor_id", b(r22)).a("room_id", a(r22)).b("refer", "button").b();
        r2 = r22.getAwemeRawAd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0483, code lost:
        if (r2 == null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0485, code lost:
        h.f.b.l.b(r2, "");
        com.ss.android.ugc.aweme.commercialize.log.aj.a("click", r2.getClickTrackUrlList(), r2.getCreativeId(), r2.getLogExtra(), new com.ss.android.ugc.aweme.commercialize.feed.bg.b(r22));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x04a2, code lost:
        if (r24 != 54) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x04a4, code lost:
        com.bytedance.ies.ugc.aweme.rich.a.a.a("result_ad_bg", "click", r22.getAwemeRawAd()).a("anchor_id", b(r22)).a("room_id", a(r22)).b("refer", "bg_more_button").b();
        com.bytedance.ies.ugc.aweme.rich.a.a.a("result_ad_bg", "otherclick", r22.getAwemeRawAd()).a("anchor_id", b(r22)).a("room_id", a(r22)).b("refer", "bg_more_button").b();
        r2 = r22.getAwemeRawAd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x04ee, code lost:
        if (r2 == null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x04f0, code lost:
        h.f.b.l.b(r2, "");
        com.ss.android.ugc.aweme.commercialize.log.aj.a("click", r2.getClickTrackUrlList(), r2.getCreativeId(), r2.getLogExtra(), new com.ss.android.ugc.aweme.commercialize.feed.bg.c(r22));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0262, code lost:
        if (r11.equals("counsel") != false) goto L_0x0336;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x050b  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0594  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x06be  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02c9  */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.ss.android.ugc.aweme.feed.model.Aweme r22, android.content.Context r23, int r24) {
        /*
        // Method dump skipped, instructions count: 1938
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.bg.a(com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Context, int):boolean");
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.b
    public final void a(Aweme aweme, Context context, boolean z, boolean z2) {
        AwemeRawAd awemeRawAd;
        HashMap hashMap;
        l.d(aweme, "");
        l.d(context, "");
        if ((!b.a.a(aweme) && !com.ss.android.ugc.aweme.commercialize.e.a.b.aW(aweme)) || !z) {
            this.f74186c = aweme;
            d a2 = d.a();
            String aid = aweme.getAid();
            if (!a2.f74199a.contains(aid)) {
                a2.f74199a.add(aid);
            }
            i.b(new e(aid), i.f4824a);
            if (j.z(context, aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && !m.a(awemeRawAd.getOpenUrl())) {
                Uri parse = Uri.parse(awemeRawAd.getOpenUrl());
                if ("webcast_room".equals(parse.getHost()) && "ad_link".equals(parse.getQueryParameter("enter_from_merge"))) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("enter_from_merge", "ad_link");
                    hashMap2.put("action_type", "click");
                    String queryParameter = parse.getQueryParameter("enter_method");
                    if (!m.a(queryParameter)) {
                        hashMap2.put("enter_method", queryParameter);
                    }
                    String queryParameter2 = parse.getQueryParameter("user_id");
                    if (!m.a(queryParameter2)) {
                        hashMap2.put("anchor_id", queryParameter2);
                    }
                    String queryParameter3 = parse.getQueryParameter("room_id");
                    if (!m.a(queryParameter3)) {
                        hashMap2.put("room_id", queryParameter3);
                    }
                    String queryParameter4 = parse.getQueryParameter("video_id");
                    if (!m.a(queryParameter4)) {
                        hashMap2.put("video_id", queryParameter4);
                    }
                    String queryParameter5 = parse.getQueryParameter("log_pb");
                    if (!m.a(queryParameter5)) {
                        hashMap2.put("log_pb", queryParameter5);
                    }
                    String queryParameter6 = parse.getQueryParameter("request_id");
                    if (!m.a(queryParameter6)) {
                        hashMap2.put("request_id", queryParameter6);
                    }
                    LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
                    if (newLiveRoomData == null) {
                        hashMap = new HashMap();
                    } else {
                        hashMap = new HashMap();
                        if (newLiveRoomData.roomLayout == 1) {
                            hashMap.put("live_type", "game");
                        } else if (newLiveRoomData.liveTypeAudio) {
                            hashMap.put("live_type", "voice_type");
                        } else if (newLiveRoomData.isThirdParty) {
                            hashMap.put("live_type", "thirdparty");
                        } else {
                            hashMap.put("live_type", "video_live");
                        }
                    }
                    hashMap2.putAll(hashMap);
                    LiveRoomStruct newLiveRoomData2 = aweme.getNewLiveRoomData();
                    HashMap hashMap3 = new HashMap();
                    if (newLiveRoomData2 != null && newLiveRoomData2.withLinkmic && (newLiveRoomData2.liveTypeAudio || newLiveRoomData2.linkMicLayout == 16)) {
                        hashMap3.put("interact_function", "chat_room");
                    }
                    hashMap2.putAll(hashMap3);
                    r.a("livesdk_live_show", hashMap2);
                }
            }
            boolean z3 = com.ss.android.ugc.aweme.feed.ab.a.f91461b;
            if (!aweme.isLive()) {
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.B(aweme) && !com.ss.android.ugc.aweme.commercialize.e.a.b.af(aweme) && z3) {
                    j.a(context, aweme);
                }
                f74184a = true;
            }
            if (z3) {
                if (z2) {
                    j.a(context, aweme);
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "show_100pct", aweme.getAwemeRawAd()).b();
                return;
            }
            j.a(context, aweme);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.b
    public final void a(Aweme aweme, Context context, String str, long j2, int i2) {
        l.d(aweme, "");
        l.d(context, "");
        l.d(str, "");
        a(context, aweme, str, j2, i2, null);
    }

    private static boolean a(User user) {
        if (user == null || !user.isLive() || !com.ss.android.ugc.aweme.story.c.a() || user.isBlock()) {
            return false;
        }
        return true;
    }

    private static String a(Aweme aweme) {
        LiveRoomStruct newLiveRoomData;
        if (aweme.isLive()) {
            RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
            if (roomFeedCellStruct == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null) {
                return null;
            }
            return String.valueOf(newLiveRoomData.id);
        } else if (aweme.getAuthor() == null) {
            return null;
        } else {
            User author = aweme.getAuthor();
            l.b(author, "");
            if (author.isLive()) {
                return String.valueOf(aweme.getAuthor().roomId);
            }
            return null;
        }
    }

    private static String b(Aweme aweme) {
        LiveRoomStruct newLiveRoomData;
        if (aweme.isLive()) {
            RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
            if (roomFeedCellStruct == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null) {
                return null;
            }
            return String.valueOf(newLiveRoomData.getAnchorId());
        } else if (aweme.getAuthor() == null) {
            return null;
        } else {
            User author = aweme.getAuthor();
            l.b(author, "");
            if (!author.isLive()) {
                return null;
            }
            User author2 = aweme.getAuthor();
            l.b(author2, "");
            return author2.getUid().toString();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c2  */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r5) {
        /*
        // Method dump skipped, instructions count: 257
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.bg.a(android.content.Context):void");
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.b
    public final void c(Aweme aweme, Context context) {
        l.d(aweme, "");
        l.d(context, "");
        j.l(context, aweme);
    }

    static final class b extends h.f.b.m implements h.f.a.m<f.b, Boolean, f.b> {
        final /* synthetic */ Aweme $aweme$inlined;

        static {
            Covode.recordClassIndex(45782);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Aweme aweme) {
            super(2);
            this.$aweme$inlined = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ f.b invoke(f.b bVar, Boolean bool) {
            f.b a2;
            f.b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            l.d(bVar2, "");
            if (booleanValue) {
                a2 = bVar2.b(this.$aweme$inlined);
            } else {
                a2 = bVar2.a(this.$aweme$inlined);
            }
            l.b(a2, "");
            return a2;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.m<f.b, Boolean, f.b> {
        final /* synthetic */ Aweme $aweme$inlined;

        static {
            Covode.recordClassIndex(45783);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Aweme aweme) {
            super(2);
            this.$aweme$inlined = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ f.b invoke(f.b bVar, Boolean bool) {
            f.b a2;
            f.b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            l.d(bVar2, "");
            if (booleanValue) {
                a2 = bVar2.b(this.$aweme$inlined);
            } else {
                a2 = bVar2.a(this.$aweme$inlined);
            }
            l.b(a2, "");
            return a2;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.m<f.b, Boolean, f.b> {
        final /* synthetic */ Aweme $aweme$inlined;

        static {
            Covode.recordClassIndex(45784);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Aweme aweme) {
            super(2);
            this.$aweme$inlined = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ f.b invoke(f.b bVar, Boolean bool) {
            f.b a2;
            f.b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            l.d(bVar2, "");
            if (booleanValue) {
                a2 = bVar2.b(this.$aweme$inlined);
            } else {
                a2 = bVar2.a(this.$aweme$inlined);
            }
            l.b(a2, "");
            return a2;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.m<f.b, Boolean, f.b> {
        final /* synthetic */ Aweme $aweme$inlined;

        static {
            Covode.recordClassIndex(45785);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Aweme aweme) {
            super(2);
            this.$aweme$inlined = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ f.b invoke(f.b bVar, Boolean bool) {
            f.b a2;
            f.b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            l.d(bVar2, "");
            if (booleanValue) {
                a2 = bVar2.b(this.$aweme$inlined);
            } else {
                a2 = bVar2.a(this.$aweme$inlined);
            }
            l.b(a2, "");
            return a2;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.b
    public final void e(Aweme aweme, Context context) {
        l.d(aweme, "");
        l.d(context, "");
        aw.f74168a.removeMessages(1048577);
        aw.f74169b = null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.b
    public final void d(Aweme aweme, Context context) {
        AwemeRawAd awemeRawAd;
        String str = "";
        l.d(aweme, str);
        l.d(context, str);
        if (!com.ss.android.ugc.aweme.commercialize.e.a.b.E(aweme)) {
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.X(aweme)) {
                str = "video";
            }
            j.c(context, aweme, str);
            if (!aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getProfileWithWebview() != 1) {
                j.b(context, aweme, "slide");
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", aweme.getAwemeRawAd()).a("anchor_id", b(aweme)).a("room_id", a(aweme)).b("refer", "slide").c();
                return;
            }
            j.a(context, aweme, "slide");
        } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.F(aweme)) {
            if (!com.ss.android.ugc.aweme.commercialize.e.a.b.f(aweme.getAwemeRawAd())) {
                j.b(context, aweme, "slide");
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", aweme.getAwemeRawAd()).a("anchor_id", b(aweme)).a("room_id", a(aweme)).b("refer", "slide").c();
            } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.g(aweme.getAwemeRawAd())) {
                j.h(context, aweme);
                aw.a(context, aweme, "slide");
            } else {
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", aweme.getAwemeRawAd()).b("refer", "slide").b();
            }
        } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.aM(aweme)) {
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.aP(aweme)) {
                j.h(context, aweme);
                j.a(context, aweme, "slide");
                return;
            }
            j.h(context, aweme);
        } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.aO(aweme)) {
            j.h(context, aweme);
            aw.a(context, aweme, "slide");
        } else {
            j.b(context, aweme, "slide");
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", aweme.getAwemeRawAd()).b("refer", "slide").a("anchor_id", b(aweme)).a("room_id", a(aweme)).c();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.b
    public final void b(Aweme aweme, Context context) {
        AwemeRawAd awemeRawAd;
        l.d(aweme, "");
        l.d(context, "");
        if (!com.ss.android.ugc.aweme.commercialize.e.a.b.E(aweme)) {
            j.a(context, aweme, StringSet.name, (Map<String, Object>) null);
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "click_source", aweme.getAwemeRawAd()).b("refer", StringSet.name).a("anchor_id", b(aweme)).a("room_id", a(aweme)).c();
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.Y(aweme)) {
                j.a(context, aweme, (String) null);
            }
            if (!aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getProfileWithWebview() != 1) {
                j.b(context, aweme, StringSet.name);
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", aweme.getAwemeRawAd()).b("refer", StringSet.name).a("anchor_id", b(aweme)).a("room_id", a(aweme)).c();
                return;
            }
            j.a(context, aweme, StringSet.name);
        } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.F(aweme)) {
            if (!com.ss.android.ugc.aweme.commercialize.e.a.b.f(aweme.getAwemeRawAd())) {
                j.b(context, aweme, StringSet.name);
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", aweme.getAwemeRawAd()).b("refer", StringSet.name).a("anchor_id", b(aweme)).a("room_id", a(aweme)).c();
            } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.g(aweme.getAwemeRawAd())) {
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "click", aweme.getAwemeRawAd()).b("refer", StringSet.name).b();
            } else {
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", aweme.getAwemeRawAd()).b("refer", StringSet.name).b();
            }
        } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.aO(aweme)) {
            j.a(context, aweme, StringSet.name, (Map<String, Object>) null);
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "click_source", aweme.getAwemeRawAd()).b("refer", StringSet.name).a("anchor_id", b(aweme)).a("room_id", a(aweme)).c();
            j.a(context, aweme, StringSet.name);
        } else {
            j.b(context, aweme, StringSet.name);
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", aweme.getAwemeRawAd()).b("refer", StringSet.name).a("anchor_id", b(aweme)).a("room_id", a(aweme)).c();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.b
    public final void a(Aweme aweme, Context context) {
        HashMap hashMap;
        AwemeRawAd awemeRawAd;
        Integer num;
        AwemeRawAd awemeRawAd2;
        l.d(aweme, "");
        l.d(context, "");
        Integer num2 = null;
        String str = TextUtils.isEmpty(null) ? UGCMonitor.TYPE_PHOTO : null;
        if (br.a(aweme, 3)) {
            bs.a(br.a(aweme, "icon"));
        }
        if (!com.ss.android.ugc.aweme.commercialize.e.a.b.E(aweme)) {
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.w(aweme)) {
                j.a(context, aweme, str, (Map<String, Object>) null);
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "click_source", aweme.getAwemeRawAd()).b("refer", str).a("anchor_id", b(aweme)).a("room_id", a(aweme)).c();
                return;
            }
            if (!com.ss.android.ugc.aweme.commercialize.e.a.b.X(aweme) || !a(aweme.getAuthor())) {
                j.a(context, aweme, str, (Map<String, Object>) null);
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "click_source", aweme.getAwemeRawAd()).b("refer", str).a("anchor_id", b(aweme)).a("room_id", a(aweme)).c();
            }
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.Y(aweme) || ((aweme.isAd() && aweme.getAwemeRawAd().liveRoom == 1) || com.ss.android.ugc.aweme.commercialize.e.a.b.aE(aweme))) {
                j.a(context, aweme, str);
            } else if (!aweme.isAd() || (awemeRawAd2 = aweme.getAwemeRawAd()) == null || awemeRawAd2.getProfileWithWebview() != 1) {
                j.b(context, aweme, str);
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", aweme.getAwemeRawAd()).b("refer", str).a("anchor_id", b(aweme)).a("room_id", a(aweme)).c();
            } else {
                j.a(context, aweme, UGCMonitor.TYPE_PHOTO);
            }
        } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.F(aweme)) {
            if (!com.ss.android.ugc.aweme.commercialize.e.a.b.f(aweme.getAwemeRawAd())) {
                j.b(context, aweme, str);
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", aweme.getAwemeRawAd()).b("refer", str).a("anchor_id", b(aweme)).a("room_id", a(aweme)).c();
            } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.g(aweme.getAwemeRawAd())) {
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "click", aweme.getAwemeRawAd()).b("refer", UGCMonitor.TYPE_PHOTO).b();
            } else {
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", aweme.getAwemeRawAd()).b("refer", UGCMonitor.TYPE_PHOTO).b();
            }
        } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.aO(aweme)) {
            if (!com.ss.android.ugc.aweme.commercialize.e.a.b.X(aweme) || !a(aweme.getAuthor())) {
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.V(aweme)) {
                    hashMap = new HashMap();
                    AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                    if (awemeRawAd3 != null) {
                        num = Integer.valueOf(awemeRawAd3.getAdAvatarLinkTagStyle());
                    } else {
                        num = null;
                    }
                    hashMap.put("photo_link", num);
                } else {
                    hashMap = null;
                }
                j.a(context, aweme, str, hashMap);
                a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "click_source", aweme.getAwemeRawAd()).b("refer", str).a("anchor_id", b(aweme)).a("room_id", a(aweme));
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.V(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                    num2 = Integer.valueOf(awemeRawAd.getAdAvatarLinkTagStyle());
                }
                a2.a("photo_link", num2).c();
            }
            j.a(context, aweme, str);
        } else {
            j.b(context, aweme, str);
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", aweme.getAwemeRawAd()).b("refer", str).a("anchor_id", b(aweme)).a("room_id", a(aweme)).c();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.b
    public final void c(Aweme aweme, Context context, int i2) {
        l.d(aweme, "");
        l.d(context, "");
        j.b(context, aweme, i2);
        com.ss.android.ugc.aweme.commerce.a.a.d();
        com.ss.android.ugc.aweme.commerce.a.a.c(aweme);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.b
    public final void b(Aweme aweme, Context context, int i2) {
        l.d(aweme, "");
        l.d(context, "");
        j.b(context, aweme, i2);
        com.ss.android.ugc.aweme.commerce.a.a.d();
        com.ss.android.ugc.aweme.commerce.a.a.c(aweme);
        if (f74184a) {
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "first_play", aweme.getAwemeRawAd()).a("anchor_id", b(aweme)).a("room_id", a(aweme)).b();
            f74184a = false;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.b
    public final void a(Aweme aweme, Context context, com.ss.android.ugc.aweme.commercialize.d.b bVar) {
        l.d(aweme, "");
        l.d(context, "");
        ITalentAdRevenueShareService e2 = TalentAdRevenueShareServiceImpl.e();
        if (e2 == null || bVar == null || !e2.c() || aweme.getAwemeRawAd() == null) {
            j.b(context, "music_click", aweme, j.a(context, aweme, false, (Map<String, String>) null));
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "music_click", aweme.getAwemeRawAd()).a("anchor_id", b(aweme)).a("room_id", a(aweme)).c();
            return;
        }
        String area = bVar.getAREA();
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            l.b();
        }
        l.b(awemeRawAd, "");
        e2.a(area, awemeRawAd);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.model.Aweme r13, android.content.Context r14, long r15, int r17) {
        /*
        // Method dump skipped, instructions count: 267
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.bg.a(com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Context, long, int):void");
    }

    private static void a(Context context, Aweme aweme, String str, long j2, int i2, String str2) {
        if (TextUtils.equals(str, aweme.getAid()) && aweme.isAd()) {
            j.a(context, aweme, j2, i2);
            if (str2 != null && str2.length() != 0) {
                r.a("ad_duration_prediction", new com.ss.android.ugc.aweme.app.f.d().a("real_time", j2).a("predict_time", str2).f66730a);
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.b
    public final void a(Aweme aweme, Context context, Aweme aweme2, String str, long j2, int i2, String str2) {
        l.d(context, "");
        if (str != null && aweme2 != null) {
            if (aweme == null || !TextUtils.equals(aweme2.getAid(), aweme.getAid())) {
                a(context, aweme2, str, j2, i2, str2);
            }
        }
    }
}
