package com.ss.android.ugc.aweme.dsp.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final MusicDspExpConfig f83300a = new MusicDspExpConfig(0, 0, false, false, 15, null);

    /* renamed from: b  reason: collision with root package name */
    public static final a f83301b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final h f83302c = i.a((h.f.a.a) C1961a.f83303a);

    public static MusicDspExpConfig a() {
        return (MusicDspExpConfig) f83302c.getValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.experiment.a$a  reason: collision with other inner class name */
    static final class C1961a extends m implements h.f.a.a<MusicDspExpConfig> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1961a f83303a = new C1961a();

        static {
            Covode.recordClassIndex(51942);
        }

        C1961a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MusicDspExpConfig invoke() {
            Object a2 = b.a().a(true, "music_dsp_strategy", MusicDspExpConfig.class, a.f83300a);
            if (a2 == null) {
                return new MusicDspExpConfig(0, 0, false, false, 15, null);
            }
            return a2;
        }
    }

    static {
        Covode.recordClassIndex(51941);
    }
}
