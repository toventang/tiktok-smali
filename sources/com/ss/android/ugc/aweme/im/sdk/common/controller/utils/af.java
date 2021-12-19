package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class af {

    /* renamed from: a  reason: collision with root package name */
    public static final af f102369a = new af();

    /* renamed from: b  reason: collision with root package name */
    private static final h f102370b = i.a((h.f.a.a) b.f102375a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f102371c = i.a((h.f.a.a) a.f102373a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f102372d = i.a((h.f.a.a) c.f102377a);

    private af() {
    }

    static final class a extends m implements h.f.a.a<com.bytedance.tux.c.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f102373a = new a();

        static {
            Covode.recordClassIndex(65529);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.tux.c.a invoke() {
            return com.bytedance.tux.c.c.a(AnonymousClass1.f102374a);
        }
    }

    static final class b extends m implements h.f.a.a<com.bytedance.tux.c.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f102375a = new b();

        static {
            Covode.recordClassIndex(65531);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.tux.c.a invoke() {
            return com.bytedance.tux.c.c.a(AnonymousClass1.f102376a);
        }
    }

    static final class c extends m implements h.f.a.a<com.bytedance.tux.c.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f102377a = new c();

        static {
            Covode.recordClassIndex(65533);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.tux.c.a invoke() {
            return com.bytedance.tux.c.c.a(AnonymousClass1.f102378a);
        }
    }

    static {
        Covode.recordClassIndex(65528);
    }

    public static final boolean a(TuxIconView tuxIconView, IMUser iMUser) {
        l.d(tuxIconView, "");
        tuxIconView.setVisibility(0);
        if (iMUser != null) {
            if (TextUtils.isEmpty(iMUser.getEnterpriseVerifyReason()) && iMUser.getVerificationType() == 2) {
                tuxIconView.setTuxIcon((com.bytedance.tux.c.a) f102370b.getValue());
            } else if (!TextUtils.isEmpty(iMUser.getEnterpriseVerifyReason())) {
                tuxIconView.setTuxIcon((com.bytedance.tux.c.a) f102371c.getValue());
            } else if (com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.d().isUserVerified(iMUser)) {
                tuxIconView.setTuxIcon((com.bytedance.tux.c.a) f102372d.getValue());
            }
            return true;
        }
        tuxIconView.setVisibility(8);
        return false;
    }
}
