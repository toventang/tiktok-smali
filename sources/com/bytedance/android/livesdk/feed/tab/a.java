package com.bytedance.android.livesdk.feed.tab;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.b.a.b;
import com.bytedance.android.live.core.f.r;
import com.bytedance.android.livesdk.ao.e;
import com.bytedance.android.livesdk.bh;
import com.bytedance.android.livesdk.feed.b.d;
import com.bytedance.android.livesdk.feed.c;
import com.bytedance.android.livesdk.feed.f;
import com.bytedance.android.livesdk.feed.tab.b.g;
import com.bytedance.android.livesdk.feed.u;
import com.bytedance.android.livesdk.live.api.RoomStatApi;
import com.bytedance.android.livesdk.livesetting.watchlive.InboxTopLivesCheckFinishTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.InboxTopLivesEnterRoomOptiSetting;
import com.bytedance.android.livesdk.model.ah;
import com.bytedance.android.livesdkapi.depend.d.n;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public class a implements b {
    static {
        Covode.recordClassIndex(9794);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.b.a.b
    public void delayInit() {
        com.bytedance.android.livesdk.feed.c.a.a();
    }

    @Override // com.bytedance.android.b.a.b
    public n getStartLiveRoomInterceptor() {
        return bh.a();
    }

    public Fragment createLiveFeedFragment() {
        ah ahVar;
        List<ah> a2 = g.b().a();
        return (r.a(a2) || (ahVar = a2.get(0)) == null || ahVar.getStyle() != 4) ? null : null;
    }

    @Override // com.bytedance.android.b.a.b
    public void init() {
        MethodCollector.i(2322);
        if (!com.bytedance.android.livesdk.feed.c.a.f17325a) {
            synchronized (com.bytedance.android.livesdk.feed.c.a.class) {
                try {
                    if (!com.bytedance.android.livesdk.feed.c.a.f17325a) {
                        com.bytedance.android.livesdk.feed.c.a.f17325a = true;
                        com.bytedance.android.live.core.b.f8922a = new d();
                        if ("local_test".equals(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).getChannel())) {
                            e.f13999c = true;
                        }
                    }
                } finally {
                    MethodCollector.o(2322);
                }
            }
            return;
        }
        MethodCollector.o(2322);
    }

    @Override // com.bytedance.android.b.a.b
    public void requestTabListForyouPage() {
        g b2 = g.b();
        b2.f17669b.b().d(new com.bytedance.android.livesdk.feed.tab.b.d(b2)).d(new com.bytedance.android.livesdk.feed.tab.b.e(b2)).a(new b(this), c.f17687a);
    }

    @Override // com.bytedance.android.b.a.b
    public Fragment createDrawerFeedFragment(com.bytedance.android.livesdkapi.g.b bVar) {
        return new f().a(bVar);
    }

    @Override // com.bytedance.android.b.a.b
    public Map<String, Object> getFeedTab(long j2) {
        return getFeedTabsMap(j2, g.b().a());
    }

    @Override // com.bytedance.android.b.a.b
    public Map<String, Object> getFeedTabForyouPage(long j2) {
        return getFeedTabsMap(j2, g.b().f17668a.b());
    }

    public String getTopLiveTitle(Context context) {
        if (context != null) {
            return context.getString(R.string.e0o);
        }
        return "";
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$requestTabListForyouPage$0$FeedUrlService(List list) {
        boolean isTabListContentValid = isTabListContentValid(list);
        com.bytedance.android.live.core.c.a.a(4, "LiveIconGeneratorLog", "successfully, showLiveIconEntrance：".concat(String.valueOf(isTabListContentValid)));
        ((IHostAction) com.bytedance.android.live.t.a.a(IHostAction.class)).notifyShowLiveIconEntrance(isTabListContentValid);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isTabListContentValid(java.util.List<com.bytedance.android.livesdk.model.ah> r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x0009
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x000a
        L_0x0009:
            return r2
        L_0x000a:
            java.util.Iterator r1 = r4.iterator()
        L_0x000e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = r1.next()
            com.bytedance.android.livesdk.model.ah r0 = (com.bytedance.android.livesdk.model.ah) r0
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.isItemValid()
            if (r0 != 0) goto L_0x000e
        L_0x0022:
            return r2
        L_0x0023:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.tab.a.isTabListContentValid(java.util.List):boolean");
    }

    static final /* synthetic */ void lambda$requestTabListForyouPage$1$FeedUrlService(Throwable th) {
        com.bytedance.android.live.core.c.a.a(4, "LiveIconGeneratorLog", "there is error" + th.toString());
        ((IHostAction) com.bytedance.android.live.t.a.a(IHostAction.class)).notifyShowLiveIconEntrance(false);
    }

    @Override // com.bytedance.android.b.a.b
    public void preloadInboxTopLivesFeedAction(int i2) {
        Map<String, Object> feedTab;
        com.bytedance.android.livesdk.feed.l.a aVar;
        u a2 = u.a.a();
        if (InboxTopLivesEnterRoomOptiSetting.INSTANCE.getValue()) {
            String str = "";
            if (i2 == 1) {
                if (!(com.bytedance.android.live.t.a.a(b.class) == null || (feedTab = ((b) com.bytedance.android.live.t.a.a(b.class)).getFeedTab(-1)) == null || !(feedTab.get("feed_url") instanceof String))) {
                    str = (String) feedTab.get("feed_url");
                }
                if (!m.a(str)) {
                    a2.f17693d = System.currentTimeMillis();
                    a2.f17691b = true;
                    c.a(str, "enter_auto_feed_draw_auto_refresh", new u.d(a2));
                }
            } else if (i2 == 3 && System.currentTimeMillis() - a2.f17692c > ((long) (InboxTopLivesCheckFinishTimeSetting.INSTANCE.getValue() * 1000)) && !a2.f17691b && (aVar = a2.f17690a) != null && aVar.f17588a != null) {
                a2.f17692c = System.currentTimeMillis();
                String b2 = a2.b();
                u.c cVar = new u.c(a2);
                l.d(b2, str);
                l.d(cVar, str);
                ((RoomStatApi) com.bytedance.android.live.network.e.a().a(RoomStatApi.class)).checkRoom(b2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c.a(cVar), new c.b(cVar));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r0 != null) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.String, java.lang.Object> getFeedTabsMap(long r7, java.util.List<com.bytedance.android.livesdk.model.ah> r9) {
        /*
            r6 = this;
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            boolean r0 = com.bytedance.common.utility.h.a(r9)
            if (r0 == 0) goto L_0x000c
            return r5
        L_0x000c:
            r0 = 0
            java.util.Iterator r4 = r9.iterator()
        L_0x0011:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r4.next()
            com.bytedance.android.livesdk.model.ah r0 = (com.bytedance.android.livesdk.model.ah) r0
            if (r0 == 0) goto L_0x0011
            long r2 = r0.getId()
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0011
        L_0x0027:
            java.lang.String r2 = r0.getInnerStreamUrl()
            java.lang.String r1 = "feed_url"
            r5.put(r1, r2)
            int r0 = r0.getStyle()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "feed_style"
            r5.put(r0, r1)
        L_0x003d:
            return r5
        L_0x003e:
            r0 = 0
            java.lang.Object r0 = r9.get(r0)
            com.bytedance.android.livesdk.model.ah r0 = (com.bytedance.android.livesdk.model.ah) r0
            if (r0 == 0) goto L_0x003d
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.tab.a.getFeedTabsMap(long, java.util.List):java.util.Map");
    }
}
