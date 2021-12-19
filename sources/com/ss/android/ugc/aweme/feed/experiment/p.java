package com.ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f93082a = new p();

    /* renamed from: b  reason: collision with root package name */
    private static final h f93083b = i.a((h.f.a.a) a.f93084a);

    public static int a() {
        return ((Number) f93083b.getValue()).intValue();
    }

    private p() {
    }

    public static final boolean b() {
        if (a() == 4) {
            return false;
        }
        return true;
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f93084a = new a();

        static {
            Covode.recordClassIndex(59032);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "show_shorter_caption_by_default", 4));
        }
    }

    static {
        Covode.recordClassIndex(59031);
    }
}
