package com.ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    public static final ab f93027a = new ab();

    /* renamed from: b  reason: collision with root package name */
    private static final h f93028b = i.a((h.f.a.a) a.f93029a);

    private static boolean b() {
        return ((Boolean) f93028b.getValue()).booleanValue();
    }

    private ab() {
    }

    public static boolean a() {
        if (b() || x.f93096a) {
            return true;
        }
        return false;
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f93029a = new a();

        static {
            Covode.recordClassIndex(58999);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(b.a().a(true, "refactor_feed_split_assem", false));
        }
    }

    static {
        Covode.recordClassIndex(58998);
    }
}
