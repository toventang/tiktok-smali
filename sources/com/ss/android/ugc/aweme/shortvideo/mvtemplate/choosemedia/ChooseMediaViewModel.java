package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import java.util.ArrayList;

public final class ChooseMediaViewModel extends BaseJediViewModel<ChooseMediaState> {

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<MvImageChooseAdapter.MyMediaModel> f128811a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<MvImageChooseAdapter.MyMediaModel> f128812b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<MvImageChooseAdapter.MyMediaModel> f128813c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    int f128814d;

    static {
        Covode.recordClassIndex(84511);
    }

    public final void a() {
        c(f.f128816a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new ChooseMediaState(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, 2097151, null);
    }

    public final void a(ClosingChooseMediaPageState closingChooseMediaPageState) {
        h.f.b.l.d(closingChooseMediaPageState, "");
        c(new n(closingChooseMediaPageState));
    }

    public final void b(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        h.f.b.l.d(myMediaModel, "");
        c(new r(myMediaModel));
    }

    public static final class a extends h.f.b.m implements h.f.a.b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f128815a = new a();

        static {
            Covode.recordClassIndex(84512);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            h.f.b.l.d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, new com.bytedance.jedi.arch.p(), null, false, 1835007, null);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<ChooseMediaState, ChooseMediaState> {
        final /* synthetic */ String $musicFile;
        final /* synthetic */ MusicModel $musicModel;

        static {
            Covode.recordClassIndex(84514);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(MusicModel musicModel, String str) {
            super(1);
            this.$musicModel = musicModel;
            this.$musicFile = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            h.f.b.l.d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, chooseMediaState2.getLastPreMusicState().copy(this.$musicModel, this.$musicFile), null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, 2097135, null);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<ChooseMediaState, ChooseMediaState> {
        final /* synthetic */ String $musicFile;
        final /* synthetic */ MusicModel $musicModel;

        static {
            Covode.recordClassIndex(84515);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(MusicModel musicModel, String str) {
            super(1);
            this.$musicModel = musicModel;
            this.$musicFile = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            h.f.b.l.d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, chooseMediaState2.getPreMusicState().copy(this.$musicModel, this.$musicFile), null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, 2097135, null);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f128817a = new j();

        static {
            Covode.recordClassIndex(84521);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            h.f.b.l.d(chooseMediaState, "");
            return new ChooseMediaState(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, 2097151, null);
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.b<ChooseMediaState, ChooseMediaState> {
        final /* synthetic */ boolean $state = true;

        static {
            Covode.recordClassIndex(84523);
        }

        public l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            h.f.b.l.d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, this.$state, 1048575, null);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<ChooseMediaState, ChooseMediaState> {
        final /* synthetic */ boolean $isSuccess;

        static {
            Covode.recordClassIndex(84524);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(boolean z) {
            super(1);
            this.$isSuccess = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            h.f.b.l.d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, null, null, null, null, this.$isSuccess, null, null, null, null, null, null, null, false, 2093055, null);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<ChooseMediaState, ChooseMediaState> {
        final /* synthetic */ ClosingChooseMediaPageState $closingChooseMediaPageState;

        static {
            Covode.recordClassIndex(84525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(ClosingChooseMediaPageState closingChooseMediaPageState) {
            super(1);
            this.$closingChooseMediaPageState = closingChooseMediaPageState;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            h.f.b.l.d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, this.$closingChooseMediaPageState, null, null, null, false, null, null, null, null, null, null, null, false, 2096895, null);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<ChooseMediaState, ChooseMediaState> {
        final /* synthetic */ OpeningChooseMediaPageState $openingChooseMediaPageState;

        static {
            Covode.recordClassIndex(84527);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(OpeningChooseMediaPageState openingChooseMediaPageState) {
            super(1);
            this.$openingChooseMediaPageState = openingChooseMediaPageState;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            h.f.b.l.d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, this.$openingChooseMediaPageState, null, null, null, null, false, null, null, null, null, null, null, null, false, 2097023, null);
        }
    }

    static final class s extends h.f.b.m implements h.f.a.b<ChooseMediaState, ChooseMediaState> {
        final /* synthetic */ ArrayList $mediaList;
        final /* synthetic */ boolean $refreshAll;

        static {
            Covode.recordClassIndex(84530);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(ArrayList arrayList, boolean z) {
            super(1);
            this.$mediaList = arrayList;
            this.$refreshAll = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            h.f.b.l.d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, null, new ad(this.$mediaList, this.$refreshAll), null, null, false, null, null, null, null, null, null, null, false, 2096639, null);
        }
    }

    static final class t extends h.f.b.m implements h.f.a.b<ChooseMediaState, ChooseMediaState> {
        final /* synthetic */ ArrayList $mediaList;
        final /* synthetic */ boolean $refreshAll;

        static {
            Covode.recordClassIndex(84531);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(ArrayList arrayList, boolean z) {
            super(1);
            this.$mediaList = arrayList;
            this.$refreshAll = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            h.f.b.l.d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, null, null, new ad(this.$mediaList, this.$refreshAll), null, false, null, null, null, null, null, null, null, false, 2096127, null);
        }
    }

    static final class u extends h.f.b.m implements h.f.a.b<ChooseMediaState, ChooseMediaState> {
        final /* synthetic */ String $text;

        static {
            Covode.recordClassIndex(84532);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(String str) {
            super(1);
            this.$text = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            h.f.b.l.d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, this.$text, false, 1572863, null);
        }
    }

    static final class v extends h.f.b.m implements h.f.a.b<ChooseMediaState, ChooseMediaState> {
        final /* synthetic */ ArrayList $mediaList;
        final /* synthetic */ boolean $refreshAll;

        static {
            Covode.recordClassIndex(84533);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(ArrayList arrayList, boolean z) {
            super(1);
            this.$mediaList = arrayList;
            this.$refreshAll = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            h.f.b.l.d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, null, null, null, new ad(this.$mediaList, this.$refreshAll), false, null, null, null, null, null, null, null, false, 2095103, null);
        }
    }

    public final void a(MvImageChooseAdapter.MyMediaModel myMediaModel) {
        c(new h(myMediaModel));
    }

    /* access modifiers changed from: package-private */
    public final void b(ArrayList<MvImageChooseAdapter.MyMediaModel> arrayList) {
        c(new o(arrayList));
    }

    public static final class b extends h.f.b.m implements h.f.a.b<ChooseMediaState, ChooseMediaState> {
        final /* synthetic */ MvImageChooseAdapter.MyMediaModel $media;

        static {
            Covode.recordClassIndex(84513);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            super(1);
            this.$media = myMediaModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            h.f.b.l.d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, new MediaState(this.$media, chooseMediaState2.getPreviewNextBtnMediaState().getValue() + 1), null, null, false, 1966079, null);
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.b<ChooseMediaState, ChooseMediaState> {
        final /* synthetic */ MvImageChooseAdapter.MyMediaModel $media;

        static {
            Covode.recordClassIndex(84516);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            super(1);
            this.$media = myMediaModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            h.f.b.l.d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, chooseMediaState2.getPreviewMediaState().copy(this.$media, chooseMediaState2.getPreviewMediaState().getValue() + 1), null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, 2097143, null);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<ChooseMediaState, ChooseMediaState> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f128816a = new f();

        static {
            Covode.recordClassIndex(84517);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            h.f.b.l.d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, chooseMediaState2.getMediaListState().copy(chooseMediaState2.getMediaListState().getMediaList(), chooseMediaState2.getMediaListState().getValue() + 1), null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, 2097150, null);
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.b<ChooseMediaState, ChooseMediaState> {
        final /* synthetic */ MvImageChooseAdapter.MyMediaModel $media;

        static {
            Covode.recordClassIndex(84518);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            super(1);
            this.$media = myMediaModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            h.f.b.l.d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, new MediaState(this.$media, chooseMediaState2.getPreviewDockerAddMediaState().getValue() + 1), null, null, null, false, 2031615, null);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<ChooseMediaState, ChooseMediaState> {
        final /* synthetic */ MvImageChooseAdapter.MyMediaModel $media;

        static {
            Covode.recordClassIndex(84519);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            super(1);
            this.$media = myMediaModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            h.f.b.l.d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, new MediaState(this.$media, chooseMediaState2.getPreviewDockerDelMediaState().getValue() + 1), null, null, null, null, false, 2064383, null);
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.b<ChooseMediaState, ChooseMediaState> {
        final /* synthetic */ int $from;
        final /* synthetic */ int $to;

        static {
            Covode.recordClassIndex(84520);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(int i2, int i3) {
            super(1);
            this.$from = i2;
            this.$to = i3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            h.f.b.l.d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, null, null, null, null, false, null, new PreviewSwapState(Integer.valueOf(this.$from), Integer.valueOf(this.$to), chooseMediaState2.getPreviewSwapState().getValue() + 1), null, null, null, null, null, false, 2080767, null);
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.b<ChooseMediaState, ChooseMediaState> {
        final /* synthetic */ MvImageChooseAdapter.MyMediaModel $media;

        static {
            Covode.recordClassIndex(84522);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            super(1);
            this.$media = myMediaModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            h.f.b.l.d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, chooseMediaState2.getSelectMediaState().copy(this.$media, chooseMediaState2.getSelectMediaState().getValue() + 1), null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, 2097149, null);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<ChooseMediaState, ChooseMediaState> {
        final /* synthetic */ ArrayList $mediaList;

        static {
            Covode.recordClassIndex(84526);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(ArrayList arrayList) {
            super(1);
            this.$mediaList = arrayList;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            h.f.b.l.d(chooseMediaState2, "");
            ArrayList<MvImageChooseAdapter.MyMediaModel> mediaList = chooseMediaState2.getMediaListState().getMediaList();
            mediaList.clear();
            int i2 = 0;
            for (MvImageChooseAdapter.MyMediaModel myMediaModel : this.$mediaList) {
                myMediaModel.w = i2;
                i2++;
            }
            mediaList.addAll(this.$mediaList);
            return ChooseMediaState.copy$default(chooseMediaState2, chooseMediaState2.getMediaListState().copy(mediaList, chooseMediaState2.getMediaListState().getValue() + 1), null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, 2097150, null);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<ChooseMediaState, ChooseMediaState> {
        final /* synthetic */ ArrayList $mediaList;

        static {
            Covode.recordClassIndex(84528);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(ArrayList arrayList) {
            super(1);
            this.$mediaList = arrayList;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            h.f.b.l.d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, null, null, null, null, null, null, null, null, null, null, false, new MediaListState(this.$mediaList, chooseMediaState2.getPreviewDockerInitMediaList().getValue() + 1), null, null, null, null, null, null, false, 2088959, null);
        }
    }

    static final class r extends h.f.b.m implements h.f.a.b<ChooseMediaState, ChooseMediaState> {
        final /* synthetic */ MvImageChooseAdapter.MyMediaModel $media;

        static {
            Covode.recordClassIndex(84529);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(MvImageChooseAdapter.MyMediaModel myMediaModel) {
            super(1);
            this.$media = myMediaModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
            ChooseMediaState chooseMediaState2 = chooseMediaState;
            h.f.b.l.d(chooseMediaState2, "");
            return ChooseMediaState.copy$default(chooseMediaState2, null, null, chooseMediaState2.getUnSelectMediaState().copy(this.$media, chooseMediaState2.getUnSelectMediaState().getValue() + 1), null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, 2097147, null);
        }
    }

    public final void a(OpeningChooseMediaPageState openingChooseMediaPageState) {
        h.f.b.l.d(openingChooseMediaPageState, "");
        c(new p(openingChooseMediaPageState));
    }

    public final void a(String str) {
        h.f.b.l.d(str, "");
        c(new u(str));
    }

    public final void a(ArrayList<MvImageChooseAdapter.MyMediaModel> arrayList) {
        h.f.b.l.d(arrayList, "");
        c(new q(arrayList));
    }

    public final void a(boolean z) {
        c(new m(z));
    }

    public final void a(MusicModel musicModel, String str) {
        c(new d(musicModel, str));
    }

    public final void b(MusicModel musicModel, String str) {
        c(new c(musicModel, str));
    }
}
