package com.ss.android.ugc.aweme.discover.ui.c;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.discover.a.n;
import com.ss.android.ugc.aweme.discover.adapter.p;
import com.ss.android.ugc.aweme.discover.mob.c;
import com.ss.android.ugc.aweme.discover.model.SearchLiveList;
import com.ss.android.ugc.aweme.discover.model.SearchLiveStruct;
import com.ss.android.ugc.aweme.discover.ui.c.b;
import com.ss.android.ugc.aweme.discover.ui.c.h;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.x.ae;
import com.ss.android.ugc.aweme.flowfeed.utils.g;
import com.ss.android.ugc.aweme.keyword.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.k.ak;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.k.d;
import com.ss.android.ugc.aweme.search.k.q;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.search.k.s;
import com.ss.android.ugc.aweme.utils.em;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class c extends p<SearchLiveStruct> {

    /* renamed from: g  reason: collision with root package name */
    public f f82510g;

    /* renamed from: h  reason: collision with root package name */
    public g f82511h;

    /* renamed from: i  reason: collision with root package name */
    String f82512i = "";

    /* renamed from: j  reason: collision with root package name */
    public r f82513j;

    /* renamed from: k  reason: collision with root package name */
    private final a f82514k;

    static {
        Covode.recordClassIndex(51370);
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f82517a;

        static {
            Covode.recordClassIndex(51372);
        }

        b(c cVar) {
            this.f82517a = cVar;
        }

        public final void run() {
            if (this.f82517a.f82511h != null) {
                g gVar = this.f82517a.f82511h;
                if (gVar == null) {
                    l.b();
                }
                gVar.h();
            }
        }
    }

    public static final class a implements h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f82515a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC1937b f82516b;

        static {
            Covode.recordClassIndex(51371);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
            if (r4 != null) goto L_0x002d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.util.List<com.bytedance.android.livesdkapi.depend.model.live.RoomInfo> a() {
            /*
                r7 = this;
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                com.ss.android.ugc.aweme.discover.ui.c.c r0 = r7.f82515a
                java.util.List r0 = r0.e()
                java.util.Iterator r5 = r0.iterator()
            L_0x000f:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L_0x004d
                java.lang.Object r4 = r5.next()
                com.ss.android.ugc.aweme.discover.model.SearchLiveStruct r4 = (com.ss.android.ugc.aweme.discover.model.SearchLiveStruct) r4
                com.bytedance.android.livesdkapi.depend.model.live.RoomInfo r3 = new com.bytedance.android.livesdkapi.depend.model.live.RoomInfo
                if (r4 == 0) goto L_0x0048
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.getLiveAweme()
                if (r0 == 0) goto L_0x0048
                com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
                if (r0 == 0) goto L_0x0048
                long r1 = r0.roomId
            L_0x002d:
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.getLiveAweme()
                if (r0 == 0) goto L_0x003f
                com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
                if (r0 == 0) goto L_0x003f
                java.lang.String r0 = r0.getUid()
                if (r0 != 0) goto L_0x0041
            L_0x003f:
                java.lang.String r0 = ""
            L_0x0041:
                r3.<init>(r1, r0)
                r6.add(r3)
                goto L_0x000f
            L_0x0048:
                r1 = 0
                if (r4 == 0) goto L_0x003f
                goto L_0x002d
            L_0x004d:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.c.c.a.a():java.util.List");
        }

        @Override // com.ss.android.ugc.aweme.discover.ui.c.h.a
        public final void a(Aweme aweme) {
            long j2;
            String str;
            Long l2;
            User author;
            long j3;
            Aweme liveAweme;
            User author2;
            User author3;
            if (this.f82515a.f82510g != null) {
                ae.f95296a = this.f82515a.f82510g;
            }
            if (aweme == null || (author3 = aweme.getAuthor()) == null) {
                j2 = 0;
            } else {
                j2 = author3.roomId;
            }
            ArrayList arrayList = new ArrayList();
            for (SearchLiveStruct searchLiveStruct : this.f82515a.e()) {
                if (searchLiveStruct == null || (liveAweme = searchLiveStruct.getLiveAweme()) == null || (author2 = liveAweme.getAuthor()) == null) {
                    j3 = 0;
                } else {
                    j3 = author2.roomId;
                }
                arrayList.add(Long.valueOf(j3));
            }
            List<RoomInfo> a2 = a();
            String str2 = c.a(this.f82515a).f121274i;
            String str3 = c.a(this.f82515a).f121271f;
            String str4 = c.a(this.f82515a).f121269d;
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            enterRoomConfig.f23298b.x = str2;
            enterRoomConfig.f23298b.y = str3;
            enterRoomConfig.f23298b.A = str4;
            enterRoomConfig.f23298b.f23309a = str2;
            EnterRoomConfig.LogData logData = enterRoomConfig.f23298b;
            if (aweme == null || (author = aweme.getAuthor()) == null || (str = author.getUid()) == null) {
                str = "";
            }
            logData.f23310b = str;
            enterRoomConfig.f23299c.L = "live_cell_more";
            enterRoomConfig.f23299c.J = "general_search";
            if (n.a()) {
                r a3 = c.a(this.f82515a);
                f fVar = this.f82515a.f82510g;
                ArrayList arrayList2 = null;
                if (fVar != null) {
                    Object obj = fVar.mData;
                    l.b(obj, "");
                    l2 = Long.valueOf(((SearchLiveList) obj).cursor);
                } else {
                    l2 = null;
                }
                List<SearchLiveStruct> e2 = this.f82515a.e();
                if (e2 != null) {
                    ArrayList arrayList3 = new ArrayList(h.a.n.a((Iterable) e2, 10));
                    for (SearchLiveStruct searchLiveStruct2 : e2) {
                        l.b(searchLiveStruct2, "");
                        arrayList3.add(searchLiveStruct2.getLiveAweme());
                    }
                    arrayList2 = arrayList3;
                }
                a.a(aweme, new com.ss.android.ugc.aweme.autoplay.b.h(a3, arrayList2, l2, 25), enterRoomConfig, this.f82516b);
                return;
            }
            Context context = GlobalContext.getContext();
            l.b(context, "");
            a.a(context, j2, arrayList, a2, enterRoomConfig, "general_search");
        }

        a(c cVar, b.AbstractC1937b bVar) {
            this.f82515a = cVar;
            this.f82516b = bVar;
        }
    }

    public static final /* synthetic */ r a(c cVar) {
        r rVar = cVar.f82513j;
        if (rVar == null) {
            l.a("itemMobParam");
        }
        return rVar;
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b_(List<? extends SearchLiveStruct> list) {
        l.d(list, "");
        this.f80579f.f120995a = Integer.MIN_VALUE;
        super.b_(list);
        m.a(new b(this));
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.p, com.ss.android.ugc.aweme.common.a.h
    public final int c_(View view) {
        l.d(view, "");
        return (int) com.bytedance.common.utility.n.b(view.getContext(), 120.0f);
    }

    @Override // com.ss.android.ugc.aweme.common.a.h
    public final void b(View view) {
        if (view != null) {
            view.setPadding(0, 0, 0, (int) com.bytedance.common.utility.n.b(view.getContext(), 40.5f));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.widget.g
    public final RecyclerView.ViewHolder b(ViewGroup viewGroup, int i2) {
        if (viewGroup == null) {
            l.b();
        }
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.avk, viewGroup, false);
        l.b(a2, "");
        return new h(a2);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.discover.adapter.p, com.ss.android.ugc.aweme.base.widget.g
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        String str;
        String str2;
        int i3;
        String str3;
        String str4;
        User author;
        Long l2;
        Long l3;
        String str5;
        User author2;
        User author3;
        User author4;
        User author5;
        String str6;
        User author6;
        User author7;
        UrlModel urlModel;
        User author8;
        UrlModel urlModel2;
        User author9;
        User author10;
        l.d(viewHolder, "");
        super.a(viewHolder, i2);
        SearchLiveStruct searchLiveStruct = (SearchLiveStruct) this.f76354l.get(i2);
        l.b(searchLiveStruct, "");
        l.d(searchLiveStruct, "");
        q a2 = am.a();
        int i4 = 0;
        if (a2 != null) {
            str = a2.c().f121172a;
            str2 = a2.c().f121173b;
            i3 = a2.a();
        } else {
            str = "";
            str2 = str;
            i3 = 0;
        }
        if (i2 % 10 == 0) {
            c.a.a("live");
        }
        LogPbBean logPbBean = searchLiveStruct.getLogPbBean();
        if (logPbBean == null) {
            logPbBean = new LogPbBean();
            logPbBean.setImprId("");
        }
        String imprId = logPbBean.getImprId();
        String b2 = ac.a.f91473a.b(imprId);
        String a3 = c.b.a.a(7);
        String a4 = c.a.a(7);
        r f2 = r.a.a().f("");
        f2.f121266a = false;
        r g2 = f2.g(str);
        l.b(imprId, "");
        r h2 = g2.h(imprId);
        l.b(b2, "");
        r a5 = h2.i(b2).a(logPbBean);
        a5.f121267b = i3;
        a5.f121278m = i2;
        r e2 = a5.e(str2);
        e2.f121268c = 7;
        r d2 = e2.c(a3).d(a4);
        this.f82513j = d2;
        if (viewHolder instanceof h) {
            h hVar = (h) viewHolder;
            if (d2 == null) {
                l.a("itemMobParam");
            }
            hVar.a(d2);
            String l4 = l();
            hVar.f82531a = searchLiveStruct;
            hVar.f82532b = searchLiveStruct.getLiveAweme();
            if (hVar.f82532b != null) {
                hVar.f82533c = l4;
                String str7 = null;
                if (hVar.f82534d != null) {
                    SmartImageView smartImageView = hVar.f82534d;
                    if (smartImageView == null) {
                        l.b();
                    }
                    hVar.a(smartImageView);
                    Aweme aweme = hVar.f82532b;
                    if (aweme == null || (author10 = aweme.getAuthor()) == null || (urlModel2 = author10.roomCover) == null) {
                        Aweme aweme2 = hVar.f82532b;
                        if (aweme2 == null || (author9 = aweme2.getAuthor()) == null) {
                            urlModel2 = null;
                        } else {
                            urlModel2 = author9.getAvatarLarger();
                        }
                    }
                    v a6 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(urlModel2));
                    a6.E = hVar.f82534d;
                    Context G = hVar.G();
                    e.a aVar = new e.a();
                    aVar.f39833g = new e.b(com.bytedance.lighten.a.d.c.a(G, 2.0f), com.bytedance.lighten.a.d.c.a(G, 2.0f));
                    aVar.f39828b = com.bytedance.lighten.a.d.c.a(G, 0.0f);
                    e a7 = aVar.a();
                    l.b(a7, "");
                    a6.w = a7;
                    a6.c();
                }
                if (hVar.f82535e != null) {
                    Aweme aweme3 = hVar.f82532b;
                    if (aweme3 == null || (author8 = aweme3.getAuthor()) == null) {
                        urlModel = null;
                    } else {
                        urlModel = author8.getAvatarThumb();
                    }
                    v b3 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(urlModel)).b(em.a(100));
                    b3.E = hVar.f82535e;
                    b3.c();
                }
                Aweme aweme4 = hVar.f82532b;
                if (aweme4 == null || (author7 = aweme4.getAuthor()) == null) {
                    str3 = null;
                } else {
                    str3 = author7.getRoomTitle();
                }
                if (TextUtils.isEmpty(str3)) {
                    TextView textView = hVar.f82536f;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                } else {
                    TextView textView2 = hVar.f82536f;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    TextView textView3 = hVar.f82536f;
                    if (textView3 != null) {
                        Aweme aweme5 = hVar.f82532b;
                        if (aweme5 == null || (author = aweme5.getAuthor()) == null) {
                            str4 = null;
                        } else {
                            str4 = author.getRoomTitle();
                        }
                        textView3.setText(str4);
                    }
                }
                if (hVar.f82538h != null) {
                    View view = hVar.f82538h;
                    if (view == null) {
                        l.b();
                    }
                    hVar.a(view);
                }
                TextView textView4 = hVar.f82537g;
                if (textView4 != null) {
                    Aweme aweme6 = hVar.f82532b;
                    if (aweme6 == null || (author6 = aweme6.getAuthor()) == null) {
                        str6 = null;
                    } else {
                        str6 = author6.getSearchUserName();
                    }
                    textView4.setText(str6);
                }
                Aweme liveAweme = searchLiveStruct.getLiveAweme();
                com.ss.android.ugc.aweme.search.k.c w = ((d) com.ss.android.ugc.aweme.discover.mixfeed.b.b.a(hVar.F()).x("live_card").a(Integer.valueOf(hVar.getAdapterPosition()))).w("0");
                Aweme aweme7 = hVar.f82532b;
                if (aweme7 == null || (author5 = aweme7.getAuthor()) == null) {
                    l2 = null;
                } else {
                    l2 = Long.valueOf(author5.roomId);
                }
                w.g(String.valueOf(l2)).o("search_result").f();
                HashMap hashMap = new HashMap();
                hashMap.put("sdk_version", "2160");
                hashMap.put("_param_live_platform", "live");
                r F = hVar.F();
                ak akVar = (ak) new s().r("general_search").p("live_cell_more");
                if (liveAweme == null || (author4 = liveAweme.getAuthor()) == null) {
                    l3 = null;
                } else {
                    l3 = Long.valueOf(author4.roomId);
                }
                com.ss.android.ugc.aweme.search.k.c s = akVar.s(String.valueOf(l3));
                if (liveAweme == null || (author3 = liveAweme.getAuthor()) == null) {
                    str5 = null;
                } else {
                    str5 = author3.getUid();
                }
                com.ss.android.ugc.aweme.search.k.c b4 = s.e(str5).q("click").a(F.f121274i).f(F.f121269d).b(F.f121271f);
                if (liveAweme != null) {
                    str7 = liveAweme.getRequestId();
                }
                s sVar = (s) b4.n(str7).a(hashMap);
                Aweme aweme8 = hVar.f82532b;
                if (!(aweme8 == null || (author2 = aweme8.getAuthor()) == null)) {
                    i4 = author2.getFollowStatus();
                }
                sVar.a(i4).f();
            }
            a aVar2 = this.f82514k;
            l.d(aVar2, "");
            hVar.f82539i = aVar2;
        }
        this.f80579f.a(i2, c());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(com.ss.android.ugc.aweme.search.model.d dVar, a.b bVar, com.ss.android.ugc.aweme.search.d.b bVar2, b.AbstractC1937b bVar3) {
        super(dVar, bVar, bVar2);
        l.d(dVar, "");
        l.d(bVar, "");
        l.d(bVar2, "");
        l.d(bVar3, "");
        this.f82514k = new a(this, bVar3);
    }
}
