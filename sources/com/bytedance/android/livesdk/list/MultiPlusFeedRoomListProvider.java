package com.bytedance.android.livesdk.list;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.android.live.base.model.c.a;
import com.bytedance.android.livesdk.ab.d;
import com.bytedance.android.livesdk.live.data.DrawRoomListModel;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.rank.api.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.depend.model.live.f;
import com.bytedance.android.livesdkapi.g.h;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MultiPlusFeedRoomListProvider extends h implements au {

    /* renamed from: a  reason: collision with root package name */
    List<Room> f18611a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    List<EnterRoomConfig> f18612b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    EnterRoomConfig f18613c;

    /* renamed from: d  reason: collision with root package name */
    boolean f18614d;

    /* renamed from: e  reason: collision with root package name */
    boolean f18615e;

    /* renamed from: f  reason: collision with root package name */
    a f18616f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f18617g;

    /* renamed from: h  reason: collision with root package name */
    final String f18618h;

    /* renamed from: i  reason: collision with root package name */
    final String f18619i;

    /* renamed from: j  reason: collision with root package name */
    final Long f18620j;

    /* renamed from: k  reason: collision with root package name */
    final List<Room> f18621k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    List<EnterRoomConfig> f18622l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    String f18623m;
    HashSet<Long> n = new HashSet<>();
    final long[] o;
    private List<RoomInfo> p = new ArrayList();
    private HashMap<Long, String> q = new HashMap<>();
    private DrawRoomListModel r;
    private final Boolean s;
    private final int t;
    private final f.a.b.a u = new f.a.b.a();
    private int v;
    private int w;

    static {
        Covode.recordClassIndex(10434);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final List<Room> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f18611a);
        arrayList.addAll(this.f18621k);
        return arrayList;
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        this.u.a();
        d.d(null);
    }

    @Override // com.bytedance.android.livesdkapi.g.f
    public final int a() {
        return this.p.size() + this.f18621k.size();
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final String b(long j2) {
        String str = this.q.get(Long.valueOf(j2));
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str;
    }

    private void b(EnterRoomConfig enterRoomConfig) {
        if (!(enterRoomConfig == null || enterRoomConfig.f23299c == null || enterRoomConfig.f23299c.aC == null || !f.f23137c.booleanValue())) {
            for (Map.Entry<Long, String> entry : enterRoomConfig.f23299c.aC.entrySet()) {
                this.q.put(entry.getKey(), entry.getValue());
            }
        }
    }

    private long[] d(int i2) {
        int size = this.p.size();
        long[] jArr = new long[0];
        if (i2 >= this.w) {
            int min = Math.min(size - i2, 30);
            int i3 = (i2 + min) - 1;
            jArr = new long[min];
            a(jArr, i2, i3);
            if (this.v == -1) {
                this.v = i2;
            }
            this.w = i3;
        } else if (i2 <= this.v) {
            int min2 = Math.min(30, i2);
            int i4 = (i2 - min2) + 1;
            jArr = new long[min2];
            a(jArr, i4, i2);
            if (this.w == -1) {
                this.w = i2;
            }
            this.v = i4;
        }
        return jArr;
    }

    @Override // com.bytedance.android.livesdkapi.g.h, com.bytedance.android.livesdkapi.g.f
    public final Room c(int i2) {
        if (i2 >= 0 && i2 < a()) {
            if (i2 < this.f18611a.size()) {
                if (i2 >= this.v && i2 <= this.w) {
                    return this.f18611a.get(i2);
                }
                a(d(i2), this.v);
                return null;
            } else if (this.f18621k != null && this.f18622l.size() > i2 - this.f18611a.size()) {
                return this.f18621k.get(i2 - this.f18611a.size());
            }
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.g.f
    public final int a(EnterRoomConfig enterRoomConfig) {
        long j2 = enterRoomConfig.f23299c.R;
        for (int i2 = 0; i2 < a(); i2++) {
            if (i2 < this.p.size() && j2 == this.p.get(i2).getRoomId()) {
                return i2;
            }
            int size = i2 - this.p.size();
            if (size < this.f18621k.size() && j2 == this.f18621k.get(size).getId()) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final void b(int i2) {
        String str;
        long j2;
        if (!this.f18614d) {
            EnterRoomConfig enterRoomConfig = this.f18613c;
            if (enterRoomConfig == null || !"hourly_rank".equals(enterRoomConfig.f23299c.L) || !this.f18613c.f23299c.K) {
                if (this.r == null) {
                    this.r = new DrawRoomListModel();
                }
                if (TextUtils.equals(this.f18613c.f23299c.L, j.WEEKLY_RANK.getRankName()) || TextUtils.equals(this.f18613c.f23299c.L, "weekly_rank_notice")) {
                    str = "weekly_explore";
                } else {
                    str = "hourly_explore";
                }
                if (!TextUtils.isEmpty(this.f18623m) && this.f18623m.contains("/webcast/feed/")) {
                    if (f.f23137c == null) {
                        f.f23137c = Boolean.valueOf(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).isOffline());
                    }
                    if (f.f23137c.booleanValue()) {
                        this.f18623m += "&debug=true";
                    }
                }
                DrawRoomListModel drawRoomListModel = this.r;
                a aVar = this.f18616f;
                if (aVar == null) {
                    j2 = 0;
                } else {
                    j2 = aVar.f7381d;
                }
                this.u.a(drawRoomListModel.getRoomList(j2, str + "_draw_loadmore", LiveFeedDraw.getChannelId(str, "draw_loadmore"), this.f18613c.f23299c.R, Long.parseLong(this.f18613c.f23299c.D), this.f18623m).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(this), new d(this)));
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.g.f
    public final EnterRoomConfig a(int i2) {
        if (i2 < this.p.size()) {
            d.d(this.f18613c.f23299c.L);
            if (TextUtils.equals(this.f18613c.f23299c.L, "weekly_rank_notice")) {
                d.d(j.WEEKLY_RANK.getRankName());
            }
        } else {
            d.d("live_merge_content");
        }
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        if (i2 >= 0 && i2 < a()) {
            if (i2 < this.p.size()) {
                if (i2 >= this.f18612b.size() || this.f18612b.get(i2) == null) {
                    enterRoomConfig.f23299c.R = this.p.get(i2).getRoomId();
                    enterRoomConfig.f23298b.f23310b = this.p.get(i2).getAnchorId();
                } else {
                    enterRoomConfig = this.f18612b.get(i2);
                }
            } else if (i2 < a()) {
                if (i2 < this.p.size() + this.f18622l.size()) {
                    enterRoomConfig = this.f18622l.get(i2 - this.p.size());
                } else {
                    enterRoomConfig = com.bytedance.android.livesdkapi.g.a.a(this.f18621k.get(i2 - this.p.size()), enterRoomConfig);
                    this.f18622l.add(enterRoomConfig);
                }
                enterRoomConfig.f23299c.J = this.f18613c.f23299c.L;
                enterRoomConfig.f23299c.L = "draw_loadmore";
            }
            EnterRoomConfig enterRoomConfig2 = this.f18613c;
            if (enterRoomConfig2 != null) {
                if (!TextUtils.isEmpty(enterRoomConfig2.f23298b.f23309a)) {
                    enterRoomConfig.f23298b.f23309a = this.f18613c.f23298b.f23309a;
                }
                if (!TextUtils.isEmpty(this.f18613c.f23298b.f23315g)) {
                    enterRoomConfig.f23298b.f23315g = this.f18613c.f23298b.f23315g;
                }
            }
            enterRoomConfig.f23299c.az = this.s.booleanValue();
            enterRoomConfig.f23299c.aB = this.t;
        }
        return enterRoomConfig;
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final void a(long j2) {
        Iterator<Room> it = this.f18611a.iterator();
        while (it.hasNext()) {
            Room next = it.next();
            if (next == null || next.getId() == j2) {
                it.remove();
            }
        }
        Iterator<EnterRoomConfig> it2 = this.f18612b.iterator();
        while (it2.hasNext()) {
            EnterRoomConfig next2 = it2.next();
            if (next2 != null && next2.f23299c.R == j2) {
                it2.remove();
            }
        }
        Iterator<RoomInfo> it3 = this.p.iterator();
        while (it3.hasNext()) {
            RoomInfo next3 = it3.next();
            if (next3 == null || next3.getRoomId() == j2) {
                it3.remove();
            }
        }
        Iterator<Room> it4 = this.f18621k.iterator();
        while (it4.hasNext()) {
            Room next4 = it4.next();
            if (next4 == null || next4.getId() == j2) {
                it4.remove();
            }
        }
        Iterator<EnterRoomConfig> it5 = this.f18622l.iterator();
        while (it5.hasNext()) {
            EnterRoomConfig next5 = it5.next();
            if (next5 == null || next5.f23299c.R == j2) {
                it5.remove();
            }
        }
        this.n.remove(Long.valueOf(j2));
        f();
    }

    /* access modifiers changed from: package-private */
    public final void a(List<FeedItem> list) {
        if (list != null && f.f23137c.booleanValue()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                FeedItem feedItem = list.get(i2);
                if (!(feedItem == null || feedItem.getRoom() == null)) {
                    this.q.put(Long.valueOf(feedItem.getRoom().getId()), feedItem.debugInfo);
                }
            }
        }
    }

    private static void a(List<?> list, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            list.add(null);
        }
    }

    private void a(long[] jArr, int i2) {
        if (jArr != null && jArr.length != 0 && !this.f18615e) {
            this.f18615e = true;
            this.u.a(com.bytedance.android.livesdk.chatroom.b.f.a(jArr).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(this, i2, jArr), new b(this)));
        }
    }

    private void a(long[] jArr, int i2, int i3) {
        for (int i4 = i2; i4 <= i3; i4++) {
            jArr[i4 - i2] = this.o[i4];
        }
    }

    public MultiPlusFeedRoomListProvider(i iVar, List<RoomInfo> list, int i2, EnterRoomConfig enterRoomConfig, String str) {
        this.f18613c = enterRoomConfig;
        this.p.addAll(list);
        this.f18623m = str;
        this.o = new long[list.size()];
        a(this.f18611a, list.size());
        a(this.f18612b, list.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (list.get(i3) != null) {
                this.o[i3] = list.get(i3).getRoomId();
            } else {
                this.o[i3] = 0;
            }
        }
        this.f18620j = Long.valueOf(this.f18613c.f23299c.R);
        this.f18617g = this.f18613c.f23299c.O;
        this.f18618h = this.f18613c.f23299c.P;
        this.f18619i = this.f18613c.f23299c.Q;
        this.s = Boolean.valueOf(this.f18613c.f23299c.az);
        this.t = this.f18613c.f23299c.aB;
        iVar.a(this);
        this.v = i2;
        this.w = i2;
        a(d(i2), i2);
        b(enterRoomConfig);
    }
}
