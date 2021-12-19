package com.bytedance.android.livesdk.chatroom.interaction;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.p;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final GestureDetectLayout f15656a;

    /* renamed from: b  reason: collision with root package name */
    private final Fragment f15657b;

    /* renamed from: c  reason: collision with root package name */
    private final DataChannel f15658c;

    static {
        Covode.recordClassIndex(8645);
    }

    public static final class b implements com.bytedance.android.livesdk.like.d {
        static {
            Covode.recordClassIndex(8647);
        }

        b() {
        }

        @Override // com.bytedance.android.livesdk.like.d
        public final void a(com.bytedance.android.livesdk.like.b bVar, int i2) {
            l.d(bVar, "");
            LivePerformanceManager.getInstance().onModuleStop("like");
        }

        @Override // com.bytedance.android.livesdk.like.d
        public final void a(com.bytedance.android.livesdk.like.b bVar, int i2, int i3, float f2, float f3, float f4, float f5) {
            l.d(bVar, "");
            LivePerformanceManager instance = LivePerformanceManager.getInstance();
            if (i3 == 1) {
                instance.onModuleStart("like", null);
            }
            instance.monitorPerformance("show_like");
        }
    }

    static final class a implements com.bytedance.android.livesdk.like.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f15659a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Room f15660b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f15661c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f15662d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f15663e;

        static {
            Covode.recordClassIndex(8646);
        }

        a(d dVar, Room room, boolean z, boolean z2, boolean z3) {
            this.f15659a = dVar;
            this.f15660b = room;
            this.f15661c = z;
            this.f15662d = z2;
            this.f15663e = z3;
        }

        @Override // com.bytedance.android.livesdk.like.a
        public final GestureDetectLayout a() {
            return this.f15659a.f15656a;
        }
    }

    public d(Fragment fragment, DataChannel dataChannel, GestureDetectLayout gestureDetectLayout) {
        boolean z;
        boolean z2;
        l.d(fragment, "");
        l.d(dataChannel, "");
        l.d(gestureDetectLayout, "");
        this.f15657b = fragment;
        this.f15658c = dataChannel;
        this.f15656a = gestureDetectLayout;
        Room room = (Room) dataChannel.b(df.class);
        if (room != null) {
            Boolean bool = (Boolean) dataChannel.b(ee.class);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            Object b2 = dataChannel.b(cp.class);
            if (b2 == null) {
                l.b();
            }
            boolean booleanValue = ((Boolean) b2).booleanValue();
            Object b3 = dataChannel.b(cp.class);
            if (b3 == null) {
                l.b();
            }
            boolean booleanValue2 = ((Boolean) b3).booleanValue();
            if (z || !((com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class)).isMicRoomForCurrentRoom()) {
                z2 = true;
            } else {
                z2 = false;
            }
            p pVar = (p) com.bytedance.android.live.t.a.a(p.class);
            pVar.configLikeHelper(fragment.getActivity(), fragment, room, new a(this, room, booleanValue, booleanValue2, z2), booleanValue, booleanValue2, z2, dataChannel);
            com.bytedance.android.livesdk.like.b likeHelper = pVar.getLikeHelper(room.getId());
            if (likeHelper != null) {
                likeHelper.a(new b());
            }
        }
    }
}
