package com.ss.android.ugc.aweme.feed.assem.digg;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.captcha.util.CaptchaHelperServiceImpl;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.al;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget;
import com.ss.android.ugc.aweme.feed.helper.o;
import com.ss.android.ugc.aweme.feed.helper.t;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.feed.u.aa;
import com.ss.android.ugc.aweme.feed.u.ac;
import com.ss.android.ugc.aweme.feed.u.w;
import com.ss.android.ugc.aweme.feed.ui.k;
import com.ss.android.ugc.aweme.metrics.y;
import com.ss.android.ugc.aweme.metrics.z;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.f.b.r;
import h.f.b.z;
import java.util.HashMap;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bz;
import org.json.JSONObject;

public final class VideoDiggVM extends FeedBaseViewModel<k> implements w {

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f92215k = {new r(VideoDiggVM.class, "context", "getContext()Landroid/content/Context;", 0)};
    public static final b w = new b((byte) 0);
    private final com.bytedance.assem.arch.extensions.i A = new com.bytedance.assem.arch.extensions.i(true, new a(this, null));

    /* renamed from: l  reason: collision with root package name */
    public long f92216l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f92217m;
    public final ac n;
    final com.ss.android.ugc.aweme.feed.x.a v;
    private long x;
    private int y;
    private final com.ss.android.ugc.aweme.feed.assem.h z = new com.ss.android.ugc.aweme.feed.assem.h(c.f92218a);

    static final class c extends m implements h.f.a.a<Context> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f92218a = new c();

        static {
            Covode.recordClassIndex(58194);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ Context invoke() {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(58191);
    }

    private final j l() {
        return (j) this.A.getValue();
    }

    public final void a(Context context) {
        this.z.a(f92215k[0], context);
    }

    public final Context i() {
        return (Context) this.z.a(f92215k[0]);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(58193);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        public static String b(Aweme aweme) {
            LiveRoomStruct newLiveRoomData;
            h.f.b.l.d(aweme, "");
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
                h.f.b.l.b(author, "");
                if (author.isLive()) {
                    return String.valueOf(aweme.getAuthor().roomId);
                }
                return null;
            }
        }

        public static String a(Aweme aweme) {
            LiveRoomStruct newLiveRoomData;
            h.f.b.l.d(aweme, "");
            if (aweme.isLive()) {
                RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
                if (roomFeedCellStruct == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null) {
                    return null;
                }
                h.f.b.l.b(newLiveRoomData, "");
                return String.valueOf(newLiveRoomData.getAnchorId());
            } else if (aweme.getAuthor() == null) {
                return null;
            } else {
                User author = aweme.getAuthor();
                h.f.b.l.b(author, "");
                if (!author.isLive()) {
                    return null;
                }
                User author2 = aweme.getAuthor();
                h.f.b.l.b(author2, "");
                return author2.getUid().toString();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        Aweme aweme;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        long j2;
        String str8;
        String str9;
        String str10;
        String str11;
        Aweme aweme2;
        com.ss.android.ugc.aweme.feed.param.b a2;
        com.ss.android.ugc.aweme.feed.param.b a3;
        VideoDiggWidget.a aVar;
        String str12;
        String str13;
        String str14;
        String str15;
        long j3;
        String str16;
        String str17;
        String str18;
        com.ss.android.ugc.aweme.feed.param.b a4;
        com.ss.android.ugc.aweme.feed.param.b a5;
        VideoDiggWidget.a aVar2;
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (videoItemParams != null && (aweme = videoItemParams.mAweme) != null) {
            if (!TextUtils.equals("opus", this.p)) {
                i();
                com.ss.android.ugc.aweme.common.r.a("like", this.p, aweme.getAid(), 0, h());
            } else if (this.r) {
                i();
                com.ss.android.ugc.aweme.common.r.a("like", "personal_homepage", aweme.getAid(), 0, h());
            } else {
                i();
                com.ss.android.ugc.aweme.common.r.a("like", "others_homepage", aweme.getAid(), 0, h());
            }
            String a6 = com.ss.android.ugc.aweme.feed.helper.e.a(((FeedBaseViewModel) this).o, this.p, true);
            boolean z2 = aweme.getBottomBarModel() != null;
            if (aweme.playlist_info != null) {
                str2 = aweme.playlist_info.getMixId();
            } else {
                str2 = "";
            }
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (!g2.isLogin()) {
                z zVar = new z();
                String str19 = this.p;
                if (str19 == null) {
                    str19 = "";
                }
                z a7 = zVar.a(str19);
                a7.f109628e = ((FeedBaseViewModel) this).o;
                a7.f109624a = aweme.getAid();
                z f2 = a7.g(aweme);
                f2.f109625b = str;
                f2.f109626c = !al.d() ? 1 : 0;
                f2.f109627d = 0;
                f2.f();
                Context i2 = i();
                if (i2 == null || (str12 = FeedParamProvider.a.a(i2).getSearchResultId()) == null) {
                    str12 = "";
                }
                if (TextUtils.isEmpty(str12)) {
                    str12 = com.ss.android.ugc.aweme.metrics.ac.e(aweme);
                    h.f.b.l.b(str12, "");
                }
                y yVar = new y();
                yVar.u = 0;
                yVar.t = str;
                y a8 = yVar.a(a6);
                a8.f109623e = k().f92239a;
                DataCenter j4 = j();
                if (j4 != null) {
                    str13 = (String) j4.b("playlist_type", "");
                } else {
                    str13 = null;
                }
                a8.f109620b = str13;
                DataCenter j5 = j();
                if (j5 != null) {
                    str14 = (String) j5.b("playlist_id", "");
                } else {
                    str14 = null;
                }
                a8.f109622d = str14;
                DataCenter j6 = j();
                if (j6 != null) {
                    str15 = (String) j6.b("playlist_id_key", "");
                } else {
                    str15 = null;
                }
                a8.f109621c = str15;
                DataCenter j7 = j();
                com.ss.android.ugc.aweme.metrics.h c2 = a8.c(j7 != null ? (String) j7.b("tab_name", "") : null);
                VideoItemParams videoItemParams2 = (VideoItemParams) g();
                y yVar2 = (y) ((y) c2.d(com.ss.android.ugc.aweme.metrics.ac.b(videoItemParams2 != null ? videoItemParams2.mAweme : null, ((FeedBaseViewModel) this).o))).g(aweme).a(Boolean.valueOf(com.ss.android.ugc.aweme.feed.x.m.b(aweme)));
                j k2 = k();
                if (k2 == null || (aVar2 = k2.f92245g) == null) {
                    j3 = 0;
                } else {
                    j3 = aVar2.a();
                }
                yVar2.v = j3;
                y o = yVar2.o(k().f92242d);
                o.r = k().f92243e;
                o.s = k().f92244f;
                Context i3 = i();
                if (i3 == null || (str16 = FeedParamProvider.a.a(i3).getSearchId()) == null) {
                    str16 = "";
                }
                y yVar3 = (y) o.l(str16).f(str12);
                yVar3.X = str2;
                yVar3.ab = a6;
                Context i4 = i();
                if (i4 == null || (a5 = FeedParamProvider.a.a(i4)) == null) {
                    str17 = null;
                } else {
                    str17 = a5.getLastGroupId();
                }
                yVar3.ac = str17;
                y yVar4 = (y) yVar3.n(com.ss.android.ugc.aweme.feed.x.y.a(k().f92239a, k().f92240b));
                Context i5 = i();
                if (i5 == null || (a4 = FeedParamProvider.a.a(i5)) == null) {
                    str18 = null;
                } else {
                    str18 = a4.getNewsId();
                }
                yVar4.ad = str18;
                VideoItemParams videoItemParams3 = (VideoItemParams) g();
                yVar4.a(com.ss.android.ugc.aweme.utils.w.a(videoItemParams3 != null ? videoItemParams3.mAweme : null, "like", this.p)).f();
            } else {
                Context i6 = i();
                if (i6 == null || (str3 = FeedParamProvider.a.a(i6).getSearchResultId()) == null) {
                    str3 = "";
                }
                if (TextUtils.isEmpty(str3)) {
                    str3 = com.ss.android.ugc.aweme.metrics.ac.e(aweme);
                    h.f.b.l.b(str3, "");
                }
                DataCenter j8 = j();
                if (j8 != null) {
                    j8.a("follow_button_interaction", k.b.LIKE);
                }
                y yVar5 = new y();
                yVar5.u = 1;
                yVar5.t = str;
                y a9 = yVar5.a(a6);
                Context i7 = i();
                if (i7 == null || (str4 = FeedParamProvider.a.a(i7).getSearchId()) == null) {
                    str4 = "";
                }
                y yVar6 = (y) a9.l(str4);
                yVar6.f109623e = k().f92239a;
                yVar6.p = k().f92241c;
                yVar6.q = z2;
                DataCenter j9 = j();
                if (j9 != null) {
                    str5 = (String) j9.b("playlist_type", "");
                } else {
                    str5 = null;
                }
                yVar6.f109620b = str5;
                DataCenter j10 = j();
                if (j10 != null) {
                    str6 = (String) j10.b("playlist_id", "");
                } else {
                    str6 = null;
                }
                yVar6.f109622d = str6;
                DataCenter j11 = j();
                if (j11 != null) {
                    str7 = (String) j11.b("playlist_id_key", "");
                } else {
                    str7 = null;
                }
                yVar6.f109621c = str7;
                DataCenter j12 = j();
                com.ss.android.ugc.aweme.metrics.h c3 = yVar6.c(j12 != null ? (String) j12.b("tab_name", "") : null);
                VideoItemParams videoItemParams4 = (VideoItemParams) g();
                y yVar7 = (y) ((y) c3.d(com.ss.android.ugc.aweme.metrics.ac.b(videoItemParams4 != null ? videoItemParams4.mAweme : null, ((FeedBaseViewModel) this).o))).g(aweme).a(Boolean.valueOf(com.ss.android.ugc.aweme.feed.x.m.b(aweme)));
                j k3 = k();
                if (k3 == null || (aVar = k3.f92245g) == null) {
                    j2 = 0;
                } else {
                    j2 = aVar.a();
                }
                yVar7.v = j2;
                y o2 = yVar7.o(k().f92242d);
                o2.r = k().f92243e;
                o2.s = k().f92244f;
                Context i8 = i();
                if (i8 == null || (str8 = FeedParamProvider.a.a(i8).getSearchId()) == null) {
                    str8 = "";
                }
                y yVar8 = (y) o2.l(str8).f(str3);
                yVar8.V = com.ss.android.ugc.aweme.story.b.h.a(aweme.getAuthor());
                if (com.ss.android.ugc.aweme.story.d.a.g(aweme)) {
                    str9 = "story";
                } else {
                    str9 = UGCMonitor.TYPE_POST;
                }
                yVar8.W = str9;
                y yVar9 = (y) yVar8.b_(com.ss.android.ugc.aweme.story.d.a.b(aweme));
                yVar9.X = str2;
                yVar9.ab = a6;
                Context i9 = i();
                if (i9 == null || (a3 = FeedParamProvider.a.a(i9)) == null) {
                    str10 = null;
                } else {
                    str10 = a3.getLastGroupId();
                }
                yVar9.ac = str10;
                Context i10 = i();
                if (i10 == null || (a2 = FeedParamProvider.a.a(i10)) == null) {
                    str11 = null;
                } else {
                    str11 = a2.getNewsId();
                }
                yVar9.ad = str11;
                com.ss.android.ugc.aweme.metrics.h n2 = yVar9.n(com.ss.android.ugc.aweme.feed.x.y.a(k().f92239a, k().f92240b));
                VideoItemParams videoItemParams5 = (VideoItemParams) g();
                if (videoItemParams5 != null) {
                    aweme2 = videoItemParams5.mAweme;
                } else {
                    aweme2 = null;
                }
                com.ss.android.ugc.aweme.metrics.c a10 = com.ss.android.ugc.aweme.story.b.h.a((y) com.ss.android.ugc.aweme.upvote.event.c.a(n2, aweme2, a6), aweme);
                VideoItemParams videoItemParams6 = (VideoItemParams) g();
                a10.a(com.ss.android.ugc.aweme.utils.w.a(videoItemParams6 != null ? videoItemParams6.mAweme : null, "like", this.p)).f();
            }
            if (aweme.getAwemeType() != 34) {
                String aid = aweme.getAid();
                h.f.b.l.b(aid, "");
                a(aid, 1, aweme);
                return;
            }
            com.ss.android.ugc.aweme.commercialize.g.a().f(i(), aweme);
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "like", aweme.getAwemeRawAd()).a("anchor_id", b.a(aweme)).a("room_id", b.b(aweme)).c();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, int i2, Aweme aweme) {
        Aweme aweme2;
        Long creativeId;
        Long adId;
        if (!al.d()) {
            al.c();
        }
        if (!TextUtils.isEmpty(this.p) && i2 == 1) {
            String aid = aweme.getAid();
            h.f.b.l.b(aid, "");
            long currentTimeMillis = System.currentTimeMillis();
            String str2 = this.p;
            if (str2 == null) {
                str2 = "";
            }
            t.a(new o(aid, 1, currentTimeMillis, str2));
        }
        if (com.ss.android.ugc.aweme.feed.experiment.r.a() != 0) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (!g2.isLogin()) {
                if (i2 == 1) {
                    al.a(al.b() + 1);
                    aweme.setUserDigg(1);
                    AwemeStatistics statistics = aweme.getStatistics();
                    if (statistics != null) {
                        statistics.setDiggCount(this.f92216l);
                    }
                    com.ss.android.ugc.d.a.c.a(new ag(13, 0));
                    return;
                } else if (i2 == 0) {
                    al.a(h.j.h.b(al.b() - 1, 0));
                    c(aweme);
                    aweme.setUserDigg(0);
                    AwemeStatistics statistics2 = aweme.getStatistics();
                    if (statistics2 != null) {
                        statistics2.setDiggCount(this.f92216l);
                    }
                    com.ss.android.ugc.d.a.c.a(new ag(13, 1));
                    return;
                } else {
                    return;
                }
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("aweme_id", str);
        hashMap.put(StringSet.type, String.valueOf(i2));
        hashMap.put("channel_id", String.valueOf(com.ss.android.ugc.aweme.app.c.c.a(this.p)));
        VideoItemParams videoItemParams = (VideoItemParams) g();
        String str3 = null;
        if (videoItemParams == null || (aweme2 = videoItemParams.mAweme) == null || !aweme2.isAd()) {
            com.ss.android.ugc.aweme.feed.x.d.a(this.p, null, hashMap);
        } else {
            Context i3 = i();
            if (i3 != null) {
                AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
                String logExtra = awemeRawAd != null ? awemeRawAd.getLogExtra() : null;
                AwemeRawAd awemeRawAd2 = aweme2.getAwemeRawAd();
                String valueOf = (awemeRawAd2 == null || (adId = awemeRawAd2.getAdId()) == null) ? null : String.valueOf(adId.longValue());
                AwemeRawAd awemeRawAd3 = aweme2.getAwemeRawAd();
                if (!(awemeRawAd3 == null || (creativeId = awemeRawAd3.getCreativeId()) == null)) {
                    str3 = String.valueOf(creativeId.longValue());
                }
                com.ss.android.ugc.aweme.feed.x.d.a(i3, logExtra, valueOf, str3, hashMap);
            }
        }
        this.n.a(hashMap);
    }

    /* access modifiers changed from: package-private */
    public static final class j implements com.ss.android.ugc.aweme.base.component.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoDiggVM f92220a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f92221b;

        static {
            Covode.recordClassIndex(58203);
        }

        j(VideoDiggVM videoDiggVM, h.f.a.m mVar) {
            this.f92220a = videoDiggVM;
            this.f92221b = mVar;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            this.f92220a.a(this.f92221b);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ com.bytedance.assem.arch.viewModel.j f() {
        return new k(false, (l) null, 7);
    }

    /* access modifiers changed from: package-private */
    public final DataCenter j() {
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (videoItemParams != null) {
            return videoItemParams.dataCenter;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final j k() {
        j l2 = l();
        if (l2 == null) {
            return new j();
        }
        return l2;
    }

    public static final class a extends m implements h.f.a.a<j> {
        final /* synthetic */ String $identify;
        final /* synthetic */ AssemViewModel $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(58192);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AssemViewModel assemViewModel, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = assemViewModel;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.feed.assem.digg.j, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.feed.assem.digg.j invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.d r2 = r0.f25687d
                if (r2 == 0) goto L_0x000f
                java.lang.Class<com.ss.android.ugc.aweme.feed.assem.digg.j> r1 = com.ss.android.ugc.aweme.feed.assem.digg.j.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            L_0x000f:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM.a.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public final JSONObject h() {
        Aweme aweme;
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (videoItemParams != null) {
            aweme = videoItemParams.mAweme;
        } else {
            aweme = null;
        }
        int i2 = ((FeedBaseViewModel) this).o;
        String str = this.s;
        if (str == null) {
            str = "";
        }
        JSONObject a2 = com.ss.android.ugc.aweme.feed.x.i.a(aweme, i2, str, this.p);
        h.f.b.l.b(a2, "");
        return a2;
    }

    public VideoDiggVM() {
        ac acVar = new ac();
        this.n = acVar;
        acVar.a(new aa());
        acVar.a_(this);
        this.v = new com.ss.android.ugc.aweme.feed.x.a();
    }

    static final class i extends m implements h.f.a.b<k, k> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f92219a = new i();

        static {
            Covode.recordClassIndex(58202);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ k invoke(k kVar) {
            k kVar2 = kVar;
            h.f.b.l.d(kVar2, "");
            return k.a(kVar2, false, null, null, 3);
        }
    }

    static final class d extends m implements h.f.a.b<k, k> {
        final /* synthetic */ Aweme $aweme;
        final /* synthetic */ z.d $diggCount;
        final /* synthetic */ z.a $selected;
        final /* synthetic */ VideoDiggVM this$0;

        static {
            Covode.recordClassIndex(58195);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VideoDiggVM videoDiggVM, z.d dVar, Aweme aweme, z.a aVar) {
            super(1);
            this.this$0 = videoDiggVM;
            this.$diggCount = dVar;
            this.$aweme = aweme;
            this.$selected = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ k invoke(k kVar) {
            k kVar2 = kVar;
            h.f.b.l.d(kVar2, "");
            return k.a(kVar2, false, this.this$0.a(this.$diggCount.element, this.$aweme, this.$selected.element), null, 5);
        }
    }

    static final class g extends m implements h.f.a.b<am, h.z> {
        final /* synthetic */ VideoDiggVM this$0;

        static {
            Covode.recordClassIndex(58199);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(VideoDiggVM videoDiggVM) {
            super(1);
            this.this$0 = videoDiggVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(am amVar) {
            h.f.b.l.d(amVar, "");
            new com.ss.android.ugc.aweme.tux.a.i.a(this.this$0.i()).a(R.string.of).a();
            return h.z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.b<k, h.z> {
        final /* synthetic */ Aweme $aweme;
        final /* synthetic */ long $diggCount;
        final /* synthetic */ VideoDiggVM this$0;

        static {
            Covode.recordClassIndex(58200);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(VideoDiggVM videoDiggVM, long j2, Aweme aweme) {
            super(1);
            this.this$0 = videoDiggVM;
            this.$diggCount = j2;
            this.$aweme = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(k kVar) {
            h.f.b.l.d(kVar, "");
            this.this$0.a(new h.f.a.b<k, k>(this) {
                /* class com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM.h.AnonymousClass1 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(58201);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ k invoke(k kVar) {
                    k kVar2 = kVar;
                    h.f.b.l.d(kVar2, "");
                    return k.a(kVar2, false, this.this$0.this$0.a(this.this$0.$diggCount, this.this$0.$aweme, true), new com.bytedance.assem.arch.extensions.a(Boolean.valueOf(kVar2.f92246a)), 1);
                }
            });
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends m implements h.f.a.b<k, k> {
        final /* synthetic */ Aweme $aweme;
        final /* synthetic */ VideoDiggVM this$0;

        static {
            Covode.recordClassIndex(58205);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(VideoDiggVM videoDiggVM, Aweme aweme) {
            super(1);
            this.this$0 = videoDiggVM;
            this.$aweme = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ k invoke(k kVar) {
            k kVar2 = kVar;
            h.f.b.l.d(kVar2, "");
            return k.a(kVar2, false, this.this$0.a(this.$aweme), null, 5);
        }
    }

    public final void b(Aweme aweme) {
        a(new l(this, aweme));
    }

    static final class f extends m implements h.f.a.b<k, k> {
        final /* synthetic */ long $fakeDiggCount;
        final /* synthetic */ VideoDiggVM this$0;

        static {
            Covode.recordClassIndex(58198);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(VideoDiggVM videoDiggVM, long j2) {
            super(1);
            this.this$0 = videoDiggVM;
            this.$fakeDiggCount = j2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ k invoke(k kVar) {
            Aweme aweme;
            Aweme aweme2;
            k kVar2 = kVar;
            h.f.b.l.d(kVar2, "");
            VideoDiggVM videoDiggVM = this.this$0;
            long j2 = this.$fakeDiggCount;
            VideoItemParams videoItemParams = (VideoItemParams) videoDiggVM.g();
            if (videoItemParams != null) {
                aweme = videoItemParams.mAweme;
            } else {
                aweme = null;
            }
            VideoItemParams videoItemParams2 = (VideoItemParams) this.this$0.g();
            boolean z = true;
            if (videoItemParams2 == null || (aweme2 = videoItemParams2.mAweme) == null || aweme2.getUserDigg() != 1) {
                z = false;
            }
            return k.a(kVar2, false, videoDiggVM.a(j2, aweme, z), null, 5);
        }
    }

    static final class k extends m implements h.f.a.b<k, k> {
        final /* synthetic */ Aweme $aweme;
        final /* synthetic */ long $fakeDiggCount;
        final /* synthetic */ VideoDiggVM this$0;

        static {
            Covode.recordClassIndex(58204);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(VideoDiggVM videoDiggVM, long j2, Aweme aweme) {
            super(1);
            this.this$0 = videoDiggVM;
            this.$fakeDiggCount = j2;
            this.$aweme = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ k invoke(k kVar) {
            k kVar2 = kVar;
            h.f.b.l.d(kVar2, "");
            VideoDiggVM videoDiggVM = this.this$0;
            long j2 = this.$fakeDiggCount;
            Aweme aweme = this.$aweme;
            boolean z = true;
            if (aweme.getUserDigg() != 1) {
                z = false;
            }
            return k.a(kVar2, false, videoDiggVM.a(j2, aweme, z), null, 5);
        }
    }

    private static void c(Aweme aweme) {
        if (aweme != null) {
            com.ss.android.ugc.aweme.common.r.a("unlogin_like_cancel", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "homepage_hot").a("group_id", aweme.getAid()).a("author_id", com.ss.android.ugc.aweme.metrics.ac.a(aweme)).a("log_pb", ac.a.f91473a.a(aweme.getRequestId())).f66730a);
        }
    }

    static final class e extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ Aweme $aweme;
        int label;
        final /* synthetic */ VideoDiggVM this$0;

        static {
            Covode.recordClassIndex(58196);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VideoDiggVM videoDiggVM, Aweme aweme, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = videoDiggVM;
            this.$aweme = aweme;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new e(this.this$0, this.$aweme, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((e) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                h.r.a(obj);
                final boolean z = false;
                if (!this.this$0.f92217m) {
                    this.this$0.f92216l++;
                    z = true;
                } else if (this.this$0.f92217m) {
                    VideoDiggVM videoDiggVM = this.this$0;
                    videoDiggVM.f92216l--;
                }
                final long a2 = this.this$0.a(z, this.$aweme);
                this.this$0.a(new h.f.a.b<k, k>(this) {
                    /* class com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM.e.AnonymousClass1 */
                    final /* synthetic */ e this$0;

                    static {
                        Covode.recordClassIndex(58197);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ k invoke(k kVar) {
                        k kVar2 = kVar;
                        h.f.b.l.d(kVar2, "");
                        return k.a(kVar2, false, this.this$0.this$0.a(a2, this.this$0.$aweme, z), null, 5);
                    }
                });
                return h.z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final l a(Aweme aweme) {
        long j2;
        int i2;
        String str;
        AwemeStatistics statistics;
        if (aweme == null || (statistics = aweme.getStatistics()) == null) {
            j2 = 0;
        } else {
            j2 = statistics.getDiggCount();
        }
        this.f92216l = j2;
        this.x = j2;
        boolean z2 = false;
        if (aweme != null) {
            i2 = aweme.getUserDigg();
        } else {
            i2 = 0;
        }
        this.y = i2;
        if (aweme != null && aweme.getUserDigg() == 1) {
            z2 = true;
        }
        long a2 = a(z2, aweme);
        StringBuilder sb = new StringBuilder("digg aweme ");
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        com.ss.android.ugc.aweme.framework.a.a.b(6, "VideoDiggVM", sb.append(str).toString());
        return a(a2, aweme, z2);
    }

    @Override // com.ss.android.ugc.aweme.feed.u.w
    public final void a(androidx.core.g.e<String, Integer> eVar) {
        Aweme aweme;
        h.f.b.l.d(eVar, "");
        DataCenter j2 = j();
        if (j2 != null) {
            j2.a("digg_success", eVar);
        }
        ag agVar = new ag(13, eVar.f2397a);
        Bundle bundle = new Bundle();
        S s = eVar.f2398b;
        if (s == null) {
            s = -1;
        }
        bundle.putInt("user_digged", s.intValue());
        agVar.f93452c = bundle;
        com.ss.android.ugc.d.a.c.a(agVar);
        com.ss.android.ugc.aweme.discover.hitrank.d dVar = com.ss.android.ugc.aweme.discover.hitrank.d.f81205b;
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (videoItemParams != null) {
            aweme = videoItemParams.mAweme;
        } else {
            aweme = null;
        }
        dVar.a(aweme, 4);
        SpecActServiceImpl.i().b("like");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        if ((!r0.isLogin()) != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010d, code lost:
        if (com.ss.android.ugc.aweme.feed.al.b() >= r4) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(h.f.a.m<? super java.lang.Boolean, ? super com.ss.android.ugc.aweme.feed.model.Aweme, h.z> r9) {
        /*
        // Method dump skipped, instructions count: 547
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM.a(h.f.a.m):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.u.w
    public final void a(Exception exc) {
        Aweme aweme;
        int i2;
        h.f.b.l.d(exc, "");
        CaptchaHelperServiceImpl.a();
        VideoItemParams videoItemParams = (VideoItemParams) g();
        if (videoItemParams != null) {
            aweme = videoItemParams.mAweme;
        } else {
            aweme = null;
        }
        if (!(i() == null || aweme == null)) {
            bz unused = kotlinx.coroutines.i.a(aH_(), null, null, new e(this, aweme, null), 3);
        }
        Context i3 = i();
        if (this.n.d() == 1) {
            i2 = R.string.b7d;
        } else {
            i2 = R.string.h48;
        }
        com.ss.android.ugc.aweme.app.api.b.a.a(i3, (Throwable) exc, i2);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.j
    public final /* synthetic */ VideoItemParams b(com.bytedance.assem.arch.viewModel.j jVar, VideoItemParams videoItemParams) {
        h.f.b.l.d(jVar, "");
        h.f.b.l.d(videoItemParams, "");
        return videoItemParams;
    }

    static String a(long j2, Aweme aweme) {
        if (!com.ss.android.ugc.aweme.login.b.a.a(aweme) && j2 > 0) {
            return com.ss.android.ugc.aweme.i18n.b.a(j2);
        }
        return "0";
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final /* synthetic */ k a(k kVar, VideoItemParams videoItemParams) {
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(videoItemParams, "");
        return new k(com.ss.android.ugc.aweme.aq.a.a.a(), a(videoItemParams.mAweme), 4);
    }

    public final long a(boolean z2, Aweme aweme) {
        if (aweme != null) {
            this.f92217m = z2;
            if (z2) {
                if (this.y != 1) {
                    return this.x + 1;
                }
                if (this.x < 1 && !aweme.isDelete()) {
                    this.x = 1;
                }
                return this.x;
            } else if (this.y != 1 || aweme.isDelete()) {
                return this.x;
            } else {
                return this.x - 1;
            }
        } else {
            com.ss.android.ugc.aweme.framework.a.a.b(6, "VideoDiggVM", "updateDiggView when aweme is null:" + Log.getStackTraceString(new Throwable()));
            return 0;
        }
    }

    public final l a(long j2, Aweme aweme, boolean z2) {
        boolean z3;
        DataCenter dataCenter;
        if (aweme != null) {
            VideoItemParams videoItemParams = (VideoItemParams) g();
            if (!(videoItemParams == null || (dataCenter = videoItemParams.dataCenter) == null)) {
                dataCenter.a("update_diig_view", Boolean.valueOf(z2));
            }
            if (j2 < 0) {
                j2 = 0;
            }
            if (aweme != null && aweme.isDelete() && j2 == 0) {
                z3 = false;
                return new l(a(j2, aweme), z2, z3);
            }
        } else {
            com.ss.android.ugc.aweme.framework.a.a.b(6, "VideoDiggVM", "updateDiggView when aweme is null:" + Log.getStackTraceString(new Throwable()));
            j2 = 0;
        }
        z3 = true;
        return new l(a(j2, aweme), z2, z3);
    }
}
