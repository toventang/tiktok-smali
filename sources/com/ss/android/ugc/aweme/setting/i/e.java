package com.ss.android.ugc.aweme.setting.i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f122210a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final h f122211b = i.a((h.f.a.a) a.f122212a);

    public static final boolean a() {
        return ((Boolean) f122211b.getValue()).booleanValue();
    }

    private e() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f122212a = new a();

        static {
            Covode.recordClassIndex(80123);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(b.a().a(true, "creative_tools_stop_video_player", false));
        }
    }

    static {
        Covode.recordClassIndex(80122);
    }
}
