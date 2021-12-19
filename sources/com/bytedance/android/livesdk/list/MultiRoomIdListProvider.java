package com.bytedance.android.livesdk.list;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.android.livesdk.chatroom.b.f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.g.a;
import com.bytedance.android.livesdkapi.g.h;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import f.a.b.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MultiRoomIdListProvider extends h implements au {

    /* renamed from: a  reason: collision with root package name */
    List<Room> f18624a;

    /* renamed from: b  reason: collision with root package name */
    EnterRoomConfig f18625b;

    /* renamed from: c  reason: collision with root package name */
    private List<RoomInfo> f18626c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final List<EnterRoomConfig> f18627d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private b f18628e;

    /* renamed from: f  reason: collision with root package name */
    private List<Room> f18629f = new ArrayList();

    static {
        Covode.recordClassIndex(10435);
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final void b(int i2) {
    }

    @Override // com.bytedance.android.livesdkapi.g.h, com.bytedance.android.livesdkapi.g.f
    public final Room c(int i2) {
        return null;
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final List<Room> d() {
        return this.f18629f;
    }

    @Override // com.bytedance.android.livesdkapi.g.f
    public final int a() {
        return this.f18626c.size();
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final List<Room> b() {
        return new ArrayList();
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        b bVar = this.f18628e;
        if (bVar != null) {
            bVar.dispose();
            this.f18628e = null;
        }
    }

    @Override // com.bytedance.android.livesdkapi.g.f
    public final int a(EnterRoomConfig enterRoomConfig) {
        return this.f18626c.indexOf(Long.valueOf(enterRoomConfig.f23299c.R));
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final void a(long j2) {
        for (int i2 = 0; i2 < this.f18626c.size(); i2++) {
            if (this.f18626c.get(i2) != null && this.f18626c.get(i2).getRoomId() == j2) {
                this.f18626c.remove(i2);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(List<Room> list) {
        this.f18627d.clear();
        if (!com.bytedance.common.utility.h.a(list)) {
            for (Room room : list) {
                this.f18627d.add(a.a(room, false));
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.g.f
    public final EnterRoomConfig a(int i2) {
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.f18627d) && this.f18627d.size() > i2) {
            return this.f18627d.get(i2);
        }
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        EnterRoomConfig enterRoomConfig2 = this.f18625b;
        if (enterRoomConfig2 != null) {
            long j2 = enterRoomConfig2.f23299c.R;
            if (j2 > 0 && this.f18626c.get(i2) != null && j2 == this.f18626c.get(i2).getRoomId()) {
                enterRoomConfig = this.f18625b;
            }
        }
        if (i2 >= 0 && i2 < this.f18626c.size() && this.f18626c.get(i2) != null) {
            if (!TextUtils.isEmpty(this.f18625b.f23298b.f23309a)) {
                enterRoomConfig.f23298b.f23309a = this.f18625b.f23298b.f23309a;
            }
            if (!TextUtils.isEmpty(this.f18625b.f23298b.f23315g)) {
                enterRoomConfig.f23298b.f23315g = this.f18625b.f23298b.f23315g;
            }
            enterRoomConfig.f23299c.R = this.f18626c.get(i2).getRoomId();
            enterRoomConfig.f23298b.f23310b = this.f18626c.get(i2).getAnchorId();
        }
        return enterRoomConfig;
    }

    public MultiRoomIdListProvider(i iVar, List<RoomInfo> list, EnterRoomConfig enterRoomConfig) {
        this.f18625b = enterRoomConfig;
        this.f18626c.addAll(list);
        long[] jArr = new long[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2) != null) {
                jArr[i2] = list.get(i2).getRoomId();
            } else {
                jArr[i2] = 0;
            }
        }
        iVar.a(this);
        this.f18628e = f.a(jArr).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new e(this, list), f.f18638a);
    }
}
