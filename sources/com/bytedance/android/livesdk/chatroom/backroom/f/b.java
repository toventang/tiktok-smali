package com.bytedance.android.livesdk.chatroom.backroom.f;

import com.bytedance.android.livesdk.livesetting.watchlive.BackRoomListSettingConfigSetting;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final h f15026a = i.a((h.f.a.a) c.f15033a);

    /* renamed from: b  reason: collision with root package name */
    public static final h f15027b = i.a((h.f.a.a) d.f15034a);

    /* renamed from: c  reason: collision with root package name */
    public static final b f15028c = new b();

    /* renamed from: d  reason: collision with root package name */
    private static final h f15029d = i.a((h.f.a.a) a.f15031a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f15030e = i.a((h.f.a.a) C0323b.f15032a);

    public static List<String> a() {
        return (List) f15029d.getValue();
    }

    public static List<String> b() {
        return (List) f15030e.getValue();
    }

    private b() {
    }

    static final class d extends m implements h.f.a.a<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f15034a = new d();

        static {
            Covode.recordClassIndex(8354);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends String> invoke() {
            List<String> list = BackRoomListSettingConfigSetting.INSTANCE.getValue().f15685c;
            if (list == null) {
                return new ArrayList();
            }
            return list;
        }
    }

    static final class a extends m implements h.f.a.a<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f15031a = new a();

        static {
            Covode.recordClassIndex(8351);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends String> invoke() {
            List<String> list = BackRoomListSettingConfigSetting.INSTANCE.getValue().f15683a;
            if (list == null) {
                return n.d("jump_source_room_back", "jump_source_mic_room");
            }
            return list;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.backroom.f.b$b  reason: collision with other inner class name */
    static final class C0323b extends m implements h.f.a.a<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0323b f15032a = new C0323b();

        static {
            Covode.recordClassIndex(8352);
        }

        C0323b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends String> invoke() {
            List<String> list = BackRoomListSettingConfigSetting.INSTANCE.getValue().f15684b;
            if (list == null) {
                return n.d("jump_source_all");
            }
            return list;
        }
    }

    static final class c extends m implements h.f.a.a<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f15033a = new c();

        static {
            Covode.recordClassIndex(8353);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends String> invoke() {
            List<String> list = BackRoomListSettingConfigSetting.INSTANCE.getValue().f15684b;
            if (list == null) {
                return n.d("jump_source_all", "jump_source_live_end", "jump_source_mic_room");
            }
            return list;
        }
    }

    static {
        Covode.recordClassIndex(8350);
    }
}
