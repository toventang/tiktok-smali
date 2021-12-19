package com.bytedance.android.live.publicscreen.impl;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.a.c.b;
import com.bytedance.android.live.publicscreen.a.e;
import com.bytedance.android.live.publicscreen.a.f;
import com.bytedance.android.live.publicscreen.impl.c.c;
import com.bytedance.android.live.publicscreen.impl.e.h;
import com.bytedance.android.live.publicscreen.impl.widget.LandscapePublicScreenWidget;
import com.bytedance.android.live.publicscreen.impl.widget.PortraitPublicScreenWidget;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenUiOptimizationSetting;
import com.bytedance.android.livesdk.model.message.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import h.f.b.l;
import h.f.b.m;
import h.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a implements e {
    private final LongSparseArray<Long> hotDurations;
    private final List<com.bytedance.android.live.publicscreen.a.e.e> onRegistryReadyListeners;
    private LongSparseArray<g> pendingBottomMessages;
    private final LongSparseArray<h> presenters;
    private final LongSparseArray<Long> startStreamingTimestamps;
    public final b textMessageConfig;
    private final h.h uiOptimized$delegate = i.a((h.f.a.a) C0255a.f12210a);
    private final List<com.bytedance.android.live.publicscreen.a.e.e> unmodifiableOnRegistryReadyListeners;

    static {
        Covode.recordClassIndex(6723);
    }

    private final boolean getUiOptimized() {
        return ((Boolean) this.uiOptimized$delegate.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public /* bridge */ /* synthetic */ f getTextMessageConfig() {
        return this.textMessageConfig;
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public void clearMockChatMessage() {
        com.bytedance.android.live.publicscreen.impl.a.a.f12211a.clear();
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public List<com.bytedance.android.live.publicscreen.a.e.e> getOnRegistryReadyListeners() {
        List<com.bytedance.android.live.publicscreen.a.e.e> list = this.unmodifiableOnRegistryReadyListeners;
        l.b(list, "");
        return list;
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.a$a  reason: collision with other inner class name */
    static final class C0255a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0255a f12210a = new C0255a();

        static {
            Covode.recordClassIndex(6724);
        }

        C0255a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(LivePublicScreenUiOptimizationSetting.INSTANCE.getValue());
        }
    }

    public a() {
        ArrayList arrayList = new ArrayList();
        this.onRegistryReadyListeners = arrayList;
        this.unmodifiableOnRegistryReadyListeners = Collections.unmodifiableList(arrayList);
        this.presenters = new LongSparseArray<>();
        this.textMessageConfig = new b();
        this.hotDurations = new LongSparseArray<>();
        this.startStreamingTimestamps = new LongSparseArray<>();
        this.pendingBottomMessages = new LongSparseArray<>();
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public void updateGameMessageViewUserCount(int i2) {
        com.bytedance.android.live.publicscreen.impl.game.i.f12393d = i2;
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public Class<? extends LiveRecyclableWidget> getPublicScreenWidgetClass(boolean z) {
        if (z) {
            return PortraitPublicScreenWidget.class;
        }
        return LandscapePublicScreenWidget.class;
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public void onStopStreaming(long j2) {
        this.startStreamingTimestamps.remove(j2);
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public void resetDuration(long j2) {
        this.hotDurations.remove(j2);
    }

    public final void unregisterPresenter(long j2) {
        this.presenters.remove(j2);
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public void addOnRegistryReadyListener(com.bytedance.android.live.publicscreen.a.e.e eVar) {
        l.d(eVar, "");
        this.onRegistryReadyListeners.add(eVar);
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public g getCurrentBottomMessage(long j2) {
        h hVar = this.presenters.get(j2);
        if (hVar != null) {
            return hVar.f12338c;
        }
        return null;
    }

    public final g getPendingBottomMessage(long j2) {
        g gVar = this.pendingBottomMessages.get(j2);
        this.pendingBottomMessages.remove(j2);
        return gVar;
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public Long getStartStreamingTimestamp(long j2) {
        return this.startStreamingTimestamps.get(j2);
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public void onStartStreaming(long j2) {
        this.startStreamingTimestamps.put(j2, Long.valueOf(System.currentTimeMillis()));
    }

    public void removeOnRegistryReadyListener(com.bytedance.android.live.publicscreen.a.e.e eVar) {
        l.d(eVar, "");
        this.onRegistryReadyListeners.remove(eVar);
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public boolean uiOptimized(boolean z) {
        if (!z || !getUiOptimized()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public long getHotDuration(long j2) {
        Long l2 = this.hotDurations.get(j2);
        if (l2 != null) {
            return l2.longValue();
        }
        return 0;
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public void hideWarningMessage(long j2) {
        h hVar = this.presenters.get(j2);
        if (hVar != null) {
            ((h.a) hVar.y).h();
        }
    }

    public final void registerPresenter(long j2, h hVar) {
        l.d(hVar, "");
        this.presenters.put(j2, hVar);
    }

    public final void addHotDuration(long j2, long j3) {
        long j4;
        Long l2 = this.hotDurations.get(j2);
        if (l2 != null) {
            j4 = l2.longValue();
        } else {
            j4 = 0;
        }
        this.hotDurations.put(j2, Long.valueOf(j4 + j3));
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public void updateModel(long j2, com.bytedance.android.live.publicscreen.a.d.h hVar) {
        l.d(hVar, "");
        h hVar2 = this.presenters.get(j2);
        if (hVar2 != null) {
            hVar2.c(hVar);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public void removeModelByToken(long j2, long j3) {
        h hVar = this.presenters.get(j2);
        if (hVar != null && j3 != 0) {
            int a2 = hVar.a(j3);
            if (a2 != -1) {
                hVar.b(a2);
            } else if (!h.a(j3, hVar.f12342g) && !h.a(j3, hVar.f12343h)) {
                h.a(j3, hVar.f12344i);
            }
        }
    }

    public c createExternalLauncher(Context context, ViewGroup viewGroup, long j2) {
        l.d(context, "");
        l.d(viewGroup, "");
        return new c(context, viewGroup, j2);
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public b createGameMessageView(Context context, int i2, com.bytedance.android.live.publicscreen.a.c.a aVar) {
        l.d(context, "");
        l.d(aVar, "");
        return new com.bytedance.android.live.publicscreen.impl.game.i(context, i2, aVar);
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public long insertMessage(long j2, com.bytedance.android.livesdk.ac.b.a aVar, boolean z) {
        l.d(aVar, "");
        h hVar = this.presenters.get(j2);
        if (hVar != null) {
            return hVar.a(aVar, z);
        }
        return 0;
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public com.bytedance.android.livesdk.model.message.i mockChatMessage(long j2, String str, User user) {
        com.bytedance.android.livesdk.model.message.i iVar = new com.bytedance.android.livesdk.model.message.i();
        long j3 = -System.currentTimeMillis();
        com.bytedance.android.live.publicscreen.impl.a.a.f12211a.add(Long.valueOf(j3));
        iVar.f19628a = j3;
        iVar.f19634k = String.valueOf(j3);
        com.bytedance.android.livesdkapi.h.b bVar = new com.bytedance.android.livesdkapi.h.b();
        bVar.f23211c = j2;
        bVar.f23212d = j3;
        bVar.f23215g = true;
        iVar.O = bVar;
        iVar.f19629f = str;
        iVar.f19630g = user;
        return iVar;
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public void updateMessage(long j2, long j3, com.bytedance.android.livesdk.ac.b.a aVar) {
        com.bytedance.android.live.publicscreen.a.d.h a2;
        int a3;
        l.d(aVar, "");
        h hVar = this.presenters.get(j2);
        if (hVar != null && j3 != 0 && aVar != null && (a2 = hVar.a(aVar)) != null && (a3 = hVar.a(j3)) != -1) {
            hVar.a(a3, a2);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.a.e
    public void insertBottomMessage(long j2, String str, com.bytedance.android.livesdk.model.message.c.b bVar, long j3, int i2, int i3, int i4) {
        g gVar = new g();
        long j4 = -System.currentTimeMillis();
        com.bytedance.android.livesdkapi.h.b bVar2 = new com.bytedance.android.livesdkapi.h.b();
        bVar2.f23211c = j2;
        bVar2.f23212d = j4;
        bVar2.f23215g = true;
        bVar2.f23218j = bVar;
        gVar.O = bVar2;
        gVar.f19621a = str;
        gVar.f19624h = j3;
        gVar.f19622f = i2;
        gVar.f19623g = i3;
        gVar.f19625i = i4;
        h hVar = this.presenters.get(j2);
        if (hVar != null) {
            hVar.a(gVar);
        } else {
            this.pendingBottomMessages.put(j2, gVar);
        }
    }
}
