package com.ss.android.ugc.aweme.shortvideo.ui.viewmodel;

import com.bytedance.als.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.n;
import com.ss.android.ugc.aweme.shortvideo.model.AddToPlaylistItemStatus;
import com.ss.android.ugc.aweme.shortvideo.publish.v;
import h.f.b.m;
import h.p;
import java.util.ArrayList;
import java.util.List;

public final class VideoPublishViewModel extends BaseJediViewModel<VideoPublishState> {

    /* renamed from: a  reason: collision with root package name */
    public List<v> f131939a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.geofencing.a f131940b;

    /* renamed from: c  reason: collision with root package name */
    public AddToPlaylistItemStatus f131941c;

    /* renamed from: d  reason: collision with root package name */
    public l<Boolean> f131942d = new l<>(false);

    static {
        Covode.recordClassIndex(86446);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new VideoPublishState(null, null, 3, null);
    }

    public final AddToPlaylistItemStatus a() {
        AddToPlaylistItemStatus addToPlaylistItemStatus = this.f131941c;
        if (addToPlaylistItemStatus == null) {
            h.f.b.l.a("addToPlaylistItemStatus");
        }
        return addToPlaylistItemStatus;
    }

    public final com.ss.android.ugc.aweme.geofencing.a b() {
        com.ss.android.ugc.aweme.geofencing.a aVar = this.f131940b;
        if (aVar == null) {
            h.f.b.l.a("geoFencingItemStatus");
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<VideoPublishState, VideoPublishState> {
        final /* synthetic */ boolean $enterFromDraftBox;
        final /* synthetic */ boolean $isDraft;

        static {
            Covode.recordClassIndex(86447);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z, boolean z2) {
            super(1);
            this.$enterFromDraftBox = z;
            this.$isDraft = z2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ VideoPublishState invoke(VideoPublishState videoPublishState) {
            VideoPublishState videoPublishState2 = videoPublishState;
            h.f.b.l.d(videoPublishState2, "");
            return VideoPublishState.copy$default(videoPublishState2, new n(new p(Boolean.valueOf(this.$enterFromDraftBox), Boolean.valueOf(this.$isDraft))), null, 2, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<VideoPublishState, VideoPublishState> {
        final /* synthetic */ boolean $enterFromDraftBox;
        final /* synthetic */ boolean $isDraft;

        static {
            Covode.recordClassIndex(86448);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z, boolean z2) {
            super(1);
            this.$enterFromDraftBox = z;
            this.$isDraft = z2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ VideoPublishState invoke(VideoPublishState videoPublishState) {
            VideoPublishState videoPublishState2 = videoPublishState;
            h.f.b.l.d(videoPublishState2, "");
            return VideoPublishState.copy$default(videoPublishState2, new n(new p(Boolean.valueOf(this.$enterFromDraftBox), Boolean.valueOf(this.$isDraft))), null, 2, null);
        }
    }

    public static final class c extends m implements h.f.a.b<VideoPublishState, VideoPublishState> {
        final /* synthetic */ boolean $enterFromDraftBox;
        final /* synthetic */ boolean $isDraft;

        static {
            Covode.recordClassIndex(86449);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(boolean z, boolean z2) {
            super(1);
            this.$enterFromDraftBox = z;
            this.$isDraft = z2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ VideoPublishState invoke(VideoPublishState videoPublishState) {
            VideoPublishState videoPublishState2 = videoPublishState;
            h.f.b.l.d(videoPublishState2, "");
            return VideoPublishState.copy$default(videoPublishState2, null, new n(new p(Boolean.valueOf(this.$enterFromDraftBox), Boolean.valueOf(this.$isDraft))), 1, null);
        }
    }

    public static final class d extends m implements h.f.a.b<VideoPublishState, VideoPublishState> {
        final /* synthetic */ boolean $enterFromDraftBox;
        final /* synthetic */ boolean $isDraft;

        static {
            Covode.recordClassIndex(86450);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(boolean z, boolean z2) {
            super(1);
            this.$enterFromDraftBox = z;
            this.$isDraft = z2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ VideoPublishState invoke(VideoPublishState videoPublishState) {
            VideoPublishState videoPublishState2 = videoPublishState;
            h.f.b.l.d(videoPublishState2, "");
            return VideoPublishState.copy$default(videoPublishState2, null, new n(new p(Boolean.valueOf(this.$enterFromDraftBox), Boolean.valueOf(this.$isDraft))), 1, null);
        }
    }

    public final void a(boolean z, boolean z2) {
        if (com.ss.android.ugc.aweme.settings.n.a()) {
            d(new a(z, z2));
        } else {
            c(new b(z, z2));
        }
    }
}
