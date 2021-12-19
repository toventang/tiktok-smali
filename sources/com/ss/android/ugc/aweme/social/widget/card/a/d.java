package com.ss.android.ugc.aweme.social.widget.card.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f133735a = new c((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    static final h f133736b = i.a((h.f.a.a) a.f133738a);

    /* renamed from: c  reason: collision with root package name */
    public static final d f133737c = new d();

    private d() {
    }

    static final class a extends m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f133738a = new a();

        static {
            Covode.recordClassIndex(87490);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            Object a2 = SettingsManager.a().a("social_permission_card_freq", c.class, d.f133735a);
            if (a2 == null) {
                a2 = d.f133735a;
            }
            l.b(a2, "");
            return a2;
        }
    }

    static {
        Covode.recordClassIndex(87489);
    }
}
