package com.ss.android.ugc.aweme.external.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.j;
import com.ss.android.ugc.aweme.i18n.musically.cut.t;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.publish.o;
import com.ss.android.ugc.aweme.scheduler.PublishService;
import com.ss.android.ugc.aweme.services.external.IUIService;
import com.ss.android.ugc.aweme.services.external.ui.IDraftService;
import com.ss.android.ugc.aweme.services.external.ui.IEditService;
import com.ss.android.ugc.aweme.services.external.ui.IPublishPageService;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.ITestActivityService;
import com.ss.android.ugc.aweme.services.external.ui.IVideo2GifUIService;
import com.ss.android.ugc.aweme.services.external.ui.PublishConfig;
import com.ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.ss.android.ugc.aweme.settings.m;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity;
import com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import com.zhiliaoapp.musically.R;
import dmt.av.video.e.b;
import h.f.b.l;
import h.h;
import h.i;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class e implements IUIService {

    /* renamed from: a  reason: collision with root package name */
    final h f90364a = i.a((h.f.a.a) c.f90369a);

    static {
        Covode.recordClassIndex(56716);
    }

    public static final class a implements IVideo2GifUIService {
        static {
            Covode.recordClassIndex(56717);
        }

        a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.external.b.e$a$a  reason: collision with other inner class name */
        static final class CallableC2179a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ t f90365a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ IVideoChoose.Callback f90366b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ androidx.fragment.app.e f90367c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Integer f90368d;

            static {
                Covode.recordClassIndex(56718);
            }

            CallableC2179a(t tVar, IVideoChoose.Callback callback, androidx.fragment.app.e eVar, Integer num) {
                this.f90365a = tVar;
                this.f90366b = callback;
                this.f90367c = eVar;
                this.f90368d = num;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                androidx.fragment.app.i supportFragmentManager = this.f90367c.getSupportFragmentManager();
                if (supportFragmentManager == null) {
                    return null;
                }
                n a2 = supportFragmentManager.a();
                Integer num = this.f90368d;
                if (num == null) {
                    l.b();
                }
                a2.a(num.intValue(), this.f90365a).c();
                return null;
            }
        }

        @Override // com.ss.android.ugc.aweme.services.external.ui.IVideo2GifUIService
        public final Fragment video2GifFragment(VideoShare2GifEditContext videoShare2GifEditContext) {
            l.d(videoShare2GifEditContext, "");
            com.ss.android.ugc.aweme.shortvideo.cut.a.a aVar = new com.ss.android.ugc.aweme.shortvideo.cut.a.a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_edit_context", videoShare2GifEditContext);
            aVar.setArguments(bundle);
            l.b(aVar, "");
            return aVar;
        }

        @Override // com.ss.android.ugc.aweme.services.external.ui.IVideo2GifUIService
        public final IVideoChoose toMusVideoChooseFragment(androidx.fragment.app.e eVar, Fragment fragment, IVideoChoose.Callback callback, Integer num) {
            l.d(eVar, "");
            if (fragment instanceof t) {
                return (IVideoChoose) fragment;
            }
            int color = com.ss.android.ugc.aweme.port.in.i.f115645a.getResources().getColor(R.color.a_);
            int color2 = com.ss.android.ugc.aweme.port.in.i.f115645a.getResources().getColor(R.color.a3);
            int color3 = com.ss.android.ugc.aweme.port.in.i.f115645a.getResources().getColor(R.color.f159928l);
            t tVar = new t();
            Bundle bundle = new Bundle();
            bundle.putInt("ARG_NUM_COLUMNS", 3);
            bundle.putFloat("ARG_HORIZONTAL_SPACING", 1.5f);
            bundle.putFloat("ARG_VERTICAL_SPACING", 1.5f);
            bundle.putInt("ARG_GRID_PADDING", 0);
            bundle.putInt("ARG_TEXT_COLOR", color);
            bundle.putInt("ARG_SHADOW_COLOR", color2);
            bundle.putDouble("ARG_ITEM_HEIGHT_WIDTH_RATIO", 1.0d);
            bundle.putInt("ARG_TEXT_SIZE", 13);
            bundle.putBoolean("ARG_TEXT_BACKGROUND", false);
            bundle.putBoolean("ARG_TEXT_INDICATOR", false);
            bundle.putInt("ARG_BG_COLOR", color3);
            tVar.setArguments(bundle);
            tVar.f99920i = callback;
            b.i.b(new CallableC2179a(tVar, callback, eVar, num), j.f80052a);
            l.b(tVar, "");
            return tVar;
        }
    }

    public static final class b implements IDraftService {
        static {
            Covode.recordClassIndex(56719);
        }

        b() {
        }

        @Override // com.ss.android.ugc.aweme.services.external.ui.IDraftService
        public final void removeRecoverDraft() {
            if (!m.a()) {
                g.a().o().l().a(null);
            }
            PublishService.a.a();
        }

        @Override // com.ss.android.ugc.aweme.services.external.ui.IDraftService
        public final void getRecoverDraftIfHave(Context context, IDraftService.OnGetRecoverDraftCallback onGetRecoverDraftCallback) {
            l.d(context, "");
            l.d(onGetRecoverDraftCallback, "");
            o.a(context, onGetRecoverDraftCallback);
        }

        @Override // com.ss.android.ugc.aweme.services.external.ui.IDraftService
        public final void enterDraftBoxActivity(Context context, Bundle bundle) {
            l.d(context, "");
            com.ss.android.ugc.aweme.port.in.c.C.r().c().a();
            if (bundle == null) {
                DraftBoxActivity.a(context);
            } else {
                DraftBoxActivity.a(context, bundle);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.e$e  reason: collision with other inner class name */
    public static final class C2180e implements ITestActivityService {
        static {
            Covode.recordClassIndex(56723);
        }

        C2180e() {
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.external.i> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f90369a = new c();

        static {
            Covode.recordClassIndex(56720);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.external.i invoke() {
            return new com.ss.android.ugc.aweme.external.i();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.IUIService
    public final IVideo2GifUIService abilityUiService() {
        return new a();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IUIService
    public final IDraftService draftService() {
        return new b();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IUIService
    public final IEditService editService() {
        return new b();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IUIService
    public final IPublishPageService publishService() {
        return new d(this);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IUIService
    public final IRecordService recordService() {
        return new d();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IUIService
    public final ITestActivityService schemaTestService() {
        return new C2180e();
    }

    public static final class d implements IPublishPageService {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f90370a;

        static {
            Covode.recordClassIndex(56721);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(e eVar) {
            this.f90370a = eVar;
        }

        static final class a<T> implements androidx.core.g.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Intent f90371a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PublishConfig f90372b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Activity f90373c;

            static {
                Covode.recordClassIndex(56722);
            }

            a(Intent intent, PublishConfig publishConfig, Activity activity) {
                this.f90371a = intent;
                this.f90372b = publishConfig;
                this.f90373c = activity;
            }

            @Override // androidx.core.g.a
            public final /* synthetic */ void a(Object obj) {
                List a2 = h.a.n.a(obj);
                Intent intent = this.f90371a;
                Objects.requireNonNull(a2, "null cannot be cast to non-null type java.io.Serializable");
                intent.putExtra("challenge", (Serializable) a2);
                Activity activity = this.f90373c;
                Intent intent2 = this.f90371a;
                com.ss.android.ugc.tiktok.security.a.a.a(intent2, activity);
                activity.startActivity(intent2);
                this.f90373c.finish();
            }
        }

        @Override // com.ss.android.ugc.aweme.services.external.ui.IPublishPageService
        public final void startPublish(Activity activity, PublishConfig publishConfig) {
            l.d(activity, "");
            l.d(publishConfig, "");
            ((com.ss.android.ugc.aweme.external.i) this.f90370a.f90364a.getValue()).refreshData();
            Intent intent = new Intent();
            intent.setClass(activity, VideoPublishActivity.class);
            intent.putExtra("shoot_way", publishConfig.getShootway());
            intent.putExtra("creation_id", publishConfig.getCreationId());
            String musicId = publishConfig.getMusicId();
            if (musicId != null) {
                intent.putExtra("id", musicId);
            }
            if (TextUtils.isEmpty(publishConfig.getChallenge())) {
                com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
                activity.startActivity(intent);
                activity.finish();
                return;
            }
            com.ss.android.ugc.aweme.port.in.c.f115625d.a(publishConfig.getChallenge(), new a(intent, publishConfig, activity));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.IUIService
    public final void startSuperEntraceActivity(Context context) {
        l.d(context, "");
        b.a.a();
        l.d(context, "");
    }
}
