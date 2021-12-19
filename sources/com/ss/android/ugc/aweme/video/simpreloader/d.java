package com.ss.android.ugc.aweme.video.simpreloader;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.d.c;
import com.facebook.d.e;
import com.facebook.imagepipeline.e.k;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.video.simpreloader.m;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.List;

public final class d {

    /* renamed from: e  reason: collision with root package name */
    public static final a f143968e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f143969a;

    /* renamed from: b  reason: collision with root package name */
    c<Void> f143970b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<Aweme> f143971c;

    /* renamed from: d  reason: collision with root package name */
    public h f143972d;

    static {
        Covode.recordClassIndex(94198);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94199);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void b() {
        c<Void> cVar = this.f143970b;
        if (cVar != null) {
            cVar.g();
        }
        this.f143970b = null;
        this.f143972d = null;
        Aweme aweme = this.f143971c.get();
        if (aweme != null) {
            aweme.getAid();
        }
    }

    public final void a() {
        String str;
        Video video;
        UrlModel originCover;
        List<String> urlList;
        int i2 = this.f143969a;
        if (i2 == 1) {
            Aweme aweme = this.f143971c.get();
            if (aweme != null) {
                aweme.getAid();
            }
        } else if (i2 == 2) {
            Aweme aweme2 = this.f143971c.get();
            if (aweme2 != null) {
                aweme2.getAid();
            }
            h hVar = this.f143972d;
            if (hVar != null) {
                Aweme aweme3 = this.f143971c.get();
                if (aweme3 != null) {
                    aweme3.getAid();
                }
                hVar.a();
            }
        } else {
            Aweme aweme4 = this.f143971c.get();
            if (aweme4 == null || (video = aweme4.getVideo()) == null || (originCover = video.getOriginCover()) == null || (urlList = originCover.getUrlList()) == null || !(!urlList.isEmpty())) {
                str = "";
            } else {
                str = urlList.get(0);
            }
            if (TextUtils.isEmpty(str)) {
                Aweme aweme5 = this.f143971c.get();
                if (aweme5 != null) {
                    aweme5.getAid();
                }
                h hVar2 = this.f143972d;
                if (hVar2 != null) {
                    Aweme aweme6 = this.f143971c.get();
                    if (aweme6 != null) {
                        aweme6.getAid();
                    }
                    hVar2.a();
                    return;
                }
                return;
            }
            this.f143970b = k.a().e().d(com.facebook.imagepipeline.o.b.fromUri(str), null);
            this.f143969a = 1;
            Aweme aweme7 = this.f143971c.get();
            if (aweme7 != null) {
                aweme7.getAid();
            }
            c<Void> cVar = this.f143970b;
            if (cVar == null) {
                l.b();
            }
            cVar.a(new b(this), m.a.a().f143984a);
        }
    }

    public static final class b implements e<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f143973a;

        static {
            Covode.recordClassIndex(94200);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(d dVar) {
            this.f143973a = dVar;
        }

        @Override // com.facebook.d.e
        public final void onProgressUpdate(c<Void> cVar) {
            Aweme aweme;
            if (this.f143973a.f143972d != null && (aweme = this.f143973a.f143971c.get()) != null) {
                aweme.getAid();
            }
        }

        @Override // com.facebook.d.e
        public final void onCancellation(c<Void> cVar) {
            Aweme aweme;
            Aweme aweme2 = this.f143973a.f143971c.get();
            if (aweme2 != null) {
                aweme2.getAid();
            }
            if (!(this.f143973a.f143972d == null || (aweme = this.f143973a.f143971c.get()) == null)) {
                aweme.getAid();
            }
            this.f143973a.f143969a = 4;
        }

        @Override // com.facebook.d.e
        public final void onFailure(c<Void> cVar) {
            Aweme aweme = this.f143973a.f143971c.get();
            if (aweme != null) {
                aweme.getAid();
            }
            h hVar = this.f143973a.f143972d;
            if (hVar != null) {
                Aweme aweme2 = this.f143973a.f143971c.get();
                if (aweme2 != null) {
                    aweme2.getAid();
                }
                hVar.b();
            }
            this.f143973a.f143969a = 3;
        }

        @Override // com.facebook.d.e
        public final void onNewResult(c<Void> cVar) {
            if (cVar != null && cVar.b()) {
                Aweme aweme = this.f143973a.f143971c.get();
                if (aweme != null) {
                    aweme.getAid();
                }
                h hVar = this.f143973a.f143972d;
                if (hVar != null) {
                    Aweme aweme2 = this.f143973a.f143971c.get();
                    if (aweme2 != null) {
                        aweme2.getAid();
                    }
                    hVar.a();
                }
                this.f143973a.f143969a = 2;
            }
        }
    }

    public d(WeakReference<Aweme> weakReference, h hVar) {
        l.d(weakReference, "");
        this.f143971c = weakReference;
        this.f143972d = hVar;
    }
}
