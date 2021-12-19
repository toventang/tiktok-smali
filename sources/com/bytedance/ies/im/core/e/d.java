package com.bytedance.ies.im.core.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final h f34056a = i.a((h.f.a.a) a.f34058a);

    /* renamed from: b  reason: collision with root package name */
    public static final d f34057b = new d();

    private d() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34058a = new a();

        static {
            Covode.recordClassIndex(20279);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(SettingsManager.a().a("mt_im_sdk_init_lock", true));
        }
    }

    static {
        Covode.recordClassIndex(20278);
    }
}
