package com.ss.android.ugc.gamora.recorder.quickupload;

import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.als.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.t;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ClosingChooseMediaPageState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.OpeningChooseMediaPageState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ao;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class b extends j<a> implements com.bytedance.o.a, a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f148187b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final a f148188a = this;

    /* renamed from: c  reason: collision with root package name */
    private ao f148189c;

    /* renamed from: d  reason: collision with root package name */
    private final com.bytedance.scene.group.b f148190d;

    /* renamed from: e  reason: collision with root package name */
    private final f f148191e;

    static {
        Covode.recordClassIndex(97673);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97674);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this.f148188a;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f148191e;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.quickupload.b$b  reason: collision with other inner class name */
    static final class C3996b extends m implements h.f.a.b<ClosingChooseMediaPageState, z> {
        final /* synthetic */ h.f.a.a $runnable;

        static {
            Covode.recordClassIndex(97675);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3996b(h.f.a.a aVar) {
            super(1);
            this.$runnable = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ClosingChooseMediaPageState closingChooseMediaPageState) {
            l.d(closingChooseMediaPageState, "");
            if (l.a(closingChooseMediaPageState, ClosingChooseMediaPageState.Closed.INSTANCE)) {
                this.$runnable.invoke();
            }
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<OpeningChooseMediaPageState, z> {
        final /* synthetic */ h.f.a.a $runnable;

        static {
            Covode.recordClassIndex(97676);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h.f.a.a aVar) {
            super(1);
            this.$runnable = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(OpeningChooseMediaPageState openingChooseMediaPageState) {
            l.d(openingChooseMediaPageState, "");
            if (l.a(openingChooseMediaPageState, OpeningChooseMediaPageState.OnSceneAnimationEnded.INSTANCE)) {
                this.$runnable.invoke();
            }
            return z.f158842a;
        }
    }

    public b(com.bytedance.scene.group.b bVar, f fVar) {
        l.d(bVar, "");
        l.d(fVar, "");
        this.f148190d = bVar;
        this.f148191e = fVar;
    }

    @Override // com.ss.android.ugc.gamora.recorder.quickupload.a
    public final void a(e eVar, h.f.a.a<z> aVar) {
        l.d(eVar, "");
        l.d(aVar, "");
        JediViewModel a2 = t.a(eVar).a(ChooseMediaViewModel.class);
        l.b(a2, "");
        f.a.b.b unused = ((ChooseMediaViewModel) a2).a(eVar, d.f148193a, new ah(), new c(aVar));
    }

    @Override // com.ss.android.ugc.gamora.recorder.quickupload.a
    public final void b(e eVar, h.f.a.a<z> aVar) {
        l.d(eVar, "");
        l.d(aVar, "");
        JediViewModel a2 = t.a(eVar).a(ChooseMediaViewModel.class);
        l.b(a2, "");
        f.a.b.b unused = ((ChooseMediaViewModel) a2).a(eVar, c.f148192a, new ah(), new C3996b(aVar));
    }

    @Override // com.ss.android.ugc.gamora.recorder.quickupload.a
    public final com.bytedance.scene.j a(ShortVideoContext shortVideoContext, h hVar, Bundle bundle) {
        l.d(shortVideoContext, "");
        l.d(hVar, "");
        ao aoVar = new ao();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("key_choose_request_code", 1);
        bundle2.putInt("key_support_flag", 6);
        bundle2.putBoolean("Key_enable_multi_video", true);
        bundle2.putInt("key_choose_scene", 0);
        bundle2.putLong("Key_min_duration", di.a());
        bundle2.putInt("key_photo_select_min_count", com.ss.android.ugc.gamora.recorder.localmedia.c.f148049a);
        bundle2.putInt("key_photo_select_max_count", com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.f129495a);
        bundle2.putInt("key_video_select_min_count", com.ss.android.ugc.gamora.recorder.localmedia.c.f148049a);
        bundle2.putInt("key_video_select_max_count", com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.f129495a);
        bundle2.putParcelable("key_short_video_context", shortVideoContext);
        bundle2.putBoolean("from_upload_btn_click", true);
        bundle2.putString("open_album_method", hVar.name());
        bundle2.putInt("key_start_activity_request_code", 3);
        bundle2.putAll(bundle);
        aoVar.r = bundle2;
        this.f148189c = aoVar;
        return aoVar;
    }
}
