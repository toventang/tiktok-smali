package com.ss.android.ugc.aweme.autoplay.a;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.flowfeed.utils.i;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import h.f.b.m;
import h.h;

public final class a extends i {

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.a<? extends b.d> f67232a;

    /* renamed from: b  reason: collision with root package name */
    public h.f.a.a<? extends b.c> f67233b;

    /* renamed from: c  reason: collision with root package name */
    public h.f.a.a<Integer> f67234c;

    /* renamed from: d  reason: collision with root package name */
    public h.f.a.a<? extends Aweme> f67235d;

    /* renamed from: i  reason: collision with root package name */
    private final h f67236i = h.i.a((h.f.a.a) C1514a.f67238a);

    /* renamed from: j  reason: collision with root package name */
    private final h f67237j = h.i.a((h.f.a.a) b.f67239a);

    /* renamed from: com.ss.android.ugc.aweme.autoplay.a.a$a  reason: collision with other inner class name */
    static final class C1514a extends m implements h.f.a.a<int[]> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1514a f67238a = new C1514a();

        static {
            Covode.recordClassIndex(41409);
        }

        C1514a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ int[] invoke() {
            return new int[2];
        }
    }

    static {
        Covode.recordClassIndex(41408);
    }

    private final int[] g() {
        return (int[]) this.f67236i.getValue();
    }

    private final Rect h() {
        return (Rect) this.f67237j.getValue();
    }

    static final class b extends m implements h.f.a.a<Rect> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f67239a = new b();

        static {
            Covode.recordClassIndex(41410);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Rect invoke() {
            return new Rect();
        }
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.i
    public final void b() {
        b.c cVar;
        h.f.a.a<? extends b.c> aVar = this.f67233b;
        if (aVar != null && (cVar = (b.c) aVar.invoke()) != null) {
            cVar.e();
        }
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.i
    public final int a() {
        Integer invoke;
        h.f.a.a<Integer> aVar = this.f67234c;
        if (aVar == null || (invoke = aVar.invoke()) == null) {
            return 0;
        }
        return invoke.intValue();
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.i
    public final Rect c() {
        View view;
        b.d dVar;
        h.f.a.a<? extends b.d> aVar = this.f67232a;
        if (aVar == null || (dVar = (b.d) aVar.invoke()) == null) {
            view = null;
        } else {
            view = dVar.w();
        }
        if (view != null) {
            view.getLocationOnScreen(g());
            h().set(g()[0], g()[1], g()[0] + view.getWidth(), g()[1] + view.getHeight());
        } else {
            h().set(0, 0, 0, 0);
        }
        return h();
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.i
    public final String d() {
        Aweme aweme;
        String str;
        Aweme aweme2;
        User author;
        Aweme aweme3;
        User author2;
        Aweme aweme4;
        User author3;
        h.f.a.a<? extends Aweme> aVar = this.f67235d;
        if (aVar == null || (aweme = (Aweme) aVar.invoke()) == null || aweme.getAuthor() == null) {
            return "";
        }
        h.f.a.a<? extends Aweme> aVar2 = this.f67235d;
        if (aVar2 == null || (aweme4 = (Aweme) aVar2.invoke()) == null || (author3 = aweme4.getAuthor()) == null) {
            str = null;
        } else {
            str = author3.getRemarkName();
        }
        if (TextUtils.isEmpty(str)) {
            h.f.a.a<? extends Aweme> aVar3 = this.f67235d;
            if (aVar3 == null || (aweme3 = (Aweme) aVar3.invoke()) == null || (author2 = aweme3.getAuthor()) == null) {
                return null;
            }
            return author2.getNickname();
        }
        h.f.a.a<? extends Aweme> aVar4 = this.f67235d;
        if (aVar4 == null || (aweme2 = (Aweme) aVar4.invoke()) == null || (author = aweme2.getAuthor()) == null) {
            return null;
        }
        return author.getRemarkName();
    }

    public final void a(h.f.a.a<? extends b.d> aVar) {
        l.d(aVar, "");
        this.f67232a = aVar;
    }

    public final void b(h.f.a.a<? extends b.c> aVar) {
        l.d(aVar, "");
        this.f67233b = aVar;
    }

    public final void c(h.f.a.a<Integer> aVar) {
        l.d(aVar, "");
        this.f67234c = aVar;
    }

    public final void d(h.f.a.a<? extends Aweme> aVar) {
        l.d(aVar, "");
        this.f67235d = aVar;
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.i
    public final void b(int i2) {
        b.c cVar;
        h.f.a.a<? extends b.c> aVar = this.f67233b;
        if (aVar != null && (cVar = (b.c) aVar.invoke()) != null) {
            cVar.a(150);
        }
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.i
    public final void a(int i2) {
        b.c cVar;
        h.f.a.a<? extends b.c> aVar = this.f67233b;
        if (aVar != null && (cVar = (b.c) aVar.invoke()) != null) {
            cVar.a(0);
        }
    }
}
