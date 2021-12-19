package com.ss.android.ugc.aweme.story.record.i;

import android.view.ViewGroup;
import androidx.lifecycle.u;
import com.bytedance.als.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.t;
import com.ss.android.ugc.aweme.widgetcompat.RemoteImageView;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final e f138356b = new e((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Effect f138357a;

    static {
        Covode.recordClassIndex(90497);
    }

    public static final class e {
        static {
            Covode.recordClassIndex(90503);
        }

        private e() {
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    static final class d<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f138372a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.m f138373b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f138374c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f138375d;

        static {
            Covode.recordClassIndex(90502);
        }

        d(a aVar, androidx.lifecycle.m mVar, RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
            this.f138372a = aVar;
            this.f138373b = mVar;
            this.f138374c = remoteImageView;
            this.f138375d = remoteImageView2;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            this.f138372a.f138357a = (Effect) obj;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.i.a$a  reason: collision with other inner class name */
    static final class C3648a<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f138360a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.m f138361b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f138362c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f138363d;

        static {
            Covode.recordClassIndex(90499);
        }

        C3648a(a aVar, androidx.lifecycle.m mVar, RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
            this.f138360a = aVar;
            this.f138361b = mVar;
            this.f138362c = remoteImageView;
            this.f138363d = remoteImageView2;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            RemoteImageView remoteImageView = this.f138362c;
            if (remoteImageView != null && remoteImageView.getVisibility() == 0) {
                remoteImageView.setVisibility(8);
            }
        }
    }

    static final class c<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f138368a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.m f138369b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f138370c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f138371d;

        static {
            Covode.recordClassIndex(90501);
        }

        c(a aVar, androidx.lifecycle.m mVar, RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
            this.f138368a = aVar;
            this.f138369b = mVar;
            this.f138370c = remoteImageView;
            this.f138371d = remoteImageView2;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            RemoteImageView remoteImageView;
            Effect effect = (Effect) obj;
            if (effect != null && (remoteImageView = this.f138371d) != null) {
                a.a(remoteImageView, effect);
            }
        }
    }

    static final class b<T> implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f138364a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.m f138365b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f138366c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ RemoteImageView f138367d;

        static {
            Covode.recordClassIndex(90500);
        }

        b(a aVar, androidx.lifecycle.m mVar, RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
            this.f138364a = aVar;
            this.f138365b = mVar;
            this.f138366c = remoteImageView;
            this.f138367d = remoteImageView2;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            float f2;
            Boolean bool = (Boolean) obj;
            RemoteImageView remoteImageView = this.f138367d;
            if (remoteImageView != null) {
                l.b(bool, "");
                remoteImageView.setEnabled(bool.booleanValue());
                if (bool.booleanValue()) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.5f;
                }
                remoteImageView.setAlpha(f2);
            }
        }
    }

    public static void a(RemoteImageView remoteImageView, Effect effect) {
        List<String> urlList;
        String str;
        l.d(effect, "");
        UrlModel iconUrl = effect.getIconUrl();
        if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null && (str = (String) n.h((List) urlList)) != null) {
            com.ss.android.ugc.tools.c.a.a(remoteImageView, str, -1, -1);
        }
    }

    public a(androidx.lifecycle.m mVar, com.bytedance.creativex.recorder.sticker.a.a aVar, ViewGroup viewGroup, final RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
        l.d(mVar, "");
        l.d(aVar, "");
        if (!(viewGroup == null || remoteImageView == null)) {
            viewGroup.setOnTouchListener(new t(1.2f, 150, remoteImageView));
        }
        aVar.t().n().b().observe(mVar, new u(this) {
            /* class com.ss.android.ugc.aweme.story.record.i.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f138358a;

            static {
                Covode.recordClassIndex(90498);
            }

            {
                this.f138358a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                Effect effect = (Effect) obj;
                if (effect != null || (effect = this.f138358a.f138357a) != null) {
                    a.a(remoteImageView, effect);
                }
            }
        });
        aVar.d().a(mVar, new C3648a(this, mVar, remoteImageView2, remoteImageView));
        aVar.e().a(mVar, new b(this, mVar, remoteImageView2, remoteImageView));
        aVar.c().a().a(mVar, new c(this, mVar, remoteImageView2, remoteImageView));
        aVar.c().b().a(mVar, new d(this, mVar, remoteImageView2, remoteImageView));
    }
}
