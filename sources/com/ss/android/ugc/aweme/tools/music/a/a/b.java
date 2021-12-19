package com.ss.android.ugc.aweme.tools.music.a.a;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.b.l;
import h.z;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f140288a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(91666);
    }

    static final class a<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f140289a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f140290b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f140291c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f140292d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f140293e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f140294f;

        static {
            Covode.recordClassIndex(91667);
        }

        a(String str, String str2, String str3, long j2, int i2, int i3) {
            this.f140289a = str;
            this.f140290b = str2;
            this.f140291c = str3;
            this.f140292d = j2;
            this.f140293e = i2;
            this.f140294f = i3;
        }

        @Override // f.a.w
        public final void subscribe(final v<SuggestMusicList> vVar) {
            l.d(vVar, "");
            if (!g.a().A().b() || g.a().A().a()) {
                vVar.a(new IllegalStateException("User state illegal, cancel upload request."));
                return;
            }
            i<SuggestMusicList> a2 = MusicService.m().a(this.f140289a, this.f140290b, this.f140291c, this.f140292d, this.f140293e, this.f140294f);
            if (a2 != null) {
                a2.a(new b.g() {
                    /* class com.ss.android.ugc.aweme.tools.music.a.a.b.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(91668);
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: f.a.v */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // b.g
                    public final /* synthetic */ Object then(i iVar) {
                        l.b(iVar, "");
                        if (iVar.c() || !iVar.a()) {
                            vVar.a((Throwable) new IllegalStateException("Result is null"));
                        } else if (iVar.d() != null) {
                            vVar.a(iVar.d());
                        } else {
                            vVar.a((Throwable) new IllegalStateException("Result is null"));
                        }
                        return z.f158842a;
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.music.a.a.a
    public final t<SuggestMusicList> a(String str, String str2, String str3, long j2, int i2, int i3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        t<SuggestMusicList> a2 = t.a(new a(str, str2, str3, j2, i2, i3));
        l.b(a2, "");
        return a2;
    }
}
