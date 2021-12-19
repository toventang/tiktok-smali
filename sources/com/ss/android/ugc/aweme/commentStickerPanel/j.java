package com.ss.android.ugc.aweme.commentStickerPanel;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final h f73225a = i.a((h.f.a.a) b.f73227a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f73226b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(45106);
        }

        static Keva a() {
            return (Keva) j.f73225a.getValue();
        }

        private a() {
        }

        public static boolean b() {
            if (a().getInt("comment_panel_tip_count", 0) != 0) {
                return false;
            }
            a().storeInt("comment_panel_tip_count", 1);
            return true;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f73227a = new b();

        static {
            Covode.recordClassIndex(45107);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("record_comment_panel");
        }
    }

    static {
        Covode.recordClassIndex(45105);
    }
}
