package com.ss.android.ugc.aweme.autoplay.d;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.flowfeed.utils.i;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.m;
import h.h;

public final class n extends i {

    /* renamed from: a  reason: collision with root package name */
    public Aweme f67453a;

    /* renamed from: b  reason: collision with root package name */
    public b.d f67454b;

    /* renamed from: c  reason: collision with root package name */
    public b.c f67455c;

    /* renamed from: d  reason: collision with root package name */
    public int f67456d;

    /* renamed from: i  reason: collision with root package name */
    private final h f67457i;

    /* renamed from: j  reason: collision with root package name */
    private final h f67458j;

    static final class a extends m implements h.f.a.a<int[]> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f67459a = new a();

        static {
            Covode.recordClassIndex(41531);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ int[] invoke() {
            return new int[2];
        }
    }

    static {
        Covode.recordClassIndex(41530);
    }

    private final int[] g() {
        return (int[]) this.f67457i.getValue();
    }

    private final Rect h() {
        return (Rect) this.f67458j.getValue();
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.i
    public final int a() {
        return this.f67456d;
    }

    static final class b extends m implements h.f.a.a<Rect> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f67460a = new b();

        static {
            Covode.recordClassIndex(41532);
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
        b.c cVar = this.f67455c;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.i
    public final Rect c() {
        View w;
        b.d dVar = this.f67454b;
        if (!(dVar == null || (w = dVar.w()) == null)) {
            w.getLocationOnScreen(g());
            h().set(g()[0], g()[1], g()[0] + w.getWidth(), g()[1] + w.getHeight());
        }
        return h();
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.i
    public final String d() {
        String str;
        User author;
        User author2;
        User author3;
        Aweme aweme = this.f67453a;
        if (aweme == null || aweme.getAuthor() == null) {
            return "SearchMultiVideoSubScrollObserver";
        }
        Aweme aweme2 = this.f67453a;
        if (aweme2 == null || (author3 = aweme2.getAuthor()) == null) {
            str = null;
        } else {
            str = author3.getRemarkName();
        }
        if (TextUtils.isEmpty(str)) {
            Aweme aweme3 = this.f67453a;
            if (aweme3 == null || (author2 = aweme3.getAuthor()) == null) {
                return null;
            }
            return author2.getNickname();
        }
        Aweme aweme4 = this.f67453a;
        if (aweme4 == null || (author = aweme4.getAuthor()) == null) {
            return null;
        }
        return author.getRemarkName();
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.i
    public final void a(int i2) {
        b.c cVar;
        if (i2 == 0 && (cVar = this.f67455c) != null) {
            cVar.a(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.i
    public final void b(int i2) {
        b.c cVar;
        if (i2 == 0 && (cVar = this.f67455c) != null) {
            cVar.a(150);
        }
    }

    private n(b.d dVar, b.c cVar) {
        this.f67454b = dVar;
        this.f67455c = cVar;
        this.f67456d = 0;
        this.f67457i = h.i.a((h.f.a.a) a.f67459a);
        this.f67458j = h.i.a((h.f.a.a) b.f67460a);
    }

    public /* synthetic */ n(b.d dVar, b.c cVar, byte b2) {
        this(dVar, cVar);
    }
}
