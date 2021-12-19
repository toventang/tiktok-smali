package com.ss.android.ugc.aweme.detail.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f79617a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final h f79618b = i.a((h.f.a.a) C1856a.f79620a);

    /* renamed from: c  reason: collision with root package name */
    public static final a f79619c = new a();

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.c.a$a  reason: collision with other inner class name */
    static final class C1856a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1856a f79620a = new C1856a();

        static {
            Covode.recordClassIndex(49463);
        }

        C1856a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(SettingsManager.a().a("refresh_video_by_block_user", true));
        }
    }

    static {
        Covode.recordClassIndex(49462);
    }
}
