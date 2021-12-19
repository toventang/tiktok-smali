package com.ss.android.ugc.aweme.tools.music.b;

import android.text.TextUtils;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.cz.a.f;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import f.a.v;
import f.a.w;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.concurrent.Callable;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final b f140410c = C3708b.f140414a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f140411d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.music.d.a f140412a;

    /* renamed from: b  reason: collision with root package name */
    public f f140413b;

    public static final class a {
        static {
            Covode.recordClassIndex(91725);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.b.b$b  reason: collision with other inner class name */
    static final class C3708b {

        /* renamed from: a  reason: collision with root package name */
        static final b f140414a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final C3708b f140415b = new C3708b();

        private C3708b() {
        }

        static {
            Covode.recordClassIndex(91726);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f140416a;

        static {
            Covode.recordClassIndex(91727);
        }

        c(String str) {
            this.f140416a = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return MusicService.m().a(this.f140416a);
        }
    }

    static {
        Covode.recordClassIndex(91724);
    }

    public static final class e<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f140418a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f140419b;

        static {
            Covode.recordClassIndex(91729);
        }

        public e(b bVar, List list) {
            this.f140418a = bVar;
            this.f140419b = list;
        }

        @Override // f.a.w
        public final void subscribe(final v<MusicModel> vVar) {
            l.d(vVar, "");
            if (com.ss.android.ugc.tools.utils.d.a(this.f140419b)) {
                vVar.a(new MusicModel());
                vVar.a();
                return;
            }
            b bVar = this.f140418a;
            bVar.f140412a = new com.ss.android.ugc.aweme.tools.music.d.a() {
                /* class com.ss.android.ugc.aweme.tools.music.b.b.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(91730);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.ss.android.ugc.aweme.tools.music.d.a
                public final void a(MusicModel musicModel, boolean z) {
                    if (musicModel != null) {
                        vVar.a(musicModel);
                        vVar.a();
                        return;
                    }
                    vVar.a(new MusicModel());
                    vVar.a();
                }
            };
            bVar.a(this.f140419b);
        }
    }

    public final b a(List<String> list) {
        if (com.ss.android.ugc.aweme.base.utils.d.a(list) || list == null) {
            com.ss.android.ugc.aweme.tools.music.d.a aVar = this.f140412a;
            if (aVar != null) {
                aVar.a(null, false);
            }
            return this;
        }
        String str = list.get(0);
        if (TextUtils.isEmpty(str)) {
            com.ss.android.ugc.aweme.tools.music.d.a aVar2 = this.f140412a;
            if (aVar2 != null) {
                aVar2.a(null, false);
            }
            return this;
        }
        i.b(new c(str), i.f4824a).a(new d(this), i.f4826c, null);
        return this;
    }

    /* access modifiers changed from: package-private */
    public static final class d<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f140417a;

        static {
            Covode.recordClassIndex(91728);
        }

        d(b bVar) {
            this.f140417a = bVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            f fVar;
            if (this.f140417a.f140412a != null) {
                l.b(iVar, "");
                boolean z = false;
                com.ss.android.ugc.aweme.shortvideo.c cVar = null;
                if (iVar.d() != null) {
                    MusicModel convertToMusicModel = ((Music) iVar.d()).convertToMusicModel();
                    f fVar2 = this.f140417a.f140413b;
                    if (fVar2 != null) {
                        cVar = fVar2.b();
                    }
                    if (cVar == null) {
                        z = true;
                    }
                    if (convertToMusicModel != null) {
                        convertToMusicModel.setMvThemeMusic(true);
                        if (z && (fVar = this.f140417a.f140413b) != null) {
                            fVar.a(com.ss.android.ugc.aweme.tools.music.f.b.a(convertToMusicModel));
                        }
                    }
                    com.ss.android.ugc.aweme.tools.music.d.a aVar = this.f140417a.f140412a;
                    if (aVar == null) {
                        l.b();
                    }
                    aVar.a(convertToMusicModel, z);
                } else {
                    com.ss.android.ugc.aweme.tools.music.d.a aVar2 = this.f140417a.f140412a;
                    if (aVar2 == null) {
                        l.b();
                    }
                    aVar2.a(null, false);
                }
            }
            return z.f158842a;
        }
    }
}
