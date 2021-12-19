package com.bytedance.android.live.publicscreen.impl.e;

import android.os.SystemClock;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGameFloatMsgPanelConfigSetting;
import com.bytedance.android.livesdk.model.message.y;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.covode.number.Covode;
import h.a.am;
import h.f.b.l;
import h.p;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f12308b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    ArrayDeque<k<?>> f12309a;

    /* renamed from: c  reason: collision with root package name */
    private final int f12310c = 100;

    /* renamed from: d  reason: collision with root package name */
    private LinkedList<k<?>> f12311d = new LinkedList<>();

    /* renamed from: e  reason: collision with root package name */
    private final int f12312e = 100;

    /* renamed from: f  reason: collision with root package name */
    private final Set<Integer> f12313f = am.b(Integer.valueOf(com.bytedance.android.livesdk.model.message.a.a.GIFT.getIntType()), Integer.valueOf(com.bytedance.android.livesdk.model.message.a.a.DOODLE_GIFT.getIntType()), Integer.valueOf(com.bytedance.android.livesdk.model.message.a.a.CHAT.getIntType()), Integer.valueOf(com.bytedance.android.livesdk.model.message.a.a.MEMBER.getIntType()), Integer.valueOf(com.bytedance.android.livesdk.model.message.a.a.SCREEN.getIntType()), Integer.valueOf(com.bytedance.android.livesdk.model.message.a.a.DIGG.getIntType()), Integer.valueOf(com.bytedance.android.livesdk.model.message.a.a.SOCIAL.getIntType()));

    /* renamed from: g  reason: collision with root package name */
    private final Map<Integer, Long> f12314g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<Integer, p<Long, Integer>> f12315h;

    /* renamed from: i  reason: collision with root package name */
    private final int f12316i;

    /* renamed from: j  reason: collision with root package name */
    private final int f12317j;

    /* renamed from: k  reason: collision with root package name */
    private final long f12318k;

    /* renamed from: l  reason: collision with root package name */
    private final int f12319l;

    static {
        Covode.recordClassIndex(6778);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6779);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f12314g = linkedHashMap;
        this.f12315h = new LinkedHashMap();
        this.f12309a = new ArrayDeque<>(100);
        com.bytedance.android.livesdk.config.a value = LiveGameFloatMsgPanelConfigSetting.INSTANCE.getValue();
        this.f12316i = value.f16719b;
        this.f12317j = value.f16720c;
        this.f12318k = value.f16721d;
        this.f12319l = value.f16722e;
        linkedHashMap.put(1, 0L);
        linkedHashMap.put(2, 0L);
    }

    private final boolean a(int i2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        p<Long, Integer> pVar = this.f12315h.get(Integer.valueOf(i2));
        if (pVar == null || uptimeMillis - pVar.getFirst().longValue() > this.f12318k) {
            this.f12315h.put(Integer.valueOf(i2), new p<>(Long.valueOf(uptimeMillis), 1));
            return false;
        } else if (pVar.getSecond().intValue() >= this.f12319l) {
            return true;
        } else {
            this.f12315h.put(Integer.valueOf(i2), new p<>(Long.valueOf(uptimeMillis), Integer.valueOf(pVar.getSecond().intValue() + 1)));
            return false;
        }
    }

    public final void a(k<?> kVar) {
        l.d(kVar, "");
        int intType = kVar.f12190d.getIntType();
        if (this.f12313f.contains(Integer.valueOf(intType))) {
            MESSAGE message = kVar.f12190d;
            if (intType == com.bytedance.android.livesdk.model.message.a.a.GIFT.getIntType() && (message instanceof y)) {
                y yVar = (y) message;
                u findGiftById = ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).findGiftById(yVar.f19707i);
                if (findGiftById != null && findGiftById.f19764g && yVar.s) {
                    return;
                }
            }
            ArrayDeque<k<?>> arrayDeque = this.f12309a;
            if (arrayDeque == null) {
                l.a("messageQueue");
            }
            if (arrayDeque.size() < this.f12310c) {
                arrayDeque.add(kVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(com.bytedance.android.live.publicscreen.a.d.k<? extends com.bytedance.android.livesdk.ac.b.a> r17) {
        /*
        // Method dump skipped, instructions count: 345
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.e.e.b(com.bytedance.android.live.publicscreen.a.d.k):boolean");
    }
}
