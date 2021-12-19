package com.ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final s f128034a = new s();

    /* renamed from: b  reason: collision with root package name */
    private static final h f128035b = i.a((h.f.a.a) a.f128036a);

    static Keva a() {
        return (Keva) f128035b.getValue();
    }

    private s() {
    }

    static final class a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f128036a = new a();

        static {
            Covode.recordClassIndex(83909);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("edit_merge_music_prompt");
        }
    }

    public static final boolean b() {
        if (!a().getBoolean("shown", false)) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(83908);
    }
}
